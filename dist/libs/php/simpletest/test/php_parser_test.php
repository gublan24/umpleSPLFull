<?php

require_once __DIR__ . '/../autorun.php';
require_once __DIR__ . '/../php_parser.php';
require_once __DIR__ . '/../tag.php';
Mock::generate('SimplePage');
Mock::generate('SimplePhpPageBuilder');
Mock::generate('SimpleHttpResponse');
Mock::generatePartial(
        'SimplePhpPageBuilder',
        'PartialSimplePhpPageBuilder',
        array('createPage', 'createParser'));
Mock::generate('SimpleHtmlSaxParser');
Mock::generate('SimplePhpPageBuilder');

class TestOfParallelRegex extends UnitTestCase
{
    public function testNoPatterns()
    {
        $regex = new ParallelRegex(false);
        $this->assertFalse($regex->match('Hello', $match));
        $this->assertEqual($match, '');
    }

    public function testNoSubject()
    {
        $regex = new ParallelRegex(false);
        $regex->addPattern('.*');
        $this->assertTrue($regex->match('', $match));
        $this->assertEqual($match, '');
    }

    public function testMatchAll()
    {
        $regex = new ParallelRegex(false);
        $regex->addPattern('.*');
        $this->assertTrue($regex->match('Hello', $match));
        $this->assertEqual($match, 'Hello');
    }

    public function testCaseSensitive()
    {
        $regex = new ParallelRegex(true);
        $regex->addPattern('abc');
        $this->assertTrue($regex->match('abcdef', $match));
        $this->assertEqual($match, 'abc');
        $this->assertTrue($regex->match('AAABCabcdef', $match));
        $this->assertEqual($match, 'abc');
    }

    public function testCaseInsensitive()
    {
        $regex = new ParallelRegex(false);
        $regex->addPattern('abc');
        $this->assertTrue($regex->match('abcdef', $match));
        $this->assertEqual($match, 'abc');
        $this->assertTrue($regex->match('AAABCabcdef', $match));
        $this->assertEqual($match, 'ABC');
    }

    public function testMatchMultiple()
    {
        $regex = new ParallelRegex(true);
        $regex->addPattern('abc');
        $regex->addPattern('ABC');
        $this->assertTrue($regex->match('abcdef', $match));
        $this->assertEqual($match, 'abc');
        $this->assertTrue($regex->match('AAABCabcdef', $match));
        $this->assertEqual($match, 'ABC');
        $this->assertFalse($regex->match('Hello', $match));
    }

    public function testPatternLabels()
    {
        $regex = new ParallelRegex(false);
        $regex->addPattern('abc', 'letter');
        $regex->addPattern('123', 'number');
        $this->assertIdentical($regex->match('abcdef', $match), 'letter');
        $this->assertEqual($match, 'abc');
        $this->assertIdentical($regex->match('0123456789', $match), 'number');
        $this->assertEqual($match, '123');
    }
}

class TestOfStateStack extends UnitTestCase
{
    public function testStartState()
    {
        $stack = new SimpleStateStack('one');
        $this->assertEqual($stack->getCurrent(), 'one');
    }

    public function testExhaustion()
    {
        $stack = new SimpleStateStack('one');
        $this->assertFalse($stack->leave());
    }

    public function testStateMoves()
    {
        $stack = new SimpleStateStack('one');
        $stack->enter('two');
        $this->assertEqual($stack->getCurrent(), 'two');
        $stack->enter('three');
        $this->assertEqual($stack->getCurrent(), 'three');
        $this->assertTrue($stack->leave());
        $this->assertEqual($stack->getCurrent(), 'two');
        $stack->enter('third');
        $this->assertEqual($stack->getCurrent(), 'third');
        $this->assertTrue($stack->leave());
        $this->assertTrue($stack->leave());
        $this->assertEqual($stack->getCurrent(), 'one');
    }
}

class TestParser
{
    public function accept()
    {
    }

    public function a()
    {
    }

    public function b()
    {
    }
}
Mock::generate('TestParser');

class TestOfLexer extends UnitTestCase
{
    public function testEmptyPage()
    {
        $handler = new MockTestParser();
        $handler->expectNever('accept');
        $handler->returnsByValue('accept', true);
        $handler->expectNever('accept');
        $handler->returnsByValue('accept', true);
        $lexer = new SimpleLexer($handler);
        $lexer->addPattern('a+');
        $this->assertTrue($lexer->parse(''));
    }

    public function testSinglePattern()
    {
        $handler = new MockTestParser();
        $handler->expectAt(0, 'accept', array('aaa', LEXER_MATCHED));
        $handler->expectAt(1, 'accept', array('x', LEXER_UNMATCHED));
        $handler->expectAt(2, 'accept', array('a', LEXER_MATCHED));
        $handler->expectAt(3, 'accept', array('yyy', LEXER_UNMATCHED));
        $handler->expectAt(4, 'accept', array('a', LEXER_MATCHED));
        $handler->expectAt(5, 'accept', array('x', LEXER_UNMATCHED));
        $handler->expectAt(6, 'accept', array('aaa', LEXER_MATCHED));
        $handler->expectAt(7, 'accept', array('z', LEXER_UNMATCHED));
        $handler->expectCallCount('accept', 8);
        $handler->returnsByValue('accept', true);
        $lexer = new SimpleLexer($handler);
        $lexer->addPattern('a+');
        $this->assertTrue($lexer->parse('aaaxayyyaxaaaz'));
    }

    public function testMultiplePattern()
    {
        $handler = new MockTestParser();
        $target  = array('a', 'b', 'a', 'bb', 'x', 'b', 'a', 'xxxxxx', 'a', 'x');
        for ($i = 0; $i < count($target); $i++) {
            $handler->expectAt($i, 'accept', array($target[$i], '*'));
        }
        $handler->expectCallCount('accept', count($target));
        $handler->returnsByValue('accept', true);
        $lexer = new SimpleLexer($handler);
        $lexer->addPattern('a+');
        $lexer->addPattern('b+');
        $this->assertTrue($lexer->parse('ababbxbaxxxxxxax'));
    }
}

class TestOfLexerModes extends UnitTestCase
{
    public function testIsolatedPattern()
    {
        $handler = new MockTestParser();
        $handler->expectAt(0, 'a', array('a', LEXER_MATCHED));
        $handler->expectAt(1, 'a', array('b', LEXER_UNMATCHED));
        $handler->expectAt(2, 'a', array('aa', LEXER_MATCHED));
        $handler->expectAt(3, 'a', array('bxb', LEXER_UNMATCHED));
        $handler->expectAt(4, 'a', array('aaa', LEXER_MATCHED));
        $handler->expectAt(5, 'a', array('x', LEXER_UNMATCHED));
        $handler->expectAt(6, 'a', array('aaaa', LEXER_MATCHED));
        $handler->expectAt(7, 'a', array('x', LEXER_UNMATCHED));
        $handler->expectCallCount('a', 8);
        $handler->returnsByValue('a', true);
        $lexer = new SimpleLexer($handler, 'a');
        $lexer->addPattern('a+', 'a');
        $lexer->addPattern('b+', 'b');
        $this->assertTrue($lexer->parse('abaabxbaaaxaaaax'));
    }

    public function testModeChange()
    {
        $handler = new MockTestParser();
        $handler->expectAt(0, 'a', array('a', LEXER_MATCHED));
        $handler->expectAt(1, 'a', array('b', LEXER_UNMATCHED));
        $handler->expectAt(2, 'a', array('aa', LEXER_MATCHED));
        $handler->expectAt(3, 'a', array('b', LEXER_UNMATCHED));
        $handler->expectAt(4, 'a', array('aaa', LEXER_MATCHED));
        $handler->expectAt(0, 'b', array(':', LEXER_ENTER));
        $handler->expectAt(1, 'b', array('a', LEXER_UNMATCHED));
        $handler->expectAt(2, 'b', array('b', LEXER_MATCHED));
        $handler->expectAt(3, 'b', array('a', LEXER_UNMATCHED));
        $handler->expectAt(4, 'b', array('bb', LEXER_MATCHED));
        $handler->expectAt(5, 'b', array('a', LEXER_UNMATCHED));
        $handler->expectAt(6, 'b', array('bbb', LEXER_MATCHED));
        $handler->expectAt(7, 'b', array('a', LEXER_UNMATCHED));
        $handler->expectCallCount('a', 5);
        $handler->expectCallCount('b', 8);
        $handler->returnsByValue('a', true);
        $handler->returnsByValue('b', true);
        $lexer = new SimpleLexer($handler, 'a');
        $lexer->addPattern('a+', 'a');
        $lexer->addEntryPattern(':', 'a', 'b');
        $lexer->addPattern('b+', 'b');
        $this->assertTrue($lexer->parse('abaabaaa:ababbabbba'));
    }

    public function testNesting()
    {
        $handler = new MockTestParser();
        $handler->returnsByValue('a', true);
        $handler->returnsByValue('b', true);
        $handler->expectAt(0, 'a', array('aa', LEXER_MATCHED));
        $handler->expectAt(1, 'a', array('b', LEXER_UNMATCHED));
        $handler->expectAt(2, 'a', array('aa', LEXER_MATCHED));
        $handler->expectAt(3, 'a', array('b', LEXER_UNMATCHED));
        $handler->expectAt(0, 'b', array('(', LEXER_ENTER));
        $handler->expectAt(1, 'b', array('bb', LEXER_MATCHED));
        $handler->expectAt(2, 'b', array('a', LEXER_UNMATCHED));
        $handler->expectAt(3, 'b', array('bb', LEXER_MATCHED));
        $handler->expectAt(4, 'b', array(')', LEXER_EXIT));
        $handler->expectAt(4, 'a', array('aa', LEXER_MATCHED));
        $handler->expectAt(5, 'a', array('b', LEXER_UNMATCHED));
        $handler->expectCallCount('a', 6);
        $handler->expectCallCount('b', 5);
        $lexer = new SimpleLexer($handler, 'a');
        $lexer->addPattern('a+', 'a');
        $lexer->addEntryPattern('(', 'a', 'b');
        $lexer->addPattern('b+', 'b');
        $lexer->addExitPattern(')', 'b');
        $this->assertTrue($lexer->parse('aabaab(bbabb)aab'));
    }

    public function testSingular()
    {
        $handler = new MockTestParser();
        $handler->returnsByValue('a', true);
        $handler->returnsByValue('b', true);
        $handler->expectAt(0, 'a', array('aa', LEXER_MATCHED));
        $handler->expectAt(1, 'a', array('aa', LEXER_MATCHED));
        $handler->expectAt(2, 'a', array('xx', LEXER_UNMATCHED));
        $handler->expectAt(3, 'a', array('xx', LEXER_UNMATCHED));
        $handler->expectAt(0, 'b', array('b', LEXER_SPECIAL));
        $handler->expectAt(1, 'b', array('bbb', LEXER_SPECIAL));
        $handler->expectCallCount('a', 4);
        $handler->expectCallCount('b', 2);
        $lexer = new SimpleLexer($handler, 'a');
        $lexer->addPattern('a+', 'a');
        $lexer->addSpecialPattern('b+', 'a', 'b');
        $this->assertTrue($lexer->parse('aabaaxxbbbxx'));
    }

    public function testUnwindTooFar()
    {
        $handler = new MockTestParser();
        $handler->returnsByValue('a', true);
        $handler->expectAt(0, 'a', array('aa', LEXER_MATCHED));
        $handler->expectAt(1, 'a', array(')', LEXER_EXIT));
        $handler->expectCallCount('a', 2);
        $lexer = new SimpleLexer($handler, 'a');
        $lexer->addPattern('a+', 'a');
        $lexer->addExitPattern(')', 'a');
        $this->assertFalse($lexer->parse('aa)aa'));
    }
}

class TestOfLexerHandlers extends UnitTestCase
{
    public function testModeMapping()
    {
        $handler = new MockTestParser();
        $handler->returnsByValue('a', true);
        $handler->expectAt(0, 'a', array('aa', LEXER_MATCHED));
        $handler->expectAt(1, 'a', array('(', LEXER_ENTER));
        $handler->expectAt(2, 'a', array('bb', LEXER_MATCHED));
        $handler->expectAt(3, 'a', array('a', LEXER_UNMATCHED));
        $handler->expectAt(4, 'a', array('bb', LEXER_MATCHED));
        $handler->expectAt(5, 'a', array(')', LEXER_EXIT));
        $handler->expectAt(6, 'a', array('b', LEXER_UNMATCHED));
        $handler->expectCallCount('a', 7);
        $lexer = new SimpleLexer($handler, 'mode_a');
        $lexer->addPattern('a+', 'mode_a');
        $lexer->addEntryPattern('(', 'mode_a', 'mode_b');
        $lexer->addPattern('b+', 'mode_b');
        $lexer->addExitPattern(')', 'mode_b');
        $lexer->mapHandler('mode_a', 'a');
        $lexer->mapHandler('mode_b', 'a');
        $this->assertTrue($lexer->parse('aa(bbabb)b'));
    }
}

class TestOfSimpleHtmlLexer extends UnitTestCase
{
    public function createParser()
    {
        $parser = new MockSimpleHtmlSaxParser();
        $parser->returnsByValue('acceptStartToken', true);
        $parser->returnsByValue('acceptEndToken', true);
        $parser->returnsByValue('acceptAttributeToken', true);
        $parser->returnsByValue('acceptEntityToken', true);
        $parser->returnsByValue('acceptTextToken', true);
        $parser->returnsByValue('ignore', true);

        return $parser;
    }

    public function testNoContent()
    {
        $parser = $this->createParser();
        $parser->expectNever('acceptStartToken');
        $parser->expectNever('acceptEndToken');
        $parser->expectNever('acceptAttributeToken');
        $parser->expectNever('acceptEntityToken');
        $parser->expectNever('acceptTextToken');
        $lexer = new SimpleHtmlLexer($parser);
        $this->assertTrue($lexer->parse(''));
    }

    public function testUninteresting()
    {
        $parser = $this->createParser();
        $parser->expectOnce('acceptTextToken', array('<html></html>', '*'));
        $lexer = new SimpleHtmlLexer($parser);
        $this->assertTrue($lexer->parse('<html></html>'));
    }

    public function testSkipCss()
    {
        $parser = $this->createParser();
        $parser->expectNever('acceptTextToken');
        $parser->expectAtLeastOnce('ignore');
        $lexer = new SimpleHtmlLexer($parser);
        $this->assertTrue($lexer->parse("<style>Lot's of styles</style>"));
    }

    public function testSkipJavaScript()
    {
        $parser = $this->createParser();
        $parser->expectNever('acceptTextToken');
        $parser->expectAtLeastOnce('ignore');
        $lexer = new SimpleHtmlLexer($parser);
        $this->assertTrue($lexer->parse("<SCRIPT>Javascript code {';:^%^%???$'@\"*(}</SCRIPT>"));
    }

    public function testSkipHtmlComments()
    {
        $parser = $this->createParser();
        $parser->expectNever('acceptTextToken');
        $parser->expectAtLeastOnce('ignore');
        $lexer = new SimpleHtmlLexer($parser);
        $this->assertTrue($lexer->parse('<!-- <title>title</title><style>styles</style> -->'));
    }

    public function testTagWithNoAttributes()
    {
        $parser = $this->createParser();
        $parser->expectAt(0, 'acceptStartToken', array('<title', '*'));
        $parser->expectAt(1, 'acceptStartToken', array('>', '*'));
        $parser->expectCallCount('acceptStartToken', 2);
        $parser->expectOnce('acceptTextToken', array('Hello', '*'));
        $parser->expectOnce('acceptEndToken', array('</title>', '*'));
        $lexer = new SimpleHtmlLexer($parser);
        $this->assertTrue($lexer->parse('<title>Hello</title>'));
    }

    public function testTagWithAttributes()
    {
        $parser = $this->createParser();
        $parser->expectOnce('acceptTextToken', array('label', '*'));
        $parser->expectAt(0, 'acceptStartToken', array('<a', '*'));
        $parser->expectAt(1, 'acceptStartToken', array('href', '*'));
        $parser->expectAt(2, 'acceptStartToken', array('>', '*'));
        $parser->expectCallCount('acceptStartToken', 3);
        $parser->expectAt(0, 'acceptAttributeToken', array('= "', '*'));
        $parser->expectAt(1, 'acceptAttributeToken', array('here.html', '*'));
        $parser->expectAt(2, 'acceptAttributeToken', array('"', '*'));
        $parser->expectCallCount('acceptAttributeToken', 3);
        $parser->expectOnce('acceptEndToken', array('</a>', '*'));
        $lexer = new SimpleHtmlLexer($parser);
        $this->assertTrue($lexer->parse('<a href = "here.html">label</a>'));
    }
}

class TestOfHtmlSaxParser extends UnitTestCase
{
    public function createListener()
    {
        $listener = new MockSimplePhpPageBuilder();
        $listener->returnsByValue('startElement', true);
        $listener->returnsByValue('addContent', true);
        $listener->returnsByValue('endElement', true);

        return $listener;
    }

    public function testFramesetTag()
    {
        $listener = $this->createListener();
        $listener->expectOnce('startElement', array('frameset', array()));
        $listener->expectOnce('addContent', array('Frames'));
        $listener->expectOnce('endElement', array('frameset'));
        $parser = new SimpleHtmlSaxParser($listener);
        $this->assertTrue($parser->parse('<frameset>Frames</frameset>'));
    }

    public function testTagWithUnquotedAttributes()
    {
        $listener = $this->createListener();
        $listener->expectOnce(
                'startElement',
                array('input', array('name' => 'a.b.c', 'value' => 'd')));
        $parser = new SimpleHtmlSaxParser($listener);
        $this->assertTrue($parser->parse('<input name=a.b.c value = d>'));
    }

    public function testTagInsideContent()
    {
        $listener = $this->createListener();
        $listener->expectOnce('startElement', array('a', array()));
        $listener->expectAt(0, 'addContent', array('<html>'));
        $listener->expectAt(1, 'addContent', array('</html>'));
        $parser = new SimpleHtmlSaxParser($listener);
        $this->assertTrue($parser->parse('<html><a></a></html>'));
    }

    public function testTagWithInternalContent()
    {
        $listener = $this->createListener();
        $listener->expectOnce('startElement', array('a', array()));
        $listener->expectOnce('addContent', array('label'));
        $listener->expectOnce('endElement', array('a'));
        $parser = new SimpleHtmlSaxParser($listener);
        $this->assertTrue($parser->parse('<a>label</a>'));
    }

    public function testLinkAddress()
    {
        $listener = $this->createListener();
        $listener->expectOnce('startElement', array('a', array('href' => 'here.html')));
        $listener->expectOnce('addContent', array('label'));
        $listener->expectOnce('endElement', array('a'));
        $parser = new SimpleHtmlSaxParser($listener);
        $this->assertTrue($parser->parse("<a href = 'here.html'>label</a>"));
    }

    public function testEncodedAttribute()
    {
        $listener = $this->createListener();
        $listener->expectOnce('startElement', array('a', array('href' => 'here&there.html')));
        $listener->expectOnce('addContent', array('label'));
        $listener->expectOnce('endElement', array('a'));
        $parser = new SimpleHtmlSaxParser($listener);
        $this->assertTrue($parser->parse("<a href = 'here&amp;there.html'>label</a>"));
    }

    public function testTagWithId()
    {
        $listener = $this->createListener();
        $listener->expectOnce('startElement', array('a', array('id' => '0')));
        $listener->expectOnce('addContent', array('label'));
        $listener->expectOnce('endElement', array('a'));
        $parser = new SimpleHtmlSaxParser($listener);
        $this->assertTrue($parser->parse('<a id="0">label</a>'));
    }

    public function testTagWithEmptyAttributes()
    {
        $listener = $this->createListener();
        $listener->expectOnce(
                'startElement',
                array('option', array('value' => '', 'selected' => '')));
        $listener->expectOnce('addContent', array('label'));
        $listener->expectOnce('endElement', array('option'));
        $parser = new SimpleHtmlSaxParser($listener);
        $this->assertTrue($parser->parse('<option value="" selected>label</option>'));
    }

    public function testComplexTagWithLotsOfCaseVariations()
    {
        $listener = $this->createListener();
        $listener->expectOnce(
                'startElement',
                array('a', array('href' => 'here.html', 'style' => "'cool'")));
        $listener->expectOnce('addContent', array('label'));
        $listener->expectOnce('endElement', array('a'));
        $parser = new SimpleHtmlSaxParser($listener);
        $this->assertTrue($parser->parse('<A HREF = \'here.html\' Style="\'cool\'">label</A>'));
    }

    public function testXhtmlSelfClosingTag()
    {
        $listener = $this->createListener();
        $listener->expectOnce(
                'startElement',
                array('input', array('type' => 'submit', 'name' => 'N', 'value' => 'V')));
        $parser = new SimpleHtmlSaxParser($listener);
        $this->assertTrue($parser->parse('<input type="submit" name="N" value="V" />'));
    }

    public function testNestedFrameInFrameset()
    {
        $listener = $this->createListener();
        $listener->expectAt(0, 'startElement', array('frameset', array()));
        $listener->expectAt(1, 'startElement', array('frame', array('src' => 'frame.html')));
        $listener->expectCallCount('startElement', 2);
        $listener->expectOnce('addContent', array('<noframes>Hello</noframes>'));
        $listener->expectOnce('endElement', array('frameset'));
        $parser = new SimpleHtmlSaxParser($listener);
        $this->assertTrue($parser->parse(
                '<frameset><frame src="frame.html"><noframes>Hello</noframes></frameset>'));
    }
}

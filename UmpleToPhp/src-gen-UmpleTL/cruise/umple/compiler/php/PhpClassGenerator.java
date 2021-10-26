/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler.php;
import cruise.umple.compiler.*;
import cruise.umple.util.*;
import java.util.*;
import java.util.regex.Pattern;

// line 28 "../../../../../UmpleTLTemplates/phpClassGenerator.ump"
public class PhpClassGenerator implements ILang
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "<?php";
  public static final String TEXT_1 = NL + "/*PLEASE DO NOT EDIT THIS CODE*/" + NL + "/*This code was generated using the UMPLE @UMPLE_VERSION@ modeling language!*/";
  public static final String TEXT_2 = NL;
  public static final String TEXT_3 = "";
  public static final String TEXT_4 = "";
  public static final String TEXT_5 = "class ";
  public static final String TEXT_6 = NL + "{";
  public static final String TEXT_7 = NL + NL + "  //------------------------" + NL + "  // CONSTRUCTOR" + NL + "  //------------------------" + NL;
  public static final String TEXT_8 = NL + "    $";
  public static final String TEXT_9 = "->";
  public static final String TEXT_10 = " = array(";
  public static final String TEXT_11 = ");";
  public static final String TEXT_12 = NL + "    $this->";
  public static final String TEXT_13 = "();";
  public static final String TEXT_14 = NL + "    $this->";
  public static final String TEXT_15 = " = true;";
  public static final String TEXT_16 = NL + "    $this->";
  public static final String TEXT_17 = " = ";
  public static final String TEXT_18 = ";";
  public static final String TEXT_19 = NL + "    $";
  public static final String TEXT_20 = "->";
  public static final String TEXT_21 = " = ";
  public static final String TEXT_22 = ";";
  public static final String TEXT_23 = NL + "    $";
  public static final String TEXT_24 = "->";
  public static final String TEXT_25 = " = ";
  public static final String TEXT_26 = ";";
  public static final String TEXT_27 = NL + "    $";
  public static final String TEXT_28 = "->";
  public static final String TEXT_29 = " = self::$";
  public static final String TEXT_30 = "++;";
  public static final String TEXT_31 = NL + "    if (!$this->";
  public static final String TEXT_32 = "($";
  public static final String TEXT_33 = "))" + NL + "    {" + NL + "      throw new RuntimeException(\"Cannot create due to duplicate ";
  public static final String TEXT_34 = ". See http://manual.umple.org?RE003ViolationofUniqueness.html\");" + NL + "    }";
  public static final String TEXT_35 = NL + "    if (!$";
  public static final String TEXT_36 = "->";
  public static final String TEXT_37 = "($";
  public static final String TEXT_38 = "))" + NL + "    {" + NL + "      throw new Exception(\"Unable to create ";
  public static final String TEXT_39 = " due to ";
  public static final String TEXT_40 = ". See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html\");" + NL + "    }";
  public static final String TEXT_41 = NL + "    $";
  public static final String TEXT_42 = "->";
  public static final String TEXT_43 = " = array();" + NL + "    $";
  public static final String TEXT_44 = " = $";
  public static final String TEXT_45 = "->";
  public static final String TEXT_46 = "($";
  public static final String TEXT_47 = ");" + NL + "    if (!$";
  public static final String TEXT_48 = ")" + NL + "    {" + NL + "      throw new Exception(\"Unable to create ";
  public static final String TEXT_49 = ", must have ";
  public static final String TEXT_50 = " ";
  public static final String TEXT_51 = ". See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html\");" + NL + "    }";
  public static final String TEXT_52 = NL + "    $";
  public static final String TEXT_53 = "->";
  public static final String TEXT_54 = " = array();" + NL + "    $";
  public static final String TEXT_55 = " = $";
  public static final String TEXT_56 = "->";
  public static final String TEXT_57 = "($";
  public static final String TEXT_58 = ");" + NL + "    if (!$";
  public static final String TEXT_59 = ")" + NL + "    {" + NL + "      throw new Exception(\"Unable to create ";
  public static final String TEXT_60 = ", must have ";
  public static final String TEXT_61 = " or fewer ";
  public static final String TEXT_62 = ", no duplicates. See http://manual.umple.org?RE001ViolationofImmutability.html\");" + NL + "    }";
  public static final String TEXT_63 = NL + "    $";
  public static final String TEXT_64 = "->";
  public static final String TEXT_65 = " = array();" + NL + "    $";
  public static final String TEXT_66 = " = $";
  public static final String TEXT_67 = "->";
  public static final String TEXT_68 = "($";
  public static final String TEXT_69 = ");" + NL + "    if (!$";
  public static final String TEXT_70 = ")" + NL + "    {" + NL + "      throw new Exception(\"Unable to create ";
  public static final String TEXT_71 = ", must not have duplicate ";
  public static final String TEXT_72 = ". See http://manual.umple.org?RE001ViolationofImmutability.html\");" + NL + "    }";
  public static final String TEXT_73 = NL + "    $";
  public static final String TEXT_74 = "->";
  public static final String TEXT_75 = " = array();";
  public static final String TEXT_76 = NL + "    if ($";
  public static final String TEXT_77 = " == null || $";
  public static final String TEXT_78 = "->";
  public static final String TEXT_79 = "() != null)" + NL + "    {" + NL + "      throw new Exception(\"Unable to create ";
  public static final String TEXT_80 = " due to ";
  public static final String TEXT_81 = ". See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html\");" + NL + "    }" + NL + "    $";
  public static final String TEXT_82 = "->";
  public static final String TEXT_83 = " = $";
  public static final String TEXT_84 = ";";
  public static final String TEXT_85 = NL + "    $";
  public static final String TEXT_86 = " = $";
  public static final String TEXT_87 = "->";
  public static final String TEXT_88 = "($";
  public static final String TEXT_89 = ");" + NL + "    if (!$";
  public static final String TEXT_90 = ")" + NL + "    {" + NL + "      throw new Exception(\"Unable to create ";
  public static final String TEXT_91 = " due to ";
  public static final String TEXT_92 = ". See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html\");" + NL + "    }";
  public static final String TEXT_93 = "$this->";
  public static final String TEXT_94 = " = array();" + NL + "    $this->";
  public static final String TEXT_95 = "[] = $";
  public static final String TEXT_96 = ";";
  public static final String TEXT_97 = NL + "    $this->";
  public static final String TEXT_98 = "(self::$";
  public static final String TEXT_99 = ");";
  public static final String TEXT_100 = NL + "    $this->";
  public static final String TEXT_101 = "(self::$";
  public static final String TEXT_102 = ");";
  public static final String TEXT_103 = NL + "  public static function getInstance()" + NL + "  {" + NL + "    if(self::$theInstance == null)" + NL + "    {" + NL + "      self::$theInstance = new ";
  public static final String TEXT_104 = "();" + NL + "    }" + NL + "    return self::$theInstance;" + NL + "  }";
  public static final String TEXT_105 = NL + "  public static function newInstance(";
  public static final String TEXT_106 = ")" + NL + "  {" + NL + "    $";
  public static final String TEXT_107 = " = new ";
  public static final String TEXT_108 = "();";
  public static final String TEXT_109 = NL + "    $";
  public static final String TEXT_110 = "->";
  public static final String TEXT_111 = " = new ";
  public static final String TEXT_112 = "(";
  public static final String TEXT_113 = ");";
  public static final String TEXT_114 = NL + "  private function callParentConstructor(";
  public static final String TEXT_115 = ")" + NL + "  {" + NL + "    parent::__construct(";
  public static final String TEXT_116 = ");" + NL + "  }" + NL;
  public static final String TEXT_117 = NL + NL + "  //------------------------" + NL + "  // INTERFACE" + NL + "  //------------------------" + NL;
  public static final String TEXT_118 = NL + "  public function ";
  public static final String TEXT_119 = "($";
  public static final String TEXT_120 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  public static final String TEXT_121 = NL + "    $this->";
  public static final String TEXT_122 = " = false;" + NL + "    $this->";
  public static final String TEXT_123 = " = $";
  public static final String TEXT_124 = ";" + NL + "    $wasSet = true;";
  public static final String TEXT_125 = NL + "    return $wasSet;" + NL + "  }" + NL;
  public static final String TEXT_126 = NL + "  public function ";
  public static final String TEXT_127 = "($";
  public static final String TEXT_128 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  public static final String TEXT_129 = NL + "    $this->";
  public static final String TEXT_130 = " = $";
  public static final String TEXT_131 = ";" + NL + "    $wasSet = true;";
  public static final String TEXT_132 = NL + "    return $wasSet;" + NL + "  }" + NL + NL + "  public function ";
  public static final String TEXT_133 = "()" + NL + "  {" + NL + "    $wasReset = false;";
  public static final String TEXT_134 = NL + "    $this->";
  public static final String TEXT_135 = " = $this->";
  public static final String TEXT_136 = "();" + NL + "    $wasReset = true;";
  public static final String TEXT_137 = NL + "    return $wasReset;" + NL + "  }" + NL;
  public static final String TEXT_138 = NL + "  public function ";
  public static final String TEXT_139 = "($";
  public static final String TEXT_140 = ")" + NL + "  {" + NL + "    $wasAdded = false;";
  public static final String TEXT_141 = NL + "    $this->";
  public static final String TEXT_142 = "[] = $";
  public static final String TEXT_143 = ";" + NL + "    $wasAdded = true;";
  public static final String TEXT_144 = NL + "    return $wasAdded;" + NL + "  }" + NL + NL + "  public function ";
  public static final String TEXT_145 = "($";
  public static final String TEXT_146 = ")" + NL + "  {" + NL + "    $wasRemoved = false;";
  public static final String TEXT_147 = NL + "    unset($this->";
  public static final String TEXT_148 = "[$this->";
  public static final String TEXT_149 = "($";
  public static final String TEXT_150 = ")]);" + NL + "    $this->";
  public static final String TEXT_151 = " = array_values($this->";
  public static final String TEXT_152 = ");" + NL + "    $wasRemoved = true;";
  public static final String TEXT_153 = NL + "    return $wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_154 = NL + "  public function ";
  public static final String TEXT_155 = "($";
  public static final String TEXT_156 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  public static final String TEXT_157 = "";
  public static final String TEXT_158 = NL + "    $this->";
  public static final String TEXT_159 = " = $";
  public static final String TEXT_160 = ";";
  public static final String TEXT_161 = NL + "    $wasSet = true;";
  public static final String TEXT_162 = NL + "    return $wasSet;" + NL + "  }" + NL;
  public static final String TEXT_163 = NL + "  public function ";
  public static final String TEXT_164 = "($";
  public static final String TEXT_165 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  public static final String TEXT_166 = "";
  public static final String TEXT_167 = NL + "      $wasSet = parent::";
  public static final String TEXT_168 = "(";
  public static final String TEXT_169 = ");";
  public static final String TEXT_170 = "";
  public static final String TEXT_171 = NL + "    return $wasSet;" + NL + "  }" + NL;
  public static final String TEXT_172 = NL + "  public function ";
  public static final String TEXT_173 = "($";
  public static final String TEXT_174 = ")" + NL + "  {" + NL + "    $wasAdded = false;";
  public static final String TEXT_175 = "";
  public static final String TEXT_176 = NL + "      $wasAdded = parent::";
  public static final String TEXT_177 = "(";
  public static final String TEXT_178 = ");";
  public static final String TEXT_179 = "";
  public static final String TEXT_180 = NL + "    return $wasAdded;" + NL + "  }";
  public static final String TEXT_181 = NL + "  public function ";
  public static final String TEXT_182 = "($";
  public static final String TEXT_183 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  public static final String TEXT_184 = "";
  public static final String TEXT_185 = NL + "      $wasSet = parent::";
  public static final String TEXT_186 = "(";
  public static final String TEXT_187 = ");";
  public static final String TEXT_188 = "";
  public static final String TEXT_189 = NL + "    return $wasSet;" + NL + "  }" + NL;
  public static final String TEXT_190 = NL + "  public function ";
  public static final String TEXT_191 = "($index)" + NL + "  {";
  public static final String TEXT_192 = NL + "    $";
  public static final String TEXT_193 = " = $this->";
  public static final String TEXT_194 = "[$index];";
  public static final String TEXT_195 = NL + "    return $";
  public static final String TEXT_196 = ";" + NL + "  }" + NL + NL + "  public function ";
  public static final String TEXT_197 = "()" + NL + "  {";
  public static final String TEXT_198 = NL + "    $";
  public static final String TEXT_199 = " = $this->";
  public static final String TEXT_200 = ";";
  public static final String TEXT_201 = NL + "    return $";
  public static final String TEXT_202 = ";" + NL + "  }" + NL + NL + "  public function ";
  public static final String TEXT_203 = "()" + NL + "  {";
  public static final String TEXT_204 = NL + "    $number = count($this->";
  public static final String TEXT_205 = ");";
  public static final String TEXT_206 = NL + "    return $number;" + NL + "  }" + NL + NL + "  public function ";
  public static final String TEXT_207 = "()" + NL + "  {";
  public static final String TEXT_208 = NL + "    $has = ";
  public static final String TEXT_209 = ".size() > 0;";
  public static final String TEXT_210 = NL + "    return $has;" + NL + "  }" + NL + NL + "  public function ";
  public static final String TEXT_211 = "($";
  public static final String TEXT_212 = ")" + NL + "  {";
  public static final String TEXT_213 = NL + "    $rawAnswer = array_search($";
  public static final String TEXT_214 = ",$this->";
  public static final String TEXT_215 = ");" + NL + "    $index = $rawAnswer == null && $rawAnswer !== 0 ? -1 : $rawAnswer;";
  public static final String TEXT_216 = NL + "    return $index;" + NL + "  }" + NL;
  public static final String TEXT_217 = NL + "  public function ";
  public static final String TEXT_218 = "()" + NL + "  {";
  public static final String TEXT_219 = NL + "    $";
  public static final String TEXT_220 = " = ";
  public static final String TEXT_221 = ";";
  public static final String TEXT_222 = NL + "    return $";
  public static final String TEXT_223 = ";" + NL + "  }";
  public static final String TEXT_224 = NL + "  public function ";
  public static final String TEXT_225 = "()" + NL + "  {";
  public static final String TEXT_226 = NL + "    return ";
  public static final String TEXT_227 = ";" + NL + "  }";
  public static final String TEXT_228 = NL + "  public function ";
  public static final String TEXT_229 = "()" + NL + "  {";
  public static final String TEXT_230 = NL + "    $";
  public static final String TEXT_231 = " = $this->";
  public static final String TEXT_232 = ";";
  public static final String TEXT_233 = NL + "    return $";
  public static final String TEXT_234 = ";" + NL + "  }";
  public static final String TEXT_235 = NL + "  public function ";
  public static final String TEXT_236 = "()" + NL + "  {";
  public static final String TEXT_237 = NL + "    return $this->";
  public static final String TEXT_238 = ";" + NL + "  }";
  public static final String TEXT_239 = NL + "  public function ";
  public static final String TEXT_240 = "()" + NL + "  {";
  public static final String TEXT_241 = NL + "    $";
  public static final String TEXT_242 = " = ";
  public static final String TEXT_243 = ";";
  public static final String TEXT_244 = NL + "    return $";
  public static final String TEXT_245 = ";" + NL + "  }" + NL;
  public static final String TEXT_246 = NL + "  public function ";
  public static final String TEXT_247 = "()" + NL + "  {";
  public static final String TEXT_248 = NL + "    return ";
  public static final String TEXT_249 = ";" + NL + "  }" + NL;
  public static final String TEXT_250 = NL + "  public static function ";
  public static final String TEXT_251 = "($";
  public static final String TEXT_252 = ")" + NL + "  {";
  public static final String TEXT_253 = NL + "    $";
  public static final String TEXT_254 = " = ";
  public static final String TEXT_255 = "[(string)$";
  public static final String TEXT_256 = "];";
  public static final String TEXT_257 = "    return $";
  public static final String TEXT_258 = ";" + NL + "  }" + NL;
  public static final String TEXT_259 = NL + "  public static function ";
  public static final String TEXT_260 = "($";
  public static final String TEXT_261 = ")" + NL + "  {";
  public static final String TEXT_262 = "";
  public static final String TEXT_263 = NL + "    return ";
  public static final String TEXT_264 = "[(string)$";
  public static final String TEXT_265 = "];" + NL + "  }" + NL;
  public static final String TEXT_266 = NL + "  public static function ";
  public static final String TEXT_267 = "($";
  public static final String TEXT_268 = ")" + NL + "  {";
  public static final String TEXT_269 = NL + "    $";
  public static final String TEXT_270 = " = array_key_exists((string)$";
  public static final String TEXT_271 = ", ";
  public static final String TEXT_272 = ");";
  public static final String TEXT_273 = "    return $";
  public static final String TEXT_274 = ";" + NL + "  }" + NL;
  public static final String TEXT_275 = NL + "  public static function ";
  public static final String TEXT_276 = "($";
  public static final String TEXT_277 = ")" + NL + "  {";
  public static final String TEXT_278 = "";
  public static final String TEXT_279 = NL + "    return array_key_exists((string)$";
  public static final String TEXT_280 = ", ";
  public static final String TEXT_281 = ");" + NL + "  }" + NL;
  public static final String TEXT_282 = NL + "  public function ";
  public static final String TEXT_283 = "($index)" + NL + "  {";
  public static final String TEXT_284 = NL + "    $";
  public static final String TEXT_285 = " = parent::";
  public static final String TEXT_286 = "($index);";
  public static final String TEXT_287 = NL + "    return $";
  public static final String TEXT_288 = ";" + NL + "  }" + NL;
  public static final String TEXT_289 = NL + "  public function ";
  public static final String TEXT_290 = "()" + NL + "  {";
  public static final String TEXT_291 = NL + "    $";
  public static final String TEXT_292 = " = parent::";
  public static final String TEXT_293 = "();";
  public static final String TEXT_294 = NL + "    return $";
  public static final String TEXT_295 = ";" + NL + "  }" + NL + "  ";
  public static final String TEXT_296 = NL + "  public ";
  public static final String TEXT_297 = " ";
  public static final String TEXT_298 = "()" + NL + "  {";
  public static final String TEXT_299 = NL + "    ";
  public static final String TEXT_300 = " ";
  public static final String TEXT_301 = " = ";
  public static final String TEXT_302 = ";";
  public static final String TEXT_303 = NL + "    return ";
  public static final String TEXT_304 = ";" + NL + "  }";
  public static final String TEXT_305 = NL + "  public ";
  public static final String TEXT_306 = " ";
  public static final String TEXT_307 = "()" + NL + "  {";
  public static final String TEXT_308 = NL + "    return ";
  public static final String TEXT_309 = ";" + NL + "  }";
  public static final String TEXT_310 = NL + "  public ";
  public static final String TEXT_311 = " ";
  public static final String TEXT_312 = "()" + NL + "  {";
  public static final String TEXT_313 = NL + "    $";
  public static final String TEXT_314 = " = $this->";
  public static final String TEXT_315 = ";";
  public static final String TEXT_316 = NL + "    return $";
  public static final String TEXT_317 = ";" + NL + "  }";
  public static final String TEXT_318 = NL + "  public function ";
  public static final String TEXT_319 = "()" + NL + "  {";
  public static final String TEXT_320 = NL + "    return $this->";
  public static final String TEXT_321 = ";" + NL + "  }";
  public static final String TEXT_322 = NL + "  public function ";
  public static final String TEXT_323 = "()" + NL + "  {" + NL + "    $answer = $this->";
  public static final String TEXT_324 = "();";
  public static final String TEXT_325 = NL + "    return $answer;" + NL + "  }" + NL;
  public static final String TEXT_326 = NL + "  public function ";
  public static final String TEXT_327 = "()" + NL + "  {";
  public static final String TEXT_328 = NL + "    return null;" + NL + "  }" + NL;
  public static final String TEXT_329 = NL + "  ";
  public static final String TEXT_330 = " function ";
  public static final String TEXT_331 = "(";
  public static final String TEXT_332 = ")" + NL + "  {" + NL + "    $wasEventProcessed = false;" + NL + "    ";
  public static final String TEXT_333 = NL + "    return $wasEventProcessed;" + NL + "  }" + NL;
  public static final String TEXT_334 = NL + "  public function ";
  public static final String TEXT_335 = "($";
  public static final String TEXT_336 = ")" + NL + "  {";
  public static final String TEXT_337 = "";
  public static final String TEXT_338 = NL + "    ";
  public static final String TEXT_339 = NL + "    else" + NL + "    {" + NL + "      return false;" + NL + "    }" + NL + "  }" + NL;
  public static final String TEXT_340 = "";
  public static final String TEXT_341 = NL + "  private function ";
  public static final String TEXT_342 = "()" + NL + "  {";
  public static final String TEXT_343 = NL + "    ";
  public static final String TEXT_344 = "";
  public static final String TEXT_345 = NL + "  }" + NL;
  public static final String TEXT_346 = NL + "  private function ";
  public static final String TEXT_347 = "($";
  public static final String TEXT_348 = ")" + NL + "  {";
  public static final String TEXT_349 = NL + "    $this->";
  public static final String TEXT_350 = " = $";
  public static final String TEXT_351 = ";";
  public static final String TEXT_352 = NL + "    if ($this->";
  public static final String TEXT_353 = " != self::$";
  public static final String TEXT_354 = " && $";
  public static final String TEXT_355 = " != self::$";
  public static final String TEXT_356 = ") { $this->";
  public static final String TEXT_357 = "(self::$";
  public static final String TEXT_358 = "); }";
  public static final String TEXT_359 = "";
  public static final String TEXT_360 = "";
  public static final String TEXT_361 = NL + NL + "    // entry actions and do activities" + NL + "    ";
  public static final String TEXT_362 = "";
  public static final String TEXT_363 = NL + "  }" + NL;
  public static final String TEXT_364 = NL + "  public function ";
  public static final String TEXT_365 = "()" + NL + "  {";
  public static final String TEXT_366 = "";
  public static final String TEXT_367 = NL + "    return $this->";
  public static final String TEXT_368 = ";";
  public static final String TEXT_369 = NL + "    $";
  public static final String TEXT_370 = " = $this->";
  public static final String TEXT_371 = ";";
  public static final String TEXT_372 = NL + "    return $";
  public static final String TEXT_373 = ";";
  public static final String TEXT_374 = NL + "  }";
  public static final String TEXT_375 = NL + NL + "  public function ";
  public static final String TEXT_376 = "()" + NL + "  {" + NL + "    $has = $this->";
  public static final String TEXT_377 = " != null;" + NL + "    return $has;" + NL + "  }";
  public static final String TEXT_378 = NL;
  public static final String TEXT_379 = NL + "  public function ";
  public static final String TEXT_380 = "_index($index)" + NL + "  {";
  public static final String TEXT_381 = NL + "    $";
  public static final String TEXT_382 = " = $this->";
  public static final String TEXT_383 = "[$index];";
  public static final String TEXT_384 = NL + "    return $";
  public static final String TEXT_385 = ";" + NL + "  }" + NL + NL + "  public function ";
  public static final String TEXT_386 = "()" + NL + "  {";
  public static final String TEXT_387 = NL + "    $";
  public static final String TEXT_388 = " = $this->";
  public static final String TEXT_389 = ";";
  public static final String TEXT_390 = NL + "    return $";
  public static final String TEXT_391 = ";" + NL + "  }" + NL + NL + "  public function ";
  public static final String TEXT_392 = "()" + NL + "  {";
  public static final String TEXT_393 = NL + "    $number = count($this->";
  public static final String TEXT_394 = ");";
  public static final String TEXT_395 = NL + "    return $number;" + NL + "  }" + NL + NL + "  public function ";
  public static final String TEXT_396 = "()" + NL + "  {";
  public static final String TEXT_397 = NL + "    $has = $this->";
  public static final String TEXT_398 = "() > 0;";
  public static final String TEXT_399 = NL + "    return $has;" + NL + "  }" + NL + NL + "  public function ";
  public static final String TEXT_400 = "($";
  public static final String TEXT_401 = ")" + NL + "  {";
  public static final String TEXT_402 = NL + "    $wasFound = false;" + NL + "    $index = 0;" + NL + "    foreach($this->";
  public static final String TEXT_403 = " as $";
  public static final String TEXT_404 = ")" + NL + "    {" + NL + "      if ($";
  public static final String TEXT_405 = "->equals($";
  public static final String TEXT_406 = "))" + NL + "      {" + NL + "        $wasFound = true;" + NL + "        break;" + NL + "      }" + NL + "      $index += 1;" + NL + "    }" + NL + "    $index = $wasFound ? $index : -1;";
  public static final String TEXT_407 = NL + "    return $index;" + NL + "  }" + NL;
  public static final String TEXT_408 = "UNABLE TO UNDERSAND association variable (see association_Get_All.jet)";
  public static final String TEXT_409 = "//FIXME - FOUND UNKNOWN ASSOCIATION RELATIONSHIP ";
  public static final String TEXT_410 = " : ";
  public static final String TEXT_411 = NL + "  public function ";
  public static final String TEXT_412 = "()" + NL + "  {";
  public static final String TEXT_413 = "";
  public static final String TEXT_414 = NL + "    $isValid = $this->";
  public static final String TEXT_415 = "() >= self::";
  public static final String TEXT_416 = "();";
  public static final String TEXT_417 = NL + "    $isValid = $this->";
  public static final String TEXT_418 = "() >= self::";
  public static final String TEXT_419 = "() && $this->";
  public static final String TEXT_420 = "() <= self::";
  public static final String TEXT_421 = "();";
  public static final String TEXT_422 = "";
  public static final String TEXT_423 = NL + "    return $isValid;" + NL + "  }";
  public static final String TEXT_424 = "";
  public static final String TEXT_425 = NL + "  public static function ";
  public static final String TEXT_426 = "()" + NL + "  {" + NL + "    return ";
  public static final String TEXT_427 = ";" + NL + "  }";
  public static final String TEXT_428 = NL + "  public static function ";
  public static final String TEXT_429 = "()" + NL + "  {";
  public static final String TEXT_430 = NL + "    $minimum = ";
  public static final String TEXT_431 = ";";
  public static final String TEXT_432 = NL + "    return $minimum;" + NL + "  }";
  public static final String TEXT_433 = "";
  public static final String TEXT_434 = NL + "  public static function ";
  public static final String TEXT_435 = "()" + NL + "  {" + NL + "    return ";
  public static final String TEXT_436 = ";" + NL + "  }";
  public static final String TEXT_437 = NL + "  public static function ";
  public static final String TEXT_438 = "()" + NL + "  {";
  public static final String TEXT_439 = NL + "    $minimum = ";
  public static final String TEXT_440 = ";";
  public static final String TEXT_441 = NL + "    return $minimum;" + NL + "  }";
  public static final String TEXT_442 = "";
  public static final String TEXT_443 = NL + "  public static function ";
  public static final String TEXT_444 = "()" + NL + "  {" + NL + "    return ";
  public static final String TEXT_445 = ";" + NL + "  }";
  public static final String TEXT_446 = NL + "  public static function ";
  public static final String TEXT_447 = "()" + NL + "  {";
  public static final String TEXT_448 = NL + "    $maximum = ";
  public static final String TEXT_449 = ";";
  public static final String TEXT_450 = NL + "    return $maximum;" + NL + "  }";
  public static final String TEXT_451 = NL + "  public function ";
  public static final String TEXT_452 = "($";
  public static final String TEXT_453 = ")" + NL + "  {" + NL + "    $wasAdded = false;";
  public static final String TEXT_454 = "";
  public static final String TEXT_455 = NL + "    if ($this->";
  public static final String TEXT_456 = "() >= self::";
  public static final String TEXT_457 = "())" + NL + "    {";
  public static final String TEXT_458 = NL + "      return $wasAdded;" + NL + "    }" + NL;
  public static final String TEXT_459 = NL + "    $this->";
  public static final String TEXT_460 = "[] = $";
  public static final String TEXT_461 = ";" + NL + "    if ($";
  public static final String TEXT_462 = "->";
  public static final String TEXT_463 = "($this) != -1)" + NL + "    {" + NL + "      $wasAdded = true;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      $wasAdded = $";
  public static final String TEXT_464 = "->";
  public static final String TEXT_465 = "($this);" + NL + "      if (!$wasAdded)" + NL + "      {" + NL + "        array_pop($this->";
  public static final String TEXT_466 = ");" + NL + "      }" + NL + "    }";
  public static final String TEXT_467 = NL + "    return $wasAdded;" + NL + "  }";
  public static final String TEXT_468 = NL + "  public function ";
  public static final String TEXT_469 = "($";
  public static final String TEXT_470 = ")" + NL + "  {" + NL + "    $wasRemoved = false;";
  public static final String TEXT_471 = NL + "    if ($this->";
  public static final String TEXT_472 = "($";
  public static final String TEXT_473 = ") == -1)" + NL + "    {";
  public static final String TEXT_474 = NL + "      return $wasRemoved;" + NL + "    }" + NL + NL + "    $oldIndex = $this->";
  public static final String TEXT_475 = "($";
  public static final String TEXT_476 = ");" + NL + "    unset($this->";
  public static final String TEXT_477 = "[$oldIndex]);" + NL + "    if ($";
  public static final String TEXT_478 = "->";
  public static final String TEXT_479 = "($this) == -1)" + NL + "    {" + NL + "      $wasRemoved = true;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      $wasRemoved = $";
  public static final String TEXT_480 = "->";
  public static final String TEXT_481 = "($this);" + NL + "      if (!$wasRemoved)" + NL + "      {" + NL + "        $this->";
  public static final String TEXT_482 = "[$oldIndex] = $";
  public static final String TEXT_483 = ";" + NL + "        ksort($this->";
  public static final String TEXT_484 = ");" + NL + "      }" + NL + "    }" + NL + "    $this->";
  public static final String TEXT_485 = " = array_values($this->";
  public static final String TEXT_486 = ");";
  public static final String TEXT_487 = NL + "    return $wasRemoved;" + NL + "  }";
  public static final String TEXT_488 = NL + "  ";
  public static final String TEXT_489 = " function ";
  public static final String TEXT_490 = "($";
  public static final String TEXT_491 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  public static final String TEXT_492 = NL + "    $this->";
  public static final String TEXT_493 = " = $";
  public static final String TEXT_494 = ";" + NL + "    $wasSet = true;";
  public static final String TEXT_495 = NL + "    return $wasSet;" + NL + "  }" + NL;
  public static final String TEXT_496 = NL + "  ";
  public static final String TEXT_497 = " function ";
  public static final String TEXT_498 = "($";
  public static final String TEXT_499 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  public static final String TEXT_500 = NL + "    if ($";
  public static final String TEXT_501 = " != null)" + NL + "    {" + NL + "      $this->";
  public static final String TEXT_502 = " = $";
  public static final String TEXT_503 = ";" + NL + "      $wasSet = true;" + NL + "    }";
  public static final String TEXT_504 = NL + "    return $wasSet;" + NL + "  }" + NL;
  public static final String TEXT_505 = NL + "  public function ";
  public static final String TEXT_506 = "($";
  public static final String TEXT_507 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  public static final String TEXT_508 = NL + "    if ($this->";
  public static final String TEXT_509 = " != null && $this->";
  public static final String TEXT_510 = " != $";
  public static final String TEXT_511 = " && $this == $this->";
  public static final String TEXT_512 = "->";
  public static final String TEXT_513 = "())" + NL + "    {" + NL + "      //Unable to ";
  public static final String TEXT_514 = ", as existing ";
  public static final String TEXT_515 = " would become an orphan";
  public static final String TEXT_516 = NL + "      return $wasSet;" + NL + "    }" + NL + "    " + NL + "    $this->";
  public static final String TEXT_517 = " = $";
  public static final String TEXT_518 = ";" + NL + "    $";
  public static final String TEXT_519 = " = $";
  public static final String TEXT_520 = " != null ? $";
  public static final String TEXT_521 = "->";
  public static final String TEXT_522 = "() : null;" + NL + "    " + NL + "    if ($this != $";
  public static final String TEXT_523 = ")" + NL + "    {" + NL + "      if ($";
  public static final String TEXT_524 = " != null)" + NL + "      {" + NL + "        $";
  public static final String TEXT_525 = "->";
  public static final String TEXT_526 = " = null;" + NL + "      }" + NL + "      if ($this->";
  public static final String TEXT_527 = " != null)" + NL + "      {" + NL + "        $this->";
  public static final String TEXT_528 = "->";
  public static final String TEXT_529 = "($this);" + NL + "      }" + NL + "    }" + NL + "    $wasSet = true;";
  public static final String TEXT_530 = NL + "    return $wasSet;" + NL + "  }" + NL;
  public static final String TEXT_531 = NL + "  public function ";
  public static final String TEXT_532 = "($";
  public static final String TEXT_533 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  public static final String TEXT_534 = NL + "    if ($";
  public static final String TEXT_535 = " == null)" + NL + "    {" + NL + "      //Unable to ";
  public static final String TEXT_536 = " to null, as ";
  public static final String TEXT_537 = " must always be associated to a ";
  public static final String TEXT_538 = "";
  public static final String TEXT_539 = NL + "      return $wasSet;" + NL + "    }" + NL + "    " + NL + "    $";
  public static final String TEXT_540 = " = $";
  public static final String TEXT_541 = "->";
  public static final String TEXT_542 = "();" + NL + "    if ($";
  public static final String TEXT_543 = " != null && $this != $";
  public static final String TEXT_544 = ")" + NL + "    {" + NL + "      //Unable to ";
  public static final String TEXT_545 = ", the current ";
  public static final String TEXT_546 = " already has a ";
  public static final String TEXT_547 = ", which would be orphaned if it were re-assigned";
  public static final String TEXT_548 = NL + "      return $wasSet;" + NL + "    }" + NL + "    " + NL + "    $";
  public static final String TEXT_549 = " = $this->";
  public static final String TEXT_550 = ";" + NL + "    $this->";
  public static final String TEXT_551 = " = $";
  public static final String TEXT_552 = ";" + NL + "    $this->";
  public static final String TEXT_553 = "->";
  public static final String TEXT_554 = "($this);" + NL + "    " + NL + "    if ($";
  public static final String TEXT_555 = " != null)" + NL + "    {" + NL + "      $";
  public static final String TEXT_556 = "->";
  public static final String TEXT_557 = "(null);" + NL + "    }" + NL + "    $wasSet = true;";
  public static final String TEXT_558 = NL + "    return $wasSet;" + NL + "  }" + NL;
  public static final String TEXT_559 = NL + "  public function ";
  public static final String TEXT_560 = "(";
  public static final String TEXT_561 = ")" + NL + "  {" + NL + "    return new ";
  public static final String TEXT_562 = "(";
  public static final String TEXT_563 = ");" + NL + "  }" + NL + NL + "  public function ";
  public static final String TEXT_564 = "($";
  public static final String TEXT_565 = ")" + NL + "  {" + NL + "    $wasAdded = false;";
  public static final String TEXT_566 = NL + "    $";
  public static final String TEXT_567 = " = $";
  public static final String TEXT_568 = "->";
  public static final String TEXT_569 = "();" + NL + "    $";
  public static final String TEXT_570 = " = $";
  public static final String TEXT_571 = " != null && $this !== $";
  public static final String TEXT_572 = ";" + NL + NL + "    if ($";
  public static final String TEXT_573 = " && $";
  public static final String TEXT_574 = "->";
  public static final String TEXT_575 = "() <= self::";
  public static final String TEXT_576 = "())" + NL + "    {" + NL + "      return $wasAdded;" + NL + "    }" + NL + NL + "    if ($";
  public static final String TEXT_577 = ")" + NL + "    {" + NL + "      $";
  public static final String TEXT_578 = "->";
  public static final String TEXT_579 = "($this);" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      $this->";
  public static final String TEXT_580 = "[] = $";
  public static final String TEXT_581 = ";" + NL + "    }" + NL + "    $wasAdded = true;";
  public static final String TEXT_582 = NL + "    return $wasAdded;" + NL + "  }" + NL + NL + "  public function ";
  public static final String TEXT_583 = "($";
  public static final String TEXT_584 = ")" + NL + "  {" + NL + "    $wasRemoved = false;";
  public static final String TEXT_585 = NL + "    //Unable to remove ";
  public static final String TEXT_586 = ", as it must always have a ";
  public static final String TEXT_587 = NL + "    if ($this === $";
  public static final String TEXT_588 = "->";
  public static final String TEXT_589 = "())" + NL + "    {";
  public static final String TEXT_590 = NL + "      return $wasRemoved;" + NL + "    }" + NL + NL + "    //";
  public static final String TEXT_591 = " already at minimum (";
  public static final String TEXT_592 = ")" + NL + "    if ($this->";
  public static final String TEXT_593 = "() <= self::";
  public static final String TEXT_594 = "())" + NL + "    {";
  public static final String TEXT_595 = NL + "      return $wasRemoved;" + NL + "    }" + NL + NL + "    unset($this->";
  public static final String TEXT_596 = "[$this->";
  public static final String TEXT_597 = "($";
  public static final String TEXT_598 = ")]);" + NL + "    $this->";
  public static final String TEXT_599 = " = array_values($this->";
  public static final String TEXT_600 = ");" + NL + "    $wasRemoved = true;";
  public static final String TEXT_601 = NL + "    return $wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_602 = NL + "  public function ";
  public static final String TEXT_603 = "(";
  public static final String TEXT_604 = ")" + NL + "  {" + NL + "    if ($this->";
  public static final String TEXT_605 = "() >= self::";
  public static final String TEXT_606 = "())" + NL + "    {" + NL + "      return null;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      return new ";
  public static final String TEXT_607 = "(";
  public static final String TEXT_608 = ");" + NL + "    }" + NL + "  }" + NL + NL + "  public function ";
  public static final String TEXT_609 = "($";
  public static final String TEXT_610 = ")" + NL + "  {" + NL + "    $wasAdded = false;";
  public static final String TEXT_611 = NL + "    if ($this->";
  public static final String TEXT_612 = "() >= self::";
  public static final String TEXT_613 = "())" + NL + "    {";
  public static final String TEXT_614 = NL + "      return $wasAdded;" + NL + "    }" + NL + NL + "    $";
  public static final String TEXT_615 = " = $";
  public static final String TEXT_616 = "->";
  public static final String TEXT_617 = "();" + NL + "    $";
  public static final String TEXT_618 = " = $";
  public static final String TEXT_619 = " != null && $this !== $";
  public static final String TEXT_620 = ";" + NL + NL + "    if ($";
  public static final String TEXT_621 = " && $";
  public static final String TEXT_622 = "->";
  public static final String TEXT_623 = "() <= self::";
  public static final String TEXT_624 = "())" + NL + "    {";
  public static final String TEXT_625 = NL + "      return $wasAdded;" + NL + "    }" + NL + NL + "    if ($";
  public static final String TEXT_626 = ")" + NL + "    {" + NL + "      $";
  public static final String TEXT_627 = "->";
  public static final String TEXT_628 = "($this);" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      $this->";
  public static final String TEXT_629 = "[] = $";
  public static final String TEXT_630 = ";" + NL + "    }" + NL + "    $wasAdded = true;";
  public static final String TEXT_631 = NL + "    return $wasAdded;" + NL + "  }" + NL + NL + "  public function ";
  public static final String TEXT_632 = "($";
  public static final String TEXT_633 = ")" + NL + "  {" + NL + "    $wasRemoved = false;";
  public static final String TEXT_634 = NL + "    //Unable to remove ";
  public static final String TEXT_635 = ", as it must always have a ";
  public static final String TEXT_636 = NL + "    if ($this === $";
  public static final String TEXT_637 = "->";
  public static final String TEXT_638 = "())" + NL + "    {";
  public static final String TEXT_639 = NL + "      return $wasRemoved;" + NL + "    }" + NL + NL + "    //";
  public static final String TEXT_640 = " already at minimum (";
  public static final String TEXT_641 = ")" + NL + "    if ($this->";
  public static final String TEXT_642 = "() <= self::";
  public static final String TEXT_643 = "())" + NL + "    {";
  public static final String TEXT_644 = NL + "      return $wasRemoved;" + NL + "    }" + NL + NL + "    unset($this->";
  public static final String TEXT_645 = "[$this->";
  public static final String TEXT_646 = "($";
  public static final String TEXT_647 = ")]);" + NL + "    $this->";
  public static final String TEXT_648 = " = array_values($this->";
  public static final String TEXT_649 = ");" + NL + "    $wasRemoved = true;";
  public static final String TEXT_650 = NL + "    return $wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_651 = NL + "  public function ";
  public static final String TEXT_652 = "(";
  public static final String TEXT_653 = ")" + NL + "  {" + NL + "    if ($this->";
  public static final String TEXT_654 = "() >= self::";
  public static final String TEXT_655 = "())" + NL + "    {" + NL + "      return null;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      return new ";
  public static final String TEXT_656 = "(";
  public static final String TEXT_657 = ");" + NL + "    }" + NL + "  }" + NL + NL + "  public function ";
  public static final String TEXT_658 = "($";
  public static final String TEXT_659 = ")" + NL + "  {" + NL + "    $wasAdded = false;";
  public static final String TEXT_660 = NL + "    if ($this->";
  public static final String TEXT_661 = "() >= self::";
  public static final String TEXT_662 = "())" + NL + "    {";
  public static final String TEXT_663 = NL + "      return $wasAdded;" + NL + "    }" + NL + NL + "    $";
  public static final String TEXT_664 = " = $";
  public static final String TEXT_665 = "->";
  public static final String TEXT_666 = "();" + NL + "    $";
  public static final String TEXT_667 = " = $";
  public static final String TEXT_668 = " != null && $this !== $";
  public static final String TEXT_669 = ";" + NL + "    if ($";
  public static final String TEXT_670 = ")" + NL + "    {" + NL + "      $";
  public static final String TEXT_671 = "->";
  public static final String TEXT_672 = "($this);" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      $this->";
  public static final String TEXT_673 = "[] = $";
  public static final String TEXT_674 = ";" + NL + "    }" + NL + "    $wasAdded = true;";
  public static final String TEXT_675 = NL + "    return $wasAdded;" + NL + "  }" + NL + NL + "  public function ";
  public static final String TEXT_676 = "($";
  public static final String TEXT_677 = ")" + NL + "  {" + NL + "    $wasRemoved = false;";
  public static final String TEXT_678 = NL + "    //Unable to remove ";
  public static final String TEXT_679 = ", as it must always have a ";
  public static final String TEXT_680 = NL + "    if ($this !== $";
  public static final String TEXT_681 = "->";
  public static final String TEXT_682 = "())" + NL + "    {" + NL + "      unset($this->";
  public static final String TEXT_683 = "[$this->";
  public static final String TEXT_684 = "($";
  public static final String TEXT_685 = ")]);" + NL + "      $this->";
  public static final String TEXT_686 = " = array_values($this->";
  public static final String TEXT_687 = ");" + NL + "      $wasRemoved = true;" + NL + "    }";
  public static final String TEXT_688 = NL + "    return $wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_689 = NL + "  public function ";
  public static final String TEXT_690 = "($";
  public static final String TEXT_691 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  public static final String TEXT_692 = NL + "    $";
  public static final String TEXT_693 = " = array();" + NL + "    foreach ($";
  public static final String TEXT_694 = " as $";
  public static final String TEXT_695 = ")" + NL + "    {" + NL + "      if (array_search($";
  public static final String TEXT_696 = ",$";
  public static final String TEXT_697 = ") !== false)" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      $";
  public static final String TEXT_698 = "[] = $";
  public static final String TEXT_699 = ";" + NL + "    }" + NL + NL + "    if (count($";
  public static final String TEXT_700 = ") != count($";
  public static final String TEXT_701 = ") || count($";
  public static final String TEXT_702 = ") > self::";
  public static final String TEXT_703 = "())" + NL + "    {";
  public static final String TEXT_704 = NL + "      return $wasSet;" + NL + "    }" + NL + NL + "    $";
  public static final String TEXT_705 = " = $this->";
  public static final String TEXT_706 = ";" + NL + "    $this->";
  public static final String TEXT_707 = " = array();" + NL + "    foreach ($";
  public static final String TEXT_708 = " as $";
  public static final String TEXT_709 = ")" + NL + "    {" + NL + "      $this->";
  public static final String TEXT_710 = "[] = $";
  public static final String TEXT_711 = ";" + NL + "      $removeIndex = array_search($";
  public static final String TEXT_712 = ",$";
  public static final String TEXT_713 = ");" + NL + "      if ($removeIndex !== false)" + NL + "      {" + NL + "        unset($";
  public static final String TEXT_714 = "[$removeIndex]);" + NL + "        $";
  public static final String TEXT_715 = " = array_values($";
  public static final String TEXT_716 = ");" + NL + "      }" + NL + "      else" + NL + "      {" + NL + "        $";
  public static final String TEXT_717 = "->";
  public static final String TEXT_718 = "($this);" + NL + "      }" + NL + "    }" + NL + NL + "    foreach ($";
  public static final String TEXT_719 = " as $";
  public static final String TEXT_720 = ")" + NL + "    {" + NL + "      $";
  public static final String TEXT_721 = "->";
  public static final String TEXT_722 = "($this);" + NL + "    }" + NL + "    $wasSet = true;";
  public static final String TEXT_723 = NL + "    return $wasSet;" + NL + "  }" + NL;
  public static final String TEXT_724 = NL + "  public function ";
  public static final String TEXT_725 = "(";
  public static final String TEXT_726 = ")" + NL + "  {" + NL + "    return new ";
  public static final String TEXT_727 = "(";
  public static final String TEXT_728 = ");" + NL + "  }" + NL + NL + "  public function ";
  public static final String TEXT_729 = "($";
  public static final String TEXT_730 = ")" + NL + "  {" + NL + "    $wasAdded = false;";
  public static final String TEXT_731 = NL + "    $";
  public static final String TEXT_732 = " = $";
  public static final String TEXT_733 = "->";
  public static final String TEXT_734 = "();" + NL + "    $";
  public static final String TEXT_735 = " = $";
  public static final String TEXT_736 = " != null && $this !== $";
  public static final String TEXT_737 = ";" + NL + "    if ($";
  public static final String TEXT_738 = ")" + NL + "    {" + NL + "      $";
  public static final String TEXT_739 = "->";
  public static final String TEXT_740 = "($this);" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      $this->";
  public static final String TEXT_741 = "[] = $";
  public static final String TEXT_742 = ";" + NL + "    }" + NL + "    $wasAdded = true;";
  public static final String TEXT_743 = NL + "    return $wasAdded;" + NL + "  }" + NL + NL + "  public function ";
  public static final String TEXT_744 = "($";
  public static final String TEXT_745 = ")" + NL + "  {" + NL + "    $wasRemoved = false;";
  public static final String TEXT_746 = NL + "    //Unable to remove ";
  public static final String TEXT_747 = ", as it must always have a ";
  public static final String TEXT_748 = NL + "    if ($this !== $";
  public static final String TEXT_749 = "->";
  public static final String TEXT_750 = "())" + NL + "    {" + NL + "      unset($this->";
  public static final String TEXT_751 = "[$this->";
  public static final String TEXT_752 = "($";
  public static final String TEXT_753 = ")]);" + NL + "      $this->";
  public static final String TEXT_754 = " = array_values($this->";
  public static final String TEXT_755 = ");" + NL + "      $wasRemoved = true;" + NL + "    }";
  public static final String TEXT_756 = NL + "    return $wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_757 = NL + "  public function ";
  public static final String TEXT_758 = "($";
  public static final String TEXT_759 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  public static final String TEXT_760 = NL + "    if ($";
  public static final String TEXT_761 = " == null)" + NL + "    {" + NL + "      $";
  public static final String TEXT_762 = " = $this->";
  public static final String TEXT_763 = ";" + NL + "      $this->";
  public static final String TEXT_764 = " = null;" + NL + "      " + NL + "      if ($";
  public static final String TEXT_765 = " != null && $";
  public static final String TEXT_766 = "->";
  public static final String TEXT_767 = "() != null)" + NL + "      {" + NL + "        $";
  public static final String TEXT_768 = "->";
  public static final String TEXT_769 = "(null);" + NL + "      }" + NL + "      $wasSet = true;";
  public static final String TEXT_770 = NL + "      return $wasSet;" + NL + "    }" + NL + "    " + NL + "    $";
  public static final String TEXT_771 = " = $this->";
  public static final String TEXT_772 = "();" + NL + "    if ($";
  public static final String TEXT_773 = " != null && $";
  public static final String TEXT_774 = " != $";
  public static final String TEXT_775 = ")" + NL + "    {" + NL + "      $";
  public static final String TEXT_776 = "->";
  public static final String TEXT_777 = "(null);" + NL + "    }" + NL + "    " + NL + "    $this->";
  public static final String TEXT_778 = " = $";
  public static final String TEXT_779 = ";" + NL + "    $";
  public static final String TEXT_780 = " = $";
  public static final String TEXT_781 = "->";
  public static final String TEXT_782 = "();" + NL + "    " + NL + "    if ($this != $";
  public static final String TEXT_783 = ")" + NL + "    {" + NL + "      $";
  public static final String TEXT_784 = "->";
  public static final String TEXT_785 = "($this);" + NL + "    }" + NL + "    $wasSet = true;";
  public static final String TEXT_786 = NL + "    return $wasSet;" + NL + "  }" + NL;
  public static final String TEXT_787 = NL + "  public function ";
  public static final String TEXT_788 = "($";
  public static final String TEXT_789 = ")" + NL + "  {" + NL + "    $wasRemoved = false;";
  public static final String TEXT_790 = NL + "    if ($this->";
  public static final String TEXT_791 = "($";
  public static final String TEXT_792 = ") == -1)" + NL + "    {";
  public static final String TEXT_793 = NL + "      return $wasRemoved;" + NL + "    }" + NL + NL + "    if ($this->";
  public static final String TEXT_794 = "() <= self::";
  public static final String TEXT_795 = "())" + NL + "    {";
  public static final String TEXT_796 = NL + "      return $wasRemoved;" + NL + "    }" + NL + NL + "    $oldIndex = $this->";
  public static final String TEXT_797 = "($";
  public static final String TEXT_798 = ");" + NL + "    unset($this->";
  public static final String TEXT_799 = "[$oldIndex]);" + NL + "    if ($";
  public static final String TEXT_800 = "->";
  public static final String TEXT_801 = "($this) == -1)" + NL + "    {" + NL + "      $wasRemoved = true;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      $wasRemoved = $";
  public static final String TEXT_802 = "->";
  public static final String TEXT_803 = "($this);" + NL + "      if (!$wasRemoved)" + NL + "      {" + NL + "        $this->";
  public static final String TEXT_804 = "[$oldIndex] = $";
  public static final String TEXT_805 = ";" + NL + "        ksort($this->";
  public static final String TEXT_806 = ");" + NL + "      }" + NL + "    }" + NL + "    $this->";
  public static final String TEXT_807 = " = array_values($this->";
  public static final String TEXT_808 = ");";
  public static final String TEXT_809 = NL + "    return $wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_810 = NL + "  public function ";
  public static final String TEXT_811 = "($";
  public static final String TEXT_812 = ")" + NL + "  {" + NL + "    $wasRemoved = false;";
  public static final String TEXT_813 = NL + "    if ($this->";
  public static final String TEXT_814 = "($";
  public static final String TEXT_815 = ") == -1)" + NL + "    {";
  public static final String TEXT_816 = NL + "      return $wasRemoved;" + NL + "    }" + NL + NL + "    if ($this->";
  public static final String TEXT_817 = "() <= self::";
  public static final String TEXT_818 = "())" + NL + "    {";
  public static final String TEXT_819 = NL + "      return $wasRemoved;" + NL + "    }" + NL + NL + "    $oldIndex = $this->";
  public static final String TEXT_820 = "($";
  public static final String TEXT_821 = ");" + NL + "    unset($this->";
  public static final String TEXT_822 = "[$oldIndex]);" + NL + "    if ($";
  public static final String TEXT_823 = "->";
  public static final String TEXT_824 = "($this) == -1)" + NL + "    {" + NL + "      $wasRemoved = true;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      $wasRemoved = $";
  public static final String TEXT_825 = "->";
  public static final String TEXT_826 = "($this);" + NL + "      if (!$wasRemoved)" + NL + "      {" + NL + "        $this->";
  public static final String TEXT_827 = "[$oldIndex] = $";
  public static final String TEXT_828 = ";" + NL + "        ksort($this->";
  public static final String TEXT_829 = ");" + NL + "      }" + NL + "    }" + NL + "    $this->";
  public static final String TEXT_830 = " = array_values($this->";
  public static final String TEXT_831 = ");";
  public static final String TEXT_832 = NL + "    return $wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_833 = NL + "  public function ";
  public static final String TEXT_834 = "($";
  public static final String TEXT_835 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  public static final String TEXT_836 = NL + "    if ($";
  public static final String TEXT_837 = " != null && $";
  public static final String TEXT_838 = "->";
  public static final String TEXT_839 = "() >= ";
  public static final String TEXT_840 = "::";
  public static final String TEXT_841 = "())" + NL + "    {";
  public static final String TEXT_842 = NL + "      return $wasSet;" + NL + "    }" + NL + NL + "    $";
  public static final String TEXT_843 = " = $this->";
  public static final String TEXT_844 = ";" + NL + "    $this->";
  public static final String TEXT_845 = " = $";
  public static final String TEXT_846 = ";" + NL + "    if ($";
  public static final String TEXT_847 = " != null && $";
  public static final String TEXT_848 = " != $";
  public static final String TEXT_849 = ")" + NL + "    {" + NL + "      $";
  public static final String TEXT_850 = "->";
  public static final String TEXT_851 = "($this);" + NL + "    }" + NL + "    if ($";
  public static final String TEXT_852 = " != null)" + NL + "    {" + NL + "      $";
  public static final String TEXT_853 = "->";
  public static final String TEXT_854 = "($this);" + NL + "    }" + NL + "    $wasSet = true;";
  public static final String TEXT_855 = NL + "    return $wasSet;" + NL + "  }" + NL;
  public static final String TEXT_856 = NL + "  public function ";
  public static final String TEXT_857 = "($";
  public static final String TEXT_858 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  public static final String TEXT_859 = NL + "    if ($";
  public static final String TEXT_860 = " == null)" + NL + "    {";
  public static final String TEXT_861 = NL + "      return $wasSet;" + NL + "    }" + NL + "    " + NL + "    $";
  public static final String TEXT_862 = " = $this->";
  public static final String TEXT_863 = ";" + NL + "    $this->";
  public static final String TEXT_864 = " = $";
  public static final String TEXT_865 = ";" + NL + "    if ($";
  public static final String TEXT_866 = " != null && $";
  public static final String TEXT_867 = " != $";
  public static final String TEXT_868 = ")" + NL + "    {" + NL + "      $";
  public static final String TEXT_869 = "->";
  public static final String TEXT_870 = "($this);" + NL + "    }" + NL + "    $this->";
  public static final String TEXT_871 = "->";
  public static final String TEXT_872 = "($this);" + NL + "    $wasSet = true;";
  public static final String TEXT_873 = NL + "    return $wasSet;" + NL + "  }" + NL;
  public static final String TEXT_874 = NL + "  public function ";
  public static final String TEXT_875 = "($";
  public static final String TEXT_876 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  public static final String TEXT_877 = NL + "    if ($";
  public static final String TEXT_878 = " === NULL)" + NL + "    {";
  public static final String TEXT_879 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    $";
  public static final String TEXT_880 = " = $this->";
  public static final String TEXT_881 = ";" + NL + "    $this->";
  public static final String TEXT_882 = " = $";
  public static final String TEXT_883 = ";" + NL + "    if (!$";
  public static final String TEXT_884 = "->is_null() && !$";
  public static final String TEXT_885 = "->equals($";
  public static final String TEXT_886 = "))" + NL + "    {" + NL + "      $";
  public static final String TEXT_887 = "->";
  public static final String TEXT_888 = "($this);" + NL + "    }" + NL + "    if (!$this->";
  public static final String TEXT_889 = "->";
  public static final String TEXT_890 = "($this))" + NL + "    {" + NL + "      $this->";
  public static final String TEXT_891 = " = $";
  public static final String TEXT_892 = ";" + NL + "      $wasSet = false;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      $wasSet = true;" + NL + "    }";
  public static final String TEXT_893 = NL + "    return $wasSet;" + NL + "  }" + NL;
  public static final String TEXT_894 = NL + "  public function ";
  public static final String TEXT_895 = "($";
  public static final String TEXT_896 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  public static final String TEXT_897 = NL + "    //Must provide ";
  public static final String TEXT_898 = " to ";
  public static final String TEXT_899 = NL + "    if ($";
  public static final String TEXT_900 = " == null)" + NL + "    {";
  public static final String TEXT_901 = NL + "      return $wasSet;" + NL + "    }" + NL + NL + "    //";
  public static final String TEXT_902 = " already at maximum (";
  public static final String TEXT_903 = ")" + NL + "    if ($";
  public static final String TEXT_904 = "->";
  public static final String TEXT_905 = "() >= ";
  public static final String TEXT_906 = "::";
  public static final String TEXT_907 = "())" + NL + "    {";
  public static final String TEXT_908 = NL + "      return $wasSet;" + NL + "    }" + NL + "    " + NL + "    $";
  public static final String TEXT_909 = " = $this->";
  public static final String TEXT_910 = ";" + NL + "    $this->";
  public static final String TEXT_911 = " = $";
  public static final String TEXT_912 = ";" + NL + "    if ($";
  public static final String TEXT_913 = " != null && $";
  public static final String TEXT_914 = " != $";
  public static final String TEXT_915 = ")" + NL + "    {" + NL + "      $didRemove = $";
  public static final String TEXT_916 = "->";
  public static final String TEXT_917 = "($this);" + NL + "      if (!$didRemove)" + NL + "      {" + NL + "        $this->";
  public static final String TEXT_918 = " = $";
  public static final String TEXT_919 = ";";
  public static final String TEXT_920 = NL + "        return $wasSet;" + NL + "      }" + NL + "    }" + NL + "    $this->";
  public static final String TEXT_921 = "->";
  public static final String TEXT_922 = "($this);" + NL + "    $wasSet = true;";
  public static final String TEXT_923 = NL + "    return $wasSet;" + NL + "  }" + NL;
  public static final String TEXT_924 = NL + "  public function ";
  public static final String TEXT_925 = "($";
  public static final String TEXT_926 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  public static final String TEXT_927 = NL + "    //Must provide ";
  public static final String TEXT_928 = " to ";
  public static final String TEXT_929 = NL + "    if ($";
  public static final String TEXT_930 = " == null)" + NL + "    {";
  public static final String TEXT_931 = NL + "      return $wasSet;" + NL + "    }" + NL + NL + "    if ($this->";
  public static final String TEXT_932 = " != null && $this->";
  public static final String TEXT_933 = "->";
  public static final String TEXT_934 = "() <= ";
  public static final String TEXT_935 = "::";
  public static final String TEXT_936 = "())" + NL + "    {";
  public static final String TEXT_937 = NL + "      return $wasSet;" + NL + "    }" + NL + NL + "    $";
  public static final String TEXT_938 = " = $this->";
  public static final String TEXT_939 = ";" + NL + "    $this->";
  public static final String TEXT_940 = " = $";
  public static final String TEXT_941 = ";" + NL + "    if ($";
  public static final String TEXT_942 = " != null && $";
  public static final String TEXT_943 = " != $";
  public static final String TEXT_944 = ")" + NL + "    {" + NL + "      $didRemove = $";
  public static final String TEXT_945 = "->";
  public static final String TEXT_946 = "($this);" + NL + "      if (!$didRemove)" + NL + "      {" + NL + "        $this->";
  public static final String TEXT_947 = " = $";
  public static final String TEXT_948 = ";";
  public static final String TEXT_949 = NL + "        return $wasSet;" + NL + "      }" + NL + "    }" + NL + "    $this->";
  public static final String TEXT_950 = "->";
  public static final String TEXT_951 = "($this);" + NL + "    $wasSet = true;";
  public static final String TEXT_952 = NL + "    return $wasSet;" + NL + "  }" + NL;
  public static final String TEXT_953 = NL + "  public function ";
  public static final String TEXT_954 = "($";
  public static final String TEXT_955 = ")" + NL + "  {" + NL + "    $wasAdded = false;";
  public static final String TEXT_956 = NL + "    $";
  public static final String TEXT_957 = " = $";
  public static final String TEXT_958 = "->";
  public static final String TEXT_959 = "();" + NL + "    if ($";
  public static final String TEXT_960 = " == null)" + NL + "    {" + NL + "      $";
  public static final String TEXT_961 = "->";
  public static final String TEXT_962 = "($this);" + NL + "    }" + NL + "    elseif ($this !== $";
  public static final String TEXT_963 = ")" + NL + "    {" + NL + "      $";
  public static final String TEXT_964 = "->";
  public static final String TEXT_965 = "($";
  public static final String TEXT_966 = ");" + NL + "      $this->";
  public static final String TEXT_967 = "($";
  public static final String TEXT_968 = ");" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      $this->";
  public static final String TEXT_969 = "[] = $";
  public static final String TEXT_970 = ";" + NL + "    }" + NL + "    $wasAdded = true;";
  public static final String TEXT_971 = NL + "    return $wasAdded;" + NL + "  }" + NL + NL + "  public function ";
  public static final String TEXT_972 = "($";
  public static final String TEXT_973 = ")" + NL + "  {" + NL + "    $wasRemoved = false;";
  public static final String TEXT_974 = NL + "    if ($this->";
  public static final String TEXT_975 = "($";
  public static final String TEXT_976 = ") != -1)" + NL + "    {" + NL + "      unset($this->";
  public static final String TEXT_977 = "[$this->";
  public static final String TEXT_978 = "($";
  public static final String TEXT_979 = ")]);" + NL + "      $this->";
  public static final String TEXT_980 = " = array_values($this->";
  public static final String TEXT_981 = ");" + NL + "      if ($this === $";
  public static final String TEXT_982 = "->";
  public static final String TEXT_983 = "())" + NL + "      {" + NL + "        $";
  public static final String TEXT_984 = "->";
  public static final String TEXT_985 = "(null);" + NL + "      }" + NL + "      $wasRemoved = true;" + NL + "    }";
  public static final String TEXT_986 = NL + "    return $wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_987 = NL + "  public function ";
  public static final String TEXT_988 = "($";
  public static final String TEXT_989 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  public static final String TEXT_990 = NL + "    $";
  public static final String TEXT_991 = " = $this->";
  public static final String TEXT_992 = ";" + NL + "    $this->";
  public static final String TEXT_993 = " = $";
  public static final String TEXT_994 = ";" + NL + "    if ($";
  public static final String TEXT_995 = " != null && $";
  public static final String TEXT_996 = " !== $";
  public static final String TEXT_997 = ")" + NL + "    {" + NL + "      $";
  public static final String TEXT_998 = "->";
  public static final String TEXT_999 = "($this);" + NL + "    }" + NL + "    if ($";
  public static final String TEXT_1000 = " != null && $";
  public static final String TEXT_1001 = " !== $";
  public static final String TEXT_1002 = ")" + NL + "    {" + NL + "      $";
  public static final String TEXT_1003 = "->";
  public static final String TEXT_1004 = "($this);" + NL + "    }" + NL + "    $wasSet = true;";
  public static final String TEXT_1005 = NL + "    return $wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1006 = NL + "  public function ";
  public static final String TEXT_1007 = "($";
  public static final String TEXT_1008 = ")" + NL + "  {" + NL + "    $wasAdded = false;";
  public static final String TEXT_1009 = NL + "    if ($this->";
  public static final String TEXT_1010 = "() >= self::";
  public static final String TEXT_1011 = "())" + NL + "    {";
  public static final String TEXT_1012 = NL + "      return $wasAdded;" + NL + "    }" + NL + NL + "    $";
  public static final String TEXT_1013 = " = $";
  public static final String TEXT_1014 = "->";
  public static final String TEXT_1015 = "();" + NL + "    if ($";
  public static final String TEXT_1016 = " == null)" + NL + "    {" + NL + "      $";
  public static final String TEXT_1017 = "->";
  public static final String TEXT_1018 = "($this);" + NL + "    }" + NL + "    else if ($this !== $";
  public static final String TEXT_1019 = ")" + NL + "    {" + NL + "      $";
  public static final String TEXT_1020 = "->";
  public static final String TEXT_1021 = "($";
  public static final String TEXT_1022 = ");" + NL + "      $this->";
  public static final String TEXT_1023 = "($";
  public static final String TEXT_1024 = ");" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      $this->";
  public static final String TEXT_1025 = "[] = $";
  public static final String TEXT_1026 = ";" + NL + "    }" + NL + "    $wasAdded = true;";
  public static final String TEXT_1027 = NL + "    return $wasAdded;" + NL + "  }" + NL + NL + "  public function ";
  public static final String TEXT_1028 = "($";
  public static final String TEXT_1029 = ")" + NL + "  {" + NL + "    $wasRemoved = false;";
  public static final String TEXT_1030 = NL + "    if ($this->";
  public static final String TEXT_1031 = "($";
  public static final String TEXT_1032 = ") != -1)" + NL + "    {" + NL + "      unset($this->";
  public static final String TEXT_1033 = "[$this->";
  public static final String TEXT_1034 = "($";
  public static final String TEXT_1035 = ")]);" + NL + "      $this->";
  public static final String TEXT_1036 = " = array_values($this->";
  public static final String TEXT_1037 = ");" + NL + "      $";
  public static final String TEXT_1038 = "->";
  public static final String TEXT_1039 = "(null);" + NL + "      $wasRemoved = true;" + NL + "    }";
  public static final String TEXT_1040 = NL + "    return $wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_1041 = NL + "  public function ";
  public static final String TEXT_1042 = "($";
  public static final String TEXT_1043 = ")" + NL + "  {" + NL + "    $wasAdded = false;";
  public static final String TEXT_1044 = NL + "    if ($this->";
  public static final String TEXT_1045 = "() < self::";
  public static final String TEXT_1046 = "())" + NL + "    {" + NL + "      $this->";
  public static final String TEXT_1047 = "[] = $";
  public static final String TEXT_1048 = ";" + NL + "      $wasAdded = true;" + NL + "    }";
  public static final String TEXT_1049 = NL + "    return $wasAdded;" + NL + "  }" + NL + NL + "  public function ";
  public static final String TEXT_1050 = "($";
  public static final String TEXT_1051 = ")" + NL + "  {" + NL + "    $wasRemoved = false;";
  public static final String TEXT_1052 = NL + "    if ($this->";
  public static final String TEXT_1053 = "($";
  public static final String TEXT_1054 = ") == -1)" + NL + "    {";
  public static final String TEXT_1055 = NL + "      return $wasRemoved;" + NL + "    }" + NL + NL + "    if ($this->";
  public static final String TEXT_1056 = "() <= self::";
  public static final String TEXT_1057 = "())" + NL + "    {";
  public static final String TEXT_1058 = NL + "      return $wasRemoved;" + NL + "    }" + NL + NL + "    unset($this->";
  public static final String TEXT_1059 = "[$this->";
  public static final String TEXT_1060 = "($";
  public static final String TEXT_1061 = ")]);" + NL + "    $this->";
  public static final String TEXT_1062 = " = array_values($this->";
  public static final String TEXT_1063 = ");" + NL + "    $wasRemoved = true;";
  public static final String TEXT_1064 = NL + "    return $wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_1065 = NL + "  public function ";
  public static final String TEXT_1066 = "($";
  public static final String TEXT_1067 = ")" + NL + "  {" + NL + "    $wasAdded = false;";
  public static final String TEXT_1068 = "";
  public static final String TEXT_1069 = NL + "    if ($this->";
  public static final String TEXT_1070 = "() >= self::";
  public static final String TEXT_1071 = "())" + NL + "    {";
  public static final String TEXT_1072 = NL + "      return $wasAdded;" + NL + "    }";
  public static final String TEXT_1073 = NL + "    $";
  public static final String TEXT_1074 = " = $";
  public static final String TEXT_1075 = "->";
  public static final String TEXT_1076 = "();" + NL + "    if ($";
  public static final String TEXT_1077 = " != null && $";
  public static final String TEXT_1078 = "->";
  public static final String TEXT_1079 = "() <= self::";
  public static final String TEXT_1080 = "())" + NL + "    {";
  public static final String TEXT_1081 = NL + "      return $wasAdded;" + NL + "    }" + NL + "    else if ($";
  public static final String TEXT_1082 = " != null)" + NL + "    {" + NL + "      unset($";
  public static final String TEXT_1083 = "->";
  public static final String TEXT_1084 = "[$";
  public static final String TEXT_1085 = "->";
  public static final String TEXT_1086 = "($";
  public static final String TEXT_1087 = ")]);" + NL + "      $";
  public static final String TEXT_1088 = "->";
  public static final String TEXT_1089 = " = array_values($";
  public static final String TEXT_1090 = "->";
  public static final String TEXT_1091 = ");" + NL + "    }" + NL + "    $this->";
  public static final String TEXT_1092 = "[] = $";
  public static final String TEXT_1093 = ";" + NL + "    $this->";
  public static final String TEXT_1094 = "($";
  public static final String TEXT_1095 = ",$this);" + NL + "    $wasAdded = true;";
  public static final String TEXT_1096 = NL + "    return $wasAdded;" + NL + "  }" + NL + NL + "  public function ";
  public static final String TEXT_1097 = "($";
  public static final String TEXT_1098 = ")" + NL + "  {" + NL + "    $wasRemoved = false;";
  public static final String TEXT_1099 = NL + "    if ($this->";
  public static final String TEXT_1100 = "($";
  public static final String TEXT_1101 = ") != -1 && $this->";
  public static final String TEXT_1102 = "() > self::";
  public static final String TEXT_1103 = "())" + NL + "    {" + NL + "      unset($this->";
  public static final String TEXT_1104 = "[$this->";
  public static final String TEXT_1105 = "($";
  public static final String TEXT_1106 = ")]);" + NL + "      $this->";
  public static final String TEXT_1107 = " = array_values($this->";
  public static final String TEXT_1108 = ");" + NL + "      $this->";
  public static final String TEXT_1109 = "($";
  public static final String TEXT_1110 = ",null);" + NL + "      $wasRemoved = true;" + NL + "    }";
  public static final String TEXT_1111 = NL + "    return $wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_1112 = NL + "  public function ";
  public static final String TEXT_1113 = "($";
  public static final String TEXT_1114 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  public static final String TEXT_1115 = NL + "    $";
  public static final String TEXT_1116 = " = array();" + NL + "    foreach ($";
  public static final String TEXT_1117 = " as $";
  public static final String TEXT_1118 = ")" + NL + "    {" + NL + "      if (array_search($";
  public static final String TEXT_1119 = ",$";
  public static final String TEXT_1120 = ") !== false)" + NL + "      {";
  public static final String TEXT_1121 = NL + "        return $wasSet;" + NL + "      }" + NL + "      else if ($";
  public static final String TEXT_1122 = "->";
  public static final String TEXT_1123 = "() != null && $this !== $";
  public static final String TEXT_1124 = "->";
  public static final String TEXT_1125 = "())" + NL + "      {";
  public static final String TEXT_1126 = NL + "        return $wasSet;" + NL + "      }" + NL + "      $";
  public static final String TEXT_1127 = "[] = $";
  public static final String TEXT_1128 = ";" + NL + "    }" + NL + NL + "    if (count($";
  public static final String TEXT_1129 = ") != self::";
  public static final String TEXT_1130 = "())" + NL + "    {";
  public static final String TEXT_1131 = NL + "      return $wasSet;" + NL + "    }" + NL + NL + "    foreach ($this->";
  public static final String TEXT_1132 = " as $orphan) " + NL + "    {" + NL + "      $wasFound = false;" + NL + "      foreach ($";
  public static final String TEXT_1133 = " as $fosterCare)" + NL + "      {" + NL + "        if ($orphan == $fosterCare)" + NL + "        {" + NL + "          $wasFound = true;" + NL + "          break;" + NL + "        }" + NL + "      }" + NL + NL + "      if (!$wasFound)" + NL + "      {" + NL + "        $this->";
  public static final String TEXT_1134 = "($orphan, null);" + NL + "      }" + NL + "    }" + NL + NL + "    $this->";
  public static final String TEXT_1135 = " = array();" + NL + "    foreach ($";
  public static final String TEXT_1136 = " as $";
  public static final String TEXT_1137 = ")" + NL + "    {" + NL + "      $this->";
  public static final String TEXT_1138 = "($";
  public static final String TEXT_1139 = ", $this);" + NL + "      $this->";
  public static final String TEXT_1140 = "[] = $";
  public static final String TEXT_1141 = ";" + NL + "    }" + NL + "    $wasSet = true;";
  public static final String TEXT_1142 = NL + "    return $wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1143 = NL + "  private function ";
  public static final String TEXT_1144 = "($";
  public static final String TEXT_1145 = ", $";
  public static final String TEXT_1146 = ")" + NL + "  {" + NL + "    $";
  public static final String TEXT_1147 = "->mentor = $";
  public static final String TEXT_1148 = ";" + NL + "    //$prop = new ReflectionProperty($";
  public static final String TEXT_1149 = ", '";
  public static final String TEXT_1150 = "');" + NL + "    //$prop->setAccessible(true);" + NL + "    //$prop->setValue($";
  public static final String TEXT_1151 = ",$";
  public static final String TEXT_1152 = ");" + NL + "    //$prop->setAccessible(false);" + NL + "  }" + NL;
  public static final String TEXT_1153 = NL + "  public function ";
  public static final String TEXT_1154 = "($";
  public static final String TEXT_1155 = ")" + NL + "  {" + NL + "    $wasAdded = false;";
  public static final String TEXT_1156 = NL + "    $this->";
  public static final String TEXT_1157 = "[] = $";
  public static final String TEXT_1158 = ";" + NL + "    $wasAdded = true;";
  public static final String TEXT_1159 = NL + "    return $wasAdded;" + NL + "  }" + NL + NL + "  public function ";
  public static final String TEXT_1160 = "($";
  public static final String TEXT_1161 = ")" + NL + "  {" + NL + "    $wasRemoved = false;";
  public static final String TEXT_1162 = NL + "    if ($this->";
  public static final String TEXT_1163 = "($";
  public static final String TEXT_1164 = ") != -1)" + NL + "    {" + NL + "      unset($this->";
  public static final String TEXT_1165 = "[$this->";
  public static final String TEXT_1166 = "($";
  public static final String TEXT_1167 = ")]);" + NL + "      $this->";
  public static final String TEXT_1168 = " = array_values($this->";
  public static final String TEXT_1169 = ");" + NL + "      $wasRemoved = true;" + NL + "    }";
  public static final String TEXT_1170 = NL + "    return $wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_1171 = NL + "  public function ";
  public static final String TEXT_1172 = "($";
  public static final String TEXT_1173 = ")" + NL + "  {" + NL + "    $wasAdded = false;";
  public static final String TEXT_1174 = NL + "    if ($this->";
  public static final String TEXT_1175 = "() < self::";
  public static final String TEXT_1176 = "())" + NL + "    {" + NL + "      $this->";
  public static final String TEXT_1177 = "[] = $";
  public static final String TEXT_1178 = ";" + NL + "      $wasAdded = true;" + NL + "    }";
  public static final String TEXT_1179 = NL + "    return $wasAdded;" + NL + "  }" + NL + NL + "  public function ";
  public static final String TEXT_1180 = "($";
  public static final String TEXT_1181 = ")" + NL + "  {" + NL + "    $wasRemoved = false;";
  public static final String TEXT_1182 = NL + "    if ($this->";
  public static final String TEXT_1183 = "($";
  public static final String TEXT_1184 = ") != -1)" + NL + "    {" + NL + "      unset($this->";
  public static final String TEXT_1185 = "[$this->";
  public static final String TEXT_1186 = "($";
  public static final String TEXT_1187 = ")]);" + NL + "      $this->";
  public static final String TEXT_1188 = " = array_values($this->";
  public static final String TEXT_1189 = ");" + NL + "      $wasRemoved = true;" + NL + "    }";
  public static final String TEXT_1190 = NL + "    return $wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_1191 = NL + "  public function ";
  public static final String TEXT_1192 = "($";
  public static final String TEXT_1193 = ")" + NL + "  {" + NL + "    $wasAdded = false;";
  public static final String TEXT_1194 = NL + "    $this->";
  public static final String TEXT_1195 = "[] = $";
  public static final String TEXT_1196 = ";" + NL + "    $wasAdded = true;";
  public static final String TEXT_1197 = NL + "    return $wasAdded;" + NL + "  }" + NL + NL + "  public function ";
  public static final String TEXT_1198 = "($";
  public static final String TEXT_1199 = ")" + NL + "  {" + NL + "    $wasRemoved = false;";
  public static final String TEXT_1200 = NL + "    if ($this->";
  public static final String TEXT_1201 = "($";
  public static final String TEXT_1202 = ") == -1)" + NL + "    {";
  public static final String TEXT_1203 = NL + "      return $wasRemoved;" + NL + "    }" + NL + NL + "    if ($this->";
  public static final String TEXT_1204 = "() <= self::";
  public static final String TEXT_1205 = "())" + NL + "    {";
  public static final String TEXT_1206 = NL + "      return $wasRemoved;" + NL + "    }" + NL + NL + "    unset($this->";
  public static final String TEXT_1207 = "[$this->";
  public static final String TEXT_1208 = "($";
  public static final String TEXT_1209 = ")]);" + NL + "    $this->";
  public static final String TEXT_1210 = " = array_values($this->";
  public static final String TEXT_1211 = ");" + NL + "    $wasRemoved = true;";
  public static final String TEXT_1212 = NL + "    return $wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_1213 = NL + "  ";
  public static final String TEXT_1214 = " function ";
  public static final String TEXT_1215 = "($";
  public static final String TEXT_1216 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  public static final String TEXT_1217 = NL + "    $";
  public static final String TEXT_1218 = " = array();" + NL + "    foreach ($";
  public static final String TEXT_1219 = " as $";
  public static final String TEXT_1220 = ")" + NL + "    {" + NL + "      if (array_search($";
  public static final String TEXT_1221 = ",$";
  public static final String TEXT_1222 = ") !== false)" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      $";
  public static final String TEXT_1223 = "[] = $";
  public static final String TEXT_1224 = ";" + NL + "    }" + NL + NL + "    if (count($";
  public static final String TEXT_1225 = ") != count($";
  public static final String TEXT_1226 = ") || count($";
  public static final String TEXT_1227 = ") != self::";
  public static final String TEXT_1228 = "())" + NL + "    {";
  public static final String TEXT_1229 = NL + "      return $wasSet;" + NL + "    }" + NL + NL + "    $this->";
  public static final String TEXT_1230 = " = $";
  public static final String TEXT_1231 = ";" + NL + "    $wasSet = true;";
  public static final String TEXT_1232 = NL + "    return $wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1233 = NL + "  ";
  public static final String TEXT_1234 = " function ";
  public static final String TEXT_1235 = "($";
  public static final String TEXT_1236 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  public static final String TEXT_1237 = NL + "    $";
  public static final String TEXT_1238 = " = array();" + NL + "    foreach ($";
  public static final String TEXT_1239 = " as $";
  public static final String TEXT_1240 = ")" + NL + "    {" + NL + "      if (array_search($";
  public static final String TEXT_1241 = ",$";
  public static final String TEXT_1242 = ") !== false)" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      $";
  public static final String TEXT_1243 = "[] = $";
  public static final String TEXT_1244 = ";" + NL + "    }" + NL + NL + "    if (count($";
  public static final String TEXT_1245 = ") != count($";
  public static final String TEXT_1246 = "))" + NL + "    {";
  public static final String TEXT_1247 = NL + "      return $wasSet;" + NL + "    }" + NL + NL + "    $";
  public static final String TEXT_1248 = "->";
  public static final String TEXT_1249 = " = $";
  public static final String TEXT_1250 = ";" + NL + "    $wasSet = true;";
  public static final String TEXT_1251 = NL + "    return $wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1252 = NL + "  public function ";
  public static final String TEXT_1253 = "($";
  public static final String TEXT_1254 = ")" + NL + "  {" + NL + "    //" + NL + "    // This source of this source generation is association_SetOptionalOneToMandatoryMany.jet" + NL + "    // This set file assumes the generation of a maximumNumberOfXXX method does not exist because " + NL + "    // it's not required (No upper bound)" + NL + "    //   " + NL + NL + "    $wasSet = false;" + NL + "    " + NL + "    $";
  public static final String TEXT_1255 = " = $this->";
  public static final String TEXT_1256 = ";" + NL + NL + "    if ($";
  public static final String TEXT_1257 = " == null)" + NL + "    {" + NL + "      if ($";
  public static final String TEXT_1258 = " != null)" + NL + "      {" + NL + "        if ($";
  public static final String TEXT_1259 = "->";
  public static final String TEXT_1260 = "($this))" + NL + "        {" + NL + "          $";
  public static final String TEXT_1261 = " = $";
  public static final String TEXT_1262 = ";" + NL + "          $wasSet = true;" + NL + "        }" + NL + "      }" + NL + "    } " + NL + "    else if ($";
  public static final String TEXT_1263 = " != null)" + NL + "    {" + NL + "      if ($";
  public static final String TEXT_1264 = " == null)" + NL + "      {" + NL + "        if ($";
  public static final String TEXT_1265 = "->";
  public static final String TEXT_1266 = "() < $";
  public static final String TEXT_1267 = "->";
  public static final String TEXT_1268 = "())" + NL + "        {" + NL + "          $";
  public static final String TEXT_1269 = "->";
  public static final String TEXT_1270 = "($this);" + NL + "          $";
  public static final String TEXT_1271 = " = $";
  public static final String TEXT_1272 = ";  // ";
  public static final String TEXT_1273 = " == null" + NL + "          $wasSet = true;" + NL + "        }" + NL + "      } " + NL + "      else" + NL + "      {" + NL + "        if ($";
  public static final String TEXT_1274 = "->";
  public static final String TEXT_1275 = "() < $";
  public static final String TEXT_1276 = "->";
  public static final String TEXT_1277 = "())" + NL + "        {" + NL + "          $";
  public static final String TEXT_1278 = "->";
  public static final String TEXT_1279 = "($this);" + NL + "          $";
  public static final String TEXT_1280 = "->";
  public static final String TEXT_1281 = "($this);" + NL + "          $";
  public static final String TEXT_1282 = " = $";
  public static final String TEXT_1283 = ";" + NL + "          $wasSet = true;" + NL + "        }" + NL + "      }" + NL + "    }" + NL + "    if ($wasSet)" + NL + "    {" + NL + "      $";
  public static final String TEXT_1284 = " = $";
  public static final String TEXT_1285 = ";" + NL + "    }" + NL + "    return $wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1286 = NL + "//  public function ";
  public static final String TEXT_1287 = "($";
  public static final String TEXT_1288 = ")" + NL + "//  {" + NL + "//    //" + NL + "//    // The source of the code generation is association_SetOptionalOneToMN.jet" + NL + "//    // (this) set file assumes the generation of a maximumNumberOfXXX " + NL + "//    //   method ";
  public static final String TEXT_1289 = NL + "//    // Currently this will not compile due to Issue351 - the template code is fine." + NL + "//    //" + NL + "//    $wasSet = false;" + NL + "//" + NL + "//    $";
  public static final String TEXT_1290 = " = $";
  public static final String TEXT_1291 = ";" + NL + "//    " + NL + "//    if ($";
  public static final String TEXT_1292 = " == null)" + NL + "//    {" + NL + "//      if ($";
  public static final String TEXT_1293 = " != null)" + NL + "//      {" + NL + "//        if ($";
  public static final String TEXT_1294 = "->";
  public static final String TEXT_1295 = "(this))" + NL + "//        {" + NL + "//          $";
  public static final String TEXT_1296 = " = $";
  public static final String TEXT_1297 = ";" + NL + "//          $wasSet = true;" + NL + "//        }" + NL + "//      }" + NL + "//    } " + NL + "//    else if ($";
  public static final String TEXT_1298 = " != null)" + NL + "//    { " + NL + "//      if ($";
  public static final String TEXT_1299 = " == null)" + NL + "//      {" + NL + "//        if ($";
  public static final String TEXT_1300 = "->";
  public static final String TEXT_1301 = "() < $";
  public static final String TEXT_1302 = "->";
  public static final String TEXT_1303 = "())" + NL + "//        {" + NL + "//          $";
  public static final String TEXT_1304 = "->";
  public static final String TEXT_1305 = "(this);" + NL + "//          $";
  public static final String TEXT_1306 = " = $";
  public static final String TEXT_1307 = ";  // $";
  public static final String TEXT_1308 = " == null" + NL + "//          $wasSet = true;" + NL + "//        }" + NL + "//      } " + NL + "//      else" + NL + "//      {" + NL + "//        if (   $";
  public static final String TEXT_1309 = "->";
  public static final String TEXT_1310 = "() < $";
  public static final String TEXT_1311 = "->";
  public static final String TEXT_1312 = "()" + NL + "//            && $";
  public static final String TEXT_1313 = "->";
  public static final String TEXT_1314 = "() > $";
  public static final String TEXT_1315 = "->";
  public static final String TEXT_1316 = "()" + NL + "//           )" + NL + "//        {" + NL + "//          $";
  public static final String TEXT_1317 = "->";
  public static final String TEXT_1318 = "(this);" + NL + "//          $";
  public static final String TEXT_1319 = "->";
  public static final String TEXT_1320 = "(this);" + NL + "//          $";
  public static final String TEXT_1321 = " = ";
  public static final String TEXT_1322 = ";" + NL + "//          $wasSet = true;" + NL + "//        }" + NL + "//      }" + NL + "//    }" + NL + "//    if ($wasSet)" + NL + "//    {" + NL + "//      $";
  public static final String TEXT_1323 = " = $";
  public static final String TEXT_1324 = ";" + NL + "//    }" + NL + "//    " + NL + "//    return $wasSet;" + NL + "//  }";
  public static final String TEXT_1325 = NL + "  public function ";
  public static final String TEXT_1326 = "($";
  public static final String TEXT_1327 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  public static final String TEXT_1328 = NL + "    $";
  public static final String TEXT_1329 = " = array();" + NL + "    foreach ($";
  public static final String TEXT_1330 = " as $";
  public static final String TEXT_1331 = ")" + NL + "    {" + NL + "      if (array_search($";
  public static final String TEXT_1332 = ",$";
  public static final String TEXT_1333 = ") !== false)" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      $";
  public static final String TEXT_1334 = "[] = $";
  public static final String TEXT_1335 = ";" + NL + "    }" + NL + NL + "    if (count($";
  public static final String TEXT_1336 = ") != count($";
  public static final String TEXT_1337 = ") || count($";
  public static final String TEXT_1338 = ") < self::";
  public static final String TEXT_1339 = "() || count($";
  public static final String TEXT_1340 = ") > self::";
  public static final String TEXT_1341 = "())" + NL + "    {";
  public static final String TEXT_1342 = NL + "      return $wasSet;" + NL + "    }" + NL + NL + "    $";
  public static final String TEXT_1343 = " = $this->";
  public static final String TEXT_1344 = ";" + NL + "    $this->";
  public static final String TEXT_1345 = " = array();" + NL + "    foreach ($";
  public static final String TEXT_1346 = " as $";
  public static final String TEXT_1347 = ")" + NL + "    {" + NL + "      $this->";
  public static final String TEXT_1348 = "[] = $";
  public static final String TEXT_1349 = ";" + NL + "      $removeIndex = array_search($";
  public static final String TEXT_1350 = ",$";
  public static final String TEXT_1351 = ");" + NL + "      if ($removeIndex !== false)" + NL + "      {" + NL + "        unset($";
  public static final String TEXT_1352 = "[$removeIndex]);" + NL + "        $";
  public static final String TEXT_1353 = " = array_values($";
  public static final String TEXT_1354 = ");" + NL + "      }" + NL + "      else" + NL + "      {" + NL + "        $";
  public static final String TEXT_1355 = "->";
  public static final String TEXT_1356 = "($this);" + NL + "      }" + NL + "    }" + NL + NL + "    foreach ($";
  public static final String TEXT_1357 = " as $";
  public static final String TEXT_1358 = ")" + NL + "    {" + NL + "      $";
  public static final String TEXT_1359 = "->";
  public static final String TEXT_1360 = "($this);" + NL + "    }" + NL + "    $wasSet = true;";
  public static final String TEXT_1361 = NL + "    return $wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1362 = NL + "  public function ";
  public static final String TEXT_1363 = "($";
  public static final String TEXT_1364 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  public static final String TEXT_1365 = NL + "    $";
  public static final String TEXT_1366 = " = array();" + NL + "    foreach ($";
  public static final String TEXT_1367 = " as $";
  public static final String TEXT_1368 = ")" + NL + "    {" + NL + "      if (array_search($";
  public static final String TEXT_1369 = ",$";
  public static final String TEXT_1370 = ") !== false)" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      $";
  public static final String TEXT_1371 = "[] = $";
  public static final String TEXT_1372 = ";" + NL + "    }" + NL + NL + "    if (count($";
  public static final String TEXT_1373 = ") != count($";
  public static final String TEXT_1374 = ") || count($";
  public static final String TEXT_1375 = ") < self::";
  public static final String TEXT_1376 = "())" + NL + "    {";
  public static final String TEXT_1377 = NL + "      return $wasSet;" + NL + "    }" + NL + NL + "    $";
  public static final String TEXT_1378 = " = $this->";
  public static final String TEXT_1379 = ";" + NL + "    $this->";
  public static final String TEXT_1380 = " = array();" + NL + "    foreach ($";
  public static final String TEXT_1381 = " as $";
  public static final String TEXT_1382 = ")" + NL + "    {" + NL + "      $this->";
  public static final String TEXT_1383 = "[] = $";
  public static final String TEXT_1384 = ";" + NL + "      $removeIndex = array_search($";
  public static final String TEXT_1385 = ",$";
  public static final String TEXT_1386 = ");" + NL + "      if ($removeIndex !== false)" + NL + "      {" + NL + "        unset($";
  public static final String TEXT_1387 = "[$removeIndex]);" + NL + "        $";
  public static final String TEXT_1388 = " = array_values($";
  public static final String TEXT_1389 = ");" + NL + "      }" + NL + "      else" + NL + "      {" + NL + "        $";
  public static final String TEXT_1390 = "->";
  public static final String TEXT_1391 = "($this);" + NL + "      }" + NL + "    }" + NL + NL + "    foreach ($";
  public static final String TEXT_1392 = " as $";
  public static final String TEXT_1393 = ")" + NL + "    {" + NL + "      $";
  public static final String TEXT_1394 = "->";
  public static final String TEXT_1395 = "($this);" + NL + "    }" + NL + "    $wasSet = true;";
  public static final String TEXT_1396 = NL + "    return $wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1397 = NL + "  ";
  public static final String TEXT_1398 = " function ";
  public static final String TEXT_1399 = "($";
  public static final String TEXT_1400 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  public static final String TEXT_1401 = NL + "    $";
  public static final String TEXT_1402 = " = array();" + NL + "    foreach ($";
  public static final String TEXT_1403 = " as $";
  public static final String TEXT_1404 = ")" + NL + "    {" + NL + "      if (array_search($";
  public static final String TEXT_1405 = ",$";
  public static final String TEXT_1406 = ") !== false)" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      $";
  public static final String TEXT_1407 = "[] = $";
  public static final String TEXT_1408 = ";" + NL + "    }" + NL + NL + "    if (count($";
  public static final String TEXT_1409 = ") != count($";
  public static final String TEXT_1410 = ") || count($";
  public static final String TEXT_1411 = ") < self::";
  public static final String TEXT_1412 = "()  || count($";
  public static final String TEXT_1413 = ") > self::";
  public static final String TEXT_1414 = "())" + NL + "    {";
  public static final String TEXT_1415 = NL + "      return $wasSet;" + NL + "    }" + NL + NL + "    $this->";
  public static final String TEXT_1416 = " = $";
  public static final String TEXT_1417 = ";" + NL + "    $wasSet = true;";
  public static final String TEXT_1418 = NL + "    return $wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1419 = NL + "  public function ";
  public static final String TEXT_1420 = "($";
  public static final String TEXT_1421 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  public static final String TEXT_1422 = NL + "    if (count($";
  public static final String TEXT_1423 = ") < self::";
  public static final String TEXT_1424 = "()";
  public static final String TEXT_1425 = ")" + NL + "    {";
  public static final String TEXT_1426 = NL + "      return $wasSet;" + NL + "    }" + NL + NL + "    $";
  public static final String TEXT_1427 = " = array();" + NL + "    $";
  public static final String TEXT_1428 = " = array();" + NL + "    foreach ($";
  public static final String TEXT_1429 = " as $";
  public static final String TEXT_1430 = ")" + NL + "    {" + NL + "      if (array_search($";
  public static final String TEXT_1431 = ",$";
  public static final String TEXT_1432 = ") !== false)" + NL + "      {";
  public static final String TEXT_1433 = NL + "        return $wasSet;" + NL + "      }" + NL + "      else if ($";
  public static final String TEXT_1434 = "->";
  public static final String TEXT_1435 = "() != null && $this !== $";
  public static final String TEXT_1436 = "->";
  public static final String TEXT_1437 = "())" + NL + "      {" + NL + "        $";
  public static final String TEXT_1438 = " = $";
  public static final String TEXT_1439 = "->";
  public static final String TEXT_1440 = "();" + NL + "        $";
  public static final String TEXT_1441 = " = serialize($";
  public static final String TEXT_1442 = ");" + NL + "        if (!array_key_exists($";
  public static final String TEXT_1443 = ", $";
  public static final String TEXT_1444 = "))" + NL + "        {" + NL + "          $";
  public static final String TEXT_1445 = "[$";
  public static final String TEXT_1446 = "] = $";
  public static final String TEXT_1447 = "->";
  public static final String TEXT_1448 = "();" + NL + "        }" + NL + "        $nextCount = $";
  public static final String TEXT_1449 = "[$";
  public static final String TEXT_1450 = "] - 1;" + NL + "        if ($nextCount < self::minimum";
  public static final String TEXT_1451 = "())" + NL + "        {";
  public static final String TEXT_1452 = NL + "          return $wasSet;" + NL + "        }" + NL + "        $";
  public static final String TEXT_1453 = "[$";
  public static final String TEXT_1454 = "] = $nextCount;" + NL + "      }" + NL + "      $";
  public static final String TEXT_1455 = "[] = $";
  public static final String TEXT_1456 = ";" + NL + "    }" + NL + NL + "    foreach ($this->";
  public static final String TEXT_1457 = " as $orphan) " + NL + "    {" + NL + "      $wasFound = false;" + NL + "      foreach ($";
  public static final String TEXT_1458 = " as $fosterCare)" + NL + "      {" + NL + "        if ($orphan == $fosterCare)" + NL + "        {" + NL + "          $wasFound = true;" + NL + "          break;" + NL + "        }" + NL + "      }" + NL + "      " + NL + "      if (!$wasFound)" + NL + "      {" + NL + "        $this->";
  public static final String TEXT_1459 = "($orphan, null);" + NL + "      }" + NL + "    }" + NL + NL + "    $this->";
  public static final String TEXT_1460 = " = array();" + NL + "    foreach ($";
  public static final String TEXT_1461 = " as $";
  public static final String TEXT_1462 = ")" + NL + "    {" + NL + "      if ($";
  public static final String TEXT_1463 = "->";
  public static final String TEXT_1464 = "() != null)" + NL + "      {" + NL + "        unset($";
  public static final String TEXT_1465 = "->";
  public static final String TEXT_1466 = "()->";
  public static final String TEXT_1467 = "[$";
  public static final String TEXT_1468 = "->";
  public static final String TEXT_1469 = "()->";
  public static final String TEXT_1470 = "($";
  public static final String TEXT_1471 = ")]);" + NL + "        $";
  public static final String TEXT_1472 = "->";
  public static final String TEXT_1473 = "()->";
  public static final String TEXT_1474 = " = array_values($";
  public static final String TEXT_1475 = "->";
  public static final String TEXT_1476 = "()->";
  public static final String TEXT_1477 = ");" + NL + "      }" + NL + "      $this->";
  public static final String TEXT_1478 = "($";
  public static final String TEXT_1479 = ", $this);" + NL + "      $this->";
  public static final String TEXT_1480 = "[] = $";
  public static final String TEXT_1481 = ";" + NL + "    }" + NL + "    $wasSet = true;";
  public static final String TEXT_1482 = NL + "    return $wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1483 = NL + "  ";
  public static final String TEXT_1484 = " function ";
  public static final String TEXT_1485 = "($";
  public static final String TEXT_1486 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  public static final String TEXT_1487 = NL + "    $";
  public static final String TEXT_1488 = " = array();" + NL + "    foreach ($";
  public static final String TEXT_1489 = " as $";
  public static final String TEXT_1490 = ")" + NL + "    {" + NL + "      if (array_search($";
  public static final String TEXT_1491 = ",$";
  public static final String TEXT_1492 = ") !== false)" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      $";
  public static final String TEXT_1493 = "[] = $";
  public static final String TEXT_1494 = ";" + NL + "    }" + NL + NL + "    if (count($";
  public static final String TEXT_1495 = ") != count($";
  public static final String TEXT_1496 = ") || count($";
  public static final String TEXT_1497 = ") > self::";
  public static final String TEXT_1498 = "())" + NL + "    {";
  public static final String TEXT_1499 = NL + "      return $wasSet;" + NL + "    }" + NL + NL + "    $this->";
  public static final String TEXT_1500 = " = $";
  public static final String TEXT_1501 = ";" + NL + "    $wasSet = true;";
  public static final String TEXT_1502 = NL + "    return $wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1503 = NL + "  ";
  public static final String TEXT_1504 = " function ";
  public static final String TEXT_1505 = "($";
  public static final String TEXT_1506 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  public static final String TEXT_1507 = NL + "    $";
  public static final String TEXT_1508 = " = array();" + NL + "    foreach ($";
  public static final String TEXT_1509 = " as $";
  public static final String TEXT_1510 = ")" + NL + "    {" + NL + "      if (array_search($";
  public static final String TEXT_1511 = ",$";
  public static final String TEXT_1512 = ") !== false)" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      $";
  public static final String TEXT_1513 = "[] = $";
  public static final String TEXT_1514 = ";" + NL + "    }" + NL + NL + "    if (count($";
  public static final String TEXT_1515 = ") != count($";
  public static final String TEXT_1516 = ") || count($";
  public static final String TEXT_1517 = ") < self::";
  public static final String TEXT_1518 = "())" + NL + "    {";
  public static final String TEXT_1519 = NL + "      return $wasSet;" + NL + "    }" + NL + NL + "    $this->";
  public static final String TEXT_1520 = " = $";
  public static final String TEXT_1521 = ";" + NL + "    $wasSet = true;";
  public static final String TEXT_1522 = NL + "    return $wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1523 = NL + "  public function ";
  public static final String TEXT_1524 = "($";
  public static final String TEXT_1525 = ", $index)" + NL + "  {  " + NL + "    $wasAdded = false;" + NL + "    if($this->";
  public static final String TEXT_1526 = "($";
  public static final String TEXT_1527 = "))" + NL + "    {" + NL + "      if($index < 0 ) { $index = 0; }" + NL + "      if($index > $this->";
  public static final String TEXT_1528 = "()) { $index = $this->";
  public static final String TEXT_1529 = "() - 1; }" + NL + "      array_splice($this->";
  public static final String TEXT_1530 = ", $this->";
  public static final String TEXT_1531 = "($";
  public static final String TEXT_1532 = "), 1);" + NL + "      array_splice($this->";
  public static final String TEXT_1533 = ", $index, 0, array($";
  public static final String TEXT_1534 = "));" + NL + "      $wasAdded = true;" + NL + "    }" + NL + "    return $wasAdded;" + NL + "  }" + NL + NL + "  public function ";
  public static final String TEXT_1535 = "($";
  public static final String TEXT_1536 = ", $index)" + NL + "  {" + NL + "    $wasAdded = false;" + NL + "    if($this->";
  public static final String TEXT_1537 = "($";
  public static final String TEXT_1538 = ") !== -1)" + NL + "    {" + NL + "      if($index < 0 ) { $index = 0; }" + NL + "      if($index > $this->";
  public static final String TEXT_1539 = "()) { $index = $this->";
  public static final String TEXT_1540 = "() - 1; }" + NL + "      array_splice($this->";
  public static final String TEXT_1541 = ", $this->";
  public static final String TEXT_1542 = "($";
  public static final String TEXT_1543 = "), 1);" + NL + "      array_splice($this->";
  public static final String TEXT_1544 = ", $index, 0, array($";
  public static final String TEXT_1545 = "));" + NL + "      $wasAdded = true;" + NL + "    } " + NL + "    else " + NL + "    {" + NL + "      $wasAdded = $this->";
  public static final String TEXT_1546 = "($";
  public static final String TEXT_1547 = ", $index);" + NL + "    }" + NL + "    return $wasAdded;" + NL + "  }" + NL;
  public static final String TEXT_1548 = "";
  public static final String TEXT_1549 = NL + "  public function equals($compareTo)" + NL + "  {" + NL + "    if ($compareTo == null) { return false; }" + NL + "    if (get_class($this) != get_class($compareTo)) { return false; }" + NL + NL + "    ";
  public static final String TEXT_1550 = NL + NL + "    return true;" + NL + "  }" + NL + NL + "  public function hashCode()" + NL + "  {" + NL + "    if ($this->cachedHashCode != -1)" + NL + "    {" + NL + "      return $this->cachedHashCode;" + NL + "    }" + NL + "    $this->cachedHashCode = 17;" + NL + "    ";
  public static final String TEXT_1551 = NL + NL + "    ";
  public static final String TEXT_1552 = NL + "    return $this->cachedHashCode;" + NL + "  }" + NL;
  public static final String TEXT_1553 = "";
  public static final String TEXT_1554 = NL + "  public function equals($compareTo)" + NL + "  {" + NL + "    return $this == $compareTo;" + NL + "  }" + NL;
  public static final String TEXT_1555 = "";
  public static final String TEXT_1556 = NL + "    $this->";
  public static final String TEXT_1557 = " = null;";
  public static final String TEXT_1558 = NL + "    $this->";
  public static final String TEXT_1559 = " = array();";
  public static final String TEXT_1560 = NL + "    $";
  public static final String TEXT_1561 = " = $this->";
  public static final String TEXT_1562 = ";" + NL + "    $this->";
  public static final String TEXT_1563 = " = null;" + NL + "    if ($";
  public static final String TEXT_1564 = " != null)" + NL + "    {" + NL + "      $";
  public static final String TEXT_1565 = "->delete();" + NL + "    }";
  public static final String TEXT_1566 = NL + "    " + NL + "    if ($this->";
  public static final String TEXT_1567 = " != null)" + NL + "    {" + NL + "        $this->";
  public static final String TEXT_1568 = "->delete();" + NL + "        $this->";
  public static final String TEXT_1569 = " = null;" + NL + "    }" + NL + "    ";
  public static final String TEXT_1570 = NL + "    while (count($this->";
  public static final String TEXT_1571 = ") > 0)" + NL + "    {" + NL + "      $";
  public static final String TEXT_1572 = " = $this->";
  public static final String TEXT_1573 = "[count($this->";
  public static final String TEXT_1574 = ") - 1];" + NL + "      $";
  public static final String TEXT_1575 = "->delete();" + NL + "      unset($this->";
  public static final String TEXT_1576 = "[$this->";
  public static final String TEXT_1577 = "($";
  public static final String TEXT_1578 = ")]);" + NL + "      $this->";
  public static final String TEXT_1579 = " = array_values($this->";
  public static final String TEXT_1580 = ");" + NL + "    }" + NL + "    ";
  public static final String TEXT_1581 = NL + "    while( count($this->";
  public static final String TEXT_1582 = ") > 0 )" + NL + "    {" + NL + "      $this->";
  public static final String TEXT_1583 = "[0]->";
  public static final String TEXT_1584 = "(null);" + NL + "      unset($this->";
  public static final String TEXT_1585 = "[0]);" + NL + "      $this->";
  public static final String TEXT_1586 = " = array_values($this->";
  public static final String TEXT_1587 = ");" + NL + "    }" + NL + "    unset($this->";
  public static final String TEXT_1588 = ");" + NL + "    $this->";
  public static final String TEXT_1589 = " = array();";
  public static final String TEXT_1590 = NL + "    if ($this->";
  public static final String TEXT_1591 = " != null)" + NL + "    {" + NL + "      if ($this->";
  public static final String TEXT_1592 = "->";
  public static final String TEXT_1593 = "() <= ";
  public static final String TEXT_1594 = ")" + NL + "      {" + NL + "        $this->";
  public static final String TEXT_1595 = "->delete();" + NL + "    $this->";
  public static final String TEXT_1596 = " = null;" + NL + "      }" + NL + "      else" + NL + "      {" + NL + "        $this->";
  public static final String TEXT_1597 = " = null;" + NL + "    $this->";
  public static final String TEXT_1598 = "->";
  public static final String TEXT_1599 = "($this);" + NL + "      }" + NL + "    }";
  public static final String TEXT_1600 = NL + "    if ($this->";
  public static final String TEXT_1601 = " != null)" + NL + "    {" + NL + "      $this->";
  public static final String TEXT_1602 = "->";
  public static final String TEXT_1603 = "(null);" + NL + "    }";
  public static final String TEXT_1604 = NL + "    $";
  public static final String TEXT_1605 = " = $this->";
  public static final String TEXT_1606 = ";" + NL + "    $this->";
  public static final String TEXT_1607 = " = null;" + NL + "    if ($";
  public static final String TEXT_1608 = " != null)" + NL + "    {" + NL + "      $";
  public static final String TEXT_1609 = "->";
  public static final String TEXT_1610 = "(null);" + NL + "    }";
  public static final String TEXT_1611 = NL + "    $";
  public static final String TEXT_1612 = " = $this->";
  public static final String TEXT_1613 = ";" + NL + "    $this->";
  public static final String TEXT_1614 = " = null;" + NL + "    if ($";
  public static final String TEXT_1615 = " != null)" + NL + "    {" + NL + "      $";
  public static final String TEXT_1616 = "->delete();" + NL + "    }";
  public static final String TEXT_1617 = NL + "    if ($this->";
  public static final String TEXT_1618 = " != null)" + NL + "    {" + NL + "      $this->";
  public static final String TEXT_1619 = "->";
  public static final String TEXT_1620 = "($this);" + NL + "    }";
  public static final String TEXT_1621 = NL + "    if ($this->";
  public static final String TEXT_1622 = " != null)" + NL + "    {" + NL + "      $this->";
  public static final String TEXT_1623 = "->delete();" + NL + "    }";
  public static final String TEXT_1624 = NL + "    if ($this->";
  public static final String TEXT_1625 = " != null)" + NL + "    {" + NL + "      if ($this->";
  public static final String TEXT_1626 = "->";
  public static final String TEXT_1627 = "() <= ";
  public static final String TEXT_1628 = ")" + NL + "      {" + NL + "        $this->";
  public static final String TEXT_1629 = "->delete();" + NL + "      }" + NL + "      else" + NL + "      {" + NL + "        $this->";
  public static final String TEXT_1630 = "->";
  public static final String TEXT_1631 = "($this);" + NL + "      }" + NL + "    }";
  public static final String TEXT_1632 = NL + "    $";
  public static final String TEXT_1633 = " = $this->";
  public static final String TEXT_1634 = ";" + NL + "    $this->";
  public static final String TEXT_1635 = " = null;" + NL + "    $";
  public static final String TEXT_1636 = "->";
  public static final String TEXT_1637 = "($this);";
  public static final String TEXT_1638 = NL + "    foreach ($this->";
  public static final String TEXT_1639 = " as $";
  public static final String TEXT_1640 = ")" + NL + "    {" + NL + "      $this->";
  public static final String TEXT_1641 = "($";
  public static final String TEXT_1642 = ",null);" + NL + "    }" + NL + "    $this->";
  public static final String TEXT_1643 = " = array();";
  public static final String TEXT_1644 = NL + "    $";
  public static final String TEXT_1645 = " = $this->";
  public static final String TEXT_1646 = ";" + NL + "    $this->";
  public static final String TEXT_1647 = " = array();" + NL + "    foreach ($";
  public static final String TEXT_1648 = " as $";
  public static final String TEXT_1649 = ")" + NL + "    {" + NL + "      if ($";
  public static final String TEXT_1650 = "->";
  public static final String TEXT_1651 = "() <= ";
  public static final String TEXT_1652 = "::";
  public static final String TEXT_1653 = "())" + NL + "      {" + NL + "        $";
  public static final String TEXT_1654 = "->delete();" + NL + "      }" + NL + "      else" + NL + "      {" + NL + "        $";
  public static final String TEXT_1655 = "->";
  public static final String TEXT_1656 = "($this);" + NL + "      }" + NL + "    }";
  public static final String TEXT_1657 = NL + "    $";
  public static final String TEXT_1658 = " = $this->";
  public static final String TEXT_1659 = ";" + NL + "    $this->";
  public static final String TEXT_1660 = " = array();" + NL + "    foreach ($";
  public static final String TEXT_1661 = " as $";
  public static final String TEXT_1662 = ")" + NL + "    {" + NL + "      $";
  public static final String TEXT_1663 = "->";
  public static final String TEXT_1664 = "($this);" + NL + "    }";
  public static final String TEXT_1665 = NL + "    foreach ($this->";
  public static final String TEXT_1666 = " as $";
  public static final String TEXT_1667 = ")" + NL + "    {" + NL + "      $";
  public static final String TEXT_1668 = "->delete();" + NL + "    }";
  public static final String TEXT_1669 = NL + "    foreach ($this->";
  public static final String TEXT_1670 = " as $";
  public static final String TEXT_1671 = ")" + NL + "    {" + NL + "      $";
  public static final String TEXT_1672 = "->";
  public static final String TEXT_1673 = "(null);" + NL + "    }";
  public static final String TEXT_1674 = "";
  public static final String TEXT_1675 = "";
  public static final String TEXT_1676 = "";
  public static final String TEXT_1677 = NL + "  //------------------------" + NL + "  // DEVELOPER CODE - PROVIDED AS-IS" + NL + "  //------------------------" + NL + "  " + NL + "  ";
  public static final String TEXT_1678 = "";
  public static final String TEXT_1679 = NL + "}" + NL + "?>";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public PhpClassGenerator()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}


  /**
   * Add a newline to the end of the input
   */
  // line 38 "../../../../../UmpleTLTemplates/phpClassGenerator.ump"
   private void appendln(StringBuilder buffer, String input, Object... variables){
    append(buffer, input + "\n", variables);
  }


  /**
   * This method will be used to append formatted strings
   * i.e. format("Hello {0} {1}", "andrew","forward");
   */
  // line 45 "../../../../../UmpleTLTemplates/phpClassGenerator.ump"
   private void append(StringBuilder buffer, String input, Object... variables){
    buffer.append(StringFormatter.format(input,variables));
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _getCode(Integer numSpaces, StringBuilder sb, UmpleModel model, UmpleElement uElement){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    /*phpClassGenerator*/
    
  UmpleClass uClass = (UmpleClass) uElement;
  GeneratedClass gClass = uClass.getGeneratedClass();
  PhpGenerator gen = new PhpGenerator();
  GeneratorHelper.generator = gen;
  gen.setModel(model);

  HashMap<String,String> codeInjectionMap = new HashMap<String,String>();
  for (CodeInjection inject : uClass.getCodeInjections())
  {
    String operation = StringFormatter.toUnderscore(inject.getOperation());
    String key = inject.getType() + ":" + operation;
    String newCodeToInject = "";
    String injectCode = inject.getConstraintTree()==null?inject.getCode():inject.getConstraintCode(gen);
    if (codeInjectionMap.containsKey(key))
    {
      newCodeToInject = StringFormatter.format("{0}\n    {1}",codeInjectionMap.get(key),injectCode);
    }
    else
    {
      newCodeToInject = injectCode;
    }
    codeInjectionMap.put(key,newCodeToInject);
  }

  boolean isFirst = true;


    realSb.append(TEXT_0);
    /*UmpleNotice*/
    realSb.append(TEXT_1);
    realSb.append(TEXT_2);
     if (uClass.numberOfComments() > 0) { if (!uClass.getComments().get(0).getIsInline()) {append(realSb, "\n{0}", Comment.format("Multiline",uClass.getComments(),false));} else {append(realSb, "\n{0}", Comment.format("Slashes",uClass.getComments(),false)); } } 
    realSb.append(TEXT_3);
     append(realSb, System.lineSeparator()); 
    realSb.append(TEXT_4);
     if (uClass.getIsAbstract()) { append(realSb, "{0} ", "abstract"); } 
    realSb.append(TEXT_5);
    realSb.append(uClass.getName());
    realSb.append(gen.translate("isA",uClass));
    realSb.append(TEXT_6);
    /*members_AllStatics*/
    
{
  isFirst = true;
  for(Attribute av : uClass.getAttributes())
  {
  
    if (!av.isConstant() && !av.getIsAutounique() && !av.getIsUnique())
    {
      continue;
    }

    if (isFirst)
    {
      appendln(realSb, "");
      appendln(realSb, "");
      appendln(realSb, "  //------------------------");
      appendln(realSb, "  // STATIC VARIABLES");
      appendln(realSb, "  //------------------------");
      isFirst = false;
    }
  
    if (av.isConstant())
    {
      appendln(realSb, "");
      if(av.getIsList())
      {
        append(realSb, "  public static ${0} = array({1});", av.getName(), gen.translate("parameterValue",av));
      }
      else
      {
        append(realSb, "  public static ${0} = {1};", av.getName(), gen.translate("parameterValue",av));
      }
      
    }
    else if (av.getIsAutounique())
    {
      String defaultValue = av.getValue() == null ? "1" : av.getValue();
      appendln(realSb, "");
      append(realSb, "  private static $next{0} = {1};", av.getUpperCaseName(), defaultValue);
    }
    else if (av.getIsUnique())
    {
      appendln(realSb, "");
      append(realSb, "  private static ${0} = array();", gen.translate("uniqueMap", av));
    }
  }
  
  if (uClass.getIsSingleton())
  {
    if (isFirst)
    {
      appendln(realSb, "");
      appendln(realSb, "");
      appendln(realSb, "  //------------------------");
      appendln(realSb, "  // STATIC VARIABLES");
      appendln(realSb, "  //------------------------");
      isFirst = false;
    }
    appendln(realSb, "");
    append(realSb, "  private static $theInstance = null;");
  }
}

    /*members_AllAttributes*/
    
{

  appendln(realSb, "");
  appendln(realSb, "");
  appendln(realSb, "  //------------------------");
  appendln(realSb, "  // MEMBER VARIABLES");
  append(realSb, "  //------------------------");

  isFirst = true;
  for(Attribute av : uClass.getAttributes())
  {
    if (av.isConstant() || av.getIsAutounique() || av.getIsDerived())
    {
      continue;
    }
    if (isFirst)
    {
      appendln(realSb, "");
      appendln(realSb, "");
      append(realSb,"  //{0} Attributes", uClass.getName());
      isFirst = false;
    }
    
    String attribute = gen.translate("attributeOne",av);
    if (av.getIsList())
    {
      attribute = gen.translate("attributeMany",av);
    }

    appendln(realSb, "");
    
    if (av.numberOfComments() > 0) { append(realSb, "\n  {0}\n", Comment.format("Attribute Javadoc", av.getComments(),false)); }
    
    append(realSb, "  private ${0};", attribute);
  }
  
  isFirst = true;
  for(Attribute av : uClass.getAttributes())
  {
    if (!av.getIsAutounique())
    {
      continue;
    }
    if (isFirst)
    {
      appendln(realSb, "");
      appendln(realSb, "");
      append(realSb,"  //Autounique Attributes");
      isFirst = false;
    }
    appendln(realSb, "");
    String lookup = av.getIsList() ? "attributeMany" : "attributeOne";
    append(realSb, "  private ${0};", gen.translate(lookup,av));
  }
}

    /*members_AllStateMachines*/
    
{
  isFirst = true;
  for(StateMachine sm : uClass.getStateMachines())
  {
    List<StateMachine> allNested = sm.getNestedStateMachines();

    if (isFirst)
    {
      appendln(realSb, "");
      appendln(realSb, "");
      append(realSb,"  //{0} State Machines", uClass.getName());
      isFirst = false;
    }
    else
    {
      appendln(realSb,"");
    }
  
    int stateCounter = 0;
    for(State state : sm.getStates())
    {
      if (stateCounter >= 0)
      {
        appendln(realSb,"");
      }
      stateCounter += 1;
      append(realSb, "  private static ${0} = {1};", gen.translate("stateOne",state), stateCounter);
    }

    for (StateMachine nestedSm : allNested)
    {
      for(State state : nestedSm.getStates())
      {
        if (stateCounter >= 0)
        {
          appendln(realSb,"");
        }
        stateCounter += 1;
        append(realSb, "  private static ${0} = {1};", gen.translate("stateOne",state), stateCounter);
      }
    }
    
    append(realSb, "\n  private ${0};", gen.translate("stateMachineOne", sm));
    for (StateMachine nestedSm : allNested)
    {
      append(realSb, "\n  private ${0};", gen.translate("stateMachineOne", nestedSm));
    }

  }
}

    /*members_AllDoActivities*/
    
{
  isFirst = true;
  for(StateMachine sm : uClass.getAllStateMachines())
  {
    
    for (State state : sm.getStates())
    {
      for (Activity activity : state.getActivities())
      {
        if (isFirst)
        {
          appendln(realSb, "");
          appendln(realSb, "");
          append(realSb,"  //{0} Do Activity Threads", uClass.getName());
          isFirst = false;
        }
        append(realSb, "\n  private ${0} = null;", gen.translate("doActivityThread",activity));
      }
    }
  }
}

    /*members_AllAssociations*/
    
{
  isFirst = true;
  for (AssociationVariable av : uClass.getAssociationVariables())
  {
    if (!av.getIsNavigable())
    {
      continue;
    }
    
    if (isFirst)
    {
      appendln(realSb, "");
      appendln(realSb, "");
      append(realSb,"  //{0} Associations", uClass.getName());
      isFirst = false;
    }
  
    appendln(realSb, "");
    String lookup = av.isOne() ? "associationOne" : "associationMany";
    
    if (av.numberOfComments() > 0) { append(realSb, "\n  {0}\n", Comment.format("Association Javadoc", av.getComments()),false); }
    
    if (av.isOptionalOne() && av.getRelatedAssociation().isMandatory() && !av.isImmutable())
    {
      append(realSb, "  public ${0}; //until PHP 5.3 (setAccessible)", gen.translate(lookup,av));
    }
    else
    {
      append(realSb, "  private ${0};", gen.translate(lookup,av));
    }
  }
}

    /*members_AllHelpers*/
    
{

  isFirst = true;
  if (uClass.getKey().isProvided())
  {
    isFirst = false;
    appendln(realSb, "");
    appendln(realSb, "");
    appendln(realSb,"  //Helper Variables");
    append(realSb, "  private $cachedHashCode;");
  }

  for (Attribute av : uClass.getAttributes())
  {
    if (av.isImmutable() && av.isIsLazy())
    {
      if (isFirst)
      {
        isFirst = false;
        appendln(realSb, "");
        appendln(realSb, "");
        appendln(realSb,"  //Helper Variables");
      }
      else
      {
        appendln(realSb, "");
      }
      append(realSb, "  private ${0};", gen.translate("attributeCanSet",av));
    }
  }
  
  for (AssociationVariable av : uClass.getAssociationVariables())
  {
    if (!av.getIsNavigable())
    {
      continue;
    }
    if (av.isImmutable())
    {
      if (isFirst)
      {
        isFirst = false;
        appendln(realSb, "");
        appendln(realSb, "");
        appendln(realSb,"  //Helper Variables");
      } 
      else
      {
        appendln(realSb, "");
      }
      append(realSb, "  private ${0};", gen.translate("associationCanSet",av));
    }
  }
  
  for(String memberId : uClass.getKey().getMembers())
  {
    Attribute av = uClass.getAttribute(memberId);
    AssociationVariable as = uClass.getAssociationVariable(memberId);
    if (av != null  && !av.isImmutable())
    {
      appendln(realSb, "");
      append(realSb, "  private ${0};", gen.translate("attributeCanSet",av));
    }
    else if (as != null)
    {
      appendln(realSb, "");
      append(realSb, "  private ${0};", gen.translate("associationCanSet",as));
    }
  }
}

    realSb.append(TEXT_7);
    /*constructor_Declare_All*/
    
  boolean isOneToOne = false;
  String instanceIdentifier = "this";
  for (AssociationVariable av : uClass.getAssociationVariables()) 
  {
    AssociationVariable relatedAssocation = av.getRelatedAssociation();
    if (av.isOnlyOne() && relatedAssocation.isOnlyOne() && av.getIsNavigable() && relatedAssocation.getIsNavigable())
    {
      isOneToOne = true;
      break;
    }
  }
  
    /*constructor_DeclareDefault*/
    

  String customConstructorPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before","constructor"));
  String customConstructorPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after","constructor"));

  appendln(realSb, "");

  String constructorLookup = isOneToOne ? "constructorSignature_nulled" : "constructorSignature";
  String accessibility = uClass.getIsSingleton() ? "private" : "public";
  append(realSb,"  {0} function __construct({1})",accessibility, gClass.getLookup(constructorLookup));

  appendln(realSb, "");
  
  boolean hasBody = false;
  
  append(realSb, "  {");
  
  if (isOneToOne)
  {
    appendln(realSb,"");
    appendln(realSb,"    if (func_num_args() == 0) { return; }");
  }
  
  if (!uClass.isRoot() && !"interface".equals(uClass.getExtendsClass().getModifier()))
  {
    appendln(realSb, "");
    append(realSb, "    parent::__construct({0});", gClass.getParentClass().getLookup("constructorSignature_caller"));
    hasBody = true;
  }

  if (customConstructorPrefixCode != null)
  {
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customConstructorPrefixCode, "    "));
    hasBody = true;
  }
  
  if (uClass.getKey().isProvided())
  {
    hasBody = true;
    appendln(realSb, "");
    append(realSb, "    $this->cachedHashCode = -1;");
  }
  
  for(String memberId : uClass.getKey().getMembers())
  {
    Attribute av = uClass.getAttribute(memberId);
    AssociationVariable as = uClass.getAssociationVariable(memberId);
    if (av != null  && !av.isImmutable())
    {
      hasBody = true;
      appendln(realSb, "");
      append(realSb, "    $this->{0} = true;", gen.translate("attributeCanSet",av));
    }
    else if (as != null)
    {
      hasBody = true;
      appendln(realSb, "");
      append(realSb, "    $this->{0} = true;", gen.translate("associationCanSet",as));
    }
  }
  
  for (Attribute av : uClass.getAttributes())
  {
    if (av.getIsAutounique() || av.getIsUnique() || av.isConstant() || "theInstance".equals(gen.translate("attributeOne",av)) || av.getIsDerived())
    {
      continue;
    }
    
    if (av.getIsList())
    {
      hasBody = true;
      
    /*constructor_AttributeAssignList*/
    realSb.append(TEXT_8);
    realSb.append(instanceIdentifier);
    realSb.append(TEXT_9);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_10);
    
    if (av.getValue() != null && av.getValue() != "") { 
      String[] values = av.getValue().split(",");
      if (values[0] != av.getValue()) {
        for (int i = 0; i < values.length; i++) { 
          String addingComma = (i == values.length-1) ? "" : ",";
          String value = values[i].replaceAll("(?<!new)\\s+","");
    realSb.append(value);
    realSb.append(addingComma);
    }}}
    realSb.append(TEXT_11);
    
    }
    else if ("defaulted".equals(av.getModifier()))
    {
      hasBody = true;
      
    /*constructor_AttributeAssignDefaulted*/
    realSb.append(TEXT_12);
    realSb.append(gen.translate("resetMethod",av));
    realSb.append(TEXT_13);
     
    }
    else if (av.isImmutable() && av.getIsLazy())
    {
      hasBody = true;
      
    /*constructor_AttributeUnassignedImmutable*/
    realSb.append(TEXT_14);
    realSb.append(gen.translate("attributeCanSet",av));
    realSb.append(TEXT_15);
    
    }
    else if (av.isImmutable())
    {
      hasBody = true;
      
    /*constructor_AttributeAssignImmutable*/
    
  String parameterValue = "";
  if (av.getValue() == null)
  {
    parameterValue = "$" + gen.translate("parameterOne",av);
  }
  else
  {
    parameterValue = gen.translate("parameterValue",av);
  }

    realSb.append(TEXT_16);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_17);
    realSb.append(parameterValue);
    realSb.append(TEXT_18);
     
    }
    else
    {
      hasBody = true;
      if(!av.getIsLazy()){
         
    /*constructor_AttributeAssign*/
    
  String assignValue = av.getValue() == null || av.getModifier().equals("fixml") ? "$" + gen.translate("parameterOne",av) : gen.translate("parameterValue",av);

    realSb.append(TEXT_19);
    realSb.append(instanceIdentifier);
    realSb.append(TEXT_20);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_21);
    realSb.append(assignValue);
    realSb.append(TEXT_22);
    
      }
      else
      {
         
    /*constructor_AttributeAssignLazy*/
    
  String parameterLookup = null; // av.getValue() == null ? "parameterOne" : "parameterValue";
  String defaultValue = null;
  
 
  if(av.getValue() == null)
  {
     // Try to assign a null value or 0 value if we recognize
     // one of Umple's built in data types. (http://cruise.site.uottawa.ca/umple/UmpleBuiltinDataTypes.html)

     if(av.getType().equals("String") || av.getType().equals("Date") || av.getType().equals("Time"))
     {
  	   defaultValue = "NULL";
     }
     else if(av.getType().equals("Double") || av.getType().equals("Float") || av.getType().equals("Integer"))
     {
  	   defaultValue = "0";
     }
     else if(av.getType().equals("Boolean"))
     {
  	   defaultValue = "false";
     }
   }
   else
   {
       defaultValue = gen.translate("parameterValue",av);
   }
  
  // Only assign a value if we could find a default
  if(defaultValue != null)
  { 
    realSb.append(TEXT_23);
    realSb.append(instanceIdentifier);
    realSb.append(TEXT_24);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_25);
    realSb.append(defaultValue);
    realSb.append(TEXT_26);
    } 
    
      }
    }
  }

  for (Attribute av : uClass.getAttributes())
  {
    if (av.getIsAutounique())
    {
      hasBody = true;
      
    /*constructor_AttributeAssignAutounique*/
    realSb.append(TEXT_27);
    realSb.append(instanceIdentifier);
    realSb.append(TEXT_28);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_29);
    realSb.append(gen.translate("parameterNext",av));
    realSb.append(TEXT_30);
    
    }
    else if (av.getIsUnique())
    {
      hasBody = true;
      
    /*constructor_AttributeAssignUnique*/
    realSb.append(TEXT_31);
    realSb.append(gen.translate("setMethod", av));
    realSb.append(TEXT_32);
    realSb.append(gen.translate("parameterOne", av));
    realSb.append(TEXT_33);
    realSb.append(av.getName());
    realSb.append(TEXT_34);
    
    }
  }
  
  for (AssociationVariable av : uClass.getAssociationVariables())
  {
  	if (!av.getIsNavigable() || !av.isImmutable())
  	{
  	  continue;
  	}
    append(realSb, "\n    ${0}->{1} = true;", instanceIdentifier, gen.translate("associationCanSet",av));
  }
  
  for (AssociationVariable av : uClass.getAssociationVariables()) 
  {
    AssociationVariable relatedAssociation = av.getRelatedAssociation();
    
    if (!av.getIsNavigable())
    {
      continue;
    }
    
    if (!relatedAssociation.getIsNavigable())
    {
      if (av.isOnlyOne())
      {
        hasBody = true;
        
    /*constructor_AssociationAssignUndirectionalOne*/
    realSb.append(TEXT_35);
    realSb.append(instanceIdentifier);
    realSb.append(TEXT_36);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_37);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_38);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_39);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_40);
    
      }
      else if (av.isOptionalOne() && av.isImmutable())
      {
        hasBody = true;
        
    /*constructor_AssociationAssignImmutableOptionalOne*/
       
    append(realSb, "\n    ${0}->{1}(${2});", instanceIdentifier, gen.translate("setMethod",av), gen.translate("parameterOne",av));

    
      }
      else if (av.isMandatoryMany())
      {
        hasBody = true;
        
    /*constructor_AssociationAssignMandatoryMany*/
    
  String requiredNumber = "";
  if (av.isN())
  {
    requiredNumber += av.getMultiplicity().getLowerBound();
  }
  else if (av.isStar())
  {
    requiredNumber = StringFormatter.format("at least {0}", av.getMultiplicity().getLowerBound());
  }
  else
  {
    requiredNumber = StringFormatter.format("{0} to {1}", av.getMultiplicity().getLowerBound(), av.getMultiplicity().getUpperBound());
  }
  

    realSb.append(TEXT_41);
    realSb.append(instanceIdentifier);
    realSb.append(TEXT_42);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_43);
    realSb.append(gen.translate("didAddMany",av));
    realSb.append(TEXT_44);
    realSb.append(instanceIdentifier);
    realSb.append(TEXT_45);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_46);
    realSb.append(gen.translate("parameterAll",av));
    realSb.append(TEXT_47);
    realSb.append(gen.translate("didAddMany",av));
    realSb.append(TEXT_48);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_49);
    realSb.append(requiredNumber);
    realSb.append(TEXT_50);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_51);
    
      }
      else if (av.isOptionalN() && av.isImmutable())
      {
        hasBody = true;
        
    /*constructor_AssociationAssignImmutableOptionalN*/
     String requiredNumber = StringFormatter.format("{0}", av.getMultiplicity().getUpperBound()); 
    realSb.append(TEXT_52);
    realSb.append(instanceIdentifier);
    realSb.append(TEXT_53);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_54);
    realSb.append(gen.translate("didAddMany",av));
    realSb.append(TEXT_55);
    realSb.append(instanceIdentifier);
    realSb.append(TEXT_56);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_57);
    realSb.append(gen.translate("parameterAll",av));
    realSb.append(TEXT_58);
    realSb.append(gen.translate("didAddMany",av));
    realSb.append(TEXT_59);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_60);
    realSb.append(requiredNumber);
    realSb.append(TEXT_61);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_62);
    
      }
      else if (av.isMany() && av.isImmutable())
      {
      	hasBody = true;
        
    /*constructor_AssociationAssignImmutableOptionalMany*/
    realSb.append(TEXT_63);
    realSb.append(instanceIdentifier);
    realSb.append(TEXT_64);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_65);
    realSb.append(gen.translate("didAddMany",av));
    realSb.append(TEXT_66);
    realSb.append(instanceIdentifier);
    realSb.append(TEXT_67);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_68);
    realSb.append(gen.translate("parameterAll",av));
    realSb.append(TEXT_69);
    realSb.append(gen.translate("didAddMany",av));
    realSb.append(TEXT_70);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_71);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_72);
    
      }
      else if (av.isMany())
      {
        hasBody = true;
        
    /*constructor_AssociationAssignOptionalMany*/
    realSb.append(TEXT_73);
    realSb.append(instanceIdentifier);
    realSb.append(TEXT_74);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_75);
    
      }
      continue;
    }
    
    if (av.isOnlyOne() && relatedAssociation.isOnlyOne())
    {
      hasBody = true;
      
    /*constructor_AssociationAssignOneToOne*/
    realSb.append(TEXT_76);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_77);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_78);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_79);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_80);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_81);
    realSb.append(instanceIdentifier);
    realSb.append(TEXT_82);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_83);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_84);
    
    }
    else if ((av.isMN() || av.isN()) && (relatedAssociation.isMandatory() || relatedAssociation.isOptionalN()))
    {
      hasBody = true;
      
    /*constructor_AssociationAssignOptionalMany*/
    realSb.append(TEXT_73);
    realSb.append(instanceIdentifier);
    realSb.append(TEXT_74);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_75);
    
    }
    else if (av.isOnlyOne())
    {
      hasBody = true;
      
    /*constructor_AssociationAssignOne*/
    realSb.append(TEXT_85);
    realSb.append(gen.translate("didAdd",av));
    realSb.append(TEXT_86);
    realSb.append(instanceIdentifier);
    realSb.append(TEXT_87);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_88);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_89);
    realSb.append(gen.translate("didAdd",av));
    realSb.append(TEXT_90);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_91);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_92);
    
    }
    else
    {
      
    /*constructor_AssociationAssignDefault*/
    
  if (!av.getIsNavigable())
  {
    continue;
  }

  if (av.isOptionalMany())
  {
    appendln(realSb,"");
    append(realSb, "    $this->{0} = array();", gen.translate("associationMany",av));
  }
  else if (av.isMandatoryMany())
  {
    
    /*constructor_AssociationAssignMandatoryMany*/
    
  String requiredNumber = "";
  if (av.isN())
  {
    requiredNumber += av.getMultiplicity().getLowerBound();
  }
  else if (av.isStar())
  {
    requiredNumber = StringFormatter.format("at least {0}", av.getMultiplicity().getLowerBound());
  }
  else
  {
    requiredNumber = StringFormatter.format("{0} to {1}", av.getMultiplicity().getLowerBound(), av.getMultiplicity().getUpperBound());
  }
  

    realSb.append(TEXT_41);
    realSb.append(instanceIdentifier);
    realSb.append(TEXT_42);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_43);
    realSb.append(gen.translate("didAddMany",av));
    realSb.append(TEXT_44);
    realSb.append(instanceIdentifier);
    realSb.append(TEXT_45);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_46);
    realSb.append(gen.translate("parameterAll",av));
    realSb.append(TEXT_47);
    realSb.append(gen.translate("didAddMany",av));
    realSb.append(TEXT_48);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_49);
    realSb.append(requiredNumber);
    realSb.append(TEXT_50);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_51);
    
  }
  else if (av.getMultiplicity().getLowerBound() > 0)
  {
    
    realSb.append(TEXT_93);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_94);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_95);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_96);
    
  } 
  else
  {
    continue;
  }
  hasBody = true;

    
    }
  }
  
  for(StateMachine sm : uClass.getStateMachines())
  {
    State state = sm.getStartState();
    if (state == null)
    {
      continue;
    }
    hasBody = true;
    for (StateMachine nestedSm : sm.getNestedStateMachines())
    {
      
    /*constructor_NestedStateMachineAssignDefault*/
    realSb.append(TEXT_97);
    realSb.append(gen.translate("setMethod",nestedSm));
    realSb.append(TEXT_98);
    realSb.append(gen.translate("stateNull",nestedSm));
    realSb.append(TEXT_99);
    
    }
    
    /*constructor_StateMachineAssignDefault*/
    realSb.append(TEXT_100);
    realSb.append(gen.translate("setMethod",sm));
    realSb.append(TEXT_101);
    realSb.append(gen.translate("stateOne",state));
    realSb.append(TEXT_102);
    
  }  

  if (customConstructorPostfixCode != null)
  {
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customConstructorPostfixCode, "    "));
    hasBody = true;
  }

  if (hasBody)
  {
    appendln(realSb, "");
    append(realSb, "  }");
  }
  else
  {
    append(realSb, "}");
  }

  //=========== fixml attribute (create empty constructor)
  boolean fixmlAttr = false;
  boolean emptyConstructor = false;
  
  for (Attribute av : uClass.getAttributes())
	  if ("fixml".equals(av.getModifier()))
	  {
		  fixmlAttr = true;
		  break;
	  }

  for( CodeInjection ci  : uClass.getCodeInjections())
	  if( ci.getOperation().equals("emptyConstructor"))
	  {
		  emptyConstructor = true;
		  break;
	  }
  
  for (Attribute av : uClass.getAttributes())
  {
	  if ("fixml".equals(av.getModifier()))
	  {
		  accessibility = uClass.getIsSingleton() ? "private" : "public";
		  append(realSb,"\n\n  {0} function __construct()",accessibility);
		  appendln(realSb, "");
		  append(realSb, "  {\n");
		  for (Attribute a : uClass.getAttributes())
			  if ("fixml".equals(a.getModifier()) && a.getValue() != null )
				  append(realSb, "    $this->{0} = {1};\n", a.getName(),a.getValue());
		  for( CodeInjection ci  : uClass.getCodeInjections())
			  if( ci.getOperation().equals("emptyConstructor"))
				  appendln(realSb,"    {0}",ci.getCode());
		  appendln(realSb,"  }");
		  break;
	  }
  }
  
  if( fixmlAttr == false && emptyConstructor == true )
  {
	  accessibility = uClass.getIsSingleton() ? "private" : "public";
	  append(realSb,"\n\n  {0} function __construct()",accessibility);
	  appendln(realSb, "");
	  append(realSb, "  {\n");
	  for( CodeInjection ci  : uClass.getCodeInjections())
		  if( ci.getOperation().equals("emptyConstructor"))
			  appendln(realSb,"    {0}",ci.getCode());
	  appendln(realSb,"  }");
  }
  
  if (uClass.getIsSingleton())
  {
    appendln(realSb, "");
    
    /*constructor_Singleton*/
    realSb.append(TEXT_103);
    realSb.append(uClass.getName());
    realSb.append(TEXT_104);
    
  }

    
  if (isOneToOne)
  {
    instanceIdentifier = "thisInstance";
    
    /*constructor_DeclareOneToOne*/
    
  String signature = gClass.getLookup("constructorSignature_mandatory");

    realSb.append(TEXT_105);
    realSb.append(gen.translate("constructorMandatory",uClass));
    realSb.append(TEXT_106);
    realSb.append(instanceIdentifier);
    realSb.append(TEXT_107);
    realSb.append(uClass.getName());
    realSb.append(TEXT_108);
    
  if (!uClass.isRoot())
  {
    appendln(realSb, "");
    append(realSb, "    ${0}->__construct({1});", instanceIdentifier , gClass.getParentClass().getLookup("constructorSignature_caller"));
  }
  
  for (Attribute av : uClass.getAttributes())
  {
    if (av.getIsAutounique() || av.isConstant() || "theInstance".equals(gen.translate("attributeOne",av)))
    {
      continue;
    }
  
    if (av.getIsList())
    {
      
    /*constructor_AttributeAssignList*/
    realSb.append(TEXT_8);
    realSb.append(instanceIdentifier);
    realSb.append(TEXT_9);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_10);
    
    if (av.getValue() != null && av.getValue() != "") { 
      String[] values = av.getValue().split(",");
      if (values[0] != av.getValue()) {
        for (int i = 0; i < values.length; i++) { 
          String addingComma = (i == values.length-1) ? "" : ",";
          String value = values[i].replaceAll("(?<!new)\\s+","");
    realSb.append(value);
    realSb.append(addingComma);
    }}}
    realSb.append(TEXT_11);
    
    }
    else if (av.getModifier().equals("defaulted"))
    {
      
    /*constructor_AttributeAssignDefaulted*/
    realSb.append(TEXT_12);
    realSb.append(gen.translate("resetMethod",av));
    realSb.append(TEXT_13);
     
    }
    else if (av.getIsLazy())
    {
      hasBody = true;
      
    /*constructor_AttributeAssignLazy*/
    
  String parameterLookup = null; // av.getValue() == null ? "parameterOne" : "parameterValue";
  String defaultValue = null;
  
 
  if(av.getValue() == null)
  {
     // Try to assign a null value or 0 value if we recognize
     // one of Umple's built in data types. (http://cruise.site.uottawa.ca/umple/UmpleBuiltinDataTypes.html)

     if(av.getType().equals("String") || av.getType().equals("Date") || av.getType().equals("Time"))
     {
  	   defaultValue = "NULL";
     }
     else if(av.getType().equals("Double") || av.getType().equals("Float") || av.getType().equals("Integer"))
     {
  	   defaultValue = "0";
     }
     else if(av.getType().equals("Boolean"))
     {
  	   defaultValue = "false";
     }
   }
   else
   {
       defaultValue = gen.translate("parameterValue",av);
   }
  
  // Only assign a value if we could find a default
  if(defaultValue != null)
  { 
    realSb.append(TEXT_23);
    realSb.append(instanceIdentifier);
    realSb.append(TEXT_24);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_25);
    realSb.append(defaultValue);
    realSb.append(TEXT_26);
    } 
    
    }
    else if(av.getIsUnique())
    {
      hasBody = true;
      
    /*constructor_AttributeAssignUnique*/
    realSb.append(TEXT_31);
    realSb.append(gen.translate("setMethod", av));
    realSb.append(TEXT_32);
    realSb.append(gen.translate("parameterOne", av));
    realSb.append(TEXT_33);
    realSb.append(av.getName());
    realSb.append(TEXT_34);
    
    }
    else
    {
      
    /*constructor_AttributeAssign*/
    
  String assignValue = av.getValue() == null || av.getModifier().equals("fixml") ? "$" + gen.translate("parameterOne",av) : gen.translate("parameterValue",av);

    realSb.append(TEXT_19);
    realSb.append(instanceIdentifier);
    realSb.append(TEXT_20);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_21);
    realSb.append(assignValue);
    realSb.append(TEXT_22);
    
    }
  }

  for (Attribute av : uClass.getAttributes())
  {
    if (av.getIsAutounique())
    {
      hasBody = true;
      
    /*constructor_AttributeAssignAutounique*/
    realSb.append(TEXT_27);
    realSb.append(instanceIdentifier);
    realSb.append(TEXT_28);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_29);
    realSb.append(gen.translate("parameterNext",av));
    realSb.append(TEXT_30);
    
    }
  }
  
  for (AssociationVariable av : uClass.getAssociationVariables()) 
  {
    AssociationVariable relatedAssociation = av.getRelatedAssociation();
    
    if (av.isOnlyOne() && relatedAssociation.isOnlyOne())
    {
      hasBody = true;
      
    /*constructor_AssociationCreateOneToOne*/
    realSb.append(TEXT_109);
    realSb.append(instanceIdentifier);
    realSb.append(TEXT_110);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_111);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_112);
    realSb.append(gen.translate("callerArgumentsForMandatory",relatedAssociation));
    realSb.append(TEXT_113);
    
    }
    else
    {
      hasBody = true;
      
    /*constructor_AssociationAssignDefault*/
    
  if (!av.getIsNavigable())
  {
    continue;
  }

  if (av.isOptionalMany())
  {
    appendln(realSb,"");
    append(realSb, "    $this->{0} = array();", gen.translate("associationMany",av));
  }
  else if (av.isMandatoryMany())
  {
    
    /*constructor_AssociationAssignMandatoryMany*/
    
  String requiredNumber = "";
  if (av.isN())
  {
    requiredNumber += av.getMultiplicity().getLowerBound();
  }
  else if (av.isStar())
  {
    requiredNumber = StringFormatter.format("at least {0}", av.getMultiplicity().getLowerBound());
  }
  else
  {
    requiredNumber = StringFormatter.format("{0} to {1}", av.getMultiplicity().getLowerBound(), av.getMultiplicity().getUpperBound());
  }
  

    realSb.append(TEXT_41);
    realSb.append(instanceIdentifier);
    realSb.append(TEXT_42);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_43);
    realSb.append(gen.translate("didAddMany",av));
    realSb.append(TEXT_44);
    realSb.append(instanceIdentifier);
    realSb.append(TEXT_45);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_46);
    realSb.append(gen.translate("parameterAll",av));
    realSb.append(TEXT_47);
    realSb.append(gen.translate("didAddMany",av));
    realSb.append(TEXT_48);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_49);
    realSb.append(requiredNumber);
    realSb.append(TEXT_50);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_51);
    
  }
  else if (av.getMultiplicity().getLowerBound() > 0)
  {
    
    realSb.append(TEXT_93);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_94);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_95);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_96);
    
  } 
  else
  {
    continue;
  }
  hasBody = true;

    
    }
  }
  
  appendln(realSb, "");
  appendln(realSb, "    return ${0};",instanceIdentifier);
  append(realSb, "  }");
  
  if (!uClass.isRoot())
  {
    
    /*constructor_CallParentConstructor*/
    realSb.append(TEXT_114);
    realSb.append(gClass.getParentClass().getLookup("constructorSignature"));
    realSb.append(TEXT_115);
    realSb.append(gClass.getParentClass().getLookup("constructorSignature_caller"));
    realSb.append(TEXT_116);
    
  }

    
  }


    realSb.append(TEXT_117);
    /*attribute_Set_All*/
    
  // GENERIC FILE - EDIT IN UmpleToTemplate project, then run "ant -f build.codegen.xml to move into the appropriate projects
  for (Attribute av : uClass.getAttributes())
  {
    if (av.isConstant() || av.getIsAutounique() || "internal".equals(av.getModifier()) || av.getIsDerived())
    {
      continue;
    }

    gen.setParameterConstraintName(av.getName());    
    
    List<TraceItem> traceItems = av.getTraced("setMethod", uClass);
    

    String customSetPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("setMethod",av)));
    String customSetPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("setMethod",av)));

    String customResetPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("resetMethod",av)));
    String customResetPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("resetMethod",av)));

    String customAddPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("addMethod",av)));
    String customAddPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("addMethod",av)));
  
    String customRemovePrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("removeMethod",av)));
    String customRemovePostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("removeMethod",av)));
    
    if (av.isImmutable())
    {
      if (av.getIsLazy())
      {
        
    /*attribute_SetImmutable*/
    realSb.append(TEXT_118);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_119);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_120);
     if (customSetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_121);
    realSb.append(gen.translate("attributeCanSet",av));
    realSb.append(TEXT_122);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_123);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_124);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_125);
    
      }
    }
    else if (av.getModifier().equals("defaulted"))
    {
      
    /*attribute_SetDefaulted*/
    realSb.append(TEXT_126);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_127);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_128);
     if (customSetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_129);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_130);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_131);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_132);
    realSb.append(gen.translate("resetMethod",av));
    realSb.append(TEXT_133);
     if (customResetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customResetPrefixCode, "    ")); } 
    realSb.append(TEXT_134);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_135);
    realSb.append(gen.translate("getDefaultMethod",av));
    realSb.append(TEXT_136);
     if (customResetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customResetPostfixCode, "    ")); } 
    realSb.append(TEXT_137);
    
    }
    else if (av.getIsList())
    {
      
    /*attribute_SetMany*/
    realSb.append(TEXT_138);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_139);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_140);
     if (customAddPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_141);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_142);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_143);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_144);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_145);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_146);
     if (customRemovePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_147);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_148);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_149);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_150);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_151);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_152);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_153);
    
    }
    else
    {
      
    /*attribute_Set*/
    realSb.append(TEXT_154);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_155);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_156);
     if (customSetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_157);
     for( TraceItem traceItem : traceItems )
    realSb.append((traceItem!=null&&traceItem.getIsPre()?traceItem.trace(gen, av,"at_s", uClass,"$"+gen.translate("parameterOne",av)):""));
    realSb.append(TEXT_158);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_159);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_160);
     for( TraceItem traceItem : traceItems )
    realSb.append((traceItem!=null&&traceItem.getIsPost()?traceItem.trace(gen, av,"at_s", uClass):""));
    realSb.append(TEXT_161);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_162);
    
    }
  }

  if(uClass.getExtendsClass()!=null)
  {
    for(Attribute av:uClass.getExtendsClass().getAttributes())
    {
      if (av.isConstant() || av.getIsAutounique() || "internal".equals(av.getModifier()) || av.getIsDerived())
      {
        continue;
      }

      List<TraceItem> traceItems = av.getTraced("setMethod", uClass);

      gen.setParameterConstraintName(av.getName());

      String customSetPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("setMethod",av)));
      String customSetPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("setMethod",av)));

//      String customResetPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("resetMethod",av)));
//      String customResetPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("resetMethod",av)));
      
      String customAddPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("addMethod",av)));
      String customAddPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("addMethod",av)));

//      String customRemovePrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("removeMethod",av)));
//      String customRemovePostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("removeMethod",av)));

      if(customSetPrefixCode!=null||customSetPostfixCode!=null)
      {
        if (av.getModifier().equals("defaulted"))
        {
          
    /*attribute_SetDefaulted_subclass*/
    realSb.append(TEXT_163);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_164);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_165);
     if (customSetPrefixCode != null) { 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_166);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPre()?traceItem.trace(gen, av,"at_s", uClass,gen.translate("parameterOne",av)):""));
    realSb.append(TEXT_167);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_168);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_169);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPost()?traceItem.trace(gen, av,"at_s", uClass):""));
    realSb.append(TEXT_170);
     if (customSetPostfixCode != null) {
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_171);
    
        }
        else if (av.getIsList())
        {
          
    /*attribute_SetMany_subclass*/
    realSb.append(TEXT_172);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_173);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_174);
     if (customAddPrefixCode != null) {
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_175);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPre()?traceItem.trace(gen, av,"at_a", uClass,gen.translate("parameterOne",av)):""));
    realSb.append(TEXT_176);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_177);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_178);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPost()?traceItem.trace(gen, av,"at_a", uClass):""));
    realSb.append(TEXT_179);
     if (customAddPostfixCode != null) { 
      append(realSb, "{0}\n",GeneratorHelper.doIndent(customAddPostfixCode, "    "));
    } 
    realSb.append(TEXT_180);
    
        }
        else if(!av.isImmutable()||av.getIsLazy())//if(customSetPrefixCode!=null&&customSetPostfixCode!=null&&customSetPrefixCode.matches("[\\s]*if.*\\n[\\s]*.*"))
        {
          
    /*attribute_Set_subclass*/
    realSb.append(TEXT_181);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_182);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_183);
     if (customSetPrefixCode != null) {
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_184);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPre()?traceItem.trace(gen, av,"at_s", uClass,gen.translate("parameterOne",av)):""));
    realSb.append(TEXT_185);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_186);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_187);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPost()?traceItem.trace(gen, av,"at_s", uClass):""));
    realSb.append(TEXT_188);
     if (customSetPostfixCode != null) {
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_189);
    
        }
      }    
    }
  }
  gen.setParameterConstraintName("");

    /*attribute_Get_All*/
    
  // GENERIC FILE - EDIT IN UmpleToTemplate project, then run "ant -f build.codegen.xml to move into the appropriate projects
  for (Attribute av : uClass.getAttributes()) 
  {
    if (av.getIsAutounique() || av.isConstant() || "internal".equals(av.getModifier()))
    {
      continue;
    }
    
    gen.setParameterConstraintName(av.getName());

    List<TraceItem> traceItems = av.getTraced("getMethod", uClass);
    
    String customGetPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("getMethod",av)));
    String customGetPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("getMethod",av)));

    String customGetDefaultPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("getDefaultMethod",av)));
    String customGetDefaultPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("getDefaultMethod",av)));

    String customGetManyPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("getManyMethod",av)));
    String customGetManyPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("getManyMethod",av)));

    String customNumberOfPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("numberOfMethod",av)));
    String customNumberOfPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("numberOfMethod",av)));

    String customHasManyPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("hasManyMethod",av)));
    String customHasManyPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("hasManyMethod",av)));

    String customIndexOfPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("indexOfMethod",av)));
    String customIndexOfPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("indexOfMethod",av)));
        
    String customHasUniquePrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("hasUniqueMethod",av)));
    String customHasUniquePostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("hasUniqueMethod",av)));
    
    String customGetUniquePrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("getUniqueMethod",av)));
    String customGetUniquePostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("getUniqueMethod",av)));

    if (av.getIsList())
    {
      
    /*attribute_GetMany*/
    realSb.append(TEXT_190);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_191);
     if (customGetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_192);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_193);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_194);
     if (customGetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    realSb.append(TEXT_195);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_196);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_197);
     if (customGetManyPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_198);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_199);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_200);
     if (customGetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_201);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_202);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_203);
     if (customNumberOfPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customNumberOfPrefixCode, "    ")); } 
    realSb.append(TEXT_204);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_205);
     if (customNumberOfPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customNumberOfPostfixCode, "    ")); } 
    realSb.append(TEXT_206);
    realSb.append(gen.translate("hasManyMethod",av));
    realSb.append(TEXT_207);
     if (customHasManyPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customHasManyPrefixCode, "    ")); } 
    realSb.append(TEXT_208);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_209);
     if (customHasManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customHasManyPostfixCode, "    ")); } 
    realSb.append(TEXT_210);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_211);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_212);
     if (customIndexOfPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customIndexOfPrefixCode, "    ")); } 
    realSb.append(TEXT_213);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_214);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_215);
     if (customIndexOfPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customIndexOfPostfixCode, "    ")); } 
    realSb.append(TEXT_216);
    
    }
    else 
    {

      if (av.getIsDerived() && customGetPostfixCode != null)
      {
        
    /*attribute_GetDerivedCodeInjection*/
    realSb.append(TEXT_217);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_218);
     if (customGetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_219);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_220);
    realSb.append(gen.translate("parameterValue",av));
    realSb.append(TEXT_221);
     if (customGetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    realSb.append(TEXT_222);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_223);
    
      }
      else if (av.getIsDerived())
      {
        
    /*attribute_GetDerived*/
    realSb.append(TEXT_224);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_225);
     if (customGetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_226);
    realSb.append(gen.translate("parameterValue",av));
    realSb.append(TEXT_227);
    
      }
      else if (customGetPostfixCode != null)
      {
        
    /*attribute_GetCodeInjection*/
    realSb.append(TEXT_228);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_229);
     if (customGetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_230);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_231);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_232);
     if (customGetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    realSb.append(TEXT_233);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_234);
    
      }
      else
      {
        
    /*attribute_Get*/
    realSb.append(TEXT_235);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_236);
     if (customGetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_237);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_238);
    
      }
      
      appendln(realSb, "");
      
      if (av.getModifier().equals("defaulted") && customGetDefaultPostfixCode != null)
      {
        
    /*attribute_GetDefaultedCodeInjection*/
    realSb.append(TEXT_239);
    realSb.append(gen.translate("getDefaultMethod",av));
    realSb.append(TEXT_240);
     if (customGetDefaultPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetDefaultPrefixCode, "    ")); } 
    realSb.append(TEXT_241);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_242);
    realSb.append(gen.translate("parameterValue",av));
    realSb.append(TEXT_243);
     if (customGetDefaultPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetDefaultPostfixCode, "    ")); } 
    realSb.append(TEXT_244);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_245);
    
      }
      else if (av.getModifier().equals("defaulted"))
      {
        
    /*attribute_GetDefaulted*/
    realSb.append(TEXT_246);
    realSb.append(gen.translate("getDefaultMethod",av));
    realSb.append(TEXT_247);
     if (customGetDefaultPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetDefaultPrefixCode, "    ")); } 
    realSb.append(TEXT_248);
    realSb.append(gen.translate("parameterValue",av));
    realSb.append(TEXT_249);
    
      }
      
      if (av.getIsUnique())
      {
        if (customGetUniquePostfixCode != null)
        {
          
    /*attribute_GetUniqueCodeInjection*/
    realSb.append(TEXT_250);
    realSb.append(gen.translate("getUniqueMethod",av));
    realSb.append(TEXT_251);
    realSb.append(gen.translate("parameterOne", av));
    realSb.append(TEXT_252);
     if (customGetUniquePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetUniquePrefixCode, "    ")); } 
    realSb.append(TEXT_253);
    realSb.append(gen.translate("parameterGetUnique",av));
    realSb.append(TEXT_254);
    realSb.append(gen.translate("getUniqueMap",av));
    realSb.append(TEXT_255);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_256);
     for( TraceItem traceItem : traceItems )
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_g", uClass):""));
     if (customGetUniquePostfixCode != null) { append(realSb, "{0}\n",GeneratorHelper.doIndent(customGetUniquePostfixCode, "    ")); } 

    realSb.append(TEXT_257);
    realSb.append(gen.translate("parameterGetUnique",av));
    realSb.append(TEXT_258);
    
        } 
        else 
        {
          
    /*attribute_GetUnique*/
    realSb.append(TEXT_259);
    realSb.append(gen.translate("getUniqueMethod",av));
    realSb.append(TEXT_260);
    realSb.append(gen.translate("parameterOne", av));
    realSb.append(TEXT_261);
     if (customGetUniquePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetUniquePrefixCode, "    ")); } 
    realSb.append(TEXT_262);
     for( TraceItem traceItem : traceItems )
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_g", uClass):""));
    realSb.append(TEXT_263);
    realSb.append(gen.translate("getUniqueMap",av));
    realSb.append(TEXT_264);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_265);
    
        }
        if (customHasUniquePostfixCode != null)
        {
          
    /*attribute_HasUniqueCodeInjection*/
    realSb.append(TEXT_266);
    realSb.append(gen.translate("hasUniqueMethod",av));
    realSb.append(TEXT_267);
    realSb.append(gen.translate("parameterOne", av));
    realSb.append(TEXT_268);
     if (customHasUniquePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customHasUniquePrefixCode, "    ")); } 
    realSb.append(TEXT_269);
    realSb.append(gen.translate("parameterHasUnique",av));
    realSb.append(TEXT_270);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_271);
    realSb.append(gen.translate("getUniqueMap",av));
    realSb.append(TEXT_272);
     for( TraceItem traceItem : traceItems )
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_g", uClass):""));
     if (customHasUniquePostfixCode != null) { append(realSb, "{0}\n",GeneratorHelper.doIndent(customHasUniquePostfixCode, "    ")); } 

    realSb.append(TEXT_273);
    realSb.append(gen.translate("parameterHasUnique",av));
    realSb.append(TEXT_274);
    
        }
        else
        {
          
    /*attribute_HasUnique*/
    realSb.append(TEXT_275);
    realSb.append(gen.translate("hasUniqueMethod",av));
    realSb.append(TEXT_276);
    realSb.append(gen.translate("parameterOne", av));
    realSb.append(TEXT_277);
     if (customHasUniquePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customHasUniquePrefixCode, "    ")); } 
    realSb.append(TEXT_278);
     for( TraceItem traceItem : traceItems )
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_g", uClass):""));
    realSb.append(TEXT_279);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_280);
    realSb.append(gen.translate("getUniqueMap",av));
    realSb.append(TEXT_281);
    
        }
      }
    }
  }

  for (Attribute av : uClass.getAttributes()) 
  {
  
    if (av.getIsAutounique())
    {
      String customGetPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("getMethod",av)));
      String customGetPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("getMethod",av)));
      
      List<TraceItem> traceItems = av.getTraced("getMethod", uClass);
      
      if (customGetPostfixCode != null)
      {
        
    /*attribute_GetCodeInjection*/
    realSb.append(TEXT_228);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_229);
     if (customGetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_230);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_231);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_232);
     if (customGetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    realSb.append(TEXT_233);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_234);
    
      }
      else
      {
        
    /*attribute_Get*/
    realSb.append(TEXT_235);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_236);
     if (customGetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_237);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_238);
    
      }
      appendln(realSb, "");
    }
  }
  if(uClass.getExtendsClass()!=null)
  {
    for(Attribute av:uClass.getExtendsClass().getAttributes())
    {
      if (av.isConstant())
      {
        continue;
      }

      List<TraceItem> traceItems = av.getTraced("getMethod", uClass);

      gen.setParameterConstraintName(av.getName());

	  String customGetPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("getMethod",av)));
	  String customGetPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("getMethod",av)));
	  
	  String customGetManyPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("getManyMethod",av)));
      String customGetManyPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("getManyMethod",av)));
	  
	  if (customGetManyPrefixCode!=null || customGetManyPostfixCode!=null)
      {
        
    /*attribute_GetManySubclass*/
    realSb.append(TEXT_282);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_283);
     if (customGetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_284);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_285);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_286);
     if (customGetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    realSb.append(TEXT_287);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_288);
    
      }
      else if(customGetPrefixCode!=null||customGetPostfixCode!=null)
      {
        
    /*attribute_GetSubclass*/
    realSb.append(TEXT_289);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_290);
     if (customGetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_291);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_292);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_293);
     if (customGetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    realSb.append(TEXT_294);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_295);
    
      }
      
              
    }
  }
  gen.setParameterConstraintName("");

    /*attribute_IsBoolean_All*/
    
  // GENERIC FILE - EDIT IN UmpleToTemplate project, then run "ant -f build.codegen.xml to move into the appropriate projects
  for (Attribute av : uClass.getAttributes()) 
  {
    if (!av.getType().equals("Boolean") || av.getIsAutounique() || av.isConstant() || "internal".equals(av.getModifier()))
    {
      continue;
    }
  
    gen.setParameterConstraintName(av.getName());

    List<TraceItem> traceItems = av.getTraced("getMethod", uClass);

    String customGetPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("isMethod",av)));
    String customGetPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("isMethod",av)));
    
    if (av.getIsDerived() && customGetPostfixCode != null)
    {
      
    /*attribute_IsBooleanCodeInjectionDerived*/
    realSb.append(TEXT_296);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_297);
    realSb.append(gen.translate("isMethod",av));
    realSb.append(TEXT_298);
     if (customGetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_299);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_300);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_301);
    realSb.append(gen.translate("parameterValue",av));
    realSb.append(TEXT_302);
     if (customGetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    realSb.append(TEXT_303);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_304);
    
    }
    else if (av.getIsDerived())
    {
      
    /*attribute_IsBooleanDerived*/
    realSb.append(TEXT_305);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_306);
    realSb.append(gen.translate("isMethod",av));
    realSb.append(TEXT_307);
     if (customGetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_308);
    realSb.append(gen.translate("parameterValue",av));
    realSb.append(TEXT_309);
    
    }
    else if (customGetPostfixCode != null)
    {
      
    /*attribute_IsBooleanCodeInjection*/
    realSb.append(TEXT_310);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_311);
    realSb.append(gen.translate("isMethod",av));
    realSb.append(TEXT_312);
     if (customGetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_313);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_314);
    realSb.append(gen.translate("parameterValue",av));
    realSb.append(TEXT_315);
     if (customGetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    realSb.append(TEXT_316);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_317);
    
    }
    else
    {
      
    /*attribute_IsBoolean*/
    realSb.append(TEXT_318);
    realSb.append(gen.translate("isMethod",av));
    realSb.append(TEXT_319);
     if (customGetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_320);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_321);
    
    }
      
    appendln(realSb, "");
  }
  gen.setParameterConstraintName("");

    /*state_machine_Get_All*/
    
{
  // GENERIC FILE - EDIT IN UmpleToTemplate project, then run "ant -f build.codegen.xml to move into the appropriate projects
  isFirst = true;
  for(StateMachine sm : uClass.getStateMachines())
  {
    
    /*state_machine_GetFull*/
    
  StringBuilder output = new StringBuilder(); 
  List<StateMachine> allParents = new ArrayList<StateMachine>();
  allParents.add(sm);
  while (allParents.size() > 0) 
  {
    StateMachine parentSm = allParents.get(0);
    allParents.remove(0);
    for (StateMachine childSm : parentSm.getNestedStateMachines()) 
    {
      output.append(StringFormatter.format("\n    if ($this->{0} != self::${2}) { $answer .= \".\" . $this->{1}(); }",gen.translate("stateMachineOne",childSm),gen.translate("getMethod",childSm),gen.translate("stateNull",childSm)));
      allParents.addAll(childSm.getNestedStateMachines());
    }     
  }
  String outputAsString = output.toString();

    realSb.append(TEXT_322);
    realSb.append(gen.translate("getFullMethod",sm));
    realSb.append(TEXT_323);
    realSb.append(gen.translate("getMethod",sm));
    realSb.append(TEXT_324);
     if (outputAsString.length() > 0) { append(realSb, "{0}",outputAsString); } 
    realSb.append(TEXT_325);
     
  }
  
  for(StateMachine sm : uClass.getAllStateMachines())
  {
    
    /*state_machine_Get*/
    
  StringBuffer allCases = new StringBuffer();
{
  isFirst = true;
  for(State state : sm.getStates())
  {
    if (isFirst)
    {
      allCases.append(StringFormatter.format("if ($this->{0} == self::${1}) { return {2}; }\n",gen.translate("stateMachineOne",sm), gen.translate("stateOne",state), gen.translate("stateString",state)));
    }
    else
    {
      allCases.append(StringFormatter.format("    elseif ($this->{0} == self::${1}) { return {2}; }\n",gen.translate("stateMachineOne",sm), gen.translate("stateOne",state), gen.translate("stateString",state)));
    }
    isFirst = false;
  }
}
  String outputCases = allCases.toString().trim();

    realSb.append(TEXT_326);
    realSb.append(gen.translate("getMethod",sm));
    realSb.append(TEXT_327);
     if (outputCases.length() > 0) { append(realSb, "\n    {0}",outputCases); } 
    realSb.append(TEXT_328);
    
  }
}

    /*state_machine_Events_All*/
    
{
  // GENERIC FILE - EDIT IN UmpleToTemplate project, then run "ant -f build.codegen.xml to move into the appropriate projects
  for(Event e : uClass.getEvents())
  {
    
    /*state_machine_Event*/
    
  StringBuffer allCases = new StringBuffer();
  StringBuffer allDeclarations = new StringBuffer();
  StringBuffer allArgs = new StringBuffer();
  
  // Issue 923 Fix: Prevent default implmentation of interface methods when a state machine implements them
  boolean implementsInterfaceMethod = false;
  for (UmpleInterface uInterface : uClass.getParentInterface())
  {
  	for (Method m : uInterface.getMethods())
  	{
  		Method eventMethod = new Method("",e.getName(),e.getType().toLowerCase(),false);
  		eventMethod.setMethodParameters(e.getParams());
  		if (m.compareWithTheMethod(eventMethod))
  		{
  			uClass.removeMethod(m);
  			implementsInterfaceMethod = true;
  			break;
  		}
  	}
  	
  	if (implementsInterfaceMethod)
  	{
  		break;
  	}
  }
   
  boolean firstStateMachine = true;
  for(StateMachine sm : uClass.getStateMachines(e))
  {
    for( TraceDirective tc : uClass.getTraceDirectives() )
  	{
  		for( int i = 0 ; i < tc.numberOfStateMachineTraceItems() ; ++ i )
  		{
  			if( tc.getStateMachineTraceItem(i).getStateMachine() == sm )
  			{
  				if( model.getTraceType().equals("Console"))
  				{
  					allCases.append(StringFormatter.format("\n    print(\"Event={0}\");\n    ",gen.translate("eventMethod",e)));
  				}
  				else if( model.getTraceType().equals("File"))
  				{
  					allCases.append(StringFormatter.format("\n    fileTracer(\"Event={0}\");\n    ",gen.translate("eventMethod",e)));
  				}
  			}
  		}
  	}
  	allDeclarations.append(StringFormatter.format("\n    ${0} = $this->{1};",gen.translate("parameterOne",sm),gen.translate("stateMachineOne", sm)));
  	
    boolean first = true;
    if (!firstStateMachine)
    {
      allCases.append("\n\n    ");
    }

    for(State state : sm.getStates())
    {
  
      List<Transition> allT = state.getTransitionsFor(e);
      
      if (allT.size() == 0)
      {
        continue;
      }
      
      if (first)
      {
        allCases.append(StringFormatter.format("\n    if (${0} == self::${1})\n",gen.translate("parameterOne",sm),gen.translate("stateOne",state)));
      }
      else
      {
        allCases.append(StringFormatter.format("\n    elseif (${0} == self::${1})\n",gen.translate("parameterOne",sm),gen.translate("stateOne",state)));
      }
      allCases.append(StringFormatter.format("    {\n"));
  
      boolean needsBreak = true;
      for (Transition t : allT)
      {
        State nextState = t.getNextState();
        String spaceOffset = t.getGuard() == null ? "" : "  ";
        StateMachine exitSm = state.exitableStateMachine(nextState);
        String condition = t.getGuard()!=null?gen.translate("Open",t.getGuard()):"if ()\n{";        
        if (!"if ()\n{".equals(condition))
        {
          allCases.append(GeneratorHelper.doIndent(condition, "      ")+"\n");
        }
        if (exitSm != null && !e.getIsInternal() && !state.isSameState(nextState,exitSm)) 
        {
          allCases.append(StringFormatter.format("{0}      $this->{1}();\n",spaceOffset,gen.translate("exitMethod",exitSm)));
        }
        if (t.getAction() != null)
        {
          Action a1= t.getAction();
          allCases.append(StringFormatter.format("{0}      {1}\n",spaceOffset,a1.getActionCode()));
        }
  
        allCases.append(StringFormatter.format("{0}      $this->{1}(self::${2});\n",spaceOffset,gen.translate("setMethod",nextState.getStateMachine()),gen.translate("stateOne",nextState)));
        allCases.append(StringFormatter.format("{0}      $wasEventProcessed = true;\n",spaceOffset));
  
        if (!"if ()\n{".equals(condition))
        {
          allCases.append(StringFormatter.format("      }\n"));
        }
      }
      allCases.append(StringFormatter.format("    }"));
      first = false;
    }
    firstStateMachine = false;
  }
  String[] split = e.getArgs().split(",");
  if (split[0] != null && split[0] != "")
  {
    for (int i = 0; i < split.length; i++) {
      if (i > 0)
      {
        allArgs.append(", ");
      }
      allArgs.append(StringFormatter.format("${0}",split[i].substring(split[i].indexOf(" ")+1)));
    }
  }
  String scope = e.getIsInternal() || e.isAutoTransition() ? "private" : "public";
  String eventOutput = allDeclarations.toString() + allCases.toString();
  String argsOutput = allArgs.toString();

    realSb.append(TEXT_329);
    realSb.append(scope);
    realSb.append(TEXT_330);
    realSb.append(gen.translate("eventMethod",e));
    realSb.append(TEXT_331);
    realSb.append(argsOutput);
    realSb.append(TEXT_332);
    realSb.append(eventOutput);
    realSb.append(TEXT_333);
    
  }
}

    /*state_machine_Set_All*/
    
{
  // GENERIC FILE - EDIT IN UmpleToTemplate project, then run "ant -f build.codegen.xml to move into the appropriate projects
  for (StateMachine sm : uClass.getAllStateMachines())  
  {

    if (sm.getType() == "Simple" && sm.numberOfStates() > 0)
    {
      
    /*state_machine_SetSimple*/
    
  
  StringBuffer allCases = new StringBuffer();
  StringBuffer allExitCases = new StringBuffer();
  StringBuffer allEnterCases = new StringBuffer();

  for (State state : sm.getStates())
  {
    if (state.getIsStartState())
    {
      allCases.append(StringFormatter.format("if"));
    }
    else
    {
      allCases.append(StringFormatter.format("    elseif"));
    }
    allCases.append(StringFormatter.format(" (${0} == \"{1}\" || ${0} == self::${1})\n",gen.translate("parameterOne",sm),gen.translate("stateOne",state)));
    allCases.append(StringFormatter.format("    {\n"));
    allCases.append(StringFormatter.format("      $this->{0} = self::${1};\n",gen.translate("stateMachineOne",sm),gen.translate("stateOne",state)));
    allCases.append(StringFormatter.format("      return true;\n"));
    allCases.append(StringFormatter.format("    }\n"));

    boolean hasThisEntry = false;
    boolean hasThisExit = false;
    for (Action action : state.getActions())
    {
      if ("exit".equals(action.getActionType()))
      {
        if(!hasThisExit)
        {
          allExitCases.append(StringFormatter.format("    if ($this->{0} == self::${1} && (${2} != self::${1} && ${2} != \"{1}\") )\n    {"
            , gen.translate("stateMachineOne",sm)
            , gen.translate("stateOne",state)
            , gen.translate("parameterOne",sm)
          ));
        }
        hasThisExit = true;
        allExitCases.append("\n      " + action.getActionCode());
      }
      else if ("entry".equals(action.getActionType()))
      {
        if (!hasThisEntry)
        {
          allEnterCases.append(StringFormatter.format("    if ($this->{0} != self::${1} && (${2} == self::${1} || ${2} == \"{1}\") )\n    {"
            , gen.translate("stateMachineOne",sm)
            , gen.translate("stateOne",state)
            , gen.translate("parameterOne",sm)
          ));
        }
        hasThisEntry = true;
        allEnterCases.append("\n      " + action.getActionCode());
      }
    }
    if (state.getHasExitAction()){
     allExitCases.append("\n    }\n");
    }
    if (state.getHasEntryAction()){
     allEnterCases.append("\n    }\n");
    }
  }
  String outputCases = allCases.toString().trim();
  String exitCasesOutput = allExitCases.toString().trim();
  String enterCasesOutput = allEnterCases.toString().trim();


    realSb.append(TEXT_334);
    realSb.append(gen.translate("setMethod",sm));
    realSb.append(TEXT_335);
    realSb.append(gen.translate("parameterOne",sm));
    realSb.append(TEXT_336);
     if (!exitCasesOutput.isEmpty()) { append(realSb, "\n    {0}",exitCasesOutput); } 
    realSb.append(TEXT_337);
     if (!enterCasesOutput.isEmpty()) { append(realSb, "\n    {0}",enterCasesOutput); } 
    realSb.append(TEXT_338);
    realSb.append(outputCases);
    realSb.append(TEXT_339);
    
    }
    else if (sm.numberOfStates() > 0)
    {
      
    /*state_machine_Set*/
    
  boolean hasEntry = false;
  boolean hasExit = false;
  boolean isFirstEntry = true;
  boolean isFirstExit = true;
  State parentState = sm.getParentState();
  StateMachine parentSm = parentState != null ? parentState.getStateMachine() : null;
  String customSetPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("setMethod",sm)));
  String customSetPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("setMethod",sm)));
  String customExitPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("exitMethod",sm)));
  String customExitPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("exitMethod",sm)));

  StringBuilder entryActions = new StringBuilder();
  StringBuilder exitActions = new StringBuilder();
  for(State state : sm.getStates())
  {
    boolean hasThisEntry = false;
    boolean hasThisExit = false;
    
    for(Action action : state.getActions())
    {
      if ("entry".equals(action.getActionType()))
      {
        if (!hasThisEntry)
        {
          if (isFirstEntry)
          {
            entryActions.append(StringFormatter.format("if ($this->{0} == self::${1})\n    {",gen.translate("stateMachineOne",sm),gen.translate("stateOne",state)));
            for( TraceDirective tc : uClass.getTraceDirectives() )
          	{
                for( int i = 0 ; i < tc.numberOfStateMachineTraceItems() ; ++ i )
                {
              	  StateMachineTraceItem tracedState = tc.getStateMachineTraceItem(i);
          		  StateMachine stm = tracedState.getStateMachine();
          		  for( int j = 0 ; j < stm.numberOfStates() ; ++j )
          		  {
          		  	State stat = stm.getState(j);
          		  	String statName =  stm.getName() + stat.getName();
          		  	if( tracedState.getEntry() )
          			  if( statName.equalsIgnoreCase(gen.translate("stateOne",state)))
              			if( model.getTraceType().equals("Console"))
          					entryActions.append(StringFormatter.format( "\n      " + "print(\"Tracing state {0} entry action(s)\");",gen.translate("stateOne",state)));
           				else if( model.getTraceType().equals("File"))
           					entryActions.append(StringFormatter.format( "\n      " + "fileTracer(\"Tracing state {0} entry action(s)\");",gen.translate("stateOne",state))); 
           		  }
          	  }
          	}
          }
          else
          {
            entryActions.append("\n    ");
            entryActions.append(StringFormatter.format("elseif ($this->{0} == self::${1})\n    {",gen.translate("stateMachineOne",sm),gen.translate("stateOne",state)));
          }
        }
        hasEntry = true;
        hasThisEntry = true;
        isFirstEntry = false;
        entryActions.append("\n      " + action.getActionCode());
      }
      else if ("exit".equals(action.getActionType()))
      {
        if (!hasThisExit)
        {
          if (isFirstExit)
          {
            exitActions.append(StringFormatter.format("if ($this->{0} == self::${1})\n    {",gen.translate("stateMachineOne",sm),gen.translate("stateOne",state)));
            for( TraceDirective tc : uClass.getTraceDirectives() )
          	{
              for( int i = 0 ; i < tc.numberOfStateMachineTraceItems() ; ++ i )
              {
            	  StateMachineTraceItem tracedState = tc.getStateMachineTraceItem(i);
          		  StateMachine stm = tracedState.getStateMachine();
          		  for( int j = 0 ; j < stm.numberOfStates() ; ++j )
          		  {
          		  	State stat = stm.getState(j);
          		  	String statName =  stm.getName() + stat.getName();
          		  	if( tracedState.getExit() )
          			  if( statName.equalsIgnoreCase(gen.translate("stateOne",state)))
              			if( model.getTraceType().equals("Console"))
              				exitActions.append(StringFormatter.format( "\n      " + "print(\"Tracing state {0} exit action(s)\");",gen.translate("stateOne",state)));
           				  else if( model.getTraceType().equals("File"))
           					exitActions.append(StringFormatter.format( "\n      " + "fileTracer(\"Tracing state {0} exit action(s)\");",gen.translate("stateOne",state))); 
           		  }
          	  }
          	}
          }
          else
          {
            exitActions.append("\n    ");
            exitActions.append(StringFormatter.format("elseif ($this->{0} == self::${1})\n    {",gen.translate("stateMachineOne",sm),gen.translate("stateOne",state)));
          }
          isFirstExit = false;
        }
        hasExit = true;
        hasThisExit = true;
        isFirstExit = false;
        if(action.getActionCode() == null) //verify why it returns null
        {
          exitActions.append("\n      " + StringFormatter.format("$this->{0}(self::${1});", gen.translate("setMethod",sm), gen.translate("stateNull",sm)));
        }
        else
        {
          exitActions.append("\n      " + action.getActionCode());
        }
      }
    }
  
    for (Activity activity : state.getActivities())
    {
      if (!hasThisEntry)
      {
        if (isFirstEntry)
        {
          entryActions.append(StringFormatter.format("if ($this->{0} == self::${1})\n    {",gen.translate("stateMachineOne",sm),gen.translate("stateOne",state)));
        }
        else
        {
          entryActions.append("\n    ");
          entryActions.append(StringFormatter.format("elseif ($this->{0} == self::${1})\n    {",gen.translate("stateMachineOne",sm),gen.translate("stateOne",state)));
        }
      }
      hasEntry = true;
      hasThisEntry = true;
      isFirstEntry = false;
      entryActions.append(StringFormatter.format("\n      {0}",activity.getActivityCode()));
    }
    
    if (hasThisEntry)
    {
      entryActions.append("\n    }");
    }
    
    if (hasThisExit)
    {
      exitActions.append("\n    }");
    }
  }

    realSb.append(TEXT_340);
     if (hasExit) { 
    realSb.append(TEXT_341);
    realSb.append(gen.translate("exitMethod",sm));
    realSb.append(TEXT_342);
     if (customExitPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customExitPrefixCode, "    ")); } 
    realSb.append(TEXT_343);
    realSb.append(exitActions);
    realSb.append(TEXT_344);
     if (customExitPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customExitPostfixCode, "    ")); } 
    realSb.append(TEXT_345);
     } 
    realSb.append(TEXT_346);
    realSb.append(gen.translate("setMethod",sm));
    realSb.append(TEXT_347);
    realSb.append(gen.translate("parameterOne",sm));
    realSb.append(TEXT_348);
     if (customSetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_349);
    realSb.append(gen.translate("stateMachineOne",sm));
    realSb.append(TEXT_350);
    realSb.append(gen.translate("parameterOne",sm));
    realSb.append(TEXT_351);
     if (parentState != null) { 
    realSb.append(TEXT_352);
    realSb.append(gen.translate("stateMachineOne",parentSm));
    realSb.append(TEXT_353);
    realSb.append(gen.translate("stateOne",parentState));
    realSb.append(TEXT_354);
    realSb.append(gen.translate("parameterOne",sm));
    realSb.append(TEXT_355);
    realSb.append(gen.translate("stateNull",sm));
    realSb.append(TEXT_356);
    realSb.append(gen.translate("setMethod",parentSm));
    realSb.append(TEXT_357);
    realSb.append(gen.translate("stateOne",parentState));
    realSb.append(TEXT_358);
     } 
    realSb.append(TEXT_359);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_360);
     if (hasEntry) { 
    realSb.append(TEXT_361);
    realSb.append(entryActions);
    realSb.append(TEXT_362);
     } 
    realSb.append(TEXT_363);
    
    }
  }
}

    /*association_Get_All*/
    
  // GENERIC FILE - EDIT IN UmpleToTemplate project, then run "ant -f build.codegen.xml to move into the appropriate projects
  for (AssociationVariable av : uClass.getAssociationVariables()) 
  {

    if (!av.getIsNavigable())
    {
      continue;
    }

    gen.setParameterConstraintName(av.getName());

    List<TraceItem> traceItems = av.getTraced("getMethod", uClass);

    String customGetPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("getMethod",av)));
    String customGetPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("getMethod",av)));

    String customGetDefaultPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("getDefaultMethod",av)));
    String customGetDefaultPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("getDefaultMethod",av)));

    String customGetManyPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("getManyMethod",av)));
    String customGetManyPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("getManyMethod",av)));

    String customNumberOfPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("numberOfMethod",av)));
    String customNumberOfPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("numberOfMethod",av)));

    String customHasManyPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("hasManyMethod",av)));
    String customHasManyPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("hasManyMethod",av)));

    String customIndexOfPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("indexOfMethod",av)));
    String customIndexOfPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("indexOfMethod",av)));

    boolean hasCodeInjections = customGetPrefixCode != null || customGetPostfixCode != null;
  
    if (av.isOne())
    {
      
    /*association_GetOne*/
    realSb.append(TEXT_364);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_365);
     if (customGetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_366);
     if (customGetPostfixCode == null) { 
    realSb.append(TEXT_367);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_368);
     } else { 
    realSb.append(TEXT_369);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_370);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_371);
     append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); 
    realSb.append(TEXT_372);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_373);
     } 
    realSb.append(TEXT_374);
     
  if(av.getMultiplicity().getLowerBound() == 0) {
  
    realSb.append(TEXT_375);
    realSb.append(gen.translate("hasMethod",av));
    realSb.append(TEXT_376);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_377);
     } 
    realSb.append(TEXT_378);
    
    }
    else if (av.isMany())
    {
      
    /*association_GetMany*/
    realSb.append(TEXT_379);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_380);
     if (customGetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_381);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_382);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_383);
     if (customGetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    realSb.append(TEXT_384);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_385);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_386);
     if (customGetManyPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_387);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_388);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_389);
     if (customGetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_390);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_391);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_392);
     if (customNumberOfPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customNumberOfPrefixCode, "    ")); } 
    realSb.append(TEXT_393);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_394);
     if (customNumberOfPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customNumberOfPostfixCode, "    ")); } 
    realSb.append(TEXT_395);
    realSb.append(gen.translate("hasManyMethod",av));
    realSb.append(TEXT_396);
     if (customHasManyPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customHasManyPrefixCode, "    ")); } 
    realSb.append(TEXT_397);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_398);
     if (customHasManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customHasManyPostfixCode, "    ")); } 
    realSb.append(TEXT_399);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_400);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_401);
     if (customIndexOfPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customIndexOfPrefixCode, "    ")); } 
    realSb.append(TEXT_402);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_403);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_404);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_405);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_406);
     if (customIndexOfPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customIndexOfPostfixCode, "    ")); } 
    realSb.append(TEXT_407);
    
    }
    else
    {
      
    realSb.append(TEXT_408);
    
    }
 }
 gen.setParameterConstraintName("");

    /*association_Set_All*/
    
  // GENERIC FILE - EDIT IN UmpleToTemplate project, then run "ant -f build.codegen.xml to move into the appropriate projects
  
  boolean sortMethodAdded = false; //To ensure that only one sort method is created per class
  for (AssociationVariable av : uClass.getAssociationVariables())
  {
  
    gen.setParameterConstraintName(av.getName());

    AssociationVariable relatedAssociation = av.getRelatedAssociation();

    if (!av.getIsNavigable())
    {
      continue;
    } 
    
    //TraceItem traceItem = av.getTraced("associationAdd", uClass);
    List<TraceItem> traceItemAssocAdds = av.getTraced("associationAdd", uClass);
    List<TraceItem> traceItemAssocRemoves = av.getTraced("associationRemove", uClass);

    String customSetPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("setMethod",av)));
    String customSetPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("setMethod",av)));

    String customSetManyPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("setManyMethod",av)));
    String customSetManyPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("setManyMethod",av)));

    String customAddPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("addMethod",av)));
    String customAddPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("addMethod",av)));
  
    String customRemovePrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("removeMethod",av)));
    String customRemovePostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("removeMethod",av)));

    String customIsNumberOfValidPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("isNumberOfValidMethod",av)));
    String customIsNumberOfValidPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("isNumberOfValidMethod",av)));
    
    String includeFileOne = null;
    String includeFileTwo = null;
    
    boolean hasIsNumberOfValidMethod = false;
    boolean hasAddManyToManyTemplateMethod = false;
    boolean hasMaximumNumberOfMethod = av.isMany() && !av.isStar();
    boolean hasMinimumNumberOfMethod = av.isMany();
    boolean hasRequiredNumberOfMethod = av.isN();
    boolean hasRemoveManyTemplateMethod = false;
    String includeFile = null;
    String includeFile2 = null;
  String includeFile3 = null;

    if (!relatedAssociation.getIsNavigable())
    {
      if (av.isOptionalOne())
      {
        includeFile = "association_SetUnidirectionalOptionalOne.jet";
      }
      else if (av.isOnlyOne())
      {
        includeFile = "association_SetUnidirectionalOne.jet";
      }
      else if (av.isMStar())
      {
        if (!av.isImmutable())
        {
          includeFile = "association_AddUnidirectionalMStar.jet";
        }
        includeFile2 = "association_SetUnidirectionalMStar.jet";
      }
      else if (av.isMN())
      {
        if (!av.isImmutable())
        {
          includeFile = "association_AddUnidirectionalMN.jet";
        }
        includeFile2 = "association_SetUnidirectionalMN.jet";
      }
      else if (av.isN())
      {
        includeFile = "association_SetUnidirectionalN.jet";
      }
      else if (av.isOptionalN())
      {
        if (!av.isImmutable())
        {
          includeFile = "association_AddUnidirectionalOptionalN.jet";
        }
        includeFile2 = "association_SetUnidirectionalOptionalN.jet";
      }
      else if (av.isImmutable() && av.isMany())
      {
        includeFile = "association_SetUnidirectionalMany.jet";
      }
      else if (av.isMany())
      {
        includeFile = "association_AddUnidirectionalMany.jet";
      }
    }
    else if (av.isOnlyOne() && relatedAssociation.isOnlyOne())
    {
      //ignore
    }  
    else if (av.isN() && relatedAssociation.isOptionalOne())
    { 
      includeFile = "association_SetNToOptionalOne.jet";
    }
    else if (av.isMN() && relatedAssociation.isOptionalOne())
    {
      includeFile = "association_AddMNToOptionalOne.jet";
      includeFile2 = "association_SetMNToOptionalOne.jet";
    }
    else if (av.isMandatoryMany() && av.isStar() && relatedAssociation.isMany())
    {
      hasIsNumberOfValidMethod = true;
      hasAddManyToManyTemplateMethod = true;
      includeFile = "association_AddMStarToMany.jet";
      includeFile2 = "association_SetMStarToMany.jet";
    }
    else if ((av.isMN() || av.isN()) && relatedAssociation.isMandatoryMany())
    {
      hasIsNumberOfValidMethod = true;
      hasAddManyToManyTemplateMethod = true;
      hasAddManyToManyTemplateMethod = true;
      includeFile = "association_AddMNToMany.jet";
      includeFile2 = "association_SetMNToMany.jet";
    }
    else if ((av.isMN() || av.isN()) && relatedAssociation.isOptionalN())
    {
      hasIsNumberOfValidMethod = true;
      hasAddManyToManyTemplateMethod = true;
      hasAddManyToManyTemplateMethod = true;
      includeFile = "association_AddMNToMany.jet";
    }
    else if ((av.isMN() || av.isN()) && !relatedAssociation.isOne())
    {
      hasIsNumberOfValidMethod = true;
      hasAddManyToManyTemplateMethod = true;
      includeFile = "association_AddMNToMany.jet";
      includeFile2 = "association_SetMNToMany.jet";
    }
    else if (av.isOptionalOne() && relatedAssociation.isOptionalOne())
    {
      includeFile = "association_SetOptionalOneToOptionalOne.jet";
    }
    else if (av.isOptionalOne() && relatedAssociation.isOne())
    {
      includeFile = "association_SetOptionalOneToOne.jet";
    }
    else if (av.isOne() && relatedAssociation.isOptionalOne())
    {
      includeFile = "association_SetOneToOptionalOne.jet";
    }
    else if (av.isMandatoryMany() && av.isStar() && relatedAssociation.isOne())
    {
      hasIsNumberOfValidMethod = true;
      includeFile = "association_AddMandatoryManyToOne.jet";
    }
    else if ((av.isMN() || av.isN()) && relatedAssociation.isOnlyOne())
    {
      hasIsNumberOfValidMethod = true;
      includeFile = "association_AddMNToOnlyOne.jet";
    }
    else if (av.isOptionalN() && relatedAssociation.isOnlyOne())
    {
      includeFile = "association_AddOptionalNToOne.jet";
    }
    else if (av.isOptionalN() && (relatedAssociation.isMN() || relatedAssociation.isOptionalN()))
    {
      hasAddManyToManyTemplateMethod = true;
      if (!av.isImmutable())
      {
        hasRemoveManyTemplateMethod = true;
      }
    }
    else if (av.isOptionalN() && relatedAssociation.isOptionalMany())
    {
      hasAddManyToManyTemplateMethod = true;
      if (!av.isImmutable())
      {
        hasRemoveManyTemplateMethod = true;
      }
      includeFile = "association_SetOptionalNToMany.jet";
    }
    else if (av.isMany() && relatedAssociation.isOnlyOne())
    {
      includeFile = "association_AddManyToOne.jet";
    }
    else if (av.isOptionalN() && (relatedAssociation.isMN() || relatedAssociation.isN()))
    {
      hasAddManyToManyTemplateMethod = true;
      if (!av.isImmutable())
      {
        hasRemoveManyTemplateMethod = true;
      }
    }
    else if (av.isMany() && (relatedAssociation.isMN() || relatedAssociation.isN() || relatedAssociation.isMany()))
    {
      hasAddManyToManyTemplateMethod = true;
      if (!av.isImmutable())
      {
        hasRemoveManyTemplateMethod = true;
      }
    }
    else if (av.isOptionalN() && relatedAssociation.isOptionalOne())
    {
      includeFile = "association_AddOptionalNToOptionalOne.jet";
    }
    else if (av.isMany() && relatedAssociation.isOptionalOne())
    {
      includeFile = "association_AddManyToOptionalOne.jet";
    }
    else if (av.isOnlyOne() && relatedAssociation.isMandatoryMany() && relatedAssociation.isStar())
    {
      includeFile = "association_SetOneToMandatoryMany.jet";
    }
    else if (av.isOnlyOne() && (relatedAssociation.isMN() || relatedAssociation.isN()))
    {
      includeFile = "association_SetOneToAtMostN.jet";
    }
    else if (av.isOnlyOne() && relatedAssociation.isOptionalN())
    {
      includeFile = "association_SetOneToAtMostN.jet";
    }
    else if (av.isOnlyOne() && relatedAssociation.isMany() && !(av.isMandatory() && !av.isOne()) && !(uClass instanceof AssociationClass))
    {
      includeFile = "association_SetOneToMany.jet";
    }
    else if (av.isOnlyOne() && relatedAssociation.isMany() && !(av.isMandatory() && !av.isOne()) && (uClass instanceof AssociationClass))
    {
      includeFile = "association_SetOneToManyAssociationClass.jet";
    }
    else if (av.isOptionalOne() && relatedAssociation.isOptionalN())
    {
      includeFile = "association_SetOptionalOneToOptionalN.jet";
    }
    else if (av.isOptionalOne() && relatedAssociation.isOptionalMany())
    {
      includeFile = "association_SetOptionalOneToMany.jet";
    }
    else if (av.isOptionalOne() && relatedAssociation.isMandatoryMany())
    {
      // Insert code to include code here
      if (relatedAssociation.isUpperBounded())
      {
        //
        // This program cannot currently include SetOptionalOneToMandatoryMN.jet because of Issue351 where add/remove methods do not generate
        //
        // includeFile = "association_SetOptionalOneToMandatoryMN.jet";
      } 
      else
      {
        //
        // We can include association_SetOptionalOneToMandatoryMany.jet
        // 
        includeFile = "association_SetOptionalOneToMandatoryMany.jet";
      } 
    }
    else if (av.isOptionalOne() && relatedAssociation.isMandatory())
    {
      //ignore
    }

    else
    {
      
    realSb.append(TEXT_409);
    realSb.append(av);
    realSb.append(TEXT_410);
    realSb.append(relatedAssociation);
    
    }
    
    if(av.isSorted())
    {
      includeFile3 = "association_Sort.jet";
    }
    else if(av.isMany() && !av.isImmutable() && !av.isN())
    {
      includeFile3 = "association_AddIndexControlFunctions.jet";
    }

    boolean addNewLine = false;
    if (hasIsNumberOfValidMethod)
    {
      if (addNewLine) { appendln(realSb,""); }
      addNewLine = true;
      
    
      
    /*association_IsNumberOfValidMethod*/
    realSb.append(TEXT_411);
    realSb.append(gen.translate("isNumberOfValidMethod",av));
    realSb.append(TEXT_412);
     if (customIsNumberOfValidPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customIsNumberOfValidPrefixCode, "    ")); } 
    realSb.append(TEXT_413);
     if (av.getMultiplicity().isUpperBoundMany()) { 
    realSb.append(TEXT_414);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_415);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_416);
     } else { 
    realSb.append(TEXT_417);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_418);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_419);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_420);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_421);
     } 
    realSb.append(TEXT_422);
     if (customIsNumberOfValidPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customIsNumberOfValidPostfixCode, "    ")); } 
    realSb.append(TEXT_423);
    
    }
    
    if (hasRequiredNumberOfMethod)
    {
      if (addNewLine) { appendln(realSb,""); }
      addNewLine = true;
      
    
      
    /*association_RequiredNumberOfMethod*/
    
    String customRequiredNumberOfPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("requiredNumberOfMethod",av)));
    String customRequiredNumberOfPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("requiredNumberOfMethod",av)));

    realSb.append(TEXT_424);
     if (customRequiredNumberOfPrefixCode == null && customRequiredNumberOfPostfixCode == null) { 
    realSb.append(TEXT_425);
    realSb.append(gen.translate("requiredNumberOfMethod",av));
    realSb.append(TEXT_426);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_427);
     } else { 
    realSb.append(TEXT_428);
    realSb.append(gen.translate("requiredNumberOfMethod",av));
    realSb.append(TEXT_429);
     if (customRequiredNumberOfPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRequiredNumberOfPrefixCode, "    ")); } 
    realSb.append(TEXT_430);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_431);
     if (customRequiredNumberOfPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRequiredNumberOfPostfixCode, "    ")); } 
    realSb.append(TEXT_432);
     } 
    
    }

    if (hasMinimumNumberOfMethod)
    {
      if (addNewLine) { appendln(realSb,""); }
      addNewLine = true;
      
    
      
    /*association_MinimumNumberOfMethod*/
    
    String customMinimumNumberOfPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("minimumNumberOfMethod",av)));
    String customMinimumNumberOfPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("minimumNumberOfMethod",av)));

    realSb.append(TEXT_433);
     if (customMinimumNumberOfPrefixCode == null && customMinimumNumberOfPostfixCode == null) { 
    realSb.append(TEXT_434);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_435);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_436);
     } else { 
    realSb.append(TEXT_437);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_438);
     if (customMinimumNumberOfPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customMinimumNumberOfPrefixCode, "    ")); } 
    realSb.append(TEXT_439);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_440);
     if (customMinimumNumberOfPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customMinimumNumberOfPostfixCode, "    ")); } 
    realSb.append(TEXT_441);
     } 
    
    }
    
    if (hasMaximumNumberOfMethod)
    {
      if (addNewLine) { appendln(realSb,""); }
      addNewLine = true;
      
    
      
    /*association_MaximumNumberOfMethod*/
    
    String customMaximumNumberOfPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("maximumNumberOfMethod",av)));
    String customMaximumNumberOfPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("maximumNumberOfMethod",av)));

    realSb.append(TEXT_442);
     if (customMaximumNumberOfPrefixCode == null && customMaximumNumberOfPostfixCode == null) { 
    realSb.append(TEXT_443);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_444);
    realSb.append(av.getMultiplicity().getUpperBound());
    realSb.append(TEXT_445);
     } else { 
    realSb.append(TEXT_446);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_447);
     if (customMaximumNumberOfPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customMaximumNumberOfPrefixCode, "    ")); } 
    realSb.append(TEXT_448);
    realSb.append(av.getMultiplicity().getUpperBound());
    realSb.append(TEXT_449);
     if (customMaximumNumberOfPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customMaximumNumberOfPostfixCode, "    ")); } 
    realSb.append(TEXT_450);
     } 
    
    }
    
    if (hasAddManyToManyTemplateMethod)
    {
      if (addNewLine) { appendln(realSb,""); }
      addNewLine = true;
      
    /*association_AddManyToManyMethod*/
    realSb.append(TEXT_451);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_452);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_453);
     if (customAddPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_454);
     if (!av.getMultiplicity().isUpperBoundMany()) { 
    realSb.append(TEXT_455);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_456);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_457);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_458);
     } 
    realSb.append(TEXT_459);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_460);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_461);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_462);
    realSb.append(gen.relatedTranslate("indexOfMethod",av));
    realSb.append(TEXT_463);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_464);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_465);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_466);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_467);
    
    }
    
    if (hasRemoveManyTemplateMethod)
    {
      if (addNewLine) { appendln(realSb,""); }
      addNewLine = true;
      
    /*association_RemoveMany*/
    realSb.append(TEXT_468);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_469);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_470);
     if (customRemovePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_471);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_472);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_473);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_474);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_475);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_476);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_477);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_478);
    realSb.append(gen.relatedTranslate("indexOfMethod",av));
    realSb.append(TEXT_479);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_480);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_481);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_482);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_483);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_484);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_485);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_486);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_487);
    
    }

    if (addNewLine) { appendln(realSb,""); }
    addNewLine = true;
    
    
    
    // How do you dynamically include a file in JET?!?
    if (includeFile == "association_SetUnidirectionalOptionalOne.jet")
    {
      
    /*association_SetUnidirectionalOptionalOne*/
     String accessModifier = (av.isImmutable()) ? "private" : "public"; 
    realSb.append(TEXT_488);
    realSb.append(accessModifier);
    realSb.append(TEXT_489);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_490);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_491);
     if (customSetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_492);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_493);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_494);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_495);
    
    }
    else if (includeFile == "association_SetUnidirectionalOne.jet")
    {
      
    /*association_SetUnidirectionalOne*/
     String accessModifier = (av.isImmutable()) ? "private" : "public"; 
    realSb.append(TEXT_496);
    realSb.append(accessModifier);
    realSb.append(TEXT_497);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_498);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_499);
     if (customSetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_500);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_501);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_502);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_503);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_504);
    
    }
    else if (includeFile == "association_SetOptionalOneToOne.jet")
    {
      
    /*association_SetOptionalOneToOne*/
    realSb.append(TEXT_505);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_506);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_507);
     if (customSetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_508);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_509);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_510);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_511);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_512);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_513);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_514);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_515);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "      ")); } 
    realSb.append(TEXT_516);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_517);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_518);
    realSb.append(gen.relatedTranslate("parameterOld",av));
    realSb.append(TEXT_519);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_520);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_521);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_522);
    realSb.append(gen.relatedTranslate("parameterOld",av));
    realSb.append(TEXT_523);
    realSb.append(gen.relatedTranslate("parameterOld",av));
    realSb.append(TEXT_524);
    realSb.append(gen.relatedTranslate("parameterOld",av));
    realSb.append(TEXT_525);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_526);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_527);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_528);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_529);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_530);
    
    }
    else if (includeFile == "association_SetOneToOptionalOne.jet")
    {
      
    /*association_SetOneToOptionalOne*/
    realSb.append(TEXT_531);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_532);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_533);
     if (customSetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_534);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_535);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_536);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_537);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_538);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_539);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_540);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_541);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_542);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_543);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_544);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_545);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_546);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_547);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_548);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_549);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_550);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_551);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_552);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_553);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_554);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_555);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_556);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_557);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_558);
    
    }
    else if (includeFile == "association_AddMandatoryManyToOne.jet")
    {
      
    /*association_AddMandatoryManyToOne*/
    realSb.append(TEXT_559);
    realSb.append(gen.translate("addViaMethod",av));
    realSb.append(TEXT_560);
    realSb.append(gen.translate("methodArgumentsExcept",relatedAssociation));
    realSb.append(TEXT_561);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_562);
    realSb.append(gen.translate("callerArgumentsExcept",relatedAssociation));
    realSb.append(TEXT_563);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_564);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_565);
     if (customAddPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_566);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_567);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_568);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_569);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_570);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_571);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_572);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_573);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_574);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_575);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_576);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_577);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_578);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_579);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_580);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_581);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_582);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_583);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_584);
     if (customRemovePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_585);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_586);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_587);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_588);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_589);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_590);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_591);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_592);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_593);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_594);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_595);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_596);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_597);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_598);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_599);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_600);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_601);
    
    }
    else if (includeFile == "association_AddMNToOnlyOne.jet")
    {
      
    /*association_AddMNToOnlyOne*/
    realSb.append(TEXT_602);
    realSb.append(gen.translate("addViaMethod",av));
    realSb.append(TEXT_603);
    realSb.append(gen.translate("methodArgumentsExcept",relatedAssociation));
    realSb.append(TEXT_604);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_605);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_606);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_607);
    realSb.append(gen.translate("callerArgumentsExcept",relatedAssociation));
    realSb.append(TEXT_608);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_609);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_610);
     if (customAddPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_611);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_612);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_613);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_614);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_615);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_616);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_617);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_618);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_619);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_620);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_621);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_622);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_623);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_624);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_625);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_626);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_627);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_628);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_629);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_630);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_631);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_632);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_633);
     if (customRemovePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_634);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_635);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_636);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_637);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_638);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_639);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_640);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_641);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_642);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_643);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_644);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_645);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_646);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_647);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_648);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_649);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_650);
    
    }
    else if (includeFile == "association_AddOptionalNToOne.jet")
    {
      
    /*association_AddOptionalNToOne*/
    realSb.append(TEXT_651);
    realSb.append(gen.translate("addViaMethod",av));
    realSb.append(TEXT_652);
    realSb.append(gen.translate("methodArgumentsExcept",relatedAssociation));
    realSb.append(TEXT_653);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_654);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_655);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_656);
    realSb.append(gen.translate("callerArgumentsExcept",relatedAssociation));
    realSb.append(TEXT_657);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_658);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_659);
     if (customAddPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_660);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_661);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_662);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_663);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_664);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_665);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_666);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_667);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_668);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_669);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_670);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_671);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_672);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_673);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_674);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_675);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_676);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_677);
     if (customRemovePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_678);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_679);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_680);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_681);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_682);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_683);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_684);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_685);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_686);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_687);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_688);
    
    }
    else if (includeFile == "association_SetOptionalNToMany.jet")
    {
      
    /*association_SetOptionalNToMany*/
    realSb.append(TEXT_689);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_690);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_691);
     if (customSetManyPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_692);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_693);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_694);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_695);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_696);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_697);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_698);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_699);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_700);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_701);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_702);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_703);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_704);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_705);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_706);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_707);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_708);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_709);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_710);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_711);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_712);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_713);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_714);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_715);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_716);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_717);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_718);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_719);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_720);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_721);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_722);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_723);
    
    }
    else if (includeFile == "association_AddManyToOne.jet")
    {
      
    /*association_AddManyToOne*/
    realSb.append(TEXT_724);
    realSb.append(gen.translate("addViaMethod",av));
    realSb.append(TEXT_725);
    realSb.append(gen.translate("methodArgumentsExcept",relatedAssociation));
    realSb.append(TEXT_726);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_727);
    realSb.append(gen.translate("callerArgumentsExcept",relatedAssociation));
    realSb.append(TEXT_728);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_729);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_730);
     if (customAddPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_731);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_732);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_733);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_734);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_735);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_736);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_737);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_738);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_739);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_740);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_741);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_742);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_743);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_744);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_745);
     if (customRemovePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_746);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_747);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_748);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_749);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_750);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_751);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_752);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_753);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_754);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_755);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_756);
    
    }
    else if (includeFile == "association_SetOptionalOneToOptionalOne.jet")
    {
      
    /*association_SetOptionalOneToOptionalOne*/
    realSb.append(TEXT_757);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_758);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_759);
     if (customSetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_760);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_761);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_762);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_763);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_764);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_765);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_766);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_767);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_768);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_769);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_770);
    realSb.append(gen.translate("parameterCurrent",av));
    realSb.append(TEXT_771);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_772);
    realSb.append(gen.translate("parameterCurrent",av));
    realSb.append(TEXT_773);
    realSb.append(gen.translate("parameterCurrent",av));
    realSb.append(TEXT_774);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_775);
    realSb.append(gen.translate("parameterCurrent",av));
    realSb.append(TEXT_776);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_777);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_778);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_779);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_780);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_781);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_782);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_783);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_784);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_785);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_786);
    
    }
    else if (includeFile == "association_AddMNToMany.jet")
    {
      
    /*association_AddMNToMany*/
    realSb.append(TEXT_787);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_788);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_789);
     if (customRemovePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_790);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_791);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_792);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_793);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_794);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_795);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_796);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_797);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_798);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_799);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_800);
    realSb.append(gen.relatedTranslate("indexOfMethod",av));
    realSb.append(TEXT_801);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_802);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_803);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_804);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_805);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_806);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_807);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_808);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_809);
    
    }
    else if (includeFile == "association_AddMStarToMany.jet")
    {
      
    /*association_AddMStarToMany*/
    realSb.append(TEXT_810);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_811);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_812);
     if (customRemovePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_813);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_814);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_815);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_816);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_817);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_818);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_819);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_820);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_821);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_822);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_823);
    realSb.append(gen.relatedTranslate("indexOfMethod",av));
    realSb.append(TEXT_824);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_825);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_826);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_827);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_828);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_829);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_830);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_831);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_832);
    
    }
    else if (includeFile == "association_SetOptionalOneToOptionalN.jet")
    {
      
    /*association_SetOptionalOneToOptionalN*/
    realSb.append(TEXT_833);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_834);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_835);
     if (customSetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_836);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_837);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_838);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_839);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_840);
    realSb.append(gen.relatedTranslate("maximumNumberOfMethod",av));
    realSb.append(TEXT_841);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_842);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_843);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_844);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_845);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_846);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_847);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_848);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_849);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_850);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_851);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_852);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_853);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_854);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_855);
    
    }
    else if (includeFile == "association_SetOneToMany.jet")
    {
      
    /*association_SetOneToMany*/
    realSb.append(TEXT_856);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_857);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_858);
     if (customSetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_859);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_860);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_861);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_862);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_863);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_864);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_865);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_866);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_867);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_868);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_869);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_870);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_871);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_872);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_873);
    
    }
    else if (includeFile == "association_SetOneToManyAssociationClass.jet")
    {
      
    /*association_SetOneToManyAssociationClass*/
    realSb.append(TEXT_874);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_875);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_876);
     if (customSetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_877);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_878);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_879);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_880);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_881);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_882);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_883);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_884);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_885);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_886);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_887);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_888);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_889);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_890);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_891);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_892);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_893);
    
    }
    else if (includeFile == "association_SetOneToAtMostN.jet")
    {
      
    /*association_SetOneToAtMostN*/
    realSb.append(TEXT_894);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_895);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_896);
     if (customSetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_897);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_898);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_899);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_900);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_901);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_902);
    realSb.append(relatedAssociation.getMultiplicity().getUpperBound());
    realSb.append(TEXT_903);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_904);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_905);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_906);
    realSb.append(gen.relatedTranslate("maximumNumberOfMethod",av));
    realSb.append(TEXT_907);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_908);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_909);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_910);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_911);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_912);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_913);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_914);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_915);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_916);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_917);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_918);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_919);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "        ")); } 
    realSb.append(TEXT_920);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_921);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_922);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_923);
    
    }
    else if (includeFile == "association_SetOneToMandatoryMany.jet")
    {
      
    /*association_SetOneToMandatoryMany*/
    realSb.append(TEXT_924);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_925);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_926);
     if (customSetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_927);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_928);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_929);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_930);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_931);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_932);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_933);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_934);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_935);
    realSb.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    realSb.append(TEXT_936);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_937);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_938);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_939);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_940);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_941);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_942);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_943);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_944);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_945);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_946);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_947);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_948);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "        ")); } 
    realSb.append(TEXT_949);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_950);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_951);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_952);
    
    }
    else if (includeFile == "association_AddManyToOptionalOne.jet")
    {
      
    /*association_AddManyToOptionalOne*/
    realSb.append(TEXT_953);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_954);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_955);
     if (customAddPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_956);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_957);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_958);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_959);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_960);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_961);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_962);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_963);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_964);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_965);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_966);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_967);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_968);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_969);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_970);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_971);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_972);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_973);
     if (customRemovePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_974);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_975);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_976);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_977);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_978);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_979);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_980);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_981);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_982);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_983);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_984);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_985);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_986);
    
    }
    else if (includeFile == "association_SetOptionalOneToMany.jet")
    {
      
    /*association_SetOptionalOneToMany*/
    realSb.append(TEXT_987);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_988);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_989);
     if (customSetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_990);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_991);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_992);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_993);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_994);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_995);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_996);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_997);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_998);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_999);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1000);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1001);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1002);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1003);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1004);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_1005);
    
    }
    else if (includeFile == "association_AddOptionalNToOptionalOne.jet")
    {
      
    /*association_AddOptionalNToOptionalOne*/
    realSb.append(TEXT_1006);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1007);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1008);
     if (customAddPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_1009);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1010);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1011);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_1012);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1013);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1014);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1015);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1016);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1017);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1018);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1019);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1020);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1021);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1022);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1023);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1024);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1025);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1026);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_1027);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1028);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1029);
     if (customRemovePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1030);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_1031);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1032);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1033);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_1034);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1035);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1036);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1037);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1038);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1039);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1040);
    
    }
    else if (includeFile == "association_AddUnidirectionalMN.jet")
    {
      
    /*association_AddUnidirectionalMN*/
    realSb.append(TEXT_1041);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1042);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1043);
     if (customAddPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_1044);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1045);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1046);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1047);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1048);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_1049);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1050);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1051);
     if (customRemovePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1052);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_1053);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1054);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_1055);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1056);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1057);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_1058);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1059);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_1060);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1061);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1062);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1063);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1064);
    
    }
    else if (includeFile == "association_AddMNToOptionalOne.jet")
    {
      
    /*association_AddMNToOptionalOne*/
    realSb.append(TEXT_1065);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1066);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1067);
     if (customAddPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_1068);
     if (!av.isStar()) { 
    realSb.append(TEXT_1069);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1070);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1071);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_1072);
     } 
    realSb.append(TEXT_1073);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1074);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1075);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1076);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1077);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1078);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1079);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1080);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_1081);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1082);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1083);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1084);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1085);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_1086);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1087);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1088);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1089);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1090);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1091);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1092);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1093);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1094);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1095);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_1096);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1097);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1098);
     if (customRemovePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1099);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_1100);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1101);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1102);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1103);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1104);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_1105);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1106);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1107);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1108);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1109);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1110);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1111);
    
    }
    else if (includeFile == "association_SetNToOptionalOne.jet")
    {
      
    /*association_SetNToOptionalOne*/
    realSb.append(TEXT_1112);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_1113);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1114);
     if (customSetManyPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_1115);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1116);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1117);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1118);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1119);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1120);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "        ")); } 
    realSb.append(TEXT_1121);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1122);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1123);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1124);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1125);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "        ")); } 
    realSb.append(TEXT_1126);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1127);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1128);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1129);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1130);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_1131);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1132);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1133);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1134);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1135);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1136);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1137);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1138);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1139);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1140);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1141);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_1142);
    /*association_GetPrivate*/
    realSb.append(TEXT_1143);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1144);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1145);
    realSb.append(gen.relatedTranslate("parameterOne",av));
    realSb.append(TEXT_1146);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1147);
    realSb.append(gen.relatedTranslate("parameterOne",av));
    realSb.append(TEXT_1148);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1149);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1150);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1151);
    realSb.append(gen.relatedTranslate("parameterOne",av));
    realSb.append(TEXT_1152);
    
    }
    else if (includeFile == "association_AddUnidirectionalMany.jet")
    {
      
    /*association_AddUnidirectionalMany*/
    realSb.append(TEXT_1153);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1154);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1155);
     if (customAddPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_1156);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1157);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1158);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_1159);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1160);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1161);
     if (customRemovePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1162);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_1163);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1164);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1165);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_1166);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1167);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1168);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1169);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1170);
    
    }
    else if (includeFile == "association_AddUnidirectionalOptionalN.jet")
    {
      
    /*association_AddUnidirectionalOptionalN*/
    realSb.append(TEXT_1171);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1172);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1173);
     if (customAddPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_1174);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1175);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1176);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1177);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1178);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_1179);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1180);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1181);
     if (customRemovePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1182);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_1183);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1184);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1185);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_1186);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1187);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1188);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1189);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1190);
    
    }
    else if (includeFile == "association_AddUnidirectionalMStar.jet")
    {
      
    /*association_AddUnidirectionalMStar*/
    realSb.append(TEXT_1191);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1192);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1193);
     if (customAddPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_1194);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1195);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1196);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_1197);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1198);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1199);
     if (customRemovePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1200);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_1201);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1202);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_1203);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1204);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1205);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_1206);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1207);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_1208);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1209);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1210);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1211);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1212);
    
    }
    else if (includeFile == "association_SetUnidirectionalN.jet")
    {
      
    /*association_SetUnidirectionalN*/
     String accessModifier = (av.isImmutable()) ? "private" : "public"; 
    realSb.append(TEXT_1213);
    realSb.append(accessModifier);
    realSb.append(TEXT_1214);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_1215);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1216);
     if (customSetManyPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_1217);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1218);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1219);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1220);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1221);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1222);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1223);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1224);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1225);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1226);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1227);
    realSb.append(gen.translate("requiredNumberOfMethod",av));
    realSb.append(TEXT_1228);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_1229);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1230);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1231);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_1232);
    
    }
    else if (includeFile == "association_SetUnidirectionalMany.jet")
    {
      
    /*association_SetUnidirectionalMany*/
     String accessModifier = (av.isImmutable()) ? "private" : "public"; 
    realSb.append(TEXT_1233);
    realSb.append(accessModifier);
    realSb.append(TEXT_1234);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_1235);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1236);
     if (customSetManyPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_1237);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1238);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1239);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1240);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1241);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1242);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1243);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1244);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1245);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1246);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_1247);
    realSb.append(instanceIdentifier);
    realSb.append(TEXT_1248);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1249);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1250);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_1251);
    
    }
  else if (includeFile == "association_SetOptionalOneToMandatoryMany.jet")
    {
      
    /*association_SetOptionalOneToMandatoryMany*/
    realSb.append(TEXT_1252);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_1253);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1254);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1255);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1256);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1257);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1258);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1259);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1260);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1261);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1262);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1263);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1264);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1265);
    realSb.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1266);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1267);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_1268);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1269);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1270);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1271);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1272);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1273);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1274);
    realSb.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1275);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1276);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_1277);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1278);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1279);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1280);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1281);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1282);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1283);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1284);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1285);
    
    }
    else if (includeFile == "association_SetOptionalOneToMandatoryMN.jet")
    {
      
    /*association_SetOptionalOneToMandatoryMN*/
    realSb.append(TEXT_1286);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_1287);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1288);
    realSb.append(gen.relatedTranslate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1289);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1290);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1291);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1292);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1293);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1294);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1295);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1296);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1297);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1298);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1299);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1300);
    realSb.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1301);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1302);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_1303);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1304);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1305);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1306);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1307);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1308);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1309);
    realSb.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1310);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1311);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_1312);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1313);
    realSb.append(gen.relatedTranslate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1314);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1315);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_1316);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1317);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1318);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1319);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1320);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1321);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1322);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1323);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1324);
    
    }
    else if (includeFile != null)
    {
      appendln(realSb,"You forgot to include {0}",includeFile);
    }
    
    
    
    if (includeFile2 == "association_SetMNToMany.jet")
    {
      
    /*association_SetMNToMany*/
    realSb.append(TEXT_1325);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_1326);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1327);
     if (customSetManyPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_1328);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1329);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1330);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1331);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1332);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1333);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1334);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1335);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1336);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1337);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1338);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1339);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1340);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1341);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_1342);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1343);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1344);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1345);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1346);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1347);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1348);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1349);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1350);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1351);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1352);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1353);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1354);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1355);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1356);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1357);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_1358);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_1359);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1360);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_1361);
    
    }
    else if (includeFile2 == "association_SetMStarToMany.jet")
    {
      
    /*association_SetMStarToMany*/
    realSb.append(TEXT_1362);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_1363);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1364);
     if (customSetManyPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_1365);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1366);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1367);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1368);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1369);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1370);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1371);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1372);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1373);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1374);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1375);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1376);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_1377);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1378);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1379);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1380);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1381);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1382);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1383);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1384);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1385);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1386);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1387);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1388);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1389);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1390);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1391);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1392);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_1393);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_1394);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1395);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_1396);
    
    }
    else if (includeFile2 == "association_SetUnidirectionalMN.jet")
    {
      
    /*association_SetUnidirectionalMN*/
     String accessModifier = (av.isImmutable()) ? "private" : "public"; 
    realSb.append(TEXT_1397);
    realSb.append(accessModifier);
    realSb.append(TEXT_1398);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_1399);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1400);
     if (customSetManyPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_1401);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1402);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1403);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1404);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1405);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1406);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1407);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1408);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1409);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1410);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1411);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1412);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1413);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1414);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_1415);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1416);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1417);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_1418);
    
    }
    else if (includeFile2 == "association_SetMNToOptionalOne.jet")
    {
      
    /*association_SetMNToOptionalOne*/
    
  String existingToNewMap = StringFormatter.format("{0}ToNew{1}", relatedAssociation.getName(), av.getUpperCaseName());
  String orCheckMaxBound = av.isStar() ? "" : StringFormatter.format(" || count(${0}) > self::{1}()", gen.translate("parameterMany",av), gen.translate("maximumNumberOfMethod",av));

    realSb.append(TEXT_1419);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_1420);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1421);
     if (customSetManyPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_1422);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1423);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1424);
    realSb.append(orCheckMaxBound);
    realSb.append(TEXT_1425);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_1426);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1427);
    realSb.append(existingToNewMap);
    realSb.append(TEXT_1428);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1429);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1430);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1431);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1432);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "        ")); } 
    realSb.append(TEXT_1433);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1434);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1435);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1436);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1437);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1438);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1439);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1440);
    realSb.append(gen.relatedTranslate("parameterExistingSerialized",av));
    realSb.append(TEXT_1441);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1442);
    realSb.append(gen.relatedTranslate("parameterExistingSerialized",av));
    realSb.append(TEXT_1443);
    realSb.append(existingToNewMap);
    realSb.append(TEXT_1444);
    realSb.append(existingToNewMap);
    realSb.append(TEXT_1445);
    realSb.append(gen.relatedTranslate("parameterExistingSerialized",av));
    realSb.append(TEXT_1446);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1447);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1448);
    realSb.append(existingToNewMap);
    realSb.append(TEXT_1449);
    realSb.append(gen.relatedTranslate("parameterExistingSerialized",av));
    realSb.append(TEXT_1450);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1451);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "        ")); } 
    realSb.append(TEXT_1452);
    realSb.append(existingToNewMap);
    realSb.append(TEXT_1453);
    realSb.append(gen.relatedTranslate("parameterExistingSerialized",av));
    realSb.append(TEXT_1454);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1455);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1456);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1457);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1458);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1459);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1460);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1461);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1462);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1463);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1464);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1465);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1466);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1467);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1468);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1469);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_1470);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1471);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1472);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1473);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1474);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1475);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1476);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1477);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1478);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1479);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1480);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1481);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_1482);
    /*association_GetPrivate*/
    realSb.append(TEXT_1143);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1144);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1145);
    realSb.append(gen.relatedTranslate("parameterOne",av));
    realSb.append(TEXT_1146);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1147);
    realSb.append(gen.relatedTranslate("parameterOne",av));
    realSb.append(TEXT_1148);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1149);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1150);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1151);
    realSb.append(gen.relatedTranslate("parameterOne",av));
    realSb.append(TEXT_1152);
    
    }
    else if (includeFile2 == "association_SetUnidirectionalOptionalN.jet")
    {
      
    /*association_SetUnidirectionalOptionalN*/
     String accessModifier = (av.isImmutable()) ? "private" : "public"; 
    realSb.append(TEXT_1483);
    realSb.append(accessModifier);
    realSb.append(TEXT_1484);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_1485);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1486);
     if (customSetManyPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_1487);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1488);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1489);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1490);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1491);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1492);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1493);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1494);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1495);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1496);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1497);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1498);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_1499);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1500);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1501);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_1502);
    
    }
    else if (includeFile2 == "association_SetUnidirectionalMStar.jet")
    {
      
    /*association_SetUnidirectionalMStar*/
     String accessModifier = (av.isImmutable()) ? "private" : "public"; 
    realSb.append(TEXT_1503);
    realSb.append(accessModifier);
    realSb.append(TEXT_1504);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_1505);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1506);
     if (customSetManyPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_1507);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1508);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1509);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1510);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1511);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1512);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1513);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1514);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1515);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1516);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1517);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1518);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_1519);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1520);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1521);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_1522);
    
    }
    else if (includeFile2 != null)
    {
      appendln(realSb,"You forgot to include {0}",includeFile2);
    }
    
    if(includeFile3 == "association_Sort.jet" && !sortMethodAdded)
    {
      
    /*association_Sort*/
    
      sortMethodAdded = true; //after the sort method has been added, this boolean stops it from being added again
    }
    else if(includeFile3 == "association_AddIndexControlFunctions.jet")
    {
      
    /*association_AddIndexControlFunctions*/
    realSb.append(TEXT_1523);
    realSb.append(gen.translate("addAtMethod",av));
    realSb.append(TEXT_1524);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1525);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1526);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1527);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1528);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1529);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1530);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_1531);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1532);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1533);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1534);
    realSb.append(gen.translate("addOrMoveAtMethod",av));
    realSb.append(TEXT_1535);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1536);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_1537);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1538);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1539);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1540);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1541);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_1542);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1543);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1544);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1545);
    realSb.append(gen.translate("addAtMethod",av));
    realSb.append(TEXT_1546);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1547);
    
    }
  }
  gen.setParameterConstraintName("");

    realSb.append(TEXT_1548);
     if (uClass.getKey().isProvided()) { 
    /*equals*/
    

  StringBuilder checks = new StringBuilder();
  StringBuilder hash = new StringBuilder();
  StringBuilder canSet = new StringBuilder();
  
  for(String memberId : uClass.getKey().getMembers())
  {
    Attribute av = uClass.getAttribute(memberId);
    AssociationVariable as = uClass.getAssociationVariable(memberId);
    if (av != null)
    {
      String attributeLabel = av.getIsList() ? "attributeMany" : "attributeOne";
      canSet.append(StringFormatter.format("    $this->{0} = false;\n",gen.translate("attributeCanSet",av)));
      checks.append(StringFormatter.format("    if ($this->{0} != $compareTo->{0})\n",gen.translate(attributeLabel,av)));
      checks.append(StringFormatter.format("    {\n"));
      checks.append(StringFormatter.format("      return false;\n"));
      checks.append(StringFormatter.format("    }\n"));
      checks.append("\n");
    }
    else if (as != null)
    {
      String associationLabel = as.isMany() ? "associationMany" : "associationOne";
      canSet.append(StringFormatter.format("    $this->{0} = false;\n",gen.translate("associationCanSet",as)));
      checks.append(StringFormatter.format("    if ($this->{0} != $compareTo->{0})\n",gen.translate(associationLabel,as)));
      checks.append(StringFormatter.format("    {\n"));
      checks.append(StringFormatter.format("      return false;\n"));
      checks.append(StringFormatter.format("    }\n"));
      checks.append("\n");
    }
    
    if (av != null)
    {
      if (("Integer".equals(av.getType()) || "Double".equals(av.getType())) && !av.getIsList())
      {
        hash.append(StringFormatter.format("    $this->cachedHashCode = $this->cachedHashCode * 23 + $this->{0};\n",gen.translate("attributeOne",av)));
      }
      else if ("Boolean".equals(av.getType()) && !av.getIsList())
      {
        hash.append(StringFormatter.format("    $this->cachedHashCode = $this->cachedHashCode * 23 + ($this->{0} ? 1 : 0);\n",gen.translate("attributeOne",av)));
      }
      else
      {
        String attributeType = av.getIsList() ? "attributeMany" : "attributeOne";
        hash.append(StringFormatter.format("    if ($this->{0} != null)\n",gen.translate(attributeType,av)));
        hash.append(StringFormatter.format("    {\n"));
        hash.append(StringFormatter.format("      $this->cachedHashCode = $this->cachedHashCode * 23 + spl_object_hash($this->{0});\n",gen.translate(attributeType,av)));
        hash.append(StringFormatter.format("    }\n"));
        hash.append(StringFormatter.format("    else\n"));
        hash.append(StringFormatter.format("    {\n"));
        hash.append(StringFormatter.format("      $this->cachedHashCode = $this->cachedHashCode * 23;\n"));
        hash.append(StringFormatter.format("    }\n"));
      }
      hash.append("\n");
    }
    else if (as != null)
    {
      String attributeType = as.isOne() ? "attributeOne" : "attributeMany";
      hash.append(StringFormatter.format("    if ($this->{0} != null)\n",gen.translate(attributeType,as)));
      hash.append(StringFormatter.format("    {\n"));
      hash.append(StringFormatter.format("      $this->cachedHashCode = $this->cachedHashCode * 23 + spl_object_hash($this->{0});\n",gen.translate(attributeType,as)));
      hash.append(StringFormatter.format("    }\n"));
      hash.append(StringFormatter.format("    else\n"));
      hash.append(StringFormatter.format("    {\n"));
      hash.append(StringFormatter.format("      $this->cachedHashCode = $this->cachedHashCode * 23;\n"));
      hash.append(StringFormatter.format("    }\n"));
    }
  }


    realSb.append(TEXT_1549);
    realSb.append(checks.toString().trim());
    realSb.append(TEXT_1550);
    realSb.append(hash.toString().trim());
    realSb.append(TEXT_1551);
    realSb.append(canSet.toString().trim());
    realSb.append(TEXT_1552);
    realSb.append(TEXT_1553);
     } else { 
    /*equals_default*/
    realSb.append(TEXT_1554);
    realSb.append(TEXT_1555);
     } 
    /*delete_All*/
    

  appendln(realSb,"");
  appendln(realSb,"  public function delete()");
  append(realSb,"  {");

  boolean hasSomethingToDelete = false;

  String customDeletePrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before","delete"));
  String customDeletePostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after","delete"));

  if (customDeletePrefixCode != null) 
  {
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customDeletePrefixCode, "    "));
    hasSomethingToDelete = true;
  }

  for (AssociationVariable av : uClass.getAssociationVariables()) 
  {
    AssociationVariable relatedAssociation = av.getRelatedAssociation();
    
    if (!av.getIsNavigable() || av.isImmutable())
    {
      continue;
    }
    
    if (!relatedAssociation.getIsNavigable())
    {
      if (av.isOne())
      {
        hasSomethingToDelete = true;
        
    /*delete_UndirectionalOne*/
    realSb.append(TEXT_1556);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1557);
    
      }
      else if (av.isMany())
      {
        hasSomethingToDelete = true;
        
    /*delete_UndirectionalMany*/
    realSb.append(TEXT_1558);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1559);
    
      }
      continue;
    }
    
    if (relatedAssociation.getIsComposition()) {
    	if ((relatedAssociation.isOnlyOne() || relatedAssociation.isOptionalOne()) && av.isOnlyOne()) {
    		
    /*delete_OneFromOne*/
    realSb.append(TEXT_1560);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1561);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1562);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1563);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1564);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1565);
    
    	}
    	else if ((relatedAssociation.isOnlyOne() || relatedAssociation.isOptionalOne()) && av.isOptionalOne()) {
    		
    /*delete_OptionalOneFromOne_comp*/
    realSb.append(TEXT_1566);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1567);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1568);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1569);
    
    	}
    	else if ((relatedAssociation.isOnlyOne() || relatedAssociation.isOptionalOne()) && av.isMany()) {
    		
    /*delete_ManyFromX_comp*/
    realSb.append(TEXT_1570);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1571);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1572);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1573);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1574);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1575);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1576);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_1577);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1578);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1579);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1580);
    
    	}
    	
    	else if (relatedAssociation.isMany() && av.isOnlyOne()) {
    		
    /*delete_OneFromOne*/
    realSb.append(TEXT_1560);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1561);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1562);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1563);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1564);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1565);
    
    	}
    	else if (relatedAssociation.isMany() && av.isOptionalOne()) {
    	    
    /*delete_OptionalOneFromOne_comp*/
    realSb.append(TEXT_1566);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1567);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1568);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1569);
    
    	}
	else if (relatedAssociation.isMany() && av.isMany()) {
    	    
    /*delete_ManyFromX_comp*/
    realSb.append(TEXT_1570);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1571);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1572);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1573);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1574);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1575);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1576);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_1577);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1578);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1579);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1580);
    
    	}
    	else {
    		continue;
    	}
    	
    	
    }
    
    else if (av.getIsComposition() && (av.isMany() && relatedAssociation.isOnlyOne())) { 
    	// normally this is the same for compositions, except for ManyToOne, the
    	// list has to be cleared on the Many end (here, the ones are successfully deleted, 
    	// but they are not removed from the list)
  		// this functionality is not present for compositions, since, in the case
  		// of deleting one from many, this would be on the composition end, and OneFromOne would
  		// be called so the object is actually deleted. 	
  
    	
    /*delete_ManyFromX_comp*/
    realSb.append(TEXT_1570);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1571);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1572);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1573);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1574);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1575);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1576);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_1577);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1578);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1579);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1580);
    
	  
    }
    
    else if (av.getIsComposition() && (av.isMany() && relatedAssociation.isOptionalOne() && !av.isMandatory())) { 
    	
    	
    /*delete_OptionalOneFromMany_comp*/
    realSb.append(TEXT_1581);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1582);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1583);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1584);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1585);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1586);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1587);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1588);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1589);
    
	  
    }
    
    else if (av.getIsComposition() && (av.isOptionalOne() && relatedAssociation.getMultiplicity().getLowerBound() > 1  && relatedAssociation.getMultiplicity().getLowerBound() != relatedAssociation.getMultiplicity().getUpperBound())) { 
    	
    	
    /*delete_OptionalOneFromMN_comp*/
    realSb.append(TEXT_1590);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1591);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1592);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_1593);
    realSb.append(relatedAssociation.getMultiplicity().getLowerBound());
    realSb.append(TEXT_1594);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1595);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1596);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1597);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1598);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1599);
    
	  
    }

    else if (av.getIsComposition() && av.isMany() && relatedAssociation.isOptionalOne()) {
    	    
    /*delete_OptionalOneFromMany_comp*/
    realSb.append(TEXT_1581);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1582);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1583);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1584);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1585);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1586);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1587);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1588);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1589);
    
    }
    
    else {
    
	    if (av.isOnlyOne() && relatedAssociation.isOnlyOne())
	    {
	      
    /*delete_OneFromOne*/
    realSb.append(TEXT_1560);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1561);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1562);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1563);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1564);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1565);
    
	    }
	    else if (av.isOptionalOne() && relatedAssociation.isOptionalOne())
	    {
	      
    /*delete_OptionalOneFromOptionalOne*/
    realSb.append(TEXT_1600);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1601);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1602);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1603);
    
	    }
	    else if (av.isOnlyOne() && relatedAssociation.isOptionalOne())
	    {
	      
    /*delete_OneFromOptionalOne*/
    realSb.append(TEXT_1604);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1605);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1606);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1607);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1608);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1609);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1610);
    
	    }
	    else if (av.isOptionalOne() && relatedAssociation.isOnlyOne())
	    {
	      
    /*delete_OptionalOneFromOne*/
    realSb.append(TEXT_1611);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1612);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1613);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1614);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1615);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1616);
    
	    }
	    else if (av.isOptionalOne() && relatedAssociation.isOptionalMany())
	    {
	      
    /*delete_OptionalOneFromMany*/
    realSb.append(TEXT_1617);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1618);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1619);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1620);
    
	    }
	    else if (av.isOptionalOne() && relatedAssociation.isN())
	    {
	      
    /*delete_OptionalOneFromN*/
    realSb.append(TEXT_1621);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1622);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1623);
    
	    }
	    else if (av.isOptionalOne() && relatedAssociation.isMN())
	    {
	      
    /*delete_OptionalOneFromMN*/
    realSb.append(TEXT_1624);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1625);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1626);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_1627);
    realSb.append(relatedAssociation.getMultiplicity().getLowerBound());
    realSb.append(TEXT_1628);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1629);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1630);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1631);
    
	    }
	    else if (av.isOne() && relatedAssociation.isMany())
	    {
	      
    /*delete_OneFromMany*/
    realSb.append(TEXT_1632);
    realSb.append(gen.translate("removeParameterOne",av));
    realSb.append(TEXT_1633);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1634);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1635);
    realSb.append(gen.translate("removeParameterOne",av));
    realSb.append(TEXT_1636);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1637);
    
	    }
	    else if (av.isMandatory() && relatedAssociation.isOptionalOne())
	    {
	      
    /*delete_MandatoryFromOptionalOne*/
    realSb.append(TEXT_1638);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1639);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1640);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1641);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1642);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1643);
    
	    }
	    else if (av.isMany() && (relatedAssociation.isMN() || relatedAssociation.isN()))
	    {
	      
    /*delete_ManyFromMN*/
    realSb.append(TEXT_1644);
    realSb.append(gen.translate("parameterCopyOfMany",av));
    realSb.append(TEXT_1645);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1646);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1647);
    realSb.append(gen.translate("parameterCopyOfMany",av));
    realSb.append(TEXT_1648);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1649);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1650);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_1651);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1652);
    realSb.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1653);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1654);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1655);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1656);
    
	    }
	    else if (av.isMany() && relatedAssociation.isMany())
	    {
	      
    /*delete_ManyFromMany*/
    realSb.append(TEXT_1657);
    realSb.append(gen.translate("parameterCopyOfMany",av));
    realSb.append(TEXT_1658);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1659);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1660);
    realSb.append(gen.translate("parameterCopyOfMany",av));
    realSb.append(TEXT_1661);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1662);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1663);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1664);
    
	    }
	    else if (av.isMany() && relatedAssociation.isOnlyOne()) 
	    {
	      
    /*delete_ManyFromOne*/
    realSb.append(TEXT_1665);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1666);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1667);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1668);
    
	    }
	    else if (av.isMany() && relatedAssociation.isOptionalOne())
	    {
	      
    /*delete_ManyFromOptionalOne*/
    realSb.append(TEXT_1669);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1670);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1671);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1672);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1673);
    
	    }
	    else
	    {
	      continue;
	    }
	}
    hasSomethingToDelete = true;
  }
  
  if (!uClass.isRoot() && !"external".equals(uClass.getExtendsClass().getModifier()))
  {
    hasSomethingToDelete = true;
    appendln(realSb,"");
    append(realSb, "    parent::delete();");
  }

  if (customDeletePostfixCode != null) 
  {
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customDeletePostfixCode, "    "));
    hasSomethingToDelete = true;
  }
  
  if (hasSomethingToDelete)
  {
    appendln(realSb, "");
    appendln(realSb, "  }");
  }
  else
  {
    appendln(realSb, "}");
  }
  
  

    realSb.append(TEXT_1674);
     if (uClass.hasMethods()) { 
    /*class_MethodDeclaration*/
    
    if (uClass.hasMethods())
    {
        // method parameters of primitives should not explicitly list the parameter type
        // ex: function f($a){} and not f(integer $a){}
        List<String> primitives = Arrays.asList("string", "boolean", "integer", "float", "double", 
                                                "String", "Boolean", "Integer", "Float", "Double");
    	for (Method aMethod : uClass.getMethods()) 
    	{
    	    if(!aMethod.getExistsInLanguage("Php") || aMethod.getSource() == Method.Source.fAutoAPI)
    		  continue;
    		String methodModifier = aMethod.getModifier().equals("") ? "public" : aMethod.getModifier();
    		String methodImplementationModifier = aMethod.getIsAbstract() ? " abstract" : "";
    		String methodName = aMethod.getName();
    		String methodType = "function";
            String customBeforeInjectionCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjectionsCustomMethod("before", aMethod.getName(), aMethod.getMethodParameters()));
            String customAfterInjectionCode  = GeneratorHelper.toCode(uClass.getApplicableCodeInjectionsCustomMethod("after", aMethod.getName(), aMethod.getMethodParameters()));
    		String customPreconditionCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", aMethod.getName()+"Precondition"));String customPostconditionCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", aMethod.getName()+"Postcondition"));
            customPostconditionCode = customPostconditionCode==null?"":customPostconditionCode;
        
    		String methodBody = aMethod.getIsImplemented() ? "      return \"\";" : aMethod.getMethodBody().getExtraCode();    		
    		
    		/*String methodBody = "";
    		if (aMethod.getMethodBody() != null && aMethod.getMethodBody().getExtraCode() != null)
    		{
    			methodBody = aMethod.getMethodBody().getExtraCode();
    		}*/
    		
    		String properMethodBody = "    " + methodBody; 
    		//String override =  aMethod.getIsImplemented() ? "  @Override" : "";
    		String paramName="";
    		String paramType="";
    		String aSingleParameter="";
    		String finalParams = "";
    		String isList="";
            String parameters = "";
    		if (aMethod.hasMethodParameters())
    		{
    			for (MethodParameter aMethodParam : aMethod.getMethodParameters()) 
    			{
    				paramName = "$" + aMethodParam.getName();
                    if (!aMethodParam.getIsList()){
                      paramType = aMethodParam.getType();
                      if (primitives.contains(paramType)) {
                        paramType = "";
                      }else{
                        paramType+=" ";}

                    }else{
                      paramType = "";
                    }
    				//isList = aMethodParam.getIsList() ? " [] " : " ";
    				aSingleParameter = paramType + isList + paramName;
        			parameters += aSingleParameter + ", ";
    			}
    			
    			finalParams = parameters.substring(0, parameters.length()-2);
        }
        
				appendln(realSb, "");
				if (aMethod.numberOfComments() > 0) { append(realSb, "\n  {0}\n", Comment.format("Method Javadoc",aMethod.getComments(),false)); }
				
  			//appendln(realSb,override);
  			append(realSb, "  {0}{1} {2} {3}({4})", methodModifier, methodImplementationModifier, methodType, methodName, finalParams);
  	  if(!"".equals(customPostconditionCode))
      {
        appendln(realSb, "\n  {");
        if(!"".equals(aMethod.getType())&&!"void".equals(aMethod.getType())){
          append(realSb, "    $result = {0}Original({1});\n", methodName, finalParams);
        }
        else {
          append(realSb, "    $this->{0}Original({1});\n", methodName, finalParams);
        }
        appendln(realSb, GeneratorHelper.doIndent(customPostconditionCode, "    "));
        if(!"".equals(aMethod.getType())&&!"void".equals(aMethod.getType())){
          append(realSb, "    return $result;\n");
        }          
        appendln(realSb, "  }");
        append(realSb, "\n  {0}{1} {2} {3}Original({4})", methodModifier, methodImplementationModifier, methodType, methodName, finalParams);
      }    
        if(aMethod.getIsAbstract())
  			{
  			  append(realSb, ";");
  			}
  			else
  			{
    			appendln(realSb, "\n  {");
    			if (customPreconditionCode != null) { append(realSb, "\n{0}\n",GeneratorHelper.doIndent(customPreconditionCode, "    "));}
    			if (customBeforeInjectionCode != null) { append(realSb, "\n{0}\n",GeneratorHelper.doIndent(customBeforeInjectionCode, "    "));}

          if(properMethodBody.contains("return"))
          {
            if(customAfterInjectionCode != null) {
              // Do some pre-processing to handle returns not being on a new line. Doing this allows us to maintain suitable indentation.
              String[] properMethodLines = properMethodBody.split("\\n");
              String fixedProperMethodBody = "";
              for(int i = 0; i < properMethodLines.length; i++) {
                if(GeneratorHelper.isValidReturnStatement(properMethodLines[i]) && !properMethodLines[i].trim().substring(0, 6).equals("return")) {
                  String[] splitLines = properMethodLines[i].split("return", 2);
                  // Determine indentation of return by adding indentation amount to previous line
                  String returnIndent = "";
                  int j = 0;
                  while(splitLines[0].charAt(j) == ' ') {
                    returnIndent += " ";
                    j++;

                  }

                  fixedProperMethodBody += returnIndent + splitLines[0].trim() + "\n";

                  String[] returnLines = splitLines[1].split(";");
                  if(returnLines.length > 1 && returnLines[1].trim().length() > 0) {
                    fixedProperMethodBody += returnIndent + "  return " + returnLines[0].trim() + ";\n" + returnIndent + returnLines[1].trim() + "\n";
                  } else {
                    fixedProperMethodBody += returnIndent + "  return " + splitLines[1].trim() + "\n";
                  }
                } else {
                  fixedProperMethodBody += properMethodLines[i] + "\n";
                }
              }

              properMethodBody = fixedProperMethodBody;

              String properMethodIndent = "";
              int indentIndex = 0;
              while(indentIndex < properMethodBody.length() && properMethodBody.charAt(indentIndex) == ' ') {
                properMethodIndent += " ";
                indentIndex++;
              }

              // inject the after injection code after every return, while appropriate indentation
              for(int i = -1; (i = properMethodBody.indexOf("return", i + 1)) != -1; ) {
                //Check if return statement is on its own line
                int lastChar = i - 1;
                while (properMethodBody.charAt(lastChar) == ' ')
                lastChar--;
                if (properMethodBody.charAt(lastChar) != '\n') // If it has any non-space characters before it, it's invalid
                  continue;
                // determine the indentation of the return
                String indent = "";
                while(i >= 1 && properMethodBody.charAt(--i) == ' ') {
                  indent += " ";
                }

                // Need to determine if block has braces surrounding it. To do this, take the previous
                // lines of code and apply some regex to remove all of the comments.
                String[] previousLinesOfCode = properMethodBody.substring(0, i+1).replaceAll("\\/\\*([\\S\\s]+?)\\*\\/", "").replaceAll("(?s)/\\*.*?\\*/", "").replaceAll("//.*$", "").replaceAll("#.*$", "").split("\\n");
                int commentLineCount = properMethodBody.substring(0, i+1).split("\\n").length - previousLinesOfCode.length;

                // set previousLine to be the first non-empty line
                int previousLine = -1;
                for(int j = previousLinesOfCode.length - 1; j >= 0; j--) {
                  if(previousLinesOfCode[j].trim().length() > 0) {
                    previousLine = j;
                    break;
                  }
                }

                String previousLineStr = previousLinesOfCode[previousLine].trim();

                // Need to subtract the number of lines of comments between the return and the previous line of code
                while(!properMethodBody.split("\\n")[previousLine + commentLineCount].trim().equals(previousLineStr)) {
                  commentLineCount--;
                }

                // If we need to, insert braces, otherwise continue as normal
                String indentedCustomAfterInjectionCode = GeneratorHelper.doIndent("\n" + customAfterInjectionCode, indent);
                String braceIndent = "";
                String brace = "";
                String braceNewLine = "";
                if(previousLine != -1 && (previousLineStr.charAt(previousLineStr.length()-1) == ')' || (previousLineStr.length() >= 4 && previousLineStr.substring(previousLineStr.length()-4).equals("else")))) {
                  String[] methodLines = properMethodBody.split("\\n");
                  previousLine += commentLineCount;

                  // determine how indented the brace is
                  int j = 0;
                  while(j < methodLines[previousLine].length() && methodLines[previousLine].charAt(j) == ' ') {
                    braceIndent += " ";
                    j++;
                  }

                  methodLines[previousLine] = braceIndent + methodLines[previousLine].trim() + " {";

                  // Set properMethodBody to be String.join(methodLines, "\\n")
                  String newProperMethodBody = "";
                  for(int k = 0; k < methodLines.length; k++) {
                    newProperMethodBody += methodLines[k];
                    if(k != methodLines.length - 1) {
                      newProperMethodBody += "\n";
                    }
                  }
                  properMethodBody = newProperMethodBody;

                  brace = "}";
                  braceNewLine = "\n";
                }

                i += indent.length() + 1;
                String[] returnAndRest = properMethodBody.substring(i).split(";", 2);
                properMethodBody = properMethodIndent + properMethodBody.substring(0, i).trim() + indentedCustomAfterInjectionCode + "\n" + indent + returnAndRest[0].trim() + ";" + braceNewLine + braceIndent + brace + returnAndRest[1];
                i += indentedCustomAfterInjectionCode.length() + braceIndent.length() + 7;
              }

              // if the last line isn't a return, insert the injection at the very end
              String[] lines = properMethodBody.split("\\n");
              if(!lines[lines.length-1].contains("return")) {
                properMethodBody += GeneratorHelper.doIndent("\n" + customAfterInjectionCode, "    ");
              }
            }
          }

    			appendln(realSb, properMethodBody);

          if(!properMethodBody.contains("return"))
          {
            if (customAfterInjectionCode != null) { append(realSb, "{0}\n",GeneratorHelper.doIndent(customAfterInjectionCode, "    "));}
          }

    			appendln(realSb, "  }");
  			}
    	}
    }

    realSb.append(TEXT_1675);
     } 
    realSb.append(TEXT_1676);
     if (uClass.getExtraCode() != null && uClass.getExtraCode().length() > 0) { 
    realSb.append(TEXT_1677);
    realSb.append(uClass.getExtraCode());
    realSb.append(TEXT_1678);
     } 
    /*trace*/
    

{

	//==== Tracing Code    
    if( model.getTraceType().equals("File") && uClass.hasTraceDirectives() )
	{
		appendln(realSb, "");
		appendln(realSb, "  //------------------------");
		appendln(realSb, "  // FILE TRACER METHOD");
		appendln(realSb, "  //------------------------\n");
		appendln(realSb, "  function fileTracer($tracedItem)");
		appendln(realSb, "  {");
		appendln(realSb, "    $file=fopen({0}TraceLog.txt{1},{3}a{4}) or exit({5}Unable to open file!{6});",'"','"','"','"','"','"','"');
		appendln(realSb, "    fprintf($file,{0}Traced object value: $tracedItem{1}.PHP_EOL);",'"','"');
		appendln(realSb, "    fprintf($file,{0}Trace time: {1}.date(DATE_RFC822).PHP_EOL);",'"','"');
		appendln(realSb, "    fclose($file);");
		appendln(realSb, "  }");
	}
}


    realSb.append(TEXT_1679);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String getCode(UmpleModel model, UmpleElement uElement){
        StringBuilder sb = new StringBuilder();
    return this._getCode(0,sb,model,uElement).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+ "]";
  }
}
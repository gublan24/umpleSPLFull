/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler.ruby;
import cruise.umple.compiler.*;
import cruise.umple.util.*;
import java.util.*;
import java.util.regex.Pattern;

// line 29 "../../../../../UmpleTLTemplates/rubyClassGenerator.ump"
public class RubyClassGenerator implements ILang
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "# PLEASE DO NOT EDIT THIS CODE" + NL + "# This code was generated using the UMPLE @UMPLE_VERSION@ modeling language!" + NL + "# NOTE: Ruby generator is experimental and is missing some features available in" + NL + "# in other Umple generated languages like Java or PHP";
  public static final String TEXT_1 = "";
  public static final String TEXT_2 = NL + NL;
  public static final String TEXT_3 = NL;
  public static final String TEXT_4 = NL + "class ";
  public static final String TEXT_5 = NL;
  public static final String TEXT_6 = NL;
  public static final String TEXT_7 = NL + "  #------------------------" + NL + "  # CONSTRUCTOR" + NL + "  #------------------------" + NL;
  public static final String TEXT_8 = NL + "    @";
  public static final String TEXT_9 = " = []";
  public static final String TEXT_10 = NL + "    ";
  public static final String TEXT_11 = NL + "    @";
  public static final String TEXT_12 = " = ";
  public static final String TEXT_13 = "";
  public static final String TEXT_14 = NL + "    @";
  public static final String TEXT_15 = " = true";
  public static final String TEXT_16 = NL + "    @";
  public static final String TEXT_17 = " = ";
  public static final String TEXT_18 = NL + "    @";
  public static final String TEXT_19 = " = false";
  public static final String TEXT_20 = NL + "    @";
  public static final String TEXT_21 = " = ";
  public static final String TEXT_22 = "";
  public static final String TEXT_23 = NL + "    @";
  public static final String TEXT_24 = " = @@";
  public static final String TEXT_25 = NL + "    @@";
  public static final String TEXT_26 = " += 1";
  public static final String TEXT_27 = NL + "    @";
  public static final String TEXT_28 = " = nil" + NL + "    if (!";
  public static final String TEXT_29 = "(";
  public static final String TEXT_30 = "))" + NL + "      raise ArgumentError, 'Cannot create due to duplicate ";
  public static final String TEXT_31 = ". See http://manual.umple.org?RE003ViolationofUniqueness.html'" + NL + "    end";
  public static final String TEXT_32 = NL + "    unless ";
  public static final String TEXT_33 = "(";
  public static final String TEXT_34 = ")" + NL + "      raise \"Unable to create ";
  public static final String TEXT_35 = " due to ";
  public static final String TEXT_36 = ". See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html\" " + NL + "    end";
  public static final String TEXT_37 = NL + "    ";
  public static final String TEXT_38 = "(";
  public static final String TEXT_39 = ")";
  public static final String TEXT_40 = NL + "    @";
  public static final String TEXT_41 = " = []" + NL + "    ";
  public static final String TEXT_42 = " = ";
  public static final String TEXT_43 = "(";
  public static final String TEXT_44 = ")" + NL + "    raise \"Unable to create ";
  public static final String TEXT_45 = ", must have ";
  public static final String TEXT_46 = " @";
  public static final String TEXT_47 = ". See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html\" unless ";
  public static final String TEXT_48 = NL + "    @";
  public static final String TEXT_49 = " = []" + NL + "    ";
  public static final String TEXT_50 = " = ";
  public static final String TEXT_51 = "(";
  public static final String TEXT_52 = ")" + NL + "    raise \"Unable to create ";
  public static final String TEXT_53 = ", must have ";
  public static final String TEXT_54 = " or fewer @";
  public static final String TEXT_55 = ", no duplicates. See http://manual.umple.org?RE001ViolationofImmutability.html\" unless ";
  public static final String TEXT_56 = NL + "    @";
  public static final String TEXT_57 = " = []" + NL + "    ";
  public static final String TEXT_58 = " = ";
  public static final String TEXT_59 = "(";
  public static final String TEXT_60 = ")" + NL + "    raise \"Unable to create ";
  public static final String TEXT_61 = ", must not have duplicate @";
  public static final String TEXT_62 = ". See http://manual.umple.org?RE001ViolationofImmutability.html\" unless ";
  public static final String TEXT_63 = NL + "    @";
  public static final String TEXT_64 = " = []";
  public static final String TEXT_65 = NL + "    @";
  public static final String TEXT_66 = " = nil";
  public static final String TEXT_67 = NL + "    @";
  public static final String TEXT_68 = " = nil" + NL + "    unless ";
  public static final String TEXT_69 = ".nil?" + NL + "      @";
  public static final String TEXT_70 = " = ";
  public static final String TEXT_71 = NL + "      ";
  public static final String TEXT_72 = ".instance_variable_set(\"@";
  public static final String TEXT_73 = "\",self)" + NL + "    end";
  public static final String TEXT_74 = NL + "    @";
  public static final String TEXT_75 = " = nil" + NL + "    ";
  public static final String TEXT_76 = " = ";
  public static final String TEXT_77 = "(";
  public static final String TEXT_78 = ")" + NL + "    raise \"Unable to create ";
  public static final String TEXT_79 = " due to @";
  public static final String TEXT_80 = ". See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html\" unless ";
  public static final String TEXT_81 = "@";
  public static final String TEXT_82 = " = []" + NL + "    @";
  public static final String TEXT_83 = " << ";
  public static final String TEXT_84 = NL + "    ";
  public static final String TEXT_85 = "(";
  public static final String TEXT_86 = ".";
  public static final String TEXT_87 = ")";
  public static final String TEXT_88 = NL + "    ";
  public static final String TEXT_89 = "(";
  public static final String TEXT_90 = ".";
  public static final String TEXT_91 = ")  if ";
  public static final String TEXT_92 = ".nil?";
  public static final String TEXT_93 = NL;
  public static final String TEXT_94 = NL + "  #------------------------" + NL + "  # INTERFACE" + NL + "  #------------------------" + NL;
  public static final String TEXT_95 = NL + "  def ";
  public static final String TEXT_96 = "(";
  public static final String TEXT_97 = ")" + NL + "    was_set = false";
  public static final String TEXT_98 = NL + "    @";
  public static final String TEXT_99 = " = false" + NL + "    @";
  public static final String TEXT_100 = " = ";
  public static final String TEXT_101 = NL + "    was_set = true";
  public static final String TEXT_102 = NL + "    was_set" + NL + "  end" + NL;
  public static final String TEXT_103 = NL + "  def ";
  public static final String TEXT_104 = "(";
  public static final String TEXT_105 = ")" + NL + "    was_set = false";
  public static final String TEXT_106 = NL + "    @";
  public static final String TEXT_107 = " = ";
  public static final String TEXT_108 = NL + "    was_set = true";
  public static final String TEXT_109 = NL + "    was_set" + NL + "  end" + NL + NL + "  def ";
  public static final String TEXT_110 = NL + "    wasReset = false";
  public static final String TEXT_111 = NL + "    @";
  public static final String TEXT_112 = " = ";
  public static final String TEXT_113 = NL + "    wasReset = true";
  public static final String TEXT_114 = NL + "    wasReset" + NL + "  end" + NL;
  public static final String TEXT_115 = NL + "  def ";
  public static final String TEXT_116 = "(";
  public static final String TEXT_117 = ")" + NL + "    was_added = false";
  public static final String TEXT_118 = NL + "    was_added = ";
  public static final String TEXT_119 = " << ";
  public static final String TEXT_120 = "";
  public static final String TEXT_121 = NL + "    was_added" + NL + "  end" + NL + NL + "  def ";
  public static final String TEXT_122 = "(";
  public static final String TEXT_123 = ")" + NL + "    was_removed = false";
  public static final String TEXT_124 = NL + "    was_removed = ";
  public static final String TEXT_125 = ".delete(";
  public static final String TEXT_126 = ")";
  public static final String TEXT_127 = NL + "    was_removed" + NL + "  end" + NL;
  public static final String TEXT_128 = NL + "  def ";
  public static final String TEXT_129 = "(";
  public static final String TEXT_130 = ")" + NL + "    was_set = false";
  public static final String TEXT_131 = NL + "    @";
  public static final String TEXT_132 = " = ";
  public static final String TEXT_133 = NL + "    was_set = true";
  public static final String TEXT_134 = NL + "    was_set" + NL + "  end" + NL;
  public static final String TEXT_135 = NL + "  def ";
  public static final String TEXT_136 = "(";
  public static final String TEXT_137 = ")" + NL + "    was_set = false";
  public static final String TEXT_138 = "";
  public static final String TEXT_139 = NL + "      was_set = super";
  public static final String TEXT_140 = "";
  public static final String TEXT_141 = NL + "    was_set" + NL + "  end" + NL;
  public static final String TEXT_142 = NL + "  def ";
  public static final String TEXT_143 = "(";
  public static final String TEXT_144 = ")" + NL + "    was_added = false";
  public static final String TEXT_145 = "";
  public static final String TEXT_146 = NL + "    was_added = super";
  public static final String TEXT_147 = "";
  public static final String TEXT_148 = NL + "    was_added" + NL + "  end" + NL + "  ";
  public static final String TEXT_149 = NL + "  def ";
  public static final String TEXT_150 = "(";
  public static final String TEXT_151 = ")" + NL + "    was_set = false";
  public static final String TEXT_152 = "";
  public static final String TEXT_153 = NL + "      was_set = super";
  public static final String TEXT_154 = "";
  public static final String TEXT_155 = NL + "    was_set" + NL + "  end" + NL;
  public static final String TEXT_156 = NL + "  def ";
  public static final String TEXT_157 = "(index)";
  public static final String TEXT_158 = NL + "    ";
  public static final String TEXT_159 = " = ";
  public static final String TEXT_160 = "[index]";
  public static final String TEXT_161 = NL + "    ";
  public static final String TEXT_162 = NL + "  end" + NL + NL + "  def ";
  public static final String TEXT_163 = "";
  public static final String TEXT_164 = NL + "    ";
  public static final String TEXT_165 = "[] ";
  public static final String TEXT_166 = " = ";
  public static final String TEXT_167 = ".toArray(new ";
  public static final String TEXT_168 = "[";
  public static final String TEXT_169 = ".size])";
  public static final String TEXT_170 = NL + "    ";
  public static final String TEXT_171 = NL + "  end" + NL + NL + "  def ";
  public static final String TEXT_172 = "";
  public static final String TEXT_173 = NL + "    number = ";
  public static final String TEXT_174 = ".size";
  public static final String TEXT_175 = NL + "    number;" + NL + "  end" + NL + NL + "  def ";
  public static final String TEXT_176 = "";
  public static final String TEXT_177 = NL + "    has = ";
  public static final String TEXT_178 = ".size > 0";
  public static final String TEXT_179 = NL + "    has" + NL + "  end" + NL + NL + "  def ";
  public static final String TEXT_180 = "(";
  public static final String TEXT_181 = ")";
  public static final String TEXT_182 = NL + "    index = ";
  public static final String TEXT_183 = ".index(";
  public static final String TEXT_184 = ")" + NL + "    index = -1 if index.nil?";
  public static final String TEXT_185 = NL + "    index" + NL + "  end" + NL;
  public static final String TEXT_186 = NL + "  def ";
  public static final String TEXT_187 = "";
  public static final String TEXT_188 = NL + "    ";
  public static final String TEXT_189 = " = ";
  public static final String TEXT_190 = "";
  public static final String TEXT_191 = NL + "    ";
  public static final String TEXT_192 = NL + "  end";
  public static final String TEXT_193 = NL + "  def ";
  public static final String TEXT_194 = "";
  public static final String TEXT_195 = NL + "    ";
  public static final String TEXT_196 = NL + "  end";
  public static final String TEXT_197 = NL + "  def ";
  public static final String TEXT_198 = "";
  public static final String TEXT_199 = NL + "    ";
  public static final String TEXT_200 = " = @";
  public static final String TEXT_201 = "";
  public static final String TEXT_202 = NL + "    ";
  public static final String TEXT_203 = NL + "  end";
  public static final String TEXT_204 = NL + "  def ";
  public static final String TEXT_205 = "";
  public static final String TEXT_206 = NL + "    @";
  public static final String TEXT_207 = NL + "  end";
  public static final String TEXT_208 = NL + "  def ";
  public static final String TEXT_209 = "";
  public static final String TEXT_210 = NL + "    ";
  public static final String TEXT_211 = " = ";
  public static final String TEXT_212 = "";
  public static final String TEXT_213 = NL + "    ";
  public static final String TEXT_214 = NL + "  end" + NL;
  public static final String TEXT_215 = NL + "  def ";
  public static final String TEXT_216 = "";
  public static final String TEXT_217 = NL + "    ";
  public static final String TEXT_218 = NL + "  end" + NL;
  public static final String TEXT_219 = NL + "  def ";
  public static final String TEXT_220 = "::";
  public static final String TEXT_221 = "($";
  public static final String TEXT_222 = ")";
  public static final String TEXT_223 = NL + "    ";
  public static final String TEXT_224 = " = @";
  public static final String TEXT_225 = "[";
  public static final String TEXT_226 = "]";
  public static final String TEXT_227 = "";
  public static final String TEXT_228 = NL + "    ";
  public static final String TEXT_229 = NL + "  end" + NL;
  public static final String TEXT_230 = NL + "  def ";
  public static final String TEXT_231 = "::";
  public static final String TEXT_232 = "(";
  public static final String TEXT_233 = ")";
  public static final String TEXT_234 = "";
  public static final String TEXT_235 = NL + "    @";
  public static final String TEXT_236 = "[";
  public static final String TEXT_237 = "]" + NL + "  end" + NL;
  public static final String TEXT_238 = NL + "  def ";
  public static final String TEXT_239 = "::";
  public static final String TEXT_240 = "?(";
  public static final String TEXT_241 = ")";
  public static final String TEXT_242 = NL + "    ";
  public static final String TEXT_243 = " = ";
  public static final String TEXT_244 = "(";
  public static final String TEXT_245 = ") != null;";
  public static final String TEXT_246 = "";
  public static final String TEXT_247 = NL + "    ";
  public static final String TEXT_248 = NL + "  end" + NL;
  public static final String TEXT_249 = NL + "  def ";
  public static final String TEXT_250 = "::";
  public static final String TEXT_251 = "?(";
  public static final String TEXT_252 = ")";
  public static final String TEXT_253 = "";
  public static final String TEXT_254 = NL + "    ";
  public static final String TEXT_255 = "(";
  public static final String TEXT_256 = ") != nil" + NL + "  end" + NL;
  public static final String TEXT_257 = NL + "  def ";
  public static final String TEXT_258 = "(index)";
  public static final String TEXT_259 = NL + "    ";
  public static final String TEXT_260 = " = super(index)";
  public static final String TEXT_261 = NL + "    ";
  public static final String TEXT_262 = NL + "  end" + NL;
  public static final String TEXT_263 = NL + "  def ";
  public static final String TEXT_264 = "";
  public static final String TEXT_265 = NL + "    ";
  public static final String TEXT_266 = " = super";
  public static final String TEXT_267 = NL + "    ";
  public static final String TEXT_268 = NL + "  end" + NL + "  ";
  public static final String TEXT_269 = NL + "  def ";
  public static final String TEXT_270 = "?";
  public static final String TEXT_271 = NL + "    ";
  public static final String TEXT_272 = " = ";
  public static final String TEXT_273 = "";
  public static final String TEXT_274 = NL + "    ";
  public static final String TEXT_275 = NL + "  end";
  public static final String TEXT_276 = NL + "  def ";
  public static final String TEXT_277 = "?";
  public static final String TEXT_278 = NL + "    @";
  public static final String TEXT_279 = NL + "  end";
  public static final String TEXT_280 = NL + "  def ";
  public static final String TEXT_281 = "?";
  public static final String TEXT_282 = NL + "    ";
  public static final String TEXT_283 = " = @";
  public static final String TEXT_284 = "";
  public static final String TEXT_285 = NL + "    ";
  public static final String TEXT_286 = NL + "  end";
  public static final String TEXT_287 = NL + "  def ";
  public static final String TEXT_288 = "?";
  public static final String TEXT_289 = NL + "    @";
  public static final String TEXT_290 = NL + "  end";
  public static final String TEXT_291 = NL + "  public ";
  public static final String TEXT_292 = " ";
  public static final String TEXT_293 = NL + "    ";
  public static final String TEXT_294 = NL + "  end" + NL;
  public static final String TEXT_295 = NL + "  def ";
  public static final String TEXT_296 = NL + "  {" + NL + "    wasEventProcessed = false;" + NL + NL + "    ";
  public static final String TEXT_297 = NL + NL + "    return wasEventProcessed;" + NL + "  }" + NL;
  public static final String TEXT_298 = NL + "  def ";
  public static final String TEXT_299 = "(";
  public static final String TEXT_300 = " ";
  public static final String TEXT_301 = ")" + NL + "  {" + NL + "    ";
  public static final String TEXT_302 = " = ";
  public static final String TEXT_303 = NL + "    return true;" + NL + "  }" + NL;
  public static final String TEXT_304 = "";
  public static final String TEXT_305 = NL + "  def ";
  public static final String TEXT_306 = NL + "    switch(";
  public static final String TEXT_307 = ")" + NL + "      ";
  public static final String TEXT_308 = NL + "    end" + NL + "  end" + NL;
  public static final String TEXT_309 = NL + "  private void ";
  public static final String TEXT_310 = "(";
  public static final String TEXT_311 = " ";
  public static final String TEXT_312 = ")" + NL + "  {" + NL + "    ";
  public static final String TEXT_313 = " = ";
  public static final String TEXT_314 = "";
  public static final String TEXT_315 = NL + NL + "    // entry actions and do activities" + NL + "    switch(";
  public static final String TEXT_316 = ")" + NL + "    {" + NL + "      ";
  public static final String TEXT_317 = NL + "    }";
  public static final String TEXT_318 = NL + "  }" + NL;
  public static final String TEXT_319 = NL + "  def ";
  public static final String TEXT_320 = "";
  public static final String TEXT_321 = "";
  public static final String TEXT_322 = NL + "    @";
  public static final String TEXT_323 = "";
  public static final String TEXT_324 = NL + "    ";
  public static final String TEXT_325 = " = @";
  public static final String TEXT_326 = "";
  public static final String TEXT_327 = "";
  public static final String TEXT_328 = NL + "    ";
  public static final String TEXT_329 = "";
  public static final String TEXT_330 = NL + "  end";
  public static final String TEXT_331 = NL + NL + "  def ";
  public static final String TEXT_332 = NL + "    has = !@";
  public static final String TEXT_333 = ".nil?" + NL + "    has" + NL + "  end";
  public static final String TEXT_334 = NL;
  public static final String TEXT_335 = NL + "  def ";
  public static final String TEXT_336 = "(index)";
  public static final String TEXT_337 = NL + "    ";
  public static final String TEXT_338 = " = @";
  public static final String TEXT_339 = "[index]";
  public static final String TEXT_340 = NL + "    ";
  public static final String TEXT_341 = NL + "  end" + NL + NL + "  def ";
  public static final String TEXT_342 = "";
  public static final String TEXT_343 = NL + "    ";
  public static final String TEXT_344 = " = @";
  public static final String TEXT_345 = ".dup";
  public static final String TEXT_346 = NL + "    ";
  public static final String TEXT_347 = NL + "  end" + NL + NL + "  def ";
  public static final String TEXT_348 = "";
  public static final String TEXT_349 = NL + "    number = @";
  public static final String TEXT_350 = ".size";
  public static final String TEXT_351 = NL + "    number" + NL + "  end" + NL + NL + "  def ";
  public static final String TEXT_352 = "";
  public static final String TEXT_353 = NL + "    has = @";
  public static final String TEXT_354 = ".size > 0";
  public static final String TEXT_355 = NL + "    has" + NL + "  end" + NL + NL + "  def ";
  public static final String TEXT_356 = "(";
  public static final String TEXT_357 = ")";
  public static final String TEXT_358 = NL + "    index = @";
  public static final String TEXT_359 = ".index(";
  public static final String TEXT_360 = ")" + NL + "    index = -1 if index.nil?";
  public static final String TEXT_361 = NL + "    index" + NL + "  end" + NL;
  public static final String TEXT_362 = "UNABLE TO UNDERSAND association variable (see association_Get_All.jet)";
  public static final String TEXT_363 = "//FIXME - FOUND UNKNOWN ASSOCIATION RELATIONSHIP ";
  public static final String TEXT_364 = " : ";
  public static final String TEXT_365 = NL + "  def ";
  public static final String TEXT_366 = "";
  public static final String TEXT_367 = "";
  public static final String TEXT_368 = NL + "    is_valid = ";
  public static final String TEXT_369 = " >= ";
  public static final String TEXT_370 = ".";
  public static final String TEXT_371 = "";
  public static final String TEXT_372 = NL + "    is_valid = ";
  public static final String TEXT_373 = " >= ";
  public static final String TEXT_374 = ".";
  public static final String TEXT_375 = " and ";
  public static final String TEXT_376 = " <= ";
  public static final String TEXT_377 = ".";
  public static final String TEXT_378 = "";
  public static final String TEXT_379 = "";
  public static final String TEXT_380 = NL + "    is_valid" + NL + "  end";
  public static final String TEXT_381 = "";
  public static final String TEXT_382 = NL + "  def self.";
  public static final String TEXT_383 = NL + "    ";
  public static final String TEXT_384 = NL + "  end";
  public static final String TEXT_385 = NL + "  def self.";
  public static final String TEXT_386 = "";
  public static final String TEXT_387 = NL + "    minimum = ";
  public static final String TEXT_388 = "";
  public static final String TEXT_389 = NL + "    minimum" + NL + "  end";
  public static final String TEXT_390 = "";
  public static final String TEXT_391 = NL + "  def self.";
  public static final String TEXT_392 = NL + "    ";
  public static final String TEXT_393 = NL + "  end";
  public static final String TEXT_394 = NL + "  def self.";
  public static final String TEXT_395 = "";
  public static final String TEXT_396 = NL + "    minimum = ";
  public static final String TEXT_397 = "";
  public static final String TEXT_398 = NL + "    minimum" + NL + "  end";
  public static final String TEXT_399 = "";
  public static final String TEXT_400 = NL + "  def self.";
  public static final String TEXT_401 = NL + "    ";
  public static final String TEXT_402 = NL + "  end";
  public static final String TEXT_403 = NL + "  def self.";
  public static final String TEXT_404 = "";
  public static final String TEXT_405 = NL + "    maximum = ";
  public static final String TEXT_406 = "";
  public static final String TEXT_407 = NL + "    maximum" + NL + "  end";
  public static final String TEXT_408 = NL + "  def ";
  public static final String TEXT_409 = "(";
  public static final String TEXT_410 = ")" + NL + "    was_added = false";
  public static final String TEXT_411 = "";
  public static final String TEXT_412 = NL + "    if ";
  public static final String TEXT_413 = " >= ";
  public static final String TEXT_414 = ".";
  public static final String TEXT_415 = "";
  public static final String TEXT_416 = NL + "      return was_added" + NL + "    end" + NL;
  public static final String TEXT_417 = NL + "    @";
  public static final String TEXT_418 = " << ";
  public static final String TEXT_419 = NL + "    if ";
  public static final String TEXT_420 = ".";
  public static final String TEXT_421 = "(self) != -1" + NL + "      was_added = true" + NL + "    else" + NL + "      was_added = ";
  public static final String TEXT_422 = ".";
  public static final String TEXT_423 = "(self)" + NL + "      unless was_added" + NL + "        @";
  public static final String TEXT_424 = ".delete(";
  public static final String TEXT_425 = ")" + NL + "      end" + NL + "    end";
  public static final String TEXT_426 = NL + "    was_added" + NL + "  end";
  public static final String TEXT_427 = NL + "  def ";
  public static final String TEXT_428 = "(";
  public static final String TEXT_429 = ")" + NL + "    was_removed = false";
  public static final String TEXT_430 = NL + "    unless @";
  public static final String TEXT_431 = ".include?(";
  public static final String TEXT_432 = ")";
  public static final String TEXT_433 = NL + "      return was_removed" + NL + "    end" + NL + NL + "    oldIndex = @";
  public static final String TEXT_434 = ".index(";
  public static final String TEXT_435 = ")" + NL + "    @";
  public static final String TEXT_436 = ".delete_at(oldIndex)" + NL + "    if ";
  public static final String TEXT_437 = ".";
  public static final String TEXT_438 = "(self) == -1" + NL + "      was_removed = true" + NL + "    else" + NL + "      was_removed = ";
  public static final String TEXT_439 = ".";
  public static final String TEXT_440 = "(self)" + NL + "      @";
  public static final String TEXT_441 = ".insert(oldIndex,";
  public static final String TEXT_442 = ") unless was_removed" + NL + "    end";
  public static final String TEXT_443 = NL + "    was_removed" + NL + "  end";
  public static final String TEXT_444 = NL + "  def ";
  public static final String TEXT_445 = "(";
  public static final String TEXT_446 = ")" + NL + "    was_set = false";
  public static final String TEXT_447 = NL + "    @";
  public static final String TEXT_448 = " = ";
  public static final String TEXT_449 = NL + "    was_set = true";
  public static final String TEXT_450 = NL + "    was_set" + NL + "  end" + NL;
  public static final String TEXT_451 = NL + "  def ";
  public static final String TEXT_452 = "(";
  public static final String TEXT_453 = ")" + NL + "    was_set = false";
  public static final String TEXT_454 = NL + "    unless ";
  public static final String TEXT_455 = ".nil?" + NL + "      @";
  public static final String TEXT_456 = " = ";
  public static final String TEXT_457 = NL + "      was_set = true" + NL + "    end";
  public static final String TEXT_458 = NL + "    was_set" + NL + "  end" + NL;
  public static final String TEXT_459 = NL + "  def ";
  public static final String TEXT_460 = "(";
  public static final String TEXT_461 = ")" + NL + "    was_set = false";
  public static final String TEXT_462 = NL + "    if !@";
  public static final String TEXT_463 = ".nil? and !@";
  public static final String TEXT_464 = ".eql?(";
  public static final String TEXT_465 = ") and self.eql?(@";
  public static final String TEXT_466 = ".";
  public static final String TEXT_467 = ")" + NL + "      #Unable to ";
  public static final String TEXT_468 = ", as existing @";
  public static final String TEXT_469 = " would become an orphan";
  public static final String TEXT_470 = NL + "      return was_set" + NL + "    end" + NL + NL + "    @";
  public static final String TEXT_471 = " = ";
  public static final String TEXT_472 = NL + "    ";
  public static final String TEXT_473 = " = !";
  public static final String TEXT_474 = ".nil? ? ";
  public static final String TEXT_475 = ".";
  public static final String TEXT_476 = " : nil" + NL + NL + "    unless self.eql?(";
  public static final String TEXT_477 = ")" + NL + "      unless ";
  public static final String TEXT_478 = ".nil?" + NL + "        ";
  public static final String TEXT_479 = ".instance_variable_set(\"@";
  public static final String TEXT_480 = "\",nil)" + NL + "      end" + NL + "      unless @";
  public static final String TEXT_481 = ".nil?" + NL + "        @";
  public static final String TEXT_482 = ".";
  public static final String TEXT_483 = "(self)" + NL + "      end" + NL + "    end" + NL + "    was_set = true";
  public static final String TEXT_484 = NL + "    was_set" + NL + "  end" + NL;
  public static final String TEXT_485 = NL + "  def ";
  public static final String TEXT_486 = "(";
  public static final String TEXT_487 = ")" + NL + "    was_set = false";
  public static final String TEXT_488 = NL + "    if ";
  public static final String TEXT_489 = ".nil?" + NL + "      #Unable to ";
  public static final String TEXT_490 = " to nil, as ";
  public static final String TEXT_491 = " must always be associated to a @";
  public static final String TEXT_492 = "";
  public static final String TEXT_493 = NL + "      return was_set" + NL + "    end" + NL + "    " + NL + "    ";
  public static final String TEXT_494 = " = ";
  public static final String TEXT_495 = ".";
  public static final String TEXT_496 = NL + "    if !";
  public static final String TEXT_497 = ".nil? and !self.eql?(";
  public static final String TEXT_498 = ")" + NL + "      #Unable to ";
  public static final String TEXT_499 = ", the current @";
  public static final String TEXT_500 = " already has a ";
  public static final String TEXT_501 = ", which would be orphaned if it were re-assigned";
  public static final String TEXT_502 = NL + "      return was_set" + NL + "    end" + NL + "    " + NL + "    ";
  public static final String TEXT_503 = " = @";
  public static final String TEXT_504 = NL + "    @";
  public static final String TEXT_505 = " = ";
  public static final String TEXT_506 = NL + "    @";
  public static final String TEXT_507 = ".";
  public static final String TEXT_508 = "(self)" + NL + NL + "    unless ";
  public static final String TEXT_509 = ".nil?" + NL + "      ";
  public static final String TEXT_510 = ".";
  public static final String TEXT_511 = "(nil)" + NL + "    end" + NL + "    was_set = true";
  public static final String TEXT_512 = NL + "    was_set" + NL + "  end" + NL;
  public static final String TEXT_513 = NL + "  def ";
  public static final String TEXT_514 = "(";
  public static final String TEXT_515 = ")" + NL + "    was_added = false";
  public static final String TEXT_516 = NL + "    ";
  public static final String TEXT_517 = " = ";
  public static final String TEXT_518 = ".";
  public static final String TEXT_519 = NL + "    ";
  public static final String TEXT_520 = " = (!";
  public static final String TEXT_521 = ".nil? and !";
  public static final String TEXT_522 = ".eql?(self))" + NL + NL + "    if ";
  public static final String TEXT_523 = " and ";
  public static final String TEXT_524 = ".";
  public static final String TEXT_525 = " <= ";
  public static final String TEXT_526 = ".";
  public static final String TEXT_527 = "";
  public static final String TEXT_528 = NL + "      return was_added" + NL + "    end" + NL + NL + "    if ";
  public static final String TEXT_529 = NL + "      ";
  public static final String TEXT_530 = ".";
  public static final String TEXT_531 = "(self)" + NL + "    else" + NL + "      @";
  public static final String TEXT_532 = " << ";
  public static final String TEXT_533 = NL + "    end" + NL + "    was_added = true";
  public static final String TEXT_534 = NL + "    was_added" + NL + "  end" + NL + NL + "  def ";
  public static final String TEXT_535 = "(";
  public static final String TEXT_536 = ")" + NL + "    was_removed = false";
  public static final String TEXT_537 = NL + "    # Unable to remove ";
  public static final String TEXT_538 = ", as it must always have a ";
  public static final String TEXT_539 = NL + "    if ";
  public static final String TEXT_540 = ".";
  public static final String TEXT_541 = ".eql?(self)";
  public static final String TEXT_542 = NL + "      return was_removed" + NL + "    end" + NL + NL + "    # ";
  public static final String TEXT_543 = " already at minimum (";
  public static final String TEXT_544 = ")" + NL + "    if ";
  public static final String TEXT_545 = " <= ";
  public static final String TEXT_546 = ".";
  public static final String TEXT_547 = "";
  public static final String TEXT_548 = NL + "      return was_removed" + NL + "    end" + NL + NL + "    @";
  public static final String TEXT_549 = ".delete(";
  public static final String TEXT_550 = ")" + NL + "    was_removed = true";
  public static final String TEXT_551 = NL + "    was_removed" + NL + "  end" + NL;
  public static final String TEXT_552 = NL + "  def ";
  public static final String TEXT_553 = "(";
  public static final String TEXT_554 = ")" + NL + "    was_added = false";
  public static final String TEXT_555 = NL + "    if ";
  public static final String TEXT_556 = " >= ";
  public static final String TEXT_557 = ".";
  public static final String TEXT_558 = "";
  public static final String TEXT_559 = NL + "      return was_added" + NL + "    end" + NL + NL + "    ";
  public static final String TEXT_560 = " = ";
  public static final String TEXT_561 = ".";
  public static final String TEXT_562 = NL + "    ";
  public static final String TEXT_563 = " = (!";
  public static final String TEXT_564 = ".nil? and !";
  public static final String TEXT_565 = ".eql?(self))" + NL + NL + "    if ";
  public static final String TEXT_566 = " and ";
  public static final String TEXT_567 = ".";
  public static final String TEXT_568 = " <= ";
  public static final String TEXT_569 = ".";
  public static final String TEXT_570 = "";
  public static final String TEXT_571 = NL + "      return was_added" + NL + "    end" + NL + NL + "    if ";
  public static final String TEXT_572 = NL + "      ";
  public static final String TEXT_573 = ".";
  public static final String TEXT_574 = "(self)" + NL + "    else" + NL + "      @";
  public static final String TEXT_575 = " << ";
  public static final String TEXT_576 = NL + "    end" + NL + "    was_added = true";
  public static final String TEXT_577 = NL + "    was_added" + NL + "  end" + NL + NL + "  def ";
  public static final String TEXT_578 = "(";
  public static final String TEXT_579 = ")" + NL + "    was_removed = false";
  public static final String TEXT_580 = NL + "    # Unable to remove ";
  public static final String TEXT_581 = ", as it must always have a ";
  public static final String TEXT_582 = NL + "    if ";
  public static final String TEXT_583 = ".";
  public static final String TEXT_584 = ".eql?(self)";
  public static final String TEXT_585 = NL + "      return was_removed" + NL + "    end" + NL + NL + "    # ";
  public static final String TEXT_586 = " already at minimum (";
  public static final String TEXT_587 = ")" + NL + "    if ";
  public static final String TEXT_588 = " <= ";
  public static final String TEXT_589 = ".";
  public static final String TEXT_590 = "";
  public static final String TEXT_591 = NL + "      return was_removed" + NL + "    end" + NL + NL + "    @";
  public static final String TEXT_592 = ".delete(";
  public static final String TEXT_593 = ")" + NL + "    was_removed = true";
  public static final String TEXT_594 = NL + "    was_removed" + NL + "  end" + NL;
  public static final String TEXT_595 = NL + "  def ";
  public static final String TEXT_596 = "(";
  public static final String TEXT_597 = ")" + NL + "    was_added = false";
  public static final String TEXT_598 = NL + "    if ";
  public static final String TEXT_599 = " >= ";
  public static final String TEXT_600 = ".";
  public static final String TEXT_601 = "";
  public static final String TEXT_602 = NL + "      return was_added" + NL + "    end" + NL + NL + "    ";
  public static final String TEXT_603 = " = ";
  public static final String TEXT_604 = ".";
  public static final String TEXT_605 = NL + "    ";
  public static final String TEXT_606 = " = (!";
  public static final String TEXT_607 = ".nil? and !";
  public static final String TEXT_608 = ".eql?(self))" + NL + "    if ";
  public static final String TEXT_609 = NL + "      ";
  public static final String TEXT_610 = ".";
  public static final String TEXT_611 = "(self)" + NL + "    else" + NL + "      @";
  public static final String TEXT_612 = " << ";
  public static final String TEXT_613 = NL + "    end" + NL + "    was_added = true";
  public static final String TEXT_614 = NL + "    was_added" + NL + "  end" + NL + NL + "  def ";
  public static final String TEXT_615 = "(";
  public static final String TEXT_616 = ")" + NL + "    was_removed = false";
  public static final String TEXT_617 = NL + "    # Unable to remove ";
  public static final String TEXT_618 = ", as it must always have a ";
  public static final String TEXT_619 = NL + "    unless ";
  public static final String TEXT_620 = ".";
  public static final String TEXT_621 = ".eql?(self)" + NL + "      @";
  public static final String TEXT_622 = ".delete(";
  public static final String TEXT_623 = ")" + NL + "      was_removed = true" + NL + "    end";
  public static final String TEXT_624 = NL + "    was_removed" + NL + "  end" + NL;
  public static final String TEXT_625 = NL + "  def ";
  public static final String TEXT_626 = "(";
  public static final String TEXT_627 = ")" + NL + "    was_set = false";
  public static final String TEXT_628 = NL + "    ";
  public static final String TEXT_629 = " = []" + NL + "    ";
  public static final String TEXT_630 = ".each do |";
  public static final String TEXT_631 = "|" + NL + "      next if (";
  public static final String TEXT_632 = ".include?(";
  public static final String TEXT_633 = "))" + NL + "      ";
  public static final String TEXT_634 = " << ";
  public static final String TEXT_635 = NL + "    end" + NL + NL + "    if (";
  public static final String TEXT_636 = ".size != ";
  public static final String TEXT_637 = ".size or ";
  public static final String TEXT_638 = ".size() > ";
  public static final String TEXT_639 = ".";
  public static final String TEXT_640 = ")";
  public static final String TEXT_641 = NL + "      return was_set" + NL + "    end" + NL + NL + "    ";
  public static final String TEXT_642 = " = @";
  public static final String TEXT_643 = ".dup" + NL + "    @";
  public static final String TEXT_644 = ".clear" + NL + "    ";
  public static final String TEXT_645 = ".each do |";
  public static final String TEXT_646 = "|" + NL + "      @";
  public static final String TEXT_647 = " << ";
  public static final String TEXT_648 = NL + "      if (";
  public static final String TEXT_649 = ".include?(";
  public static final String TEXT_650 = "))" + NL + "        ";
  public static final String TEXT_651 = ".delete(";
  public static final String TEXT_652 = ")" + NL + "      else" + NL + "        ";
  public static final String TEXT_653 = ".";
  public static final String TEXT_654 = "(self)" + NL + "      end" + NL + "    end" + NL + NL + "    ";
  public static final String TEXT_655 = ".each do |";
  public static final String TEXT_656 = "|" + NL + "      ";
  public static final String TEXT_657 = ".";
  public static final String TEXT_658 = "(self)" + NL + "    end" + NL + "    was_set = true";
  public static final String TEXT_659 = NL + "    was_set" + NL + "  end" + NL;
  public static final String TEXT_660 = NL + "  def ";
  public static final String TEXT_661 = "(";
  public static final String TEXT_662 = ")" + NL + "    was_added = false";
  public static final String TEXT_663 = NL + "    ";
  public static final String TEXT_664 = " = ";
  public static final String TEXT_665 = ".";
  public static final String TEXT_666 = NL + "    ";
  public static final String TEXT_667 = " = (!";
  public static final String TEXT_668 = ".nil? and !";
  public static final String TEXT_669 = ".eql?(self))" + NL + "    if ";
  public static final String TEXT_670 = NL + "      ";
  public static final String TEXT_671 = ".";
  public static final String TEXT_672 = "(self)" + NL + "    else" + NL + "      @";
  public static final String TEXT_673 = " << ";
  public static final String TEXT_674 = NL + "    end" + NL + "    was_added = true";
  public static final String TEXT_675 = NL + "    was_added" + NL + "  end" + NL + NL + "  def ";
  public static final String TEXT_676 = "(";
  public static final String TEXT_677 = ")" + NL + "    was_removed = false";
  public static final String TEXT_678 = NL + "    # Unable to remove ";
  public static final String TEXT_679 = ", as it must always have a ";
  public static final String TEXT_680 = NL + "    unless ";
  public static final String TEXT_681 = ".";
  public static final String TEXT_682 = ".eql?(self)" + NL + "      @";
  public static final String TEXT_683 = ".delete(";
  public static final String TEXT_684 = ")" + NL + "      was_removed = true" + NL + "    end";
  public static final String TEXT_685 = NL + "    was_removed" + NL + "  end" + NL;
  public static final String TEXT_686 = NL + "  def ";
  public static final String TEXT_687 = "(";
  public static final String TEXT_688 = ")" + NL + "    was_set = false";
  public static final String TEXT_689 = NL + "    if ";
  public static final String TEXT_690 = ".nil?" + NL + "      ";
  public static final String TEXT_691 = " = @";
  public static final String TEXT_692 = NL + "      @";
  public static final String TEXT_693 = " = nil" + NL + "      " + NL + "      if !";
  public static final String TEXT_694 = ".nil? and !";
  public static final String TEXT_695 = ".";
  public static final String TEXT_696 = ".nil?" + NL + "        ";
  public static final String TEXT_697 = ".";
  public static final String TEXT_698 = "(nil)" + NL + "      end" + NL + "      was_set = true";
  public static final String TEXT_699 = NL + "      return was_set" + NL + "    end" + NL + NL + "    ";
  public static final String TEXT_700 = " = self.";
  public static final String TEXT_701 = NL + "    if !";
  public static final String TEXT_702 = ".nil? and !";
  public static final String TEXT_703 = ".eql?(";
  public static final String TEXT_704 = ")" + NL + "      ";
  public static final String TEXT_705 = ".";
  public static final String TEXT_706 = "(nil)" + NL + "    end" + NL + NL + "    @";
  public static final String TEXT_707 = " = ";
  public static final String TEXT_708 = NL + "    ";
  public static final String TEXT_709 = " = ";
  public static final String TEXT_710 = ".";
  public static final String TEXT_711 = NL + NL + "    unless self.eql?(";
  public static final String TEXT_712 = ")" + NL + "      ";
  public static final String TEXT_713 = ".";
  public static final String TEXT_714 = "(self)" + NL + "    end" + NL + "    was_set = true";
  public static final String TEXT_715 = NL + "    was_set" + NL + "  end" + NL;
  public static final String TEXT_716 = NL + "  def ";
  public static final String TEXT_717 = "(";
  public static final String TEXT_718 = ")" + NL + "    was_removed = false";
  public static final String TEXT_719 = NL + "    unless @";
  public static final String TEXT_720 = ".include?(";
  public static final String TEXT_721 = ")";
  public static final String TEXT_722 = NL + "      return was_removed" + NL + "    end" + NL + NL + "    if ";
  public static final String TEXT_723 = " <= ";
  public static final String TEXT_724 = ".";
  public static final String TEXT_725 = "";
  public static final String TEXT_726 = NL + "      return was_removed" + NL + "    end" + NL + NL + "    oldIndex = @";
  public static final String TEXT_727 = ".index(";
  public static final String TEXT_728 = ")" + NL + "    @";
  public static final String TEXT_729 = ".delete_at(oldIndex)" + NL + "    if ";
  public static final String TEXT_730 = ".";
  public static final String TEXT_731 = "(self) == -1" + NL + "      was_removed = true" + NL + "    else" + NL + "      was_removed = ";
  public static final String TEXT_732 = ".";
  public static final String TEXT_733 = "(self)" + NL + "      @";
  public static final String TEXT_734 = ".insert(oldIndex,";
  public static final String TEXT_735 = ") unless was_removed" + NL + "    end";
  public static final String TEXT_736 = NL + "    was_removed" + NL + "  end" + NL;
  public static final String TEXT_737 = NL + "  def ";
  public static final String TEXT_738 = "(";
  public static final String TEXT_739 = ")" + NL + "    was_removed = false";
  public static final String TEXT_740 = NL + "    unless @";
  public static final String TEXT_741 = ".include?(";
  public static final String TEXT_742 = ")";
  public static final String TEXT_743 = NL + "      return was_removed" + NL + "    end" + NL + NL + "    if ";
  public static final String TEXT_744 = " <= ";
  public static final String TEXT_745 = ".";
  public static final String TEXT_746 = "";
  public static final String TEXT_747 = NL + "      return was_removed" + NL + "    end" + NL + NL + "    oldIndex = @";
  public static final String TEXT_748 = ".index(";
  public static final String TEXT_749 = ")" + NL + "    @";
  public static final String TEXT_750 = ".delete_at(oldIndex)" + NL + "    if ";
  public static final String TEXT_751 = ".";
  public static final String TEXT_752 = "(self) == -1" + NL + "      was_removed = true" + NL + "    else" + NL + "      was_removed = ";
  public static final String TEXT_753 = ".";
  public static final String TEXT_754 = "(self)" + NL + "      @";
  public static final String TEXT_755 = ".insert(oldIndex,";
  public static final String TEXT_756 = ") unless was_removed" + NL + "    end";
  public static final String TEXT_757 = NL + "    was_removed" + NL + "  end" + NL;
  public static final String TEXT_758 = NL + "  def ";
  public static final String TEXT_759 = "(";
  public static final String TEXT_760 = ")" + NL + "    was_set = false";
  public static final String TEXT_761 = NL + "    if !";
  public static final String TEXT_762 = ".nil? and ";
  public static final String TEXT_763 = ".";
  public static final String TEXT_764 = " >= ";
  public static final String TEXT_765 = ".";
  public static final String TEXT_766 = "";
  public static final String TEXT_767 = NL + "      return was_set" + NL + "    end" + NL + NL + "    ";
  public static final String TEXT_768 = " = @";
  public static final String TEXT_769 = NL + "    @";
  public static final String TEXT_770 = " = ";
  public static final String TEXT_771 = NL + "    if !";
  public static final String TEXT_772 = ".nil? and !";
  public static final String TEXT_773 = ".eql?(";
  public static final String TEXT_774 = ")" + NL + "      ";
  public static final String TEXT_775 = ".";
  public static final String TEXT_776 = "(self)" + NL + "    end" + NL + "    unless ";
  public static final String TEXT_777 = ".nil?" + NL + "      ";
  public static final String TEXT_778 = ".";
  public static final String TEXT_779 = "(self)" + NL + "    end" + NL + "    was_set = true";
  public static final String TEXT_780 = NL + "    was_set" + NL + "  end" + NL;
  public static final String TEXT_781 = NL + "  def ";
  public static final String TEXT_782 = "(";
  public static final String TEXT_783 = ")" + NL + "    was_set = false";
  public static final String TEXT_784 = NL + "    if ";
  public static final String TEXT_785 = ".nil?";
  public static final String TEXT_786 = NL + "      return was_set" + NL + "    end" + NL + NL + "    ";
  public static final String TEXT_787 = " = @";
  public static final String TEXT_788 = NL + "    @";
  public static final String TEXT_789 = " = ";
  public static final String TEXT_790 = NL + "    if !";
  public static final String TEXT_791 = ".nil? and !";
  public static final String TEXT_792 = ".eql?(";
  public static final String TEXT_793 = ")" + NL + "      ";
  public static final String TEXT_794 = ".";
  public static final String TEXT_795 = "(self)" + NL + "    end" + NL + "    @";
  public static final String TEXT_796 = ".";
  public static final String TEXT_797 = "(self)" + NL + "    was_set = true";
  public static final String TEXT_798 = NL + "    was_set" + NL + "  end" + NL;
  public static final String TEXT_799 = NL + "  def ";
  public static final String TEXT_800 = "(";
  public static final String TEXT_801 = ")" + NL + "    was_set = false";
  public static final String TEXT_802 = NL + "    if ";
  public static final String TEXT_803 = ".nil?";
  public static final String TEXT_804 = NL + "      return was_set" + NL + "    end" + NL + NL + "    ";
  public static final String TEXT_805 = " = ";
  public static final String TEXT_806 = NL + "    @";
  public static final String TEXT_807 = " = ";
  public static final String TEXT_808 = NL + "    if !";
  public static final String TEXT_809 = ".nil? and !";
  public static final String TEXT_810 = ".eql?(";
  public static final String TEXT_811 = ")" + NL + "      ";
  public static final String TEXT_812 = ".";
  public static final String TEXT_813 = "(this)" + NL + "    end" + NL + "    if !@";
  public static final String TEXT_814 = ".";
  public static final String TEXT_815 = "(self)" + NL + "    {" + NL + "      @";
  public static final String TEXT_816 = " = ";
  public static final String TEXT_817 = NL + "      was_set = false" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      was_set = true" + NL + "    }";
  public static final String TEXT_818 = NL + "    was_set" + NL + "  end" + NL;
  public static final String TEXT_819 = NL + "  def ";
  public static final String TEXT_820 = "(";
  public static final String TEXT_821 = ")" + NL + "    was_set = false";
  public static final String TEXT_822 = NL + "    # Must provide @";
  public static final String TEXT_823 = " to ";
  public static final String TEXT_824 = NL + "    if ";
  public static final String TEXT_825 = ".nil?";
  public static final String TEXT_826 = NL + "      return was_set" + NL + "    end" + NL + NL + "    # @";
  public static final String TEXT_827 = " already at maximum (";
  public static final String TEXT_828 = ")" + NL + "    if ";
  public static final String TEXT_829 = ".";
  public static final String TEXT_830 = " >= ";
  public static final String TEXT_831 = ".";
  public static final String TEXT_832 = "";
  public static final String TEXT_833 = NL + "      return was_set" + NL + "    end" + NL + "    " + NL + "    ";
  public static final String TEXT_834 = " = @";
  public static final String TEXT_835 = NL + "    @";
  public static final String TEXT_836 = " = ";
  public static final String TEXT_837 = NL + "    if !";
  public static final String TEXT_838 = ".nil? and !";
  public static final String TEXT_839 = ".eql?(";
  public static final String TEXT_840 = ")" + NL + "      didRemove = ";
  public static final String TEXT_841 = ".";
  public static final String TEXT_842 = "(self)" + NL + "      unless didRemove" + NL + "        @";
  public static final String TEXT_843 = " = ";
  public static final String TEXT_844 = "";
  public static final String TEXT_845 = NL + "        return was_set" + NL + "      end" + NL + "    end" + NL + "    @";
  public static final String TEXT_846 = ".";
  public static final String TEXT_847 = "(self)" + NL + "    was_set = true";
  public static final String TEXT_848 = NL + "    was_set" + NL + "  end" + NL;
  public static final String TEXT_849 = NL + "  def ";
  public static final String TEXT_850 = "(";
  public static final String TEXT_851 = ")" + NL + "    was_set = false";
  public static final String TEXT_852 = NL + "    # Must provide @";
  public static final String TEXT_853 = " to ";
  public static final String TEXT_854 = NL + "    if ";
  public static final String TEXT_855 = ".nil?";
  public static final String TEXT_856 = NL + "      return was_set" + NL + "    end" + NL + NL + "    if !@";
  public static final String TEXT_857 = ".nil? and @";
  public static final String TEXT_858 = ".";
  public static final String TEXT_859 = " <= ";
  public static final String TEXT_860 = ".";
  public static final String TEXT_861 = "";
  public static final String TEXT_862 = NL + "      return was_set" + NL + "    end" + NL + NL + "    ";
  public static final String TEXT_863 = " = @";
  public static final String TEXT_864 = NL + "    @";
  public static final String TEXT_865 = " = ";
  public static final String TEXT_866 = NL + "    if !";
  public static final String TEXT_867 = ".nil? and !";
  public static final String TEXT_868 = ".eql?(";
  public static final String TEXT_869 = ")" + NL + "      didRemove = ";
  public static final String TEXT_870 = ".";
  public static final String TEXT_871 = "(self)" + NL + "      unless didRemove" + NL + "        @";
  public static final String TEXT_872 = " = ";
  public static final String TEXT_873 = "";
  public static final String TEXT_874 = NL + "        return was_set" + NL + "      end" + NL + "    end" + NL + "    @";
  public static final String TEXT_875 = ".";
  public static final String TEXT_876 = "(self)" + NL + "    was_set = true";
  public static final String TEXT_877 = NL + "    was_set" + NL + "  end" + NL;
  public static final String TEXT_878 = NL + "  def ";
  public static final String TEXT_879 = "(";
  public static final String TEXT_880 = ")" + NL + "    was_added = false";
  public static final String TEXT_881 = NL + "    ";
  public static final String TEXT_882 = " = ";
  public static final String TEXT_883 = ".";
  public static final String TEXT_884 = NL + "    if ";
  public static final String TEXT_885 = ".nil?" + NL + "      ";
  public static final String TEXT_886 = ".";
  public static final String TEXT_887 = "(self)" + NL + "    elsif !";
  public static final String TEXT_888 = ".eql?(self)" + NL + "      ";
  public static final String TEXT_889 = ".";
  public static final String TEXT_890 = "(";
  public static final String TEXT_891 = ")" + NL + "      ";
  public static final String TEXT_892 = "(";
  public static final String TEXT_893 = ")" + NL + "    else" + NL + "      @";
  public static final String TEXT_894 = " << ";
  public static final String TEXT_895 = NL + "    end" + NL + "    was_added = true";
  public static final String TEXT_896 = NL + "    was_added" + NL + "  end" + NL + NL + "  def ";
  public static final String TEXT_897 = "(";
  public static final String TEXT_898 = ")" + NL + "    was_removed = false";
  public static final String TEXT_899 = NL + "    if @";
  public static final String TEXT_900 = ".include?(";
  public static final String TEXT_901 = ")" + NL + "      @";
  public static final String TEXT_902 = ".delete(";
  public static final String TEXT_903 = ")" + NL + "      ";
  public static final String TEXT_904 = ".";
  public static final String TEXT_905 = "(nil)" + NL + "      was_removed = true" + NL + "    end";
  public static final String TEXT_906 = NL + "    was_removed" + NL + "  end" + NL;
  public static final String TEXT_907 = NL + "  def ";
  public static final String TEXT_908 = "(";
  public static final String TEXT_909 = ")" + NL + "    was_set = false";
  public static final String TEXT_910 = NL + "    ";
  public static final String TEXT_911 = " = @";
  public static final String TEXT_912 = NL + "    @";
  public static final String TEXT_913 = " = ";
  public static final String TEXT_914 = NL + "    if !";
  public static final String TEXT_915 = ".nil? and !";
  public static final String TEXT_916 = ".eql?(";
  public static final String TEXT_917 = ")" + NL + "      ";
  public static final String TEXT_918 = ".";
  public static final String TEXT_919 = "(self)" + NL + "    end" + NL + "    unless ";
  public static final String TEXT_920 = ".nil?" + NL + "      ";
  public static final String TEXT_921 = ".";
  public static final String TEXT_922 = "(self)" + NL + "    end" + NL + "    was_set = true";
  public static final String TEXT_923 = NL + "    was_set" + NL + "  end" + NL;
  public static final String TEXT_924 = NL + "  def ";
  public static final String TEXT_925 = "(";
  public static final String TEXT_926 = ")" + NL + "    was_added = false";
  public static final String TEXT_927 = NL + "    if ";
  public static final String TEXT_928 = " >= ";
  public static final String TEXT_929 = ".";
  public static final String TEXT_930 = "";
  public static final String TEXT_931 = NL + "      return was_added" + NL + "    end" + NL + NL + "    ";
  public static final String TEXT_932 = " = ";
  public static final String TEXT_933 = ".";
  public static final String TEXT_934 = NL + "    if ";
  public static final String TEXT_935 = ".nil?" + NL + "      ";
  public static final String TEXT_936 = ".";
  public static final String TEXT_937 = "(self)" + NL + "    elsif !";
  public static final String TEXT_938 = ".eql?(self)" + NL + "      ";
  public static final String TEXT_939 = ".";
  public static final String TEXT_940 = "(";
  public static final String TEXT_941 = ")" + NL + "      ";
  public static final String TEXT_942 = "(";
  public static final String TEXT_943 = ")" + NL + "    else" + NL + "      @";
  public static final String TEXT_944 = " << ";
  public static final String TEXT_945 = NL + "    end" + NL + "    was_added = true";
  public static final String TEXT_946 = NL + "    was_added" + NL + "  end" + NL + NL + "  def ";
  public static final String TEXT_947 = "(";
  public static final String TEXT_948 = ")" + NL + "    was_removed = false";
  public static final String TEXT_949 = NL + "    if @";
  public static final String TEXT_950 = ".include?(";
  public static final String TEXT_951 = ")" + NL + "      @";
  public static final String TEXT_952 = ".delete(";
  public static final String TEXT_953 = ")" + NL + "      ";
  public static final String TEXT_954 = ".";
  public static final String TEXT_955 = "(nil)" + NL + "      was_removed = true" + NL + "    end";
  public static final String TEXT_956 = NL + "    was_removed" + NL + "  end" + NL;
  public static final String TEXT_957 = NL + "  def ";
  public static final String TEXT_958 = "(";
  public static final String TEXT_959 = ")" + NL + "    was_added = false";
  public static final String TEXT_960 = NL + "    if ";
  public static final String TEXT_961 = " < ";
  public static final String TEXT_962 = ".";
  public static final String TEXT_963 = NL + "      @";
  public static final String TEXT_964 = " << ";
  public static final String TEXT_965 = NL + "      was_added = true" + NL + "    end";
  public static final String TEXT_966 = NL + "    was_added" + NL + "  end" + NL + NL + "  def ";
  public static final String TEXT_967 = "(";
  public static final String TEXT_968 = ")" + NL + "    was_removed = false";
  public static final String TEXT_969 = NL + "    unless @";
  public static final String TEXT_970 = ".include?(";
  public static final String TEXT_971 = ")";
  public static final String TEXT_972 = NL + "      return was_removed" + NL + "    end" + NL + NL + "    if ";
  public static final String TEXT_973 = " <= ";
  public static final String TEXT_974 = ".";
  public static final String TEXT_975 = "";
  public static final String TEXT_976 = NL + "      return was_removed" + NL + "    end" + NL + NL + "    @";
  public static final String TEXT_977 = ".delete(";
  public static final String TEXT_978 = ")" + NL + "    was_removed = true";
  public static final String TEXT_979 = NL + "    was_removed" + NL + "  end" + NL;
  public static final String TEXT_980 = NL + "  def ";
  public static final String TEXT_981 = "(";
  public static final String TEXT_982 = ")" + NL + "    was_added = false";
  public static final String TEXT_983 = "";
  public static final String TEXT_984 = NL + "    if ";
  public static final String TEXT_985 = " >= ";
  public static final String TEXT_986 = ".";
  public static final String TEXT_987 = "";
  public static final String TEXT_988 = NL + "      return was_added" + NL + "    end";
  public static final String TEXT_989 = NL + "    ";
  public static final String TEXT_990 = " = ";
  public static final String TEXT_991 = ".";
  public static final String TEXT_992 = NL + "    if !";
  public static final String TEXT_993 = ".nil? and ";
  public static final String TEXT_994 = ".";
  public static final String TEXT_995 = " <= ";
  public static final String TEXT_996 = ".";
  public static final String TEXT_997 = "";
  public static final String TEXT_998 = NL + "      return was_added" + NL + "    elsif !";
  public static final String TEXT_999 = ".nil?" + NL + "      ";
  public static final String TEXT_1000 = ".instance_variable_get(\"@";
  public static final String TEXT_1001 = "\").delete(";
  public static final String TEXT_1002 = ")" + NL + "    end" + NL + "    @";
  public static final String TEXT_1003 = " << ";
  public static final String TEXT_1004 = NL + "    ";
  public static final String TEXT_1005 = ".instance_variable_set(\"@";
  public static final String TEXT_1006 = "\",self)" + NL + "    was_added = true";
  public static final String TEXT_1007 = NL + "    was_added" + NL + "  end" + NL + NL + "  def ";
  public static final String TEXT_1008 = "(";
  public static final String TEXT_1009 = ")" + NL + "    was_removed = false";
  public static final String TEXT_1010 = NL + "    if @";
  public static final String TEXT_1011 = ".include?(";
  public static final String TEXT_1012 = ") and ";
  public static final String TEXT_1013 = " > ";
  public static final String TEXT_1014 = ".";
  public static final String TEXT_1015 = NL + "      @";
  public static final String TEXT_1016 = ".delete(";
  public static final String TEXT_1017 = ")" + NL + "      ";
  public static final String TEXT_1018 = ".instance_variable_set(\"@";
  public static final String TEXT_1019 = "\",nil)" + NL + "      was_removed = true" + NL + "    end";
  public static final String TEXT_1020 = NL + "    was_removed" + NL + "  end" + NL;
  public static final String TEXT_1021 = NL + "  def ";
  public static final String TEXT_1022 = "(";
  public static final String TEXT_1023 = ")" + NL + "    was_set = false";
  public static final String TEXT_1024 = NL + "    ";
  public static final String TEXT_1025 = " = []" + NL + "    ";
  public static final String TEXT_1026 = ".each do |";
  public static final String TEXT_1027 = "|" + NL + "      if ";
  public static final String TEXT_1028 = ".include?(";
  public static final String TEXT_1029 = ")";
  public static final String TEXT_1030 = NL + "        return was_set" + NL + "      elsif !";
  public static final String TEXT_1031 = ".";
  public static final String TEXT_1032 = ".nil? and !";
  public static final String TEXT_1033 = ".";
  public static final String TEXT_1034 = ".eql?(self)";
  public static final String TEXT_1035 = NL + "        return was_set" + NL + "      end" + NL + "      ";
  public static final String TEXT_1036 = " << ";
  public static final String TEXT_1037 = NL + "    end" + NL + NL + "    if ";
  public static final String TEXT_1038 = ".size != ";
  public static final String TEXT_1039 = ".";
  public static final String TEXT_1040 = "";
  public static final String TEXT_1041 = NL + "      return was_set" + NL + "    end" + NL + NL + "    ";
  public static final String TEXT_1042 = ".each do |";
  public static final String TEXT_1043 = "|" + NL + "      @";
  public static final String TEXT_1044 = ".delete(";
  public static final String TEXT_1045 = ")" + NL + "    end" + NL + "    " + NL + "    @";
  public static final String TEXT_1046 = ".each do |orphan|" + NL + "      orphan.instance_variable_set(\"@";
  public static final String TEXT_1047 = "\",nil)" + NL + "    end" + NL + "    @";
  public static final String TEXT_1048 = ".clear" + NL + "    ";
  public static final String TEXT_1049 = ".each do |";
  public static final String TEXT_1050 = "|" + NL + "      ";
  public static final String TEXT_1051 = ".instance_variable_set(\"@";
  public static final String TEXT_1052 = "\",self)" + NL + "      @";
  public static final String TEXT_1053 = " << ";
  public static final String TEXT_1054 = NL + "    end" + NL + "    was_set = true";
  public static final String TEXT_1055 = NL + "    was_set" + NL + "  end" + NL;
  public static final String TEXT_1056 = NL + "  def ";
  public static final String TEXT_1057 = "(";
  public static final String TEXT_1058 = ")" + NL + "    was_added = false";
  public static final String TEXT_1059 = NL + "    @";
  public static final String TEXT_1060 = " << ";
  public static final String TEXT_1061 = NL + "    was_added = true";
  public static final String TEXT_1062 = NL + "    was_added" + NL + "  end" + NL + NL + "  def ";
  public static final String TEXT_1063 = "(";
  public static final String TEXT_1064 = ")" + NL + "    was_removed = false";
  public static final String TEXT_1065 = NL + "    if @";
  public static final String TEXT_1066 = ".include?(";
  public static final String TEXT_1067 = ")" + NL + "      @";
  public static final String TEXT_1068 = ".delete(";
  public static final String TEXT_1069 = ")" + NL + "      was_removed = true" + NL + "    end";
  public static final String TEXT_1070 = NL + "    was_removed" + NL + "  end" + NL;
  public static final String TEXT_1071 = NL + "  def ";
  public static final String TEXT_1072 = "(";
  public static final String TEXT_1073 = ")" + NL + "    was_added = false";
  public static final String TEXT_1074 = NL + "    if ";
  public static final String TEXT_1075 = " < ";
  public static final String TEXT_1076 = ".";
  public static final String TEXT_1077 = NL + "      @";
  public static final String TEXT_1078 = " << ";
  public static final String TEXT_1079 = NL + "      was_added = true" + NL + "    end";
  public static final String TEXT_1080 = NL + "    was_added" + NL + "  end" + NL + NL + "  def ";
  public static final String TEXT_1081 = "(";
  public static final String TEXT_1082 = ")" + NL + "    was_removed = false";
  public static final String TEXT_1083 = NL + "    if @";
  public static final String TEXT_1084 = ".include?(";
  public static final String TEXT_1085 = ")" + NL + "      @";
  public static final String TEXT_1086 = ".delete(";
  public static final String TEXT_1087 = ")" + NL + "      was_removed = true" + NL + "    end";
  public static final String TEXT_1088 = NL + "    was_removed" + NL + "  end" + NL;
  public static final String TEXT_1089 = NL + "  def ";
  public static final String TEXT_1090 = "(";
  public static final String TEXT_1091 = ")" + NL + "    was_added = false";
  public static final String TEXT_1092 = NL + "    @";
  public static final String TEXT_1093 = " << ";
  public static final String TEXT_1094 = NL + "    was_added = true";
  public static final String TEXT_1095 = NL + "    was_added" + NL + "  end" + NL + NL + "  def ";
  public static final String TEXT_1096 = "(";
  public static final String TEXT_1097 = ")" + NL + "    was_removed = false";
  public static final String TEXT_1098 = NL + "    unless @";
  public static final String TEXT_1099 = ".include?(";
  public static final String TEXT_1100 = ")";
  public static final String TEXT_1101 = NL + "      return was_removed" + NL + "    end" + NL + NL + "    if ";
  public static final String TEXT_1102 = " <= ";
  public static final String TEXT_1103 = ".";
  public static final String TEXT_1104 = "";
  public static final String TEXT_1105 = NL + "      return was_removed" + NL + "    end" + NL + NL + "    @";
  public static final String TEXT_1106 = ".delete(";
  public static final String TEXT_1107 = ")" + NL + "    was_removed = true";
  public static final String TEXT_1108 = NL + "    was_removed" + NL + "  end" + NL;
  public static final String TEXT_1109 = NL + "  def ";
  public static final String TEXT_1110 = "(";
  public static final String TEXT_1111 = ")" + NL + "    was_set = false";
  public static final String TEXT_1112 = NL + "    ";
  public static final String TEXT_1113 = " = []" + NL + "    ";
  public static final String TEXT_1114 = ".each do |";
  public static final String TEXT_1115 = "|" + NL + "      next if (";
  public static final String TEXT_1116 = ".include?(";
  public static final String TEXT_1117 = "))" + NL + "      ";
  public static final String TEXT_1118 = " << ";
  public static final String TEXT_1119 = NL + "    end" + NL + NL + "    if ";
  public static final String TEXT_1120 = ".size != ";
  public static final String TEXT_1121 = ".size or ";
  public static final String TEXT_1122 = ".size() != ";
  public static final String TEXT_1123 = ".";
  public static final String TEXT_1124 = "";
  public static final String TEXT_1125 = NL + "      return was_set" + NL + "    end" + NL + NL + "    @";
  public static final String TEXT_1126 = ".clear" + NL + "    ";
  public static final String TEXT_1127 = ".each do |";
  public static final String TEXT_1128 = "|" + NL + "      @";
  public static final String TEXT_1129 = " << ";
  public static final String TEXT_1130 = NL + "    end" + NL + NL + "    was_set = true";
  public static final String TEXT_1131 = NL + "    was_set" + NL + "  end" + NL;
  public static final String TEXT_1132 = NL + "  def ";
  public static final String TEXT_1133 = "(";
  public static final String TEXT_1134 = ")" + NL + "    was_set = false";
  public static final String TEXT_1135 = NL + "    ";
  public static final String TEXT_1136 = " = []" + NL + "    ";
  public static final String TEXT_1137 = ".each do |";
  public static final String TEXT_1138 = "|" + NL + "      next if (";
  public static final String TEXT_1139 = ".include?(";
  public static final String TEXT_1140 = "))" + NL + "      ";
  public static final String TEXT_1141 = " << ";
  public static final String TEXT_1142 = NL + "    end" + NL + NL + "    if ";
  public static final String TEXT_1143 = ".size != ";
  public static final String TEXT_1144 = ".size";
  public static final String TEXT_1145 = NL + "      return was_set" + NL + "    end" + NL + NL + "    @";
  public static final String TEXT_1146 = ".clear" + NL + "    ";
  public static final String TEXT_1147 = ".each do |";
  public static final String TEXT_1148 = "|" + NL + "      @";
  public static final String TEXT_1149 = " << ";
  public static final String TEXT_1150 = NL + "    end" + NL + "    was_set = true";
  public static final String TEXT_1151 = NL + "    was_set" + NL + "  end" + NL;
  public static final String TEXT_1152 = NL + "  def ";
  public static final String TEXT_1153 = "(";
  public static final String TEXT_1154 = ")" + NL + "    #" + NL + "    # self source of self source generation is association_SetOptionalOneToMandatoryMany.jet" + NL + "    # self set file assumes the generation of a maximumNumberOfXXX method does not exist because " + NL + "    # it's not required (No upper bound)" + NL + "    #   " + NL + "    " + NL + "    wasSet = false" + NL + "    " + NL + "    ";
  public static final String TEXT_1155 = " = ";
  public static final String TEXT_1156 = ";" + NL + "    " + NL + "    if ";
  public static final String TEXT_1157 = ".nil?" + NL + "      if !";
  public static final String TEXT_1158 = ".nil" + NL + "        if ";
  public static final String TEXT_1159 = ".";
  public static final String TEXT_1160 = "(self)" + NL + "          ";
  public static final String TEXT_1161 = " = ";
  public static final String TEXT_1162 = NL + "          wasSet = true" + NL + "        end" + NL + "      end" + NL + "    elsif ";
  public static final String TEXT_1163 = " != null" + NL + "      if ";
  public static final String TEXT_1164 = " == null" + NL + "        if ";
  public static final String TEXT_1165 = ".";
  public static final String TEXT_1166 = "() < ";
  public static final String TEXT_1167 = ".";
  public static final String TEXT_1168 = "()" + NL + "          ";
  public static final String TEXT_1169 = ".";
  public static final String TEXT_1170 = "(self);" + NL + "          ";
  public static final String TEXT_1171 = " = ";
  public static final String TEXT_1172 = ";  # ";
  public static final String TEXT_1173 = " == null" + NL + "          wasSet = true;" + NL + "        end" + NL + "      else" + NL + "        if ";
  public static final String TEXT_1174 = ".";
  public static final String TEXT_1175 = "() < ";
  public static final String TEXT_1176 = ".";
  public static final String TEXT_1177 = "()" + NL + "          ";
  public static final String TEXT_1178 = ".";
  public static final String TEXT_1179 = "(self);" + NL + "          ";
  public static final String TEXT_1180 = ".";
  public static final String TEXT_1181 = "(self);" + NL + "          ";
  public static final String TEXT_1182 = " = ";
  public static final String TEXT_1183 = ";" + NL + "          wasSet = true;" + NL + "        end" + NL + "      end" + NL + "    end" + NL + "    " + NL + "    if wasSet == true" + NL + "      ";
  public static final String TEXT_1184 = " = ";
  public static final String TEXT_1185 = ";" + NL + "    end" + NL + "    " + NL + "    return wasSet;" + NL + "  end" + NL;
  public static final String TEXT_1186 = NL + "#  def ";
  public static final String TEXT_1187 = NL + "#  " + NL + "#    #" + NL + "#    # The source of the code generation is association_SetOptionalOneToMN.jet" + NL + "#    # (this) set file assumes the generation of a maximumNumberOfXXX " + NL + "#    #   method ";
  public static final String TEXT_1188 = NL + "#    # Currently this will not compile due to Issue351 - the template code is fine." + NL + "#    #" + NL + "#    wasSet = false" + NL + "#" + NL + "#    ";
  public static final String TEXT_1189 = " = ";
  public static final String TEXT_1190 = NL + "#    " + NL + "#    if ";
  public static final String TEXT_1191 = " == null" + NL + "#      if ";
  public static final String TEXT_1192 = " != null" + NL + "#        if ";
  public static final String TEXT_1193 = ".";
  public static final String TEXT_1194 = "(self)" + NL + "#          ";
  public static final String TEXT_1195 = " = ";
  public static final String TEXT_1196 = NL + "#          wasSet = true" + NL + "#        end" + NL + "#      end" + NL + "#    else if ";
  public static final String TEXT_1197 = " != null" + NL + "#      if ";
  public static final String TEXT_1198 = " == null" + NL + "#        if ";
  public static final String TEXT_1199 = ".";
  public static final String TEXT_1200 = " < ";
  public static final String TEXT_1201 = ".";
  public static final String TEXT_1202 = NL + "#          ";
  public static final String TEXT_1203 = ".";
  public static final String TEXT_1204 = "(self)" + NL + "#          ";
  public static final String TEXT_1205 = " = ";
  public static final String TEXT_1206 = "  # ";
  public static final String TEXT_1207 = " == null" + NL + "#          wasSet = true" + NL + "#        end" + NL + "#      else" + NL + "#        if     ";
  public static final String TEXT_1208 = ".";
  public static final String TEXT_1209 = " < ";
  public static final String TEXT_1210 = ".";
  public static final String TEXT_1211 = "()" + NL + "#            && ";
  public static final String TEXT_1212 = ".";
  public static final String TEXT_1213 = " > ";
  public static final String TEXT_1214 = ".";
  public static final String TEXT_1215 = "()" + NL + "#          ";
  public static final String TEXT_1216 = ".";
  public static final String TEXT_1217 = "(self)" + NL + "#          ";
  public static final String TEXT_1218 = ".";
  public static final String TEXT_1219 = "(self)" + NL + "#          ";
  public static final String TEXT_1220 = " = ";
  public static final String TEXT_1221 = NL + "#          wasSet = true" + NL + "#        end" + NL + "#      end" + NL + "#    end" + NL + "#    " + NL + "#    if wasSet" + NL + "#      ";
  public static final String TEXT_1222 = " = ";
  public static final String TEXT_1223 = NL + "#    end" + NL + "#    " + NL + "#    return wasSet" + NL + "#  end" + NL + " ";
  public static final String TEXT_1224 = NL + "  def ";
  public static final String TEXT_1225 = "(";
  public static final String TEXT_1226 = ")" + NL + "    was_set = false";
  public static final String TEXT_1227 = NL + "    ";
  public static final String TEXT_1228 = " = []" + NL + "    ";
  public static final String TEXT_1229 = ".each do |";
  public static final String TEXT_1230 = "|" + NL + "      next if (";
  public static final String TEXT_1231 = ".include?(";
  public static final String TEXT_1232 = ")) " + NL + "      ";
  public static final String TEXT_1233 = " << ";
  public static final String TEXT_1234 = NL + "    end" + NL + NL + "    if ";
  public static final String TEXT_1235 = ".size != ";
  public static final String TEXT_1236 = ".length or ";
  public static final String TEXT_1237 = ".size < ";
  public static final String TEXT_1238 = ".";
  public static final String TEXT_1239 = " or ";
  public static final String TEXT_1240 = ".size() > ";
  public static final String TEXT_1241 = ".";
  public static final String TEXT_1242 = "";
  public static final String TEXT_1243 = NL + "      return was_set" + NL + "    end" + NL + NL + "    ";
  public static final String TEXT_1244 = " = @";
  public static final String TEXT_1245 = ".dup" + NL + "    @";
  public static final String TEXT_1246 = ".clear" + NL + "    ";
  public static final String TEXT_1247 = ".each do |";
  public static final String TEXT_1248 = "|" + NL + "      @";
  public static final String TEXT_1249 = " << ";
  public static final String TEXT_1250 = NL + "      if ";
  public static final String TEXT_1251 = ".include?(";
  public static final String TEXT_1252 = ")" + NL + "        ";
  public static final String TEXT_1253 = ".delete(";
  public static final String TEXT_1254 = ")" + NL + "      else" + NL + "        ";
  public static final String TEXT_1255 = ".";
  public static final String TEXT_1256 = "(self)" + NL + "      end" + NL + "    end" + NL + NL + "    ";
  public static final String TEXT_1257 = ".each do |";
  public static final String TEXT_1258 = "|" + NL + "      ";
  public static final String TEXT_1259 = ".";
  public static final String TEXT_1260 = "(self)" + NL + "    end" + NL + "    was_set = true";
  public static final String TEXT_1261 = NL + "    was_set" + NL + "  end" + NL;
  public static final String TEXT_1262 = NL + "  def ";
  public static final String TEXT_1263 = "(";
  public static final String TEXT_1264 = ")" + NL + "    was_set = false";
  public static final String TEXT_1265 = NL + "    ";
  public static final String TEXT_1266 = " = []" + NL + "    ";
  public static final String TEXT_1267 = ".each do |";
  public static final String TEXT_1268 = "|" + NL + "      next if (";
  public static final String TEXT_1269 = ".include?(";
  public static final String TEXT_1270 = "))" + NL + "      ";
  public static final String TEXT_1271 = " << ";
  public static final String TEXT_1272 = NL + "    end" + NL + NL + "    if ";
  public static final String TEXT_1273 = ".size != ";
  public static final String TEXT_1274 = ".size or ";
  public static final String TEXT_1275 = ".size < ";
  public static final String TEXT_1276 = ".";
  public static final String TEXT_1277 = "";
  public static final String TEXT_1278 = NL + "      return was_set" + NL + "    end" + NL + NL + "    ";
  public static final String TEXT_1279 = " = @";
  public static final String TEXT_1280 = ".dup" + NL + "    @";
  public static final String TEXT_1281 = ".clear" + NL + "    ";
  public static final String TEXT_1282 = ".each do |";
  public static final String TEXT_1283 = "|" + NL + "      @";
  public static final String TEXT_1284 = " << ";
  public static final String TEXT_1285 = NL + "      if ";
  public static final String TEXT_1286 = ".include?(";
  public static final String TEXT_1287 = ")" + NL + "        ";
  public static final String TEXT_1288 = ".delete(";
  public static final String TEXT_1289 = ")" + NL + "      else" + NL + "        ";
  public static final String TEXT_1290 = ".";
  public static final String TEXT_1291 = "(self)" + NL + "      end" + NL + "    end" + NL + NL + "    ";
  public static final String TEXT_1292 = ".each do |";
  public static final String TEXT_1293 = "|" + NL + "      ";
  public static final String TEXT_1294 = ".";
  public static final String TEXT_1295 = "(self)" + NL + "    end" + NL + "    was_set = true";
  public static final String TEXT_1296 = NL + "    was_set" + NL + "  end" + NL;
  public static final String TEXT_1297 = NL + "  def ";
  public static final String TEXT_1298 = "(";
  public static final String TEXT_1299 = ")" + NL + "    was_set = false";
  public static final String TEXT_1300 = NL + "    ";
  public static final String TEXT_1301 = " = []" + NL + "    ";
  public static final String TEXT_1302 = ".each do |";
  public static final String TEXT_1303 = "|" + NL + "      next if (";
  public static final String TEXT_1304 = ".include?(";
  public static final String TEXT_1305 = "))" + NL + "      ";
  public static final String TEXT_1306 = " << ";
  public static final String TEXT_1307 = NL + "    end" + NL + NL + "    if ";
  public static final String TEXT_1308 = ".size != ";
  public static final String TEXT_1309 = ".size or ";
  public static final String TEXT_1310 = ".size < ";
  public static final String TEXT_1311 = ".";
  public static final String TEXT_1312 = " or ";
  public static final String TEXT_1313 = ".size > ";
  public static final String TEXT_1314 = ".";
  public static final String TEXT_1315 = "";
  public static final String TEXT_1316 = NL + "      return was_set" + NL + "    end" + NL + NL + "    @";
  public static final String TEXT_1317 = ".clear" + NL + "    ";
  public static final String TEXT_1318 = ".each do |";
  public static final String TEXT_1319 = "|" + NL + "      @";
  public static final String TEXT_1320 = " << ";
  public static final String TEXT_1321 = NL + "    end" + NL + "    was_set = true";
  public static final String TEXT_1322 = NL + "    was_set" + NL + "  end" + NL;
  public static final String TEXT_1323 = NL + "  def ";
  public static final String TEXT_1324 = "(";
  public static final String TEXT_1325 = ")" + NL + "    was_set = false";
  public static final String TEXT_1326 = NL + "    if ";
  public static final String TEXT_1327 = ".length < ";
  public static final String TEXT_1328 = ".";
  public static final String TEXT_1329 = "";
  public static final String TEXT_1330 = NL + "      return was_set" + NL + "    end" + NL + NL + "    ";
  public static final String TEXT_1331 = " = []" + NL + "    ";
  public static final String TEXT_1332 = " = {}" + NL + "    ";
  public static final String TEXT_1333 = ".each do |";
  public static final String TEXT_1334 = "|" + NL + "      if ";
  public static final String TEXT_1335 = ".include?(";
  public static final String TEXT_1336 = ")";
  public static final String TEXT_1337 = NL + "        return was_set" + NL + "      elsif !";
  public static final String TEXT_1338 = ".";
  public static final String TEXT_1339 = ".nil? and !";
  public static final String TEXT_1340 = ".";
  public static final String TEXT_1341 = ".eql?(self)" + NL + "        ";
  public static final String TEXT_1342 = " = ";
  public static final String TEXT_1343 = ".";
  public static final String TEXT_1344 = NL + "        unless ";
  public static final String TEXT_1345 = ".has_key?(";
  public static final String TEXT_1346 = ")" + NL + "          ";
  public static final String TEXT_1347 = "[";
  public static final String TEXT_1348 = "] = ";
  public static final String TEXT_1349 = ".";
  public static final String TEXT_1350 = NL + "        end" + NL + "        currentCount = ";
  public static final String TEXT_1351 = "[";
  public static final String TEXT_1352 = "]" + NL + "        nextCount = currentCount - 1" + NL + "        if nextCount < ";
  public static final String TEXT_1353 = "";
  public static final String TEXT_1354 = NL + "          return was_set" + NL + "        end" + NL + "        ";
  public static final String TEXT_1355 = "[";
  public static final String TEXT_1356 = "] = nextCount" + NL + "      end" + NL + "      ";
  public static final String TEXT_1357 = " << ";
  public static final String TEXT_1358 = NL + "    end" + NL + NL + "    ";
  public static final String TEXT_1359 = ".each do |";
  public static final String TEXT_1360 = "|" + NL + "      @";
  public static final String TEXT_1361 = ".delete(";
  public static final String TEXT_1362 = ")" + NL + "    end" + NL + NL + "    @";
  public static final String TEXT_1363 = ".each do |orphan|" + NL + "      orphan.instance_variable_set(\"@";
  public static final String TEXT_1364 = "\",nil)" + NL + "    end" + NL + "    @";
  public static final String TEXT_1365 = ".clear" + NL + "    ";
  public static final String TEXT_1366 = ".each do |";
  public static final String TEXT_1367 = "|" + NL + "      unless ";
  public static final String TEXT_1368 = ".";
  public static final String TEXT_1369 = ".nil?" + NL + "        ";
  public static final String TEXT_1370 = ".";
  public static final String TEXT_1371 = ".instance_variable_get(\"@";
  public static final String TEXT_1372 = "\").delete(";
  public static final String TEXT_1373 = ")" + NL + "      end" + NL + "      ";
  public static final String TEXT_1374 = ".instance_variable_set(\"@";
  public static final String TEXT_1375 = "\",self)" + NL + "      @";
  public static final String TEXT_1376 = " << ";
  public static final String TEXT_1377 = NL + "    end" + NL + "    was_set = true";
  public static final String TEXT_1378 = NL + "    was_set" + NL + "  end" + NL;
  public static final String TEXT_1379 = NL + "  def ";
  public static final String TEXT_1380 = "(";
  public static final String TEXT_1381 = ")" + NL + "    was_set = false";
  public static final String TEXT_1382 = NL + "    ";
  public static final String TEXT_1383 = " = []" + NL + "    ";
  public static final String TEXT_1384 = ".each do |";
  public static final String TEXT_1385 = "|" + NL + "      next if (";
  public static final String TEXT_1386 = ".include?(";
  public static final String TEXT_1387 = "))" + NL + "      ";
  public static final String TEXT_1388 = " << ";
  public static final String TEXT_1389 = NL + "    end" + NL + NL + "    if ";
  public static final String TEXT_1390 = ".size != ";
  public static final String TEXT_1391 = ".size or ";
  public static final String TEXT_1392 = ".size() > ";
  public static final String TEXT_1393 = ".";
  public static final String TEXT_1394 = "";
  public static final String TEXT_1395 = NL + "      return was_set" + NL + "    end" + NL + NL + "    @";
  public static final String TEXT_1396 = ".clear" + NL + "    ";
  public static final String TEXT_1397 = ".each do |";
  public static final String TEXT_1398 = "|" + NL + "      @";
  public static final String TEXT_1399 = " << ";
  public static final String TEXT_1400 = NL + "    end" + NL + NL + "    was_set = true";
  public static final String TEXT_1401 = NL + "    was_set" + NL + "  end" + NL;
  public static final String TEXT_1402 = NL + "  def ";
  public static final String TEXT_1403 = "(";
  public static final String TEXT_1404 = ")" + NL + "    was_set = false";
  public static final String TEXT_1405 = NL + "    ";
  public static final String TEXT_1406 = " = []" + NL + "    ";
  public static final String TEXT_1407 = ".each do |";
  public static final String TEXT_1408 = "|" + NL + "      next if (";
  public static final String TEXT_1409 = ".include?(";
  public static final String TEXT_1410 = "))" + NL + "      ";
  public static final String TEXT_1411 = " << ";
  public static final String TEXT_1412 = NL + "    end" + NL + NL + "    if ";
  public static final String TEXT_1413 = ".size != ";
  public static final String TEXT_1414 = ".size or ";
  public static final String TEXT_1415 = ".size() < ";
  public static final String TEXT_1416 = ".";
  public static final String TEXT_1417 = "";
  public static final String TEXT_1418 = NL + "      return was_set" + NL + "    end" + NL + NL + "    @";
  public static final String TEXT_1419 = ".clear" + NL + "    ";
  public static final String TEXT_1420 = ".each do |";
  public static final String TEXT_1421 = "|" + NL + "      @";
  public static final String TEXT_1422 = " << ";
  public static final String TEXT_1423 = NL + "    end" + NL + NL + "    was_set = true";
  public static final String TEXT_1424 = NL + "    was_set" + NL + "  end" + NL;
  public static final String TEXT_1425 = NL;
  public static final String TEXT_1426 = NL + "  def ";
  public static final String TEXT_1427 = "(";
  public static final String TEXT_1428 = ", index)" + NL + "    was_added = false" + NL + "    if ";
  public static final String TEXT_1429 = "(";
  public static final String TEXT_1430 = ")" + NL + "      if(index < 0)" + NL + "        index = 0" + NL + "      end" + NL + "      if(index > ";
  public static final String TEXT_1431 = "())" + NL + "        index = ";
  public static final String TEXT_1432 = "() - 1" + NL + "      end" + NL + "      @";
  public static final String TEXT_1433 = ".delete(";
  public static final String TEXT_1434 = ")" + NL + "      @";
  public static final String TEXT_1435 = ".insert(index, ";
  public static final String TEXT_1436 = ")" + NL + "      was_added = true" + NL + "    end" + NL + "    was_added" + NL + "  end" + NL + NL + "  def ";
  public static final String TEXT_1437 = "(";
  public static final String TEXT_1438 = ", index)" + NL + "    was_added = false" + NL + "    if @";
  public static final String TEXT_1439 = ".include?(";
  public static final String TEXT_1440 = ")" + NL + "      if(index < 0)" + NL + "        index = 0" + NL + "      end" + NL + "      if(index > ";
  public static final String TEXT_1441 = "())" + NL + "        index = ";
  public static final String TEXT_1442 = "() - 1" + NL + "      end" + NL + "      @";
  public static final String TEXT_1443 = ".delete(";
  public static final String TEXT_1444 = ")" + NL + "      @";
  public static final String TEXT_1445 = ".insert(index, ";
  public static final String TEXT_1446 = ")" + NL + "      was_added = true" + NL + "    else" + NL + "      was_added = ";
  public static final String TEXT_1447 = "(";
  public static final String TEXT_1448 = ", index)" + NL + "    end" + NL + "    was_added" + NL + "  end" + NL;
  public static final String TEXT_1449 = "";
  public static final String TEXT_1450 = NL + "  def eql?(obj)" + NL + "    return false if obj.nil?" + NL + "    return false unless self.class == obj.class" + NL + NL + "    compareTo = obj" + NL + "    ";
  public static final String TEXT_1451 = NL + "    true" + NL + "  end" + NL + NL + "  def hash" + NL + "    return @cachedHashCode unless @cachedHashCode == -1" + NL + "    @cachedHashCode = 17" + NL + "    ";
  public static final String TEXT_1452 = NL + "    ";
  public static final String TEXT_1453 = NL + "    @cachedHashCode" + NL + "  end" + NL;
  public static final String TEXT_1454 = "";
  public static final String TEXT_1455 = NL + "  def ";
  public static final String TEXT_1456 = NL + "    ";
  public static final String TEXT_1457 = NL + "  end" + NL;
  public static final String TEXT_1458 = NL + "  private static class DoActivityThread extends Thread" + NL + "  {" + NL + "    ";
  public static final String TEXT_1459 = " controller;" + NL + "    String doActivityMethodName;" + NL + "    " + NL + "    public DoActivityThread(";
  public static final String TEXT_1460 = " aController,String aDoActivityMethodName)" + NL + "    {" + NL + "      controller = aController;" + NL + "      doActivityMethodName = aDoActivityMethodName;" + NL + "      start();" + NL + "    }" + NL + "    " + NL + "    def run()" + NL + "    {" + NL + "      try" + NL + "      {" + NL + "        ";
  public static final String TEXT_1461 = NL + "      }" + NL + "      catch (InterruptedException e)" + NL + "      {" + NL + "        e.printStackTrace();" + NL + "      }" + NL + "    }" + NL + "  }" + NL;
  public static final String TEXT_1462 = NL + "  def ";
  public static final String TEXT_1463 = NL + "    ";
  public static final String TEXT_1464 = " = new TimedEventHandler(this,\"";
  public static final String TEXT_1465 = "\",";
  public static final String TEXT_1466 = ")" + NL + "  end" + NL + NL + "  def ";
  public static final String TEXT_1467 = NL + "    ";
  public static final String TEXT_1468 = ".stop()" + NL + "  end" + NL;
  public static final String TEXT_1469 = NL + "  public static class TimedEventHandler extends TimerTask  " + NL + "  {" + NL + "    private ";
  public static final String TEXT_1470 = " controller;" + NL + "    private String timeoutMethodName;" + NL + "    private double howLongInSeconds;" + NL + "    private Timer timer;" + NL + "    " + NL + "    public TimedEventHandler(";
  public static final String TEXT_1471 = " aController, String aTimeoutMethodName, double aHowLongInSeconds)" + NL + "    {" + NL + "      controller = aController;" + NL + "      timeoutMethodName = aTimeoutMethodName;" + NL + "      howLongInSeconds = aHowLongInSeconds;" + NL + "      timer = new Timer();" + NL + "      timer.schedule(this, (long)howLongInSeconds*1000);" + NL + "    }" + NL + "    " + NL + "    def stop" + NL + "      timer.cancel();" + NL + "    end" + NL + "    " + NL + "    def run";
  public static final String TEXT_1472 = NL + "      if (\"";
  public static final String TEXT_1473 = "\".eql?(timeoutMethodName))" + NL + "      {" + NL + "        shouldRestart = !controller.";
  public static final String TEXT_1474 = NL + "        if (shouldRestart)" + NL + "        {" + NL + "          controller.";
  public static final String TEXT_1475 = NL + "        }" + NL + "        return;" + NL + "      }";
  public static final String TEXT_1476 = NL + "    end" + NL + "  }" + NL;
  public static final String TEXT_1477 = NL + "    @";
  public static final String TEXT_1478 = " = nil";
  public static final String TEXT_1479 = NL + "    @";
  public static final String TEXT_1480 = ".clear";
  public static final String TEXT_1481 = NL + "    ";
  public static final String TEXT_1482 = " = @";
  public static final String TEXT_1483 = NL + "    @";
  public static final String TEXT_1484 = " = nil" + NL + "    unless ";
  public static final String TEXT_1485 = ".nil?" + NL + "      ";
  public static final String TEXT_1486 = ".delete" + NL + "    end";
  public static final String TEXT_1487 = NL + "    " + NL + "    if @";
  public static final String TEXT_1488 = " != nil" + NL + "        @";
  public static final String TEXT_1489 = ".delete" + NL + "        @";
  public static final String TEXT_1490 = " = nil" + NL + "    end" + NL + "    ";
  public static final String TEXT_1491 = NL + "    while @";
  public static final String TEXT_1492 = ".any? do" + NL + "      curSize = @";
  public static final String TEXT_1493 = ".size" + NL + "      if @";
  public static final String TEXT_1494 = "[0] != nil" + NL + "          ";
  public static final String TEXT_1495 = " = @";
  public static final String TEXT_1496 = "[0]" + NL + "          @";
  public static final String TEXT_1497 = "[0] = nil" + NL + "          ";
  public static final String TEXT_1498 = ".delete" + NL + "      end" + NL + "      if curSize == @";
  public static final String TEXT_1499 = ".size" + NL + "          @";
  public static final String TEXT_1500 = ".shift  # this deletes the first value in the array" + NL + "      end" + NL + "    end" + NL + "    @";
  public static final String TEXT_1501 = ".clear";
  public static final String TEXT_1502 = NL + "    while @";
  public static final String TEXT_1503 = ".any? do" + NL + "      curSize = @";
  public static final String TEXT_1504 = ".size" + NL + "      @";
  public static final String TEXT_1505 = "[0].delete" + NL + "      if curSize == @";
  public static final String TEXT_1506 = ".size" + NL + "          @";
  public static final String TEXT_1507 = ".shift  # this deletes the first value in the array" + NL + "      end" + NL + "    end" + NL + "    @";
  public static final String TEXT_1508 = ".clear" + NL + "    ";
  public static final String TEXT_1509 = NL + "    while @";
  public static final String TEXT_1510 = ".any? do" + NL + "      @";
  public static final String TEXT_1511 = "[0].instance_variable_set(\"@";
  public static final String TEXT_1512 = "\",nil)" + NL + "      @";
  public static final String TEXT_1513 = ".shift  # this deletes the first value in the array" + NL + "    end" + NL + "    @";
  public static final String TEXT_1514 = ".clear    ";
  public static final String TEXT_1515 = NL + "    if @";
  public static final String TEXT_1516 = " != nil" + NL + "      if @";
  public static final String TEXT_1517 = ".";
  public static final String TEXT_1518 = " <= ";
  public static final String TEXT_1519 = NL + "        @";
  public static final String TEXT_1520 = ".delete" + NL + "    @";
  public static final String TEXT_1521 = " = nil" + NL + "      else" + NL + "        ";
  public static final String TEXT_1522 = " = @";
  public static final String TEXT_1523 = ".";
  public static final String TEXT_1524 = NL + "    ";
  public static final String TEXT_1525 = ".delete(@";
  public static final String TEXT_1526 = ")" + NL + "    @";
  public static final String TEXT_1527 = " = nil" + NL + "      end" + NL + "    end";
  public static final String TEXT_1528 = NL + "    while @";
  public static final String TEXT_1529 = ".any? do" + NL + "      curSize = @";
  public static final String TEXT_1530 = ".size" + NL + "      @";
  public static final String TEXT_1531 = "[0].";
  public static final String TEXT_1532 = "(self)" + NL + "      if curSize == @";
  public static final String TEXT_1533 = ".size" + NL + "          @";
  public static final String TEXT_1534 = ".shift  # this deletes the first value in the array" + NL + "      end" + NL + "    end" + NL + "    @";
  public static final String TEXT_1535 = ".clear";
  public static final String TEXT_1536 = NL + "    unless @";
  public static final String TEXT_1537 = ".nil?" + NL + "      @";
  public static final String TEXT_1538 = ".";
  public static final String TEXT_1539 = "(nil)" + NL + "    end";
  public static final String TEXT_1540 = NL + "    ";
  public static final String TEXT_1541 = " = @";
  public static final String TEXT_1542 = NL + "    @";
  public static final String TEXT_1543 = " = nil" + NL + "    unless ";
  public static final String TEXT_1544 = ".nil?" + NL + "      ";
  public static final String TEXT_1545 = ".";
  public static final String TEXT_1546 = "(nil)" + NL + "    end";
  public static final String TEXT_1547 = NL + "    ";
  public static final String TEXT_1548 = " = @";
  public static final String TEXT_1549 = NL + "    @";
  public static final String TEXT_1550 = " = nil" + NL + "    unless ";
  public static final String TEXT_1551 = ".nil?" + NL + "      ";
  public static final String TEXT_1552 = ".delete" + NL + "    end";
  public static final String TEXT_1553 = NL + "    unless @";
  public static final String TEXT_1554 = ".nil?" + NL + "      @";
  public static final String TEXT_1555 = ".";
  public static final String TEXT_1556 = "(self)" + NL + "    end";
  public static final String TEXT_1557 = NL + "    unless @";
  public static final String TEXT_1558 = ".nil?" + NL + "      ";
  public static final String TEXT_1559 = " = @";
  public static final String TEXT_1560 = NL + "      @";
  public static final String TEXT_1561 = " = nil" + NL + "      ";
  public static final String TEXT_1562 = ".delete" + NL + "    end";
  public static final String TEXT_1563 = NL + "    unless @";
  public static final String TEXT_1564 = ".nil?" + NL + "      if @";
  public static final String TEXT_1565 = ".";
  public static final String TEXT_1566 = " <= ";
  public static final String TEXT_1567 = NL + "        @";
  public static final String TEXT_1568 = ".delete" + NL + "      else" + NL + "        @";
  public static final String TEXT_1569 = ".";
  public static final String TEXT_1570 = "(self)" + NL + "      end" + NL + "    end";
  public static final String TEXT_1571 = NL + "    @";
  public static final String TEXT_1572 = " = @";
  public static final String TEXT_1573 = NL + "    @";
  public static final String TEXT_1574 = " = nil" + NL + "    @";
  public static final String TEXT_1575 = ".";
  public static final String TEXT_1576 = "(self)";
  public static final String TEXT_1577 = NL + "    @";
  public static final String TEXT_1578 = ".each do |";
  public static final String TEXT_1579 = "|" + NL + "      ";
  public static final String TEXT_1580 = ".instance_variable_set(\"@";
  public static final String TEXT_1581 = "\",nil)" + NL + "    end" + NL + "    @";
  public static final String TEXT_1582 = ".clear";
  public static final String TEXT_1583 = NL + "    ";
  public static final String TEXT_1584 = " = @";
  public static final String TEXT_1585 = ".dup" + NL + "    @";
  public static final String TEXT_1586 = ".clear" + NL + "    ";
  public static final String TEXT_1587 = ".each do |";
  public static final String TEXT_1588 = "|" + NL + "      if ";
  public static final String TEXT_1589 = ".";
  public static final String TEXT_1590 = " <= ";
  public static final String TEXT_1591 = ".";
  public static final String TEXT_1592 = NL + "        ";
  public static final String TEXT_1593 = ".delete" + NL + "      else" + NL + "        ";
  public static final String TEXT_1594 = ".";
  public static final String TEXT_1595 = "(self)" + NL + "      end" + NL + "    end";
  public static final String TEXT_1596 = NL + "    ";
  public static final String TEXT_1597 = " = @";
  public static final String TEXT_1598 = ".dup" + NL + "    @";
  public static final String TEXT_1599 = ".clear" + NL + "    ";
  public static final String TEXT_1600 = ".each do |";
  public static final String TEXT_1601 = "|" + NL + "      ";
  public static final String TEXT_1602 = ".";
  public static final String TEXT_1603 = "(self)" + NL + "    end";
  public static final String TEXT_1604 = NL + "    @";
  public static final String TEXT_1605 = ".each do |";
  public static final String TEXT_1606 = "|" + NL + "      ";
  public static final String TEXT_1607 = ".delete" + NL + "    end";
  public static final String TEXT_1608 = NL + "    @";
  public static final String TEXT_1609 = ".each do |";
  public static final String TEXT_1610 = "|" + NL + "      ";
  public static final String TEXT_1611 = ".";
  public static final String TEXT_1612 = "(nil)" + NL + "    end";
  public static final String TEXT_1613 = "";
  public static final String TEXT_1614 = "";
  public static final String TEXT_1615 = NL + NL;
  public static final String TEXT_1616 = "";
  public static final String TEXT_1617 = "";
  public static final String TEXT_1618 = NL + "  #------------------------" + NL + "  # DEVELOPER CODE - PROVIDED AS-IS" + NL + "  #------------------------" + NL + "  " + NL + "  ";
  public static final String TEXT_1619 = "";
  public static final String TEXT_1620 = NL + "end" + NL;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public RubyClassGenerator()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}


  /**
   * Add a newline to the end of the input
   */
  // line 39 "../../../../../UmpleTLTemplates/rubyClassGenerator.ump"
   private void appendln(StringBuilder buffer, String input, Object... variables){
    append(buffer, input + "\n", variables);
  }


  /**
   * This method will be used to append formatted strings
   * i.e. format("Hello {0} {1}", "andrew","forward");
   */
  // line 46 "../../../../../UmpleTLTemplates/rubyClassGenerator.ump"
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
    
    /*rubyClassGenerator*/
    /*UmpleNotice*/
    realSb.append(TEXT_0);
    realSb.append(TEXT_1);
    
  UmpleClass uClass = (UmpleClass) uElement;
  GeneratedClass gClass = uClass.getGeneratedClass();
  RubyGenerator gen = new RubyGenerator();
  GeneratorHelper.generator = gen;
  gen.setModel(model);
  gen.jgen.setModel(model);

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


    realSb.append(TEXT_2);
    realSb.append(gen.translate("packageDefinition",uClass));
    /*import_packages*/
    
  for (Depend depend : uClass.getDepends())
  {
    appendln(realSb, "");
    append(realSb, "require '{0}'",depend.getName());
  }
  
  for (String anImport : gClass.getMultiLookup("import"))
  {
    appendln(realSb, "");
    append(realSb, "require '{0}'",anImport);
  }

    realSb.append(TEXT_3);
     if (uClass.numberOfComments() > 0) { if(!uClass.getComments().get(0).getIsInline()) {append(realSb, "\n{0}", Comment.format("RubyMultiline",uClass.getComments()));} else { append(realSb, "\n{0}", Comment.format("Hash",uClass.getComments()));} } 
    realSb.append(TEXT_4);
    realSb.append(uClass.getName());
    realSb.append(gen.translate("isA",uClass));
    realSb.append(TEXT_5);
    /*members_AllStatics*/
    

  if (uClass.getIsSingleton())
  {
    append(realSb, "  include Singleton");
  }

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
      appendln(realSb, "  #------------------------");
      appendln(realSb, "  # STATIC VARIABLES");
      appendln(realSb, "  #------------------------");
      isFirst = false;
    }
  
    if (av.isConstant())
    {
      appendln(realSb, "");
      append(realSb, "  {0} = {1};", gen.translate("attributeConstant",av), gen.translate("parameterValue",av));
    }
    else if (av.getIsAutounique())
    {
      String defaultValue = av.getValue() == null ? "1" : av.getValue();
      appendln(realSb, "");
      append(realSb, "  @@{0} = {1}", gen.translate("parameterNext",av), defaultValue);
    }
    else if (av.getIsUnique())
    {
      appendln(realSb, "");
      append(realSb, "  class << self; attr_accessor :{0} end", gen.translate("uniqueMap", av));
      appendln(realSb, "");
      append(realSb, "  @{0} = Hash.new", gen.translate("uniqueMap", av));
    }
  }
  

    /*members_AllAttributes*/
    
  
  isFirst = true;
  for(Attribute av : uClass.getAttributes())
  {
    if (av.isConstant() || av.getIsAutounique() || av.getIsDerived())
    {
      continue;
    }
    String attribute = av.getIsList() ? gen.translate("attributeMany",av) : gen.translate("attributeOne",av);
 
    if (isFirst)
    {
      appendln(realSb, "");
      appendln(realSb, "");
      appendln(realSb, "  #------------------------");
      appendln(realSb, "  # MEMBER VARIABLES");
      append(realSb, "  #------------------------");
      appendln(realSb, "");
      appendln(realSb, "");
      appendln(realSb,"  #{0} Attributes - for documentation purposes", uClass.getName());
      
      if (av.numberOfComments() > 0) { append(realSb, "\n  {0}\n", Comment.format("RubyMultiline Internal", av.getComments())); }
      
      append(realSb,"  #attr_reader :{0}",attribute);
      isFirst = false;
    }
    else
    {
      append(realSb,", :{0}",attribute);
    }
  }
  
  boolean isFirstAutounique = true;
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
      appendln(realSb, "  #------------------------");
      appendln(realSb, "  # MEMBER VARIABLES");
      append(realSb, "  #------------------------");
      appendln(realSb, "");
      appendln(realSb, "");
      isFirst = false;
    }
    
    if (isFirstAutounique)
    {
      appendln(realSb, "");
      appendln(realSb, "");
      append(realSb,"  #Autounique Attributes - for documentation purposes");
      isFirstAutounique = false;
    }
    appendln(realSb, "");
    String attribute = av.getIsList() ? gen.translate("attributeMany",av) : gen.translate("attributeOne",av);
    append(realSb, "  #attr_reader {0};", attribute);
  }


    /*members_AllStateMachines*/
    
  boolean isFirstStateMachine = true;
  for(StateMachine sm : uClass.getStateMachines())
  {
    List<StateMachine> allNested = sm.getNestedStateMachines();

    if (isFirst)
    {
      appendln(realSb, "");
      appendln(realSb, "");
      appendln(realSb, "  #------------------------");
      appendln(realSb, "  # MEMBER VARIABLES");
      append(realSb, "  #------------------------");
      isFirst = false;
    }

    if (isFirstStateMachine)
    {
      appendln(realSb, "");
      appendln(realSb, "");
      append(realSb,"  #{0} State Machines", uClass.getName());
      isFirstStateMachine = false;
    }
  
    append(realSb, "\n  enum {0} { {1} }", gen.translate("type",sm), gen.translate("listStates",sm));

    for (StateMachine nestedSm : allNested)
    {
      append(realSb, "\n  enum {0} { {1} }", gen.translate("type",nestedSm), gen.translate("listStates",nestedSm));
    }
    
    append(realSb, "\n  private {0} {1};", gen.translate("type",sm), gen.translate("stateMachineOne", sm));
    for (StateMachine nestedSm : allNested)
    {
      append(realSb, "\n  private {0} {1};", gen.translate("type",nestedSm), gen.translate("stateMachineOne", nestedSm));
    }

  }

    /*members_AllDoActivities*/
    
{
  boolean isFirstDoActivity = true;
  for(StateMachine sm : uClass.getAllStateMachines())
  {
    
    for (State state : sm.getStates())
    {
      for (Activity activity : state.getActivities())
      {
        if (isFirstDoActivity)
        {
          appendln(realSb, "");
          appendln(realSb, "");
          append(realSb,"  #{0} Do Activity Threads", uClass.getName());
          isFirstDoActivity = false;
        }
        append(realSb, "\n  #attr_reader {0};", gen.translate("doActivityThread",activity));
      }
    }
  }
}

    /*members_AllAssociations*/
    

  boolean isFirstAssociation = true;
  for (AssociationVariable av : uClass.getAssociationVariables())
  {
    if (!av.getIsNavigable())
    {
      continue;
    }
    
    String attribute = av.isOne() ? gen.translate("attributeOne",av) : gen.translate("attributeMany",av);
 
    if (isFirst)
    {
      appendln(realSb, "");
      appendln(realSb, "");
      appendln(realSb, "  #------------------------");
      appendln(realSb, "  # MEMBER VARIABLES");
      append(realSb, "  #------------------------");
      isFirst = false;
    }
    
    if (isFirstAssociation)
    {
      appendln(realSb, "");
      appendln(realSb, "");
      appendln(realSb,"  #{0} Associations - for documentation purposes", uClass.getName());
      
      if (av.numberOfComments() > 0) { append(realSb, "\n  {0}\n", Comment.format("RubyMultiline Internal", av.getComments())); }
      
      append(realSb,"  #attr_reader :{0}",attribute);
      isFirstAssociation = false;
    }
    else
    {
      append(realSb,", :{0}",attribute);
    }
  }

    /*members_AllHelpers*/
    
// NO OUTPUT REQUIRED, SEE members_AllHelpers from other implementations if this changes

    realSb.append(TEXT_6);
     if (!uClass.getIsSingleton()) { 
    realSb.append(TEXT_7);
    /*constructor_Declare_All*/
    

  String customConstructorPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before","constructor"));
  String customConstructorPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after","constructor"));

  appendln(realSb, "");

  String accessibility = uClass.getIsSingleton() ? "private" : "public";
  append(realSb,"  def initialize({0})",new Object[] {gClass.getLookup("constructorSignature")});

  String extraNote = null;
    
  if (!uClass.isRoot())
  {
    appendln(realSb, "");
    append(realSb, "    super({0})", gClass.getParentClass().getLookup("constructorSignature_caller"));
  }

  append(realSb, "\n    @initialized = false");
  append(realSb, "\n    @deleted = false");
  
  if (customConstructorPrefixCode != null)
  {
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customConstructorPrefixCode, "    "));
  }
  
  if (uClass.getKey().isProvided())
  {
    appendln(realSb, "");
    append(realSb, "    @cachedHashCode = -1");
  }
  
  for(String memberId : uClass.getKey().getMembers())
  {
    Attribute av = uClass.getAttribute(memberId);
    AssociationVariable as = uClass.getAssociationVariable(memberId);
    if (av != null  && !av.isImmutable())
    {
      appendln(realSb, "");
      append(realSb, "    @{0} = true", gen.translate("attributeCanSet",av));
    }
    else if (as != null)
    {
      appendln(realSb, "");
      append(realSb, "    @{0} = true", gen.translate("associationCanSet",as));
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
      
    /*constructor_AttributeAssignList*/
    realSb.append(TEXT_8);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_9);
    
    }
    else if ("defaulted".equals(av.getModifier()))
    {
      
    /*constructor_AttributeAssignDefaulted*/
    realSb.append(TEXT_10);
    realSb.append(gen.translate("resetMethod",av));
     
    }
    else if (av.isImmutable() && av.getIsLazy())
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
  	   defaultValue = "nil";
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
    realSb.append(TEXT_11);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_12);
    realSb.append(defaultValue);
    realSb.append(TEXT_13);
    } 
    /*constructor_AttributeUnassignedImmutable*/
    realSb.append(TEXT_14);
    realSb.append(gen.translate("attributeCanSet",av));
    realSb.append(TEXT_15);
    
    }
    else if (av.isImmutable())
    {
      
    /*constructor_AttributeAssignImmutable*/
    
  String parameterLookup = av.getValue() == null ? "parameterOne" : "parameterValue";

    realSb.append(TEXT_16);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_17);
    realSb.append(gen.translate(parameterLookup,av));
    realSb.append(TEXT_18);
    realSb.append(gen.translate("attributeCanSet",av));
    realSb.append(TEXT_19);
     
    }
    else if(av.getIsLazy())
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
  	   defaultValue = "nil";
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
    realSb.append(TEXT_11);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_12);
    realSb.append(defaultValue);
    realSb.append(TEXT_13);
    } 
    
    }
    else
    {
       
    /*constructor_AttributeAssign*/
    
  if(!av.getIsLazy()){
    String parameterLookup = av.getValue() == null ? "parameterOne" : "parameterValue";

    realSb.append(TEXT_20);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_21);
    realSb.append(gen.translate(parameterLookup,av));
    realSb.append(TEXT_22);
     } 
    
    }
  }

  for (Attribute av : uClass.getAttributes())
  {
    if (av.getIsAutounique())
    {
      
    /*constructor_AttributeAssignAutounique*/
    realSb.append(TEXT_23);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_24);
    realSb.append(gen.translate("parameterNext",av));
    realSb.append(TEXT_25);
    realSb.append(gen.translate("parameterNext",av));
    realSb.append(TEXT_26);
    
    }
    else if (av.getIsUnique())
    {
      
    /*constructor_AttributeAssignUnique*/
    realSb.append(TEXT_27);
    realSb.append(av.getName());
    realSb.append(TEXT_28);
    realSb.append(gen.translate("setMethod", av));
    realSb.append(TEXT_29);
    realSb.append(gen.translate("parameterOne", av));
    realSb.append(TEXT_30);
    realSb.append(av.getName());
    realSb.append(TEXT_31);
    
    }
  }
  
  for (AssociationVariable av : uClass.getAssociationVariables())
  {
  	if (!av.getIsNavigable() || !av.isImmutable())
  	{
  	  continue;
  	}
    append(realSb, "\n    @{0} = true", gen.translate("associationCanSet",av));
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
        
    /*constructor_AssociationAssignUndirectionalOne*/
    realSb.append(TEXT_32);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_33);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_34);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_35);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_36);
    
      }
      else if (av.isOptionalOne() && av.isImmutable())
      {
        
    /*constructor_AssociationAssignImmutableOptionalOne*/
    realSb.append(TEXT_37);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_38);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_39);
    
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
  

    realSb.append(TEXT_40);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_41);
    realSb.append(gen.translate("didAddMany",av));
    realSb.append(TEXT_42);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_43);
    realSb.append(gen.translate("parameterAll",av));
    realSb.append(TEXT_44);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_45);
    realSb.append(requiredNumber);
    realSb.append(TEXT_46);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_47);
    realSb.append(gen.translate("didAddMany",av));
    
      }
      else if (av.isOptionalN() && av.isImmutable())
      {
        
    /*constructor_AssociationAssignImmutableOptionalN*/
     String requiredNumber = "" + av.getMultiplicity().getUpperBound(); 
    realSb.append(TEXT_48);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_49);
    realSb.append(gen.translate("didAddMany",av));
    realSb.append(TEXT_50);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_51);
    realSb.append(gen.translate("parameterAll",av));
    realSb.append(TEXT_52);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_53);
    realSb.append(requiredNumber);
    realSb.append(TEXT_54);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_55);
    realSb.append(gen.translate("didAddMany",av));
    
      }
      else if (av.isMany() && av.isImmutable())
      {
        
    /*constructor_AssociationAssignImmutableOptionalMany*/
    realSb.append(TEXT_56);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_57);
    realSb.append(gen.translate("didAddMany",av));
    realSb.append(TEXT_58);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_59);
    realSb.append(gen.translate("parameterAll",av));
    realSb.append(TEXT_60);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_61);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_62);
    realSb.append(gen.translate("didAddMany",av));
    
      }
      else if (av.isMany())
      {
        
    /*constructor_AssociationAssignOptionalMany*/
    realSb.append(TEXT_63);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_64);
    
      }
      else
      {
        
    /*constructor_AssociationAssignOptionalOne*/
    realSb.append(TEXT_65);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_66);
    
      }
      continue;
    }
    
    if (av.isOnlyOne() && relatedAssociation.isOnlyOne())
    {
      
    /*constructor_AssociationAssignOneToOne*/
    realSb.append(TEXT_67);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_68);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_69);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_70);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_71);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_72);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_73);
    
    }
    else if ((av.isMN() || av.isN()) && (relatedAssociation.isMandatory() || relatedAssociation.isOptionalN()))
    {
      
    /*constructor_AssociationAssignOptionalMany*/
    realSb.append(TEXT_63);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_64);
    
    }
    else if (av.isOnlyOne())
    {
      
    /*constructor_AssociationAssignOne*/
    realSb.append(TEXT_74);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_75);
    realSb.append(gen.translate("didAdd",av));
    realSb.append(TEXT_76);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_77);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_78);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_79);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_80);
    realSb.append(gen.translate("didAdd",av));
    
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
    append(realSb, "    @{0} = []", gen.translate("associationMany",av));
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
  

    realSb.append(TEXT_40);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_41);
    realSb.append(gen.translate("didAddMany",av));
    realSb.append(TEXT_42);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_43);
    realSb.append(gen.translate("parameterAll",av));
    realSb.append(TEXT_44);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_45);
    realSb.append(requiredNumber);
    realSb.append(TEXT_46);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_47);
    realSb.append(gen.translate("didAddMany",av));
    
  }
  else if (av.getMultiplicity().getLowerBound() > 0)
  {
    
    realSb.append(TEXT_81);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_82);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_83);
    realSb.append(gen.translate("parameterOne",av));
    
  }
  else
  {
    appendln(realSb,"");
    append(realSb, "    @{0} = nil", gen.translate("associationOne",av));
  }

    
    }
  }
  
  for(StateMachine sm : uClass.getStateMachines())
  {
    State state = sm.getStartState();
    if (state == null)
    {
      continue;
    }
    
    /*constructor_StateMachineAssignDefault*/
    realSb.append(TEXT_84);
    realSb.append(gen.translate("setMethod",sm));
    realSb.append(TEXT_85);
    realSb.append(gen.translate("type",sm));
    realSb.append(TEXT_86);
    realSb.append(gen.translate("stateOne",state));
    realSb.append(TEXT_87);
    
    for (StateMachine nestedSm : sm.getNestedStateMachines())
    {
      
    /*constructor_NestedStateMachineAssignDefault*/
    realSb.append(TEXT_88);
    realSb.append(gen.translate("setMethod",nestedSm));
    realSb.append(TEXT_89);
    realSb.append(gen.translate("type",nestedSm));
    realSb.append(TEXT_90);
    realSb.append(gen.translate("stateNull",nestedSm));
    realSb.append(TEXT_91);
    realSb.append(gen.translate("stateMachineOne",sm));
    realSb.append(TEXT_92);
    
    }
  }
  
  if (customConstructorPostfixCode != null)
  {
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customConstructorPostfixCode, "    "));
  }

  appendln(realSb, "\n    @initialized = true");
  append(realSb, "  end");

    realSb.append(TEXT_93);
     } 
    realSb.append(TEXT_94);
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
    

    String customSetPrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "setMethod", av));
    String customSetPostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "setMethod", av));

    String customResetPrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "resetMethod", av));
    String customResetPostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "resetMethod", av));

    String customAddPrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "addMethod", av));
    String customAddPostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "addMethod", av));
  
    String customRemovePrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "removeMethod", av));
    String customRemovePostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "removeMethod", av));
    
    if (av.isImmutable())
    {
      if (av.getIsLazy())
      {
        
    /*attribute_SetImmutable*/
    realSb.append(TEXT_95);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_96);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_97);
     if (customSetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_98);
    realSb.append(gen.translate("attributeCanSet",av));
    realSb.append(TEXT_99);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_100);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_101);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_102);
    
      }
    }
    else if (av.getModifier().equals("defaulted"))
    {
      
    /*attribute_SetDefaulted*/
    realSb.append(TEXT_103);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_104);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_105);
     if (customSetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_106);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_107);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_108);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_109);
    realSb.append(gen.translate("resetMethod",av));
    realSb.append(TEXT_110);
     if (customResetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customResetPrefixCode, "    ")); } 
    realSb.append(TEXT_111);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_112);
    realSb.append(gen.translate("getDefaultMethod",av));
    realSb.append(TEXT_113);
     if (customResetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customResetPostfixCode, "    ")); } 
    realSb.append(TEXT_114);
    
    }
    else if (av.getIsList())
    {
      
    /*attribute_SetMany*/
    realSb.append(TEXT_115);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_116);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_117);
     if (customAddPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_118);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_119);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_120);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_121);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_122);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_123);
     if (customRemovePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_124);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_125);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_126);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_127);
    
    }
    else
    {
      
    /*attribute_Set*/
    realSb.append(TEXT_128);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_129);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_130);
     if (customSetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_131);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_132);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_133);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_134);
    
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

      String customSetPrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "setMethod", av));
      String customSetPostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "setMethod", av));

//      String customResetPrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "resetMethod", av));
//      String customResetPostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "resetMethod", av));
      
      String customAddPrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "addMethod", av));
      String customAddPostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "addMethod", av));

//      String customRemovePrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "removeMethod", av));
//      String customRemovePostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "removeMethod", av));

      if(customSetPrefixCode!=null||customSetPostfixCode!=null)
      {
        if (av.getModifier().equals("defaulted"))
        {
          
    /*attribute_SetDefaulted_subclass*/
    realSb.append(TEXT_135);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_136);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_137);
     if (customSetPrefixCode != null) { 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_138);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPre()?traceItem.trace(gen, av,"at_s", uClass,gen.translate("parameterOne",av)):""));
    realSb.append(TEXT_139);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPost()?traceItem.trace(gen, av,"at_s", uClass):""));
    realSb.append(TEXT_140);
     if (customSetPostfixCode != null) {
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_141);
    
        }
        else if (av.getIsList())
        {
          
    /*attribute_SetMany_subclass*/
    realSb.append(TEXT_142);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_143);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_144);
     if (customAddPrefixCode != null) { 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_145);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPre()?traceItem.trace(gen, av,"at_a", uClass,gen.translate("parameterOne",av)):""));
    realSb.append(TEXT_146);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPost()?traceItem.trace(gen, av,"at_a", uClass):""));
    realSb.append(TEXT_147);
     if (customAddPostfixCode != null) { 
      append(realSb, "{0}\n",GeneratorHelper.doIndent(customAddPostfixCode, "    "));
    } 
    realSb.append(TEXT_148);
    
        }
        else if(!av.isImmutable()||av.getIsLazy())//if(customSetPrefixCode!=null&&customSetPostfixCode!=null&&customSetPrefixCode.matches("[\\s]*if.*\\n[\\s]*.*"))
        {
          
    /*attribute_Set_subclass*/
    realSb.append(TEXT_149);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_150);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_151);
     if (customSetPrefixCode != null) {
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_152);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPre()?traceItem.trace(gen, av,"at_s", uClass,gen.translate("parameterOne",av)):""));
    realSb.append(TEXT_153);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPost()?traceItem.trace(gen, av,"at_s", uClass):""));
    realSb.append(TEXT_154);
     if (customSetPostfixCode != null) {
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_155);
    
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
    
    String customGetPrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "getMethod", av));
    String customGetPostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "getMethod", av));

    String customGetDefaultPrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "getDefaultMethod", av));
    String customGetDefaultPostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "getDefaultMethod", av));

    String customGetManyPrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "getManyMethod", av));
    String customGetManyPostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "getManyMethod", av));

    String customNumberOfPrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "numberOfMethod", av));
    String customNumberOfPostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "numberOfMethod", av));

    String customHasManyPrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "hasManyMethod", av));
    String customHasManyPostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "hasManyMethod", av));

    String customIndexOfPrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "indexOfMethod", av));
    String customIndexOfPostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "indexOfMethod", av));
        
    String customHasUniquePrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "hasUniqueMethod", av));
    String customHasUniquePostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "hasUniqueMethod", av));
    
    String customGetUniquePrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "getUniqueMethod", av));
    String customGetUniquePostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "getUniqueMethod", av));

    if (av.getIsList())
    {
      
    /*attribute_GetMany*/
    realSb.append(TEXT_156);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_157);
     if (customGetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_158);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_159);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_160);
     if (customGetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    realSb.append(TEXT_161);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_162);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_163);
     if (customGetManyPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_164);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_165);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_166);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_167);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_168);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_169);
     if (customGetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_170);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_171);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_172);
     if (customNumberOfPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customNumberOfPrefixCode, "    ")); } 
    realSb.append(TEXT_173);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_174);
     if (customNumberOfPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customNumberOfPostfixCode, "    ")); } 
    realSb.append(TEXT_175);
    realSb.append(gen.translate("hasManyMethod",av));
    realSb.append(TEXT_176);
     if (customHasManyPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customHasManyPrefixCode, "    ")); } 
    realSb.append(TEXT_177);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_178);
     if (customHasManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customHasManyPostfixCode, "    ")); } 
    realSb.append(TEXT_179);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_180);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_181);
     if (customIndexOfPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customIndexOfPrefixCode, "    ")); } 
    realSb.append(TEXT_182);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_183);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_184);
     if (customIndexOfPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customIndexOfPostfixCode, "    ")); } 
    realSb.append(TEXT_185);
    
    }
    else 
    {

      if (av.getIsDerived() && customGetPostfixCode != null)
      {
        
    /*attribute_GetDerivedCodeInjection*/
    realSb.append(TEXT_186);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_187);
     if (customGetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_188);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_189);
    realSb.append(gen.translate("parameterValue",av));
    realSb.append(TEXT_190);
     if (customGetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    realSb.append(TEXT_191);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_192);
    
      }
      else if (av.getIsDerived())
      {
        
    /*attribute_GetDerived*/
    realSb.append(TEXT_193);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_194);
     if (customGetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_195);
    realSb.append(gen.translate("parameterValue",av));
    realSb.append(TEXT_196);
    
      }
      else if (customGetPostfixCode != null)
      {
        
    /*attribute_GetCodeInjection*/
    realSb.append(TEXT_197);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_198);
     if (customGetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_199);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_200);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_201);
     if (customGetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    realSb.append(TEXT_202);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_203);
    
      }
      else
      {
        
    /*attribute_Get*/
    realSb.append(TEXT_204);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_205);
     if (customGetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_206);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_207);
    
      }
      
      appendln(realSb, "");
      
      if (av.getModifier().equals("defaulted") && customGetDefaultPostfixCode != null)
      {
        
    /*attribute_GetDefaultedCodeInjection*/
    realSb.append(TEXT_208);
    realSb.append(gen.translate("getDefaultMethod",av));
    realSb.append(TEXT_209);
     if (customGetDefaultPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetDefaultPrefixCode, "    ")); } 
    realSb.append(TEXT_210);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_211);
    realSb.append(gen.translate("parameterValue",av));
    realSb.append(TEXT_212);
     if (customGetDefaultPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetDefaultPostfixCode, "    ")); } 
    realSb.append(TEXT_213);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_214);
    
      }
      else if (av.getModifier().equals("defaulted"))
      {
        
    /*attribute_GetDefaulted*/
    realSb.append(TEXT_215);
    realSb.append(gen.translate("getDefaultMethod",av));
    realSb.append(TEXT_216);
     if (customGetDefaultPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetDefaultPrefixCode, "    ")); } 
    realSb.append(TEXT_217);
    realSb.append(gen.translate("parameterValue",av));
    realSb.append(TEXT_218);
    
      }
      
      if (av.getIsUnique())
      {
        if (customGetUniquePostfixCode != null)
        {
          
    /*attribute_GetUniqueCodeInjection*/
    realSb.append(TEXT_219);
    realSb.append(av.getUmpleClass().getName());
    realSb.append(TEXT_220);
    realSb.append(gen.translate("getUniqueMethod",av));
    realSb.append(TEXT_221);
    realSb.append(gen.translate("parameterOne", av));
    realSb.append(TEXT_222);
     if (customGetUniquePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetUniquePrefixCode, "    ")); } 
    realSb.append(TEXT_223);
    realSb.append(gen.translate("parameterGetUnique",av));
    realSb.append(TEXT_224);
    realSb.append(gen.translate("getUniqueMap",av));
    realSb.append(TEXT_225);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_226);
     for( TraceItem traceItem : traceItems )
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_g", uClass):""));
    realSb.append(TEXT_227);
     if (customGetUniquePostfixCode != null) { append(realSb, "{0}\n",GeneratorHelper.doIndent(customGetUniquePostfixCode, "    ")); } 
    realSb.append(TEXT_228);
    realSb.append(gen.translate("parameterGetUnique",av));
    realSb.append(TEXT_229);
    
        } 
        else 
        {
          
    /*attribute_GetUnique*/
    realSb.append(TEXT_230);
    realSb.append(av.getUmpleClass().getName());
    realSb.append(TEXT_231);
    realSb.append(gen.translate("getUniqueMethod",av));
    realSb.append(TEXT_232);
    realSb.append(gen.translate("parameterOne", av));
    realSb.append(TEXT_233);
     if (customGetUniquePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetUniquePrefixCode, "    ")); } 
    realSb.append(TEXT_234);
     for( TraceItem traceItem : traceItems )
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_g", uClass):""));
    realSb.append(TEXT_235);
    realSb.append(gen.translate("uniqueMap",av));
    realSb.append(TEXT_236);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_237);
    
        }
        if (customHasUniquePostfixCode != null)
        {
          
    /*attribute_HasUniqueCodeInjection*/
    realSb.append(TEXT_238);
    realSb.append(av.getUmpleClass().getName());
    realSb.append(TEXT_239);
    realSb.append(gen.translate("hasUniqueMethod",av));
    realSb.append(TEXT_240);
    realSb.append(gen.translate("parameterOne", av));
    realSb.append(TEXT_241);
     if (customHasUniquePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customHasUniquePrefixCode, "    ")); } 
    realSb.append(TEXT_242);
    realSb.append(gen.translate("parameterHasUnique",av));
    realSb.append(TEXT_243);
    realSb.append(gen.translate("getUniqueMethod",av));
    realSb.append(TEXT_244);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_245);
     for( TraceItem traceItem : traceItems )
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_g", uClass):""));
    realSb.append(TEXT_246);
     if (customHasUniquePostfixCode != null) { append(realSb, "{0}\n",GeneratorHelper.doIndent(customHasUniquePostfixCode, "    ")); } 
    realSb.append(TEXT_247);
    realSb.append(gen.translate("parameterHasUnique",av));
    realSb.append(TEXT_248);
    
        }
        else
        {
          
    /*attribute_HasUnique*/
    realSb.append(TEXT_249);
    realSb.append(av.getUmpleClass().getName());
    realSb.append(TEXT_250);
    realSb.append(gen.translate("hasUniqueMethod",av));
    realSb.append(TEXT_251);
    realSb.append(gen.translate("parameterOne", av));
    realSb.append(TEXT_252);
     if (customHasUniquePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customHasUniquePrefixCode, "    ")); } 
    realSb.append(TEXT_253);
     for( TraceItem traceItem : traceItems )
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_g", uClass):""));
    realSb.append(TEXT_254);
    realSb.append(gen.translate("getUniqueMethod",av));
    realSb.append(TEXT_255);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_256);
    
        }
      }
    }
  }

  for (Attribute av : uClass.getAttributes()) 
  {
  
    if (av.getIsAutounique())
    {
      String customGetPrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "getMethod", av));
      String customGetPostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "getMethod", av));
      
      List<TraceItem> traceItems = av.getTraced("getMethod", uClass);
      
      if (customGetPostfixCode != null)
      {
        
    /*attribute_GetCodeInjection*/
    realSb.append(TEXT_197);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_198);
     if (customGetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_199);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_200);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_201);
     if (customGetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    realSb.append(TEXT_202);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_203);
    
      }
      else
      {
        
    /*attribute_Get*/
    realSb.append(TEXT_204);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_205);
     if (customGetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_206);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_207);
    
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

      List<TraceItem> traceItems = av.getTraced("getMethod", uClass.getExtendsClass());

      gen.setParameterConstraintName(av.getName());

	  String customGetPrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "getMethod", av));
      String customGetPostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "getMethod", av));
	  
	  String customGetManyPrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "getManyMethod", av));
      String customGetManyPostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "getManyMethod", av));
	  
	  if (customGetManyPrefixCode!=null || customGetManyPostfixCode!=null)
      {
        
    realSb.append(TEXT_257);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_258);
     if (customGetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_259);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_260);
     if (customGetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    realSb.append(TEXT_261);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_262);
    
      }
      else if(customGetPrefixCode!=null||customGetPostfixCode!=null)
      {
        
    realSb.append(TEXT_263);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_264);
     if (customGetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_265);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_266);
     if (customGetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    realSb.append(TEXT_267);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_268);
    
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

    String customGetPrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "isMethod", av));
    String customGetPostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "isMethod", av));
    
    if (av.getIsDerived() && customGetPostfixCode != null)
    {
      
    /*attribute_IsBooleanCodeInjectionDerived*/
    realSb.append(TEXT_269);
    realSb.append(gen.translate("isMethod",av));
    realSb.append(TEXT_270);
     if (customGetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_271);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_272);
    realSb.append(gen.translate("parameterValue",av));
    realSb.append(TEXT_273);
     if (customGetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    realSb.append(TEXT_274);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_275);
    
    }
    else if (av.getIsDerived())
    {
      
    /*attribute_IsBooleanDerived*/
    realSb.append(TEXT_276);
    realSb.append(gen.translate("isMethod",av));
    realSb.append(TEXT_277);
     if (customGetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_278);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_279);
    
    }
    else if (customGetPostfixCode != null)
    {
      
    /*attribute_IsBooleanCodeInjection*/
    realSb.append(TEXT_280);
    realSb.append(gen.translate("isMethod",av));
    realSb.append(TEXT_281);
     if (customGetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_282);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_283);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_284);
     if (customGetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    realSb.append(TEXT_285);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_286);
    
    }
    else
    {
      
    /*attribute_IsBoolean*/
    realSb.append(TEXT_287);
    realSb.append(gen.translate("isMethod",av));
    realSb.append(TEXT_288);
     if (customGetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_289);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_290);
    
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
    
// NOT IMPLEMENTED YET

     
  }
  
  for(StateMachine sm : uClass.getAllStateMachines())
  {
    
    /*state_machine_Get*/
    realSb.append(TEXT_291);
    realSb.append(gen.translate("type",sm));
    realSb.append(TEXT_292);
    realSb.append(gen.translate("getMethod",sm));
    realSb.append(TEXT_293);
    realSb.append(gen.translate("stateOne",sm));
    realSb.append(TEXT_294);
    
  }
}

    /*state_machine_Events_All*/
    
{
  // GENERIC FILE - EDIT IN UmpleToTemplate project, then run "ant -f build.codegen.xml to move into the appropriate projects
  for(Event e : uClass.getEvents())
  {
    
    /*state_machine_Event*/
    
  StringBuffer allCases = new StringBuffer();

  for(StateMachine sm : uClass.getStateMachines(e))
  {
    allCases.append(StringFormatter.format("    switch ({0})\n",gen.translate("stateMachineOne",sm)));
    allCases.append(StringFormatter.format("    {\n"));
    
    for(State state : sm.getStates())
    {
  
      List<Transition> allT = state.getTransitionsFor(e);
  
      if (allT.size() == 0)
      {
        continue;
      }

      allCases.append(StringFormatter.format("      case {0}:\n",gen.translate("stateOne",state)));

      boolean hasExitAction = false;
      for(Action action : state.getActions())
      {
        if ("exit".equals(action.getActionType()))
        {
          hasExitAction = true;
          break;
        }
      }
  
      boolean needsBreak = true;
      for (Transition t : allT)
      {
        State nextState = t.getNextState();
        String tabSpace = t.getGuard() == null ? "        " : "          ";
        String condition = t.getGuard()!=null?gen.translate("Open",t.getGuard()):"if ()\n{"; 
        if (!"if ()\n{".equals(condition))
        {
          allCases.append(GeneratorHelper.doIndent(condition, "        ")+"\n");
        }
        if (hasExitAction)
        {
          allCases.append(StringFormatter.format("{0}{1};\n",tabSpace,gen.translate("exitMethod",sm)));
        }
        if (t.getAction() != null)
        {
          Action a1= t.getAction();
          allCases.append(StringFormatter.format("{0}{1}\n",tabSpace,a1.getActionCode()));
        }

        allCases.append(StringFormatter.format("{0}{1}({2}.{3});\n",tabSpace,gen.translate("setMethod",sm),gen.translate("type",sm),gen.translate("stateOne",nextState)));
        allCases.append(StringFormatter.format("{0}wasEventProcessed = true\n",tabSpace));
        allCases.append(StringFormatter.format("{0}break;\n",tabSpace));

        if (!"if ()\n{".equals(condition))
        {
          allCases.append(StringFormatter.format("        }\n"));
        }
        else
        {
          needsBreak = false;
          //You can only have one *no guard case*
          break;
        }
      }
  
      if (needsBreak)
      {
        allCases.append(StringFormatter.format("        break;\n"));
      }
    } 
    allCases.append(StringFormatter.format("    }\n\n"));
  }
  

  String outputCases = allCases.toString().trim();

    realSb.append(TEXT_295);
    realSb.append(gen.translate("eventMethod",e));
    realSb.append(TEXT_296);
    realSb.append(outputCases);
    realSb.append(TEXT_297);
    
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
    realSb.append(TEXT_298);
    realSb.append(gen.translate("setMethod",sm));
    realSb.append(TEXT_299);
    realSb.append(gen.translate("type",sm));
    realSb.append(TEXT_300);
    realSb.append(gen.translate("parameterOne",sm));
    realSb.append(TEXT_301);
    realSb.append(gen.translate("stateMachineOne",sm));
    realSb.append(TEXT_302);
    realSb.append(gen.translate("parameterOne",sm));
    realSb.append(TEXT_303);
    
    }
    else if (sm.numberOfStates() > 0)
    {
      
    /*state_machine_Set*/
    
  boolean hasEntry = false;
  boolean hasExit = false;
  boolean isFirstEntry = true;
  boolean isFirstExit = true;

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
          if (!isFirstEntry)
          {
            entryActions.append("\n      ");
          }
          entryActions.append(StringFormatter.format("case {0}:",gen.translate("stateOne",state)));
        }
        hasEntry = true;
        hasThisEntry = true;
        isFirstEntry = false;
        entryActions.append("\n        " + action.getActionCode());
      }
      else if ("exit".equals(action.getActionType()))
      {
        if (!hasThisExit)
        {
          if (!isFirstExit)
          {
            exitActions.append("\n      ");
          }
          isFirstExit = false;
          exitActions.append(StringFormatter.format("case {0}:",gen.translate("stateOne",state)));
        }
        hasExit = true;
        hasThisExit = true;
        isFirstExit = false;
        exitActions.append("\n        " + action.getActionCode());
      }
    }
  
    for (Activity activity : state.getActivities())
    {
      if (!hasThisEntry)
      {
        if (!isFirstEntry)
        {
          entryActions.append("\n      ");
        }
        entryActions.append(StringFormatter.format("case {0}:",gen.translate("stateOne",state)));
      }
      hasEntry = true;
      hasThisEntry = true;
      isFirstEntry = false;
      entryActions.append(StringFormatter.format("\n        {1} = new DoActivityThread(this,\"{0}\");",gen.translate("doActivityMethod",activity),gen.translate("doActivityThread",activity)));
    }
    
    if (hasThisEntry)
    {
      entryActions.append("\n        break;");
    }
    
    if (hasThisExit)
    {
      exitActions.append("\n        break;");
    }
  }

    realSb.append(TEXT_304);
     if (hasExit) { 
    realSb.append(TEXT_305);
    realSb.append(gen.translate("exitMethod",sm));
    realSb.append(TEXT_306);
    realSb.append(gen.translate("stateMachineOne",sm));
    realSb.append(TEXT_307);
    realSb.append(exitActions);
    realSb.append(TEXT_308);
     } 
    realSb.append(TEXT_309);
    realSb.append(gen.translate("setMethod",sm));
    realSb.append(TEXT_310);
    realSb.append(gen.translate("type",sm));
    realSb.append(TEXT_311);
    realSb.append(gen.translate("parameterOne",sm));
    realSb.append(TEXT_312);
    realSb.append(gen.translate("stateMachineOne",sm));
    realSb.append(TEXT_313);
    realSb.append(gen.translate("parameterOne",sm));
    realSb.append(TEXT_314);
     if (hasEntry) { 
    realSb.append(TEXT_315);
    realSb.append(gen.translate("stateMachineOne",sm));
    realSb.append(TEXT_316);
    realSb.append(entryActions);
    realSb.append(TEXT_317);
     } 
    realSb.append(TEXT_318);
    
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

    String customGetPrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "getMethod", av));
    String customGetPostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "getMethod", av));

    String customGetDefaultPrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "getDefaultMethod", av));
    String customGetDefaultPostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "getDefaultMethod", av));

    String customGetManyPrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "getManyMethod", av));
    String customGetManyPostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "getManyMethod", av));

    String customNumberOfPrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "numberOfMethod", av));
    String customNumberOfPostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "numberOfMethod", av));

    String customHasManyPrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "hasManyMethod", av));
    String customHasManyPostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "hasManyMethod", av));

    String customIndexOfPrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "indexOfMethod", av));
    String customIndexOfPostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "indexOfMethod", av));

    boolean hasCodeInjections = customGetPrefixCode != null || customGetPostfixCode != null;
  
    if (av.isOne())
    {
      
    /*association_GetOne*/
    realSb.append(TEXT_319);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_320);
     if (customGetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_321);
     if (customGetPostfixCode == null) { 
    realSb.append(TEXT_322);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_323);
     } else { 
    realSb.append(TEXT_324);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_325);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_326);
     append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); 
    realSb.append(TEXT_327);
     if (customGetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    realSb.append(TEXT_328);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_329);
     } 
    realSb.append(TEXT_330);
     
  if(av.getMultiplicity().getLowerBound() == 0) {
  
    realSb.append(TEXT_331);
    realSb.append(gen.translate("hasMethod",av));
    realSb.append(TEXT_332);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_333);
     } 
    realSb.append(TEXT_334);
    
    }
    else if (av.isMany())
    {
      
    /*association_GetMany*/
    realSb.append(TEXT_335);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_336);
     if (customGetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_337);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_338);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_339);
     if (customGetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    realSb.append(TEXT_340);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_341);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_342);
     if (customGetManyPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_343);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_344);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_345);
     if (customGetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_346);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_347);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_348);
     if (customNumberOfPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customNumberOfPrefixCode, "    ")); } 
    realSb.append(TEXT_349);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_350);
     if (customNumberOfPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customNumberOfPostfixCode, "    ")); } 
    realSb.append(TEXT_351);
    realSb.append(gen.translate("hasManyMethod",av));
    realSb.append(TEXT_352);
     if (customHasManyPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customHasManyPrefixCode, "    ")); } 
    realSb.append(TEXT_353);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_354);
     if (customHasManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customHasManyPostfixCode, "    ")); } 
    realSb.append(TEXT_355);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_356);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_357);
     if (customIndexOfPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customIndexOfPrefixCode, "    ")); } 
    realSb.append(TEXT_358);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_359);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_360);
     if (customIndexOfPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customIndexOfPostfixCode, "    ")); } 
    realSb.append(TEXT_361);
    
    }
    else
    {
      
    realSb.append(TEXT_362);
    
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

    String customSetPrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "setMethod", av));
    String customSetPostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "setMethod", av));

    String customSetManyPrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "setManyMethod", av));
    String customSetManyPostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "setManyMethod", av));

    String customAddPrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "addMethod", av));
    String customAddPostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "addMethod", av));
  
    String customRemovePrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "removeMethod", av));
    String customRemovePostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "removeMethod", av));

    String customIsNumberOfValidPrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "isNumberOfValidMethod", av));
    String customIsNumberOfValidPostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "isNumberOfValidMethod", av));
    
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
      
    realSb.append(TEXT_363);
    realSb.append(av);
    realSb.append(TEXT_364);
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
    realSb.append(TEXT_365);
    realSb.append(gen.translate("isNumberOfValidMethod",av));
    realSb.append(TEXT_366);
     if (customIsNumberOfValidPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customIsNumberOfValidPrefixCode, "    ")); } 
    realSb.append(TEXT_367);
     if (av.getMultiplicity().isUpperBoundMany()) { 
    realSb.append(TEXT_368);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_369);
    realSb.append(uClass.getName());
    realSb.append(TEXT_370);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_371);
     } else { 
    realSb.append(TEXT_372);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_373);
    realSb.append(uClass.getName());
    realSb.append(TEXT_374);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_375);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_376);
    realSb.append(uClass.getName());
    realSb.append(TEXT_377);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_378);
     } 
    realSb.append(TEXT_379);
     if (customIsNumberOfValidPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customIsNumberOfValidPostfixCode, "    ")); } 
    realSb.append(TEXT_380);
    
    }
    
    if (hasRequiredNumberOfMethod)
    {
      if (addNewLine) { appendln(realSb,""); }
      addNewLine = true;
      
    
      
    /*association_RequiredNumberOfMethod*/
    
    String customRequiredNumberOfPrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "requiredNumberOfMethod", av));
    String customRequiredNumberOfPostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "requiredNumberOfMethod", av));

    realSb.append(TEXT_381);
     if (customRequiredNumberOfPrefixCode == null && customRequiredNumberOfPostfixCode == null) { 
    realSb.append(TEXT_382);
    realSb.append(gen.translate("requiredNumberOfMethod",av));
    realSb.append(TEXT_383);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_384);
     } else { 
    realSb.append(TEXT_385);
    realSb.append(gen.translate("requiredNumberOfMethod",av));
    realSb.append(TEXT_386);
     if (customRequiredNumberOfPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRequiredNumberOfPrefixCode, "    ")); } 
    realSb.append(TEXT_387);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_388);
     if (customRequiredNumberOfPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRequiredNumberOfPostfixCode, "    ")); } 
    realSb.append(TEXT_389);
     } 
    
    }

    if (hasMinimumNumberOfMethod)
    {
      if (addNewLine) { appendln(realSb,""); }
      addNewLine = true;
      
    
      
    /*association_MinimumNumberOfMethod*/
    
    String customMinimumNumberOfPrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "minimumNumberOfMethod", av));
    String customMinimumNumberOfPostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "minimumNumberOfMethod", av));

    realSb.append(TEXT_390);
     if (customMinimumNumberOfPrefixCode == null && customMinimumNumberOfPostfixCode == null) { 
    realSb.append(TEXT_391);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_392);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_393);
     } else { 
    realSb.append(TEXT_394);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_395);
     if (customMinimumNumberOfPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customMinimumNumberOfPrefixCode, "    ")); } 
    realSb.append(TEXT_396);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_397);
     if (customMinimumNumberOfPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customMinimumNumberOfPostfixCode, "    ")); } 
    realSb.append(TEXT_398);
     } 
    
    }
    
    if (hasMaximumNumberOfMethod)
    {
      if (addNewLine) { appendln(realSb,""); }
      addNewLine = true;
      
    
      
    /*association_MaximumNumberOfMethod*/
    
    String customMaximumNumberOfPrefixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "before", "maximumNumberOfMethod", av));
    String customMaximumNumberOfPostfixCode = GeneratorHelper.toCode(gen.getApplicableCodeInjections(uClass, "after", "maximumNumberOfMethod", av));

    realSb.append(TEXT_399);
     if (customMaximumNumberOfPrefixCode == null && customMaximumNumberOfPostfixCode == null) { 
    realSb.append(TEXT_400);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_401);
    realSb.append(av.getMultiplicity().getUpperBound());
    realSb.append(TEXT_402);
     } else { 
    realSb.append(TEXT_403);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_404);
     if (customMaximumNumberOfPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customMaximumNumberOfPrefixCode, "    ")); } 
    realSb.append(TEXT_405);
    realSb.append(av.getMultiplicity().getUpperBound());
    realSb.append(TEXT_406);
     if (customMaximumNumberOfPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customMaximumNumberOfPostfixCode, "    ")); } 
    realSb.append(TEXT_407);
     } 
    
    }
    
    if (hasAddManyToManyTemplateMethod)
    {
      if (addNewLine) { appendln(realSb,""); }
      addNewLine = true;
      
    /*association_AddManyToManyMethod*/
    realSb.append(TEXT_408);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_409);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_410);
     if (customAddPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_411);
     if (!av.getMultiplicity().isUpperBoundMany()) { 
    realSb.append(TEXT_412);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_413);
    realSb.append(uClass.getName());
    realSb.append(TEXT_414);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_415);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_416);
     } 
    realSb.append(TEXT_417);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_418);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_419);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_420);
    realSb.append(gen.relatedTranslate("indexOfMethod",av));
    realSb.append(TEXT_421);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_422);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_423);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_424);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_425);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_426);
    
    }
    
    if (hasRemoveManyTemplateMethod)
    {
      if (addNewLine) { appendln(realSb,""); }
      addNewLine = true;
      
    /*association_RemoveMany*/
    realSb.append(TEXT_427);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_428);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_429);
     if (customRemovePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_430);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_431);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_432);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_433);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_434);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_435);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_436);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_437);
    realSb.append(gen.relatedTranslate("indexOfMethod",av));
    realSb.append(TEXT_438);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_439);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_440);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_441);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_442);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_443);
    
    }

    if (addNewLine) { appendln(realSb,""); }
    addNewLine = true;
    
    
    
    // How do you dynamically include a file in JET?!?
    if (includeFile == "association_SetUnidirectionalOptionalOne.jet")
    {
      
    /*association_SetUnidirectionalOptionalOne*/
    realSb.append(TEXT_444);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_445);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_446);
     if (customSetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_447);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_448);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_449);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_450);
    
    }
    else if (includeFile == "association_SetUnidirectionalOne.jet")
    {
      
    /*association_SetUnidirectionalOne*/
    realSb.append(TEXT_451);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_452);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_453);
     if (customSetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_454);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_455);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_456);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_457);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_458);
    
    }
    else if (includeFile == "association_SetOptionalOneToOne.jet")
    {
      
    /*association_SetOptionalOneToOne*/
    realSb.append(TEXT_459);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_460);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_461);
     if (customSetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_462);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_463);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_464);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_465);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_466);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_467);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_468);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_469);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "      ")); } 
    realSb.append(TEXT_470);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_471);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_472);
    realSb.append(gen.relatedTranslate("parameterOld",av));
    realSb.append(TEXT_473);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_474);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_475);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_476);
    realSb.append(gen.relatedTranslate("parameterOld",av));
    realSb.append(TEXT_477);
    realSb.append(gen.relatedTranslate("parameterOld",av));
    realSb.append(TEXT_478);
    realSb.append(gen.relatedTranslate("parameterOld",av));
    realSb.append(TEXT_479);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_480);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_481);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_482);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_483);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_484);
    
    }
    else if (includeFile == "association_SetOneToOptionalOne.jet")
    {
      
    /*association_SetOneToOptionalOne*/
    realSb.append(TEXT_485);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_486);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_487);
     if (customSetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_488);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_489);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_490);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_491);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_492);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_493);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_494);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_495);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_496);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_497);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_498);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_499);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_500);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_501);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_502);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_503);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_504);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_505);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_506);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_507);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_508);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_509);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_510);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_511);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_512);
    
    }
    else if (includeFile == "association_AddMandatoryManyToOne.jet")
    {
      
    /*association_AddMandatoryManyToOne*/
    realSb.append(TEXT_513);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_514);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_515);
     if (customAddPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_516);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_517);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_518);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_519);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_520);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_521);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_522);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_523);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_524);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_525);
    realSb.append(uClass.getName());
    realSb.append(TEXT_526);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_527);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_528);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_529);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_530);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_531);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_532);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_533);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_534);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_535);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_536);
     if (customRemovePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_537);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_538);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_539);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_540);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_541);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_542);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_543);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_544);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_545);
    realSb.append(uClass.getName());
    realSb.append(TEXT_546);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_547);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_548);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_549);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_550);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_551);
    
    }
    else if (includeFile == "association_AddMNToOnlyOne.jet")
    {
      
    /*association_AddMNToOnlyOne*/
    realSb.append(TEXT_552);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_553);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_554);
     if (customAddPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_555);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_556);
    realSb.append(uClass.getName());
    realSb.append(TEXT_557);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_558);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_559);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_560);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_561);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_562);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_563);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_564);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_565);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_566);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_567);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_568);
    realSb.append(uClass.getName());
    realSb.append(TEXT_569);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_570);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_571);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_572);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_573);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_574);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_575);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_576);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_577);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_578);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_579);
     if (customRemovePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_580);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_581);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_582);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_583);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_584);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_585);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_586);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_587);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_588);
    realSb.append(uClass.getName());
    realSb.append(TEXT_589);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_590);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_591);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_592);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_593);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_594);
    
    }
    else if (includeFile == "association_AddOptionalNToOne.jet")
    {
      
    /*association_AddOptionalNToOne*/
    realSb.append(TEXT_595);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_596);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_597);
     if (customAddPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_598);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_599);
    realSb.append(uClass.getName());
    realSb.append(TEXT_600);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_601);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_602);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_603);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_604);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_605);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_606);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_607);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_608);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_609);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_610);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_611);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_612);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_613);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_614);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_615);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_616);
     if (customRemovePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_617);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_618);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_619);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_620);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_621);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_622);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_623);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_624);
    
    }
    else if (includeFile == "association_SetOptionalNToMany.jet")
    {
      
    /*association_SetOptionalNToMany*/
    realSb.append(TEXT_625);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_626);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_627);
     if (customSetManyPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_628);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_629);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_630);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_631);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_632);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_633);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_634);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_635);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_636);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_637);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_638);
    realSb.append(uClass.getName());
    realSb.append(TEXT_639);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_640);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_641);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_642);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_643);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_644);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_645);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_646);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_647);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_648);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_649);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_650);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_651);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_652);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_653);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_654);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_655);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_656);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_657);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_658);
     if (customSetManyPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_659);
    
    }
    else if (includeFile == "association_AddManyToOne.jet")
    {
      
    /*association_AddManyToOne*/
    realSb.append(TEXT_660);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_661);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_662);
     if (customAddPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
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
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_683);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_684);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_685);
    
    }
    else if (includeFile == "association_SetOptionalOneToOptionalOne.jet")
    {
      
    /*association_SetOptionalOneToOptionalOne*/
    realSb.append(TEXT_686);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_687);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_688);
     if (customSetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_689);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_690);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_691);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_692);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_693);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_694);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_695);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_696);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_697);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_698);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_699);
    realSb.append(gen.translate("parameterCurrent",av));
    realSb.append(TEXT_700);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_701);
    realSb.append(gen.translate("parameterCurrent",av));
    realSb.append(TEXT_702);
    realSb.append(gen.translate("parameterCurrent",av));
    realSb.append(TEXT_703);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_704);
    realSb.append(gen.translate("parameterCurrent",av));
    realSb.append(TEXT_705);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_706);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_707);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_708);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_709);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_710);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_711);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_712);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_713);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_714);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_715);
    
    }
    else if (includeFile == "association_AddMNToMany.jet")
    {
      
    /*association_AddMNToMany*/
    realSb.append(TEXT_716);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_717);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_718);
     if (customRemovePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_719);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_720);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_721);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_722);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_723);
    realSb.append(uClass.getName());
    realSb.append(TEXT_724);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_725);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_726);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_727);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_728);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_729);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_730);
    realSb.append(gen.relatedTranslate("indexOfMethod",av));
    realSb.append(TEXT_731);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_732);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_733);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_734);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_735);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_736);
    
    }
    else if (includeFile == "association_AddMStarToMany.jet")
    {
      
    /*association_AddMStarToMany*/
    realSb.append(TEXT_737);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_738);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_739);
     if (customRemovePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_740);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_741);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_742);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_743);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_744);
    realSb.append(uClass.getName());
    realSb.append(TEXT_745);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_746);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_747);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_748);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_749);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_750);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_751);
    realSb.append(gen.relatedTranslate("indexOfMethod",av));
    realSb.append(TEXT_752);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_753);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_754);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_755);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_756);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_757);
    
    }
    else if (includeFile == "association_SetOptionalOneToOptionalN.jet")
    {
      
    /*association_SetOptionalOneToOptionalN*/
    realSb.append(TEXT_758);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_759);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_760);
     if (customSetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_761);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_762);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_763);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_764);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_765);
    realSb.append(gen.relatedTranslate("maximumNumberOfMethod",av));
    realSb.append(TEXT_766);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_767);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_768);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_769);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_770);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_771);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_772);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_773);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_774);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_775);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_776);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_777);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_778);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_779);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_780);
    
    }
    else if (includeFile == "association_SetOneToMany.jet")
    {
      
    /*association_SetOneToMany*/
    realSb.append(TEXT_781);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_782);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_783);
     if (customSetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_784);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_785);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_786);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_787);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_788);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_789);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_790);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_791);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_792);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_793);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_794);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_795);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_796);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_797);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_798);
    
    }
    else if (includeFile == "association_SetOneToManyAssociationClass.jet")
    {
      
    /*association_SetOneToManyAssociationClass*/
    realSb.append(TEXT_799);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_800);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_801);
     if (customSetPrefixCode != null) { 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_802);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_803);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_804);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_805);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_806);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_807);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_808);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_809);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_810);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_811);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_812);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_813);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_814);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_815);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_816);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_817);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_818);
    
    }
    else if (includeFile == "association_SetOneToAtMostN.jet")
    {
      
    /*association_SetOneToAtMostN*/
    realSb.append(TEXT_819);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_820);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_821);
     if (customSetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_822);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_823);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_824);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_825);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_826);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_827);
    realSb.append(relatedAssociation.getMultiplicity().getUpperBound());
    realSb.append(TEXT_828);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_829);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_830);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_831);
    realSb.append(gen.relatedTranslate("maximumNumberOfMethod",av));
    realSb.append(TEXT_832);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_833);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_834);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_835);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_836);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_837);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_838);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_839);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_840);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_841);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_842);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_843);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_844);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_845);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_846);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_847);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_848);
    
    }
    else if (includeFile == "association_SetOneToMandatoryMany.jet")
    {
      
    /*association_SetOneToMandatoryMany*/
    realSb.append(TEXT_849);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_850);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_851);
     if (customSetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_852);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_853);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_854);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_855);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_856);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_857);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_858);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_859);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_860);
    realSb.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    realSb.append(TEXT_861);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_862);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_863);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_864);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_865);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_866);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_867);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_868);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_869);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_870);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_871);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_872);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_873);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "        ")); } 
    realSb.append(TEXT_874);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_875);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_876);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_877);
    
    }
    else if (includeFile == "association_AddManyToOptionalOne.jet")
    {
      
    /*association_AddManyToOptionalOne*/
    realSb.append(TEXT_878);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_879);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_880);
     if (customAddPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_881);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_882);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_883);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_884);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_885);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_886);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_887);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_888);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_889);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_890);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_891);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_892);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_893);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_894);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_895);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_896);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_897);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_898);
     if (customRemovePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_899);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_900);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_901);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_902);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_903);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_904);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_905);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_906);
    
    }
    else if (includeFile == "association_SetOptionalOneToMany.jet")
    {
      
    /*association_SetOptionalOneToMany*/
    realSb.append(TEXT_907);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_908);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_909);
     if (customSetPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_910);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_911);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_912);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_913);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_914);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_915);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_916);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_917);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_918);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_919);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_920);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_921);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_922);
     if (customSetPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_923);
    
    }
    else if (includeFile == "association_AddOptionalNToOptionalOne.jet")
    {
      
    /*association_AddOptionalNToOptionalOne*/
    realSb.append(TEXT_924);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_925);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_926);
     if (customAddPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_927);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_928);
    realSb.append(uClass.getName());
    realSb.append(TEXT_929);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_930);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_931);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_932);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_933);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_934);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_935);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_936);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_937);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_938);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_939);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_940);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_941);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_942);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_943);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_944);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_945);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_946);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_947);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_948);
     if (customRemovePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_949);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_950);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_951);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_952);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_953);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_954);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_955);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_956);
    
    }
    else if (includeFile == "association_AddUnidirectionalMN.jet")
    {
      
    /*association_AddUnidirectionalMN*/
    realSb.append(TEXT_957);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_958);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_959);
     if (customAddPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_960);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_961);
    realSb.append(uClass.getName());
    realSb.append(TEXT_962);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_963);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_964);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_965);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_966);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_967);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_968);
     if (customRemovePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_969);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_970);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_971);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_972);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_973);
    realSb.append(uClass.getName());
    realSb.append(TEXT_974);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_975);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_976);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_977);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_978);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_979);
    
    }
    else if (includeFile == "association_AddMNToOptionalOne.jet")
    {
      
    /*association_AddMNToOptionalOne*/
    realSb.append(TEXT_980);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_981);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_982);
     if (customAddPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_983);
     if (!av.isStar()) { 
    realSb.append(TEXT_984);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_985);
    realSb.append(uClass.getName());
    realSb.append(TEXT_986);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_987);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_988);
     } 
    realSb.append(TEXT_989);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_990);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_991);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_992);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_993);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_994);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_995);
    realSb.append(uClass.getName());
    realSb.append(TEXT_996);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_997);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_998);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_999);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1000);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1001);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1002);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1003);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1004);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1005);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1006);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_1007);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1008);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1009);
     if (customRemovePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1010);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1011);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1012);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1013);
    realSb.append(uClass.getName());
    realSb.append(TEXT_1014);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1015);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1016);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1017);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1018);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1019);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1020);
    
    }
    else if (includeFile == "association_SetNToOptionalOne.jet")
    {
      
    /*association_SetNToOptionalOne*/
    realSb.append(TEXT_1021);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_1022);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1023);
     if (customSetManyPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_1024);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1025);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1026);
    realSb.append(gen.translate("associationNew",av));
    realSb.append(TEXT_1027);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1028);
    realSb.append(gen.translate("associationNew",av));
    realSb.append(TEXT_1029);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "        ")); } 
    realSb.append(TEXT_1030);
    realSb.append(gen.translate("associationNew",av));
    realSb.append(TEXT_1031);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1032);
    realSb.append(gen.translate("associationNew",av));
    realSb.append(TEXT_1033);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1034);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "        ")); } 
    realSb.append(TEXT_1035);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1036);
    realSb.append(gen.translate("associationNew",av));
    realSb.append(TEXT_1037);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1038);
    realSb.append(uClass.getName());
    realSb.append(TEXT_1039);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1040);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_1041);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1042);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1043);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1044);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1045);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1046);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1047);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1048);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1049);
    realSb.append(gen.translate("associationNew",av));
    realSb.append(TEXT_1050);
    realSb.append(gen.translate("associationNew",av));
    realSb.append(TEXT_1051);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1052);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1053);
    realSb.append(gen.translate("associationNew",av));
    realSb.append(TEXT_1054);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_1055);
    
    }
    else if (includeFile == "association_AddUnidirectionalMany.jet")
    {
      
    /*association_AddUnidirectionalMany*/
    realSb.append(TEXT_1056);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1057);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1058);
     if (customAddPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_1059);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1060);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1061);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_1062);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1063);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1064);
     if (customRemovePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1065);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1066);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1067);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1068);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1069);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1070);
    
    }
    else if (includeFile == "association_AddUnidirectionalOptionalN.jet")
    {
      
    /*association_AddUnidirectionalOptionalN*/
    realSb.append(TEXT_1071);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1072);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1073);
     if (customAddPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_1074);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1075);
    realSb.append(uClass.getName());
    realSb.append(TEXT_1076);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1077);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1078);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1079);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_1080);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1081);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1082);
     if (customRemovePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1083);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1084);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1085);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1086);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1087);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1088);
    
    }
    else if (includeFile == "association_AddUnidirectionalMStar.jet")
    {
      
    /*association_AddUnidirectionalMStar*/
    realSb.append(TEXT_1089);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1090);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1091);
     if (customAddPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_1092);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1093);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1094);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_1095);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1096);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1097);
     if (customRemovePrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1098);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1099);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1100);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_1101);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1102);
    realSb.append(uClass.getName());
    realSb.append(TEXT_1103);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1104);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_1105);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1106);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1107);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1108);
    
    }
    else if (includeFile == "association_SetUnidirectionalN.jet")
    {
      
    /*association_SetUnidirectionalN*/
    realSb.append(TEXT_1109);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_1110);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1111);
     if (customSetManyPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_1112);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1113);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1114);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1115);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1116);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1117);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1118);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1119);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1120);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1121);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1122);
    realSb.append(uClass.getName());
    realSb.append(TEXT_1123);
    realSb.append(gen.translate("requiredNumberOfMethod",av));
    realSb.append(TEXT_1124);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_1125);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1126);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1127);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1128);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1129);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1130);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_1131);
    
    }
    else if (includeFile == "association_SetUnidirectionalMany.jet")
    {
      
    /*association_SetUnidirectionalMany*/
    realSb.append(TEXT_1132);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_1133);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1134);
     if (customSetManyPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_1135);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1136);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1137);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1138);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1139);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1140);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1141);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1142);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1143);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1144);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_1145);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1146);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1147);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1148);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1149);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1150);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_1151);
    
    }
  else if (includeFile == "association_SetOptionalOneToMandatoryMany.jet")
    {
      
    /*association_SetOptionalOneToMandatoryMany*/
    realSb.append(TEXT_1152);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_1153);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1154);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1155);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1156);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1157);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1158);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1159);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1160);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1161);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1162);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1163);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1164);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1165);
    realSb.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1166);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1167);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_1168);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1169);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1170);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1171);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1172);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1173);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1174);
    realSb.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1175);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1176);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_1177);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1178);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1179);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1180);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1181);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1182);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1183);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1184);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1185);
    
    }
    else if (includeFile == "association_SetOptionalOneToMandatoryMN.jet")
    {
      
    /*association_SetOptionalOneToMandatoryMN*/
    realSb.append(TEXT_1186);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1187);
    realSb.append(gen.relatedTranslate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1188);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1189);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1190);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1191);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1192);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1193);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1194);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1195);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1196);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1197);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1198);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1199);
    realSb.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1200);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1201);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_1202);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1203);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1204);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1205);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1206);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1207);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1208);
    realSb.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1209);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1210);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_1211);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1212);
    realSb.append(gen.relatedTranslate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1213);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1214);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_1215);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1216);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1217);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1218);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1219);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1220);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1221);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1222);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1223);
    
    }
    else if (includeFile != null)
    {
      appendln(realSb,"You forgot to include {0}",includeFile);
    }
    
    
    
    if (includeFile2 == "association_SetMNToMany.jet")
    {
      
    /*association_SetMNToMany*/
    realSb.append(TEXT_1224);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_1225);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1226);
     if (customSetManyPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_1227);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1228);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1229);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1230);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1231);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1232);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1233);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1234);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1235);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1236);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1237);
    realSb.append(uClass.getName());
    realSb.append(TEXT_1238);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1239);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1240);
    realSb.append(uClass.getName());
    realSb.append(TEXT_1241);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1242);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_1243);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1244);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1245);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1246);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1247);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1248);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1249);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1250);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1251);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1252);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1253);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1254);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1255);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1256);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1257);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_1258);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_1259);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1260);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_1261);
    
    }
    else if (includeFile2 == "association_SetMStarToMany.jet")
    {
      
    /*association_SetMStarToMany*/
    realSb.append(TEXT_1262);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_1263);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1264);
     if (customSetManyPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_1265);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1266);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1267);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1268);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1269);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1270);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1271);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1272);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1273);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1274);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1275);
    realSb.append(uClass.getName());
    realSb.append(TEXT_1276);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1277);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_1278);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1279);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1280);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1281);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1282);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1283);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1284);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1285);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1286);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1287);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1288);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1289);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1290);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1291);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1292);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_1293);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_1294);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1295);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_1296);
    
    }
    else if (includeFile2 == "association_SetUnidirectionalMN.jet")
    {
      
    /*association_SetUnidirectionalMN*/
    realSb.append(TEXT_1297);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_1298);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1299);
     if (customSetManyPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_1300);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1301);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1302);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1303);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1304);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1305);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1306);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1307);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1308);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1309);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1310);
    realSb.append(uClass.getName());
    realSb.append(TEXT_1311);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1312);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1313);
    realSb.append(uClass.getName());
    realSb.append(TEXT_1314);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1315);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_1316);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1317);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1318);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1319);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1320);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1321);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_1322);
    
    }
    else if (includeFile2 == "association_SetMNToOptionalOne.jet")
    {
      
    /*association_SetMNToOptionalOne*/
    
  String existingToNewMap = StringFormatter.format("{0}ToNew{1}", relatedAssociation.getName(), av.getUpperCaseName());
  String orCheckMaxBound = av.isStar() ? "" : StringFormatter.format(" or {0}.size > {2}.{1}", gen.translate("parameterMany",av), gen.translate("maximumNumberOfMethod",av),uClass.getName());

    realSb.append(TEXT_1323);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_1324);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1325);
     if (customSetManyPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_1326);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1327);
    realSb.append(uClass.getName());
    realSb.append(TEXT_1328);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(orCheckMaxBound);
    realSb.append(TEXT_1329);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_1330);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1331);
    realSb.append(existingToNewMap);
    realSb.append(TEXT_1332);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1333);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1334);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1335);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1336);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "        ")); } 
    realSb.append(TEXT_1337);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1338);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1339);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1340);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1341);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1342);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1343);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1344);
    realSb.append(existingToNewMap);
    realSb.append(TEXT_1345);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1346);
    realSb.append(existingToNewMap);
    realSb.append(TEXT_1347);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1348);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1349);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1350);
    realSb.append(existingToNewMap);
    realSb.append(TEXT_1351);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1352);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_1353);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "          ")); } 
    realSb.append(TEXT_1354);
    realSb.append(existingToNewMap);
    realSb.append(TEXT_1355);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1356);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1357);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1358);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1359);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1360);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1361);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1362);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1363);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1364);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1365);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1366);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1367);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1368);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1369);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1370);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1371);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1372);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1373);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1374);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1375);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1376);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1377);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_1378);
    
    }
    else if (includeFile2 == "association_SetUnidirectionalOptionalN.jet")
    {
      
    /*association_SetUnidirectionalOptionalN*/
    realSb.append(TEXT_1379);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_1380);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1381);
     if (customSetManyPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_1382);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1383);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1384);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1385);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1386);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1387);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1388);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1389);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1390);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1391);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1392);
    realSb.append(uClass.getName());
    realSb.append(TEXT_1393);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1394);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_1395);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1396);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1397);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1398);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1399);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1400);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_1401);
    
    }
    else if (includeFile2 == "association_SetUnidirectionalMStar.jet")
    {
      
    /*association_SetUnidirectionalMStar*/
    realSb.append(TEXT_1402);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_1403);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1404);
     if (customSetManyPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_1405);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1406);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1407);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1408);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1409);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1410);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1411);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1412);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1413);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1414);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1415);
    realSb.append(uClass.getName());
    realSb.append(TEXT_1416);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1417);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_1418);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1419);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1420);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1421);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1422);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1423);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_1424);
    
    }
    else if (includeFile2 != null)
    {
      appendln(realSb,"You forgot to include {0}",includeFile2);
    }
    
    if(includeFile3 == "association_Sort.jet" && !sortMethodAdded)
    {
      
    /*association_Sort*/
    realSb.append(TEXT_1425);
    
      sortMethodAdded = true; //after the sort method has been added, this boolean stops it from being added again
    }
    else if(includeFile3 == "association_AddIndexControlFunctions.jet")
    {
      
    /*association_AddIndexControlFunctions*/
    realSb.append(TEXT_1426);
    realSb.append(gen.translate("addAtMethod",av));
    realSb.append(TEXT_1427);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1428);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1429);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1430);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1431);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1432);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1433);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1434);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1435);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1436);
    realSb.append(gen.translate("addOrMoveAtMethod",av));
    realSb.append(TEXT_1437);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1438);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1439);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1440);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1441);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1442);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1443);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1444);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1445);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1446);
    realSb.append(gen.translate("addAtMethod",av));
    realSb.append(TEXT_1447);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1448);
    
    }
  }
  gen.setParameterConstraintName("");

    realSb.append(TEXT_1449);
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
      canSet.append(StringFormatter.format("    @{0} = false\n",gen.translate("attributeCanSet",av)));
      if (av.getIsList())
      {
        checks.append(StringFormatter.format("    return false unless @{0}.size == compareTo.instance_variable_get(\"@{0}\").size\n",gen.translate("attributeMany",av)));
        checks.append(StringFormatter.format("    @{0}.each do |me|\n",gen.translate("attributeMany",av)));
        checks.append(StringFormatter.format("      them = compareTo.instance_variable_get(\"@{0}\").get(i)\n",gen.translate("attributeMany",av)));
        checks.append(StringFormatter.format("      return false if (me.nil? and !them.nil?)\n"));
        checks.append(StringFormatter.format("      return false if (!me.nil? and !me.eql?(them))\n"));
        checks.append(StringFormatter.format("    end\n"));
      }
      else if ("Integer".equals(av.getType()) || "Boolean".equals(av.getType()) || "Double".equals(av.getType()))
      {
        checks.append(StringFormatter.format("    return false unless @{0} == compareTo.instance_variable_get(\"@{0}\")\n",gen.translate("attributeOne",av)));
      }
      else
      {
        checks.append(StringFormatter.format("    return false if (@{0}.nil? and !compareTo.instance_variable_get(\"@{0}\").nil?)\n",gen.translate("attributeOne",av)));
        checks.append(StringFormatter.format("    return false if (!@{0}.nil? and !@{0}.eql?(compareTo.instance_variable_get(\"@{0}\")))\n",gen.translate("attributeOne",av)));
      }
      checks.append("\n");
    }
    else if (as != null)
    {
      canSet.append(StringFormatter.format("    @{0} = false\n",gen.translate("associationCanSet",as)));
      if (as.isMany())
      {
        checks.append(StringFormatter.format("    return false unless @{0}.size == compareTo.instance_variable_get(\"@{0}\").size\n",gen.translate("associationMany",as)));
        checks.append(StringFormatter.format("    @{0}.each do |me|\n",gen.translate("attributeMany",as)));
        checks.append(StringFormatter.format("      them = compareTo.instance_variable_get(\"@{0}\").get(i)\n",gen.translate("associationMany",as)));
        checks.append(StringFormatter.format("      return false if (me.nil? and !them.nil?)\n"));
        checks.append(StringFormatter.format("      return false if (!me.nil? and !me.eql?(them))\n"));
        checks.append(StringFormatter.format("    end\n"));
      }
      else
      {
        checks.append(StringFormatter.format("    return false if (@{0}.nil? and !compareTo.instance_variable_get(\"@{0}\").nil?)\n",gen.translate("attributeOne",as)));
        checks.append(StringFormatter.format("    return false if (!@{0}.nil? and !@{0}.eql?(compareTo.instance_variable_get(\"@{0}\")))\n",gen.translate("attributeOne",as)));
      }
      checks.append("\n");
    }
    
    if (av != null)
    {
      if ("Integer".equals(av.getType()) && !av.getIsList())
      {
        hash.append(StringFormatter.format("    @cachedHashCode = @cachedHashCode * 23 + @{0}\n",gen.translate("attributeOne",av)));
      }
      else if ("Double".equals(av.getType()) && !av.getIsList())
      {
        hash.append(StringFormatter.format("    @cachedHashCode = @cachedHashCode * 23 + @{0}.hash\n",gen.translate("attributeOne",av)));
      }
      else if ("Boolean".equals(av.getType()) && !av.getIsList())
      {
        hash.append(StringFormatter.format("    @cachedHashCode = @cachedHashCode * 23 + (@{0} ? 1 : 0)\n",gen.translate("attributeOne",av)));
      }
      else
      {
        String attributeType = av.getIsList() ? "attributeMany" : "attributeOne";
        hash.append(StringFormatter.format("    if (!@{0}.nil?)\n",gen.translate(attributeType,av)));
        hash.append(StringFormatter.format("      @cachedHashCode = @cachedHashCode * 23 + @{0}.hash\n",gen.translate(attributeType,av)));
        hash.append(StringFormatter.format("    else\n"));
        hash.append(StringFormatter.format("      @cachedHashCode = @cachedHashCode * 23\n"));
        hash.append(StringFormatter.format("    end\n"));
      }
      hash.append("\n");
    }
    else if (as != null)
    {
      String attributeType = as.isOne() ? "attributeOne" : "attributeMany";
      hash.append(StringFormatter.format("    if (!@{0}.nil?)\n",gen.translate(attributeType,as)));
      hash.append(StringFormatter.format("      @cachedHashCode = @cachedHashCode * 23 + @{0}.hash\n",gen.translate(attributeType,as)));
      hash.append(StringFormatter.format("    else\n"));
      hash.append(StringFormatter.format("      @cachedHashCode = @cachedHashCode * 23\n"));
      hash.append(StringFormatter.format("    end\n"));
    }
  }


    realSb.append(TEXT_1450);
    realSb.append(checks.toString().trim());
    realSb.append(TEXT_1451);
    realSb.append(hash.toString().trim());
    realSb.append(TEXT_1452);
    realSb.append(canSet.toString().trim());
    realSb.append(TEXT_1453);
    realSb.append(TEXT_1454);
     } 
    /*state_machine_doActivity_All*/
    
{ 
  boolean hasActivities = false;
  for(StateMachine sm : uClass.getStateMachines())
  {
    for (State state : sm.getStates())
    {
      for (Activity activity : state.getActivities())
      {
        hasActivities = true;
        
    /*state_machine_doActivity*/
    realSb.append(TEXT_1455);
    realSb.append(gen.translate("doActivityMethod",activity));
    realSb.append(TEXT_1456);
    realSb.append(activity.getActivityCode());
    realSb.append(TEXT_1457);
    
      }
    }
  } 
  if (hasActivities)
  {
    
    /*state_machine_doActivityThread*/
       
  StringBuffer output = new StringBuffer();

  isFirst = true;
  for(StateMachine sm : uClass.getStateMachines())
  {
    for (State state : sm.getStates())
    {
      for (Activity activity : state.getActivities())
      {
        if (isFirst)
        {
          output.append(StringFormatter.format("if"));
          isFirst = false;
        }
        else
        {
          output.append(StringFormatter.format("\n        else if"));
        }
        output.append(StringFormatter.format(" (\"{0}\".eql?(doActivityMethodName))\n",gen.translate("doActivityMethod",activity)));
        output.append(StringFormatter.format("        {\n"));
        output.append(StringFormatter.format("          controller.{0}\n",gen.translate("doActivityMethod",activity)));
        output.append(StringFormatter.format("        }"));
      }
    }
  }

    realSb.append(TEXT_1458);
    realSb.append(gen.translate("type",uClass));
    realSb.append(TEXT_1459);
    realSb.append(gen.translate("type",uClass));
    realSb.append(TEXT_1460);
    realSb.append(output);
    realSb.append(TEXT_1461);
    
  }
}

    /*state_machine_timedEvent_All*/
    
{ 
  boolean hasTimedEvents = false;
  for(StateMachine sm : uClass.getStateMachines())
  {
    for (Event e : sm.getEvents())
    {
      if (e.getIsTimer())
      {
        hasTimedEvents = true;
        
    /*state_machine_Event_StartStopTimer*/
    realSb.append(TEXT_1462);
    realSb.append(gen.translate("eventStartMethod",e));
    realSb.append(TEXT_1463);
    realSb.append(gen.translate("eventHandler",e));
    realSb.append(TEXT_1464);
    realSb.append(gen.translate("eventMethod",e));
    realSb.append(TEXT_1465);
    realSb.append(e.getTimerInSeconds());
    realSb.append(TEXT_1466);
    realSb.append(gen.translate("eventStopMethod",e));
    realSb.append(TEXT_1467);
    realSb.append(gen.translate("eventHandler",e));
    realSb.append(TEXT_1468);
    
      }
    }
  }
  if (hasTimedEvents)
  {
    
    /*state_machine_timedEvent_Handler*/
    
 


    realSb.append(TEXT_1469);
    realSb.append(gen.translate("type",uClass));
    realSb.append(TEXT_1470);
    realSb.append(gen.translate("type",uClass));
    realSb.append(TEXT_1471);
    
  for(StateMachine sm : uClass.getStateMachines())
  {
    for (Event e : sm.getEvents())
    {
      if (e.getIsTimer())
      {
        
    /*state_machine_timedEvent_run*/
    realSb.append(TEXT_1472);
    realSb.append(gen.translate("eventMethod",e));
    realSb.append(TEXT_1473);
    realSb.append(gen.translate("eventMethod",e));
    realSb.append(TEXT_1474);
    realSb.append(gen.translate("eventStartMethod",e));
    realSb.append(TEXT_1475);
    
      }
    }
  }

    realSb.append(TEXT_1476);
    
  }
}

    /*delete_All*/
    

  appendln(realSb,"");
  append(realSb,"  def delete");

  append(realSb, "\n    @deleted = true");

  String customDeletePrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before","delete"));
  String customDeletePostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after","delete"));

  if (customDeletePrefixCode != null) 
  {
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customDeletePrefixCode, "    "));
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
        
    /*delete_UndirectionalOne*/
    realSb.append(TEXT_1477);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1478);
    
      }
      else if (av.isMany())
      {
        
    /*delete_UndirectionalMany*/
    realSb.append(TEXT_1479);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1480);
    
      }
      continue;
    }
    
 if (relatedAssociation.getIsComposition()) {
    	if ((relatedAssociation.isOnlyOne() || relatedAssociation.isOptionalOne()) && av.isOnlyOne()) {
    		
    /*delete_OneFromOne*/
    realSb.append(TEXT_1481);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1482);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1483);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1484);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1485);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1486);
    
    	}
    	else if ((relatedAssociation.isOnlyOne() || relatedAssociation.isOptionalOne()) && av.isOptionalOne()) {
    		
    /*delete_OptionalOneFromOne_comp*/
    realSb.append(TEXT_1487);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1488);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1489);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1490);
    
    	}
        else if (relatedAssociation.isOptionalOne() && av.isMN()) {
    		
    /*delete_ManyFromMN_comp*/
    realSb.append(TEXT_1491);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1492);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1493);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1494);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1495);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1496);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1497);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1498);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1499);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1500);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1501);
    
    	}
    	else if ((relatedAssociation.isOnlyOne() || relatedAssociation.isOptionalOne()) && av.isMany()) {
    		
    /*delete_ManyFromX_comp*/
    realSb.append(TEXT_1502);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1503);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1504);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1505);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1506);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1507);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1508);
    
    	}
    	
    	else if (relatedAssociation.isMany() && av.isOnlyOne()) {
    		
    /*delete_OneFromOne*/
    realSb.append(TEXT_1481);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1482);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1483);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1484);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1485);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1486);
    
    	}
    	else if (relatedAssociation.isMany() && av.isOptionalOne()) {
    	    
    /*delete_OptionalOneFromOne_comp*/
    realSb.append(TEXT_1487);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1488);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1489);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1490);
    
    	}
	else if (relatedAssociation.isMany() && av.isMany()) {
    	    
    /*delete_ManyFromX_comp*/
    realSb.append(TEXT_1502);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1503);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1504);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1505);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1506);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1507);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1508);
    
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
    realSb.append(TEXT_1502);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1503);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1504);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1505);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1506);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1507);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1508);
    
	  
    }
    
    else if (av.getIsComposition() && (av.isMany() && relatedAssociation.isOptionalOne() && !av.isMandatory())) { 
    	
    	
    /*delete_OptionalOneFromMany_comp*/
    realSb.append(TEXT_1509);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1510);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1511);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1512);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1513);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1514);
    
	  
    }
    
    else if (av.getIsComposition() && (av.isOptionalOne() && relatedAssociation.getMultiplicity().getLowerBound() > 1  && relatedAssociation.getMultiplicity().getLowerBound() != relatedAssociation.getMultiplicity().getUpperBound())) { 
    	
    	
    /*delete_OptionalOneFromMN_comp*/
    realSb.append(TEXT_1515);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1516);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1517);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_1518);
    realSb.append(relatedAssociation.getMultiplicity().getLowerBound());
    realSb.append(TEXT_1519);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1520);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1521);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1522);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1523);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1524);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1525);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1526);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1527);
    
	  
    }

    else if (av.getIsComposition() && av.isStar() && relatedAssociation.isStar()) {
    	    
    /*delete_ManyFromMany_comp*/
    realSb.append(TEXT_1528);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1529);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1530);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1531);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1532);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1533);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1534);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1535);
    
    }

    
    else {
    
	    if (av.isOnlyOne() && relatedAssociation.isOnlyOne())
	    {
	      
    /*delete_OneFromOne*/
    realSb.append(TEXT_1481);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1482);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1483);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1484);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1485);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1486);
    
	    }
	    else if (av.isOptionalOne() && relatedAssociation.isOptionalOne())
	    {
	      
    /*delete_OptionalOneFromOptionalOne*/
    realSb.append(TEXT_1536);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1537);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1538);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1539);
    
	    }
	    else if (av.isOnlyOne() && relatedAssociation.isOptionalOne())
	    {
	      
    /*delete_OneFromOptionalOne*/
    realSb.append(TEXT_1540);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1541);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1542);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1543);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1544);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1545);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1546);
    
	    }
	    else if (av.isOptionalOne() && relatedAssociation.isOnlyOne())
	    {
	      
    /*delete_OptionalOneFromOne*/
    realSb.append(TEXT_1547);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1548);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1549);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1550);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1551);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1552);
    
	    }
	    else if (av.isOptionalOne() && relatedAssociation.isOptionalMany())
	    {
	      
    /*delete_OptionalOneFromMany*/
    realSb.append(TEXT_1553);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1554);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1555);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1556);
    
	    }
	    else if (av.isOptionalOne() && relatedAssociation.isN())
	    {
	      
    /*delete_OptionalOneFromN*/
    realSb.append(TEXT_1557);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1558);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1559);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1560);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1561);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1562);
    
	    }
	    else if (av.isOptionalOne() && relatedAssociation.isMN())
	    {
	      
    /*delete_OptionalOneFromMN*/
    realSb.append(TEXT_1563);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1564);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1565);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_1566);
    realSb.append(relatedAssociation.getMultiplicity().getLowerBound());
    realSb.append(TEXT_1567);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1568);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1569);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1570);
    
	    }
	    else if (av.isOne() && relatedAssociation.isMany())
	    {
	      
    /*delete_OneFromMany*/
    realSb.append(TEXT_1571);
    realSb.append(gen.translate("removeParameterOne",av));
    realSb.append(TEXT_1572);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1573);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1574);
    realSb.append(gen.translate("removeParameterOne",av));
    realSb.append(TEXT_1575);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1576);
    
	    }
	    else if (av.isMandatory() && relatedAssociation.isOptionalOne())
	    {
	      
    /*delete_MandatoryFromOptionalOne*/
    realSb.append(TEXT_1577);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1578);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1579);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1580);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1581);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1582);
    
	    }
	    else if (av.isMany() && (relatedAssociation.isMN() || relatedAssociation.isN()))
	    {
	      
    /*delete_ManyFromMN*/
    realSb.append(TEXT_1583);
    realSb.append(gen.translate("parameterCopyOfMany",av));
    realSb.append(TEXT_1584);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1585);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1586);
    realSb.append(gen.translate("parameterCopyOfMany",av));
    realSb.append(TEXT_1587);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1588);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1589);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_1590);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1591);
    realSb.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1592);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1593);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1594);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1595);
    
	    }
	    else if (av.isMany() && relatedAssociation.isMany())
	    {
	      
    /*delete_ManyFromMany*/
    realSb.append(TEXT_1596);
    realSb.append(gen.translate("parameterCopyOfMany",av));
    realSb.append(TEXT_1597);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1598);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1599);
    realSb.append(gen.translate("parameterCopyOfMany",av));
    realSb.append(TEXT_1600);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1601);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1602);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1603);
    
	    }
	    else if (av.isMany() && relatedAssociation.isOnlyOne()) 
	    {
	      
    /*delete_ManyFromOne*/
    realSb.append(TEXT_1604);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1605);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1606);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1607);
                                                                                                               
	    }
	    else if (av.isMany() && relatedAssociation.isOptionalOne())
	    {
	      
    /*delete_ManyFromOptionalOne*/
    realSb.append(TEXT_1608);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1609);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1610);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1611);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1612);
    
	    }
	    else
	    {
	      continue;
	    }
	}
  }
  
  if (!uClass.isRoot() && !"external".equals(uClass.getExtendsClass().getModifier()))
  {
    appendln(realSb,"");
    append(realSb, "    super");
  }

  if (customDeletePostfixCode != null) 
  {
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customDeletePostfixCode, "    "));
  }

  appendln(realSb, "");
  appendln(realSb, "  end");


    realSb.append(TEXT_1613);
     boolean hasNonAutoGeneratedMethods = false;
      for (Method aMethod: uClass.getMethods())
      {
          if (aMethod.getSource() != Method.Source.fAutoAPI)
          {
              hasNonAutoGeneratedMethods = true;
              break;
          }
      }
  
    realSb.append(TEXT_1614);
     if (uClass.hasMethods() && hasNonAutoGeneratedMethods) { 
    /*class_MethodDeclaration*/
    
  // don't recheck for method being present: 
  // the for loop will terminate immediately even if there are none with little to no 
    for (Method aMethod : uClass.getMethods())
  	{
      if (aMethod.getSource() == Method.Source.fAutoAPI)
        continue;
      String methodName = aMethod.getName();
      String methodType = aMethod.getType();
      String customBeforeInjectionCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjectionsCustomMethod("before", aMethod.getName(), aMethod.getMethodParameters()));
      String customAfterInjectionCode  = GeneratorHelper.toCode(uClass.getApplicableCodeInjectionsCustomMethod("after", aMethod.getName(), aMethod.getMethodParameters()));
      String customPreconditionCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", aMethod.getName()+"Precondition"));
      String customPostconditionCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", aMethod.getName()+"Postcondition"));
      customPostconditionCode = customPostconditionCode==null?"":customPostconditionCode;
        
      String methodBody;
      if (aMethod.getIsAbstract()) {
       methodBody = "fail NotImplementedError, \"Method, " + uClass.getName() + "." + methodName + ", must be implemented.\"";
      } else {
       methodBody = (aMethod.getMethodBody() != null) ? aMethod.getMethodBody().getExtraCode() : "";
      }

      String properMethodBody = "    " + methodBody;
      String finalParams = "";
      StringBuilder parameters = new StringBuilder();
      if (aMethod.hasMethodParameters())
      {
        for (MethodParameter aMethodParam : aMethod.getMethodParameters()) 
        {
          String paramName = aMethodParam.getName();
          String aSingleParameter = paramName;
          parameters.append(aSingleParameter + ", ");
        }
        finalParams = parameters.toString().substring(0, parameters.toString().length()-2);
      }
        
      appendln(realSb, "");
      	
      if (aMethod.numberOfComments() > 0) { append(realSb, "\n  {0}\n", Comment.format("RubyMultiline Internal", aMethod.getComments())); }
    	
      append(realSb, "  def {0} ({1})\n", methodName, finalParams);
      
      if(!"".equals(customPostconditionCode))
      {
        if(!"".equals(methodType)&&!"void".equals(methodType)){
          append(realSb, "    result = {0}_original({1})\n", methodName, finalParams);
        }
        else {
          append(realSb, "    {0}_original({1})\n", methodName, finalParams);
        }
        appendln(realSb, GeneratorHelper.doIndent(customPostconditionCode, "    "));
        if(!"".equals(methodType)&&!"void".equals(methodType)){
          append(realSb, "    return result\n");
        }          
        appendln(realSb, "  end");
        append(realSb, "\n  def {0}_original({1})\n", methodName, finalParams);
      }
    	
      if (customPreconditionCode != null) { append(realSb, "\n{0}\n",GeneratorHelper.doIndent(customPreconditionCode, "    "));}
      if (customBeforeInjectionCode != null) { append(realSb, "{0}\n",GeneratorHelper.doIndent(customBeforeInjectionCode, "    "));}

      if(properMethodBody.contains("return")) {
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
            String[] previousLinesOfCode = properMethodBody.substring(0, i+1).replaceAll("\\/\\*([\\S\\s]+?)\\*\\/", "").replaceAll("(?s)/\\*.*?\\*/", "").replaceAll("//.*$", "").split("\\n");
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

            i += indent.length() + 1;
            String[] returnAndRest = properMethodBody.substring(i).split("\n", 2);
            properMethodBody = properMethodIndent + properMethodBody.substring(0, i).trim() + indentedCustomAfterInjectionCode + "\n" + indent + returnAndRest[0].trim() + "\n" + returnAndRest[1];
            i += indentedCustomAfterInjectionCode.length() + 4;
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

    	
	  appendln(realSb, "  end");
  }

    realSb.append(TEXT_1615);
    realSb.append(TEXT_1616);
     } 
    realSb.append(TEXT_1617);
     if (uClass.getExtraCode() != null && uClass.getExtraCode().length() > 0) { 
    realSb.append(TEXT_1618);
    realSb.append(uClass.getExtraCode());
    realSb.append(TEXT_1619);
     } 
    realSb.append(TEXT_1620);
    realSb.append(gen.translate("packageDefinitionEnd",uClass));

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
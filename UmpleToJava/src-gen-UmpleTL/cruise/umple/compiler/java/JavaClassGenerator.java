/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler.java;
import cruise.umple.compiler.*;
import cruise.umple.util.*;
import java.util.*;
import cruise.umple.parser.Position;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// line 39 "../../../../../UmpleTLTemplates/JavaClassGenerator.ump"
public class JavaClassGenerator implements ILang
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "/*PLEASE DO NOT EDIT THIS CODE*/" + NL + "/*This code was generated using the UMPLE @UMPLE_VERSION@ modeling language!*/";
  public static final String TEXT_1 = "";
  public static final String TEXT_2 = NL + NL;
  public static final String TEXT_3 = NL;
  public static final String TEXT_4 = "";
  public static final String TEXT_5 = "";
  public static final String TEXT_6 = "";
  public static final String TEXT_7 = NL + "// line ";
  public static final String TEXT_8 = " \"";
  public static final String TEXT_9 = "\"";
  public static final String TEXT_10 = NL + "@WebService(endpointInterface = \"";
  public static final String TEXT_11 = "\")" + NL + "@XmlAccessorType(XmlAccessType.FIELD)" + NL + "@XmlType(factoryMethod=\"umplenewInstance\", propOrder={";
  public static final String TEXT_12 = "\"remoteUrl\", \"objectId\", \"remotePort\"";
  public static final String TEXT_13 = "})";
  public static final String TEXT_14 = NL + "public ";
  public static final String TEXT_15 = "class ";
  public static final String TEXT_16 = NL + "{";
  public static final String TEXT_17 = NL + "  //------------------------" + NL + "  // Returning the Hashcode" + NL + "  //------------------------" + NL + "  public int getHashCode()" + NL + "  {" + NL + "    return hashCode();" + NL + "  }";
  public static final String TEXT_18 = NL + "  //------------------------" + NL + "  // Reference to the proxy" + NL + "  //------------------------" + NL + "  ";
  public static final String TEXT_19 = " self;" + NL + "  " + NL + "  public void setSelf(";
  public static final String TEXT_20 = " proxy)" + NL + "  {";
  public static final String TEXT_21 = NL + "    super.setSelf(proxy);";
  public static final String TEXT_22 = NL + "    self=proxy;" + NL + "  }" + NL;
  public static final String TEXT_23 = "";
  public static final String TEXT_24 = NL + NL + "  //------------------------" + NL + "  // CONSTRUCTOR" + NL + "  //------------------------" + NL;
  public static final String TEXT_25 = NL + "    ";
  public static final String TEXT_26 = " = new ArrayList<";
  public static final String TEXT_27 = ">();";
  public static final String TEXT_28 = " " + NL + "    ";
  public static final String TEXT_29 = ".add(";
  public static final String TEXT_30 = ");";
  public static final String TEXT_31 = NL + "    ";
  public static final String TEXT_32 = "();";
  public static final String TEXT_33 = NL + "    ";
  public static final String TEXT_34 = " = true;";
  public static final String TEXT_35 = NL + "    ";
  public static final String TEXT_36 = " = ";
  public static final String TEXT_37 = ";";
  public static final String TEXT_38 = NL + "    ";
  public static final String TEXT_39 = " = ";
  public static final String TEXT_40 = ";";
  public static final String TEXT_41 = NL + "    ";
  public static final String TEXT_42 = " = ";
  public static final String TEXT_43 = ";";
  public static final String TEXT_44 = NL + "    ( new Thread()" + NL + "    {" + NL + "      Thread thread;" + NL + "      {" + NL + "        thread = Thread.currentThread();" + NL + "      }" + NL + "      public void run()" + NL + "      {" + NL + "        while( thread.isAlive() )" + NL + "        {";
  public static final String TEXT_45 = NL + "          try" + NL + "          {" + NL + "            Thread.sleep(";
  public static final String TEXT_46 = ");" + NL + "          }" + NL + "          catch (InterruptedException e)" + NL + "          {" + NL + "            e.printStackTrace();" + NL + "          }" + NL + "        }" + NL + "      }" + NL + "    }" + NL + "    ).start();";
  public static final String TEXT_47 = NL + "    ";
  public static final String TEXT_48 = " = ";
  public static final String TEXT_49 = "++;";
  public static final String TEXT_50 = NL + "    if (!";
  public static final String TEXT_51 = "(";
  public static final String TEXT_52 = "))" + NL + "    {" + NL + "      throw new RuntimeException(\"Cannot create due to duplicate ";
  public static final String TEXT_53 = ". See http://manual.umple.org?RE003ViolationofUniqueness.html\");" + NL + "    }";
  public static final String TEXT_54 = NL + "    if (!";
  public static final String TEXT_55 = "(";
  public static final String TEXT_56 = "))" + NL + "    {" + NL + "      throw new RuntimeException(\"Unable to create ";
  public static final String TEXT_57 = " due to ";
  public static final String TEXT_58 = ". See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html\");" + NL + "    }";
  public static final String TEXT_59 = NL + "    ";
  public static final String TEXT_60 = " = new ArrayList<";
  public static final String TEXT_61 = ">();" + NL + "    boolean ";
  public static final String TEXT_62 = " = ";
  public static final String TEXT_63 = "(";
  public static final String TEXT_64 = ");" + NL + "    if (!";
  public static final String TEXT_65 = ")" + NL + "    {" + NL + "      throw new RuntimeException(\"Unable to create ";
  public static final String TEXT_66 = ", must have ";
  public static final String TEXT_67 = " ";
  public static final String TEXT_68 = ". See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html\");" + NL + "    }";
  public static final String TEXT_69 = NL + "    ";
  public static final String TEXT_70 = " = new ArrayList<";
  public static final String TEXT_71 = ">();" + NL + "    boolean ";
  public static final String TEXT_72 = " = ";
  public static final String TEXT_73 = "(";
  public static final String TEXT_74 = ");" + NL + "    if (!";
  public static final String TEXT_75 = ")" + NL + "    {" + NL + "      throw new RuntimeException(\"Unable to create ";
  public static final String TEXT_76 = ", must have ";
  public static final String TEXT_77 = " or fewer ";
  public static final String TEXT_78 = ", no duplicates. See http://manual.umple.org?RE001ViolationofImmutability.html\");" + NL + "    }";
  public static final String TEXT_79 = NL + "    ";
  public static final String TEXT_80 = " = new ArrayList<";
  public static final String TEXT_81 = ">();" + NL + "    boolean ";
  public static final String TEXT_82 = " = ";
  public static final String TEXT_83 = "(";
  public static final String TEXT_84 = ");" + NL + "    if (!";
  public static final String TEXT_85 = ")" + NL + "    {" + NL + "      throw new RuntimeException(\"Unable to create ";
  public static final String TEXT_86 = ", must not have duplicate ";
  public static final String TEXT_87 = ". See http://manual.umple.org?RE001ViolationofImmutability.html\");" + NL + "    }";
  public static final String TEXT_88 = NL + "    ";
  public static final String TEXT_89 = " = new ArrayList<";
  public static final String TEXT_90 = ">();";
  public static final String TEXT_91 = NL + "    if (";
  public static final String TEXT_92 = " == null || ";
  public static final String TEXT_93 = ".";
  public static final String TEXT_94 = "() != null)" + NL + "    {" + NL + "      throw new RuntimeException(\"Unable to create ";
  public static final String TEXT_95 = " due to ";
  public static final String TEXT_96 = ". See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html\");" + NL + "    }" + NL + "    ";
  public static final String TEXT_97 = " = ";
  public static final String TEXT_98 = ";";
  public static final String TEXT_99 = NL + "    boolean ";
  public static final String TEXT_100 = " = ";
  public static final String TEXT_101 = "(";
  public static final String TEXT_102 = ");" + NL + "    if (!";
  public static final String TEXT_103 = ")" + NL + "    {" + NL + "      throw new RuntimeException(\"Unable to create ";
  public static final String TEXT_104 = " due to ";
  public static final String TEXT_105 = ". See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html\");" + NL + "    }";
  public static final String TEXT_106 = " = new ArrayList<";
  public static final String TEXT_107 = ">();" + NL + "    ";
  public static final String TEXT_108 = ".add(";
  public static final String TEXT_109 = ");";
  public static final String TEXT_110 = NL + "    ";
  public static final String TEXT_111 = "(";
  public static final String TEXT_112 = ".";
  public static final String TEXT_113 = ");";
  public static final String TEXT_114 = NL + "    ";
  public static final String TEXT_115 = "HStar = ";
  public static final String TEXT_116 = ".";
  public static final String TEXT_117 = ";";
  public static final String TEXT_118 = "";
  public static final String TEXT_119 = NL + "    ";
  public static final String TEXT_120 = "H = ";
  public static final String TEXT_121 = ".";
  public static final String TEXT_122 = ";";
  public static final String TEXT_123 = NL + "    ";
  public static final String TEXT_124 = "(";
  public static final String TEXT_125 = ".";
  public static final String TEXT_126 = ");";
  public static final String TEXT_127 = NL + "  public static ";
  public static final String TEXT_128 = " getInstance()" + NL + "  {" + NL + "    if(theInstance == null)" + NL + "    {" + NL + "      theInstance = new ";
  public static final String TEXT_129 = "();" + NL + "    }" + NL + "    return theInstance;" + NL + "  }";
  public static final String TEXT_130 = NL + NL + "  public ";
  public static final String TEXT_131 = "(";
  public static final String TEXT_132 = ")" + NL + "  {";
  public static final String TEXT_133 = NL + "    ";
  public static final String TEXT_134 = " = new ";
  public static final String TEXT_135 = "(";
  public static final String TEXT_136 = ");";
  public static final String TEXT_137 = "";
  public static final String TEXT_138 = NL + NL + "  //------------------------" + NL + "  // INTERFACE" + NL + "  //------------------------" + NL;
  public static final String TEXT_139 = "  /* Code from template attribute_SetImmutable */" + NL;
  public static final String TEXT_140 = "  public boolean ";
  public static final String TEXT_141 = "(";
  public static final String TEXT_142 = " ";
  public static final String TEXT_143 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_144 = NL + "    ";
  public static final String TEXT_145 = " = false;";
  public static final String TEXT_146 = NL + "    ";
  public static final String TEXT_147 = " = ";
  public static final String TEXT_148 = ";";
  public static final String TEXT_149 = NL + "    wasSet = true;";
  public static final String TEXT_150 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_151 = "  /* Code from template attribute_SetDefaulted */" + NL;
  public static final String TEXT_152 = "  public boolean ";
  public static final String TEXT_153 = "(";
  public static final String TEXT_154 = " ";
  public static final String TEXT_155 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_156 = "";
  public static final String TEXT_157 = NL + "    ";
  public static final String TEXT_158 = " = ";
  public static final String TEXT_159 = ";";
  public static final String TEXT_160 = NL + "    wasSet = true;";
  public static final String TEXT_161 = NL + "    return wasSet;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_162 = "()" + NL + "  {" + NL + "    boolean wasReset = false;";
  public static final String TEXT_163 = "";
  public static final String TEXT_164 = NL + "    ";
  public static final String TEXT_165 = " = ";
  public static final String TEXT_166 = "();";
  public static final String TEXT_167 = NL + "    wasReset = true;";
  public static final String TEXT_168 = NL + "    return wasReset;" + NL + "  }" + NL;
  public static final String TEXT_169 = "  /* Code from template attribute_SetMany */" + NL;
  public static final String TEXT_170 = "  public boolean ";
  public static final String TEXT_171 = "(";
  public static final String TEXT_172 = " ";
  public static final String TEXT_173 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_174 = "";
  public static final String TEXT_175 = NL + "    wasAdded = ";
  public static final String TEXT_176 = ".add(";
  public static final String TEXT_177 = ");";
  public static final String TEXT_178 = NL;
  public static final String TEXT_179 = "    return wasAdded;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_180 = "(";
  public static final String TEXT_181 = " ";
  public static final String TEXT_182 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_183 = "";
  public static final String TEXT_184 = NL + "    wasRemoved = ";
  public static final String TEXT_185 = ".remove(";
  public static final String TEXT_186 = ");";
  public static final String TEXT_187 = NL;
  public static final String TEXT_188 = "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_189 = NL + "  public boolean ";
  public static final String TEXT_190 = "(";
  public static final String TEXT_191 = " ";
  public static final String TEXT_192 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_193 = "";
  public static final String TEXT_194 = NL + "    ";
  public static final String TEXT_195 = " = ";
  public static final String TEXT_196 = ";";
  public static final String TEXT_197 = NL + "    wasSet = true;";
  public static final String TEXT_198 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_199 = "  /* Code from template attribute_SetDefaulted_subclass */" + NL;
  public static final String TEXT_200 = "  public boolean ";
  public static final String TEXT_201 = "(";
  public static final String TEXT_202 = " ";
  public static final String TEXT_203 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_204 = "";
  public static final String TEXT_205 = NL + "      wasSet = super.";
  public static final String TEXT_206 = "(";
  public static final String TEXT_207 = ");";
  public static final String TEXT_208 = "";
  public static final String TEXT_209 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_210 = "  /* Code from template attribute_SetMany_subclass */" + NL;
  public static final String TEXT_211 = "  public boolean ";
  public static final String TEXT_212 = "(";
  public static final String TEXT_213 = " ";
  public static final String TEXT_214 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_215 = "";
  public static final String TEXT_216 = NL + "      wasAdded = super.";
  public static final String TEXT_217 = "(";
  public static final String TEXT_218 = ");";
  public static final String TEXT_219 = "";
  public static final String TEXT_220 = NL + "    return wasAdded;" + NL + "  }";
  public static final String TEXT_221 = "  /* Code from template attribute_Set_subclass */" + NL;
  public static final String TEXT_222 = "  public boolean ";
  public static final String TEXT_223 = "(";
  public static final String TEXT_224 = " ";
  public static final String TEXT_225 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_226 = "";
  public static final String TEXT_227 = NL + "      wasSet = super.";
  public static final String TEXT_228 = "(";
  public static final String TEXT_229 = ");";
  public static final String TEXT_230 = "";
  public static final String TEXT_231 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_232 = "  /* Code from template attribute_GetMany */" + NL;
  public static final String TEXT_233 = "  public ";
  public static final String TEXT_234 = " ";
  public static final String TEXT_235 = "(int index)" + NL + "  {";
  public static final String TEXT_236 = NL + "    ";
  public static final String TEXT_237 = " ";
  public static final String TEXT_238 = " = ";
  public static final String TEXT_239 = ".get(index);";
  public static final String TEXT_240 = NL;
  public static final String TEXT_241 = "    return ";
  public static final String TEXT_242 = ";" + NL + "  }" + NL + NL + "  public ";
  public static final String TEXT_243 = "[] ";
  public static final String TEXT_244 = "()" + NL + "  {";
  public static final String TEXT_245 = NL + "    ";
  public static final String TEXT_246 = "[] ";
  public static final String TEXT_247 = " = ";
  public static final String TEXT_248 = ".toArray(new ";
  public static final String TEXT_249 = "[";
  public static final String TEXT_250 = ".size()]);";
  public static final String TEXT_251 = NL;
  public static final String TEXT_252 = "    return ";
  public static final String TEXT_253 = ";" + NL + "  }" + NL + NL + "  public int ";
  public static final String TEXT_254 = "()" + NL + "  {";
  public static final String TEXT_255 = NL + "    int number = ";
  public static final String TEXT_256 = ".size();";
  public static final String TEXT_257 = NL;
  public static final String TEXT_258 = "    return number;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_259 = "()" + NL + "  {";
  public static final String TEXT_260 = NL + "    boolean has = ";
  public static final String TEXT_261 = ".size() > 0;";
  public static final String TEXT_262 = NL;
  public static final String TEXT_263 = "    return has;" + NL + "  }" + NL + NL + "  public int ";
  public static final String TEXT_264 = "(";
  public static final String TEXT_265 = " ";
  public static final String TEXT_266 = ")" + NL + "  {";
  public static final String TEXT_267 = NL + "    int index = ";
  public static final String TEXT_268 = ".indexOf(";
  public static final String TEXT_269 = ");";
  public static final String TEXT_270 = NL;
  public static final String TEXT_271 = "    return index;" + NL + "  }" + NL;
  public static final String TEXT_272 = "  /* Code from template attribute_GetDerivedCodeInjection */";
  public static final String TEXT_273 = NL + "  public ";
  public static final String TEXT_274 = " ";
  public static final String TEXT_275 = "()" + NL + "  {";
  public static final String TEXT_276 = NL + "    ";
  public static final String TEXT_277 = " ";
  public static final String TEXT_278 = " = ";
  public static final String TEXT_279 = ";";
  public static final String TEXT_280 = NL;
  public static final String TEXT_281 = "    return ";
  public static final String TEXT_282 = ";";
  public static final String TEXT_283 = NL + "  }";
  public static final String TEXT_284 = NL + "  public ";
  public static final String TEXT_285 = " ";
  public static final String TEXT_286 = "()" + NL + "  {";
  public static final String TEXT_287 = NL + "    return ";
  public static final String TEXT_288 = ";";
  public static final String TEXT_289 = NL + "  }";
  public static final String TEXT_290 = "  /* Code from template attribute_GetCodeInjection */" + NL;
  public static final String TEXT_291 = "  public ";
  public static final String TEXT_292 = " ";
  public static final String TEXT_293 = "()" + NL + "  {";
  public static final String TEXT_294 = NL + "    ";
  public static final String TEXT_295 = " ";
  public static final String TEXT_296 = " = ";
  public static final String TEXT_297 = ";";
  public static final String TEXT_298 = NL;
  public static final String TEXT_299 = "    return ";
  public static final String TEXT_300 = ";" + NL + "  }";
  public static final String TEXT_301 = NL + "  public ";
  public static final String TEXT_302 = " ";
  public static final String TEXT_303 = "()" + NL + "  {";
  public static final String TEXT_304 = "";
  public static final String TEXT_305 = NL + "    return ";
  public static final String TEXT_306 = ";" + NL + "  }";
  public static final String TEXT_307 = "  /* Code from template attribute_GetDefaultedCodeInjection */" + NL;
  public static final String TEXT_308 = "  public ";
  public static final String TEXT_309 = " ";
  public static final String TEXT_310 = "()" + NL + "  {";
  public static final String TEXT_311 = NL + "    ";
  public static final String TEXT_312 = " ";
  public static final String TEXT_313 = " = ";
  public static final String TEXT_314 = ";";
  public static final String TEXT_315 = NL;
  public static final String TEXT_316 = "    return ";
  public static final String TEXT_317 = ";" + NL + "  }" + NL;
  public static final String TEXT_318 = "  /* Code from template attribute_GetDefaulted */" + NL;
  public static final String TEXT_319 = "  public ";
  public static final String TEXT_320 = " ";
  public static final String TEXT_321 = "()" + NL + "  {";
  public static final String TEXT_322 = "";
  public static final String TEXT_323 = NL + "    return ";
  public static final String TEXT_324 = ";" + NL + "  }" + NL;
  public static final String TEXT_325 = "  /* Code from template attribute_GetUniqueCodeInjection */" + NL;
  public static final String TEXT_326 = "  public static ";
  public static final String TEXT_327 = " ";
  public static final String TEXT_328 = "(";
  public static final String TEXT_329 = " ";
  public static final String TEXT_330 = ")" + NL + "  {";
  public static final String TEXT_331 = NL + "    ";
  public static final String TEXT_332 = " ";
  public static final String TEXT_333 = " = ";
  public static final String TEXT_334 = ".get(";
  public static final String TEXT_335 = ");";
  public static final String TEXT_336 = NL;
  public static final String TEXT_337 = "    return ";
  public static final String TEXT_338 = ";" + NL + "  }" + NL;
  public static final String TEXT_339 = "  /* Code from template attribute_GetUnique */" + NL;
  public static final String TEXT_340 = "  public static ";
  public static final String TEXT_341 = " ";
  public static final String TEXT_342 = "(";
  public static final String TEXT_343 = " ";
  public static final String TEXT_344 = ")" + NL + "  {";
  public static final String TEXT_345 = "";
  public static final String TEXT_346 = NL + "    return ";
  public static final String TEXT_347 = ".get(";
  public static final String TEXT_348 = ");" + NL + "  }" + NL;
  public static final String TEXT_349 = "  /* Code from template attribute_HasUniqueCodeInjection */" + NL;
  public static final String TEXT_350 = "  public static boolean ";
  public static final String TEXT_351 = "(";
  public static final String TEXT_352 = " ";
  public static final String TEXT_353 = ")" + NL + "  {";
  public static final String TEXT_354 = NL + "    boolean ";
  public static final String TEXT_355 = " = ";
  public static final String TEXT_356 = "(";
  public static final String TEXT_357 = ") != null;";
  public static final String TEXT_358 = NL;
  public static final String TEXT_359 = "    return ";
  public static final String TEXT_360 = ";" + NL + "  }" + NL;
  public static final String TEXT_361 = "  /* Code from template attribute_HasUnique */" + NL;
  public static final String TEXT_362 = "  public static boolean ";
  public static final String TEXT_363 = "(";
  public static final String TEXT_364 = " ";
  public static final String TEXT_365 = ")" + NL + "  {";
  public static final String TEXT_366 = "";
  public static final String TEXT_367 = NL + "    return ";
  public static final String TEXT_368 = "(";
  public static final String TEXT_369 = ") != null;" + NL + "  }" + NL;
  public static final String TEXT_370 = "  /* Code from template attribute_GetDefaultedSubclass */" + NL;
  public static final String TEXT_371 = "  public ";
  public static final String TEXT_372 = " ";
  public static final String TEXT_373 = "()" + NL + "  {";
  public static final String TEXT_374 = NL + "    ";
  public static final String TEXT_375 = " ";
  public static final String TEXT_376 = " = super.";
  public static final String TEXT_377 = "();";
  public static final String TEXT_378 = NL;
  public static final String TEXT_379 = "    return ";
  public static final String TEXT_380 = ";" + NL + "  }" + NL;
  public static final String TEXT_381 = "  /* Code from template attribute_GetManySubclass */" + NL;
  public static final String TEXT_382 = "  public ";
  public static final String TEXT_383 = " ";
  public static final String TEXT_384 = "(int index)" + NL + "  {";
  public static final String TEXT_385 = NL + "    ";
  public static final String TEXT_386 = " ";
  public static final String TEXT_387 = " = super.";
  public static final String TEXT_388 = "(index);";
  public static final String TEXT_389 = NL;
  public static final String TEXT_390 = "    return ";
  public static final String TEXT_391 = ";" + NL + "  }" + NL;
  public static final String TEXT_392 = "  /* Code from template attribute_GetUniqueSubclass */" + NL;
  public static final String TEXT_393 = "  public static ";
  public static final String TEXT_394 = " ";
  public static final String TEXT_395 = "(";
  public static final String TEXT_396 = " ";
  public static final String TEXT_397 = ")" + NL + "  {";
  public static final String TEXT_398 = NL + "    ";
  public static final String TEXT_399 = " ";
  public static final String TEXT_400 = " = super.";
  public static final String TEXT_401 = "(";
  public static final String TEXT_402 = " ";
  public static final String TEXT_403 = ");";
  public static final String TEXT_404 = NL;
  public static final String TEXT_405 = "    return ";
  public static final String TEXT_406 = ";" + NL + "  }" + NL;
  public static final String TEXT_407 = "  /* Code from template attribute_GetDerivedSubclass */";
  public static final String TEXT_408 = NL + "  public ";
  public static final String TEXT_409 = " ";
  public static final String TEXT_410 = "()" + NL + "  {";
  public static final String TEXT_411 = NL + "    ";
  public static final String TEXT_412 = " ";
  public static final String TEXT_413 = " = super.";
  public static final String TEXT_414 = "();";
  public static final String TEXT_415 = NL;
  public static final String TEXT_416 = "    return ";
  public static final String TEXT_417 = ";";
  public static final String TEXT_418 = NL + "  }" + NL;
  public static final String TEXT_419 = NL + "  public ";
  public static final String TEXT_420 = " ";
  public static final String TEXT_421 = "()" + NL + "  {";
  public static final String TEXT_422 = NL + "    ";
  public static final String TEXT_423 = " ";
  public static final String TEXT_424 = " =  super.";
  public static final String TEXT_425 = "();";
  public static final String TEXT_426 = NL + "    return ";
  public static final String TEXT_427 = ";" + NL + "  }";
  public static final String TEXT_428 = "  /* Code from template attribute_IsBooleanCodeInjectionDerived */" + NL;
  public static final String TEXT_429 = "  public ";
  public static final String TEXT_430 = " ";
  public static final String TEXT_431 = "()" + NL + "  {";
  public static final String TEXT_432 = NL + "    ";
  public static final String TEXT_433 = " ";
  public static final String TEXT_434 = " = ";
  public static final String TEXT_435 = ";";
  public static final String TEXT_436 = NL;
  public static final String TEXT_437 = "    return ";
  public static final String TEXT_438 = ";" + NL + "  }";
  public static final String TEXT_439 = "  /* Code from template attribute_IsBooleanDerived */" + NL;
  public static final String TEXT_440 = "  public ";
  public static final String TEXT_441 = " ";
  public static final String TEXT_442 = "()" + NL + "  {";
  public static final String TEXT_443 = "";
  public static final String TEXT_444 = NL + "    return ";
  public static final String TEXT_445 = ";" + NL + "  }";
  public static final String TEXT_446 = "  /* Code from template attribute_IsBooleanCodeInjection */" + NL;
  public static final String TEXT_447 = "  public ";
  public static final String TEXT_448 = " ";
  public static final String TEXT_449 = "()" + NL + "  {";
  public static final String TEXT_450 = NL + "    ";
  public static final String TEXT_451 = " ";
  public static final String TEXT_452 = " = ";
  public static final String TEXT_453 = ";";
  public static final String TEXT_454 = NL;
  public static final String TEXT_455 = "    return ";
  public static final String TEXT_456 = ";" + NL + "  }";
  public static final String TEXT_457 = "  /* Code from template attribute_IsBoolean */" + NL;
  public static final String TEXT_458 = "  public ";
  public static final String TEXT_459 = " ";
  public static final String TEXT_460 = "()" + NL + "  {";
  public static final String TEXT_461 = "";
  public static final String TEXT_462 = NL + "    return ";
  public static final String TEXT_463 = ";" + NL + "  }";
  public static final String TEXT_464 = "";
  public static final String TEXT_465 = NL + "  public ";
  public static final String TEXT_466 = " ";
  public static final String TEXT_467 = "()" + NL + "  {" + NL + "    String answer = ";
  public static final String TEXT_468 = ".toString();";
  public static final String TEXT_469 = NL + "    return answer;" + NL + "  }" + NL;
  public static final String TEXT_470 = NL + "  public ";
  public static final String TEXT_471 = " ";
  public static final String TEXT_472 = "()" + NL + "  {" + NL + "    return ";
  public static final String TEXT_473 = ";" + NL + "  }" + NL;
  public static final String TEXT_474 = NL + "  ";
  public static final String TEXT_475 = " boolean ";
  public static final String TEXT_476 = "(";
  public static final String TEXT_477 = ")" + NL + "  {";
  public static final String TEXT_478 = NL + "    boolean wasEventProcessed = false;" + NL + "    ";
  public static final String TEXT_479 = NL + "    return wasEventProcessed;" + NL + "  }" + NL;
  public static final String TEXT_480 = NL + "  public boolean ";
  public static final String TEXT_481 = "(";
  public static final String TEXT_482 = " ";
  public static final String TEXT_483 = ")" + NL + "  {";
  public static final String TEXT_484 = "";
  public static final String TEXT_485 = NL + "    ";
  public static final String TEXT_486 = " = ";
  public static final String TEXT_487 = ";" + NL + "    return true;" + NL + "  }" + NL;
  public static final String TEXT_488 = "";
  public static final String TEXT_489 = NL + "  private void ";
  public static final String TEXT_490 = "()" + NL + "  {";
  public static final String TEXT_491 = NL + "    switch(";
  public static final String TEXT_492 = ")" + NL + "    {" + NL + "      ";
  public static final String TEXT_493 = NL + "    }";
  public static final String TEXT_494 = NL + "  }" + NL;
  public static final String TEXT_495 = NL + "  private void ";
  public static final String TEXT_496 = "(";
  public static final String TEXT_497 = " ";
  public static final String TEXT_498 = ")" + NL + "  {";
  public static final String TEXT_499 = NL + "    ";
  public static final String TEXT_500 = " = ";
  public static final String TEXT_501 = ";";
  public static final String TEXT_502 = NL + "    if (";
  public static final String TEXT_503 = " != ";
  public static final String TEXT_504 = ".";
  public static final String TEXT_505 = " && ";
  public static final String TEXT_506 = " != ";
  public static final String TEXT_507 = ".";
  public static final String TEXT_508 = ") { ";
  public static final String TEXT_509 = "(";
  public static final String TEXT_510 = ".";
  public static final String TEXT_511 = "); }";
  public static final String TEXT_512 = "";
  public static final String TEXT_513 = "";
  public static final String TEXT_514 = NL + NL + "    // entry actions and do activities" + NL + "    switch(";
  public static final String TEXT_515 = ")" + NL + "    {" + NL + "      ";
  public static final String TEXT_516 = NL + "    }";
  public static final String TEXT_517 = "";
  public static final String TEXT_518 = "";
  public static final String TEXT_519 = NL + "    if (";
  public static final String TEXT_520 = " == ";
  public static final String TEXT_521 = ".HStar) { ";
  public static final String TEXT_522 = " = ";
  public static final String TEXT_523 = "HStar;}";
  public static final String TEXT_524 = "";
  public static final String TEXT_525 = NL + "  }" + NL;
  public static final String TEXT_526 = "  /* Code from template association_GetOne_specialization */" + NL;
  public static final String TEXT_527 = "  public ";
  public static final String TEXT_528 = " ";
  public static final String TEXT_529 = "_One";
  public static final String TEXT_530 = "()" + NL + "  {";
  public static final String TEXT_531 = NL + "    ";
  public static final String TEXT_532 = " ";
  public static final String TEXT_533 = " = ";
  public static final String TEXT_534 = "(";
  public static final String TEXT_535 = ")";
  public static final String TEXT_536 = "super.";
  public static final String TEXT_537 = "(0);%>";
  public static final String TEXT_538 = NL + "    ";
  public static final String TEXT_539 = " ";
  public static final String TEXT_540 = " = ";
  public static final String TEXT_541 = "(";
  public static final String TEXT_542 = ")";
  public static final String TEXT_543 = "super.";
  public static final String TEXT_544 = "();%>";
  public static final String TEXT_545 = "";
  public static final String TEXT_546 = "";
  public static final String TEXT_547 = NL + "    return ";
  public static final String TEXT_548 = "(";
  public static final String TEXT_549 = ")";
  public static final String TEXT_550 = "super.";
  public static final String TEXT_551 = "(";
  public static final String TEXT_552 = "0";
  public static final String TEXT_553 = ");";
  public static final String TEXT_554 = NL + "    ";
  public static final String TEXT_555 = " ";
  public static final String TEXT_556 = " = (";
  public static final String TEXT_557 = ")super.";
  public static final String TEXT_558 = "(";
  public static final String TEXT_559 = "0);";
  public static final String TEXT_560 = "";
  public static final String TEXT_561 = NL + "    return ";
  public static final String TEXT_562 = ";";
  public static final String TEXT_563 = NL + "  }" + NL;
  public static final String TEXT_564 = "  /* Code from template association_GetOne_relatedSpecialization */" + NL;
  public static final String TEXT_565 = "  public ";
  public static final String TEXT_566 = " ";
  public static final String TEXT_567 = "_One";
  public static final String TEXT_568 = "()" + NL + "  {";
  public static final String TEXT_569 = "";
  public static final String TEXT_570 = NL + "    return (";
  public static final String TEXT_571 = ")";
  public static final String TEXT_572 = ".get(0)";
  public static final String TEXT_573 = ";";
  public static final String TEXT_574 = NL + "    ";
  public static final String TEXT_575 = " ";
  public static final String TEXT_576 = " = (";
  public static final String TEXT_577 = ")";
  public static final String TEXT_578 = ".get(0)";
  public static final String TEXT_579 = ";";
  public static final String TEXT_580 = "";
  public static final String TEXT_581 = NL + "    return ";
  public static final String TEXT_582 = ";";
  public static final String TEXT_583 = NL + "  } " + NL;
  public static final String TEXT_584 = "  /* Code from template association_GetOne */" + NL;
  public static final String TEXT_585 = "  public ";
  public static final String TEXT_586 = " ";
  public static final String TEXT_587 = "()" + NL + "  {";
  public static final String TEXT_588 = "";
  public static final String TEXT_589 = NL + "    return ";
  public static final String TEXT_590 = ";";
  public static final String TEXT_591 = NL + "    ";
  public static final String TEXT_592 = " ";
  public static final String TEXT_593 = " = ";
  public static final String TEXT_594 = ";";
  public static final String TEXT_595 = "";
  public static final String TEXT_596 = NL + "    return ";
  public static final String TEXT_597 = ";";
  public static final String TEXT_598 = NL + "  }";
  public static final String TEXT_599 = NL + NL + "  public boolean ";
  public static final String TEXT_600 = "()" + NL + "  {" + NL + "    boolean has = ";
  public static final String TEXT_601 = " != null;" + NL + "    return has;" + NL + "  }";
  public static final String TEXT_602 = NL;
  public static final String TEXT_603 = "  /* Code from template association_GetOne_clear */" + NL;
  public static final String TEXT_604 = "  protected void clear_";
  public static final String TEXT_605 = "()" + NL + "  {" + NL + "    ";
  public static final String TEXT_606 = " = null;" + NL + "  }" + NL;
  public static final String TEXT_607 = "  /* Code from template association_GetMany_specialization */" + NL;
  public static final String TEXT_608 = "  public ";
  public static final String TEXT_609 = " ";
  public static final String TEXT_610 = "_";
  public static final String TEXT_611 = "(int index)" + NL + "  {";
  public static final String TEXT_612 = NL + "    ";
  public static final String TEXT_613 = " ";
  public static final String TEXT_614 = " = (";
  public static final String TEXT_615 = ")super.";
  public static final String TEXT_616 = "(index);";
  public static final String TEXT_617 = "";
  public static final String TEXT_618 = NL + "    return ";
  public static final String TEXT_619 = ";" + NL + "  }" + NL;
  public static final String TEXT_620 = NL + "  /* required for Java 7. */" + NL + "  @SuppressWarnings(\"unchecked\")" + NL + "  public List<";
  public static final String TEXT_621 = "> ";
  public static final String TEXT_622 = "_";
  public static final String TEXT_623 = "()" + NL + "  {";
  public static final String TEXT_624 = "";
  public static final String TEXT_625 = NL + "    List<? extends ";
  public static final String TEXT_626 = "> ";
  public static final String TEXT_627 = " = super.";
  public static final String TEXT_628 = "();";
  public static final String TEXT_629 = NL + "    return (List<";
  public static final String TEXT_630 = ">)";
  public static final String TEXT_631 = ";" + NL + "  }" + NL;
  public static final String TEXT_632 = "  /* Code from template association_GetMany_relatedSpecialization */" + NL;
  public static final String TEXT_633 = "  public ";
  public static final String TEXT_634 = " ";
  public static final String TEXT_635 = "_";
  public static final String TEXT_636 = "(int index)" + NL + "  {";
  public static final String TEXT_637 = NL + "    ";
  public static final String TEXT_638 = " ";
  public static final String TEXT_639 = " = (";
  public static final String TEXT_640 = ")";
  public static final String TEXT_641 = ".get(index);";
  public static final String TEXT_642 = "";
  public static final String TEXT_643 = NL + "    return ";
  public static final String TEXT_644 = ";" + NL + "  }" + NL;
  public static final String TEXT_645 = NL + "  /* required for Java 7. */" + NL + "  @SuppressWarnings(\"unchecked\")" + NL + "  public List<";
  public static final String TEXT_646 = "> ";
  public static final String TEXT_647 = "_";
  public static final String TEXT_648 = "()" + NL + "  {";
  public static final String TEXT_649 = "";
  public static final String TEXT_650 = NL + "    List<? extends ";
  public static final String TEXT_651 = "> ";
  public static final String TEXT_652 = " = Collections.unmodifiableList(";
  public static final String TEXT_653 = ");";
  public static final String TEXT_654 = NL + "    return (List<";
  public static final String TEXT_655 = ">)";
  public static final String TEXT_656 = ";" + NL + "  }" + NL;
  public static final String TEXT_657 = "  /* Code from template association_GetMany */" + NL;
  public static final String TEXT_658 = "  public ";
  public static final String TEXT_659 = " ";
  public static final String TEXT_660 = "(int index)" + NL + "  {";
  public static final String TEXT_661 = NL + "    ";
  public static final String TEXT_662 = " ";
  public static final String TEXT_663 = " = ";
  public static final String TEXT_664 = ".get(index);";
  public static final String TEXT_665 = "";
  public static final String TEXT_666 = NL + "    return ";
  public static final String TEXT_667 = ";" + NL + "  }" + NL;
  public static final String TEXT_668 = NL + "  public List<";
  public static final String TEXT_669 = "> ";
  public static final String TEXT_670 = "()" + NL + "  {";
  public static final String TEXT_671 = NL + "    List<";
  public static final String TEXT_672 = "> ";
  public static final String TEXT_673 = " = Collections.unmodifiableList(";
  public static final String TEXT_674 = ");";
  public static final String TEXT_675 = NL + "    return ";
  public static final String TEXT_676 = ";" + NL + "  }" + NL + NL + "  public int ";
  public static final String TEXT_677 = "()" + NL + "  {";
  public static final String TEXT_678 = NL + "    int number = ";
  public static final String TEXT_679 = ".size();";
  public static final String TEXT_680 = NL + "    return number;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_681 = "()" + NL + "  {";
  public static final String TEXT_682 = NL + "    boolean has = ";
  public static final String TEXT_683 = ".size() > 0;";
  public static final String TEXT_684 = NL + "    return has;" + NL + "  }" + NL + NL + "  public int ";
  public static final String TEXT_685 = "(";
  public static final String TEXT_686 = " ";
  public static final String TEXT_687 = ")" + NL + "  {";
  public static final String TEXT_688 = NL + "    int index = ";
  public static final String TEXT_689 = ".indexOf(";
  public static final String TEXT_690 = ");";
  public static final String TEXT_691 = NL + "    return index;" + NL + "  }" + NL;
  public static final String TEXT_692 = "  /* Code from template association_GetMany_clear */" + NL;
  public static final String TEXT_693 = "  protected void clear_";
  public static final String TEXT_694 = "()" + NL + "  {" + NL + "    ";
  public static final String TEXT_695 = ".clear();" + NL + "  }" + NL;
  public static final String TEXT_696 = "UNABLE TO UNDERSAND association variable (see association_Get_All.jet)";
  public static final String TEXT_697 = "//FIXME - FOUND UNKNOWN ASSOCIATION RELATIONSHIP ";
  public static final String TEXT_698 = " : ";
  public static final String TEXT_699 = "  /* Code from template association_IsNumberOfValidMethod */" + NL;
  public static final String TEXT_700 = "  public boolean ";
  public static final String TEXT_701 = "()" + NL + "  {";
  public static final String TEXT_702 = "";
  public static final String TEXT_703 = NL + "    boolean isValid = ";
  public static final String TEXT_704 = "() >= ";
  public static final String TEXT_705 = "();";
  public static final String TEXT_706 = NL + "    boolean isValid = ";
  public static final String TEXT_707 = "() >= ";
  public static final String TEXT_708 = "() && ";
  public static final String TEXT_709 = "() <= ";
  public static final String TEXT_710 = "();";
  public static final String TEXT_711 = "";
  public static final String TEXT_712 = NL + "    return isValid;" + NL + "  }";
  public static final String TEXT_713 = "  /* Code from template association_RequiredNumberOfMethod */";
  public static final String TEXT_714 = "";
  public static final String TEXT_715 = NL + "  public static int ";
  public static final String TEXT_716 = "()" + NL + "  {" + NL + "    return ";
  public static final String TEXT_717 = ";" + NL + "  }";
  public static final String TEXT_718 = NL + "  public static int ";
  public static final String TEXT_719 = "()" + NL + "  {";
  public static final String TEXT_720 = NL + "    int required = ";
  public static final String TEXT_721 = ";";
  public static final String TEXT_722 = NL + "    return required;" + NL + "  }";
  public static final String TEXT_723 = "  /* Code from template association_MinimumNumberOfMethod */";
  public static final String TEXT_724 = "";
  public static final String TEXT_725 = NL + "  public static int ";
  public static final String TEXT_726 = "()" + NL + "  {" + NL + "    return ";
  public static final String TEXT_727 = ";" + NL + "  }";
  public static final String TEXT_728 = NL + "  public static int ";
  public static final String TEXT_729 = "()" + NL + "  {";
  public static final String TEXT_730 = NL + "    int minimum = ";
  public static final String TEXT_731 = ";";
  public static final String TEXT_732 = NL + "    return minimum;" + NL + "  }";
  public static final String TEXT_733 = "  /* Code from template association_MaximumNumberOfMethod */";
  public static final String TEXT_734 = "";
  public static final String TEXT_735 = NL + "  public static int ";
  public static final String TEXT_736 = "()" + NL + "  {" + NL + "    return ";
  public static final String TEXT_737 = ";" + NL + "  }";
  public static final String TEXT_738 = NL + "  public static int ";
  public static final String TEXT_739 = "()" + NL + "  {";
  public static final String TEXT_740 = NL + "    int maximum = ";
  public static final String TEXT_741 = ";";
  public static final String TEXT_742 = NL + "    return maximum;" + NL + "  }";
  public static final String TEXT_743 = "  /* Code from template association_AddManyToManyMethod */" + NL;
  public static final String TEXT_744 = "  public boolean ";
  public static final String TEXT_745 = "(";
  public static final String TEXT_746 = " ";
  public static final String TEXT_747 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_748 = "";
  public static final String TEXT_749 = NL + "    if (";
  public static final String TEXT_750 = "() >= ";
  public static final String TEXT_751 = "())" + NL + "    {";
  public static final String TEXT_752 = NL + "      return wasAdded;" + NL + "    }" + NL;
  public static final String TEXT_753 = NL + "    ";
  public static final String TEXT_754 = ".add(";
  public static final String TEXT_755 = ");";
  public static final String TEXT_756 = NL + "    if (";
  public static final String TEXT_757 = ".";
  public static final String TEXT_758 = "(";
  public static final String TEXT_759 = ") != -1)" + NL + "    {" + NL + "      wasAdded = true;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      wasAdded = ";
  public static final String TEXT_760 = ".";
  public static final String TEXT_761 = "(";
  public static final String TEXT_762 = ");" + NL + "      if (!wasAdded)" + NL + "      {" + NL + "        ";
  public static final String TEXT_763 = ".remove(";
  public static final String TEXT_764 = ");" + NL + "      }" + NL + "    }";
  public static final String TEXT_765 = NL + "    return wasAdded;" + NL + "  }";
  public static final String TEXT_766 = "  /* Code from template association_RemoveMany */" + NL;
  public static final String TEXT_767 = "  public boolean ";
  public static final String TEXT_768 = "(";
  public static final String TEXT_769 = " ";
  public static final String TEXT_770 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_771 = "";
  public static final String TEXT_772 = NL + "    if (!";
  public static final String TEXT_773 = ".contains(";
  public static final String TEXT_774 = "))" + NL + "    {";
  public static final String TEXT_775 = NL + "      return wasRemoved;" + NL + "    }" + NL + NL + "    int oldIndex = ";
  public static final String TEXT_776 = ".indexOf(";
  public static final String TEXT_777 = ");" + NL + "    ";
  public static final String TEXT_778 = ".remove(oldIndex);" + NL + "    if (";
  public static final String TEXT_779 = ".";
  public static final String TEXT_780 = "(";
  public static final String TEXT_781 = ") == -1)" + NL + "    {" + NL + "      wasRemoved = true;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      wasRemoved = ";
  public static final String TEXT_782 = ".";
  public static final String TEXT_783 = "(";
  public static final String TEXT_784 = ");" + NL + "      if (!wasRemoved)" + NL + "      {" + NL + "        ";
  public static final String TEXT_785 = ".add(oldIndex,";
  public static final String TEXT_786 = ");" + NL + "      }" + NL + "    }";
  public static final String TEXT_787 = NL + "    return wasRemoved;" + NL + "  }";
  public static final String TEXT_788 = "  /* Code from template association_SetUnidirectionalOptionalOne */";
  public static final String TEXT_789 = NL + "  ";
  public static final String TEXT_790 = " boolean ";
  public static final String TEXT_791 = "(";
  public static final String TEXT_792 = " ";
  public static final String TEXT_793 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_794 = NL + "    ";
  public static final String TEXT_795 = " = ";
  public static final String TEXT_796 = ";" + NL + "    wasSet = true;";
  public static final String TEXT_797 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_798 = "  /* Code from template association_SetUnidirectionalOne */";
  public static final String TEXT_799 = NL + "  ";
  public static final String TEXT_800 = " boolean ";
  public static final String TEXT_801 = "(";
  public static final String TEXT_802 = " ";
  public static final String TEXT_803 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_804 = NL + "    if (";
  public static final String TEXT_805 = " != null)" + NL + "    {" + NL + "      ";
  public static final String TEXT_806 = " = ";
  public static final String TEXT_807 = ";" + NL + "      wasSet = true;" + NL + "    }";
  public static final String TEXT_808 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_809 = "  /* Code from template association_SetOptionalOneToOne */" + NL;
  public static final String TEXT_810 = "  public boolean ";
  public static final String TEXT_811 = "(";
  public static final String TEXT_812 = " ";
  public static final String TEXT_813 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_814 = NL + "    if (";
  public static final String TEXT_815 = " != null && !";
  public static final String TEXT_816 = ".equals(";
  public static final String TEXT_817 = ") && equals(";
  public static final String TEXT_818 = ".";
  public static final String TEXT_819 = "()))" + NL + "    {" + NL + "      //Unable to ";
  public static final String TEXT_820 = ", as existing ";
  public static final String TEXT_821 = " would become an orphan";
  public static final String TEXT_822 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_823 = " = ";
  public static final String TEXT_824 = ";" + NL + "    ";
  public static final String TEXT_825 = " ";
  public static final String TEXT_826 = " = ";
  public static final String TEXT_827 = " != null ? ";
  public static final String TEXT_828 = ".";
  public static final String TEXT_829 = "() : null;" + NL + NL + "    if (!this.equals(";
  public static final String TEXT_830 = "))" + NL + "    {" + NL + "      if (";
  public static final String TEXT_831 = " != null)" + NL + "      {" + NL + "        ";
  public static final String TEXT_832 = ".";
  public static final String TEXT_833 = " = null;" + NL + "      }" + NL + "      if (";
  public static final String TEXT_834 = " != null)" + NL + "      {" + NL + "        ";
  public static final String TEXT_835 = ".";
  public static final String TEXT_836 = "(";
  public static final String TEXT_837 = ");" + NL + "      }" + NL + "    }" + NL + "    wasSet = true;";
  public static final String TEXT_838 = "";
  public static final String TEXT_839 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_840 = "  /* Code from template association_SetOneToOptionalOne */" + NL;
  public static final String TEXT_841 = "  public boolean ";
  public static final String TEXT_842 = "(";
  public static final String TEXT_843 = " ";
  public static final String TEXT_844 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_845 = NL + "    if (";
  public static final String TEXT_846 = " == null)" + NL + "    {" + NL + "      //Unable to ";
  public static final String TEXT_847 = " to null, as ";
  public static final String TEXT_848 = " must always be associated to a ";
  public static final String TEXT_849 = "";
  public static final String TEXT_850 = NL + "      return wasSet;" + NL + "    }" + NL + "    " + NL + "    ";
  public static final String TEXT_851 = " ";
  public static final String TEXT_852 = " = ";
  public static final String TEXT_853 = ".";
  public static final String TEXT_854 = "();" + NL + "    if (";
  public static final String TEXT_855 = " != null && !equals(";
  public static final String TEXT_856 = "))" + NL + "    {" + NL + "      //Unable to ";
  public static final String TEXT_857 = ", the current ";
  public static final String TEXT_858 = " already has a ";
  public static final String TEXT_859 = ", which would be orphaned if it were re-assigned";
  public static final String TEXT_860 = NL + "      return wasSet;" + NL + "    }" + NL + "    " + NL + "    ";
  public static final String TEXT_861 = " ";
  public static final String TEXT_862 = " = ";
  public static final String TEXT_863 = ";" + NL + "    ";
  public static final String TEXT_864 = " = ";
  public static final String TEXT_865 = ";" + NL + "    ";
  public static final String TEXT_866 = ".";
  public static final String TEXT_867 = "(";
  public static final String TEXT_868 = ");" + NL + NL + "    if (";
  public static final String TEXT_869 = " != null)" + NL + "    {" + NL + "      ";
  public static final String TEXT_870 = ".";
  public static final String TEXT_871 = "(null);" + NL + "    }" + NL + "    wasSet = true;";
  public static final String TEXT_872 = "";
  public static final String TEXT_873 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_874 = "  /* Code from template association_AddMandatoryManyToOne */" + NL;
  public static final String TEXT_875 = "  public ";
  public static final String TEXT_876 = " ";
  public static final String TEXT_877 = "(";
  public static final String TEXT_878 = ")" + NL + "  {" + NL + "    ";
  public static final String TEXT_879 = " ";
  public static final String TEXT_880 = " = new ";
  public static final String TEXT_881 = "(";
  public static final String TEXT_882 = ");";
  public static final String TEXT_883 = NL + "    return ";
  public static final String TEXT_884 = ";" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_885 = "(";
  public static final String TEXT_886 = " ";
  public static final String TEXT_887 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_888 = NL + "    ";
  public static final String TEXT_889 = " ";
  public static final String TEXT_890 = " = ";
  public static final String TEXT_891 = ".";
  public static final String TEXT_892 = "();" + NL + "    boolean ";
  public static final String TEXT_893 = " = ";
  public static final String TEXT_894 = " != null && !";
  public static final String TEXT_895 = ".equals(";
  public static final String TEXT_896 = ");" + NL + NL + "    if (";
  public static final String TEXT_897 = " && ";
  public static final String TEXT_898 = ".";
  public static final String TEXT_899 = "() <= ";
  public static final String TEXT_900 = "())" + NL + "    {" + NL + "      return wasAdded;" + NL + "    }";
  public static final String TEXT_901 = NL + "    if (";
  public static final String TEXT_902 = ")" + NL + "    {" + NL + "      ";
  public static final String TEXT_903 = ".";
  public static final String TEXT_904 = "(";
  public static final String TEXT_905 = ");" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      ";
  public static final String TEXT_906 = ".add(";
  public static final String TEXT_907 = ");" + NL + "    }";
  public static final String TEXT_908 = NL + "    wasAdded = true;";
  public static final String TEXT_909 = NL + "    return wasAdded;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_910 = "(";
  public static final String TEXT_911 = " ";
  public static final String TEXT_912 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_913 = NL + "    //Unable to remove ";
  public static final String TEXT_914 = ", as it must always have a ";
  public static final String TEXT_915 = NL + "    if (";
  public static final String TEXT_916 = ".equals(";
  public static final String TEXT_917 = ".";
  public static final String TEXT_918 = "()))" + NL + "    {";
  public static final String TEXT_919 = NL + "      return wasRemoved;" + NL + "    }" + NL + NL + "    //";
  public static final String TEXT_920 = " already at minimum (";
  public static final String TEXT_921 = ")" + NL + "    if (";
  public static final String TEXT_922 = "() <= ";
  public static final String TEXT_923 = "())" + NL + "    {";
  public static final String TEXT_924 = NL + "      return wasRemoved;" + NL + "    }";
  public static final String TEXT_925 = NL + NL + "    ";
  public static final String TEXT_926 = ".remove(";
  public static final String TEXT_927 = ");";
  public static final String TEXT_928 = NL + "    wasRemoved = true;";
  public static final String TEXT_929 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_930 = "  /* Code from template association_AddMNToOnlyOne */" + NL;
  public static final String TEXT_931 = "  public ";
  public static final String TEXT_932 = " ";
  public static final String TEXT_933 = "(";
  public static final String TEXT_934 = ")" + NL + "  {" + NL + "    if (";
  public static final String TEXT_935 = "() >= ";
  public static final String TEXT_936 = "())" + NL + "    {" + NL + "      return null;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      return new ";
  public static final String TEXT_937 = "(";
  public static final String TEXT_938 = ");" + NL + "    }" + NL + "  }";
  public static final String TEXT_939 = NL + NL + "  public boolean ";
  public static final String TEXT_940 = "(";
  public static final String TEXT_941 = " ";
  public static final String TEXT_942 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_943 = NL + "    if (";
  public static final String TEXT_944 = "() >= ";
  public static final String TEXT_945 = "())" + NL + "    {";
  public static final String TEXT_946 = NL + "      return wasAdded;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_947 = " ";
  public static final String TEXT_948 = " = ";
  public static final String TEXT_949 = ".";
  public static final String TEXT_950 = "();" + NL + "    boolean ";
  public static final String TEXT_951 = " = ";
  public static final String TEXT_952 = " != null && !";
  public static final String TEXT_953 = ".equals(";
  public static final String TEXT_954 = ");" + NL + NL + "    if (";
  public static final String TEXT_955 = " && ";
  public static final String TEXT_956 = ".";
  public static final String TEXT_957 = "() <= ";
  public static final String TEXT_958 = "())" + NL + "    {";
  public static final String TEXT_959 = NL + "      return wasAdded;" + NL + "    }";
  public static final String TEXT_960 = NL + NL + "    if (";
  public static final String TEXT_961 = ")" + NL + "    {" + NL + "      ";
  public static final String TEXT_962 = ".";
  public static final String TEXT_963 = "(";
  public static final String TEXT_964 = ");" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      ";
  public static final String TEXT_965 = ".add(";
  public static final String TEXT_966 = ");" + NL + "    }";
  public static final String TEXT_967 = NL + "    wasAdded = true;";
  public static final String TEXT_968 = NL + "    return wasAdded;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_969 = "(";
  public static final String TEXT_970 = " ";
  public static final String TEXT_971 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_972 = NL + "    //Unable to remove ";
  public static final String TEXT_973 = ", as it must always have a ";
  public static final String TEXT_974 = NL + "    if (";
  public static final String TEXT_975 = ".equals(";
  public static final String TEXT_976 = ".";
  public static final String TEXT_977 = "()))" + NL + "    {";
  public static final String TEXT_978 = NL + "      return wasRemoved;" + NL + "    }" + NL + NL + "    //";
  public static final String TEXT_979 = " already at minimum (";
  public static final String TEXT_980 = ")" + NL + "    if (";
  public static final String TEXT_981 = "() <= ";
  public static final String TEXT_982 = "())" + NL + "    {";
  public static final String TEXT_983 = NL + "      return wasRemoved;" + NL + "    }";
  public static final String TEXT_984 = NL + "    ";
  public static final String TEXT_985 = ".remove(";
  public static final String TEXT_986 = ");";
  public static final String TEXT_987 = NL + "    wasRemoved = true;";
  public static final String TEXT_988 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_989 = "  /* Code from template association_AddOptionalNToOne */" + NL;
  public static final String TEXT_990 = "  public ";
  public static final String TEXT_991 = " ";
  public static final String TEXT_992 = "(";
  public static final String TEXT_993 = ")" + NL + "  {" + NL + "    if (";
  public static final String TEXT_994 = "() >= ";
  public static final String TEXT_995 = "())" + NL + "    {" + NL + "      return null;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      return new ";
  public static final String TEXT_996 = "(";
  public static final String TEXT_997 = ");" + NL + "    }" + NL + "  }";
  public static final String TEXT_998 = NL + NL + "  public boolean ";
  public static final String TEXT_999 = "(";
  public static final String TEXT_1000 = " ";
  public static final String TEXT_1001 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_1002 = NL + "    if (";
  public static final String TEXT_1003 = "() >= ";
  public static final String TEXT_1004 = "())" + NL + "    {";
  public static final String TEXT_1005 = NL + "      return wasAdded;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_1006 = " ";
  public static final String TEXT_1007 = " = ";
  public static final String TEXT_1008 = ".";
  public static final String TEXT_1009 = "();" + NL + "    boolean ";
  public static final String TEXT_1010 = " = ";
  public static final String TEXT_1011 = " != null && !this.equals(";
  public static final String TEXT_1012 = ");";
  public static final String TEXT_1013 = NL + "    if (";
  public static final String TEXT_1014 = ")" + NL + "    {" + NL + "      ";
  public static final String TEXT_1015 = ".";
  public static final String TEXT_1016 = "(";
  public static final String TEXT_1017 = ");" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      ";
  public static final String TEXT_1018 = ".add(";
  public static final String TEXT_1019 = ");" + NL + "    }";
  public static final String TEXT_1020 = NL + "    wasAdded = true;";
  public static final String TEXT_1021 = NL + "    return wasAdded;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_1022 = "(";
  public static final String TEXT_1023 = " ";
  public static final String TEXT_1024 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_1025 = NL + "    //Unable to remove ";
  public static final String TEXT_1026 = ", as it must always have a ";
  public static final String TEXT_1027 = NL + "    if (!this.equals(";
  public static final String TEXT_1028 = ".";
  public static final String TEXT_1029 = "()))" + NL + "    {" + NL + "      ";
  public static final String TEXT_1030 = ".remove(";
  public static final String TEXT_1031 = ");" + NL + "      wasRemoved = true;" + NL + "    }";
  public static final String TEXT_1032 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_1033 = "  /* Code from template association_SetOptionalNToMany */" + NL;
  public static final String TEXT_1034 = "  public boolean ";
  public static final String TEXT_1035 = "(";
  public static final String TEXT_1036 = "... ";
  public static final String TEXT_1037 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_1038 = NL + "    ArrayList<";
  public static final String TEXT_1039 = "> ";
  public static final String TEXT_1040 = " = new ArrayList<";
  public static final String TEXT_1041 = ">();" + NL + "    for (";
  public static final String TEXT_1042 = " ";
  public static final String TEXT_1043 = " : ";
  public static final String TEXT_1044 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_1045 = ".contains(";
  public static final String TEXT_1046 = "))" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      ";
  public static final String TEXT_1047 = ".add(";
  public static final String TEXT_1048 = ");" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_1049 = ".size() != ";
  public static final String TEXT_1050 = ".length || ";
  public static final String TEXT_1051 = ".size() > ";
  public static final String TEXT_1052 = "())" + NL + "    {";
  public static final String TEXT_1053 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ArrayList<";
  public static final String TEXT_1054 = "> ";
  public static final String TEXT_1055 = " = new ArrayList<";
  public static final String TEXT_1056 = ">(";
  public static final String TEXT_1057 = ");" + NL + "    ";
  public static final String TEXT_1058 = ".clear();" + NL + "    for (";
  public static final String TEXT_1059 = " ";
  public static final String TEXT_1060 = " : ";
  public static final String TEXT_1061 = ")" + NL + "    {" + NL + "      ";
  public static final String TEXT_1062 = ".add(";
  public static final String TEXT_1063 = ");" + NL + "      if (";
  public static final String TEXT_1064 = ".contains(";
  public static final String TEXT_1065 = "))" + NL + "      {" + NL + "        ";
  public static final String TEXT_1066 = ".remove(";
  public static final String TEXT_1067 = ");" + NL + "      }" + NL + "      else" + NL + "      {" + NL + "        ";
  public static final String TEXT_1068 = ".";
  public static final String TEXT_1069 = "(";
  public static final String TEXT_1070 = ");" + NL + "      }" + NL + "    }" + NL + NL + "    for (";
  public static final String TEXT_1071 = " ";
  public static final String TEXT_1072 = " : ";
  public static final String TEXT_1073 = ")" + NL + "    {" + NL + "      ";
  public static final String TEXT_1074 = ".";
  public static final String TEXT_1075 = "(";
  public static final String TEXT_1076 = ");" + NL + "    }" + NL + "    wasSet = true;";
  public static final String TEXT_1077 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1078 = "  /* Code from template association_AddManyToOne */" + NL;
  public static final String TEXT_1079 = "";
  public static final String TEXT_1080 = "  public ";
  public static final String TEXT_1081 = " ";
  public static final String TEXT_1082 = "(";
  public static final String TEXT_1083 = ")" + NL + "  {" + NL + "    return new ";
  public static final String TEXT_1084 = "(";
  public static final String TEXT_1085 = ");" + NL + "  }";
  public static final String TEXT_1086 = NL + NL + "  public boolean ";
  public static final String TEXT_1087 = "(";
  public static final String TEXT_1088 = " ";
  public static final String TEXT_1089 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_1090 = NL + "    ";
  public static final String TEXT_1091 = " ";
  public static final String TEXT_1092 = " = ";
  public static final String TEXT_1093 = ".";
  public static final String TEXT_1094 = "();" + NL + "    boolean ";
  public static final String TEXT_1095 = " = ";
  public static final String TEXT_1096 = " != null && !";
  public static final String TEXT_1097 = ".equals(";
  public static final String TEXT_1098 = ");";
  public static final String TEXT_1099 = NL + "    if (";
  public static final String TEXT_1100 = ")" + NL + "    {" + NL + "      ";
  public static final String TEXT_1101 = ".";
  public static final String TEXT_1102 = "(";
  public static final String TEXT_1103 = ");" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      ";
  public static final String TEXT_1104 = ".add(";
  public static final String TEXT_1105 = ");" + NL + "    }";
  public static final String TEXT_1106 = NL + "    wasAdded = true;";
  public static final String TEXT_1107 = NL + "    return wasAdded;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_1108 = "(";
  public static final String TEXT_1109 = " ";
  public static final String TEXT_1110 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_1111 = NL + "    //Unable to remove ";
  public static final String TEXT_1112 = ", as it must always have a ";
  public static final String TEXT_1113 = NL + "    if (!";
  public static final String TEXT_1114 = ".equals(";
  public static final String TEXT_1115 = ".";
  public static final String TEXT_1116 = "()))" + NL + "    {";
  public static final String TEXT_1117 = NL + "      ";
  public static final String TEXT_1118 = ".remove(";
  public static final String TEXT_1119 = ");";
  public static final String TEXT_1120 = NL + "      wasRemoved = true;" + NL + "    }";
  public static final String TEXT_1121 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_1122 = "  /* Code from template association_SetOptionalOneToOptionalOne */" + NL;
  public static final String TEXT_1123 = "  public boolean ";
  public static final String TEXT_1124 = "(";
  public static final String TEXT_1125 = " ";
  public static final String TEXT_1126 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_1127 = NL + "    if (";
  public static final String TEXT_1128 = " == null)" + NL + "    {" + NL + "      ";
  public static final String TEXT_1129 = " ";
  public static final String TEXT_1130 = " = ";
  public static final String TEXT_1131 = ";" + NL + "      ";
  public static final String TEXT_1132 = " = null;" + NL + "      " + NL + "      if (";
  public static final String TEXT_1133 = " != null && ";
  public static final String TEXT_1134 = ".";
  public static final String TEXT_1135 = "() != null)" + NL + "      {" + NL + "        ";
  public static final String TEXT_1136 = ".";
  public static final String TEXT_1137 = "(null);" + NL + "      }" + NL + "      wasSet = true;";
  public static final String TEXT_1138 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_1139 = " ";
  public static final String TEXT_1140 = " = ";
  public static final String TEXT_1141 = "();" + NL + "    if (";
  public static final String TEXT_1142 = " != null && !";
  public static final String TEXT_1143 = ".equals(";
  public static final String TEXT_1144 = "))" + NL + "    {" + NL + "      ";
  public static final String TEXT_1145 = ".";
  public static final String TEXT_1146 = "(null);" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_1147 = " = ";
  public static final String TEXT_1148 = ";" + NL + "    ";
  public static final String TEXT_1149 = " ";
  public static final String TEXT_1150 = " = ";
  public static final String TEXT_1151 = ".";
  public static final String TEXT_1152 = "();" + NL + NL + "    if (!equals(";
  public static final String TEXT_1153 = "))" + NL + "    {" + NL + "      ";
  public static final String TEXT_1154 = ".";
  public static final String TEXT_1155 = "(";
  public static final String TEXT_1156 = ");" + NL + "    }" + NL + "    wasSet = true;";
  public static final String TEXT_1157 = "";
  public static final String TEXT_1158 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1159 = "  /* Code from template association_AddMNToMany */" + NL;
  public static final String TEXT_1160 = "  public boolean ";
  public static final String TEXT_1161 = "(";
  public static final String TEXT_1162 = " ";
  public static final String TEXT_1163 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_1164 = NL + "    if (!";
  public static final String TEXT_1165 = ".contains(";
  public static final String TEXT_1166 = "))" + NL + "    {";
  public static final String TEXT_1167 = NL + "      return wasRemoved;" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_1168 = "() <= ";
  public static final String TEXT_1169 = "())" + NL + "    {";
  public static final String TEXT_1170 = NL + "      return wasRemoved;" + NL + "    }" + NL + NL + "    int oldIndex = ";
  public static final String TEXT_1171 = ".indexOf(";
  public static final String TEXT_1172 = ");";
  public static final String TEXT_1173 = NL + "    ";
  public static final String TEXT_1174 = ".remove(oldIndex);";
  public static final String TEXT_1175 = NL + "    if (";
  public static final String TEXT_1176 = ".";
  public static final String TEXT_1177 = "(";
  public static final String TEXT_1178 = ") == -1)" + NL + "    {" + NL + "      wasRemoved = true;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      wasRemoved = ";
  public static final String TEXT_1179 = ".";
  public static final String TEXT_1180 = "(";
  public static final String TEXT_1181 = ");" + NL + "      if (!wasRemoved)" + NL + "      {" + NL + "        ";
  public static final String TEXT_1182 = ".add(oldIndex,";
  public static final String TEXT_1183 = ");" + NL + "      }" + NL + "    }";
  public static final String TEXT_1184 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_1185 = "  /* Code from template association_AddMStarToMany */" + NL;
  public static final String TEXT_1186 = "  public boolean ";
  public static final String TEXT_1187 = "(";
  public static final String TEXT_1188 = " ";
  public static final String TEXT_1189 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_1190 = NL + "    if (!";
  public static final String TEXT_1191 = ".contains(";
  public static final String TEXT_1192 = "))" + NL + "    {";
  public static final String TEXT_1193 = NL + "      return wasRemoved;" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_1194 = "() <= ";
  public static final String TEXT_1195 = "())" + NL + "    {";
  public static final String TEXT_1196 = NL + "      return wasRemoved;" + NL + "    }" + NL + NL + "    int oldIndex = ";
  public static final String TEXT_1197 = ".indexOf(";
  public static final String TEXT_1198 = ");";
  public static final String TEXT_1199 = NL + "    ";
  public static final String TEXT_1200 = ".remove(oldIndex);";
  public static final String TEXT_1201 = NL + "    if (";
  public static final String TEXT_1202 = ".";
  public static final String TEXT_1203 = "(";
  public static final String TEXT_1204 = ") == -1)" + NL + "    {" + NL + "      wasRemoved = true;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      wasRemoved = ";
  public static final String TEXT_1205 = ".";
  public static final String TEXT_1206 = "(";
  public static final String TEXT_1207 = ");" + NL + "      if (!wasRemoved)" + NL + "      {" + NL + "        ";
  public static final String TEXT_1208 = ".add(oldIndex,";
  public static final String TEXT_1209 = ");" + NL + "      }" + NL + "    }";
  public static final String TEXT_1210 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_1211 = "  /* Code from template association_SetOptionalOneToOptionalN */" + NL;
  public static final String TEXT_1212 = "  public boolean ";
  public static final String TEXT_1213 = "(";
  public static final String TEXT_1214 = " ";
  public static final String TEXT_1215 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_1216 = NL + "    if (";
  public static final String TEXT_1217 = " != null && ";
  public static final String TEXT_1218 = ".";
  public static final String TEXT_1219 = "() >= ";
  public static final String TEXT_1220 = ".";
  public static final String TEXT_1221 = "())" + NL + "    {";
  public static final String TEXT_1222 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_1223 = " ";
  public static final String TEXT_1224 = " = ";
  public static final String TEXT_1225 = ";" + NL + "    ";
  public static final String TEXT_1226 = " = ";
  public static final String TEXT_1227 = ";" + NL + "    if (";
  public static final String TEXT_1228 = " != null && !";
  public static final String TEXT_1229 = ".equals(";
  public static final String TEXT_1230 = "))" + NL + "    {" + NL + "      ";
  public static final String TEXT_1231 = ".";
  public static final String TEXT_1232 = "(";
  public static final String TEXT_1233 = ");" + NL + "    }" + NL + "    if (";
  public static final String TEXT_1234 = " != null)" + NL + "    {" + NL + "      ";
  public static final String TEXT_1235 = ".";
  public static final String TEXT_1236 = "(";
  public static final String TEXT_1237 = ");" + NL + "    }" + NL + "    wasSet = true;";
  public static final String TEXT_1238 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1239 = "  /* Code from template association_SetOneToMany */" + NL;
  public static final String TEXT_1240 = "  public boolean ";
  public static final String TEXT_1241 = "(";
  public static final String TEXT_1242 = " ";
  public static final String TEXT_1243 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_1244 = NL + "    if (";
  public static final String TEXT_1245 = " == null)" + NL + "    {";
  public static final String TEXT_1246 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_1247 = " ";
  public static final String TEXT_1248 = " = ";
  public static final String TEXT_1249 = ";" + NL + "    ";
  public static final String TEXT_1250 = " = ";
  public static final String TEXT_1251 = ";" + NL + "    if (";
  public static final String TEXT_1252 = " != null && !";
  public static final String TEXT_1253 = ".equals(";
  public static final String TEXT_1254 = "))" + NL + "    {" + NL + "      ";
  public static final String TEXT_1255 = ".";
  public static final String TEXT_1256 = "(";
  public static final String TEXT_1257 = ");" + NL + "    }" + NL + "    ";
  public static final String TEXT_1258 = ".";
  public static final String TEXT_1259 = "(";
  public static final String TEXT_1260 = ");" + NL + "    wasSet = true;";
  public static final String TEXT_1261 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1262 = "  /* Code from template association_SetOneToManyAssociationClass */" + NL;
  public static final String TEXT_1263 = "  public boolean ";
  public static final String TEXT_1264 = "(";
  public static final String TEXT_1265 = " ";
  public static final String TEXT_1266 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_1267 = NL + "    if (";
  public static final String TEXT_1268 = " == null)" + NL + "    {";
  public static final String TEXT_1269 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_1270 = " ";
  public static final String TEXT_1271 = " = ";
  public static final String TEXT_1272 = ";" + NL + "    ";
  public static final String TEXT_1273 = " = ";
  public static final String TEXT_1274 = ";" + NL + "    if (";
  public static final String TEXT_1275 = " != null && !";
  public static final String TEXT_1276 = ".equals(";
  public static final String TEXT_1277 = "))" + NL + "    {" + NL + "      ";
  public static final String TEXT_1278 = ".";
  public static final String TEXT_1279 = "(";
  public static final String TEXT_1280 = ");" + NL + "    }" + NL + "    if (!";
  public static final String TEXT_1281 = ".";
  public static final String TEXT_1282 = "(";
  public static final String TEXT_1283 = "))" + NL + "    {" + NL + "      ";
  public static final String TEXT_1284 = " = ";
  public static final String TEXT_1285 = ";" + NL + "      wasSet = false;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      wasSet = true;" + NL + "    }";
  public static final String TEXT_1286 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1287 = "  /* Code from template association_SetOneToAtMostN */" + NL;
  public static final String TEXT_1288 = "  public boolean ";
  public static final String TEXT_1289 = "(";
  public static final String TEXT_1290 = " ";
  public static final String TEXT_1291 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_1292 = NL + "    //Must provide ";
  public static final String TEXT_1293 = " to ";
  public static final String TEXT_1294 = NL + "    if (";
  public static final String TEXT_1295 = " == null)" + NL + "    {";
  public static final String TEXT_1296 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    //";
  public static final String TEXT_1297 = " already at maximum (";
  public static final String TEXT_1298 = ")" + NL + "    if (";
  public static final String TEXT_1299 = ".";
  public static final String TEXT_1300 = "() >= ";
  public static final String TEXT_1301 = ".";
  public static final String TEXT_1302 = "())" + NL + "    {";
  public static final String TEXT_1303 = NL + "      return wasSet;" + NL + "    }" + NL + "    " + NL + "    ";
  public static final String TEXT_1304 = " ";
  public static final String TEXT_1305 = " = ";
  public static final String TEXT_1306 = ";" + NL + "    ";
  public static final String TEXT_1307 = " = ";
  public static final String TEXT_1308 = ";" + NL + "    if (";
  public static final String TEXT_1309 = " != null && !";
  public static final String TEXT_1310 = ".equals(";
  public static final String TEXT_1311 = "))" + NL + "    {" + NL + "      boolean didRemove = ";
  public static final String TEXT_1312 = ".";
  public static final String TEXT_1313 = "(";
  public static final String TEXT_1314 = ");" + NL + "      if (!didRemove)" + NL + "      {" + NL + "        ";
  public static final String TEXT_1315 = " = ";
  public static final String TEXT_1316 = ";";
  public static final String TEXT_1317 = NL + "        return wasSet;" + NL + "      }" + NL + "    }" + NL + "    ";
  public static final String TEXT_1318 = ".";
  public static final String TEXT_1319 = "(";
  public static final String TEXT_1320 = ");" + NL + "    wasSet = true;";
  public static final String TEXT_1321 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1322 = "  /* Code from template association_SetOneToMandatoryMany */" + NL;
  public static final String TEXT_1323 = "  public boolean ";
  public static final String TEXT_1324 = "(";
  public static final String TEXT_1325 = " ";
  public static final String TEXT_1326 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_1327 = NL + "    //Must provide ";
  public static final String TEXT_1328 = " to ";
  public static final String TEXT_1329 = NL + "    if (";
  public static final String TEXT_1330 = " == null)" + NL + "    {";
  public static final String TEXT_1331 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_1332 = " != null && ";
  public static final String TEXT_1333 = ".";
  public static final String TEXT_1334 = "() <= ";
  public static final String TEXT_1335 = ".";
  public static final String TEXT_1336 = "())" + NL + "    {";
  public static final String TEXT_1337 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_1338 = " ";
  public static final String TEXT_1339 = " = ";
  public static final String TEXT_1340 = ";" + NL + "    ";
  public static final String TEXT_1341 = " = ";
  public static final String TEXT_1342 = ";" + NL + "    if (";
  public static final String TEXT_1343 = " != null && !";
  public static final String TEXT_1344 = ".equals(";
  public static final String TEXT_1345 = "))" + NL + "    {" + NL + "      boolean didRemove = ";
  public static final String TEXT_1346 = ".";
  public static final String TEXT_1347 = "(";
  public static final String TEXT_1348 = ");" + NL + "      if (!didRemove)" + NL + "      {" + NL + "        ";
  public static final String TEXT_1349 = " = ";
  public static final String TEXT_1350 = ";";
  public static final String TEXT_1351 = NL + "        return wasSet;" + NL + "      }" + NL + "    }" + NL + "    ";
  public static final String TEXT_1352 = ".";
  public static final String TEXT_1353 = "(";
  public static final String TEXT_1354 = ");" + NL + "    wasSet = true;";
  public static final String TEXT_1355 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1356 = "  /* Code from template association_AddManyToOptionalOne */" + NL;
  public static final String TEXT_1357 = "  public boolean ";
  public static final String TEXT_1358 = "(";
  public static final String TEXT_1359 = " ";
  public static final String TEXT_1360 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_1361 = NL + "    ";
  public static final String TEXT_1362 = " ";
  public static final String TEXT_1363 = " = ";
  public static final String TEXT_1364 = ".";
  public static final String TEXT_1365 = "();";
  public static final String TEXT_1366 = NL + "    if (";
  public static final String TEXT_1367 = " == null)" + NL + "    {" + NL + "      ";
  public static final String TEXT_1368 = ".";
  public static final String TEXT_1369 = "(";
  public static final String TEXT_1370 = ");" + NL + "    }" + NL + "    else if (!";
  public static final String TEXT_1371 = ".equals(";
  public static final String TEXT_1372 = "))" + NL + "    {" + NL + "      ";
  public static final String TEXT_1373 = ".";
  public static final String TEXT_1374 = "(";
  public static final String TEXT_1375 = ");" + NL + "      ";
  public static final String TEXT_1376 = "(";
  public static final String TEXT_1377 = ");" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      ";
  public static final String TEXT_1378 = ".add(";
  public static final String TEXT_1379 = ");" + NL + "    }";
  public static final String TEXT_1380 = NL + "    wasAdded = true;";
  public static final String TEXT_1381 = NL + "    return wasAdded;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_1382 = "(";
  public static final String TEXT_1383 = " ";
  public static final String TEXT_1384 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_1385 = NL + "    if (";
  public static final String TEXT_1386 = ".contains(";
  public static final String TEXT_1387 = "))" + NL + "    {";
  public static final String TEXT_1388 = NL + "      ";
  public static final String TEXT_1389 = ".remove(";
  public static final String TEXT_1390 = ");" + NL + "      ";
  public static final String TEXT_1391 = ".";
  public static final String TEXT_1392 = "(null);" + NL + "      wasRemoved = true;";
  public static final String TEXT_1393 = NL + "    }";
  public static final String TEXT_1394 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_1395 = "  /* Code from template association_SetOptionalOneToMany */" + NL;
  public static final String TEXT_1396 = "  public boolean ";
  public static final String TEXT_1397 = "(";
  public static final String TEXT_1398 = " ";
  public static final String TEXT_1399 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_1400 = NL + "    ";
  public static final String TEXT_1401 = " ";
  public static final String TEXT_1402 = " = ";
  public static final String TEXT_1403 = ";" + NL + "    ";
  public static final String TEXT_1404 = " = ";
  public static final String TEXT_1405 = ";" + NL + "    if (";
  public static final String TEXT_1406 = " != null && !";
  public static final String TEXT_1407 = ".equals(";
  public static final String TEXT_1408 = "))" + NL + "    {" + NL + "      ";
  public static final String TEXT_1409 = ".";
  public static final String TEXT_1410 = "(";
  public static final String TEXT_1411 = ");" + NL + "    }" + NL + "    if (";
  public static final String TEXT_1412 = " != null)" + NL + "    {" + NL + "      ";
  public static final String TEXT_1413 = ".";
  public static final String TEXT_1414 = "(";
  public static final String TEXT_1415 = ");" + NL + "    }" + NL + "    wasSet = true;";
  public static final String TEXT_1416 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1417 = "  /* Code from template association_AddOptionalNToOptionalOne */" + NL;
  public static final String TEXT_1418 = "  public boolean ";
  public static final String TEXT_1419 = "(";
  public static final String TEXT_1420 = " ";
  public static final String TEXT_1421 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_1422 = NL + "    if (";
  public static final String TEXT_1423 = "() >= ";
  public static final String TEXT_1424 = "())" + NL + "    {";
  public static final String TEXT_1425 = NL + "      return wasAdded;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_1426 = " ";
  public static final String TEXT_1427 = " = ";
  public static final String TEXT_1428 = ".";
  public static final String TEXT_1429 = "();";
  public static final String TEXT_1430 = NL + "    if (";
  public static final String TEXT_1431 = " == null)" + NL + "    {" + NL + "      ";
  public static final String TEXT_1432 = ".";
  public static final String TEXT_1433 = "(this);" + NL + "    }" + NL + "    else if (!this.equals(";
  public static final String TEXT_1434 = "))" + NL + "    {" + NL + "      ";
  public static final String TEXT_1435 = ".";
  public static final String TEXT_1436 = "(";
  public static final String TEXT_1437 = ");" + NL + "      ";
  public static final String TEXT_1438 = "(";
  public static final String TEXT_1439 = ");" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      ";
  public static final String TEXT_1440 = ".add(";
  public static final String TEXT_1441 = ");" + NL + "    }";
  public static final String TEXT_1442 = NL + "    wasAdded = true;";
  public static final String TEXT_1443 = NL + "    return wasAdded;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_1444 = "(";
  public static final String TEXT_1445 = " ";
  public static final String TEXT_1446 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_1447 = NL + "    if (";
  public static final String TEXT_1448 = ".contains(";
  public static final String TEXT_1449 = "))" + NL + "    {";
  public static final String TEXT_1450 = NL + "      ";
  public static final String TEXT_1451 = ".remove(";
  public static final String TEXT_1452 = ");";
  public static final String TEXT_1453 = NL + "      ";
  public static final String TEXT_1454 = ".";
  public static final String TEXT_1455 = "(null);" + NL + "      wasRemoved = true;" + NL + "    }";
  public static final String TEXT_1456 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_1457 = "  /* Code from template association_AddUnidirectionalMN */" + NL;
  public static final String TEXT_1458 = "  public boolean ";
  public static final String TEXT_1459 = "(";
  public static final String TEXT_1460 = " ";
  public static final String TEXT_1461 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_1462 = NL + "    if (";
  public static final String TEXT_1463 = "() < ";
  public static final String TEXT_1464 = "())" + NL + "    {";
  public static final String TEXT_1465 = NL + "      ";
  public static final String TEXT_1466 = ".add(";
  public static final String TEXT_1467 = ");";
  public static final String TEXT_1468 = NL + "      wasAdded = true;" + NL + "    }";
  public static final String TEXT_1469 = NL + "    return wasAdded;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_1470 = "(";
  public static final String TEXT_1471 = " ";
  public static final String TEXT_1472 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_1473 = NL + "    if (!";
  public static final String TEXT_1474 = ".contains(";
  public static final String TEXT_1475 = "))" + NL + "    {";
  public static final String TEXT_1476 = NL + "      return wasRemoved;" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_1477 = "() <= ";
  public static final String TEXT_1478 = "())" + NL + "    {";
  public static final String TEXT_1479 = NL + "      return wasRemoved;" + NL + "    }";
  public static final String TEXT_1480 = NL + NL + "    ";
  public static final String TEXT_1481 = ".remove(";
  public static final String TEXT_1482 = ");";
  public static final String TEXT_1483 = NL + "    wasRemoved = true;";
  public static final String TEXT_1484 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_1485 = "  /* Code from template association_AddMNToOptionalOne */" + NL;
  public static final String TEXT_1486 = "  public boolean ";
  public static final String TEXT_1487 = "(";
  public static final String TEXT_1488 = " ";
  public static final String TEXT_1489 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_1490 = "";
  public static final String TEXT_1491 = NL + "    if (";
  public static final String TEXT_1492 = "() >= ";
  public static final String TEXT_1493 = "())" + NL + "    {";
  public static final String TEXT_1494 = NL + "      return wasAdded;" + NL + "    }";
  public static final String TEXT_1495 = NL + "    ";
  public static final String TEXT_1496 = " ";
  public static final String TEXT_1497 = " = ";
  public static final String TEXT_1498 = ".";
  public static final String TEXT_1499 = "();" + NL + "    if (";
  public static final String TEXT_1500 = " != null && ";
  public static final String TEXT_1501 = ".";
  public static final String TEXT_1502 = "() <= ";
  public static final String TEXT_1503 = "())" + NL + "    {";
  public static final String TEXT_1504 = NL + "      return wasAdded;" + NL + "    }" + NL + "    else if (";
  public static final String TEXT_1505 = " != null)" + NL + "    {" + NL + "      ";
  public static final String TEXT_1506 = ".";
  public static final String TEXT_1507 = ".remove(";
  public static final String TEXT_1508 = ");" + NL + "    }";
  public static final String TEXT_1509 = NL + "    ";
  public static final String TEXT_1510 = ".add(";
  public static final String TEXT_1511 = ");";
  public static final String TEXT_1512 = NL + "    ";
  public static final String TEXT_1513 = "(";
  public static final String TEXT_1514 = ",";
  public static final String TEXT_1515 = ");" + NL + "    wasAdded = true;";
  public static final String TEXT_1516 = NL + "    return wasAdded;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_1517 = "(";
  public static final String TEXT_1518 = " ";
  public static final String TEXT_1519 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_1520 = NL + "    if (";
  public static final String TEXT_1521 = ".contains(";
  public static final String TEXT_1522 = ") && ";
  public static final String TEXT_1523 = "() > ";
  public static final String TEXT_1524 = "())" + NL + "    {";
  public static final String TEXT_1525 = NL + "      ";
  public static final String TEXT_1526 = ".remove(";
  public static final String TEXT_1527 = ");";
  public static final String TEXT_1528 = NL + "      ";
  public static final String TEXT_1529 = "(";
  public static final String TEXT_1530 = ",null);" + NL + "      wasRemoved = true;" + NL + "    }";
  public static final String TEXT_1531 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_1532 = "  /* Code from template association_SetNToOptionalOne */" + NL;
  public static final String TEXT_1533 = "  public boolean ";
  public static final String TEXT_1534 = "(";
  public static final String TEXT_1535 = "... ";
  public static final String TEXT_1536 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_1537 = NL + "    ArrayList<";
  public static final String TEXT_1538 = "> ";
  public static final String TEXT_1539 = " = new ArrayList<";
  public static final String TEXT_1540 = ">();" + NL + "    for (";
  public static final String TEXT_1541 = " ";
  public static final String TEXT_1542 = " : ";
  public static final String TEXT_1543 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_1544 = ".contains(";
  public static final String TEXT_1545 = "))" + NL + "      {";
  public static final String TEXT_1546 = NL + "        return wasSet;" + NL + "      }" + NL + "      else if (";
  public static final String TEXT_1547 = ".";
  public static final String TEXT_1548 = "() != null && !this.equals(";
  public static final String TEXT_1549 = ".";
  public static final String TEXT_1550 = "()))" + NL + "      {";
  public static final String TEXT_1551 = NL + "        return wasSet;" + NL + "      }" + NL + "      ";
  public static final String TEXT_1552 = ".add(";
  public static final String TEXT_1553 = ");" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_1554 = ".size() != ";
  public static final String TEXT_1555 = "())" + NL + "    {";
  public static final String TEXT_1556 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_1557 = ".removeAll(";
  public static final String TEXT_1558 = ");" + NL + "    " + NL + "    for (";
  public static final String TEXT_1559 = " orphan : ";
  public static final String TEXT_1560 = ")" + NL + "    {" + NL + "      ";
  public static final String TEXT_1561 = "(orphan, null);" + NL + "    }" + NL + "    ";
  public static final String TEXT_1562 = ".clear();" + NL + "    for (";
  public static final String TEXT_1563 = " ";
  public static final String TEXT_1564 = " : ";
  public static final String TEXT_1565 = ")" + NL + "    {" + NL + "      ";
  public static final String TEXT_1566 = "(";
  public static final String TEXT_1567 = ", this);" + NL + "      ";
  public static final String TEXT_1568 = ".add(";
  public static final String TEXT_1569 = ");" + NL + "    }" + NL + "    wasSet = true;";
  public static final String TEXT_1570 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1571 = "  /* Code from template association_GetPrivate */" + NL;
  public static final String TEXT_1572 = "  private void ";
  public static final String TEXT_1573 = "(";
  public static final String TEXT_1574 = " ";
  public static final String TEXT_1575 = ", ";
  public static final String TEXT_1576 = " ";
  public static final String TEXT_1577 = ")" + NL + "  {" + NL + "    try" + NL + "    {" + NL + "      java.lang.reflect.Field mentorField = ";
  public static final String TEXT_1578 = ".getClass().getDeclaredField(\"";
  public static final String TEXT_1579 = "\");" + NL + "      mentorField.setAccessible(true);" + NL + "      mentorField.set(";
  public static final String TEXT_1580 = ", ";
  public static final String TEXT_1581 = ");" + NL + "    }" + NL + "    catch (Exception e)" + NL + "    {" + NL + "      throw new RuntimeException(\"Issue internally setting ";
  public static final String TEXT_1582 = " to ";
  public static final String TEXT_1583 = "\", e);" + NL + "    }" + NL + "  }" + NL;
  public static final String TEXT_1584 = "  /* Code from template association_AddUnidirectionalMany */" + NL;
  public static final String TEXT_1585 = "  public boolean ";
  public static final String TEXT_1586 = "(";
  public static final String TEXT_1587 = " ";
  public static final String TEXT_1588 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_1589 = NL + "    ";
  public static final String TEXT_1590 = ".add(";
  public static final String TEXT_1591 = ");";
  public static final String TEXT_1592 = NL + "    wasAdded = true;";
  public static final String TEXT_1593 = NL + "    return wasAdded;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_1594 = "(";
  public static final String TEXT_1595 = " ";
  public static final String TEXT_1596 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_1597 = NL + "    if (";
  public static final String TEXT_1598 = ".contains(";
  public static final String TEXT_1599 = "))" + NL + "    {";
  public static final String TEXT_1600 = NL + "      ";
  public static final String TEXT_1601 = ".remove(";
  public static final String TEXT_1602 = ");";
  public static final String TEXT_1603 = NL + "      wasRemoved = true;" + NL + "    }";
  public static final String TEXT_1604 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_1605 = "  /* Code from template association_AddUnidirectionalOptionalN */" + NL;
  public static final String TEXT_1606 = "  public boolean ";
  public static final String TEXT_1607 = "(";
  public static final String TEXT_1608 = " ";
  public static final String TEXT_1609 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_1610 = NL + "    if (";
  public static final String TEXT_1611 = "() < ";
  public static final String TEXT_1612 = "())" + NL + "    {";
  public static final String TEXT_1613 = NL + "      ";
  public static final String TEXT_1614 = ".add(";
  public static final String TEXT_1615 = ");";
  public static final String TEXT_1616 = NL + "      wasAdded = true;" + NL + "    }";
  public static final String TEXT_1617 = NL + "    return wasAdded;" + NL + "  }" + NL;
  public static final String TEXT_1618 = NL + "  public boolean ";
  public static final String TEXT_1619 = "(";
  public static final String TEXT_1620 = " ";
  public static final String TEXT_1621 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_1622 = NL + "    if (";
  public static final String TEXT_1623 = ".contains(";
  public static final String TEXT_1624 = "))" + NL + "    {";
  public static final String TEXT_1625 = NL + "      ";
  public static final String TEXT_1626 = ".remove(";
  public static final String TEXT_1627 = ");";
  public static final String TEXT_1628 = NL + "      wasRemoved = true;" + NL + "    }";
  public static final String TEXT_1629 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_1630 = "  /* Code from template association_AddUnidirectionalMStar */" + NL;
  public static final String TEXT_1631 = "  public boolean ";
  public static final String TEXT_1632 = "(";
  public static final String TEXT_1633 = " ";
  public static final String TEXT_1634 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_1635 = NL + "    ";
  public static final String TEXT_1636 = ".add(";
  public static final String TEXT_1637 = ");";
  public static final String TEXT_1638 = NL + "    wasAdded = true;";
  public static final String TEXT_1639 = NL + "    return wasAdded;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_1640 = "(";
  public static final String TEXT_1641 = " ";
  public static final String TEXT_1642 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_1643 = NL + "    if (!";
  public static final String TEXT_1644 = ".contains(";
  public static final String TEXT_1645 = "))" + NL + "    {";
  public static final String TEXT_1646 = NL + "      return wasRemoved;" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_1647 = "() <= ";
  public static final String TEXT_1648 = "())" + NL + "    {";
  public static final String TEXT_1649 = NL + "      return wasRemoved;" + NL + "    }";
  public static final String TEXT_1650 = NL + NL + "    ";
  public static final String TEXT_1651 = ".remove(";
  public static final String TEXT_1652 = ");";
  public static final String TEXT_1653 = NL + "    wasRemoved = true;";
  public static final String TEXT_1654 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_1655 = "  /* Code from template association_SetUnidirectionalN */";
  public static final String TEXT_1656 = NL + "  ";
  public static final String TEXT_1657 = " boolean ";
  public static final String TEXT_1658 = "(";
  public static final String TEXT_1659 = "... ";
  public static final String TEXT_1660 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_1661 = NL + "    ArrayList<";
  public static final String TEXT_1662 = "> ";
  public static final String TEXT_1663 = " = new ArrayList<";
  public static final String TEXT_1664 = ">();" + NL + "    for (";
  public static final String TEXT_1665 = " ";
  public static final String TEXT_1666 = " : ";
  public static final String TEXT_1667 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_1668 = ".contains(";
  public static final String TEXT_1669 = "))" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      ";
  public static final String TEXT_1670 = ".add(";
  public static final String TEXT_1671 = ");" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_1672 = ".size() != ";
  public static final String TEXT_1673 = ".length || ";
  public static final String TEXT_1674 = ".size() != ";
  public static final String TEXT_1675 = "())" + NL + "    {";
  public static final String TEXT_1676 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_1677 = ".clear();" + NL + "    ";
  public static final String TEXT_1678 = ".addAll(";
  public static final String TEXT_1679 = ");" + NL + "    wasSet = true;";
  public static final String TEXT_1680 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1681 = "  /* Code from template association_SetUnidirectionalMany */";
  public static final String TEXT_1682 = NL + "  ";
  public static final String TEXT_1683 = " boolean ";
  public static final String TEXT_1684 = "(";
  public static final String TEXT_1685 = "... ";
  public static final String TEXT_1686 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_1687 = NL + "    ArrayList<";
  public static final String TEXT_1688 = "> ";
  public static final String TEXT_1689 = " = new ArrayList<";
  public static final String TEXT_1690 = ">();" + NL + "    for (";
  public static final String TEXT_1691 = " ";
  public static final String TEXT_1692 = " : ";
  public static final String TEXT_1693 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_1694 = ".contains(";
  public static final String TEXT_1695 = "))" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      ";
  public static final String TEXT_1696 = ".add(";
  public static final String TEXT_1697 = ");" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_1698 = ".size() != ";
  public static final String TEXT_1699 = ".length)" + NL + "    {";
  public static final String TEXT_1700 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_1701 = ".clear();" + NL + "    ";
  public static final String TEXT_1702 = ".addAll(";
  public static final String TEXT_1703 = ");" + NL + "    wasSet = true;";
  public static final String TEXT_1704 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1705 = "  /* Code from template association_SetOptionalOneToMandatoryMany */" + NL;
  public static final String TEXT_1706 = "  public boolean ";
  public static final String TEXT_1707 = "(";
  public static final String TEXT_1708 = " ";
  public static final String TEXT_1709 = ")" + NL + "  {" + NL + "    //" + NL + "    // This source of this source generation is association_SetOptionalOneToMandatoryMany.jet" + NL + "    // This set file assumes the generation of a maximumNumberOfXXX method does not exist because " + NL + "    // it's not required (No upper bound)" + NL + "    //   " + NL + "    boolean wasSet = false;" + NL + "    ";
  public static final String TEXT_1710 = " ";
  public static final String TEXT_1711 = " = ";
  public static final String TEXT_1712 = ";" + NL + NL + "    if (";
  public static final String TEXT_1713 = " == null)" + NL + "    {" + NL + "      if (";
  public static final String TEXT_1714 = " != null)" + NL + "      {" + NL + "        if (";
  public static final String TEXT_1715 = ".";
  public static final String TEXT_1716 = "(";
  public static final String TEXT_1717 = "))" + NL + "        {" + NL + "          ";
  public static final String TEXT_1718 = " = ";
  public static final String TEXT_1719 = ";" + NL + "          wasSet = true;" + NL + "        }" + NL + "      }" + NL + "    } " + NL + "    else if (";
  public static final String TEXT_1720 = " != null)" + NL + "    {" + NL + "      if (";
  public static final String TEXT_1721 = " == null)" + NL + "      {" + NL + "        if (";
  public static final String TEXT_1722 = ".";
  public static final String TEXT_1723 = "() < ";
  public static final String TEXT_1724 = ".";
  public static final String TEXT_1725 = "())" + NL + "        {" + NL + "          ";
  public static final String TEXT_1726 = ".";
  public static final String TEXT_1727 = "(";
  public static final String TEXT_1728 = ");" + NL + "          ";
  public static final String TEXT_1729 = " = ";
  public static final String TEXT_1730 = ";  // ";
  public static final String TEXT_1731 = " == null" + NL + "          wasSet = true;" + NL + "        }" + NL + "      } " + NL + "      else" + NL + "      {" + NL + "        if (";
  public static final String TEXT_1732 = ".";
  public static final String TEXT_1733 = "() < ";
  public static final String TEXT_1734 = ".";
  public static final String TEXT_1735 = "())" + NL + "        {" + NL + "          ";
  public static final String TEXT_1736 = ".";
  public static final String TEXT_1737 = "(";
  public static final String TEXT_1738 = ");" + NL + "          ";
  public static final String TEXT_1739 = ".";
  public static final String TEXT_1740 = "(";
  public static final String TEXT_1741 = ");" + NL + "          ";
  public static final String TEXT_1742 = " = ";
  public static final String TEXT_1743 = ";" + NL + "          wasSet = true;" + NL + "        }" + NL + "      }" + NL + "    }" + NL + "    if (wasSet)" + NL + "    {" + NL + "      ";
  public static final String TEXT_1744 = " = ";
  public static final String TEXT_1745 = ";" + NL + "    }" + NL + "    return wasSet;" + NL + "  }" + NL + "  ";
  public static final String TEXT_1746 = NL + "//  public boolean ";
  public static final String TEXT_1747 = "(";
  public static final String TEXT_1748 = " ";
  public static final String TEXT_1749 = ")" + NL + "//  {" + NL + "//    //" + NL + "//    // The source of the code generation is association_SetOptionalOneToMN.jet" + NL + "//    // (this) set file assumes the generation of a maximumNumberOfXXX " + NL + "//    //   method ";
  public static final String TEXT_1750 = NL + "//    // Currently this will not compile due to Issue351 - the template code is fine." + NL + "//    //" + NL + "//" + NL + "//    boolean wasSet = false;" + NL + "//    ";
  public static final String TEXT_1751 = " ";
  public static final String TEXT_1752 = " = ";
  public static final String TEXT_1753 = ";" + NL + "//  " + NL + "//    if (";
  public static final String TEXT_1754 = " == null)" + NL + "//    {  " + NL + "//      if (";
  public static final String TEXT_1755 = " != null)" + NL + "//      { " + NL + "//        if (";
  public static final String TEXT_1756 = ".";
  public static final String TEXT_1757 = "(";
  public static final String TEXT_1758 = "))" + NL + "//          ";
  public static final String TEXT_1759 = " = ";
  public static final String TEXT_1760 = ";" + NL + "//          wasSet = true;" + NL + "//        }" + NL + "//      }" + NL + "//    }" + NL + "//    else" + NL + "//    {" + NL + "//      if (";
  public static final String TEXT_1761 = " != null)" + NL + "//      {" + NL + "//        if (";
  public static final String TEXT_1762 = " == null)" + NL + "//        {" + NL + "//          if (";
  public static final String TEXT_1763 = ".";
  public static final String TEXT_1764 = " < ";
  public static final String TEXT_1765 = ".";
  public static final String TEXT_1766 = ")" + NL + "//            ";
  public static final String TEXT_1767 = ".";
  public static final String TEXT_1768 = "(";
  public static final String TEXT_1769 = ");" + NL + "//            ";
  public static final String TEXT_1770 = " = ";
  public static final String TEXT_1771 = "  // ";
  public static final String TEXT_1772 = " == null;" + NL + "//            wasSet = true;" + NL + "//        }" + NL + "//      }" + NL + "//      else" + NL + "//      {" + NL + "//        if (   ";
  public static final String TEXT_1773 = ".";
  public static final String TEXT_1774 = " < ";
  public static final String TEXT_1775 = ".";
  public static final String TEXT_1776 = "()" + NL + "//            && ";
  public static final String TEXT_1777 = ".";
  public static final String TEXT_1778 = " > ";
  public static final String TEXT_1779 = ".";
  public static final String TEXT_1780 = "()" + NL + "//           )" + NL + "//          ";
  public static final String TEXT_1781 = ".";
  public static final String TEXT_1782 = "(";
  public static final String TEXT_1783 = ");" + NL + "//          ";
  public static final String TEXT_1784 = ".";
  public static final String TEXT_1785 = "(";
  public static final String TEXT_1786 = ");" + NL + "//          ";
  public static final String TEXT_1787 = " = ";
  public static final String TEXT_1788 = ";" + NL + "//          wasSet = true;" + NL + "//        }" + NL + "//      }" + NL + "//    }" + NL + "//    " + NL + "//    if (wasSet)" + NL + "//    {" + NL + "//      ";
  public static final String TEXT_1789 = " = ";
  public static final String TEXT_1790 = ";" + NL + "//    }" + NL + "//    " + NL + "//    return wasSet;" + NL + "//  }";
  public static final String TEXT_1791 = "  /* Code from template association_SetMNToMany */" + NL;
  public static final String TEXT_1792 = "  public boolean ";
  public static final String TEXT_1793 = "(";
  public static final String TEXT_1794 = "... ";
  public static final String TEXT_1795 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_1796 = NL + "    ArrayList<";
  public static final String TEXT_1797 = "> ";
  public static final String TEXT_1798 = " = new ArrayList<";
  public static final String TEXT_1799 = ">();" + NL + "    for (";
  public static final String TEXT_1800 = " ";
  public static final String TEXT_1801 = " : ";
  public static final String TEXT_1802 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_1803 = ".contains(";
  public static final String TEXT_1804 = "))" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      ";
  public static final String TEXT_1805 = ".add(";
  public static final String TEXT_1806 = ");" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_1807 = ".size() != ";
  public static final String TEXT_1808 = ".length || ";
  public static final String TEXT_1809 = ".size() < ";
  public static final String TEXT_1810 = "() || ";
  public static final String TEXT_1811 = ".size() > ";
  public static final String TEXT_1812 = "())" + NL + "    {";
  public static final String TEXT_1813 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ArrayList<";
  public static final String TEXT_1814 = "> ";
  public static final String TEXT_1815 = " = new ArrayList<";
  public static final String TEXT_1816 = ">(";
  public static final String TEXT_1817 = ");" + NL + "    ";
  public static final String TEXT_1818 = ".clear();" + NL + "    for (";
  public static final String TEXT_1819 = " ";
  public static final String TEXT_1820 = " : ";
  public static final String TEXT_1821 = ")" + NL + "    {" + NL + "      ";
  public static final String TEXT_1822 = ".add(";
  public static final String TEXT_1823 = ");" + NL + "      if (";
  public static final String TEXT_1824 = ".contains(";
  public static final String TEXT_1825 = "))" + NL + "      {" + NL + "        ";
  public static final String TEXT_1826 = ".remove(";
  public static final String TEXT_1827 = ");" + NL + "      }" + NL + "      else" + NL + "      {" + NL + "        ";
  public static final String TEXT_1828 = ".";
  public static final String TEXT_1829 = "(";
  public static final String TEXT_1830 = ");" + NL + "      }" + NL + "    }" + NL + NL + "    for (";
  public static final String TEXT_1831 = " ";
  public static final String TEXT_1832 = " : ";
  public static final String TEXT_1833 = ")" + NL + "    {" + NL + "      ";
  public static final String TEXT_1834 = ".";
  public static final String TEXT_1835 = "(";
  public static final String TEXT_1836 = ");" + NL + "    }" + NL + "    wasSet = true;";
  public static final String TEXT_1837 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1838 = "  /* Code from template association_SetMStarToMany */" + NL;
  public static final String TEXT_1839 = "  public boolean ";
  public static final String TEXT_1840 = "(";
  public static final String TEXT_1841 = "... ";
  public static final String TEXT_1842 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_1843 = NL + "    ArrayList<";
  public static final String TEXT_1844 = "> ";
  public static final String TEXT_1845 = " = new ArrayList<";
  public static final String TEXT_1846 = ">();" + NL + "    for (";
  public static final String TEXT_1847 = " ";
  public static final String TEXT_1848 = " : ";
  public static final String TEXT_1849 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_1850 = ".contains(";
  public static final String TEXT_1851 = "))" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      ";
  public static final String TEXT_1852 = ".add(";
  public static final String TEXT_1853 = ");" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_1854 = ".size() != ";
  public static final String TEXT_1855 = ".length || ";
  public static final String TEXT_1856 = ".size() < ";
  public static final String TEXT_1857 = "())" + NL + "    {";
  public static final String TEXT_1858 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ArrayList<";
  public static final String TEXT_1859 = "> ";
  public static final String TEXT_1860 = " = new ArrayList<";
  public static final String TEXT_1861 = ">(";
  public static final String TEXT_1862 = ");" + NL + "    ";
  public static final String TEXT_1863 = ".clear();" + NL + "    for (";
  public static final String TEXT_1864 = " ";
  public static final String TEXT_1865 = " : ";
  public static final String TEXT_1866 = ")" + NL + "    {" + NL + "      ";
  public static final String TEXT_1867 = ".add(";
  public static final String TEXT_1868 = ");" + NL + "      if (";
  public static final String TEXT_1869 = ".contains(";
  public static final String TEXT_1870 = "))" + NL + "      {" + NL + "        ";
  public static final String TEXT_1871 = ".remove(";
  public static final String TEXT_1872 = ");" + NL + "      }" + NL + "      else" + NL + "      {" + NL + "        ";
  public static final String TEXT_1873 = ".";
  public static final String TEXT_1874 = "(this);" + NL + "      }" + NL + "    }" + NL + NL + "    for (";
  public static final String TEXT_1875 = " ";
  public static final String TEXT_1876 = " : ";
  public static final String TEXT_1877 = ")" + NL + "    {" + NL + "      ";
  public static final String TEXT_1878 = ".";
  public static final String TEXT_1879 = "(this);" + NL + "    }" + NL + "    wasSet = true;";
  public static final String TEXT_1880 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1881 = "  /* Code from template association_SetUnidirectionalMN */";
  public static final String TEXT_1882 = NL + "  ";
  public static final String TEXT_1883 = " boolean ";
  public static final String TEXT_1884 = "(";
  public static final String TEXT_1885 = "... ";
  public static final String TEXT_1886 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_1887 = NL + "    ArrayList<";
  public static final String TEXT_1888 = "> ";
  public static final String TEXT_1889 = " = new ArrayList<";
  public static final String TEXT_1890 = ">();" + NL + "    for (";
  public static final String TEXT_1891 = " ";
  public static final String TEXT_1892 = " : ";
  public static final String TEXT_1893 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_1894 = ".contains(";
  public static final String TEXT_1895 = "))" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      ";
  public static final String TEXT_1896 = ".add(";
  public static final String TEXT_1897 = ");" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_1898 = ".size() != ";
  public static final String TEXT_1899 = ".length || ";
  public static final String TEXT_1900 = ".size() < ";
  public static final String TEXT_1901 = "() || ";
  public static final String TEXT_1902 = ".size() > ";
  public static final String TEXT_1903 = "())" + NL + "    {";
  public static final String TEXT_1904 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_1905 = ".clear();" + NL + "    ";
  public static final String TEXT_1906 = ".addAll(";
  public static final String TEXT_1907 = ");" + NL + "    wasSet = true;";
  public static final String TEXT_1908 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1909 = "  /* Code from template association_SetMNToOptionalOne */";
  public static final String TEXT_1910 = NL + "  public boolean ";
  public static final String TEXT_1911 = "(";
  public static final String TEXT_1912 = "... ";
  public static final String TEXT_1913 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_1914 = NL + "    if (";
  public static final String TEXT_1915 = ".length < ";
  public static final String TEXT_1916 = "()";
  public static final String TEXT_1917 = ")" + NL + "    {";
  public static final String TEXT_1918 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ArrayList<";
  public static final String TEXT_1919 = "> ";
  public static final String TEXT_1920 = " = new ArrayList<";
  public static final String TEXT_1921 = ">();" + NL + "    HashMap<";
  public static final String TEXT_1922 = ",Integer> ";
  public static final String TEXT_1923 = " = new HashMap<";
  public static final String TEXT_1924 = ",Integer>();" + NL + "    for (";
  public static final String TEXT_1925 = " ";
  public static final String TEXT_1926 = " : ";
  public static final String TEXT_1927 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_1928 = ".contains(";
  public static final String TEXT_1929 = "))" + NL + "      {";
  public static final String TEXT_1930 = NL + "        return wasSet;" + NL + "      }" + NL + "      else if (";
  public static final String TEXT_1931 = ".";
  public static final String TEXT_1932 = "() != null && !this.equals(";
  public static final String TEXT_1933 = ".";
  public static final String TEXT_1934 = "()))" + NL + "      {" + NL + "        ";
  public static final String TEXT_1935 = " ";
  public static final String TEXT_1936 = " = ";
  public static final String TEXT_1937 = ".";
  public static final String TEXT_1938 = "();" + NL + "        if (!";
  public static final String TEXT_1939 = ".containsKey(";
  public static final String TEXT_1940 = "))" + NL + "        {" + NL + "          ";
  public static final String TEXT_1941 = ".put(";
  public static final String TEXT_1942 = ", Integer.valueOf(";
  public static final String TEXT_1943 = ".";
  public static final String TEXT_1944 = "()));" + NL + "        }" + NL + "        Integer currentCount = ";
  public static final String TEXT_1945 = ".get(";
  public static final String TEXT_1946 = ");" + NL + "        int nextCount = currentCount - 1;" + NL + "        if (nextCount < ";
  public static final String TEXT_1947 = ")" + NL + "        {";
  public static final String TEXT_1948 = NL + "          return wasSet;" + NL + "        }" + NL + "        ";
  public static final String TEXT_1949 = ".put(";
  public static final String TEXT_1950 = ", Integer.valueOf(nextCount));" + NL + "      }" + NL + "      ";
  public static final String TEXT_1951 = ".add(";
  public static final String TEXT_1952 = ");" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_1953 = ".removeAll(";
  public static final String TEXT_1954 = ");" + NL + NL + "    for (";
  public static final String TEXT_1955 = " orphan : ";
  public static final String TEXT_1956 = ")" + NL + "    {" + NL + "      ";
  public static final String TEXT_1957 = "(orphan, null);" + NL + "    }" + NL + "    ";
  public static final String TEXT_1958 = ".clear();" + NL + "    for (";
  public static final String TEXT_1959 = " ";
  public static final String TEXT_1960 = " : ";
  public static final String TEXT_1961 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_1962 = ".";
  public static final String TEXT_1963 = "() != null)" + NL + "      {" + NL + "        ";
  public static final String TEXT_1964 = ".";
  public static final String TEXT_1965 = "().";
  public static final String TEXT_1966 = ".remove(";
  public static final String TEXT_1967 = ");" + NL + "      }" + NL + "      ";
  public static final String TEXT_1968 = "(";
  public static final String TEXT_1969 = ", this);" + NL + "      ";
  public static final String TEXT_1970 = ".add(";
  public static final String TEXT_1971 = ");" + NL + "    }" + NL + "    wasSet = true;";
  public static final String TEXT_1972 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1973 = "  /* Code from template association_SetUnidirectionalOptionalN */";
  public static final String TEXT_1974 = NL + "  ";
  public static final String TEXT_1975 = " boolean ";
  public static final String TEXT_1976 = "(";
  public static final String TEXT_1977 = "... ";
  public static final String TEXT_1978 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_1979 = NL + "    ArrayList<";
  public static final String TEXT_1980 = "> ";
  public static final String TEXT_1981 = " = new ArrayList<";
  public static final String TEXT_1982 = ">();" + NL + "    for (";
  public static final String TEXT_1983 = " ";
  public static final String TEXT_1984 = " : ";
  public static final String TEXT_1985 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_1986 = ".contains(";
  public static final String TEXT_1987 = "))" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      ";
  public static final String TEXT_1988 = ".add(";
  public static final String TEXT_1989 = ");" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_1990 = ".size() != ";
  public static final String TEXT_1991 = ".length || ";
  public static final String TEXT_1992 = ".size() > ";
  public static final String TEXT_1993 = "())" + NL + "    {";
  public static final String TEXT_1994 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_1995 = ".clear();" + NL + "    ";
  public static final String TEXT_1996 = ".addAll(";
  public static final String TEXT_1997 = ");" + NL + "    wasSet = true;";
  public static final String TEXT_1998 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1999 = "  /* Code from template association_SetUnidirectionalMStar */";
  public static final String TEXT_2000 = NL + "  ";
  public static final String TEXT_2001 = " boolean ";
  public static final String TEXT_2002 = "(";
  public static final String TEXT_2003 = "... ";
  public static final String TEXT_2004 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_2005 = NL + "    ArrayList<";
  public static final String TEXT_2006 = "> ";
  public static final String TEXT_2007 = " = new ArrayList<";
  public static final String TEXT_2008 = ">();" + NL + "    for (";
  public static final String TEXT_2009 = " ";
  public static final String TEXT_2010 = " : ";
  public static final String TEXT_2011 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_2012 = ".contains(";
  public static final String TEXT_2013 = "))" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      ";
  public static final String TEXT_2014 = ".add(";
  public static final String TEXT_2015 = ");" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_2016 = ".size() != ";
  public static final String TEXT_2017 = ".length || ";
  public static final String TEXT_2018 = ".size() < ";
  public static final String TEXT_2019 = "())" + NL + "    {";
  public static final String TEXT_2020 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_2021 = ".clear();" + NL + "    ";
  public static final String TEXT_2022 = ".addAll(";
  public static final String TEXT_2023 = ");" + NL + "    wasSet = true;";
  public static final String TEXT_2024 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_2025 = NL;
  public static final String TEXT_2026 = "  /* Code from template association_AddIndexControlFunctions */" + NL;
  public static final String TEXT_2027 = "  public boolean ";
  public static final String TEXT_2028 = "(";
  public static final String TEXT_2029 = " ";
  public static final String TEXT_2030 = ", int index)" + NL + "  {  " + NL + "    boolean wasAdded = false;" + NL + "    if(";
  public static final String TEXT_2031 = "(";
  public static final String TEXT_2032 = "))" + NL + "    {" + NL + "      if(index < 0 ) { index = 0; }" + NL + "      if(index > ";
  public static final String TEXT_2033 = "()) { index = ";
  public static final String TEXT_2034 = "() - 1; }";
  public static final String TEXT_2035 = NL + "      ";
  public static final String TEXT_2036 = ".remove(";
  public static final String TEXT_2037 = ");" + NL + "      ";
  public static final String TEXT_2038 = ".add(index, ";
  public static final String TEXT_2039 = ");";
  public static final String TEXT_2040 = NL + "      wasAdded = true;" + NL + "    }" + NL + "    return wasAdded;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_2041 = "(";
  public static final String TEXT_2042 = " ";
  public static final String TEXT_2043 = ", int index)" + NL + "  {" + NL + "    boolean wasAdded = false;" + NL + "    if(";
  public static final String TEXT_2044 = ".contains(";
  public static final String TEXT_2045 = "))" + NL + "    {" + NL + "      if(index < 0 ) { index = 0; }" + NL + "      if(index > ";
  public static final String TEXT_2046 = "()) { index = ";
  public static final String TEXT_2047 = "() - 1; }";
  public static final String TEXT_2048 = NL + "      ";
  public static final String TEXT_2049 = ".remove(";
  public static final String TEXT_2050 = ");" + NL + "      ";
  public static final String TEXT_2051 = ".add(index, ";
  public static final String TEXT_2052 = ");";
  public static final String TEXT_2053 = NL + "      wasAdded = true;" + NL + "    } " + NL + "    else " + NL + "    {";
  public static final String TEXT_2054 = NL + "      wasAdded = ";
  public static final String TEXT_2055 = "(";
  public static final String TEXT_2056 = ", index);";
  public static final String TEXT_2057 = NL + "    }" + NL + "    return wasAdded;" + NL + "  }" + NL;
  public static final String TEXT_2058 = NL + "  /* Code from template association_sorted_serializable_readObject */ " + NL + "  private void readObject(java.io.ObjectInputStream in)" + NL + "  throws Exception" + NL + "  {" + NL + "    in.defaultReadObject();" + NL;
  public static final String TEXT_2059 = NL + "  }" + NL + "  ";
  public static final String TEXT_2060 = "";
  public static final String TEXT_2061 = NL + "  public boolean equals(Object obj)" + NL + "  {" + NL + "    if (obj == null) { return false; }" + NL + "    if (!getClass().equals(obj.getClass())) { return false; }" + NL + NL + "    ";
  public static final String TEXT_2062 = " compareTo = (";
  public static final String TEXT_2063 = ")obj;" + NL + "  " + NL + "    ";
  public static final String TEXT_2064 = NL + NL + "    return true;" + NL + "  }" + NL + NL + "  public int hashCode()" + NL + "  {" + NL + "    if (cachedHashCode != -1)" + NL + "    {" + NL + "      return cachedHashCode;" + NL + "    }" + NL + "    cachedHashCode = 17;" + NL + "    ";
  public static final String TEXT_2065 = NL + NL + "    ";
  public static final String TEXT_2066 = NL + "    return cachedHashCode;" + NL + "  }" + NL;
  public static final String TEXT_2067 = "";
  public static final String TEXT_2068 = "";
  public static final String TEXT_2069 = NL + "  private void ";
  public static final String TEXT_2070 = "()" + NL + "  {" + NL + "    try" + NL + "    {";
  public static final String TEXT_2071 = "";
  public static final String TEXT_2072 = NL + "      ";
  public static final String TEXT_2073 = NL + "      Thread.sleep(1);";
  public static final String TEXT_2074 = NL + "    }" + NL + "    catch (InterruptedException e)" + NL + "    {" + NL + NL + "    }" + NL + "  }" + NL;
  public static final String TEXT_2075 = NL + "  private static class DoActivityThread extends Thread" + NL + "  {" + NL + "    ";
  public static final String TEXT_2076 = " controller;" + NL + "    String doActivityMethodName;" + NL + "    " + NL + "    public DoActivityThread(";
  public static final String TEXT_2077 = " aController,String aDoActivityMethodName)" + NL + "    {" + NL + "      controller = aController;" + NL + "      doActivityMethodName = aDoActivityMethodName;" + NL + "      start();" + NL + "    }" + NL + "    " + NL + "    public void run()" + NL + "    {" + NL + "      ";
  public static final String TEXT_2078 = NL + "    }" + NL + "  }" + NL;
  public static final String TEXT_2079 = NL + "  private void ";
  public static final String TEXT_2080 = "()" + NL + "  {" + NL + "    ";
  public static final String TEXT_2081 = " = new TimedEventHandler(this,\"";
  public static final String TEXT_2082 = "\",";
  public static final String TEXT_2083 = ");" + NL + "  }" + NL + NL + "  private void ";
  public static final String TEXT_2084 = "()" + NL + "  {" + NL + "    ";
  public static final String TEXT_2085 = ".stop();" + NL + "  }" + NL;
  public static final String TEXT_2086 = NL + "  private void ";
  public static final String TEXT_2087 = "()" + NL + "  {" + NL + "    ";
  public static final String TEXT_2088 = " = new TimedEventHandler(this,\"";
  public static final String TEXT_2089 = "\",";
  public static final String TEXT_2090 = ");" + NL + "  }" + NL + NL + "  private void ";
  public static final String TEXT_2091 = "()" + NL + "  {" + NL + "    ";
  public static final String TEXT_2092 = ".stop();" + NL + "  }" + NL;
  public static final String TEXT_2093 = NL + "  public static class TimedEventHandler extends TimerTask  " + NL + "  {" + NL + "    private ";
  public static final String TEXT_2094 = " controller;" + NL + "    private String timeoutMethodName;" + NL + "    private double howLongInSeconds;" + NL + "    private Timer timer;" + NL + "    " + NL + "    public TimedEventHandler(";
  public static final String TEXT_2095 = " aController, String aTimeoutMethodName, double aHowLongInSeconds)" + NL + "    {" + NL + "      controller = aController;" + NL + "      timeoutMethodName = aTimeoutMethodName;" + NL + "      howLongInSeconds = aHowLongInSeconds;" + NL + "      timer = new Timer();" + NL + "      timer.schedule(this, (long)howLongInSeconds*1000);" + NL + "    }" + NL + "    " + NL + "    public void stop()" + NL + "    {" + NL + "      timer.cancel();" + NL + "    }" + NL + "    " + NL + "    public void run ()" + NL + "    {";
  public static final String TEXT_2096 = NL + "      if (\"";
  public static final String TEXT_2097 = "\".equals(timeoutMethodName))" + NL + "      {" + NL + "        boolean shouldRestart = !controller.";
  public static final String TEXT_2098 = "();" + NL + "        if (shouldRestart)" + NL + "        {" + NL + "          controller.";
  public static final String TEXT_2099 = "();" + NL + "        }" + NL + "        return;" + NL + "      }";
  public static final String TEXT_2100 = NL + "      if (\"";
  public static final String TEXT_2101 = "\".equals(timeoutMethodName))" + NL + "      {" + NL + "        boolean shouldRestart = !controller.";
  public static final String TEXT_2102 = "();" + NL + "        if (shouldRestart)" + NL + "        {" + NL + "          controller.";
  public static final String TEXT_2103 = "();" + NL + "        }" + NL + "        return;" + NL + "      }";
  public static final String TEXT_2104 = NL + "    }" + NL + "  }" + NL;
  public static final String TEXT_2105 = "";
  public static final String TEXT_2106 = NL + "    ";
  public static final String TEXT_2107 = " ";
  public static final String TEXT_2108 = " = ";
  public static final String TEXT_2109 = "_One";
  public static final String TEXT_2110 = "();" + NL + "    ";
  public static final String TEXT_2111 = " = null;";
  public static final String TEXT_2112 = NL + "    clear_";
  public static final String TEXT_2113 = "();";
  public static final String TEXT_2114 = NL + NL + "    ";
  public static final String TEXT_2115 = " ";
  public static final String TEXT_2116 = " = ";
  public static final String TEXT_2117 = "_One";
  public static final String TEXT_2118 = "();" + NL + "    super.clear_";
  public static final String TEXT_2119 = "();" + NL + "    if (";
  public static final String TEXT_2120 = " != null)" + NL + "    {" + NL + "      ";
  public static final String TEXT_2121 = ".delete();" + NL + "    }";
  public static final String TEXT_2122 = NL + "    ";
  public static final String TEXT_2123 = " ";
  public static final String TEXT_2124 = " = ";
  public static final String TEXT_2125 = "_One";
  public static final String TEXT_2126 = "();" + NL + "    super.clear_";
  public static final String TEXT_2127 = "();" + NL + "    if (";
  public static final String TEXT_2128 = " != null)" + NL + "    {" + NL + "      ";
  public static final String TEXT_2129 = ".delete();" + NL + "      ";
  public static final String TEXT_2130 = ".clear_";
  public static final String TEXT_2131 = "();" + NL + "    }";
  public static final String TEXT_2132 = NL + "    while (";
  public static final String TEXT_2133 = "_";
  public static final String TEXT_2134 = "().size() > 0)" + NL + "    {" + NL + "      ";
  public static final String TEXT_2135 = " ";
  public static final String TEXT_2136 = " = ";
  public static final String TEXT_2137 = "_";
  public static final String TEXT_2138 = "().get(";
  public static final String TEXT_2139 = "_";
  public static final String TEXT_2140 = "().size() - 1);" + NL + "      ";
  public static final String TEXT_2141 = ".delete();" + NL + "      ";
  public static final String TEXT_2142 = "_";
  public static final String TEXT_2143 = "().remove(";
  public static final String TEXT_2144 = ");" + NL + "    }" + NL + "    ";
  public static final String TEXT_2145 = NL + "    ";
  public static final String TEXT_2146 = " ";
  public static final String TEXT_2147 = " = ";
  public static final String TEXT_2148 = "_One";
  public static final String TEXT_2149 = "();" + NL + "    super.clear_";
  public static final String TEXT_2150 = "();" + NL + "    if (";
  public static final String TEXT_2151 = " != null)" + NL + "    {" + NL + "      ";
  public static final String TEXT_2152 = ".delete();" + NL + "    }";
  public static final String TEXT_2153 = NL + "    while( !";
  public static final String TEXT_2154 = "_One";
  public static final String TEXT_2155 = "().isEmpty() )" + NL + "    {" + NL + "      ";
  public static final String TEXT_2156 = " ";
  public static final String TEXT_2157 = " = ";
  public static final String TEXT_2158 = "_One";
  public static final String TEXT_2159 = "_";
  public static final String TEXT_2160 = "().get(0);" + NL + "      ";
  public static final String TEXT_2161 = ".";
  public static final String TEXT_2162 = "(null);" + NL + "      ";
  public static final String TEXT_2163 = "_One";
  public static final String TEXT_2164 = "().remove(";
  public static final String TEXT_2165 = ");" + NL + "    }";
  public static final String TEXT_2166 = NL + "    if (";
  public static final String TEXT_2167 = "_One";
  public static final String TEXT_2168 = "() != null)" + NL + "    {" + NL + "      if (";
  public static final String TEXT_2169 = "_One";
  public static final String TEXT_2170 = "().";
  public static final String TEXT_2171 = "() <= ";
  public static final String TEXT_2172 = ")" + NL + "      {" + NL + "        ";
  public static final String TEXT_2173 = " ";
  public static final String TEXT_2174 = " = ";
  public static final String TEXT_2175 = "_One";
  public static final String TEXT_2176 = "();" + NL + "        clear_";
  public static final String TEXT_2177 = "();" + NL + "        ";
  public static final String TEXT_2178 = ".delete();" + NL + "      " + NL + "      }" + NL + "      else" + NL + "      {" + NL + "        ";
  public static final String TEXT_2179 = " ";
  public static final String TEXT_2180 = " = ";
  public static final String TEXT_2181 = "_One";
  public static final String TEXT_2182 = "();" + NL + "        clear_";
  public static final String TEXT_2183 = "();" + NL + "        ";
  public static final String TEXT_2184 = ".";
  public static final String TEXT_2185 = "(this);" + NL + "      }" + NL + "    }";
  public static final String TEXT_2186 = NL + "    if (";
  public static final String TEXT_2187 = "_One";
  public static final String TEXT_2188 = "() != null)" + NL + "    {" + NL + "        ";
  public static final String TEXT_2189 = " ";
  public static final String TEXT_2190 = " = ";
  public static final String TEXT_2191 = "_One";
  public static final String TEXT_2192 = "();" + NL + "        clear_";
  public static final String TEXT_2193 = "();" + NL + "        ";
  public static final String TEXT_2194 = ".delete();" + NL + "    }";
  public static final String TEXT_2195 = NL + "    if (";
  public static final String TEXT_2196 = "_One";
  public static final String TEXT_2197 = "() != null)" + NL + "    {" + NL + "      ";
  public static final String TEXT_2198 = "_One";
  public static final String TEXT_2199 = "().clear_";
  public static final String TEXT_2200 = "();" + NL + "    }";
  public static final String TEXT_2201 = NL + "    ";
  public static final String TEXT_2202 = " ";
  public static final String TEXT_2203 = " = ";
  public static final String TEXT_2204 = "_One";
  public static final String TEXT_2205 = "();" + NL + "    super.clear_";
  public static final String TEXT_2206 = "();" + NL + "    if (";
  public static final String TEXT_2207 = " != null)" + NL + "    {" + NL + "      ";
  public static final String TEXT_2208 = ".clear_";
  public static final String TEXT_2209 = "();" + NL + "    }";
  public static final String TEXT_2210 = NL + "    if (";
  public static final String TEXT_2211 = "_One";
  public static final String TEXT_2212 = "() != null)" + NL + "    {" + NL + "      ";
  public static final String TEXT_2213 = " ";
  public static final String TEXT_2214 = " = ";
  public static final String TEXT_2215 = "_One";
  public static final String TEXT_2216 = "();" + NL + "      clear_";
  public static final String TEXT_2217 = "();" + NL + "      ";
  public static final String TEXT_2218 = ".";
  public static final String TEXT_2219 = "(this);" + NL + "    }";
  public static final String TEXT_2220 = NL + "    if (";
  public static final String TEXT_2221 = "_One";
  public static final String TEXT_2222 = "() != null)" + NL + "    {" + NL + "      ";
  public static final String TEXT_2223 = "_One";
  public static final String TEXT_2224 = "().delete();" + NL + "    }";
  public static final String TEXT_2225 = NL + "    if (";
  public static final String TEXT_2226 = "_One";
  public static final String TEXT_2227 = "() != null)" + NL + "    {" + NL + "      if (";
  public static final String TEXT_2228 = "_One";
  public static final String TEXT_2229 = "().";
  public static final String TEXT_2230 = "() <= ";
  public static final String TEXT_2231 = ")" + NL + "      {" + NL + "        ";
  public static final String TEXT_2232 = "_One";
  public static final String TEXT_2233 = "().delete();" + NL + "      }" + NL + "      else" + NL + "      {" + NL + "        ";
  public static final String TEXT_2234 = " ";
  public static final String TEXT_2235 = " = ";
  public static final String TEXT_2236 = "_One";
  public static final String TEXT_2237 = "();" + NL + "        clear_";
  public static final String TEXT_2238 = "();" + NL + "        ";
  public static final String TEXT_2239 = ".";
  public static final String TEXT_2240 = "(this);" + NL + "      }" + NL + "    }";
  public static final String TEXT_2241 = NL + "    ";
  public static final String TEXT_2242 = " ";
  public static final String TEXT_2243 = " = ";
  public static final String TEXT_2244 = "_One";
  public static final String TEXT_2245 = "();" + NL + "    clear_";
  public static final String TEXT_2246 = "();" + NL + "    ";
  public static final String TEXT_2247 = ".";
  public static final String TEXT_2248 = "(this);";
  public static final String TEXT_2249 = NL + "    for(";
  public static final String TEXT_2250 = " ";
  public static final String TEXT_2251 = " : ";
  public static final String TEXT_2252 = "_";
  public static final String TEXT_2253 = "())" + NL + "    {" + NL + "      ";
  public static final String TEXT_2254 = "(";
  public static final String TEXT_2255 = ",null);" + NL + "    }" + NL + "    clear_";
  public static final String TEXT_2256 = "();";
  public static final String TEXT_2257 = NL + "    ArrayList<";
  public static final String TEXT_2258 = "> ";
  public static final String TEXT_2259 = " = new ArrayList<";
  public static final String TEXT_2260 = ">(";
  public static final String TEXT_2261 = "());" + NL + "    clear_";
  public static final String TEXT_2262 = "();" + NL + "    for(";
  public static final String TEXT_2263 = " ";
  public static final String TEXT_2264 = " : ";
  public static final String TEXT_2265 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_2266 = ".";
  public static final String TEXT_2267 = "() <= ";
  public static final String TEXT_2268 = ".";
  public static final String TEXT_2269 = "_";
  public static final String TEXT_2270 = "())" + NL + "      {" + NL + "        ";
  public static final String TEXT_2271 = ".delete();" + NL + "      }" + NL + "      else" + NL + "      {" + NL + "        ";
  public static final String TEXT_2272 = ".";
  public static final String TEXT_2273 = "(this);" + NL + "      }" + NL + "    }";
  public static final String TEXT_2274 = NL + "    ArrayList<";
  public static final String TEXT_2275 = "> ";
  public static final String TEXT_2276 = " = new ArrayList<";
  public static final String TEXT_2277 = ">(";
  public static final String TEXT_2278 = "_";
  public static final String TEXT_2279 = "());" + NL + "    clear_";
  public static final String TEXT_2280 = "();" + NL + "    for(";
  public static final String TEXT_2281 = " ";
  public static final String TEXT_2282 = " : ";
  public static final String TEXT_2283 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_2284 = ".";
  public static final String TEXT_2285 = "() <= ";
  public static final String TEXT_2286 = ".";
  public static final String TEXT_2287 = "_";
  public static final String TEXT_2288 = "())" + NL + "      {" + NL + "        ";
  public static final String TEXT_2289 = ".delete();" + NL + "      }" + NL + "      else" + NL + "      {" + NL + "        ";
  public static final String TEXT_2290 = ".";
  public static final String TEXT_2291 = "(this);" + NL + "      }" + NL + "    }";
  public static final String TEXT_2292 = NL + "    ArrayList<";
  public static final String TEXT_2293 = "> ";
  public static final String TEXT_2294 = " = new ArrayList<";
  public static final String TEXT_2295 = ">(";
  public static final String TEXT_2296 = "_";
  public static final String TEXT_2297 = "());" + NL + "    clear_";
  public static final String TEXT_2298 = "();" + NL + "    for(";
  public static final String TEXT_2299 = " ";
  public static final String TEXT_2300 = " : ";
  public static final String TEXT_2301 = ")" + NL + "    {" + NL + "      ";
  public static final String TEXT_2302 = ".";
  public static final String TEXT_2303 = "(this);" + NL + "    }";
  public static final String TEXT_2304 = NL + "    for( ";
  public static final String TEXT_2305 = " orphan : ";
  public static final String TEXT_2306 = "_";
  public static final String TEXT_2307 = "() )" + NL + "    {" + NL + "      orphan.clear_";
  public static final String TEXT_2308 = "();" + NL + "    }";
  public static final String TEXT_2309 = NL + "    ";
  public static final String TEXT_2310 = " = null;";
  public static final String TEXT_2311 = NL + "    ";
  public static final String TEXT_2312 = ".clear();";
  public static final String TEXT_2313 = NL + "    ";
  public static final String TEXT_2314 = " ";
  public static final String TEXT_2315 = " = ";
  public static final String TEXT_2316 = ";" + NL + "    ";
  public static final String TEXT_2317 = " = null;" + NL + "    if (";
  public static final String TEXT_2318 = " != null)" + NL + "    {" + NL + "      ";
  public static final String TEXT_2319 = ".delete();" + NL + "    }";
  public static final String TEXT_2320 = NL + "    ";
  public static final String TEXT_2321 = " ";
  public static final String TEXT_2322 = " = ";
  public static final String TEXT_2323 = ";" + NL + "    ";
  public static final String TEXT_2324 = " = null;" + NL + "    if (";
  public static final String TEXT_2325 = " != null)" + NL + "    {" + NL + "      ";
  public static final String TEXT_2326 = ".delete();" + NL + "      ";
  public static final String TEXT_2327 = ".";
  public static final String TEXT_2328 = "(null);" + NL + "    }";
  public static final String TEXT_2329 = NL + "    while (";
  public static final String TEXT_2330 = ".size() > 0)" + NL + "    {" + NL + "      ";
  public static final String TEXT_2331 = " ";
  public static final String TEXT_2332 = " = ";
  public static final String TEXT_2333 = ".get(";
  public static final String TEXT_2334 = ".size() - 1);" + NL + "      ";
  public static final String TEXT_2335 = ".delete();" + NL + "      ";
  public static final String TEXT_2336 = ".remove(";
  public static final String TEXT_2337 = ");" + NL + "    }" + NL + "    ";
  public static final String TEXT_2338 = NL + "    ";
  public static final String TEXT_2339 = " ";
  public static final String TEXT_2340 = " = ";
  public static final String TEXT_2341 = ";" + NL + "    ";
  public static final String TEXT_2342 = " = null;" + NL + "    if (";
  public static final String TEXT_2343 = " != null)" + NL + "    {" + NL + "      ";
  public static final String TEXT_2344 = ".delete();" + NL + "    }";
  public static final String TEXT_2345 = NL + "    while( !";
  public static final String TEXT_2346 = ".isEmpty() )" + NL + "    {" + NL + "      ";
  public static final String TEXT_2347 = " ";
  public static final String TEXT_2348 = " = ";
  public static final String TEXT_2349 = ".get(0);" + NL + "      ";
  public static final String TEXT_2350 = ".";
  public static final String TEXT_2351 = "(null);" + NL + "      ";
  public static final String TEXT_2352 = ".remove(";
  public static final String TEXT_2353 = ");" + NL + "    }";
  public static final String TEXT_2354 = NL + "    if (";
  public static final String TEXT_2355 = " != null)" + NL + "    {" + NL + "      if (";
  public static final String TEXT_2356 = ".";
  public static final String TEXT_2357 = "() <= ";
  public static final String TEXT_2358 = ")" + NL + "      {" + NL + "        ";
  public static final String TEXT_2359 = " ";
  public static final String TEXT_2360 = " = ";
  public static final String TEXT_2361 = ";" + NL + "        this.";
  public static final String TEXT_2362 = " = null;" + NL + "        ";
  public static final String TEXT_2363 = ".delete();" + NL + "      " + NL + "      }" + NL + "      else" + NL + "      {" + NL + "        ";
  public static final String TEXT_2364 = " ";
  public static final String TEXT_2365 = " = ";
  public static final String TEXT_2366 = ";" + NL + "        this.";
  public static final String TEXT_2367 = " = null;" + NL + "        ";
  public static final String TEXT_2368 = ".";
  public static final String TEXT_2369 = "(";
  public static final String TEXT_2370 = ");" + NL + "      }" + NL + "    }";
  public static final String TEXT_2371 = NL + "    if (";
  public static final String TEXT_2372 = " != null)" + NL + "    {" + NL + "        ";
  public static final String TEXT_2373 = " ";
  public static final String TEXT_2374 = " = ";
  public static final String TEXT_2375 = ";" + NL + "        this.";
  public static final String TEXT_2376 = " = null;" + NL + "        ";
  public static final String TEXT_2377 = ".delete();" + NL + "    }";
  public static final String TEXT_2378 = NL + "    if (";
  public static final String TEXT_2379 = " != null)" + NL + "    {" + NL + "      ";
  public static final String TEXT_2380 = ".";
  public static final String TEXT_2381 = "(null);" + NL + "    }";
  public static final String TEXT_2382 = NL + "    ";
  public static final String TEXT_2383 = " ";
  public static final String TEXT_2384 = " = ";
  public static final String TEXT_2385 = ";" + NL + "    ";
  public static final String TEXT_2386 = " = null;" + NL + "    if (";
  public static final String TEXT_2387 = " != null)" + NL + "    {" + NL + "      ";
  public static final String TEXT_2388 = ".";
  public static final String TEXT_2389 = "(null);" + NL + "    }";
  public static final String TEXT_2390 = NL + "    if (";
  public static final String TEXT_2391 = " != null)" + NL + "    {" + NL + "      ";
  public static final String TEXT_2392 = " ";
  public static final String TEXT_2393 = " = ";
  public static final String TEXT_2394 = ";" + NL + "      this.";
  public static final String TEXT_2395 = " = null;" + NL + "      ";
  public static final String TEXT_2396 = ".";
  public static final String TEXT_2397 = "(";
  public static final String TEXT_2398 = ");" + NL + "    }";
  public static final String TEXT_2399 = NL + "    if (";
  public static final String TEXT_2400 = " != null)" + NL + "    {" + NL + "      ";
  public static final String TEXT_2401 = ".delete();" + NL + "    }";
  public static final String TEXT_2402 = NL + "    if (";
  public static final String TEXT_2403 = " != null)" + NL + "    {" + NL + "      if (";
  public static final String TEXT_2404 = ".";
  public static final String TEXT_2405 = "() <= ";
  public static final String TEXT_2406 = ")" + NL + "      {" + NL + "        ";
  public static final String TEXT_2407 = ".delete();" + NL + "      }" + NL + "      else" + NL + "      {" + NL + "        ";
  public static final String TEXT_2408 = " ";
  public static final String TEXT_2409 = " = ";
  public static final String TEXT_2410 = ";" + NL + "        this.";
  public static final String TEXT_2411 = " = null;" + NL + "        ";
  public static final String TEXT_2412 = ".";
  public static final String TEXT_2413 = "(";
  public static final String TEXT_2414 = ");" + NL + "      }" + NL + "    }";
  public static final String TEXT_2415 = NL + "    ";
  public static final String TEXT_2416 = " ";
  public static final String TEXT_2417 = " = ";
  public static final String TEXT_2418 = ";" + NL + "    this.";
  public static final String TEXT_2419 = " = null;" + NL + "    if(";
  public static final String TEXT_2420 = " != null)" + NL + "    {" + NL + "      ";
  public static final String TEXT_2421 = ".";
  public static final String TEXT_2422 = "(";
  public static final String TEXT_2423 = ");" + NL + "    }";
  public static final String TEXT_2424 = NL + "    for(";
  public static final String TEXT_2425 = " ";
  public static final String TEXT_2426 = " : ";
  public static final String TEXT_2427 = ")" + NL + "    {" + NL + "      ";
  public static final String TEXT_2428 = "(";
  public static final String TEXT_2429 = ",null);" + NL + "    }" + NL + "    ";
  public static final String TEXT_2430 = ".clear();";
  public static final String TEXT_2431 = NL + "    ArrayList<";
  public static final String TEXT_2432 = "> ";
  public static final String TEXT_2433 = " = new ArrayList<";
  public static final String TEXT_2434 = ">(";
  public static final String TEXT_2435 = ");" + NL + "    ";
  public static final String TEXT_2436 = ".clear();" + NL + "    for(";
  public static final String TEXT_2437 = " ";
  public static final String TEXT_2438 = " : ";
  public static final String TEXT_2439 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_2440 = ".";
  public static final String TEXT_2441 = "() <= ";
  public static final String TEXT_2442 = ".";
  public static final String TEXT_2443 = "())" + NL + "      {" + NL + "        ";
  public static final String TEXT_2444 = ".delete();" + NL + "      }" + NL + "      else" + NL + "      {" + NL + "        ";
  public static final String TEXT_2445 = ".";
  public static final String TEXT_2446 = "(";
  public static final String TEXT_2447 = ");" + NL + "      }" + NL + "    }";
  public static final String TEXT_2448 = NL + "    ArrayList<";
  public static final String TEXT_2449 = "> ";
  public static final String TEXT_2450 = " = new ArrayList<";
  public static final String TEXT_2451 = ">(";
  public static final String TEXT_2452 = ");" + NL + "    ";
  public static final String TEXT_2453 = ".clear();" + NL + "    for(";
  public static final String TEXT_2454 = " ";
  public static final String TEXT_2455 = " : ";
  public static final String TEXT_2456 = ")" + NL + "    {" + NL + "      ";
  public static final String TEXT_2457 = ".";
  public static final String TEXT_2458 = "(";
  public static final String TEXT_2459 = ");" + NL + "    }";
  public static final String TEXT_2460 = NL + "    for(int i=";
  public static final String TEXT_2461 = ".size(); i > 0; i--)" + NL + "    {" + NL + "      ";
  public static final String TEXT_2462 = " ";
  public static final String TEXT_2463 = " = ";
  public static final String TEXT_2464 = ".get(i - 1);" + NL + "      ";
  public static final String TEXT_2465 = ".delete();" + NL + "    }";
  public static final String TEXT_2466 = NL + "    while( !";
  public static final String TEXT_2467 = ".isEmpty() )" + NL + "    {" + NL + "      ";
  public static final String TEXT_2468 = ".get(0).";
  public static final String TEXT_2469 = "(null);" + NL + "    }";
  public static final String TEXT_2470 = "";
  public static final String TEXT_2471 = NL + "  " + NL + "  @Override" + NL + "  public void run ()" + NL + "  {" + NL + "    boolean status=false;" + NL + "    while (true) " + NL + "    {" + NL;
  public static final String TEXT_2472 = NL + "      " + NL + "      switch (m.type)" + NL + "      {";
  public static final String TEXT_2473 = " " + NL + "        default:" + NL + "      }" + NL + "      if(!status)" + NL + "      {" + NL + "        // Error message is written or  exception is raised" + NL + "      }" + NL + "    }" + NL + "  }";
  public static final String TEXT_2474 = "";
  public static final String TEXT_2475 = "";
  public static final String TEXT_2476 = "";
  public static final String TEXT_2477 = "";
  public static final String TEXT_2478 = "";
  public static final String TEXT_2479 = NL + NL + "  public String toString()" + NL + "  {";
  public static final String TEXT_2480 = NL + "  }";
  public static final String TEXT_2481 = "";
  public static final String TEXT_2482 = "";
  public static final String TEXT_2483 = "";
  public static final String TEXT_2484 = "  " + NL + "  //------------------------" + NL + "  // DEVELOPER CODE - PROVIDED AS-IS" + NL + "  //------------------------" + NL + "  " + NL + "  ";
  public static final String TEXT_2485 = NL + "  ";
  public static final String TEXT_2486 = NL + "}";
  public static final String TEXT_2487 = NL + "  public static class UmpleExceptionHandler implements Thread.UncaughtExceptionHandler" + NL + "  {" + NL + "    public void uncaughtException(Thread t, Throwable e)" + NL + "    {" + NL + "      translate(e);" + NL + "      if(e.getCause()!=null)" + NL + "      {" + NL + "        translate(e.getCause());" + NL + "      }" + NL + "      e.printStackTrace();" + NL + "    }" + NL + "    public void translate(Throwable e)" + NL + "    {" + NL + "      java.util.List<StackTraceElement> result = new java.util.ArrayList<StackTraceElement>();" + NL + "      StackTraceElement[] elements = e.getStackTrace();" + NL + "      try" + NL + "      {" + NL + "        for(StackTraceElement element:elements)" + NL + "        {" + NL + "          String className = element.getClassName();" + NL + "          String methodName = element.getMethodName();" + NL + "          boolean methodFound = false;" + NL + "          int index = className.lastIndexOf('.')+1;" + NL + "          try {" + NL + "            java.lang.reflect.Method query = this.getClass().getMethod(className.substring(index)+\"_\"+methodName,new Class[]{});" + NL + "            UmpleSourceData sourceInformation = (UmpleSourceData)query.invoke(this,new Object[]{});" + NL + "            for(int i=0;i<sourceInformation.size();++i)" + NL + "            {" + NL + "              // To compensate for any offsets caused by injected code we need to loop through the other references to this function" + NL + "              //  and adjust the start / length of the function." + NL + "              int functionStart = sourceInformation.getJavaLine(i) + ((\"main\".equals(methodName))?3:1);" + NL + "              int functionEnd = functionStart + sourceInformation.getLength(i);" + NL + "              int afterInjectionLines = 0;" + NL + "              //  We can leverage the fact that all inject statements are added to the uncaught exception list " + NL + "              //   before the functions that they are within" + NL + "              for (int j = 0; j < i; j++) {" + NL + "                if (sourceInformation.getJavaLine(j) - 1 >= functionStart &&" + NL + "                    sourceInformation.getJavaLine(j) - 1 <= functionEnd &&" + NL + "                    sourceInformation.getJavaLine(j) - 1 <= element.getLineNumber()) {" + NL + "                    // A before injection, +2 for the comments surrounding the injected code" + NL + "                    if (sourceInformation.getJavaLine(j) - 1 == functionStart) {" + NL + "                        functionStart += sourceInformation.getLength(j) + 2;" + NL + "                        functionEnd += sourceInformation.getLength(j) + 2;" + NL + "                    } else {" + NL + "                        // An after injection" + NL + "                        afterInjectionLines += sourceInformation.getLength(j) + 2;" + NL + "                        functionEnd += sourceInformation.getLength(j) + 2;" + NL + "                    }" + NL + "                }" + NL + "              }" + NL + "              int distanceFromStart = element.getLineNumber() - functionStart - afterInjectionLines;" + NL + "              if(distanceFromStart>=0&&distanceFromStart<=sourceInformation.getLength(i))" + NL + "              {" + NL + "                result.add(new StackTraceElement(element.getClassName(),element.getMethodName(),sourceInformation.getFileName(i),sourceInformation.getUmpleLine(i)+distanceFromStart));" + NL + "                methodFound = true;" + NL + "                break;" + NL + "              }" + NL + "            }" + NL + "          }" + NL + "          catch (Exception e2){}" + NL + "          if(!methodFound)" + NL + "          {" + NL + "            result.add(element);" + NL + "          }" + NL + "        }" + NL + "      }" + NL + "      catch (Exception e1)" + NL + "      {" + NL + "        e1.printStackTrace();" + NL + "      }" + NL + "      e.setStackTrace(result.toArray(new StackTraceElement[0]));" + NL + "    }" + NL + "  //The following methods Map Java lines back to their original Umple file / line    " + NL;
  public static final String TEXT_2488 = NL + "  }" + NL + "  public static class UmpleSourceData" + NL + "  {" + NL + "    String[] umpleFileNames;" + NL + "    Integer[] umpleLines;" + NL + "    Integer[] umpleJavaLines;" + NL + "    Integer[] umpleLengths;" + NL + "    " + NL + "    public UmpleSourceData(){" + NL + "    }" + NL + "    public String getFileName(int i){" + NL + "      return umpleFileNames[i];" + NL + "    }" + NL + "    public Integer getUmpleLine(int i){" + NL + "      return umpleLines[i];" + NL + "    }" + NL + "    public Integer getJavaLine(int i){" + NL + "      return umpleJavaLines[i];" + NL + "    }" + NL + "    public Integer getLength(int i){" + NL + "      return umpleLengths[i];" + NL + "    }" + NL + "    public UmpleSourceData setFileNames(String... filenames){" + NL + "      umpleFileNames = filenames;" + NL + "      return this;" + NL + "    }" + NL + "    public UmpleSourceData setUmpleLines(Integer... umplelines){" + NL + "      umpleLines = umplelines;" + NL + "      return this;" + NL + "    }" + NL + "    public UmpleSourceData setJavaLines(Integer... javalines){" + NL + "      umpleJavaLines = javalines;" + NL + "      return this;" + NL + "    }" + NL + "    public UmpleSourceData setLengths(Integer... lengths){" + NL + "      umpleLengths = lengths;" + NL + "      return this;" + NL + "    }" + NL + "    public int size(){" + NL + "      return umpleFileNames.length;" + NL + "    }" + NL + "  }" + NL + "}";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public JavaClassGenerator()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}


  /**
   * Add a newline to the end of the input
   */
  // line 52 "../../../../../UmpleTLTemplates/JavaClassGenerator.ump"
   private void appendln(StringBuilder buffer, String input, Object... variables){
    append(buffer, input + NL, variables);
  }


  /**
   * This method will be used to append formatted strings
   * i.e. format("Hello {0} {1}", "andrew","forward");
   */
  // line 59 "../../../../../UmpleTLTemplates/JavaClassGenerator.ump"
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
    
    /*JavaClassGenerator*/
    /*UmpleNotice*/
    realSb.append(TEXT_0);
    realSb.append(TEXT_1);
    
  UmpleClass uClass = (UmpleClass) uElement;
  globalUmpleClass = uClass;  
  GeneratedClass gClass = uClass.getGeneratedClass();
  JavaGenerator gen = new JavaGenerator();
  gen.setModel(model);
  GeneratorHelper.generator = gen;

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
    

  // A set for imports in order to de-duplicate.  
  Set<String> importSet = new HashSet<String>();

  // Add dependeny names into the set
  for (Depend depend : uClass.getDepends())
  {
    importSet.add(depend.getName());
    appendln(realSb, "");
    append(realSb, "import {0};", depend.getName());
  }

  for (String anImport : gClass.getMultiLookup("import"))
  {
    // Test whether the import is already written OR the class is inner class (should not have import statement)
    if (importSet.contains(anImport) | uClass.hasOuterClass()) {
      continue;
    }
    appendln(realSb, "");
    append(realSb, "import {0};", anImport);
  }

    realSb.append(TEXT_3);
     if (uClass.numberOfComments() > 0 && uClass.numberOfRequirements() > 0) { List<Comment> toComment = new ArrayList<Comment>(uClass.getComments()); toComment.addAll(Requirement.convertToComment(uClass.getRequirements())); append(realSb, "\n{0}", Comment.format("Javadoc", toComment)); } 
    realSb.append(TEXT_4);
     if (uClass.numberOfComments() > 0 && uClass.numberOfRequirements() == 0) { append(realSb, "\n{0}", Comment.format("Javadoc",uClass.getComments())); } 
    realSb.append(TEXT_5);
     if (uClass.numberOfComments() == 0 && uClass.numberOfRequirements() > 0) { append(realSb, "\n{0}", Requirement.format("Javadoc",uClass.getRequirements())); } 
    realSb.append(TEXT_6);
     for (Position p : uClass.getPositions()) { 
    realSb.append(TEXT_7);
    realSb.append(p.getLineNumber());
    realSb.append(TEXT_8);
    realSb.append(uClass.getRelativePath(p.getFilename(),"Java"));
    realSb.append(TEXT_9);
     }
if(model.getDistributed() && model.getDistributeTechnology().equals("WS")){
if(model.getDistributePattern()==0 && uClass.getDistributeTechnology().equals("WS")){
String classPackageName=(uClass.getPackageName().length() == 0 ? "" : uClass.getPackageName() + ".")+"I"+uClass.getName()+"Impl";

    realSb.append(TEXT_10);
    append(realSb,classPackageName);
    realSb.append(TEXT_11);
    if (uClass.getExtendsClass() == null||(uClass.getExtendsClass() != null && ! uClass.getExtendsClass().getIsDistributed()))
    {
    
    realSb.append(TEXT_12);
    
    }
    realSb.append(TEXT_13);
    }  
  else
    appendln(realSb,NL+"@XmlAccessorType(XmlAccessType.FIELD)");
}

    realSb.append(TEXT_14);
     
if (uClass.getIsStatic())
{
  append(realSb, "{0} ", "static"); 
}

if (uClass.getIsAbstract()) { append(realSb, "{0} ", "abstract"); } 
    realSb.append(TEXT_15);
    realSb.append(uClass.getName());
    realSb.append(gen.translate("isA",uClass));
    
boolean hasParentInterface=uClass.hasParentInterface();

if(uClass.getNeedsDefaultInterface())
{
  if (hasParentInterface == false){
        if(model.getDistributePattern()==0){
          append(realSb," implements java.io.Serializable");
          append(realSb,", I"+uClass.getName()+"Impl");
        }
        else if(model.getDistributePattern()==1&&uClass.getIsDistributed())
          append(realSb," implements java.io.Serializable , I"+uClass.getName());
        else if(model.getDistributePattern()==2)
           append(realSb," implements java.io.Serializable ,I"+uClass.getName().substring(0,uClass.getName().length()-4)); 
        hasParentInterface=true;
      }
      else{
          if(model.getDistributePattern()==0)
          {
            append(realSb," ,java.io.Serializable");
            append(realSb,", I"+uClass.getName()+"Impl");            
          }
        else if(model.getDistributePattern()==1&&uClass.getIsDistributed())
          append(realSb," ,java.io.Serializable , I"+uClass.getName());
        else if(model.getDistributePattern()==2)
           append(realSb," ,java.io.Serializable ,I"+uClass.getName().substring(0,uClass.getName().length()-4));
      } 
}
else if(model.getDistributed())
{
  if (hasParentInterface == false){
        if(!uClass.getIsDistributed())
          append(realSb," implements java.io.Serializable");
      }
      else{
          if(!uClass.getIsDistributed())
            append(realSb," ,java.io.Serializable");
      } 
}
else if(uClass.getIsInternalSerializable())//issue#1444
{
  if (hasParentInterface == false)
  {
    append(realSb," implements java.io.Serializable");
    hasParentInterface=true;
  }
  else
  {
    append(realSb," ,java.io.Serializable");
  } 
}



boolean implementsRunnable = false;

for (StateMachine smq : uClass.getStateMachines())
  {
    if (smq.isQueued())
    { 
      if (hasParentInterface == false){
        append(realSb," implements Runnable");
      }
      else{
        append(realSb,", Runnable");
      }
      implementsRunnable = true;
      break;
    }
    else if(smq.isPooled())
    {
      if (hasParentInterface == false){
        append(realSb," implements Runnable");
      }
      else{
        append(realSb,", Runnable");
      }
      implementsRunnable = true; 
      break;
    }
  }
  

    realSb.append(TEXT_16);
       
  getEnumerationCode(realSb, model, uClass, isFirst);
  getMemberCode(realSb, model,uClass,gClass,gen,isFirst);
  getConstructorCode(realSb, model,uClass,gClass,gen,isFirst, false);
  getProxyReferenceCode(realSb, model,uClass);
  getDistributedMethodsCode(realSb, model,uClass);
  getAttributeCode(realSb, model,uClass,gClass,gen,isFirst,false);
  getStateMachine1Code(realSb, model,uClass,gClass,gen,isFirst,false);
  getAssociationCode(realSb, model,uClass,gClass,gen,isFirst,false);
  getEqualsCode(realSb, model,uClass,gClass,gen,isFirst);
  getStateMachine2Code(realSb, model,uClass,gClass,gen,isFirst);
  getDeleteCode(realSb, model,uClass,gClass,gen,isFirst,false);
  getExtraMethodsCode(realSb, model,uClass,gClass,gen,isFirst);
  getQueuedMethodClass(realSb, model, uClass, gen);
  getInnerClasses(realSb, model,uClass,isFirst);
  getAllExtraCode(realSb, model,uClass,gClass,gen,isFirst);
  return realSb;
    }

  private void getInnerClasses(StringBuilder realSb, UmpleModel model, UmpleClass uClass, boolean isFirst)
  {
    for(UmpleClass innerClass: uClass.getInnerClasses())
    {
      String innerClassContent = getCode(model, innerClass);
      append(realSb, GeneratorHelper.doIndent(innerClassContent, "  "));
    }
  }
  private void getEnumerationCode(StringBuilder realSb, UmpleModel model, UmpleClass uClass, boolean isFirst)
  {
    
    /*enumerations_All*/
    
  for (UmpleEnumeration umpleEnum : model.getEnums()) {
     // Locally defined enumerations have priority over the Umple Model's enumerations
     if (uClass.hasEnum(umpleEnum.getName())) {
       continue;
     }
     
     String enumName = StringFormatter.toPascalCase(umpleEnum.getName());
     boolean classUsesEnum = classUsesEnum(enumName, uClass);

     if (classUsesEnum) {
       if (isFirst) {
        appendln(realSb, "");
        appendln(realSb, "");
        appendln(realSb, "  //------------------------");
        appendln(realSb, "  // ENUMERATIONS");
        append(realSb, "  //------------------------");
        appendln(realSb, "");
        isFirst = false;
       }
       
    /*enumeration*/
    
  append(realSb, "\n  public enum {0} { ", StringFormatter.toPascalCase(umpleEnum.getName()));
  for (int i = 0; i < umpleEnum.getEnumValues().length - 1; i++) {
    append(realSb, "{0}, ", StringFormatter.toPascalCase(umpleEnum.getEnumValue(i)));
  }
  append(realSb, "{0} }", StringFormatter.toPascalCase(umpleEnum.getEnumValue(umpleEnum.getEnumValues().length - 1)));

    
    }
  }
  
  for (UmpleEnumeration umpleEnum : uClass.getEnums()) {
    if (isFirst) {
      appendln(realSb, "");
      appendln(realSb, "");
      appendln(realSb, "  //------------------------");
      appendln(realSb, "  // ENUMERATIONS");
      append(realSb, "  //------------------------");
      appendln(realSb, "");
      isFirst = false;
    }
    
    /*enumeration*/
    
  append(realSb, "\n  public enum {0} { ", StringFormatter.toPascalCase(umpleEnum.getName()));
  for (int i = 0; i < umpleEnum.getEnumValues().length - 1; i++) {
    append(realSb, "{0}, ", StringFormatter.toPascalCase(umpleEnum.getEnumValue(i)));
  }
  append(realSb, "{0} }", StringFormatter.toPascalCase(umpleEnum.getEnumValue(umpleEnum.getEnumValues().length - 1)));

    
  }

    
  }
    public void handelMixsetInsideMethod(UmpleModel umodel, MixsetInMethod mixsetInMethod, MethodBody mBody)
  {
    Mixset mixset = umodel.getMixset(mixsetInMethod.getMixsetName());
    boolean mixsetIsUsed = false;
    try {
       if(mixset != null) // the mixset has been used. 
       {
        if(mixset.getUseUmpleFile() != null)
        {
          mixsetIsUsed = true;
          //first process children
          for(MixsetInMethod childMixsetInMethod : mixsetInMethod.getChildMixsets())
            handelMixsetInsideMethod(umodel, childMixsetInMethod, mBody);
          //Then ...
          String methodCode = mBody.getCodeblock().getCode();
          Pattern labelPatternToMatch = Pattern.compile("mixset\\s+\\S+\\s+"+"\\"+"\u007B"); //==> /u007B means an open curly bracket
          Matcher matcher = labelPatternToMatch.matcher(methodCode);
          // below code, to delete mixset def. and its closing bracket.
          if (matcher.find()) {
            String mixsetDefPlusAfterCode = methodCode.substring(matcher.start());
            int indexOfMixsetClosingBracket = matcher.start() + MethodBody.indexOfMixsetClosingBracket(mixsetDefPlusAfterCode) - 1 ;
            String methodCodeRemovedMixset = methodCode.substring(0,indexOfMixsetClosingBracket) + " " ; // remove closing bracket 
            if(indexOfMixsetClosingBracket + 1 < methodCode.length())
            methodCodeRemovedMixset = methodCodeRemovedMixset + methodCode.substring(indexOfMixsetClosingBracket +1); 
            methodCodeRemovedMixset = methodCodeRemovedMixset.substring(0,matcher.start()) + methodCodeRemovedMixset.substring(matcher.end()+1); // remove mixset def.
            mBody.getCodeblock().setCode(methodCodeRemovedMixset);
          }
        }
      }
    }
    finally
    {
      if(!mixsetIsUsed)
      {
        // delete body of unused mixsets  
        String mixsetInMethodCode = mixsetInMethod.getMixsetFragment();
        String code = mBody.getCodeblock().getCode().replace(mixsetInMethodCode, "");
        mBody.getCodeblock().setCode(code);
      }
    } 
  }

   
  // This method allows the injection of some code before/after a code label inside a method of an umple class. 
  private void applyCodeInjectionToLabeledMethod(UmpleClass uClass, Method aMethod, String aspectType) {
    List<CodeInjection> uClassCodeInectionList = uClass.getApplicableCodeInjectionsCustomMethod(aspectType, aMethod.getName(), aMethod.getMethodParameters());
    if(uClassCodeInectionList.size() == 0 )
    {
      // no code to inject 
      // return;
    }
    CodeBlock methodCodeBlock = aMethod.getMethodBody().getCodeblock();
    String codesKey_lang = ""; // the type of a language that the method belongs to
    ArrayList<String> methodCodeWithLabels = methodCodeBlock.getCodeWithLabels(codesKey_lang);
    ArrayList<Integer> indexToRemoveList = new ArrayList<Integer>();
    for (CodeInjection codeInjectionItem: uClassCodeInectionList)
    {
    	// the condition below keeps only codeInjection item(s) which has code labels.
      // also, codeInjection(s) that has been processed should not be processed again.
      if(!codeInjectionItem.hasCodeLabel() || codeInjectionItem.getCodeBlockProcessed() ) 
        continue;
      //else 
      String methodLabelToLookat = codeInjectionItem.getInjectionlabel();
      String codeToAdd = codeInjectionItem.getCode(codesKey_lang);

    	if (codeInjectionItem.getType().equals("around"))
      {
        String[] BoundLabels = methodLabelToLookat.split("-");
        String firstLabel = BoundLabels[0]+":";
        String SecondLabel = BoundLabels[1]; 
        String[] codeToInjectArray = codeToAdd.split("around_proceed:");
        String afterCodeSegment = codeToInjectArray[0];
        String beforeCodeSegment = codeToInjectArray[1];

        int afterIndex = methodCodeWithLabels.indexOf(firstLabel);
        int beforeIndex = methodCodeWithLabels.indexOf(SecondLabel);
        methodCodeWithLabels.add(afterIndex+1, "\n"+afterCodeSegment + "\n");
        methodCodeWithLabels.add(beforeIndex+1, "\n"+beforeCodeSegment + "\n");
      }
      else {
        int indexOfLabel = methodCodeWithLabels.indexOf(methodLabelToLookat);
        if (indexOfLabel == -1) // the method does not contain the required label
        {
          return;// raise error 
          // raise warning 
        }
        else if (codeInjectionItem.getType().equals("before"))
        {
          methodCodeWithLabels.add(indexOfLabel, "\n"+codeToAdd + "\n");
        }
        else if (codeInjectionItem.getType().equals("after"))
        {
          if(indexOfLabel < methodCodeWithLabels.size())
            methodCodeWithLabels.add(indexOfLabel+1, "\n"+codeToAdd + "\n");
          else
            methodCodeWithLabels.add("\n"+codeToAdd + "\n");
        }
      }

      // at the end, remove the codeInjection belongs to labeled aspect
      // otherwise it will be added to the code when handling aspects 
      //uClassCodeInectionList.remove(codeInjectionItem); // causes error:ConcurrentModificationException
      //indexToRemoveList.add(uClassCodeInectionList.indexOf(codeInjectionItem));
      // update the method code with addition 
      String resultCode="";
      for (String stringItem : methodCodeWithLabels)
      {
        resultCode += stringItem ;
      }
      aMethod.getMethodBody().getCodeblock().setCode(codesKey_lang, resultCode);
      codeInjectionItem.setCodeBlockProcessed(true);
    }
  }
  /*
   * Issue 1008 - A helper function to determine if a class uses an enum defined in the model
   */
  private boolean classUsesEnum(String enumName, UmpleClass uClass) 
  {
    // Check if the class has any attributes that use the enum
     for (Attribute a : uClass.getAttributes()) {
       if (a.getType().equals(enumName)) {
         return true;
       }
     }
     
     // Check if the class has any methods that use the enum as their return type, or as parameters
     for (Method m : uClass.getMethods()) {
       if (m.getType().equals(enumName)) {
         return true;
       } else {
         for (MethodParameter p : m.getMethodParameters()) {
           if (p.getType().equals(enumName)) {
             return true;
           }
         }
       }
      }
     
    // Check if the class has any event methods that use the enum in their parameters
    for (StateMachine sm : uClass.getStateMachines()) {
      for (Event e : sm.getEvents()) {
        for (MethodParameter p : e.getParams()) {
          if (p.getType().contentEquals(enumName)) {
            return true;
          }
        }
      }
    }
    
    return false;
  }
   
    private String getDistributedMethodsCode(StringBuilder realSb, UmpleModel model,UmpleClass uClass)
    {if(uClass.getHasProxyPattern()||uClass.getIsDistributed()){
    realSb.append(TEXT_17);
    
    }return realSb.toString();
    }
    private String getProxyReferenceCode(StringBuilder realSb, UmpleModel model,UmpleClass uClass)
    {if(uClass.getIsDistributed()&&model.getDistributePattern()==1){
    realSb.append(TEXT_18);
    realSb.append(uClass.getName().substring(0,uClass.getName().length()-4));
    realSb.append(TEXT_19);
    realSb.append(uClass.getName().substring(0,uClass.getName().length()-4));
    realSb.append(TEXT_20);
    if (uClass.getExtendsClass()!=null && uClass.getExtendsClass().getIsDistributed())
  {
  
    realSb.append(TEXT_21);
    }
    realSb.append(TEXT_22);
    }return realSb.toString();
    }
  
    private String getMemberCode(StringBuilder realSb, UmpleModel model,UmpleClass uClass, GeneratedClass gClass, JavaGenerator gen, boolean isFirst)
  { 
    String self="this";
    
    if(uClass.getIsDistributed()&&model.getDistributePattern()==1)
      self="self";
    String isTransient="";
    if (uClass.getIsDistributed() && model.getDistributePattern()==0)
      isTransient=" transient ";
   
  // comment with the name of the test cases the class has 
  if(uClass.hasUmpleTestCases()){
  append(realSb,"\n\n  //------------------------\n");
  append(realSb,"  // {0} Testcases: \n", uClass.getName());
  append(realSb,"  //.........................\n");
  for(UmpleTestCase tc : uClass.getUmpleTestCases()){
  append(realSb,"  // test  {0} \n", tc.getName());      
  }
  append(realSb,"  //------------------------\n");
   }  
   
  
    /*members_AllStatics*/
    
{
  
  // Issue 322
  if(uClass.hasConstants()){
    appendln(realSb, " ");
    appendln(realSb, "  //------------------------");
    appendln(realSb, "  // STATIC VARIABLES");
    appendln(realSb, "  //------------------------");
    appendln(realSb, " ");

    for (Constant aConstant : uClass.getConstants())
    {
      if(aConstant.getIsInternal()){
        appendln(realSb, "private static final {0} {1} = {2};",aConstant.getType(), aConstant.getName(),aConstant.getValue());
      }
      else
      {
        appendln(realSb, "public static final {0} {1} = {2};",aConstant.getType(), aConstant.getName(),aConstant.getValue());
      }
    }
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
      appendln(realSb, "  //------------------------");
      appendln(realSb, "  // STATIC VARIABLES");
      appendln(realSb, "  //------------------------");
      isFirst = false;
    }
  
    if (av.isConstant())
    {
      appendln(realSb, "");
      if (av.numberOfComments() > 0 && av.numberOfRequirements() > 0) { List<Comment> toComment = new ArrayList<Comment>(av.getComments()); toComment.addAll(Requirement.convertToComment(av.getRequirements())); append(realSb, "\n  {0}\n", Comment.format("Attribute Javadoc", toComment)); }
      else if (av.numberOfComments() > 0) { append(realSb, "\n  {0}\n", Comment.format("Attribute Javadoc", av.getComments())); }
      else if (av.numberOfRequirements() > 0) { append(realSb, "\n  {0}\n", Requirement.format("Attribute Javadoc", av.getRequirements())); }
      if (av.getIsList())
      {
        append(realSb, "  public static final {0}[] {1} = {{2}};", gen.getType(av), av.getName(), gen.translate("parameterValue",av));
      }
      else 
      {
        append(realSb, "  public static final {0} {1} = {2};", gen.getType(av), av.getName(), gen.translate("parameterValue",av));
      }
    }
    else if (av.getIsAutounique())
    {
      String defaultValue = av.getValue() == null ? "1" : av.getValue();
      appendln(realSb, "");
      append(realSb, "  private static int next{0} = {1};", av.getUpperCaseName(), defaultValue);
    }
    else if (av.getIsUnique())
    {
      appendln(realSb, "");
      append(realSb, "  private static Map<{0}, {1}> {2} = new HashMap<{0}, {1}>();",
        av.getType(),
        av.getUmpleClass().getName(),
        gen.translate("uniqueMap", av));
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
      appendln(realSb, "");
      isFirst = false;
    }
    append(realSb, "  private static {0} theInstance = null;", uClass.getName());
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
    
    String type = gen.translate("type",av);
    String attribute = gen.translate("attributeOne",av);
    if (av.getIsList())
    {
      attribute = gen.translate("attributeMany",av);
      type = StringFormatter.format("List<{0}>",gen.translate("typeMany",av));
    }

    appendln(realSb, "");
    
    if("internal".equals(av.getModifier()))
    {
      if (av.numberOfComments() > 0 && av.numberOfRequirements() > 0) { List<Comment> toComment = new ArrayList<Comment>(av.getComments()); toComment.addAll(Requirement.convertToComment(av.getRequirements())); append(realSb, "\n  {0}\n", Comment.format("Attribute Javadoc", toComment)); }
      else if (av.numberOfComments() > 0) { append(realSb, "\n  {0}\n", Comment.format("Attribute Javadoc", av.getComments())); }
      else if (av.numberOfRequirements() > 0) { append(realSb, "\n  {0}\n", Requirement.format("Attribute Javadoc", av.getRequirements())); }
    }

    if (av.getIsInternalTransient()){ type="transient "+type; }
    else{type=isTransient+type;}
    append(realSb, "  private {0} {1};", type, attribute);
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
    if (av.numberOfComments() > 0 && av.numberOfRequirements() > 0) { List<Comment> toComment = new ArrayList<Comment>(av.getComments()); toComment.addAll(Requirement.convertToComment(av.getRequirements())); append(realSb, "\n  {0}", Comment.format("Attribute Javadoc", toComment)); }
    else if (av.numberOfComments() > 0) { append(realSb, "\n  {0}\n", Comment.format("Attribute Javadoc", av.getComments())); }
    else if (av.numberOfRequirements() > 0) { append(realSb, "\n  {0}\n", Requirement.format("Attribute Javadoc", av.getRequirements())); }
    append(realSb, "  private{1} int {0};", gen.translate("attributeOne",av),isTransient);
  }
  
  isFirst = true;
  for( TraceDirective td : uClass.getTraceDirectives() )
  {
	  for( TraceCondition traceCond : td.getCondition() )
	  {
		  if (isFirst && (traceCond.getConditionType().equals("until") ||  traceCond.getConditionType().equals("after")))
		  {
			  appendln(realSb, "");
			  append(realSb, "  //Trace Attributes");
			  isFirst = false;
		  }
		  if(traceCond.getConditionType().equals("until") )
		  {
			  for( AttributeTraceItem traceAttr : td.getAttributeTraceItems() )
			  {
				  for( UmpleVariable attr : traceAttr.getUmpleVariables() )
				  {
					  String attrName = gen.translate("attribute",(Attribute)attr);
					  attrName = attrName.substring(0,1).toUpperCase()+attrName.substring(1).toLowerCase();
					  appendln(realSb, "");
					  append(realSb, "  private{1} boolean {0} = true;", "trace" + attrName + "Until",isTransient);  
				  }
			  }  
		  }
		  if(traceCond.getConditionType().equals("after") )
		  {
			  for( AttributeTraceItem traceAttr : td.getAttributeTraceItems() )
			  {
				  for( UmpleVariable attr : traceAttr.getUmpleVariables() )
				  {
					  String attrName = gen.translate("attribute",(Attribute)attr);
					  attrName = attrName.substring(0,1).toUpperCase()+attrName.substring(1).toLowerCase();
					  appendln(realSb, "");
					  append(realSb, "  private{1} boolean {0} = false;", "trace" + attrName + "After",isTransient);  
				  }
			  }
		  }
		  
	  }
	  
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
  
    append(realSb, "\n  public enum {0} { {1} }", gen.translate("type", sm), gen.translate("listStates", sm));

    for (StateMachine nestedSm : allNested)
    {
      append(realSb, "\n  public enum {0} { {1} }", gen.translate("type", nestedSm), 
             gen.translate("listStates",nestedSm));
    }
    
    append(realSb, "\n  private{2} {0} {1};", gen.translate("type",sm), gen.translate("stateMachineOne", sm),isTransient);
    for (StateMachine nestedSm : allNested)
    {
      append(realSb, "\n  private{2} {0} {1};", gen.translate("type",nestedSm), gen.translate("stateMachineOne", nestedSm),isTransient);
      if(nestedSm.getContainsHistoryState())
      {
        append(realSb, "\n  private{2} {0} {1}H;", gen.translate("type",nestedSm), gen.translate("stateMachineOne", nestedSm),isTransient);
      }
      if(nestedSm.getContainsDeepHistoryState())
      {
        append(realSb, "\n  private{2} {0} {1}HStar;", gen.translate("type",nestedSm), gen.translate("stateMachineOne", nestedSm),isTransient);
      }
    }  
  }
  
  boolean foundQueued = false;
  for(StateMachine sm : uClass.getStateMachines())
  {
    if(sm.isQueued())
    {
      foundQueued = true;
    }
  }
  if(foundQueued == true)
  {
    append(realSb,"\n  ");
    append(realSb,"\n  //enumeration type of messages accepted by {0}", uClass.getName());
    append(realSb, "\n  protected enum MessageType { {0} }", gen.translate("listEventsForQSM",uClass));   
  }

  boolean foundQueuedSM = false;
  for(StateMachine sm : uClass.getStateMachines())
  {
    if(sm.isQueued())
    {
       foundQueuedSM = true;
    }
  }
  if(foundQueuedSM == true)
  {
    append(realSb,"\n  ");
    append(realSb,"\n  MessageQueue queue;");
    append(realSb,"\n  Thread removal;");
  } 
 
  boolean foundPooledSM = false;
  for(StateMachine sm : uClass.getStateMachines())
  {  
    if(sm.isPooled())
    {
      foundPooledSM = true;
    }
  }
  if(foundPooledSM == true)
  {
    append(realSb,"\n  ");
    append(realSb,"\n  MessagePool pool;");
    append(realSb,"\n  Thread removal;");
    append(realSb,"\n  ");
    append(realSb,"\n  //enumeration type of messages accepted by {0}", uClass.getName());
    append(realSb, "\n  protected enum MessageType { {0} }", gen.translate("listEventsForPooledSM",uClass));
  } 

  boolean foundPooled = false;
  for(StateMachine sm : uClass.getStateMachines())
  {
    if (sm.isPooled()){
      foundPooled = true;
    }
  }
  if(foundPooled == true)
  {
    append(realSb,"\n");
    append(realSb,"\n  // Map for a {0} pooled state machine that allows querying which events are possible in each map", uClass.getName());
    append(realSb,"\n");
    append(realSb,"\n  public static final Map<Object, HashSet<MessageType>> stateMessageMap = new HashMap<Object, HashSet<MessageType>>();");
    append(realSb,"\n  static {");
  }
   
  for(StateMachine sm : uClass.getStateMachines())
  {
    if(sm.isPooled())
    {
      append(realSb,"\n  {0}",gen.translate("listMessageTypesStates",sm));
    }
  }
  
  if(foundPooled == true)
  {
    append(realSb,"\n  }");
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
        append(realSb, "\n  {1}Thread {0} = null;", gen.translate("doActivityThread",activity),isTransient);
      }
    }
  }
}

    /*members_AllAssociations*/
    
{
  isFirst = true;
  for (AssociationVariable av : uClass.getAssociationVariables())
  {

    
    /*specializationCode*/
    
    AssociationVariable relatedAssociation = av.getRelatedAssociation();

    //Association relatedAssoc = uClass.getAssociation(uClass.indexOfAssociationVariable(av));
	  
	//boolean reqSuperCode = relatedAssoc.getEnd(av.getRelevantEnd()).getNeedsSuperCode();
	//boolean reqCommonCode = relatedAssoc.getEnd(av.getRelevantEnd()).getNeedsCommonCode();
	  
	boolean reqSuperCode = av.getNeedsSuperCode();
	boolean reqCommonCode = av.getNeedsCommonCode();  
	  
	if (reqSuperCode || reqCommonCode)
	{
	    continue;
	}

    
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
    
    //if (av.numberOfComments() > 0 && av.numberOfRequirements() > 0) { List<Comment> toComment = new ArrayList<Comment>(av.getComments()); toComment.addAll(Requirement.convertToComment(av.getRequirements())); append(realSb, "\n  {0}\n", Comment.format("Attribute Javadoc", toComment)); }
    //else if (av.numberOfComments() > 0) { append(realSb, "\n  {0}\n", Comment.format("Association Javadoc", av.getComments())); }
    //else if (av.numberOfRequirements() > 0) { append(realSb, "\n  {0}\n", Requirement.format("Association Javadoc", av.getRequirements())); }
    
    if (av.isOne())
    {
      	append(realSb, "  private{2} {0} {1};", gen.translate("type",av), gen.translate("attributeOne",av),isTransient);
    }
    else
    {    
      	append(realSb, "  private{2} List<{0}> {1};", gen.translate("typeMany",av), gen.translate("attributeMany",av),isTransient);
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
    append(realSb, "  private{0} int cachedHashCode;",isTransient);
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
      append(realSb, "  private{1} boolean {0};", gen.translate("attributeCanSet",av),isTransient);
    }
  }
  
  for (AssociationVariable av : uClass.getAssociationVariables())
  {

    
    /*specializationCode*/
    
    AssociationVariable relatedAssociation = av.getRelatedAssociation();

    //Association relatedAssoc = uClass.getAssociation(uClass.indexOfAssociationVariable(av));
	  
	//boolean reqSuperCode = relatedAssoc.getEnd(av.getRelevantEnd()).getNeedsSuperCode();
	//boolean reqCommonCode = relatedAssoc.getEnd(av.getRelevantEnd()).getNeedsCommonCode();
	  
	boolean reqSuperCode = av.getNeedsSuperCode();
	boolean reqCommonCode = av.getNeedsCommonCode();  
	  
	if (reqSuperCode || reqCommonCode)
	{
	    continue;
	}

    
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
      append(realSb, "  private{1} boolean {0};", gen.translate("associationCanSet",av),isTransient);
    }
  }
  
  for(String memberId : uClass.getKey().getMembers())
  {
    Attribute av = uClass.getAttribute(memberId);
    AssociationVariable as = uClass.getAssociationVariable(memberId);
    if (av != null  && !av.isImmutable())
    {
      appendln(realSb, "");
      append(realSb, "  private{1} boolean {0};", gen.translate("attributeCanSet",av),isTransient);
    }
    else if (as != null)
    {
      appendln(realSb, "");
      append(realSb, "  private{1} boolean {0};", gen.translate("associationCanSet",as),isTransient);
    }
  }
  
  for(StateMachine sm : uClass.getStateMachines())
  {
    for (Event e : sm.getEvents())
    {
      if (!e.getIsTimer())
      {
        continue;
      }
    
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
      append(realSb, "  private{1} TimedEventHandler {0};", gen.translate("eventHandler",e,sm),isTransient);
    }
  }

  for (StateMachine sm : uClass.getStateMachines())
  {
    if(!sm.getNestedStateMachines().isEmpty())
    {
      for (StateMachine nsm : sm.getNestedStateMachines())
      {
        for (Event event : nsm.getEvents())
        {
          if(!event.getIsTimer())
          {
            continue;
          }
         
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
          append(realSb, "  private{1} TimedEventHandler {0};", gen.translate("eventHandler", event),isTransient);
        }
      }
    }
  }
  for (Method m : uClass.getMethods())
  {
    if(m.getIsQueued())
    {
      if (isFirst)
      {
        isFirst = false;
        appendln(realSb, "");
        appendln(realSb, "");
        appendln(realSb,"  //Helper Variables");
      }
      append(realSb, "\n  protected enum QueuedMethod { {0} }", gen.translate("listQueuedMethods",uClass));
      appendln(realSb, "  QueuedMethodThread queuedMethodThread;");
      break;
    }
  }
}

    realSb.append(TEXT_23);
    return realSb.toString();
    }
  private UmpleClass globalUmpleClass = null;
  public Map<String,UncaughtException> uncaughtExceptions = new HashMap<String,UncaughtException>();
   
  
  
    private String getConstructorCode(StringBuilder realSb, UmpleModel model,UmpleClass uClass, GeneratedClass gClass, JavaGenerator gen, boolean isFirst, boolean isFake)
  {
    Integer baseJavaLine = realSb.toString().split("\\n").length;
    boolean reqSuperCode, reqCommonCode;
    AssociationVariable relatedAssociation;
    Association relatedAssoc;
    realSb.append(TEXT_24);
    /*constructor_Declare_All*/
    
  boolean isOneToOne = false;

  for (AssociationVariable av : uClass.getAssociationVariables()) 
  {

   
    /*specializationCode_Constructor*/
    
    relatedAssociation = av.getRelatedAssociation();
    
    //relatedAssoc = uClass.getAssociation(uClass.indexOfAssociationVariable(av));

    //reqSuperCode = relatedAssoc.getEnd(av.getRelevantEnd()).getNeedsSuperCode();
    //reqCommonCode = relatedAssoc.getEnd(av.getRelevantEnd()).getNeedsCommonCode();
    
    reqSuperCode = av.getNeedsSuperCode();
	reqCommonCode = av.getNeedsCommonCode(); 
    
    if (reqSuperCode || reqCommonCode)
    {
      continue;
    }
    

    

    if (av.isOnlyOne() && relatedAssociation.isOnlyOne() && av.getIsNavigable() && relatedAssociation.getIsNavigable())
    {
      isOneToOne = true;
      break;
    }
  }
  String componentSignature="";
  String componentSignatureCaller="";
  String distributedConstructorCheckCode="";
  String lastArgumentComma="";
  if(uClass.getIsDistributed()&&model.getDistributePattern()==0)
  {    
    if(!uClass.isRoot()&& uClass.getExtendsClass().getIsDistributed())
    {
      if (!gClass.getParentClass().getLookup("constructorSignature_caller").equals(""))
        componentSignatureCaller=",umpleComponent";
      else
        componentSignatureCaller="umpleComponent";  
    }
    if(!gClass.getLookup("constructorSignature").equals(""))
    {
      lastArgumentComma=",";
      componentSignature=", UmpleRuntime.UmpleComponent umpleComponent";      
    }
    else
    {
      componentSignature="UmpleRuntime.UmpleComponent umpleComponent";
    }  
  } 
  
    /*constructor_DeclareDefault*/
    
  // NOTE: THE BELOW CODE SHOULD BE REMOVED AFTER REFACTORING.
  // Code introduced in PR#: 1527. Should be removed when Issue#1529 is resolved. 
  if(Arrays.toString(uClass.getDisableAutogeneratedMethodList()).contains("constructor"))
  {
    append(realSb, "  // Default constructor has been disabled.  \n");
    return realSb.toString(); 
  }
  // END OF NOTE. 
  String customConstructorPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before","constructor"));
  String customConstructorPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after","constructor"));  
  String accessibility = uClass.getIsSingleton() ? "private" : "public";
  append(realSb,"\n  {0} {1}({2}{3})",new Object[] {accessibility, uClass.getName(), gClass.getLookup("constructorSignature"),componentSignature});

  String extraNote = null;
  
  appendln(realSb, "");
  
  boolean hasBody = false;

  append(realSb, "  {");

  if (!uClass.isRoot() && !"interface".equals(uClass.getExtendsClass().getModifier()))
  {
    appendln(realSb, "");
    append(realSb, "    super({0}{1});", gClass.getParentClass().getLookup("constructorSignature_caller"),componentSignatureCaller);
    hasBody = true;
  }
  if(uClass.getIsDistributed()&&model.getDistributePattern()==0)
  {
    appendln(realSb, "");
    appendln(realSb, "    if(umpleComponent.getNode().getId()!=UmpleRuntime.getThisNodeId())");
    appendln(realSb, "    {");
    appendln(realSb, "      if(this.getClass()== {0}.class)",uClass.getName());
    appendln(realSb, "        UmpleRuntime.getInstance().new{0}({1}{2} umpleComponent, this);",uClass.getName(),gClass.getLookup("constructorSignature_caller"),lastArgumentComma);    
    appendln(realSb, "");
    appendln(realSb, "      return;");
    appendln(realSb, "    }");
    if(uClass.isRoot()||!uClass.getExtendsClass().getIsDistributed())
    {
      appendln(realSb, "    else");
      appendln(realSb, "    {");
      appendln(realSb, "      UmpleRuntime.getInstance().new{0}(this);",uClass.getName());
      appendln(realSb, "    }");
    }
    hasBody = true;
  }
  
  if (customConstructorPrefixCode != null)
  {
    addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customConstructorPrefixCode,uClass.getName());
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customConstructorPrefixCode, "    "));
    hasBody = true;
  }

  if (uClass.getKey().isProvided())
  {
    hasBody = true;
    appendln(realSb, "");
    append(realSb, "    cachedHashCode = -1;");
  }
  
  for(String memberId : uClass.getKey().getMembers())
  {
    Attribute av = uClass.getAttribute(memberId);
    AssociationVariable as = uClass.getAssociationVariable(memberId);
    if (av != null  && !av.isImmutable())
    {
      hasBody = true;
      appendln(realSb, "");
      append(realSb, "    {0} = true;", gen.translate("attributeCanSet",av));
    }
    else if (as != null)
    {
      hasBody = true;
      appendln(realSb, "");
      append(realSb, "    {0} = true;", gen.translate("associationCanSet",as));
    }
  } 
  
  for (Attribute av : uClass.getAttributes())
  {
    if (av.getIsAutounique() || av.getIsUnique() || av.isConstant() || "theInstance".equals(gen.translate("attributeOne",av)) || av.getIsDerived())
    {
      continue;
    }
    
    List<TraceItem> traceItems= av.getTraced("constructor",uClass);
    
    if (av.getIsList())
    {
      hasBody = true;
      
    /*constructor_AttributeAssignList*/
    realSb.append(TEXT_25);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_26);
    realSb.append(gen.translate("typeMany",av));
    realSb.append(TEXT_27);
    
    if (av.getValue() != null && av.getValue() != "") { 
      String[] values = av.getValue().split(",");
      if (values[0] != av.getValue()) {
        for (String value : values) { 
          value = value.replaceAll("(?<!new)\\s+","");
    realSb.append(TEXT_28);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_29);
    realSb.append(value);
    realSb.append(TEXT_30);
    }}}
    
    }
    else if ("defaulted".equals(av.getModifier()))
    {
      hasBody = true;
      
    /*constructor_AttributeAssignDefaulted*/
    realSb.append(TEXT_31);
    realSb.append(gen.translate("resetMethod",av));
    realSb.append(TEXT_32);
     
    }
    else if (av.isImmutable() && av.getIsLazy())
    {
      hasBody = true;
      
    /*constructor_AttributeUnassignedImmutable*/
    realSb.append(TEXT_33);
    realSb.append(gen.translate("attributeCanSet",av));
    realSb.append(TEXT_34);
    
    }
    else if (av.isImmutable())
    {
      hasBody = true;
      
    /*constructor_AttributeAssignImmutable*/
    
  String parameterLookup = av.getValue() == null ? "parameterOne" : "parameterValue";

    realSb.append(TEXT_35);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_36);
    realSb.append(gen.translate(parameterLookup,av));
    realSb.append(TEXT_37);
     
    }
    else
    {
      hasBody = true;
      if(!av.getIsLazy()){
         
    /*constructor_AttributeAssign*/
    
  String parameterLookup = av.getValue() == null || av.getModifier().equals("fixml") ? "parameterOne" : "parameterValue";

    realSb.append(TEXT_38);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_39);
    realSb.append(gen.translate(parameterLookup,av));
    realSb.append(TEXT_40);
    
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
  	   defaultValue = "null";
     }
     else if(av.getType().equals("Double") || av.getType().equals("Integer"))
     {
       defaultValue = "0";
     }
     else if(av.getType().equals("Float"))
     {
  	   defaultValue = "0.0f";
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
    realSb.append(TEXT_41);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_42);
    realSb.append(defaultValue);
    realSb.append(TEXT_43);
    } 
    
      }
    }
    
    if(!traceItems.isEmpty())
    {

    realSb.append(TEXT_44);
     for( TraceItem traceItem : traceItems ) 
    realSb.append(traceItem.trace(gen,av,"at_p",uClass));
    realSb.append(TEXT_45);
     for( TraceItem traceItem : traceItems ) 
    realSb.append(traceItem.getPeriodClause());
    realSb.append(TEXT_46);
    
    }
  }

  for (Attribute av : uClass.getAttributes())
  {
    if (av.getIsAutounique())
    {
      hasBody = true;
      
    /*constructor_AttributeAssignAutounique*/
    realSb.append(TEXT_47);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_48);
    realSb.append(gen.translate("parameterNext",av));
    realSb.append(TEXT_49);
    
    }
    else if (av.getIsUnique())
    {
   	  hasBody = true;
   	  
    /*constructor_AttributeAssignUnique*/
    realSb.append(TEXT_50);
    realSb.append(gen.translate("setMethod", av));
    realSb.append(TEXT_51);
    realSb.append(gen.translate("parameterOne", av));
    realSb.append(TEXT_52);
    realSb.append(av.getName());
    realSb.append(TEXT_53);
    
    }
  }
  
  for (AssociationVariable av : uClass.getAssociationVariables())
  {

    
    /*specializationCode_Constructor*/
    
    relatedAssociation = av.getRelatedAssociation();
    
    //relatedAssoc = uClass.getAssociation(uClass.indexOfAssociationVariable(av));

    //reqSuperCode = relatedAssoc.getEnd(av.getRelevantEnd()).getNeedsSuperCode();
    //reqCommonCode = relatedAssoc.getEnd(av.getRelevantEnd()).getNeedsCommonCode();
    
    reqSuperCode = av.getNeedsSuperCode();
	reqCommonCode = av.getNeedsCommonCode(); 
    
    if (reqSuperCode || reqCommonCode)
    {
      continue;
    }
    

    

    if (!av.getIsNavigable() || !av.isImmutable())
    {
      continue;
    }
    append(realSb, "\n    {0} = true;", gen.translate("associationCanSet",av));
  }
  boolean doneOnce=false;
  String firstSorted = "";
  for (AssociationVariable av : uClass.getAssociationVariables()) 
  {

    
    /*specializationCode_Constructor*/
    
    relatedAssociation = av.getRelatedAssociation();
    
    //relatedAssoc = uClass.getAssociation(uClass.indexOfAssociationVariable(av));

    //reqSuperCode = relatedAssoc.getEnd(av.getRelevantEnd()).getNeedsSuperCode();
    //reqCommonCode = relatedAssoc.getEnd(av.getRelevantEnd()).getNeedsCommonCode();
    
    reqSuperCode = av.getNeedsSuperCode();
	reqCommonCode = av.getNeedsCommonCode(); 
    
    if (reqSuperCode || reqCommonCode)
    {
      continue;
    }
    

    

  	if (av.isOnlyOne() && av.getRelatedAssociation().isMany() && av.getRelatedAssociation().isSorted() && av.getIsNavigable())
  	{
  		if("".equals(firstSorted))
  		{
  			firstSorted = gen.translate("attributeOne",av) + "=" + gen.translate("parameterOne",av) + ";";
  		}
  		else
  		{
  			if(!doneOnce)
  			{
  				append(realSb,"\n    {0}\n    {1}\n    {2}","// Direct set of variable needed to ensure consistency","// for multiple sorted associations",firstSorted);
  				doneOnce = true;
  			}	
  			append(realSb,"\n    {0}={1};", gen.translate("attributeOne",av),gen.translate("parameterOne",av));
    	}
  	}
  }
  for (AssociationVariable av : uClass.getAssociationVariables()) 
  {
    
    /*specializationCode_Constructor*/
    
    relatedAssociation = av.getRelatedAssociation();
    
    //relatedAssoc = uClass.getAssociation(uClass.indexOfAssociationVariable(av));

    //reqSuperCode = relatedAssoc.getEnd(av.getRelevantEnd()).getNeedsSuperCode();
    //reqCommonCode = relatedAssoc.getEnd(av.getRelevantEnd()).getNeedsCommonCode();
    
    reqSuperCode = av.getNeedsSuperCode();
	reqCommonCode = av.getNeedsCommonCode(); 
    
    if (reqSuperCode || reqCommonCode)
    {
      continue;
    }
    

    
    
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
    realSb.append(TEXT_54);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_55);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_56);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_57);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_58);
    
      }
      else if (av.isOptionalOne() && av.isImmutable())
      {
        hasBody = true;
        
    /*constructor_AssociationAssignImmutableOptionalOne*/
       
    append(realSb, "\n    {0}({1});", gen.translate("setMethod",av), gen.translate("parameterOne",av));

    
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
  

    realSb.append(TEXT_59);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_60);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_61);
    realSb.append(gen.translate("didAddMany",av));
    realSb.append(TEXT_62);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_63);
    realSb.append(gen.translate("parameterAll",av));
    realSb.append(TEXT_64);
    realSb.append(gen.translate("didAddMany",av));
    realSb.append(TEXT_65);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_66);
    realSb.append(requiredNumber);
    realSb.append(TEXT_67);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_68);
    
      }
      else if (av.isOptionalN() && av.isImmutable())
      {
        hasBody = true;
        
    /*constructor_AssociationAssignImmutableOptionalN*/
     String requiredNumber = StringFormatter.format("{0}", av.getMultiplicity().getUpperBound()); 
    realSb.append(TEXT_69);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_70);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_71);
    realSb.append(gen.translate("didAddMany",av));
    realSb.append(TEXT_72);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_73);
    realSb.append(gen.translate("parameterAll",av));
    realSb.append(TEXT_74);
    realSb.append(gen.translate("didAddMany",av));
    realSb.append(TEXT_75);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_76);
    realSb.append(requiredNumber);
    realSb.append(TEXT_77);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_78);
    
      }
      else if (av.isMany() && av.isImmutable())
      {
      	hasBody = true;
        
    /*constructor_AssociationAssignImmutableOptionalMany*/
    realSb.append(TEXT_79);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_80);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_81);
    realSb.append(gen.translate("didAddMany",av));
    realSb.append(TEXT_82);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_83);
    realSb.append(gen.translate("parameterAll",av));
    realSb.append(TEXT_84);
    realSb.append(gen.translate("didAddMany",av));
    realSb.append(TEXT_85);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_86);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_87);
    
      }
      else if (av.isMany())
      {
        hasBody = true;
        
    /*constructor_AssociationAssignOptionalMany*/
    realSb.append(TEXT_88);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_89);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_90);
    
      }
      continue;
    }
    
    if (av.isOnlyOne() && relatedAssociation.isOnlyOne())
    {
      hasBody = true;
      
    /*constructor_AssociationAssignOneToOne*/
    realSb.append(TEXT_91);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_92);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_93);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_94);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_95);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_96);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_97);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_98);
    
    }
    else if ((av.isMN() || av.isN()) && (relatedAssociation.isMandatory() || relatedAssociation.isOptionalN()))
    {
      hasBody = true;
      
    /*constructor_AssociationAssignOptionalMany*/
    realSb.append(TEXT_88);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_89);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_90);
    
    }
    else
    {
      
    /*constructor_AssociationAssignDefault*/
    
  if (!av.getIsNavigable())
  {
    continue;
  }

  // if it's a specialization, skip the association code for the av
  if ( reqSuperCode || reqCommonCode )
  {
    continue;
  }

  if (av.isOnlyOne())
  {
    
    /*constructor_AssociationAssignOne*/
    realSb.append(TEXT_99);
    realSb.append(gen.translate("didAdd",av));
    realSb.append(TEXT_100);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_101);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_102);
    realSb.append(gen.translate("didAdd",av));
    realSb.append(TEXT_103);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_104);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_105);
    
  }
  else if (av.isOptionalMany())
  {
    appendln(realSb,"");
    append(realSb, "    {0} = new ArrayList<{1}>();", gen.translate("associationMany",av), gen.getType(av));
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
  

    realSb.append(TEXT_59);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_60);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_61);
    realSb.append(gen.translate("didAddMany",av));
    realSb.append(TEXT_62);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_63);
    realSb.append(gen.translate("parameterAll",av));
    realSb.append(TEXT_64);
    realSb.append(gen.translate("didAddMany",av));
    realSb.append(TEXT_65);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_66);
    realSb.append(requiredNumber);
    realSb.append(TEXT_67);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_68);
    
  }
  else if (av.getMultiplicity().getLowerBound() > 0)
  {
    
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_106);
    realSb.append(gen.getType(av));
    realSb.append(TEXT_107);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_108);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_109);
    
  }
  else
  {
    continue;
  }
  hasBody = true;

    
    }
  }
  
  boolean foundQueued=false;
  boolean foundPooled=false;
  boolean foundQueuedMethod=false;
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
    realSb.append(TEXT_110);
    realSb.append(gen.translate("setMethod",nestedSm));
    realSb.append(TEXT_111);
    realSb.append(gen.translate("type",nestedSm));
    realSb.append(TEXT_112);
    realSb.append(gen.translate("stateNull",nestedSm));
    realSb.append(TEXT_113);
    if (nestedSm.getContainsDeepHistoryState()){
    realSb.append(TEXT_114);
    realSb.append(gen.translate("stateMachineOne",nestedSm));
    realSb.append(TEXT_115);
    realSb.append(gen.translate("type",nestedSm));
    realSb.append(TEXT_116);
    realSb.append(nestedSm.getState(1).getName());
    realSb.append(TEXT_117);
    }
    realSb.append(TEXT_118);
    if (nestedSm.getContainsHistoryState()){
    realSb.append(TEXT_119);
    realSb.append(gen.translate("stateMachineOne",nestedSm));
    realSb.append(TEXT_120);
    realSb.append(gen.translate("type",nestedSm));
    realSb.append(TEXT_121);
    realSb.append(nestedSm.getState(1).getName());
    realSb.append(TEXT_122);
    }
    
    }
    
    /*constructor_StateMachineAssignDefault*/
    realSb.append(TEXT_123);
    realSb.append(gen.translate("setMethod",sm));
    realSb.append(TEXT_124);
    realSb.append(gen.translate("type",sm));
    realSb.append(TEXT_125);
    realSb.append(gen.translate("stateOne",state));
    realSb.append(TEXT_126);
    
    for (StateMachine smq : uClass.getStateMachines())
    {
      if (smq.isQueued() || smq.isPooled())
      {
        //nothing to do
      }
    }

    
    if (sm.isQueued())
    {
      foundQueued = true;
    }
    if (sm.isPooled())
    {
      foundPooled = true;
    }
  }
  for(Method m : uClass.getMethods())
  {
    if(m.getIsQueued())
    {
      foundQueuedMethod = true;
      hasBody = true;
      break;
    }
  }
  if(foundQueued == true)
  {
    append(realSb,"\n    queue = new MessageQueue();");
    append(realSb,"\n    removal=new Thread(this);");
    append(realSb,"\n    //start the thread of {0}", uClass.getName());
    append(realSb,"\n    removal.start();");
  }
  else if(foundPooled == true)
  {
    append(realSb,"\n    pool = new MessagePool();");
    append(realSb,"\n    removal=new Thread(this);");
    append(realSb,"\n    //start the thread of {0}", uClass.getName());
    append(realSb,"\n    removal.start();");
  }
  if(foundQueuedMethod)
  {
    append(realSb,"\n    queuedMethodThread = new QueuedMethodThread();");
  }
  
  if (customConstructorPostfixCode != null)
  {
    addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customConstructorPostfixCode,uClass.getName());
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
  
  // fixml attribute (create empty constructor)
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
		  appendln(realSb,"");
		  appendln(realSb,"");
		  appendln(realSb,"  {0} {1}()",new Object[] {accessibility, uClass.getName()});
		  appendln(realSb,"  {");
		  for (Attribute a : uClass.getAttributes())
			  if ("fixml".equals(a.getModifier()) && a.getValue() != null )
				  append(realSb, "    {0} = {1};\n", a.getName(),a.getValue());
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
	  appendln(realSb,"");
	  appendln(realSb,"");
	  appendln(realSb,"  {0} {1}()",new Object[] {accessibility, uClass.getName()});
	  appendln(realSb,"  {");
	  for( CodeInjection ci  : uClass.getCodeInjections())
		  if( ci.getOperation().equals("emptyConstructor"))
			  appendln(realSb,"    {0}",ci.getCode());
	  appendln(realSb,"  }");
  }

  if (uClass.getIsSingleton())
  {
    appendln(realSb, "");
    
    /*constructor_Singleton*/
    realSb.append(TEXT_127);
    realSb.append(uClass.getName());
    realSb.append(TEXT_128);
    realSb.append(uClass.getName());
    realSb.append(TEXT_129);
    
  }

    
  if (isOneToOne)
  {
    
    /*constructor_DeclareOneToOne*/
    
  
  String signature = gClass.getLookup("constructorSignature_mandatory");
  hasBody = false;

    realSb.append(TEXT_130);
    realSb.append(uClass.getName());
    realSb.append(TEXT_131);
    realSb.append(gen.translate("constructorMandatory",uClass));
    realSb.append(componentSignature);
    realSb.append(TEXT_132);
    

  if (!uClass.isRoot())
  {
    appendln(realSb, "");
    append(realSb, "    super({0}{1});", gClass.getParentClass().getLookup("constructorSignature_caller"),componentSignatureCaller);
    hasBody = true;
  }
  if(uClass.getIsDistributed()&&model.getDistributePattern()==0)
  {     
    appendln(realSb, "");
    appendln(realSb, "    if(umpleComponent.getNode().getId()!=UmpleRuntime.getThisNodeId())");
    appendln(realSb, "    {");
    appendln(realSb, "      if(this.getClass()== {0}.class)",uClass.getName());
    appendln(realSb, "        UmpleRuntime.getInstance().new{0}({1}{2} umpleComponent, this);",uClass.getName(),gClass.getLookup("constructorSignature_caller"),lastArgumentComma);    
    appendln(realSb, "");
    appendln(realSb, "      return;");
    appendln(realSb, "    }");
    if(uClass.isRoot()||!uClass.getExtendsClass().getIsDistributed())
    {
      appendln(realSb, "    else");
      appendln(realSb, "    {");
      appendln(realSb, "      UmpleRuntime.getInstance().new{0}(this);",uClass.getName());
      appendln(realSb, "    }");
    }
    hasBody = true;
  }
  if (customConstructorPrefixCode != null) 
  {
    addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customConstructorPrefixCode,uClass.getName());
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customConstructorPrefixCode, "    "));
    hasBody = true;
  }
  
  for (Attribute av : uClass.getAttributes())
  {
    if (av.getIsAutounique() || av.isConstant() || "theInstance".equals(gen.translate("attributeOne",av)))
    {
      continue;
    }
  
    if (av.getIsList())
    {
      hasBody = true;
      
    /*constructor_AttributeAssignList*/
    realSb.append(TEXT_25);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_26);
    realSb.append(gen.translate("typeMany",av));
    realSb.append(TEXT_27);
    
    if (av.getValue() != null && av.getValue() != "") { 
      String[] values = av.getValue().split(",");
      if (values[0] != av.getValue()) {
        for (String value : values) { 
          value = value.replaceAll("(?<!new)\\s+","");
    realSb.append(TEXT_28);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_29);
    realSb.append(value);
    realSb.append(TEXT_30);
    }}}
    
    }
    else if (av.getModifier().equals("defaulted"))
    {
      hasBody = true;
      
    /*constructor_AttributeAssignDefaulted*/
    realSb.append(TEXT_31);
    realSb.append(gen.translate("resetMethod",av));
    realSb.append(TEXT_32);
     
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
  	   defaultValue = "null";
     }
     else if(av.getType().equals("Double") || av.getType().equals("Integer"))
     {
       defaultValue = "0";
     }
     else if(av.getType().equals("Float"))
     {
  	   defaultValue = "0.0f";
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
    realSb.append(TEXT_41);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_42);
    realSb.append(defaultValue);
    realSb.append(TEXT_43);
    } 
    
    }
    else if(av.getIsUnique())
    {
      hasBody = true;
      
    /*constructor_AttributeAssignUnique*/
    realSb.append(TEXT_50);
    realSb.append(gen.translate("setMethod", av));
    realSb.append(TEXT_51);
    realSb.append(gen.translate("parameterOne", av));
    realSb.append(TEXT_52);
    realSb.append(av.getName());
    realSb.append(TEXT_53);
    
    }
    else
    {
      hasBody = true;
      
    /*constructor_AttributeAssign*/
    
  String parameterLookup = av.getValue() == null || av.getModifier().equals("fixml") ? "parameterOne" : "parameterValue";

    realSb.append(TEXT_38);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_39);
    realSb.append(gen.translate(parameterLookup,av));
    realSb.append(TEXT_40);
    
    }
  }

  for (Attribute av : uClass.getAttributes())
  {
    if (av.getIsAutounique())
    {
      hasBody = true;
      
    /*constructor_AttributeAssignAutounique*/
    realSb.append(TEXT_47);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_48);
    realSb.append(gen.translate("parameterNext",av));
    realSb.append(TEXT_49);
    
    }
  }
  
  for (AssociationVariable av : uClass.getAssociationVariables()) 
  {
    
    /*specializationCode_Constructor*/
    
    relatedAssociation = av.getRelatedAssociation();
    
    //relatedAssoc = uClass.getAssociation(uClass.indexOfAssociationVariable(av));

    //reqSuperCode = relatedAssoc.getEnd(av.getRelevantEnd()).getNeedsSuperCode();
    //reqCommonCode = relatedAssoc.getEnd(av.getRelevantEnd()).getNeedsCommonCode();
    
    reqSuperCode = av.getNeedsSuperCode();
	reqCommonCode = av.getNeedsCommonCode(); 
    
    if (reqSuperCode || reqCommonCode)
    {
      continue;
    }
    

    
    
    if (av.isOnlyOne() && relatedAssociation.isOnlyOne())
    {
      hasBody = true;
      
    /*constructor_AssociationCreateOneToOne*/
    realSb.append(TEXT_133);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_134);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_135);
    realSb.append(gen.translate("callerArgumentsForMandatory",relatedAssociation));
    realSb.append(TEXT_136);
    
    }
    else if ((av.isMN() || av.isN()) && (relatedAssociation.isMandatory() || relatedAssociation.isOptionalN()))
    {
      hasBody = true;
      
    /*constructor_AssociationAssignOptionalMany*/
    realSb.append(TEXT_88);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_89);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_90);
    
    }
    else
    {
      hasBody = true;
      
    /*constructor_AssociationAssignDefault*/
    
  if (!av.getIsNavigable())
  {
    continue;
  }

  // if it's a specialization, skip the association code for the av
  if ( reqSuperCode || reqCommonCode )
  {
    continue;
  }

  if (av.isOnlyOne())
  {
    
    /*constructor_AssociationAssignOne*/
    realSb.append(TEXT_99);
    realSb.append(gen.translate("didAdd",av));
    realSb.append(TEXT_100);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_101);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_102);
    realSb.append(gen.translate("didAdd",av));
    realSb.append(TEXT_103);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_104);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_105);
    
  }
  else if (av.isOptionalMany())
  {
    appendln(realSb,"");
    append(realSb, "    {0} = new ArrayList<{1}>();", gen.translate("associationMany",av), gen.getType(av));
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
  

    realSb.append(TEXT_59);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_60);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_61);
    realSb.append(gen.translate("didAddMany",av));
    realSb.append(TEXT_62);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_63);
    realSb.append(gen.translate("parameterAll",av));
    realSb.append(TEXT_64);
    realSb.append(gen.translate("didAddMany",av));
    realSb.append(TEXT_65);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_66);
    realSb.append(requiredNumber);
    realSb.append(TEXT_67);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_68);
    
  }
  else if (av.getMultiplicity().getLowerBound() > 0)
  {
    
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_106);
    realSb.append(gen.getType(av));
    realSb.append(TEXT_107);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_108);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_109);
    
  }
  else
  {
    continue;
  }
  hasBody = true;

    
    }
  }
  
  if (customConstructorPostfixCode != null) 
  {
    addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customConstructorPostfixCode,uClass.getName());
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

    
  }


    realSb.append(TEXT_137);
    return realSb.toString();
    } 
    private String getAttributeCode(StringBuilder realSb, UmpleModel model,UmpleClass uClass, GeneratedClass gClass, JavaGenerator gen, boolean isFirst, boolean isFake)
  { 
    String umpleSourceFile = "";
    Integer baseJavaLine = realSb.toString().split("\\n").length;
    realSb.append(TEXT_138);
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
        
    realSb.append(TEXT_139);
    /*attribute_SetImmutable*/
    realSb.append(TEXT_140);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_141);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_142);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_143);
     if (customSetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_144);
    realSb.append(gen.translate("attributeCanSet",av));
    realSb.append(TEXT_145);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPre()?traceItem.trace(gen, av,"at_s", uClass,gen.translate("parameterOne",av)):""));
    realSb.append(TEXT_146);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_147);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_148);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPost()?traceItem.trace(gen, av,"at_s", uClass):""));
    realSb.append(TEXT_149);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_150);
    
      }
    }
    else if (av.getModifier().equals("defaulted"))
    {
      
    realSb.append(TEXT_151);
    /*attribute_SetDefaulted*/
    realSb.append(TEXT_152);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_153);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_154);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_155);
     if (customSetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_156);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPre()?traceItem.trace(gen, av,"at_s", uClass,gen.translate("parameterOne",av)):""));
    realSb.append(TEXT_157);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_158);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_159);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPost()?traceItem.trace(gen, av,"at_s", uClass):""));
    realSb.append(TEXT_160);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_161);
    realSb.append(gen.translate("resetMethod",av));
    realSb.append(TEXT_162);
     if (customResetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customResetPrefixCode,gen.translate("resetMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customResetPrefixCode, "    ")); } 
    realSb.append(TEXT_163);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPre()?traceItem.trace(gen, av,"at_t", uClass,gen.translate("parameterOne",av)):""));
    realSb.append(TEXT_164);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_165);
    realSb.append(gen.translate("getDefaultMethod",av));
    realSb.append(TEXT_166);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPost()?traceItem.trace(gen, av,"at_t", uClass):""));
    realSb.append(TEXT_167);
     if (customResetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customResetPostfixCode,gen.translate("resetMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customResetPostfixCode, "    ")); } 
    realSb.append(TEXT_168);
    
    }
    else if (av.getIsList())
    {
      
    realSb.append(TEXT_169);
    /*attribute_SetMany*/
    realSb.append(TEXT_170);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_171);
    realSb.append(gen.translate("typeMany",av));
    realSb.append(TEXT_172);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_173);
     if (customAddPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_174);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPre()?traceItem.trace(gen, av,"at_a", uClass,gen.translate("parameterOne",av)):""));
    realSb.append(TEXT_175);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_176);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_177);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPost()?traceItem.trace(gen, av,"at_a", uClass):""));
    realSb.append(TEXT_178);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
    append(realSb, "{0}\n",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_179);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_180);
    realSb.append(gen.translate("typeMany",av));
    realSb.append(TEXT_181);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_182);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_183);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPre()?traceItem.trace(gen, av,"at_r", uClass,gen.translate("parameterOne",av)):""));
    realSb.append(TEXT_184);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_185);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_186);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPost()?traceItem.trace(gen, av,"at_r", uClass):""));
    realSb.append(TEXT_187);
     if (customRemovePostfixCode != null) {addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "{0}\n",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); }
    realSb.append(TEXT_188);
    
    }
    else
    {
      
    /*attribute_Set*/
    realSb.append(TEXT_189);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_190);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_191);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_192);
     if (customSetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_193);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPre()?traceItem.trace(gen, av,"at_s", uClass,gen.translate("parameterOne",av)):""));
    realSb.append(TEXT_194);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_195);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_196);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPost()?traceItem.trace(gen, av,"at_s", uClass):""));
    realSb.append(TEXT_197);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_198);
    
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
          
    realSb.append(TEXT_199);
    /*attribute_SetDefaulted_subclass*/
    realSb.append(TEXT_200);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_201);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_202);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_203);
     if (customSetPrefixCode != null) { 
      addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_204);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPre()?traceItem.trace(gen, av,"at_s", uClass,gen.translate("parameterOne",av)):""));
    realSb.append(TEXT_205);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_206);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_207);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPost()?traceItem.trace(gen, av,"at_s", uClass):""));
    realSb.append(TEXT_208);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_209);
    
        }
        else if (av.getIsList())
        {
          
    realSb.append(TEXT_210);
    /*attribute_SetMany_subclass*/
    realSb.append(TEXT_211);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_212);
    realSb.append(gen.translate("typeMany",av));
    realSb.append(TEXT_213);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_214);
     if (customAddPrefixCode != null) {
      addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_215);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPre()?traceItem.trace(gen, av,"at_a", uClass,gen.translate("parameterOne",av)):""));
    realSb.append(TEXT_216);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_217);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_218);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPost()?traceItem.trace(gen, av,"at_a", uClass):""));
    realSb.append(TEXT_219);
     if (customAddPostfixCode != null) {
      addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
      append(realSb, "{0}\n",GeneratorHelper.doIndent(customAddPostfixCode, "    "));
    } 
    realSb.append(TEXT_220);
    
        }
        else if(!av.isImmutable()||av.getIsLazy())//if(customSetPrefixCode!=null&&customSetPostfixCode!=null&&customSetPrefixCode.matches("[\\s]*if.*\\n[\\s]*.*"))
        {
          
    realSb.append(TEXT_221);
    /*attribute_Set_subclass*/
    realSb.append(TEXT_222);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_223);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_224);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_225);
     if (customSetPrefixCode != null) {
      addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_226);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPre()?traceItem.trace(gen, av,"at_s", uClass,gen.translate("parameterOne",av)):""));
    realSb.append(TEXT_227);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_228);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_229);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPost()?traceItem.trace(gen, av,"at_s", uClass):""));
    realSb.append(TEXT_230);
     if (customSetPostfixCode != null) {
      addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_231);
    
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
      
    realSb.append(TEXT_232);
    /*attribute_GetMany*/
    realSb.append(TEXT_233);
    realSb.append(gen.translate("typeMany",av));
    realSb.append(TEXT_234);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_235);
     if (customGetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPrefixCode,gen.translate("getMethod",av));
     append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_236);
    realSb.append(gen.translate("typeMany",av));
    realSb.append(TEXT_237);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_238);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_239);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_g", uClass):""));
    realSb.append(TEXT_240);
     if (customGetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPostfixCode,gen.translate("getMethod",av));
    append(realSb, "{0}\n",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    realSb.append(TEXT_241);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_242);
    realSb.append(gen.translate("typeMany",av));
    realSb.append(TEXT_243);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_244);
     if (customGetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetManyPrefixCode,gen.translate("getManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_245);
    realSb.append(gen.translate("typeMany",av));
    realSb.append(TEXT_246);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_247);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_248);
    realSb.append(gen.translate("typeMany",av));
    realSb.append(TEXT_249);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_250);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_ga", uClass):""));
    realSb.append(TEXT_251);
     if (customGetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetManyPostfixCode,gen.translate("getManyMethod",av)); 
    append(realSb, "{0}\n",GeneratorHelper.doIndent(customGetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_252);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_253);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_254);
     if (customNumberOfPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customNumberOfPrefixCode,gen.translate("numberOfMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customNumberOfPrefixCode, "    ")); } 
    realSb.append(TEXT_255);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_256);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_n", uClass, "number"):""));
    realSb.append(TEXT_257);
     if (customNumberOfPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customNumberOfPostfixCode,gen.translate("numberOfMethod",av));
    append(realSb, "{0}\n",GeneratorHelper.doIndent(customNumberOfPostfixCode, "    ")); } 
    realSb.append(TEXT_258);
    realSb.append(gen.translate("hasManyMethod",av));
    realSb.append(TEXT_259);
     if (customHasManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customHasManyPrefixCode,gen.translate("hasManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customHasManyPrefixCode, "    ")); } 
    realSb.append(TEXT_260);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_261);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_h", uClass):""));
    realSb.append(TEXT_262);
     if (customHasManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customHasManyPostfixCode,gen.translate("hasManyMethod",av)); 
    append(realSb, "{0}\n",GeneratorHelper.doIndent(customHasManyPostfixCode, "    ")); }
    realSb.append(TEXT_263);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_264);
    realSb.append(gen.translate("typeMany",av));
    realSb.append(TEXT_265);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_266);
     if (customIndexOfPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customIndexOfPrefixCode,gen.translate("indexOfMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customIndexOfPrefixCode, "    ")); } 
    realSb.append(TEXT_267);
    realSb.append(gen.translate("attributeMany",av));
    realSb.append(TEXT_268);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_269);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_i", uClass, gen.translate("parameterOne",av), "index"):""));
    realSb.append(TEXT_270);
     if (customIndexOfPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customIndexOfPostfixCode,gen.translate("indexOfMethod",av)); 
    append(realSb, "{0}\n",GeneratorHelper.doIndent(customIndexOfPostfixCode, "    ")); } 
    realSb.append(TEXT_271);
    
    }
    else 
    {

      if (av.getIsDerived() && (customGetPostfixCode != null || customGetPrefixCode != null))
      {
        
    realSb.append(TEXT_272);
    /*attribute_GetDerivedCodeInjection*/
     if (av.numberOfComments() > 0 && av.numberOfRequirements() > 0) { List<Comment> toComment = new ArrayList<Comment>(av.getComments()); toComment.addAll(Requirement.convertToComment(av.getRequirements())); append(realSb, "\n  {0}\n", Comment.format("Attribute Javadoc", toComment)); } 
     if (av.numberOfComments() > 0 && av.numberOfRequirements() == 0) { append(realSb, "\n  {0}\n", Comment.format("Attribute Javadoc", av.getComments())); } 
     if (av.numberOfComments() == 0 && av.numberOfRequirements() > 0) { append(realSb, "\n  {0}\n", Requirement.format("Attribute Javadoc", av.getRequirements())); } 
    realSb.append(umpleSourceFile);
    realSb.append(TEXT_273);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_274);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_275);
     if (customGetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPrefixCode,gen.translate("getMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_276);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_277);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_278);
    realSb.append(gen.translate("parameterValue",av));
    realSb.append(TEXT_279);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_g", uClass):""));
    realSb.append(TEXT_280);
     if (customGetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPostfixCode,gen.translate("getMethod",av));
    append(realSb, "{0}\n",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    realSb.append(TEXT_281);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_282);
    addUncaughtExceptionVariables(gen.translate("getMethod",av),av.getPosition().getFilename(),av.getPosition().getLineNumber(),realSb.toString().split("\\n").length-1,1);
    realSb.append(TEXT_283);
    
      }
      else if (av.getIsDerived())
      {
        
    /*attribute_GetDerived*/
     if (av.numberOfComments() > 0 && av.numberOfRequirements() > 0) { List<Comment> toComment = new ArrayList<Comment>(av.getComments()); toComment.addAll(Requirement.convertToComment(av.getRequirements())); append(realSb, "\n  {0}\n", Comment.format("Attribute Javadoc", toComment)); } 
     if (av.numberOfComments() > 0 && av.numberOfRequirements() == 0) { append(realSb, "\n  {0}\n", Comment.format("Attribute Javadoc", av.getComments())); } 
     if (av.numberOfComments() == 0 && av.numberOfRequirements() > 0) { append(realSb, "\n  {0}\n", Requirement.format("Attribute Javadoc", av.getRequirements())); } 
    realSb.append(umpleSourceFile);
    realSb.append(TEXT_284);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_285);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_286);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_g", uClass):""));
    realSb.append(TEXT_287);
    realSb.append(gen.translate("parameterValue",av));
    realSb.append(TEXT_288);
    addUncaughtExceptionVariables(gen.translate("getMethod",av),av.getPosition().getFilename(),av.getPosition().getLineNumber(),realSb.toString().split("\\n").length-1,1);
    realSb.append(TEXT_289);
    
      }
      else if (customGetPostfixCode != null)
      {
        
    realSb.append(TEXT_290);
    /*attribute_GetCodeInjection*/
    realSb.append(TEXT_291);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_292);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_293);
     if (customGetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPrefixCode,gen.translate("getMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_294);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_295);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_296);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_297);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_g", uClass):""));
    realSb.append(TEXT_298);
     if (customGetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPostfixCode,gen.translate("getMethod",av)); 
    append(realSb, "{0}\n",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    realSb.append(TEXT_299);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_300);
    
      }
      else
      {
        
    /*attribute_Get*/
     if (av.numberOfComments() > 0 && av.numberOfRequirements() > 0) { List<Comment> toComment = new ArrayList<Comment>(av.getComments()); toComment.addAll(Requirement.convertToComment(av.getRequirements())); append(realSb, "\n  {0}", Comment.format("Attribute Javadoc", toComment)); } 
     if (av.numberOfComments() > 0 && av.numberOfRequirements() == 0) { append(realSb, "\n  {0}", Comment.format("Attribute Javadoc", av.getComments())); } 
     if (av.numberOfComments() == 0 && av.numberOfRequirements() > 0) { append(realSb, "\n  {0}", Requirement.format("Attribute Javadoc", av.getRequirements())); } 
    realSb.append(umpleSourceFile);
    realSb.append(TEXT_301);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_302);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_303);
     if (customGetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPrefixCode,gen.translate("getMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_304);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_g", uClass):""));
    realSb.append(TEXT_305);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_306);
    
      }
      
      appendln(realSb, "");
      
      if (av.getModifier().equals("defaulted") && customGetDefaultPostfixCode != null)
      {
        
    realSb.append(TEXT_307);
    /*attribute_GetDefaultedCodeInjection*/
    realSb.append(TEXT_308);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_309);
    realSb.append(gen.translate("getDefaultMethod",av));
    realSb.append(TEXT_310);
     if (customGetDefaultPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPrefixCode,gen.translate("getDefaultMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetDefaultPrefixCode, "    ")); } 
    realSb.append(TEXT_311);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_312);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_313);
    realSb.append(gen.translate("parameterValue",av));
    realSb.append(TEXT_314);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_g", uClass):""));
    realSb.append(TEXT_315);
     if (customGetDefaultPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetDefaultPostfixCode,gen.translate("getDefaultMethod",av));
      append(realSb, "{0}\n",GeneratorHelper.doIndent(customGetDefaultPostfixCode, "    ")); } 
    realSb.append(TEXT_316);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_317);
    
      }
      else if (av.getModifier().equals("defaulted"))
      {
        
    realSb.append(TEXT_318);
    /*attribute_GetDefaulted*/
    realSb.append(TEXT_319);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_320);
    realSb.append(gen.translate("getDefaultMethod",av));
    realSb.append(TEXT_321);
     if (customGetDefaultPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPrefixCode,gen.translate("getMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetDefaultPrefixCode, "    ")); } 
    realSb.append(TEXT_322);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_g", uClass):""));
    realSb.append(TEXT_323);
    realSb.append(gen.translate("parameterValue",av));
    realSb.append(TEXT_324);
    
      }
      
      if (av.getIsUnique())
      {
        if (customGetUniquePostfixCode != null)
        {
          
    realSb.append(TEXT_325);
    /*attribute_GetUniqueCodeInjection*/
    realSb.append(TEXT_326);
    realSb.append(av.getUmpleClass().getName());
    realSb.append(TEXT_327);
    realSb.append(gen.translate("getUniqueMethod",av));
    realSb.append(TEXT_328);
    realSb.append(gen.translate("type", av));
    realSb.append(TEXT_329);
    realSb.append(gen.translate("parameterOne", av));
    realSb.append(TEXT_330);
     if (customGetUniquePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetUniquePrefixCode,gen.translate("getUniqueMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetUniquePrefixCode, "    ")); } 
    realSb.append(TEXT_331);
    realSb.append(av.getUmpleClass().getName());
    realSb.append(TEXT_332);
    realSb.append(gen.translate("parameterGetUnique",av));
    realSb.append(TEXT_333);
    realSb.append(gen.translate("uniqueMap",av));
    realSb.append(TEXT_334);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_335);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_g", uClass):""));
    realSb.append(TEXT_336);
     if (customGetUniquePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetUniquePostfixCode,gen.translate("getUniqueMethod",av)); 
    append(realSb, "{0}\n",GeneratorHelper.doIndent(customGetUniquePostfixCode, "    ")); } 
    realSb.append(TEXT_337);
    realSb.append(gen.translate("parameterGetUnique",av));
    realSb.append(TEXT_338);
    
        } 
        else 
        {
          
    realSb.append(TEXT_339);
    /*attribute_GetUnique*/
    realSb.append(TEXT_340);
    realSb.append(av.getUmpleClass().getName());
    realSb.append(TEXT_341);
    realSb.append(gen.translate("getUniqueMethod",av));
    realSb.append(TEXT_342);
    realSb.append(gen.translate("type", av));
    realSb.append(TEXT_343);
    realSb.append(gen.translate("parameterOne", av));
    realSb.append(TEXT_344);
     if (customGetUniquePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetUniquePrefixCode,gen.translate("getUniqueMethod",av));
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetUniquePrefixCode, "    ")); } 
    realSb.append(TEXT_345);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_g", uClass):""));
    realSb.append(TEXT_346);
    realSb.append(gen.translate("uniqueMap",av));
    realSb.append(TEXT_347);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_348);
    
        }
        if (customHasUniquePostfixCode != null)
        {
          
    realSb.append(TEXT_349);
    /*attribute_HasUniqueCodeInjection*/
    realSb.append(TEXT_350);
    realSb.append(gen.translate("hasUniqueMethod",av));
    realSb.append(TEXT_351);
    realSb.append(gen.translate("type", av));
    realSb.append(TEXT_352);
    realSb.append(gen.translate("parameterOne", av));
    realSb.append(TEXT_353);
     if (customHasUniquePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customHasUniquePrefixCode,gen.translate("hasUniqueMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customHasUniquePrefixCode, "    ")); } 
    realSb.append(TEXT_354);
    realSb.append(gen.translate("parameterHasUnique",av));
    realSb.append(TEXT_355);
    realSb.append(gen.translate("getUniqueMethod",av));
    realSb.append(TEXT_356);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_357);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_g", uClass):""));
    realSb.append(TEXT_358);
     if (customHasUniquePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customHasUniquePostfixCode,gen.translate("hasUniqueMethod",av)); 
    append(realSb, "{0}\n",GeneratorHelper.doIndent(customHasUniquePostfixCode, "    ")); } 
    realSb.append(TEXT_359);
    realSb.append(gen.translate("parameterHasUnique",av));
    realSb.append(TEXT_360);
    
        }
        else
        {
          
    realSb.append(TEXT_361);
    /*attribute_HasUnique*/
    realSb.append(TEXT_362);
    realSb.append(gen.translate("hasUniqueMethod",av));
    realSb.append(TEXT_363);
    realSb.append(gen.translate("type", av));
    realSb.append(TEXT_364);
    realSb.append(gen.translate("parameterOne", av));
    realSb.append(TEXT_365);
     if (customHasUniquePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customHasUniquePrefixCode,gen.translate("hasUniqueMethod",av));
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customHasUniquePrefixCode, "    ")); } 
    realSb.append(TEXT_366);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_g", uClass):""));
    realSb.append(TEXT_367);
    realSb.append(gen.translate("getUniqueMethod",av));
    realSb.append(TEXT_368);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_369);
    
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
        
    realSb.append(TEXT_290);
    /*attribute_GetCodeInjection*/
    realSb.append(TEXT_291);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_292);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_293);
     if (customGetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPrefixCode,gen.translate("getMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_294);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_295);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_296);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_297);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_g", uClass):""));
    realSb.append(TEXT_298);
     if (customGetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPostfixCode,gen.translate("getMethod",av)); 
    append(realSb, "{0}\n",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    realSb.append(TEXT_299);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_300);
    
      }
      else
      {
        
    /*attribute_Get*/
     if (av.numberOfComments() > 0 && av.numberOfRequirements() > 0) { List<Comment> toComment = new ArrayList<Comment>(av.getComments()); toComment.addAll(Requirement.convertToComment(av.getRequirements())); append(realSb, "\n  {0}", Comment.format("Attribute Javadoc", toComment)); } 
     if (av.numberOfComments() > 0 && av.numberOfRequirements() == 0) { append(realSb, "\n  {0}", Comment.format("Attribute Javadoc", av.getComments())); } 
     if (av.numberOfComments() == 0 && av.numberOfRequirements() > 0) { append(realSb, "\n  {0}", Requirement.format("Attribute Javadoc", av.getRequirements())); } 
    realSb.append(umpleSourceFile);
    realSb.append(TEXT_301);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_302);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_303);
     if (customGetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPrefixCode,gen.translate("getMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_304);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_g", uClass):""));
    realSb.append(TEXT_305);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_306);
    
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

	  String customGetDefaultPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("getDefaultMethod",av)));
	  String customGetDefaultPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("getDefaultMethod",av)));

	  String customGetManyPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("getManyMethod",av)));
	  String customGetManyPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("getManyMethod",av)));
	  
	  String customGetUniquePrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("getUniqueMethod",av)));
	  String customGetUniquePostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("getUniqueMethod",av)));

      
      if (customGetDefaultPrefixCode!=null || customGetDefaultPostfixCode!=null)
      {
        
    realSb.append(TEXT_370);
    /*attribute_GetDefaultedSubclass*/
    realSb.append(TEXT_371);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_372);
    realSb.append(gen.translate("getDefaultMethod",av));
    realSb.append(TEXT_373);
     if (customGetDefaultPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPrefixCode,gen.translate("getDefaultMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetDefaultPrefixCode, "    ")); } 
    realSb.append(TEXT_374);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_375);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_376);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_377);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_g", uClass):""));
    realSb.append(TEXT_378);
     if (customGetDefaultPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetDefaultPostfixCode,gen.translate("getDefaultMethod",av));
      append(realSb, "{0}\n",GeneratorHelper.doIndent(customGetDefaultPostfixCode, "    ")); } 
    realSb.append(TEXT_379);
    realSb.append(gen.translate("parameterValue",av));
    realSb.append(TEXT_380);
    
      }
      else if (customGetManyPrefixCode!=null || customGetManyPostfixCode!=null)
      {
        
    realSb.append(TEXT_381);
    /*attribute_GetManySubclass*/
    realSb.append(TEXT_382);
    realSb.append(gen.translate("typeMany",av));
    realSb.append(TEXT_383);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_384);
     if (customGetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPrefixCode,gen.translate("getMethod",av));
     append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_385);
    realSb.append(gen.translate("typeMany",av));
    realSb.append(TEXT_386);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_387);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_388);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_g", uClass):""));
    realSb.append(TEXT_389);
     if (customGetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPostfixCode,gen.translate("getMethod",av));
    append(realSb, "{0}\n",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    realSb.append(TEXT_390);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_391);
    
      }
      else if (customGetUniquePrefixCode!=null || customGetUniquePostfixCode!=null)
      {
        
    realSb.append(TEXT_392);
    /*attribute_GetUniqueCodeInjection*/
    realSb.append(TEXT_393);
    realSb.append(av.getUmpleClass().getName());
    realSb.append(TEXT_394);
    realSb.append(gen.translate("getUniqueMethod",av));
    realSb.append(TEXT_395);
    realSb.append(gen.translate("type", av));
    realSb.append(TEXT_396);
    realSb.append(gen.translate("parameterOne", av));
    realSb.append(TEXT_397);
     if (customGetUniquePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetUniquePrefixCode,gen.translate("getUniqueMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetUniquePrefixCode, "    ")); } 
    realSb.append(TEXT_398);
    realSb.append(av.getUmpleClass().getName());
    realSb.append(TEXT_399);
    realSb.append(gen.translate("parameterGetUnique",av));
    realSb.append(TEXT_400);
    realSb.append(gen.translate("getUniqueMethod",av));
    realSb.append(TEXT_401);
    realSb.append(gen.translate("type", av));
    realSb.append(TEXT_402);
    realSb.append(gen.translate("parameterOne", av));
    realSb.append(TEXT_403);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_g", uClass):""));
    realSb.append(TEXT_404);
     if (customGetUniquePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetUniquePostfixCode,gen.translate("getUniqueMethod",av)); 
    append(realSb, "{0}\n",GeneratorHelper.doIndent(customGetUniquePostfixCode, "    ")); } 
    realSb.append(TEXT_405);
    realSb.append(gen.translate("parameterGetUnique",av));
    realSb.append(TEXT_406);
    
      }
      else if(customGetPrefixCode!=null||customGetPostfixCode!=null)
      {
        if (av.getIsDerived())
        {
          
    realSb.append(TEXT_407);
    /*attribute_GetDerivedSubclass*/
     if (av.numberOfComments() > 0 && av.numberOfRequirements() > 0) { List<Comment> toComment = new ArrayList<Comment>(av.getComments()); toComment.addAll(Requirement.convertToComment(av.getRequirements())); append(realSb, "\n  {0}\n", Comment.format("Attribute Javadoc", toComment)); } 
     if (av.numberOfComments() > 0 && av.numberOfRequirements() == 0) { append(realSb, "\n  {0}\n", Comment.format("Attribute Javadoc", av.getComments())); } 
     if (av.numberOfComments() == 0 && av.numberOfRequirements() > 0) { append(realSb, "\n  {0}\n", Requirement.format("Attribute Javadoc", av.getRequirements())); } 
    realSb.append(umpleSourceFile);
    realSb.append(TEXT_408);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_409);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_410);
     if (customGetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPrefixCode,gen.translate("getMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_411);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_412);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_413);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_414);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_g", uClass):""));
    realSb.append(TEXT_415);
     if (customGetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPostfixCode,gen.translate("getMethod",av));
    append(realSb, "{0}\n",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    realSb.append(TEXT_416);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_417);
    addUncaughtExceptionVariables(gen.translate("getMethod",av),av.getPosition().getFilename(),av.getPosition().getLineNumber(),realSb.toString().split("\\n").length-1,1);
    realSb.append(TEXT_418);
    
        }
        else
        {
          
    /*attribute_GetSubclass*/
     if (av.numberOfComments() > 0 && av.numberOfRequirements() > 0) { List<Comment> toComment = new ArrayList<Comment>(av.getComments()); toComment.addAll(Requirement.convertToComment(av.getRequirements())); append(realSb, "\n  {0}", Comment.format("Attribute Javadoc", toComment)); } 
     if (av.numberOfComments() > 0 && av.numberOfRequirements() == 0) { append(realSb, "\n  {0}", Comment.format("Attribute Javadoc", av.getComments())); } 
     if (av.numberOfComments() == 0 && av.numberOfRequirements() > 0) { append(realSb, "\n  {0}", Requirement.format("Attribute Javadoc", av.getRequirements())); } 
    realSb.append(umpleSourceFile);
    realSb.append(TEXT_419);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_420);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_421);
     if (customGetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPrefixCode,gen.translate("getMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_422);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_423);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_424);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_425);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_g", uClass):""));
    
    if (customGetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPostfixCode,gen.translate("getMethod",av)); 
    append(realSb, "{0}\n",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    realSb.append(TEXT_426);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_427);
    
        }
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
      
    realSb.append(TEXT_428);
    /*attribute_IsBooleanCodeInjectionDerived*/
    realSb.append(TEXT_429);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_430);
    realSb.append(gen.translate("isMethod",av));
    realSb.append(TEXT_431);
     if (customGetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPrefixCode,gen.translate("isMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_432);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_433);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_434);
    realSb.append(gen.translate("parameterValue",av));
    realSb.append(TEXT_435);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_i", uClass, gen.translate("parameterOne",av), "index"):""));
    realSb.append(TEXT_436);
     if (customGetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPostfixCode,gen.translate("isMethod",av));   
    append(realSb, "{0}\n",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); }
    realSb.append(TEXT_437);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_438);
    
    }
    else if (av.getIsDerived())
    {
      
    realSb.append(TEXT_439);
    /*attribute_IsBooleanDerived*/
    realSb.append(TEXT_440);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_441);
    realSb.append(gen.translate("isMethod",av));
    realSb.append(TEXT_442);
     if (customGetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPrefixCode,gen.translate("isMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_443);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_i", uClass, gen.translate("parameterOne",av), "index"):""));
    realSb.append(TEXT_444);
    realSb.append(gen.translate("parameterValue",av));
    realSb.append(TEXT_445);
    
    }
    else if (customGetPostfixCode != null)
    {
      
    realSb.append(TEXT_446);
    /*attribute_IsBooleanCodeInjection*/
    realSb.append(TEXT_447);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_448);
    realSb.append(gen.translate("isMethod",av));
    realSb.append(TEXT_449);
     if (customGetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPrefixCode,gen.translate("isMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_450);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_451);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_452);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_453);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_i", uClass, gen.translate("parameterOne",av), "index"):""));
    realSb.append(TEXT_454);
     if (customGetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPostfixCode,gen.translate("isMethod",av)); 
    append(realSb, "{0}\n",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    realSb.append(TEXT_455);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_456);
    
    }
    else
    {
      
    realSb.append(TEXT_457);
    /*attribute_IsBoolean*/
    realSb.append(TEXT_458);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_459);
    realSb.append(gen.translate("isMethod",av));
    realSb.append(TEXT_460);
     if (customGetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPrefixCode,gen.translate("isMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_461);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null?traceItem.trace(gen, av,"at_i", uClass, gen.translate("parameterOne",av), "index"):""));
    realSb.append(TEXT_462);
    realSb.append(gen.translate("attributeOne",av));
    realSb.append(TEXT_463);
    
    }
      
    appendln(realSb, "");
  }
  gen.setParameterConstraintName("");

    realSb.append(TEXT_464);
    return realSb.toString();
    } 
    private String getStateMachine1Code(StringBuilder realSb, UmpleModel model,UmpleClass uClass, GeneratedClass gClass, JavaGenerator gen, boolean isFirst, boolean isFake)
  {
    Integer baseJavaLine = realSb.toString().split("\\n").length;
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
      output.append(StringFormatter.format("\n    if ({0} != {1}.Null) { answer += \".\" + {0}.toString(); }",gen.translate("stateMachineOne",childSm),gen.translate("type",childSm)));
      allParents.addAll(childSm.getNestedStateMachines());
    }     
  }
  String outputAsString = output.toString();

    realSb.append(TEXT_465);
    realSb.append(gen.translate("typeFull",sm));
    realSb.append(TEXT_466);
    realSb.append(gen.translate("getFullMethod",sm));
    realSb.append(TEXT_467);
    realSb.append(gen.translate("stateMachineOne",sm));
    realSb.append(TEXT_468);
     if (outputAsString.length() > 0) { append(realSb, "{0}",outputAsString); } 
    realSb.append(TEXT_469);
     
  }
  
  for(StateMachine sm : uClass.getAllStateMachines())
  {
    
    /*state_machine_Get*/
    realSb.append(TEXT_470);
    realSb.append(gen.translate("type",sm));
    realSb.append(TEXT_471);
    realSb.append(gen.translate("getMethod",sm));
    realSb.append(TEXT_472);
    realSb.append(gen.translate("stateOne",sm));
    realSb.append(TEXT_473);
    
  }
}

    /*state_machine_StateDependentMethods_All*/
    
    // Issue #1351
    if (!uClass.getStateDependentMethods().isEmpty()) {

      // Effectively a lambda function below, so that we can keep code related
      // to state-dependent method generation all in one space
      abstract class StateDependentTreeTraversal {
        public abstract void traverse(Method method);
      }
    
      StateDependentTreeTraversal t = new StateDependentTreeTraversal() {

        // Prints the signature for the state-dependent method
        private void printBefore(Method method) {
          String methodModifier = method.getModifier().equals("") ? "public" : method.getModifier().trim();
          String methodType = method.getType();
          String methodName = method.getName();
          StringBuilder parameters = new StringBuilder();
          String finalParams = "";
          if (method.hasMethodParameters())
          {
            for (MethodParameter aMethodParam : method.getMethodParameters()) 
            {
              String paramName = aMethodParam.getName();
              String paramType = aMethodParam.getType();
              String isList = aMethodParam.getIsList() ? " [] " : " ";
              String aSingleParameter = paramType + isList + paramName;
              parameters.append(aSingleParameter + ", ");
            }
        
            finalParams = parameters.toString().substring(0, parameters.toString().length()-2);
          }
      
          StringBuilder methodExceptionsBuilder = new StringBuilder();
          if(method.getExceptions()!=null&&method.numberOfExceptions()>0)
          {
            methodExceptionsBuilder.append(" throws ");
            String exceptioncomma = "";
            for(String methodException:method.getExceptions())
            {
              if(!"".equals(methodException))
              {
                methodExceptionsBuilder.append(exceptioncomma);
                methodExceptionsBuilder.append(methodException);
                exceptioncomma = ",";
              }
            }
          }

          String methodExceptions = methodExceptionsBuilder.toString();
          append(realSb, "\n  {0} {1} {2}({3}){4}", methodModifier, methodType, methodName, finalParams, methodExceptions);
        }
    
        // Prints the state-dependent method as defined within the UmpleClass
        public void traverse(Method method)
        {
          printBefore(method);
          Map<State, MethodBody> stateMap = uClass.getStateDependentMethodBodyMap().get(method);
          MethodBody defaultMethodBody = stateMap.getOrDefault(null, null);
          String defaultBody = defaultMethodBody == null ?
             null : defaultMethodBody.getCodeblock().getCode();
          append(realSb, "\n  {");
          Set<StateMachine> uniqueStateMachines = new HashSet<StateMachine>(); 
          for (Map.Entry<State, MethodBody> entry : stateMap.entrySet()) {
          if (entry.getKey() == null) continue;
            uniqueStateMachines.add(entry.getKey().getRootStateMachine());
          }
          int numStateMachinesFound = uniqueStateMachines.size();
          StringBuilder smBuilder = new StringBuilder();
          String customBeforeInjectionCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjectionsCustomMethod("before", method.getName(), method.getMethodParameters()));
          String customAfterInjectionCode  = GeneratorHelper.toCode(uClass.getApplicableCodeInjectionsCustomMethod("after", method.getName(), method.getMethodParameters()));
          String customPreconditionCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", method.getName()+"Precondition"));        
          String customPostconditionCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", method.getName()+"Postcondition"));
          customPostconditionCode = customPostconditionCode==null?"":customPostconditionCode;
          if (customBeforeInjectionCode != null) {
              addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customBeforeInjectionCode,method.getName());
              append(realSb, "\n{0}\n",GeneratorHelper.doIndent(customBeforeInjectionCode, "    "));
          }
          for (StateMachine sm : uniqueStateMachines)
          {
            smBuilder = new StringBuilder();
            boolean foundMethod = traverse(
              method, sm, null,
              defaultBody, stateMap, smBuilder,
              numStateMachinesFound);
            if (foundMethod) {
              numStateMachinesFound--;
              defaultBody = smBuilder.toString();
              // make sure the spacing is correct when we insert the result as a default case
              if (numStateMachinesFound != 0) {
                defaultBody = defaultBody.replaceFirst("^\\s+", "");
              }
            }
          }
          String result = smBuilder.toString();

          if(customAfterInjectionCode != null) {
            // Do some pre-processing to handle returns not being on a new line. Doing this allows us to maintain suitable indentation.
            String[] properMethodLines = result.split("\\n");
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

              result = fixedProperMethodBody;

              String properMethodIndent = "";
              int indentIndex = 0;
              int newlineOffset = 0;
              while(result.charAt(newlineOffset) == '\n') newlineOffset++;
              while(indentIndex + newlineOffset < result.length() && result.charAt(indentIndex + newlineOffset) == ' ') {
                properMethodIndent += " ";
                indentIndex++;
              }

              // inject the after injection code after every return, while appropriate indentation
              List<Integer> injectedLineNumbers = new ArrayList<Integer>();
              for(int i = -1; (i = result.indexOf("return", i + 1)) != -1; ) {
                //Check if return statement is on its own line
                int lastChar = i - 1;
                while (result.charAt(lastChar) == ' ')
                  lastChar--;
                if (result.charAt(lastChar) != '\n') // If it has any non-space characters before it, it's invalid
                  continue;
              
                // determine the indentation of the return
                String indent = "";
                while(i >= 1 && result.charAt(--i) == ' ') {
                  indent += " ";
                }

                // Need to determine if block has braces surrounding it. To do this, take the previous
                // lines of code and apply some regex to remove all of the comments.
                String[] previousLinesOfCode = result.substring(0, i+1).replaceAll("\\/\\*([\\S\\s]+?)\\*\\/", "").replaceAll("(?s)/\\*.*?\\*/", "").replaceAll("//.*$", "").split("\\n");
                int commentLineCount = result.substring(0, i+1).split("\\n").length - previousLinesOfCode.length;

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
                while(!result.split("\\n")[previousLine + commentLineCount].trim().equals(previousLineStr)) {
                  commentLineCount--;
                }
              
                // If we need to, insert braces, otherwise continue as normal
                String indentedCustomAfterInjectionCode = GeneratorHelper.doIndent("\n" + customAfterInjectionCode, indent);
                String braceIndent = "";
                String brace = "";
                String braceNewLine = "";
                if(previousLine != -1 && (previousLineStr.charAt(previousLineStr.length()-1) == ')' || (previousLineStr.length() >= 4 && previousLineStr.substring(previousLineStr.length()-4).equals("else")))) {
                  String[] methodLines = result.split("\\n");
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
                  result = newProperMethodBody;

                  brace = "}";
                  braceNewLine = "\n";
                }

                i += indent.length() + 1;
                String[] returnAndRest = result.substring(i).split(";", 2);
                injectedLineNumbers.add(result.substring(0, i).trim().split("\\n").length);
                result = properMethodIndent + result.substring(0, i).trim() + indentedCustomAfterInjectionCode + "\n" + indent + returnAndRest[0].trim() + ";" + braceNewLine + braceIndent + brace + returnAndRest[1]; 
                i += indentedCustomAfterInjectionCode.length() + braceIndent.length() + 7;
              }

              // if the last line isn't a return, insert the injection at the very end
              String[] lines = result.split("\\n");
              if(!lines[lines.length-1].contains("return")) {
                injectedLineNumbers.add(lines.length);
                result += GeneratorHelper.doIndent("\n" + customAfterInjectionCode, "    ");
              }
              
              int javaLength = realSb.toString().split("\\n").length;
              for (Integer line : injectedLineNumbers) {
                addUncaughtExceptionVariables(javaLength + line,customAfterInjectionCode, method.getName());
              }
              realSb.append("\n");
            }
          realSb.append(result);
          append(realSb, "\n  }\n");
        }

        // Returns true if methods were found. Do not use results of StringBuilder otherwise.
        private boolean traverse(Method method, StateMachine sm, State fromState, String defaultBody, Map<State, MethodBody> stateMap, StringBuilder builder, int depth) {
          boolean foundMethod = false;
      
          // Repeat spacing based on depth
          String spacing = new String(new char[depth]).replace("\0", "    ");
      
          // Non-trivial states should have a switch case:
          append(builder, "\n{0}switch({1})", spacing, gen.translate("stateMachineOne", sm));
          append(builder, "\n{0}{", spacing);
          
          // Loop over states and recurse
          for (State state : sm.getStates())
          {
            // Hierarchically set the default body based on state
            MethodBody childDefaultMethodBody = stateMap.getOrDefault(state, null);
            String childDefaultBody = (childDefaultMethodBody == null) ?
                defaultBody : childDefaultMethodBody.getCodeblock().getCode();
            
            boolean foundChildMethod = false;
            if (state.hasNestedStateMachines()) {
              boolean shouldPrintCaseStatement = true;
              for (StateMachine nestedSm : state.getNestedStateMachines())
              {
                StringBuilder childBuilder = new StringBuilder();
                boolean result = traverse(method, nestedSm, state,
                                    childDefaultBody, stateMap, childBuilder,
                                    depth + 1);
                  
                  if (result)
                  {
                    foundChildMethod = true;
                    if (shouldPrintCaseStatement)
                    {
                      append(builder, "\n{0}  case {1}:", spacing, state.getName());
                    }
                    append(builder, childBuilder.toString());
                  }
                }
            }
            
            if (!foundChildMethod)
            {
              // Handle leaf nodes
              MethodBody body = stateMap.getOrDefault(state, null);
              if (body != null) {
                append(builder, "\n{0}  case {1}:", spacing, state.getName());
                append(builder, "\n{0}    {1}", spacing, body.getCodeblock().getCode());

                // Implicit return for void
                if (method.getType().equals("void")) {
                  append(builder, "\n{0}    return;", spacing);
                }
              }
              foundMethod = foundMethod || body != null;
            }
          }

          String defaultTypeValue = gen.translate(method.getType());

          // Output the default value and close brace
          String defaultValue = (defaultBody == null) ?
                            defaultTypeValue.isEmpty() ?
                              "return;" : String.format("return %s;", defaultTypeValue) :
                            defaultBody;

          append(builder, "\n{0}  default:", spacing);
          append(builder, "\n{0}    {1}", spacing, defaultValue);
          
          // Close the switch statement
          append(builder, "\n{0}}", spacing);
          
          return foundMethod;
        }
    };
  
    // Generate state-dependent methods
    for (Method method : uClass.getStateDependentMethods())
    {
      t.traverse(method);
    }
  }
    /*state_machine_Events_All*/
    
{
  // GENERIC FILE - EDIT IN UmpleToTemplate project, then run "ant -f build.codegen.xml to move into the appropriate projects
  for(Event e : uClass.getEvents())
  {
    
    /*state_machine_Event*/
    
  
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
  
  int javaLine = realSb.toString().split("\\n").length+7;

  StringBuilder allCases = new StringBuilder();
  StringBuilder allDeclarations = new StringBuilder();
  
  StringBuilder actionLineNumbers = new StringBuilder();
  StringBuilder actionFileNames = new StringBuilder();
  StringBuilder actionJavaLineNumbers = new StringBuilder();
  StringBuilder actionLengths = new StringBuilder();
  String umpleSourceFileFormat = "\n  @umplesourcefile(line={{0}}, file={{1}}, javaline={{2}}, length={{3}})";
  String customEventPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("eventMethod",e)));
  String customEventPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("eventMethod",e)));
  if(e.getName().startsWith("_")&&(customEventPrefixCode==null||customEventPostfixCode==null))
  {
    boolean queued = false;
    for(StateMachine sm : uClass.getStateMachines(e))
    {
      if(sm.isQueued())
      {
        queued = true;
        break;
      }
    }
    if(queued)
    {
      if(customEventPrefixCode==null)
      {
        customEventPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("eventMethod",e)));
      }
      if(customEventPostfixCode==null)
      {
        customEventPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("eventMethod",e)));
      }
  
    }
  }
  for(StateMachine sm : uClass.getStateMachines(e))
  {
    allDeclarations.append(StringFormatter.format("\n    {0} {1} = {2};",gen.translate("type",sm),gen.translate("parameterOne",sm),gen.translate("stateMachineOne", sm)));
    if(sm.getContainsHistoryState())
    {     
      allDeclarations.append(StringFormatter.format("\n    if ({0} != {1}.Null){",gen.translate("stateMachineOne",sm),gen.translate("type",sm)));
    	allDeclarations.append(StringFormatter.format("{0}H = {1};}",gen.translate("stateMachineOne",sm),gen.translate("stateMachineOne", sm)));    
      javaLine++;
    }
    if(sm.getContainsDeepHistoryState())
    { 
      allDeclarations.append(StringFormatter.format("\n    if ({0} != {1}.Null){",gen.translate("stateMachineOne",sm),gen.translate("type",sm)));
    	allDeclarations.append(StringFormatter.format("{0}HStar = {1};}",gen.translate("stateMachineOne",sm),gen.translate("stateMachineOne", sm)));
      javaLine++;
    }
    allCases.append(StringFormatter.format("\n    switch ({0})\n",gen.translate("parameterOne",sm)));
    allCases.append(StringFormatter.format("    {\n"));
    javaLine+=3;
    
    // Issue 935 - Need to retrieve the super state machine and have transitions first make a call it's exit method to perform an external transition
    StateMachine superStateMachine = sm.getSuperStateMachine();
    State nullState = sm.getNullState();
    boolean transitionIsAndCross = false;
    
    for(State state : sm.getStates())
    {
  	  TraceItem traceItem = state.getTraced("transition",uClass);
      List<Transition> allT = state.getTransitionsFor(e);
  
      if (allT.size() == 0)
      {
        continue;
      }

      allCases.append(StringFormatter.format("      case {0}:\n",gen.translate("stateOne",state)));
      javaLine++;

      boolean needsBreak = true;
      for (Transition t : allT)
      {
        
        State nextState = t.getNextState();
        String tabSpace = t.getGuard() == null ? "        " : "          ";
        
        String condition = t.getGuard()!=null?gen.translate("Open",t.getGuard()):"if ()\n{";
        if (!"if ()\n{".equals(condition))
        {
          StateMachine sm_temp=sm;
          if (sm.getUmpleClass()==null) sm_temp=sm.getRootStateMachine();
          
          addUncaughtExceptionVariables(gen.translate("eventMethod",e),
                                      sm_temp.getUmpleClass().getRelativePath(t.getGuard().getPosition().getFilename(),"Java").replace("\\","/").replaceAll(".*/","").replace("\"",""),
                                      t.getGuard().getPosition().getLineNumber(),
                                      javaLine-1,
                                      condition.split("\\n").length-1);
          allCases.append(GeneratorHelper.doIndent(condition, "        ")+"\n");
          javaLine+=1+condition.split("\\n").length;
          
        }
        
        // Issue 935
        State concurrentParent = null;
        if (state != nullState && state.getHasExitAction()) 
        {
          // Concurrent state machines require additional handling
          State fromConcurrentParentState = state.getConcurrentParentState();
          if (fromConcurrentParentState != null) {
            StateMachine concurrentSmToExit = null;
      
            if (nextState.getStateMachine().equals(superStateMachine)) {
              concurrentSmToExit = superStateMachine;
            } else if (state.getStateMachine().equals(nextState.getStateMachine())) {
              concurrentSmToExit = state.getStateMachine();
            } else {
              State nextConcurrentParentState = nextState.getConcurrentParentState();
              concurrentSmToExit = t.getSmToExit(superStateMachine);
              if (nextConcurrentParentState != null) {
                if (fromConcurrentParentState.equals(nextConcurrentParentState)) {
                  if (t.isTransitionAndCross(fromConcurrentParentState)) {
                    concurrentParent = fromConcurrentParentState;
                    transitionIsAndCross = true;
                  }
                }
              }
            }
            
            allCases.append(StringFormatter.format("{0}{1}();\n",tabSpace,gen.translate("exitMethod",concurrentSmToExit))); 
          } else {
            StateMachine smToExit = t.getSmToExit(superStateMachine);
            allCases.append(StringFormatter.format("{0}{1}();\n",tabSpace,gen.translate("exitMethod",smToExit))); 
          }
          javaLine++;
        }
        
        if (t.getAction() != null)
        {
          Action a1 = t.getAction();
          Position p = a1.getPosition();
          if (p != null) {
          
            StateMachine sm_temp=sm;
            if (sm.getUmpleClass()==null) sm_temp=sm.getRootStateMachine();
            
            final String relativePath = sm_temp.getUmpleClass().getRelativePath(p.getFilename(),"Java");
            
            addUncaughtExceptionVariables(gen.translate("eventMethod",e),
                                        relativePath.replace("\\","/").replaceAll(".*/","").replace("\"",""),
                                        p.getLineNumber(),
                                        javaLine-2,
                                        a1.getActionCode().split("\\n").length);
            allCases.append("        // line " + p.getLineNumber() + " \"" + relativePath + "\"\n");
            javaLine++;
          }
          allCases.append(StringFormatter.format("{0}{1}\n",tabSpace,a1.getActionCode()));
          javaLine+=a1.getActionCode().split("\\n").length;
        }
        
        StateMachineTraceItem traceStmItem = null;
        
        traceStmItem = state.getTrace("entry",uClass,t);
        allCases.append(traceStmItem!=null?traceStmItem.trace(gen, t, "sm_t", uClass)+"\n":"");
        
        traceStmItem = state.getTrace("exit",uClass,t);
        allCases.append(traceStmItem!=null?traceStmItem.trace(gen, t, "sm_t", uClass)+"\n":"");
        
        traceStmItem = state.getTrace("state",uClass,t);
        allCases.append(traceStmItem!=null?traceStmItem.trace(gen, t, "sm_t", uClass)+"\n":"");
        
        traceStmItem = state.getTrace("transition",uClass,t);
        allCases.append(traceStmItem!=null?traceStmItem.trace(gen, t, "sm_t", uClass)+"\n":"");
        	
//        allCases.append(traceItem!=null&&traceItem.getIsPre()?traceItem.trace(gen, t,"sm_t", uClass)+"\n":"");
        if (nextState.getIsHistoryState() == true)
        {
        	allCases.append(StringFormatter.format("{0}{1}({2}{3});\n",tabSpace,gen.translate("setMethod",nextState.getStateMachine()),gen.translate("stateMachineOne",nextState.getStateMachine()),gen.translate("stateOne",nextState)));
        	
        }
        else
        {
        	allCases.append(StringFormatter.format("{0}{1}({2}.{3});\n",tabSpace,gen.translate("setMethod",nextState.getStateMachine()),gen.translate("type",nextState.getStateMachine()),gen.translate("stateOne",nextState)));
		}

        // Issue 935 - Additional processing for concurrent state machines
        if (transitionIsAndCross) {
          for (StateMachine smToReset : concurrentParent.getNestedStateMachines()) {
            if (smToReset.indexOfState(state) != -1) {
              allCases.append(StringFormatter.format("{0}{1}({2}.{3});\n",tabSpace,gen.translate("setMethod", smToReset),gen.translate("type", smToReset),gen.translate("stateOne", smToReset.getStartState())));
              break;
            } else {
              boolean reset = false;
              for(StateMachine nestedStateMachine : smToReset.getNestedStateMachines()) {
                if (nestedStateMachine.indexOfState(state) != -1) {
                  reset = true;
                  break;
                }
              }
              if (reset) {
                allCases.append(StringFormatter.format("{0}{1}({2}.{3});\n",tabSpace,gen.translate("setMethod", smToReset),gen.translate("type", smToReset),gen.translate("stateOne", smToReset.getStartState())));
                break;
              }
            }
          }
        }
//        allCases.append(traceItem!=null&&traceItem.getIsPost()?traceItem.trace(gen, t,"sm_t", uClass)+"\n":"");

        
        allCases.append(StringFormatter.format("{0}wasEventProcessed = true;\n",tabSpace));
        allCases.append(StringFormatter.format("{0}break;\n",tabSpace));
        
        javaLine+=traceItem!=null?4:3;
        
        if (!"if ()\n{".equals(condition))
        {
          allCases.append(StringFormatter.format("        }\n"));
          javaLine++;
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
        javaLine++;
      }
    } 
    allCases.append(StringFormatter.format("      default:\n"));
    allCases.append(StringFormatter.format("        // Other states do respond to this event\n"));
    
    for(State s : sm.getStates())
    {
      Transition t1=null;
      Transition t2=null;
      String exitEvent=null;
      if (sm.getParentState() != null)
      {
        State parentState = sm.getParentState();
        exitEvent = gen.translate("exitMethod",parentState);
      }
      for(Transition tran: s.getTransitions())
      {
        if(tran.getEvent().isUnspecified())
        {
          t1=tran;
        }
        if(tran.getEvent().getName().equals(e.getName()))
        {
          t2=tran;
        }
      }
      if(s.getTransitions().contains(t1) && s.getTransitions().contains(t2))
      {
        if(!e.isUnspecified() && !e.getName().equals(exitEvent))
        {
          allCases.append(StringFormatter.format("        wasEventProcessed = unspecified("));
          allCases.append(StringFormatter.format("get"));
          allCases.append(StringFormatter.format("{0}",gen.translate("type",sm)));
          allCases.append(StringFormatter.format("("));
          allCases.append(StringFormatter.format(").toString()"));
          allCases.append(StringFormatter.format(", "));
          allCases.append(StringFormatter.format("\""));
          allCases.append(StringFormatter.format(e.getName()));
          allCases.append(StringFormatter.format("\""));
          allCases.append(StringFormatter.format(");\n"));
        }
      }
    }
    allCases.append(StringFormatter.format("    }\n"));
    javaLine+=3;
  }

  String override =  (implementsInterfaceMethod) ? "@Override\n" : "";
  String scope = e.getIsInternal() || e.isAutoTransition() ? "private" : "public";
  if (implementsInterfaceMethod)
  {
  	scope = "  " + scope;
  }
  String eventOutput = allDeclarations.toString() + allCases.toString();
    realSb.append(TEXT_474);
    realSb.append(override);
    realSb.append(scope);
    realSb.append(TEXT_475);
    for (StateMachine sm : uClass.getStateMachines()){if((sm.isQueued() && e.getIsInternal() == false && e.isAutoTransition() == false && !e.isUnspecified()) || (sm.isPooled() && e.getIsInternal() == false && e.isAutoTransition() == false && !e.isUnspecified())){append(realSb,"_");}break;}
    realSb.append(gen.translate("eventMethod",e));
    realSb.append(TEXT_476);
    realSb.append((e.getArgs()==null?"":e.getArgs()));
    if(e.isUnspecified()){append(realSb,"String state, String event");}
    realSb.append(TEXT_477);
     if (customEventPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customEventPrefixCode,gen.translate("eventMethod",e));
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customEventPrefixCode, "    ")); } 
    realSb.append(TEXT_478);
    realSb.append(eventOutput);
     if (customEventPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customEventPostfixCode,gen.translate("eventMethod",e)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customEventPostfixCode, "    ")); } 
    realSb.append(TEXT_479);
    
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
    
  StringBuilder allExitCases = new StringBuilder();
  StringBuilder allEnterCases = new StringBuilder();
  
  for(State s : sm.getStates())
  {
    boolean hasThisExit = false;
    boolean hasThisEntry = false;
    for (Action action : s.getActions())
    {
      if ("exit".equals(action.getActionType()))
      {
        TraceItem traceItem = s.getTraced("exit",uClass);
        
        if (!hasThisExit)
        {
          allExitCases.append(StringFormatter.format("    if ({0} == {1}.{2} && {3} != {1}.{2} )\n    {"
            , gen.translate("stateMachineOne",sm)
            , gen.translate("type",sm)
            , gen.translate("stateOne",s)
            , gen.translate("parameterOne",sm)
          ));
        }

        hasThisExit = true;

        allExitCases.append(
          traceItem!=null/*&&traceItem.getIsPost()*/?traceItem.trace(gen, s,"sm_e", uClass)+"\n":"");

        allExitCases.append("\n      " + action.getActionCode()); 
      }
      else if("entry".equals(action.getActionType()))
      {
        TraceItem traceItem = s.getTraced("entry",uClass);        
        
        if (!hasThisEntry)
        {
          allEnterCases.append(StringFormatter.format("    if ({0} != {1}.{2} && {3} == {1}.{2} )\n    {"
            , gen.translate("stateMachineOne",sm)
            , gen.translate("type",sm)
            , gen.translate("stateOne",s)
            , gen.translate("parameterOne",sm)
          ));
        }

        hasThisEntry = true;

        allEnterCases.append(
            traceItem!=null/*&&traceItem.getIsPost()*/?traceItem.trace(gen, s,"sm_x", uClass)+"\n":"");

        allEnterCases.append("\n      " + action.getActionCode()); 
      }
    }
    if (s.getHasExitAction()){
     allExitCases.append("\n    }\n");
    }
    if (s.getHasEntryAction()){
     allEnterCases.append("\n    }\n");
    }
  }
  
  String exitCasesOutput = allExitCases.toString().trim();
  String enterCasesOutput = allEnterCases.toString().trim();

    realSb.append(TEXT_480);
    realSb.append(gen.translate("setMethod",sm));
    realSb.append(TEXT_481);
    realSb.append(gen.translate("type",sm));
    realSb.append(TEXT_482);
    realSb.append(gen.translate("parameterOne",sm));
    realSb.append(TEXT_483);
     if (!exitCasesOutput.isEmpty()) { append(realSb, "\n    {0}",exitCasesOutput); } 
    realSb.append(TEXT_484);
     if (!enterCasesOutput.isEmpty()) { append(realSb, "\n    {0}",enterCasesOutput); } 
    realSb.append(TEXT_485);
    realSb.append(gen.translate("stateMachineOne",sm));
    realSb.append(TEXT_486);
    realSb.append(gen.translate("parameterOne",sm));
    realSb.append(TEXT_487);
    
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

  List<String> entryFileNames = new ArrayList<String>();
  List<Integer> entryUmpleLineNumbers = new ArrayList<Integer>();
  List<Integer> entryJavaLineNumbers = new ArrayList<Integer>();
  List<Integer> entryLengths = new ArrayList<Integer>();
  int preJavaLine = realSb.toString().split("\\n").length;
  int entryJavaLine = realSb.toString().split("\\n").length+(customSetPostfixCode != null?customSetPostfixCode.split("\\n").length:0)+(customSetPrefixCode != null?customSetPrefixCode.split("\\n").length:0)+10+(parentState != null?2:0);
  int exitJavaLine = realSb.toString().split("\\n").length+(customExitPrefixCode != null?customExitPrefixCode.split("\\n").length:0)+7;
  
  for(State state : sm.getStates())
  {
    boolean hasThisEntry = false;
    boolean hasThisExit = false;
    for(Action action : state.getActions())
    {
      // Issue1602
      String singularName = action.getActionCode();
      String prefix = "";
      if (singularName.startsWith("start") && singularName.endsWith("Handler();"))
      {
        prefix = "start";
        singularName = singularName.substring(5);
      } else if (singularName.startsWith("stop") && singularName.endsWith("Handler();"))
      {
        prefix = "stop";
        singularName = singularName.substring(4);
      }
      if (prefix.length() >= 4)
      {
        singularName = singularName.substring(0, singularName.length()-10);      
        singularName = singularName.substring(0, 1).toLowerCase() + singularName.substring(1);
      
        int numOfOccurance = 0;
          for (StateMachine sm2 : uClass.getAllStateMachines())
          {
            for (Event e : sm2.getEvents())
            {
              if (e.getName().equals(singularName))
              {
                numOfOccurance++;
                break;
              }
            }
          }

        if (numOfOccurance > 1)
        {
          action.setActionCode(prefix + StringFormatter.toPascalCase(sm.getFullName() + "_" + singularName) + "Handler();");
        }
      }
      if ("entry".equals(action.getActionType()))
      {
        TraceItem traceItem = state.getTraced("entry",uClass);
        TraceItem traceItemActivity = state.getTraced("activity",uClass);
        if (!hasThisEntry)
        {
          if (!isFirstEntry)
          {
            entryActions.append("\n      ");
            entryJavaLine++;
          }
          entryActions.append(StringFormatter.format("case {0}:",gen.translate("stateOne",state)));
          entryJavaLine++;
        }
        hasEntry = true;
        hasThisEntry = true;
        isFirstEntry = false;
        if(traceItem!=null)
        {
          entryActions.append("\n"+traceItem.trace(gen, state,"sm_e", uClass));
          entryJavaLine++;
        }
        Position p = action.getPosition();
        if (p != null) {
          StateMachine sm_temp=sm;
          if (sm.getUmpleClass()==null) sm_temp=sm.getRootStateMachine();
          final String relativePath = sm_temp.getUmpleClass().getRelativePath(p.getFilename(),"Java");
          entryActions.append("\n        // line " + p.getLineNumber() + " \"" + relativePath + "\"");
          entryFileNames.add(relativePath.replace("\\","/").replaceAll(".*/",""));
          entryUmpleLineNumbers.add(p.getLineNumber());
          entryJavaLineNumbers.add(entryJavaLine-1);
          entryLengths.add(action.getActionCode().split("\\n").length);
        }

        if (state.getIsDeepHistoryState() == true){
          
          String actionCode = action.getActionCode();
          int x = actionCode.lastIndexOf('.');
          int y = actionCode.indexOf(')',x);
          String substate = actionCode.substring(x+1,y);
          String beginning = actionCode.substring(0,x + 1);
          String end = actionCode.substring(y);
          actionCode = beginning.concat("HStar").concat(end);
          
          entryActions.append(StringFormatter.format("\n        if({0}HStar == {1}.{2})", gen.translate("stateMachineOne",sm), gen.translate("type",sm), substate));
          entryJavaLine++;
          entryActions.append("\n        {");
          entryJavaLine++;  
          
          entryActions.append("\n          " + actionCode);
          entryJavaLine+=actionCode.split("\\n").length;
          

          //TODO: add more spaces if deepHistory
          //entryActions.append(StringFormatter.format("{0}{1}({2}{3});","\n          ",gen.translate("setMethod",state.getStateMachine()),gen.translate("stateMachineOne",state.getStateMachine()),gen.translate("stateOne",state)));
          //entryJavaLine++;
          entryActions.append("\n        }");
          entryJavaLine++;
        }
        else if(traceItemActivity!=null)
        {
          for (Activity activity : state.getActivities())
          {
            entryActions.append("\n        " + action.getActionCode().substring(0, action.getActionCode().length() - 1).concat(traceItemActivity.trace(gen, activity,"sm_di", uClass))+" }");
            entryJavaLine+=action.getActionCode().split("\\n").length;
          }
        }
        else{
          entryActions.append("\n        " + action.getActionCode());
          entryJavaLine+=action.getActionCode().split("\\n").length;
        }

      }
      else if ("exit".equals(action.getActionType()))
      {
        TraceItem traceItem = state.getTraced("exit",uClass);
        TraceItem traceItemActivity = state.getTraced("activity",uClass);
        
        if (!hasThisExit)
        {
          if (!isFirstExit)
          {
            exitActions.append("\n      ");
            exitJavaLine++;
          }
          isFirstExit = false;
          exitActions.append(StringFormatter.format("case {0}:",gen.translate("stateOne",state)));
          exitJavaLine++;
        }
        hasExit = true;
        hasThisExit = true;
        isFirstExit = false;
        if(traceItem!=null)
        {
          exitActions.append("\n"+traceItem.trace(gen, state,"sm_x", uClass));
          exitJavaLine++;
        }
        Position p = action.getPosition();
        if (p != null) {
          StateMachine sm_temp=sm;
          if (sm.getUmpleClass()==null) sm_temp=sm.getRootStateMachine();
          
          final String relativePath = sm_temp.getUmpleClass().getRelativePath(p.getFilename(),"Java");
          
          exitActions.append("\n        // line " + p.getLineNumber() + " \"" + relativePath + "\"");
          addUncaughtExceptionVariables(gen.translate("exitMethod",sm),
                                        relativePath.replace("\\","/").replaceAll(".*/",""),
                                        p.getLineNumber(),
                                        exitJavaLine-1,
                                        action.getActionCode().split("\\n").length);
        }
        if(traceItemActivity!=null)
        {
          for (Activity activity : state.getActivities())
          {
            exitActions.append("\n        " + action.getActionCode().substring(0, action.getActionCode().length() - 1).concat(traceItemActivity.trace(gen, activity,"sm_di", uClass))+" }");
            exitJavaLine+=action.getActionCode().split("\\n").length;
            exitJavaLine++;
          }
        }
        else
        {
        	exitActions.append("\n        " + action.getActionCode());
            exitJavaLine+=action.getActionCode().split("\\n").length;
        }
      }
    }
    
    if (hasThisEntry)
    {
      entryActions.append("\n        break;");
      entryJavaLine++;
    }
    
    if (hasThisExit)
    {
      exitActions.append("\n        break;");
      exitJavaLine++;
    }
    
  }

    realSb.append(TEXT_488);
     if (hasExit) {
  
    realSb.append(TEXT_489);
    realSb.append(gen.translate("exitMethod",sm));
    realSb.append(TEXT_490);
     if (customExitPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customExitPrefixCode,gen.translate("exitMethod",sm));
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customExitPrefixCode, "    ")); } 
    realSb.append(TEXT_491);
    realSb.append(gen.translate("stateMachineOne",sm));
    realSb.append(TEXT_492);
    realSb.append(exitActions);
    realSb.append(TEXT_493);
     if (customExitPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customExitPostfixCode,gen.translate("exitMethod",sm)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customExitPostfixCode, "    ")); } 
    realSb.append(TEXT_494);
     
    List<Integer> tempList = new ArrayList<Integer>();
    tempList.addAll(entryJavaLineNumbers);
    entryJavaLineNumbers.clear();
    for(Integer i: tempList){
      entryJavaLineNumbers.add(i+(realSb.toString().split("\\n").length-preJavaLine));
    }
  }
  if(entryJavaLineNumbers.size()>0){
    String methodName = gen.translate("setMethod",sm);
    for(int i=0;i<entryJavaLineNumbers.size();++i){
      addUncaughtExceptionVariables(methodName,entryFileNames.get(i),entryUmpleLineNumbers.get(i),entryJavaLineNumbers.get(i),entryLengths.get(i));
    }
  } 
    realSb.append(TEXT_495);
    realSb.append(gen.translate("setMethod",sm));
    realSb.append(TEXT_496);
    realSb.append(gen.translate("type",sm));
    realSb.append(TEXT_497);
    realSb.append(gen.translate("parameterOne",sm));
    realSb.append(TEXT_498);
     if (customSetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",sm)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_499);
    realSb.append(gen.translate("stateMachineOne",sm));
    realSb.append(TEXT_500);
    realSb.append(gen.translate("parameterOne",sm));
    realSb.append(TEXT_501);
     if (parentState != null) { 
    realSb.append(TEXT_502);
    realSb.append(gen.translate("stateMachineOne",parentSm));
    realSb.append(TEXT_503);
    realSb.append(gen.translate("type",parentSm));
    realSb.append(TEXT_504);
    realSb.append(gen.translate("stateOne",parentState));
    realSb.append(TEXT_505);
    realSb.append(gen.translate("parameterOne",sm));
    realSb.append(TEXT_506);
    realSb.append(gen.translate("type",sm));
    realSb.append(TEXT_507);
    realSb.append(gen.translate("stateNull",sm));
    realSb.append(TEXT_508);
    realSb.append(gen.translate("setMethod",parentSm));
    realSb.append(TEXT_509);
    realSb.append(gen.translate("type",parentSm));
    realSb.append(TEXT_510);
    realSb.append(gen.translate("stateOne",parentState));
    realSb.append(TEXT_511);
     } 
    realSb.append(TEXT_512);
     if (customSetPostfixCode != null) {  addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",sm));
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_513);
     if (hasEntry) { 
    realSb.append(TEXT_514);
    realSb.append(gen.translate("stateMachineOne",sm));
    realSb.append(TEXT_515);
    realSb.append(entryActions);
    realSb.append(TEXT_516);
     } 
    realSb.append(TEXT_517);
     if (parentState != null) { 
    realSb.append(TEXT_518);
     if (sm.getContainsDeepHistoryState()) { 
    realSb.append(TEXT_519);
    realSb.append(gen.translate("parameterOne",sm));
    realSb.append(TEXT_520);
    realSb.append(gen.translate("type",sm));
    realSb.append(TEXT_521);
    realSb.append(gen.translate("stateMachineOne",sm));
    realSb.append(TEXT_522);
    realSb.append(gen.translate("stateMachineOne", sm));
    realSb.append(TEXT_523);
     } 
    realSb.append(TEXT_524);
     } 
    realSb.append(TEXT_525);
    
    }
  }
}

    
    return realSb.toString(); 
  } 
  private String getAssociationCode(StringBuilder realSb, UmpleModel model,UmpleClass uClass, GeneratedClass gClass, JavaGenerator gen, boolean isFirst, boolean isFake)
  { String self="this";
    
    if(uClass.getIsDistributed()&&model.getDistributePattern()==1)
      self="self";
      
    String umpleSourceFile = "";
    Integer baseJavaLine = realSb.toString().split("\\n").length+3;
    /*association_Get_All*/
    
  // GENERIC FILE - EDIT IN UmpleToTemplate project, then run "ant -f build.codegen.xml to move into the appropriate projects
  for (AssociationVariable av : uClass.getAssociationVariables()) 
  {
    
    /*specializationCode_Get*/
    
    AssociationVariable relatedAssociation = av.getRelatedAssociation();
    
    Association relatedAssoc = null;
    if (uClass.indexOfAssociationVariable(av) < uClass.getAssociations().length) relatedAssoc = uClass.getAssociation(uClass.indexOfAssociationVariable(av));
    
    // in the case of a specialization, this will let us know what kind of code we need

    boolean reqSuperCode = av.getNeedsSuperCode();
    boolean reqCommonCode = av.getNeedsCommonCode();
    boolean mulChangedToOne = av.getMulChangedToOne();
    boolean relReqSuperCode = relatedAssociation.getNeedsSuperCode();

     

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
      if (reqSuperCode)
      {
        
    realSb.append(TEXT_526);
    /*association_GetOne_specialization*/
    realSb.append(TEXT_527);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_528);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_529);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_530);
     if (customGetPrefixCode != null && mulChangedToOne) { 
    realSb.append(TEXT_531);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_532);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_533);
    if (relReqSuperCode) { 
    realSb.append(TEXT_534);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_535);
     } 
    realSb.append(TEXT_536);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_537);
     } else if (customGetPrefixCode != null) { 
    realSb.append(TEXT_538);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_539);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_540);
    if (relReqSuperCode) { 
    realSb.append(TEXT_541);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_542);
     } 
    realSb.append(TEXT_543);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_544);
     } 
    realSb.append(TEXT_545);
     if (customGetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPrefixCode,gen.translate("getMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_546);
     if (customGetPostfixCode == null) { 
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null?"\n"+traceItem.trace(gen, av,"as_g", uClass,gen.translate("associationOne",av)):""));
    realSb.append(TEXT_547);
    if (relReqSuperCode) { 
    realSb.append(TEXT_548);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_549);
     } 
    realSb.append(TEXT_550);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_551);
    if (mulChangedToOne) { 
    realSb.append(TEXT_552);
     } 
    realSb.append(TEXT_553);
     } else { 
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPre()?"\n"+traceItem.trace(gen, av,"as_g", uClass,gen.translate("associationOne",av)):""));
    realSb.append(TEXT_554);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_555);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_556);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_557);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_558);
    if (mulChangedToOne)
    realSb.append(TEXT_559);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPost()?"\n"+traceItem.trace(gen, av,"as_g", uClass,gen.translate("parameterOne",av)):""));
    realSb.append(TEXT_560);
     addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPostfixCode,gen.translate("getMethod",av));
     append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); 
    realSb.append(TEXT_561);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_562);
     } 
    realSb.append(TEXT_563);
    
      }
      else if (reqCommonCode)
      {
        
    realSb.append(TEXT_564);
    /*association_GetOne_relatedSpecialization*/
    realSb.append(TEXT_565);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_566);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_567);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_568);
     if (customGetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPrefixCode,gen.translate("getMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_569);
     if (customGetPostfixCode == null) { 
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null?"\n"+traceItem.trace(gen, av,"as_g", uClass,gen.translate("associationOne",av)):""));
    realSb.append(TEXT_570);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_571);
    realSb.append(gen.translate("associationOne",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_572);
     } 
    realSb.append(TEXT_573);
     } else { 
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPre()?"\n"+traceItem.trace(gen, av,"as_g", uClass,gen.translate("associationOne",av)):""));
    realSb.append(TEXT_574);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_575);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_576);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_577);
    realSb.append(gen.translate("associationOne",av));
     if (mulChangedToOne) {
    realSb.append(TEXT_578);
     } 
    realSb.append(TEXT_579);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPost()?"\n"+traceItem.trace(gen, av,"as_g", uClass,gen.translate("parameterOne",av)):""));
    realSb.append(TEXT_580);
     addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPostfixCode,gen.translate("getMethod",av));
     append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); 
    realSb.append(TEXT_581);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_582);
     } 
    realSb.append(TEXT_583);
    
      }
      else
      {
        
    realSb.append(TEXT_584);
    /*association_GetOne*/
    realSb.append(TEXT_585);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_586);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_587);
     if (customGetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPrefixCode,gen.translate("getMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    realSb.append(TEXT_588);
     if (customGetPostfixCode == null) { 
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null?"\n"+traceItem.trace(gen, av,"as_g", uClass,gen.translate("associationOne",av)):""));
    realSb.append(TEXT_589);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_590);
     } else { 
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPre()?"\n"+traceItem.trace(gen, av,"as_g", uClass,gen.translate("associationOne",av)):""));
    realSb.append(TEXT_591);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_592);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_593);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_594);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPost()?"\n"+traceItem.trace(gen, av,"as_g", uClass,gen.translate("parameterOne",av)):""));
    realSb.append(TEXT_595);
     addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPostfixCode,gen.translate("getMethod",av));
     append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); 
    realSb.append(TEXT_596);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_597);
     } 
    realSb.append(TEXT_598);
     
  if(av.getMultiplicity().getLowerBound() == 0) {
  
    realSb.append(TEXT_599);
    realSb.append(gen.translate("hasMethod",av));
    realSb.append(TEXT_600);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_601);
     } 
    realSb.append(TEXT_602);
    
        if (relatedAssoc != null && relatedAssoc.getIsSpecialized())
        {
          
    realSb.append(TEXT_603);
    /*association_GetOne_clear*/
    realSb.append(TEXT_604);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_605);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_606);
    
        }
      }
    }
    else if (av.isMany())
    {
      if (reqSuperCode)
      {
        
    realSb.append(TEXT_607);
    /*association_GetMany_specialization*/
    realSb.append(TEXT_608);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_609);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_610);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_611);
     if (customGetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPrefixCode,gen.translate("getMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPre()?"\n"+traceItem.trace(gen, av,"as_g", uClass,gen.translate("associationMany",av)+".get(index)"):""));
    realSb.append(TEXT_612);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_613);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_614);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_615);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_616);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPost()?"\n"+traceItem.trace(gen, av,"as_g", uClass,gen.translate("parameterOne",av)):""));
    realSb.append(TEXT_617);
     if (customGetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPostfixCode,gen.translate("getMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    realSb.append(TEXT_618);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_619);
     if (av.numberOfComments() > 0 && av.numberOfRequirements() > 0) { List<Comment> toComment = new ArrayList<Comment>(av.getComments()); toComment.addAll(Requirement.convertToComment(av.getRequirements())); append(realSb, "\n  {0}", Comment.format("Attribute Javadoc", toComment)); } 
     if (av.numberOfComments() > 0 && av.numberOfRequirements() == 0) { append(realSb, "\n  {0}", Comment.format("Attribute Javadoc", av.getComments())); } 
     if (av.numberOfComments() == 0 && av.numberOfRequirements() > 0) { append(realSb, "\n  {0}", Requirement.format("Attribute Javadoc", av.getRequirements())); } 
    realSb.append(umpleSourceFile);
    realSb.append(TEXT_620);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_621);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_622);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_623);
     if (customGetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetManyPrefixCode,gen.translate("getManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_624);
    String scgName = relatedAssoc.getEnd(av.getRelevantEnd()).getSuperClassName();
    realSb.append(TEXT_625);
    realSb.append(scgName);
    realSb.append(TEXT_626);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_627);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_628);
     if (customGetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetManyPostfixCode,gen.translate("getManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_629);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_630);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_631);
    
      }
      else if (reqCommonCode)
      {
        
    realSb.append(TEXT_632);
    /*association_GetMany_relatedSpecialization*/
    realSb.append(TEXT_633);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_634);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_635);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_636);
     if (customGetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPrefixCode,gen.translate("getMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPre()?"\n"+traceItem.trace(gen, av,"as_g", uClass,gen.translate("associationMany",av)+".get(index)"):""));
    realSb.append(TEXT_637);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_638);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_639);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_640);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_641);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPost()?"\n"+traceItem.trace(gen, av,"as_g", uClass,gen.translate("parameterOne",av)):""));
    realSb.append(TEXT_642);
     if (customGetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPostfixCode,gen.translate("getMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    realSb.append(TEXT_643);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_644);
     if (av.numberOfComments() > 0 && av.numberOfRequirements() > 0) { List<Comment> toComment = new ArrayList<Comment>(av.getComments()); toComment.addAll(Requirement.convertToComment(av.getRequirements())); append(realSb, "\n  {0}", Comment.format("Attribute Javadoc", toComment)); } 
     if (av.numberOfComments() > 0 && av.numberOfRequirements() == 0) { append(realSb, "\n  {0}", Comment.format("Attribute Javadoc", av.getComments())); } 
     if (av.numberOfComments() == 0 && av.numberOfRequirements() > 0) { append(realSb, "\n  {0}", Requirement.format("Attribute Javadoc", av.getRequirements())); } 
    realSb.append(umpleSourceFile);
    realSb.append(TEXT_645);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_646);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_647);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_648);
     if (customGetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetManyPrefixCode,gen.translate("getManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_649);
    String scgName = relatedAssoc.getEnd(av.getRelevantEnd()).getSuperClassName();
    realSb.append(TEXT_650);
    realSb.append(scgName);
    realSb.append(TEXT_651);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_652);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_653);
     if (customGetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetManyPostfixCode,gen.translate("getManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_654);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_655);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_656);
    
      }
      else
      {
        
    realSb.append(TEXT_657);
    /*association_GetMany*/
    realSb.append(TEXT_658);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_659);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_660);
     if (customGetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPrefixCode,gen.translate("getMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPre()?"\n"+traceItem.trace(gen, av,"as_g", uClass,gen.translate("associationMany",av)+".get(index)"):""));
    realSb.append(TEXT_661);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_662);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_663);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_664);
     for( TraceItem traceItem : traceItems ) 
    realSb.append((traceItem!=null&&traceItem.getIsPost()?"\n"+traceItem.trace(gen, av,"as_g", uClass,gen.translate("parameterOne",av)):""));
    realSb.append(TEXT_665);
     if (customGetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetPostfixCode,gen.translate("getMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    realSb.append(TEXT_666);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_667);
     if (av.numberOfComments() > 0 && av.numberOfRequirements() > 0) { List<Comment> toComment = new ArrayList<Comment>(av.getComments()); toComment.addAll(Requirement.convertToComment(av.getRequirements())); append(realSb, "\n  {0}", Comment.format("Attribute Javadoc", toComment)); } 
     if (av.numberOfComments() > 0 && av.numberOfRequirements() == 0) { append(realSb, "\n  {0}", Comment.format("Attribute Javadoc", av.getComments())); } 
     if (av.numberOfComments() == 0 && av.numberOfRequirements() > 0) { append(realSb, "\n  {0}", Requirement.format("Attribute Javadoc", av.getRequirements())); } 
    realSb.append(umpleSourceFile);
    realSb.append(TEXT_668);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_669);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_670);
     if (customGetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetManyPrefixCode,gen.translate("getManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_671);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_672);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_673);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_674);
     if (customGetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customGetManyPostfixCode,gen.translate("getManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customGetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_675);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_676);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_677);
     if (customNumberOfPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customNumberOfPrefixCode,gen.translate("numberOfMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customNumberOfPrefixCode, "    ")); } 
    realSb.append(TEXT_678);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_679);
     if (customNumberOfPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customNumberOfPostfixCode,gen.translate("numberOfMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customNumberOfPostfixCode, "    ")); } 
    realSb.append(TEXT_680);
    realSb.append(gen.translate("hasManyMethod",av));
    realSb.append(TEXT_681);
     if (customHasManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customHasManyPrefixCode,gen.translate("hasManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customHasManyPrefixCode, "    ")); } 
    realSb.append(TEXT_682);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_683);
     if (customHasManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customHasManyPostfixCode,gen.translate("hasManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customHasManyPostfixCode, "    ")); } 
    realSb.append(TEXT_684);
    realSb.append(gen.translate("indexOfMethod",av));
    realSb.append(TEXT_685);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_686);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_687);
     if (customIndexOfPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customIndexOfPrefixCode,gen.translate("indexOfMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customIndexOfPrefixCode, "    ")); } 
    realSb.append(TEXT_688);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_689);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_690);
     if (customIndexOfPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customIndexOfPostfixCode,gen.translate("indexOfMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customIndexOfPostfixCode, "    ")); } 
    realSb.append(TEXT_691);
    
        if (relatedAssoc != null && relatedAssoc.getIsSpecialized())
        {
          
    realSb.append(TEXT_692);
    /*association_GetMany_clear*/
    realSb.append(TEXT_693);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_694);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_695);
    
        }
      }
    }
    else
    {
      
    realSb.append(TEXT_696);
    
    }
 }
 gen.setParameterConstraintName("");

    /*association_Set_All*/
    
  // GENERIC FILE - EDIT IN UmpleToTemplate project, then run "ant -f build.codegen.xml to move into the appropriate projects
  
  boolean sortMethodAdded = false; //To ensure that only one sort method is created per class
  for (AssociationVariable av : uClass.getAssociationVariables())
  {
  
    gen.setParameterConstraintName(av.getName());

    
    /*specializationCode_Set*/
    
    AssociationVariable relatedAssociation = av.getRelatedAssociation();
    
    //Association relatedAssoc = uClass.getAssociation(uClass.indexOfAssociationVariable(av));

    boolean reqSuperCode = av.getNeedsSuperCode();
    boolean reqCommonCode = av.getNeedsCommonCode();
    boolean relReqCommonCode = relatedAssociation.getNeedsCommonCode();
    boolean mulChangedToOne = av.getMulChangedToOne();
    boolean relMulChangedToOne = relatedAssociation.getMulChangedToOne();
	boolean mulChangedToN = av.getMulChangedToN();
	boolean reqSetCode = relatedAssociation.getReqSetCode();
	boolean relReqSetCode = av.getReqSetCode();
    String scName = av.getScName();

    

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

    boolean addNewLine = false;
    
    
    if (reqSuperCode) {
    	  JavaSpecGenerator ng = new JavaSpecGenerator();
          ng.getAssociationCode_specialization_reqSuperCode(gen, includeFile, includeFile2, includeFile3, realSb, av, relatedAssociation, 
          				 customSetPrefixCode,  customSetPostfixCode,  customAddPrefixCode,  customAddPostfixCode,  customRemovePrefixCode,  customRemovePostfixCode,
  						 customSetManyPrefixCode,  customSetManyPostfixCode, traceItemAssocRemoves, traceItemAssocAdds, uClass, sortMethodAdded, umpleSourceFile, 
  						 this.uncaughtExceptions, globalUmpleClass, addNewLine, mulChangedToOne, relMulChangedToOne, mulChangedToN, reqSetCode, relReqCommonCode, relReqSetCode, scName);
    		
    }

    else if (reqCommonCode) {
    	  JavaSpecGenerator ng = new JavaSpecGenerator();
          ng.getAssociationCode_specialization_reqCommonCode(gen, includeFile, includeFile2, includeFile3, realSb, av, relatedAssociation,
          				 customSetPrefixCode,  customSetPostfixCode,  customAddPrefixCode,  customAddPostfixCode,  customRemovePrefixCode,  customRemovePostfixCode,
  						 customSetManyPrefixCode,  customSetManyPostfixCode, traceItemAssocRemoves, traceItemAssocAdds, uClass, sortMethodAdded, umpleSourceFile, 
  						 this.uncaughtExceptions, globalUmpleClass, addNewLine, mulChangedToOne, relMulChangedToOne, mulChangedToN, reqSetCode, relReqCommonCode, relReqSetCode, scName);
          
    } 
    
	else {

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
        
    realSb.append(TEXT_697);
    realSb.append(av);
    realSb.append(TEXT_698);
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

      addNewLine = false;
      if (hasIsNumberOfValidMethod)
      {
        if (addNewLine) { appendln(realSb,""); }
        addNewLine = true;
        
    
        
    realSb.append(TEXT_699);
    /*association_IsNumberOfValidMethod*/
    realSb.append(TEXT_700);
    realSb.append(gen.translate("isNumberOfValidMethod",av));
    realSb.append(TEXT_701);
     if (customIsNumberOfValidPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customIsNumberOfValidPrefixCode,gen.translate("isNumberOfValidMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customIsNumberOfValidPrefixCode, "    ")); } 
    realSb.append(TEXT_702);
     if (av.getMultiplicity().isUpperBoundMany()) { 
    realSb.append(TEXT_703);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_704);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_705);
     } else { 
    realSb.append(TEXT_706);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_707);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_708);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_709);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_710);
     } 
    realSb.append(TEXT_711);
     if (customIsNumberOfValidPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customIsNumberOfValidPostfixCode,gen.translate("isNumberOfValidMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customIsNumberOfValidPostfixCode, "    ")); } 
    realSb.append(TEXT_712);
    
      }
      
      if (hasRequiredNumberOfMethod)
      {
        if (addNewLine) { appendln(realSb,""); }
        addNewLine = true;
        
    
        
    realSb.append(TEXT_713);
    /*association_RequiredNumberOfMethod*/
    
    String customRequiredNumberOfPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("requiredNumberOfMethod",av)));
    String customRequiredNumberOfPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("requiredNumberOfMethod",av)));

    realSb.append(TEXT_714);
     if (customRequiredNumberOfPrefixCode == null && customRequiredNumberOfPostfixCode == null) { 
    realSb.append(umpleSourceFile);
    realSb.append(TEXT_715);
    realSb.append(gen.translate("requiredNumberOfMethod",av));
    realSb.append(TEXT_716);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_717);
     } else { 
    realSb.append(TEXT_718);
    realSb.append(gen.translate("requiredNumberOfMethod",av));
    realSb.append(TEXT_719);
     if (customRequiredNumberOfPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRequiredNumberOfPrefixCode,gen.translate("requiredNumberOfMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRequiredNumberOfPrefixCode, "    ")); } 
    realSb.append(TEXT_720);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_721);
     if (customRequiredNumberOfPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRequiredNumberOfPostfixCode,gen.translate("requiredNumberOfMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRequiredNumberOfPostfixCode, "    ")); } 
    realSb.append(TEXT_722);
     } 
    
      }

      if (hasMinimumNumberOfMethod)
      {
        if (addNewLine) { appendln(realSb,""); }
        addNewLine = true;
        
    
        
    realSb.append(TEXT_723);
    /*association_MinimumNumberOfMethod*/
    
    String customMinimumNumberOfPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("minimumNumberOfMethod",av)));
    String customMinimumNumberOfPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("minimumNumberOfMethod",av)));
    
    realSb.append(TEXT_724);
     if (customMinimumNumberOfPrefixCode == null && customMinimumNumberOfPostfixCode == null) { 
    realSb.append(TEXT_725);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_726);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_727);
     } else { 
    realSb.append(TEXT_728);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_729);
     if (customMinimumNumberOfPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customMinimumNumberOfPrefixCode,gen.translate("minimumNumberOfMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customMinimumNumberOfPrefixCode, "    ")); } 
    realSb.append(TEXT_730);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_731);
     if (customMinimumNumberOfPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customMinimumNumberOfPostfixCode,gen.translate("minimumNumberOfMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customMinimumNumberOfPostfixCode, "    ")); } 
    realSb.append(TEXT_732);
     } 
    
      }
      
      if (hasMaximumNumberOfMethod)
      {
        if (addNewLine) { appendln(realSb,""); }
        addNewLine = true;
        
    
        
    realSb.append(TEXT_733);
    /*association_MaximumNumberOfMethod*/
    
    String customGetPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("getMethod",av)));

    String customMaximumNumberOfPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("maximumNumberOfMethod",av)));
    String customMaximumNumberOfPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("maximumNumberOfMethod",av)));
    
    
    realSb.append(TEXT_734);
     if (customMaximumNumberOfPrefixCode == null && customMaximumNumberOfPostfixCode == null) { 
    realSb.append(TEXT_735);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_736);
    realSb.append(av.getMultiplicity().getUpperBound());
    realSb.append(TEXT_737);
     } else { 
    realSb.append(umpleSourceFile);
    realSb.append(TEXT_738);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_739);
     if (customMaximumNumberOfPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customMaximumNumberOfPrefixCode,gen.translate("maximumNumberOfMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customMaximumNumberOfPrefixCode, "    ")); } 
    realSb.append(TEXT_740);
    realSb.append(av.getMultiplicity().getUpperBound());
    realSb.append(TEXT_741);
     if (customMaximumNumberOfPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customMaximumNumberOfPostfixCode,gen.translate("maximumNumberOfMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customMaximumNumberOfPostfixCode, "    ")); } 
    realSb.append(TEXT_742);
     } 
    
      }
      
      if (hasAddManyToManyTemplateMethod)
      {
        if (addNewLine) { appendln(realSb,""); }
        addNewLine = true;
        
    realSb.append(TEXT_743);
    /*association_AddManyToManyMethod*/
    realSb.append(TEXT_744);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_745);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_746);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_747);
     if (customAddPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_748);
     if (!av.getMultiplicity().isUpperBoundMany()) { 
    realSb.append(TEXT_749);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_750);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_751);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_752);
     } 
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_753);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_754);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_755);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_756);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_757);
    realSb.append(gen.relatedTranslate("indexOfMethod",av));
    realSb.append(TEXT_758);
    realSb.append(self);
    realSb.append(TEXT_759);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_760);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_761);
    realSb.append(self);
    realSb.append(TEXT_762);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_763);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_764);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_765);
    
      }
      
      if (hasRemoveManyTemplateMethod)
      {
        if (addNewLine) { appendln(realSb,""); }
        addNewLine = true;
        
    realSb.append(TEXT_766);
    /*association_RemoveMany*/
    realSb.append(TEXT_767);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_768);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_769);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_770);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_771);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_772);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_773);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_774);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av));
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_775);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_776);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_777);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_778);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_779);
    realSb.append(gen.relatedTranslate("indexOfMethod",av));
    realSb.append(TEXT_780);
    realSb.append(self);
    realSb.append(TEXT_781);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_782);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_783);
    realSb.append(self);
    realSb.append(TEXT_784);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_785);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_786);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av));
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPost()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_787);
    
      }
    
 // } // end else for non-specializated associations  

    // current cutoff point

  
    if (addNewLine) { appendln(realSb,""); }
    addNewLine = true;

////// TODOOOOO



  
      
    
      // How do you dynamically include a file in JET?!?
      
      if (includeFile == "association_SetUnidirectionalOptionalOne.jet")
      {
        
    realSb.append(TEXT_788);
    /*association_SetUnidirectionalOptionalOne*/
     String accessModifier = (av.isImmutable()) ? "private" : "public"; 
    realSb.append(TEXT_789);
    realSb.append(accessModifier);
    realSb.append(TEXT_790);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_791);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_792);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_793);
     if (customSetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",av));
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_794);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_795);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_796);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_797);
    
      }
      else if (includeFile == "association_SetUnidirectionalOne.jet")
      {
        
    realSb.append(TEXT_798);
    /*association_SetUnidirectionalOne*/
     String accessModifier = (av.isImmutable()) ? "private" : "public"; 
    realSb.append(TEXT_799);
    realSb.append(accessModifier);
    realSb.append(TEXT_800);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_801);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_802);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_803);
     if (customSetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_804);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_805);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_806);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_807);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_808);
    
      }
      else if (includeFile == "association_SetOptionalOneToOne.jet")
      {
        
    realSb.append(TEXT_809);
    /*association_SetOptionalOneToOne*/
    realSb.append(TEXT_810);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_811);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_812);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_813);
     if (customSetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_814);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_815);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_816);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_817);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_818);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_819);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_820);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_821);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "      ")); } 
    realSb.append(TEXT_822);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_823);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_824);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_825);
    realSb.append(gen.relatedTranslate("parameterOld",av));
    realSb.append(TEXT_826);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_827);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_828);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_829);
    realSb.append(gen.relatedTranslate("parameterOld",av));
    realSb.append(TEXT_830);
    realSb.append(gen.relatedTranslate("parameterOld",av));
    realSb.append(TEXT_831);
    realSb.append(gen.relatedTranslate("parameterOld",av));
    realSb.append(TEXT_832);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_833);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_834);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_835);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_836);
    realSb.append(self);
    realSb.append(TEXT_837);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,"1"):""));
    realSb.append(TEXT_838);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_839);
    
      }
      else if (includeFile == "association_SetOneToOptionalOne.jet")
      {
        
    realSb.append(TEXT_840);
    /*association_SetOneToOptionalOne*/
    realSb.append(TEXT_841);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_842);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_843);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_844);
     if (customSetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_845);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_846);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_847);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_848);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_849);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_850);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_851);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_852);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_853);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_854);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_855);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_856);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_857);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_858);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_859);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_860);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_861);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_862);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_863);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_864);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_865);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_866);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_867);
    realSb.append(self);
    realSb.append(TEXT_868);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_869);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_870);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_871);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,"1"):""));
    realSb.append(TEXT_872);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_873);
    
      }
      else if (includeFile == "association_AddMandatoryManyToOne.jet")
      {
        
    realSb.append(TEXT_874);
    /*association_AddMandatoryManyToOne*/
    realSb.append(TEXT_875);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_876);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_877);
    realSb.append(gen.translate("methodArgumentsExcept",relatedAssociation));
    realSb.append(TEXT_878);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_879);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_880);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_881);
    realSb.append(gen.translate("callerArgumentsExcept",relatedAssociation));
    realSb.append(TEXT_882);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_883);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_884);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_885);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_886);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_887);
     if (customAddPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av));
     append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_888);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_889);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_890);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_891);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_892);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_893);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_894);
    realSb.append(self);
    realSb.append(TEXT_895);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_896);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_897);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_898);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_899);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_900);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_901);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_902);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_903);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_904);
    realSb.append(self);
    realSb.append(TEXT_905);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_906);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_907);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_908);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av));
     append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_909);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_910);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_911);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_912);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_913);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_914);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_915);
    realSb.append(self);
    realSb.append(TEXT_916);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_917);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_918);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_919);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_920);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_921);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_922);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_923);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_924);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_925);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_926);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_927);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPost()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_928);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_929);
    
      }
      else if (includeFile == "association_AddMNToOnlyOne.jet")
      {
        
    realSb.append(TEXT_930);
    /*association_AddMNToOnlyOne*/
     if(!(av.getRelatedAssociation().getUmpleClass().getIsAbstract())) {
    realSb.append(TEXT_931);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_932);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_933);
    realSb.append(gen.translate("methodArgumentsExcept",relatedAssociation));
    realSb.append(TEXT_934);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_935);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_936);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_937);
    realSb.append(gen.translate("callerArgumentsExcept",relatedAssociation));
    realSb.append(TEXT_938);
    }
    realSb.append(TEXT_939);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_940);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_941);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_942);
     if (customAddPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_943);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_944);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_945);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_946);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_947);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_948);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_949);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_950);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_951);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_952);
    realSb.append(self);
    realSb.append(TEXT_953);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_954);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_955);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_956);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_957);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_958);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_959);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_960);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_961);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_962);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_963);
    realSb.append(self);
    realSb.append(TEXT_964);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_965);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_966);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_967);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_968);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_969);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_970);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_971);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_972);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_973);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_974);
    realSb.append(self);
    realSb.append(TEXT_975);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_976);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_977);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_978);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_979);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_980);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_981);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_982);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_983);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_984);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_985);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_986);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPost()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_987);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_988);
    
      }
      else if (includeFile == "association_AddOptionalNToOne.jet")
      {
        
    realSb.append(TEXT_989);
    /*association_AddOptionalNToOne*/
     if(!(av.getRelatedAssociation().getUmpleClass().getIsAbstract())) {
    realSb.append(TEXT_990);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_991);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_992);
    realSb.append(gen.translate("methodArgumentsExcept",relatedAssociation));
    realSb.append(TEXT_993);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_994);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_995);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_996);
    realSb.append(gen.translate("callerArgumentsExcept",relatedAssociation));
    realSb.append(TEXT_997);
    }
    realSb.append(TEXT_998);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_999);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1000);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1001);
     if (customAddPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_1002);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1003);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1004);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_1005);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_1006);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1007);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1008);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1009);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_1010);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1011);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1012);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1013);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_1014);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1015);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1016);
    realSb.append(self);
    realSb.append(TEXT_1017);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1018);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1019);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1020);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_1021);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1022);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1023);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1024);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1025);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1026);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1027);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1028);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1029);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1030);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1031);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1032);
    
      }
      else if (includeFile == "association_SetOptionalNToMany.jet")
      {
        
    realSb.append(TEXT_1033);
    /*association_SetOptionalNToMany*/
    realSb.append(TEXT_1034);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_1035);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1036);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1037);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPrefixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_1038);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1039);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1040);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1041);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1042);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1043);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1044);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1045);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1046);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1047);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1048);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1049);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1050);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1051);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1052);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_1053);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1054);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1055);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1056);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1057);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1058);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1059);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1060);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1061);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1062);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1063);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1064);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1065);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1066);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1067);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1068);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1069);
    realSb.append(self);
    realSb.append(TEXT_1070);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1071);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_1072);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1073);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_1074);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1075);
    realSb.append(self);
    realSb.append(TEXT_1076);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_1077);
    
      }
      else if (includeFile == "association_AddManyToOne.jet")
      {
        
    realSb.append(TEXT_1078);
    /*association_AddManyToOne*/
    realSb.append(TEXT_1079);
     if(!(av.getRelatedAssociation().getUmpleClass().getIsAbstract())) {
    realSb.append(TEXT_1080);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1081);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1082);
    realSb.append(gen.translate("methodArgumentsExcept",relatedAssociation));
    realSb.append(TEXT_1083);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1084);
    realSb.append(gen.translate("callerArgumentsExcept",relatedAssociation));
    realSb.append(TEXT_1085);
    }
    realSb.append(TEXT_1086);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1087);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1088);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1089);
     if (customAddPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_1090);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_1091);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1092);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1093);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1094);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_1095);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1096);
    realSb.append(self);
    realSb.append(TEXT_1097);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1098);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1099);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_1100);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1101);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1102);
    realSb.append(self);
    realSb.append(TEXT_1103);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1104);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1105);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1106);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_1107);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1108);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1109);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1110);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1111);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1112);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1113);
    realSb.append(self);
    realSb.append(TEXT_1114);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1115);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1116);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1117);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1118);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1119);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPost()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1120);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1121);
    
      }
      else if (includeFile == "association_SetOptionalOneToOptionalOne.jet")
      {
        
    realSb.append(TEXT_1122);
    /*association_SetOptionalOneToOptionalOne*/
    realSb.append(TEXT_1123);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_1124);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1125);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1126);
     if (customSetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_1127);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1128);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1129);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1130);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1131);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1132);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1133);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1134);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1135);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1136);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1137);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_1138);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1139);
    realSb.append(gen.translate("parameterCurrent",av));
    realSb.append(TEXT_1140);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_1141);
    realSb.append(gen.translate("parameterCurrent",av));
    realSb.append(TEXT_1142);
    realSb.append(gen.translate("parameterCurrent",av));
    realSb.append(TEXT_1143);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1144);
    realSb.append(gen.translate("parameterCurrent",av));
    realSb.append(TEXT_1145);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1146);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1147);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1148);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_1149);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1150);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1151);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1152);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1153);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1154);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1155);
    realSb.append(self);
    realSb.append(TEXT_1156);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,"1"):""));
    realSb.append(TEXT_1157);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_1158);
    
      }
      else if (includeFile == "association_AddMNToMany.jet")
      {
        
    realSb.append(TEXT_1159);
    /*association_AddMNToMany*/
    realSb.append(TEXT_1160);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1161);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1162);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1163);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1164);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1165);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1166);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_1167);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1168);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1169);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_1170);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1171);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1172);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1173);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1174);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPost()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1175);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1176);
    realSb.append(gen.relatedTranslate("indexOfMethod",av));
    realSb.append(TEXT_1177);
    realSb.append(self);
    realSb.append(TEXT_1178);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1179);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1180);
    realSb.append(self);
    realSb.append(TEXT_1181);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1182);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1183);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1184);
    
      }
      else if (includeFile == "association_AddMStarToMany.jet")
      {
        
    realSb.append(TEXT_1185);
    /*association_AddMStarToMany*/
    realSb.append(TEXT_1186);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1187);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1188);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1189);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1190);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1191);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1192);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_1193);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1194);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1195);
     if (customRemovePostfixCode != null) {
      addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_1196);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1197);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1198);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1199);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1200);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPost()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1201);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1202);
    realSb.append(gen.relatedTranslate("indexOfMethod",av));
    realSb.append(TEXT_1203);
    realSb.append(self);
    realSb.append(TEXT_1204);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1205);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1206);
    realSb.append(self);
    realSb.append(TEXT_1207);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1208);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1209);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1210);
    
      }
      else if (includeFile == "association_SetOptionalOneToOptionalN.jet")
      {
        
    realSb.append(TEXT_1211);
    /*association_SetOptionalOneToOptionalN*/
    realSb.append(TEXT_1212);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_1213);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1214);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1215);
     if (customSetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_1216);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1217);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1218);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_1219);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1220);
    realSb.append(gen.relatedTranslate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1221);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_1222);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1223);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1224);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1225);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1226);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1227);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1228);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1229);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1230);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1231);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1232);
    realSb.append(self);
    realSb.append(TEXT_1233);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1234);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1235);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1236);
    realSb.append(self);
    realSb.append(TEXT_1237);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_1238);
    
      }
      else if (includeFile == "association_SetOneToMany.jet")
      {
        
    realSb.append(TEXT_1239);
    /*association_SetOneToMany*/
    realSb.append(TEXT_1240);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_1241);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1242);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1243);
     if (customSetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_1244);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1245);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_1246);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1247);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1248);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1249);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1250);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1251);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1252);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1253);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1254);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1255);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1256);
    realSb.append(self);
    realSb.append(TEXT_1257);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1258);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1259);
    realSb.append(self);
    realSb.append(TEXT_1260);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_1261);
    
      }
      else if (includeFile == "association_SetOneToManyAssociationClass.jet")
      {
        
    realSb.append(TEXT_1262);
    /*association_SetOneToManyAssociationClass*/
    realSb.append(TEXT_1263);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_1264);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1265);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1266);
     if (customSetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_1267);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1268);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_1269);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1270);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1271);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1272);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1273);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1274);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1275);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1276);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1277);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1278);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1279);
    realSb.append(self);
    realSb.append(TEXT_1280);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1281);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1282);
    realSb.append(self);
    realSb.append(TEXT_1283);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1284);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1285);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_1286);
    
      }
      else if (includeFile == "association_SetOneToAtMostN.jet")
      {
        
    realSb.append(TEXT_1287);
    /*association_SetOneToAtMostN*/
    realSb.append(TEXT_1288);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_1289);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1290);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1291);
     if (customSetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_1292);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1293);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1294);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1295);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_1296);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1297);
    realSb.append(relatedAssociation.getMultiplicity().getUpperBound());
    realSb.append(TEXT_1298);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1299);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_1300);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1301);
    realSb.append(gen.relatedTranslate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1302);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_1303);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1304);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1305);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1306);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1307);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1308);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1309);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1310);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1311);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1312);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1313);
    realSb.append(self);
    realSb.append(TEXT_1314);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1315);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1316);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
        append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_1317);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1318);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1319);
    realSb.append(self);
    realSb.append(TEXT_1320);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_1321);
    
      }
      else if (includeFile == "association_SetOneToMandatoryMany.jet")
      {
        
    realSb.append(TEXT_1322);
    /*association_SetOneToMandatoryMany*/
    realSb.append(TEXT_1323);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_1324);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1325);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1326);
     if (customSetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",av));
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_1327);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1328);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1329);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1330);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av));
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_1331);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1332);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1333);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_1334);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1335);
    realSb.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1336);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_1337);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1338);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1339);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1340);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1341);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1342);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1343);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1344);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1345);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1346);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1347);
    realSb.append(self);
    realSb.append(TEXT_1348);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1349);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1350);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
        append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_1351);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1352);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1353);
    realSb.append(self);
    realSb.append(TEXT_1354);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_1355);
    
      }
      else if (includeFile == "association_AddManyToOptionalOne.jet")
      {
        
    realSb.append(TEXT_1356);
    /*association_AddManyToOptionalOne*/
    realSb.append(TEXT_1357);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1358);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1359);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1360);
     if (customAddPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_1361);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_1362);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1363);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1364);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1365);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1366);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1367);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1368);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1369);
    realSb.append(self);
    realSb.append(TEXT_1370);
    realSb.append(self);
    realSb.append(TEXT_1371);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1372);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1373);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1374);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1375);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1376);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1377);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1378);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1379);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1380);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_1381);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1382);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1383);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1384);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1385);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1386);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1387);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1388);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1389);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1390);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1391);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1392);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPost()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1393);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1394);
    
      }
      else if (includeFile == "association_SetOptionalOneToMany.jet")
      {
        
    realSb.append(TEXT_1395);
    /*association_SetOptionalOneToMany*/
    realSb.append(TEXT_1396);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_1397);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1398);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1399);
     if (customSetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_1400);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1401);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1402);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1403);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1404);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1405);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1406);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1407);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1408);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1409);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1410);
    realSb.append(self);
    realSb.append(TEXT_1411);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1412);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1413);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1414);
    realSb.append(self);
    realSb.append(TEXT_1415);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_1416);
    
      }
      else if (includeFile == "association_AddOptionalNToOptionalOne.jet")
      {
        
    realSb.append(TEXT_1417);
    /*association_AddOptionalNToOptionalOne*/
    realSb.append(TEXT_1418);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1419);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1420);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1421);
     if (customAddPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_1422);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1423);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1424);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_1425);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_1426);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1427);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1428);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1429);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1430);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1431);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1432);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1433);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1434);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1435);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1436);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1437);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1438);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1439);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1440);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1441);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1442);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_1443);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1444);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1445);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1446);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1447);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1448);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1449);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1450);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1451);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1452);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPost()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1453);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1454);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1455);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1456);
    
      }
      else if (includeFile == "association_AddUnidirectionalMN.jet")
      {
        
    realSb.append(TEXT_1457);
    /*association_AddUnidirectionalMN*/
    realSb.append(TEXT_1458);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1459);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1460);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1461);
     if (customAddPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_1462);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1463);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1464);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1465);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1466);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1467);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1468);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_1469);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1470);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1471);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1472);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1473);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1474);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1475);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1476);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1477);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1478);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1479);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1480);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1481);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1482);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPost()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1483);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1484);
    
      }
      else if (includeFile == "association_AddMNToOptionalOne.jet")
      {
        
    realSb.append(TEXT_1485);
    /*association_AddMNToOptionalOne*/
    realSb.append(TEXT_1486);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1487);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1488);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1489);
     if (customAddPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av));
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_1490);
     if (!av.isStar()) { 
    realSb.append(TEXT_1491);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1492);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1493);
     if (customAddPostfixCode != null) {addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_1494);
     } 
    realSb.append(TEXT_1495);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_1496);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1497);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1498);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1499);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1500);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1501);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1502);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1503);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_1504);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1505);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1506);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1507);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1508);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1509);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1510);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1511);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1512);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1513);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1514);
    realSb.append(self);
    realSb.append(TEXT_1515);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_1516);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1517);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1518);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1519);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1520);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1521);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1522);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1523);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1524);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1525);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1526);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1527);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1528);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1529);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1530);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1531);
    
      }
      else if (includeFile == "association_SetNToOptionalOne.jet")
      {
        
    realSb.append(TEXT_1532);
    /*association_SetNToOptionalOne*/
    realSb.append(TEXT_1533);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_1534);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1535);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1536);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPrefixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_1537);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1538);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1539);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1540);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1541);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1542);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1543);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1544);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1545);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av));
        append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "        ")); } 
    realSb.append(TEXT_1546);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1547);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1548);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1549);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1550);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
        append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "        ")); } 
    realSb.append(TEXT_1551);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1552);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1553);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1554);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1555);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_1556);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1557);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1558);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1559);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1560);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1561);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1562);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1563);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1564);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1565);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1566);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1567);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1568);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1569);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_1570);
    realSb.append(TEXT_1571);
    /*association_GetPrivate*/
    realSb.append(TEXT_1572);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1573);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1574);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1575);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_1576);
    realSb.append(gen.relatedTranslate("parameterOne",av));
    realSb.append(TEXT_1577);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1578);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1579);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1580);
    realSb.append(gen.relatedTranslate("parameterOne",av));
    realSb.append(TEXT_1581);
    realSb.append(gen.relatedTranslate("parameterOne",av));
    realSb.append(TEXT_1582);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1583);
    
      }
      else if (includeFile == "association_AddUnidirectionalMany.jet")
      {
        
    realSb.append(TEXT_1584);
    /*association_AddUnidirectionalMany*/
    realSb.append(TEXT_1585);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1586);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1587);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1588);
     if (customAddPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1589);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1590);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1591);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1592);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_1593);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1594);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1595);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1596);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1597);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1598);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1599);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1600);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1601);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1602);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPost()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1603);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1604);
    
      }
      else if (includeFile == "association_AddUnidirectionalOptionalN.jet")
      {
        
    realSb.append(TEXT_1605);
    /*association_AddUnidirectionalOptionalN*/
    realSb.append(TEXT_1606);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1607);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1608);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1609);
     if (customAddPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_1610);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1611);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1612);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1613);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1614);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1615);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1616);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_1617);
    realSb.append(umpleSourceFile);
    realSb.append(TEXT_1618);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1619);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1620);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1621);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1622);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1623);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1624);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1625);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1626);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1627);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1628);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1629);
    
      }
      else if (includeFile == "association_AddUnidirectionalMStar.jet")
      {
        
    realSb.append(TEXT_1630);
    /*association_AddUnidirectionalMStar*/
    realSb.append(TEXT_1631);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1632);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1633);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1634);
     if (customAddPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1635);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1636);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1637);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1638);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_1639);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1640);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1641);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1642);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1643);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1644);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1645);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_1646);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1647);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1648);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_1649);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1650);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1651);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1652);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPost()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1653);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1654);
    
      }
      else if (includeFile == "association_SetUnidirectionalN.jet")
      {
        
    realSb.append(TEXT_1655);
    /*association_SetUnidirectionalN*/
     String accessModifier = (av.isImmutable()) ? "private" : "public"; 
    realSb.append(TEXT_1656);
    realSb.append(accessModifier);
    realSb.append(TEXT_1657);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_1658);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1659);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1660);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPrefixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_1661);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1662);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1663);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1664);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1665);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1666);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1667);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1668);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1669);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1670);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1671);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1672);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1673);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1674);
    realSb.append(gen.translate("requiredNumberOfMethod",av));
    realSb.append(TEXT_1675);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_1676);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1677);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1678);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1679);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_1680);
    
      }
      else if (includeFile == "association_SetUnidirectionalMany.jet")
      {
        
    realSb.append(TEXT_1681);
    /*association_SetUnidirectionalMany*/
     String accessModifier = (av.isImmutable()) ? "private" : "public"; 
    realSb.append(TEXT_1682);
    realSb.append(accessModifier);
    realSb.append(TEXT_1683);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_1684);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1685);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1686);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPrefixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_1687);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1688);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1689);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1690);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1691);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1692);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1693);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1694);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1695);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1696);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1697);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1698);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1699);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_1700);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1701);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1702);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1703);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_1704);
    
      }
      else if (includeFile == "association_SetOptionalOneToMandatoryMany.jet")
      {
        
    realSb.append(TEXT_1705);
    /*association_SetOptionalOneToMandatoryMany*/
    realSb.append(TEXT_1706);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_1707);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1708);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1709);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1710);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1711);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1712);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1713);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1714);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1715);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1716);
    realSb.append(self);
    realSb.append(TEXT_1717);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1718);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1719);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1720);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1721);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1722);
    realSb.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1723);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1724);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_1725);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1726);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1727);
    realSb.append(self);
    realSb.append(TEXT_1728);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1729);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1730);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1731);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1732);
    realSb.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1733);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1734);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_1735);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1736);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1737);
    realSb.append(self);
    realSb.append(TEXT_1738);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1739);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1740);
    realSb.append(self);
    realSb.append(TEXT_1741);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1742);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1743);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1744);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1745);
    
      }
      else if (includeFile == "association_SetOptionalOneToMandatoryMN.jet")
      {
        
    /*association_SetOptionalOneToMandatoryMN*/
    realSb.append(TEXT_1746);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_1747);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1748);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1749);
    realSb.append(gen.relatedTranslate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1750);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1751);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1752);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1753);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1754);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1755);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1756);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1757);
    realSb.append(self);
    realSb.append(TEXT_1758);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1759);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1760);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1761);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1762);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1763);
    realSb.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1764);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1765);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_1766);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1767);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1768);
    realSb.append(self);
    realSb.append(TEXT_1769);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1770);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1771);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1772);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1773);
    realSb.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1774);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1775);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_1776);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1777);
    realSb.append(gen.relatedTranslate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1778);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1779);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_1780);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1781);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1782);
    realSb.append(self);
    realSb.append(TEXT_1783);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1784);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1785);
    realSb.append(self);
    realSb.append(TEXT_1786);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1787);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1788);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1789);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1790);
    
      }
      else if (includeFile != null)
      {
        appendln(realSb,"You forgot to include {0}",includeFile);
      }
      
      
    
      if (includeFile2 == "association_SetMNToMany.jet")
      {
        
    realSb.append(TEXT_1791);
    /*association_SetMNToMany*/
    realSb.append(TEXT_1792);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_1793);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1794);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1795);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPrefixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_1796);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1797);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1798);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1799);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1800);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1801);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1802);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1803);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1804);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1805);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1806);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1807);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1808);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1809);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1810);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1811);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1812);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_1813);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1814);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1815);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1816);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1817);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1818);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1819);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1820);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1821);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1822);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1823);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1824);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1825);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1826);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1827);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1828);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1829);
    realSb.append(self);
    realSb.append(TEXT_1830);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1831);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_1832);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1833);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_1834);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1835);
    realSb.append(self);
    realSb.append(TEXT_1836);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av));
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_1837);
    
      }
      else if (includeFile2 == "association_SetMStarToMany.jet")
      {
        
    realSb.append(TEXT_1838);
    /*association_SetMStarToMany*/
    realSb.append(TEXT_1839);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_1840);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1841);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1842);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPrefixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_1843);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1844);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1845);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1846);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1847);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1848);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1849);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1850);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1851);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1852);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1853);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1854);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1855);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1856);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1857);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_1858);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1859);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1860);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1861);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1862);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1863);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1864);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1865);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1866);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1867);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1868);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1869);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1870);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1871);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1872);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1873);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1874);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1875);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_1876);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1877);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_1878);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1879);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_1880);
    
      }
      else if (includeFile2 == "association_SetUnidirectionalMN.jet")
      {
        
    realSb.append(TEXT_1881);
    /*association_SetUnidirectionalMN*/
     String accessModifier = (av.isImmutable()) ? "private" : "public"; 
    realSb.append(TEXT_1882);
    realSb.append(accessModifier);
    realSb.append(TEXT_1883);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_1884);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1885);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1886);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPrefixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_1887);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1888);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1889);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1890);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1891);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1892);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1893);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1894);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1895);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1896);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1897);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1898);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1899);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1900);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1901);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1902);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1903);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_1904);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1905);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1906);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1907);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_1908);
    
      }
      else if (includeFile2 == "association_SetMNToOptionalOne.jet")
      {
        
    realSb.append(TEXT_1909);
    /*association_SetMNToOptionalOne*/
    
  String existingToNewMap = StringFormatter.format("{0}ToNew{1}", relatedAssociation.getName(), av.getUpperCaseName());
  String orCheckMaxBound = av.isStar() ? "" : StringFormatter.format(" || {0}.length > {1}()", gen.translate("parameterMany",av), gen.translate("maximumNumberOfMethod",av));

    realSb.append(TEXT_1910);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_1911);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1912);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1913);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPrefixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_1914);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1915);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1916);
    realSb.append(orCheckMaxBound);
    realSb.append(TEXT_1917);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_1918);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1919);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1920);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1921);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_1922);
    realSb.append(existingToNewMap);
    realSb.append(TEXT_1923);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_1924);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1925);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1926);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1927);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1928);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1929);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
        append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "        ")); } 
    realSb.append(TEXT_1930);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1931);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1932);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1933);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1934);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_1935);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1936);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1937);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1938);
    realSb.append(existingToNewMap);
    realSb.append(TEXT_1939);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1940);
    realSb.append(existingToNewMap);
    realSb.append(TEXT_1941);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1942);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1943);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1944);
    realSb.append(existingToNewMap);
    realSb.append(TEXT_1945);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1946);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_1947);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "          ")); } 
    realSb.append(TEXT_1948);
    realSb.append(existingToNewMap);
    realSb.append(TEXT_1949);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1950);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1951);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1952);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1953);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1954);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1955);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1956);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1957);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1958);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1959);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1960);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1961);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1962);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1963);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1964);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1965);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1966);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1967);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1968);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1969);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1970);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1971);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_1972);
    realSb.append(TEXT_1571);
    /*association_GetPrivate*/
    realSb.append(TEXT_1572);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1573);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1574);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1575);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_1576);
    realSb.append(gen.relatedTranslate("parameterOne",av));
    realSb.append(TEXT_1577);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1578);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1579);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1580);
    realSb.append(gen.relatedTranslate("parameterOne",av));
    realSb.append(TEXT_1581);
    realSb.append(gen.relatedTranslate("parameterOne",av));
    realSb.append(TEXT_1582);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1583);
    
      }
      else if (includeFile2 == "association_SetUnidirectionalOptionalN.jet")
      {
        
    realSb.append(TEXT_1973);
    /*association_SetUnidirectionalOptionalN*/
     String accessModifier = (av.isImmutable()) ? "private" : "public"; 
    realSb.append(TEXT_1974);
    realSb.append(accessModifier);
    realSb.append(TEXT_1975);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_1976);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1977);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1978);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPrefixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_1979);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1980);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1981);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1982);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1983);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1984);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1985);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1986);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1987);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1988);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1989);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1990);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1991);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1992);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1993);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_1994);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1995);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1996);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1997);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_1998);
    
      }
      else if (includeFile2 == "association_SetUnidirectionalMStar.jet")
      {
        
    realSb.append(TEXT_1999);
    /*association_SetUnidirectionalMStar*/
     String accessModifier = (av.isImmutable()) ? "private" : "public"; 
    realSb.append(TEXT_2000);
    realSb.append(accessModifier);
    realSb.append(TEXT_2001);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_2002);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2003);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_2004);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPrefixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_2005);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2006);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2007);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2008);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2009);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2010);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_2011);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2012);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2013);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2014);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2015);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2016);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_2017);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2018);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_2019);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_2020);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2021);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2022);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2023);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_2024);
    
      }
      else if (includeFile2 != null)
      {
        appendln(realSb,"You forgot to include {0}",includeFile2);
      }
      
      if(includeFile3 == "association_Sort.jet" && !sortMethodAdded)
      {
        
    /*association_Sort*/
    realSb.append(TEXT_2025);
    
        sortMethodAdded = true; //after the sort method has been added, this boolean stops it from being added again
      }
      else if(includeFile3 == "association_AddIndexControlFunctions.jet")
      {
        
    realSb.append(TEXT_2026);
    /*association_AddIndexControlFunctions*/
    realSb.append(TEXT_2027);
    realSb.append(gen.translate("addAtMethod",av));
    realSb.append(TEXT_2028);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2029);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2030);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_2031);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2032);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_2033);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_2034);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_2035);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2036);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2037);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2038);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2039);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_2040);
    realSb.append(gen.translate("addOrMoveAtMethod",av));
    realSb.append(TEXT_2041);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2042);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2043);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2044);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2045);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_2046);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_2047);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_2048);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2049);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2050);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2051);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2052);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_2053);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_2054);
    realSb.append(gen.translate("addAtMethod",av));
    realSb.append(TEXT_2055);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2056);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_2057);
    
      }

    }
  
  }
  gen.setParameterConstraintName("");

    
    if(uClass.getIsInternalSerializable() && !uClass.getIsDistributed())
    {
      boolean hasInternalTransientAttributes = false;
      for(Attribute av:uClass.getAttributes())
        hasInternalTransientAttributes=av.getIsInternalTransient()?true:hasInternalTransientAttributes;
      if(hasInternalTransientAttributes)
      {
        
    realSb.append(TEXT_2058);
     for( Attribute av : uClass.getAttributes() ) 
    realSb.append((av.getIsInternalTransient()?"\n    "+av.getName()+" = "+av.getCodeblock().getCode()+";":""));
    realSb.append(TEXT_2059);
    
      }
    }
    return realSb.toString();
    } 
    
    private String getEqualsCode(StringBuilder realSb, UmpleModel model,UmpleClass uClass, GeneratedClass gClass, JavaGenerator gen, boolean isFirst)
  {
    realSb.append(TEXT_2060);
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
      String avString = gen.translate("getMethod",av)+"()";
      if (!av.isImmutable() || av.getIsLazy()) canSet.append(StringFormatter.format("    {0} = false;\n",gen.translate("attributeCanSet",av)));
      if (av.getIsList())
      {
        String avStringMany = gen.translate("getManyMethod",av) + "()";
        checks.append(StringFormatter.format("    if ({0}.length != compareTo.{0}.length)\n",avStringMany));
        checks.append(StringFormatter.format("    {\n"));
        checks.append(StringFormatter.format("      return false;\n"));
        checks.append(StringFormatter.format("    }\n\n"));
        checks.append(StringFormatter.format("    for (int i=0; i<{0}.length; i++)\n",avStringMany));
        checks.append(StringFormatter.format("    {\n"));
        checks.append(StringFormatter.format("      {0} me = {1}[i];\n",gen.translate("typeMany",av),avStringMany));
        checks.append(StringFormatter.format("      {0} them = compareTo.{1}[i];\n",gen.translate("typeMany",av),avStringMany));
        checks.append(StringFormatter.format("      if (me == null && them != null)\n"));
        checks.append(StringFormatter.format("      {\n"));
        checks.append(StringFormatter.format("       return false;\n"));
        checks.append(StringFormatter.format("      }\n"));
        checks.append(StringFormatter.format("      else if (me != null && !me.equals(them))\n"));
        checks.append(StringFormatter.format("      {\n"));
        checks.append(StringFormatter.format("        return false;\n"));
        checks.append(StringFormatter.format("      }\n"));
        checks.append(StringFormatter.format("    }\n"));
      }
      else if ("Integer".equals(av.getType()) || "Boolean".equals(av.getType()) || "Double".equals(av.getType()))
      {
        checks.append(StringFormatter.format("    if ({0} != compareTo.{0})\n",avString));
        checks.append(StringFormatter.format("    {\n"));
        checks.append(StringFormatter.format("      return false;\n"));
        checks.append(StringFormatter.format("    }\n"));
      }
      else
      {
        checks.append(StringFormatter.format("    if ({0} == null && compareTo.{0} != null)\n",avString));
        checks.append(StringFormatter.format("    {\n"));
        checks.append(StringFormatter.format("      return false;\n"));
        checks.append(StringFormatter.format("    }\n"));
        checks.append(StringFormatter.format("    else if ({0} != null && !{0}.equals(compareTo.{0}))\n",avString));
        checks.append(StringFormatter.format("    {\n"));
        checks.append(StringFormatter.format("      return false;\n"));
        checks.append(StringFormatter.format("    }\n"));
      }
      checks.append("\n");
    }
    else if (as != null)
    {
      canSet.append(StringFormatter.format("    {0} = false;\n",gen.translate("associationCanSet",as)));
      if (as.isMany())
      {
        String asString = gen.translate("getManyMethod",as) + "()";
        checks.append(StringFormatter.format("    if ({0}.size() != compareTo.{0}.size())\n",asString));
        checks.append(StringFormatter.format("    {\n"));
        checks.append(StringFormatter.format("      return false;\n"));
        checks.append(StringFormatter.format("    }\n\n"));
        checks.append(StringFormatter.format("    for (int i=0; i<{0}.size(); i++)\n",asString));
        checks.append(StringFormatter.format("    {\n"));
        checks.append(StringFormatter.format("      {0} me = {1}.get(i);\n",gen.translate("typeMany",as),asString));
        checks.append(StringFormatter.format("      {0} them = compareTo.{1}.get(i);\n",gen.translate("typeMany",as),asString));
        checks.append(StringFormatter.format("      if (me == null && them != null)\n"));
        checks.append(StringFormatter.format("      {\n"));
        checks.append(StringFormatter.format("       return false;\n"));
        checks.append(StringFormatter.format("      }\n"));
        checks.append(StringFormatter.format("      else if (me != null && !me.equals(them))\n"));
        checks.append(StringFormatter.format("      {\n"));
        checks.append(StringFormatter.format("        return false;\n"));
        checks.append(StringFormatter.format("      }\n"));
        checks.append(StringFormatter.format("    }\n"));
      }
      else
      {
        String asString = gen.translate("getMethod",as) + "()";
        checks.append(StringFormatter.format("    if ({0} == null && compareTo.{0} != null)\n",asString));
        checks.append(StringFormatter.format("    {\n"));
        checks.append(StringFormatter.format("      return false;\n"));
        checks.append(StringFormatter.format("    }\n"));
        checks.append(StringFormatter.format("    else if ({0} != null && !{0}.equals(compareTo.{0}))\n",asString));
        checks.append(StringFormatter.format("    {\n"));
        checks.append(StringFormatter.format("      return false;\n"));
        checks.append(StringFormatter.format("    }\n"));
      }
      checks.append("\n");
    }
    
    if (av != null)
    {
      String avString = gen.translate("getMethod",av)+"()";
      if ("Integer".equals(av.getType()) && !av.getIsList())
      {
        hash.append(StringFormatter.format("    cachedHashCode = cachedHashCode * 23 + {0};\n",avString));
      }
      else if ("Double".equals(av.getType()) && !av.getIsList())
      {
        hash.append(StringFormatter.format("    cachedHashCode = cachedHashCode * 23 + (Double.valueOf({0})).hashCode();\n",avString));
      }
      else if ("Boolean".equals(av.getType()) && !av.getIsList())
      {
        hash.append(StringFormatter.format("    cachedHashCode = cachedHashCode * 23 + ({0} ? 1 : 0);\n",avString));
      }
      else
      {
        String attributeType = av.getIsList() ? "getManyMethod" : "getMethod";
        String typeString = gen.translate(attributeType,av) + "()";
        hash.append(StringFormatter.format("    if ({0} != null)\n",typeString));
        hash.append(StringFormatter.format("    {\n"));
        hash.append(StringFormatter.format("      cachedHashCode = cachedHashCode * 23 + {0}.hashCode();\n",typeString));
        hash.append(StringFormatter.format("    }\n"));
        hash.append(StringFormatter.format("    else\n"));
        hash.append(StringFormatter.format("    {\n"));
        hash.append(StringFormatter.format("      cachedHashCode = cachedHashCode * 23;\n"));
        hash.append(StringFormatter.format("    }\n"));
      }
      hash.append("\n");
    }
    else if (as != null)
    {
      String attributeType = as.isOne() ? "getMethod" : "getManyMethod";
      String typeString = gen.translate(attributeType, as) + "()";
      hash.append(StringFormatter.format("    if ({0} != null)\n",typeString));
      hash.append(StringFormatter.format("    {\n"));
      hash.append(StringFormatter.format("      cachedHashCode = cachedHashCode * 23 + {0}.hashCode();\n",typeString));
      hash.append(StringFormatter.format("    }\n"));
      hash.append(StringFormatter.format("    else\n"));
      hash.append(StringFormatter.format("    {\n"));
      hash.append(StringFormatter.format("      cachedHashCode = cachedHashCode * 23;\n"));
      hash.append(StringFormatter.format("    }\n"));
    }
  }


    realSb.append(TEXT_2061);
    realSb.append(uClass.getName());
    realSb.append(TEXT_2062);
    realSb.append(uClass.getName());
    realSb.append(TEXT_2063);
    realSb.append(checks.toString().trim());
    realSb.append(TEXT_2064);
    realSb.append(hash.toString().trim());
    realSb.append(TEXT_2065);
    realSb.append(canSet.toString().trim());
    realSb.append(TEXT_2066);
    realSb.append(TEXT_2067);
     } 
    realSb.append(TEXT_2068);
    return realSb.toString();
    } 
    private String getStateMachine2Code(StringBuilder realSb, UmpleModel model,UmpleClass uClass, GeneratedClass gClass, JavaGenerator gen, boolean isFirst)
  {
    /*state_machine_doActivity_All*/
    
{ 
  boolean hasActivities = false;
  for(StateMachine sm : uClass.getStateMachines())
  {
    List<StateMachine> allNested = sm.getNestedStateMachines();
    
    for (StateMachine nestedSm : allNested)
    {
      for (State state : nestedSm.getStates())
      {
        for (Activity activity : state.getActivities())
        {
          hasActivities = true;
          
    /*state_machine_doActivity*/
    
  Event e = activity.getOnCompletionEvent();
  String postTransition = e != null ? gen.translate("eventMethod",e) : null; 

    realSb.append(TEXT_2069);
    realSb.append(gen.translate("doActivityMethod",activity));
    realSb.append(TEXT_2070);
    Position p = activity.getPosition();
      if (p != null) {
      realSb.append("\n      // line " + p.getLineNumber() + " \"" + uClass.getRelativePath(p.getFilename(),"Java") + "\"");
    } 
    realSb.append(TEXT_2071);
     
	if (p != null) { 
	   int javaline = realSb.toString().split("\\n").length;
	   addUncaughtExceptionVariables(gen.translate("doActivityMethod",activity),p.getFilename().replaceAll("\\\\","/").replaceAll("(.*)/",""),p.getLineNumber(),javaline-2,activity.getActivityCode().split("\\n").length); 
	  } 
    realSb.append(TEXT_2072);
    realSb.append(activity.getActivityCode());
    realSb.append(TEXT_2073);
     if (postTransition != null)
      { 
        for (Activity a : state.getActivities())
        {
          if(a != activity){
            append(realSb, "\n      {0}.join();",gen.translate("doActivityThread",a));
          }
        }
        append(realSb, "\n      {0}();",postTransition); 
      } 
    realSb.append(TEXT_2074);
    
        }
      }
    }
    
    for (State state : sm.getStates())
    {
      for (Activity activity : state.getActivities())
      {
        hasActivities = true;
        
    /*state_machine_doActivity*/
    
  Event e = activity.getOnCompletionEvent();
  String postTransition = e != null ? gen.translate("eventMethod",e) : null; 

    realSb.append(TEXT_2069);
    realSb.append(gen.translate("doActivityMethod",activity));
    realSb.append(TEXT_2070);
    Position p = activity.getPosition();
      if (p != null) {
      realSb.append("\n      // line " + p.getLineNumber() + " \"" + uClass.getRelativePath(p.getFilename(),"Java") + "\"");
    } 
    realSb.append(TEXT_2071);
     
	if (p != null) { 
	   int javaline = realSb.toString().split("\\n").length;
	   addUncaughtExceptionVariables(gen.translate("doActivityMethod",activity),p.getFilename().replaceAll("\\\\","/").replaceAll("(.*)/",""),p.getLineNumber(),javaline-2,activity.getActivityCode().split("\\n").length); 
	  } 
    realSb.append(TEXT_2072);
    realSb.append(activity.getActivityCode());
    realSb.append(TEXT_2073);
     if (postTransition != null)
      { 
        for (Activity a : state.getActivities())
        {
          if(a != activity){
            append(realSb, "\n      {0}.join();",gen.translate("doActivityThread",a));
          }
        }
        append(realSb, "\n      {0}();",postTransition); 
      } 
    realSb.append(TEXT_2074);
    
      }
    }
  } 
  if (hasActivities)
  {
    
    /*state_machine_doActivityThread*/
       
  StringBuilder output = new StringBuilder();

  isFirst = true;
  for(StateMachine sm : uClass.getStateMachines())
  {
    List<StateMachine> allNested = sm.getNestedStateMachines();
    
    for (StateMachine nestedSm : allNested)
    {
      for (State state : nestedSm.getStates())
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
          output.append(StringFormatter.format(" (\"{0}\".equals(doActivityMethodName))\n",gen.translate("doActivityMethod",activity)));
          output.append(StringFormatter.format("      {\n"));
          output.append(StringFormatter.format("        controller.{0}();\n",gen.translate("doActivityMethod",activity)));
          output.append(StringFormatter.format("      }"));
        }
      }
    }
    
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
        output.append(StringFormatter.format(" (\"{0}\".equals(doActivityMethodName))\n",gen.translate("doActivityMethod",activity)));
        output.append(StringFormatter.format("      {\n"));
        output.append(StringFormatter.format("        controller.{0}();\n",gen.translate("doActivityMethod",activity)));
        output.append(StringFormatter.format("      }"));
      }
    }
  }

    realSb.append(TEXT_2075);
    realSb.append(gen.translate("type",uClass));
    realSb.append(TEXT_2076);
    realSb.append(gen.translate("type",uClass));
    realSb.append(TEXT_2077);
    realSb.append(output);
    realSb.append(TEXT_2078);
    
  }
}

    /*state_machine_timedEvent_All*/
    
{ 
  boolean hasTimedEvents = false;
  boolean hasTimedEvents_NestedStates = false;
  for(StateMachine sm : uClass.getStateMachines())
  {
    if(sm.getNestedStateMachines().isEmpty())
    {
      for (Event e : sm.getEvents())
      {
        if (e.getIsTimer())
        {
          hasTimedEvents = true;
          
    /*state_machine_Event_StartStopTimer*/
    realSb.append(TEXT_2079);
    realSb.append(gen.translate("eventStartMethod",e,sm));
    realSb.append(TEXT_2080);
    realSb.append(gen.translate("eventHandler",e,sm));
    realSb.append(TEXT_2081);
    realSb.append(gen.translate("eventMethod",e,sm));
    realSb.append(TEXT_2082);
    realSb.append(e.getTimerInSeconds());
    realSb.append(TEXT_2083);
    realSb.append(gen.translate("eventStopMethod",e,sm));
    realSb.append(TEXT_2084);
    realSb.append(gen.translate("eventHandler",e,sm));
    realSb.append(TEXT_2085);
    
        }
      }
    }
    else if(!sm.getNestedStateMachines().isEmpty())
    {
      for (Event e : sm.getEvents())
      {
        if (e.getIsTimer())
        {
          hasTimedEvents = true;
          
    /*state_machine_Event_StartStopTimer*/
    realSb.append(TEXT_2079);
    realSb.append(gen.translate("eventStartMethod",e,sm));
    realSb.append(TEXT_2080);
    realSb.append(gen.translate("eventHandler",e,sm));
    realSb.append(TEXT_2081);
    realSb.append(gen.translate("eventMethod",e,sm));
    realSb.append(TEXT_2082);
    realSb.append(e.getTimerInSeconds());
    realSb.append(TEXT_2083);
    realSb.append(gen.translate("eventStopMethod",e,sm));
    realSb.append(TEXT_2084);
    realSb.append(gen.translate("eventHandler",e,sm));
    realSb.append(TEXT_2085);
    
        }
      }
      for(StateMachine nsm : sm.getNestedStateMachines())
      {
        for(Event event : nsm.getEvents())
        {
          if(event.getIsTimer())
          {
            hasTimedEvents_NestedStates = true;
            
    /*state_machine_Event_StartStopTimer_NestedStates*/
    realSb.append(TEXT_2086);
    realSb.append(gen.translate("eventStartMethod",event,nsm));
    realSb.append(TEXT_2087);
    realSb.append(gen.translate("eventHandler", event, nsm));
    realSb.append(TEXT_2088);
    realSb.append(gen.translate("eventMethod", event, nsm));
    realSb.append(TEXT_2089);
    realSb.append(event.getTimerInSeconds());
    realSb.append(TEXT_2090);
    realSb.append(gen.translate("eventStopMethod",event,nsm));
    realSb.append(TEXT_2091);
    realSb.append(gen.translate("eventHandler", event, nsm));
    realSb.append(TEXT_2092);
    
          }
        }
      }
    }
  }
  if (hasTimedEvents || hasTimedEvents_NestedStates)
  {
    
    /*state_machine_timedEvent_Handler*/
    
 


    realSb.append(TEXT_2093);
    realSb.append(gen.translate("type",uClass));
    realSb.append(TEXT_2094);
    realSb.append(gen.translate("type",uClass));
    realSb.append(TEXT_2095);
    
  for(StateMachine sm : uClass.getStateMachines())
  {
    if(sm.getNestedStateMachines().isEmpty())
    {
      for (Event e : sm.getEvents())
      {
        if (e.getIsTimer())
        {
          
    /*state_machine_timedEvent_run*/
    realSb.append(TEXT_2096);
    realSb.append(gen.translate("eventMethod",e,sm));
    realSb.append(TEXT_2097);
    realSb.append(gen.translate("eventMethod",e));
    realSb.append(TEXT_2098);
    realSb.append(gen.translate("eventStartMethod",e,sm));
    realSb.append(TEXT_2099);
    
        }
      }
    }
    else if(!sm.getNestedStateMachines().isEmpty())
    {
      for (Event e : sm.getEvents())
      {
        if (e.getIsTimer())
        {
          
    /*state_machine_timedEvent_run*/
    realSb.append(TEXT_2096);
    realSb.append(gen.translate("eventMethod",e,sm));
    realSb.append(TEXT_2097);
    realSb.append(gen.translate("eventMethod",e));
    realSb.append(TEXT_2098);
    realSb.append(gen.translate("eventStartMethod",e,sm));
    realSb.append(TEXT_2099);
    
        }
      }
      for(StateMachine nsm : sm.getNestedStateMachines())
      {
        for(Event event : nsm.getEvents())
        {
          if(event.getIsTimer())
          {
            
    /*state_machine_timedEvent_run_NestedStates*/
    realSb.append(TEXT_2100);
    realSb.append(gen.translate("eventMethod",event,nsm));
    realSb.append(TEXT_2101);
    realSb.append(gen.translate("eventMethod",event));
    realSb.append(TEXT_2102);
    realSb.append(gen.translate("eventStartMethod",event,nsm));
    realSb.append(TEXT_2103);
    
          }
        }
      }
    }
  }

    realSb.append(TEXT_2104);
    
  }
}

    realSb.append(TEXT_2105);
    return realSb.toString();
    } 
    private String getDeleteCode(StringBuilder realSb, UmpleModel model,UmpleClass uClass, GeneratedClass gClass, JavaGenerator gen, boolean isFirst, boolean isFake)
  {
    String self="this";
    if(uClass.getIsDistributed()&&model.getDistributePattern()==1)
      self="self";
      
    Integer baseJavaLine = realSb.toString().split("\\n").length+1; 
    /*delete_All*/
    
  String customDeletePrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before","delete"));
  String customDeletePostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after","delete"));
  
  // NOTE: THE BELOW CODE SHOULD BE REMOVED AFTER REFACTORING.
  // Code introduced in PR#: 1527. Should be removed when Issue#1529 is resolved. 
  if(Arrays.toString(uClass.getDisableAutogeneratedMethodList()).contains("delete"))
  {
    append(realSb, "  // the method 'delete()' has been disabled.  \n");
    return realSb.toString(); 
  }
  // END OF NOTE. 
  appendln(realSb,"\n  public void delete()");
  append(realSb,"  {");

  boolean hasSomethingToDelete = false;  

  if (customDeletePrefixCode != null) 
  {
    addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customDeletePrefixCode,"delete");
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customDeletePrefixCode, "    "));
    hasSomethingToDelete = true;
  }

  for (AssociationVariable av : uClass.getAssociationVariables()) 
  {
    
    /*specializationCode_Delete*/
    
    AssociationVariable relatedAssociation = av.getRelatedAssociation();
    //Association relatedAssoc = uClass.getAssociation(uClass.indexOfAssociationVariable(av));

    boolean reqSuperCode = av.getNeedsSuperCode();
    boolean reqCommonCode = av.getNeedsCommonCode();
    boolean mulChangedToOne = av.getMulChangedToOne();
    boolean relMulChangedToOne = relatedAssociation.getMulChangedToOne();
    

    
    
    if (!av.getIsNavigable() || av.isImmutable())
    {
      continue;
    }
    
    if ( reqCommonCode )      /* Same Class Specialization Case */
    {
      
    /*specializationSkip*/
    
   /* Method Gen skipped due to special specialization syntax */

    
    }
    else if (reqSuperCode)    /* Subclass Case */
    {
      if (!relatedAssociation.getIsNavigable())
      {
        if (av.isOne())
        {
          hasSomethingToDelete = true;
          
    /*delete_UndirectionalOne_specialization*/
    realSb.append(TEXT_2106);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2107);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2108);
    realSb.append(gen.translate("getMethod",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_2109);
    realSb.append(gen.translate("type",av));
     } 
    realSb.append(TEXT_2110);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2111);
    
        }
        else if (av.isMany())
        {
          hasSomethingToDelete = true;
          
    /*delete_UndirectionalMany_specialization*/
    realSb.append(TEXT_2112);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2113);
    
        }
        continue;
      }
      
     
      if (relatedAssociation.getIsComposition()) {
      	if ((relatedAssociation.isOnlyOne() || relatedAssociation.isOptionalOne()) && av.isOnlyOne()) {
      		
    /*delete_OneFromOne_specialization*/
    realSb.append(TEXT_2114);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2115);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2116);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_2117);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2118);
    realSb.append(gen.translate("associationOne", av));
    realSb.append(TEXT_2119);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2120);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2121);
    
      	}
      	else if ((relatedAssociation.isOnlyOne() || relatedAssociation.isOptionalOne()) && av.isOptionalOne()) {
      		
    /*delete_OptionalOneFromOne_comp_specialization*/
    realSb.append(TEXT_2122);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2123);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2124);
    realSb.append(gen.translate("getMethod",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_2125);
    realSb.append(gen.translate("type",av));
     } 
    realSb.append(TEXT_2126);
    realSb.append(gen.translate("associationOne", av));
    realSb.append(TEXT_2127);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2128);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2129);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2130);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_2131);
    
      	}
      	else if ((relatedAssociation.isOnlyOne() || relatedAssociation.isOptionalOne()) && av.isMany()) {
      		
    /*delete_ManyFromX_comp_specialization*/
    realSb.append(TEXT_2132);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_2133);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2134);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2135);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2136);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_2137);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2138);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_2139);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2140);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2141);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_2142);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2143);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2144);
    
      	}
      	
      	else if (relatedAssociation.isMany() && av.isOnlyOne()) {
      		
    /*delete_OneFromOne_specialization*/
    realSb.append(TEXT_2114);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2115);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2116);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_2117);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2118);
    realSb.append(gen.translate("associationOne", av));
    realSb.append(TEXT_2119);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2120);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2121);
    
      	}
      	else if (relatedAssociation.isMany() && av.isOptionalOne()) {
      	    
    /*delete_OptionalOneFromOne_specialization*/
    realSb.append(TEXT_2145);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2146);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2147);
    realSb.append(gen.translate("getMethod",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_2148);
    realSb.append(gen.translate("type",av));
     } 
    realSb.append(TEXT_2149);
    realSb.append(gen.translate("associationOne", av));
    realSb.append(TEXT_2150);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2151);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2152);
    
      	}
      	else if (relatedAssociation.isMany() && av.isMany()) {
      	    
    /*delete_ManyFromX_comp_specialization*/
    realSb.append(TEXT_2132);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_2133);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2134);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2135);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2136);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_2137);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2138);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_2139);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2140);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2141);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_2142);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2143);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2144);
    
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
    
      	
    /*delete_ManyFromX_comp_specialization*/
    realSb.append(TEXT_2132);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_2133);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2134);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2135);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2136);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_2137);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2138);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_2139);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2140);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2141);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_2142);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2143);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2144);
    
  	  
      }
      
      else if (av.getIsComposition() && (av.isMany() && relatedAssociation.isOptionalOne() && !av.isMandatory())) { 
      	
      	
    /*delete_OptionalOneFromMany_comp_specialization*/
    realSb.append(TEXT_2153);
    realSb.append(gen.translate("getMethod",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_2154);
    realSb.append(gen.translate("type",av));
     } 
    realSb.append(TEXT_2155);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2156);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2157);
    realSb.append(gen.translate("getMethod",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_2158);
    realSb.append(gen.translate("type",av));
     } else { 
    realSb.append(TEXT_2159);
    realSb.append(gen.translate("type",av));
     } 
    realSb.append(TEXT_2160);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2161);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_2162);
    realSb.append(gen.translate("getMethod",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_2163);
    realSb.append(gen.translate("type",av));
     } 
    realSb.append(TEXT_2164);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2165);
    
  	  
      }
      
      else if (av.getIsComposition() && (av.isOptionalOne() && relatedAssociation.getMultiplicity().getLowerBound() > 1  && !relatedAssociation.isMandatory())) { 
      	
      	
    /*delete_OptionalOneFromMN_comp_specialization*/
    realSb.append(TEXT_2166);
    realSb.append(gen.translate("getMethod",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_2167);
    realSb.append(gen.translate("type",av));
     } 
    realSb.append(TEXT_2168);
    realSb.append(gen.translate("getMethod",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_2169);
    realSb.append(gen.translate("type",av));
     } 
    realSb.append(TEXT_2170);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_2171);
    realSb.append(relatedAssociation.getMultiplicity().getLowerBound());
    realSb.append(TEXT_2172);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2173);
    realSb.append(gen.translate("removeParameterOne",av));
    realSb.append(TEXT_2174);
    realSb.append(gen.translate("getMethod",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_2175);
    realSb.append(gen.translate("type",av));
     } 
    realSb.append(TEXT_2176);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2177);
    realSb.append(gen.translate("removeParameterOne",av));
    realSb.append(TEXT_2178);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2179);
    realSb.append(gen.translate("removeParameterOne",av));
    realSb.append(TEXT_2180);
    realSb.append(gen.translate("getMethod",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_2181);
    realSb.append(gen.translate("type",av));
     } 
    realSb.append(TEXT_2182);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2183);
    realSb.append(gen.translate("removeParameterOne",av));
    realSb.append(TEXT_2184);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_2185);
    
  	  
      }
      
      else if (av.getIsComposition() && (av.isOptionalOne() && relatedAssociation.getMultiplicity().getLowerBound() > 1  && relatedAssociation.isMandatory())) { 
      	
      	
    /*delete_OptionalOneFromN_comp_specialization*/
    realSb.append(TEXT_2186);
    realSb.append(gen.translate("getMethod",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_2187);
    realSb.append(gen.translate("type",av));
     } 
    realSb.append(TEXT_2188);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2189);
    realSb.append(gen.translate("removeParameterOne",av));
    realSb.append(TEXT_2190);
    realSb.append(gen.translate("getMethod",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_2191);
    realSb.append(gen.translate("type",av));
     } 
    realSb.append(TEXT_2192);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2193);
    realSb.append(gen.translate("removeParameterOne",av));
    realSb.append(TEXT_2194);
    
  	  
      }
      
      
      else {
      
  	    if (av.isOnlyOne() && relatedAssociation.isOnlyOne())
  	    {
  	      
    /*delete_OneFromOne_specialization*/
    realSb.append(TEXT_2114);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2115);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2116);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_2117);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2118);
    realSb.append(gen.translate("associationOne", av));
    realSb.append(TEXT_2119);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2120);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2121);
    
  	    }
  	    else if (av.isOptionalOne() && relatedAssociation.isOptionalOne())
  	    {
  	      
    /*delete_OptionalOneFromOptionalOne_specialization*/
    realSb.append(TEXT_2195);
    realSb.append(gen.translate("getMethod",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_2196);
    realSb.append(gen.translate("type",av));
     } 
    realSb.append(TEXT_2197);
    realSb.append(gen.translate("getMethod",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_2198);
    realSb.append(gen.translate("type",av));
     } 
    realSb.append(TEXT_2199);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_2200);
    
  	    }
  	    else if (av.isOnlyOne() && relatedAssociation.isOptionalOne())
  	    {
  	      
    /*delete_OneFromOptionalOne_specialization*/
    realSb.append(TEXT_2201);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2202);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2203);
    realSb.append(gen.translate("getMethod",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_2204);
    realSb.append(gen.translate("type",av));
     } 
    realSb.append(TEXT_2205);
    realSb.append(gen.translate("associationOne", av));
    realSb.append(TEXT_2206);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2207);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2208);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_2209);
    
  	    }
  	    else if (av.isOptionalOne() && relatedAssociation.isOnlyOne())
  	    {
  	      
    /*delete_OptionalOneFromOne_specialization*/
    realSb.append(TEXT_2145);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2146);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2147);
    realSb.append(gen.translate("getMethod",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_2148);
    realSb.append(gen.translate("type",av));
     } 
    realSb.append(TEXT_2149);
    realSb.append(gen.translate("associationOne", av));
    realSb.append(TEXT_2150);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2151);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2152);
    
  	    }
  	    else if (av.isOptionalOne() && relatedAssociation.isOptionalMany())
  	    {
  	      
    /*delete_OptionalOneFromMany_specialization*/
    realSb.append(TEXT_2210);
    realSb.append(gen.translate("getMethod",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_2211);
    realSb.append(gen.translate("type",av));
     } 
    realSb.append(TEXT_2212);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2213);
    realSb.append(gen.translate("removeParameterOne",av));
    realSb.append(TEXT_2214);
    realSb.append(gen.translate("getMethod",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_2215);
    realSb.append(gen.translate("type",av));
     } 
    realSb.append(TEXT_2216);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2217);
    realSb.append(gen.translate("removeParameterOne",av));
    realSb.append(TEXT_2218);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_2219);
    
  	    }
  	    else if (av.isOptionalOne() && relatedAssociation.isN())
  	    {
  	      
    /*delete_OptionalOneFromN_specialization*/
    realSb.append(TEXT_2220);
    realSb.append(gen.translate("getMethod",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_2221);
    realSb.append(gen.translate("type",av));
     } 
    realSb.append(TEXT_2222);
    realSb.append(gen.translate("getMethod",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_2223);
    realSb.append(gen.translate("type",av));
     } 
    realSb.append(TEXT_2224);
    
  	    }
  	    else if (av.isOptionalOne() && relatedAssociation.isMN())
  	    {
  	      
    /*delete_OptionalOneFromMN_specialization*/
    realSb.append(TEXT_2225);
    realSb.append(gen.translate("getMethod",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_2226);
    realSb.append(gen.translate("type",av));
     } 
    realSb.append(TEXT_2227);
    realSb.append(gen.translate("getMethod",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_2228);
    realSb.append(gen.translate("type",av));
     } 
    realSb.append(TEXT_2229);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_2230);
    realSb.append(relatedAssociation.getMultiplicity().getLowerBound());
    realSb.append(TEXT_2231);
    realSb.append(gen.translate("getMethod",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_2232);
    realSb.append(gen.translate("type",av));
     } 
    realSb.append(TEXT_2233);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2234);
    realSb.append(gen.translate("removeParameterOne",av));
    realSb.append(TEXT_2235);
    realSb.append(gen.translate("getMethod",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_2236);
    realSb.append(gen.translate("type",av));
     } 
    realSb.append(TEXT_2237);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2238);
    realSb.append(gen.translate("removeParameterOne",av));
    realSb.append(TEXT_2239);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_2240);
    
  	    }
  	    else if (av.isOne() && relatedAssociation.isMany())
  	    {
  	      
    /*delete_OneFromMany_specialization*/
    realSb.append(TEXT_2241);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2242);
    realSb.append(gen.translate("removeParameterOne",av));
    realSb.append(TEXT_2243);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_2244);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2245);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2246);
    realSb.append(gen.translate("removeParameterOne",av));
    realSb.append(TEXT_2247);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_2248);
    
  	    }
  	    else if (av.isMandatory() && relatedAssociation.isOptionalOne())
  	    {
          
    /*delete_MandatoryFromOptionalOne_specialization*/
    realSb.append(TEXT_2249);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2250);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2251);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_2252);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2253);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_2254);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2255);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2256);
    
  	    }
  	    else if (av.isMany() && (relatedAssociation.isMN() || relatedAssociation.isN()))
  	    {
          if (relatedAssociation.getNeedsCommonCode())
          {
            
    /*delete_ManyFromMN_specialization_relCommon*/
    realSb.append(TEXT_2257);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2258);
    realSb.append(gen.translate("parameterCopyOfMany",av));
    realSb.append(TEXT_2259);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2260);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_2261);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2262);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2263);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2264);
    realSb.append(gen.translate("parameterCopyOfMany",av));
    realSb.append(TEXT_2265);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2266);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_2267);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2268);
    realSb.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    realSb.append(TEXT_2269);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_2270);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2271);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2272);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_2273);
    
          }
          else
          {
            
    /*delete_ManyFromMN_specialization*/
    realSb.append(TEXT_2274);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2275);
    realSb.append(gen.translate("parameterCopyOfMany",av));
    realSb.append(TEXT_2276);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2277);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_2278);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2279);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2280);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2281);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2282);
    realSb.append(gen.translate("parameterCopyOfMany",av));
    realSb.append(TEXT_2283);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2284);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_2285);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2286);
    realSb.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    realSb.append(TEXT_2287);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_2288);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2289);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2290);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_2291);
    
  	      }
        }
  	    else if (av.isMany() && relatedAssociation.isMany())
  	    {
          
    /*delete_ManyFromMany_specialization*/
    realSb.append(TEXT_2292);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2293);
    realSb.append(gen.translate("parameterCopyOfMany",av));
    realSb.append(TEXT_2294);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2295);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_2296);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2297);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2298);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2299);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2300);
    realSb.append(gen.translate("parameterCopyOfMany",av));
    realSb.append(TEXT_2301);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2302);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_2303);
    
  	    }
  	    else if (av.isMany() && relatedAssociation.isOnlyOne()) 
  	    {
  	      
    /*delete_ManyFromOne_specialization*/
    
  	    }
  	    else if (av.isMany() && relatedAssociation.isOptionalOne())
  	    {
  	      
    /*delete_ManyFromOptionalOne_specialization*/
    realSb.append(TEXT_2304);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2305);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_2306);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2307);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_2308);
    
  	    }
  	    else
  	    {
  	      continue;
  	    }
  	  }
	  }
    else  /* Normal Case */
    {
      if (!relatedAssociation.getIsNavigable())
      {
        if (av.isOne())
        {
          hasSomethingToDelete = true;
          
    /*delete_UndirectionalOne*/
    realSb.append(TEXT_2309);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2310);
    
        }
        else if (av.isMany())
        {
          hasSomethingToDelete = true;
          
    /*delete_UndirectionalMany*/
    realSb.append(TEXT_2311);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2312);
    
        }
        continue;
      }
      
     
      if (relatedAssociation.getIsComposition()) {
      	if ((relatedAssociation.isOnlyOne() || relatedAssociation.isOptionalOne()) && av.isOnlyOne()) {
      		
    /*delete_OneFromOne*/
    realSb.append(TEXT_2313);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2314);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2315);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2316);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2317);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2318);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2319);
    
      	}
      	else if ((relatedAssociation.isOnlyOne() || relatedAssociation.isOptionalOne()) && av.isOptionalOne()) {
      		
    /*delete_OptionalOneFromOne_comp*/
    realSb.append(TEXT_2320);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2321);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2322);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2323);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2324);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2325);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2326);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2327);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_2328);
    
      	}
      	else if ((relatedAssociation.isOnlyOne() || relatedAssociation.isOptionalOne()) && av.isMany()) {
      		
    /*delete_ManyFromX_comp*/
    realSb.append(TEXT_2329);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2330);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2331);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2332);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2333);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2334);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2335);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2336);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2337);
    
      	}
      	
      	else if (relatedAssociation.isMany() && av.isOnlyOne()) {
      		
    /*delete_OneFromOne*/
    realSb.append(TEXT_2313);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2314);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2315);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2316);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2317);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2318);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2319);
    
      	}
      	else if (relatedAssociation.isMany() && av.isOptionalOne()) {
      	    
    /*delete_OptionalOneFromOne*/
    realSb.append(TEXT_2338);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2339);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2340);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2341);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2342);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2343);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2344);
    
      	}
      	else if (relatedAssociation.isMany() && av.isMany()) {
      	    
    /*delete_ManyFromX_comp*/
    realSb.append(TEXT_2329);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2330);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2331);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2332);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2333);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2334);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2335);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2336);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2337);
    
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
    realSb.append(TEXT_2329);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2330);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2331);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2332);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2333);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2334);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2335);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2336);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2337);
    
      
      }
      
      else if (av.getIsComposition() && (av.isMany() && relatedAssociation.isOptionalOne() && !av.isMandatory())) { 
        
        
    /*delete_OptionalOneFromMany_comp*/
    realSb.append(TEXT_2345);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2346);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2347);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2348);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2349);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2350);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_2351);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2352);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2353);
    
      
      }
      
      else if (av.getIsComposition() && (av.isOptionalOne() && relatedAssociation.getMultiplicity().getLowerBound() > 1  && !relatedAssociation.isMandatory())) { 
        
        
    /*delete_OptionalOneFromMN_comp*/
    realSb.append(TEXT_2354);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2355);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2356);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_2357);
    realSb.append(relatedAssociation.getMultiplicity().getLowerBound());
    realSb.append(TEXT_2358);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2359);
    realSb.append(gen.translate("removeParameterOne",av));
    realSb.append(TEXT_2360);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2361);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2362);
    realSb.append(gen.translate("removeParameterOne",av));
    realSb.append(TEXT_2363);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2364);
    realSb.append(gen.translate("removeParameterOne",av));
    realSb.append(TEXT_2365);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2366);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2367);
    realSb.append(gen.translate("removeParameterOne",av));
    realSb.append(TEXT_2368);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_2369);
    realSb.append(self);
    realSb.append(TEXT_2370);
    
      
      }
      
      else if (av.getIsComposition() && (av.isOptionalOne() && relatedAssociation.getMultiplicity().getLowerBound() > 1  && relatedAssociation.isMandatory())) { 
        
        
    /*delete_OptionalOneFromN_comp*/
    realSb.append(TEXT_2371);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2372);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2373);
    realSb.append(gen.translate("removeParameterOne",av));
    realSb.append(TEXT_2374);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2375);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2376);
    realSb.append(gen.translate("removeParameterOne",av));
    realSb.append(TEXT_2377);
    
      
      }
      else 
      {
        if (av.isOnlyOne() && relatedAssociation.isOnlyOne())
        {
          
    /*delete_OneFromOne*/
    realSb.append(TEXT_2313);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2314);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2315);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2316);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2317);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2318);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2319);
    
        }
        else if (av.isOptionalOne() && relatedAssociation.isOptionalOne())
        {
          
    /*delete_OptionalOneFromOptionalOne*/
    realSb.append(TEXT_2378);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2379);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2380);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_2381);
    
        }
        else if (av.isOnlyOne() && relatedAssociation.isOptionalOne())
        {
          
    /*delete_OneFromOptionalOne*/
    realSb.append(TEXT_2382);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2383);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2384);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2385);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2386);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2387);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2388);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_2389);
    
        }
        else if (av.isOptionalOne() && relatedAssociation.isOnlyOne())
        {
          
    /*delete_OptionalOneFromOne*/
    realSb.append(TEXT_2338);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2339);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2340);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2341);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2342);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2343);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2344);
    
        }
        else if (av.isOptionalOne() && relatedAssociation.isOptionalMany())
        {
          
    /*delete_OptionalOneFromMany*/
    realSb.append(TEXT_2390);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2391);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2392);
    realSb.append(gen.translate("removeParameterOne",av));
    realSb.append(TEXT_2393);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2394);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2395);
    realSb.append(gen.translate("removeParameterOne",av));
    realSb.append(TEXT_2396);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_2397);
    realSb.append(self);
    realSb.append(TEXT_2398);
    
        }
        else if (av.isOptionalOne() && relatedAssociation.isN())
        {
          
    /*delete_OptionalOneFromN*/
    realSb.append(TEXT_2399);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2400);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2401);
    
        }
        else if (av.isOptionalOne() && relatedAssociation.isMN())
        {
          
    /*delete_OptionalOneFromMN*/
    realSb.append(TEXT_2402);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2403);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2404);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_2405);
    realSb.append(relatedAssociation.getMultiplicity().getLowerBound());
    realSb.append(TEXT_2406);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2407);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2408);
    realSb.append(gen.translate("removeParameterOne",av));
    realSb.append(TEXT_2409);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2410);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2411);
    realSb.append(gen.translate("removeParameterOne",av));
    realSb.append(TEXT_2412);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_2413);
    realSb.append(self);
    realSb.append(TEXT_2414);
    
        }
        else if (av.isOne() && relatedAssociation.isMany())
        {
          
    /*delete_OneFromMany*/
    realSb.append(TEXT_2415);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2416);
    realSb.append(gen.translate("removeParameterOne",av));
    realSb.append(TEXT_2417);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2418);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2419);
    realSb.append(gen.translate("removeParameterOne",av));
    realSb.append(TEXT_2420);
    realSb.append(gen.translate("removeParameterOne",av));
    realSb.append(TEXT_2421);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_2422);
    realSb.append(self);
    realSb.append(TEXT_2423);
    
        }
        else if (av.isMandatory() && relatedAssociation.isOptionalOne())
        {
          
    /*delete_MandatoryFromOptionalOne*/
    realSb.append(TEXT_2424);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2425);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2426);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2427);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_2428);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2429);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2430);
    
        }
        else if (av.isMany() && (relatedAssociation.isMN() || relatedAssociation.isN()))
        {
          
    /*delete_ManyFromMN*/
    realSb.append(TEXT_2431);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2432);
    realSb.append(gen.translate("parameterCopyOfMany",av));
    realSb.append(TEXT_2433);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2434);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2435);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2436);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2437);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2438);
    realSb.append(gen.translate("parameterCopyOfMany",av));
    realSb.append(TEXT_2439);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2440);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_2441);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2442);
    realSb.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    realSb.append(TEXT_2443);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2444);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2445);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_2446);
    realSb.append(self);
    realSb.append(TEXT_2447);
    
        }
        else if (av.isMany() && relatedAssociation.isMany())
        {
          
    /*delete_ManyFromMany*/
    realSb.append(TEXT_2448);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2449);
    realSb.append(gen.translate("parameterCopyOfMany",av));
    realSb.append(TEXT_2450);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2451);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2452);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2453);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2454);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2455);
    realSb.append(gen.translate("parameterCopyOfMany",av));
    realSb.append(TEXT_2456);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2457);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_2458);
    realSb.append(self);
    realSb.append(TEXT_2459);
    
        }
        else if (av.isMany() && relatedAssociation.isOnlyOne()) 
        {
          
    /*delete_ManyFromOne*/
    realSb.append(TEXT_2460);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2461);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2462);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2463);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2464);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2465);
    
        }
        else if (av.isMany() && relatedAssociation.isOptionalOne())
        {
          
    /*delete_ManyFromOptionalOne*/
    realSb.append(TEXT_2466);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2467);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2468);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_2469);
    
        }
        else
        {
          continue;
        }
      }
    }
  	hasSomethingToDelete = true;
  }
  
  for (StateMachine sm : uClass.getStateMachines())
  {
    if (sm.isQueued() || sm.isPooled())
    {
      append(realSb, "\n    removal.interrupt();");
      hasSomethingToDelete = true;
      break;
    }
  }
  
  for (Method m : uClass.getMethods())
  {
    if(m.getIsQueued())
    {
      append(realSb, "\n    queuedMethodThread.delete();");
      hasSomethingToDelete = true;
      break;
    }
  }
  
  if (!uClass.isRoot() && !"external".equals(uClass.getExtendsClass().getModifier()))
  {
    hasSomethingToDelete = true;
    appendln(realSb,"");
    append(realSb, "    super.delete();");
  }

  if (customDeletePostfixCode != null) 
  {
    addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customDeletePostfixCode,"delete");
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


    realSb.append(TEXT_2470);
     for (StateMachine smq : uClass.getStateMachines())
     {
       if (smq.isPooled())
       {
    /*queued_state_machine_inner_class*/
    
  appendln(realSb,"\n  protected class Message");
  appendln(realSb,"  {");
  appendln(realSb,"    MessageType type;"); 
  appendln(realSb,"    ");  
  appendln(realSb,"    //Message parameters");
  appendln(realSb,"    Vector<Object> param;"); 
  appendln(realSb,"    ");   
  appendln(realSb,"    public Message(MessageType t, Vector<Object> p)");
  appendln(realSb,"    {");
  appendln(realSb,"      type = t; "); 
  appendln(realSb,"      param = p;");
  appendln(realSb,"    }");
  appendln(realSb,"");
  appendln(realSb,"    @Override");
  appendln(realSb,"    public String toString()");
  appendln(realSb,"    {");
  appendln(realSb,"      return type + \",\" + param;");
  appendln(realSb,"    }");
  appendln(realSb,"  }");
  appendln(realSb,"  ");  
 
  if (smq.isQueued())
  {
    appendln(realSb,"  protected class MessageQueue {");
    appendln(realSb,"    Queue<Message> messages = new LinkedList<Message>();");
    appendln(realSb,"    ");   
    appendln(realSb,"    public synchronized void put(Message m)");
    appendln(realSb,"    {");
    appendln(realSb,"      messages.add(m); "); 
    appendln(realSb,"      notify();");
    appendln(realSb,"    }");
    appendln(realSb,"");  
    appendln(realSb,"    public synchronized Message getNext()");
    appendln(realSb,"    {");
    appendln(realSb,"      try {");
    appendln(realSb,"        while (messages.isEmpty()) "); 
    appendln(realSb,"        {");
    appendln(realSb,"          wait();");
    appendln(realSb,"        }");
    appendln(realSb,"      } catch (InterruptedException e) {");
    appendln(realSb,"        Thread.currentThread().interrupt();");
    appendln(realSb,"        return null;");
    appendln(realSb,"      }");
    appendln(realSb,"");
    appendln(realSb,"      //The element to be removed");
    appendln(realSb,"      Message m = messages.remove(); "); 
    appendln(realSb,"      return (m);");
    appendln(realSb,"    }");
    append(realSb,"  }");  
  }
  else if(smq.isPooled())
  {
    appendln(realSb,"  protected class MessagePool {");
    appendln(realSb,"    Queue<Message> messages = new LinkedList<Message>();");
    appendln(realSb,"    ");   
    appendln(realSb,"    public synchronized void put(Message m)");
    appendln(realSb,"    {");
    appendln(realSb,"      messages.add(m); "); 
    appendln(realSb,"      notify();");
    appendln(realSb,"    }");
    appendln(realSb,"");  
    appendln(realSb,"    public synchronized Message getNext()");
    appendln(realSb,"    {");
    appendln(realSb,"      Message message=null;");
    appendln(realSb,"");
    appendln(realSb,"      try {");
    appendln(realSb,"        message=getNextProcessableMessage();");
    appendln(realSb,"        while (message==null)");
    appendln(realSb,"        {");
    appendln(realSb,"          wait();");
    appendln(realSb,"          message=getNextProcessableMessage();");
    appendln(realSb,"        }");
    appendln(realSb,"      } catch (InterruptedException e) {");
    appendln(realSb,"        Thread.currentThread().interrupt();");
    appendln(realSb,"        return null;");
    appendln(realSb,"      }");
    appendln(realSb,"");
    appendln(realSb,"      // return the message");
    appendln(realSb,"      return (message);");
    appendln(realSb,"    }");
    appendln(realSb,"");
    appendln(realSb,"    public Message getNextProcessableMessage()");
    appendln(realSb,"    {");
    appendln(realSb,"      // Iterate through messages and remove the first message that matches one of the Messages list");
    appendln(realSb,"      // otherwise return null");
    appendln(realSb,"      for (Message msg: messages)");
    appendln(realSb,"      {");
    
    for(StateMachine sm: uClass.getStateMachines())
    {
      if(sm.isPooled())
      {
        if(sm.getNestedStateMachines().isEmpty())
        {
          append(realSb,"        if(stateMessageMap.get(get");
          append(realSb,"{0}", gen.translate("type",sm));
          appendln(realSb,"()).contains(msg.type))");
          appendln(realSb,"        {");
          appendln(realSb,"          //The element to be removed");
          appendln(realSb,"          messages.remove(msg);");
          appendln(realSb,"          return (msg);");
          appendln(realSb,"        }");
        }
        else if(!sm.getNestedStateMachines().isEmpty())
        {
          append(realSb,"        if(stateMessageMap.get(get");
          append(realSb,"{0}", gen.translate("type",sm));
          appendln(realSb,"()).contains(msg.type))");
          appendln(realSb,"        {");
          appendln(realSb,"          //The element to be removed");
          appendln(realSb,"          messages.remove(msg);");
          appendln(realSb,"          return (msg);");
          appendln(realSb,"        }");
          append(realSb,"        else");
          int nsmSize = sm.getNestedStateMachines().size();
          int nesCount = 0;
          for(StateMachine nsm : sm.getNestedStateMachines())
          {
            nesCount++;
            append(realSb," if(stateMessageMap.get(get");
            append(realSb,"{0}", gen.translate("type",nsm));
            appendln(realSb,"()).contains(msg.type))");
            appendln(realSb,"        {");
            appendln(realSb,"          //The element to be removed");
            appendln(realSb,"          messages.remove(msg);");
            appendln(realSb,"          return (msg);");
            appendln(realSb,"        }");
            if(nsmSize > nesCount)
            {
              append(realSb,"        else");
            }
          }
        }
      }
    }
    appendln(realSb,"      }");
    appendln(realSb,"      return null;");
    appendln(realSb,"    }");
    append(realSb,"  }"); 
  }

    /*queued_state_machine_queuedEvent*/
    
  append(realSb,"\n");
  append(realSb,"\n  //------------------------------");
  append(realSb,"\n  //messages accepted ");
  append(realSb,"\n  //------------------------------");
  append(realSb,"\n");
  
  
  String evName="";
  boolean sameEvName=false;
  List<String> evList=new ArrayList<String>();
          
  for (StateMachine sm : uClass.getStateMachines())
  {
    if(sm.isQueued() || sm.isPooled()) 
    { 
      for(Event event : sm.getEvents())
      { 
        for(int i=0; i<evList.size(); i++)
        {
          if(evList.get(i).equals(event.getName()))
          {
            sameEvName=true;
          }
        }
             
        if(sameEvName == false)
        {
          if(event.isAutoTransition() == false)
          {
            if(event.getIsTimer())
            {
               evList.add(event.getName());
               append(realSb,"\n");
               append(realSb,"  public boolean ");
               append(realSb,"{0} ()",gen.translate("eventMethod",event));
               append(realSb,"\n  {");
               append(realSb,"\n    boolean wasAdded = false;");
          
               if(sm.isQueued())
               {
                 append(realSb,"\n    queue.put(new Message(MessageType.{0}",gen.translate("eventMethod",event));
               }
               if(sm.isPooled())
               {
                 append(realSb,"\n    pool.put(new Message(MessageType.{0}",gen.translate("eventMethod",event));
               }
               append(realSb,"_M, null));");
       
               append(realSb,"\n    wasAdded = true;");
               append(realSb,"\n    return wasAdded;");
               append(realSb,"\n  }");
               append(realSb,"\n");
               evName = event.getName();
            }
            if(!event.isUnspecified())
            {
              if( !evName.equals(event.getName()))
              {
                evList.add(event.getName());
                append(realSb,"\n");
                append(realSb,"  public void ");
                append(realSb,"{0} ({1})",gen.translate("eventMethod",event), event.getArgs());
                append(realSb,"\n  {");
          
                if (!event.getArgs().equals(""))
                {
                  append(realSb,"\n    Vector<Object> v = new Vector<Object>({0});", event.getParams().size());
                  for ( int i=0; i < event.getParams().size(); i++)
                  {
                    append(realSb,"\n    v.add({0}, {1});",i, event.getParam(i).getName());
                  }
                  if(sm.isQueued())
                  {
                    append(realSb,"\n    queue.put(new Message(MessageType.{0}",gen.translate("eventMethod",event));
                  }
                  if(sm.isPooled())
                  {
                    append(realSb,"\n    pool.put(new Message(MessageType.{0}",gen.translate("eventMethod",event));
                  }
                  append(realSb,"_M, v));");
                }
                else
                {
                  if(sm.isQueued())
                  {
                    append(realSb,"\n    queue.put(new Message(MessageType.{0}",gen.translate("eventMethod",event));
                  }
                  if(sm.isPooled())
                  {
                    append(realSb,"\n    pool.put(new Message(MessageType.{0}",gen.translate("eventMethod",event));
                  }
                  append(realSb,"_M, null));");
                }
                append(realSb,"\n  }");
                append(realSb,"\n");
                evName = event.getName();
              }
            }
          }
        }
        sameEvName = false;        
      }


      for (StateMachine nsm : sm.getNestedStateMachines())
      {
        for (Event e : nsm.getEvents())
        {
          for(int i=0; i<evList.size(); i++)
          {
            if(evList.get(i).equals(e.getName()))
            {
              sameEvName=true;
            }
          }
        
          if(sameEvName == false)
          {
            if(e.isAutoTransition() == false)
            {
              if(e.getIsTimer())
              {
                evList.add(e.getName());
                append(realSb,"\n");
                append(realSb,"  public boolean ");
                append(realSb,"{0} ()",gen.translate("eventMethod",e));
                append(realSb,"\n  {");
                append(realSb,"\n    boolean wasAdded = false;");
          
                if(sm.isQueued())
                {
                  append(realSb,"\n    queue.put(new Message(MessageType.{0}",gen.translate("eventMethod",e));
                }
                if(sm.isPooled())
                {
                  append(realSb,"\n    pool.put(new Message(MessageType.{0}",gen.translate("eventMethod",e));
                }
                append(realSb,"_M, null));");
       
                append(realSb,"\n    wasAdded = true;");
                append(realSb,"\n    return wasAdded;");
                append(realSb,"\n  }");
                append(realSb,"\n");
                evName = e.getName();
              }
              if(!e.isUnspecified())
              {
                 if(e.getIsInternal() == false)
                 {
                   if( !evName.equals(e.getName()))
                   {
                     evList.add(e.getName());
                     append(realSb,"\n");
                     append(realSb,"  public void ");
                     append(realSb,"{0} ({1})",gen.translate("eventMethod",e), e.getArgs());
                     append(realSb,"\n  {");
        
                     if (!e.getArgs().equals(""))
                     {
                       evList.add(e.getName());
                       append(realSb,"\n    Vector<Object> v = new Vector<Object>({0});", e.getParams().size());
                       for ( int i=0; i < e.getParams().size(); i++)
                       {
                         append(realSb,"\n    v.add({0}, {1});",i, e.getParam(i).getName());
                       }
                       if(sm.isQueued())
                       {
                         append(realSb,"\n    queue.put(new Message(MessageType.{0}",gen.translate("eventMethod",e));
                       }
                       if(sm.isPooled())
                       {
                         append(realSb,"\n    pool.put(new Message(MessageType.{0}",gen.translate("eventMethod",e));
                       } 
                       append(realSb,"_M, v));"); 
                     }
                     else
                     {
                       if(sm.isQueued())
                       {
                         append(realSb,"\n    queue.put(new Message(MessageType.{0}",gen.translate("eventMethod",e));
                       }
                       if(sm.isPooled())
                       {
                         append(realSb,"\n    pool.put(new Message(MessageType.{0}",gen.translate("eventMethod",e));
                       }
                       append(realSb,"_M, null));");
                     }
                     append(realSb,"\n  }");
                     append(realSb,"\n");
                     evName = e.getName();
                   }
                 }
               }
             }
           }
           sameEvName=false;
         }
        }
      }
    }

    /*queued_state_machine_removalThread_run*/
    realSb.append(TEXT_2471);
    
	  if(smq.isPooled())
	  {
		append(realSb,"      Message m = pool.getNext();");
		append(realSb,"\n      if(m == null)  return;");
	  }
	  if(smq.isQueued())
	  {
		append(realSb,"      Message m = queue.getNext();");
		append(realSb,"\n      if(m == null)  return;");
	  }
      
    realSb.append(TEXT_2472);
     
        String eveNameSM="";
        boolean sameEventNameSM=false;
        List<String> eventListSM=new ArrayList<String>();
          
        for(StateMachine sm: uClass.getStateMachines())
        {
           for(Event event : sm.getEvents())
           {
             for(int i=0; i<eventListSM.size(); i++)
             {
               if(eventListSM.get(i).equals(event.getName()))
               {
                 sameEventNameSM=true;
               }
             }
             
             if(sameEventNameSM == false)
             {
               if(event.isAutoTransition() == false)
               {
                 if(!event.isUnspecified())
                 {
                   if( !eveNameSM.equals(event.getName()))
                   {
                     eventListSM.add(event.getName());
                     append(realSb,"\n        case {0}",gen.translate("eventMethod",event));
                     append(realSb,"_M:");
                     if (!event.getArgs().equals(""))
                     {
                       append(realSb,"\n          status = _{0}(",gen.translate("eventMethod",event));
                       String allParameters="";
                       for ( int i=0; i < event.getParams().size(); i++)
                       {
                         if (allParameters.length() > 0)
                         {
                           allParameters += ", ";
                         }
                         allParameters += "("+event.getParam(i).getType()+") m.param.elementAt("+i+")";
                       }
                       append(realSb,"{0});",allParameters);
                     }
                     else
                     {
                       append(realSb,"\n          status = _{0}",gen.translate("eventMethod",event));
                       append(realSb,"();");
                     }
                     append(realSb,"\n          break;");
                     eveNameSM = event.getName();
                   }
                 }
               }
             }
             sameEventNameSM = false;             
           }


           for (StateMachine nsm : sm.getNestedStateMachines())
           {
             for (Event e : nsm.getEvents())
             {
               for(int i=0; i<eventListSM.size(); i++)
               {
                 if(eventListSM.get(i).equals(e.getName()))
                 {
                   sameEventNameSM=true;
                 }
               }

               if(sameEventNameSM == false)
               {
                 if(e.isAutoTransition() == false)
                 {
                   if(!e.isUnspecified())
                   {
                     if(e.getIsInternal() == false)
                     {
                       if( !eveNameSM.equals(e.getName()))
                       {
                         eventListSM.add(e.getName());
                         append(realSb,"\n        case {0}",gen.translate("eventMethod",e));
                         append(realSb,"_M:");
                         if (!e.getArgs().equals(""))
                         {
                           append(realSb,"\n          status = _{0}(",gen.translate("eventMethod",e));
                           String allParameters="";
                           for ( int i=0; i < e.getParams().size(); i++)
                           {
                             if (allParameters.length() > 0)
                             {
                               allParameters += ", ";
                             }
                             allParameters += "("+e.getParam(i).getType()+") m.param.elementAt("+i+")";
                           }
                           append(realSb,"{0});",allParameters);
                         }
                         else
                         {
                           append(realSb,"\n          status = _{0}",gen.translate("eventMethod",e));
                           append(realSb,"();");
                         }
                         append(realSb,"\n          break;");
                         eveNameSM = e.getName();
                       }
                     }
                   }
                 }
               }
               sameEventNameSM = false;
             }
           }
         }
           
    realSb.append(TEXT_2473);
    realSb.append(TEXT_2474);
     break;
       }       
       if (smq.isQueued())
       {
    /*queued_state_machine_inner_class*/
    
  appendln(realSb,"\n  protected class Message");
  appendln(realSb,"  {");
  appendln(realSb,"    MessageType type;"); 
  appendln(realSb,"    ");  
  appendln(realSb,"    //Message parameters");
  appendln(realSb,"    Vector<Object> param;"); 
  appendln(realSb,"    ");   
  appendln(realSb,"    public Message(MessageType t, Vector<Object> p)");
  appendln(realSb,"    {");
  appendln(realSb,"      type = t; "); 
  appendln(realSb,"      param = p;");
  appendln(realSb,"    }");
  appendln(realSb,"");
  appendln(realSb,"    @Override");
  appendln(realSb,"    public String toString()");
  appendln(realSb,"    {");
  appendln(realSb,"      return type + \",\" + param;");
  appendln(realSb,"    }");
  appendln(realSb,"  }");
  appendln(realSb,"  ");  
 
  if (smq.isQueued())
  {
    appendln(realSb,"  protected class MessageQueue {");
    appendln(realSb,"    Queue<Message> messages = new LinkedList<Message>();");
    appendln(realSb,"    ");   
    appendln(realSb,"    public synchronized void put(Message m)");
    appendln(realSb,"    {");
    appendln(realSb,"      messages.add(m); "); 
    appendln(realSb,"      notify();");
    appendln(realSb,"    }");
    appendln(realSb,"");  
    appendln(realSb,"    public synchronized Message getNext()");
    appendln(realSb,"    {");
    appendln(realSb,"      try {");
    appendln(realSb,"        while (messages.isEmpty()) "); 
    appendln(realSb,"        {");
    appendln(realSb,"          wait();");
    appendln(realSb,"        }");
    appendln(realSb,"      } catch (InterruptedException e) {");
    appendln(realSb,"        Thread.currentThread().interrupt();");
    appendln(realSb,"        return null;");
    appendln(realSb,"      }");
    appendln(realSb,"");
    appendln(realSb,"      //The element to be removed");
    appendln(realSb,"      Message m = messages.remove(); "); 
    appendln(realSb,"      return (m);");
    appendln(realSb,"    }");
    append(realSb,"  }");  
  }
  else if(smq.isPooled())
  {
    appendln(realSb,"  protected class MessagePool {");
    appendln(realSb,"    Queue<Message> messages = new LinkedList<Message>();");
    appendln(realSb,"    ");   
    appendln(realSb,"    public synchronized void put(Message m)");
    appendln(realSb,"    {");
    appendln(realSb,"      messages.add(m); "); 
    appendln(realSb,"      notify();");
    appendln(realSb,"    }");
    appendln(realSb,"");  
    appendln(realSb,"    public synchronized Message getNext()");
    appendln(realSb,"    {");
    appendln(realSb,"      Message message=null;");
    appendln(realSb,"");
    appendln(realSb,"      try {");
    appendln(realSb,"        message=getNextProcessableMessage();");
    appendln(realSb,"        while (message==null)");
    appendln(realSb,"        {");
    appendln(realSb,"          wait();");
    appendln(realSb,"          message=getNextProcessableMessage();");
    appendln(realSb,"        }");
    appendln(realSb,"      } catch (InterruptedException e) {");
    appendln(realSb,"        Thread.currentThread().interrupt();");
    appendln(realSb,"        return null;");
    appendln(realSb,"      }");
    appendln(realSb,"");
    appendln(realSb,"      // return the message");
    appendln(realSb,"      return (message);");
    appendln(realSb,"    }");
    appendln(realSb,"");
    appendln(realSb,"    public Message getNextProcessableMessage()");
    appendln(realSb,"    {");
    appendln(realSb,"      // Iterate through messages and remove the first message that matches one of the Messages list");
    appendln(realSb,"      // otherwise return null");
    appendln(realSb,"      for (Message msg: messages)");
    appendln(realSb,"      {");
    
    for(StateMachine sm: uClass.getStateMachines())
    {
      if(sm.isPooled())
      {
        if(sm.getNestedStateMachines().isEmpty())
        {
          append(realSb,"        if(stateMessageMap.get(get");
          append(realSb,"{0}", gen.translate("type",sm));
          appendln(realSb,"()).contains(msg.type))");
          appendln(realSb,"        {");
          appendln(realSb,"          //The element to be removed");
          appendln(realSb,"          messages.remove(msg);");
          appendln(realSb,"          return (msg);");
          appendln(realSb,"        }");
        }
        else if(!sm.getNestedStateMachines().isEmpty())
        {
          append(realSb,"        if(stateMessageMap.get(get");
          append(realSb,"{0}", gen.translate("type",sm));
          appendln(realSb,"()).contains(msg.type))");
          appendln(realSb,"        {");
          appendln(realSb,"          //The element to be removed");
          appendln(realSb,"          messages.remove(msg);");
          appendln(realSb,"          return (msg);");
          appendln(realSb,"        }");
          append(realSb,"        else");
          int nsmSize = sm.getNestedStateMachines().size();
          int nesCount = 0;
          for(StateMachine nsm : sm.getNestedStateMachines())
          {
            nesCount++;
            append(realSb," if(stateMessageMap.get(get");
            append(realSb,"{0}", gen.translate("type",nsm));
            appendln(realSb,"()).contains(msg.type))");
            appendln(realSb,"        {");
            appendln(realSb,"          //The element to be removed");
            appendln(realSb,"          messages.remove(msg);");
            appendln(realSb,"          return (msg);");
            appendln(realSb,"        }");
            if(nsmSize > nesCount)
            {
              append(realSb,"        else");
            }
          }
        }
      }
    }
    appendln(realSb,"      }");
    appendln(realSb,"      return null;");
    appendln(realSb,"    }");
    append(realSb,"  }"); 
  }

    /*queued_state_machine_queuedEvent*/
    
  append(realSb,"\n");
  append(realSb,"\n  //------------------------------");
  append(realSb,"\n  //messages accepted ");
  append(realSb,"\n  //------------------------------");
  append(realSb,"\n");
  
  
  String evName="";
  boolean sameEvName=false;
  List<String> evList=new ArrayList<String>();
          
  for (StateMachine sm : uClass.getStateMachines())
  {
    if(sm.isQueued() || sm.isPooled()) 
    { 
      for(Event event : sm.getEvents())
      { 
        for(int i=0; i<evList.size(); i++)
        {
          if(evList.get(i).equals(event.getName()))
          {
            sameEvName=true;
          }
        }
             
        if(sameEvName == false)
        {
          if(event.isAutoTransition() == false)
          {
            if(event.getIsTimer())
            {
               evList.add(event.getName());
               append(realSb,"\n");
               append(realSb,"  public boolean ");
               append(realSb,"{0} ()",gen.translate("eventMethod",event));
               append(realSb,"\n  {");
               append(realSb,"\n    boolean wasAdded = false;");
          
               if(sm.isQueued())
               {
                 append(realSb,"\n    queue.put(new Message(MessageType.{0}",gen.translate("eventMethod",event));
               }
               if(sm.isPooled())
               {
                 append(realSb,"\n    pool.put(new Message(MessageType.{0}",gen.translate("eventMethod",event));
               }
               append(realSb,"_M, null));");
       
               append(realSb,"\n    wasAdded = true;");
               append(realSb,"\n    return wasAdded;");
               append(realSb,"\n  }");
               append(realSb,"\n");
               evName = event.getName();
            }
            if(!event.isUnspecified())
            {
              if( !evName.equals(event.getName()))
              {
                evList.add(event.getName());
                append(realSb,"\n");
                append(realSb,"  public void ");
                append(realSb,"{0} ({1})",gen.translate("eventMethod",event), event.getArgs());
                append(realSb,"\n  {");
          
                if (!event.getArgs().equals(""))
                {
                  append(realSb,"\n    Vector<Object> v = new Vector<Object>({0});", event.getParams().size());
                  for ( int i=0; i < event.getParams().size(); i++)
                  {
                    append(realSb,"\n    v.add({0}, {1});",i, event.getParam(i).getName());
                  }
                  if(sm.isQueued())
                  {
                    append(realSb,"\n    queue.put(new Message(MessageType.{0}",gen.translate("eventMethod",event));
                  }
                  if(sm.isPooled())
                  {
                    append(realSb,"\n    pool.put(new Message(MessageType.{0}",gen.translate("eventMethod",event));
                  }
                  append(realSb,"_M, v));");
                }
                else
                {
                  if(sm.isQueued())
                  {
                    append(realSb,"\n    queue.put(new Message(MessageType.{0}",gen.translate("eventMethod",event));
                  }
                  if(sm.isPooled())
                  {
                    append(realSb,"\n    pool.put(new Message(MessageType.{0}",gen.translate("eventMethod",event));
                  }
                  append(realSb,"_M, null));");
                }
                append(realSb,"\n  }");
                append(realSb,"\n");
                evName = event.getName();
              }
            }
          }
        }
        sameEvName = false;        
      }


      for (StateMachine nsm : sm.getNestedStateMachines())
      {
        for (Event e : nsm.getEvents())
        {
          for(int i=0; i<evList.size(); i++)
          {
            if(evList.get(i).equals(e.getName()))
            {
              sameEvName=true;
            }
          }
        
          if(sameEvName == false)
          {
            if(e.isAutoTransition() == false)
            {
              if(e.getIsTimer())
              {
                evList.add(e.getName());
                append(realSb,"\n");
                append(realSb,"  public boolean ");
                append(realSb,"{0} ()",gen.translate("eventMethod",e));
                append(realSb,"\n  {");
                append(realSb,"\n    boolean wasAdded = false;");
          
                if(sm.isQueued())
                {
                  append(realSb,"\n    queue.put(new Message(MessageType.{0}",gen.translate("eventMethod",e));
                }
                if(sm.isPooled())
                {
                  append(realSb,"\n    pool.put(new Message(MessageType.{0}",gen.translate("eventMethod",e));
                }
                append(realSb,"_M, null));");
       
                append(realSb,"\n    wasAdded = true;");
                append(realSb,"\n    return wasAdded;");
                append(realSb,"\n  }");
                append(realSb,"\n");
                evName = e.getName();
              }
              if(!e.isUnspecified())
              {
                 if(e.getIsInternal() == false)
                 {
                   if( !evName.equals(e.getName()))
                   {
                     evList.add(e.getName());
                     append(realSb,"\n");
                     append(realSb,"  public void ");
                     append(realSb,"{0} ({1})",gen.translate("eventMethod",e), e.getArgs());
                     append(realSb,"\n  {");
        
                     if (!e.getArgs().equals(""))
                     {
                       evList.add(e.getName());
                       append(realSb,"\n    Vector<Object> v = new Vector<Object>({0});", e.getParams().size());
                       for ( int i=0; i < e.getParams().size(); i++)
                       {
                         append(realSb,"\n    v.add({0}, {1});",i, e.getParam(i).getName());
                       }
                       if(sm.isQueued())
                       {
                         append(realSb,"\n    queue.put(new Message(MessageType.{0}",gen.translate("eventMethod",e));
                       }
                       if(sm.isPooled())
                       {
                         append(realSb,"\n    pool.put(new Message(MessageType.{0}",gen.translate("eventMethod",e));
                       } 
                       append(realSb,"_M, v));"); 
                     }
                     else
                     {
                       if(sm.isQueued())
                       {
                         append(realSb,"\n    queue.put(new Message(MessageType.{0}",gen.translate("eventMethod",e));
                       }
                       if(sm.isPooled())
                       {
                         append(realSb,"\n    pool.put(new Message(MessageType.{0}",gen.translate("eventMethod",e));
                       }
                       append(realSb,"_M, null));");
                     }
                     append(realSb,"\n  }");
                     append(realSb,"\n");
                     evName = e.getName();
                   }
                 }
               }
             }
           }
           sameEvName=false;
         }
        }
      }
    }

    /*queued_state_machine_removalThread_run*/
    realSb.append(TEXT_2471);
    
	  if(smq.isPooled())
	  {
		append(realSb,"      Message m = pool.getNext();");
		append(realSb,"\n      if(m == null)  return;");
	  }
	  if(smq.isQueued())
	  {
		append(realSb,"      Message m = queue.getNext();");
		append(realSb,"\n      if(m == null)  return;");
	  }
      
    realSb.append(TEXT_2472);
     
        String eveNameSM="";
        boolean sameEventNameSM=false;
        List<String> eventListSM=new ArrayList<String>();
          
        for(StateMachine sm: uClass.getStateMachines())
        {
           for(Event event : sm.getEvents())
           {
             for(int i=0; i<eventListSM.size(); i++)
             {
               if(eventListSM.get(i).equals(event.getName()))
               {
                 sameEventNameSM=true;
               }
             }
             
             if(sameEventNameSM == false)
             {
               if(event.isAutoTransition() == false)
               {
                 if(!event.isUnspecified())
                 {
                   if( !eveNameSM.equals(event.getName()))
                   {
                     eventListSM.add(event.getName());
                     append(realSb,"\n        case {0}",gen.translate("eventMethod",event));
                     append(realSb,"_M:");
                     if (!event.getArgs().equals(""))
                     {
                       append(realSb,"\n          status = _{0}(",gen.translate("eventMethod",event));
                       String allParameters="";
                       for ( int i=0; i < event.getParams().size(); i++)
                       {
                         if (allParameters.length() > 0)
                         {
                           allParameters += ", ";
                         }
                         allParameters += "("+event.getParam(i).getType()+") m.param.elementAt("+i+")";
                       }
                       append(realSb,"{0});",allParameters);
                     }
                     else
                     {
                       append(realSb,"\n          status = _{0}",gen.translate("eventMethod",event));
                       append(realSb,"();");
                     }
                     append(realSb,"\n          break;");
                     eveNameSM = event.getName();
                   }
                 }
               }
             }
             sameEventNameSM = false;             
           }


           for (StateMachine nsm : sm.getNestedStateMachines())
           {
             for (Event e : nsm.getEvents())
             {
               for(int i=0; i<eventListSM.size(); i++)
               {
                 if(eventListSM.get(i).equals(e.getName()))
                 {
                   sameEventNameSM=true;
                 }
               }

               if(sameEventNameSM == false)
               {
                 if(e.isAutoTransition() == false)
                 {
                   if(!e.isUnspecified())
                   {
                     if(e.getIsInternal() == false)
                     {
                       if( !eveNameSM.equals(e.getName()))
                       {
                         eventListSM.add(e.getName());
                         append(realSb,"\n        case {0}",gen.translate("eventMethod",e));
                         append(realSb,"_M:");
                         if (!e.getArgs().equals(""))
                         {
                           append(realSb,"\n          status = _{0}(",gen.translate("eventMethod",e));
                           String allParameters="";
                           for ( int i=0; i < e.getParams().size(); i++)
                           {
                             if (allParameters.length() > 0)
                             {
                               allParameters += ", ";
                             }
                             allParameters += "("+e.getParam(i).getType()+") m.param.elementAt("+i+")";
                           }
                           append(realSb,"{0});",allParameters);
                         }
                         else
                         {
                           append(realSb,"\n          status = _{0}",gen.translate("eventMethod",e));
                           append(realSb,"();");
                         }
                         append(realSb,"\n          break;");
                         eveNameSM = e.getName();
                       }
                     }
                   }
                 }
               }
               sameEventNameSM = false;
             }
           }
         }
           
    realSb.append(TEXT_2473);
    realSb.append(TEXT_2475);
     break;
       }
     }
     
    realSb.append(TEXT_2476);
    return realSb.toString();
    } 
    private String getExtraMethodsCode(StringBuilder realSb, UmpleModel model,UmpleClass uClass, GeneratedClass gClass, JavaGenerator gen, boolean isFirst)
  {
    realSb.append(TEXT_2477);
     if (uClass.hasMethods()) { 
    /*class_MethodDeclaration*/
    

    if (uClass.hasMethods())
    {
      boolean hasQueued = false;
      for (Method aMethod : uClass.getMethods()) 
      {
        List<TraceItem> traceItems= aMethod.getTraced("method",uClass);
        
        if(!aMethod.getExistsInLanguage("Java") || aMethod.getSource() == Method.Source.fAutoAPI)
          continue;
        
          
        Position p = aMethod.getCodePosition();
        String positionHeader = "";        
        
        if (p != null) {
//        use annotations instead
        positionHeader = "  // line " + p.getLineNumber() + " \"" + uClass.getRelativePath(p.getFilename(),"Java") + "\"\n";
//        positionHeader = "\n  @umplesourcefile(line={"+p.getLineNumber()+"},file={\""+p.getFilename().replaceAll("\\\\","/").replaceAll("(.*)/","")+ "\"},javaline={"+(javaline+4)+"},length={"+(aMethod.getIsImplemented()?2: aMethod.getMethodBody().getExtraCode().split("\\n").length+2)+"})";          
        }
        else 
        {
          p = aMethod.getPosition();
//          positionHeader = "\n  @umplesourcefile(line={"+p.getLineNumber()+"},file={\""+p.getFilename().replaceAll("\\\\","/").replaceAll("(.*)/","")+ "\"},javaline={"+(javaline+3)+"},length={"+(aMethod.getIsImplemented()?2: aMethod.getMethodBody().getExtraCode().split("\\n").length+2)+"})";
        }
        String methodModifier = aMethod.getModifier().equals("") ? "public" : aMethod.getModifier();
        String methodImplementationModifier = aMethod.getIsAbstract() ? " abstract" : "";
        String methodName = aMethod.getName();
        String methodType = aMethod.getType();
        
        if(aMethod.getIsQueued())
        {
		  String isList="";
		  Boolean isFirstParameter = true;
		  if (aMethod.hasMethodParameters())
		  {
			append(realSb,"\n");
			append(realSb,"  public void {0} (",aMethod.getName());
			for (MethodParameter aMethodParam : aMethod.getMethodParameters()) 
			{
			  isList = aMethodParam.getIsList() ? " [] " : " ";
			  if (!isFirstParameter)
			  {
				append(realSb, ", ");
			  }
			  append(realSb, aMethodParam.getType() + isList + aMethodParam.getName());
			  isFirstParameter = false;
			}
			append(realSb, ");");
		
			append(realSb,"\n  {");
		
			append(realSb,"\n    Vector<Object> v = new Vector<Object>({0});", aMethod.numberOfMethodParameters());
			for ( int i=0; i < aMethod.numberOfMethodParameters(); i++)
			{
			  append(realSb,"\n    v.add({0}, {1});",i, aMethod.getMethodParameter(i).getName());
			}
		
			append(realSb,"\n    queuedMethodThread.putCallTo(queuedMethodThread.new QueuedMethodMessage(QueuedMethod.{0}", aMethod.getName());
			append(realSb,"_M, v));");
		  }
		  else
		  {
			append(realSb,"\n");
			append(realSb,"  public void ");
			append(realSb,"{0} ()",aMethod.getName());
			append(realSb,"\n  {");
			append(realSb,"\n    queuedMethodThread.putCallTo(queuedMethodThread.new QueuedMethodMessage(QueuedMethod.{0}",aMethod.getName());
			append(realSb,"_M, null));");
		  }
		  append(realSb,"\n  }");
		  append(realSb,"\n");
		  methodName = "_" + methodName;
		}
	  
    // Fix issue 969
    if (!methodName.equals(uClass.getName()))
    {
      // If this is not a constructor, this method should return "void"
      methodType = methodType.equals("") ? "void" : methodType;
    }
    // handle mixsets inside methods(uClass, aMethod);
        ArrayList<MixsetInMethod> mixsetsWithinMethodList = aMethod.getMethodBody().getMixsetsWithinMethod();
    for(MixsetInMethod mixsetsWithinMethodItem : mixsetsWithinMethodList)
    {
      handelMixsetInsideMethod(model, mixsetsWithinMethodItem, aMethod.getMethodBody());
    }
     
    // End 
    for(int i =uClass.getCodeInjections().size() ; i > 0 ; i--)
    {
      applyCodeInjectionToLabeledMethod(uClass, aMethod, "before");
      applyCodeInjectionToLabeledMethod(uClass, aMethod, "after");
      applyCodeInjectionToLabeledMethod(uClass, aMethod, "around");
    } 
        String customBeforeInjectionCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjectionsCustomMethod("before", aMethod.getName(), aMethod.getMethodParameters()));
        String customAfterInjectionCode  = GeneratorHelper.toCode(uClass.getApplicableCodeInjectionsCustomMethod("after", aMethod.getName(), aMethod.getMethodParameters()));
        if( (customBeforeInjectionCode != null) && (customAfterInjectionCode == null) )
        {
          if(customBeforeInjectionCode.contains("around_proceed:"))
          {
            String[] codeToInjectArray = customBeforeInjectionCode.split("around_proceed:");
            customBeforeInjectionCode = codeToInjectArray[0];
            customAfterInjectionCode = ""+codeToInjectArray[1];
            customAfterInjectionCode = customAfterInjectionCode.replace("END OF UMPLE BEFORE INJECTION","END OF UMPLE AROUND INJECTION");
          }
        }
        
        String customPreconditionCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", aMethod.getName()+"Precondition"));        
        String customPostconditionCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", aMethod.getName()+"Postcondition"));
        customPostconditionCode = customPostconditionCode==null?"":customPostconditionCode;

        String methodBody = aMethod.getIsImplemented() ? "      return " + gen.translate(methodType) + ";" : aMethod.getMethodBody().getExtraCode();
        String properMethodBody = "    " + methodBody; 
        String override =  aMethod.getIsImplemented() ? "  @Override\n" : "";
        String paramName="";
        String paramType="";
        String aSingleParameter="";
        String isList="";
        String finalParams = "";        
        String finalParamsWithoutTypes = "";
        StringBuilder parameters = new StringBuilder();
        StringBuilder parametersWithoutTypes = new StringBuilder();
        if (aMethod.hasMethodParameters())
        {
          for (MethodParameter aMethodParam : aMethod.getMethodParameters()) 
          {
            paramName = aMethodParam.getName();
            paramType = aMethodParam.getType();
            isList = aMethodParam.getIsList() ? " [] " : " ";
            aSingleParameter = paramType + isList + paramName;
            parameters.append(aSingleParameter + ", ");
            parametersWithoutTypes.append(aMethodParam.getName() + ", ");
          }
          
          finalParams = parameters.toString().substring(0, parameters.toString().length()-2);
          finalParamsWithoutTypes = parametersWithoutTypes.toString().substring(0, parametersWithoutTypes.toString().length()-2);
        }

        /*
        to change the name of the user defined constructors
        */
        if(uClass.getHasProxyPattern()||(uClass.getNeedsDefaultInterface()&&model.getDistributePattern()>0))
        {
          if(("".equals(methodType))&&(uClass.getName().equals(methodName+"Impl")))
          {
            methodName+="Impl";
          }
        }
    
        if(methodName.equals("main")&&methodType.equals("void")&&methodModifier.contains("public")&&methodModifier.contains("static")
          &&paramType.equals("String")&&isList.equals(" [] "))
        {
          String exceptionHandlerPackage = "";
          if(model.getMainClass() != null)
          {
            if (model.getMainClass().getPackageName() != "")  exceptionHandlerPackage = model.getMainClass().getPackageName() + ".";
            
            exceptionHandlerPackage += model.getMainClass().getName()+".";
          }
          else
          {
            model.setMainClass(uClass);
          }
          properMethodBody = "    Thread.currentThread().setUncaughtExceptionHandler(new "+exceptionHandlerPackage+"UmpleExceptionHandler());\n"+
                             "    Thread.setDefaultUncaughtExceptionHandler(new "+exceptionHandlerPackage+"UmpleExceptionHandler());\n"+properMethodBody;
          uClass.setHasMainMethod(true);
        }
        if (aMethod.numberOfComments() > 0 && aMethod.numberOfRequirements() > 0) { List<Comment> toComment = new ArrayList<Comment>(aMethod.getComments()); toComment.addAll(Requirement.convertToComment(aMethod.getRequirements())); append(realSb, "\n\n  {0}", Comment.format("Method Javadoc", toComment)); }
        else if (aMethod.numberOfComments() > 0) { append(realSb, "\n\n  {0}", Comment.format("Method Javadoc",aMethod.getComments())); }
        else if (aMethod.numberOfRequirements() > 0) { append(realSb, "\n\n  {0}", Requirement.format("Method Javadoc",aMethod.getRequirements())); }
        
        append(realSb,"\n");
        int javaline = realSb.toString().split("\\n").length+(aMethod.numberOfComments() > 0?0:1);

        StringBuilder methodExceptionsBuilder = new StringBuilder();
        if(aMethod.getExceptions()!=null&&aMethod.numberOfExceptions()>0)
        {
          methodExceptionsBuilder.append(" throws ");
          String exceptioncomma = "";
          for(String methodException:aMethod.getExceptions())
          {
            if(!"".equals(methodException))
            {
              methodExceptionsBuilder.append(exceptioncomma);
              methodExceptionsBuilder.append(methodException);
              exceptioncomma = ",";
            }
          }
        }
        String methodExceptions = methodExceptionsBuilder.toString();

        if(!"".equals(customPostconditionCode))
        {
          StringBuilder lineNumbers = new StringBuilder();
          StringBuilder javaLineNumbers = new StringBuilder();
          StringBuilder filenames = new StringBuilder();
          StringBuilder lengths = new StringBuilder();
          String comma = "";
          if(p!=null)
          {
            int previousConditionsFound = 0;
            for(Postcondition condition:uClass.getPostConds())
            {
              if(condition.getMethod().equals(aMethod)&&condition.getPosition()!=null)
              {
                lineNumbers.append(comma+(condition.getPosition().getLineNumber()));
                filenames.append(comma+condition.getPosition().getFilename());
                javaLineNumbers.append(comma+(javaline+7+3*previousConditionsFound));
                lengths.append(comma+"1");
                comma = ",";
                previousConditionsFound++;
              }
            }
          }
          if(!"".equals(lineNumbers.toString())){
            String positionEndHeader = "\n";
          }
                    
          append(realSb,positionHeader);
          append(realSb,override);
          append(realSb, "{5}  {0}{1} {2} {3}({4}){6}", methodModifier, methodImplementationModifier, methodType, methodName, finalParams, positionHeader, methodExceptions);
        
          appendln(realSb, "{");
          if(!"".equals(methodType)&&!"void".equals(methodType))
          {
            append(realSb, "    {0} result = {1}_Original({2});\n", methodType, methodName, finalParamsWithoutTypes);
          }
          else
          {
            append(realSb, "    {0}_Original({1});\n", methodName, finalParamsWithoutTypes);
          }
          addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customPostconditionCode,methodName);
          appendln(realSb, GeneratorHelper.doIndent(customPostconditionCode, "    "));
          if(!"".equals(methodType)&&!"void".equals(methodType))
          {
            append(realSb, "    return result;\n");
            javaline++;
          }          
          appendln(realSb, "  }");
          
          javaline+= 5+customPostconditionCode.split("\\n").length;
          append(realSb, "\n  {0}{1} {2} {3}_Original({4}){5}", methodModifier, methodImplementationModifier, methodType, methodName, finalParams, methodExceptions);
        }
        else
        {
          append(realSb,override);
          append(realSb, "{5}  {0}{1} {2} {3}({4}){6}", methodModifier, methodImplementationModifier, methodType, methodName, finalParams, positionHeader, methodExceptions);
        }
        if(aMethod.getIsAbstract())
        {
          append(realSb, ";\n");
        }
        else
        {
          appendln(realSb, "{");
          for( TraceItem traceItem : traceItems )append(realSb, (traceItem!=null&&traceItem.getIsPre()?traceItem.trace(gen, aMethod,"me_e", uClass):""));
          if (customPreconditionCode != null) {
            addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customPreconditionCode,methodName);
            append(realSb, "\n{0}\n",GeneratorHelper.doIndent(customPreconditionCode, "    "));
          }
          if (customBeforeInjectionCode != null) {
            addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customBeforeInjectionCode,methodName);
            append(realSb, "{0}\n",GeneratorHelper.doIndent(customBeforeInjectionCode, "    "));
            aMethod.getMethodBody().getCodeblock().setCode("", GeneratorHelper.doIndent(customBeforeInjectionCode, "    ") + aMethod.getMethodBody().getCodeblock());
        }
          
          String traceCode = "";
          if(properMethodBody.contains("return"))
          {
            for( TraceItem traceItem : traceItems )traceCode += (traceItem!=null&&traceItem.getIsPost()?traceItem.trace(gen, aMethod,"me_x", uClass):"");
              properMethodBody = properMethodBody.replaceAll("return", traceCode + "return");

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
              List<Integer> injectedLineNumbers = new ArrayList<Integer>();
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
                injectedLineNumbers.add(properMethodBody.substring(0, i).trim().split("\\n").length);
                properMethodBody = properMethodIndent + properMethodBody.substring(0, i).trim() + indentedCustomAfterInjectionCode + "\n" + indent + returnAndRest[0].trim() + ";" + braceNewLine + braceIndent + brace + returnAndRest[1]; 
                i += indentedCustomAfterInjectionCode.length() + braceIndent.length() + 7;
              }

              // if the last line isn't a return, insert the injection at the very end
              String[] lines = properMethodBody.split("\\n");
              if(!lines[lines.length-1].contains("return")) {
                injectedLineNumbers.add(lines.length);
                properMethodBody += GeneratorHelper.doIndent("\n" + customAfterInjectionCode, "    ");
              }
              
              int javaLength = realSb.toString().split("\\n").length;
              for (Integer line : injectedLineNumbers) {
                addUncaughtExceptionVariables(javaLength + line,customAfterInjectionCode,methodName);
              }
            }
          }
          appendln(realSb, properMethodBody);
          if(!properMethodBody.contains("return"))
          {
            for( TraceItem traceItem : traceItems )append(realSb, (traceItem!=null&&traceItem.getIsPost()?traceItem.trace(gen, aMethod,"me_x", uClass):""));
            if (customAfterInjectionCode != null) {
                addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAfterInjectionCode,methodName);
                append(realSb, "{0}\n",GeneratorHelper.doIndent(customAfterInjectionCode, "    "));
            }
          }
          appendln(realSb, "  }");
          addUncaughtExceptionVariables(methodName,p.getFilename().replaceAll("\\\\","/").replaceAll("(.*)/",""),p.getLineNumber(),javaline,methodBody.split("\\n").length);
        }

      }
    }

    realSb.append(TEXT_2478);
     } 
     
   boolean matchFound = false;
   UmpleClass parent = uClass.getExtendsClass(); 
   if(uClass.getExtraCode() != null)
   {
     matchFound = java.util.regex.Pattern.compile(".*((public)|(protected)|(private))\\s+(String)\\s+(toString)\\s*\\(\\s*\\).*", java.util.regex.Pattern.DOTALL).matcher(uClass.getExtraCode()).matches();
   }
   if(parent!=null && parent.getExtraCode() != null)
   {
     matchFound = java.util.regex.Pattern.compile(".*((public)|(protected)|(private))\\s+(String)\\s+(toString)\\s*\\(\\s*\\).*", java.util.regex.Pattern.DOTALL).matcher(parent.getExtraCode()).matches();
   }
   if(!matchFound)
   for(Method meth: uClass.getMethods())
   {
     if("toString".equals(meth.getName()))
     {
       matchFound = true;
       break;
     }
   }
   if(!matchFound && parent!=null)
   for(Method meth: parent.getMethods())
   {
     if("toString".equals(meth.getName()))
     {
       matchFound = true;
       break;
     }
   }
   if (uClass.getAttributes().size()>0 && !matchFound){ 
    /*toString_declare*/
    realSb.append(TEXT_2479);
    
	  String customToStringPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before","toString"));
	  String customToStringPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after","toString"));
	  if (customToStringPrefixCode != null) 
	  {
		  append(realSb, "\n{0}",GeneratorHelper.doIndent(customToStringPrefixCode, "    "));
	  }
	  if (customToStringPostfixCode != null) 
	  {
		  append(realSb, "\n{0}",GeneratorHelper.doIndent(customToStringPostfixCode, "    "));
	  }
	  String ret = "";

	  LinkedList<String> displayedAttributes = new LinkedList<String>();
	  LinkedList<String> nameOfAttributes = new LinkedList<String>();
	  LinkedList<String> displayedPrimitives = new LinkedList<String>();
	  LinkedList<String> nameOfPrimitives = new LinkedList<String>();
	  List<String> keys = new ArrayList<String>();
	  List<String> reflexiveNames = new ArrayList<String>();
	  List<String> reflexive = new ArrayList<String>();
	  for(String k: uClass.getKey().getMembers())
		  keys.add(k);
	  for(Attribute av: uClass.getAttributes())
	  {
	      
		  if(!av.getIsList()&&!"internal".equals(av.getModifier())&&!"const".equals(av.getModifier())&&("String".equals(av.getType())||"int".equals(av.getType())||"Integer".equals(av.getType())||"boolean".equals(av.getType().toLowerCase())||"float".equals(av.getType())||"Float".equals(av.getType())||"double".equals(av.getType())||"Double".equals(av.getType())||"byte".equals(av.getType())||"Byte".equals(av.getType())||"char".equals(av.getType())||"Character".equals(av.getType())||"long".equals(av.getType())||"Long".equals(av.getType())||"short".equals(av.getType())||"Short".equals(av.getType())))
		  {
			  if(av.getIsAutounique() || keys.contains(av.getName())){
				  nameOfPrimitives.addFirst(av.getName());
				  displayedPrimitives.addFirst(gen.translate("getMethod",av)+"()");
			  }
			  else {
				  nameOfPrimitives.addLast(av.getName());
				  displayedPrimitives.addLast(gen.translate("getMethod",av)+"()");
			  }
		  }
		  else if(!av.getIsList()&&!"const".equals(av.getModifier())&&!"internal".equals(av.getModifier()))
		  {
			  if(av.getIsAutounique() || keys.contains(av.getName())){
				  nameOfAttributes.addFirst(av.getName());
				  displayedAttributes.addFirst(gen.translate("getMethod",av)+"()");
			  }
			  else {
				  nameOfAttributes.addLast(av.getName());
				  displayedAttributes.addLast(gen.translate("getMethod",av)+"()");
			  }
		  }
	  }
	  for(AssociationVariable av: uClass.getAssociationVariables())
	  {
	    if(av.isIsNavigable()&&av.getUmpleClass()!=av.getRelatedAssociation().getUmpleClass())
	    {
	      if("1".equals(av.getMultiplicity().getMinimum())||"0".equals(av.getMultiplicity().getMinimum())||"1".equals(av.getMultiplicity().getBound()))
	      {
	        if("1".equals(av.getMultiplicity().getMaximum())||"1".equals(av.getMultiplicity().getBound()))
	        {
	          reflexiveNames.add(av.getName());
	          reflexive.add(gen.translate("getMethod",av)+"()");
		    }
		  }
		}
		  
	  }
	  ret += "super.toString() + \"[\"";
	  boolean firstStr = true;
	  for(int m=0;m<displayedPrimitives.size();m++)
	  {
		  if(firstStr)
			  firstStr = false;
		  else
			  ret += "+ \",\" ";
		  ret += "+\n            \"" + nameOfPrimitives.get(m) + "\" + \":\" + " + displayedPrimitives.get(m); 
	  }
	  ret += "+ \"]\"";
	  for(int m=0;m<displayedAttributes.size();m++)
	  {          
		  ret += " + System.getProperties().getProperty(\"line.separator\") +\n            ";      
		  ret += "\"  \" + " + "\"" + nameOfAttributes.get(m) + "\" + \"=\" + (" + displayedAttributes.get(m) + " != null ? !" + displayedAttributes.get(m) + ".equals(this)  ? " + displayedAttributes.get(m) + ".toString().replaceAll(\"  \",\"    \") : \"this\" : \"null\")";

	  }
	  for(int m=0;m<reflexive.size();m++){
	      ret += " + System.getProperties().getProperty(\"line.separator\") +\n            ";
	      ret += "\"  \" + " +  "\""+reflexiveNames.get(m)+" = \"+("+reflexive.get(m)+"!=null?Integer.toHexString(System.identityHashCode("+reflexive.get(m)+")):\"null\")";
	  }
	  append(realSb,"\n    return {0};", ret);
	  
    realSb.append(TEXT_2480);
    realSb.append(TEXT_2481);
     } 
    realSb.append(TEXT_2482);
    return realSb.toString();
    } 
    private String getAllExtraCode(StringBuilder realSb, UmpleModel model,UmpleClass uClass, GeneratedClass gClass, JavaGenerator gen, boolean isFirst)
  {
    realSb.append(TEXT_2483);
     
  boolean isMainClass = false;
  if (uClass.getExtraCode() != null && uClass.getExtraCode().length() > 0) { 
    realSb.append(TEXT_2484);
    realSb.append(uClass.getExtraCode());
    realSb.append(TEXT_2485);
     } 
    /*trace*/
    if(model.getMainClass() == null || model.getMainClass().getName() != uClass.getName()){
    realSb.append(TEXT_2486);
    }
  return realSb.toString();
}

    /*uncaught_exception*/
    
java.util.regex.Pattern lineNumberPattern = java.util.regex.Pattern.compile("// line ([0|1|2|3|4|5|6|7|8|9]*) \"(.*)\"");
private void addUncaughtExceptionVariables(int javaline, String code, String methodname)
{

  String[] lines = code.split("\\n");
  java.util.regex.Matcher matcher = lineNumberPattern.matcher(lines[0]);
  if(matcher.matches())
  {
    if(!uncaughtExceptions.containsKey(methodname))
    {
      uncaughtExceptions.put(methodname,new UncaughtException(globalUmpleClass.getName(), methodname));
    }
    int fileIndex = matcher.group(2).lastIndexOf('/') + 1;
    uncaughtExceptions.get(methodname).addUncaughtFileName(matcher.group(2).substring(fileIndex));
    uncaughtExceptions.get(methodname).addUncaughtUmpleLine(Integer.parseInt(matcher.group(1)));
    uncaughtExceptions.get(methodname).addUncaughtJavaLine(javaline+1);
    // Subtract two to compensate for the comments at the top and bottom of each inject statement 
    uncaughtExceptions.get(methodname).addUncaughtLength(lines.length-2);
  }  
}
private void addUncaughtExceptionVariables(String methodname, String filename, int umpleline, int javaline, int length)
{
  if(!uncaughtExceptions.containsKey(methodname))
  {
    uncaughtExceptions.put(methodname,new UncaughtException(globalUmpleClass.getName(), methodname));
  }
  
  uncaughtExceptions.get(methodname).addUncaughtFileName(filename);
  uncaughtExceptions.get(methodname).addUncaughtUmpleLine(umpleline-1);
  uncaughtExceptions.get(methodname).addUncaughtJavaLine(javaline+1);
  uncaughtExceptions.get(methodname).addUncaughtLength(length);
}
public String getExceptionHandler(String exceptions, UmpleClass uClass, UmpleModel model) { 
  StringBuilder realSb = new StringBuilder();
  if(model.getMainClass() != null && model.getMainClass().getName() == uClass.getName()){
    realSb.append(TEXT_2487);
    realSb.append(exceptions);
    realSb.append(TEXT_2488);
    
  }
  return realSb.toString();

    }

    /*queued_method*/
    
    public String getQueuedMethodClass(StringBuilder realSb, UmpleModel model, UmpleClass uClass, JavaGenerator gen)
    {
	  boolean hasQueuedMethods = false;
	  ArrayList<Method> methodList = new ArrayList<Method>();
	  if(uClass.hasMethods())
	  {
		for(Method m : uClass.getMethods())
		{
		  if(m.getIsQueued())
		  {
			methodList.add(m);
			hasQueuedMethods = true;
		  }
		}
	  }
	
	  if(hasQueuedMethods)
	  {
		appendln(realSb,"\n  private class QueuedMethodThread implements Runnable");
		appendln(realSb,"  {");
        append(realSb,"\n    QueuedMethodMessageQueue methodQueue;");
        append(realSb,"\n    Thread methodRemoval;");
        append(realSb,"\n    ");
        appendln(realSb,"");
		appendln(realSb,"    public QueuedMethodThread()");
		appendln(realSb,"    {");
		appendln(realSb,"      methodQueue = new QueuedMethodMessageQueue();");
        appendln(realSb,"      methodRemoval = new Thread(this);");
        appendln(realSb,"      //start the thread for queued methods of {0}", uClass.getName());
        appendln(realSb,"      methodRemoval.start();   ");
		appendln(realSb,"    }");
		appendln(realSb,"\n    protected class QueuedMethodMessage");
		appendln(realSb,"    {");
		appendln(realSb,"      QueuedMethod type;"); 
		appendln(realSb,"      ");  
		appendln(realSb,"      //QueuedMethodMessage parameters");
		appendln(realSb,"      Vector<Object> param;"); 
		appendln(realSb,"      ");   
		appendln(realSb,"      public QueuedMethodMessage(QueuedMethod t, Vector<Object> p)");
		appendln(realSb,"      {");
		appendln(realSb,"        type = t; "); 
		appendln(realSb,"        param = p;");
		appendln(realSb,"      }");
		appendln(realSb,"");
		appendln(realSb,"      @Override");
		appendln(realSb,"      public String toString()");
		appendln(realSb,"      {");
		appendln(realSb,"        return type + \",\" + param;");
		appendln(realSb,"      }");
		appendln(realSb,"    }");
		appendln(realSb,"  ");  

		appendln(realSb,"    protected class QueuedMethodMessageQueue {");
		appendln(realSb,"      Queue<QueuedMethodMessage> messages = new LinkedList<QueuedMethodMessage>();");
		appendln(realSb,"      ");   
		appendln(realSb,"      public synchronized void put(QueuedMethodMessage m)");
		appendln(realSb,"      {");
		appendln(realSb,"        messages.add(m); "); 
		appendln(realSb,"        notify();");
		appendln(realSb,"      }");
		appendln(realSb,"");  
		appendln(realSb,"      public synchronized QueuedMethodMessage getNext()");
		appendln(realSb,"      {");
		appendln(realSb,"        try {");
		appendln(realSb,"          while (messages.isEmpty()) "); 
		appendln(realSb,"          {");
		appendln(realSb,"            wait();");
		appendln(realSb,"          }");
		appendln(realSb,"        } catch (InterruptedException e) {");
		appendln(realSb,"          Thread.currentThread().interrupt();");
		appendln(realSb,"          return null;");
		appendln(realSb,"        }");
		appendln(realSb,"");
		appendln(realSb,"        //The element to be removed");
		appendln(realSb,"        QueuedMethodMessage m = messages.remove(); "); 
		appendln(realSb,"        return (m);");
		appendln(realSb,"      }");
		appendln(realSb,"    }");
	
		appendln(realSb,"\n    @Override");
		appendln(realSb,"    public void run ()");
		appendln(realSb,"    {");
		appendln(realSb,"      boolean status=false;");
		appendln(realSb,"      while (true) ");
		appendln(realSb,"      {");
  
		append(realSb,"        QueuedMethodMessage qmm = methodQueue.getNext();");
		append(realSb,"\n        if(qmm == null)  return;");
  
		append(realSb,"\n        switch(qmm.type)");
		append(realSb,"\n        {");
		for(Method m : methodList)
		{
		  append(realSb,"\n          case {0}", m.getName());
		  append(realSb,"_M:");
		  append(realSb,"\n            _{0}(", m.getName());
	
		  //parameters to relay to the function
		  boolean firstParameter = true;
		  int i = 0;
		  for(MethodParameter mp : m.getMethodParameters())
		  {
			if(!firstParameter)  append(realSb, ", ");
			append(realSb,"({0}) qmm.param.elementAt({1})", mp.getFullType(), i);
			firstParameter = false;
			i++;
		  }
	
		  append(realSb,");");
		  append(realSb,"\n            break;");
		}
		append(realSb,"\n          default:");
		append(realSb,"\n        }");
		append(realSb,"\n      }");
		append(realSb,"\n    }");
		append(realSb,"\n    public void putCallTo(QueuedMethodMessage message)");
		append(realSb,"\n    {");
		append(realSb,"\n      methodQueue.put(message);");
		append(realSb,"\n    }");
		appendln(realSb,"");
		append(realSb,"\n    public void delete()");
		append(realSb,"\n    {");
		append(realSb,"\n       methodRemoval.interrupt();");
		append(realSb,"\n    }");
		append(realSb,"\n  }");
	  }
	  return realSb.toString();
    }

    


/* This function is meant purely to properly end the emit code in Umple
   Should never be called
   Only purpose is to make sure the 'if (numSpaces > 0)' part of the template
   Doesn't cause errors */
private StringBuilder endTemplate()
{
  GeneratorHelper.generator = null;
  int numSpaces = 0;
  StringBuilder newCode = null;
  StringBuilder sb = null;
  String spaces = "";


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
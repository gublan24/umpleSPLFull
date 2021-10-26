/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler.java;
import cruise.umple.compiler.*;
import cruise.umple.util.*;
import java.util.*;
import java.util.regex.Pattern;

// line 10 "../../../../../UmpleTLTemplates/JavaSpecGenerator.ump"
public class JavaSpecGenerator implements ILang
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = "/*PLEASE DO NOT EDIT THIS CODE*/" + NL + "/*This code was generated using the UMPLE @UMPLE_VERSION@ modeling language!*/";
  public static final String TEXT_1 = "";
  public static final String TEXT_2 = "  /* Code from template association_set_specialization_reqSuperCode */";
  public static final String TEXT_3 = "//FIXME - FOUND UNKNOWN ASSOCIATION RELATIONSHIP ";
  public static final String TEXT_4 = " : ";
  public static final String TEXT_5 = "  /* Code from template association_IsNumberOfValidMethod_specialization */" + NL;
  public static final String TEXT_6 = "  public boolean ";
  public static final String TEXT_7 = "_";
  public static final String TEXT_8 = "()" + NL + "  {";
  public static final String TEXT_9 = "";
  public static final String TEXT_10 = NL + "    boolean isValid = ";
  public static final String TEXT_11 = "() >= ";
  public static final String TEXT_12 = "_";
  public static final String TEXT_13 = "();";
  public static final String TEXT_14 = NL + "    boolean isValid = ";
  public static final String TEXT_15 = "() >= ";
  public static final String TEXT_16 = "_";
  public static final String TEXT_17 = "() && ";
  public static final String TEXT_18 = "() <= ";
  public static final String TEXT_19 = "_";
  public static final String TEXT_20 = "();";
  public static final String TEXT_21 = "";
  public static final String TEXT_22 = NL + "    return isValid;" + NL + "  }";
  public static final String TEXT_23 = "  /* Code from template association_RequiredNumberOfMethod_specialization */";
  public static final String TEXT_24 = "";
  public static final String TEXT_25 = NL + "  public static int ";
  public static final String TEXT_26 = "_";
  public static final String TEXT_27 = "()" + NL + "  {" + NL + "    return ";
  public static final String TEXT_28 = ";" + NL + "  }";
  public static final String TEXT_29 = NL + "  public static int ";
  public static final String TEXT_30 = "_";
  public static final String TEXT_31 = "()" + NL + "  {";
  public static final String TEXT_32 = NL + "    int required = ";
  public static final String TEXT_33 = ";";
  public static final String TEXT_34 = NL + "    return required;" + NL + "  }";
  public static final String TEXT_35 = "  /* Code from template association_MinimumNumberOfMethod_specialization */";
  public static final String TEXT_36 = "";
  public static final String TEXT_37 = NL + "  public static int ";
  public static final String TEXT_38 = "_";
  public static final String TEXT_39 = "()" + NL + "  {" + NL + "    return ";
  public static final String TEXT_40 = ";" + NL + "  }";
  public static final String TEXT_41 = NL + "  public static int ";
  public static final String TEXT_42 = "_";
  public static final String TEXT_43 = "()" + NL + "  {";
  public static final String TEXT_44 = NL + "    int minimum = ";
  public static final String TEXT_45 = ";";
  public static final String TEXT_46 = NL + "    return minimum;" + NL + "  }";
  public static final String TEXT_47 = "  /* Code from template association_MaximumNumberOfMethod_specialization */";
  public static final String TEXT_48 = "";
  public static final String TEXT_49 = NL + "  public static int ";
  public static final String TEXT_50 = "_";
  public static final String TEXT_51 = "()" + NL + "  {" + NL + "    return ";
  public static final String TEXT_52 = ";" + NL + "  }";
  public static final String TEXT_53 = NL + "  public static int ";
  public static final String TEXT_54 = "_";
  public static final String TEXT_55 = "()" + NL + "  {";
  public static final String TEXT_56 = NL + "    int maximum = ";
  public static final String TEXT_57 = ";";
  public static final String TEXT_58 = NL + "    return maximum;" + NL + "  }";
  public static final String TEXT_59 = "  /* Code from template association_AddManyToManyMethod_specialization */" + NL;
  public static final String TEXT_60 = "  public boolean ";
  public static final String TEXT_61 = "(";
  public static final String TEXT_62 = " ";
  public static final String TEXT_63 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_64 = NL + "    ";
  public static final String TEXT_65 = " ";
  public static final String TEXT_66 = " = ";
  public static final String TEXT_67 = "(";
  public static final String TEXT_68 = "0 ";
  public static final String TEXT_69 = ");";
  public static final String TEXT_70 = NL + "   List<";
  public static final String TEXT_71 = "> ";
  public static final String TEXT_72 = " = ";
  public static final String TEXT_73 = "_";
  public static final String TEXT_74 = "(); ";
  public static final String TEXT_75 = "";
  public static final String TEXT_76 = "";
  public static final String TEXT_77 = NL + "    if (";
  public static final String TEXT_78 = "() >= ";
  public static final String TEXT_79 = "_";
  public static final String TEXT_80 = "())" + NL + "    {";
  public static final String TEXT_81 = NL + "      return wasAdded;" + NL + "    }";
  public static final String TEXT_82 = NL + "    wasAdded = super.";
  public static final String TEXT_83 = "(";
  public static final String TEXT_84 = ");" + NL;
  public static final String TEXT_85 = NL + "    return wasAdded;" + NL + "  }";
  public static final String TEXT_86 = "  /* Code from template association_AddMandatoryManyToOne_specialization */" + NL;
  public static final String TEXT_87 = "  public boolean ";
  public static final String TEXT_88 = "(";
  public static final String TEXT_89 = " ";
  public static final String TEXT_90 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_91 = NL + "    List<";
  public static final String TEXT_92 = "> ";
  public static final String TEXT_93 = " = ";
  public static final String TEXT_94 = "_";
  public static final String TEXT_95 = "();";
  public static final String TEXT_96 = "";
  public static final String TEXT_97 = NL + "    ";
  public static final String TEXT_98 = " ";
  public static final String TEXT_99 = " = ";
  public static final String TEXT_100 = ".";
  public static final String TEXT_101 = "_One";
  public static final String TEXT_102 = "();" + NL + "    boolean ";
  public static final String TEXT_103 = " = ";
  public static final String TEXT_104 = " != null && !this.equals(";
  public static final String TEXT_105 = ");" + NL + NL + "    if (";
  public static final String TEXT_106 = " && ";
  public static final String TEXT_107 = ".";
  public static final String TEXT_108 = "() <= ";
  public static final String TEXT_109 = "_";
  public static final String TEXT_110 = "())" + NL + "    {" + NL + "      return wasAdded;" + NL + "    }" + NL + NL + "    wasAdded = super.";
  public static final String TEXT_111 = "(";
  public static final String TEXT_112 = ");";
  public static final String TEXT_113 = NL + "    return wasAdded;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_114 = "(";
  public static final String TEXT_115 = " ";
  public static final String TEXT_116 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_117 = NL + "    List<";
  public static final String TEXT_118 = "> ";
  public static final String TEXT_119 = " = ";
  public static final String TEXT_120 = "_";
  public static final String TEXT_121 = "(); ";
  public static final String TEXT_122 = "";
  public static final String TEXT_123 = NL + "    //Unable to remove ";
  public static final String TEXT_124 = ", as it must always have a ";
  public static final String TEXT_125 = NL + "    if (this.equals(";
  public static final String TEXT_126 = ".";
  public static final String TEXT_127 = "()))" + NL + "    {";
  public static final String TEXT_128 = NL + "      return wasRemoved;" + NL + "    }" + NL + NL + "    //";
  public static final String TEXT_129 = " already at minimum (";
  public static final String TEXT_130 = ")" + NL + "    if (";
  public static final String TEXT_131 = "() <= ";
  public static final String TEXT_132 = "_";
  public static final String TEXT_133 = "())" + NL + "    {";
  public static final String TEXT_134 = NL + "      return wasRemoved;" + NL + "    }";
  public static final String TEXT_135 = NL + NL + "    wasRemoved = super.";
  public static final String TEXT_136 = "(";
  public static final String TEXT_137 = ");";
  public static final String TEXT_138 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_139 = "  /* Code from template association_AddMNToOnlyOne_specialization */" + NL;
  public static final String TEXT_140 = "  public ";
  public static final String TEXT_141 = " ";
  public static final String TEXT_142 = "(";
  public static final String TEXT_143 = ")" + NL + "  {" + NL + "    if (";
  public static final String TEXT_144 = "() >= ";
  public static final String TEXT_145 = "_";
  public static final String TEXT_146 = "())" + NL + "    {" + NL + "      return null;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      return new ";
  public static final String TEXT_147 = "(";
  public static final String TEXT_148 = ");" + NL + "    }" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_149 = "(";
  public static final String TEXT_150 = " ";
  public static final String TEXT_151 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_152 = NL + "    List<";
  public static final String TEXT_153 = "> ";
  public static final String TEXT_154 = " = ";
  public static final String TEXT_155 = "_";
  public static final String TEXT_156 = "();";
  public static final String TEXT_157 = "";
  public static final String TEXT_158 = NL + "    if (";
  public static final String TEXT_159 = "() >= ";
  public static final String TEXT_160 = "_";
  public static final String TEXT_161 = "())" + NL + "    {";
  public static final String TEXT_162 = NL + "      return wasAdded;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_163 = " ";
  public static final String TEXT_164 = " = ";
  public static final String TEXT_165 = ".";
  public static final String TEXT_166 = "_One";
  public static final String TEXT_167 = "();" + NL + "    boolean ";
  public static final String TEXT_168 = " = ";
  public static final String TEXT_169 = " != null && !this.equals(";
  public static final String TEXT_170 = ");" + NL + NL + "    if (";
  public static final String TEXT_171 = " && ";
  public static final String TEXT_172 = ".";
  public static final String TEXT_173 = "() <= ";
  public static final String TEXT_174 = "_";
  public static final String TEXT_175 = "())" + NL + "    {";
  public static final String TEXT_176 = NL + "      return wasAdded;" + NL + "    }";
  public static final String TEXT_177 = NL + NL + "    wasAdded = super.";
  public static final String TEXT_178 = "(";
  public static final String TEXT_179 = ");";
  public static final String TEXT_180 = NL + "    return wasAdded;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_181 = "(";
  public static final String TEXT_182 = " ";
  public static final String TEXT_183 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_184 = NL + "    List<";
  public static final String TEXT_185 = "> ";
  public static final String TEXT_186 = " = ";
  public static final String TEXT_187 = "_";
  public static final String TEXT_188 = "(); ";
  public static final String TEXT_189 = "";
  public static final String TEXT_190 = NL + "    //Unable to remove ";
  public static final String TEXT_191 = ", as it must always have a ";
  public static final String TEXT_192 = NL + "    if (this.equals(";
  public static final String TEXT_193 = ".";
  public static final String TEXT_194 = "()))" + NL + "    {";
  public static final String TEXT_195 = NL + "      return wasRemoved;" + NL + "    }" + NL + NL + "    //";
  public static final String TEXT_196 = " already at minimum (";
  public static final String TEXT_197 = ")" + NL + "    if (";
  public static final String TEXT_198 = "() <= ";
  public static final String TEXT_199 = "_";
  public static final String TEXT_200 = "())" + NL + "    {";
  public static final String TEXT_201 = NL + "      return wasRemoved;" + NL + "    }";
  public static final String TEXT_202 = NL + "    " + NL + "    wasRemoved = super.";
  public static final String TEXT_203 = "(";
  public static final String TEXT_204 = ");";
  public static final String TEXT_205 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_206 = "  /* Code from template association_AddOptionalNToOne_specialization */" + NL;
  public static final String TEXT_207 = "  public ";
  public static final String TEXT_208 = " ";
  public static final String TEXT_209 = "(";
  public static final String TEXT_210 = ")" + NL + "  {" + NL + "    if (";
  public static final String TEXT_211 = "() >= ";
  public static final String TEXT_212 = "_";
  public static final String TEXT_213 = "())" + NL + "    {" + NL + "      return null;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      return new ";
  public static final String TEXT_214 = "(";
  public static final String TEXT_215 = ");" + NL + "    }" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_216 = "(";
  public static final String TEXT_217 = " ";
  public static final String TEXT_218 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_219 = NL + "    List<";
  public static final String TEXT_220 = "> ";
  public static final String TEXT_221 = " = ";
  public static final String TEXT_222 = "_";
  public static final String TEXT_223 = "();";
  public static final String TEXT_224 = "";
  public static final String TEXT_225 = NL + "    if (";
  public static final String TEXT_226 = "() >= ";
  public static final String TEXT_227 = "_";
  public static final String TEXT_228 = "())" + NL + "    {";
  public static final String TEXT_229 = NL + "      return wasAdded;" + NL + "    }" + NL + NL + "    wasAdded = super.";
  public static final String TEXT_230 = "(";
  public static final String TEXT_231 = ");";
  public static final String TEXT_232 = NL + "    return wasAdded;" + NL + "  }";
  public static final String TEXT_233 = "  /* Code from template association_SetOptionalNToMany_specialization */" + NL;
  public static final String TEXT_234 = "  public boolean ";
  public static final String TEXT_235 = "(";
  public static final String TEXT_236 = "... ";
  public static final String TEXT_237 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_238 = NL + "    ArrayList<";
  public static final String TEXT_239 = "> ";
  public static final String TEXT_240 = " = new ArrayList<";
  public static final String TEXT_241 = ">();" + NL + "    for (";
  public static final String TEXT_242 = " ";
  public static final String TEXT_243 = " : ";
  public static final String TEXT_244 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_245 = ".contains(";
  public static final String TEXT_246 = "))" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      ";
  public static final String TEXT_247 = ".add(";
  public static final String TEXT_248 = ");" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_249 = ".size() != ";
  public static final String TEXT_250 = ".length || ";
  public static final String TEXT_251 = ".size() > ";
  public static final String TEXT_252 = "_";
  public static final String TEXT_253 = "())" + NL + "    {";
  public static final String TEXT_254 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    wasSet = super.";
  public static final String TEXT_255 = "(";
  public static final String TEXT_256 = ");";
  public static final String TEXT_257 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_258 = "  /* Code from template association_AddManyToOne_specialization */" + NL;
  public static final String TEXT_259 = "  public ";
  public static final String TEXT_260 = " ";
  public static final String TEXT_261 = "(";
  public static final String TEXT_262 = ")" + NL + "  {" + NL + "    // need to keep this because of the type differences between sub & super classes" + NL + "    return new ";
  public static final String TEXT_263 = "(";
  public static final String TEXT_264 = ");" + NL + "  }";
  public static final String TEXT_265 = "  /* Code from template association_AddMNToMany_specialization */" + NL;
  public static final String TEXT_266 = "  public boolean ";
  public static final String TEXT_267 = "(";
  public static final String TEXT_268 = " ";
  public static final String TEXT_269 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_270 = NL + "    List<";
  public static final String TEXT_271 = "> ";
  public static final String TEXT_272 = " = ";
  public static final String TEXT_273 = "_";
  public static final String TEXT_274 = "();";
  public static final String TEXT_275 = "";
  public static final String TEXT_276 = NL + NL + "    if (";
  public static final String TEXT_277 = "() <= ";
  public static final String TEXT_278 = "_";
  public static final String TEXT_279 = "())" + NL + "    {";
  public static final String TEXT_280 = NL + "      return wasRemoved;" + NL + "    }" + NL + NL + "    wasRemoved = super.";
  public static final String TEXT_281 = "(";
  public static final String TEXT_282 = ");" + NL;
  public static final String TEXT_283 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_284 = "  /* Code from template association_AddMStarToMany_specialization */" + NL;
  public static final String TEXT_285 = "  public boolean ";
  public static final String TEXT_286 = "(";
  public static final String TEXT_287 = " ";
  public static final String TEXT_288 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_289 = NL + "    List<";
  public static final String TEXT_290 = "> ";
  public static final String TEXT_291 = " = ";
  public static final String TEXT_292 = "_";
  public static final String TEXT_293 = "();";
  public static final String TEXT_294 = "";
  public static final String TEXT_295 = NL + NL + "    if (";
  public static final String TEXT_296 = "() <= ";
  public static final String TEXT_297 = "_";
  public static final String TEXT_298 = "())" + NL + "    {";
  public static final String TEXT_299 = NL + "      return wasRemoved;" + NL + "    }" + NL + NL + "    wasRemoved = super.";
  public static final String TEXT_300 = "(";
  public static final String TEXT_301 = ");" + NL;
  public static final String TEXT_302 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_303 = "  /* Code from template association_SetOptionalOneToOptionalN_specialization */" + NL;
  public static final String TEXT_304 = "  public boolean ";
  public static final String TEXT_305 = "(";
  public static final String TEXT_306 = " ";
  public static final String TEXT_307 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_308 = NL + "    if (";
  public static final String TEXT_309 = " != null && ";
  public static final String TEXT_310 = ".";
  public static final String TEXT_311 = "() >= ";
  public static final String TEXT_312 = ".";
  public static final String TEXT_313 = "_";
  public static final String TEXT_314 = "())" + NL + "    {";
  public static final String TEXT_315 = NL + "      return wasSet;" + NL + "    }" + NL;
  public static final String TEXT_316 = NL + "    wasSet = super.";
  public static final String TEXT_317 = "(";
  public static final String TEXT_318 = ");";
  public static final String TEXT_319 = NL + "    super.clear_";
  public static final String TEXT_320 = "();" + NL + "    wasSet = ";
  public static final String TEXT_321 = "(";
  public static final String TEXT_322 = ");";
  public static final String TEXT_323 = "";
  public static final String TEXT_324 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_325 = "  /* Code from template association_SetOneToMany_specialization */" + NL;
  public static final String TEXT_326 = "  public boolean ";
  public static final String TEXT_327 = "(";
  public static final String TEXT_328 = " ";
  public static final String TEXT_329 = ")" + NL + "  {" + NL + "    boolean wasSet = false;" + NL + "    ";
  public static final String TEXT_330 = " ";
  public static final String TEXT_331 = " = ";
  public static final String TEXT_332 = "_One";
  public static final String TEXT_333 = "();";
  public static final String TEXT_334 = NL + "    if (";
  public static final String TEXT_335 = " == null)" + NL + "    {";
  public static final String TEXT_336 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_337 = " ";
  public static final String TEXT_338 = " = ";
  public static final String TEXT_339 = ";" + NL + "    ";
  public static final String TEXT_340 = " = ";
  public static final String TEXT_341 = ";" + NL + "    if (";
  public static final String TEXT_342 = " != null && !";
  public static final String TEXT_343 = ".equals(";
  public static final String TEXT_344 = "))" + NL + "    {" + NL + "      ";
  public static final String TEXT_345 = ".";
  public static final String TEXT_346 = "(this);" + NL + "    }" + NL + "    ";
  public static final String TEXT_347 = ".";
  public static final String TEXT_348 = "(this);" + NL + "    wasSet = true;";
  public static final String TEXT_349 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_350 = "  /* Code from template association_SetOneToAtMostN_specialization */" + NL;
  public static final String TEXT_351 = "  public boolean ";
  public static final String TEXT_352 = "(";
  public static final String TEXT_353 = " ";
  public static final String TEXT_354 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_355 = NL + "    //Must provide ";
  public static final String TEXT_356 = " to ";
  public static final String TEXT_357 = NL + "    if (";
  public static final String TEXT_358 = " == null)" + NL + "    {";
  public static final String TEXT_359 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    //";
  public static final String TEXT_360 = " already at maximum (";
  public static final String TEXT_361 = ")" + NL + "    if (";
  public static final String TEXT_362 = ".";
  public static final String TEXT_363 = "() >= ";
  public static final String TEXT_364 = ".";
  public static final String TEXT_365 = "_";
  public static final String TEXT_366 = "())" + NL + "    {";
  public static final String TEXT_367 = NL + "      return wasSet;" + NL + "    }" + NL;
  public static final String TEXT_368 = NL + "    wasSet = super.";
  public static final String TEXT_369 = "(";
  public static final String TEXT_370 = ");";
  public static final String TEXT_371 = NL + "    super.clear_";
  public static final String TEXT_372 = "();" + NL + "    wasSet = ";
  public static final String TEXT_373 = "(";
  public static final String TEXT_374 = ");";
  public static final String TEXT_375 = "";
  public static final String TEXT_376 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_377 = "  /* Code from template association_SetOneToMandatoryMany_specialization */" + NL;
  public static final String TEXT_378 = "  public boolean ";
  public static final String TEXT_379 = "(";
  public static final String TEXT_380 = " ";
  public static final String TEXT_381 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_382 = NL + "    //Must provide ";
  public static final String TEXT_383 = " to ";
  public static final String TEXT_384 = NL + "    if (";
  public static final String TEXT_385 = " == null)" + NL + "    {";
  public static final String TEXT_386 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_387 = "_One";
  public static final String TEXT_388 = "() != null && ";
  public static final String TEXT_389 = "_One";
  public static final String TEXT_390 = "().";
  public static final String TEXT_391 = "() <= ";
  public static final String TEXT_392 = ".";
  public static final String TEXT_393 = "_";
  public static final String TEXT_394 = "())" + NL + "    {";
  public static final String TEXT_395 = NL + "      return wasSet;" + NL + "    }" + NL;
  public static final String TEXT_396 = NL + "    wasSet = super.";
  public static final String TEXT_397 = "(";
  public static final String TEXT_398 = ");";
  public static final String TEXT_399 = NL + "    super.clear_";
  public static final String TEXT_400 = "();" + NL + "    wasSet = ";
  public static final String TEXT_401 = "(";
  public static final String TEXT_402 = ");";
  public static final String TEXT_403 = "";
  public static final String TEXT_404 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_405 = "  /* Code from template association_AddManyToOptionalOne_specialization */" + NL;
  public static final String TEXT_406 = "  public boolean ";
  public static final String TEXT_407 = "(";
  public static final String TEXT_408 = " ";
  public static final String TEXT_409 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_410 = NL + "    List<";
  public static final String TEXT_411 = "> ";
  public static final String TEXT_412 = " = ";
  public static final String TEXT_413 = "_";
  public static final String TEXT_414 = "();";
  public static final String TEXT_415 = "";
  public static final String TEXT_416 = NL + "    ";
  public static final String TEXT_417 = " ";
  public static final String TEXT_418 = " = ";
  public static final String TEXT_419 = ".";
  public static final String TEXT_420 = "_";
  public static final String TEXT_421 = "One";
  public static final String TEXT_422 = "();";
  public static final String TEXT_423 = NL + "    if (";
  public static final String TEXT_424 = " == null)" + NL + "    {";
  public static final String TEXT_425 = NL + "      ";
  public static final String TEXT_426 = ".";
  public static final String TEXT_427 = "(this);";
  public static final String TEXT_428 = NL + "      ";
  public static final String TEXT_429 = ".clear_";
  public static final String TEXT_430 = "();" + NL + "      ";
  public static final String TEXT_431 = ".";
  public static final String TEXT_432 = "(this);";
  public static final String TEXT_433 = NL + "    }" + NL + "    else if (!this.equals(";
  public static final String TEXT_434 = "))" + NL + "    {" + NL + "      ";
  public static final String TEXT_435 = ".";
  public static final String TEXT_436 = "(";
  public static final String TEXT_437 = ");" + NL + "      ";
  public static final String TEXT_438 = "(";
  public static final String TEXT_439 = ");" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      ";
  public static final String TEXT_440 = ".add(";
  public static final String TEXT_441 = ");" + NL + "    }";
  public static final String TEXT_442 = NL + "    wasAdded = true;";
  public static final String TEXT_443 = NL + "    return wasAdded;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_444 = "(";
  public static final String TEXT_445 = " ";
  public static final String TEXT_446 = ")a" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_447 = NL + "    List<";
  public static final String TEXT_448 = "> ";
  public static final String TEXT_449 = " = ";
  public static final String TEXT_450 = "_";
  public static final String TEXT_451 = "(); ";
  public static final String TEXT_452 = "";
  public static final String TEXT_453 = NL + "    if (";
  public static final String TEXT_454 = "_One";
  public static final String TEXT_455 = ".contains(";
  public static final String TEXT_456 = "))" + NL + "    {";
  public static final String TEXT_457 = NL + "      ";
  public static final String TEXT_458 = ".remove(";
  public static final String TEXT_459 = ");" + NL + "      ";
  public static final String TEXT_460 = ".";
  public static final String TEXT_461 = "(null);" + NL + "      wasRemoved = true;";
  public static final String TEXT_462 = NL + "    }";
  public static final String TEXT_463 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_464 = "  /* Code from template association_AddOptionalNToOptionalOne_specialization */" + NL;
  public static final String TEXT_465 = "  public boolean ";
  public static final String TEXT_466 = "(";
  public static final String TEXT_467 = " ";
  public static final String TEXT_468 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_469 = NL + "    List<";
  public static final String TEXT_470 = "> ";
  public static final String TEXT_471 = " = ";
  public static final String TEXT_472 = "_";
  public static final String TEXT_473 = "();";
  public static final String TEXT_474 = "";
  public static final String TEXT_475 = NL + "    if (";
  public static final String TEXT_476 = "() >= ";
  public static final String TEXT_477 = "_";
  public static final String TEXT_478 = "())" + NL + "    {";
  public static final String TEXT_479 = NL + "      return wasAdded;" + NL + "    }" + NL + NL + "    wasAdded = super.";
  public static final String TEXT_480 = "(";
  public static final String TEXT_481 = ");";
  public static final String TEXT_482 = NL + "    return wasAdded;" + NL + "  }";
  public static final String TEXT_483 = "  /* Code from template association_AddUnidirectionalMN_specialization */" + NL;
  public static final String TEXT_484 = "  public boolean ";
  public static final String TEXT_485 = "(";
  public static final String TEXT_486 = " ";
  public static final String TEXT_487 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_488 = NL + "    List<";
  public static final String TEXT_489 = "> ";
  public static final String TEXT_490 = " = ";
  public static final String TEXT_491 = "_";
  public static final String TEXT_492 = "();";
  public static final String TEXT_493 = "";
  public static final String TEXT_494 = NL + "    if (";
  public static final String TEXT_495 = "() < ";
  public static final String TEXT_496 = "_";
  public static final String TEXT_497 = "())" + NL + "    {";
  public static final String TEXT_498 = NL + "      wasAdded = super.";
  public static final String TEXT_499 = "(";
  public static final String TEXT_500 = ");";
  public static final String TEXT_501 = NL + "    }";
  public static final String TEXT_502 = NL + "    return wasAdded;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_503 = "(";
  public static final String TEXT_504 = " ";
  public static final String TEXT_505 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_506 = NL + NL + "    if (";
  public static final String TEXT_507 = "() <= ";
  public static final String TEXT_508 = "_";
  public static final String TEXT_509 = "())" + NL + "    {";
  public static final String TEXT_510 = NL + "      return wasRemoved;" + NL + "    }";
  public static final String TEXT_511 = NL + NL + "    wasRemoved = super.";
  public static final String TEXT_512 = "(";
  public static final String TEXT_513 = ");";
  public static final String TEXT_514 = "";
  public static final String TEXT_515 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_516 = "  /* Code from template association_AddMNToOptionalOne_specialization */" + NL;
  public static final String TEXT_517 = "  public boolean ";
  public static final String TEXT_518 = "(";
  public static final String TEXT_519 = " ";
  public static final String TEXT_520 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_521 = NL + "    List<";
  public static final String TEXT_522 = "> ";
  public static final String TEXT_523 = " = ";
  public static final String TEXT_524 = "_";
  public static final String TEXT_525 = "();";
  public static final String TEXT_526 = "";
  public static final String TEXT_527 = "";
  public static final String TEXT_528 = NL + "    if (";
  public static final String TEXT_529 = "() >= ";
  public static final String TEXT_530 = "_";
  public static final String TEXT_531 = "())" + NL + "    {";
  public static final String TEXT_532 = NL + "      return wasAdded;" + NL + "    }";
  public static final String TEXT_533 = NL + "    ";
  public static final String TEXT_534 = " ";
  public static final String TEXT_535 = " = ";
  public static final String TEXT_536 = ".";
  public static final String TEXT_537 = "_One";
  public static final String TEXT_538 = "();" + NL + "    if (";
  public static final String TEXT_539 = " != null && ";
  public static final String TEXT_540 = ".";
  public static final String TEXT_541 = "() <= ";
  public static final String TEXT_542 = "_";
  public static final String TEXT_543 = "())" + NL + "    {";
  public static final String TEXT_544 = NL + "      return wasAdded;" + NL + "    }";
  public static final String TEXT_545 = "";
  public static final String TEXT_546 = NL + "    wasAdded = super.";
  public static final String TEXT_547 = "(";
  public static final String TEXT_548 = ");";
  public static final String TEXT_549 = NL + "    return wasAdded;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_550 = "(";
  public static final String TEXT_551 = " ";
  public static final String TEXT_552 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_553 = NL + "    if (";
  public static final String TEXT_554 = "() > ";
  public static final String TEXT_555 = "_";
  public static final String TEXT_556 = "())" + NL + "    {";
  public static final String TEXT_557 = "";
  public static final String TEXT_558 = NL + "      wasRemoved = super.";
  public static final String TEXT_559 = "(";
  public static final String TEXT_560 = ");" + NL + "    }";
  public static final String TEXT_561 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_562 = "  /* Code from template association_SetNToOptionalOne_specialization */" + NL;
  public static final String TEXT_563 = "  public boolean ";
  public static final String TEXT_564 = "(";
  public static final String TEXT_565 = "... ";
  public static final String TEXT_566 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_567 = NL + "    ArrayList<";
  public static final String TEXT_568 = "> ";
  public static final String TEXT_569 = " = new ArrayList<";
  public static final String TEXT_570 = ">();" + NL + "    for (";
  public static final String TEXT_571 = " ";
  public static final String TEXT_572 = " : ";
  public static final String TEXT_573 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_574 = ".contains(";
  public static final String TEXT_575 = "))" + NL + "      {";
  public static final String TEXT_576 = NL + "        return wasSet;" + NL + "      }" + NL + "      else if (";
  public static final String TEXT_577 = ".";
  public static final String TEXT_578 = "() != null && !this.equals(";
  public static final String TEXT_579 = ".";
  public static final String TEXT_580 = "()))" + NL + "      {";
  public static final String TEXT_581 = NL + "        return wasSet;" + NL + "      }" + NL + "      ";
  public static final String TEXT_582 = ".add(";
  public static final String TEXT_583 = ");" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_584 = ".size() != ";
  public static final String TEXT_585 = "_";
  public static final String TEXT_586 = "())" + NL + "    {";
  public static final String TEXT_587 = NL + "      return wasSet;" + NL + "    }" + NL;
  public static final String TEXT_588 = NL + "    wasSet = super.";
  public static final String TEXT_589 = "(";
  public static final String TEXT_590 = ");";
  public static final String TEXT_591 = NL + "    super.clear_";
  public static final String TEXT_592 = "();" + NL + "    for ( ";
  public static final String TEXT_593 = " orphan : ";
  public static final String TEXT_594 = " )" + NL + "    {" + NL + "      ";
  public static final String TEXT_595 = "(orphan);" + NL + "    }" + NL + "    wasSet = true;";
  public static final String TEXT_596 = "";
  public static final String TEXT_597 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_598 = "  /* Code from template association_GetPrivate */" + NL;
  public static final String TEXT_599 = "  private void ";
  public static final String TEXT_600 = "(";
  public static final String TEXT_601 = " ";
  public static final String TEXT_602 = ", ";
  public static final String TEXT_603 = " ";
  public static final String TEXT_604 = ")" + NL + "  {" + NL + "    try" + NL + "    {" + NL + "      java.lang.reflect.Field mentorField = ";
  public static final String TEXT_605 = ".getClass().getDeclaredField(\"";
  public static final String TEXT_606 = "\");" + NL + "      mentorField.setAccessible(true);" + NL + "      mentorField.set(";
  public static final String TEXT_607 = ", ";
  public static final String TEXT_608 = ");" + NL + "    }" + NL + "    catch (Exception e)" + NL + "    {" + NL + "      throw new RuntimeException(\"Issue internally setting ";
  public static final String TEXT_609 = " to ";
  public static final String TEXT_610 = "\", e);" + NL + "    }" + NL + "  }" + NL;
  public static final String TEXT_611 = "  /* Code from template association_AddUnidirectionalMany_specialization */" + NL;
  public static final String TEXT_612 = "  public boolean ";
  public static final String TEXT_613 = "(";
  public static final String TEXT_614 = " ";
  public static final String TEXT_615 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_616 = NL + "    List<";
  public static final String TEXT_617 = "> ";
  public static final String TEXT_618 = " = ";
  public static final String TEXT_619 = "_";
  public static final String TEXT_620 = "();";
  public static final String TEXT_621 = "";
  public static final String TEXT_622 = NL + "    if (";
  public static final String TEXT_623 = "().contains(";
  public static final String TEXT_624 = "))" + NL + "    {";
  public static final String TEXT_625 = NL + "      wasRemoved = super.";
  public static final String TEXT_626 = "(";
  public static final String TEXT_627 = ");";
  public static final String TEXT_628 = NL + "    }";
  public static final String TEXT_629 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_630 = "  /* Code from template association_AddUnidirectionalOptionalN_specialization */" + NL;
  public static final String TEXT_631 = "  public boolean ";
  public static final String TEXT_632 = "(";
  public static final String TEXT_633 = " ";
  public static final String TEXT_634 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_635 = NL + "    List<";
  public static final String TEXT_636 = "> ";
  public static final String TEXT_637 = " = ";
  public static final String TEXT_638 = "_";
  public static final String TEXT_639 = "();";
  public static final String TEXT_640 = "";
  public static final String TEXT_641 = NL + "    if (";
  public static final String TEXT_642 = "() < ";
  public static final String TEXT_643 = "_";
  public static final String TEXT_644 = "())" + NL + "    {";
  public static final String TEXT_645 = NL + "      wasAdded = super.";
  public static final String TEXT_646 = "(";
  public static final String TEXT_647 = ");";
  public static final String TEXT_648 = NL + "    }";
  public static final String TEXT_649 = NL + "    return wasAdded;" + NL + "  }" + NL;
  public static final String TEXT_650 = "  /* Code from template association_SetUnidirectionalN_specialization */";
  public static final String TEXT_651 = NL + "  ";
  public static final String TEXT_652 = " boolean ";
  public static final String TEXT_653 = "(";
  public static final String TEXT_654 = "... ";
  public static final String TEXT_655 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_656 = NL + "    ArrayList<";
  public static final String TEXT_657 = "> ";
  public static final String TEXT_658 = " = new ArrayList<";
  public static final String TEXT_659 = ">();" + NL + "    for (";
  public static final String TEXT_660 = " ";
  public static final String TEXT_661 = " : ";
  public static final String TEXT_662 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_663 = ".contains(";
  public static final String TEXT_664 = "))" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      ";
  public static final String TEXT_665 = ".add(";
  public static final String TEXT_666 = ");" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_667 = ".size() != ";
  public static final String TEXT_668 = ".length || ";
  public static final String TEXT_669 = ".size() != ";
  public static final String TEXT_670 = "_";
  public static final String TEXT_671 = "())" + NL + "    {";
  public static final String TEXT_672 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    wasSet = super.";
  public static final String TEXT_673 = "(";
  public static final String TEXT_674 = ");";
  public static final String TEXT_675 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_676 = "  /* Code from template association_SetUnidirectionalMany_specialization */";
  public static final String TEXT_677 = NL + "  ";
  public static final String TEXT_678 = " boolean ";
  public static final String TEXT_679 = "(";
  public static final String TEXT_680 = "... ";
  public static final String TEXT_681 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_682 = NL + "    ArrayList<";
  public static final String TEXT_683 = "> ";
  public static final String TEXT_684 = " = new ArrayList<";
  public static final String TEXT_685 = ">();" + NL + "    for (";
  public static final String TEXT_686 = " ";
  public static final String TEXT_687 = " : ";
  public static final String TEXT_688 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_689 = ".contains(";
  public static final String TEXT_690 = "))" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      ";
  public static final String TEXT_691 = ".add(";
  public static final String TEXT_692 = ");" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_693 = ".size() != ";
  public static final String TEXT_694 = ".length)" + NL + "    {";
  public static final String TEXT_695 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    wasSet = super.";
  public static final String TEXT_696 = "(";
  public static final String TEXT_697 = ");";
  public static final String TEXT_698 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_699 = "  /* Code from template association_SetOptionalOneToMandatoryMany_specialization */" + NL;
  public static final String TEXT_700 = "  public boolean ";
  public static final String TEXT_701 = "(";
  public static final String TEXT_702 = " ";
  public static final String TEXT_703 = ")" + NL + "  {" + NL + "    //" + NL + "    // This source of this source generation is association_SetOptionalOneToMandatoryMany.jet" + NL + "    // This set file assumes the generation of a maximumNumberOfXXX method does not exist because " + NL + "    // it's not required (No upper bound)" + NL + "    //   " + NL + "    boolean wasSet = false;" + NL + "    ";
  public static final String TEXT_704 = " ";
  public static final String TEXT_705 = " = ";
  public static final String TEXT_706 = "_One";
  public static final String TEXT_707 = "();" + NL + NL + "    if (";
  public static final String TEXT_708 = " == null)" + NL + "    {" + NL + "      if (";
  public static final String TEXT_709 = " != null)" + NL + "      {" + NL + "        if (";
  public static final String TEXT_710 = ".";
  public static final String TEXT_711 = "(this))" + NL + "        {";
  public static final String TEXT_712 = NL + "          wasSet = super.";
  public static final String TEXT_713 = "(";
  public static final String TEXT_714 = ");";
  public static final String TEXT_715 = NL + "          super.clear_";
  public static final String TEXT_716 = "();" + NL + "          wasSet = ";
  public static final String TEXT_717 = "(";
  public static final String TEXT_718 = ");";
  public static final String TEXT_719 = NL + "        }" + NL + "      }" + NL + "    } " + NL + "    else if (";
  public static final String TEXT_720 = " != null)" + NL + "    {" + NL + "      if (";
  public static final String TEXT_721 = " == null)" + NL + "      {" + NL + "        if (";
  public static final String TEXT_722 = ".";
  public static final String TEXT_723 = "_";
  public static final String TEXT_724 = "() < ";
  public static final String TEXT_725 = ".";
  public static final String TEXT_726 = "())" + NL + "        {";
  public static final String TEXT_727 = NL + "          wasSet = super.";
  public static final String TEXT_728 = "(";
  public static final String TEXT_729 = ");";
  public static final String TEXT_730 = NL + "          super.clear_";
  public static final String TEXT_731 = "();" + NL + "          wasSet = ";
  public static final String TEXT_732 = "(";
  public static final String TEXT_733 = ");";
  public static final String TEXT_734 = NL + "        }" + NL + "      } " + NL + "      else" + NL + "      {" + NL + "        if (";
  public static final String TEXT_735 = ".";
  public static final String TEXT_736 = "_";
  public static final String TEXT_737 = "() < ";
  public static final String TEXT_738 = ".";
  public static final String TEXT_739 = "())" + NL + "        {";
  public static final String TEXT_740 = NL + "          wasSet = super.";
  public static final String TEXT_741 = "(";
  public static final String TEXT_742 = ");";
  public static final String TEXT_743 = NL + "          super.clear_";
  public static final String TEXT_744 = "();" + NL + "          wasSet = ";
  public static final String TEXT_745 = "(";
  public static final String TEXT_746 = ");";
  public static final String TEXT_747 = NL + "        }" + NL + "      }" + NL + "    }" + NL + "    return wasSet;" + NL + "  }" + NL + "  ";
  public static final String TEXT_748 = "  /* Code from template association_SetMNToMany_specialization */" + NL;
  public static final String TEXT_749 = "  public boolean ";
  public static final String TEXT_750 = "(";
  public static final String TEXT_751 = "... ";
  public static final String TEXT_752 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_753 = NL + "    ArrayList<";
  public static final String TEXT_754 = "> ";
  public static final String TEXT_755 = " = new ArrayList<";
  public static final String TEXT_756 = ">();" + NL + "    for (";
  public static final String TEXT_757 = " ";
  public static final String TEXT_758 = " : ";
  public static final String TEXT_759 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_760 = ".contains(";
  public static final String TEXT_761 = "))" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      ";
  public static final String TEXT_762 = ".add(";
  public static final String TEXT_763 = ");" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_764 = ".size() != ";
  public static final String TEXT_765 = ".length || ";
  public static final String TEXT_766 = ".size() < ";
  public static final String TEXT_767 = "_";
  public static final String TEXT_768 = "() || ";
  public static final String TEXT_769 = ".size() > ";
  public static final String TEXT_770 = "_";
  public static final String TEXT_771 = "())" + NL + "    {";
  public static final String TEXT_772 = NL + "      return wasSet;" + NL + "    }" + NL;
  public static final String TEXT_773 = NL + "    wasSet = super.";
  public static final String TEXT_774 = "(";
  public static final String TEXT_775 = ");";
  public static final String TEXT_776 = NL + "    super.clear_";
  public static final String TEXT_777 = "();" + NL + "    for ( ";
  public static final String TEXT_778 = " orphan : ";
  public static final String TEXT_779 = ")" + NL + "    {" + NL + "      ";
  public static final String TEXT_780 = "(orphan);" + NL + "    }" + NL + "    wasSet = true;";
  public static final String TEXT_781 = "";
  public static final String TEXT_782 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_783 = "  /* Code from template association_SetMStarToMany_specialization */" + NL;
  public static final String TEXT_784 = "  public boolean ";
  public static final String TEXT_785 = "(";
  public static final String TEXT_786 = "... ";
  public static final String TEXT_787 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_788 = NL + "    ArrayList<";
  public static final String TEXT_789 = "> ";
  public static final String TEXT_790 = " = new ArrayList<";
  public static final String TEXT_791 = ">();" + NL + "    for (";
  public static final String TEXT_792 = " ";
  public static final String TEXT_793 = " : ";
  public static final String TEXT_794 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_795 = ".contains(";
  public static final String TEXT_796 = "))" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      ";
  public static final String TEXT_797 = ".add(";
  public static final String TEXT_798 = ");" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_799 = ".size() != ";
  public static final String TEXT_800 = ".length || ";
  public static final String TEXT_801 = ".size() < ";
  public static final String TEXT_802 = "_";
  public static final String TEXT_803 = "())" + NL + "    {";
  public static final String TEXT_804 = NL + "      return wasSet;" + NL + "    }" + NL + "    ";
  public static final String TEXT_805 = NL + "    wasSet = super.";
  public static final String TEXT_806 = "(";
  public static final String TEXT_807 = ");";
  public static final String TEXT_808 = NL + "    super.clear_";
  public static final String TEXT_809 = "();" + NL + "    for ( ";
  public static final String TEXT_810 = " orphan : ";
  public static final String TEXT_811 = " )" + NL + "    {" + NL + "      ";
  public static final String TEXT_812 = "(orphan);" + NL + "    }" + NL + "    wasSet = true;";
  public static final String TEXT_813 = "";
  public static final String TEXT_814 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_815 = "  /* Code from template association_SetUnidirectionalMN_specialization */";
  public static final String TEXT_816 = NL + "  ";
  public static final String TEXT_817 = " boolean ";
  public static final String TEXT_818 = "(";
  public static final String TEXT_819 = "... ";
  public static final String TEXT_820 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_821 = NL + "    ArrayList<";
  public static final String TEXT_822 = "> ";
  public static final String TEXT_823 = " = new ArrayList<";
  public static final String TEXT_824 = ">();" + NL + "    for (";
  public static final String TEXT_825 = " ";
  public static final String TEXT_826 = " : ";
  public static final String TEXT_827 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_828 = ".contains(";
  public static final String TEXT_829 = "))" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      ";
  public static final String TEXT_830 = ".add(";
  public static final String TEXT_831 = ");" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_832 = ".size() != ";
  public static final String TEXT_833 = ".length || ";
  public static final String TEXT_834 = ".size() < ";
  public static final String TEXT_835 = "_";
  public static final String TEXT_836 = "() || ";
  public static final String TEXT_837 = ".size() > ";
  public static final String TEXT_838 = "_";
  public static final String TEXT_839 = "())" + NL + "    {";
  public static final String TEXT_840 = NL + "      return wasSet;" + NL + "    }" + NL + "    ";
  public static final String TEXT_841 = NL + "    wasSet = super.";
  public static final String TEXT_842 = "(";
  public static final String TEXT_843 = ");";
  public static final String TEXT_844 = NL + "    clear_";
  public static final String TEXT_845 = "();" + NL + "    for ( ";
  public static final String TEXT_846 = " orphan : ";
  public static final String TEXT_847 = " )" + NL + "    {" + NL + "      ";
  public static final String TEXT_848 = "(orphan);" + NL + "    }" + NL + "    wasSet = true;";
  public static final String TEXT_849 = "";
  public static final String TEXT_850 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_851 = "  /* Code from template association_SetMNToOptionalOne_specialization */";
  public static final String TEXT_852 = NL + "  public boolean ";
  public static final String TEXT_853 = "(";
  public static final String TEXT_854 = "... ";
  public static final String TEXT_855 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_856 = NL + "    if (";
  public static final String TEXT_857 = ".length < ";
  public static final String TEXT_858 = "_";
  public static final String TEXT_859 = "()";
  public static final String TEXT_860 = ")" + NL + "    {";
  public static final String TEXT_861 = NL + "      return wasSet;" + NL + "    }" + NL + "    ";
  public static final String TEXT_862 = NL + "    wasSet = super.";
  public static final String TEXT_863 = "(";
  public static final String TEXT_864 = ");";
  public static final String TEXT_865 = NL + "    super.clear_";
  public static final String TEXT_866 = "();" + NL + "    for ( ";
  public static final String TEXT_867 = " orphan : ";
  public static final String TEXT_868 = " )" + NL + "    {" + NL + "      ";
  public static final String TEXT_869 = "(orphan);" + NL + "    }" + NL + "    wasSet = true;";
  public static final String TEXT_870 = "";
  public static final String TEXT_871 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_872 = "  /* Code from template association_SetUnidirectionalOptionalN_specialization */";
  public static final String TEXT_873 = NL + "  ";
  public static final String TEXT_874 = " boolean ";
  public static final String TEXT_875 = "(";
  public static final String TEXT_876 = "... ";
  public static final String TEXT_877 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_878 = NL + "    ArrayList<";
  public static final String TEXT_879 = "> ";
  public static final String TEXT_880 = " = new ArrayList<";
  public static final String TEXT_881 = ">();" + NL + "    for (";
  public static final String TEXT_882 = " ";
  public static final String TEXT_883 = " : ";
  public static final String TEXT_884 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_885 = ".contains(";
  public static final String TEXT_886 = "))" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      ";
  public static final String TEXT_887 = ".add(";
  public static final String TEXT_888 = ");" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_889 = ".size() != ";
  public static final String TEXT_890 = ".length || ";
  public static final String TEXT_891 = ".size() > ";
  public static final String TEXT_892 = "_";
  public static final String TEXT_893 = "())" + NL + "    {";
  public static final String TEXT_894 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    wasSet = super.";
  public static final String TEXT_895 = "(";
  public static final String TEXT_896 = ");";
  public static final String TEXT_897 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_898 = "  /* Code from template association_SetUnidirectionalMStar_specialization */";
  public static final String TEXT_899 = NL + "  ";
  public static final String TEXT_900 = " boolean ";
  public static final String TEXT_901 = "(";
  public static final String TEXT_902 = "... ";
  public static final String TEXT_903 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_904 = NL + "    ArrayList<";
  public static final String TEXT_905 = "> ";
  public static final String TEXT_906 = " = new ArrayList<";
  public static final String TEXT_907 = ">();" + NL + "    for (";
  public static final String TEXT_908 = " ";
  public static final String TEXT_909 = " : ";
  public static final String TEXT_910 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_911 = ".contains(";
  public static final String TEXT_912 = "))" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      ";
  public static final String TEXT_913 = ".add(";
  public static final String TEXT_914 = ");" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_915 = ".size() != ";
  public static final String TEXT_916 = ".length || ";
  public static final String TEXT_917 = ".size() < ";
  public static final String TEXT_918 = "_";
  public static final String TEXT_919 = "())" + NL + "    {";
  public static final String TEXT_920 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    wasSet = super.";
  public static final String TEXT_921 = "(";
  public static final String TEXT_922 = ");";
  public static final String TEXT_923 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_924 = NL;
  public static final String TEXT_925 = "  /* Code from template association_AddIndexControlFunctions_specialization */" + NL;
  public static final String TEXT_926 = "  public boolean ";
  public static final String TEXT_927 = "(";
  public static final String TEXT_928 = " ";
  public static final String TEXT_929 = ", int index)" + NL + "  {  " + NL + "    boolean wasAdded = false;" + NL + "    if(";
  public static final String TEXT_930 = "(";
  public static final String TEXT_931 = "))" + NL + "    {" + NL + "      if(index < 0 ) { index = 0; }" + NL + "      if(index > ";
  public static final String TEXT_932 = "()) { index = ";
  public static final String TEXT_933 = "() - 1; }";
  public static final String TEXT_934 = NL + "      wasAdded = super.";
  public static final String TEXT_935 = "(";
  public static final String TEXT_936 = ", int index);" + NL + "    }" + NL + "    return wasAdded;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_937 = "(";
  public static final String TEXT_938 = " ";
  public static final String TEXT_939 = ", int index)" + NL + "  {" + NL + "    boolean wasAdded = false;" + NL + "    if(";
  public static final String TEXT_940 = "_";
  public static final String TEXT_941 = "().contains(";
  public static final String TEXT_942 = "))" + NL + "    {" + NL + "      if(index < 0 ) { index = 0; }" + NL + "      if(index > ";
  public static final String TEXT_943 = "()) { index = ";
  public static final String TEXT_944 = "() - 1; }";
  public static final String TEXT_945 = NL + "      wasAdded = ";
  public static final String TEXT_946 = "(";
  public static final String TEXT_947 = " ";
  public static final String TEXT_948 = ", int index);" + NL + "    } " + NL + "    else " + NL + "    {";
  public static final String TEXT_949 = NL + "      wasAdded = ";
  public static final String TEXT_950 = "(";
  public static final String TEXT_951 = ", index);";
  public static final String TEXT_952 = NL + "    }" + NL + "    return wasAdded;" + NL + "  }" + NL;
  public static final String TEXT_953 = "  /* Code from template association_set_specialization_reqCommonCode */";
  public static final String TEXT_954 = "//FIXME - FOUND UNKNOWN ASSOCIATION RELATIONSHIP ";
  public static final String TEXT_955 = " : ";
  public static final String TEXT_956 = "  /* Code from template association_IsNumberOfValidMethod_relatedSpecialization */" + NL;
  public static final String TEXT_957 = "  public boolean ";
  public static final String TEXT_958 = "_";
  public static final String TEXT_959 = "()" + NL + "  {";
  public static final String TEXT_960 = "";
  public static final String TEXT_961 = NL + "    boolean isValid = ";
  public static final String TEXT_962 = "() >= ";
  public static final String TEXT_963 = "_";
  public static final String TEXT_964 = "();";
  public static final String TEXT_965 = NL + "    boolean isValid = ";
  public static final String TEXT_966 = "() >= ";
  public static final String TEXT_967 = "_";
  public static final String TEXT_968 = "() && ";
  public static final String TEXT_969 = "() <= ";
  public static final String TEXT_970 = "_";
  public static final String TEXT_971 = "();";
  public static final String TEXT_972 = "";
  public static final String TEXT_973 = NL + "    return isValid;" + NL + "  }";
  public static final String TEXT_974 = "  /* Code from template association_RequiredNumberOfMethod_relatedSpecialization */";
  public static final String TEXT_975 = "";
  public static final String TEXT_976 = NL + "  public static int ";
  public static final String TEXT_977 = "_";
  public static final String TEXT_978 = "()" + NL + "  {" + NL + "    return ";
  public static final String TEXT_979 = ";" + NL + "  }";
  public static final String TEXT_980 = NL + "  public static int ";
  public static final String TEXT_981 = "_";
  public static final String TEXT_982 = "()" + NL + "  {";
  public static final String TEXT_983 = NL + "    int required = ";
  public static final String TEXT_984 = ";";
  public static final String TEXT_985 = NL + "    return required;" + NL + "  }";
  public static final String TEXT_986 = "  /* Code from template association_MinimumNumberOfMethod_relatedSpecialization */";
  public static final String TEXT_987 = "";
  public static final String TEXT_988 = NL + "  public static int ";
  public static final String TEXT_989 = "_";
  public static final String TEXT_990 = "()" + NL + "  {" + NL + "    return ";
  public static final String TEXT_991 = ";" + NL + "  }";
  public static final String TEXT_992 = NL + "  public static int ";
  public static final String TEXT_993 = "_";
  public static final String TEXT_994 = "()" + NL + "  {";
  public static final String TEXT_995 = NL + "    int minimum = ";
  public static final String TEXT_996 = ";";
  public static final String TEXT_997 = NL + "    return minimum;" + NL + "  }";
  public static final String TEXT_998 = "  /* Code from template association_MaximumNumberOfMethod_relatedSpecialization */";
  public static final String TEXT_999 = "";
  public static final String TEXT_1000 = NL + "  public static int ";
  public static final String TEXT_1001 = "_";
  public static final String TEXT_1002 = "()" + NL + "  {" + NL + "    return ";
  public static final String TEXT_1003 = ";" + NL + "  }";
  public static final String TEXT_1004 = NL + "  public static int ";
  public static final String TEXT_1005 = "_";
  public static final String TEXT_1006 = "()" + NL + "  {";
  public static final String TEXT_1007 = NL + "    int maximum = ";
  public static final String TEXT_1008 = ";";
  public static final String TEXT_1009 = NL + "    return maximum;" + NL + "  }";
  public static final String TEXT_1010 = "  /* Code from template association_AddManyToManyMethod_relatedSpecialization */" + NL;
  public static final String TEXT_1011 = "  public boolean ";
  public static final String TEXT_1012 = "(";
  public static final String TEXT_1013 = " ";
  public static final String TEXT_1014 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_1015 = "";
  public static final String TEXT_1016 = NL + "    if (";
  public static final String TEXT_1017 = "() >= ";
  public static final String TEXT_1018 = "_";
  public static final String TEXT_1019 = "())" + NL + "    {";
  public static final String TEXT_1020 = NL + "      return wasAdded;" + NL + "    }" + NL;
  public static final String TEXT_1021 = NL + "    ";
  public static final String TEXT_1022 = ".add(";
  public static final String TEXT_1023 = ");";
  public static final String TEXT_1024 = NL + "    if (";
  public static final String TEXT_1025 = ".";
  public static final String TEXT_1026 = "(this) != -1)" + NL + "    {" + NL + "      wasAdded = true;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      wasAdded = ";
  public static final String TEXT_1027 = ".";
  public static final String TEXT_1028 = "(this);" + NL + "      if (!wasAdded)" + NL + "      {" + NL + "        ";
  public static final String TEXT_1029 = ".remove(";
  public static final String TEXT_1030 = ");" + NL + "      }" + NL + "    }";
  public static final String TEXT_1031 = NL + "    return wasAdded;" + NL + "  }";
  public static final String TEXT_1032 = "  /* Code from template association_RemoveMany */" + NL;
  public static final String TEXT_1033 = "  public boolean ";
  public static final String TEXT_1034 = "(";
  public static final String TEXT_1035 = " ";
  public static final String TEXT_1036 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_1037 = "";
  public static final String TEXT_1038 = NL + "    if (!";
  public static final String TEXT_1039 = ".contains(";
  public static final String TEXT_1040 = "))" + NL + "    {";
  public static final String TEXT_1041 = NL + "      return wasRemoved;" + NL + "    }" + NL + NL + "    int oldIndex = ";
  public static final String TEXT_1042 = ".indexOf(";
  public static final String TEXT_1043 = ");" + NL + "    ";
  public static final String TEXT_1044 = ".remove(oldIndex);" + NL + "    if (";
  public static final String TEXT_1045 = ".";
  public static final String TEXT_1046 = "(";
  public static final String TEXT_1047 = ") == -1)" + NL + "    {" + NL + "      wasRemoved = true;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      wasRemoved = ";
  public static final String TEXT_1048 = ".";
  public static final String TEXT_1049 = "(";
  public static final String TEXT_1050 = ");" + NL + "      if (!wasRemoved)" + NL + "      {" + NL + "        ";
  public static final String TEXT_1051 = ".add(oldIndex,";
  public static final String TEXT_1052 = ");" + NL + "      }" + NL + "    }";
  public static final String TEXT_1053 = NL + "    return wasRemoved;" + NL + "  }";
  public static final String TEXT_1054 = "  /* Code from template association_SetUnidirectionalOptionalOne_relatedSpecialization */";
  public static final String TEXT_1055 = NL + "  ";
  public static final String TEXT_1056 = " boolean ";
  public static final String TEXT_1057 = "(";
  public static final String TEXT_1058 = " ";
  public static final String TEXT_1059 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_1060 = NL + "    ";
  public static final String TEXT_1061 = " = ";
  public static final String TEXT_1062 = "new ArrayList<";
  public static final String TEXT_1063 = ">()";
  public static final String TEXT_1064 = ";";
  public static final String TEXT_1065 = ".add(";
  public static final String TEXT_1066 = ");";
  public static final String TEXT_1067 = NL + "    wasSet = true;";
  public static final String TEXT_1068 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1069 = "  /* Code from template association_SetUnidirectionalOne_relatedSpecialization */";
  public static final String TEXT_1070 = NL + "  ";
  public static final String TEXT_1071 = " boolean ";
  public static final String TEXT_1072 = "(";
  public static final String TEXT_1073 = " ";
  public static final String TEXT_1074 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_1075 = NL + "    if (";
  public static final String TEXT_1076 = " != null)" + NL + "    {" + NL + "      ";
  public static final String TEXT_1077 = " = ";
  public static final String TEXT_1078 = "new ArrayList<";
  public static final String TEXT_1079 = ">()";
  public static final String TEXT_1080 = ";";
  public static final String TEXT_1081 = ".add(";
  public static final String TEXT_1082 = ");";
  public static final String TEXT_1083 = NL + "      wasSet = true;" + NL + "    }";
  public static final String TEXT_1084 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1085 = "  /* Code from template association_SetOptionalOneToOne_relatedSpecialization */" + NL;
  public static final String TEXT_1086 = "  public boolean ";
  public static final String TEXT_1087 = "_";
  public static final String TEXT_1088 = "(";
  public static final String TEXT_1089 = " ";
  public static final String TEXT_1090 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_1091 = NL + "    if (";
  public static final String TEXT_1092 = " != null && !";
  public static final String TEXT_1093 = ".equals(";
  public static final String TEXT_1094 = ") && equals(";
  public static final String TEXT_1095 = ".";
  public static final String TEXT_1096 = "()))" + NL + "    {" + NL + "      //Unable to ";
  public static final String TEXT_1097 = ", as existing ";
  public static final String TEXT_1098 = " would become an orphan";
  public static final String TEXT_1099 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_1100 = " = ";
  public static final String TEXT_1101 = "new ArrayList<";
  public static final String TEXT_1102 = ">()";
  public static final String TEXT_1103 = ";";
  public static final String TEXT_1104 = ".add(";
  public static final String TEXT_1105 = ");";
  public static final String TEXT_1106 = NL + "    ";
  public static final String TEXT_1107 = " ";
  public static final String TEXT_1108 = " = ";
  public static final String TEXT_1109 = " != null ? ";
  public static final String TEXT_1110 = ".";
  public static final String TEXT_1111 = "() : null;" + NL + NL + "    if (!this.equals(";
  public static final String TEXT_1112 = "))" + NL + "    {" + NL + "      if (";
  public static final String TEXT_1113 = " != null)" + NL + "      {" + NL + "        ";
  public static final String TEXT_1114 = ".clear_";
  public static final String TEXT_1115 = "();" + NL + "      }" + NL + "      if (";
  public static final String TEXT_1116 = " != null)" + NL + "      {" + NL + "        ";
  public static final String TEXT_1117 = ".";
  public static final String TEXT_1118 = "_";
  public static final String TEXT_1119 = "(this);" + NL + "      }" + NL + "    }" + NL + "    wasSet = true;";
  public static final String TEXT_1120 = "";
  public static final String TEXT_1121 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1122 = "  /* Code from template association_SetOneToOptionalOne_relatedSpecialization */" + NL;
  public static final String TEXT_1123 = "  public boolean ";
  public static final String TEXT_1124 = "_";
  public static final String TEXT_1125 = "(";
  public static final String TEXT_1126 = " ";
  public static final String TEXT_1127 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_1128 = NL + "    if (";
  public static final String TEXT_1129 = " == null)" + NL + "    {" + NL + "      //Unable to ";
  public static final String TEXT_1130 = " to null, as ";
  public static final String TEXT_1131 = " must always be associated to a ";
  public static final String TEXT_1132 = "";
  public static final String TEXT_1133 = NL + "      return wasSet;" + NL + "    }" + NL + "    " + NL + "    ";
  public static final String TEXT_1134 = " ";
  public static final String TEXT_1135 = " = ";
  public static final String TEXT_1136 = ".";
  public static final String TEXT_1137 = "_One";
  public static final String TEXT_1138 = "()";
  public static final String TEXT_1139 = "(0)";
  public static final String TEXT_1140 = ";" + NL + "    if (";
  public static final String TEXT_1141 = " != null && !equals(";
  public static final String TEXT_1142 = "))" + NL + "    {" + NL + "      //Unable to ";
  public static final String TEXT_1143 = ", the current ";
  public static final String TEXT_1144 = " already has a ";
  public static final String TEXT_1145 = ", which would be orphaned if it were re-assigned";
  public static final String TEXT_1146 = NL + "      return wasSet;" + NL + "    }" + NL + "    " + NL + "    ";
  public static final String TEXT_1147 = " ";
  public static final String TEXT_1148 = " = ";
  public static final String TEXT_1149 = ";" + NL + "    ";
  public static final String TEXT_1150 = " = ";
  public static final String TEXT_1151 = "new ArrayList<";
  public static final String TEXT_1152 = ">()";
  public static final String TEXT_1153 = ";";
  public static final String TEXT_1154 = ".add(";
  public static final String TEXT_1155 = ");";
  public static final String TEXT_1156 = NL + "    ";
  public static final String TEXT_1157 = ".";
  public static final String TEXT_1158 = "_";
  public static final String TEXT_1159 = "(this);" + NL + NL + "    if (";
  public static final String TEXT_1160 = " != null)" + NL + "    {" + NL + "      ";
  public static final String TEXT_1161 = ".clear_";
  public static final String TEXT_1162 = "();" + NL + "    }" + NL + "    wasSet = true;";
  public static final String TEXT_1163 = "";
  public static final String TEXT_1164 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1165 = "";
  public static final String TEXT_1166 = "  /* Code from template association_AddMandatoryManyToOne_relatedSpecialization */" + NL;
  public static final String TEXT_1167 = "  public ";
  public static final String TEXT_1168 = " ";
  public static final String TEXT_1169 = "(";
  public static final String TEXT_1170 = ")" + NL + "  {" + NL + "    ";
  public static final String TEXT_1171 = " ";
  public static final String TEXT_1172 = " = new ";
  public static final String TEXT_1173 = "(";
  public static final String TEXT_1174 = ");";
  public static final String TEXT_1175 = NL + "    return ";
  public static final String TEXT_1176 = ";" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_1177 = "(";
  public static final String TEXT_1178 = " ";
  public static final String TEXT_1179 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_1180 = NL + "    ";
  public static final String TEXT_1181 = " ";
  public static final String TEXT_1182 = " = ";
  public static final String TEXT_1183 = ".";
  public static final String TEXT_1184 = "_One";
  public static final String TEXT_1185 = "();" + NL + "    boolean ";
  public static final String TEXT_1186 = " = ";
  public static final String TEXT_1187 = " != null && !this.equals(";
  public static final String TEXT_1188 = ");" + NL + NL + "    if (";
  public static final String TEXT_1189 = " && ";
  public static final String TEXT_1190 = ".";
  public static final String TEXT_1191 = "() <= ";
  public static final String TEXT_1192 = "_";
  public static final String TEXT_1193 = "())" + NL + "    {" + NL + "      return wasAdded;" + NL + "    }";
  public static final String TEXT_1194 = NL + "    if (";
  public static final String TEXT_1195 = ")" + NL + "    {" + NL + "      ";
  public static final String TEXT_1196 = ".";
  public static final String TEXT_1197 = "(";
  public static final String TEXT_1198 = ");" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      ";
  public static final String TEXT_1199 = ".add(";
  public static final String TEXT_1200 = ");" + NL + "    }";
  public static final String TEXT_1201 = NL + "    wasAdded = true;";
  public static final String TEXT_1202 = NL + "    return wasAdded;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_1203 = "(";
  public static final String TEXT_1204 = " ";
  public static final String TEXT_1205 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_1206 = NL + "    //Unable to remove ";
  public static final String TEXT_1207 = ", as it must always have a ";
  public static final String TEXT_1208 = NL + "    if (this.equals(";
  public static final String TEXT_1209 = ".";
  public static final String TEXT_1210 = "_One";
  public static final String TEXT_1211 = "()))" + NL + "    {";
  public static final String TEXT_1212 = NL + "      return wasRemoved;" + NL + "    }" + NL + NL + "    //";
  public static final String TEXT_1213 = " already at minimum (";
  public static final String TEXT_1214 = ")" + NL + "    if (";
  public static final String TEXT_1215 = "() <= ";
  public static final String TEXT_1216 = "_";
  public static final String TEXT_1217 = "())" + NL + "    {";
  public static final String TEXT_1218 = NL + "      return wasRemoved;" + NL + "    }";
  public static final String TEXT_1219 = NL + NL + "    ";
  public static final String TEXT_1220 = ".remove(";
  public static final String TEXT_1221 = ");";
  public static final String TEXT_1222 = NL + "    wasRemoved = true;";
  public static final String TEXT_1223 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_1224 = "  /* Code from template association_AddMNToOnlyOne_relatedSpecialization */" + NL;
  public static final String TEXT_1225 = "  public ";
  public static final String TEXT_1226 = " ";
  public static final String TEXT_1227 = "(";
  public static final String TEXT_1228 = ")" + NL + "  {" + NL + "    if (";
  public static final String TEXT_1229 = "() >= ";
  public static final String TEXT_1230 = "_";
  public static final String TEXT_1231 = "())" + NL + "    {" + NL + "      return null;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      return new ";
  public static final String TEXT_1232 = "(";
  public static final String TEXT_1233 = ");" + NL + "    }" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_1234 = "(";
  public static final String TEXT_1235 = " ";
  public static final String TEXT_1236 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_1237 = NL + "    if (";
  public static final String TEXT_1238 = "() >= ";
  public static final String TEXT_1239 = "_";
  public static final String TEXT_1240 = "())" + NL + "    {";
  public static final String TEXT_1241 = NL + "      return wasAdded;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_1242 = " ";
  public static final String TEXT_1243 = " = ";
  public static final String TEXT_1244 = ".";
  public static final String TEXT_1245 = "_One";
  public static final String TEXT_1246 = "();" + NL + "    boolean ";
  public static final String TEXT_1247 = " = ";
  public static final String TEXT_1248 = " != null && !this.equals(";
  public static final String TEXT_1249 = ");" + NL + NL + "    if (";
  public static final String TEXT_1250 = " && ";
  public static final String TEXT_1251 = ".";
  public static final String TEXT_1252 = "() <= ";
  public static final String TEXT_1253 = "_";
  public static final String TEXT_1254 = "())" + NL + "    {";
  public static final String TEXT_1255 = NL + "      return wasAdded;" + NL + "    }";
  public static final String TEXT_1256 = NL + NL + "    if (";
  public static final String TEXT_1257 = ")" + NL + "    {" + NL + "      ";
  public static final String TEXT_1258 = ".";
  public static final String TEXT_1259 = "(this);" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      ";
  public static final String TEXT_1260 = ".add(";
  public static final String TEXT_1261 = ");" + NL + "    }";
  public static final String TEXT_1262 = NL + "    wasAdded = true;";
  public static final String TEXT_1263 = NL + "    return wasAdded;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_1264 = "(";
  public static final String TEXT_1265 = " ";
  public static final String TEXT_1266 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_1267 = NL + "    //Unable to remove ";
  public static final String TEXT_1268 = ", as it must always have a ";
  public static final String TEXT_1269 = NL + "    if (this.equals(";
  public static final String TEXT_1270 = ".";
  public static final String TEXT_1271 = "_One";
  public static final String TEXT_1272 = "()))" + NL + "    {";
  public static final String TEXT_1273 = NL + "      return wasRemoved;" + NL + "    }" + NL + NL + "    //";
  public static final String TEXT_1274 = " already at minimum (";
  public static final String TEXT_1275 = ")" + NL + "    if (";
  public static final String TEXT_1276 = "() <= ";
  public static final String TEXT_1277 = "_";
  public static final String TEXT_1278 = "())" + NL + "    {";
  public static final String TEXT_1279 = NL + "      return wasRemoved;" + NL + "    }";
  public static final String TEXT_1280 = NL + "    ";
  public static final String TEXT_1281 = ".remove(";
  public static final String TEXT_1282 = ");";
  public static final String TEXT_1283 = NL + "    wasRemoved = true;";
  public static final String TEXT_1284 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_1285 = "  /* Code from template association_AddOptionalNToOne_relatedSpecialization */" + NL;
  public static final String TEXT_1286 = "  public ";
  public static final String TEXT_1287 = " ";
  public static final String TEXT_1288 = "(";
  public static final String TEXT_1289 = ")" + NL + "  {" + NL + "    if (";
  public static final String TEXT_1290 = "() >= ";
  public static final String TEXT_1291 = "_";
  public static final String TEXT_1292 = "())" + NL + "    {" + NL + "      return null;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      return new ";
  public static final String TEXT_1293 = "(";
  public static final String TEXT_1294 = ");" + NL + "    }" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_1295 = "(";
  public static final String TEXT_1296 = " ";
  public static final String TEXT_1297 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_1298 = NL + "    if (";
  public static final String TEXT_1299 = "() >= ";
  public static final String TEXT_1300 = "_";
  public static final String TEXT_1301 = "())" + NL + "    {";
  public static final String TEXT_1302 = NL + "      return wasAdded;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_1303 = " ";
  public static final String TEXT_1304 = " = ";
  public static final String TEXT_1305 = ".";
  public static final String TEXT_1306 = "_One";
  public static final String TEXT_1307 = "();" + NL + "    boolean ";
  public static final String TEXT_1308 = " = ";
  public static final String TEXT_1309 = " != null && !this.equals(";
  public static final String TEXT_1310 = ");";
  public static final String TEXT_1311 = NL + "    if (";
  public static final String TEXT_1312 = ")" + NL + "    {" + NL + "      ";
  public static final String TEXT_1313 = ".";
  public static final String TEXT_1314 = "(this);" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      ";
  public static final String TEXT_1315 = ".add(";
  public static final String TEXT_1316 = ");" + NL + "    }";
  public static final String TEXT_1317 = NL + "    wasAdded = true;";
  public static final String TEXT_1318 = NL + "    return wasAdded;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_1319 = "(";
  public static final String TEXT_1320 = " ";
  public static final String TEXT_1321 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_1322 = NL + "    //Unable to remove ";
  public static final String TEXT_1323 = ", as it must always have a ";
  public static final String TEXT_1324 = NL + "    if (!this.equals(";
  public static final String TEXT_1325 = ".";
  public static final String TEXT_1326 = "_One";
  public static final String TEXT_1327 = "()))" + NL + "    {" + NL + "      ";
  public static final String TEXT_1328 = ".remove(";
  public static final String TEXT_1329 = ");" + NL + "      wasRemoved = true;" + NL + "    }";
  public static final String TEXT_1330 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_1331 = "  /* Code from template association_SetOptionalNToMany_relatedSpecialization */" + NL;
  public static final String TEXT_1332 = "  public boolean ";
  public static final String TEXT_1333 = "_";
  public static final String TEXT_1334 = "(";
  public static final String TEXT_1335 = "... ";
  public static final String TEXT_1336 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_1337 = NL + "    ArrayList<";
  public static final String TEXT_1338 = "> ";
  public static final String TEXT_1339 = " = new ArrayList<";
  public static final String TEXT_1340 = ">();" + NL + "    for (";
  public static final String TEXT_1341 = " ";
  public static final String TEXT_1342 = " : ";
  public static final String TEXT_1343 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_1344 = ".contains(";
  public static final String TEXT_1345 = "))" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      ";
  public static final String TEXT_1346 = ".add(";
  public static final String TEXT_1347 = ");" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_1348 = ".size() != ";
  public static final String TEXT_1349 = ".length || ";
  public static final String TEXT_1350 = ".size() > ";
  public static final String TEXT_1351 = "_";
  public static final String TEXT_1352 = "())" + NL + "    {";
  public static final String TEXT_1353 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ArrayList<";
  public static final String TEXT_1354 = "> ";
  public static final String TEXT_1355 = " = new ArrayList<";
  public static final String TEXT_1356 = ">(";
  public static final String TEXT_1357 = "_";
  public static final String TEXT_1358 = "());" + NL + "    ";
  public static final String TEXT_1359 = ".clear();" + NL + "    for (";
  public static final String TEXT_1360 = " ";
  public static final String TEXT_1361 = " : ";
  public static final String TEXT_1362 = ")" + NL + "    {" + NL + "      ";
  public static final String TEXT_1363 = ".add(";
  public static final String TEXT_1364 = ");" + NL + "      if (";
  public static final String TEXT_1365 = ".contains(";
  public static final String TEXT_1366 = "))" + NL + "      {" + NL + "        ";
  public static final String TEXT_1367 = ".remove(";
  public static final String TEXT_1368 = ");" + NL + "      }" + NL + "      else" + NL + "      {" + NL + "        ";
  public static final String TEXT_1369 = ".";
  public static final String TEXT_1370 = "(this);" + NL + "      }" + NL + "    }" + NL + NL + "    for (";
  public static final String TEXT_1371 = " ";
  public static final String TEXT_1372 = " : ";
  public static final String TEXT_1373 = ")" + NL + "    {" + NL + "      ";
  public static final String TEXT_1374 = ".";
  public static final String TEXT_1375 = "(this);" + NL + "    }" + NL + "    wasSet = true;";
  public static final String TEXT_1376 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1377 = "  /* Code from template association_AddManyToOne_relatedSpecialization */" + NL;
  public static final String TEXT_1378 = "  public ";
  public static final String TEXT_1379 = " ";
  public static final String TEXT_1380 = "(";
  public static final String TEXT_1381 = ")" + NL + "  {" + NL + "    return new ";
  public static final String TEXT_1382 = "(";
  public static final String TEXT_1383 = ");" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_1384 = "(";
  public static final String TEXT_1385 = " ";
  public static final String TEXT_1386 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_1387 = NL + "    ";
  public static final String TEXT_1388 = " ";
  public static final String TEXT_1389 = " = ";
  public static final String TEXT_1390 = ".";
  public static final String TEXT_1391 = "_One";
  public static final String TEXT_1392 = "();" + NL + "    boolean ";
  public static final String TEXT_1393 = " = ";
  public static final String TEXT_1394 = " != null && !this.equals(";
  public static final String TEXT_1395 = ");";
  public static final String TEXT_1396 = NL + "    if (";
  public static final String TEXT_1397 = ")" + NL + "    {" + NL + "      ";
  public static final String TEXT_1398 = ".";
  public static final String TEXT_1399 = "(";
  public static final String TEXT_1400 = ");" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      ";
  public static final String TEXT_1401 = ".add(";
  public static final String TEXT_1402 = ");" + NL + "    }";
  public static final String TEXT_1403 = NL + "    wasAdded = true;";
  public static final String TEXT_1404 = NL + "    return wasAdded;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_1405 = "(";
  public static final String TEXT_1406 = " ";
  public static final String TEXT_1407 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_1408 = NL + "    //Unable to remove ";
  public static final String TEXT_1409 = ", as it must always have a ";
  public static final String TEXT_1410 = NL + "    if (!this.equals(";
  public static final String TEXT_1411 = ".";
  public static final String TEXT_1412 = "_One";
  public static final String TEXT_1413 = "()))" + NL + "    {";
  public static final String TEXT_1414 = NL + "      ";
  public static final String TEXT_1415 = ".remove(";
  public static final String TEXT_1416 = ");";
  public static final String TEXT_1417 = NL + "      wasRemoved = true;" + NL + "    }";
  public static final String TEXT_1418 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_1419 = "  /* Code from template association_SetOptionalOneToOptionalOne_relatedSpecialization */" + NL;
  public static final String TEXT_1420 = "  public boolean ";
  public static final String TEXT_1421 = "_";
  public static final String TEXT_1422 = "(";
  public static final String TEXT_1423 = " ";
  public static final String TEXT_1424 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_1425 = NL + "    if (";
  public static final String TEXT_1426 = " == null)" + NL + "    {" + NL + "      ";
  public static final String TEXT_1427 = " ";
  public static final String TEXT_1428 = " = ";
  public static final String TEXT_1429 = "_One";
  public static final String TEXT_1430 = "()";
  public static final String TEXT_1431 = "(";
  public static final String TEXT_1432 = ")";
  public static final String TEXT_1433 = ";" + NL + "      clear_";
  public static final String TEXT_1434 = "();" + NL + "      " + NL + "      if (";
  public static final String TEXT_1435 = " != null && ";
  public static final String TEXT_1436 = ".";
  public static final String TEXT_1437 = "() != null)" + NL + "      {" + NL + "        ";
  public static final String TEXT_1438 = ".clear_";
  public static final String TEXT_1439 = "();" + NL + "      }" + NL + "      wasSet = true;";
  public static final String TEXT_1440 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_1441 = " ";
  public static final String TEXT_1442 = " = ";
  public static final String TEXT_1443 = "_One";
  public static final String TEXT_1444 = "();" + NL + "    if (";
  public static final String TEXT_1445 = " != null && !";
  public static final String TEXT_1446 = ".equals(";
  public static final String TEXT_1447 = "))" + NL + "    {" + NL + "      ";
  public static final String TEXT_1448 = ".clear_";
  public static final String TEXT_1449 = "();" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_1450 = " = ";
  public static final String TEXT_1451 = "new ArrayList<";
  public static final String TEXT_1452 = ">()";
  public static final String TEXT_1453 = ";";
  public static final String TEXT_1454 = ".add(";
  public static final String TEXT_1455 = ");";
  public static final String TEXT_1456 = NL + "    ";
  public static final String TEXT_1457 = " ";
  public static final String TEXT_1458 = " = ";
  public static final String TEXT_1459 = ".";
  public static final String TEXT_1460 = "_One";
  public static final String TEXT_1461 = "()";
  public static final String TEXT_1462 = "(0)";
  public static final String TEXT_1463 = "()";
  public static final String TEXT_1464 = ";" + NL + NL + "    if (!equals(";
  public static final String TEXT_1465 = "))" + NL + "    {";
  public static final String TEXT_1466 = " " + NL + "      for (";
  public static final String TEXT_1467 = " orphan : ";
  public static final String TEXT_1468 = ")" + NL + "      {" + NL + "        ";
  public static final String TEXT_1469 = "_";
  public static final String TEXT_1470 = "((";
  public static final String TEXT_1471 = ")orphan,this);" + NL + "      }      ";
  public static final String TEXT_1472 = NL + "        ";
  public static final String TEXT_1473 = "_";
  public static final String TEXT_1474 = "(";
  public static final String TEXT_1475 = ",this);";
  public static final String TEXT_1476 = NL + "      ";
  public static final String TEXT_1477 = ".";
  public static final String TEXT_1478 = "_";
  public static final String TEXT_1479 = "(this);";
  public static final String TEXT_1480 = NL + "    }" + NL + "    wasSet = true;";
  public static final String TEXT_1481 = "";
  public static final String TEXT_1482 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1483 = "";
  public static final String TEXT_1484 = "  /* Code from template association_AddMNToMany_relatedSpecialization */" + NL;
  public static final String TEXT_1485 = "  public boolean ";
  public static final String TEXT_1486 = "(";
  public static final String TEXT_1487 = " ";
  public static final String TEXT_1488 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_1489 = NL + "    if (!";
  public static final String TEXT_1490 = ".contains(";
  public static final String TEXT_1491 = "))" + NL + "    {";
  public static final String TEXT_1492 = NL + "      return wasRemoved;" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_1493 = "() <= ";
  public static final String TEXT_1494 = "_";
  public static final String TEXT_1495 = "())" + NL + "    {";
  public static final String TEXT_1496 = NL + "      return wasRemoved;" + NL + "    }" + NL + NL + "    int oldIndex = ";
  public static final String TEXT_1497 = ".indexOf(";
  public static final String TEXT_1498 = ");";
  public static final String TEXT_1499 = NL + "    ";
  public static final String TEXT_1500 = ".remove(oldIndex);";
  public static final String TEXT_1501 = NL + "    if (";
  public static final String TEXT_1502 = ".";
  public static final String TEXT_1503 = "(this) == -1)" + NL + "    {" + NL + "      wasRemoved = true;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      wasRemoved = ";
  public static final String TEXT_1504 = ".";
  public static final String TEXT_1505 = "(this);" + NL + "      if (!wasRemoved)" + NL + "      {" + NL + "        ";
  public static final String TEXT_1506 = ".add(oldIndex,";
  public static final String TEXT_1507 = ");" + NL + "      }" + NL + "    }";
  public static final String TEXT_1508 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_1509 = "  /* Code from template association_AddMStarToMany_relatedSpecialization */" + NL;
  public static final String TEXT_1510 = "  public boolean ";
  public static final String TEXT_1511 = "(";
  public static final String TEXT_1512 = " ";
  public static final String TEXT_1513 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_1514 = NL + "    if (!";
  public static final String TEXT_1515 = ".contains(";
  public static final String TEXT_1516 = "))" + NL + "    {";
  public static final String TEXT_1517 = NL + "      return wasRemoved;" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_1518 = "() <= ";
  public static final String TEXT_1519 = "_";
  public static final String TEXT_1520 = "())" + NL + "    {";
  public static final String TEXT_1521 = NL + "      return wasRemoved;" + NL + "    }" + NL + NL + "    int oldIndex = ";
  public static final String TEXT_1522 = ".indexOf(";
  public static final String TEXT_1523 = ");";
  public static final String TEXT_1524 = NL + "    ";
  public static final String TEXT_1525 = ".remove(oldIndex);";
  public static final String TEXT_1526 = NL + "    if (";
  public static final String TEXT_1527 = ".";
  public static final String TEXT_1528 = "(this) == -1)" + NL + "    {" + NL + "      wasRemoved = true;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      wasRemoved = ";
  public static final String TEXT_1529 = ".";
  public static final String TEXT_1530 = "(this);" + NL + "      if (!wasRemoved)" + NL + "      {" + NL + "        ";
  public static final String TEXT_1531 = ".add(oldIndex,";
  public static final String TEXT_1532 = ");" + NL + "      }" + NL + "    }";
  public static final String TEXT_1533 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_1534 = "  /* Code from template association_SetOptionalOneToOptionalN_relatedSpecialization */" + NL;
  public static final String TEXT_1535 = "  public boolean ";
  public static final String TEXT_1536 = "_";
  public static final String TEXT_1537 = "(";
  public static final String TEXT_1538 = " ";
  public static final String TEXT_1539 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_1540 = NL + "    if (";
  public static final String TEXT_1541 = " != null && ";
  public static final String TEXT_1542 = ".";
  public static final String TEXT_1543 = "() >= ";
  public static final String TEXT_1544 = ".";
  public static final String TEXT_1545 = "_";
  public static final String TEXT_1546 = "())" + NL + "    {";
  public static final String TEXT_1547 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_1548 = " ";
  public static final String TEXT_1549 = " = ";
  public static final String TEXT_1550 = "_One";
  public static final String TEXT_1551 = "()";
  public static final String TEXT_1552 = "(";
  public static final String TEXT_1553 = ")";
  public static final String TEXT_1554 = ";";
  public static final String TEXT_1555 = NL + "    ";
  public static final String TEXT_1556 = " = ";
  public static final String TEXT_1557 = ";";
  public static final String TEXT_1558 = NL + "    ";
  public static final String TEXT_1559 = ".clear();" + NL + "    ";
  public static final String TEXT_1560 = ".add(";
  public static final String TEXT_1561 = ");";
  public static final String TEXT_1562 = NL + "    if (";
  public static final String TEXT_1563 = " != null && !";
  public static final String TEXT_1564 = ".equals(";
  public static final String TEXT_1565 = "))" + NL + "    {" + NL + "      ";
  public static final String TEXT_1566 = ".";
  public static final String TEXT_1567 = "(this);" + NL + "    }" + NL + "    if (";
  public static final String TEXT_1568 = " != null)" + NL + "    {" + NL + "      ";
  public static final String TEXT_1569 = ".";
  public static final String TEXT_1570 = "(this);" + NL + "    }" + NL + "    wasSet = true;";
  public static final String TEXT_1571 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1572 = "  /* Code from template association_SetOneToMany_relatedSpecialization */" + NL;
  public static final String TEXT_1573 = "  public boolean ";
  public static final String TEXT_1574 = "_";
  public static final String TEXT_1575 = "(";
  public static final String TEXT_1576 = " ";
  public static final String TEXT_1577 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_1578 = NL + "    if (";
  public static final String TEXT_1579 = " == null)" + NL + "    {";
  public static final String TEXT_1580 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_1581 = " ";
  public static final String TEXT_1582 = " = ";
  public static final String TEXT_1583 = "_One";
  public static final String TEXT_1584 = "()";
  public static final String TEXT_1585 = "(";
  public static final String TEXT_1586 = ")";
  public static final String TEXT_1587 = ";" + NL + "    ";
  public static final String TEXT_1588 = " = ";
  public static final String TEXT_1589 = ";" + NL + "    if (";
  public static final String TEXT_1590 = " != null && !";
  public static final String TEXT_1591 = ".equals(";
  public static final String TEXT_1592 = "))" + NL + "    {" + NL + "      ";
  public static final String TEXT_1593 = ".";
  public static final String TEXT_1594 = "(this);" + NL + "    }" + NL + "    ";
  public static final String TEXT_1595 = ".";
  public static final String TEXT_1596 = "(this);" + NL + "    wasSet = true;";
  public static final String TEXT_1597 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1598 = "  /* Code from template association_SetOneToManyAssociationClass_relatedSpecialization */" + NL;
  public static final String TEXT_1599 = "  public boolean ";
  public static final String TEXT_1600 = "_";
  public static final String TEXT_1601 = "(";
  public static final String TEXT_1602 = " ";
  public static final String TEXT_1603 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_1604 = NL + "    if (";
  public static final String TEXT_1605 = " == null)" + NL + "    {";
  public static final String TEXT_1606 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_1607 = " ";
  public static final String TEXT_1608 = " = ";
  public static final String TEXT_1609 = "_One";
  public static final String TEXT_1610 = "()";
  public static final String TEXT_1611 = "(";
  public static final String TEXT_1612 = ")";
  public static final String TEXT_1613 = ";" + NL + "    ";
  public static final String TEXT_1614 = " = ";
  public static final String TEXT_1615 = ";" + NL + "    if (";
  public static final String TEXT_1616 = " != null && !";
  public static final String TEXT_1617 = ".equals(";
  public static final String TEXT_1618 = "))" + NL + "    {" + NL + "      ";
  public static final String TEXT_1619 = ".";
  public static final String TEXT_1620 = "(this);" + NL + "    }" + NL + "    if (!";
  public static final String TEXT_1621 = ".";
  public static final String TEXT_1622 = "(this))" + NL + "    {" + NL + "      ";
  public static final String TEXT_1623 = " = ";
  public static final String TEXT_1624 = ";" + NL + "      wasSet = false;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      wasSet = true;" + NL + "    }";
  public static final String TEXT_1625 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1626 = "  /* Code from template association_SetOneToAtMostN_relatedSpecialization */" + NL;
  public static final String TEXT_1627 = "  public boolean ";
  public static final String TEXT_1628 = "_";
  public static final String TEXT_1629 = "(";
  public static final String TEXT_1630 = " ";
  public static final String TEXT_1631 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_1632 = NL + "    //Must provide ";
  public static final String TEXT_1633 = " to ";
  public static final String TEXT_1634 = NL + "    if (";
  public static final String TEXT_1635 = " == null)" + NL + "    {";
  public static final String TEXT_1636 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    //";
  public static final String TEXT_1637 = " already at maximum (";
  public static final String TEXT_1638 = ")" + NL + "    if (";
  public static final String TEXT_1639 = ".";
  public static final String TEXT_1640 = "() >= ";
  public static final String TEXT_1641 = ".";
  public static final String TEXT_1642 = "_";
  public static final String TEXT_1643 = "())" + NL + "    {";
  public static final String TEXT_1644 = NL + "      return wasSet;" + NL + "    }" + NL + "    " + NL + "    ";
  public static final String TEXT_1645 = " ";
  public static final String TEXT_1646 = " = ";
  public static final String TEXT_1647 = "_One";
  public static final String TEXT_1648 = "()";
  public static final String TEXT_1649 = "(";
  public static final String TEXT_1650 = ")";
  public static final String TEXT_1651 = ";";
  public static final String TEXT_1652 = NL + "    ";
  public static final String TEXT_1653 = " = ";
  public static final String TEXT_1654 = ";";
  public static final String TEXT_1655 = NL + "    ";
  public static final String TEXT_1656 = ".clear();" + NL + "    ";
  public static final String TEXT_1657 = ".add(";
  public static final String TEXT_1658 = ");";
  public static final String TEXT_1659 = NL + "    if (";
  public static final String TEXT_1660 = " != null && !";
  public static final String TEXT_1661 = ".equals(";
  public static final String TEXT_1662 = "))" + NL + "    {" + NL + "      boolean didRemove = ";
  public static final String TEXT_1663 = ".";
  public static final String TEXT_1664 = "(this);" + NL + "      if (!didRemove)" + NL + "      {";
  public static final String TEXT_1665 = NL + "        ";
  public static final String TEXT_1666 = " = ";
  public static final String TEXT_1667 = ";";
  public static final String TEXT_1668 = NL + "        ";
  public static final String TEXT_1669 = ".clear();" + NL + "        ";
  public static final String TEXT_1670 = ".add(";
  public static final String TEXT_1671 = ");";
  public static final String TEXT_1672 = "";
  public static final String TEXT_1673 = NL + "        return wasSet;" + NL + "      }" + NL + "    }" + NL + "    ";
  public static final String TEXT_1674 = ".";
  public static final String TEXT_1675 = "(this);" + NL + "    wasSet = true;";
  public static final String TEXT_1676 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1677 = "  /* Code from template association_SetOneToMandatoryMany_relatedSpecialization */" + NL;
  public static final String TEXT_1678 = "  public boolean ";
  public static final String TEXT_1679 = "_";
  public static final String TEXT_1680 = "(";
  public static final String TEXT_1681 = " ";
  public static final String TEXT_1682 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_1683 = NL + "    //Must provide ";
  public static final String TEXT_1684 = " to ";
  public static final String TEXT_1685 = NL + "    if (";
  public static final String TEXT_1686 = " == null)" + NL + "    {";
  public static final String TEXT_1687 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_1688 = "_One";
  public static final String TEXT_1689 = "() != null && ";
  public static final String TEXT_1690 = "_One";
  public static final String TEXT_1691 = "().";
  public static final String TEXT_1692 = "() <= ";
  public static final String TEXT_1693 = ".";
  public static final String TEXT_1694 = "_";
  public static final String TEXT_1695 = "())" + NL + "    {";
  public static final String TEXT_1696 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_1697 = " ";
  public static final String TEXT_1698 = " = ";
  public static final String TEXT_1699 = "_One";
  public static final String TEXT_1700 = "()";
  public static final String TEXT_1701 = "(";
  public static final String TEXT_1702 = ")";
  public static final String TEXT_1703 = ";";
  public static final String TEXT_1704 = NL + "    ";
  public static final String TEXT_1705 = " = ";
  public static final String TEXT_1706 = ";";
  public static final String TEXT_1707 = NL + "    ";
  public static final String TEXT_1708 = ".clear();" + NL + "    ";
  public static final String TEXT_1709 = ".add(";
  public static final String TEXT_1710 = ");";
  public static final String TEXT_1711 = NL + "    if (";
  public static final String TEXT_1712 = " != null && !";
  public static final String TEXT_1713 = ".equals(";
  public static final String TEXT_1714 = "))" + NL + "    {" + NL + "      boolean didRemove = ";
  public static final String TEXT_1715 = ".";
  public static final String TEXT_1716 = "(this);" + NL + "      if (!didRemove)" + NL + "      {";
  public static final String TEXT_1717 = NL + "        ";
  public static final String TEXT_1718 = " = ";
  public static final String TEXT_1719 = ";";
  public static final String TEXT_1720 = NL + "        ";
  public static final String TEXT_1721 = ".clear();" + NL + "        ";
  public static final String TEXT_1722 = ".add(";
  public static final String TEXT_1723 = ");";
  public static final String TEXT_1724 = "";
  public static final String TEXT_1725 = NL + "        return wasSet;" + NL + "      }" + NL + "    }";
  public static final String TEXT_1726 = NL + "    ";
  public static final String TEXT_1727 = ".";
  public static final String TEXT_1728 = "(this);";
  public static final String TEXT_1729 = NL + "    ";
  public static final String TEXT_1730 = "_One";
  public static final String TEXT_1731 = "().";
  public static final String TEXT_1732 = "(this);";
  public static final String TEXT_1733 = NL + "    wasSet = true;";
  public static final String TEXT_1734 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1735 = "  /* Code from template association_AddManyToOptionalOne_relatedSpecialization */" + NL;
  public static final String TEXT_1736 = "  public boolean ";
  public static final String TEXT_1737 = "(";
  public static final String TEXT_1738 = " ";
  public static final String TEXT_1739 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_1740 = NL + "    ";
  public static final String TEXT_1741 = " ";
  public static final String TEXT_1742 = " = ";
  public static final String TEXT_1743 = ".";
  public static final String TEXT_1744 = "_One";
  public static final String TEXT_1745 = "();";
  public static final String TEXT_1746 = NL + "    if (";
  public static final String TEXT_1747 = " == null)" + NL + "    {";
  public static final String TEXT_1748 = NL + "      ";
  public static final String TEXT_1749 = ".";
  public static final String TEXT_1750 = "(this);";
  public static final String TEXT_1751 = NL + "      ";
  public static final String TEXT_1752 = ".clear_";
  public static final String TEXT_1753 = "();" + NL + "      ";
  public static final String TEXT_1754 = ".";
  public static final String TEXT_1755 = "(this);";
  public static final String TEXT_1756 = NL + "    }" + NL + "    else if (!this.equals(";
  public static final String TEXT_1757 = "))" + NL + "    {" + NL + "      ";
  public static final String TEXT_1758 = ".";
  public static final String TEXT_1759 = "(";
  public static final String TEXT_1760 = ");" + NL + "      ";
  public static final String TEXT_1761 = "(";
  public static final String TEXT_1762 = ");" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      ";
  public static final String TEXT_1763 = ".add(";
  public static final String TEXT_1764 = ");" + NL + "    }";
  public static final String TEXT_1765 = NL + "    wasAdded = true;";
  public static final String TEXT_1766 = NL + "    return wasAdded;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_1767 = "(";
  public static final String TEXT_1768 = " ";
  public static final String TEXT_1769 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_1770 = NL + "    if (";
  public static final String TEXT_1771 = ".contains(";
  public static final String TEXT_1772 = "))" + NL + "    {";
  public static final String TEXT_1773 = NL + "      ";
  public static final String TEXT_1774 = ".remove(";
  public static final String TEXT_1775 = ");" + NL + "      ";
  public static final String TEXT_1776 = ".clear_";
  public static final String TEXT_1777 = "();" + NL + "      wasRemoved = true;";
  public static final String TEXT_1778 = NL + "    }";
  public static final String TEXT_1779 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_1780 = "  /* Code from template association_SetOptionalOneToMany_relatedSpecialization */" + NL;
  public static final String TEXT_1781 = "  public boolean ";
  public static final String TEXT_1782 = "_";
  public static final String TEXT_1783 = "(";
  public static final String TEXT_1784 = " ";
  public static final String TEXT_1785 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_1786 = NL + "    ";
  public static final String TEXT_1787 = " ";
  public static final String TEXT_1788 = " = ";
  public static final String TEXT_1789 = "_One";
  public static final String TEXT_1790 = "()";
  public static final String TEXT_1791 = "(";
  public static final String TEXT_1792 = ")";
  public static final String TEXT_1793 = ";";
  public static final String TEXT_1794 = NL + "    ";
  public static final String TEXT_1795 = " = ";
  public static final String TEXT_1796 = ";";
  public static final String TEXT_1797 = NL + "    ";
  public static final String TEXT_1798 = ".clear();" + NL + "    ";
  public static final String TEXT_1799 = ".add(";
  public static final String TEXT_1800 = ");";
  public static final String TEXT_1801 = NL + "    if (";
  public static final String TEXT_1802 = " != null && !";
  public static final String TEXT_1803 = ".equals(";
  public static final String TEXT_1804 = "))" + NL + "    {" + NL + "      ";
  public static final String TEXT_1805 = ".";
  public static final String TEXT_1806 = "(this);" + NL + "    }" + NL + "    if (";
  public static final String TEXT_1807 = " != null)" + NL + "    {" + NL + "      ";
  public static final String TEXT_1808 = ".";
  public static final String TEXT_1809 = "(this);" + NL + "    }" + NL + "    wasSet = true;";
  public static final String TEXT_1810 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1811 = "  /* Code from template association_AddOptionalNToOptionalOne_relatedSpecialization */" + NL;
  public static final String TEXT_1812 = "  public boolean ";
  public static final String TEXT_1813 = "(";
  public static final String TEXT_1814 = " ";
  public static final String TEXT_1815 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_1816 = NL + "    if (";
  public static final String TEXT_1817 = "() >= ";
  public static final String TEXT_1818 = "_";
  public static final String TEXT_1819 = "())" + NL + "    {";
  public static final String TEXT_1820 = NL + "      return wasAdded;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_1821 = " ";
  public static final String TEXT_1822 = " = ";
  public static final String TEXT_1823 = ".";
  public static final String TEXT_1824 = "_One";
  public static final String TEXT_1825 = "();";
  public static final String TEXT_1826 = NL + "    if (";
  public static final String TEXT_1827 = " == null)" + NL + "    {" + NL + "      ";
  public static final String TEXT_1828 = ".";
  public static final String TEXT_1829 = "(this);" + NL + "    }" + NL + "    else if (!this.equals(";
  public static final String TEXT_1830 = "))" + NL + "    {" + NL + "      ";
  public static final String TEXT_1831 = ".";
  public static final String TEXT_1832 = "(";
  public static final String TEXT_1833 = ");" + NL + "      ";
  public static final String TEXT_1834 = "(";
  public static final String TEXT_1835 = ");" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      ";
  public static final String TEXT_1836 = ".add(";
  public static final String TEXT_1837 = ");" + NL + "    }";
  public static final String TEXT_1838 = NL + "    wasAdded = true;";
  public static final String TEXT_1839 = NL + "    return wasAdded;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_1840 = "(";
  public static final String TEXT_1841 = " ";
  public static final String TEXT_1842 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_1843 = NL + "    if (";
  public static final String TEXT_1844 = ".contains(";
  public static final String TEXT_1845 = "))" + NL + "    {";
  public static final String TEXT_1846 = NL + "      ";
  public static final String TEXT_1847 = ".remove(";
  public static final String TEXT_1848 = ");";
  public static final String TEXT_1849 = NL + "      ";
  public static final String TEXT_1850 = ".clear_";
  public static final String TEXT_1851 = "();" + NL + "      wasRemoved = true;" + NL + "    }";
  public static final String TEXT_1852 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_1853 = "  /* Code from template association_AddUnidirectionalMN_relatedSpecialization */" + NL;
  public static final String TEXT_1854 = "  public boolean ";
  public static final String TEXT_1855 = "(";
  public static final String TEXT_1856 = " ";
  public static final String TEXT_1857 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_1858 = NL + "    if (";
  public static final String TEXT_1859 = "() < ";
  public static final String TEXT_1860 = "_";
  public static final String TEXT_1861 = "())" + NL + "    {";
  public static final String TEXT_1862 = NL + "      ";
  public static final String TEXT_1863 = ".add(";
  public static final String TEXT_1864 = ");";
  public static final String TEXT_1865 = NL + "      wasAdded = true;" + NL + "    }";
  public static final String TEXT_1866 = NL + "    return wasAdded;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_1867 = "(";
  public static final String TEXT_1868 = " ";
  public static final String TEXT_1869 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_1870 = NL + "    if (!";
  public static final String TEXT_1871 = ".contains(";
  public static final String TEXT_1872 = "))" + NL + "    {";
  public static final String TEXT_1873 = NL + "      return wasRemoved;" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_1874 = "() <= ";
  public static final String TEXT_1875 = "_";
  public static final String TEXT_1876 = "())" + NL + "    {";
  public static final String TEXT_1877 = NL + "      return wasRemoved;" + NL + "    }";
  public static final String TEXT_1878 = NL + NL + "    ";
  public static final String TEXT_1879 = ".remove(";
  public static final String TEXT_1880 = ");";
  public static final String TEXT_1881 = NL + "    wasRemoved = true;";
  public static final String TEXT_1882 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_1883 = "  /* Code from template association_AddMNToOptionalOne_relatedSpecialization */" + NL;
  public static final String TEXT_1884 = "  public boolean ";
  public static final String TEXT_1885 = "(";
  public static final String TEXT_1886 = " ";
  public static final String TEXT_1887 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_1888 = "";
  public static final String TEXT_1889 = NL + "    if (";
  public static final String TEXT_1890 = "() >= ";
  public static final String TEXT_1891 = "_";
  public static final String TEXT_1892 = "())" + NL + "    {";
  public static final String TEXT_1893 = NL + "      return wasAdded;" + NL + "    }";
  public static final String TEXT_1894 = NL + "    ";
  public static final String TEXT_1895 = " ";
  public static final String TEXT_1896 = " = ";
  public static final String TEXT_1897 = ".";
  public static final String TEXT_1898 = "_One";
  public static final String TEXT_1899 = "();" + NL + "    if (";
  public static final String TEXT_1900 = " != null && ";
  public static final String TEXT_1901 = ".";
  public static final String TEXT_1902 = "() <= ";
  public static final String TEXT_1903 = "_";
  public static final String TEXT_1904 = "())" + NL + "    {";
  public static final String TEXT_1905 = NL + "      return wasAdded;" + NL + "    }" + NL + "    else if (";
  public static final String TEXT_1906 = " != null)" + NL + "    {" + NL + "      ";
  public static final String TEXT_1907 = ".";
  public static final String TEXT_1908 = ".remove(";
  public static final String TEXT_1909 = ");" + NL + "    }";
  public static final String TEXT_1910 = NL + "    ";
  public static final String TEXT_1911 = ".add(";
  public static final String TEXT_1912 = ");";
  public static final String TEXT_1913 = NL + "    ";
  public static final String TEXT_1914 = "(";
  public static final String TEXT_1915 = ",this);" + NL + "    wasAdded = true;";
  public static final String TEXT_1916 = NL + "    return wasAdded;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_1917 = "(";
  public static final String TEXT_1918 = " ";
  public static final String TEXT_1919 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_1920 = NL + "    if (";
  public static final String TEXT_1921 = ".contains(";
  public static final String TEXT_1922 = ") && ";
  public static final String TEXT_1923 = "() > ";
  public static final String TEXT_1924 = "_";
  public static final String TEXT_1925 = "())" + NL + "    {";
  public static final String TEXT_1926 = NL + "      ";
  public static final String TEXT_1927 = ".remove(";
  public static final String TEXT_1928 = ");";
  public static final String TEXT_1929 = NL + "      ";
  public static final String TEXT_1930 = "(";
  public static final String TEXT_1931 = ",null);" + NL + "      wasRemoved = true;" + NL + "    }";
  public static final String TEXT_1932 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_1933 = "  /* Code from template association_SetNToOptionalOne_relatedSpecialization */" + NL;
  public static final String TEXT_1934 = "  public boolean ";
  public static final String TEXT_1935 = "_";
  public static final String TEXT_1936 = "(";
  public static final String TEXT_1937 = "... ";
  public static final String TEXT_1938 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_1939 = NL + "    ArrayList<";
  public static final String TEXT_1940 = "> ";
  public static final String TEXT_1941 = " = new ArrayList<";
  public static final String TEXT_1942 = ">();" + NL + "    for (";
  public static final String TEXT_1943 = " ";
  public static final String TEXT_1944 = " : ";
  public static final String TEXT_1945 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_1946 = ".contains(";
  public static final String TEXT_1947 = "))" + NL + "      {";
  public static final String TEXT_1948 = NL + "        return wasSet;" + NL + "      }" + NL + "      else if (";
  public static final String TEXT_1949 = ".";
  public static final String TEXT_1950 = "_One";
  public static final String TEXT_1951 = "() != null && !this.equals(";
  public static final String TEXT_1952 = ".";
  public static final String TEXT_1953 = "_One";
  public static final String TEXT_1954 = "()))" + NL + "      {";
  public static final String TEXT_1955 = NL + "        return wasSet;" + NL + "      }" + NL + "      ";
  public static final String TEXT_1956 = ".add(";
  public static final String TEXT_1957 = ");" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_1958 = ".size() != ";
  public static final String TEXT_1959 = "_";
  public static final String TEXT_1960 = "())" + NL + "    {";
  public static final String TEXT_1961 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_1962 = ".removeAll(";
  public static final String TEXT_1963 = ");" + NL + "    " + NL + "    for (";
  public static final String TEXT_1964 = " orphan : ";
  public static final String TEXT_1965 = "_";
  public static final String TEXT_1966 = "())" + NL + "    {" + NL + "      ";
  public static final String TEXT_1967 = "_";
  public static final String TEXT_1968 = "(orphan, null);" + NL + "    }" + NL + "    ";
  public static final String TEXT_1969 = ".clear();" + NL + "    for (";
  public static final String TEXT_1970 = " ";
  public static final String TEXT_1971 = " : ";
  public static final String TEXT_1972 = ")" + NL + "    {" + NL + "      ";
  public static final String TEXT_1973 = "_";
  public static final String TEXT_1974 = "(";
  public static final String TEXT_1975 = ", this);" + NL + "      ";
  public static final String TEXT_1976 = ".add(";
  public static final String TEXT_1977 = ");" + NL + "    }" + NL + "    wasSet = true;";
  public static final String TEXT_1978 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_1979 = "  /* Code from template association_AddUnidirectionalMany_relatedSpecialization */" + NL;
  public static final String TEXT_1980 = "  public boolean ";
  public static final String TEXT_1981 = "(";
  public static final String TEXT_1982 = " ";
  public static final String TEXT_1983 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_1984 = NL + "    ";
  public static final String TEXT_1985 = ".add(";
  public static final String TEXT_1986 = ");";
  public static final String TEXT_1987 = NL + "    wasAdded = true;";
  public static final String TEXT_1988 = NL + "    return wasAdded;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_1989 = "(";
  public static final String TEXT_1990 = " ";
  public static final String TEXT_1991 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_1992 = NL + "    if (";
  public static final String TEXT_1993 = ".contains(";
  public static final String TEXT_1994 = "))" + NL + "    {";
  public static final String TEXT_1995 = NL + "      ";
  public static final String TEXT_1996 = ".remove(";
  public static final String TEXT_1997 = ");";
  public static final String TEXT_1998 = NL + "      wasRemoved = true;" + NL + "    }";
  public static final String TEXT_1999 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_2000 = "  /* Code from template association_AddUnidirectionalOptionalN_relatedSpecialization */" + NL;
  public static final String TEXT_2001 = "  public boolean ";
  public static final String TEXT_2002 = "(";
  public static final String TEXT_2003 = " ";
  public static final String TEXT_2004 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_2005 = NL + "    if (";
  public static final String TEXT_2006 = "() < ";
  public static final String TEXT_2007 = "_";
  public static final String TEXT_2008 = "())" + NL + "    {";
  public static final String TEXT_2009 = NL + "      ";
  public static final String TEXT_2010 = ".add(";
  public static final String TEXT_2011 = ");";
  public static final String TEXT_2012 = NL + "      wasAdded = true;" + NL + "    }";
  public static final String TEXT_2013 = NL + "    return wasAdded;" + NL + "  }" + NL;
  public static final String TEXT_2014 = NL + "  public boolean ";
  public static final String TEXT_2015 = "(";
  public static final String TEXT_2016 = " ";
  public static final String TEXT_2017 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_2018 = NL + "    if (";
  public static final String TEXT_2019 = ".contains(";
  public static final String TEXT_2020 = "))" + NL + "    {";
  public static final String TEXT_2021 = NL + "      ";
  public static final String TEXT_2022 = ".remove(";
  public static final String TEXT_2023 = ");";
  public static final String TEXT_2024 = NL + "      wasRemoved = true;" + NL + "    }";
  public static final String TEXT_2025 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_2026 = "  /* Code from template association_AddUnidirectionalMStar_relatedSpecialization */" + NL;
  public static final String TEXT_2027 = "  public boolean ";
  public static final String TEXT_2028 = "(";
  public static final String TEXT_2029 = " ";
  public static final String TEXT_2030 = ")" + NL + "  {" + NL + "    boolean wasAdded = false;";
  public static final String TEXT_2031 = NL + "    ";
  public static final String TEXT_2032 = ".add(";
  public static final String TEXT_2033 = ");";
  public static final String TEXT_2034 = NL + "    wasAdded = true;";
  public static final String TEXT_2035 = NL + "    return wasAdded;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_2036 = "(";
  public static final String TEXT_2037 = " ";
  public static final String TEXT_2038 = ")" + NL + "  {" + NL + "    boolean wasRemoved = false;";
  public static final String TEXT_2039 = NL + "    if (!";
  public static final String TEXT_2040 = ".contains(";
  public static final String TEXT_2041 = "))" + NL + "    {";
  public static final String TEXT_2042 = NL + "      return wasRemoved;" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_2043 = "() <= ";
  public static final String TEXT_2044 = "_";
  public static final String TEXT_2045 = "())" + NL + "    {";
  public static final String TEXT_2046 = NL + "      return wasRemoved;" + NL + "    }";
  public static final String TEXT_2047 = NL + NL + "    ";
  public static final String TEXT_2048 = ".remove(";
  public static final String TEXT_2049 = ");";
  public static final String TEXT_2050 = NL + "    wasRemoved = true;";
  public static final String TEXT_2051 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  public static final String TEXT_2052 = "  /* Code from template association_SetUnidirectionalN_relatedSpecialization */";
  public static final String TEXT_2053 = NL + "  ";
  public static final String TEXT_2054 = " boolean ";
  public static final String TEXT_2055 = "(";
  public static final String TEXT_2056 = "... ";
  public static final String TEXT_2057 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_2058 = NL + "    ArrayList<";
  public static final String TEXT_2059 = "> ";
  public static final String TEXT_2060 = " = new ArrayList<";
  public static final String TEXT_2061 = ">();" + NL + "    for (";
  public static final String TEXT_2062 = " ";
  public static final String TEXT_2063 = " : ";
  public static final String TEXT_2064 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_2065 = ".contains(";
  public static final String TEXT_2066 = "))" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      ";
  public static final String TEXT_2067 = ".add(";
  public static final String TEXT_2068 = ");" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_2069 = ".size() != ";
  public static final String TEXT_2070 = ".length || ";
  public static final String TEXT_2071 = ".size() != ";
  public static final String TEXT_2072 = "_";
  public static final String TEXT_2073 = "())" + NL + "    {";
  public static final String TEXT_2074 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_2075 = ".clear();" + NL + "    ";
  public static final String TEXT_2076 = ".addAll(";
  public static final String TEXT_2077 = ");" + NL + "    wasSet = true;";
  public static final String TEXT_2078 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_2079 = "  /* Code from template association_SetUnidirectionalMany_relatedSpecialization */";
  public static final String TEXT_2080 = NL + "  ";
  public static final String TEXT_2081 = " boolean ";
  public static final String TEXT_2082 = "(";
  public static final String TEXT_2083 = "... ";
  public static final String TEXT_2084 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_2085 = NL + "    ArrayList<";
  public static final String TEXT_2086 = "> ";
  public static final String TEXT_2087 = " = new ArrayList<";
  public static final String TEXT_2088 = ">();" + NL + "    for (";
  public static final String TEXT_2089 = " ";
  public static final String TEXT_2090 = " : ";
  public static final String TEXT_2091 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_2092 = ".contains(";
  public static final String TEXT_2093 = "))" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      ";
  public static final String TEXT_2094 = ".add(";
  public static final String TEXT_2095 = ");" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_2096 = ".size() != ";
  public static final String TEXT_2097 = ".length)" + NL + "    {";
  public static final String TEXT_2098 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_2099 = ".clear();" + NL + "    ";
  public static final String TEXT_2100 = ".addAll(";
  public static final String TEXT_2101 = ");" + NL + "    wasSet = true;";
  public static final String TEXT_2102 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_2103 = "  /* Code from template association_SetOptionalOneToMandatoryMany_relatedSpecialization */" + NL;
  public static final String TEXT_2104 = "  public boolean ";
  public static final String TEXT_2105 = "_";
  public static final String TEXT_2106 = "(";
  public static final String TEXT_2107 = " ";
  public static final String TEXT_2108 = ")" + NL + "  {" + NL + "    //" + NL + "    // This source of this source generation is association_SetOptionalOneToMandatoryMany.jet" + NL + "    // This set file assumes the generation of a maximumNumberOfXXX method does not exist because " + NL + "    // it's not required (No upper bound)" + NL + "    //   " + NL + "    boolean wasSet = false;" + NL + "    ";
  public static final String TEXT_2109 = " ";
  public static final String TEXT_2110 = " = ";
  public static final String TEXT_2111 = "_One";
  public static final String TEXT_2112 = "()";
  public static final String TEXT_2113 = "(";
  public static final String TEXT_2114 = ")";
  public static final String TEXT_2115 = ";" + NL + NL + "    if (";
  public static final String TEXT_2116 = " == null)" + NL + "    {" + NL + "      if (";
  public static final String TEXT_2117 = " != null)" + NL + "      {" + NL + "        if (";
  public static final String TEXT_2118 = ".";
  public static final String TEXT_2119 = "(this))" + NL + "        {" + NL + "          ";
  public static final String TEXT_2120 = " = ";
  public static final String TEXT_2121 = ";" + NL + "          wasSet = true;" + NL + "        }" + NL + "      }" + NL + "    } " + NL + "    else if (";
  public static final String TEXT_2122 = " != null)" + NL + "    {" + NL + "      if (";
  public static final String TEXT_2123 = " == null)" + NL + "      {" + NL + "        if (";
  public static final String TEXT_2124 = ".";
  public static final String TEXT_2125 = "_";
  public static final String TEXT_2126 = "() < ";
  public static final String TEXT_2127 = ".";
  public static final String TEXT_2128 = "())" + NL + "        {" + NL + "          ";
  public static final String TEXT_2129 = ".";
  public static final String TEXT_2130 = "(this);" + NL + "          ";
  public static final String TEXT_2131 = " = ";
  public static final String TEXT_2132 = ";  // ";
  public static final String TEXT_2133 = " == null" + NL + "          wasSet = true;" + NL + "        }" + NL + "      } " + NL + "      else" + NL + "      {" + NL + "        if (";
  public static final String TEXT_2134 = ".";
  public static final String TEXT_2135 = "_";
  public static final String TEXT_2136 = "() < ";
  public static final String TEXT_2137 = ".";
  public static final String TEXT_2138 = "())" + NL + "        {" + NL + "          ";
  public static final String TEXT_2139 = ".";
  public static final String TEXT_2140 = "(this);" + NL + "          ";
  public static final String TEXT_2141 = ".";
  public static final String TEXT_2142 = "(this);" + NL + "          ";
  public static final String TEXT_2143 = " = ";
  public static final String TEXT_2144 = ";" + NL + "          wasSet = true;" + NL + "        }" + NL + "      }" + NL + "    }" + NL + "    if (wasSet)" + NL + "    {" + NL + "      ";
  public static final String TEXT_2145 = " = ";
  public static final String TEXT_2146 = ";" + NL + "    }" + NL + "    return wasSet;" + NL + "  }" + NL + "  ";
  public static final String TEXT_2147 = NL + "//  public boolean ";
  public static final String TEXT_2148 = "_";
  public static final String TEXT_2149 = "(";
  public static final String TEXT_2150 = " ";
  public static final String TEXT_2151 = ")" + NL + "//  {" + NL + "//    //" + NL + "//    // The source of the code generation is association_SetOptionalOneToMN.jet" + NL + "//    // (this) set file assumes the generation of a maximumNumberOfXXX " + NL + "//    //   method ";
  public static final String TEXT_2152 = NL + "//    // Currently this will not compile due to Issue351 - the template code is fine." + NL + "//    //" + NL + "//" + NL + "//    boolean wasSet = false;" + NL + "//    ";
  public static final String TEXT_2153 = " ";
  public static final String TEXT_2154 = " = ";
  public static final String TEXT_2155 = "_One";
  public static final String TEXT_2156 = "()";
  public static final String TEXT_2157 = "(";
  public static final String TEXT_2158 = ")";
  public static final String TEXT_2159 = ";" + NL + "//  " + NL + "//    if (";
  public static final String TEXT_2160 = " == null)" + NL + "//    {  " + NL + "//      if (";
  public static final String TEXT_2161 = " != null)" + NL + "//      { " + NL + "//        if (";
  public static final String TEXT_2162 = ".";
  public static final String TEXT_2163 = "(this))" + NL + "//          ";
  public static final String TEXT_2164 = " = ";
  public static final String TEXT_2165 = ";" + NL + "//          wasSet = true;" + NL + "//        }" + NL + "//      }" + NL + "//    }" + NL + "//    else" + NL + "//    {" + NL + "//      if (";
  public static final String TEXT_2166 = " != null)" + NL + "//      {" + NL + "//        if (";
  public static final String TEXT_2167 = " == null)" + NL + "//        {" + NL + "//          if (";
  public static final String TEXT_2168 = ".";
  public static final String TEXT_2169 = " < ";
  public static final String TEXT_2170 = ".";
  public static final String TEXT_2171 = ")" + NL + "//            ";
  public static final String TEXT_2172 = ".";
  public static final String TEXT_2173 = "(this);" + NL + "//            ";
  public static final String TEXT_2174 = " = ";
  public static final String TEXT_2175 = "  // ";
  public static final String TEXT_2176 = " == null;" + NL + "//            wasSet = true;" + NL + "//        }" + NL + "//      }" + NL + "//      else" + NL + "//      {" + NL + "//        if (   ";
  public static final String TEXT_2177 = ".";
  public static final String TEXT_2178 = " < ";
  public static final String TEXT_2179 = ".";
  public static final String TEXT_2180 = "()" + NL + "//            && ";
  public static final String TEXT_2181 = ".";
  public static final String TEXT_2182 = " > ";
  public static final String TEXT_2183 = ".";
  public static final String TEXT_2184 = "()" + NL + "//           )" + NL + "//          ";
  public static final String TEXT_2185 = ".";
  public static final String TEXT_2186 = "(this);" + NL + "//          ";
  public static final String TEXT_2187 = ".";
  public static final String TEXT_2188 = "(this);" + NL + "//          ";
  public static final String TEXT_2189 = " = ";
  public static final String TEXT_2190 = ";" + NL + "//          wasSet = true;" + NL + "//        }" + NL + "//      }" + NL + "//    }" + NL + "//    " + NL + "//    if (wasSet)" + NL + "//    {" + NL + "//      ";
  public static final String TEXT_2191 = " = ";
  public static final String TEXT_2192 = ";" + NL + "//    }" + NL + "//    " + NL + "//    return wasSet;" + NL + "//  }";
  public static final String TEXT_2193 = "  /* Code from template association_SetMNToMany_relatedSpecialization */" + NL;
  public static final String TEXT_2194 = "  public boolean ";
  public static final String TEXT_2195 = "_";
  public static final String TEXT_2196 = "(";
  public static final String TEXT_2197 = "... ";
  public static final String TEXT_2198 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_2199 = NL + "    ArrayList<";
  public static final String TEXT_2200 = "> ";
  public static final String TEXT_2201 = " = new ArrayList<";
  public static final String TEXT_2202 = ">();" + NL + "    for (";
  public static final String TEXT_2203 = " ";
  public static final String TEXT_2204 = " : ";
  public static final String TEXT_2205 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_2206 = ".contains(";
  public static final String TEXT_2207 = "))" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      ";
  public static final String TEXT_2208 = ".add(";
  public static final String TEXT_2209 = ");" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_2210 = ".size() != ";
  public static final String TEXT_2211 = ".length || ";
  public static final String TEXT_2212 = ".size() < ";
  public static final String TEXT_2213 = "_";
  public static final String TEXT_2214 = "() || ";
  public static final String TEXT_2215 = ".size() > ";
  public static final String TEXT_2216 = "_";
  public static final String TEXT_2217 = "())" + NL + "    {";
  public static final String TEXT_2218 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ArrayList<";
  public static final String TEXT_2219 = "> ";
  public static final String TEXT_2220 = " = new ArrayList<";
  public static final String TEXT_2221 = ">(";
  public static final String TEXT_2222 = "_";
  public static final String TEXT_2223 = "());" + NL + "    ";
  public static final String TEXT_2224 = ".clear();" + NL + "    for (";
  public static final String TEXT_2225 = " ";
  public static final String TEXT_2226 = " : ";
  public static final String TEXT_2227 = ")" + NL + "    {" + NL + "      ";
  public static final String TEXT_2228 = ".add(";
  public static final String TEXT_2229 = ");" + NL + "      if (";
  public static final String TEXT_2230 = ".contains(";
  public static final String TEXT_2231 = "))" + NL + "      {" + NL + "        ";
  public static final String TEXT_2232 = ".remove(";
  public static final String TEXT_2233 = ");" + NL + "      }" + NL + "      else" + NL + "      {" + NL + "        ";
  public static final String TEXT_2234 = ".";
  public static final String TEXT_2235 = "(this);" + NL + "      }" + NL + "    }" + NL + NL + "    for (";
  public static final String TEXT_2236 = " ";
  public static final String TEXT_2237 = " : ";
  public static final String TEXT_2238 = ")" + NL + "    {" + NL + "      ";
  public static final String TEXT_2239 = ".";
  public static final String TEXT_2240 = "(this);" + NL + "    }" + NL + "    wasSet = true;";
  public static final String TEXT_2241 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_2242 = "  /* Code from template association_SetMStarToMany_relatedSpecialization */" + NL;
  public static final String TEXT_2243 = "  public boolean ";
  public static final String TEXT_2244 = "_";
  public static final String TEXT_2245 = "(";
  public static final String TEXT_2246 = "... ";
  public static final String TEXT_2247 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_2248 = NL + "    ArrayList<";
  public static final String TEXT_2249 = "> ";
  public static final String TEXT_2250 = " = new ArrayList<";
  public static final String TEXT_2251 = ">();" + NL + "    for (";
  public static final String TEXT_2252 = " ";
  public static final String TEXT_2253 = " : ";
  public static final String TEXT_2254 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_2255 = ".contains(";
  public static final String TEXT_2256 = "))" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      ";
  public static final String TEXT_2257 = ".add(";
  public static final String TEXT_2258 = ");" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_2259 = ".size() != ";
  public static final String TEXT_2260 = ".length || ";
  public static final String TEXT_2261 = ".size() < ";
  public static final String TEXT_2262 = "_";
  public static final String TEXT_2263 = "())" + NL + "    {";
  public static final String TEXT_2264 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ArrayList<";
  public static final String TEXT_2265 = "> ";
  public static final String TEXT_2266 = " = new ArrayList<";
  public static final String TEXT_2267 = ">(";
  public static final String TEXT_2268 = "_";
  public static final String TEXT_2269 = "());" + NL + "    ";
  public static final String TEXT_2270 = ".clear();" + NL + "    for (";
  public static final String TEXT_2271 = " ";
  public static final String TEXT_2272 = " : ";
  public static final String TEXT_2273 = ")" + NL + "    {" + NL + "      ";
  public static final String TEXT_2274 = ".add(";
  public static final String TEXT_2275 = ");" + NL + "      if (";
  public static final String TEXT_2276 = ".contains(";
  public static final String TEXT_2277 = "))" + NL + "      {" + NL + "        ";
  public static final String TEXT_2278 = ".remove(";
  public static final String TEXT_2279 = ");" + NL + "      }" + NL + "      else" + NL + "      {" + NL + "        ";
  public static final String TEXT_2280 = ".";
  public static final String TEXT_2281 = "(this);" + NL + "      }" + NL + "    }" + NL + NL + "    for (";
  public static final String TEXT_2282 = " ";
  public static final String TEXT_2283 = " : ";
  public static final String TEXT_2284 = ")" + NL + "    {" + NL + "      ";
  public static final String TEXT_2285 = ".";
  public static final String TEXT_2286 = "(this);" + NL + "    }" + NL + "    wasSet = true;";
  public static final String TEXT_2287 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_2288 = "  /* Code from template association_SetUnidirectionalMN_relatedSpecialization */";
  public static final String TEXT_2289 = NL + "  ";
  public static final String TEXT_2290 = " boolean ";
  public static final String TEXT_2291 = "(";
  public static final String TEXT_2292 = "... ";
  public static final String TEXT_2293 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_2294 = NL + "    ArrayList<";
  public static final String TEXT_2295 = "> ";
  public static final String TEXT_2296 = " = new ArrayList<";
  public static final String TEXT_2297 = ">();" + NL + "    for (";
  public static final String TEXT_2298 = " ";
  public static final String TEXT_2299 = " : ";
  public static final String TEXT_2300 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_2301 = ".contains(";
  public static final String TEXT_2302 = "))" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      ";
  public static final String TEXT_2303 = ".add(";
  public static final String TEXT_2304 = ");" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_2305 = ".size() != ";
  public static final String TEXT_2306 = ".length || ";
  public static final String TEXT_2307 = ".size() < ";
  public static final String TEXT_2308 = "_";
  public static final String TEXT_2309 = "() || ";
  public static final String TEXT_2310 = ".size() > ";
  public static final String TEXT_2311 = "_";
  public static final String TEXT_2312 = "())" + NL + "    {";
  public static final String TEXT_2313 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_2314 = ".clear();" + NL + "    ";
  public static final String TEXT_2315 = ".addAll(";
  public static final String TEXT_2316 = ");" + NL + "    wasSet = true;";
  public static final String TEXT_2317 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_2318 = "  /* Code from template association_SetMNToOptionalOne_relatedSpecialization */";
  public static final String TEXT_2319 = NL + "  public boolean ";
  public static final String TEXT_2320 = "_";
  public static final String TEXT_2321 = "(";
  public static final String TEXT_2322 = "... ";
  public static final String TEXT_2323 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_2324 = NL + "    if (";
  public static final String TEXT_2325 = ".length < ";
  public static final String TEXT_2326 = "_";
  public static final String TEXT_2327 = "()";
  public static final String TEXT_2328 = ")" + NL + "    {";
  public static final String TEXT_2329 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ArrayList<";
  public static final String TEXT_2330 = "> ";
  public static final String TEXT_2331 = " = new ArrayList<";
  public static final String TEXT_2332 = ">();" + NL + "    HashMap<";
  public static final String TEXT_2333 = ",Integer> ";
  public static final String TEXT_2334 = " = new HashMap<";
  public static final String TEXT_2335 = ",Integer>();" + NL + "    for (";
  public static final String TEXT_2336 = " ";
  public static final String TEXT_2337 = " : ";
  public static final String TEXT_2338 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_2339 = ".contains(";
  public static final String TEXT_2340 = "))" + NL + "      {";
  public static final String TEXT_2341 = NL + "        return wasSet;" + NL + "      }" + NL + "      else if (";
  public static final String TEXT_2342 = ".";
  public static final String TEXT_2343 = "(";
  public static final String TEXT_2344 = "0";
  public static final String TEXT_2345 = ") != null && !this.equals(";
  public static final String TEXT_2346 = ".";
  public static final String TEXT_2347 = "(";
  public static final String TEXT_2348 = "0";
  public static final String TEXT_2349 = ")))" + NL + "      {" + NL + "        ";
  public static final String TEXT_2350 = " ";
  public static final String TEXT_2351 = " = ";
  public static final String TEXT_2352 = ".";
  public static final String TEXT_2353 = "(";
  public static final String TEXT_2354 = "0";
  public static final String TEXT_2355 = ");" + NL + "        if (!";
  public static final String TEXT_2356 = ".containsKey(";
  public static final String TEXT_2357 = "))" + NL + "        {" + NL + "          ";
  public static final String TEXT_2358 = ".put(";
  public static final String TEXT_2359 = ", Integer.valueOf(";
  public static final String TEXT_2360 = ".";
  public static final String TEXT_2361 = "()));" + NL + "        }" + NL + "        Integer currentCount = ";
  public static final String TEXT_2362 = ".get(";
  public static final String TEXT_2363 = ");" + NL + "        int nextCount = currentCount - 1;" + NL + "        if (nextCount < ";
  public static final String TEXT_2364 = ")" + NL + "        {";
  public static final String TEXT_2365 = NL + "          return wasSet;" + NL + "        }" + NL + "        ";
  public static final String TEXT_2366 = ".put(";
  public static final String TEXT_2367 = ", Integer.valueOf(nextCount));" + NL + "      }" + NL + "      ";
  public static final String TEXT_2368 = ".add(";
  public static final String TEXT_2369 = ");" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_2370 = ".removeAll(";
  public static final String TEXT_2371 = ");" + NL + NL + "    for (";
  public static final String TEXT_2372 = " orphan : ";
  public static final String TEXT_2373 = "_";
  public static final String TEXT_2374 = "())" + NL + "    {" + NL + "      ";
  public static final String TEXT_2375 = "_";
  public static final String TEXT_2376 = "(orphan, null);" + NL + "    }" + NL + "    ";
  public static final String TEXT_2377 = ".clear();" + NL + "    for (";
  public static final String TEXT_2378 = " ";
  public static final String TEXT_2379 = " : ";
  public static final String TEXT_2380 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_2381 = ".";
  public static final String TEXT_2382 = "(";
  public static final String TEXT_2383 = "0";
  public static final String TEXT_2384 = ") != null)" + NL + "      {" + NL + "        ";
  public static final String TEXT_2385 = ".";
  public static final String TEXT_2386 = "(";
  public static final String TEXT_2387 = "0";
  public static final String TEXT_2388 = ").";
  public static final String TEXT_2389 = ".remove(";
  public static final String TEXT_2390 = ");" + NL + "      }" + NL + "      ";
  public static final String TEXT_2391 = "_";
  public static final String TEXT_2392 = "(";
  public static final String TEXT_2393 = ", this);" + NL + "      ";
  public static final String TEXT_2394 = ".add(";
  public static final String TEXT_2395 = ");" + NL + "    }" + NL + "    wasSet = true;";
  public static final String TEXT_2396 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_2397 = "  /* Code from template association_SetUnidirectionalOptionalN_relatedSpecialization */";
  public static final String TEXT_2398 = NL + "  ";
  public static final String TEXT_2399 = " boolean ";
  public static final String TEXT_2400 = "(";
  public static final String TEXT_2401 = "... ";
  public static final String TEXT_2402 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_2403 = NL + "    ArrayList<";
  public static final String TEXT_2404 = "> ";
  public static final String TEXT_2405 = " = new ArrayList<";
  public static final String TEXT_2406 = ">();" + NL + "    for (";
  public static final String TEXT_2407 = " ";
  public static final String TEXT_2408 = " : ";
  public static final String TEXT_2409 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_2410 = ".contains(";
  public static final String TEXT_2411 = "))" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      ";
  public static final String TEXT_2412 = ".add(";
  public static final String TEXT_2413 = ");" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_2414 = ".size() != ";
  public static final String TEXT_2415 = ".length || ";
  public static final String TEXT_2416 = ".size() > ";
  public static final String TEXT_2417 = "_";
  public static final String TEXT_2418 = "())" + NL + "    {";
  public static final String TEXT_2419 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_2420 = ".clear();" + NL + "    ";
  public static final String TEXT_2421 = ".addAll(";
  public static final String TEXT_2422 = ");" + NL + "    wasSet = true;";
  public static final String TEXT_2423 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_2424 = "  /* Code from template association_SetUnidirectionalMStar_relatedSpecialization */";
  public static final String TEXT_2425 = NL + "  ";
  public static final String TEXT_2426 = " boolean ";
  public static final String TEXT_2427 = "(";
  public static final String TEXT_2428 = "... ";
  public static final String TEXT_2429 = ")" + NL + "  {" + NL + "    boolean wasSet = false;";
  public static final String TEXT_2430 = NL + "    ArrayList<";
  public static final String TEXT_2431 = "> ";
  public static final String TEXT_2432 = " = new ArrayList<";
  public static final String TEXT_2433 = ">();" + NL + "    for (";
  public static final String TEXT_2434 = " ";
  public static final String TEXT_2435 = " : ";
  public static final String TEXT_2436 = ")" + NL + "    {" + NL + "      if (";
  public static final String TEXT_2437 = ".contains(";
  public static final String TEXT_2438 = "))" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      ";
  public static final String TEXT_2439 = ".add(";
  public static final String TEXT_2440 = ");" + NL + "    }" + NL + NL + "    if (";
  public static final String TEXT_2441 = ".size() != ";
  public static final String TEXT_2442 = ".length || ";
  public static final String TEXT_2443 = ".size() < ";
  public static final String TEXT_2444 = "_";
  public static final String TEXT_2445 = "())" + NL + "    {";
  public static final String TEXT_2446 = NL + "      return wasSet;" + NL + "    }" + NL + NL + "    ";
  public static final String TEXT_2447 = ".clear();" + NL + "    ";
  public static final String TEXT_2448 = ".addAll(";
  public static final String TEXT_2449 = ");" + NL + "    wasSet = true;";
  public static final String TEXT_2450 = NL + "    return wasSet;" + NL + "  }" + NL;
  public static final String TEXT_2451 = "  /* Code from template association_AddIndexControlFunctions_relatedSpecialization */" + NL;
  public static final String TEXT_2452 = "  public boolean ";
  public static final String TEXT_2453 = "(";
  public static final String TEXT_2454 = " ";
  public static final String TEXT_2455 = ", int index)" + NL + "  {  " + NL + "    boolean wasAdded = false;" + NL + "    if(";
  public static final String TEXT_2456 = "(";
  public static final String TEXT_2457 = "))" + NL + "    {" + NL + "      if(index < 0 ) { index = 0; }" + NL + "      if(index > ";
  public static final String TEXT_2458 = "()) { index = ";
  public static final String TEXT_2459 = "() - 1; }";
  public static final String TEXT_2460 = NL + "      ";
  public static final String TEXT_2461 = ".remove(";
  public static final String TEXT_2462 = ");" + NL + "      ";
  public static final String TEXT_2463 = ".add(index, ";
  public static final String TEXT_2464 = ");";
  public static final String TEXT_2465 = NL + "      wasAdded = true;" + NL + "    }" + NL + "    return wasAdded;" + NL + "  }" + NL + NL + "  public boolean ";
  public static final String TEXT_2466 = "(";
  public static final String TEXT_2467 = " ";
  public static final String TEXT_2468 = ", int index)" + NL + "  {" + NL + "    boolean wasAdded = false;" + NL + "    if(";
  public static final String TEXT_2469 = ".contains(";
  public static final String TEXT_2470 = "))" + NL + "    {" + NL + "      if(index < 0 ) { index = 0; }" + NL + "      if(index > ";
  public static final String TEXT_2471 = "()) { index = ";
  public static final String TEXT_2472 = "() - 1; }";
  public static final String TEXT_2473 = NL + "      ";
  public static final String TEXT_2474 = ".remove(";
  public static final String TEXT_2475 = ");" + NL + "      ";
  public static final String TEXT_2476 = ".add(index, ";
  public static final String TEXT_2477 = ");";
  public static final String TEXT_2478 = NL + "      wasAdded = true;" + NL + "    } " + NL + "    else " + NL + "    {";
  public static final String TEXT_2479 = NL + "      wasAdded = ";
  public static final String TEXT_2480 = "(";
  public static final String TEXT_2481 = ", index);";
  public static final String TEXT_2482 = NL + "    }" + NL + "    return wasAdded;" + NL + "  }" + NL;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public JavaSpecGenerator()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}


  /**
   * Add a newline to the end of the input
   */
  // line 20 "../../../../../UmpleTLTemplates/JavaSpecGenerator.ump"
   private void appendln(StringBuilder buffer, String input, Object... variables){
    append(buffer, input + "\n", variables);
  }


  /**
   * This method will be used to append formatted strings
   * i.e. format("Hello {0} {1}", "andrew","forward");
   */
  // line 27 "../../../../../UmpleTLTemplates/JavaSpecGenerator.ump"
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
    
    /*JavaSpecGenerator*/
    /*UmpleNotice*/
    realSb.append(TEXT_0);
    realSb.append(TEXT_1);
    
    return realSb;
	} // end append
	
  public void getAssociationCode_specialization_reqSuperCode(JavaGenerator gen, String includeFile, String includeFile2, String includeFile3, StringBuilder realSb, AssociationVariable av, AssociationVariable relatedAssociation,
  		String customSetPrefixCode, String customSetPostfixCode, String customAddPrefixCode, String customAddPostfixCode, String customRemovePrefixCode, String customRemovePostfixCode,
  		String customSetManyPrefixCode, String customSetManyPostfixCode, List<TraceItem> traceItemAssocRemoves, List<TraceItem> traceItemAssocAdds, UmpleClass uClass, boolean sortMethodAdded, String umpleSourceFile,
  		Map<String,UncaughtException> uncaughtExceptions, UmpleClass globalUmpleClass, boolean addNewLine, boolean mulChangedToOne, boolean relMulChangedToOne, boolean mulChangedToN, boolean reqSetCode, boolean relReqCommonCode, boolean relReqSetCode, String scName) 
  	{ 
  	this.uncaughtExceptions = uncaughtExceptions;
  	this.globalUmpleClass = globalUmpleClass;
  
    realSb.append(TEXT_2);
    /*association_set_specialization_reqSuperCode*/
    
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
    
	  if (!relatedAssociation.getIsNavigable())
      {
        if (av.isOptionalOne())
        {
          includeFile = "specializationSkip.jet";
        }
        else if (av.isOnlyOne())
        {
          includeFile = "specializationSkip.jet";
        }
        else if (av.isMStar())
        {
          if (!av.isImmutable())
          {
            includeFile = "specializationSkip.jet";
          }
          includeFile2 = "association_SetUnidirectionalMStar_specialization.jet";
        }
        else if (av.isMN())
        {
          if (!av.isImmutable())
          {
            includeFile = "association_AddUnidirectionalMN_specialization.jet";
          }
          includeFile2 = "association_SetUnidirectionalMN_specialization.jet";
        }
        else if (av.isN())
        {
          includeFile = "association_SetUnidirectionalN_specialization.jet";
        }
        else if (av.isOptionalN())
        {
          if (!av.isImmutable())
          {
            includeFile = "association_AddUnidirectionalOptionalN_specialization.jet";
          }
          includeFile2 = "association_SetUnidirectionalOptionalN_specialization.jet";
        }
        else if (av.isImmutable() && av.isMany())
        {
          includeFile = "association_SetUnidirectionalMany_specialization.jet";
        }
        else if (av.isMany())
        {
          includeFile = "association_AddUnidirectionalMany_specialization.jet";
        }
      }
      else if (av.isOnlyOne() && relatedAssociation.isOnlyOne())
      {
        //ignore
      }  
      else if (av.isN() && relatedAssociation.isOptionalOne())
      { 
        includeFile = "association_SetNToOptionalOne_specialization.jet";
      }
      else if (av.isMN() && relatedAssociation.isOptionalOne())
      {
        includeFile = "association_AddMNToOptionalOne_specialization.jet";
        includeFile2 = "association_SetMNToOptionalOne_specialization.jet";
      }
      else if (av.isMandatoryMany() && av.isStar() && relatedAssociation.isMany())
      {
        hasIsNumberOfValidMethod = true;
        hasAddManyToManyTemplateMethod = true;
        includeFile = "association_AddMStarToMany_specialization.jet";
        includeFile2 = "association_SetMStarToMany_specialization.jet";
      }
      else if ((av.isMN() || av.isN()) && relatedAssociation.isMandatoryMany())
      {
        hasIsNumberOfValidMethod = true;
        hasAddManyToManyTemplateMethod = true;
        hasAddManyToManyTemplateMethod = true;
        includeFile = "association_AddMNToMany_specialization.jet";
        includeFile2 = "association_SetMNToMany_specialization.jet";
      }
      else if ((av.isMN() || av.isN()) && relatedAssociation.isOptionalN())
      {
        hasIsNumberOfValidMethod = true;
        hasAddManyToManyTemplateMethod = true;
        hasAddManyToManyTemplateMethod = true;
        includeFile = "association_AddMNToMany_specialization.jet";
      }
      else if ((av.isMN() || av.isN()) && !relatedAssociation.isOne())
      {
        hasIsNumberOfValidMethod = true;
        hasAddManyToManyTemplateMethod = true;
        includeFile = "association_AddMNToMany_specialization.jet";
        includeFile2 = "association_SetMNToMany_specialization.jet";
      }
      else if (av.isOptionalOne() && relatedAssociation.isOptionalOne())
      {
        includeFile = "specializationSkip.jet";
      }
      else if (av.isOptionalOne() && relatedAssociation.isOne())
      {
        includeFile = "specializationSkip.jet";
      }
      else if (av.isOne() && relatedAssociation.isOptionalOne())
      {
        includeFile = "specializationSkip.jet";
      }
      else if (av.isMandatoryMany() && av.isStar() && relatedAssociation.isOne())
      {
        hasIsNumberOfValidMethod = true;
        includeFile = "association_AddMandatoryManyToOne_specialization.jet";
      }
      else if ((av.isMN() || av.isN()) && relatedAssociation.isOnlyOne())
      {
        hasIsNumberOfValidMethod = true;
        includeFile = "association_AddMNToOnlyOne_specialization.jet";
      }
      else if (av.isOptionalN() && relatedAssociation.isOnlyOne())
      {
        includeFile = "association_AddOptionalNToOne_specialization.jet";
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
        includeFile = "association_AddManyToOne_specialization.jet";
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
        includeFile = "association_AddOptionalNToOptionalOne_specialization.jet";
      }
      else if (av.isMany() && relatedAssociation.isOptionalOne())
      {
        includeFile = "specializationSkip.jet";
      }
      else if (av.isOnlyOne() && relatedAssociation.isMandatoryMany() && relatedAssociation.isStar())
      {
        includeFile = "association_SetOneToMandatoryMany_specialization.jet";
      }
      else if (av.isOnlyOne() && (relatedAssociation.isMN() || relatedAssociation.isN()))
      {
        includeFile = "association_SetOneToAtMostN_specialization.jet";
      }
      else if (av.isOnlyOne() && relatedAssociation.isOptionalN())
      {
        includeFile = "association_SetOneToAtMostN_specialization.jet";
      }
      else if (av.isOnlyOne() && relatedAssociation.isMany() && !(av.isMandatory() && !av.isOne()) && !(uClass instanceof AssociationClass))
      {
        includeFile = "specializationSkip.jet";
      }
      else if (av.isOnlyOne() && relatedAssociation.isMany() && !(av.isMandatory() && !av.isOne()) && (uClass instanceof AssociationClass))
      {
        includeFile = "specializationSkip.jet";
      }
      else if (av.isOptionalOne() && relatedAssociation.isOptionalN())
      {
        includeFile = "association_SetOptionalOneToOptionalN_specialization.jet";
      }
      else if (av.isOptionalOne() && relatedAssociation.isOptionalMany())
      {
        includeFile = "specializationSkip.jet";
      }
      else if (av.isOptionalOne() && relatedAssociation.isMandatoryMany())
      {
        // Insert code to include code here
        if (relatedAssociation.isUpperBounded())
        {
          //
          // This program cannot currently include SetOptionalOneToMandatoryMN.jet because of Issue351 where add/remove methods do not generate
          //
          //          PLEASE NOTE
          // If Issue351 is resolved, remember to change the specialization
          // code as well -- do not just include this here.
          //
          // includeFile = "association_SetOptionalOneToMandatoryMN.jet";
        } 
        else
        {
          //
          // We can include association_SetOptionalOneToMandatoryMany.jet
          // 
          includeFile = "association_SetOptionalOneToMandatoryMany_specialization.jet";
        } 
      }
      else if (av.isOptionalOne() && relatedAssociation.isMandatory())
      {
        //ignore
      }

      else
      {
        
    realSb.append(TEXT_3);
    realSb.append(av);
    realSb.append(TEXT_4);
    realSb.append(relatedAssociation);
    
      }
      
      if(av.isSorted())
      {
        includeFile3 = "association_Sort.jet";
      }
      else if(av.isMany() && !av.isImmutable() && !av.isN())
      {
        includeFile3 = "association_AddIndexControlFunctions_specialization.jet";
      }

      addNewLine = false;
      if (hasIsNumberOfValidMethod)
      {
        if (addNewLine) { appendln(realSb,""); }
        addNewLine = true;
        
    
        
    realSb.append(TEXT_5);
    /*association_IsNumberOfValidMethod_specialization*/
    realSb.append(TEXT_6);
    realSb.append(gen.translate("isNumberOfValidMethod",av));
    realSb.append(TEXT_7);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_8);
     if (customIsNumberOfValidPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customIsNumberOfValidPrefixCode,gen.translate("isNumberOfValidMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customIsNumberOfValidPrefixCode, "    ")); } 
    realSb.append(TEXT_9);
     if (av.getMultiplicity().isUpperBoundMany()) { 
    realSb.append(TEXT_10);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_11);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_12);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_13);
     } else { 
    realSb.append(TEXT_14);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_15);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_16);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_17);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_18);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_19);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_20);
     } 
    realSb.append(TEXT_21);
     if (customIsNumberOfValidPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customIsNumberOfValidPostfixCode,gen.translate("isNumberOfValidMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customIsNumberOfValidPostfixCode, "    ")); } 
    realSb.append(TEXT_22);
    
      }
      
      if (hasRequiredNumberOfMethod)
      {
        if (addNewLine) { appendln(realSb,""); }
        addNewLine = true;
        
    
        
    realSb.append(TEXT_23);
    /*association_RequiredNumberOfMethod_specialization*/
    
    String customRequiredNumberOfPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("requiredNumberOfMethod",av)));
    String customRequiredNumberOfPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("requiredNumberOfMethod",av)));

    realSb.append(TEXT_24);
     if (customRequiredNumberOfPrefixCode == null && customRequiredNumberOfPostfixCode == null) { 
    realSb.append(umpleSourceFile);
    realSb.append(TEXT_25);
    realSb.append(gen.translate("requiredNumberOfMethod",av));
    realSb.append(TEXT_26);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_27);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_28);
     } else { 
    realSb.append(TEXT_29);
    realSb.append(gen.translate("requiredNumberOfMethod",av));
    realSb.append(TEXT_30);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_31);
     if (customRequiredNumberOfPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRequiredNumberOfPrefixCode,gen.translate("requiredNumberOfMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRequiredNumberOfPrefixCode, "    ")); } 
    realSb.append(TEXT_32);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_33);
     if (customRequiredNumberOfPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRequiredNumberOfPostfixCode,gen.translate("requiredNumberOfMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRequiredNumberOfPostfixCode, "    ")); } 
    realSb.append(TEXT_34);
     } 
    
      }

      if (hasMinimumNumberOfMethod)
      {
        if (addNewLine) { appendln(realSb,""); }
        addNewLine = true;
        
    
        
    realSb.append(TEXT_35);
    /*association_MinimumNumberOfMethod_specialization*/
    
    String customMinimumNumberOfPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("minimumNumberOfMethod",av)));
    String customMinimumNumberOfPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("minimumNumberOfMethod",av)));
    
    realSb.append(TEXT_36);
     if (customMinimumNumberOfPrefixCode == null && customMinimumNumberOfPostfixCode == null) { 
    realSb.append(TEXT_37);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_38);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_39);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_40);
     } else { 
    realSb.append(TEXT_41);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_42);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_43);
     if (customMinimumNumberOfPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customMinimumNumberOfPrefixCode,gen.translate("minimumNumberOfMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customMinimumNumberOfPrefixCode, "    ")); } 
    realSb.append(TEXT_44);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_45);
     if (customMinimumNumberOfPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customMinimumNumberOfPostfixCode,gen.translate("minimumNumberOfMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customMinimumNumberOfPostfixCode, "    ")); } 
    realSb.append(TEXT_46);
     } 
    
      }
      
      if (hasMaximumNumberOfMethod)
      {
        if (addNewLine) { appendln(realSb,""); }
        addNewLine = true;
        
    
        
    realSb.append(TEXT_47);
    /*association_MaximumNumberOfMethod_specialization*/
    
    String customGetPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("getMethod",av)));

    String customMaximumNumberOfPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("maximumNumberOfMethod",av)));
    String customMaximumNumberOfPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("maximumNumberOfMethod",av)));
    
    
    realSb.append(TEXT_48);
     if (customMaximumNumberOfPrefixCode == null && customMaximumNumberOfPostfixCode == null) { 
    realSb.append(TEXT_49);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_50);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_51);
    realSb.append(av.getMultiplicity().getUpperBound());
    realSb.append(TEXT_52);
     } else { 
    realSb.append(umpleSourceFile);
    realSb.append(TEXT_53);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_54);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_55);
     if (customMaximumNumberOfPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customMaximumNumberOfPrefixCode,gen.translate("maximumNumberOfMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customMaximumNumberOfPrefixCode, "    ")); } 
    realSb.append(TEXT_56);
    realSb.append(av.getMultiplicity().getUpperBound());
    realSb.append(TEXT_57);
     if (customMaximumNumberOfPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customMaximumNumberOfPostfixCode,gen.translate("maximumNumberOfMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customMaximumNumberOfPostfixCode, "    ")); } 
    realSb.append(TEXT_58);
     } 
    
      }
      
      if (hasAddManyToManyTemplateMethod)
      {
        if (addNewLine) { appendln(realSb,""); }
        addNewLine = true;
        
    realSb.append(TEXT_59);
    /*association_AddManyToManyMethod_specialization*/
    realSb.append(TEXT_60);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_61);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_62);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_63);
     if (customAddPrefixCode != null && av.getMultiplicity().getUpperBound() == 1) { 
    realSb.append(TEXT_64);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_65);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_66);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_67);
    if (mulChangedToOne) { 
    realSb.append(TEXT_68);
     } 
    realSb.append(TEXT_69);
     } else if (customAddPrefixCode != null) { 
    realSb.append(TEXT_70);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_71);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_72);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_73);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_74);
     } 
    realSb.append(TEXT_75);
     if (customAddPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_76);
     if (!av.getMultiplicity().isUpperBoundMany()) { 
    realSb.append(TEXT_77);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_78);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_79);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_80);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_81);
     } 
    realSb.append(TEXT_82);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_83);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_84);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_85);
    
      }
      
      if (hasRemoveManyTemplateMethod)
      {
        if (addNewLine) { appendln(realSb,""); }
        addNewLine = true;
        
    /*specializationSkip*/
    
   /* Method Gen skipped due to special specialization syntax */

    
      }
	    
    if (addNewLine) { appendln(realSb,""); }
    addNewLine = true;	
	
      if (includeFile == "association_SetUnidirectionalOptionalOne_specialization.jet")
      {
        
    /*specializationSkip*/
    
   /* Method Gen skipped due to special specialization syntax */

        // TODO!!
      }
      else if (includeFile == "association_SetUnidirectionalOne_specialization.jet")
      {
        
    /*specializationSkip*/
    
   /* Method Gen skipped due to special specialization syntax */

        // TODO!!
      }
      else if (includeFile == "association_SetOptionalOneToOne_specialization.jet")
      {
        
    /*specializationSkip*/
    
   /* Method Gen skipped due to special specialization syntax */

        // TODO!!
      }
      else if (includeFile == "association_SetOneToOptionalOne_specialization.jet")
      {
        
    /*specializationSkip*/
    
   /* Method Gen skipped due to special specialization syntax */

        // TODO!!
      }
      else if (includeFile == "association_AddMandatoryManyToOne_specialization.jet")
      {
        
    realSb.append(TEXT_86);
    /*association_AddMandatoryManyToOne_specialization*/
    realSb.append(TEXT_87);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_88);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_89);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_90);
     if (customAddPrefixCode != null) { 
    realSb.append(TEXT_91);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_92);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_93);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_94);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_95);
     } 
    realSb.append(TEXT_96);
     if (customAddPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av));
     append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_97);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_98);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_99);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_100);
    realSb.append(gen.relatedTranslate("getMethod",av));
     if (relMulChangedToOne) { 
    realSb.append(TEXT_101);
    realSb.append(gen.relatedTranslate("type",av));
     } 
    realSb.append(TEXT_102);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_103);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_104);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_105);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_106);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_107);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_108);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_109);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_110);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_111);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_112);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av));
     append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_113);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_114);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_115);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_116);
     if (customRemovePrefixCode != null) { 
    realSb.append(TEXT_117);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_118);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_119);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_120);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_121);
     } 
    realSb.append(TEXT_122);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_123);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_124);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_125);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_126);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_127);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_128);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_129);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_130);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_131);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_132);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_133);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_134);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_135);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_136);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_137);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_138);
    
      }
      else if (includeFile == "association_AddMNToOnlyOne_specialization.jet")
      {
        
    realSb.append(TEXT_139);
    /*association_AddMNToOnlyOne_specialization*/
    realSb.append(TEXT_140);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_141);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_142);
    realSb.append(gen.translate("methodArgumentsExcept",relatedAssociation));
    realSb.append(TEXT_143);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_144);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_145);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_146);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_147);
    realSb.append(gen.translate("callerArgumentsExcept",relatedAssociation));
    realSb.append(TEXT_148);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_149);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_150);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_151);
     if (customAddPrefixCode != null) { 
    realSb.append(TEXT_152);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_153);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_154);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_155);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_156);
     } 
    realSb.append(TEXT_157);
     if (customAddPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_158);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_159);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_160);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_161);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_162);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_163);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_164);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_165);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_166);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_167);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_168);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_169);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_170);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_171);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_172);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_173);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_174);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_175);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_176);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_177);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_178);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_179);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_180);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_181);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_182);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_183);
     if (customRemovePrefixCode != null) { 
    realSb.append(TEXT_184);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_185);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_186);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_187);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_188);
     } 
    realSb.append(TEXT_189);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_190);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_191);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_192);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_193);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_194);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_195);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_196);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_197);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_198);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_199);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_200);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_201);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_202);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_203);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_204);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_205);
    
      }
      else if (includeFile == "association_AddOptionalNToOne_specialization.jet")
      {
        
    realSb.append(TEXT_206);
    /*association_AddOptionalNToOne_specialization*/
    realSb.append(TEXT_207);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_208);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_209);
    realSb.append(gen.translate("methodArgumentsExcept",relatedAssociation));
    realSb.append(TEXT_210);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_211);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_212);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_213);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_214);
    realSb.append(gen.translate("callerArgumentsExcept",relatedAssociation));
    realSb.append(TEXT_215);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_216);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_217);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_218);
     if (customAddPrefixCode != null) { 
    realSb.append(TEXT_219);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_220);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_221);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_222);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_223);
     } 
    realSb.append(TEXT_224);
     if (customAddPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_225);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_226);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_227);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_228);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_229);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_230);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_231);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_232);
    
      }
      else if (includeFile == "association_SetOptionalNToMany_specialization.jet")
      {
        
    realSb.append(TEXT_233);
    /*association_SetOptionalNToMany_specialization*/
    realSb.append(TEXT_234);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_235);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_236);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_237);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPrefixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_238);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_239);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_240);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_241);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_242);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_243);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_244);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_245);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_246);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_247);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_248);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_249);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_250);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_251);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_252);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_253);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_254);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_255);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_256);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_257);
    
      }
      else if (includeFile == "association_AddManyToOne_specialization.jet")
      {
        
    realSb.append(TEXT_258);
    /*association_AddManyToOne_specialization*/
    realSb.append(TEXT_259);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_260);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_261);
    realSb.append(gen.translate("methodArgumentsExcept",relatedAssociation));
    realSb.append(TEXT_262);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_263);
    realSb.append(gen.translate("callerArgumentsExcept",relatedAssociation));
    realSb.append(TEXT_264);
    
      }
      else if (includeFile == "association_SetOptionalOneToOptionalOne_specialization.jet")
      {
        
    /*specializationSkip*/
    
   /* Method Gen skipped due to special specialization syntax */

        // TODO!!
      }
      else if (includeFile == "association_AddMNToMany_specialization.jet")
      {
        
    realSb.append(TEXT_265);
    /*association_AddMNToMany_specialization*/
    realSb.append(TEXT_266);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_267);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_268);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_269);
     if (customRemovePrefixCode != null) { 
    realSb.append(TEXT_270);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_271);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_272);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_273);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_274);
     } 
    realSb.append(TEXT_275);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_276);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_277);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_278);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_279);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_280);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_281);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_282);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_283);
    
      }
      else if (includeFile == "association_AddMStarToMany_specialization.jet")
      {
        
    realSb.append(TEXT_284);
    /*association_AddMStarToMany_specialization*/
    realSb.append(TEXT_285);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_286);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_287);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_288);
     if (customRemovePrefixCode != null) { 
    realSb.append(TEXT_289);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_290);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_291);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_292);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_293);
     } 
    realSb.append(TEXT_294);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_295);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_296);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_297);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_298);
     if (customRemovePostfixCode != null) {
      addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_299);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_300);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_301);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_302);
    
      }
      else if (includeFile == "association_SetOptionalOneToOptionalN_specialization.jet")
      {
        
    realSb.append(TEXT_303);
    /*association_SetOptionalOneToOptionalN_specialization*/
    realSb.append(TEXT_304);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_305);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_306);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_307);
     if (customSetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_308);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_309);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_310);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_311);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_312);
    realSb.append(gen.relatedTranslate("maximumNumberOfMethod",av));
    realSb.append(TEXT_313);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_314);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_315);
     if (!reqSetCode) { 
    realSb.append(TEXT_316);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_317);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_318);
     } else { 
    realSb.append(TEXT_319);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_320);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_321);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_322);
     } 
    realSb.append(TEXT_323);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_324);
    
      }
      else if (includeFile == "association_SetOneToMany_specialization.jet")
      {
        
    realSb.append(TEXT_325);
    /*association_SetOneToMany_specialization*/
    realSb.append(TEXT_326);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_327);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_328);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_329);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_330);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_331);
    realSb.append(gen.translate("getMethod",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_332);
    realSb.append(gen.translate("type",av));
     } 
    realSb.append(TEXT_333);
     if (customSetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_334);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_335);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_336);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_337);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_338);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_339);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_340);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_341);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_342);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_343);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_344);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_345);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_346);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_347);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_348);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_349);
    
      }
      else if (includeFile == "association_SetOneToManyAssociationClass_specialization.jet")
      {
        
    /*specializationSkip*/
    
   /* Method Gen skipped due to special specialization syntax */

        // TODO!!
      }
      else if (includeFile == "association_SetOneToAtMostN_specialization.jet")
      {
        
    realSb.append(TEXT_350);
    /*association_SetOneToAtMostN_specialization*/
    realSb.append(TEXT_351);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_352);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_353);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_354);
     if (customSetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_355);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_356);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_357);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_358);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_359);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_360);
    realSb.append(relatedAssociation.getMultiplicity().getUpperBound());
    realSb.append(TEXT_361);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_362);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_363);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_364);
    realSb.append(gen.relatedTranslate("maximumNumberOfMethod",av));
    realSb.append(TEXT_365);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_366);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_367);
     if ( !reqSetCode ) { 
    realSb.append(TEXT_368);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_369);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_370);
     } else { 
    realSb.append(TEXT_371);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_372);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_373);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_374);
     } 
    realSb.append(TEXT_375);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_376);
    
      }
      else if (includeFile == "association_SetOneToMandatoryMany_specialization.jet")
      {
        
    realSb.append(TEXT_377);
    /*association_SetOneToMandatoryMany_specialization*/
    realSb.append(TEXT_378);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_379);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_380);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_381);
     if (customSetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",av));
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_382);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_383);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_384);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_385);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av));
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_386);
    realSb.append(gen.translate("getMethod",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_387);
    realSb.append(gen.translate("type",av));
     } 
    realSb.append(TEXT_388);
    realSb.append(gen.translate("getMethod",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_389);
    realSb.append(gen.translate("type",av));
     } 
    realSb.append(TEXT_390);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_391);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_392);
    realSb.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    realSb.append(TEXT_393);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_394);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_395);
     if ( !reqSetCode ) { 
    realSb.append(TEXT_396);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_397);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_398);
     } else { 
    realSb.append(TEXT_399);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_400);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_401);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_402);
     } 
    realSb.append(TEXT_403);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_404);
    
      }
      else if (includeFile == "association_AddManyToOptionalOne_specialization.jet")
      {
        
    realSb.append(TEXT_405);
    /*association_AddManyToOptionalOne_specialization*/
    realSb.append(TEXT_406);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_407);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_408);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_409);
     if (customAddPrefixCode != null) { 
    realSb.append(TEXT_410);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_411);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_412);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_413);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_414);
     } 
    realSb.append(TEXT_415);
     if (customAddPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_416);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_417);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_418);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_419);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_420);
     if (relatedAssociation.getMultiplicity().getUpperBound() != 1) { 
    realSb.append(gen.relatedTranslate("type",av));
     } else { 
    realSb.append(TEXT_421);
    realSb.append(gen.relatedTranslate("type",av));
     } 
    realSb.append(TEXT_422);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_423);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_424);
     if (!relReqSetCode) { 
    realSb.append(TEXT_425);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_426);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_427);
     } else { 
    realSb.append(TEXT_428);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_429);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_430);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_431);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_432);
     } 
    realSb.append(TEXT_433);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_434);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_435);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_436);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_437);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_438);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_439);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_440);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_441);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_442);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_443);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_444);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_445);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_446);
     if (customRemovePrefixCode != null) { 
    realSb.append(TEXT_447);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_448);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_449);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_450);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_451);
     } 
    realSb.append(TEXT_452);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_453);
    realSb.append(gen.translate("getMethod",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_454);
    realSb.append(gen.translate("type",av));
     } 
    realSb.append(TEXT_455);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_456);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_457);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_458);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_459);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_460);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_461);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPost()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_462);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_463);
    
      }
      else if (includeFile == "association_SetOptionalOneToMany_specialization.jet")
      {
        
    /*specializationSkip*/
    
   /* Method Gen skipped due to special specialization syntax */

        // TODO!!
      }
      else if (includeFile == "association_AddOptionalNToOptionalOne_specialization.jet")
      {
        
    realSb.append(TEXT_464);
    /*association_AddOptionalNToOptionalOne_specialization*/
    realSb.append(TEXT_465);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_466);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_467);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_468);
     if (customAddPrefixCode != null) { 
    realSb.append(TEXT_469);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_470);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_471);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_472);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_473);
     } 
    realSb.append(TEXT_474);
     if (customAddPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_475);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_476);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_477);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_478);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_479);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_480);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_481);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_482);
    
      }
      else if (includeFile == "association_AddUnidirectionalMN_specialization.jet")
      {
        
    realSb.append(TEXT_483);
    /*association_AddUnidirectionalMN_specialization*/
    realSb.append(TEXT_484);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_485);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_486);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_487);
     if (customAddPrefixCode != null) { 
    realSb.append(TEXT_488);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_489);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_490);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_491);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_492);
     } 
    realSb.append(TEXT_493);
     if (customAddPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_494);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_495);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_496);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_497);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_498);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_499);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_500);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_501);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_502);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_503);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_504);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_505);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_506);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_507);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_508);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_509);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_510);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_511);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_512);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_513);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPost()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_514);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_515);
    
      }
      else if (includeFile == "association_AddMNToOptionalOne_specialization.jet")
      {
        
    realSb.append(TEXT_516);
    /*association_AddMNToOptionalOne_specialization*/
    realSb.append(TEXT_517);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_518);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_519);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_520);
     if (customAddPrefixCode != null) { 
    realSb.append(TEXT_521);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_522);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_523);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_524);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_525);
     } 
    realSb.append(TEXT_526);
     if (customAddPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av));
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_527);
     if (!av.isStar()) { 
    realSb.append(TEXT_528);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_529);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_530);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_531);
     if (customAddPostfixCode != null) {addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_532);
     } 
    realSb.append(TEXT_533);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_534);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_535);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_536);
    realSb.append(gen.relatedTranslate("getMethod",av));
     if (relMulChangedToOne) { 
    realSb.append(TEXT_537);
    realSb.append(gen.relatedTranslate("type",av));
     } 
    realSb.append(TEXT_538);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_539);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_540);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_541);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_542);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_543);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_544);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_545);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_546);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_547);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_548);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_549);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_550);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_551);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_552);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_553);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_554);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_555);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_556);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_557);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_558);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_559);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_560);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_561);
    
      }
      else if (includeFile == "association_SetNToOptionalOne_specialization.jet")
      {
        
    realSb.append(TEXT_562);
    /*association_SetNToOptionalOne_specialization*/
    realSb.append(TEXT_563);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_564);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_565);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_566);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPrefixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_567);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_568);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_569);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_570);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_571);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_572);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_573);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_574);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_575);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av));
        append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "        ")); } 
    realSb.append(TEXT_576);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_577);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_578);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_579);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_580);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
        append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "        ")); } 
    realSb.append(TEXT_581);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_582);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_583);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_584);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_585);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_586);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_587);
     if ( !reqSetCode ) { 
    realSb.append(TEXT_588);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_589);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_590);
     } else { 
    realSb.append(TEXT_591);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_592);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_593);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_594);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_595);
     } 
    realSb.append(TEXT_596);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_597);
    realSb.append(TEXT_598);
    /*association_GetPrivate*/
    realSb.append(TEXT_599);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_600);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_601);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_602);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_603);
    realSb.append(gen.relatedTranslate("parameterOne",av));
    realSb.append(TEXT_604);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_605);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_606);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_607);
    realSb.append(gen.relatedTranslate("parameterOne",av));
    realSb.append(TEXT_608);
    realSb.append(gen.relatedTranslate("parameterOne",av));
    realSb.append(TEXT_609);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_610);
    
      }
      else if (includeFile == "association_AddUnidirectionalMany_specialization.jet")
      {
        
    realSb.append(TEXT_611);
    /*association_AddUnidirectionalMany_specialization*/
    realSb.append(TEXT_612);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_613);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_614);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_615);
     if (customAddPrefixCode != null) { 
    realSb.append(TEXT_616);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_617);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_618);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_619);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_620);
     } 
    realSb.append(TEXT_621);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_622);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_623);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_624);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_625);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_626);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_627);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPost()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_628);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_629);
    
      }
      else if (includeFile == "association_AddUnidirectionalOptionalN_specialization.jet")
      {
        
    realSb.append(TEXT_630);
    /*association_AddUnidirectionalOptionalN_specialization*/
    realSb.append(TEXT_631);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_632);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_633);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_634);
     if (customAddPrefixCode != null) { 
    realSb.append(TEXT_635);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_636);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_637);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_638);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_639);
     } 
    realSb.append(TEXT_640);
     if (customAddPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_641);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_642);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_643);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_644);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_645);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_646);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_647);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_648);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_649);
    realSb.append(umpleSourceFile);
    
      }
      else if (includeFile == "association_AddUnidirectionalMStar_specialization.jet")
      {
        
    /*specializationSkip*/
    
   /* Method Gen skipped due to special specialization syntax */

        // TODO!!
      }
      else if (includeFile == "association_SetUnidirectionalN_specialization.jet")
      {
        
    realSb.append(TEXT_650);
    /*association_SetUnidirectionalN_specialization*/
     String accessModifier = (av.isImmutable()) ? "private" : "public"; 
    realSb.append(TEXT_651);
    realSb.append(accessModifier);
    realSb.append(TEXT_652);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_653);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_654);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_655);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPrefixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_656);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_657);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_658);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_659);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_660);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_661);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_662);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_663);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_664);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_665);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_666);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_667);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_668);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_669);
    realSb.append(gen.translate("requiredNumberOfMethod",av));
    realSb.append(TEXT_670);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_671);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_672);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_673);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_674);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_675);
    
      }
      else if (includeFile == "association_SetUnidirectionalMany_specialization.jet")
      {
        
    realSb.append(TEXT_676);
    /*association_SetUnidirectionalMany_specialization*/
     String accessModifier = (av.isImmutable()) ? "private" : "public"; 
    realSb.append(TEXT_677);
    realSb.append(accessModifier);
    realSb.append(TEXT_678);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_679);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_680);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_681);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPrefixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_682);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_683);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_684);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_685);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_686);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_687);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_688);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_689);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_690);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_691);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_692);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_693);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_694);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_695);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_696);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_697);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_698);
    
      }
      else if (includeFile == "association_SetOptionalOneToMandatoryMany_specialization.jet")
      {
        
    realSb.append(TEXT_699);
    /*association_SetOptionalOneToMandatoryMany_specialization*/
    realSb.append(TEXT_700);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_701);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_702);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_703);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_704);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_705);
    realSb.append(gen.translate("getMethod",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_706);
    realSb.append(gen.translate("type",av));
     } 
    realSb.append(TEXT_707);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_708);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_709);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_710);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_711);
     if (!reqSetCode) { 
    realSb.append(TEXT_712);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_713);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_714);
     } else { 
    realSb.append(TEXT_715);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_716);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_717);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_718);
     } 
    realSb.append(TEXT_719);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_720);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_721);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_722);
    realSb.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    realSb.append(TEXT_723);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_724);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_725);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_726);
     if ( !reqSetCode ) { 
    realSb.append(TEXT_727);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_728);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_729);
     } else { 
    realSb.append(TEXT_730);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_731);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_732);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_733);
     } 
    realSb.append(TEXT_734);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_735);
    realSb.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    realSb.append(TEXT_736);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_737);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_738);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_739);
     if (!reqSetCode) { 
    realSb.append(TEXT_740);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_741);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_742);
     } else { 
    realSb.append(TEXT_743);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_744);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_745);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_746);
     } 
    realSb.append(TEXT_747);
    
      }
      else if (includeFile == "association_SetOptionalOneToMandatoryMN_specialization.jet")
      {
        
    /*specializationSkip*/
    
   /* Method Gen skipped due to special specialization syntax */

        // TODO!!
      }
      else if (includeFile == "association_SetOptionalNToMany.jet")
      {
        
    /*specializationSkip*/
    
   /* Method Gen skipped due to special specialization syntax */

        // TODO?
      }
      else if (includeFile == "specializationSkip.jet")
      {
        
    /*specializationSkip*/
    
   /* Method Gen skipped due to special specialization syntax */

        // TODO?
      }
      else if (includeFile != null)
      {
        appendln(realSb,"You forgot to include {0}",includeFile);
      }
      
      
    
      if (includeFile2 == "association_SetMNToMany_specialization.jet")
      {
        
    realSb.append(TEXT_748);
    /*association_SetMNToMany_specialization*/
    realSb.append(TEXT_749);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_750);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_751);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_752);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPrefixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_753);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_754);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_755);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_756);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_757);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_758);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_759);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_760);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_761);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_762);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_763);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_764);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_765);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_766);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_767);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_768);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_769);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_770);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_771);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_772);
     if ( !reqSetCode ) { 
    realSb.append(TEXT_773);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_774);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_775);
     } else { 
    realSb.append(TEXT_776);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_777);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_778);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_779);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_780);
     } 
    realSb.append(TEXT_781);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av));
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_782);
    
      }
      else if (includeFile2 == "association_SetMStarToMany_specialization.jet")
      {
        
    realSb.append(TEXT_783);
    /*association_SetMStarToMany_specialization*/
    realSb.append(TEXT_784);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_785);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_786);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_787);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPrefixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_788);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_789);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_790);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_791);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_792);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_793);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_794);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_795);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_796);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_797);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_798);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_799);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_800);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_801);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_802);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_803);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_804);
     if ( !reqSetCode ) { 
    realSb.append(TEXT_805);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_806);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_807);
     } else { 
    realSb.append(TEXT_808);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_809);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_810);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_811);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_812);
     } 
    realSb.append(TEXT_813);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_814);
    
      }
      else if (includeFile2 == "association_SetUnidirectionalMN_specialization.jet")
      {
        
    realSb.append(TEXT_815);
    /*association_SetUnidirectionalMN_specialization*/
     String accessModifier = (av.isImmutable()) ? "private" : "public"; 
    realSb.append(TEXT_816);
    realSb.append(accessModifier);
    realSb.append(TEXT_817);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_818);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_819);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_820);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPrefixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_821);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_822);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_823);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_824);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_825);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_826);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_827);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_828);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_829);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_830);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_831);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_832);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_833);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_834);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_835);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_836);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_837);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_838);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_839);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_840);
     if (!reqSetCode) { 
    realSb.append(TEXT_841);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_842);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_843);
     } else { 
    realSb.append(TEXT_844);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_845);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_846);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_847);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_848);
     } 
    realSb.append(TEXT_849);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_850);
    
      }
      else if (includeFile2 == "association_SetMNToOptionalOne_specialization.jet")
      {
        
    realSb.append(TEXT_851);
    /*association_SetMNToOptionalOne_specialization*/
    
  String existingToNewMap = StringFormatter.format("{0}ToNew{1}", relatedAssociation.getName(), av.getUpperCaseName());
  String orCheckMaxBound = av.isStar() ? "" : StringFormatter.format(" || {0}.length > {1}{2}{3}()", gen.translate("parameterMany",av), gen.translate("maximumNumberOfMethod",av), "_", gen.translate("type",av));

    realSb.append(TEXT_852);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_853);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_854);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_855);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPrefixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_856);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_857);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_858);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_859);
    realSb.append(orCheckMaxBound);
    realSb.append(TEXT_860);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_861);
     if ( !reqSetCode ) { 
    realSb.append(TEXT_862);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_863);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_864);
     } else { 
    realSb.append(TEXT_865);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_866);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_867);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_868);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_869);
     } 
    realSb.append(TEXT_870);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_871);
    realSb.append(TEXT_598);
    /*association_GetPrivate*/
    realSb.append(TEXT_599);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_600);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_601);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_602);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_603);
    realSb.append(gen.relatedTranslate("parameterOne",av));
    realSb.append(TEXT_604);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_605);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_606);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_607);
    realSb.append(gen.relatedTranslate("parameterOne",av));
    realSb.append(TEXT_608);
    realSb.append(gen.relatedTranslate("parameterOne",av));
    realSb.append(TEXT_609);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_610);
    
      }
      else if (includeFile2 == "association_SetUnidirectionalOptionalN_specialization.jet")
      {
        
    realSb.append(TEXT_872);
    /*association_SetUnidirectionalOptionalN_specialization*/
     String accessModifier = (av.isImmutable()) ? "private" : "public"; 
    realSb.append(TEXT_873);
    realSb.append(accessModifier);
    realSb.append(TEXT_874);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_875);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_876);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_877);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPrefixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_878);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_879);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_880);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_881);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_882);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_883);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_884);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_885);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_886);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_887);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_888);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_889);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_890);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_891);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_892);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_893);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_894);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_895);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_896);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_897);
    
      }
      else if (includeFile2 == "association_SetUnidirectionalMStar_specialization.jet")
      {
        
    realSb.append(TEXT_898);
    /*association_SetUnidirectionalMStar_specialization*/
     String accessModifier = (av.isImmutable()) ? "private" : "public"; 
    realSb.append(TEXT_899);
    realSb.append(accessModifier);
    realSb.append(TEXT_900);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_901);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_902);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_903);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPrefixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_904);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_905);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_906);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_907);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_908);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_909);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_910);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_911);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_912);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_913);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_914);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_915);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_916);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_917);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_918);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_919);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_920);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_921);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_922);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_923);
    
      }
      else if (includeFile2 != null)
      {
        appendln(realSb,"You forgot to include {0}",includeFile2);
      }
      
      if(includeFile3 == "association_Sort.jet" && !sortMethodAdded)
      {
        
    /*association_Sort*/
    realSb.append(TEXT_924);
    
        sortMethodAdded = true; //after the sort method has been added, this boolean stops it from being added again
      }
      else if(includeFile3 == "association_AddIndexControlFunctions.jet")
      {
        
    realSb.append(TEXT_925);
    /*association_AddIndexControlFunctions_specialization*/
    realSb.append(TEXT_926);
    realSb.append(gen.translate("addAtMethod",av));
    realSb.append(TEXT_927);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_928);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_929);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_930);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_931);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_932);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_933);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_934);
    realSb.append(gen.translate("addAtMethod",av));
    realSb.append(TEXT_935);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_936);
    realSb.append(gen.translate("addOrMoveAtMethod",av));
    realSb.append(TEXT_937);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_938);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_939);
    realSb.append(gen.translate("getManyMethod",av));
    realSb.append(TEXT_940);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_941);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_942);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_943);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_944);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_945);
    realSb.append(gen.translate("addAtMethod",av));
    realSb.append(TEXT_946);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_947);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_948);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_949);
    realSb.append(gen.translate("addAtMethod",av));
    realSb.append(TEXT_950);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_951);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_952);
    
      }

    
     }// end super code
     
  public void getAssociationCode_specialization_reqCommonCode(JavaGenerator gen, String includeFile, String includeFile2, String includeFile3, StringBuilder realSb, AssociationVariable av, AssociationVariable relatedAssociation,
  		String customSetPrefixCode, String customSetPostfixCode, String customAddPrefixCode, String customAddPostfixCode, String customRemovePrefixCode, String customRemovePostfixCode,
  		String customSetManyPrefixCode, String customSetManyPostfixCode, List<TraceItem> traceItemAssocRemoves, List<TraceItem> traceItemAssocAdds, UmpleClass uClass, boolean sortMethodAdded, String umpleSourceFile,
  		Map<String,UncaughtException> uncaughtExceptions, UmpleClass globalUmpleClass, boolean addNewLine, boolean mulChangedToOne, boolean relMulChangedToOne, boolean mulChangedToN, boolean reqSetCode, boolean relReqCommonCode, boolean relReqSetCode, String scName) 
  	{
     String self="this";
  	 this.uncaughtExceptions = uncaughtExceptions;
  	 this.globalUmpleClass = globalUmpleClass;
  
    realSb.append(TEXT_953);
    /*association_set_specialization_reqCommonCode*/
    

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
    
      if (!relatedAssociation.getIsNavigable())
      {
        if (av.isOptionalOne())
        {
          includeFile = "association_SetUnidirectionalOptionalOne_relatedSpecialization.jet";
        }
        else if (av.isOnlyOne())
        {
          includeFile = "association_SetUnidirectionalOne_relatedSpecialization.jet";
        }
        else if (av.isMStar())
        {
          if (!av.isImmutable())
          {
            includeFile = "association_AddUnidirectionalMStar_relatedSpecialization.jet";
          }
          includeFile2 = "association_SetUnidirectionalMStar_relatedSpecialization.jet";
        }
        else if (av.isMN())
        {
          if (!av.isImmutable())
          {
            includeFile = "association_AddUnidirectionalMN_relatedSpecialization.jet";
          }
          includeFile2 = "association_SetUnidirectionalMN_relatedSpecialization.jet";
        }
        else if (av.isN())
        {
          includeFile = "association_SetUnidirectionalN_relatedSpecialization.jet";
        }
        else if (av.isOptionalN())
        {
          if (!av.isImmutable())
          {
            includeFile = "association_AddUnidirectionalOptionalN_relatedSpecialization.jet";
          }
          includeFile2 = "association_SetUnidirectionalOptionalN_relatedSpecialization.jet";
        }
        else if (av.isImmutable() && av.isMany())
        {
          includeFile = "association_SetUnidirectionalMany_relatedSpecialization.jet";
        }
        else if (av.isMany())
        {
          includeFile = "association_AddUnidirectionalMany_relatedSpecialization.jet";
        }
      }
      else if (av.isOnlyOne() && relatedAssociation.isOnlyOne())
      {
        //ignore
      }  
      else if (av.isN() && relatedAssociation.isOptionalOne())
      { 
        includeFile = "association_SetNToOptionalOne_relatedSpecialization.jet";
      }
      else if (av.isMN() && relatedAssociation.isOptionalOne())
      {
        includeFile = "association_AddMNToOptionalOne_relatedSpecialization.jet";
        includeFile2 = "association_SetMNToOptionalOne_relatedSpecialization.jet";
      }
      else if (av.isMandatoryMany() && av.isStar() && relatedAssociation.isMany())
      {
        hasIsNumberOfValidMethod = true;
        hasAddManyToManyTemplateMethod = true;
        includeFile = "association_AddMStarToMany_relatedSpecialization.jet";
        includeFile2 = "association_SetMStarToMany_relatedSpecialization.jet";
      }
      else if ((av.isMN() || av.isN()) && relatedAssociation.isMandatoryMany())
      {
        hasIsNumberOfValidMethod = true;
        hasAddManyToManyTemplateMethod = true;
        hasAddManyToManyTemplateMethod = true;
        includeFile = "association_AddMNToMany_relatedSpecialization.jet";
        includeFile2 = "association_SetMNToMany_relatedSpecialization.jet";
      }
      else if ((av.isMN() || av.isN()) && relatedAssociation.isOptionalN())
      {
        hasIsNumberOfValidMethod = true;
        hasAddManyToManyTemplateMethod = true;
        hasAddManyToManyTemplateMethod = true;
        includeFile = "association_AddMNToMany_relatedSpecialization.jet";
      }
      else if ((av.isMN() || av.isN()) && !relatedAssociation.isOne())
      {
        hasIsNumberOfValidMethod = true;
        hasAddManyToManyTemplateMethod = true;
        includeFile = "association_AddMNToMany_relatedSpecialization.jet";
        includeFile2 = "association_SetMNToMany_relatedSpecialization.jet";
      }
      else if (av.isOptionalOne() && relatedAssociation.isOptionalOne())
      {
        includeFile = "association_SetOptionalOneToOptionalOne_relatedSpecialization.jet";
      }
      else if (av.isOptionalOne() && relatedAssociation.isOne())
      {
        includeFile = "association_SetOptionalOneToOne_relatedSpecialization.jet";
      }
      else if (av.isOne() && relatedAssociation.isOptionalOne())
      {
        includeFile = "association_SetOneToOptionalOne_relatedSpecialization.jet";
      }
      else if (av.isMandatoryMany() && av.isStar() && relatedAssociation.isOne())
      {
        hasIsNumberOfValidMethod = true;
        includeFile = "association_AddMandatoryManyToOne_relatedSpecialization.jet";
      }
      else if ((av.isMN() || av.isN()) && relatedAssociation.isOnlyOne())
      {
        hasIsNumberOfValidMethod = true;
        includeFile = "association_AddMNToOnlyOne_relatedSpecialization.jet";
      }
      else if (av.isOptionalN() && relatedAssociation.isOnlyOne())
      {
        includeFile = "association_AddOptionalNToOne_relatedSpecialization.jet";
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
        includeFile = "association_SetOptionalNToMany_relatedSpecialization.jet";
      }
      else if (av.isMany() && relatedAssociation.isOnlyOne())
      {
        includeFile = "association_AddManyToOne_relatedSpecialization.jet";
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
        includeFile = "association_AddOptionalNToOptionalOne_relatedSpecialization.jet";
      }
      else if (av.isMany() && relatedAssociation.isOptionalOne())
      {
        includeFile = "association_AddManyToOptionalOne_relatedSpecialization.jet";
      }
      else if (av.isOnlyOne() && relatedAssociation.isMandatoryMany() && relatedAssociation.isStar())
      {
        includeFile = "association_SetOneToMandatoryMany_relatedSpecialization.jet";
      }
      else if (av.isOnlyOne() && (relatedAssociation.isMN() || relatedAssociation.isN()))
      {
        includeFile = "association_SetOneToAtMostN_relatedSpecialization.jet";
      }
      else if (av.isOnlyOne() && relatedAssociation.isOptionalN())
      {
        includeFile = "association_SetOneToAtMostN_relatedSpecialization.jet";
      }
      else if (av.isOnlyOne() && relatedAssociation.isMany() && !(av.isMandatory() && !av.isOne()) && !(uClass instanceof AssociationClass))
      {
        includeFile = "association_SetOneToMany_relatedSpecialization.jet";
      }
      else if (av.isOnlyOne() && relatedAssociation.isMany() && !(av.isMandatory() && !av.isOne()) && (uClass instanceof AssociationClass))
      {
        includeFile = "association_SetOneToManyAssociationClass_relatedSpecialization.jet";
      }
      else if (av.isOptionalOne() && relatedAssociation.isOptionalN())
      {
        includeFile = "association_SetOptionalOneToOptionalN_relatedSpecialization.jet";
      }
      else if (av.isOptionalOne() && relatedAssociation.isOptionalMany())
      {
        includeFile = "association_SetOptionalOneToMany_relatedSpecialization.jet";
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
          includeFile = "association_SetOptionalOneToMandatoryMany_relatedSpecialization.jet";
        } 
      }
      else if (av.isOptionalOne() && relatedAssociation.isMandatory())
      {
        //ignore
      }

      else
      {
        
    realSb.append(TEXT_954);
    realSb.append(av);
    realSb.append(TEXT_955);
    realSb.append(relatedAssociation);
    
      }
      
      if(av.isSorted())
      {
        includeFile3 = "association_Sort.jet";
      }
      else if(av.isMany() && !av.isImmutable() && !av.isN())
      {
        includeFile3 = "association_AddIndexControlFunctions_relatedSpecialization.jet";
      }

      addNewLine = false;
      if (hasIsNumberOfValidMethod)
      {
        if (addNewLine) { appendln(realSb,""); }
        addNewLine = true;
        
    
        
    realSb.append(TEXT_956);
    /*association_IsNumberOfValidMethod_relatedSpecialization*/
    realSb.append(TEXT_957);
    realSb.append(gen.translate("isNumberOfValidMethod",av));
    realSb.append(TEXT_958);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_959);
     if (customIsNumberOfValidPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customIsNumberOfValidPrefixCode,gen.translate("isNumberOfValidMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customIsNumberOfValidPrefixCode, "    ")); } 
    realSb.append(TEXT_960);
     if (av.getMultiplicity().isUpperBoundMany()) { 
    realSb.append(TEXT_961);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_962);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_963);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_964);
     } else { 
    realSb.append(TEXT_965);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_966);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_967);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_968);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_969);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_970);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_971);
     } 
    realSb.append(TEXT_972);
     if (customIsNumberOfValidPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customIsNumberOfValidPostfixCode,gen.translate("isNumberOfValidMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customIsNumberOfValidPostfixCode, "    ")); } 
    realSb.append(TEXT_973);
    
      }
      
      if (hasRequiredNumberOfMethod)
      {
        if (addNewLine) { appendln(realSb,""); }
        addNewLine = true;
        
    
        
    realSb.append(TEXT_974);
    /*association_RequiredNumberOfMethod_relatedSpecialization*/
    
    String customRequiredNumberOfPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("requiredNumberOfMethod",av)));
    String customRequiredNumberOfPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("requiredNumberOfMethod",av)));

    realSb.append(TEXT_975);
     if (customRequiredNumberOfPrefixCode == null && customRequiredNumberOfPostfixCode == null) { 
    realSb.append(umpleSourceFile);
    realSb.append(TEXT_976);
    realSb.append(gen.translate("requiredNumberOfMethod",av));
    realSb.append(TEXT_977);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_978);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_979);
     } else { 
    realSb.append(TEXT_980);
    realSb.append(gen.translate("requiredNumberOfMethod",av));
    realSb.append(TEXT_981);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_982);
     if (customRequiredNumberOfPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRequiredNumberOfPrefixCode,gen.translate("requiredNumberOfMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRequiredNumberOfPrefixCode, "    ")); } 
    realSb.append(TEXT_983);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_984);
     if (customRequiredNumberOfPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRequiredNumberOfPostfixCode,gen.translate("requiredNumberOfMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRequiredNumberOfPostfixCode, "    ")); } 
    realSb.append(TEXT_985);
     } 
    
      }

      if (hasMinimumNumberOfMethod)
      {
        if (addNewLine) { appendln(realSb,""); }
        addNewLine = true;
        
    
        
    realSb.append(TEXT_986);
    /*association_MinimumNumberOfMethod_relatedSpecialization*/
    
    String customMinimumNumberOfPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("minimumNumberOfMethod",av)));
    String customMinimumNumberOfPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("minimumNumberOfMethod",av)));
    
    realSb.append(TEXT_987);
     if (customMinimumNumberOfPrefixCode == null && customMinimumNumberOfPostfixCode == null) { 
    realSb.append(TEXT_988);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_989);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_990);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_991);
     } else { 
    realSb.append(TEXT_992);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_993);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_994);
     if (customMinimumNumberOfPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customMinimumNumberOfPrefixCode,gen.translate("minimumNumberOfMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customMinimumNumberOfPrefixCode, "    ")); } 
    realSb.append(TEXT_995);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_996);
     if (customMinimumNumberOfPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customMinimumNumberOfPostfixCode,gen.translate("minimumNumberOfMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customMinimumNumberOfPostfixCode, "    ")); } 
    realSb.append(TEXT_997);
     } 
    
      }
      
      if (hasMaximumNumberOfMethod)
      {
        if (addNewLine) { appendln(realSb,""); }
        addNewLine = true;
        
    
        
    realSb.append(TEXT_998);
    /*association_MaximumNumberOfMethod_relatedSpecialization*/
    
    String customGetPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("getMethod",av)));

    String customMaximumNumberOfPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("maximumNumberOfMethod",av)));
    String customMaximumNumberOfPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("maximumNumberOfMethod",av)));
    
    
    realSb.append(TEXT_999);
     if (customMaximumNumberOfPrefixCode == null && customMaximumNumberOfPostfixCode == null) { 
    realSb.append(TEXT_1000);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1001);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1002);
    realSb.append(av.getMultiplicity().getUpperBound());
    realSb.append(TEXT_1003);
     } else { 
    realSb.append(umpleSourceFile);
    realSb.append(TEXT_1004);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1005);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1006);
     if (customMaximumNumberOfPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customMaximumNumberOfPrefixCode,gen.translate("maximumNumberOfMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customMaximumNumberOfPrefixCode, "    ")); } 
    realSb.append(TEXT_1007);
    realSb.append(av.getMultiplicity().getUpperBound());
    realSb.append(TEXT_1008);
     if (customMaximumNumberOfPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customMaximumNumberOfPostfixCode,gen.translate("maximumNumberOfMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customMaximumNumberOfPostfixCode, "    ")); } 
    realSb.append(TEXT_1009);
     } 
    
      }
      
      if (hasAddManyToManyTemplateMethod)
      {
        if (addNewLine) { appendln(realSb,""); }
        addNewLine = true;
        
    realSb.append(TEXT_1010);
    /*association_AddManyToManyMethod_relatedSpecialization*/
    realSb.append(TEXT_1011);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1012);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1013);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1014);
     if (customAddPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_1015);
     if (!av.getMultiplicity().isUpperBoundMany()) { 
    realSb.append(TEXT_1016);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1017);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1018);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1019);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_1020);
     } 
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1021);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1022);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1023);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1024);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1025);
    realSb.append(gen.relatedTranslate("indexOfMethod",av));
    realSb.append(TEXT_1026);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1027);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1028);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1029);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1030);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_1031);
    
      }
      
      if (hasRemoveManyTemplateMethod)
      {
        if (addNewLine) { appendln(realSb,""); }
        addNewLine = true;
        
    realSb.append(TEXT_1032);
    /*association_RemoveMany*/
    realSb.append(TEXT_1033);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1034);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1035);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1036);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1037);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1038);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1039);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1040);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av));
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_1041);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1042);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1043);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1044);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1045);
    realSb.append(gen.relatedTranslate("indexOfMethod",av));
    realSb.append(TEXT_1046);
    realSb.append(self);
    realSb.append(TEXT_1047);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1048);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1049);
    realSb.append(self);
    realSb.append(TEXT_1050);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1051);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1052);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av));
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPost()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1053);
    
      }      

 	  
    if (addNewLine) { appendln(realSb,""); }
    addNewLine = true;
	
      if (includeFile == "association_SetUnidirectionalOptionalOne_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_1054);
    /*association_SetUnidirectionalOptionalOne_relatedSpecialization*/
     String accessModifier = (av.isImmutable()) ? "private" : "public"; 
    realSb.append(TEXT_1055);
    realSb.append(accessModifier);
    realSb.append(TEXT_1056);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_1057);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1058);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1059);
     if (customSetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",av));
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_1060);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1061);
     if (!mulChangedToOne) { 
    realSb.append(gen.translate("parameterNew",av));
     } else { 
    realSb.append(TEXT_1062);
    realSb.append(scName);
    realSb.append(TEXT_1063);
     } 
    realSb.append(TEXT_1064);
     if (mulChangedToOne) { 
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1065);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1066);
     } 
    realSb.append(TEXT_1067);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_1068);
    
      }
      else if (includeFile == "association_SetUnidirectionalOne_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_1069);
    /*association_SetUnidirectionalOne_relatedSpecialization*/
     String accessModifier = (av.isImmutable()) ? "private" : "public"; 
    realSb.append(TEXT_1070);
    realSb.append(accessModifier);
    realSb.append(TEXT_1071);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_1072);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1073);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1074);
     if (customSetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_1075);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1076);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1077);
     if (!mulChangedToOne) { 
    realSb.append(gen.translate("parameterNew",av));
     } else { 
    realSb.append(TEXT_1078);
    realSb.append(scName);
    realSb.append(TEXT_1079);
     } 
    realSb.append(TEXT_1080);
     if (!mulChangedToOne) { 
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1081);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1082);
     } 
    realSb.append(TEXT_1083);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_1084);
    
      }
      else if (includeFile == "association_SetOptionalOneToOne_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_1085);
    /*association_SetOptionalOneToOne_relatedSpecialization*/
    realSb.append(TEXT_1086);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_1087);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1088);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1089);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1090);
     if (customSetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_1091);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1092);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1093);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1094);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1095);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1096);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_1097);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1098);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "      ")); } 
    realSb.append(TEXT_1099);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1100);
     if (!mulChangedToOne) { 
    realSb.append(gen.translate("parameterNew",av));
     } else { 
    realSb.append(TEXT_1101);
    realSb.append(scName);
    realSb.append(TEXT_1102);
     } 
    realSb.append(TEXT_1103);
     if (!mulChangedToOne) { 
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1104);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1105);
     } 
    realSb.append(TEXT_1106);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_1107);
    realSb.append(gen.relatedTranslate("parameterOld",av));
    realSb.append(TEXT_1108);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1109);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1110);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1111);
    realSb.append(gen.relatedTranslate("parameterOld",av));
    realSb.append(TEXT_1112);
    realSb.append(gen.relatedTranslate("parameterOld",av));
    realSb.append(TEXT_1113);
    realSb.append(gen.relatedTranslate("parameterOld",av));
    realSb.append(TEXT_1114);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1115);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1116);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1117);
    realSb.append(gen.relatedTranslate("setMethod",av));
     if (relReqCommonCode) { 
    realSb.append(TEXT_1118);
    realSb.append(gen.relatedTranslate("type",av));
     } 
    realSb.append(TEXT_1119);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,"1"):""));
    realSb.append(TEXT_1120);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_1121);
    
      }
      else if (includeFile == "association_SetOneToOptionalOne_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_1122);
    /*association_SetOneToOptionalOne_relatedSpecialization*/
    realSb.append(TEXT_1123);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_1124);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1125);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1126);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1127);
     if (customSetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_1128);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1129);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_1130);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1131);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1132);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_1133);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_1134);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1135);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1136);
    realSb.append(gen.relatedTranslate("getMethod",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_1137);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1138);
     } else if (relMulChangedToOne) { 
    realSb.append(TEXT_1139);
     } 
    realSb.append(TEXT_1140);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1141);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1142);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_1143);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1144);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1145);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_1146);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1147);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_1148);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1149);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1150);
     if (!mulChangedToOne) { 
    realSb.append(gen.translate("parameterNew",av));
     } else { 
    realSb.append(TEXT_1151);
    realSb.append(scName);
    realSb.append(TEXT_1152);
     } 
    realSb.append(TEXT_1153);
     if (mulChangedToOne) { 
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1154);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1155);
     } 
    realSb.append(TEXT_1156);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1157);
    realSb.append(gen.relatedTranslate("setMethod",av));
     if (relReqCommonCode) { 
    realSb.append(TEXT_1158);
    realSb.append(gen.relatedTranslate("type",av));
     } 
    realSb.append(TEXT_1159);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_1160);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_1161);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1162);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,"1"):""));
    realSb.append(TEXT_1163);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_1164);
     if (mulChangedToOne) { 
    realSb.append(TEXT_598);
    /*association_GetPrivate*/
    realSb.append(TEXT_599);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_600);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_601);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_602);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_603);
    realSb.append(gen.relatedTranslate("parameterOne",av));
    realSb.append(TEXT_604);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_605);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_606);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_607);
    realSb.append(gen.relatedTranslate("parameterOne",av));
    realSb.append(TEXT_608);
    realSb.append(gen.relatedTranslate("parameterOne",av));
    realSb.append(TEXT_609);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_610);
    realSb.append(TEXT_1165);
     } 
    
      }
      else if (includeFile == "association_AddMandatoryManyToOne_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_1166);
    /*association_AddMandatoryManyToOne_relatedSpecialization*/
    realSb.append(TEXT_1167);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1168);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1169);
    realSb.append(gen.translate("methodArgumentsExcept",relatedAssociation));
    realSb.append(TEXT_1170);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1171);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1172);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1173);
    realSb.append(gen.translate("callerArgumentsExcept",relatedAssociation));
    realSb.append(TEXT_1174);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1175);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1176);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1177);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1178);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1179);
     if (customAddPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av));
     append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_1180);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_1181);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1182);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1183);
    realSb.append(gen.relatedTranslate("getMethod",av));
     if (relMulChangedToOne) { 
    realSb.append(TEXT_1184);
    realSb.append(gen.relatedTranslate("type",av));
     } 
    realSb.append(TEXT_1185);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_1186);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1187);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1188);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_1189);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1190);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1191);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1192);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1193);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1194);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_1195);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1196);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1197);
    realSb.append(self);
    realSb.append(TEXT_1198);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1199);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1200);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1201);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av));
     append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_1202);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1203);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1204);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1205);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1206);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1207);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1208);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1209);
    realSb.append(gen.relatedTranslate("getMethod",av));
     if (relMulChangedToOne) { 
    realSb.append(TEXT_1210);
    realSb.append(gen.relatedTranslate("type",av));
     } 
    realSb.append(TEXT_1211);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_1212);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1213);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_1214);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1215);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1216);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1217);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_1218);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1219);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1220);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1221);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPost()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1222);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1223);
    
      }
      else if (includeFile == "association_AddMNToOnlyOne_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_1224);
    /*association_AddMNToOnlyOne_relatedSpecialization*/
    realSb.append(TEXT_1225);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1226);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1227);
    realSb.append(gen.translate("methodArgumentsExcept",relatedAssociation));
    realSb.append(TEXT_1228);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1229);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1230);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1231);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1232);
    realSb.append(gen.translate("callerArgumentsExcept",relatedAssociation));
    realSb.append(TEXT_1233);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1234);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1235);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1236);
     if (customAddPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_1237);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1238);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1239);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1240);
     if (customAddPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_1241);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_1242);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1243);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1244);
    realSb.append(gen.relatedTranslate("getMethod",av));
     if (relMulChangedToOne) { 
    realSb.append(TEXT_1245);
    realSb.append(gen.relatedTranslate("type",av));
     } 
    realSb.append(TEXT_1246);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_1247);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1248);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1249);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_1250);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1251);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1252);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1253);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1254);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_1255);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1256);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_1257);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1258);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1259);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1260);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1261);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1262);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_1263);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1264);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1265);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1266);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1267);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1268);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1269);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1270);
    realSb.append(gen.relatedTranslate("getMethod",av));
     if (relMulChangedToOne) { 
    realSb.append(TEXT_1271);
    realSb.append(gen.relatedTranslate("type",av));
     } 
    realSb.append(TEXT_1272);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_1273);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1274);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_1275);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1276);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1277);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1278);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_1279);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1280);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1281);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1282);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPost()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1283);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1284);
    
      }
      else if (includeFile == "association_AddOptionalNToOne_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_1285);
    /*association_AddOptionalNToOne_relatedSpecialization*/
    realSb.append(TEXT_1286);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1287);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1288);
    realSb.append(gen.translate("methodArgumentsExcept",relatedAssociation));
    realSb.append(TEXT_1289);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1290);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1291);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1292);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1293);
    realSb.append(gen.translate("callerArgumentsExcept",relatedAssociation));
    realSb.append(TEXT_1294);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1295);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1296);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1297);
     if (customAddPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_1298);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1299);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1300);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1301);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_1302);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_1303);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1304);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1305);
    realSb.append(gen.relatedTranslate("getMethod",av));
     if (relMulChangedToOne) { 
    realSb.append(TEXT_1306);
    realSb.append(gen.relatedTranslate("type",av));
     } 
    realSb.append(TEXT_1307);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_1308);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1309);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1310);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1311);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_1312);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1313);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1314);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1315);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1316);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1317);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_1318);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1319);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1320);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1321);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1322);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1323);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1324);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1325);
    realSb.append(gen.relatedTranslate("getMethod",av));
     if (relMulChangedToOne) { 
    realSb.append(TEXT_1326);
    realSb.append(gen.relatedTranslate("type",av));
     } 
    realSb.append(TEXT_1327);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1328);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1329);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1330);
    
      }
      else if (includeFile == "association_SetOptionalNToMany_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_1331);
    /*association_SetOptionalNToMany_relatedSpecialization*/
    realSb.append(TEXT_1332);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_1333);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1334);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1335);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1336);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPrefixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_1337);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1338);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1339);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1340);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1341);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1342);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1343);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1344);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1345);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1346);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1347);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1348);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1349);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1350);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1351);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1352);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_1353);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1354);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1355);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1356);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_1357);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1358);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1359);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1360);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1361);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_1362);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1363);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1364);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1365);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1366);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1367);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1368);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1369);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1370);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1371);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_1372);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_1373);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_1374);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1375);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_1376);
    
      }
      else if (includeFile == "association_AddManyToOne_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_1377);
    /*association_AddManyToOne_relatedSpecialization*/
    realSb.append(TEXT_1378);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1379);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1380);
    realSb.append(gen.translate("methodArgumentsExcept",relatedAssociation));
    realSb.append(TEXT_1381);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1382);
    realSb.append(gen.translate("callerArgumentsExcept",relatedAssociation));
    realSb.append(TEXT_1383);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1384);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1385);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1386);
     if (customAddPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_1387);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_1388);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1389);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1390);
    realSb.append(gen.relatedTranslate("getMethod",av));
     if (relMulChangedToOne) { 
    realSb.append(TEXT_1391);
    realSb.append(gen.relatedTranslate("type",av));
     } 
    realSb.append(TEXT_1392);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_1393);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1394);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1395);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1396);
    realSb.append(gen.relatedTranslate("parameterIsNew",av));
    realSb.append(TEXT_1397);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1398);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1399);
    realSb.append(self);
    realSb.append(TEXT_1400);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1401);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1402);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1403);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_1404);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1405);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1406);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1407);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1408);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1409);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1410);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1411);
    realSb.append(gen.relatedTranslate("getMethod",av));
     if (relMulChangedToOne) { 
    realSb.append(TEXT_1412);
    realSb.append(gen.relatedTranslate("type",av));
     } 
    realSb.append(TEXT_1413);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1414);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1415);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1416);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPost()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1417);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1418);
    
      }
      else if (includeFile == "association_SetOptionalOneToOptionalOne_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_1419);
    /*association_SetOptionalOneToOptionalOne_relatedSpecialization*/
    realSb.append(TEXT_1420);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_1421);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1422);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1423);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1424);
     if (customSetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_1425);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1426);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1427);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1428);
     if (mulChangedToOne) { 
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_1429);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1430);
     } else {
    realSb.append(TEXT_1431);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1432);
    realSb.append(gen.translate("associationOne",av));
     } 
    realSb.append(TEXT_1433);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1434);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1435);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1436);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_1437);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1438);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1439);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_1440);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1441);
    realSb.append(gen.translate("parameterCurrent",av));
    realSb.append(TEXT_1442);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_1443);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1444);
    realSb.append(gen.translate("parameterCurrent",av));
    realSb.append(TEXT_1445);
    realSb.append(gen.translate("parameterCurrent",av));
    realSb.append(TEXT_1446);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1447);
    realSb.append(gen.translate("parameterCurrent",av));
    realSb.append(TEXT_1448);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1449);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1450);
     if (!mulChangedToOne) { 
    realSb.append(gen.translate("parameterNew",av));
     } else { 
    realSb.append(TEXT_1451);
    realSb.append(scName);
    realSb.append(TEXT_1452);
     } 
    realSb.append(TEXT_1453);
     if (mulChangedToOne) { 
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1454);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1455);
     } 
    realSb.append(TEXT_1456);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_1457);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1458);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1459);
    realSb.append(gen.relatedTranslate("getMethod",av));
     if (mulChangedToOne) { 
    realSb.append(TEXT_1460);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_1461);
     } else if (relMulChangedToOne) { 
    realSb.append(TEXT_1462);
     } else { 
    realSb.append(TEXT_1463);
     } 
    realSb.append(TEXT_1464);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1465);
     if (mulChangedToOne) { 
    realSb.append(TEXT_1466);
    realSb.append(scName);
    realSb.append(TEXT_1467);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1468);
    realSb.append(gen.relatedTranslate("setMethod",av));
     if (relReqCommonCode) { 
    realSb.append(TEXT_1469);
    realSb.append(gen.relatedTranslate("type",av));
     } 
    realSb.append(TEXT_1470);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1471);
     } else if (relMulChangedToOne) { 
    realSb.append(TEXT_1472);
    realSb.append(gen.relatedTranslate("setMethod",av));
     if (relReqCommonCode) { 
    realSb.append(TEXT_1473);
    realSb.append(gen.relatedTranslate("type",av));
     } 
    realSb.append(TEXT_1474);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1475);
     } else { 
    realSb.append(TEXT_1476);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_1477);
    realSb.append(gen.relatedTranslate("setMethod",av));
     if (relReqCommonCode) { 
    realSb.append(TEXT_1478);
    realSb.append(gen.relatedTranslate("type",av));
     } 
    realSb.append(TEXT_1479);
     } 
    realSb.append(TEXT_1480);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,"1"):""));
    realSb.append(TEXT_1481);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_1482);
     if (mulChangedToOne || relMulChangedToOne) { 
    realSb.append(TEXT_598);
    /*association_GetPrivate*/
    realSb.append(TEXT_599);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_600);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_601);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_602);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_603);
    realSb.append(gen.relatedTranslate("parameterOne",av));
    realSb.append(TEXT_604);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_605);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_606);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_607);
    realSb.append(gen.relatedTranslate("parameterOne",av));
    realSb.append(TEXT_608);
    realSb.append(gen.relatedTranslate("parameterOne",av));
    realSb.append(TEXT_609);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_610);
    realSb.append(TEXT_1483);
     } 
    
      }
      else if (includeFile == "association_AddMNToMany_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_1484);
    /*association_AddMNToMany_relatedSpecialization*/
    realSb.append(TEXT_1485);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1486);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1487);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1488);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1489);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1490);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1491);
     if (customRemovePostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_1492);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1493);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1494);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1495);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_1496);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1497);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1498);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1499);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1500);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPost()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1501);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1502);
    realSb.append(gen.relatedTranslate("indexOfMethod",av));
    realSb.append(TEXT_1503);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1504);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1505);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1506);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1507);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1508);
    
      }
      else if (includeFile == "association_AddMStarToMany_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_1509);
    /*association_AddMStarToMany_relatedSpecialization*/
    realSb.append(TEXT_1510);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1511);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1512);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1513);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1514);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1515);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1516);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_1517);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1518);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1519);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1520);
     if (customRemovePostfixCode != null) {
      addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_1521);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1522);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1523);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1524);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1525);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPost()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1526);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1527);
    realSb.append(gen.relatedTranslate("indexOfMethod",av));
    realSb.append(TEXT_1528);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1529);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1530);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1531);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1532);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1533);
    
      }
      else if (includeFile == "association_SetOptionalOneToOptionalN_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_1534);
    /*association_SetOptionalOneToOptionalN_relatedSpecialization*/
    realSb.append(TEXT_1535);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_1536);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1537);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1538);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1539);
     if (customSetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_1540);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1541);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1542);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_1543);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1544);
    realSb.append(gen.relatedTranslate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1545);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_1546);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_1547);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1548);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1549);
     if (mulChangedToOne) { 
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_1550);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1551);
     } else {
    realSb.append(TEXT_1552);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1553);
    realSb.append(gen.translate("associationOne",av));
     } 
    realSb.append(TEXT_1554);
     if (!mulChangedToOne) { 
    realSb.append(TEXT_1555);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1556);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1557);
     } else { 
    realSb.append(TEXT_1558);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1559);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1560);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1561);
     } 
    realSb.append(TEXT_1562);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1563);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1564);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1565);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1566);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1567);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1568);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1569);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1570);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_1571);
    
      }
      else if (includeFile == "association_SetOneToMany_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_1572);
    /*association_SetOneToMany_relatedSpecialization*/
    realSb.append(TEXT_1573);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_1574);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1575);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1576);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1577);
     if (customSetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_1578);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1579);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_1580);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1581);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1582);
     if (mulChangedToOne) { 
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_1583);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1584);
     } else {
    realSb.append(TEXT_1585);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1586);
    realSb.append(gen.translate("associationOne",av));
     } 
    realSb.append(TEXT_1587);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1588);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1589);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1590);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1591);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1592);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1593);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1594);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1595);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1596);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_1597);
    
      }
      else if (includeFile == "association_SetOneToManyAssociationClass_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_1598);
    /*association_SetOneToManyAssociationClass_relatedSpecialization*/
    realSb.append(TEXT_1599);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_1600);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1601);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1602);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1603);
     if (customSetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_1604);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1605);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_1606);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1607);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1608);
     if (mulChangedToOne) { 
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_1609);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1610);
     } else {
    realSb.append(TEXT_1611);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1612);
    realSb.append(gen.translate("associationOne",av));
     } 
    realSb.append(TEXT_1613);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1614);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1615);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1616);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1617);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1618);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1619);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1620);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1621);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1622);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1623);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1624);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_1625);
    
      }
      else if (includeFile == "association_SetOneToAtMostN_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_1626);
    /*association_SetOneToAtMostN_relatedSpecialization*/
    realSb.append(TEXT_1627);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_1628);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1629);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1630);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1631);
     if (customSetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_1632);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1633);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1634);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1635);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_1636);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1637);
    realSb.append(relatedAssociation.getMultiplicity().getUpperBound());
    realSb.append(TEXT_1638);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1639);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_1640);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1641);
    realSb.append(gen.relatedTranslate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1642);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_1643);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_1644);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1645);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1646);
     if (mulChangedToOne) { 
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_1647);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1648);
     } else {
    realSb.append(TEXT_1649);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1650);
    realSb.append(gen.translate("associationOne",av));
     } 
    realSb.append(TEXT_1651);
     if (!mulChangedToOne) { 
    realSb.append(TEXT_1652);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1653);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1654);
     } else { 
    realSb.append(TEXT_1655);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1656);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1657);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1658);
     } 
    realSb.append(TEXT_1659);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1660);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1661);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1662);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1663);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1664);
     if (!mulChangedToOne) { 
    realSb.append(TEXT_1665);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1666);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1667);
     } else { 
    realSb.append(TEXT_1668);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1669);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1670);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1671);
     } 
    realSb.append(TEXT_1672);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
        append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_1673);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1674);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1675);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_1676);
    
      }
      else if (includeFile == "association_SetOneToMandatoryMany_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_1677);
    /*association_SetOneToMandatoryMany_relatedSpecialization*/
    realSb.append(TEXT_1678);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_1679);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1680);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1681);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1682);
     if (customSetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",av));
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_1683);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1684);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1685);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1686);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av));
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_1687);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_1688);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1689);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_1690);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1691);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_1692);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1693);
    realSb.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1694);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_1695);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_1696);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1697);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1698);
     if (mulChangedToOne) { 
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_1699);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1700);
     } else {
    realSb.append(TEXT_1701);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1702);
    realSb.append(gen.translate("associationOne",av));
     } 
    realSb.append(TEXT_1703);
     if (!mulChangedToOne) { 
    realSb.append(TEXT_1704);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1705);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1706);
     } else { 
    realSb.append(TEXT_1707);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1708);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1709);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1710);
     } 
    realSb.append(TEXT_1711);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1712);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1713);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1714);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1715);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1716);
     if (!mulChangedToOne) { 
    realSb.append(TEXT_1717);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1718);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1719);
     } else { 
    realSb.append(TEXT_1720);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1721);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1722);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1723);
     } 
    realSb.append(TEXT_1724);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
        append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    realSb.append(TEXT_1725);
     if (!mulChangedToOne) { 
    realSb.append(TEXT_1726);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1727);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1728);
     } else { 
    realSb.append(TEXT_1729);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_1730);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1731);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1732);
     } 
    realSb.append(TEXT_1733);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_1734);
    
      }
      else if (includeFile == "association_AddManyToOptionalOne_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_1735);
    /*association_AddManyToOptionalOne_relatedSpecialization*/
    realSb.append(TEXT_1736);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1737);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1738);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1739);
     if (customAddPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_1740);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_1741);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1742);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1743);
    realSb.append(gen.relatedTranslate("getMethod",av));
     if (relMulChangedToOne) { 
    realSb.append(TEXT_1744);
    realSb.append(gen.relatedTranslate("type",av));
     } 
    realSb.append(TEXT_1745);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1746);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1747);
     if (!relReqSetCode) { 
    realSb.append(TEXT_1748);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1749);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1750);
     } else { 
    realSb.append(TEXT_1751);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1752);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1753);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1754);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1755);
     } 
    realSb.append(TEXT_1756);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1757);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1758);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1759);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1760);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1761);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1762);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1763);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1764);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1765);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_1766);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1767);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1768);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1769);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1770);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1771);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1772);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1773);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1774);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1775);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1776);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1777);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPost()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1778);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1779);
    
      }
      else if (includeFile == "association_SetOptionalOneToMany_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_1780);
    /*association_SetOptionalOneToMany_relatedSpecialization*/
    realSb.append(TEXT_1781);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_1782);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1783);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1784);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1785);
     if (customSetPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPrefixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    realSb.append(TEXT_1786);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1787);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1788);
     if (mulChangedToOne) { 
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_1789);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1790);
     } else {
    realSb.append(TEXT_1791);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1792);
    realSb.append(gen.translate("associationOne",av));
     } 
    realSb.append(TEXT_1793);
     if (!mulChangedToOne) { 
    realSb.append(TEXT_1794);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1795);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1796);
     } else { 
    realSb.append(TEXT_1797);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1798);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_1799);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1800);
     } 
    realSb.append(TEXT_1801);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1802);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1803);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1804);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_1805);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_1806);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1807);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1808);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_1809);
     if (customSetPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetPostfixCode,gen.translate("setMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    realSb.append(TEXT_1810);
    
      }
      else if (includeFile == "association_AddOptionalNToOptionalOne_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_1811);
    /*association_AddOptionalNToOptionalOne_relatedSpecialization*/
    realSb.append(TEXT_1812);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1813);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1814);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1815);
     if (customAddPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_1816);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1817);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1818);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1819);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_1820);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_1821);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1822);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1823);
    realSb.append(gen.relatedTranslate("getMethod",av));
     if (relMulChangedToOne) { 
    realSb.append(TEXT_1824);
    realSb.append(gen.relatedTranslate("type",av));
     } 
    realSb.append(TEXT_1825);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1826);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1827);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1828);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1829);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1830);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1831);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1832);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1833);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1834);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1835);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1836);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1837);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1838);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_1839);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1840);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1841);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1842);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1843);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1844);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1845);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1846);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1847);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1848);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPost()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1849);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1850);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_1851);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1852);
    
      }
      else if (includeFile == "association_AddUnidirectionalMN_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_1853);
    /*association_AddUnidirectionalMN_relatedSpecialization*/
    realSb.append(TEXT_1854);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1855);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1856);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1857);
     if (customAddPrefixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_1858);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1859);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1860);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1861);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1862);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1863);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1864);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1865);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_1866);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1867);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1868);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1869);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1870);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1871);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1872);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1873);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1874);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1875);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1876);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1877);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1878);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1879);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1880);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPost()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1881);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1882);
    
      }
      else if (includeFile == "association_AddMNToOptionalOne_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_1883);
    /*association_AddMNToOptionalOne_relatedSpecialization*/
    realSb.append(TEXT_1884);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1885);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1886);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1887);
     if (customAddPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av));
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_1888);
     if (!av.isStar()) { 
    realSb.append(TEXT_1889);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1890);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_1891);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1892);
     if (customAddPostfixCode != null) {addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_1893);
     } 
    realSb.append(TEXT_1894);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_1895);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1896);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1897);
    realSb.append(gen.relatedTranslate("getMethod",av));
     if (relMulChangedToOne) { 
    realSb.append(TEXT_1898);
    realSb.append(gen.relatedTranslate("type",av));
     } 
    realSb.append(TEXT_1899);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1900);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1901);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1902);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1903);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1904);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_1905);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1906);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_1907);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1908);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1909);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1910);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1911);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1912);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1913);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1914);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1915);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    realSb.append(TEXT_1916);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1917);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1918);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1919);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1920);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1921);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1922);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_1923);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1924);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1925);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1926);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1927);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1928);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1929);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_1930);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1931);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1932);
    
      }
      else if (includeFile == "association_SetNToOptionalOne_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_1933);
    /*association_SetNToOptionalOne_relatedSpecialization*/
    realSb.append(TEXT_1934);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_1935);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1936);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1937);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1938);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPrefixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_1939);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1940);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1941);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1942);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1943);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1944);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1945);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1946);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1947);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av));
        append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "        ")); } 
    realSb.append(TEXT_1948);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1949);
    realSb.append(gen.relatedTranslate("getMethod",av));
     if (relMulChangedToOne) { 
    realSb.append(TEXT_1950);
    realSb.append(gen.relatedTranslate("type",av));
     } 
    realSb.append(TEXT_1951);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1952);
    realSb.append(gen.relatedTranslate("getMethod",av));
     if (relMulChangedToOne) { 
    realSb.append(TEXT_1953);
    realSb.append(gen.relatedTranslate("type",av));
     } 
    realSb.append(TEXT_1954);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
        append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "        ")); } 
    realSb.append(TEXT_1955);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1956);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1957);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1958);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_1959);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1960);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_1961);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1962);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_1963);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1964);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_1965);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1966);
    realSb.append(gen.relatedTranslate("setMethod",av));
     if (relReqCommonCode) { 
    realSb.append(TEXT_1967);
    realSb.append(gen.relatedTranslate("type",av));
     } 
    realSb.append(TEXT_1968);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1969);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1970);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1971);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_1972);
    realSb.append(gen.relatedTranslate("setMethod",av));
     if (relReqCommonCode) { 
    realSb.append(TEXT_1973);
    realSb.append(gen.relatedTranslate("type",av));
     } 
    realSb.append(TEXT_1974);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1975);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1976);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1977);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_1978);
    realSb.append(TEXT_598);
    /*association_GetPrivate*/
    realSb.append(TEXT_599);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_600);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_601);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_602);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_603);
    realSb.append(gen.relatedTranslate("parameterOne",av));
    realSb.append(TEXT_604);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_605);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_606);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_607);
    realSb.append(gen.relatedTranslate("parameterOne",av));
    realSb.append(TEXT_608);
    realSb.append(gen.relatedTranslate("parameterOne",av));
    realSb.append(TEXT_609);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_610);
    
      }
      else if (includeFile == "association_AddUnidirectionalMany_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_1979);
    /*association_AddUnidirectionalMany_relatedSpecialization*/
    realSb.append(TEXT_1980);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_1981);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1982);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1983);
     if (customAddPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1984);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1985);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1986);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1987);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_1988);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_1989);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_1990);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1991);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_1992);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1993);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1994);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1995);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_1996);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_1997);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPost()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_1998);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_1999);
    
      }
      else if (includeFile == "association_AddUnidirectionalOptionalN_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_2000);
    /*association_AddUnidirectionalOptionalN_relatedSpecialization*/
    realSb.append(TEXT_2001);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_2002);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2003);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2004);
     if (customAddPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    realSb.append(TEXT_2005);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_2006);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_2007);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2008);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_2009);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2010);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2011);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_2012);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_2013);
    realSb.append(umpleSourceFile);
    realSb.append(TEXT_2014);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_2015);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2016);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2017);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_2018);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2019);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2020);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_2021);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2022);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2023);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_2024);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_2025);
    
      }
      else if (includeFile == "association_AddUnidirectionalMStar_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_2026);
    /*association_AddUnidirectionalMStar_relatedSpecialization*/
    realSb.append(TEXT_2027);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_2028);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2029);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2030);
     if (customAddPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPrefixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_2031);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2032);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2033);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_2034);
     if (customAddPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customAddPostfixCode,gen.translate("addMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    realSb.append(TEXT_2035);
    realSb.append(gen.translate("removeMethod",av));
    realSb.append(TEXT_2036);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2037);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2038);
     if (customRemovePrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePrefixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    realSb.append(TEXT_2039);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2040);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2041);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_2042);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_2043);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_2044);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2045);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    realSb.append(TEXT_2046);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPre()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_2047);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2048);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2049);
    for( TraceItem traceItemAssocRemove : traceItemAssocRemoves )
    realSb.append((traceItemAssocRemove!=null&&traceItemAssocRemove.getIsPost()?"\n"+traceItemAssocRemove.trace(gen, av,"as_r", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_2050);
     if (customRemovePostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customRemovePostfixCode,gen.translate("removeMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    realSb.append(TEXT_2051);
    
      }
      else if (includeFile == "association_SetUnidirectionalN_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_2052);
    /*association_SetUnidirectionalN_relatedSpecialization*/
     String accessModifier = (av.isImmutable()) ? "private" : "public"; 
    realSb.append(TEXT_2053);
    realSb.append(accessModifier);
    realSb.append(TEXT_2054);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_2055);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2056);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_2057);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPrefixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_2058);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2059);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2060);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2061);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2062);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2063);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_2064);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2065);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2066);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2067);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2068);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2069);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_2070);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2071);
    realSb.append(gen.translate("requiredNumberOfMethod",av));
    realSb.append(TEXT_2072);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2073);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_2074);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2075);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2076);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2077);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_2078);
    
      }
      else if (includeFile == "association_SetUnidirectionalMany_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_2079);
    /*association_SetUnidirectionalMany_relatedSpecialization*/
     String accessModifier = (av.isImmutable()) ? "private" : "public"; 
    realSb.append(TEXT_2080);
    realSb.append(accessModifier);
    realSb.append(TEXT_2081);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_2082);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2083);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_2084);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPrefixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_2085);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2086);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2087);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2088);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2089);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2090);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_2091);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2092);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2093);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2094);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2095);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2096);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_2097);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_2098);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2099);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2100);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2101);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_2102);
    
      }
      else if (includeFile == "association_SetOptionalOneToMandatoryMany_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_2103);
    /*association_SetOptionalOneToMandatoryMany_relatedSpecialization*/
    realSb.append(TEXT_2104);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_2105);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2106);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2107);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2108);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2109);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2110);
     if (mulChangedToOne) { 
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_2111);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2112);
     } else {
    realSb.append(TEXT_2113);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2114);
    realSb.append(gen.translate("associationOne",av));
     } 
    realSb.append(TEXT_2115);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2116);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2117);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2118);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_2119);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2120);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2121);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2122);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2123);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2124);
    realSb.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    realSb.append(TEXT_2125);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_2126);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2127);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_2128);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2129);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_2130);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2131);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2132);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2133);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2134);
    realSb.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    realSb.append(TEXT_2135);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_2136);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2137);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_2138);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2139);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_2140);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2141);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_2142);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2143);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2144);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2145);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2146);
    
      }
      else if (includeFile == "association_SetOptionalOneToMandatoryMN_relatedSpecialization.jet")
      {
        
    /*association_SetOptionalOneToMandatoryMN_relatedSpecialization*/
    realSb.append(TEXT_2147);
    realSb.append(gen.translate("setMethod",av));
    realSb.append(TEXT_2148);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2149);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2150);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2151);
    realSb.append(gen.relatedTranslate("maximumNumberOfMethod",av));
    realSb.append(TEXT_2152);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2153);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2154);
     if (mulChangedToOne) { 
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_2155);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2156);
     } else {
    realSb.append(TEXT_2157);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2158);
    realSb.append(gen.translate("associationOne",av));
     } 
    realSb.append(TEXT_2159);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2160);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2161);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2162);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_2163);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2164);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2165);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2166);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2167);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2168);
    realSb.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    realSb.append(TEXT_2169);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2170);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_2171);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2172);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_2173);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2174);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2175);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2176);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2177);
    realSb.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    realSb.append(TEXT_2178);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2179);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_2180);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2181);
    realSb.append(gen.relatedTranslate("maximumNumberOfMethod",av));
    realSb.append(TEXT_2182);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2183);
    realSb.append(gen.relatedTranslate("numberOfMethod",av));
    realSb.append(TEXT_2184);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2185);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_2186);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2187);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_2188);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2189);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2190);
    realSb.append(gen.translate("associationOne",av));
    realSb.append(TEXT_2191);
    realSb.append(gen.translate("parameterExisting",av));
    realSb.append(TEXT_2192);
    
      }
      else if (includeFile != null)
      {
        appendln(realSb,"You forgot to include {0}",includeFile);
      }
      
      
    
      if (includeFile2 == "association_SetMNToMany_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_2193);
    /*association_SetMNToMany_relatedSpecialization*/
    realSb.append(TEXT_2194);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_2195);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2196);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2197);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_2198);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPrefixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_2199);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2200);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2201);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2202);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2203);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2204);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_2205);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2206);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2207);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2208);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2209);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2210);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_2211);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2212);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_2213);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2214);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2215);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_2216);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2217);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_2218);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2219);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_2220);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2221);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_2222);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2223);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2224);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2225);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_2226);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2227);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2228);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_2229);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_2230);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_2231);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_2232);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_2233);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_2234);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_2235);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2236);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_2237);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_2238);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_2239);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_2240);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av));
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_2241);
    
      }
      else if (includeFile2 == "association_SetMStarToMany_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_2242);
    /*association_SetMStarToMany_relatedSpecialization*/
    realSb.append(TEXT_2243);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_2244);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2245);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2246);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_2247);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPrefixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_2248);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2249);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2250);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2251);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2252);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2253);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_2254);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2255);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2256);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2257);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2258);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2259);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_2260);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2261);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_2262);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2263);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_2264);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2265);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_2266);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2267);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_2268);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2269);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2270);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2271);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_2272);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2273);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2274);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_2275);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_2276);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_2277);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_2278);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_2279);
    realSb.append(gen.translate("parameterNew",av));
    realSb.append(TEXT_2280);
    realSb.append(gen.relatedTranslate("addMethod",av));
    realSb.append(TEXT_2281);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2282);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_2283);
    realSb.append(gen.translate("parameterOldMany",av));
    realSb.append(TEXT_2284);
    realSb.append(gen.translate("parameterOld",av));
    realSb.append(TEXT_2285);
    realSb.append(gen.relatedTranslate("removeMethod",av));
    realSb.append(TEXT_2286);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_2287);
    
      }
      else if (includeFile2 == "association_SetUnidirectionalMN_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_2288);
    /*association_SetUnidirectionalMN_relatedSpecialization*/
     String accessModifier = (av.isImmutable()) ? "private" : "public"; 
    realSb.append(TEXT_2289);
    realSb.append(accessModifier);
    realSb.append(TEXT_2290);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_2291);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2292);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_2293);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPrefixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_2294);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2295);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2296);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2297);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2298);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2299);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_2300);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2301);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2302);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2303);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2304);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2305);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_2306);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2307);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_2308);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2309);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2310);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_2311);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2312);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_2313);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2314);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2315);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2316);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_2317);
    
      }
      else if (includeFile2 == "association_SetMNToOptionalOne_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_2318);
    /*association_SetMNToOptionalOne_relatedSpecialization*/
    
  String existingToNewMap = StringFormatter.format("{0}ToNew{1}", relatedAssociation.getName(), av.getUpperCaseName());
  String orCheckMaxBound = av.isStar() ? "" : StringFormatter.format(" || {0}.length > {1}{2}{3}()", gen.translate("parameterMany",av), gen.translate("maximumNumberOfMethod",av), "_", gen.translate("type",av));

    realSb.append(TEXT_2319);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_2320);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2321);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2322);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_2323);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPrefixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_2324);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_2325);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_2326);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2327);
    realSb.append(orCheckMaxBound);
    realSb.append(TEXT_2328);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_2329);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2330);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_2331);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2332);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_2333);
    realSb.append(existingToNewMap);
    realSb.append(TEXT_2334);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_2335);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2336);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2337);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_2338);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_2339);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2340);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
        append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "        ")); } 
    realSb.append(TEXT_2341);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2342);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_2343);
     if (relMulChangedToOne) { 
    realSb.append(TEXT_2344);
     } 
    realSb.append(TEXT_2345);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2346);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_2347);
     if (relMulChangedToOne) { 
    realSb.append(TEXT_2348);
     } 
    realSb.append(TEXT_2349);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_2350);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_2351);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2352);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_2353);
     if (relMulChangedToOne) { 
    realSb.append(TEXT_2354);
     } 
    realSb.append(TEXT_2355);
    realSb.append(existingToNewMap);
    realSb.append(TEXT_2356);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_2357);
    realSb.append(existingToNewMap);
    realSb.append(TEXT_2358);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_2359);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_2360);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_2361);
    realSb.append(existingToNewMap);
    realSb.append(TEXT_2362);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_2363);
    realSb.append(av.getMultiplicity().getLowerBound());
    realSb.append(TEXT_2364);
     if (customSetManyPostfixCode != null) { append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "          ")); } 
    realSb.append(TEXT_2365);
    realSb.append(existingToNewMap);
    realSb.append(TEXT_2366);
    realSb.append(gen.relatedTranslate("parameterExisting",av));
    realSb.append(TEXT_2367);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_2368);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2369);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2370);
    realSb.append(gen.translate("parameterCheckNewMany",av));
    realSb.append(TEXT_2371);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2372);
    realSb.append(gen.translate("getMethod",av));
    realSb.append(TEXT_2373);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2374);
    realSb.append(gen.relatedTranslate("setMethod",av));
     if (relReqCommonCode) { 
    realSb.append(TEXT_2375);
    realSb.append(gen.relatedTranslate("type",av));
     } 
    realSb.append(TEXT_2376);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2377);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2378);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2379);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_2380);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2381);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_2382);
     if (relMulChangedToOne) { 
    realSb.append(TEXT_2383);
     } 
    realSb.append(TEXT_2384);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2385);
    realSb.append(gen.relatedTranslate("getMethod",av));
    realSb.append(TEXT_2386);
     if (relMulChangedToOne) { 
    realSb.append(TEXT_2387);
     } 
    realSb.append(TEXT_2388);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2389);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2390);
    realSb.append(gen.relatedTranslate("setMethod",av));
     if (relReqCommonCode) { 
    realSb.append(TEXT_2391);
    realSb.append(gen.relatedTranslate("type",av));
     } 
    realSb.append(TEXT_2392);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2393);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2394);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2395);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_2396);
    realSb.append(TEXT_598);
    /*association_GetPrivate*/
    realSb.append(TEXT_599);
    realSb.append(gen.relatedTranslate("setMethod",av));
    realSb.append(TEXT_600);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_601);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_602);
    realSb.append(gen.relatedTranslate("type",av));
    realSb.append(TEXT_603);
    realSb.append(gen.relatedTranslate("parameterOne",av));
    realSb.append(TEXT_604);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_605);
    realSb.append(gen.relatedTranslate("associationOne",av));
    realSb.append(TEXT_606);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_607);
    realSb.append(gen.relatedTranslate("parameterOne",av));
    realSb.append(TEXT_608);
    realSb.append(gen.relatedTranslate("parameterOne",av));
    realSb.append(TEXT_609);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_610);
    
      }
      else if (includeFile2 == "association_SetUnidirectionalOptionalN_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_2397);
    /*association_SetUnidirectionalOptionalN_relatedSpecialization*/
     String accessModifier = (av.isImmutable()) ? "private" : "public"; 
    realSb.append(TEXT_2398);
    realSb.append(accessModifier);
    realSb.append(TEXT_2399);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_2400);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2401);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_2402);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPrefixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_2403);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2404);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2405);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2406);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2407);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2408);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_2409);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2410);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2411);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2412);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2413);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2414);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_2415);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2416);
    realSb.append(gen.translate("maximumNumberOfMethod",av));
    realSb.append(TEXT_2417);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2418);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_2419);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2420);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2421);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2422);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_2423);
    
      }
      else if (includeFile2 == "association_SetUnidirectionalMStar_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_2424);
    /*association_SetUnidirectionalMStar_relatedSpecialization*/
     String accessModifier = (av.isImmutable()) ? "private" : "public"; 
    realSb.append(TEXT_2425);
    realSb.append(accessModifier);
    realSb.append(TEXT_2426);
    realSb.append(gen.translate("setManyMethod",av));
    realSb.append(TEXT_2427);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2428);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_2429);
     if (customSetManyPrefixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPrefixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    realSb.append(TEXT_2430);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2431);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2432);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2433);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2434);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2435);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_2436);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2437);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2438);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2439);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2440);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2441);
    realSb.append(gen.translate("parameterMany",av));
    realSb.append(TEXT_2442);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2443);
    realSb.append(gen.translate("minimumNumberOfMethod",av));
    realSb.append(TEXT_2444);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2445);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
      append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    realSb.append(TEXT_2446);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2447);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2448);
    realSb.append(gen.translate("parameterVerifiedMany",av));
    realSb.append(TEXT_2449);
     if (customSetManyPostfixCode != null) { addUncaughtExceptionVariables(realSb.toString().split("\\n").length,customSetManyPostfixCode,gen.translate("setManyMethod",av)); 
    append(realSb, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    realSb.append(TEXT_2450);
    
      }
      else if (includeFile2 != null)
      {
        appendln(realSb,"You forgot to include {0}",includeFile2);
      }
      
      if(includeFile3 == "association_Sort.jet" && !sortMethodAdded)
      {
        
    /*association_Sort*/
    realSb.append(TEXT_924);
    
        sortMethodAdded = true; //after the sort method has been added, this boolean stops it from being added again
      }
      else if(includeFile3 == "association_AddIndexControlFunctions_relatedSpecialization.jet")
      {
        
    realSb.append(TEXT_2451);
    /*association_AddIndexControlFunctions_relatedSpecialization*/
    realSb.append(TEXT_2452);
    realSb.append(gen.translate("addAtMethod",av));
    realSb.append(TEXT_2453);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2454);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2455);
    realSb.append(gen.translate("addMethod",av));
    realSb.append(TEXT_2456);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2457);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_2458);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_2459);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_2460);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2461);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2462);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2463);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2464);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_2465);
    realSb.append(gen.translate("addOrMoveAtMethod",av));
    realSb.append(TEXT_2466);
    realSb.append(gen.translate("type",av));
    realSb.append(TEXT_2467);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2468);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2469);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2470);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_2471);
    realSb.append(gen.translate("numberOfMethod",av));
    realSb.append(TEXT_2472);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_2473);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2474);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2475);
    realSb.append(gen.translate("associationMany",av));
    realSb.append(TEXT_2476);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2477);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_2478);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPre()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_2479);
    realSb.append(gen.translate("addAtMethod",av));
    realSb.append(TEXT_2480);
    realSb.append(gen.translate("parameterOne",av));
    realSb.append(TEXT_2481);
    for( TraceItem traceItemAssocAdd : traceItemAssocAdds )
    realSb.append((traceItemAssocAdd!=null&&traceItemAssocAdd.getIsPost()?"\n"+traceItemAssocAdd.trace(gen, av,"as_a", uClass,gen.translate("numberOfMethod",av)+"()"):""));
    realSb.append(TEXT_2482);
    
      }

     
    } // end common code
    
    java.util.regex.Pattern lineNumberPattern = java.util.regex.Pattern.compile("// line ([0|1|2|3|4|5|6|7|8|9]*) (.*)");
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
    uncaughtExceptions.get(methodname).addUncaughtFileName(matcher.group(2));
    uncaughtExceptions.get(methodname).addUncaughtUmpleLine(Integer.parseInt(matcher.group(1))-1);
    uncaughtExceptions.get(methodname).addUncaughtJavaLine(javaline+1);
    uncaughtExceptions.get(methodname).addUncaughtLength(lines.length);
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

private Map<String,UncaughtException> uncaughtExceptions;
private UmpleClass globalUmpleClass;

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
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.util.stream.Collectors;
import cruise.umple.core.Generator;
import cruise.umple.cpp.utils.StringUtil;
import java.util.regex.Pattern;
import java.util.*;
import java.io.Serializable;

/**
 * List handlers (vector vs set); cpp-specific
 * Helper methods for many relations
 * Constructor roles
 * Setter roles
 * Delete roles
 * Add roles
 */
// line 52 "../../../../../UmpleTLTemplates/Associations.ump"
// line 165 "../../../../../UmpleTLTemplates/Associations.ump"
// line 180 "../../../../../UmpleTLTemplates/Associations.ump"
// line 198 "../../../../../UmpleTLTemplates/Associations.ump"
// line 258 "../../../../../UmpleTLTemplates/Associations.ump"
// line 312 "../../../../../UmpleTLTemplates/Associations.ump"
// line 679 "../../../../../UmpleTLTemplates/Associations.ump"
// line 1157 "../../../../../UmpleTLTemplates/Associations.ump"
// line 1392 "../../../../../UmpleTLTemplates/Associations.ump"
// line 458 "../../../../../UmpleTLTemplates/Attributes.ump"
// line 834 "../../../../../UmpleTLTemplates/Attributes.ump"
// line 270 "../../../../../UmpleTLTemplates/Association_roles.ump"
// line 350 "../../../../../UmpleTLTemplates/Association_roles.ump"
// line 504 "../../../../../UmpleTLTemplates/Association_roles.ump"
// line 632 "../../../../../UmpleTLTemplates/Association_roles.ump"
public class GenAssociation implements java.io.Serializable
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String CONSTRUCT_DEFAULT_ASSIGN = "constructorDefaultAssign";
  public static final String CONSTRUCT_VALUE_ASSIGN = "constructorValueAssign";
  public static final String CONSTRUCT_CHECK_NULL_ASSIGN = "constructorCheckNullAssign";
  public static final String CONSTRUCT_SET_AND_CHECK = "constructSetAndCheck";
  public static final String CONSTRUCT_SET_VALIDATE_BOUND = "constructSetValidateBounds";
  public static final String SETTER_ASSIGN_DIRECTLY = "attributeSetterAssignDirectly";
  public static final String SETTER_OPTIONAL = "attributeSetterOptional";
  public static final String SETTER_UNBOUND_CHECK = "attributeSetterUnboundCheck";
  public static final String SETTER_UNBOUND = "attributeSetterUnbound";
  public static final String SETTER_ONE = "attributeSetterOne";
  public static final String SETTER_RANGED = "attributeSetterRanged";
  public static final String SETTER_LIST_COPY = "attributeSetterListCopy";
  public static final String SETTER_LIST = "attributeSetterList";
  public static final String SETTER_CHECK_ASSIGN = "attributeSetterCheckAssign";
  public static final String SETTER_USE_EXISTING_SETTER = "attributeSetterUseExistingSetter";
  public static final String SETTER_MAXIMUM_MANY = "attributeSetterMaximumMany";
  public static final String SETTER_USE_EXISTING_REMOVE = "attributeSetterUseExistingRemove";
  public static final String SETTER_HASHMAP = "attributeSetterHashmap";
  public static final String SETTER_MINIMUM_FIXED = "attributeSetterMinimumFixed";
  public static final String DELETE_DIRECTLY = "deleteDirectly";
  public static final String DELETE_CHECK_BY_SETTER = "deleteCheckBySetter(FALSE)";
  public static final String DELETE_CHECK_NULLIFY_BY_SETTER = "deleteCheckBySetter(TRUE)";
  public static final String DELETE_ASSIGN_REMOVE_CHECK = "deleteAssignRemoveCheck";
  public static final String DELETE_USE_DELETE = "deleteUseDelete";
  public static final String DELETE_REMOVE_OR_NULLIFY = "deleteRemoveOrNullify";
  public static final String DELETE_CHECK_USE_DELETE = "deleteCheckUseDelete";
  public static final String DELETE_NULLIFY_ALL_BY_SETTERS = "deleteNullifyAllBySetters";
  public static final String DELETE_USE_INTERNAL_SETTER = "deleteUseInternalSetter";
  public static final String DELETE_SAFELY_CLEAR_AND_REMOVE = "deleteSafelyClearAndRemove";
  public static final String DELETE_NULLIFY_USE_DELETE = "deleteNullifyUseDelete";
  public static final String DELETE_CLEAR_THEN_DELETE_OR_REMOVE = "deleteClearThenDeleteOrRemove";
  public static final String DELETE_ASSIGN_REMOVE = "deleteAssignRemove";
  public static final String ADD_DIRECTLY = "attributeAddDirectly";
  public static final String ADD_REMOVE_EXISTING_OR_THIS = "attributeAddRemoveExistingOrThis";
  public static final String ADD_REMOVE_EXISTING = "attributeAddRemoveExisting";
  public static final String ADD_CHECK_NEW_OTHER_EXISTING = "attributeAddCheckNewOtherExisting";
  public static final String ADD_SET_IF_NEW = "attributeAddSetIfNew";
  public static final String ADD_AND_AND_CHECK = "attributeAddAndCheck";
  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = NL + "struct ";
  public static final String TEXT_1 = " : public std::binary_function<";
  public static final String TEXT_2 = "*, ";
  public static final String TEXT_3 = "*, bool>{" + NL + "  bool operator()(";
  public static final String TEXT_4 = "* Right, ";
  public static final String TEXT_5 = "* Left) const{  " + NL + "    return Right->";
  public static final String TEXT_6 = "() < Left->";
  public static final String TEXT_7 = "();" + NL + "  }" + NL + "};";
  public static final String TEXT_8 = "vector<";
  public static final String TEXT_9 = "*>* ";
  public static final String TEXT_10 = " = this->";
  public static final String TEXT_11 = "();" + NL + "for (unsigned int index=0; index<";
  public static final String TEXT_12 = "->size(); index++) {" + NL + "  ";
  public static final String TEXT_13 = "* a";
  public static final String TEXT_14 = "= (*(";
  public static final String TEXT_15 = "))[index];" + NL + "  a";
  public static final String TEXT_16 = "->";
  public static final String TEXT_17 = "(";
  public static final String TEXT_18 = ");" + NL + "}" + NL;
  public static final String TEXT_19 = "* ";
  public static final String TEXT_20 = "= this->";
  public static final String TEXT_21 = "();" + NL;
  public static final String TEXT_22 = "->";
  public static final String TEXT_23 = "(";
  public static final String TEXT_24 = ");" + NL;
  public static final String TEXT_25 = "->erase(";
  public static final String TEXT_26 = "->begin()+";
  public static final String TEXT_27 = ");";
  public static final String TEXT_28 = "->erase((";
  public static final String TEXT_29 = "*)GetAt(";
  public static final String TEXT_30 = "->begin(), ";
  public static final String TEXT_31 = "));";
  public static final String TEXT_32 = "->push_back(";
  public static final String TEXT_33 = ");";
  public static final String TEXT_34 = "->insert(";
  public static final String TEXT_35 = "->begin()+ ";
  public static final String TEXT_36 = ", ";
  public static final String TEXT_37 = ");";
  public static final String TEXT_38 = "->insert(";
  public static final String TEXT_39 = ");";
  public static final String TEXT_40 = "for(vector<";
  public static final String TEXT_41 = "*>::iterator _";
  public static final String TEXT_42 = "iterator = ";
  public static final String TEXT_43 = "->begin();" + NL + "  _";
  public static final String TEXT_44 = "iterator != ";
  public static final String TEXT_45 = "->end();_";
  public static final String TEXT_46 = "iterator++) {" + NL + "  ";
  public static final String TEXT_47 = "->erase(std::remove(";
  public static final String TEXT_48 = "->begin(), ";
  public static final String TEXT_49 = "->end(), *_";
  public static final String TEXT_50 = "iterator), ";
  public static final String TEXT_51 = "->end());" + NL + "}";
  public static final String TEXT_52 = "set<";
  public static final String TEXT_53 = "*, ";
  public static final String TEXT_54 = ">::iterator _";
  public static final String TEXT_55 = "iterator;" + NL;
  public static final String TEXT_56 = "->erase(";
  public static final String TEXT_57 = "->begin());";
  public static final String TEXT_58 = NL + "this->";
  public static final String TEXT_59 = "->clear();" + NL + NL + "while(this->";
  public static final String TEXT_60 = "->size()>0){" + NL;
  public static final String TEXT_61 = NL + "  ";
  public static final String TEXT_62 = "->";
  public static final String TEXT_63 = "(this);" + NL + "}";
  public static final String TEXT_64 = "while(this->";
  public static final String TEXT_65 = "->size()>0){" + NL;
  public static final String TEXT_66 = NL + "  ";
  public static final String TEXT_67 = "->";
  public static final String TEXT_68 = "(NULL);" + NL + "}";
  public static final String TEXT_69 = "for(unsigned int index=0; index<this->";
  public static final String TEXT_70 = "->size();index++){" + NL;
  public static final String TEXT_71 = NL + "  ";
  public static final String TEXT_72 = "(";
  public static final String TEXT_73 = ", NULL);" + NL + "}" + NL + "this->";
  public static final String TEXT_74 = "->clear();";
  public static final String TEXT_75 = "for(unsigned int index = ";
  public static final String TEXT_76 = "->size(); index > 0 ; index--){" + NL;
  public static final String TEXT_77 = NL + "  ";
  public static final String TEXT_78 = "->deleteAssociatedObjects();" + NL + "}";
  public static final String TEXT_79 = "if(this->";
  public static final String TEXT_80 = "!= NULL){" + NL + "  this->";
  public static final String TEXT_81 = "->deleteAssociatedObjects();" + NL + "}";
  public static final String TEXT_82 = "if(this->";
  public static final String TEXT_83 = "!= NULL){" + NL + "  if(this->";
  public static final String TEXT_84 = "->";
  public static final String TEXT_85 = "()<= this->";
  public static final String TEXT_86 = "->";
  public static final String TEXT_87 = "()){" + NL + "    this->";
  public static final String TEXT_88 = "->deleteAssociatedObjects();" + NL + "  }else{" + NL + "    ";
  public static final String TEXT_89 = "* ";
  public static final String TEXT_90 = "= this->";
  public static final String TEXT_91 = ";" + NL + "    this->";
  public static final String TEXT_92 = "= NULL;" + NL + "    ";
  public static final String TEXT_93 = "->";
  public static final String TEXT_94 = "(this);" + NL + "  }" + NL + "}";
  public static final String TEXT_95 = "if(this->";
  public static final String TEXT_96 = "!= NULL){" + NL + "  ";
  public static final String TEXT_97 = "* ";
  public static final String TEXT_98 = "= this->";
  public static final String TEXT_99 = ";" + NL + "  this->";
  public static final String TEXT_100 = "= NULL;" + NL + "  ";
  public static final String TEXT_101 = "->deleteAssociatedObjects();" + NL + "}";
  public static final String TEXT_102 = "this->";
  public static final String TEXT_103 = "->clear();";
  public static final String TEXT_104 = "this->";
  public static final String TEXT_105 = "= NULL;";
  public static final String TEXT_106 = "if(this->";
  public static final String TEXT_107 = " != NULL){" + NL;
  public static final String TEXT_108 = NL + "}";
  public static final String TEXT_109 = "* ";
  public static final String TEXT_110 = " = this->";
  public static final String TEXT_111 = ";" + NL + "this->";
  public static final String TEXT_112 = " = NULL;" + NL;
  public static final String TEXT_113 = "->";
  public static final String TEXT_114 = "(this);";
  public static final String TEXT_115 = "if(this->";
  public static final String TEXT_116 = "!= NULL){" + NL + "  this->";
  public static final String TEXT_117 = "->";
  public static final String TEXT_118 = "(NULL);";
  public static final String TEXT_119 = "  " + NL + "  this->";
  public static final String TEXT_120 = "= NULL;";
  public static final String TEXT_121 = NL + "}";
  public static final String TEXT_122 = "vector<";
  public static final String TEXT_123 = "*>* ";
  public static final String TEXT_124 = "= new vector<";
  public static final String TEXT_125 = "*>();";
  public static final String TEXT_126 = "set<";
  public static final String TEXT_127 = "*, ";
  public static final String TEXT_128 = ">* ";
  public static final String TEXT_129 = "= new set<";
  public static final String TEXT_130 = "*, ";
  public static final String TEXT_131 = ">();";
  public static final String TEXT_132 = "* ";
  public static final String TEXT_133 = "= (*(";
  public static final String TEXT_134 = "this->";
  public static final String TEXT_135 = "))[";
  public static final String TEXT_136 = "];";
  public static final String TEXT_137 = "set<";
  public static final String TEXT_138 = "*, ";
  public static final String TEXT_139 = ">::iterator ";
  public static final String TEXT_140 = "BeginIterator(";
  public static final String TEXT_141 = "->begin());" + NL;
  public static final String TEXT_142 = "* ";
  public static final String TEXT_143 = "= (";
  public static final String TEXT_144 = "*)GetAt(";
  public static final String TEXT_145 = "BeginIterator, ";
  public static final String TEXT_146 = ");";
  public static final String TEXT_147 = "this->";
  public static final String TEXT_148 = " = new ";
  public static final String TEXT_149 = "<";
  public static final String TEXT_150 = ">();" + NL;
  public static final String TEXT_151 = "<";
  public static final String TEXT_152 = ">::iterator ";
  public static final String TEXT_153 = "BeginIterator(";
  public static final String TEXT_154 = "->begin());" + NL;
  public static final String TEXT_155 = "<";
  public static final String TEXT_156 = ">::iterator ";
  public static final String TEXT_157 = "EndIterator(";
  public static final String TEXT_158 = "->end());" + NL;
  public static final String TEXT_159 = "(";
  public static final String TEXT_160 = "BeginIterator, ";
  public static final String TEXT_161 = "EndIterator, this->";
  public static final String TEXT_162 = ");";
  public static final String TEXT_163 = "<";
  public static final String TEXT_164 = ">* ";
  public static final String TEXT_165 = " = new ";
  public static final String TEXT_166 = "<";
  public static final String TEXT_167 = ">();" + NL;
  public static final String TEXT_168 = "<";
  public static final String TEXT_169 = ">::iterator ";
  public static final String TEXT_170 = "BeginIterator(";
  public static final String TEXT_171 = "->begin());" + NL;
  public static final String TEXT_172 = "<";
  public static final String TEXT_173 = ">::iterator ";
  public static final String TEXT_174 = "EndIterator(";
  public static final String TEXT_175 = "->end());" + NL;
  public static final String TEXT_176 = "(";
  public static final String TEXT_177 = "BeginIterator, ";
  public static final String TEXT_178 = "EndIterator, ";
  public static final String TEXT_179 = ");";
  public static final String TEXT_180 = NL + "//A template function to copy set" + NL + "template<typename InputIterator, typename T>" + NL + "void copySet(InputIterator& it, InputIterator& end ,T* setObj) {  " + NL + "  for (; it != end; ++it) {" + NL + "    setObj->insert(*it);" + NL + "  }" + NL + "};" + NL;
  public static final String TEXT_181 = NL + "//A template function to copy vector" + NL + "template<typename InputIterator, typename T>" + NL + "void copyVector(InputIterator& it, InputIterator& end ,T* vectorObj) {  " + NL + "  for (; it != end; ++it) {" + NL + "    vectorObj->push_back(*it);" + NL + "  }" + NL + "};" + NL;
  public static final String TEXT_182 = NL + "//A template function to get an item in a set by index" + NL + "template < typename InputIterator> " + NL + "void* GetAt(InputIterator& it, int index) {" + NL + "  std::advance(it, index);" + NL + "  return *it;" + NL + "};" + NL + NL;
  public static final String TEXT_183 = NL + "this->";
  public static final String TEXT_184 = "->clear();" + NL + "for(unsigned int index=0; index<";
  public static final String TEXT_185 = "->size();index++){" + NL;
  public static final String TEXT_186 = NL + "  if(";
  public static final String TEXT_187 = "->";
  public static final String TEXT_188 = "()<= ";
  public static final String TEXT_189 = "->";
  public static final String TEXT_190 = "()){" + NL + "    ";
  public static final String TEXT_191 = "->deleteAssociatedObjects();" + NL + "  }else{" + NL + "    ";
  public static final String TEXT_192 = "->";
  public static final String TEXT_193 = "(this);" + NL + "  }" + NL + "}";
  public static final String TEXT_194 = "int index= IndexOf(this->";
  public static final String TEXT_195 = "->begin(), this->";
  public static final String TEXT_196 = "->end(), ";
  public static final String TEXT_197 = ");" + NL + "if(index<0){ " + NL + "  return wasRemoved;" + NL + "}";
  public static final String TEXT_198 = NL + "//";
  public static final String TEXT_199 = " already at minimum (";
  public static final String TEXT_200 = ")" + NL + "if (";
  public static final String TEXT_201 = "() <= ";
  public static final String TEXT_202 = "()){" + NL + "  return false;" + NL + "}";
  public static final String TEXT_203 = NL + "//Unable to remove ";
  public static final String TEXT_204 = ", as it must always have a ";
  public static final String TEXT_205 = NL + "if (this== ";
  public static final String TEXT_206 = "->";
  public static final String TEXT_207 = "()){" + NL + "    return wasRemoved;" + NL + "}";
  public static final String TEXT_208 = NL + "wasRemoved= this->";
  public static final String TEXT_209 = "(index);";
  public static final String TEXT_210 = "->";
  public static final String TEXT_211 = "(NULL);";
  public static final String TEXT_212 = "(";
  public static final String TEXT_213 = ", NULL);";
  public static final String TEXT_214 = NL + "if (";
  public static final String TEXT_215 = "->";
  public static final String TEXT_216 = "(this) == -1){" + NL + "  wasRemoved = true;" + NL + "}else{" + NL + "  wasRemoved = ";
  public static final String TEXT_217 = "->";
  public static final String TEXT_218 = "(this);" + NL + "  if (!wasRemoved){" + NL;
  public static final String TEXT_219 = NL + "  }" + NL + "}";
  public static final String TEXT_220 = "if(index<0){" + NL + "    return wasRemoved;" + NL + "}" + NL + NL + "int size= this->";
  public static final String TEXT_221 = "();" + NL + "if(index> size){" + NL + "    return false;" + NL + "}" + NL;
  public static final String TEXT_222 = NL + "wasRemoved= size== this->";
  public static final String TEXT_223 = "()+1;";
  public static final String TEXT_224 = "this->";
  public static final String TEXT_225 = " = ";
  public static final String TEXT_226 = ";" + NL + "wasSet= true;";
  public static final String TEXT_227 = "if(";
  public static final String TEXT_228 = " != NULL){" + NL + "  this->";
  public static final String TEXT_229 = " = ";
  public static final String TEXT_230 = ";" + NL + "}" + NL + "wasSet= true;";
  public static final String TEXT_231 = "if (";
  public static final String TEXT_232 = " == NULL){" + NL + "  ";
  public static final String TEXT_233 = "* ";
  public static final String TEXT_234 = " = this->";
  public static final String TEXT_235 = ";" + NL + "  this->";
  public static final String TEXT_236 = " = NULL;" + NL + "  " + NL + "  if (";
  public static final String TEXT_237 = " != NULL && ";
  public static final String TEXT_238 = "->";
  public static final String TEXT_239 = "() != NULL){" + NL + "    ";
  public static final String TEXT_240 = "->";
  public static final String TEXT_241 = "(NULL);" + NL + "  }" + NL + "  wasSet = true;" + NL + "  return wasSet;" + NL + "}" + NL + NL;
  public static final String TEXT_242 = "* ";
  public static final String TEXT_243 = " = ";
  public static final String TEXT_244 = "();" + NL + "if (";
  public static final String TEXT_245 = " != NULL && ";
  public static final String TEXT_246 = "!= ";
  public static final String TEXT_247 = "){" + NL + "  ";
  public static final String TEXT_248 = "->";
  public static final String TEXT_249 = "(NULL);" + NL + "}" + NL + NL + "this->";
  public static final String TEXT_250 = " = ";
  public static final String TEXT_251 = ";" + NL;
  public static final String TEXT_252 = "* ";
  public static final String TEXT_253 = " = ";
  public static final String TEXT_254 = "->";
  public static final String TEXT_255 = "();" + NL + NL + "if (this!=";
  public static final String TEXT_256 = "){" + NL + "  ";
  public static final String TEXT_257 = "->";
  public static final String TEXT_258 = "(this);" + NL + "}" + NL + "wasSet= true;";
  public static final String TEXT_259 = "if(";
  public static final String TEXT_260 = " != NULL && ";
  public static final String TEXT_261 = "->";
  public static final String TEXT_262 = "() >= ";
  public static final String TEXT_263 = "->";
  public static final String TEXT_264 = "()){" + NL + "    return wasSet;" + NL + "  }" + NL + "  ";
  public static final String TEXT_265 = "* ";
  public static final String TEXT_266 = " = this->";
  public static final String TEXT_267 = ";" + NL + "this->";
  public static final String TEXT_268 = " = ";
  public static final String TEXT_269 = ";" + NL + "if (";
  public static final String TEXT_270 = " != NULL && ";
  public static final String TEXT_271 = " !=";
  public static final String TEXT_272 = "){" + NL + "  ";
  public static final String TEXT_273 = "->";
  public static final String TEXT_274 = "(this);" + NL + "}" + NL + NL + "if (";
  public static final String TEXT_275 = " != NULL){" + NL + "  ";
  public static final String TEXT_276 = "->";
  public static final String TEXT_277 = "(this);" + NL + "}" + NL + "wasSet= true;";
  public static final String TEXT_278 = "if (this->";
  public static final String TEXT_279 = " != NULL && this->";
  public static final String TEXT_280 = " != ";
  public static final String TEXT_281 = " && this== this->";
  public static final String TEXT_282 = "->";
  public static final String TEXT_283 = "()){" + NL + "  //Unable to set ";
  public static final String TEXT_284 = ", as existing ";
  public static final String TEXT_285 = " would become an orphan" + NL + "  return wasSet;" + NL + "}" + NL + "  " + NL + "this->";
  public static final String TEXT_286 = " = ";
  public static final String TEXT_287 = ";" + NL;
  public static final String TEXT_288 = "* ";
  public static final String TEXT_289 = " = ";
  public static final String TEXT_290 = " != NULL ? ";
  public static final String TEXT_291 = "->";
  public static final String TEXT_292 = "() : NULL;" + NL + NL + "if (this != ";
  public static final String TEXT_293 = "){" + NL + "  if (";
  public static final String TEXT_294 = " != NULL){" + NL + "      ";
  public static final String TEXT_295 = "->";
  public static final String TEXT_296 = " = NULL;" + NL + "   }" + NL + "   " + NL + "  if (this->";
  public static final String TEXT_297 = " != NULL){" + NL + "    this->";
  public static final String TEXT_298 = "->";
  public static final String TEXT_299 = "(this);" + NL + "  }" + NL + "}" + NL + "wasSet= true;";
  public static final String TEXT_300 = "* ";
  public static final String TEXT_301 = " = this->";
  public static final String TEXT_302 = ";" + NL + "if (";
  public static final String TEXT_303 = " == NULL) {" + NL + "  if (";
  public static final String TEXT_304 = " != NULL && ";
  public static final String TEXT_305 = "->";
  public static final String TEXT_306 = "(this)) {" + NL + "    ";
  public static final String TEXT_307 = " = ";
  public static final String TEXT_308 = ";" + NL + "    wasSet = true;" + NL + "  }" + NL + NL + "}else if (";
  public static final String TEXT_309 = "->";
  public static final String TEXT_310 = "() < ";
  public static final String TEXT_311 = "->";
  public static final String TEXT_312 = "()) {" + NL + "  ";
  public static final String TEXT_313 = "->";
  public static final String TEXT_314 = "(this);" + NL + "  if (";
  public static final String TEXT_315 = " != NULL) {" + NL + "    ";
  public static final String TEXT_316 = "->";
  public static final String TEXT_317 = "(this);" + NL + "  }" + NL + NL + "  ";
  public static final String TEXT_318 = " = ";
  public static final String TEXT_319 = ";" + NL + "  wasSet = true;" + NL + "}" + NL + NL + "if (wasSet) {" + NL + "  this->";
  public static final String TEXT_320 = " = ";
  public static final String TEXT_321 = ";" + NL + "}" + NL;
  public static final String TEXT_322 = NL + "for (unsigned int index=0; index<";
  public static final String TEXT_323 = "->size(); index++) {" + NL;
  public static final String TEXT_324 = NL + "  if (IndexOf(";
  public static final String TEXT_325 = "->begin(), ";
  public static final String TEXT_326 = "->end(), temp)> -1) {" + NL + "    continue;" + NL + "  }" + NL;
  public static final String TEXT_327 = NL + "}" + NL + "if (";
  public static final String TEXT_328 = "->size() != ";
  public static final String TEXT_329 = "->size()";
  public static final String TEXT_330 = " || ";
  public static final String TEXT_331 = "->size() < ";
  public static final String TEXT_332 = "()";
  public static final String TEXT_333 = " || ";
  public static final String TEXT_334 = "->size() > ";
  public static final String TEXT_335 = "()";
  public static final String TEXT_336 = "){" + NL + "  return wasSet;" + NL + "}";
  public static final String TEXT_337 = NL;
  public static final String TEXT_338 = NL;
  public static final String TEXT_339 = "";
  public static final String TEXT_340 = " " + NL;
  public static final String TEXT_341 = NL;
  public static final String TEXT_342 = NL + "this->";
  public static final String TEXT_343 = "->clear();" + NL + "for (unsigned int index=0; index<";
  public static final String TEXT_344 = "->size(); index++) {" + NL;
  public static final String TEXT_345 = NL + "  this->";
  public static final String TEXT_346 = "(";
  public static final String TEXT_347 = ");" + NL + "  unsigned int indexOf= IndexOf(";
  public static final String TEXT_348 = "->begin(), ";
  public static final String TEXT_349 = "->end(), ";
  public static final String TEXT_350 = ");" + NL + "  if (index> -1) {" + NL;
  public static final String TEXT_351 = NL + "  }else{" + NL + "    ";
  public static final String TEXT_352 = "->";
  public static final String TEXT_353 = "(this);" + NL + "  }" + NL + "}" + NL + "  " + NL + "for (unsigned int index=0; index<";
  public static final String TEXT_354 = "->size(); index++) {" + NL;
  public static final String TEXT_355 = NL + "  ";
  public static final String TEXT_356 = "->";
  public static final String TEXT_357 = "(this);" + NL + "}";
  public static final String TEXT_358 = NL + "wasSet = true;";
  public static final String TEXT_359 = "if (";
  public static final String TEXT_360 = " == NULL){" + NL + "  return wasSet;" + NL + "}" + NL + NL;
  public static final String TEXT_361 = "* ";
  public static final String TEXT_362 = " = this->";
  public static final String TEXT_363 = ";" + NL + "this->";
  public static final String TEXT_364 = " = ";
  public static final String TEXT_365 = ";" + NL + NL + "if (";
  public static final String TEXT_366 = " != NULL && ";
  public static final String TEXT_367 = " != ";
  public static final String TEXT_368 = "){" + NL + "    ";
  public static final String TEXT_369 = "->";
  public static final String TEXT_370 = "(this);" + NL + "}" + NL + "this->";
  public static final String TEXT_371 = "->";
  public static final String TEXT_372 = "(this);" + NL + "wasSet = true;";
  public static final String TEXT_373 = "if(";
  public static final String TEXT_374 = " == NULL){" + NL + "  //Must provide ";
  public static final String TEXT_375 = " to ";
  public static final String TEXT_376 = NL + "  return wasSet;" + NL + "}";
  public static final String TEXT_377 = NL + NL + "if(";
  public static final String TEXT_378 = "this->";
  public static final String TEXT_379 = "!= NULL&& this->";
  public static final String TEXT_380 = "->";
  public static final String TEXT_381 = "() <= ";
  public static final String TEXT_382 = "->";
  public static final String TEXT_383 = "()";
  public static final String TEXT_384 = " || ";
  public static final String TEXT_385 = "->";
  public static final String TEXT_386 = "() >= ";
  public static final String TEXT_387 = "->";
  public static final String TEXT_388 = "()";
  public static final String TEXT_389 = "){" + NL + "  return wasSet;" + NL + "}" + NL;
  public static final String TEXT_390 = NL;
  public static final String TEXT_391 = "* ";
  public static final String TEXT_392 = " = this->";
  public static final String TEXT_393 = ";" + NL + "this->";
  public static final String TEXT_394 = " = ";
  public static final String TEXT_395 = ";" + NL + "if (";
  public static final String TEXT_396 = " != NULL && ";
  public static final String TEXT_397 = "!= ";
  public static final String TEXT_398 = "){" + NL + "  bool didRemove = ";
  public static final String TEXT_399 = "->";
  public static final String TEXT_400 = "(this);" + NL + "  if(!didRemove){" + NL + "    this->";
  public static final String TEXT_401 = " = ";
  public static final String TEXT_402 = ";" + NL + "    return wasSet;" + NL + "  }" + NL + "}" + NL + "this->";
  public static final String TEXT_403 = "->";
  public static final String TEXT_404 = "(this);" + NL + "wasSet = true;" + NL;
  public static final String TEXT_405 = NL + "for (unsigned int index=0; index<";
  public static final String TEXT_406 = "->size(); index++){" + NL;
  public static final String TEXT_407 = NL + "  unsigned int indexOf= IndexOf(";
  public static final String TEXT_408 = "->begin(), ";
  public static final String TEXT_409 = "->end(), ";
  public static final String TEXT_410 = ");" + NL + "  if(indexOf>-1|| (";
  public static final String TEXT_411 = "->";
  public static final String TEXT_412 = "() != NULL && this !=";
  public static final String TEXT_413 = "->";
  public static final String TEXT_414 = "())){" + NL + "    return wasSet;" + NL + "  }" + NL + "  ";
  public static final String TEXT_415 = NL + "}" + NL + NL + NL + "if (";
  public static final String TEXT_416 = "->size() != ";
  public static final String TEXT_417 = "->size()) {" + NL + "  return wasSet;" + NL + "}" + NL + "  " + NL + "//Remove all ";
  public static final String TEXT_418 = " from ";
  public static final String TEXT_419 = NL;
  public static final String TEXT_420 = NL + "  " + NL + "for (unsigned int index=0 ;index<";
  public static final String TEXT_421 = "->size(); index++){" + NL;
  public static final String TEXT_422 = NL + "  ";
  public static final String TEXT_423 = "(orphan, NULL);" + NL + "}" + NL + "  " + NL;
  public static final String TEXT_424 = "->clear();" + NL + "for (unsigned int index=0; index<";
  public static final String TEXT_425 = "->size(); index++){" + NL;
  public static final String TEXT_426 = NL + "  ";
  public static final String TEXT_427 = "(";
  public static final String TEXT_428 = ", this);" + NL;
  public static final String TEXT_429 = NL + "}" + NL + "wasSet = true;" + NL;
  public static final String TEXT_430 = "if(";
  public static final String TEXT_431 = " == NULL){" + NL + "  //Unable to set ";
  public static final String TEXT_432 = " to NULL, as ";
  public static final String TEXT_433 = " must always be associated to a ";
  public static final String TEXT_434 = NL + "  return wasSet;" + NL + "}" + NL + NL;
  public static final String TEXT_435 = "* ";
  public static final String TEXT_436 = " = ";
  public static final String TEXT_437 = "->";
  public static final String TEXT_438 = "();" + NL + "if (";
  public static final String TEXT_439 = " != NULL && this!= ";
  public static final String TEXT_440 = "){" + NL + "  //Unable to set ";
  public static final String TEXT_441 = ", the current ";
  public static final String TEXT_442 = " already has a ";
  public static final String TEXT_443 = ", which would be orphaned if it were re-assigned" + NL + "  return wasSet;" + NL + "}" + NL + NL;
  public static final String TEXT_444 = "* ";
  public static final String TEXT_445 = " = this->";
  public static final String TEXT_446 = ";" + NL + "this->";
  public static final String TEXT_447 = " = ";
  public static final String TEXT_448 = ";" + NL + "this->";
  public static final String TEXT_449 = "->";
  public static final String TEXT_450 = "(this);" + NL + NL + "if (";
  public static final String TEXT_451 = " != NULL) {" + NL + "  ";
  public static final String TEXT_452 = "->";
  public static final String TEXT_453 = "(NULL);" + NL + "}" + NL + "wasSet = true;" + NL;
  public static final String TEXT_454 = "if(";
  public static final String TEXT_455 = "->size() <= ";
  public static final String TEXT_456 = "()";
  public static final String TEXT_457 = " || ";
  public static final String TEXT_458 = "->size() >= ";
  public static final String TEXT_459 = "()";
  public static final String TEXT_460 = "){" + NL + "  return wasSet;" + NL + "}" + NL;
  public static final String TEXT_461 = NL + "hash_map<";
  public static final String TEXT_462 = "*, int>* ";
  public static final String TEXT_463 = "= new hash_map<";
  public static final String TEXT_464 = "*, int>();" + NL + NL + "for (unsigned int index=0; index<";
  public static final String TEXT_465 = "->size(); index++){" + NL;
  public static final String TEXT_466 = NL + "  unsigned int indexOf= IndexOf(";
  public static final String TEXT_467 = "->begin(), ";
  public static final String TEXT_468 = "->end(), ";
  public static final String TEXT_469 = ");" + NL + "  if(indexOf>-1){" + NL + "    return wasSet;" + NL + "  }" + NL + NL + "  if (";
  public static final String TEXT_470 = "->";
  public static final String TEXT_471 = "() != NULL && this !=";
  public static final String TEXT_472 = "->";
  public static final String TEXT_473 = "()){" + NL + "    ";
  public static final String TEXT_474 = "* ";
  public static final String TEXT_475 = " = ";
  public static final String TEXT_476 = "->";
  public static final String TEXT_477 = "();" + NL + "    if ((*";
  public static final String TEXT_478 = ")[";
  public static final String TEXT_479 = "]== NULL){" + NL + "      ";
  public static final String TEXT_480 = "->insert(std::pair<";
  public static final String TEXT_481 = "*, int>(";
  public static final String TEXT_482 = ",";
  public static final String TEXT_483 = "->";
  public static final String TEXT_484 = "()));" + NL + "    }" + NL + "    int currentCount = (*";
  public static final String TEXT_485 = ")[";
  public static final String TEXT_486 = "];" + NL + "    int nextCount = currentCount - 1;" + NL + "    if (nextCount < 1){" + NL + "      return wasSet;" + NL + "    }" + NL + "    " + NL + "    ";
  public static final String TEXT_487 = "->insert(std::pair<";
  public static final String TEXT_488 = "*, int>(";
  public static final String TEXT_489 = ",nextCount));" + NL + "  }" + NL + "  ";
  public static final String TEXT_490 = NL + "}" + NL + NL + "//Remove all ";
  public static final String TEXT_491 = " from ";
  public static final String TEXT_492 = NL;
  public static final String TEXT_493 = "->clear();" + NL + NL + "for (unsigned int index=0; index<";
  public static final String TEXT_494 = "->size(); index++){" + NL;
  public static final String TEXT_495 = NL + "  ";
  public static final String TEXT_496 = "(";
  public static final String TEXT_497 = ", NULL);" + NL + "}" + NL + NL + "this->";
  public static final String TEXT_498 = "->clear();" + NL + "for (unsigned int index=0; index<";
  public static final String TEXT_499 = "->size(); index++){" + NL;
  public static final String TEXT_500 = NL + "  if (";
  public static final String TEXT_501 = "->";
  public static final String TEXT_502 = "() != NULL){" + NL + "    ";
  public static final String TEXT_503 = "->";
  public static final String TEXT_504 = "()->";
  public static final String TEXT_505 = "(";
  public static final String TEXT_506 = ");" + NL + "  }" + NL + "  ";
  public static final String TEXT_507 = "(";
  public static final String TEXT_508 = ", this);" + NL;
  public static final String TEXT_509 = NL + "}" + NL + NL + "wasSet = true;";
  public static final String TEXT_510 = "if (IndexOf(this->";
  public static final String TEXT_511 = "->begin(), this->";
  public static final String TEXT_512 = "->end(), ";
  public static final String TEXT_513 = ")> -1) {" + NL + "  return wasAdded;" + NL + "}" + NL;
  public static final String TEXT_514 = "if (this->";
  public static final String TEXT_515 = "() >= this->";
  public static final String TEXT_516 = "()){" + NL + "  return ";
  public static final String TEXT_517 = ";" + NL + "}" + NL;
  public static final String TEXT_518 = NL + "wasAdded = true;";
  public static final String TEXT_519 = NL + "if (";
  public static final String TEXT_520 = "->";
  public static final String TEXT_521 = "(this)!= -1) {" + NL + "  wasAdded = true;" + NL + "}else{" + NL + "  wasAdded = ";
  public static final String TEXT_522 = "->";
  public static final String TEXT_523 = "(this);" + NL + "  if(!wasAdded){" + NL + "    int currentIndex= this->";
  public static final String TEXT_524 = "(";
  public static final String TEXT_525 = ");" + NL;
  public static final String TEXT_526 = NL + "  }" + NL + "}";
  public static final String TEXT_527 = "* ";
  public static final String TEXT_528 = " = ";
  public static final String TEXT_529 = "->";
  public static final String TEXT_530 = "();" + NL + "if (";
  public static final String TEXT_531 = " == NULL){" + NL + "  ";
  public static final String TEXT_532 = "->";
  public static final String TEXT_533 = "(this);" + NL + "}else if(this!= ";
  public static final String TEXT_534 = "){" + NL + "  ";
  public static final String TEXT_535 = "->";
  public static final String TEXT_536 = "(";
  public static final String TEXT_537 = ");" + NL + "  this->";
  public static final String TEXT_538 = "(";
  public static final String TEXT_539 = ");" + NL + "}else{" + NL;
  public static final String TEXT_540 = NL + "}" + NL + "wasAdded = true;";
  public static final String TEXT_541 = "* ";
  public static final String TEXT_542 = " = ";
  public static final String TEXT_543 = "->";
  public static final String TEXT_544 = "();" + NL + "bool ";
  public static final String TEXT_545 = "= ";
  public static final String TEXT_546 = " != NULL && this!=";
  public static final String TEXT_547 = ";" + NL + "if(";
  public static final String TEXT_548 = "){" + NL + "  ";
  public static final String TEXT_549 = "->";
  public static final String TEXT_550 = "(this);" + NL + "}else{" + NL;
  public static final String TEXT_551 = NL + "}" + NL + "wasAdded= true;";
  public static final String TEXT_552 = "* ";
  public static final String TEXT_553 = " = ";
  public static final String TEXT_554 = "->";
  public static final String TEXT_555 = "();" + NL + "if (";
  public static final String TEXT_556 = " != NULL){" + NL + "  if(";
  public static final String TEXT_557 = "->";
  public static final String TEXT_558 = "() <= ";
  public static final String TEXT_559 = "()){" + NL + "          return wasAdded;" + NL + "  }else{" + NL + "      ";
  public static final String TEXT_560 = "->";
  public static final String TEXT_561 = "(";
  public static final String TEXT_562 = ");" + NL + "  }" + NL + "}" + NL;
  public static final String TEXT_563 = NL;
  public static final String TEXT_564 = "(";
  public static final String TEXT_565 = ",this);" + NL + "wasAdded = true;";
  public static final String TEXT_566 = "* ";
  public static final String TEXT_567 = " = ";
  public static final String TEXT_568 = "->";
  public static final String TEXT_569 = "();" + NL + "bool ";
  public static final String TEXT_570 = "= ";
  public static final String TEXT_571 = " != NULL && this!=";
  public static final String TEXT_572 = ";" + NL + "if(";
  public static final String TEXT_573 = "){" + NL + "  if(";
  public static final String TEXT_574 = "->";
  public static final String TEXT_575 = "() <= ";
  public static final String TEXT_576 = "()){" + NL + "    return wasAdded;" + NL + "  }" + NL + "  ";
  public static final String TEXT_577 = "->";
  public static final String TEXT_578 = "(this);" + NL + "}else{" + NL;
  public static final String TEXT_579 = NL + "}" + NL + "wasAdded= true;";
  public static final String TEXT_580 = "return new ";
  public static final String TEXT_581 = "(";
  public static final String TEXT_582 = ");";
  public static final String TEXT_583 = "IndexOf(this->";
  public static final String TEXT_584 = "->begin(), this->";
  public static final String TEXT_585 = "->end(),";
  public static final String TEXT_586 = ")";
  public static final String TEXT_587 = "if(";
  public static final String TEXT_588 = "(";
  public static final String TEXT_589 = ")){" + NL + "    int newIndex= index;" + NL + "    if(index < 0 ) { " + NL + "        newIndex = 0; " + NL + "    }" + NL + "  " + NL + "    int size= this->";
  public static final String TEXT_590 = "();" + NL + "    if(size>0){" + NL + "      ";
  public static final String TEXT_591 = "    " + NL + "    }" + NL + "  " + NL + "    size= this->";
  public static final String TEXT_592 = "();" + NL + "    if(newIndex > size) { " + NL + "        newIndex = size; " + NL + "    }" + NL + "  " + NL + " ";
  public static final String TEXT_593 = NL + "    wasAdded = true;" + NL + "}";
  public static final String TEXT_594 = "if(IndexOf(this->";
  public static final String TEXT_595 = "->begin(), this->";
  public static final String TEXT_596 = "->end(), ";
  public static final String TEXT_597 = ") > -1) {" + NL + "  if (index < 0) {" + NL + "    index = 0;" + NL + "  }" + NL + NL + "  int size= this->";
  public static final String TEXT_598 = "();" + NL + "  if (index > size) {" + NL + "    index = size - 1;" + NL + "  }" + NL + "  " + NL + "  wasAdded= this->";
  public static final String TEXT_599 = "(";
  public static final String TEXT_600 = ")| this->";
  public static final String TEXT_601 = "(";
  public static final String TEXT_602 = ", index);" + NL + "}else{" + NL + "  wasAdded= this->";
  public static final String TEXT_603 = "(";
  public static final String TEXT_604 = ", index);" + NL + "}" + NL;
  public static final String TEXT_605 = "int number=this->";
  public static final String TEXT_606 = "->size();";
  public static final String TEXT_607 = "this->";
  public static final String TEXT_608 = "()>0";
  public static final String TEXT_609 = "IndexOf(this->";
  public static final String TEXT_610 = "->begin(), this->";
  public static final String TEXT_611 = "->end(), ";
  public static final String TEXT_612 = ")";
  public static final String TEXT_613 = "if (";
  public static final String TEXT_614 = " == NULL || ";
  public static final String TEXT_615 = "->";
  public static final String TEXT_616 = "() != NULL){" + NL + "  throw \"Unable to create ";
  public static final String TEXT_617 = " due to ";
  public static final String TEXT_618 = "\";" + NL + "}" + NL + "this->";
  public static final String TEXT_619 = " = ";
  public static final String TEXT_620 = ";";
  public static final String TEXT_621 = "if (!";
  public static final String TEXT_622 = "(";
  public static final String TEXT_623 = ")){" + NL + "  throw \"Unable to create ";
  public static final String TEXT_624 = " due to ";
  public static final String TEXT_625 = "\";" + NL + "}";
  public static final String TEXT_626 = "if (!";
  public static final String TEXT_627 = "(";
  public static final String TEXT_628 = ")){";
  public static final String TEXT_629 = NL + "  throw \"Unable to create ";
  public static final String TEXT_630 = ", must have at least ";
  public static final String TEXT_631 = " ";
  public static final String TEXT_632 = "\";";
  public static final String TEXT_633 = NL + "  throw \"Unable to create ";
  public static final String TEXT_634 = ", must have ";
  public static final String TEXT_635 = " to ";
  public static final String TEXT_636 = " ";
  public static final String TEXT_637 = "\";";
  public static final String TEXT_638 = NL + "}";
  public static final String TEXT_639 = "this->";
  public static final String TEXT_640 = ".assign(other.";
  public static final String TEXT_641 = ");";
  public static final String TEXT_642 = "this->";
  public static final String TEXT_643 = "= other.";
  public static final String TEXT_644 = ";";
  public static final String TEXT_645 = "copyObject(other.";
  public static final String TEXT_646 = ", this->";
  public static final String TEXT_647 = ", sizeof other.";
  public static final String TEXT_648 = ");";

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenAssociation Attributes
  private String value;
  private boolean constant;
  private boolean autounique;
  private boolean immutable;
  private boolean derived;
  private boolean internal;
  private boolean defaulted;
  private boolean isStatic;
  private boolean isSorted;
  private boolean isLazy;
  private GenAssociationEnd source;
  private GenAssociationEnd target;
  private String sortKey;
  private String binding;
  private String bindingParameters;
  private boolean checkUnique;
  private boolean isAttribute;
  private transient Comparator<GenComment> commentsPriority;
  private transient Comparator<GenRequirement> requirementsPriority;

  //GenAssociation Associations
  private List<GenComment> comments;
  private List<GenRequirement> requirements;
  private GenClass owner;
  private List<GenField> relatedFields;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenAssociation()
  {
    value = null;
    constant = false;
    autounique = false;
    immutable = false;
    derived = false;
    internal = false;
    defaulted = false;
    isStatic = false;
    isSorted = false;
    isLazy = false;
    sortKey = null;
    binding = null;
    bindingParameters = null;
    checkUnique = false;
    isAttribute = false;
    commentsPriority = 
      Comparator.comparing(GenComment::getPriority);
    requirementsPriority = 
      Comparator.comparing(GenRequirement::getPriority);
    comments = new ArrayList<GenComment>();
    requirements = new ArrayList<GenRequirement>();
    relatedFields = new ArrayList<GenField>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setValue(String aValue)
  {
    boolean wasSet = false;
    value = aValue;
    wasSet = true;
    return wasSet;
  }

  public boolean setConstant(boolean aConstant)
  {
    boolean wasSet = false;
    constant = aConstant;
    wasSet = true;
    return wasSet;
  }

  public boolean setAutounique(boolean aAutounique)
  {
    boolean wasSet = false;
    autounique = aAutounique;
    wasSet = true;
    return wasSet;
  }

  public boolean setImmutable(boolean aImmutable)
  {
    boolean wasSet = false;
    immutable = aImmutable;
    wasSet = true;
    return wasSet;
  }

  public boolean setDerived(boolean aDerived)
  {
    boolean wasSet = false;
    derived = aDerived;
    wasSet = true;
    return wasSet;
  }

  public boolean setInternal(boolean aInternal)
  {
    boolean wasSet = false;
    internal = aInternal;
    wasSet = true;
    return wasSet;
  }

  public boolean setDefaulted(boolean aDefaulted)
  {
    boolean wasSet = false;
    defaulted = aDefaulted;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsStatic(boolean aIsStatic)
  {
    boolean wasSet = false;
    isStatic = aIsStatic;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsSorted(boolean aIsSorted)
  {
    boolean wasSet = false;
    isSorted = aIsSorted;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsLazy(boolean aIsLazy)
  {
    boolean wasSet = false;
    isLazy = aIsLazy;
    wasSet = true;
    return wasSet;
  }

  public boolean setSource(GenAssociationEnd aSource)
  {
    boolean wasSet = false;
    source = aSource;
    wasSet = true;
    return wasSet;
  }

  public boolean setTarget(GenAssociationEnd aTarget)
  {
    boolean wasSet = false;
    target = aTarget;
    wasSet = true;
    return wasSet;
  }

  public boolean setSortKey(String aSortKey)
  {
    boolean wasSet = false;
    sortKey = aSortKey;
    wasSet = true;
    return wasSet;
  }

  public boolean setBinding(String aBinding)
  {
    boolean wasSet = false;
    binding = aBinding;
    wasSet = true;
    return wasSet;
  }

  public boolean setBindingParameters(String aBindingParameters)
  {
    boolean wasSet = false;
    bindingParameters = aBindingParameters;
    wasSet = true;
    return wasSet;
  }

  public boolean setCheckUnique(boolean aCheckUnique)
  {
    boolean wasSet = false;
    checkUnique = aCheckUnique;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsAttribute(boolean aIsAttribute)
  {
    boolean wasSet = false;
    isAttribute = aIsAttribute;
    wasSet = true;
    return wasSet;
  }

  public boolean setCommentsPriority(Comparator<GenComment> aCommentsPriority)
  {
    boolean wasSet = false;
    commentsPriority = aCommentsPriority;
    wasSet = true;
    return wasSet;
  }

  public boolean setRequirementsPriority(Comparator<GenRequirement> aRequirementsPriority)
  {
    boolean wasSet = false;
    requirementsPriority = aRequirementsPriority;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return source.getName();
  }

  public boolean getUseMinimum()
  {
    return source.isUseMinimum();
  }

  public boolean getUseMaximum()
  {
    return source.isUseMaximum();
  }

  public boolean getRemoveCheckEmpty()
  {
    return target.isOne() && source.isNavigable();
  }

  public boolean getRemoveCheckExistence()
  {
    return _removeCheckExistence();
  }

  public boolean getRemoveCheckNullify()
  {
    return _removeCheckNullify();
  }

  public boolean getRemoveNullifyInternally()
  {
    return _removeNullifyInternally();
  }

  public String getValue()
  {
    return value;
  }

  public boolean getConstant()
  {
    return constant;
  }

  public boolean getAutounique()
  {
    return autounique;
  }

  public boolean getImmutable()
  {
    return immutable;
  }

  public boolean getDerived()
  {
    return derived;
  }

  public boolean getInternal()
  {
    return internal;
  }

  public boolean getDefaulted()
  {
    return defaulted;
  }

  public boolean getIsStatic()
  {
    return isStatic;
  }

  public boolean getIsSorted()
  {
    return isSorted;
  }

  public boolean getIsLazy()
  {
    return isLazy;
  }

  public boolean getIsKey()
  {
    return sortKey != null && !sortKey.isEmpty();
  }

  public GenAssociationEnd getSource()
  {
    return source;
  }

  public GenAssociationEnd getTarget()
  {
    return target;
  }

  public boolean getMany()
  {
    return getSource().isMany();
  }

  public String getSortKey()
  {
    return sortKey;
  }

  public String getBinding()
  {
    return binding;
  }

  public String getBindingParameters()
  {
    return bindingParameters;
  }

  public boolean getCheckUnique()
  {
    return checkUnique;
  }

  public boolean getIsAttribute()
  {
    return isAttribute;
  }

  /**
   * Only accepted if from many to one or more.
   * Examples:   1 -- 2 M; 1 -- 2..4 H; 1 -- 1..3 Y;  1 -- 2..* X;  1 -- 0..* U;  1 -- 1..* W; 1 -- 5..5 F; 1 -- 2..4 H;
   * 1 -- 1..3 Y; 1 -- 2..* X; 1 -- 1..* W; 1 -- 5 Q;1 -- * T;
   */

  public boolean getHasAdditionalAdd()
  {
    return getTarget().getLowerBound()==1 && getTarget().getUpperBound()>=1 && getSource().isMany();
  }

  public Comparator<GenComment> getCommentsPriority()
  {
    return commentsPriority;
  }

  public Comparator<GenRequirement> getRequirementsPriority()
  {
    return requirementsPriority;
  }
  /* Code from template attribute_IsBooleanDerived */
  public boolean isUseMinimum()
  {
    return source.isUseMinimum();
  }
  /* Code from template attribute_IsBooleanDerived */
  public boolean isUseMaximum()
  {
    return source.isUseMaximum();
  }
  /* Code from template attribute_IsBooleanDerived */
  public boolean isRemoveCheckEmpty()
  {
    return target.isOne() && source.isNavigable();
  }
  /* Code from template attribute_IsBooleanDerived */
  public boolean isRemoveCheckExistence()
  {
    return _removeCheckExistence();
  }
  /* Code from template attribute_IsBooleanDerived */
  public boolean isRemoveCheckNullify()
  {
    return _removeCheckNullify();
  }
  /* Code from template attribute_IsBooleanDerived */
  public boolean isRemoveNullifyInternally()
  {
    return _removeNullifyInternally();
  }
  /* Code from template attribute_IsBoolean */
  public boolean isConstant()
  {
    return constant;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isAutounique()
  {
    return autounique;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isImmutable()
  {
    return immutable;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isDerived()
  {
    return derived;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isInternal()
  {
    return internal;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isDefaulted()
  {
    return defaulted;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsStatic()
  {
    return isStatic;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsSorted()
  {
    return isSorted;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsLazy()
  {
    return isLazy;
  }
  /* Code from template attribute_IsBooleanDerived */
  public boolean isIsKey()
  {
    return sortKey != null && !sortKey.isEmpty();
  }
  /* Code from template attribute_IsBooleanDerived */
  public boolean isMany()
  {
    return getSource().isMany();
  }
  /* Code from template attribute_IsBoolean */
  public boolean isCheckUnique()
  {
    return checkUnique;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsAttribute()
  {
    return isAttribute;
  }
  /* Code from template attribute_IsBooleanDerived */
  public boolean isHasAdditionalAdd()
  {
    return getTarget().getLowerBound()==1 && getTarget().getUpperBound()>=1 && getSource().isMany();
  }
  /* Code from template association_GetMany */
  public GenComment getComment(int index)
  {
    GenComment aComment = comments.get(index);
    return aComment;
  }

  public List<GenComment> getComments()
  {
    List<GenComment> newComments = Collections.unmodifiableList(comments);
    return newComments;
  }

  public int numberOfComments()
  {
    int number = comments.size();
    return number;
  }

  public boolean hasComments()
  {
    boolean has = comments.size() > 0;
    return has;
  }

  public int indexOfComment(GenComment aComment)
  {
    int index = comments.indexOf(aComment);
    return index;
  }
  /* Code from template association_GetMany */
  public GenRequirement getRequirement(int index)
  {
    GenRequirement aRequirement = requirements.get(index);
    return aRequirement;
  }

  public List<GenRequirement> getRequirements()
  {
    List<GenRequirement> newRequirements = Collections.unmodifiableList(requirements);
    return newRequirements;
  }

  public int numberOfRequirements()
  {
    int number = requirements.size();
    return number;
  }

  public boolean hasRequirements()
  {
    boolean has = requirements.size() > 0;
    return has;
  }

  public int indexOfRequirement(GenRequirement aRequirement)
  {
    int index = requirements.indexOf(aRequirement);
    return index;
  }
  /* Code from template association_GetOne */
  public GenClass getOwner()
  {
    return owner;
  }

  public boolean hasOwner()
  {
    boolean has = owner != null;
    return has;
  }
  /* Code from template association_GetMany */
  public GenField getRelatedField(int index)
  {
    GenField aRelatedField = relatedFields.get(index);
    return aRelatedField;
  }

  public List<GenField> getRelatedFields()
  {
    List<GenField> newRelatedFields = Collections.unmodifiableList(relatedFields);
    return newRelatedFields;
  }

  public int numberOfRelatedFields()
  {
    int number = relatedFields.size();
    return number;
  }

  public boolean hasRelatedFields()
  {
    boolean has = relatedFields.size() > 0;
    return has;
  }

  public int indexOfRelatedField(GenField aRelatedField)
  {
    int index = relatedFields.indexOf(aRelatedField);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfComments()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addComment(GenComment aComment)
  {
    boolean wasAdded = false;
    if (comments.contains(aComment)) { return false; }
    GenAssociation existingGenAssociation = aComment.getGenAssociation();
    if (existingGenAssociation == null)
    {
      aComment.setGenAssociation(this);
    }
    else if (!this.equals(existingGenAssociation))
    {
      existingGenAssociation.removeComment(aComment);
      addComment(aComment);
    }
    else
    {
      comments.add(aComment);
    }
    wasAdded = true;
    if(wasAdded)
        Collections.sort(comments, commentsPriority);
    
    return wasAdded;
  }

  public boolean removeComment(GenComment aComment)
  {
    boolean wasRemoved = false;
    if (comments.contains(aComment))
    {
      comments.remove(aComment);
      aComment.setGenAssociation(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfRequirements()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addRequirement(GenRequirement aRequirement)
  {
    boolean wasAdded = false;
    if (requirements.contains(aRequirement)) { return false; }
    GenAssociation existingGenAssociation = aRequirement.getGenAssociation();
    if (existingGenAssociation == null)
    {
      aRequirement.setGenAssociation(this);
    }
    else if (!this.equals(existingGenAssociation))
    {
      existingGenAssociation.removeRequirement(aRequirement);
      addRequirement(aRequirement);
    }
    else
    {
      requirements.add(aRequirement);
    }
    wasAdded = true;
    if(wasAdded)
        Collections.sort(requirements, requirementsPriority);
    
    return wasAdded;
  }

  public boolean removeRequirement(GenRequirement aRequirement)
  {
    boolean wasRemoved = false;
    if (requirements.contains(aRequirement))
    {
      requirements.remove(aRequirement);
      aRequirement.setGenAssociation(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setOwner(GenClass aOwner)
  {
    boolean wasSet = false;
    GenClass existingOwner = owner;
    owner = aOwner;
    if (existingOwner != null && !existingOwner.equals(aOwner))
    {
      existingOwner.removeAssociation(this);
    }
    if (aOwner != null)
    {
      aOwner.addAssociation(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfRelatedFields()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addRelatedField(GenField aRelatedField)
  {
    boolean wasAdded = false;
    if (relatedFields.contains(aRelatedField)) { return false; }
    GenAssociation existingRelatedAssociation = aRelatedField.getRelatedAssociation();
    if (existingRelatedAssociation == null)
    {
      aRelatedField.setRelatedAssociation(this);
    }
    else if (!this.equals(existingRelatedAssociation))
    {
      existingRelatedAssociation.removeRelatedField(aRelatedField);
      addRelatedField(aRelatedField);
    }
    else
    {
      relatedFields.add(aRelatedField);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeRelatedField(GenField aRelatedField)
  {
    boolean wasRemoved = false;
    if (relatedFields.contains(aRelatedField))
    {
      relatedFields.remove(aRelatedField);
      aRelatedField.setRelatedAssociation(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addRelatedFieldAt(GenField aRelatedField, int index)
  {  
    boolean wasAdded = false;
    if(addRelatedField(aRelatedField))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfRelatedFields()) { index = numberOfRelatedFields() - 1; }
      relatedFields.remove(aRelatedField);
      relatedFields.add(index, aRelatedField);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveRelatedFieldAt(GenField aRelatedField, int index)
  {
    boolean wasAdded = false;
    if(relatedFields.contains(aRelatedField))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfRelatedFields()) { index = numberOfRelatedFields() - 1; }
      relatedFields.remove(aRelatedField);
      relatedFields.add(index, aRelatedField);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addRelatedFieldAt(aRelatedField, index);
    }
    return wasAdded;
  }

  /* Code from template association_sorted_serializable_readObject */ 
  private void readObject(java.io.ObjectInputStream in)
  throws Exception
  {
    in.defaultReadObject();

    commentsPriority = 
      Comparator.comparing(GenComment::getPriority);
    requirementsPriority = 
      Comparator.comparing(GenRequirement::getPriority);
  }
  
  public void delete()
  {
    while( !comments.isEmpty() )
    {
      comments.get(0).setGenAssociation(null);
    }
    while( !requirements.isEmpty() )
    {
      requirements.get(0).setGenAssociation(null);
    }
    if (owner != null)
    {
      GenClass placeholderOwner = owner;
      this.owner = null;
      placeholderOwner.removeAssociation(this);
    }
    while( !relatedFields.isEmpty() )
    {
      relatedFields.get(0).setRelatedAssociation(null);
    }
  }

  // line 59 "../../../../../UmpleTLTemplates/Associations.ump"
  public Boolean _removeCheckExistence(){
    if(!source.isNavigable()){
			return false;
		}
		
		if(source.isDirected() || source.isRangedOptional()|| source.isRangedUnbound()|| source.isFixed()|| source.isUnbound()){
			return target.isRangedOptional()|| target.isRangedUnbound()|| target.isRangedMandatory()|| target.isFixed()|| target.isUnbound();
		}
		return false;
  }

  // line 71 "../../../../../UmpleTLTemplates/Associations.ump"
  public Boolean _removeCheckNullify(){
    if(source.isDirected()){
			return false;
		}
		
		if(source.isRangedOptional()|| source.isUnbound()){
			return target.isOptional();
		}
		return false;
  }

  // line 83 "../../../../../UmpleTLTemplates/Associations.ump"
  public Boolean _removeNullifyInternally(){
    if(source.isDirected()){
			return false;
		}
		
		if(source.isRangedUnbound()|| source.isRangedMandatory()){
			return target.isOptional();
		}
		
		return false;
  }

  // line 99 "../../../../../UmpleTLTemplates/Associations.ump"
  public String emitComments(){
    return this.getComments().stream().map(GenComment::getBody).collect(Collectors.joining(NL));
  }

  // line 102 "../../../../../UmpleTLTemplates/Associations.ump"
  public String emitRequirements(){
    return this.getRequirements().stream().map(GenRequirement::getBody).collect(Collectors.joining(NL));
  }

  // line 119 "../../../../../UmpleTLTemplates/Associations.ump"
  public String normalizedName(){
    return source.isMany()?source.getRoles():source.getRole();
  }

  // line 123 "../../../../../UmpleTLTemplates/Associations.ump"
  public Boolean isSettable(){
    if(isConstant() || isIsStatic() || isInternal() || (isImmutable() && !isIsLazy())){
			return false;
		}
		
		return true;
  }

  // line 131 "../../../../../UmpleTLTemplates/Associations.ump"
  public Boolean isGettable(){
    if(getInternal() || getIsStatic() || isConstant()){
			return false;
		}
		
		return true;
  }

  // line 139 "../../../../../UmpleTLTemplates/Associations.ump"
  public String comparatorId(){
    return comparatorId(source.getType(), getSortKey());
  }

  // line 188 "../../../../../UmpleTLTemplates/Associations.ump"
  public GenClass getTargetClass(){
    return getOwner().getGenPackage().classByName(getTarget().getType());
  }

  // line 192 "../../../../../UmpleTLTemplates/Associations.ump"
  public GenClass getSourceClass(){
    return getOwner().getGenPackage().classByName(getSource().getType());
  }


  /**
   * const String BindingNotificationMany= "bindingNotificationMany";
   * const String BindingNotificationSingle= "bindingNotificationSingle";
   */
  // line 205 "../../../../../UmpleTLTemplates/Associations.ump"
  public String getBindingNotificationBody(){
    if(source.isMany()){
			return bindingNotificationMany();
		}
		
		return bindingNotificationSingle();
  }

  // line 213 "../../../../../UmpleTLTemplates/Associations.ump"
  public String normalizedType(){
    return normalizedType(source.isMany());
  }

  // line 217 "../../../../../UmpleTLTemplates/Associations.ump"
  public String normalizedType(Boolean isMany){
    //TODO: externalize. Move it to GenPackage and use it by other classes
		String type= getOwner().getGenPackage().getNormalizedType(source.getType());
		if(isMany){
			if(sortKey != null && !sortKey.isEmpty()){
				return "set<"+ type+ ", "+ getOwner().getGenPackage().comparatorId(source.getType(), sortKey)+">*";
			}
			
			return "vector<"+ type+ ">*";
		}
		
		return type;
  }

  // line 267 "../../../../../UmpleTLTemplates/Associations.ump"
  public String removeElement(Integer numSpaces, String variable, String indexVariable, String type){
    if(sortKey != null && !sortKey.isEmpty()){
			return this._removeSetElement(numSpaces, new StringBuilder(), variable, indexVariable, type).toString();
		}
		
		return this._removeVectorElement(numSpaces, new StringBuilder(), variable, indexVariable).toString();
  }

  // line 283 "../../../../../UmpleTLTemplates/Associations.ump"
  public String addCall(Integer numSpaces, String fullName, String parameter, String indexParameter){
    if(sortKey != null && !sortKey.isEmpty()){
			return this._addSetCall(numSpaces, new StringBuilder(), fullName, parameter).toString();
		}
		
		return this._addVectorCall(numSpaces, new StringBuilder(), fullName, parameter, indexParameter).toString();
  }

  // line 304 "../../../../../UmpleTLTemplates/Associations.ump"
  public String removeAllElements(Integer numSpaces, String type, String fullName, String removeList){
    if(sortKey != null && !sortKey.isEmpty()){
			return this._removeAllSetElements(numSpaces, new StringBuilder(), type, fullName, removeList).toString();
		}
		
		return this._removeAllVectorElements(numSpaces, new StringBuilder(), type, fullName, removeList).toString();
  }

  // line 348 "../../../../../UmpleTLTemplates/Associations.ump"
  public String friendMethodName(){
    return "set"+ source.getType()+ "_"+ target.getType();
  }

  // line 465 "../../../../../UmpleTLTemplates/Associations.ump"
  public String listTypeDeclaration(Integer numSpaces, String type, String name, Boolean initialized){
    if(sortKey != null && !sortKey.isEmpty()){
			return this._setTypeDeclaration(numSpaces, new StringBuilder(), type, name, initialized).toString();
		}
		
		return this._vectorTypeDeclaration(numSpaces, new StringBuilder(), type, name, initialized).toString();
  }

  // line 487 "../../../../../UmpleTLTemplates/Associations.ump"
  public String getterCall(Integer numSpaces, String index, String variable, String assignee){
    if(sortKey != null && !sortKey.isEmpty()){
			return this._setGetterCall(numSpaces, new StringBuilder(), index, variable, assignee).toString();
		}
		
		return this._vectorGetterCall(numSpaces, new StringBuilder(), index, variable, assignee).toString();
  }

  // line 503 "../../../../../UmpleTLTemplates/Associations.ump"
  public String copyDirectly(Integer numSpaces, String variable, String type, String copyFrom){
    if(sortKey != null && !sortKey.isEmpty()){
			String comparatorId= comparatorId(type, getSortKey());
			return this._copyDirectlyCall(numSpaces, new StringBuilder(), "set", "copySet", type+ "*, "+ comparatorId, variable, copyFrom).toString();
		}
		return this._copyDirectlyCall(numSpaces, new StringBuilder(), "vector", "copyVector", type+"*", variable, copyFrom).toString();
  }

  // line 525 "../../../../../UmpleTLTemplates/Associations.ump"
  public String copySet(Integer numSpaces, String target, String copyTo){
    String type= source.getType();
		type= type+ "*, "+comparatorId();
		
		return this._copyCall(numSpaces, new StringBuilder(), type, "set", "copySet", target, copyTo).toString();
  }

  // line 532 "../../../../../UmpleTLTemplates/Associations.ump"
  public String copyVector(Integer numSpaces, String target, String copyTo){
    return this._copyCall(numSpaces, new StringBuilder(), source.getType()+ "*", "vector", "copyVector", target, copyTo).toString();
  }

  // line 536 "../../../../../UmpleTLTemplates/Associations.ump"
  public String copyCall(){
    return copyCall(0);
  }

  // line 540 "../../../../../UmpleTLTemplates/Associations.ump"
  public String copyCall(Integer numSpaces){
    return copyCall(numSpaces, null, null);
  }

  // line 544 "../../../../../UmpleTLTemplates/Associations.ump"
  public String copyCall(Integer numSpaces, String target, String copyTo){
    if(sortKey != null && !sortKey.isEmpty()){
			return this.copySet(numSpaces, target, copyTo);
		}
		
		return this.copyVector(numSpaces, target, copyTo);
  }

  // line 682 "../../../../../UmpleTLTemplates/Associations.ump"
  public String setterParamInstance(){
    return setterParamInstance(source.isMany());
  }

  // line 686 "../../../../../UmpleTLTemplates/Associations.ump"
  public String setterParamInstance(Boolean isMany){
    return newInstanceInstance(isMany?source.getRoles(): source.getRole(), isMany);
  }

  // line 1162 "../../../../../UmpleTLTemplates/Associations.ump"
  public String attributeAddCall(Integer numSpaces){
    return attributeAddCall(numSpaces, null);
  }

  // line 1166 "../../../../../UmpleTLTemplates/Associations.ump"
  public String attributeAddCall(Integer numSpaces, String indexVariable){
    return addCall(numSpaces, "this->"+ source.getName(), setterParamInstance(false), indexVariable);
  }

  // line 1196 "../../../../../UmpleTLTemplates/Associations.ump"
  public String attributeAddMaximumCheck(){
    return attributeAddMaximumCheck("wasAdded").toString();
  }

  // line 279 "../../../../../UmpleTLTemplates/Association_roles.ump"
  public String constructDecision(){
    if(getIsAttribute()){
			if(isDerived() || isConstant() || getIsStatic() || isDefaulted() || getIsKey() || getIsSorted()){
				return null;
			}
		
			if(getIsLazy() || getValue()!= null){
				 return GenAssociation.CONSTRUCT_DEFAULT_ASSIGN;
			 }
			
			return isMany()?GenAssociation.CONSTRUCT_DEFAULT_ASSIGN: GenAssociation.CONSTRUCT_VALUE_ASSIGN;
		} 
	    
	    if(source.isOptional()){
			if(target.isOptional()|| target.isRangedOptional()|| target.isOne()|| target.isRangedUnbound()|| target.isRangedMandatory()|| target.isFixed()|| target.isUnbound()){
				return GenAssociation.CONSTRUCT_DEFAULT_ASSIGN;
			}
		}else if(source.isRangedOptional()){
			if(target.isOptional()|| target.isRangedOptional()|| target.isOne()|| target.isRangedUnbound()|| target.isRangedMandatory()|| target.isFixed()|| target.isUnbound()){
				return GenAssociation.CONSTRUCT_DEFAULT_ASSIGN;
			}
		}else if(source.isOne()){
			if(target.isOptional()|| target.isRangedOptional()|| target.isRangedUnbound()|| target.isRangedMandatory()|| target.isFixed()|| target.isUnbound()){
				return GenAssociation.CONSTRUCT_SET_AND_CHECK;
			}else if(target.isOne()){
				if(source.isDirected()){
					return GenAssociation.CONSTRUCT_SET_AND_CHECK;
				}else{
					return GenAssociation.CONSTRUCT_CHECK_NULL_ASSIGN;
				}
			}
		}else if(source.isRangedUnbound()){
			if(target.isOptional()){
				return GenAssociation.CONSTRUCT_SET_VALIDATE_BOUND;
			}else if(target.isRangedOptional()|| target.isOne()|| target.isRangedUnbound()|| target.isRangedMandatory()|| target.isFixed()|| target.isUnbound()){
				if(source.isDirected()){
					return GenAssociation.CONSTRUCT_SET_VALIDATE_BOUND;
				}else{
					return GenAssociation.CONSTRUCT_DEFAULT_ASSIGN;
				}
			}
		}else if(source.isRangedMandatory()){
			if(target.isOptional()|| target.isUnbound()){
				return GenAssociation.CONSTRUCT_SET_VALIDATE_BOUND;
			}else if(target.isRangedOptional()|| target.isOne()|| target.isRangedUnbound()|| target.isRangedMandatory()|| target.isFixed()){
				if(source.isDirected()){
					return GenAssociation.CONSTRUCT_SET_VALIDATE_BOUND;
				}else{
					return GenAssociation.CONSTRUCT_DEFAULT_ASSIGN;
				}
			}
		}else if(source.isFixed()){
			if(target.isOptional()|| target.isUnbound()){
				return GenAssociation.CONSTRUCT_SET_VALIDATE_BOUND;
			}else if(target.isOptional()|| target.isOne()|| target.isRangedUnbound()|| target.isRangedMandatory()|| target.isFixed()){
				if(source.isDirected()){
					return GenAssociation.CONSTRUCT_SET_VALIDATE_BOUND;
				}else{
					return GenAssociation.CONSTRUCT_DEFAULT_ASSIGN;
				}
			}
		}else if(source.isUnbound()){
			if(target.isOptional()|| target.isRangedOptional()|| target.isOne()|| source.isRangedUnbound()|| target.isRangedMandatory()|| target.isFixed()|| target.isUnbound()){
				return GenAssociation.CONSTRUCT_DEFAULT_ASSIGN;
			}
		}
	    
	    return null;
  }

  // line 368 "../../../../../UmpleTLTemplates/Association_roles.ump"
  public String setterDecision(){
    GenAssociationEnd source = getSource();
		GenAssociationEnd target = getTarget();
		
		if(getIsAttribute()){
			if(isDerived() || isConstant() || getIsStatic()){
				return null;
			}
		
			return GenAssociation.SETTER_ASSIGN_DIRECTLY;
		}
		
		if(source.isOptional()){
			if(source.isDirected()){
				if(target.isOptional()|| target.isRangedOptional()|| target.isOne()|| target.isRangedUnbound()|| target.isRangedMandatory()|| target.isFixed()|| target.isUnbound()){
					return GenAssociation.SETTER_ASSIGN_DIRECTLY;
				}
			}else{
				if(target.isOptional()){
					return GenAssociation.SETTER_OPTIONAL;
				}else if(target.isRangedOptional()){
					return GenAssociation.SETTER_UNBOUND_CHECK;
				}else if(target.isOne()){
					return GenAssociation.SETTER_ONE;
				}else if(target.isRangedUnbound()|| target.isRangedMandatory()){
					return GenAssociation.SETTER_RANGED;
				}else if(target.isFixed()){
					/*Do Nothing */
				}else if(target.isUnbound()){
					return GenAssociation.SETTER_UNBOUND;
				}
			}
		}else if(source.isRangedOptional()){
			if(source.isDirected()){
				if(target.isOptional()|| target.isRangedOptional()|| target.isOne()|| target.isRangedUnbound()|| target.isRangedMandatory()|| target.isFixed()|| target.isUnbound()){
					return GenAssociation.SETTER_LIST_COPY;
				}
			}else{
				if(target.isUnbound()){
					return GenAssociation.SETTER_LIST;
				}
			}
		}else if(source.isOne()){
			if(source.isDirected()){
				if(target.isOptional()|| target.isRangedOptional()|| target.isOne()|| target.isRangedUnbound()|| target.isRangedMandatory()|| target.isFixed()|| target.isUnbound()){
					return GenAssociation.SETTER_CHECK_ASSIGN;
				}
			}else{
				if(target.isOptional()){
					return GenAssociation.SETTER_USE_EXISTING_SETTER;
				}else if(target.isOne()){
					/*Do Nothing */
				}else if(target.isRangedUnbound()|| target.isRangedMandatory()|| target.isFixed()|| target.isRangedOptional()){
					return GenAssociation.SETTER_MAXIMUM_MANY;
				}else if(target.isUnbound()){
					return GenAssociation.SETTER_USE_EXISTING_REMOVE;
				}
			}
		}else if(source.isRangedUnbound()|| source.isRangedMandatory()){
			if(source.isDirected()){
				if(target.isOptional()|| target.isRangedOptional()|| target.isOne()|| target.isRangedUnbound()|| target.isRangedMandatory()|| target.isFixed()|| target.isUnbound()){
					return GenAssociation.SETTER_LIST_COPY;
				}
			}else{
				if(target.isOptional()){
					return GenAssociation.SETTER_HASHMAP;
				}else if(target.isOne()){
					/*Do Nothing */
				}else if(target.isRangedOptional()|| target.isRangedUnbound()|| target.isRangedMandatory()|| target.isFixed()|| target.isUnbound()){
					return GenAssociation.SETTER_LIST;
				}
			}
		}else if(source.isFixed()){
			if(source.isDirected()){
				if(target.isOptional()|| target.isRangedOptional()|| target.isOne()|| target.isRangedUnbound()|| target.isRangedMandatory()|| target.isFixed()|| target.isUnbound()){
					return GenAssociation.SETTER_LIST_COPY;
				}
			}else{
				if(target.isOptional()){
					return GenAssociation.SETTER_MINIMUM_FIXED;
				}else if(target.isRangedOptional()){
					/*Do Nothing */
				}else if(target.isOne()){
					/*Do Nothing */
				}else if(target.isRangedUnbound()|| target.isRangedMandatory()|| target.isFixed()|| target.isUnbound()){
					return GenAssociation.SETTER_LIST;
				}
			}
		}else if(source.isUnbound()){
			/*Empty Block */
		}
		
		return null;
  }

  // line 463 "../../../../../UmpleTLTemplates/Association_roles.ump"
  public String getSetterBody(){
    String setterType= setterDecision();
		if(setterDecision()!= null){
			switch (setterType) {
			case SETTER_ASSIGN_DIRECTLY:
				return attributeSetterAssignDirectly();
			case SETTER_OPTIONAL:
				return attributeSetterOptional();
			case SETTER_UNBOUND_CHECK:
				return attributeSetterUnbound(true);
			case SETTER_UNBOUND:
				return attributeSetterUnbound(false);
			case SETTER_ONE:
				return attributeSetterOne();
			case SETTER_RANGED:
				return attributeSetterRanged();
			case SETTER_LIST_COPY:
				return attributeSetterList(true);
			case SETTER_LIST:
				return attributeSetterList(false);
			case SETTER_CHECK_ASSIGN:
				return attributeSetterCheckAssign();
			case SETTER_USE_EXISTING_SETTER:
				return attributeSetterUseExistingSetter();
			case SETTER_MAXIMUM_MANY:
				return attributeSetterMaximumMany();
			case SETTER_USE_EXISTING_REMOVE:
				return attributeSetterUseExistingRemove();
			case SETTER_HASHMAP:
				return attributeSetterHashmap();
			case SETTER_MINIMUM_FIXED:
				return attributeSetterMinimumFixed();
			default:
				break;
			}
		}
		
		return null;
  }

  // line 521 "../../../../../UmpleTLTemplates/Association_roles.ump"
  public String deleteDecision(){
    if(getIsAttribute()){
			if(isMany() && !isDerived() && !getIsKey()){
				return GenAssociation.DELETE_DIRECTLY;
			}
			
			return null;
		}
		
		GenAssociationEnd source = getSource();
		GenAssociationEnd target = getTarget();
		if(source.isDirected()){ 
			return GenAssociation.DELETE_DIRECTLY;
		}
		
		if(source.isOptional()){
			if(target.isOptional()){
				return GenAssociation.DELETE_CHECK_BY_SETTER;
			}else if(target.isRangedOptional()|| target.isUnbound()){
				return GenAssociation.DELETE_ASSIGN_REMOVE_CHECK;
			}else if(target.isOne()){
				return GenAssociation.DELETE_USE_DELETE;
			}else if(target.isRangedUnbound()|| target.isRangedMandatory()){
				return GenAssociation.DELETE_REMOVE_OR_NULLIFY;
			}else if(target.isFixed()){
				return GenAssociation.DELETE_CHECK_USE_DELETE;
			}
		}else if(source.isRangedOptional()){
			if(target.isOptional()){
				return GenAssociation.DELETE_NULLIFY_ALL_BY_SETTERS;
			}else if(target.isRangedOptional()|| target.isUnbound()){
				return GenAssociation.DELETE_SAFELY_CLEAR_AND_REMOVE;
			}else if(target.isOne()){
				return GenAssociation.DELETE_NULLIFY_USE_DELETE;
			}else if(target.isRangedUnbound()|| target.isRangedMandatory()|| target.isFixed()){
				return GenAssociation.DELETE_CLEAR_THEN_DELETE_OR_REMOVE;
			}
		}else if(source.isOne()){
			if(target.isOptional()){
				return GenAssociation.DELETE_CHECK_NULLIFY_BY_SETTER;
			}else if(target.isRangedOptional()|| target.isRangedUnbound()|| target.isRangedMandatory()|| target.isFixed()|| target.isUnbound()){
				return GenAssociation.DELETE_ASSIGN_REMOVE;
			}else if(target.isOne()){
				return GenAssociation.DELETE_USE_DELETE;
			}
		}else if(source.isRangedUnbound()|| source.isRangedMandatory()|| source.isFixed()){
			if(target.isOptional()){
				return GenAssociation.DELETE_USE_INTERNAL_SETTER;
			}else if(target.isRangedOptional()|| target.isUnbound()){
				return GenAssociation.DELETE_SAFELY_CLEAR_AND_REMOVE;
			}else if(target.isOne()){
				return GenAssociation.DELETE_NULLIFY_USE_DELETE;
			}else if(target.isRangedUnbound()|| target.isRangedMandatory()|| target.isFixed()){
				return GenAssociation.DELETE_CLEAR_THEN_DELETE_OR_REMOVE;
			}
		}else if(source.isUnbound()){
			if(target.isOptional()){
				return GenAssociation.DELETE_NULLIFY_ALL_BY_SETTERS;
			}else if(target.isRangedOptional()|| target.isUnbound()){
				return GenAssociation.DELETE_SAFELY_CLEAR_AND_REMOVE;
			}else if(target.isOne()){
				return GenAssociation.DELETE_NULLIFY_USE_DELETE;
			}else if(source.isRangedUnbound()|| target.isRangedMandatory()|| target.isFixed() || target.isRangedUnbound()){
				return GenAssociation.DELETE_CLEAR_THEN_DELETE_OR_REMOVE;
			}
		}
		
		return null;
  }

  // line 591 "../../../../../UmpleTLTemplates/Association_roles.ump"
  public String getDeleteBody(){
    String deleteType= deleteDecision();
		if(deleteType!= null){
			switch (deleteType) {
			case SETTER_ASSIGN_DIRECTLY:
				return attributeSetterAssignDirectly();
			case DELETE_DIRECTLY:
				return deleteDirectly();
			case DELETE_CHECK_BY_SETTER:
				return deleteCheckBySetter(false);
			case DELETE_CHECK_NULLIFY_BY_SETTER:
				return deleteCheckBySetter(true);
			case DELETE_ASSIGN_REMOVE_CHECK:
				return deleteAssignRemoveCheck();
			case DELETE_ASSIGN_REMOVE:
				return deleteAssignRemove();
			case DELETE_USE_DELETE:
				return deleteUseDelete();
			case DELETE_REMOVE_OR_NULLIFY:
				return deleteRemoveOrNullify();
			case DELETE_CHECK_USE_DELETE:
				return deleteCheckUseDelete();
			case DELETE_NULLIFY_ALL_BY_SETTERS:
				return deleteNullifyAllBySetters();
			case DELETE_USE_INTERNAL_SETTER:
				return deleteUseInternalSetter();
			case DELETE_SAFELY_CLEAR_AND_REMOVE:
				return deleteSafelyClearAndRemove();
			case DELETE_NULLIFY_USE_DELETE:
				return deleteNullifyUseDelete();
			case DELETE_CLEAR_THEN_DELETE_OR_REMOVE:
				return deleteClearThenDeleteOrRemove();
			default:
				break;
			}
		}
		
		return null;
  }

  // line 647 "../../../../../UmpleTLTemplates/Association_roles.ump"
  public String addDecision(){
    if(getIsAttribute()){
			if(isMany() && !isDerived() && !getIsKey()){
				return GenAssociation.ADD_DIRECTLY;
			}
			
			return null;
		}
		
		GenAssociationEnd source = getSource();
		GenAssociationEnd target = getTarget();
		
		if(source.isRangedOptional()){
			if(source.isDirected()){
				return GenAssociation.ADD_DIRECTLY;
			}else{
				if(target.isOptional()){
					return GenAssociation.ADD_REMOVE_EXISTING_OR_THIS;
				}else if(target.isOne()){
					return GenAssociation.ADD_CHECK_NEW_OTHER_EXISTING;
				}else if(target.isRangedUnbound()|| target.isRangedOptional()|| target.isRangedMandatory()|| target.isFixed()|| target.isUnbound()){
					return GenAssociation.ADD_DIRECTLY;
				}
			}
			
		}else if(source.isRangedUnbound()){
			if(source.isDirected()){
				return GenAssociation.ADD_DIRECTLY;
			}else{
				if(target.isOptional()){
					return GenAssociation.ADD_REMOVE_EXISTING;
				}else if(target.isOne()){
					return GenAssociation.ADD_SET_IF_NEW;
				}else if(target.isRangedUnbound()|| target.isRangedOptional()|| target.isRangedMandatory()|| target.isFixed()|| target.isUnbound()){
					return GenAssociation.ADD_AND_AND_CHECK;
				}
			}
		}else if(source.isRangedMandatory()){
			if(source.isDirected()){
				return GenAssociation.ADD_DIRECTLY;
			}else{
				if(target.isOptional()){
					return GenAssociation.ADD_REMOVE_EXISTING;
				}else if(target.isOne()){
					return GenAssociation.ADD_SET_IF_NEW;
				}else if(target.isRangedUnbound()|| target.isRangedOptional()|| target.isRangedMandatory()|| target.isFixed()|| target.isUnbound()){
					return GenAssociation.ADD_AND_AND_CHECK;
				}
			}
		}else if(source.isFixed()){
			if(source.isDirected()){
				//None 
			}else{
				if(target.isOptional()){
					//None
				}else if(target.isOne()){
					return GenAssociation.ADD_SET_IF_NEW;
				}else if(target.isRangedUnbound()|| target.isRangedOptional()|| target.isRangedMandatory()|| target.isFixed()|| target.isUnbound()){
					return GenAssociation.ADD_AND_AND_CHECK;
				}
			}
		}else if(source.isUnbound()){
			if(source.isDirected()){
				return GenAssociation.ADD_DIRECTLY;
			}else{
				if(target.isOptional()){
					return GenAssociation.ADD_REMOVE_EXISTING_OR_THIS;
				}else if(target.isOne()){
					return GenAssociation.ADD_CHECK_NEW_OTHER_EXISTING;
				}else if(target.isRangedUnbound()|| target.isRangedOptional()|| target.isRangedMandatory()|| target.isFixed()|| target.isUnbound()){
					return GenAssociation.ADD_AND_AND_CHECK;
				}
			}
		} 
		return null;
  }

  // line 724 "../../../../../UmpleTLTemplates/Association_roles.ump"
  public String getAddBody(){
    String addType= addDecision();
		if(addType!= null){
			switch (addType) {
			case ADD_DIRECTLY:
				return attributeAddDirectly();
			case ADD_REMOVE_EXISTING_OR_THIS:
				return attributeAddRemoveExistingOrThis();
			case ADD_REMOVE_EXISTING:
				return attributeAddRemoveExisting();
			case ADD_CHECK_NEW_OTHER_EXISTING:
				return attributeAddCheckNewOtherExisting();
			case ADD_SET_IF_NEW:
				return attributeAddSetIfNew();
			case ADD_AND_AND_CHECK:
				return attributeAddAndCheck();
			default:
				break;
			}
		}
		
		return addType;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1162 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String removeInstance(String name){
    return removeInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1166 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String removeInstance(String name, Boolean isRemote){
    String instance= "remove"+ StringUtil.firstCharacterToUpperCase(name);
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1171 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String canSetInstance(String name){
    return "canSet"+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1175 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String currentInstance(String name){
    return "current"+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1179 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String delegatedParameter(String parameter, String type){
    return parameter + "For"+ StringUtil.firstCharacterToUpperCase(type);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1183 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String verifiedInstance(String name){
    return "verified"+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1187 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String removeAtInstance(String name){
    return removeAtInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1191 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String removeAtInstance(String name, Boolean isRemote){
    String instance= "remove"+ StringUtil.firstCharacterToUpperCase(name)+ "At";
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1196 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String addAtInstance(String name){
    return addAtInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1200 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String addAtInstance(String name, Boolean isRemote){
    String instance= "add"+ StringUtil.firstCharacterToUpperCase(name)+ "At";
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1205 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String addOrMoveAtInstance(String name){
    return "addOrMove"+ StringUtil.firstCharacterToUpperCase(name)+ "At";
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1209 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String indexOfInstance(String name){
    return indexOfInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1213 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String indexOfInstance(String name, Boolean isRemote){
    String instance= "indexOf"+ StringUtil.firstCharacterToUpperCase(name);
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1218 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String placeholderInstance(String name){
    return "placeholder"+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1222 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String setInstance(String name){
    return setInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1226 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String setInstance(String name, Boolean isRemote){
    String instance= "set"+ StringUtil.firstCharacterToUpperCase(name);
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1231 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String isNewInstance(String name){
    return "isNew"+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1235 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String existingInstance(String name){
    return "existing"+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1239 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String newMapInstance(String role, String roles){
    return role+ "ToNew"+ StringUtil.firstCharacterToUpperCase(roles);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1243 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String oldInstance(String name){
    return oldInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1247 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String oldInstance(String name, Boolean isMany){
    String base= "old"+ StringUtil.firstCharacterToUpperCase(name);
		if(isMany){
			return base;
		}
		return "an"+ StringUtil.firstCharacterToUpperCase(base);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1255 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String newInstanceInstance(String name){
    return newInstanceInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1259 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String newInstanceInstance(String name, Boolean isMany){
    String base= "new"+ StringUtil.firstCharacterToUpperCase(name);
		if(isMany){
			return base;
		}
		return "a"+ StringUtil.firstCharacterToUpperCase(base);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1267 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String checkNewInstance(String name){
    return "checkNew"+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1271 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String variableParameterInstance(String name, boolean isMany){
    return (isMany?"all":"a")+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1275 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String getInstance(String name){
    return getInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1279 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String getInstance(String name, Boolean isRemote){
    String instance= "get"+ StringUtil.firstCharacterToUpperCase(name);
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1284 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String isAInstance(String name){
    return "is"+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1288 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String variableInstance(String name){
    return this.variableInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1292 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String variableInstance(String name, boolean isMany){
    String value= StringUtil.firstCharacterToUpperCase(name);
		if(!isMany){
			value= "a"+ value;
		}
		return value;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1300 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String numberOfInstance(String name){
    return numberOfInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1304 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String numberOfInstance(String name, Boolean isRemote){
    String instance= "numberOf"+ StringUtil.firstCharacterToUpperCase(name);
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1309 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String minimumNumberOfInstance(String name){
    return minimumNumberOfInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1313 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String minimumNumberOfInstance(String name, Boolean isRemote){
    String instance= "minimumNumberOf"+ StringUtil.firstCharacterToUpperCase(name);
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1318 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String hasInstance(String name){
    return hasInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1322 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String hasInstance(String name, Boolean isRemote){
    String instance= "has"+ StringUtil.firstCharacterToUpperCase(name);
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1327 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String maximumNumberOfInstance(String name){
    return maximumNumberOfInstance(name, false);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1331 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String maximumNumberOfInstance(String name, Boolean isRemote){
    String instance= "maximumNumberOf"+ StringUtil.firstCharacterToUpperCase(name);
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1336 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String addInstance(String name){
    return "add"+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1340 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String addInstance(String name, Boolean isRemote){
    String instance= "add"+ StringUtil.firstCharacterToUpperCase(name);
		return isRemote?"_"+instance: instance;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1345 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String copyOfInstance(String name){
    return "copyOf"+ StringUtil.firstCharacterToUpperCase(name);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1349 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String friendSetterInstance(String typeName, String otherEndTypeName){
    return "set"+ StringUtil.firstCharacterToUpperCase(typeName)+ "_"+ StringUtil.firstCharacterToUpperCase(otherEndTypeName);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait NameHelper.
   * Trait NameHelper has been used in classes: 'GenPackage' 'GenerationTemplate' 'GenEndpointPropagationBody' 'GenAssociation' 
   */
  // line 1353 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String comparatorId(String type, String key){
    return type+ "_"+key+ "_Comparator";
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _baseComparator(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String key= getSortKey();
	String fieldGetter = getInstance(key, getOwner().getIsRemote());
	String comparatorName= comparatorId();
	String type= getSource().getType();
	
    realSb.append(TEXT_0);
    realSb.append(comparatorName);
    realSb.append(TEXT_1);
    realSb.append(type);
    realSb.append(TEXT_2);
    realSb.append(type);
    realSb.append(TEXT_3);
    realSb.append(type);
    realSb.append(TEXT_4);
    realSb.append(type);
    realSb.append(TEXT_5);
    realSb.append(fieldGetter);
    realSb.append(TEXT_6);
    realSb.append(fieldGetter);
    realSb.append(TEXT_7);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String baseComparator(){
        StringBuilder sb = new StringBuilder();
    return this._baseComparator(0,sb).toString(); 
  }

  public StringBuilder _bindingNotificationMany(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
String name= source.getRoles();
String instance= copyOfInstance(name);
String type= source.getType();
String getMethodName= getInstance(name, getOwner().getIsRemote());


    realSb.append(TEXT_8);
    realSb.append(type);
    realSb.append(TEXT_9);
    realSb.append(instance);
    realSb.append(TEXT_10);
    realSb.append(getMethodName);
    realSb.append(TEXT_11);
    realSb.append(instance);
    realSb.append(TEXT_12);
    realSb.append(type);
    realSb.append(TEXT_13);
    realSb.append(type);
    realSb.append(TEXT_14);
    realSb.append(instance);
    realSb.append(TEXT_15);
    realSb.append(type);
    realSb.append(TEXT_16);
    realSb.append(binding);
    realSb.append(TEXT_17);
    realSb.append(bindingParameters);
    realSb.append(TEXT_18);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String bindingNotificationMany(){
        StringBuilder sb = new StringBuilder();
    return this._bindingNotificationMany(0,sb).toString(); 
  }

  public StringBuilder _bindingNotificationSingle(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
String name= source.getName();
String type= source.getType();
String role= source.getRole();
String instance= variableInstance(role);
String getMethodName= getInstance(name, getOwner().getIsRemote());


    realSb.append(type);
    realSb.append(TEXT_19);
    realSb.append(instance);
    realSb.append(TEXT_20);
    realSb.append(getMethodName);
    realSb.append(TEXT_21);
    realSb.append(instance);
    realSb.append(TEXT_22);
    realSb.append(binding);
    realSb.append(TEXT_23);
    realSb.append(bindingParameters);
    realSb.append(TEXT_24);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String bindingNotificationSingle(){
        StringBuilder sb = new StringBuilder();
    return this._bindingNotificationSingle(0,sb).toString(); 
  }

  public StringBuilder _removeVectorElement(Integer numSpaces, StringBuilder sb, String variable, String indexVariable){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(variable);
    realSb.append(TEXT_25);
    realSb.append(variable);
    realSb.append(TEXT_26);
    realSb.append(indexVariable);
    realSb.append(TEXT_27);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String removeVectorElement(String variable, String indexVariable){
        StringBuilder sb = new StringBuilder();
    return this._removeVectorElement(0,sb,variable,indexVariable).toString(); 
  }

  public StringBuilder _removeSetElement(Integer numSpaces, StringBuilder sb, String variable, String indexVariable, String type){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(variable);
    realSb.append(TEXT_28);
    realSb.append(type);
    realSb.append(TEXT_29);
    realSb.append(variable);
    realSb.append(TEXT_30);
    realSb.append(indexVariable);
    realSb.append(TEXT_31);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String removeSetElement(String variable, String indexVariable, String type){
        StringBuilder sb = new StringBuilder();
    return this._removeSetElement(0,sb,variable,indexVariable,type).toString(); 
  }

  public StringBuilder _addVectorCall(Integer numSpaces, StringBuilder sb, String fullName, String parameter, String indexParameter){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    if(indexParameter== null){
    realSb.append(fullName);
    realSb.append(TEXT_32);
    realSb.append(parameter);
    realSb.append(TEXT_33);
    
		}
    else{
    realSb.append(fullName);
    realSb.append(TEXT_34);
    realSb.append(fullName);
    realSb.append(TEXT_35);
    realSb.append(indexParameter);
    realSb.append(TEXT_36);
    realSb.append(parameter);
    realSb.append(TEXT_37);
    }

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String addVectorCall(String fullName, String parameter, String indexParameter){
        StringBuilder sb = new StringBuilder();
    return this._addVectorCall(0,sb,fullName,parameter,indexParameter).toString(); 
  }

  public StringBuilder _addSetCall(Integer numSpaces, StringBuilder sb, String fullName, String parameter){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(fullName);
    realSb.append(TEXT_38);
    realSb.append(parameter);
    realSb.append(TEXT_39);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String addSetCall(String fullName, String parameter){
        StringBuilder sb = new StringBuilder();
    return this._addSetCall(0,sb,fullName,parameter).toString(); 
  }

  public StringBuilder _removeAllVectorElements(Integer numSpaces, StringBuilder sb, String type, String fullName, String removeList){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_40);
    realSb.append(type);
    realSb.append(TEXT_41);
    realSb.append(type);
    realSb.append(TEXT_42);
    realSb.append(removeList);
    realSb.append(TEXT_43);
    realSb.append(type);
    realSb.append(TEXT_44);
    realSb.append(removeList);
    realSb.append(TEXT_45);
    realSb.append(type);
    realSb.append(TEXT_46);
    realSb.append(fullName);
    realSb.append(TEXT_47);
    realSb.append(fullName);
    realSb.append(TEXT_48);
    realSb.append(fullName);
    realSb.append(TEXT_49);
    realSb.append(type);
    realSb.append(TEXT_50);
    realSb.append(fullName);
    realSb.append(TEXT_51);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String removeAllVectorElements(String type, String fullName, String removeList){
        StringBuilder sb = new StringBuilder();
    return this._removeAllVectorElements(0,sb,type,fullName,removeList).toString(); 
  }

  public StringBuilder _removeAllSetElements(Integer numSpaces, StringBuilder sb, String type, String fullName, String removeList){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String comparatorId= comparatorId(type, getSortKey());


    realSb.append(TEXT_52);
    realSb.append(type);
    realSb.append(TEXT_53);
    realSb.append(comparatorId);
    realSb.append(TEXT_54);
    realSb.append(type);
    realSb.append(TEXT_55);
    realSb.append(fullName);
    realSb.append(TEXT_56);
    realSb.append(removeList);
    realSb.append(TEXT_57);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String removeAllSetElements(String type, String fullName, String removeList){
        StringBuilder sb = new StringBuilder();
    return this._removeAllSetElements(0,sb,type,fullName,removeList).toString(); 
  }

  public StringBuilder _deleteSafelyClearAndRemove(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String name= source.getName();
	String copyCall= copyCall();
	String otherRole= target.getRole();
	String removeMethodName= removeInstance(otherRole, getOwner().getIsRemote());
	
	String type= source.getType();
	String instance= variableInstance(type);
	
	String role= source.isMany()?source.getRoles():source.getRole();
	String getterCall= getterCall(2, "0", instance, copyOfInstance(role));


    realSb.append(copyCall);
    realSb.append(TEXT_58);
    realSb.append(name);
    realSb.append(TEXT_59);
    realSb.append(name);
    realSb.append(TEXT_60);
    realSb.append(getterCall);
    realSb.append(TEXT_61);
    realSb.append(instance);
    realSb.append(TEXT_62);
    realSb.append(removeMethodName);
    realSb.append(TEXT_63);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String deleteSafelyClearAndRemove(){
        StringBuilder sb = new StringBuilder();
    return this._deleteSafelyClearAndRemove(0,sb).toString(); 
  }

  public StringBuilder _deleteNullifyAllBySetters(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String name= source.getName();
	String type= source.getType();
	String instance= variableInstance(type);
	String getterCall= getterCall(2, "0", instance, null);
	String setterMethodName= setInstance(target.getRole(), getOwner().getIsRemote());

    realSb.append(TEXT_64);
    realSb.append(name);
    realSb.append(TEXT_65);
    realSb.append(getterCall);
    realSb.append(TEXT_66);
    realSb.append(instance);
    realSb.append(TEXT_67);
    realSb.append(setterMethodName);
    realSb.append(TEXT_68);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String deleteNullifyAllBySetters(){
        StringBuilder sb = new StringBuilder();
    return this._deleteNullifyAllBySetters(0,sb).toString(); 
  }

  public StringBuilder _deleteUseInternalSetter(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String name= source.getName();
	String type= source.getType();
	String instance= variableInstance(type);
	String getterCall= getterCall(2, "0", instance, null);
	String friendDeleteMethod= friendMethodName();

    realSb.append(TEXT_69);
    realSb.append(name);
    realSb.append(TEXT_70);
    realSb.append(getterCall);
    realSb.append(TEXT_71);
    realSb.append(friendDeleteMethod);
    realSb.append(TEXT_72);
    realSb.append(instance);
    realSb.append(TEXT_73);
    realSb.append(name);
    realSb.append(TEXT_74);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String deleteUseInternalSetter(){
        StringBuilder sb = new StringBuilder();
    return this._deleteUseInternalSetter(0,sb).toString(); 
  }

  public StringBuilder _deleteNullifyUseDelete(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String name= source.getName();
	String type= source.getType();
	String variableInstance= variableInstance(type);
	String getterCall= getterCall(2, "index-1", variableInstance, null);
	

    realSb.append(TEXT_75);
    realSb.append(name);
    realSb.append(TEXT_76);
    realSb.append(getterCall);
    realSb.append(TEXT_77);
    realSb.append(variableInstance);
    realSb.append(TEXT_78);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String deleteNullifyUseDelete(){
        StringBuilder sb = new StringBuilder();
    return this._deleteNullifyUseDelete(0,sb).toString(); 
  }

  public StringBuilder _deleteCheckUseDelete(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String name= source.getName();

    realSb.append(TEXT_79);
    realSb.append(name);
    realSb.append(TEXT_80);
    realSb.append(name);
    realSb.append(TEXT_81);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String deleteCheckUseDelete(){
        StringBuilder sb = new StringBuilder();
    return this._deleteCheckUseDelete(0,sb).toString(); 
  }

  public StringBuilder _deleteRemoveOrNullify(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String name= source.getName();
	String type= source.getType();
	String otherRole= target.getRole();
	String otherRoles= target.getRoles();
	
	String placeHolder= placeholderInstance(name);
	String removeMethodName= removeInstance(otherRole, getOwner().getIsRemote());
	String numberOfOtherEndMethodName= numberOfInstance(otherRoles, getOwner().getIsRemote());
	String minimumNumberOtherEndMethodName= minimumNumberOfInstance(otherRoles, getOwner().getIsRemote());
	

    realSb.append(TEXT_82);
    realSb.append(name);
    realSb.append(TEXT_83);
    realSb.append(name);
    realSb.append(TEXT_84);
    realSb.append(numberOfOtherEndMethodName);
    realSb.append(TEXT_85);
    realSb.append(name);
    realSb.append(TEXT_86);
    realSb.append(minimumNumberOtherEndMethodName);
    realSb.append(TEXT_87);
    realSb.append(name);
    realSb.append(TEXT_88);
    realSb.append(type);
    realSb.append(TEXT_89);
    realSb.append(placeHolder);
    realSb.append(TEXT_90);
    realSb.append(name);
    realSb.append(TEXT_91);
    realSb.append(name);
    realSb.append(TEXT_92);
    realSb.append(placeHolder);
    realSb.append(TEXT_93);
    realSb.append(removeMethodName);
    realSb.append(TEXT_94);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String deleteRemoveOrNullify(){
        StringBuilder sb = new StringBuilder();
    return this._deleteRemoveOrNullify(0,sb).toString(); 
  }

  public StringBuilder _deleteUseDelete(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String name= source.getName();
	String type= source.getType();
	String existingVariableName= existingInstance(name);
	

    realSb.append(TEXT_95);
    realSb.append(name);
    realSb.append(TEXT_96);
    realSb.append(type);
    realSb.append(TEXT_97);
    realSb.append(existingVariableName);
    realSb.append(TEXT_98);
    realSb.append(name);
    realSb.append(TEXT_99);
    realSb.append(name);
    realSb.append(TEXT_100);
    realSb.append(existingVariableName);
    realSb.append(TEXT_101);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String deleteUseDelete(){
        StringBuilder sb = new StringBuilder();
    return this._deleteUseDelete(0,sb).toString(); 
  }

  public StringBuilder _deleteDirectly(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String name= source.getName();
		

    if(source.isMany()){
    realSb.append(TEXT_102);
    realSb.append(name);
    realSb.append(TEXT_103);
    }else{
    realSb.append(TEXT_104);
    realSb.append(name);
    realSb.append(TEXT_105);
    }

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String deleteDirectly(){
        StringBuilder sb = new StringBuilder();
    return this._deleteDirectly(0,sb).toString(); 
  }

  public StringBuilder _deleteAssignRemoveCheck(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String name= source.getName();
		

    realSb.append(TEXT_106);
    realSb.append(name);
    realSb.append(TEXT_107);
    realSb.append(this._deleteAssignRemove(2, new StringBuilder()).toString());
    realSb.append(TEXT_108);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String deleteAssignRemoveCheck(){
        StringBuilder sb = new StringBuilder();
    return this._deleteAssignRemoveCheck(0,sb).toString(); 
  }

  public StringBuilder _deleteAssignRemove(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String name= source.getName();
	String type= source.getType();
	String placeHolder= placeholderInstance(name);
	String removeMethodName= removeInstance(target.getRole(), getOwner().getIsRemote());
	

    realSb.append(type);
    realSb.append(TEXT_109);
    realSb.append(placeHolder);
    realSb.append(TEXT_110);
    realSb.append(name);
    realSb.append(TEXT_111);
    realSb.append(name);
    realSb.append(TEXT_112);
    realSb.append(placeHolder);
    realSb.append(TEXT_113);
    realSb.append(removeMethodName);
    realSb.append(TEXT_114);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String deleteAssignRemove(){
        StringBuilder sb = new StringBuilder();
    return this._deleteAssignRemove(0,sb).toString(); 
  }

  public StringBuilder _deleteCheckBySetter(Integer numSpaces, StringBuilder sb, boolean nullify){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String name= source.getName();
	String setterMethodName= setInstance(source.isMany()?target.getRoles():target.getRole(), getOwner().getIsRemote());
	

    realSb.append(TEXT_115);
    realSb.append(name);
    realSb.append(TEXT_116);
    realSb.append(name);
    realSb.append(TEXT_117);
    realSb.append(setterMethodName);
    realSb.append(TEXT_118);
    if(nullify){
    realSb.append(TEXT_119);
    realSb.append(name);
    realSb.append(TEXT_120);
    }
    realSb.append(TEXT_121);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String deleteCheckBySetter(boolean nullify){
        StringBuilder sb = new StringBuilder();
    return this._deleteCheckBySetter(0,sb,nullify).toString(); 
  }

  public StringBuilder _vectorTypeDeclaration(Integer numSpaces, StringBuilder sb, String type, String name, Boolean initialized){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    if(!initialized){
    realSb.append(TEXT_122);
    realSb.append(type);
    realSb.append(TEXT_123);
    }
    realSb.append(name);
    realSb.append(TEXT_124);
    realSb.append(type);
    realSb.append(TEXT_125);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String vectorTypeDeclaration(String type, String name, Boolean initialized){
        StringBuilder sb = new StringBuilder();
    return this._vectorTypeDeclaration(0,sb,type,name,initialized).toString(); 
  }

  public StringBuilder _setTypeDeclaration(Integer numSpaces, StringBuilder sb, String type, String name, Boolean initialized){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String comparatorId= comparatorId(type, getSortKey());
	

    if(!initialized){
    realSb.append(TEXT_126);
    realSb.append(type);
    realSb.append(TEXT_127);
    realSb.append(comparatorId);
    realSb.append(TEXT_128);
    }
    realSb.append(name);
    realSb.append(TEXT_129);
    realSb.append(type);
    realSb.append(TEXT_130);
    realSb.append(comparatorId);
    realSb.append(TEXT_131);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String setTypeDeclaration(String type, String name, Boolean initialized){
        StringBuilder sb = new StringBuilder();
    return this._setTypeDeclaration(0,sb,type,name,initialized).toString(); 
  }

  public StringBuilder _vectorGetterCall(Integer numSpaces, StringBuilder sb, String index, String variable, String assignee){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String type= source.getType();
	String name= source.getName();
	
    realSb.append(type);
    realSb.append(TEXT_132);
    realSb.append(variable);
    realSb.append(TEXT_133);
    if(assignee== null){
    realSb.append(TEXT_134);
    realSb.append(name);
    }else{
    realSb.append(assignee);
    }
    realSb.append(TEXT_135);
    realSb.append(index);
    realSb.append(TEXT_136);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String vectorGetterCall(String index, String variable, String assignee){
        StringBuilder sb = new StringBuilder();
    return this._vectorGetterCall(0,sb,index,variable,assignee).toString(); 
  }

  public StringBuilder _setGetterCall(Integer numSpaces, StringBuilder sb, String index, String variable, String assignee){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String type= source.getType();
	String name= source.getName();
	String comparatorId= comparatorId(type, getSortKey());

    realSb.append(TEXT_137);
    realSb.append(type);
    realSb.append(TEXT_138);
    realSb.append(comparatorId);
    realSb.append(TEXT_139);
    if(assignee== null){
    realSb.append(name);
    }else{
    realSb.append(assignee);
    }
    realSb.append(TEXT_140);
    if(assignee== null){
    realSb.append(name);
    }else{
    realSb.append(assignee);
    }
    realSb.append(TEXT_141);
    realSb.append(type);
    realSb.append(TEXT_142);
    realSb.append(variable);
    realSb.append(TEXT_143);
    realSb.append(type);
    realSb.append(TEXT_144);
    if(assignee== null){
    realSb.append(name);
    }else{
    realSb.append(assignee);
    }
    realSb.append(TEXT_145);
    realSb.append(index);
    realSb.append(TEXT_146);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String setGetterCall(String index, String variable, String assignee){
        StringBuilder sb = new StringBuilder();
    return this._setGetterCall(0,sb,index,variable,assignee).toString(); 
  }

  public StringBuilder _copyDirectlyCall(Integer numSpaces, StringBuilder sb, String callType, String function, String type, String variable, String copyFrom){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	

    realSb.append(TEXT_147);
    realSb.append(variable);
    realSb.append(TEXT_148);
    realSb.append(callType);
    realSb.append(TEXT_149);
    realSb.append(type);
    realSb.append(TEXT_150);
    realSb.append(callType);
    realSb.append(TEXT_151);
    realSb.append(type);
    realSb.append(TEXT_152);
    realSb.append(variable);
    realSb.append(TEXT_153);
    realSb.append(copyFrom);
    realSb.append(TEXT_154);
    realSb.append(callType);
    realSb.append(TEXT_155);
    realSb.append(type);
    realSb.append(TEXT_156);
    realSb.append(variable);
    realSb.append(TEXT_157);
    realSb.append(copyFrom);
    realSb.append(TEXT_158);
    realSb.append(function);
    realSb.append(TEXT_159);
    realSb.append(variable);
    realSb.append(TEXT_160);
    realSb.append(variable);
    realSb.append(TEXT_161);
    realSb.append(variable);
    realSb.append(TEXT_162);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String copyDirectlyCall(String callType, String function, String type, String variable, String copyFrom){
        StringBuilder sb = new StringBuilder();
    return this._copyDirectlyCall(0,sb,callType,function,type,variable,copyFrom).toString(); 
  }

  public StringBuilder _copyCall(Integer numSpaces, StringBuilder sb, String type, String callType, String function, String target, String copyTo){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String name= source.getName();
	String role= source.isMany()?source.getRoles():source.getRole();
	String copyOf= copyTo== null? copyOfInstance(role): copyTo;
	String _target= target== null? "this->"+ name: target;

    if(target== null){
    realSb.append(callType);
    realSb.append(TEXT_163);
    realSb.append(type);
    realSb.append(TEXT_164);
    realSb.append(copyOf);
    realSb.append(TEXT_165);
    realSb.append(callType);
    realSb.append(TEXT_166);
    realSb.append(type);
    realSb.append(TEXT_167);
    }
    realSb.append(callType);
    realSb.append(TEXT_168);
    realSb.append(type);
    realSb.append(TEXT_169);
    realSb.append(name);
    realSb.append(TEXT_170);
    realSb.append(_target);
    realSb.append(TEXT_171);
    realSb.append(callType);
    realSb.append(TEXT_172);
    realSb.append(type);
    realSb.append(TEXT_173);
    realSb.append(name);
    realSb.append(TEXT_174);
    realSb.append(_target);
    realSb.append(TEXT_175);
    realSb.append(function);
    realSb.append(TEXT_176);
    realSb.append(name);
    realSb.append(TEXT_177);
    realSb.append(name);
    realSb.append(TEXT_178);
    realSb.append(copyOf);
    realSb.append(TEXT_179);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String copyCall(String type, String callType, String function, String target, String copyTo){
        StringBuilder sb = new StringBuilder();
    return this._copyCall(0,sb,type,callType,function,target,copyTo).toString(); 
  }

  public StringBuilder _copySetElementTemplateImplementation(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_180);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String copySetElementTemplateImplementation(){
        StringBuilder sb = new StringBuilder();
    return this._copySetElementTemplateImplementation(0,sb).toString(); 
  }

  public StringBuilder _copyVectorElementTemplateImplementation(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_181);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String copyVectorElementTemplateImplementation(){
        StringBuilder sb = new StringBuilder();
    return this._copyVectorElementTemplateImplementation(0,sb).toString(); 
  }

  public StringBuilder _getElementAtTemplateImplementation(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_182);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String getElementAtTemplateImplementation(){
        StringBuilder sb = new StringBuilder();
    return this._getElementAtTemplateImplementation(0,sb).toString(); 
  }

  public StringBuilder _deleteClearThenDeleteOrRemove(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String copyCall= copyCall();
	String name= source.getName();
	String role= source.isMany()?source.getRoles():source.getRole();
	String instance= variableInstance(role);
	String getterCall= getterCall(2, "index", instance, null);
	
	String otherRole= target.getRole();
	String otherRoles= target.getRoles();
	
	String copyOf= copyOfInstance(role);
	
	String removeMethodName= removeInstance(otherRole, getOwner().getIsRemote());
	String numberOfOtherEndMethodName= numberOfInstance(otherRoles, getOwner().getIsRemote());
	String minimumNumberOtherEndMethodName= minimumNumberOfInstance(otherRoles, getOwner().getIsRemote());

    realSb.append(copyCall);
    realSb.append(TEXT_183);
    realSb.append(name);
    realSb.append(TEXT_184);
    realSb.append(copyOf);
    realSb.append(TEXT_185);
    realSb.append(getterCall);
    realSb.append(TEXT_186);
    realSb.append(instance);
    realSb.append(TEXT_187);
    realSb.append(numberOfOtherEndMethodName);
    realSb.append(TEXT_188);
    realSb.append(instance);
    realSb.append(TEXT_189);
    realSb.append(minimumNumberOtherEndMethodName);
    realSb.append(TEXT_190);
    realSb.append(instance);
    realSb.append(TEXT_191);
    realSb.append(instance);
    realSb.append(TEXT_192);
    realSb.append(removeMethodName);
    realSb.append(TEXT_193);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String deleteClearThenDeleteOrRemove(){
        StringBuilder sb = new StringBuilder();
    return this._deleteClearThenDeleteOrRemove(0,sb).toString(); 
  }

  public StringBuilder _removeImplementation(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String name= source.getName();
	String otherType= target.getType();
	String otherRole= target.getRole();
	String otherName= target.getName();
	String role= source.getRole();
	String roles= source.getRoles();
	String instance= variableInstance(role);
	int lowerBound= source.getLowerBound();
	String numberOfMethodName= numberOfInstance(roles, getOwner().getIsRemote());
	String minimumNumberMethodName= minimumNumberOfInstance(roles, getOwner().getIsRemote());
	String removeAtMethodName= removeAtInstance(role, getOwner().getIsRemote());
	String removeMethodName= removeInstance(otherRole, getOwner().getIsRemote());
	String otherGetterMethodName= getInstance(otherRole, getOwner().getIsRemote());
	String otherSetterMethodName= setInstance(otherRole, getOwner().getIsRemote());
	String otherIndexOfInstance= indexOfInstance(otherRole, getOwner().getIsRemote());
	String friendSetterMethod= friendMethodName();
	String addCall= addCall(4, "this->"+ name, instance, "index");
	

    realSb.append(TEXT_194);
    realSb.append(name);
    realSb.append(TEXT_195);
    realSb.append(name);
    realSb.append(TEXT_196);
    realSb.append(instance);
    realSb.append(TEXT_197);
    if(source.isUseMinimum()){
    realSb.append(TEXT_198);
    realSb.append(otherName);
    realSb.append(TEXT_199);
    realSb.append(lowerBound);
    realSb.append(TEXT_200);
    realSb.append(numberOfMethodName);
    realSb.append(TEXT_201);
    realSb.append(minimumNumberMethodName);
    realSb.append(TEXT_202);
    }
    if(isRemoveCheckEmpty()){
    realSb.append(TEXT_203);
    realSb.append(instance);
    realSb.append(TEXT_204);
    realSb.append(otherType);
    realSb.append(TEXT_205);
    realSb.append(instance);
    realSb.append(TEXT_206);
    realSb.append(otherGetterMethodName);
    realSb.append(TEXT_207);
    }
    realSb.append(TEXT_208);
    realSb.append(removeAtMethodName);
    realSb.append(TEXT_209);
    if(isRemoveCheckNullify()){
    realSb.append(instance);
    realSb.append(TEXT_210);
    realSb.append(otherSetterMethodName);
    realSb.append(TEXT_211);
    }
    if(isRemoveNullifyInternally()){

    realSb.append(friendSetterMethod);
    realSb.append(TEXT_212);
    realSb.append(instance);
    realSb.append(TEXT_213);
    }
    if(isRemoveCheckExistence()){
    realSb.append(TEXT_214);
    realSb.append(instance);
    realSb.append(TEXT_215);
    realSb.append(otherIndexOfInstance);
    realSb.append(TEXT_216);
    realSb.append(instance);
    realSb.append(TEXT_217);
    realSb.append(removeMethodName);
    realSb.append(TEXT_218);
    realSb.append(addCall);
    realSb.append(TEXT_219);
    }

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String removeImplementation(){
        StringBuilder sb = new StringBuilder();
    return this._removeImplementation(0,sb).toString(); 
  }

  public StringBuilder _removeAtImplementation(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String numberOfMethodName= numberOfInstance(source.getRoles(), getOwner().getIsRemote());
	String removeCall= removeElement(0, "this->"+ source.getName(), "index", source.getType());

    realSb.append(TEXT_220);
    realSb.append(numberOfMethodName);
    realSb.append(TEXT_221);
    realSb.append(removeCall);
    realSb.append(TEXT_222);
    realSb.append(numberOfMethodName);
    realSb.append(TEXT_223);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String removeAtImplementation(){
        StringBuilder sb = new StringBuilder();
    return this._removeAtImplementation(0,sb).toString(); 
  }

  public StringBuilder _attributeSetterAssignDirectly(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String name= source.getName();
	String newInstance = setterParamInstance();
	

    realSb.append(TEXT_224);
    realSb.append(name);
    realSb.append(TEXT_225);
    realSb.append(newInstance);
    realSb.append(TEXT_226);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String attributeSetterAssignDirectly(){
        StringBuilder sb = new StringBuilder();
    return this._attributeSetterAssignDirectly(0,sb).toString(); 
  }

  public StringBuilder _attributeSetterCheckAssign(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String name= source.getName();
	String newInstance = setterParamInstance();
	

    realSb.append(TEXT_227);
    realSb.append(newInstance);
    realSb.append(TEXT_228);
    realSb.append(name);
    realSb.append(TEXT_229);
    realSb.append(newInstance);
    realSb.append(TEXT_230);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String attributeSetterCheckAssign(){
        StringBuilder sb = new StringBuilder();
    return this._attributeSetterCheckAssign(0,sb).toString(); 
  }

  public StringBuilder _attributeSetterOptional(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String name= source.getName();
	String newInstance = setterParamInstance();
	String setterMethodName= setInstance(target.getRole(), getOwner().getIsRemote());
	String type= source.getType();
	String otherType= target.getType();
	String existingVariableName= existingInstance(name);
	String currentInstance= currentInstance(name);
	String existingOtherVariableName= existingInstance(target.getRole());
	String otherGetterMethodName= getInstance(target.getRole(), getOwner().getIsRemote());
	String getterMethodName= getInstance(source.getRole(), getOwner().getIsRemote());
	

    realSb.append(TEXT_231);
    realSb.append(newInstance);
    realSb.append(TEXT_232);
    realSb.append(type);
    realSb.append(TEXT_233);
    realSb.append(existingVariableName);
    realSb.append(TEXT_234);
    realSb.append(name);
    realSb.append(TEXT_235);
    realSb.append(name);
    realSb.append(TEXT_236);
    realSb.append(existingVariableName);
    realSb.append(TEXT_237);
    realSb.append(existingVariableName);
    realSb.append(TEXT_238);
    realSb.append(otherGetterMethodName);
    realSb.append(TEXT_239);
    realSb.append(existingVariableName);
    realSb.append(TEXT_240);
    realSb.append(setterMethodName);
    realSb.append(TEXT_241);
    realSb.append(type);
    realSb.append(TEXT_242);
    realSb.append(currentInstance);
    realSb.append(TEXT_243);
    realSb.append(getterMethodName);
    realSb.append(TEXT_244);
    realSb.append(currentInstance);
    realSb.append(TEXT_245);
    realSb.append(currentInstance);
    realSb.append(TEXT_246);
    realSb.append(newInstance);
    realSb.append(TEXT_247);
    realSb.append(currentInstance);
    realSb.append(TEXT_248);
    realSb.append(setterMethodName);
    realSb.append(TEXT_249);
    realSb.append(name);
    realSb.append(TEXT_250);
    realSb.append(newInstance);
    realSb.append(TEXT_251);
    realSb.append(otherType);
    realSb.append(TEXT_252);
    realSb.append(existingOtherVariableName);
    realSb.append(TEXT_253);
    realSb.append(newInstance);
    realSb.append(TEXT_254);
    realSb.append(otherGetterMethodName);
    realSb.append(TEXT_255);
    realSb.append(existingOtherVariableName);
    realSb.append(TEXT_256);
    realSb.append(newInstance);
    realSb.append(TEXT_257);
    realSb.append(setterMethodName);
    realSb.append(TEXT_258);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String attributeSetterOptional(){
        StringBuilder sb = new StringBuilder();
    return this._attributeSetterOptional(0,sb).toString(); 
  }

  public StringBuilder _attributeSetterUnbound(Integer numSpaces, StringBuilder sb, Boolean check){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String name= source.getName();
	String newInstance = setterParamInstance();
	String otherRoles= target.getRoles();
	String otherRole= target.getRole();
	String numberOfOtherEndMethodName= numberOfInstance(otherRoles, getOwner().getIsRemote());
	String otherEndmaximumNumberMethodName=  maximumNumberOfInstance(otherRoles, getOwner().getIsRemote());
	String existingVariableName= existingInstance(name);
	String removeMethodName= removeInstance(otherRole, getOwner().getIsRemote());
	String addMethodName= addInstance(otherRole, getOwner().getIsRemote());
	String type= source.getType();

    if(check){

    realSb.append(TEXT_259);
    realSb.append(newInstance);
    realSb.append(TEXT_260);
    realSb.append(newInstance);
    realSb.append(TEXT_261);
    realSb.append(numberOfOtherEndMethodName);
    realSb.append(TEXT_262);
    realSb.append(newInstance);
    realSb.append(TEXT_263);
    realSb.append(otherEndmaximumNumberMethodName);
    realSb.append(TEXT_264);
    }
    realSb.append(type);
    realSb.append(TEXT_265);
    realSb.append(existingVariableName);
    realSb.append(TEXT_266);
    realSb.append(name);
    realSb.append(TEXT_267);
    realSb.append(name);
    realSb.append(TEXT_268);
    realSb.append(newInstance);
    realSb.append(TEXT_269);
    realSb.append(existingVariableName);
    realSb.append(TEXT_270);
    realSb.append(existingVariableName);
    realSb.append(TEXT_271);
    realSb.append(newInstance);
    realSb.append(TEXT_272);
    realSb.append(existingVariableName);
    realSb.append(TEXT_273);
    realSb.append(removeMethodName);
    realSb.append(TEXT_274);
    realSb.append(newInstance);
    realSb.append(TEXT_275);
    realSb.append(newInstance);
    realSb.append(TEXT_276);
    realSb.append(addMethodName);
    realSb.append(TEXT_277);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String attributeSetterUnbound(Boolean check){
        StringBuilder sb = new StringBuilder();
    return this._attributeSetterUnbound(0,sb,check).toString(); 
  }

  public StringBuilder _attributeSetterOne(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String name= source.getName();
	String newInstance = setterParamInstance();
	String otherGetterMethodName= getInstance(target.getRole(), getOwner().getIsRemote());
	String type= source.getType();
	String otherType= target.getType();
	String setterMethodName= setInstance(target.getRole(), getOwner().getIsRemote());
	String oldInstance= oldInstance(target.getRole(), true);
	

    realSb.append(TEXT_278);
    realSb.append(name);
    realSb.append(TEXT_279);
    realSb.append(name);
    realSb.append(TEXT_280);
    realSb.append(newInstance);
    realSb.append(TEXT_281);
    realSb.append(name);
    realSb.append(TEXT_282);
    realSb.append(otherGetterMethodName);
    realSb.append(TEXT_283);
    realSb.append(type);
    realSb.append(TEXT_284);
    realSb.append(name);
    realSb.append(TEXT_285);
    realSb.append(name);
    realSb.append(TEXT_286);
    realSb.append(newInstance);
    realSb.append(TEXT_287);
    realSb.append(otherType);
    realSb.append(TEXT_288);
    realSb.append(oldInstance);
    realSb.append(TEXT_289);
    realSb.append(newInstance);
    realSb.append(TEXT_290);
    realSb.append(newInstance);
    realSb.append(TEXT_291);
    realSb.append(otherGetterMethodName);
    realSb.append(TEXT_292);
    realSb.append(oldInstance);
    realSb.append(TEXT_293);
    realSb.append(oldInstance);
    realSb.append(TEXT_294);
    realSb.append(oldInstance);
    realSb.append(TEXT_295);
    realSb.append(name);
    realSb.append(TEXT_296);
    realSb.append(name);
    realSb.append(TEXT_297);
    realSb.append(name);
    realSb.append(TEXT_298);
    realSb.append(setterMethodName);
    realSb.append(TEXT_299);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String attributeSetterOne(){
        StringBuilder sb = new StringBuilder();
    return this._attributeSetterOne(0,sb).toString(); 
  }

  public StringBuilder _attributeSetterRanged(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String type= source.getType();
	String name= source.getName();
	String existingVariableName= existingInstance(name);
	String newInstance = setterParamInstance();
	String otherRole= target.getRole();
	String otherRoles= target.getRoles();
	String addMethodName= addInstance(otherRole, getOwner().getIsRemote());
	String numberOfOtherEndMethodName= numberOfInstance(otherRoles, getOwner().getIsRemote());
	String minimumNumberOtherEndMethodName= minimumNumberOfInstance(otherRoles, getOwner().getIsRemote());
	String removeMethodName= removeInstance(otherRole, getOwner().getIsRemote());
	

    realSb.append(type);
    realSb.append(TEXT_300);
    realSb.append(existingVariableName);
    realSb.append(TEXT_301);
    realSb.append(name);
    realSb.append(TEXT_302);
    realSb.append(existingVariableName);
    realSb.append(TEXT_303);
    realSb.append(newInstance);
    realSb.append(TEXT_304);
    realSb.append(newInstance);
    realSb.append(TEXT_305);
    realSb.append(addMethodName);
    realSb.append(TEXT_306);
    realSb.append(existingVariableName);
    realSb.append(TEXT_307);
    realSb.append(newInstance);
    realSb.append(TEXT_308);
    realSb.append(existingVariableName);
    realSb.append(TEXT_309);
    realSb.append(minimumNumberOtherEndMethodName);
    realSb.append(TEXT_310);
    realSb.append(existingVariableName);
    realSb.append(TEXT_311);
    realSb.append(numberOfOtherEndMethodName);
    realSb.append(TEXT_312);
    realSb.append(existingVariableName);
    realSb.append(TEXT_313);
    realSb.append(removeMethodName);
    realSb.append(TEXT_314);
    realSb.append(newInstance);
    realSb.append(TEXT_315);
    realSb.append(newInstance);
    realSb.append(TEXT_316);
    realSb.append(addMethodName);
    realSb.append(TEXT_317);
    realSb.append(existingVariableName);
    realSb.append(TEXT_318);
    realSb.append(newInstance);
    realSb.append(TEXT_319);
    realSb.append(name);
    realSb.append(TEXT_320);
    realSb.append(existingVariableName);
    realSb.append(TEXT_321);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String attributeSetterRanged(){
        StringBuilder sb = new StringBuilder();
    return this._attributeSetterRanged(0,sb).toString(); 
  }

  public StringBuilder _attributeSetterList(Integer numSpaces, StringBuilder sb, Boolean copyDirectly){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String type= source.getType();
	String name= source.getName();
	String otherRole= target.getRole();
	String role= source.getRole();
	String roles= source.getRoles();
	String removeMethodName= removeInstance(otherRole, getOwner().getIsRemote());
	
	String newInstance = setterParamInstance();
	String subInstance= newInstanceInstance(role);
	String verifiedList= verifiedInstance(name);
	String oldVariable= oldInstance(name, true);
	String oldSubVariable= oldInstance(role);
	
	String instanceGetterCall= getterCall(2, "index", subInstance, verifiedList);
	String getterCall= getterCall(2, "index", "temp", newInstance);
	String removeVariableGetterCall= getterCall(2, "index", oldSubVariable, oldVariable);
	
	String copyCall= copyCall(0, verifiedList, "this->"+ name);
	String addMethodName= addInstance(role, getOwner().getIsRemote());
	String addOtherMethodName= addInstance(otherRole, getOwner().getIsRemote());
	String oldVariableCopyCall= copyCall(0, "this->"+ name, oldVariable);
	
	String verifiedListInit= listTypeDeclaration(0, type, verifiedList, false);
	String oldVariableInit= listTypeDeclaration(0, type, oldVariable, false);
	String nameInit= listTypeDeclaration(0, type, "this->"+ name, true);
	String removeCall= removeElement(4, oldVariable, "indexOf", type);
	
	String addCall= addCall(2, verifiedList, "temp", null);
	
	String minimumNumberMethodName= minimumNumberOfInstance(roles, getOwner().getIsRemote());
	String maximumNumberMethodName= maximumNumberOfInstance(roles, getOwner().getIsRemote());
	

    realSb.append(verifiedListInit);
    realSb.append(TEXT_322);
    realSb.append(newInstance);
    realSb.append(TEXT_323);
    realSb.append(getterCall);
    realSb.append(TEXT_324);
    realSb.append(verifiedList);
    realSb.append(TEXT_325);
    realSb.append(verifiedList);
    realSb.append(TEXT_326);
    realSb.append(addCall);
    realSb.append(TEXT_327);
    realSb.append(verifiedList);
    realSb.append(TEXT_328);
    realSb.append(newInstance);
    realSb.append(TEXT_329);
    if(source.isUseMinimum()){
    realSb.append(TEXT_330);
    realSb.append(verifiedList);
    realSb.append(TEXT_331);
    realSb.append(minimumNumberMethodName);
    realSb.append(TEXT_332);
    }
if(source.isUseMaximum()){
    realSb.append(TEXT_333);
    realSb.append(verifiedList);
    realSb.append(TEXT_334);
    realSb.append(maximumNumberMethodName);
    realSb.append(TEXT_335);
    }
    realSb.append(TEXT_336);
    if(copyDirectly){
    realSb.append(TEXT_337);
    realSb.append(nameInit);
    realSb.append(TEXT_338);
    realSb.append(copyCall);
    realSb.append(TEXT_339);
    }
    else{
    realSb.append(TEXT_340);
    realSb.append(oldVariableInit);
    realSb.append(TEXT_341);
    realSb.append(oldVariableCopyCall);
    realSb.append(TEXT_342);
    realSb.append(name);
    realSb.append(TEXT_343);
    realSb.append(verifiedList);
    realSb.append(TEXT_344);
    realSb.append(instanceGetterCall);
    realSb.append(TEXT_345);
    realSb.append(addMethodName);
    realSb.append(TEXT_346);
    realSb.append(subInstance);
    realSb.append(TEXT_347);
    realSb.append(oldVariable);
    realSb.append(TEXT_348);
    realSb.append(oldVariable);
    realSb.append(TEXT_349);
    realSb.append(subInstance);
    realSb.append(TEXT_350);
    realSb.append(removeCall);
    realSb.append(TEXT_351);
    realSb.append(subInstance);
    realSb.append(TEXT_352);
    realSb.append(addOtherMethodName);
    realSb.append(TEXT_353);
    realSb.append(oldVariable);
    realSb.append(TEXT_354);
    realSb.append(removeVariableGetterCall);
    realSb.append(TEXT_355);
    realSb.append(oldSubVariable);
    realSb.append(TEXT_356);
    realSb.append(removeMethodName);
    realSb.append(TEXT_357);
    }
    realSb.append(TEXT_358);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String attributeSetterList(Boolean copyDirectly){
        StringBuilder sb = new StringBuilder();
    return this._attributeSetterList(0,sb,copyDirectly).toString(); 
  }

  public StringBuilder _attributeSetterUseExistingRemove(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String name= source.getName();
	String newInstance = setterParamInstance();
	String type= source.getType();
	String existingVariableName= existingInstance(name);
	
	String otherRole= target.getRole();
	String addMethodName= addInstance(otherRole, getOwner().getIsRemote());
	String removeMethodName= removeInstance(otherRole, getOwner().getIsRemote());
	

    realSb.append(TEXT_359);
    realSb.append(newInstance);
    realSb.append(TEXT_360);
    realSb.append(type);
    realSb.append(TEXT_361);
    realSb.append(existingVariableName);
    realSb.append(TEXT_362);
    realSb.append(name);
    realSb.append(TEXT_363);
    realSb.append(name);
    realSb.append(TEXT_364);
    realSb.append(newInstance);
    realSb.append(TEXT_365);
    realSb.append(existingVariableName);
    realSb.append(TEXT_366);
    realSb.append(existingVariableName);
    realSb.append(TEXT_367);
    realSb.append(newInstance);
    realSb.append(TEXT_368);
    realSb.append(existingVariableName);
    realSb.append(TEXT_369);
    realSb.append(removeMethodName);
    realSb.append(TEXT_370);
    realSb.append(name);
    realSb.append(TEXT_371);
    realSb.append(addMethodName);
    realSb.append(TEXT_372);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String attributeSetterUseExistingRemove(){
        StringBuilder sb = new StringBuilder();
    return this._attributeSetterUseExistingRemove(0,sb).toString(); 
  }

  public StringBuilder _attributeSetterMaximumMany(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String name= source.getName();
	String newInstance = setterParamInstance();
	String type= source.getType();
	String otherType= target.getType();
	String existingVariableName= existingInstance(name);
	
	String otherRole= target.getRole();
	String addMethodName= addInstance(otherRole, getOwner().getIsRemote());
	String removeMethodName= removeInstance(otherRole, getOwner().getIsRemote());
	String otherRoles= target.getRoles();
	String otherEndMinimumNumberMethodName= minimumNumberOfInstance(otherRoles, getOwner().getIsRemote());
	String otherEndmaximumNumberMethodName= maximumNumberOfInstance(otherRoles, getOwner().getIsRemote());
	String numberOfOtherEndMethodName= numberOfInstance(otherRoles, getOwner().getIsRemote()); 
	

    realSb.append(TEXT_373);
    realSb.append(newInstance);
    realSb.append(TEXT_374);
    realSb.append(name);
    realSb.append(TEXT_375);
    realSb.append(otherType);
    realSb.append(TEXT_376);
    
boolean isUseMinimum= target.isUseMinimum();
boolean isUseMaximum= target.isUseMaximum();
if(isUseMinimum|| isUseMaximum){
	
    realSb.append(TEXT_377);
    
		if(isUseMinimum){
    realSb.append(TEXT_378);
    realSb.append(name);
    realSb.append(TEXT_379);
    realSb.append(name);
    realSb.append(TEXT_380);
    realSb.append(numberOfOtherEndMethodName);
    realSb.append(TEXT_381);
    realSb.append(newInstance);
    realSb.append(TEXT_382);
    realSb.append(otherEndMinimumNumberMethodName);
    realSb.append(TEXT_383);
    }
		if(isUseMaximum){
    if(isUseMinimum){
    realSb.append(TEXT_384);
    }
    realSb.append(newInstance);
    realSb.append(TEXT_385);
    realSb.append(numberOfOtherEndMethodName);
    realSb.append(TEXT_386);
    realSb.append(newInstance);
    realSb.append(TEXT_387);
    realSb.append(otherEndmaximumNumberMethodName);
    realSb.append(TEXT_388);
    }
		
    realSb.append(TEXT_389);
    }
    realSb.append(TEXT_390);
    realSb.append(type);
    realSb.append(TEXT_391);
    realSb.append(existingVariableName);
    realSb.append(TEXT_392);
    realSb.append(name);
    realSb.append(TEXT_393);
    realSb.append(name);
    realSb.append(TEXT_394);
    realSb.append(newInstance);
    realSb.append(TEXT_395);
    realSb.append(existingVariableName);
    realSb.append(TEXT_396);
    realSb.append(existingVariableName);
    realSb.append(TEXT_397);
    realSb.append(newInstance);
    realSb.append(TEXT_398);
    realSb.append(existingVariableName);
    realSb.append(TEXT_399);
    realSb.append(removeMethodName);
    realSb.append(TEXT_400);
    realSb.append(name);
    realSb.append(TEXT_401);
    realSb.append(existingVariableName);
    realSb.append(TEXT_402);
    realSb.append(name);
    realSb.append(TEXT_403);
    realSb.append(addMethodName);
    realSb.append(TEXT_404);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String attributeSetterMaximumMany(){
        StringBuilder sb = new StringBuilder();
    return this._attributeSetterMaximumMany(0,sb).toString(); 
  }

  public StringBuilder _attributeSetterMinimumFixed(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String name= source.getName();
	String newInstance = setterParamInstance();
	String type= source.getType();
	String role= source.getRole();
	String roles= source.getRoles();
	String otherRole= target.getRole();
	String subInstance= newInstanceInstance(role);
	String checkNewInstance= checkNewInstance(roles);
	String checkListInit= listTypeDeclaration(0, type, checkNewInstance, false);
	String instanceGetterCall= getterCall(2, "index", subInstance, newInstance);
	String assignGetterCall= getterCall(2, "index", subInstance, checkNewInstance);
	String orphanGetterCall= getterCall(2, "index", "orphan", newInstance);
	String otherGetterMethodName= getInstance(otherRole, getOwner().getIsRemote());
	String addCall= addCall(2, checkNewInstance, subInstance, null);
	String nameAddCall= addCall(2, name, subInstance, null);
	
	String friendSetterMethod= friendMethodName();
	String removeAllCall= removeAllElements(0, type, name, checkNewInstance);
	

    realSb.append(checkListInit);
    realSb.append(TEXT_405);
    realSb.append(newInstance);
    realSb.append(TEXT_406);
    realSb.append(instanceGetterCall);
    realSb.append(TEXT_407);
    realSb.append(checkNewInstance);
    realSb.append(TEXT_408);
    realSb.append(checkNewInstance);
    realSb.append(TEXT_409);
    realSb.append(subInstance);
    realSb.append(TEXT_410);
    realSb.append(subInstance);
    realSb.append(TEXT_411);
    realSb.append(otherGetterMethodName);
    realSb.append(TEXT_412);
    realSb.append(subInstance);
    realSb.append(TEXT_413);
    realSb.append(otherGetterMethodName);
    realSb.append(TEXT_414);
    realSb.append(addCall);
    realSb.append(TEXT_415);
    realSb.append(checkNewInstance);
    realSb.append(TEXT_416);
    realSb.append(newInstance);
    realSb.append(TEXT_417);
    realSb.append(checkNewInstance);
    realSb.append(TEXT_418);
    realSb.append(newInstance);
    realSb.append(TEXT_419);
    realSb.append(removeAllCall);
    realSb.append(TEXT_420);
    realSb.append(newInstance);
    realSb.append(TEXT_421);
    realSb.append(orphanGetterCall);
    realSb.append(TEXT_422);
    realSb.append(friendSetterMethod);
    realSb.append(TEXT_423);
    realSb.append(name);
    realSb.append(TEXT_424);
    realSb.append(newInstance);
    realSb.append(TEXT_425);
    realSb.append(assignGetterCall);
    realSb.append(TEXT_426);
    realSb.append(friendSetterMethod);
    realSb.append(TEXT_427);
    realSb.append(subInstance);
    realSb.append(TEXT_428);
    realSb.append(nameAddCall);
    realSb.append(TEXT_429);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String attributeSetterMinimumFixed(){
        StringBuilder sb = new StringBuilder();
    return this._attributeSetterMinimumFixed(0,sb).toString(); 
  }

  public StringBuilder _attributeSetterUseExistingSetter(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String name= source.getName();
	String newInstance = setterParamInstance();
	String type= source.getType();
	String otherType= target.getType();
	String role= source.getRole();
	String otherRole= target.getRole();
	String oldInstance= oldInstance(role, true);
	String setterMethodName= setInstance(otherRole, getOwner().getIsRemote());
	String getterMethodName= getInstance(otherRole, getOwner().getIsRemote());
	String existingOtherEndVariableName= existingInstance(otherRole);
	

    realSb.append(TEXT_430);
    realSb.append(newInstance);
    realSb.append(TEXT_431);
    realSb.append(type);
    realSb.append(TEXT_432);
    realSb.append(type);
    realSb.append(TEXT_433);
    realSb.append(otherType);
    realSb.append(TEXT_434);
    realSb.append(otherType);
    realSb.append(TEXT_435);
    realSb.append(existingOtherEndVariableName);
    realSb.append(TEXT_436);
    realSb.append(newInstance);
    realSb.append(TEXT_437);
    realSb.append(getterMethodName);
    realSb.append(TEXT_438);
    realSb.append(existingOtherEndVariableName);
    realSb.append(TEXT_439);
    realSb.append(existingOtherEndVariableName);
    realSb.append(TEXT_440);
    realSb.append(type);
    realSb.append(TEXT_441);
    realSb.append(name);
    realSb.append(TEXT_442);
    realSb.append(type);
    realSb.append(TEXT_443);
    realSb.append(type);
    realSb.append(TEXT_444);
    realSb.append(oldInstance);
    realSb.append(TEXT_445);
    realSb.append(name);
    realSb.append(TEXT_446);
    realSb.append(name);
    realSb.append(TEXT_447);
    realSb.append(newInstance);
    realSb.append(TEXT_448);
    realSb.append(name);
    realSb.append(TEXT_449);
    realSb.append(setterMethodName);
    realSb.append(TEXT_450);
    realSb.append(oldInstance);
    realSb.append(TEXT_451);
    realSb.append(oldInstance);
    realSb.append(TEXT_452);
    realSb.append(setterMethodName);
    realSb.append(TEXT_453);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String attributeSetterUseExistingSetter(){
        StringBuilder sb = new StringBuilder();
    return this._attributeSetterUseExistingSetter(0,sb).toString(); 
  }

  public StringBuilder _attributeSetterHashmap(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String name= source.getName();
	String type= source.getType();
	String otherType= target.getType();
	String newInstance = setterParamInstance();
	String roles= source.getRoles();
	String role= source.getRole();
	String otherRole= target.getRole();
	String checkNewInstance= checkNewInstance(roles);
	String checkListInit= listTypeDeclaration(0, type, checkNewInstance, false);
	String subInstance= newInstanceInstance(role);
	String instanceGetterCall= getterCall(2, "index", subInstance, newInstance);
	String existingOtherEndVariableName= existingInstance(otherRole);
	String newMapInstance= newMapInstance(otherRole, roles);
	String getterMethodName= getInstance(otherRole, getOwner().getIsRemote());
	String numberOfMethodName= numberOfInstance(roles, getOwner().getIsRemote());
	String maximumNumberMethodName=  maximumNumberOfInstance(roles, getOwner().getIsRemote());
	String minimumNumberMethodName= minimumNumberOfInstance(roles, getOwner().getIsRemote());
	String addCall= addCall(2, checkNewInstance, subInstance, null);
	String assignGetterCall= getterCall(2, "index", subInstance, newInstance);
	String friendSetterMethod= friendMethodName();
	String nameAddCall= addCall(2, name, subInstance, null);
	String removeMethodName= removeInstance(role, getOwner().getIsRemote());
	

    
boolean isUseMinimum= source.isUseMinimum();
boolean isUseMaximum= source.isUseMaximum();
if(isUseMinimum|| isUseMaximum){
	
    realSb.append(TEXT_454);
    
		if(isUseMinimum){
    realSb.append(newInstance);
    realSb.append(TEXT_455);
    realSb.append(minimumNumberMethodName);
    realSb.append(TEXT_456);
    }
		if(isUseMaximum){
    if(isUseMinimum){
    realSb.append(TEXT_457);
    }
    realSb.append(newInstance);
    realSb.append(TEXT_458);
    realSb.append(maximumNumberMethodName);
    realSb.append(TEXT_459);
    }
		
    realSb.append(TEXT_460);
    }
    realSb.append(checkListInit);
    realSb.append(TEXT_461);
    realSb.append(otherType);
    realSb.append(TEXT_462);
    realSb.append(newMapInstance);
    realSb.append(TEXT_463);
    realSb.append(otherType);
    realSb.append(TEXT_464);
    realSb.append(newInstance);
    realSb.append(TEXT_465);
    realSb.append(instanceGetterCall);
    realSb.append(TEXT_466);
    realSb.append(checkNewInstance);
    realSb.append(TEXT_467);
    realSb.append(checkNewInstance);
    realSb.append(TEXT_468);
    realSb.append(subInstance);
    realSb.append(TEXT_469);
    realSb.append(subInstance);
    realSb.append(TEXT_470);
    realSb.append(getterMethodName);
    realSb.append(TEXT_471);
    realSb.append(subInstance);
    realSb.append(TEXT_472);
    realSb.append(getterMethodName);
    realSb.append(TEXT_473);
    realSb.append(otherType);
    realSb.append(TEXT_474);
    realSb.append(existingOtherEndVariableName);
    realSb.append(TEXT_475);
    realSb.append(subInstance);
    realSb.append(TEXT_476);
    realSb.append(getterMethodName);
    realSb.append(TEXT_477);
    realSb.append(newMapInstance);
    realSb.append(TEXT_478);
    realSb.append(existingOtherEndVariableName);
    realSb.append(TEXT_479);
    realSb.append(newMapInstance);
    realSb.append(TEXT_480);
    realSb.append(otherType);
    realSb.append(TEXT_481);
    realSb.append(existingOtherEndVariableName);
    realSb.append(TEXT_482);
    realSb.append(existingOtherEndVariableName);
    realSb.append(TEXT_483);
    realSb.append(numberOfMethodName);
    realSb.append(TEXT_484);
    realSb.append(newMapInstance);
    realSb.append(TEXT_485);
    realSb.append(existingOtherEndVariableName);
    realSb.append(TEXT_486);
    realSb.append(newMapInstance);
    realSb.append(TEXT_487);
    realSb.append(otherType);
    realSb.append(TEXT_488);
    realSb.append(existingOtherEndVariableName);
    realSb.append(TEXT_489);
    realSb.append(addCall);
    realSb.append(TEXT_490);
    realSb.append(checkNewInstance);
    realSb.append(TEXT_491);
    realSb.append(newInstance);
    realSb.append(TEXT_492);
    realSb.append(name);
    realSb.append(TEXT_493);
    realSb.append(newInstance);
    realSb.append(TEXT_494);
    realSb.append(assignGetterCall);
    realSb.append(TEXT_495);
    realSb.append(friendSetterMethod);
    realSb.append(TEXT_496);
    realSb.append(subInstance);
    realSb.append(TEXT_497);
    realSb.append(name);
    realSb.append(TEXT_498);
    realSb.append(newInstance);
    realSb.append(TEXT_499);
    realSb.append(instanceGetterCall);
    realSb.append(TEXT_500);
    realSb.append(subInstance);
    realSb.append(TEXT_501);
    realSb.append(getterMethodName);
    realSb.append(TEXT_502);
    realSb.append(subInstance);
    realSb.append(TEXT_503);
    realSb.append(getterMethodName);
    realSb.append(TEXT_504);
    realSb.append(removeMethodName);
    realSb.append(TEXT_505);
    realSb.append(subInstance);
    realSb.append(TEXT_506);
    realSb.append(friendSetterMethod);
    realSb.append(TEXT_507);
    realSb.append(subInstance);
    realSb.append(TEXT_508);
    realSb.append(nameAddCall);
    realSb.append(TEXT_509);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String attributeSetterHashmap(){
        StringBuilder sb = new StringBuilder();
    return this._attributeSetterHashmap(0,sb).toString(); 
  }

  public StringBuilder _attributeAddExists(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	if(!checkUnique){
		return sb;
	}
	
	String name= source.getName();
	String newInstance = setterParamInstance(false);
	

    realSb.append(TEXT_510);
    realSb.append(name);
    realSb.append(TEXT_511);
    realSb.append(name);
    realSb.append(TEXT_512);
    realSb.append(newInstance);
    realSb.append(TEXT_513);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String attributeAddExists(){
        StringBuilder sb = new StringBuilder();
    return this._attributeAddExists(0,sb).toString(); 
  }

  public StringBuilder _attributeAddMaximumCheck(Integer numSpaces, StringBuilder sb, String returnVariable){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	if(!getSource().getUseMaximum()){
		return sb;
	}
	String roles= source.getRoles();
	String numberOfMethodName= numberOfInstance(roles, getOwner().getIsRemote());
	String maximumNumberMethodName=  maximumNumberOfInstance(roles, getOwner().getIsRemote());

    realSb.append(TEXT_514);
    realSb.append(numberOfMethodName);
    realSb.append(TEXT_515);
    realSb.append(maximumNumberMethodName);
    realSb.append(TEXT_516);
    realSb.append(returnVariable);
    realSb.append(TEXT_517);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String attributeAddMaximumCheck(String returnVariable){
        StringBuilder sb = new StringBuilder();
    return this._attributeAddMaximumCheck(0,sb,returnVariable).toString(); 
  }

  public StringBuilder _attributeAddDirectly(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    

    realSb.append(attributeAddExists());
    realSb.append(attributeAddMaximumCheck());
    realSb.append(attributeAddCall(0));
    realSb.append(TEXT_518);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String attributeAddDirectly(){
        StringBuilder sb = new StringBuilder();
    return this._attributeAddDirectly(0,sb).toString(); 
  }

  public StringBuilder _attributeAddAndCheck(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String name= source.getName();
	String type= source.getType();
	String newInstance = setterParamInstance(false);
	String role= source.getRole();
	String otherRole= target.getRole();
	String otherIndexOfInstance= indexOfInstance(otherRole, getOwner().getIsRemote());
	String indexOfInstance= indexOfInstance(role, getOwner().getIsRemote());
	String addMethodName= addInstance(otherRole, getOwner().getIsRemote());
	String removeCall= removeElement(4, "this->"+ name, "currentIndex", type);
	

    realSb.append(attributeAddExists());
    realSb.append(attributeAddMaximumCheck());
    realSb.append(attributeAddCall(0));
    realSb.append(TEXT_519);
    realSb.append(newInstance);
    realSb.append(TEXT_520);
    realSb.append(otherIndexOfInstance);
    realSb.append(TEXT_521);
    realSb.append(newInstance);
    realSb.append(TEXT_522);
    realSb.append(addMethodName);
    realSb.append(TEXT_523);
    realSb.append(indexOfInstance);
    realSb.append(TEXT_524);
    realSb.append(newInstance);
    realSb.append(TEXT_525);
    realSb.append(removeCall);
    realSb.append(TEXT_526);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String attributeAddAndCheck(){
        StringBuilder sb = new StringBuilder();
    return this._attributeAddAndCheck(0,sb).toString(); 
  }

  public StringBuilder _attributeAddRemoveExistingOrThis(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String role= source.getRole();
	String otherRole= target.getRole();
	String newInstance = setterParamInstance(false);
	String otherType= target.getType();
	String existingOtherVariableName= existingInstance(target.getRole());
	String addMethodName= addInstance(role, getOwner().getIsRemote());
	String removeMethodName= removeInstance(role, getOwner().getIsRemote());
	
	String otherGetterMethodName= getInstance(otherRole, getOwner().getIsRemote());
	String otherSetterMethodName= setInstance(target.isMany()?target.getRoles():otherRole, getOwner().getIsRemote());
	

    realSb.append(attributeAddExists());
    realSb.append(attributeAddMaximumCheck());
    realSb.append(otherType);
    realSb.append(TEXT_527);
    realSb.append(existingOtherVariableName);
    realSb.append(TEXT_528);
    realSb.append(newInstance);
    realSb.append(TEXT_529);
    realSb.append(otherGetterMethodName);
    realSb.append(TEXT_530);
    realSb.append(existingOtherVariableName);
    realSb.append(TEXT_531);
    realSb.append(newInstance);
    realSb.append(TEXT_532);
    realSb.append(otherSetterMethodName);
    realSb.append(TEXT_533);
    realSb.append(existingOtherVariableName);
    realSb.append(TEXT_534);
    realSb.append(existingOtherVariableName);
    realSb.append(TEXT_535);
    realSb.append(removeMethodName);
    realSb.append(TEXT_536);
    realSb.append(newInstance);
    realSb.append(TEXT_537);
    realSb.append(addMethodName);
    realSb.append(TEXT_538);
    realSb.append(newInstance);
    realSb.append(TEXT_539);
    realSb.append(attributeAddCall(2));
    realSb.append(TEXT_540);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String attributeAddRemoveExistingOrThis(){
        StringBuilder sb = new StringBuilder();
    return this._attributeAddRemoveExistingOrThis(0,sb).toString(); 
  }

  public StringBuilder _attributeAddCheckNewOtherExisting(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String newInstance = setterParamInstance(false);
	String otherType= target.getType();
	String otherRole= target.getRole();
	String existingOtherVariableName= existingInstance(otherRole);
	String otherGetterMethodName= getInstance(otherRole, getOwner().getIsRemote());
	String otherSetterMethodName= setInstance(target.isMany()?target.getRoles():otherRole, getOwner().getIsRemote());
	String isNewInstance= isNewInstance(otherRole);
	

    realSb.append(attributeAddExists());
    realSb.append(attributeAddMaximumCheck());
    realSb.append(otherType);
    realSb.append(TEXT_541);
    realSb.append(existingOtherVariableName);
    realSb.append(TEXT_542);
    realSb.append(newInstance);
    realSb.append(TEXT_543);
    realSb.append(otherGetterMethodName);
    realSb.append(TEXT_544);
    realSb.append(isNewInstance);
    realSb.append(TEXT_545);
    realSb.append(existingOtherVariableName);
    realSb.append(TEXT_546);
    realSb.append(existingOtherVariableName);
    realSb.append(TEXT_547);
    realSb.append(isNewInstance);
    realSb.append(TEXT_548);
    realSb.append(newInstance);
    realSb.append(TEXT_549);
    realSb.append(otherSetterMethodName);
    realSb.append(TEXT_550);
    realSb.append(attributeAddCall(2));
    realSb.append(TEXT_551);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String attributeAddCheckNewOtherExisting(){
        StringBuilder sb = new StringBuilder();
    return this._attributeAddCheckNewOtherExisting(0,sb).toString(); 
  }

  public StringBuilder _attributeAddRemoveExisting(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String newInstance = setterParamInstance(false);
	String otherType= target.getType();
	String existingOtherVariableName= existingInstance(target.getRole());
	String role= source.getRole();
	String roles= source.getRoles();
	String removeMethodName= removeInstance(role, getOwner().getIsRemote());
	String numberOfMethodName= numberOfInstance(roles, getOwner().getIsRemote());
	String minimumNumberMethodName= minimumNumberOfInstance(roles, getOwner().getIsRemote());
	String friendMethodName= friendMethodName();
	String otherGetterMethodName= getInstance(target.getRole(), getOwner().getIsRemote());
	

    realSb.append(attributeAddExists());
    realSb.append(attributeAddMaximumCheck());
    realSb.append(otherType);
    realSb.append(TEXT_552);
    realSb.append(existingOtherVariableName);
    realSb.append(TEXT_553);
    realSb.append(newInstance);
    realSb.append(TEXT_554);
    realSb.append(otherGetterMethodName);
    realSb.append(TEXT_555);
    realSb.append(existingOtherVariableName);
    realSb.append(TEXT_556);
    realSb.append(existingOtherVariableName);
    realSb.append(TEXT_557);
    realSb.append(numberOfMethodName);
    realSb.append(TEXT_558);
    realSb.append(minimumNumberMethodName);
    realSb.append(TEXT_559);
    realSb.append(existingOtherVariableName);
    realSb.append(TEXT_560);
    realSb.append(removeMethodName);
    realSb.append(TEXT_561);
    realSb.append(newInstance);
    realSb.append(TEXT_562);
    realSb.append(attributeAddCall(0));
    realSb.append(TEXT_563);
    realSb.append(friendMethodName);
    realSb.append(TEXT_564);
    realSb.append(newInstance);
    realSb.append(TEXT_565);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String attributeAddRemoveExisting(){
        StringBuilder sb = new StringBuilder();
    return this._attributeAddRemoveExisting(0,sb).toString(); 
  }

  public StringBuilder _attributeAddSetIfNew(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String newInstance = setterParamInstance(false);
	String otherType= target.getType();
	String existingOtherVariableName= existingInstance(target.getRole());
	String otherGetterMethodName= getInstance(target.getRole(), getOwner().getIsRemote());
	String otherRole= target.getRole();
	String isNewInstance= isNewInstance(otherRole);
	String roles= source.getRoles();
	String numberOfMethodName= numberOfInstance(roles, getOwner().getIsRemote());
	String minimumNumberMethodName= minimumNumberOfInstance(roles, getOwner().getIsRemote());
	String setterMethodName= setInstance(otherRole, getOwner().getIsRemote());
	

    realSb.append(attributeAddExists());
    realSb.append(attributeAddMaximumCheck());
    realSb.append(otherType);
    realSb.append(TEXT_566);
    realSb.append(existingOtherVariableName);
    realSb.append(TEXT_567);
    realSb.append(newInstance);
    realSb.append(TEXT_568);
    realSb.append(otherGetterMethodName);
    realSb.append(TEXT_569);
    realSb.append(isNewInstance);
    realSb.append(TEXT_570);
    realSb.append(existingOtherVariableName);
    realSb.append(TEXT_571);
    realSb.append(existingOtherVariableName);
    realSb.append(TEXT_572);
    realSb.append(isNewInstance);
    realSb.append(TEXT_573);
    realSb.append(existingOtherVariableName);
    realSb.append(TEXT_574);
    realSb.append(numberOfMethodName);
    realSb.append(TEXT_575);
    realSb.append(minimumNumberMethodName);
    realSb.append(TEXT_576);
    realSb.append(newInstance);
    realSb.append(TEXT_577);
    realSb.append(setterMethodName);
    realSb.append(TEXT_578);
    realSb.append(attributeAddCall(2));
    realSb.append(TEXT_579);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String attributeAddSetIfNew(){
        StringBuilder sb = new StringBuilder();
    return this._attributeAddSetIfNew(0,sb).toString(); 
  }

  public StringBuilder _attributeConstructAndAdd(Integer numSpaces, StringBuilder sb, String parameterString){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String type = source.getType();
	

    realSb.append(attributeAddMaximumCheck("NULL"));
    realSb.append(TEXT_580);
    realSb.append(type);
    realSb.append(TEXT_581);
    realSb.append(parameterString);
    realSb.append(TEXT_582);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String attributeConstructAndAdd(String parameterString){
        StringBuilder sb = new StringBuilder();
    return this._attributeConstructAndAdd(0,sb,parameterString).toString(); 
  }

  public StringBuilder _indexOfElement(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String newInstance = setterParamInstance(false);
	String name= source.getName();

    realSb.append(TEXT_583);
    realSb.append(name);
    realSb.append(TEXT_584);
    realSb.append(name);
    realSb.append(TEXT_585);
    realSb.append(newInstance);
    realSb.append(TEXT_586);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String indexOfElement(){
        StringBuilder sb = new StringBuilder();
    return this._indexOfElement(0,sb).toString(); 
  }

  public StringBuilder _addAtImplementation(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String newInstance = setterParamInstance(false);
	String roles= source.getRoles();
	String role= source.getRole();
	String numberOfMethodName= numberOfInstance(roles, getOwner().getIsRemote());
	String addMethodName= addInstance(role, getOwner().getIsRemote());
	String removeCall= removeElement(2, "this->"+ source.getName(), indexOfElement(), source.getType());
	

    realSb.append(TEXT_587);
    realSb.append(addMethodName);
    realSb.append(TEXT_588);
    realSb.append(newInstance);
    realSb.append(TEXT_589);
    realSb.append(numberOfMethodName);
    realSb.append(TEXT_590);
    realSb.append(removeCall);
    realSb.append(TEXT_591);
    realSb.append(numberOfMethodName);
    realSb.append(TEXT_592);
    realSb.append(attributeAddCall(2, "newIndex"));
    realSb.append(TEXT_593);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String addAtImplementation(){
        StringBuilder sb = new StringBuilder();
    return this._addAtImplementation(0,sb).toString(); 
  }

  public StringBuilder _addOrMoveImplementation(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String newInstance = setterParamInstance(false);
	String name= source.getName();
	String roles= source.getRoles();
	String role= source.getRole();
	String numberOfMethodName= numberOfInstance(roles, getOwner().getIsRemote());
	String removeMethodName= removeInstance(role, getOwner().getIsRemote());
	String addAtMethod= addAtInstance(role, getOwner().getIsRemote());
	

    realSb.append(TEXT_594);
    realSb.append(name);
    realSb.append(TEXT_595);
    realSb.append(name);
    realSb.append(TEXT_596);
    realSb.append(newInstance);
    realSb.append(TEXT_597);
    realSb.append(numberOfMethodName);
    realSb.append(TEXT_598);
    realSb.append(removeMethodName);
    realSb.append(TEXT_599);
    realSb.append(newInstance);
    realSb.append(TEXT_600);
    realSb.append(addAtMethod);
    realSb.append(TEXT_601);
    realSb.append(newInstance);
    realSb.append(TEXT_602);
    realSb.append(addAtMethod);
    realSb.append(TEXT_603);
    realSb.append(newInstance);
    realSb.append(TEXT_604);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String addOrMoveImplementation(){
        StringBuilder sb = new StringBuilder();
    return this._addOrMoveImplementation(0,sb).toString(); 
  }

  public StringBuilder _numberOfImplementation(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
String name= source.getName();


    realSb.append(TEXT_605);
    realSb.append(name);
    realSb.append(TEXT_606);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String numberOfImplementation(){
        StringBuilder sb = new StringBuilder();
    return this._numberOfImplementation(0,sb).toString(); 
  }

  public StringBuilder _containsImplementation(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String roles= source.getRoles();
	String numberOfMethodName= numberOfInstance(roles, getOwner().getIsRemote());

    realSb.append(TEXT_607);
    realSb.append(numberOfMethodName);
    realSb.append(TEXT_608);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String containsImplementation(){
        StringBuilder sb = new StringBuilder();
    return this._containsImplementation(0,sb).toString(); 
  }

  public StringBuilder _indexOfImplementation(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String name= source.getName();
	String role= source.getRole();
	String instance= variableInstance(role);


    realSb.append(TEXT_609);
    realSb.append(name);
    realSb.append(TEXT_610);
    realSb.append(name);
    realSb.append(TEXT_611);
    realSb.append(instance);
    realSb.append(TEXT_612);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String indexOfImplementation(){
        StringBuilder sb = new StringBuilder();
    return this._indexOfImplementation(0,sb).toString(); 
  }

  public StringBuilder _getterByIndexImplementation(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String variableInstance= variableInstance(source.getRole());
	String getterCall= getterCall(0, "index", variableInstance, null);

    realSb.append(getterCall);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String getterByIndexImplementation(){
        StringBuilder sb = new StringBuilder();
    return this._getterByIndexImplementation(0,sb).toString(); 
  }

  public StringBuilder _constructCheckNullAssign(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String role= source.getRole();
	String roles= source.getRoles();
	String instance= variableParameterInstance(source.isMany()?roles:role, source.isMany());
	String otherGetterMethodName= getInstance(target.getRole());
	String otherType= target.getType();
	

    realSb.append(TEXT_613);
    realSb.append(instance);
    realSb.append(TEXT_614);
    realSb.append(instance);
    realSb.append(TEXT_615);
    realSb.append(otherGetterMethodName);
    realSb.append(TEXT_616);
    realSb.append(otherType);
    realSb.append(TEXT_617);
    realSb.append(instance);
    realSb.append(TEXT_618);
    realSb.append(role);
    realSb.append(TEXT_619);
    realSb.append(instance);
    realSb.append(TEXT_620);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String constructCheckNullAssign(){
        StringBuilder sb = new StringBuilder();
    return this._constructCheckNullAssign(0,sb).toString(); 
  }

  public StringBuilder _constructSetAndCheck(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String role= source.getRole();
	String setterMethodName= setInstance(role);
	String instance= variableParameterInstance(source.isMany()?source.getRoles():role, source.isMany());
	String otherType= target.getType();
	

    realSb.append(TEXT_621);
    realSb.append(setterMethodName);
    realSb.append(TEXT_622);
    realSb.append(instance);
    realSb.append(TEXT_623);
    realSb.append(otherType);
    realSb.append(TEXT_624);
    realSb.append(instance);
    realSb.append(TEXT_625);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String constructSetAndCheck(){
        StringBuilder sb = new StringBuilder();
    return this._constructSetAndCheck(0,sb).toString(); 
  }

  public StringBuilder _constructSetValidateBounds(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String name= source.getName();
	String otherType= target.getType();
	String role= source.isMany()?source.getRoles():source.getRole();
	String instance= variableParameterInstance(role, source.isMany());
	int lowerBound= source.getLowerBound();
	int upperBound= source.getUpperBound();
	String setterMethodName= setInstance(role);
	

    realSb.append(TEXT_626);
    realSb.append(setterMethodName);
    realSb.append(TEXT_627);
    realSb.append(instance);
    realSb.append(TEXT_628);
    if(upperBound==-1|| upperBound==1|| lowerBound== upperBound){

    realSb.append(TEXT_629);
    realSb.append(otherType);
    realSb.append(TEXT_630);
    realSb.append(lowerBound);
    realSb.append(TEXT_631);
    realSb.append(name);
    realSb.append(TEXT_632);
    }

    else{
    realSb.append(TEXT_633);
    realSb.append(otherType);
    realSb.append(TEXT_634);
    realSb.append(lowerBound);
    realSb.append(TEXT_635);
    realSb.append(upperBound);
    realSb.append(TEXT_636);
    realSb.append(name);
    realSb.append(TEXT_637);
    }
    realSb.append(TEXT_638);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String constructSetValidateBounds(){
        StringBuilder sb = new StringBuilder();
    return this._constructSetValidateBounds(0,sb).toString(); 
  }

  public StringBuilder _copyStringAttribute(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String name= source.getName();
	
    realSb.append(TEXT_639);
    realSb.append(name);
    realSb.append(TEXT_640);
    realSb.append(name);
    realSb.append(TEXT_641);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String copyStringAttribute(){
        StringBuilder sb = new StringBuilder();
    return this._copyStringAttribute(0,sb).toString(); 
  }

  public StringBuilder _copyPrimitiveAttribute(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String name= source.getName();
	
    realSb.append(TEXT_642);
    realSb.append(name);
    realSb.append(TEXT_643);
    realSb.append(name);
    realSb.append(TEXT_644);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String copyPrimitiveAttribute(){
        StringBuilder sb = new StringBuilder();
    return this._copyPrimitiveAttribute(0,sb).toString(); 
  }

  public StringBuilder _copyAttribute(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String name= source.getName();
	
    realSb.append(TEXT_645);
    realSb.append(name);
    realSb.append(TEXT_646);
    realSb.append(name);
    realSb.append(TEXT_647);
    realSb.append(name);
    realSb.append(TEXT_648);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String copyAttribute(){
        StringBuilder sb = new StringBuilder();
    return this._copyAttribute(0,sb).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "useMinimum" + ":" + getUseMinimum()+ "," +
            "useMaximum" + ":" + getUseMaximum()+ "," +
            "removeCheckEmpty" + ":" + getRemoveCheckEmpty()+ "," +
            "removeCheckExistence" + ":" + getRemoveCheckExistence()+ "," +
            "removeCheckNullify" + ":" + getRemoveCheckNullify()+ "," +
            "removeNullifyInternally" + ":" + getRemoveNullifyInternally()+ "," +
            "value" + ":" + getValue()+ "," +
            "constant" + ":" + getConstant()+ "," +
            "autounique" + ":" + getAutounique()+ "," +
            "immutable" + ":" + getImmutable()+ "," +
            "derived" + ":" + getDerived()+ "," +
            "internal" + ":" + getInternal()+ "," +
            "defaulted" + ":" + getDefaulted()+ "," +
            "isStatic" + ":" + getIsStatic()+ "," +
            "isSorted" + ":" + getIsSorted()+ "," +
            "isLazy" + ":" + getIsLazy()+ "," +
            "isKey" + ":" + getIsKey()+ "," +
            "many" + ":" + getMany()+ "," +
            "sortKey" + ":" + getSortKey()+ "," +
            "binding" + ":" + getBinding()+ "," +
            "bindingParameters" + ":" + getBindingParameters()+ "," +
            "checkUnique" + ":" + getCheckUnique()+ "," +
            "isAttribute" + ":" + getIsAttribute()+ "," +
            "hasAdditionalAdd" + ":" + getHasAdditionalAdd()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "source" + "=" + (getSource() != null ? !getSource().equals(this)  ? getSource().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "target" + "=" + (getTarget() != null ? !getTarget().equals(this)  ? getTarget().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "commentsPriority" + "=" + (getCommentsPriority() != null ? !getCommentsPriority().equals(this)  ? getCommentsPriority().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "requirementsPriority" + "=" + (getRequirementsPriority() != null ? !getRequirementsPriority().equals(this)  ? getRequirementsPriority().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "owner = "+(getOwner()!=null?Integer.toHexString(System.identityHashCode(getOwner())):"null");
  }
}
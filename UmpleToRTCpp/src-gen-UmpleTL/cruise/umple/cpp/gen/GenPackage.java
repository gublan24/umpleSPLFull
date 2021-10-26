/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.util.stream.Collectors;
import java.util.Arrays;
import cruise.umple.cpp.utils.StringUtil;
import java.util.regex.Pattern;
import java.util.*;
import java.io.Serializable;

/**
 * 
 * Copyright (c) 2017 Ahmed M.Orabi, Mahmoud M.Orabi.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Ahmed M.Orabi
 * Mahmoud M.Orabi
 * 
 * Please refer to the code authors before making any changes. 
 * For any code reuse or copy, contact the authors and it is a MUST 
 * to refer author names.
 * 
 * @author -Ahmed M.Orabi {@link ahmedvc@hotmail.com}
 * @author Mahmoud M.Orabi {@link mahmoud_3rabi@hotmail.com}
 * 
 * 
 * Copyright (c) 2017 Ahmed M.Orabi, Mahmoud M.Orabi.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Ahmed M.Orabi
 * Mahmoud M.Orabi
 * 
 * Please refer to the code authors before making any changes. 
 * For any code reuse or copy, contact the authors and it is a MUST 
 * to refer author names.
 * 
 * @author -Ahmed M.Orabi {@link ahmedvc@hotmail.com}
 * @author Mahmoud M.Orabi {@link mahmoud_3rabi@hotmail.com}
 * 
 * 
 * Copyright (c) 2017 Ahmed M.Orabi, Mahmoud M.Orabi.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Ahmed M.Orabi
 * Mahmoud M.Orabi
 * 
 * Please refer to the code authors before making any changes. 
 * For any code reuse or copy, contact the authors and it is a MUST 
 * to refer author names.
 * 
 * @author -Ahmed M.Orabi {@link ahmedvc@hotmail.com}
 * @author Mahmoud M.Orabi {@link mahmoud_3rabi@hotmail.com}
 * 
 * 
 * Copyright (c) 2017 Ahmed M.Orabi, Mahmoud M.Orabi.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Ahmed M.Orabi
 * Mahmoud M.Orabi
 * 
 * Please refer to the code authors before making any changes. 
 * For any code reuse or copy, contact the authors and it is a MUST 
 * to refer author names.
 * 
 * @author -Ahmed M.Orabi {@link ahmedvc@hotmail.com}
 * @author Mahmoud M.Orabi {@link mahmoud_3rabi@hotmail.com}
 * 
 */
// line 64 "../../../../../UmpleTLTemplates/Core.ump"
// line 274 "../../../../../UmpleTLTemplates/Core.ump"
// line 397 "../../../../../UmpleTLTemplates/Core.ump"
// line 135 "../../../../../UmpleTLTemplates/CompositeStructure.ump"
// line 256 "../../../../../UmpleTLTemplates/Attributes.ump"
// line 1082 "../../../../../UmpleTLTemplates/Attributes.ump"
// line 1116 "../../../../../UmpleTLTemplates/Attributes.ump"
// line 1 "../../../../../UmpleTLTemplates/Attributes.ump"
// line 19 "../../../../../UmpleTLTemplates/Association_roles.ump"
// line 19 "../../../../../UmpleTLTemplates/Depend.ump"
// line 413 "../../../../../UmpleTLTemplates/Depend.ump"
// line 19 "../../../../../UmpleTLTemplates/Content.ump"
// line 19 "../../../../../UmpleTLTemplates/RTLib.ump"
public class GenPackage implements java.io.Serializable
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final String BACK_SLASH = "\\";
  public static final String NL = System.getProperty("line.separator");
  public static final String TEXT_0 = NL + "//------------------------------" + NL + "//NAMESPACES AND PREDEFINITIONS" + NL + "//------------------------------" + NL + "#ifdef __cplusplus" + NL;
  public static final String TEXT_1 = NL + "#endif " + NL + NL;
  public static final String TEXT_2 = "//------------------------" + NL + "//USED LIBRARIES" + NL + "//------------------------" + NL;
  public static final String TEXT_3 = "//------------------------" + NL + "//USED LIBRARIES" + NL + "//------------------------" + NL;
  public static final String TEXT_4 = NL + "  ";
  public static final String TEXT_5 = "//No Implementation in this context";
  public static final String TEXT_6 = "//PLEASE DO NOT EDIT THIS CODE" + NL + "//This code was generated using the UMPLE ";
  public static final String TEXT_7 = " modeling language";
  public static final String TEXT_8 = NL + "if (";
  public static final String TEXT_9 = "getMessageRouter().getType() == RemoteMethodType::Server) {" + NL + "  Endpoint ep(getLocalhost(), ";
  public static final String TEXT_10 = "getMessageRouter().getPort());" + NL + "  object[\"endpoint\"] = ep;" + NL + "}else {" + NL + "   object[\"port\"] = ";
  public static final String TEXT_11 = "getMessageRouter().getEndPoint().getPort();" + NL + "}";
  public static final String TEXT_12 = NL + "string getLocalhost();" + NL;
  public static final String TEXT_13 = NL + "string getLocalhost() {" + NL + "  char hostName[255];" + NL + "  gethostname(hostName, 255);" + NL + "  struct hostent *he = gethostbyname(hostName);" + NL + "  return string(inet_ntoa(*(struct in_addr *)*he->h_addr_list));" + NL + "};";
  public static final String TEXT_14 = NL + "typedef char samllInt;" + NL + "typedef unsigned char unsignedSamllInt;" + NL + "typedef short int shortInt;" + NL + "typedef unsigned short int unsignedShortInt;" + NL + NL + "#define MSG_MAX 80" + NL + "#define MSG_SIZE 128" + NL + NL + "typedef int SlotHandle;" + NL + NL + "template <typename T,typename P>" + NL + "class IPublisher" + NL + "{" + NL + "public:" + NL + "  virtual T publish(P param) = 0;" + NL + "};" + NL + NL + "template <typename L,typename R,typename P>" + NL + "class Publisher : public IPublisher<R,P>" + NL + "{" + NL + "private:" + NL + "  typedef R (L::*FuncPtr)(P);" + NL + "  L* _object;" + NL + "  FuncPtr _functionPointer;" + NL + "  " + NL + "public:" + NL + "  Publisher(L* object, FuncPtr funcPtr)" + NL + "    : _object(object), _functionPointer(funcPtr)" + NL + "  {}" + NL + NL + "  R publish(P arg)" + NL + "  {" + NL + "    return (_object->*_functionPointer)(arg);    " + NL + "  }" + NL + "};" + NL + NL + "template <typename R,typename P1>" + NL + "class Event" + NL + "{" + NL + "private:" + NL + "  typedef std::map<int,IPublisher<R,P1> *> SubscribersMap;" + NL + "  SubscribersMap subscribers;" + NL + "  int subscribersCount;" + NL + NL + "public:" + NL + "  Event()" + NL + "    : subscribersCount(0) {}" + NL + NL + "  template <typename L>" + NL + "  SlotHandle subscribe(L* component,R (L::*func)(P1))" + NL + "  {" + NL + "    typedef R (L::*FuncPtr)(P1);  " + NL + "    subscribers[subscribersCount] = (new Publisher<L,R,P1>(component,func));" + NL + "    subscribersCount++;  " + NL + "    return subscribersCount-1;" + NL + "  }" + NL + NL + "  bool disconnect(SlotHandle id)" + NL + "  {" + NL + "    typename SubscribersMap::iterator it = subscribers.find(id);" + NL + "    if(it == subscribers.end())" + NL + "      return false;" + NL + "    delete it->second;" + NL + "    subscribers.erase(it);        " + NL + "    return true;" + NL + "  }" + NL + NL + "  R publish(P1 arg)" + NL + "  {" + NL + "    typename SubscribersMap::iterator it = subscribers.begin();" + NL + "    for(; it != subscribers.end(); it++)" + NL + "    {" + NL + "      it->second->publish(arg);" + NL + "    }" + NL + "  }" + NL + "};" + NL + NL + "typedef struct MessageHeader{" + NL + "  shortInt portId;" + NL + "  shortInt eventId;" + NL + "  void* data;" + NL + "} MessageHeader;" + NL + NL + NL + NL + "class MessageService {" + NL + "  private:" + NL + "    mutable MutexLock lock;" + NL + NL + "    queue<MessageHeader*>* msgQueue;" + NL + "    queue<MessageHeader*>* msgPool;" + NL + "    //Thread* executeThread;" + NL + NL + "    SlotHandle dispatcherHandleId;" + NL + "    Event<void,const MessageHeader*> msgDispatcher;" + NL + NL + "    unsignedSamllInt buffer[MSG_MAX*MSG_SIZE];" + NL + "  public:" + NL + "    template <typename L,typename R,typename P1>" + NL + "    MessageService(L* component,R (L::*func)(P1))" + NL + "    {" + NL + "      dispatcherHandleId = msgDispatcher.subscribe(component,func);" + NL + "      msgQueue = new queue<MessageHeader*>();" + NL + "      msgPool = new queue<MessageHeader*>();" + NL + "      for (int i=0; i< MSG_MAX; i++){" + NL + "        MessageHeader* block = (MessageHeader*) &buffer[i* MSG_SIZE];" + NL + "        msgPool->push(block);" + NL + "      }" + NL + "      //executeThread = new Thread(&MessageService::execute,this);" + NL + "      //executeThread->start();" + NL + "    }" + NL + "    " + NL + "    virtual ~MessageService() {" + NL + "      msgDispatcher.disconnect(dispatcherHandleId);" + NL + "      while(!msgQueue->empty()) {" + NL + "        MessageHeader* msg = msgQueue->front();" + NL + "        msgQueue->pop();" + NL + "        delete msg;" + NL + "      }" + NL + "      delete msgQueue;" + NL + "  " + NL + "      while(!msgPool->empty()) {" + NL + "        MessageHeader* msg = msgPool->front();" + NL + "        msgPool->pop();" + NL + "        delete msg->data;" + NL + "        delete msg;" + NL + "      }" + NL + "      //delete executeThread;" + NL + "      delete msgPool;" + NL + "    }" + NL + "    " + NL + "    void push(MessageHeader* msg) {" + NL + "      //synchronized(lock) " + NL + "      {" + NL + "        msgQueue->push(msg);" + NL + "        //executeThread->wakeUp();" + NL + "        execute();" + NL + "      }" + NL + "    }" + NL + "    MessageHeader* pop() {" + NL + "      MessageHeader* msg = msgQueue->front();" + NL + "      msgQueue->pop();" + NL + "      return msg;" + NL + "    }" + NL + NL + "    MessageHeader* getBufferedMessage(){" + NL + "      //synchronized(lock) " + NL + "      {" + NL + "        if (msgPool->size()>0){" + NL + "          MessageHeader* msg = msgPool->front();" + NL + "          msgPool->pop();" + NL + "          return msg;" + NL + "        }" + NL + "      }" + NL + "      return NULL;" + NL + "    }" + NL + NL + "    void poolMessage(MessageHeader* buffer){" + NL + "      msgPool->push(buffer);" + NL + "    }" + NL + NL + "    void execute() {" + NL + "        while(!msgQueue->empty()) {" + NL + "          MessageHeader* msg = msgQueue->front();" + NL + "          msgQueue->pop();" + NL + "          msgDispatcher.publish(msg);" + NL + "          poolMessage(msg);" + NL + "        }" + NL + "    }" + NL + "    /*" + NL + "    void execute(void* thisVoidPtr) {" + NL + "      MessageService* thisPtr = static_cast<MessageService*>(thisVoidPtr);" + NL + "      while(true) {" + NL + "        while(!msgQueue->empty()) {" + NL + "          MessageHeader* msg = thisPtr->msgQueue->front();" + NL + "          thisPtr->msgQueue->pop();" + NL + "          thisPtr->msgDispatcher.publish(msg);" + NL + "          thisPtr->poolMessage(msg);" + NL + "        }" + NL + "        thisPtr->executeThread->wait();" + NL + "      }" + NL + "    }*/" + NL + "};" + NL + NL;
  public static final String TEXT_15 = "= ";
  public static final String TEXT_16 = ";";
  public static final String TEXT_17 = "#pragma include_alias(\".";
  public static final String TEXT_18 = ".h\", \"";
  public static final String TEXT_19 = "/";
  public static final String TEXT_20 = ".h\")";
  public static final String TEXT_21 = "#pragma include_alias(\"..";
  public static final String TEXT_22 = ".h\", \"";
  public static final String TEXT_23 = ".h\")";
  public static final String TEXT_24 = NL + "//Helper template to be extended by the classes that need to be used as singelton design pattern" + NL + "template<class T> class Singleton {" + NL + "  Singleton(const Singleton&);" + NL + "  Singleton& operator=(const Singleton&);" + NL + "  protected:" + NL + "    Singleton() {}" + NL + "    virtual ~Singleton() {}" + NL + "  public:" + NL + "    static T& instance() {" + NL + "      static MutexLock lock;" + NL + "      synchronized(lock) {" + NL + "        static T theInstance;" + NL + "        return theInstance;" + NL + "      }" + NL + "    }" + NL + "};" + NL;
  public static final String TEXT_25 = NL + "//A template function to get an item in a set by index" + NL + "template < typename InputIterator> " + NL + "void* GetAt(InputIterator& it, int index) {" + NL + "  std::advance(it, index);" + NL + "  return *it;" + NL + "};" + NL;
  public static final String TEXT_26 = NL + "//A template function to copy set" + NL + "template<typename InputIterator, typename T>" + NL + "void copySet(InputIterator& it, InputIterator& end ,T* setObj) {  " + NL + "  for (; it != end; ++it) {" + NL + "    setObj->insert(*it);" + NL + "  }" + NL + "};" + NL;
  public static final String TEXT_27 = NL + "//A template function to copy vector" + NL + "template<typename InputIterator, typename T>" + NL + "void copyVector(InputIterator& it, InputIterator& end ,T* vectorObj) {  " + NL + "  for (; it != end; ++it) {" + NL + "    vectorObj->push_back(*it);" + NL + "  }" + NL + "};" + NL;
  public static final String TEXT_28 = NL + "//A template function to get the index of an item for a given vector. It returns -1 if the" + NL + "//item was not found" + NL + "template <typename InputIterator, typename EqualityComparable>" + NL + "  int IndexOf(const InputIterator& begin," + NL + "  const InputIterator& end, const EqualityComparable& item) {" + NL + "    if(begin == end )" + NL + "      return -1;" + NL + NL + "    InputIterator fnd = std::find(begin, end, item);" + NL + "    unsigned int index = std::distance(begin, fnd);" + NL + "    return fnd != end ? index : -1;" + NL + "};" + NL + NL + "//Used as a function pointer to safely destroy elements or collections of elements" + NL + "//Example: " + NL + "//  std::for_each( arr->begin(), arr->end(), delete_pointer_element());" + NL + "//  delete arr;" + NL + "struct deleteElement{" + NL + "template< typename T >" + NL + "void operator()( T element ) const{" + NL + "  delete element;" + NL + "  }" + NL + "};" + NL + NL + "template<typename T>" + NL + "unsigned int compare(T c1, T c2, unsigned int sz ) {" + NL + "  if(!is_ptr<T>::value) {" + NL + "    return std::memcmp(&c1,&c2, sz);" + NL + "  }" + NL + "  return std::memcmp((void*)c1, (void*)c2, sz);" + NL + "};" + NL + NL + "template<typename T>" + NL + "void copyObject(T* object1, T* object2, unsigned int sz ) {" + NL + "  if(!is_ptr<T>::value) {" + NL + "    std::memcpy(&object2,&object1, sz);" + NL + "  }" + NL + "  std::memcpy((void*)object2, (void*)object1, sz);" + NL + "};" + NL;
  public static final String TEXT_29 = NL + "#ifndef TIME_AND_DATE_DEFINITION" + NL + "#define TIME_AND_DATE_DEFINITION" + NL + "namespace { " + NL + "// Ported strptime from BSD" + NL + "#ifdef WINDOWS_OS" + NL + NL + "const char* Days[] = {" + NL + "        \"Sunday\", \"Monday\", \"Tuesday\", \"Wednesday\"," + NL + "        \"Thursday\", \"Friday\", \"Saturday\"" + NL + "};" + NL + NL + "const char* DaySymbols[] = {\"Sun\", \"Mon\", \"Tue\", \"Wed\",\"Thu\", \"Fri\", \"Sat\"};" + NL + NL + "const char* Monthes[] = {\"January\", \"February\", \"March\", \"April\", \"May\", \"June\"," + NL + "          \"July\", \"August\", \"September\", \"October\", \"November\", \"December\" };" + NL + NL + "const char* MonthSymbols[] = { \"Jan\", \"Feb\", \"Mar\", \"Apr\", \"May\", \"Jun\"," + NL + "                   \"Jul\", \"Aug\", \"Sep\", \"Oct\", \"Nov\", \"Dec\" };" + NL + NL + "const char* parseNumber(const char* s, int low, int high, int* value) {" + NL + "        const char* p = s;" + NL + "        for (*value = 0; *p != NULL && isdigit(*p); ++p) {" + NL + "                *value = (*value) * 10 + static_cast<int>(*p) - static_cast<int>('0');" + NL + "        }" + NL + "        if (p == s || *value < low || *value > high) return NULL;" + NL + "        return p;" + NL + "}" + NL + NL + "char* strptime(const char *s, const char *format, struct tm *tm) {" + NL + "        while (*format != NULL && *s != NULL) {" + NL + "                if (*format != '%') {" + NL + "                        if (*s != *format) return NULL;" + NL + "                        ++format;" + NL + "                        ++s;" + NL + "                        continue;" + NL + "                }" + NL + "                ++format;" + NL + "                int len = 0;" + NL + "                switch (*format) {" + NL + "          case 'a':" + NL + "          case 'A':" + NL + "                  tm->tm_wday = -1;" + NL + "                  for (int i = 0; i < 7; ++i) {" + NL + "                          len = static_cast<int>(strlen(DaySymbols[i]));" + NL + "                          if (_strnicmp(DaySymbols[i], s, len) == 0) {" + NL + "                                  tm->tm_wday = i;" + NL + "                                  break;" + NL + "                          }" + NL + "                          len = static_cast<int>(strlen(Days[i]));" + NL + "                          if (_strnicmp(Days[i], s, len) == 0) {" + NL + "                                  tm->tm_wday = i;" + NL + "                                  break;" + NL + "                          }" + NL + "                  }" + NL + "                  if (tm->tm_wday == -1) return NULL;" + NL + "                  s += len;" + NL + "                  break;" + NL + "          case 'b':" + NL + "          case 'B':" + NL + "          case 'h':" + NL + "                  tm->tm_mon = -1;" + NL + "                  for (int i = 0; i < 12; ++i) {" + NL + "                          len = static_cast<int>(strlen(MonthSymbols[i]));" + NL + "                          if (_strnicmp(MonthSymbols[i], s, len) == 0) {" + NL + "                                  tm->tm_mon = i;" + NL + "                                  break;" + NL + "                          }" + NL + "                          len = static_cast<int>(strlen(Monthes[i]));" + NL + "                          if (_strnicmp(Monthes[i], s, len) == 0) {" + NL + "                                  tm->tm_mon = i;" + NL + "                                  break;" + NL + "                          }" + NL + "                  }" + NL + "                  if (tm->tm_mon == -1) return NULL;" + NL + "                  s += len;" + NL + "                  break;" + NL + "          case 'm':" + NL + "                  s = parseNumber(s, 1, 12, &tm->tm_mon);" + NL + "                  if (s == NULL) return NULL;" + NL + "                  --tm->tm_mon;" + NL + "                  break;" + NL + "          case 'd':" + NL + "          case 'e':" + NL + "                  s = parseNumber(s, 1, 31, &tm->tm_mday);" + NL + "                  if (s == NULL) return NULL;" + NL + "                  break;" + NL + "          case 'H':" + NL + "                  s = parseNumber(s, 0, 23, &tm->tm_hour);" + NL + "                  if (s == NULL) return NULL;" + NL + "                  break;" + NL + "          case 'M':" + NL + "                  s = parseNumber(s, 0, 59, &tm->tm_min);" + NL + "                  if (s == NULL) return NULL;" + NL + "                  break;" + NL + "          case 'S':" + NL + "                  s = parseNumber(s, 0, 60, &tm->tm_sec);" + NL + "                  if (s == NULL) return NULL;" + NL + "                  break;" + NL + "          case 'Y':" + NL + "                  s = parseNumber(s, 1900, 9999, &tm->tm_year);" + NL + "                  if (s == NULL) return NULL;" + NL + "                  tm->tm_year -= 1900;" + NL + "                  break;" + NL + "          case 'y':" + NL + "                  s = parseNumber(s, 0, 99, &tm->tm_year);" + NL + "                  if (s == NULL) return NULL;" + NL + "                  if (tm->tm_year <= 68) {" + NL + "                          tm->tm_year += 100;" + NL + "                  }" + NL + "                  break;" + NL + "          case 't':" + NL + "          case 'n':" + NL + "                  while (isspace(*s)) ++s;" + NL + "                  break;" + NL + "          case '%':" + NL + "                  if (*s != '%') return NULL;" + NL + "                  ++s;" + NL + "                  break;" + NL + "          default:" + NL + "                  return NULL;" + NL + "                }" + NL + "                ++format;" + NL + "        }" + NL + NL + "        if (*format != NULL) {return NULL;} " + NL + "    else {return const_cast<char*>(s);}" + NL + "}" + NL + "#endif" + NL + NL + "tm* ParseDate(string buf) {" + NL + "  time_t t(time(NULL));   " + NL + "  tm* pDate = new tm(*localtime(&t));" + NL + "  char* ret = strptime(buf.c_str(), \"%d-%m-%Y\", pDate);" + NL + "  assert(ret != NULL);" + NL + "  return pDate;" + NL + "};" + NL + NL + "time_t* ParseTime(string buf) {" + NL + "  tm tm;" + NL + "  time_t* pTime;" + NL + "  char* ret = strptime(buf.c_str(), \"%H:%M:%S\", &tm);" + NL + "  assert(ret != NULL);  " + NL + "  pTime = new time_t(mktime(&tm));" + NL + "  return pTime;" + NL + "};" + NL + "}" + NL + "#endif" + NL + NL;
  public static final String TEXT_30 = NL;
  public static final String TEXT_31 = NL + "int main(int argc, char *argv[]){" + NL;
  public static final String TEXT_32 = NL + "  return 0;" + NL + "}" + NL;
  public static final String TEXT_33 = "include_directories(";
  public static final String TEXT_34 = ")";
  public static final String TEXT_35 = "cmake_minimum_required(VERSION 3.0)" + NL + "project(";
  public static final String TEXT_36 = ")" + NL + NL + "set(CMAKE_CXX_STANDARD 11)" + NL + "include_directories(${CMAKE_SOURCE_DIR})" + NL;
  public static final String TEXT_37 = NL + NL + "set(SOURCE_FILES" + NL;
  public static final String TEXT_38 = ")" + NL + NL + "add_executable(";
  public static final String TEXT_39 = " ${SOURCE_FILES})";
  public static final String TEXT_40 = NL + "#ifndef ";
  public static final String TEXT_41 = NL + "#define ";
  public static final String TEXT_42 = NL + NL + "#if defined(WIN32) || defined(_WIN32) || defined(__WIN32__) || defined(__NT__) || defined(_WIN64)" + NL + "#define WINDOWS_OS" + NL + "// NO PREPROCESSOR DEFINITION FOR PRAGMA" + NL + "#if _MSC_VER" + NL + "#define PRAGMA" + NL + "#pragma warning( disable : 4290 )" + NL + "#endif" + NL + "#elif defined(hpux) || defined(__hpux) || defined(__hpux__)" + NL + "#define HPUX_OS" + NL + "#elif defined(__APPLE__) || defined(macintosh)" + NL + "#define MAC_OS" + NL + "#elif defined(bsdi) || defined(__bsdi__)" + NL + "#define BSD_OS" + NL + "#endif" + NL + NL + "#ifdef PRAGMA" + NL + "#pragma once" + NL + "#ifdef _MSC_VER" + NL;
  public static final String TEXT_43 = NL + "#else" + NL + "#pragma interface \"";
  public static final String TEXT_44 = ".h\"" + NL + "#endif" + NL + "#endif" + NL + NL + "//------------------------" + NL + "// PACKAGE FILES DECLARATION" + NL + "//------------------------" + NL + "#include <sstream>" + NL + "#include <cmath>";
  public static final String TEXT_45 = NL + "#define NETWORK_BUFFER_SIZE 512 " + NL + "#ifndef DELIMITER" + NL + "#define DELIMITER char(0x0A)" + NL + "#endif  ";
  public static final String TEXT_46 = NL + "  " + NL + "#ifdef WINDOWS_OS" + NL + "#include <windows.h>" + NL + "#include <process.h>" + NL + "#else" + NL + "#include <errno.h>" + NL + "#include <pthread.h>" + NL + "#include <unistd.h>" + NL + "#include <cstring>" + NL + "#include <signal.h>" + NL + "#endif" + NL + NL + "#ifdef HPUX_OS" + NL + "#include <sys/pstat.h>" + NL + "#elif defined MAC_OS" + NL + "#undef DEBUG" + NL + "#include <CoreServices/CoreServices.h>" + NL + "#elif defined BSD_OS" + NL + "#include <mach/mach_types.h>" + NL + "#include <sys/systm.h>" + NL + "#include <sys/types.h>" + NL + "#include <sys/sysctl.h>" + NL + "#endif" + NL;
  public static final String TEXT_47 = NL;
  public static final String TEXT_48 = NL;
  public static final String TEXT_49 = NL + "#endif" + NL;
  public static final String TEXT_50 = NL + "template<class ArrayType>" + NL + "void createArrayType(std::vector<ArrayType> list) {" + NL + "  for (int i = 0; i < list.size(); i++) {" + NL + "    ArrayType type = list[i];" + NL + "    this->push(new JSON(type));" + NL + "  }" + NL + "}";
  public static final String TEXT_51 = NL + "JSON(std::vector<";
  public static final String TEXT_52 = "*> list) {" + NL + "  createArrayType<";
  public static final String TEXT_53 = "*>(list);" + NL + "}" + NL + NL + "operator std::vector<";
  public static final String TEXT_54 = "*>*&() {" + NL + "  std::vector<";
  public static final String TEXT_55 = "*> *v;" + NL + "  cout << \"done\";" + NL + "  return v;" + NL + "}";
  public static final String TEXT_56 = "//is_pointer" + NL + "template <typename T> struct remove_const_type { typedef T type; };" + NL + "template <typename T> struct remove_const_type<const T> { typedef T type; };" + NL + "template <typename T> struct remove_volatile_type { typedef T type; };" + NL + "template <typename T> struct remove_volatile_type<volatile T> { typedef T type; };" + NL + "template <typename T> struct removeType : remove_const_type<typename remove_volatile_type<T>::type> {};" + NL + "template <typename T> struct is_ptr_type { enum { value = false }; };" + NL + "template <typename T> struct is_ptr_type<T*> { enum { value = true }; };" + NL + "template <typename T> struct is_ptr : is_ptr_type<typename removeType<T>::type> {};" + NL + NL;
  public static final String TEXT_57 = NL;
  public static final String TEXT_58 = NL + "#define PLACE_HOLDER      int" + NL + "#define USECS_PER_MSEC      1000" + NL + "#define MUSECS_PER_SEC      1000" + NL + "#define USECS_PER_SEC      1000000" + NL + NL + "#define INSTANCEOF(object, clazz)  !dynamic_cast<clazz*>(object)" + NL + "#define ARGUMENT_UPPER_LIMIT      10" + NL + "#define EMPTY()  " + NL + "#define COMMA() ," + NL + "#define SEMICOLON() ;" + NL + "#define TYPENAME_ARGS(i, value) typename ArgumentType##i" + NL + "#define TYPENAME_VALUE_ARGS(i, value) typename ArgumentType##i=value" + NL + "#define INIT_VALUE_ARG(i, name) this->_##name##i=name##i" + NL + "#define SER_ARG(i, name) _##name##i=transport[i - 1]" + NL + "#define DES_ARG(i, name) transport[i - 1]=_##name##i" + NL + "#define NAMED_ARG(i, name) name##i " + NL + "#define MEMBER_ARG(i, name) ArgumentType##i name##i" + NL + "#define INIT_MEMBER_ARG(i, name) _##name##i(name##i)" + NL + "#define VOID_ARG(i, value) void" + NL + "#define CAT(a, ...) a ## __VA_ARGS__" + NL + "#define REPEAT_DEC(count ,macro, split, ...) CAT(REPEAT_DEC_,count)(macro, split, __VA_ARGS__)" + NL + "#define REPEAT_DEC_1(macro, split, ...) " + NL + "#define REPEAT_DEC_2(macro, split, ...)  macro(1, __VA_ARGS__)" + NL + "#define REPEAT_DEC_3(macro, split, ...)  macro(2, __VA_ARGS__) split() REPEAT_DEC_2(macro, split, __VA_ARGS__)" + NL + "#define REPEAT_DEC_4(macro, split, ...)  macro(3, __VA_ARGS__) split() REPEAT_DEC_3(macro, split, __VA_ARGS__)" + NL + "#define REPEAT_DEC_5(macro, split, ...)  macro(4, __VA_ARGS__) split() REPEAT_DEC_4(macro, split, __VA_ARGS__)" + NL + "#define REPEAT_DEC_6(macro, split, ...)  macro(5, __VA_ARGS__) split() REPEAT_DEC_5(macro, split, __VA_ARGS__)" + NL + "#define REPEAT_DEC_7(macro, split, ...)  macro(6, __VA_ARGS__) split() REPEAT_DEC_6(macro, split, __VA_ARGS__)" + NL + "#define REPEAT_DEC_8(macro, split, ...)  macro(7, __VA_ARGS__) split() REPEAT_DEC_7(macro, split, __VA_ARGS__)" + NL + "#define REPEAT_DEC_9(macro, split, ...)  macro(8, __VA_ARGS__) split() REPEAT_DEC_8(macro, split, __VA_ARGS__)" + NL + "#define REPEAT_DEC_10(macro, split, ...) macro(9, __VA_ARGS__) split() REPEAT_DEC_9(macro, split, __VA_ARGS__)" + NL + "#define REPEAT_DEC_11(macro, split, ...) macro(10, __VA_ARGS__) split() REPEAT_DEC_10(macro, split, __VA_ARGS__)" + NL + "#define REPEAT_DEC_12(macro, split, ...) macro(11, __VA_ARGS__) split() REPEAT_DEC_11(macro, split, __VA_ARGS__)" + NL + "#define REPEAT_DEC_13(macro, split, ...) macro(12, __VA_ARGS__) split() REPEAT_DEC_12(macro, split, __VA_ARGS__)" + NL + "#define REPEAT_DEC_14(macro, split, ...) macro(13, __VA_ARGS__) split() REPEAT_DEC_13(macro, split, __VA_ARGS__)" + NL + "#define REPEAT_DEC_15(macro, split, ...) macro(14, __VA_ARGS__) split() REPEAT_DEC_14(macro, split, __VA_ARGS__)" + NL + "#define REPEAT_DEC_16(macro, split, ...) macro(15, __VA_ARGS__) split() REPEAT_DEC_15(macro, split, __VA_ARGS__)" + NL + NL + "#define REPEAT_INC(count, macro, split, ...) CAT(REPEAT_INC_,count)(macro, split, __VA_ARGS__)" + NL + "#define REPEAT_INC_1(macro, split, ...)  macro(1, __VA_ARGS__)" + NL + "#define REPEAT_INC_2(macro, split, ...)  REPEAT_INC_1(macro, split, __VA_ARGS__) split() macro(2, __VA_ARGS__)" + NL + "#define REPEAT_INC_3(macro, split, ...)  REPEAT_INC_2(macro, split, __VA_ARGS__) split() macro(3, __VA_ARGS__)" + NL + "#define REPEAT_INC_4(macro, split, ...)  REPEAT_INC_3(macro, split, __VA_ARGS__) split() macro(4, __VA_ARGS__)" + NL + "#define REPEAT_INC_5(macro, split, ...)  REPEAT_INC_4(macro, split, __VA_ARGS__) split() macro(5, __VA_ARGS__)" + NL + "#define REPEAT_INC_6(macro, split, ...)  REPEAT_INC_5(macro, split, __VA_ARGS__) split() macro(6, __VA_ARGS__)" + NL + "#define REPEAT_INC_7(macro, split, ...)  REPEAT_INC_6(macro, split, __VA_ARGS__) split() macro(7, __VA_ARGS__)" + NL + "#define REPEAT_INC_8(macro, split, ...)  REPEAT_INC_7(macro, split, __VA_ARGS__) split() macro(8, __VA_ARGS__)" + NL + "#define REPEAT_INC_9(macro, split, ...)  REPEAT_INC_8(macro, split, __VA_ARGS__) split() macro(9, __VA_ARGS__)" + NL + "#define REPEAT_INC_10(macro, split, ...)  REPEAT_INC_9(macro, split, __VA_ARGS__) split() macro(10, __VA_ARGS__)" + NL + "#define REPEAT_INC_11(macro, split, ...) REPEAT_INC_10(macro, split, __VA_ARGS__) split() macro(11, __VA_ARGS__)" + NL + "#define REPEAT_INC_12(macro, split, ...) REPEAT_INC_11(macro, split, __VA_ARGS__) split() macro(12, __VA_ARGS__)" + NL + "#define REPEAT_INC_13(macro, split, ...) REPEAT_INC_12(macro, split, __VA_ARGS__) split() macro(13, __VA_ARGS__)" + NL + "#define REPEAT_INC_14(macro, split, ...) REPEAT_INC_13(macro, split, __VA_ARGS__) split() macro(14, __VA_ARGS__)" + NL + "#define REPEAT_INC_15(macro, split, ...) REPEAT_INC_14(macro, split, __VA_ARGS__) split() macro(15, __VA_ARGS__)" + NL + "#define REPEAT_INC_16(macro, split, ...) REPEAT_INC_15(macro, split, __VA_ARGS__) split() macro(16, __VA_ARGS__)" + NL + NL + "#define VAR_TYPES(N) REPEAT_INC(N, TYPENAME_ARGS, COMMA)" + NL + "#define VAR_TYPES_DEFAULT(N,VALUE) REPEAT_INC(N, TYPENAME_VALUE_ARGS, COMMA, VALUE)" + NL + "#define VAR_ARGS(N) REPEAT_INC(N, NAMED_ARG, COMMA, ArgumentType)" + NL + "#define VAR_NAMED_ARGS(N, name) REPEAT_INC(N, NAMED_ARG, COMMA, name)" + NL + "#define VOID_ARGS(N) REPEAT_INC(N, VOID_ARG, COMMA)" + NL + NL + "#define VAR_ARGS_MEMBERS(N, name, delim) REPEAT_INC(N, MEMBER_ARG, delim, name)" + NL + "#define INIT_VAR_ARGS_MEMBERS(N, name) REPEAT_INC(N, INIT_MEMBER_ARG, COMMA, name)" + NL + "#define INIT_VALUE_ARGS(N, name) REPEAT_INC(N, INIT_VALUE_ARG, SEMICOLON, name)" + NL + NL + "#define SERIALIZE_ARGS(N, name) REPEAT_INC(N, SER_ARG, SEMICOLON, name)" + NL + "#define DESERIALIZE_ARGS(N, name) REPEAT_INC(N, DES_ARG, SEMICOLON, name)" + NL;
  public static final String TEXT_59 = NL + "#define GENERATE_METHOD_CALLBACK_SIGNATURES_ARGUMENTS(N, value)      \\" + NL + "template<typename Caller, typename ReturnType, VAR_TYPES(N)>         \\" + NL + "  struct MethodCallbackSignature<Caller,ReturnType, VAR_ARGS(N)> {  \\" + NL + "  typedef ReturnType(Caller::*Method)(VAR_ARGS(N)); };        \\" + NL + "template<typename Caller, VAR_TYPES(N)>                  \\" + NL + "  struct MethodCallbackSignature<Caller, void, VAR_ARGS(N)> {     \\" + NL + "  typedef void (Caller::*Method)(VAR_ARGS(N)); };" + NL + NL + "#define GENERATE_METHOD_CALLBACK_INVOKE_ARGUMENTS(N, value)                                      \\" + NL + "template <class BASE, class Caller, class FutureResultType, class ReturnType, VAR_TYPES(N)>                    \\" + NL + "class MethodCallbackInvoke<BASE,Caller,FutureResultType,ReturnType, VAR_ARGS(N)>                        \\" + NL + "    : public BaseMethodCallbackInvoke<BASE, Caller, FutureResultType, ReturnType> {public:                  \\" + NL + "  typedef typename MethodCallbackSignature<Caller, ReturnType, VAR_ARGS(N)>::Method Callback;                  \\" + NL + "  MethodCallbackInvoke(Caller* caller, Callback method, VAR_ARGS_MEMBERS(N, arg, COMMA), const FutureResultType& result) :  \\" + NL + "    BaseMethodCallbackInvoke(caller, result), _method(method), INIT_VAR_ARGS_MEMBERS(N, arg) {}                \\" + NL + "protected: VAR_ARGS_MEMBERS(N, _arg, SEMICOLON); Callback _method; };" + NL + NL + "#define GENERATE_DELEGATE_INVOKE_ARGUMENTS(N, value)                                  \\" + NL + "template <class BASE, class Caller, class FutureType, class ReturnType, VAR_TYPES(N)>                \\" + NL + "class DelegateInvoke<BASE, Caller, FutureType, ReturnType, VAR_ARGS(N)> :                    \\" + NL + "public MethodCallbackInvoke<BASE, Caller, FutureType, ReturnType, VAR_ARGS(N)> {public:                \\" + NL + "  DelegateInvoke(Caller* caller, Callback method, VAR_ARGS_MEMBERS(N, arg, COMMA), const FutureType& result)  \\" + NL + "    : MethodCallbackInvoke(caller, method, VAR_NAMED_ARGS(N, arg), result) {}                  \\" + NL + "  void invokeMethod() { _result.resolveData(new ReturnType((_context->*_method)(VAR_NAMED_ARGS(N, _arg))));}};  \\" + NL + "template <class BASE, class Caller, class FutureType, VAR_TYPES(N)>                          \\" + NL + "class DelegateInvoke<BASE, Caller, FutureType, void, VAR_ARGS(N)> :                        \\" + NL + "public MethodCallbackInvoke<BASE, Caller, FutureType, void, VAR_ARGS(N)>{public:                  \\" + NL + "  DelegateInvoke(Caller* caller, Callback method, VAR_ARGS_MEMBERS(N, arg, COMMA), const FutureType& result)  \\" + NL + "    : MethodCallbackInvoke(caller, method, VAR_NAMED_ARGS(N, arg), result) {}                  \\" + NL + "  void invokeMethod() { (_context->*_method)(VAR_NAMED_ARGS(N, _arg));}};" + NL + NL + "#define GENERATE_DELEGATE_ARGUMENTS(N, value)                                              \\" + NL + "template <class Caller, class ReturnType, VAR_TYPES(N)> class Delegate<Caller, ReturnType, VAR_ARGS(N)> :            \\" + NL + "  public DelegateInvoke < DelegateBase, Caller, FutureResult<ReturnType>, ReturnType, VAR_ARGS(N) > {              \\" + NL + "  public:  Delegate(Caller* caller, Callback method, VAR_ARGS_MEMBERS(N, arg, COMMA), const FutureResult<ReturnType>& result)  \\" + NL + "    : DelegateInvoke(caller, method, VAR_NAMED_ARGS(N, arg), result) {} };                      \\" + NL + "template <class Caller, VAR_TYPES(N)> class Delegate<Caller, void, VAR_TYPES(N)> :                        \\" + NL + "  public DelegateInvoke < DelegateBase, Caller, FutureResult<void>, void, VAR_ARGS(N) >{                    \\" + NL + "  public:  Delegate(Caller* caller, Callback method, VAR_ARGS_MEMBERS(N, arg, COMMA), const FutureResult<void>& result)      \\" + NL + "      : DelegateInvoke(caller, method, VAR_NAMED_ARGS(N, arg), result) {}};" + NL + NL + "#define GENERATE_MULTICAST_ARGUMENTS(N, value)                                                            \\" + NL + "template<class ReturnType, VAR_TYPES(N)>                                                          \\" + NL + "class IDelegatePublisher<ReturnType, VAR_ARGS(N)> {public:                                                  \\" + NL + "  virtual FutureResult<ReturnType> publish(VAR_ARGS_MEMBERS(N, arg, COMMA), int priority = 0, long delay = 0, long timeout = 0) = 0;            \\" + NL + "};                                                                              \\" + NL + "template <class ReturnType, VAR_TYPES(N)>                                                          \\" + NL + "class MulticastDelegate<ReturnType, VAR_ARGS(N)> : public IDelegatePublisher<ReturnType, VAR_ARGS(N)>{private:                        \\" + NL + "  typedef std::vector< IDelegatePublisher<ReturnType, VAR_ARGS(N)>* > SubscribersList;                                  \\" + NL + "  SubscribersList subscribers;                                                              \\" + NL + "public:                                                                            \\" + NL + "  MulticastDelegate() {}                                                                  \\" + NL + "  MulticastDelegate& operator += (IDelegatePublisher<ReturnType, VAR_ARGS(N)>* method) {                                  \\" + NL + "    subscribers.push_back(method);                                                            \\" + NL + "    return *this;}                                                                    \\" + NL + "    void notify(VAR_ARGS_MEMBERS(N, arg, COMMA), int priority = 0, long delay = 0, long timeout = 0) {        \\" + NL + "      typename SubscribersList::iterator it = subscribers.begin();                                            \\" + NL + "      for (; it != subscribers.end(); it++) { (*it)->publish(VAR_NAMED_ARGS(N, arg), priority, delay, timeout); }  }    \\" + NL + "  FutureResult<ReturnType> operator () (VAR_ARGS_MEMBERS(N, arg, COMMA), int priority = 0, long delay = 0, long timeout = 0) {              \\" + NL + "    FutureResult<ReturnType> result = publish(VAR_NAMED_ARGS(N, arg), priority, delay, timeout);                            \\" + NL + "    notify(VAR_NAMED_ARGS(N, arg), priority, delay, timeout);                      \\" + NL + "    return result;}};" + NL + NL + "#define GENERATE_ACTIVE_ARGUMENTS(N, value)                                                                              \\" + NL + "template <class Caller, class ReturnType, VAR_TYPES(N)> class Active<Caller, ReturnType, VAR_ARGS(N)> : public ActiveConstraintUID, public MulticastDelegate<ReturnType, VAR_ARGS(N)> { public:  \\" + NL + "    typedef Delegate<Caller, ReturnType, VAR_ARGS(N)> DelegateType;                                                                \\" + NL + "    typedef typename MethodCallbackSignature<Caller, ReturnType, VAR_ARGS(N)>::Method Callback;                                                  \\" + NL + "    Active(Caller* caller, Scheduler<Caller>* sch, Callback method) :_context(caller), _sch(sch), _method(method) {}                                      \\" + NL + "    FutureResult<ReturnType> operator () (VAR_ARGS_MEMBERS(N, arg, COMMA), int priority = 0, long delay = 0, long timeout = 0) {              \\" + NL + "    FutureResult<ReturnType> result = publish(VAR_NAMED_ARGS(N, arg), priority, delay, timeout); return result;};                            \\" + NL + "    FutureResult<ReturnType> publish(VAR_ARGS_MEMBERS(N, arg, COMMA), int priority = 0, long delay = 0, long timeout = 0) {                                    \\" + NL + "      FutureResult<ReturnType> result(new FutureObject<ReturnType>());                                                            \\" + NL + "      DelegateBase::Ptr pDelegate(new DelegateType(_context, _method, VAR_NAMED_ARGS(N, arg), result));                                            \\" + NL + "      _sch->schedule(pDelegate,priority,delay, timeout, _guardId, _conditionId);                                                        \\" + NL + "    this->notify(VAR_NAMED_ARGS(N, arg), priority, delay, timeout);                \\" + NL + "      return result;} private: Caller* _context; Scheduler<Caller>* _sch; Callback _method; };" + NL;
  public static final String TEXT_60 = NL + "#define GENERATE_METHOD_CALLBACK_SIGNATURES(N)  REPEAT_DEC(N, GENERATE_METHOD_CALLBACK_SIGNATURES_ARGUMENTS, EMPTY)" + NL + "#define GENERATE_METHOD_CALLBACK_INVOKE(N)  REPEAT_DEC(N, GENERATE_METHOD_CALLBACK_INVOKE_ARGUMENTS, EMPTY)" + NL + "#define GENERATE_DELEGATE_INVOKE(N)  REPEAT_DEC(N, GENERATE_DELEGATE_INVOKE_ARGUMENTS, EMPTY)" + NL + "#define GENERATE_DELEGATE(N)  REPEAT_DEC(N, GENERATE_DELEGATE_ARGUMENTS, EMPTY)" + NL + "#define GENERATE_MULTICAST_METHOD(N)  REPEAT_DEC(N, GENERATE_MULTICAST_ARGUMENTS, EMPTY)" + NL + "#define GENERATE_ACTIVE_METHOD(N)  REPEAT_DEC(N, GENERATE_ACTIVE_ARGUMENTS, EMPTY)" + NL + NL + "#ifdef WINDOWS_OS" + NL + "#define isnan(x) _isnan(x)" + NL + "#define isinf(x) (!_finite(x))" + NL + NL + "#define SOCKET_TYPE            SOCKET" + NL + "#define CLOSE_SOCKET(arg) \\" + NL + "  closesocket(arg)" + NL + NL + "#define EVENT_TYPE            HANDLE" + NL + "#define CONDITION_TYPE          PLACE_HOLDER" + NL + "#define THREAD_TYPE             HANDLE" + NL + "#define THREAD_RETURN_TYPE        unsigned WINAPI" + NL + "#define THREAD_ERROR_INSTANCE(returnValue)  ((returnValue) == NULL)" + NL + "#define THREAD_ERROR_CODE(value)      GetLastError()" + NL + NL + "#define MUTEX_CRITICAL_SECTION      CRITICAL_SECTION" + NL + "#define START_MUTEX_FUNCTION(arg) \\" + NL + "  InitializeCriticalSection((arg))" + NL + NL + "#define TERMINATE_MUTEX_FUNCTION(arg) \\" + NL + "  DeleteCriticalSection((arg))" + NL + NL + "#define LOCK_MUTEX_FUNCTION(arg) \\" + NL + "  EnterCriticalSection((arg))" + NL + NL + "#define UNLOCK_MUTEX_FUNCTION(arg) \\" + NL + "  LeaveCriticalSection((arg))" + NL + NL + "#define START_EVENT_TYPE_FUNCTION(mutex, cond, reset) \\" + NL + "  mutex = CreateEvent(NULL, reset, FALSE, NULL);    \\" + NL + "  if (!mutex)                      \\" + NL + "    throw ThreadException(\"mutex signal failed\")" + NL + NL + "#define TERMINATE_EVENT_FUNCTION(mutex, cond) \\" + NL + "  CloseHandle(mutex)" + NL + NL + "#define WAIT_EVENT_FUNCTION(mutex, cond, wakeup)    \\" + NL + "  switch(WaitForSingleObject(mutex, INFINITE)) {    \\" + NL + "  case WAIT_OBJECT_0:                  \\" + NL + "    return;                      \\" + NL + "  default:                      \\" + NL + "    throw ThreadException(\"wait event failed\");    \\" + NL + "  }" + NL + NL + "#define WAIT_TIME_EVENT_FUNCTION(mutex, cond, time, wakeup, reset, status)      \\" + NL + "  switch (WaitForSingleObject(mutex, time + 1))                  \\" + NL + "  {                                        \\" + NL + "  case WAIT_OBJECT_0:                                \\" + NL + "    status = true;                                \\" + NL + "    break;                                        \\" + NL + "  case WAIT_TIMEOUT:                                \\" + NL + "    status = false;                                \\" + NL + "    break;                                        \\" + NL + "  default:                                    \\" + NL + "    throw ThreadException(\"wait failed\");                      \\" + NL + "  }" + NL + NL + "#define WAKEUP_EVENT_FUNCTION(mutex, cond, wakeup) \\" + NL + "  SetEvent(mutex)" + NL + NL + "#define THREAD_JOIN_FUNCTION(hdl)        WaitForSingleObject(hdl, INFINITE)" + NL + "#define THREAD_SLEEP_FUNCTION(ms)        Sleep((ms))" + NL + NL + "#define THREAD_CREATE_FUNCTION(id, funPtr, callPtr)  id =(HANDLE)CreateThread(NULL,0,(LPTHREAD_START_ROUTINE)funPtr,callPtr,0L,NULL)" + NL + NL + "#define THREAD_TERMINATE_FUNCTION(hdl)  TerminateThread(hdl, 0)" + NL + NL + "#define THREAD_CANCEL_FUNCTION(hdl)  TerminateThread(hdl, 0)" + NL + NL + "#define IS_THREAD_ALIVE_FUNCTION(hdl, isRunning)  \\" + NL + "  DWORD exitCode = 0;                \\" + NL + "  if(GetExitCodeThread(hdl, &exitCode))       \\" + NL + "    isRunning = (exitCode == STILL_ACTIVE)" + NL + NL + "#define BROADCAST_FUNCTION(arg) 0" + NL + NL + "#define SET_EVENT_FUNCTION(arg) \\" + NL + "  SetEvent((arg))" + NL + NL + "#define RESET_EVENT_FUNCTION(arg) \\" + NL + "  ResetEvent((arg))" + NL + NL + "#define LOCK_MUTEX_EVENT_FUNCTION(arg) 0" + NL + "#define UNLOCK_MUTEX_EVENT_FUNCTION(arg) 0" + NL + "  " + NL + "#else" + NL + "typedef int                 BOOL;" + NL + NL + "#ifndef FALSE" + NL + "#define FALSE               0" + NL + "#endif" + NL + NL + "#ifndef TRUE" + NL + "#define TRUE                1" + NL + "#endif" + NL + "#define SOCKET_TYPE            int" + NL + "#define CLOSE_SOCKET(arg) \\" + NL + "  close(arg)" + NL + NL + "#define EVENT_TYPE              pthread_mutex_t" + NL + "#define CONDITION_TYPE            pthread_cond_t" + NL + NL + "#define THREAD_TYPE              pthread_t" + NL + "#define THREAD_RETURN_TYPE          void *" + NL + NL + "#define THREAD_ERROR_INSTANCE(returnValue)  ((returnValue) == NULL)" + NL + "#define THREAD_ERROR_CODE(value)      errno" + NL + NL + "#define MUTEX_CRITICAL_SECTION          pthread_mutex_t" + NL + "#define START_MUTEX_FUNCTION(arg)  \\" + NL + "  pthread_mutex_init ((arg), NULL)" + NL + NL + "#define TERMINATE_MUTEX_FUNCTION(arg) \\" + NL + "  pthread_mutex_destroy((arg))" + NL + NL + "#define LOCK_MUTEX_FUNCTION(arg)  \\" + NL + "  pthread_mutex_lock((arg))" + NL + NL + "#define UNLOCK_MUTEX_FUNCTION(arg) \\" + NL + "  pthread_mutex_unlock((arg))" + NL + NL + "#define START_EVENT_TYPE_FUNCTION(mutex, cond, reset) \\" + NL + "   if (pthread_mutex_init(&mutex, NULL))        \\" + NL + "    throw ThreadException(\"mutex signal failed\");  \\" + NL + "   pthread_cond_init(&cond, NULL)" + NL + NL + "#define TERMINATE_EVENT_FUNCTION(mutex, cond) \\" + NL + "  pthread_cond_destroy(&cond); \\" + NL + "  pthread_mutex_destroy(&mutex)" + NL + NL + "#define WAIT_EVENT_FUNCTION(mutex, cond, wakeup)    \\" + NL + "  pthread_mutex_lock(&mutex);              \\" + NL + "  int err = 0;                    \\" + NL + "  while (!wakeup) {                        \\" + NL + "    err = pthread_cond_wait(&cond, &mutex);      \\" + NL + "    if (err) {                    \\" + NL + "      pthread_mutex_unlock(&mutex);          \\" + NL + "      throw ThreadException(\"wait event failed\"); \\" + NL + "    }                        \\" + NL + "  }                          \\" + NL + "  wakeup = FALSE;                    \\" + NL + "  pthread_mutex_unlock(&mutex)" + NL;
  public static final String TEXT_61 = NL + "#define WAIT_TIME_EVENT_FUNCTION(mutex, cond, ms, wakeup, reset, status)      \\" + NL + "  struct timeval tv                                \\" + NL + "  struct timespec tdif                              \\" + NL + "  gettimeofday(&tv, NULL)                              \\" + NL + "  tdif.tv_sec  = tv.tv_sec + ms / MUSECS_PER_SEC                  \\" + NL + "  tdif.tv_nsec = tv.tv_usec*MUSECS_PER_SEC + (ms % MUSECS_PER_SEC)*USECS_PER_SEC  \\" + NL + "  if (tdif.tv_nsec >= NSECS_PER_SEC) {                      \\" + NL + "    tdif.tv_nsec -= NSECS_PER_SEC                        \\" + NL + "    tdif.tv_sec++                                \\" + NL + "      }                                    \\" + NL + "  pthread_mutex_lock(&mutex)                            \\" + NL + "      while (!wakeup)                              \\" + NL + "            {                              \\" + NL + "    status = pthread_cond_timedwait(&cond, &mutex, &tdif)            \\" + NL + "    if(status) {                                \\" + NL + "      if (status == ETIMEDOUT) break;                      \\" + NL + "      pthread_mutex_unlock(&mutex)                      \\" + NL + "      throw ThreadException(get_error(status))                \\" + NL + "            }                              \\" + NL + "            }                              \\" + NL + "  wakeup =  status == 0 && reset ? false : wakeup                  \\" + NL + "  pthread_mutex_unlock(&mutex)" + NL + NL + "#define WAKEUP_EVENT_FUNCTION(mutex, cond, wakeup)  \\" + NL + "  pthread_mutex_lock(&mutex);            \\" + NL + "  wakeup = TRUE;                  \\" + NL + "  pthread_cond_signal(&cond);            \\" + NL + "  pthread_mutex_unlock(&mutex)" + NL + NL + "#define THREAD_JOIN_FUNCTION(id)  pthread_join(id, NULL)" + NL + "#define THREAD_SLEEP_FUNCTION(ms) \\" + NL + "  struct timeval tv; \\" + NL + "    tv.tv_usec = (ms % MUSECS_PER_SEC) * USECS_PER_MSEC; \\" + NL + "    tv.tv_sec = ms / MUSECS_PER_SEC; \\" + NL + "    select(0, NULL, NULL, NULL, &tv)" + NL + NL + "#define THREAD_CREATE_FUNCTION(id, funPtr, callPtr)        \\" + NL + "  pthread_attr_t attr;                    \\" + NL + "  pthread_attr_init(&attr);                  \\" + NL + "  pthread_attr_setdetachstate(&attr,PTHREAD_CREATE_DETACHED);  \\" + NL + "  pthread_attr_setinheritsched(&attr, PTHREAD_INHERIT_SCHED);  \\" + NL + "  pthread_create(&id, &attr, funPtr, callPtr);        \\" + NL + "  pthread_attr_destroy(&attr)" + NL + NL + "#define THREAD_TERMINATE_FUNCTION(arg)  pthread_exit(arg)" + NL + "#define THREAD_CANCEL_FUNCTION(Id)          \\" + NL + "  if (pthread_cancel(Id) == 0)          \\" + NL + "    pthread_detach(Id);" + NL + NL + "#define IS_THREAD_ALIVE_FUNCTION(hdl, isRunning)  \\" + NL + "  isRunning = (pthread_kill(hdl, 0) == 0)" + NL + NL + "#define BROADCAST_FUNCTION(arg) \\" + NL + "  pthread_cond_broadcast((arg))" + NL + NL + "#define SET_EVENT_FUNCTION(arg) 1" + NL + NL + "#define RESET_EVENT_FUNCTION(arg) 1" + NL + NL + "#define LOCK_MUTEX_EVENT_FUNCTION(arg)  \\" + NL + "  pthread_mutex_lock((arg))" + NL + NL + "#define UNLOCK_MUTEX_EVENT_FUNCTION(arg) \\" + NL + "  pthread_mutex_unlock((arg))" + NL + NL + "#endif" + NL + NL + "#define CREATE_THREAD(id, funPtr, callPtr)                \\" + NL + "  THREAD_CREATE_FUNCTION(id, funPtr, callPtr);            \\" + NL + "  if(THREAD_ERROR_INSTANCE(id))                    \\" + NL + "    throw ThreadException(ErrorMessage(THREAD_ERROR_CODE(id)))" + NL + NL + "static std::string ErrorMessage(int errorCode){" + NL + "  string str = \"\";" + NL + "  if (errorCode == 0) {" + NL + "    return str;" + NL + "  }" + NL + NL + "  char const* what = \"Error Numer\";" + NL + "  int whlen = strlen(what);" + NL + "  int ncode = errorCode, dlen = 1;" + NL + "  while (ncode !=0) {dlen++; ncode/=10;}" + NL + "  char *buffer = (char *) malloc(sizeof(char) * (whlen + dlen + 1));" + NL + "    sprintf(buffer, \"%s = %d\", what, errorCode);" + NL + "  str = buffer;" + NL + "  return str;" + NL + "}" + NL + NL + "class Exception : public std::exception {" + NL + "  friend ostream& operator<<(ostream& output, const Exception& ex) {" + NL + "    output << \"Exception: \" << ex.error;" + NL + "    return output;" + NL + "  }" + NL + "public:" + NL + "  Exception() throw() : error(std::string(\"Exception\")) {}" + NL + "  Exception(std::string err) throw() : error(err) {}" + NL + "  Exception(const Exception& source) throw() : std::exception(source) { error = source.error; }" + NL + "  virtual ~Exception() throw () {}" + NL + "  Exception& operator=(const Exception& source) throw() {" + NL + "    if (&source != this) {" + NL + "      error = source.error;" + NL + "    }" + NL + "    std::exception::operator= (source);" + NL + "    return *this;" + NL + "  }" + NL + "  void setError(std::string exce) { error = exce; }" + NL + "  virtual const char* what() const throw() { return error.c_str(); }" + NL + "protected:" + NL + "  std::string error;" + NL + "};" + NL;
  public static final String TEXT_62 = NL + "struct ThreadException : public Exception{" + NL + "public:" + NL + "  ThreadException() : Exception() {}" + NL + "  ThreadException(char* errorMessage) : Exception(errorMessage) {}" + NL + "  ThreadException(std::string errorMessage) : Exception(errorMessage) {}" + NL + "};" + NL + NL + "template <typename T>" + NL + "void* ConvertToFunctionPointer(T x) {" + NL + "  return *reinterpret_cast<void**>(&x);" + NL + "}" + NL + NL + "struct Runnable {" + NL + "  virtual void run() = 0;" + NL + "};" + NL + NL + "class AtomicMutex{" + NL + "  public:" + NL + "  AtomicMutex() { START_MUTEX_FUNCTION(&section); }" + NL + "  ~AtomicMutex() { TERMINATE_MUTEX_FUNCTION(&section); }" + NL + "    void lock() { LOCK_MUTEX_FUNCTION(&section); }" + NL + "    void unlock() { UNLOCK_MUTEX_FUNCTION(&section); }" + NL + NL + "  private:" + NL + "  MUTEX_CRITICAL_SECTION section;" + NL + "};" + NL + NL + "static AtomicMutex atomicMutex;" + NL + NL + "class MutexLock{" + NL + "public:" + NL + NL + "  MutexLock() : m_value(0){" + NL + "    wakeup = FALSE;" + NL + "    START_EVENT_TYPE_FUNCTION(mutex, cond, FALSE);" + NL + "  }" + NL + NL + "  MutexLock(const MutexLock& m) {" + NL + "    this->m_value = m.m_value;" + NL + "    this->wakeup = m.wakeup;" + NL + "    this->mutex = m.mutex;" + NL + "    this->cond = m.cond;" + NL + "  }" + NL + NL + "  ~MutexLock(){" + NL + "    TERMINATE_EVENT_FUNCTION(mutex, cond);" + NL + "  }" + NL + NL + "  void wait() {" + NL + "    WAIT_EVENT_FUNCTION(mutex, cond, wakeup);" + NL + "  }" + NL + NL + "  void wakeUp() {" + NL + "    WAKEUP_EVENT_FUNCTION(mutex, cond, wakeup);" + NL + "  }" + NL + NL + "  void lock() {" + NL + "    bool canBeAccessed = this->verifyLock();" + NL + "    if (canBeAccessed){" + NL + "      return;" + NL + "    }" + NL + NL + "    atomicMutex.lock();" + NL + "    canBeAccessed = m_value == 0;" + NL + "    m_value += 1;" + NL + "    atomicMutex.unlock();" + NL + NL + "    if (!canBeAccessed){" + NL + "      wait();" + NL + "      atomicMutex.lock();" + NL + "      m_value -= 1;" + NL + "      atomicMutex.unlock();" + NL + "    }" + NL + NL + "  }" + NL + NL + "  bool isLocked() {" + NL + "    atomicMutex.lock();" + NL + "    bool canBeAccessed = m_value == 0;" + NL + "    atomicMutex.unlock();" + NL + "    return !canBeAccessed;" + NL + "  }" + NL + NL + "  bool verifyLock(int set = 0) {" + NL + "    atomicMutex.lock();" + NL + "    bool canBeAccessed = m_value == 0;" + NL + "    if (m_value == set) {" + NL + "      m_value = !set;" + NL + "      canBeAccessed = true;" + NL + "    }" + NL + "    atomicMutex.unlock();" + NL + "    return canBeAccessed;" + NL + "  }" + NL + NL + "  void unlock() {" + NL + "    if (!verifyLock(1)){" + NL + "      wakeUp();" + NL + "    }" + NL + "  }" + NL + NL + "private:" + NL + "  volatile int m_value;" + NL + "  volatile bool wakeup;" + NL + NL + "  EVENT_TYPE mutex;" + NL + "  CONDITION_TYPE  cond;" + NL + "};" + NL + NL + "#define synchronized(L)                                               \\" + NL + "        for(L.lock();L.isLocked();                    \\" + NL + "      L.unlock() )" + NL + NL + "struct ThreadParameters" + NL + "{" + NL + "    void* runCall;" + NL + "    void* context;" + NL + "    ThreadParameters(void* ctx, void* callPtr) : context(ctx), runCall(callPtr) {}" + NL + "};" + NL;
  public static final String TEXT_63 = NL + "class Thread: public Runnable {" + NL + NL + "  public:" + NL + "    Thread(string threadName = \"\") : runnableObject(NULL), name(threadName), thrParams(this,ConvertToFunctionPointer(&Thread::run))" + NL + "      , _threadHdl(0),_isRunning(false),_isTerminated(false) {}" + NL + "    Thread(Runnable *target, string threadName = \"\") :  name(threadName),thrParams(this,ConvertToFunctionPointer(&Thread::run)) , runnableObject(target) {}" + NL + "    Thread(void* funcPtr, void* ctx = 0 ,string threadName = \"\") : runnableObject(NULL), name(threadName), thrParams(ctx,funcPtr) {}" + NL + "    Thread(void (*funcPtr)(void*), void* ctx = 0, string threadName = \"\") : runnableObject(NULL),name(threadName), thrParams(ctx,ConvertToFunctionPointer(funcPtr)) {}" + NL + "    Thread(void (*funcPtr)(), string threadName = \"\") : runnableObject(NULL),name(threadName), thrParams(this,ConvertToFunctionPointer(funcPtr)) {}" + NL + "    template<class T>" + NL + "    Thread(void (T::*RunnableCall)(), string threadName = \"\") : runnableObject(NULL), name(threadName), thrParams(this,ConvertToFunctionPointer(RunnableCall)) {}" + NL + "    template<class T>" + NL + "    Thread(void (T::*RunnableCall)(void*), void* ctx = 0, string threadName = \"\") : runnableObject(NULL), name(threadName), thrParams(ctx,ConvertToFunctionPointer(RunnableCall)) {}" + NL + "    virtual ~Thread() {" + NL + "      THREAD_TERMINATE_FUNCTION(0);" + NL + "    }" + NL + NL + "    static void sleep(long ms) throw(ThreadException) {" + NL + "      THREAD_SLEEP_FUNCTION(ms);" + NL + "    }" + NL + NL + "    THREAD_TYPE getId() const {" + NL + "      return this->_threadHdl;" + NL + "    }" + NL + NL + "    static THREAD_RETURN_TYPE threadFunctionPointer(void* ptr) {" + NL + "      ThreadParameters* threadParameters = (ThreadParameters*)ptr;" + NL + "      if(threadParameters->context != NULL) {" + NL + "        Runnable* run = (Thread*) threadParameters->context;" + NL + "        run->run();" + NL + "        //((void (*)(void*)) threadParameters->runCall)(threadParameters->context);" + NL + "      } else {" + NL + "          ((void (*)(void)) threadParameters->runCall)();" + NL + "      }" + NL + NL + "      return 0;" + NL + "    }" + NL + NL + "    bool isFinished() {" + NL + "      return !this->isRunning();" + NL + "    }" + NL + NL + "    bool isTerminated() {" + NL + "      synchronized(lock) {" + NL + "        return this->_isTerminated;" + NL + "      }" + NL + "      return 0;" + NL + "    }" + NL + NL + "    bool isRunning() {" + NL + "      synchronized(lock) {" + NL + "        if(this->_isRunning) {" + NL + "          IS_THREAD_ALIVE_FUNCTION(_threadHdl,_isRunning);" + NL + "        }" + NL + "        return this->_isRunning;" + NL + "      }" + NL + "      " + NL + "      return 0;" + NL + "    }" + NL + NL + "    virtual void run() {" + NL + "      if(this->runnableObject != NULL) {" + NL + "        runnableObject->run();" + NL + "      }" + NL + "    }" + NL + NL + "    virtual void stop() {" + NL + "      synchronized(lock) {" + NL + "        THREAD_CANCEL_FUNCTION(_threadHdl);" + NL + "        _isTerminated = true;" + NL + "        _isRunning = false;" + NL + "      }" + NL + "    }" + NL + NL + "    string getName() const {" + NL + "      return name;" + NL + "    }" + NL + NL + "    void setName(string name) {" + NL + "      this->name = name;" + NL + "    }" + NL + NL + "    virtual void start(Runnable *target) throw(ThreadException) {" + NL + "      runnableObject = target;" + NL + "      start();" + NL + "    }" + NL + "    " + NL + "    virtual void start() throw(ThreadException) {" + NL + "      synchronized(lock) {" + NL + "        reset();" + NL + "        CREATE_THREAD(_threadHdl,Thread::threadFunctionPointer, &thrParams);" + NL + "        _isRunning = true;" + NL + "      }" + NL + "    }" + NL + NL + "    void join() throw(ThreadException) {" + NL + "      THREAD_JOIN_FUNCTION(_threadHdl);" + NL + "    }" + NL + "    " + NL + "    void wait() throw(ThreadException) {" + NL + "      lock.wait();" + NL + "    }" + NL + NL + "    void wakeUp() throw(ThreadException) {" + NL + "      lock.wakeUp();" + NL + "    }" + NL + NL + "  private:" + NL + "    mutable MutexLock lock;" + NL + "    THREAD_TYPE _threadHdl;" + NL + "    string name;" + NL + NL + "    ThreadParameters thrParams;" + NL + "    Runnable* runnableObject;" + NL + NL + "    bool _isRunning;" + NL + "    bool _isTerminated;" + NL + NL + "    void reset() {" + NL + "      _threadHdl = 0;" + NL + "      _isRunning = false;" + NL + "      _isTerminated = false;" + NL + "    }" + NL + "};" + NL + NL + "template <class PT>" + NL + "class AutoPtr {" + NL + "public:" + NL + "  AutoPtr(PT* p = NULL, bool shared = false) : _ptr(NULL) { _ptr=p; if (shared && _ptr) _ptr->reference(); }" + NL + "  AutoPtr(const AutoPtr& ptr) : _ptr(NULL) { _ptr=ptr._ptr; if (_ptr) _ptr->reference(); }" + NL + "  ~AutoPtr() { if (_ptr) _ptr->release(); }" + NL + "  AutoPtr& operator = (const AutoPtr& ptr) {" + NL + "    if (&ptr != this) {" + NL + "      if (_ptr) _ptr->release();" + NL + "      _ptr = ptr._ptr;" + NL + "      if (_ptr) _ptr->reference();" + NL + "    }" + NL + "    return *this;" + NL + "  }" + NL + "  PT* operator -> () {" + NL + "    if (_ptr)" + NL + "      return _ptr;" + NL + "    else" + NL + "      throw std::exception(\"Null Pointer Exception\");" + NL + "  }" + NL + "  PT* reference() { if (_ptr) _ptr->reference(); return _ptr; }" + NL + "  PT* value() { return _ptr; }" + NL + "  operator const PT* () const { return _ptr; }" + NL + "  bool operator == (const AutoPtr& ptr) const { return _ptr == ptr._ptr; }" + NL + "  bool operator != (const AutoPtr& ptr) const { return _ptr != ptr._ptr; }" + NL + "private:" + NL + "  PT* _ptr;" + NL + "};" + NL + NL + "class ReferenceObject {" + NL + "private:" + NL + "  mutable MutexLock mutex;" + NL + "  mutable volatile int referenceNumber;" + NL + "public:" + NL + "  ReferenceObject() {" + NL + "    synchronized(mutex) {" + NL + "      referenceNumber = 1;" + NL + "    }" + NL + "  }" + NL + "  void reference() const {" + NL + "    synchronized(mutex) {" + NL + "      ++referenceNumber;" + NL + "    }" + NL + "  }" + NL + "  void release() const {" + NL + "    synchronized(mutex) {" + NL + "      --referenceNumber;" + NL + "    }" + NL + "    if (referenceNumber == 0) {" + NL + "      delete this;" + NL + "    }" + NL + "  }" + NL + "  size_t size() const {" + NL + "    int val = 0;" + NL + "    synchronized(mutex) {" + NL + "      val = referenceNumber;" + NL + "    }" + NL + "  }" + NL + "protected:" + NL + "  virtual ~ReferenceObject() {}" + NL + "};" + NL + "template <typename Object> struct RefPointer : public ReferenceObject { typedef AutoPtr<Object> Ptr; };" + NL + NL + "class AutoLock {" + NL + "public:" + NL + "  explicit AutoLock(MutexLock& mutex) : _mutex(mutex) { _mutex.lock(); }" + NL + "  ~AutoLock() { try{ _mutex.unlock(); } catch (...) {} }" + NL + "private:" + NL + "  MutexLock& _mutex;" + NL + "};" + NL + NL + "class Signal {" + NL + "public:" + NL + "  Signal(bool manualReset = true) {" + NL + "    START_EVENT_TYPE_FUNCTION(_mutex, _cond, manualReset ? FALSE : TRUE);" + NL + "  }" + NL + NL + "  ~Signal() {" + NL + "    TERMINATE_EVENT_FUNCTION(_mutex, _cond);" + NL + "  }" + NL + NL + "  void notify() {" + NL + "    if (LOCK_MUTEX_EVENT_FUNCTION(&_mutex))" + NL + "      throw ThreadException(\"cannot notify lock\");" + NL + "    if (BROADCAST_FUNCTION(&_cond))" + NL + "    {" + NL + "      UNLOCK_MUTEX_EVENT_FUNCTION(&_mutex);" + NL + "      throw ThreadException(\"cannot notify lock\");" + NL + "    }" + NL + "    if (!SET_EVENT_FUNCTION(_mutex))" + NL + "    {" + NL + "      throw ThreadException(\"cannot notify lock\");" + NL + "    }" + NL + "    UNLOCK_MUTEX_EVENT_FUNCTION(&_mutex);" + NL + "  }" + NL + NL + "  void wait() {" + NL + "    WAIT_EVENT_FUNCTION(_mutex, _cond, _state);" + NL + "  }" + NL + NL + "  bool wait(long ms, bool timeout = false) {" + NL + "    int status = false;" + NL + "    WAIT_TIME_EVENT_FUNCTION(_mutex, _cond, ms, _state, _auto, status)" + NL + "      if (timeout && !status)" + NL + "        throw ThreadException(\"Timeout Exception\");" + NL + "    return status;" + NL + "  }" + NL + NL + "  void reset()" + NL + "  {" + NL + "    if (LOCK_MUTEX_EVENT_FUNCTION(&_mutex)) {" + NL + "      throw ThreadException(\"reset signal lock\");" + NL + "    }" + NL + "    if (!RESET_EVENT_FUNCTION(_mutex)) {" + NL + "      throw ThreadException(\"reset signal lock\");" + NL + "    }" + NL + "    UNLOCK_MUTEX_EVENT_FUNCTION(&_mutex);" + NL + "  }" + NL + NL + "private:" + NL + "  EVENT_TYPE _mutex;" + NL + "  CONDITION_TYPE  _cond;" + NL + "};" + NL;
  public static final String TEXT_64 = NL + "class UID {" + NL + "public:" + NL + "  unsigned int _uid;" + NL + "  UID() { _uid = ++uid; }" + NL + "  UID(const UID& uid) { _uid = uid._uid; }" + NL + "  UID& operator=(const UID& uid)  { _uid = uid._uid; return(*this); }" + NL + "  operator int() { return _uid; }" + NL + "  bool operator == (const UID& uid) const { return _uid == uid._uid; }" + NL + "  bool operator != (const UID& uid) const { return _uid != uid._uid; }" + NL + "  bool operator == (const unsigned int& uid) const { return _uid == uid; }" + NL + "  bool operator != (const unsigned int& uid) const { return _uid != uid; }" + NL + "protected:" + NL + "  static unsigned int uid;" + NL + "};" + NL + NL + "template <class DataType>" + NL + "class DataResolver {" + NL + "public:" + NL + "  DataResolver() : _data(0) { }" + NL + "  DataType& data() {" + NL + "    return *_data;" + NL + "  }" + NL + "  void resolveData(DataType* data) {" + NL + "    delete _data;" + NL + "    _data = data;" + NL + "  }" + NL + "private:" + NL + "  DataType* _data;" + NL + "};" + NL + NL + "class ErrorResolver {" + NL + "public:" + NL + "  ErrorResolver() :_error(0) {}" + NL + "  std::string getErrorMessage() const {" + NL + "    return (_error) ? _error->what() : std::string();" + NL + "  }" + NL + "  std::exception* getError() const {" + NL + "    return _error;" + NL + "  }" + NL + "  void resolveError(const std::string& msg) {" + NL + "    delete _error;" + NL + "    _error = new std::exception(msg.c_str());" + NL + "  }" + NL + "  bool hasError() const {" + NL + "    return _error != 0;" + NL + "  }" + NL + "private:" + NL + "  std::exception*  _error;" + NL + "};" + NL + NL + "class SharedObject : public ReferenceObject {" + NL + "public:" + NL + "  SharedObject() : _signal(false) {}" + NL + "  void wait() {" + NL + "    _signal.wait();" + NL + "  }" + NL + "  bool wait(long ms, bool timeout = false) {" + NL + "    return _signal.wait(ms, timeout);" + NL + "  }" + NL + "  void notify() {" + NL + "    _signal.notify();" + NL + "  }" + NL + "private:" + NL + "  Signal       _signal;" + NL + "};" + NL + NL + "template <typename T>" + NL + "struct SharedObjectProxy" + NL + "{" + NL + "  typedef T* DataTypePtr;" + NL + "public:" + NL + "  SharedObjectProxy(DataTypePtr data) : _data(data) {}" + NL + "  SharedObjectProxy(const SharedObjectProxy& proxy) {" + NL + "    _data = proxy._data;" + NL + "    _data->reference();" + NL + "  }" + NL + "  ~SharedObjectProxy() {" + NL + "    _data->release();" + NL + "  }" + NL + "  void snooze() {" + NL + "    _data->wait(0); //for (; data->wait(10); );" + NL + "  }" + NL + "  void wait() {" + NL + "    _data->wait();" + NL + "  }" + NL + "  bool wait(long ms, bool timeout = false) {" + NL + "    return _data->wait(ms, timeout);" + NL + "  }" + NL + "  bool ready() const {" + NL + "    return _data->wait(0);" + NL + "  }" + NL + "  void notify() {" + NL + "    _data->notify();" + NL + "  }" + NL + "protected:" + NL + "  SharedObjectProxy();" + NL + "  DataTypePtr  _data;" + NL + "};" + NL + NL + "template <typename BASE, typename T = typename BASE::DataTypePtr>" + NL + "struct ErrorProxy : public BASE {" + NL + "public:" + NL + "  ErrorProxy(T data) : BASE(data) {}" + NL + "  ErrorProxy(const ErrorProxy& proxy) : BASE(proxy) {}" + NL + "  std::string getErrorMessage() const {" + NL + "    return _data->getErrorMessage();" + NL + "  }" + NL + "  std::exception* getError() const {" + NL + "    return _data->getError();" + NL + "  }" + NL + "  void resolveError(const std::string& msg) {" + NL + "    _data->resolveError(msg);" + NL + "  }" + NL + "  bool hasError() const {" + NL + "    return _data->hasError();" + NL + "  }" + NL + "};" + NL + NL + "template <typename BASE, class Type, typename T = typename BASE::DataTypePtr>" + NL + "struct DataProxy : public BASE {" + NL + "public:" + NL + "  DataProxy(T data) : BASE(data) {}" + NL + "  DataProxy(const DataProxy& proxy) : BASE(proxy) {}" + NL + "  Type& data() const {" + NL + "    return _data->data();" + NL + "  }" + NL + "  void resolveData(Type* data) {" + NL + "    _data->resolveData(data);" + NL + "  }" + NL + "};" + NL + NL + "template<typename Caller, typename ReturnType = void, VAR_TYPES_DEFAULT(ARGUMENT_UPPER_LIMIT, void)> struct MethodCallbackSignature;" + NL + "template<typename Caller, typename ReturnType, VAR_TYPES(ARGUMENT_UPPER_LIMIT)> struct MethodCallbackSignature { typedef ReturnType(Caller::*Method)(VAR_ARGS(ARGUMENT_UPPER_LIMIT)); };" + NL + "template<typename Caller, typename ReturnType> struct MethodCallbackSignature<Caller, ReturnType, VOID_ARGS(ARGUMENT_UPPER_LIMIT)> { typedef ReturnType(Caller::*Method)(); };" + NL + "template<typename Caller, VAR_TYPES(ARGUMENT_UPPER_LIMIT)> struct MethodCallbackSignature<Caller, void, VAR_ARGS(ARGUMENT_UPPER_LIMIT)> { typedef void (Caller::*Method)(VAR_ARGS(ARGUMENT_UPPER_LIMIT)); };" + NL + "template<typename Caller> struct MethodCallbackSignature<Caller, void, VOID_ARGS(ARGUMENT_UPPER_LIMIT)> { typedef void (Caller::*Method)(); };" + NL + NL + "GENERATE_METHOD_CALLBACK_SIGNATURES(ARGUMENT_UPPER_LIMIT)" + NL;
  public static final String TEXT_65 = NL + "template <class BASE, class Caller, class FutureType, class ReturnType>" + NL + "class BaseMethodCallbackInvoke : public BASE {" + NL + "public:" + NL + "  BaseMethodCallbackInvoke(Caller* caller, const FutureType& result) :" + NL + "    _result(result), _context(caller) {}" + NL + "  ~BaseMethodCallbackInvoke() { this->release(); }" + NL + "  void run(){" + NL + "    try {" + NL + "      invokeMethod();" + NL + "    }" + NL + "    catch (std::exception& e) {" + NL + "      _result.resolveError(e.what());" + NL + "    }" + NL + "    catch (...) {" + NL + "      _result.resolveError(\"Invoke Error\");" + NL + "    }" + NL + "    _result.notify();" + NL + "  }" + NL + "  void resolveError(const std::string& msg) {" + NL + "    _result.resolveError(msg);" + NL + "  }" + NL + "protected:" + NL + "  virtual void invokeMethod() = 0;" + NL + "  Caller* _context;" + NL + "  FutureType _result;" + NL + "};" + NL + NL + "template<class BASE, class Caller, class FutureType, class ReturnType, VAR_TYPES_DEFAULT(ARGUMENT_UPPER_LIMIT, void)> class MethodCallbackInvoke;" + NL + NL + "template <class BASE, class Caller, class FutureType, class ReturnType = void, VAR_TYPES(ARGUMENT_UPPER_LIMIT)>" + NL + "class MethodCallbackInvoke : public BaseMethodCallbackInvoke<BASE, Caller, FutureType, ReturnType> {" + NL + "public:" + NL + "  typedef typename MethodCallbackSignature<Caller, ReturnType, VAR_ARGS(ARGUMENT_UPPER_LIMIT)>::Method Callback;" + NL + "  MethodCallbackInvoke(Caller* caller, Callback method, VAR_ARGS_MEMBERS(ARGUMENT_UPPER_LIMIT, arg, COMMA), const FutureType& result) :" + NL + "    BaseMethodCallbackInvoke(caller, result), _method(method), INIT_VAR_ARGS_MEMBERS(ARGUMENT_UPPER_LIMIT, arg) {}" + NL + "protected:" + NL + "  VAR_ARGS_MEMBERS(ARGUMENT_UPPER_LIMIT, _arg, SEMICOLON);" + NL + "  Callback    _method;" + NL + "};" + NL + NL + "GENERATE_METHOD_CALLBACK_INVOKE(ARGUMENT_UPPER_LIMIT)" + NL + NL + "template <class BASE, class Caller, class FutureType, class ReturnType>" + NL + "class MethodCallbackInvoke<BASE, Caller, FutureType, ReturnType> : public BaseMethodCallbackInvoke<BASE, Caller, FutureType, ReturnType>{" + NL + "public:" + NL + "  typedef typename MethodCallbackSignature<Caller, ReturnType>::Method Callback;" + NL + "  MethodCallbackInvoke(Caller* caller, Callback method, const FutureType& result) :" + NL + "    BaseMethodCallbackInvoke(caller, result), _method(method) {}" + NL + "protected:" + NL + "  Callback    _method;" + NL + "};" + NL + NL + "template<class BASE, class Caller, class FutureType, class ReturnType = void, VAR_TYPES_DEFAULT(ARGUMENT_UPPER_LIMIT, void)> class DelegateInvoke;" + NL + NL + "template <class BASE, class Caller, class FutureType, class ReturnType, VAR_TYPES(ARGUMENT_UPPER_LIMIT)>" + NL + "class DelegateInvoke : public MethodCallbackInvoke<BASE, Caller, FutureType, ReturnType, VAR_ARGS(ARGUMENT_UPPER_LIMIT)> {" + NL + "public:" + NL + "  DelegateInvoke(Caller* caller, Callback method, VAR_ARGS_MEMBERS(ARGUMENT_UPPER_LIMIT, arg, COMMA), const FutureType& result)" + NL + "    : MethodCallbackInvoke(caller, method, VAR_NAMED_ARGS(N, arg), result) {}" + NL + "  void invokeMethod() {" + NL + "    _result.resolveData(new ReturnType((_context->*_method)(VAR_ARGS(ARGUMENT_UPPER_LIMIT))));" + NL + "  }" + NL + "};" + NL + NL + "template <class BASE, class Caller, class FutureType, VAR_TYPES(ARGUMENT_UPPER_LIMIT)>" + NL + "class DelegateInvoke<BASE, Caller, FutureType, void, VAR_ARGS(ARGUMENT_UPPER_LIMIT)> : public MethodCallbackInvoke<BASE, Caller, FutureType, void, VAR_ARGS(ARGUMENT_UPPER_LIMIT)>{" + NL + "public:" + NL + "  DelegateInvoke(Caller* caller, Callback method, VAR_ARGS_MEMBERS(ARGUMENT_UPPER_LIMIT, arg, COMMA), const FutureType& result)" + NL + "    : MethodCallbackInvoke(caller, method, VAR_NAMED_ARGS(N, arg), result) {}" + NL + "  void invokeMethod() {" + NL + "    (_context->*_method)(VAR_ARGS(ARGUMENT_UPPER_LIMIT));" + NL + "  }" + NL + "};" + NL + NL + "GENERATE_DELEGATE_INVOKE(ARGUMENT_UPPER_LIMIT)" + NL + NL + "template <class BASE, class Caller, class FutureType, class ReturnType>" + NL + "class DelegateInvoke<BASE, Caller, FutureType, ReturnType> : public MethodCallbackInvoke<BASE, Caller, FutureType, ReturnType, void>{" + NL + "public:" + NL + "  DelegateInvoke(Caller* caller, Callback method, const FutureType& result) : MethodCallbackInvoke(caller, method, result) {}" + NL + "  void invokeMethod() {" + NL + "    _result.resolveData(new ReturnType((_context->*_method)()));" + NL + "  }" + NL + "};" + NL + NL + "template <class BASE, class Caller, class FutureType>" + NL + "class DelegateInvoke<BASE, Caller, FutureType> : public MethodCallbackInvoke<BASE, Caller, FutureType, void, void>{" + NL + "public:" + NL + "  DelegateInvoke(Caller* caller, Callback method, const FutureType& result) : MethodCallbackInvoke(caller, method, result) {}" + NL + "  void invokeMethod() {" + NL + "    (_context->*_method)();" + NL + "  }" + NL + "};" + NL + NL + "class DelegateBase : public Runnable, public RefPointer<DelegateBase> {" + NL + "public:" + NL + "  virtual void resolveError(const std::string& msg) = 0;" + NL + "};" + NL + NL + "template <class FutureType> class FutureObject : public SharedObject, public DataResolver<FutureType>, public ErrorResolver {};" + NL + "template <> class FutureObject<void> : public SharedObject, public ErrorResolver{};" + NL + "template <class FutureType> class FutureResult : public DataProxy< ErrorProxy< SharedObjectProxy<FutureObject<FutureType>>>, FutureType>{" + NL + "public: FutureResult(SharedObjectProxy::DataTypePtr ptr) :DataProxy(ptr){}" + NL + "};" + NL + "template <> class FutureResult<void> : public ErrorProxy< SharedObjectProxy<FutureObject<void>>>{" + NL + "public:  FutureResult(SharedObjectProxy::DataTypePtr ptr) :ErrorProxy(ptr){}" + NL + "};" + NL + NL + "template<class Caller, class ReturnType = void, VAR_TYPES_DEFAULT(ARGUMENT_UPPER_LIMIT, void)> class Delegate;" + NL + "template <class Caller, class ReturnType, VAR_TYPES(ARGUMENT_UPPER_LIMIT)> class Delegate : public DelegateInvoke < DelegateBase, Caller, FutureResult<ReturnType>, ReturnType, VAR_ARGS(ARGUMENT_UPPER_LIMIT) > {" + NL + "public:  Delegate(Caller* caller, Callback method, VAR_ARGS_MEMBERS(ARGUMENT_UPPER_LIMIT, arg, COMMA), const FutureResult<ReturnType>& result) : DelegateInvoke(caller, method, VAR_NAMED_ARGS(N, arg), result) {}" + NL + "};" + NL + "template <class Caller, VAR_TYPES(ARGUMENT_UPPER_LIMIT)> class Delegate<Caller, void, VAR_TYPES(ARGUMENT_UPPER_LIMIT)> : public DelegateInvoke < DelegateBase, Caller, FutureResult<void>, void, VAR_ARGS(ARGUMENT_UPPER_LIMIT) >{" + NL + "public:  Delegate(Caller* caller, Callback method, VAR_ARGS_MEMBERS(ARGUMENT_UPPER_LIMIT, arg, COMMA), const FutureResult<void>& result) : DelegateInvoke(caller, method, VAR_NAMED_ARGS(N, arg), result) {}" + NL + "};" + NL + "template <class Caller, class ReturnType> class Delegate<Caller, ReturnType, void> : public DelegateInvoke< DelegateBase, Caller, FutureResult<ReturnType>, ReturnType, void >{" + NL + "public:  Delegate(Caller* caller, Callback method, const FutureResult<ReturnType>& result) : DelegateInvoke(caller, method, result) {}" + NL + "};" + NL + "template <class Caller> class Delegate<Caller, void, void> : public DelegateInvoke< DelegateBase, Caller, FutureResult<void>, void, void >{" + NL + "public:  Delegate(Caller* caller, Callback method, const FutureResult<void>& result) : DelegateInvoke(caller, method, result) {}" + NL + "};" + NL + NL + "GENERATE_DELEGATE(ARGUMENT_UPPER_LIMIT)" + NL + NL + "template <class Caller>" + NL + "struct Request : public RefPointer<Request<Caller>> {" + NL + "public:" + NL + "  typedef std::deque<Ptr> RequestsQueue;" + NL + "  typedef typename MethodCallbackSignature<Caller, bool, int>::Method RequestGuard;" + NL + "  Request(int priority = 0, long delay = 0, long timeout = 0, Caller* caller = 0, RequestGuard guard = 0, int guardId = 0, int conditionId = 0) : _priority(priority), _delay(delay), _timeout(timeout), _context(caller), _guard(guard), _guardId(guardId), _conditionId(conditionId) {}" + NL + "  int getPriority() const { return _priority; }" + NL + "  int getDelay() const { return _delay; }" + NL + "  int getTimeout() const { return _timeout; }" + NL + "  bool filtered() {" + NL + "    if (_guard){" + NL + "      return !((_context->*_guard)(_guardId));" + NL + "    }" + NL + "    return false;" + NL + "  }" + NL + "  bool deferred() {" + NL + "    if (_guard){" + NL + "      return !((_context->*_guard)(_conditionId));" + NL + "    }" + NL + "    return false;" + NL + "  }" + NL + "private:" + NL + "  Caller*    _context;" + NL + "  RequestGuard _guard;" + NL + "  int _guardId;" + NL + "  int _conditionId;" + NL + "  int _priority;" + NL + "  long _delay;" + NL + "  long _timeout;" + NL + "};" + NL + NL + "template <class Caller>" + NL + "struct MethodAccessRequest {" + NL + "  typename Request<Caller>::Ptr request;" + NL + "  Signal ready;" + NL + "  typedef std::deque<MethodAccessRequest<Caller>*> MethodAccessRequestQueue;" + NL + "};" + NL + NL + "template <class Caller> struct MethodInvokeRequest : public Request<Caller> {" + NL + "public:" + NL + "  MethodInvokeRequest(DelegateBase::Ptr requestRunnable, int priority = 0, long delay = 0, long timeout = 0, Caller* caller = 0, RequestGuard guard = 0, int guardId = 0, int conditionId = 0)" + NL + "    : _requestRunnable(requestRunnable), Request(priority, delay, timeout, caller, guard, guardId, conditionId){}" + NL + "  DelegateBase::Ptr getRequest() const { return _requestRunnable; }" + NL + "private:" + NL + "  DelegateBase::Ptr _requestRunnable;" + NL + "};" + NL;
  public static final String TEXT_66 = NL + "template <class Caller>" + NL + "class ScheduleQueue : protected Runnable {" + NL + "public:" + NL + "  ScheduleQueue() : deferringRunning(false)  {}" + NL + "  ~ScheduleQueue() { try { clear(); } catch (...) {} }" + NL + "  void request(typename Request<Caller>::Ptr request, bool urgent = false) {" + NL + "    synchronized(_lock) {" + NL + "      deferringRunning = false;" + NL + "      if (request->deferred()) {" + NL + "        _deferred.push_back(request);" + NL + "      }" + NL + "      else {" + NL + "        addRequest(request, urgent);" + NL + "      }" + NL + "    }" + NL + "  }" + NL + NL + "  typename Request<Caller>* processPendingRequests(){" + NL + "    //::Sleep(1);    // DEBUG" + NL + "    Request<Caller>::Ptr request = NULL;" + NL + "      MethodAccessRequest<Caller>* mq = NULL;" + NL + "      processDeferred();" + NL + "      synchronized(_lock){" + NL + "      // ::Sleep(1);  // DEBUG" + NL + "        request = getNextRequest();" + NL + "      " + NL + "      }" + NL + "      if (request.value() != NULL) {" + NL + "        return request.reference();" + NL + "      }" + NL + "      else if (_pending.empty() && !_deferred.empty() && !deferringRunning) {" + NL + "        _thread.start(this);" + NL + "        deferringRunning = true;" + NL + "      }" + NL + "      mq = new MethodAccessRequest<Caller>();" + NL + "      _pending.push_back(mq);" + NL + "      mq->ready.wait();" + NL + "      request = mq->request;" + NL + "      delete mq;" + NL + "      return request.reference();" + NL + "  }" + NL + "  void done() {" + NL + "    synchronized(_lock) {" + NL + "      for (MethodAccessRequest<Caller>::MethodAccessRequestQueue::iterator it = _pending.begin(); it != _pending.end(); ++it) {" + NL + "        (*it)->ready.notify();" + NL + "      }" + NL + "      _pending.clear();" + NL + "    }" + NL + "  }" + NL + "  bool empty() const {" + NL + "    synchronized(_lock) {" + NL + "      return _requests.empty() && _deferred.empty();" + NL + "    }" + NL + "  }" + NL + "  int size() const {" + NL + "    synchronized(_lock) {" + NL + "      return static_cast<int>(_requests.size() + _deferred.size());" + NL + "    }" + NL + "  }" + NL + "  void clear() {" + NL + "    synchronized(_lock) {" + NL + "      _requests.clear();" + NL + "      _deferred.clear();" + NL + "    }" + NL + "    _thread.join();" + NL + "  }" + NL + "protected:" + NL + "  void run() {" + NL + "    while (deferringRunning) { try { processDeferred(); } catch (...) {} }" + NL + "  }" + NL + NL + "private:" + NL + "  void addRequest(typename Request<Caller>::Ptr request, bool urgent = false) {" + NL + "    if (_pending.empty()) {" + NL + "      if (urgent) {" + NL + "        _requests.push_front(request);" + NL + "      }" + NL + "      else if (request.value() &&  request->getPriority() <= 0) {" + NL + "        _requests.push_back(request);" + NL + "      }" + NL + "      else {" + NL + "        typename Request<Caller>::RequestsQueue::iterator it;" + NL + "        for (it = _requests.begin(); it != _requests.end(); ++it) {" + NL + "          if (request->getPriority() > (*it)->getPriority())" + NL + "            break;" + NL + "        }" + NL + "        _requests.insert(it, request);" + NL + "      }" + NL + "    }" + NL + "    else {" + NL + "      MethodAccessRequest<Caller>* mq = _pending.front();" + NL + "      _pending.pop_front();" + NL + "      mq->request = request;" + NL + "      mq->ready.notify();" + NL + "    }" + NL + "  }" + NL + "  void processDeferred() {" + NL + "    if (!_deferred.empty()) {" + NL + "      Request<Caller>::Ptr deferred = _deferred.front();" + NL + "        if (deferred.value() && !deferred->deferred()) {" + NL + "        _deferred.pop_front();" + NL + "        addRequest(deferred);" + NL + "      }" + NL + "    }" + NL + "    else {" + NL + "      deferringRunning = false;" + NL + "      return;" + NL + "    }" + NL + "  }" + NL + "  typename Request<Caller>::Ptr getNextRequest() {" + NL + "    Request<Caller>::Ptr request;" + NL + "    if (!_requests.empty()) {" + NL + "      request = _requests.front();" + NL + "      _requests.pop_front();" + NL + "    }" + NL + "    return request;" + NL + "  }" + NL + "private:" + NL + "  mutable MutexLock  _lock;" + NL + "  Thread        _thread;" + NL + "  bool        deferringRunning;" + NL + "  typename Request<Caller>::RequestsQueue  _requests;" + NL + "  typename Request<Caller>::RequestsQueue  _deferred;" + NL + "  typename MethodAccessRequest<Caller>::MethodAccessRequestQueue  _pending;" + NL + "};" + NL + NL + "class TimedEvent : protected Runnable {" + NL + "public:" + NL + "  TimedEvent() { }" + NL + "  virtual ~TimedEvent() { }" + NL + "  void timeout(DelegateBase::Ptr  method, long ms) {" + NL + "    _method = method;" + NL + "    _thread.start(this);" + NL + "    try{" + NL + "      _timeoutEvent.wait(ms, true);" + NL + "    }" + NL + "    catch (...) {" + NL + "      _thread.stop();" + NL + "      _method->resolveError(\"Timeout Exception\");" + NL + "      _method = NULL;" + NL + "      _timeoutEvent.notify();" + NL + "    }" + NL + "  }" + NL + "protected:" + NL + "  void run() {" + NL + "    _method->reference();" + NL + "    _method->run();" + NL + "    _timeoutEvent.notify();" + NL + "  }" + NL + "private:" + NL + "  Thread        _thread;" + NL + "  DelegateBase::Ptr  _method;" + NL + "  Signal        _timeoutEvent;" + NL + "};" + NL + NL + "template <class Caller>" + NL + "class Scheduler : protected Runnable {" + NL + "public:" + NL + "  typedef typename Request<Caller>::RequestGuard GuardList;" + NL + "  Scheduler(Caller* caller = 0, GuardList guardList = 0) : _context(caller), _guardList(guardList) {" + NL + "    _run = true;" + NL + "    _thread.start(this);" + NL + "  }" + NL + "  virtual ~Scheduler() { try { stop(); } catch (...) {} }" + NL + "  void schedule(DelegateBase::Ptr pDelegate, int priority, long delay, long timeout, UID guard, UID condition) {" + NL + "    _queue.request(new MethodInvokeRequest<Caller>(pDelegate, priority, delay, timeout, _context, _guardList, guard, condition));" + NL + "  }" + NL + "  void cancel() {" + NL + "    _queue.clear();" + NL + "  }" + NL + "protected:" + NL + "  void run() {" + NL + "      AutoPtr<Request<Caller>> pendingRequest = _queue.processPendingRequests();" + NL + "      while (pendingRequest) {" + NL + "          MethodInvokeRequest<Caller>* mth = dynamic_cast<MethodInvokeRequest<Caller>*>(pendingRequest.value());" + NL + "        if (mth != NULL && !mth->filtered()) {" + NL + "            long delay = mth->getDelay();" + NL + "            if (delay > 0) {" + NL + "                Thread::sleep(delay);" + NL + "            }" + NL + "            if (mth->getTimeout() > 0) {" + NL + "                _timeEvent.timeout(mth->getRequest(), mth->getTimeout());" + NL + "            }" + NL + "            else {" + NL + "                DelegateBase::Ptr pDelegate = mth->getRequest();" + NL + "            if (pDelegate.value()) {" + NL + "              pDelegate->reference();" + NL + "              pDelegate->run();" + NL + "              pDelegate = NULL;" + NL + "          }" + NL + "          }" + NL + "        }" + NL + "        pendingRequest = NULL;" + NL + "        if (_run)" + NL + "          pendingRequest = _queue.processPendingRequests();" + NL + "      }" + NL + "    }" + NL + "  void stop() {" + NL + "    _queue.clear();" + NL + "    _queue.done();" + NL + "    _run = false;" + NL + "    _thread.join();" + NL + "  }" + NL + "private:" + NL + "  Caller*          _context;" + NL + "  Thread          _thread;" + NL + "  ScheduleQueue<Caller>  _queue;" + NL + "  GuardList        _guardList;" + NL + "  bool          _run;" + NL + "  TimedEvent        _timeEvent;" + NL + "};" + NL;
  public static final String TEXT_67 = NL + "struct ActiveConstraintUID {" + NL + "public:" + NL + "  UID getGuardUID() { return _guardId; }" + NL + "  UID getConditionUID() { return _conditionId; }" + NL + "protected:" + NL + "  UID _guardId;" + NL + "  UID _conditionId;" + NL + "};" + NL + NL + "template<class ReturnType, VAR_TYPES_DEFAULT(ARGUMENT_UPPER_LIMIT, void)> class IDelegatePublisher;" + NL + "template<class ReturnType, VAR_TYPES(ARGUMENT_UPPER_LIMIT)>" + NL + "class IDelegatePublisher {" + NL + "public:" + NL + "  virtual FutureResult<ReturnType> publish(VAR_ARGS_MEMBERS(ARGUMENT_UPPER_LIMIT, arg, COMMA), int priority = 0, long delay = 0, long timeout = 0) = 0;" + NL + "};" + NL + "template<class ReturnType>" + NL + "class IDelegatePublisher<ReturnType> {" + NL + "public:" + NL + "  virtual FutureResult<ReturnType> publish(int priority = 0, long delay = 0, long timeout = 0) = 0;" + NL + "};" + NL + NL + "template<class ReturnType, VAR_TYPES_DEFAULT(ARGUMENT_UPPER_LIMIT, void)> class MulticastDelegate;" + NL + "template <class ReturnType, VAR_TYPES(ARGUMENT_UPPER_LIMIT)>" + NL + "class MulticastDelegate : public IDelegatePublisher<ReturnType, VAR_ARGS(ARGUMENT_UPPER_LIMIT)> {" + NL + "private:" + NL + "  typedef std::vector< IDelegatePublisher<ReturnType, VAR_TYPES(ARGUMENT_UPPER_LIMIT)> * > SubscribersList;" + NL + "  SubscribersList subscribers;" + NL + "public:" + NL + "  MulticastDelegate() {}" + NL + "  MulticastDelegate& operator += (const IDelegatePublisher<ReturnType, VAR_TYPES(ARGUMENT_UPPER_LIMIT)>* method) {" + NL + "    subscribers.push_back(method);" + NL + "    return *this;" + NL + "  }" + NL + "  void notify(VAR_ARGS_MEMBERS(ARGUMENT_UPPER_LIMIT, arg, COMMA), int priority = 0, long delay = 0, long timeout = 0) {" + NL + "    typename SubscribersList::iterator it = subscribers.begin();" + NL + "    for (; it != subscribers.end(); it++) { it->publish(VAR_NAMED_ARGS(ARGUMENT_UPPER_LIMIT, arg), priority, delay, timeout); }" + NL + "  }" + NL + "  FutureResult<ReturnType> operator () (VAR_ARGS_MEMBERS(ARGUMENT_UPPER_LIMIT, arg, COMMA), int priority = 0, long delay = 0, long timeout = 0) {" + NL + "  FutureResult<ReturnType> result = publish(VAR_NAMED_ARGS(ARGUMENT_UPPER_LIMIT, arg), priority, delay, timeout);" + NL + "    notify(VAR_NAMED_ARGS(ARGUMENT_UPPER_LIMIT, arg), priority, delay, timeout);" + NL + "    return result;" + NL + "  }" + NL + "};" + NL + "template <class ReturnType>" + NL + "class MulticastDelegate<ReturnType> : public IDelegatePublisher<ReturnType>{" + NL + "private:" + NL + "  typedef std::vector< IDelegatePublisher<ReturnType> * > SubscribersList;" + NL + "  SubscribersList subscribers;" + NL + "public:" + NL + "  MulticastDelegate() {}" + NL + "  MulticastDelegate& operator += (const IDelegatePublisher<ReturnType>* method) {" + NL + "  subscribers.push_back(method);" + NL + "    return *this;" + NL + "  }" + NL + "  void notify(int priority = 0, long delay = 0, long timeout = 0) {" + NL + "    typename SubscribersList::iterator it = subscribers.begin();" + NL + "    for (; it != subscribers.end(); it++) { (*it)->publish(priority, delay, timeout); }" + NL + "  }" + NL + "  FutureResult<ReturnType> operator () (int priority = 0, long delay = 0, long timeout = 0) {" + NL + "    FutureResult<ReturnType> result = publish(priority, delay, timeout);" + NL + "    notify(priority, delay, timeout);" + NL + "    return result;" + NL + "  }" + NL + "};" + NL;
  public static final String TEXT_68 = NL + "GENERATE_MULTICAST_METHOD(ARGUMENT_UPPER_LIMIT)" + NL + NL + "template<class Caller, class ReturnType, VAR_TYPES_DEFAULT(ARGUMENT_UPPER_LIMIT, void)> class Active;" + NL + "template <class Caller, class ReturnType, VAR_TYPES(ARGUMENT_UPPER_LIMIT)>" + NL + "class Active : public ActiveConstraintUID, public MulticastDelegate<ReturnType, VAR_ARGS(ARGUMENT_UPPER_LIMIT)>{" + NL + "public:" + NL + "  typedef Delegate<Caller, ReturnType, VAR_ARGS(ARGUMENT_UPPER_LIMIT)> DelegateType;" + NL + "  typedef typename MethodCallbackSignature<Caller, ReturnType, VAR_ARGS(ARGUMENT_UPPER_LIMIT)>::Method Callback;" + NL + "  Active(Caller* caller, Scheduler<Caller>* sch, Callback method) :_context(caller), _sch(sch), _method(method) {}" + NL + "  FutureResult<ReturnType> operator () (VAR_ARGS_MEMBERS(ARGUMENT_UPPER_LIMIT, arg, COMMA), int priority = 0, long delay = 0, long timeout = 0) {" + NL + "    FutureResult<ReturnType> result = publish(priority, delay, timeout);" + NL + "    return result;" + NL + "  }" + NL + "  FutureResult<ReturnType> publish(VAR_ARGS_MEMBERS(ARGUMENT_UPPER_LIMIT, arg, COMMA), int priority = 0, long delay = 0, long timeout = 0) {" + NL + "    FutureResult<ReturnType> result(new FutureObject<ReturnType>());" + NL + "    DelegateBase::Ptr pDelegate(new DelegateType(_context, _method, VAR_NAMED_ARGS(ARGUMENT_UPPER_LIMIT, arg), result));" + NL + "    _sch->schedule(pDelegate, priority, delay, timeout, _guardId, _conditionId);" + NL + "  this->notify(VAR_NAMED_ARGS(ARGUMENT_UPPER_LIMIT, arg), priority, delay, timeout);" + NL + "    return result;" + NL + "  }" + NL + "private:" + NL + "  Caller* _context;" + NL + "  Scheduler<Caller>* _sch;" + NL + "  Callback   _method;" + NL + "};" + NL + NL + "template <class Caller, class ReturnType>" + NL + "class Active <Caller, ReturnType, void> : public ActiveConstraintUID, public MulticastDelegate<ReturnType> {" + NL + "public:" + NL + "  typedef Delegate<Caller, ReturnType, void> DelegateType;" + NL + "  typedef typename MethodCallbackSignature<Caller, ReturnType>::Method Callback;" + NL + "  Active(Caller* caller, Scheduler<Caller>* sch, Callback method) :_context(caller), _sch(sch), _method(method) {}" + NL + "  FutureResult<ReturnType> publish(int priority = 0, long delay = 0, long timeout = 0) {" + NL + "    FutureResult<ReturnType>  result(new FutureObject<ReturnType>());" + NL + "    DelegateBase::Ptr pDelegate(new DelegateType(_context, _method, result));" + NL + "    _sch->schedule(pDelegate, priority, delay, timeout, _guardId, _conditionId);" + NL + "    this->notify(priority, delay, timeout);" + NL + "    return result;" + NL + "  }" + NL + "private:" + NL + "  Caller* _context;" + NL + "  Scheduler<Caller>* _sch;" + NL + "  Callback   _method;" + NL + "};" + NL + "GENERATE_ACTIVE_METHOD(ARGUMENT_UPPER_LIMIT)" + NL + NL + "template <class Caller>" + NL + "class AsyncMethod : protected Runnable, public ActiveConstraintUID {" + NL + "public:" + NL + "  typedef Delegate<Caller, void, void> DelegateType;" + NL + "  typedef Active<Caller, void> ActiveType;" + NL + "  typedef typename MethodCallbackSignature<Caller>::Method Callback;" + NL + "  AsyncMethod(Caller* caller, Callback method, long interval = 0, long delay = 0, long timeout = 0) :_context(caller), _delegate(new DelegateType(_context, method, new FutureObject<void>())), _delay(delay), _timeout(timeout), _interval(interval), _active(false){}" + NL + "  AsyncMethod(Caller* caller, Scheduler<Caller>* sch, Callback method, long interval = 0, long delay = 0, long timeout = 0) :_context(caller), _delegate(new DelegateType(_context, method, new FutureObject<void>())), _delay(delay), _timeout(timeout), _interval(interval), _sch(sch), _active(true) {}" + NL + "  virtual ~AsyncMethod() { try { stop();  _thread.join(); } catch (...) {} }" + NL + "  void start() {" + NL + "    _run = true;" + NL + "    _thread.start(this);" + NL + "  }" + NL + "  void stop() {" + NL + "    _run = false;" + NL + "  }" + NL + "protected:" + NL + "  void run() {" + NL + "    while (_run) {" + NL + "      if (!_active && _delay > 0) {" + NL + "        Thread::sleep(_delay);" + NL + "      }" + NL + "      if (_interval > 0) {" + NL + "        if (_active) {" + NL + "          _sch->schedule(_delegate, -1, _delay, _timeout, _guardId, _conditionId);" + NL + "        }" + NL + "        else {" + NL + "          _delegate->run();" + NL + "          if (_timeout > 0)" + NL + "            _timeoutEvent.wait(_timeout, true);" + NL + "        }" + NL + "        Thread::sleep(_interval);" + NL + "      }" + NL + "    }" + NL + "  }" + NL + "private:" + NL + "  bool        _run;" + NL + "  long        _interval;" + NL + "  long        _delay;" + NL + "  long        _timeout;" + NL + "  bool        _active;" + NL + "  Thread        _thread;" + NL + "  Caller*        _context;" + NL + "  DelegateBase::Ptr  _delegate;" + NL + "  Scheduler<Caller>*  _sch;" + NL + "  Signal        _timeoutEvent;" + NL + "};";
  public static final String TEXT_69 = NL + "#ifdef WINDOWS_OS" + NL + "typedef int socklen_t;" + NL + "#pragma comment(lib, \"ws2_32.lib\")" + NL + "struct WindowsSocket {" + NL + "  WindowsSocket() {" + NL + "    WSADATA init;" + NL + "    if (WSAStartup(MAKEWORD(2, 2), &init) != 0) {" + NL + "      throw Exception(\"WSAStartup Init Error\");" + NL + "    }" + NL + "  }" + NL + "  ~WindowsSocket() {" + NL + "    if (WSACleanup() != 0) {" + NL + "      std::cerr << \"WSACleanup Error\" << std::endl;" + NL + "    }" + NL + "  }" + NL + "};" + NL + "extern struct WindowsSocket windowsSocketInit;" + NL + "#endif" + NL;
  public static final String TEXT_70 = NL + "class Endpoint {" + NL + "public:" + NL + "  Endpoint() {}" + NL + "  Endpoint(string host, string port) : host(host), port(atoi(port.c_str())) {}" + NL + "  Endpoint(string host, int port) : host(host), port(port) {}" + NL + "  ~Endpoint() {}" + NL + "  std::string getHost(){ return host; }" + NL + "  int getPort() { return port; }" + NL + "private:" + NL + "  std::string host;" + NL + "  int port;" + NL + "};" + NL + NL;
  public static final String TEXT_71 = NL + "class JSON;" + NL + "struct JSONParser {" + NL + " virtual JSON Parse(const string &json) = 0;" + NL + "};" + NL + "enum JSONType { JSON_Undefined, JSON_String, JSON_Bool, JSON_Number, JSON_Array, JSON_Object };" + NL + "class JSON {" + NL + "private:" + NL + "  static JSONParser *_parser;" + NL + "public:" + NL + "  JSON(JSONType type = JSON_Undefined) {" + NL + "    setType(type);" + NL + "  }" + NL + NL;
  public static final String TEXT_72 = NL + "  JSON(const char *m_char_value) {" + NL + "    _type = JSON_String;" + NL + "    _string = new string(m_char_value);" + NL + "  }" + NL + "  JSON(const std::string &m_string_value) {" + NL + "    _type = JSON_String;" + NL + "    _string = new string(m_string_value.c_str());" + NL + "  }" + NL + "  JSON(bool m_bool_value) {" + NL + "    _type = JSON_Bool;" + NL + "    _boolean = m_bool_value;" + NL + "  }  " + NL + "  JSON(float m_number_value) {" + NL + "    _type = JSON_Number;" + NL + "    _number = m_number_value;" + NL + "  }" + NL + "  JSON(double m_number_value) {" + NL + "    _type = JSON_Number;" + NL + "    _number = m_number_value;" + NL + "  }" + NL + "  JSON(long m_number_value) {" + NL + "    _type = JSON_Number;" + NL + "    _number = m_number_value;" + NL + "  }" + NL + "  JSON(int m_integer_value) {" + NL + "    _type = JSON_Number;" + NL + "    _number = (double)m_integer_value;" + NL + "  }" + NL + "  JSON(unsigned int m_integer_value) {" + NL + "    _type = JSON_Number;" + NL + "    _number = (unsigned int)m_integer_value;" + NL + "  }" + NL + "  JSON(Endpoint m_ep) {" + NL + "    (*this)[\"host\"] = m_ep.getHost();" + NL + "    (*this)[\"port\"] = m_ep.getPort();" + NL + "  }" + NL + "  JSON(const JSON &src) {" + NL + "    swap(src);    " + NL + "  }" + NL + "  ~JSON() {" + NL + "    if (_type == JSON_Array) {" + NL + "      vector<JSON*>::iterator iter;" + NL + "      for (iter = _array->begin(); iter != _array->end(); iter++)" + NL + "        delete *iter;" + NL + "      delete _array;" + NL + "    } else if (_type == JSON_Object) {" + NL + "      map<string, JSON*>::iterator iter;" + NL + "      for (iter = _object->begin(); iter != _object->end(); iter++)" + NL + "        delete (*iter).second;" + NL + "      delete _object;" + NL + "    }" + NL + "    else if (_type == JSON_String) { delete _string; }" + NL + "  }" + NL + NL + "  static JSON Parse(const string &json) {" + NL + "    return _parser->Parse(json);" + NL + "  }" + NL + "  bool IsUndefined() const { return _type == JSON_Undefined; }" + NL + "  bool IsString() const { return _type == JSON_String; }" + NL + "  bool IsBoolean() const { return _type == JSON_Bool; }" + NL + "  bool IsNumber() const { return _type == JSON_Number; }" + NL + "  bool IsArray() const { return _type == JSON_Array; }" + NL + "  bool IsObject() const { return _type == JSON_Object; }" + NL + "  operator string() const { return (*_string); }" + NL + "  operator bool() { return _boolean; }" + NL + "  operator double() { return _number; }" + NL + "  operator float() { return _number; }" + NL + "  operator int() { return _number; }" + NL + "  operator long() { return _number; }" + NL + "  operator unsigned() { return _number; }" + NL + "  " + NL + "  #ifdef _WIN64" + NL + "    JSON(size_t m_size_t) {" + NL + "      _type = JSONType::JSON_Number;" + NL + "      _number = m_size_t;" + NL + "    }" + NL + "    operator size_t() { return _number; }" + NL + "  #endif" + NL + "  " + NL + "  operator Endpoint() { " + NL + "    string host = (*this)[\"host\"];int port = (*this)[\"port\"];" + NL + "    Endpoint p(host, port);" + NL + "    return p; " + NL + "  }" + NL + "  operator const JSON&() const { return *this; }" + NL + NL + "  void push(JSON* item) {" + NL + "    setType(JSON_Array);" + NL + "    _array->push_back(item);" + NL + "  }" + NL + "  size_t length() const {" + NL + "    switch (_type) {" + NL + "      case JSON_Array:" + NL + "        return _array->size();" + NL + "      case JSON_Object:" + NL + "        return _object->size();" + NL + "      default:" + NL + "        return 0;" + NL + "    }" + NL + "  }" + NL + NL + "  bool hasIndex(std::size_t index) const {" + NL + "    if (_type == JSON_Array) {" + NL + "      return index < _array->size();" + NL + "    }" + NL + "    else {" + NL + "      return false;" + NL + "    }" + NL + "  }" + NL + "  JSON *at(std::size_t index) {" + NL + "    if (index < _array->size()) {" + NL + "      return (*_array)[index];" + NL + "    } else {" + NL + "      return NULL;" + NL + "    }" + NL + "  }" + NL + "  bool contains(const char* name) const {" + NL + "    if (_type == JSON_Object) { " + NL + "      return _object->find(name) != _object->end();" + NL + "    }else { " + NL + "      return false;" + NL + "    }" + NL + "  }" + NL + "  JSON *at(const char* name) {" + NL + "    map<string, JSON*>::const_iterator it = _object->find(name);" + NL + "    if (it != _object->end()) { " + NL + "      return it->second;" + NL + "    } else { " + NL + "      return NULL;" + NL + "    }" + NL + "  }" + NL + "  std::vector<string> Keys() const {" + NL + "    std::vector<string> keys;" + NL + "    if (_type == JSON_Object) {" + NL + "      map<string, JSON*>::const_iterator iter = _object->begin();" + NL + "      while (iter != _object->end()) {" + NL + "        keys.push_back(iter->first);" + NL + "        iter++;" + NL + "      }" + NL + "    }" + NL + "    return keys;" + NL + "  }" + NL + NL + "  string toString() {" + NL + "    return jsonize();" + NL + "  }" + NL + NL + "  string toString(const JSON *value) {" + NL + "    string json = \"\";" + NL + "    if (value != NULL)" + NL + "      json = value->jsonize();" + NL + "    return json;" + NL + "  }" + NL + NL + "  JSON& operator=(const JSON& val) {" + NL + "    swap(val);" + NL + "    return *this;" + NL + "  }" + NL + "  JSON& operator=(JSON *src) {" + NL + "    swap(*src);" + NL + "    return *this;" + NL + "  }" + NL + "  " + NL + "  // Add string(key)" + NL + "  JSON& operator[](const char *key) {" + NL + "    return this->operator[](string(key));" + NL + "    //return this->operator[](key);" + NL + "  }" + NL + NL + "  JSON& operator[](const string &key) {" + NL + "    setType(JSON_Object);" + NL + "    JSON* ret = _object->operator[](key);" + NL + "    if (ret == NULL) {" + NL + "      ret = new JSON();" + NL + "      _object->operator[](key) = ret;" + NL + "    }" + NL + "    return *ret;" + NL + "  }" + NL + NL + "  JSON& operator[](unsigned index) {" + NL + "    setType(JSON_Array);" + NL + "    if (index >= _array->size())" + NL + "      _array->resize(index + 1);" + NL + "    JSON* ret = _array->operator[](index);" + NL + "    if (ret == NULL) {" + NL + "      ret = new JSON();" + NL + "      _array->operator[](index) = ret;" + NL + "    }" + NL + "    return *ret;" + NL + "  }" + NL;
  public static final String TEXT_73 = "  " + NL + "protected:" + NL + "  void swap(const JSON &src) {" + NL + "    _type = src._type;" + NL + "    switch (_type) {" + NL + "      case JSON_String:" + NL + "        _string = new string(*src._string);" + NL + "        break;" + NL + "      case JSON_Bool:" + NL + "        _boolean = src._boolean;" + NL + "        break;" + NL + "      case JSON_Number:" + NL + "        _number = src._number;" + NL + "        break;" + NL + "      case JSON_Array: {" + NL + "        vector<JSON*> source_array = *src._array;" + NL + "        vector<JSON*>::iterator iter;" + NL + "        _array = new vector<JSON*>();" + NL + "        for (iter = source_array.begin(); iter != source_array.end(); iter++)" + NL + "          _array->push_back(new JSON(**iter));" + NL + "        break; }" + NL + "      case JSON_Object: {" + NL + "        map<string, JSON*> source_object = *src._object;" + NL + "        _object = new map<string, JSON*>();" + NL + "        map<string, JSON*>::iterator iter;" + NL + "        for (iter = source_object.begin(); iter != source_object.end(); iter++)" + NL + "        {" + NL + "          string name = (*iter).first;" + NL + "          (*_object)[name] = new JSON(*((*iter).second));" + NL + "        }" + NL + "        break; }" + NL + "      case JSON_Undefined:" + NL + "        break;" + NL + "    }" + NL + "  }" + NL + "  void setType(JSONType type) {" + NL + "    if (this->_type == type)" + NL + "      return;" + NL + "    switch (type) {" + NL + "    case JSON_Undefined:" + NL + "      break;" + NL + "    case JSON_Object:" + NL + "      _object = new map<string, JSON*>();" + NL + "      break;" + NL + "    case JSON_Array:" + NL + "      _array = new vector<JSON*>();" + NL + "      break;" + NL + "    case JSON_String:" + NL + "      _string = new string();" + NL + "      break;" + NL + "    case JSON_Number:" + NL + "      _number = 0;" + NL + "      break;" + NL + "    case JSON_Bool:" + NL + "      _boolean = false;" + NL + "      break;" + NL + "    }" + NL + "    this->_type = type;" + NL + "  }" + NL + NL + "  string escapeString(const string &json) const {" + NL + "    string escaped = \"\\\"\";" + NL + "    for (unsigned i = 0; i < json.length(); ++i) {" + NL + "      if (json[i] == '\\\"')    escaped += \"\\\\\\\"\";" + NL + "      else if (json[i] == '\\\\')  escaped += \"\\\\\\\\\";" + NL + "      else if (json[i] == '\\b')  escaped += \"\\\\b\";" + NL + "      else if (json[i] == '\\f')  escaped += \"\\\\f\";" + NL + "      else if (json[i] == '\\n')  escaped += \"\\\\n\";" + NL + "      else if (json[i] == '\\r')  escaped += \"\\\\r\";" + NL + "      else if (json[i] == '\\t')  escaped += \"\\\\t\";" + NL + "      else            escaped += json[i];" + NL + "    }" + NL + "    escaped += \"\\\"\";" + NL + "    return escaped;" + NL + "  }" + NL + NL + "  string jsonize() const {" + NL + "    string out;    " + NL + "    switch (_type)" + NL + "    {" + NL + "    case JSON_Undefined:" + NL + "      out = \"null\";" + NL + "      break;" + NL + "    case JSON_String:" + NL + "      out = escapeString(*_string);" + NL + "      break;" + NL + "    case JSON_Bool:" + NL + "      out = _boolean ? \"true\" : \"false\";" + NL + "      break;" + NL + "    case JSON_Number:" + NL + "    {" + NL + "      if (isinf(_number) || isnan(_number))" + NL + "        out = \"null\";" + NL + "      else {" + NL + "        stringstream ss;" + NL + "        ss.precision(15);" + NL + "        ss << _number;" + NL + "        out = ss.str();" + NL + "      }" + NL + "      break;" + NL + "    }" + NL + NL + "    case JSON_Array:" + NL + "    {" + NL + "      out = \"[\";" + NL + "      vector<JSON*>::const_iterator iter = _array->begin();" + NL + "      while (iter != _array->end()) {" + NL + "        out += (*iter)->jsonize();" + NL + "        if (++iter != _array->end())" + NL + "          out += \",\";" + NL + "      }" + NL + "      out += \"]\";" + NL + "      break;" + NL + "    }" + NL + NL + "    case JSON_Object: {" + NL + "      out = \"{\";" + NL + "      map<string, JSON*>::const_iterator iter = _object->begin();" + NL + "      while (iter != _object->end()) {" + NL + "        out += escapeString((*iter).first);" + NL + "        out += \":\";" + NL + "        out += (*iter).second->jsonize();" + NL + "        if (++iter != _object->end())" + NL + "          out += \",\";" + NL + "      }" + NL + "      out += \"}\";" + NL + "      break;" + NL + "    }" + NL + "    }" + NL + "    return out;" + NL + "  }" + NL + NL + "private:" + NL + "  JSONType _type;" + NL + "  union{" + NL + "    bool _boolean;" + NL + "    double _number;" + NL + "    string *_string;" + NL + "    vector<JSON*> *_array;" + NL + "    map<string, JSON*> *_object;" + NL + "  };" + NL + NL + "};" + NL;
  public static final String TEXT_74 = NL + "class JSONInternalParser : public JSONParser {" + NL + "public:" + NL + "  JSONInternalParser() {}" + NL + "  JSON Parse(const string &json) {" + NL + "    size_t offset = 0;" + NL + "    JSON value = internal_parse(json, offset);" + NL + "    return value;" + NL + "  }" + NL + "protected:" + NL + "  void skipWhitespace(const string &json, size_t &index) { while (isspace(json[index])) ++index; }" + NL + "  string getString(const string &json, size_t &index) {" + NL + "    string str;" + NL + "    for (char c = json[++index]; c != '\\\"' && index < json.size(); c = json[++index]) {" + NL + "      if (c == '\\\\') {" + NL + "        c = json[++index];" + NL + "        if (c == '\\\"')    str += '\\\"';" + NL + "        else if (c == '\\\\') str += '\\\\';" + NL + "        else if (c == '/')  str += '/';" + NL + "        else if (c == 'b')  str += '\\b';" + NL + "        else if (c == 'f')  str += '\\f';" + NL + "        else if (c == 'n')  str += '\\n';" + NL + "        else if (c == 'r')  str += '\\r';" + NL + "        else if (c == 't')  str += '\\t';" + NL + "        else if (c == 'u') {" + NL + "          str += \"\\\\u\";" + NL + "          for (unsigned i = 1; i <= 4; ++i) {" + NL + "            c = json[index + i];" + NL + "            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F')) str += c;" + NL + "            else return NULL;" + NL + "          }" + NL + "          index += 4;" + NL + "        }" + NL + "        else        str += '\\\\';" + NL + "      }" + NL + "      else str += c;" + NL + "    }" + NL + "    ++index;" + NL + "    return str;" + NL + "  }" + NL + NL + "  JSON internal_parse(const string &json, size_t &index) {" + NL + "    skipWhitespace(json, index);" + NL + "    char c = json[index];    " + NL + "    if (c == '[' ) {      " + NL + "      JSON Array(JSON_Array);" + NL + "      skipWhitespace(json, index);" + NL + "      if (json[++index] == ']') { ++index; return Array; }" + NL + "      for (unsigned array_index = 0;; ++index, array_index++) {" + NL + "        Array[array_index] = new JSON(internal_parse(json, index));" + NL + "        skipWhitespace(json, index);" + NL + "        if (json[index] == ']') { ++index; break; }" + NL + "        else if (json[index] != ',') { return JSON(); }" + NL + "      }      " + NL + "      return Array;" + NL + "    }" + NL + "    else if (c == '{') {" + NL + "      JSON jObj(JSON_Object);" + NL + "      skipWhitespace(json, index);" + NL + "      if (json[++index] == '}') { ++index; return JSON_Object; }" + NL + "      for (string objectKey;; ++index) {" + NL + "        objectKey = getString(json, index);" + NL + "        skipWhitespace(json, index);" + NL + "        if (json[index] != ':') { std::cerr << \"Missing colon, Error char is'\" << json[index] << \"'\\n\";break;}" + NL + "        skipWhitespace(json, ++index);" + NL + "        JSON *parsedObject = new JSON(internal_parse(json, index));" + NL + "        jObj[objectKey] = parsedObject;" + NL + "        skipWhitespace(json, index);" + NL + "        if (json[index] == '}') {++index; break;}" + NL + "        else if (json[index] != ',') {std::cerr << \"Missing comma, Error char is '\" << json[index] << \"'\\n\";break;}" + NL + "      }      " + NL + "      return jObj;" + NL + "    }" + NL + "    else if (c == '\\\"') {" + NL + "      string val = getString(json, index);" + NL + "      return JSON(val);" + NL + "    }" + NL + "    else if (c == 't' || c == 'f') {" + NL + "      bool value;" + NL + "      if (json.substr(index, 4) == \"true\") {value = true; index += 4;}" + NL + "      else if (json.substr(index, 5) == \"false\") {value = false; index += 5;}" + NL + "      else { return JSON();}" + NL + "      return JSON(value);" + NL + "    }" + NL + "    else if (c == 'n') {" + NL + "      if (json.substr(index, 4) != \"null\") {return JSON(); index += 4; }" + NL + "      else { std::cerr << \"Missing Null\\n\";}      " + NL + "      return JSON();" + NL + "    }" + NL + "    else if ((c <= '9' && c >= '0') || c == '-') {" + NL + "      double num;" + NL + "      string parsedNumber;" + NL + "      char n = json[index++];" + NL + "      bool isDbl = false;" + NL + "      long exponential = 0;" + NL + "      for (; n == '-' || (n >= '0' && n <= '9') || n == '.'; parsedNumber += n, n = json[index++], isDbl = isDbl ? true : n == '.');" + NL + "      if (n == 'E' || n == 'e') {" + NL + "        string e;" + NL + "        n = json[index++];" + NL + "        if (n == '-'){ ++index; e += '-'; }" + NL + "        for (; n >= '0' && n <= '9'; n = json[index++], e += n);" + NL + "        if (!isspace(n) && n != ',' && n != ']' && n != '}') return JSON();" + NL + "        exponential = std::stol(e);" + NL + "      }" + NL + "      --index;" + NL + "      if (isDbl) num = std::stod(parsedNumber) * std::pow(10.0, exponential);" + NL + "      else {" + NL + "        if (exponential > 0) num = std::stol(parsedNumber) * std::pow(10.0, exponential);" + NL + "        else num = std::stol(parsedNumber);" + NL + "      }" + NL + "      return JSON(num);" + NL + "    }" + NL + "  }" + NL + "};" + NL + NL + "class ConnectionException : public Exception {" + NL + "public:" + NL + "  ConnectionException() : Exception() {}" + NL + "  ConnectionException(std::string exMessage) : Exception(exMessage) {}" + NL + "};" + NL + "class SocketException : public  Exception {" + NL + "public:" + NL + "  SocketException() : Exception() {}" + NL + "  SocketException(std::string exMessage) : Exception(exMessage) {}" + NL + "};" + NL + "class IConnector {" + NL + "public:" + NL + "  virtual ~IConnector(){}" + NL + "  virtual string Send(const std::string& message) throw(ConnectionException) = 0;" + NL + "};" + NL + "class IReceiver {" + NL + "public:" + NL + "  virtual ~IReceiver(){}" + NL + "  virtual unsigned int Listen() throw(ConnectionException) = 0;" + NL + "};" + NL;
  public static final String TEXT_75 = NL + "class TCPConnector : public IConnector {" + NL + "public:" + NL + "  TCPConnector() {}" + NL + "  TCPConnector(const string& ip, const unsigned int &port) :endpoint(ip,port) {}" + NL + "  TCPConnector(const Endpoint& endpoint) :endpoint(endpoint) {}" + NL + "  virtual ~TCPConnector() {}" + NL + "  virtual string Send(const string& message) throw (ConnectionException) {    " + NL + "    SOCKET_TYPE socket_fd = openSocketPort();" + NL + "    string result = transport(socket_fd, message);" + NL + "    CLOSE_SOCKET(socket_fd);" + NL + "    return result;" + NL + "  }" + NL + "  " + NL + "private:" + NL + "  string transport(SOCKET_TYPE socket_fd, string message) throw (ConnectionException) {" + NL + "    char buffer[NETWORK_BUFFER_SIZE];" + NL + "    string msg = message;" + NL + "    unsigned int bytes;" + NL + "    bool receive = false;" + NL + "    do {" + NL + "      bytes = !receive ? send(socket_fd, msg.c_str(), msg.size(), 0) : " + NL + "            recv(socket_fd, buffer, NETWORK_BUFFER_SIZE, 0);" + NL + "      if (bytes == -1) {" + NL + "        CLOSE_SOCKET(socket_fd);" + NL + "        string error = recv ? \"Can not receive data\" : \"Can not send data\";        " + NL + "        throw SocketException(error);" + NL + "      }" + NL + "      if (!receive) {" + NL + "        if (bytes =  bytes - msg.size()) { msg = msg.substr(bytes + sizeof(char), msg.size() - bytes); }" + NL + "      } else { " + NL + "        msg.append(buffer, bytes); " + NL + "      }" + NL + "      if (bytes == 0) {" + NL + "        if (!receive) {" + NL + "          msg = \"\"; receive = true; shutdown(socket_fd, 1);" + NL + "        }" + NL + "        else {" + NL + "          break;" + NL + "        }        " + NL + "      }" + NL + "    } while (receive && msg.find(DELIMITER) == string::npos);" + NL + "    " + NL + "    return msg;" + NL + "  }" + NL + NL + "  SOCKET_TYPE openSocketPort() throw (ConnectionException) {" + NL + "    SOCKET_TYPE sd, rc;" + NL + "    struct sockaddr_in localAddr, servAddr;" + NL + "    struct hostent *host;" + NL + "    string host_str = endpoint.getHost();" + NL + "    const char *hostStr = host_str.c_str();" + NL + "    host = gethostbyname(hostStr);" + NL + "    if (host == NULL) {" + NL + "      throw SocketException(\"Unknown Host\");" + NL + "    }" + NL + "    servAddr.sin_family = host->h_addrtype;" + NL + "    memcpy((char *)&servAddr.sin_addr.s_addr, host->h_addr_list[0], host->h_length);" + NL + "    servAddr.sin_port = htons(endpoint.getPort());" + NL + "    sd = socket(AF_INET, SOCK_STREAM, 0);" + NL + "    if (sd<0) {" + NL + "      throw SocketException(\"Cannot open socket for communication\");" + NL + "    }" + NL + "    localAddr.sin_family = AF_INET;" + NL + "    localAddr.sin_addr.s_addr = htonl(INADDR_ANY);" + NL + "    localAddr.sin_port = htons(0);" + NL + "    rc = bind(sd, (struct sockaddr *) &localAddr, sizeof(localAddr));" + NL + "    if (rc<0) {" + NL + "      throw SocketException(\"Cannot bind to the port\");" + NL + "    }" + NL + "    rc = connect(sd, (struct sockaddr *) &servAddr, sizeof(servAddr));" + NL + "    if (rc<0) {" + NL + "      throw SocketException(\"Cannot connect to the server\");" + NL + "    }    " + NL + "    return sd;" + NL + "  }" + NL + "  Endpoint endpoint;" + NL + "};" + NL + NL + "template<class Caller>" + NL + "class TCPReceiver : public IReceiver, protected Runnable{" + NL + "public:" + NL + "  typedef typename MethodCallbackSignature<Caller, string, string>::Method onReceive;" + NL + "  TCPReceiver(Caller* caller, onReceive method, unsigned int port = 0) :_port(port), _context(caller), _onReceive(method), _running(false) {}" + NL + "  virtual ~TCPReceiver() { Stop(); }" + NL + "  virtual unsigned int Listen() throw(ConnectionException) {" + NL + "    Stop();" + NL + "    unsigned int bindPort = _port;" + NL + "    struct sockaddr_in servAddr;" + NL + "    socketPort = socket(AF_INET, SOCK_STREAM, 0);" + NL + "    if (socketPort<0) {" + NL + "      cerr << \"cannot open socket \" << endl;" + NL + "    }" + NL + "    servAddr.sin_family = AF_INET;" + NL + "    servAddr.sin_addr.s_addr = htonl(INADDR_ANY);" + NL + "    servAddr.sin_port = htons(_port);" + NL + "    if (bind(socketPort, (struct sockaddr *) &servAddr, sizeof(servAddr))<0) {" + NL + "      cerr << \"cannot bind port \" << endl;" + NL + "    }" + NL + "    if (_port == 0) {" + NL + "      struct sockaddr_in bindAddr;" + NL + "      socklen_t bindSize = sizeof(bindAddr);" + NL + "      if (getsockname(socketPort, (struct sockaddr *)&bindAddr, &bindSize) == -1)" + NL + "      {" + NL + "        cerr << \"getsockname error\" << endl;" + NL + "      }" + NL + "      cerr << \"Server instance running on port : \" << bindAddr.sin_port << endl;" + NL + "      bindPort = bindAddr.sin_port;" + NL + "    }" + NL + "    else {" + NL + "      cerr << \"Server instance running on port : \" << _port << endl;" + NL + "    }    " + NL + "    listen(socketPort, 5);" + NL + "    _thread.start(this);" + NL + "    _running = true;" + NL + "    return bindPort;" + NL + "  }" + NL + "  void Stop(){" + NL + "    if (_running) {" + NL + "      _running = false;" + NL + "      Thread::sleep(1);" + NL + "    }" + NL + "  }" + NL + NL + "protected:  " + NL + "  void run(){" + NL + "    SOCKET_TYPE newSd;" + NL + "    socklen_t cliLen;" + NL + "    struct sockaddr cliAddr;" + NL + "    while (1) {" + NL + "      cliLen = sizeof(cliAddr);" + NL + "      newSd = accept(socketPort, &cliAddr, &cliLen);" + NL + "      if (newSd<0) {" + NL + "        fprintf(stderr, \"cannot accept connection\\n\");" + NL + "        break;" + NL + "      }" + NL + "      processRequest(newSd);" + NL + "    }" + NL + "    CLOSE_SOCKET(socketPort);" + NL + "  }" + NL + NL + "  void processRequest(SOCKET_TYPE sockfd) {" + NL + "    int n = 0;" + NL + "    char *line = new char[80];" + NL + "    string recvMsg;" + NL + "    do {" + NL + "      memset(line, 0x00, sizeof(line));" + NL + "      n = recv(sockfd, line, sizeof(line), 0); /* wait for data */" + NL + "      if (n<0) {" + NL + "        cerr << \"cannot receive data\" << endl;" + NL + "        break;" + NL + "      }" + NL + "      else if (n == 0) {" + NL + "        break;" + NL + "      }" + NL + "      recvMsg.append(line, n);" + NL + "    } while (1);" + NL + "    string sendMsg = (_context->*_onReceive)(recvMsg);" + NL + "    n = send(sockfd, sendMsg.c_str(), sendMsg.size(), 0);" + NL + "    if (n<0) {" + NL + "      cerr << \"Cannot send data\" << endl;" + NL + "    }" + NL + "    CLOSE_SOCKET(sockfd);" + NL + "  }" + NL + "private:" + NL + "  Thread    _thread;" + NL + "  Caller*    _context;" + NL + "  onReceive _onReceive;" + NL + "  unsigned int _port;" + NL + "  SOCKET_TYPE socketPort;" + NL + "  bool _running;" + NL + "};" + NL;
  public static final String TEXT_76 = NL + "class Buffer {" + NL + "public:" + NL + "  std::string buffer;" + NL + "};" + NL + NL + "class RemoteException : public Exception {" + NL + "public:" + NL + "  RemoteException() : Exception() {}" + NL + "  RemoteException(std::string exMessage) : Exception(exMessage) {}" + NL + "};" + NL + NL + "enum RemoteMethodType { Local, Client, Server};" + NL + NL + "class IResponseHandler {" + NL + "public:" + NL + "  virtual ~IResponseHandler(){}" + NL + "  virtual string handleResponse(string response) const throw (RemoteException) = 0;" + NL + "};" + NL + NL + "class IRequestHandler {" + NL + "public:" + NL + "  virtual ~IRequestHandler(){}" + NL + "  virtual string handleRequest(string request) const throw (RemoteException) = 0;" + NL + "};" + NL + NL + "class IMessageRouter {" + NL + "public:" + NL + "  virtual ~IMessageRouter(){}" + NL + "  virtual void registerMethod(string methodName, const IResponseHandler* entry) = 0;" + NL + "  virtual RemoteMethodType getType() = 0;" + NL + "  virtual IConnector* getConnecter() = 0;" + NL + "  virtual const IResponseHandler* getResponseHandler(string methodName) const = 0;" + NL + "};" + NL + NL + "class RemoteMethodRequestHandler : public IRequestHandler {" + NL + "public:" + NL + "  RemoteMethodRequestHandler(IMessageRouter* messageRouter) : _router(messageRouter){}" + NL + "  virtual ~RemoteMethodRequestHandler(){}" + NL + "protected:" + NL + "  IMessageRouter* _router;" + NL + "};" + NL + NL + "template<class Caller, class ReturnType>" + NL + "class Transport : public IResponseHandler {" + NL + "public:" + NL + "  typedef typename MethodCallbackSignature<Caller, bool>::Method onReceive;" + NL + "  typedef typename MethodCallbackSignature<Caller, ReturnType>::Method Invoke;" + NL + NL + "  Transport(Caller* caller, onReceive method, Invoke invoke, string methodName, IMessageRouter* messageRouter) : _methodName(methodName), _router(messageRouter), _context(caller), _onReceive(method), _invoke(invoke){" + NL + "    _router->registerMethod(methodName, this);" + NL + "  }" + NL + "  virtual ~Transport(){}" + NL + "  virtual size_t length() const = 0;" + NL + NL + "  virtual ReturnType remote() throw (RemoteException) = 0;" + NL + "  IMessageRouter* getRouter() {" + NL + "    return _router;" + NL + "  }" + NL + "protected:" + NL + "  IMessageRouter* _router;" + NL + "  string _methodName;" + NL + "  Caller*    _context;" + NL + "  onReceive _onReceive;" + NL + "  Invoke _invoke;" + NL + "};" + NL + NL + "class JSONMethodRequestHandler : public RemoteMethodRequestHandler {" + NL + "public:" + NL + "  JSONMethodRequestHandler(IMessageRouter* messageRouter) : RemoteMethodRequestHandler(messageRouter){}" + NL + "  virtual ~JSONMethodRequestHandler(){}  " + NL + "  string handleRequest(string request) const throw (RemoteException) {" + NL + "    string result;" + NL + "    const IResponseHandler* handler = NULL;" + NL + "    JSON delegateMethod = JSON::Parse(request);" + NL + "    if (delegateMethod.IsObject() == true) {" + NL + "      string methodName = \"\";" + NL + "      if (delegateMethod.contains(\"method\") && delegateMethod[\"method\"].IsString()) {" + NL + "        methodName = delegateMethod[\"method\"];" + NL + "      }" + NL + "      handler = _router->getResponseHandler(methodName);" + NL + "      if (handler == NULL) {" + NL + "        JSON ex; ex[\"exception\"] = \"Unknown method\";" + NL + "        return ex.toString();" + NL + "      }" + NL + "      else {" + NL + "        if (delegateMethod.contains(\"values\") && delegateMethod[\"values\"].IsArray()) {" + NL + "          JSON values = delegateMethod[\"values\"];" + NL + "          result = handler->handleResponse(values.toString());" + NL + "        }" + NL + "      }" + NL + "    }" + NL + "    return result;" + NL + "  }" + NL + "};" + NL + NL + "class TCPMessageRouter : public IMessageRouter {" + NL + "public:" + NL + "  typedef map<string, const IResponseHandler* > HandlerMap;" + NL + "  TCPMessageRouter() : _port(0), _receiver(this, &TCPMessageRouter::processResponseHandler), _type(RemoteMethodType::Local), _handler(new JSONMethodRequestHandler(this)) {}" + NL + "  TCPMessageRouter(Endpoint endpoint) : _ep(endpoint), _tcpConnector(_ep), _port(0), _receiver(this, &TCPMessageRouter::processResponseHandler), _type(RemoteMethodType::Client), _handler(new JSONMethodRequestHandler(this)) {}" + NL + "  TCPMessageRouter(unsigned int port) : _port(port), _receiver(this, &TCPMessageRouter::processResponseHandler, port), _type(RemoteMethodType::Server), _handler(new JSONMethodRequestHandler(this)) {" + NL + "    _port = _receiver.Listen();" + NL + "  }" + NL + "  virtual ~TCPMessageRouter() { _entries.clear();  }" + NL + "  void registerMethod(string methodName, const IResponseHandler* entry) {" + NL + "    _entries.insert(HandlerMap::value_type(methodName, entry));" + NL + "  }" + NL + "  unsigned int getPort() { return _port; }" + NL + "  Endpoint getEndPoint() { return _ep; }" + NL + "  RemoteMethodType getType() { return _type; }" + NL + "protected:" + NL + "  virtual IConnector* getConnecter() {" + NL + "    return &_tcpConnector;" + NL + "  }" + NL + "  string processResponseHandler(string response) throw (RemoteException) {" + NL + "    return _handler->handleRequest(response);" + NL + "  }" + NL + "  const IResponseHandler* getResponseHandler(string methodName) const {" + NL + "    HandlerMap::const_iterator it = _entries.begin();" + NL + "    it = _entries.find(methodName);" + NL + "    if (it != _entries.end())" + NL + "      return it->second;" + NL + "    return NULL;" + NL + "  }  " + NL + "private:" + NL + "  unsigned int _port;" + NL + "  Endpoint _ep;" + NL + "  TCPConnector _tcpConnector;" + NL + "  HandlerMap _entries;" + NL + "  TCPReceiver<TCPMessageRouter> _receiver;" + NL + "  RemoteMethodType _type;" + NL + "  RemoteMethodRequestHandler* _handler;" + NL + "};" + NL + NL + "template<class ReturnType>" + NL + "class IPort {" + NL + "public:" + NL + "  virtual ~IPort(){}" + NL + "  virtual ReturnType send() = 0;" + NL + "  virtual bool receive() = 0; " + NL + "};" + NL;
  public static final String TEXT_77 = NL + "template<class Caller, class ReturnType>" + NL + "class JSONTransport : public Transport<Caller, ReturnType> {" + NL + "public:" + NL + "  JSONTransport(Caller* caller, onReceive method, Invoke invoke, string methodName, IMessageRouter* messageRouter) : Transport(caller, method, invoke, methodName, messageRouter), _arguments(JSON_Array) {" + NL + "  }" + NL + "  JSON& operator[](unsigned index) {" + NL + "    return _arguments[index];" + NL + "  }" + NL + "  size_t length() const {" + NL + "    return _arguments.length();" + NL + "  }" + NL + NL + "  template<class T> T& at(unsigned index) {" + NL + "    return _arguments[index];" + NL + "  }" + NL + NL + "  ReturnType remote() throw (RemoteException) {" + NL + "    string args_json = _arguments.toString();" + NL + "    RemoteMethodRequestHandler* requester = dynamic_cast<RemoteMethodRequestHandler *>(getRouter());" + NL + "    string returnJson = invokeRemoteMethod(_methodName, args_json);" + NL + "    JSON returnObject = JSON::Parse(returnJson);" + NL + "    return returnObject;" + NL + "  }" + NL + NL + "  string invokeRemoteMethod(string methodName, string arguments) throw (RemoteException) {" + NL + "    IConnector* connector = _router->getConnecter();" + NL + "    string result;" + NL + "    if (connector == NULL)" + NL + "      throw RemoteException(\"Connector can not be initialized\");" + NL + "    JSON method;" + NL + "    method[\"method\"] = methodName;" + NL + "    JSON jsonValues = JSON::Parse(arguments);" + NL + "    if (jsonValues.IsArray() == true) {" + NL + "      method[\"values\"] = jsonValues;" + NL + "    }" + NL + "    else { method[\"values\"] = new JSON(JSON_Array); }" + NL + "    string methodCall = method.toString();" + NL + "    string methodReturn = connector->Send(methodCall);" + NL + "    assert(methodReturn.size() > 0);" + NL + "    JSON delegateMethod = JSON::Parse(methodReturn);" + NL + "    if (delegateMethod.IsObject() == true) {" + NL + "      string methodName = \"\";" + NL + "      if (delegateMethod.contains(\"exception\") && delegateMethod[\"exception\"].IsString()) {" + NL + "        string error = delegateMethod[\"exception\"];" + NL + "        throw RemoteException(error);" + NL + "      }" + NL + "      if (delegateMethod.contains(\"method\") && delegateMethod[\"method\"].IsString()) {" + NL + "        methodName = delegateMethod[\"method\"];" + NL + "      }" + NL + "      if (methodName == methodName) {" + NL + "        if (delegateMethod.contains(\"return\")) {" + NL + "          result = delegateMethod[\"return\"].toString();" + NL + "        }" + NL + "      }" + NL + "    }" + NL + "    return result;" + NL + "  }" + NL + NL + "  virtual string handleResponse(string response) const throw (RemoteException) {" + NL + "    string result;" + NL + "    JSON methodArgs = JSON::Parse(response);" + NL + "    JSON delegateMethod;" + NL + "    if (methodArgs.IsArray() == true) {" + NL + "      _arguments = methodArgs;" + NL + "      if (!(_context->*_onReceive)()) { return throwException(\"Invalid Values\"); }" + NL + "      JSON method;" + NL + "      method[\"method\"] = _methodName;" + NL + "      method[\"return\"] = (_context->*_invoke)();" + NL + "      JSON value = method;" + NL + "      result = value.toString();" + NL + "    }" + NL + "    else {" + NL + "      JSON ex;" + NL + "      ex[\"exception\"] = \"Unknown method\";" + NL + "      JSON value = ex;" + NL + "      result = value.toString();" + NL + "      return result;" + NL + "    }" + NL + "    return result;" + NL + "  }" + NL + NL + "protected:" + NL + "  mutable JSON _arguments;" + NL + "private:" + NL + "  string throwException(string msg) const throw (RemoteException) {" + NL + "    JSON ex;" + NL + "    ex[\"exception\"] = msg;" + NL + "    JSON value = ex;" + NL + "    return value.toString();" + NL + "  }" + NL + "};" + NL;
  public static final String TEXT_78 = NL + "#define GENERATE_REMOTE_METHODS_ARGUMENTS(N, value)                                            \\" + NL + "template<class Caller, class ReturnType, VAR_TYPES(N)>                                          \\" + NL + "class RemoteMethod<Caller, ReturnType, VAR_ARGS(N)> : public IPort<ReturnType>, public ActiveConstraintUID{public:            \\" + NL + "  typedef typename MethodCallbackSignature<Caller, ReturnType, VAR_ARGS(N)>::Method Callback;                      \\" + NL + "  typedef typename Active<Caller, ReturnType, VAR_ARGS(N)> ActiveRemoteMethod;                            \\" + NL + "  RemoteMethod(Caller* caller, Callback method, Scheduler<Caller>* sch, string methodName, IMessageRouter* messageRouter)        \\" + NL + "    :_method(caller, sch, method), transport(this, &RemoteMethod::receive, &RemoteMethod::invoke, methodName, messageRouter) { }  \\" + NL + "  RemoteMethod(ActiveRemoteMethod method, string methodName, IMessageRouter* messageRouter)                      \\" + NL + "    :_method(method), transport(this, &RemoteMethod::receive, &RemoteMethod::invoke, methodName, messageRouter) { }          \\" + NL + "    MulticastDelegate<ReturnType, VAR_ARGS(N)>* getPort() { return &_method; }                                              \\" + NL + "    operator MulticastDelegate<ReturnType, VAR_ARGS(N)>*() { return getPort(); }                        \\" + NL + "    RemoteMethod& operator += (IDelegatePublisher<ReturnType, VAR_ARGS(N)>* method) { _method += method;return *this; }          \\" + NL + "  ReturnType operator () (VAR_ARGS_MEMBERS(N, arg, COMMA)) {                                      \\" + NL + "    INIT_VALUE_ARGS(N, arg);                                                    \\" + NL + "    if (transport.getRouter()->getType() == RemoteMethodType::Client) { return send();getPort()->notify(VAR_NAMED_ARGS(N, arg)); }                      \\" + NL + "    else { return invoke(); }                                                    \\" + NL + "  }                                                                  \\" + NL + "private:                                                                \\" + NL + "  JSONTransport<RemoteMethod, ReturnType> transport;                                          \\" + NL + "  ActiveRemoteMethod _method;                                                      \\" + NL + "  VAR_ARGS_MEMBERS(N, _arg, SEMICOLON);                                                \\" + NL + "  virtual bool receive() {                                                      \\" + NL + "    if (transport.length() == N) {                                                  \\" + NL + "      try{ SERIALIZE_ARGS(N, arg); }                                                \\" + NL + "      catch (...) { return false; }                                                \\" + NL + "    }                                                                \\" + NL + "    else { return false; }                                                      \\" + NL + "    return true;                                                          \\" + NL + "  }                                                                  \\" + NL + "  ReturnType invoke() {                                                        \\" + NL + "    FutureResult<ReturnType> result = _method(VAR_NAMED_ARGS(N, _arg));                                \\" + NL + "    result.snooze();                                                          \\" + NL + "    return result.data();                                                      \\" + NL + "  }                                                                  \\" + NL + "  virtual ReturnType send() {                                                      \\" + NL + "    DESERIALIZE_ARGS(N, arg);                                                    \\" + NL + "    return transport.remote();                                                    \\" + NL + "  }                                                                  \\" + NL + "};                                                                    \\" + NL + "template<class Caller, VAR_TYPES(N)>                                                  \\" + NL + "class RemoteMethod<Caller, void, VAR_ARGS(N)> : public IPort<void>, public ActiveConstraintUID{public:                  \\" + NL + "  typedef typename MethodCallbackSignature<Caller, void, VAR_ARGS(N)>::Method Callback;                        \\" + NL + "  typedef typename Active<Caller, void, VAR_ARGS(N)> ActiveRemoteMethod;                                \\" + NL + "  RemoteMethod(Caller* caller, Callback method, Scheduler<Caller>* sch, string methodName, IMessageRouter* messageRouter)        \\" + NL + "    :_method(caller, sch, method), transport(this, &RemoteMethod::receive, &RemoteMethod::invoke, methodName, messageRouter) { }  \\" + NL + "  RemoteMethod(ActiveRemoteMethod method, string methodName, IMessageRouter* messageRouter)                      \\" + NL + "    :_method(method), transport(this, &RemoteMethod::receive, &RemoteMethod::invoke, methodName, messageRouter) { }          \\" + NL + "    MulticastDelegate<void, VAR_ARGS(N)>* getPort() { return &_method; }                                              \\" + NL + "    operator MulticastDelegate<void, VAR_ARGS(N)>*() { return getPort(); }                        \\" + NL + "    RemoteMethod& operator += (IDelegatePublisher<void, VAR_ARGS(N)>* method) { _method += method;return *this; }          \\" + NL + "  void operator () (VAR_ARGS_MEMBERS(N, arg, COMMA)) {                                        \\" + NL + "    INIT_VALUE_ARGS(N, arg);                                                    \\" + NL + "    if (transport.getRouter()->getType() == RemoteMethodType::Client) { send(); getPort()->notify(VAR_NAMED_ARGS(N, arg)); }                          \\" + NL + "    else { invoke(); }                                                        \\" + NL + "  }                                                                  \\" + NL + "private:                                                                \\" + NL + "  JSONTransport<RemoteMethod, string> transport;                                            \\" + NL + "  ActiveRemoteMethod _method;                                                      \\" + NL + "  VAR_ARGS_MEMBERS(N, _arg, SEMICOLON);                                                \\" + NL + "  virtual bool receive() {                                                      \\" + NL + "    if (transport.length() == N) {                                                  \\" + NL + "      try{ SERIALIZE_ARGS(N, arg); }                                                \\" + NL + "      catch (...) { return false; }                                                \\" + NL + "    }                                                                \\" + NL + "    else { return false; }                                                      \\" + NL + "    return true;                                                          \\" + NL + "  }                                                                  \\" + NL + "  string invoke() {                                                          \\" + NL + "    FutureResult<void> result = _method(VAR_NAMED_ARGS(N, _arg));                                  \\" + NL + "    result.snooze();                                                          \\" + NL + "    return \"\";                                                            \\" + NL + "  }                                                                  \\" + NL + "  virtual void send() {                                                        \\" + NL + "    DESERIALIZE_ARGS(N, arg);                                                    \\" + NL + "    transport.remote();                                                        \\" + NL + "  }};" + NL + NL + "#define GENERATE_REMOTE_METHODS(N)  REPEAT_DEC(N, GENERATE_REMOTE_METHODS_ARGUMENTS, EMPTY)" + NL;
  public static final String TEXT_79 = NL + "template<class Caller, class ReturnType, VAR_TYPES_DEFAULT(ARGUMENT_UPPER_LIMIT, void)> class RemoteMethod;" + NL + "template<class Caller, class ReturnType, VAR_TYPES(ARGUMENT_UPPER_LIMIT)>" + NL + "class RemoteMethod : public IPort<ReturnType>, public ActiveConstraintUID{" + NL + "public:" + NL + "  typedef typename MethodCallbackSignature<Caller, ReturnType, VAR_ARGS(ARGUMENT_UPPER_LIMIT)>::Method Callback;" + NL + "  typedef typename Active<Caller, ReturnType, VAR_ARGS(ARGUMENT_UPPER_LIMIT)> ActiveRemoteMethod;" + NL + "  RemoteMethod(Caller* caller, Callback method, Scheduler<Caller>* sch, string methodName, IMessageRouter* messageRouter)" + NL + "    :_method(caller, sch, method), transport(this, &RemoteMethod::receive, &RemoteMethod::invoke, methodName, messageRouter) { }" + NL + "  RemoteMethod(ActiveRemoteMethod method, string methodName, IMessageRouter* messageRouter)" + NL + "    :_method(method), transport(this, &RemoteMethod::receive, &RemoteMethod::invoke, methodName, messageRouter) { }" + NL + "  ReturnType operator () (VAR_ARGS_MEMBERS(ARGUMENT_UPPER_LIMIT, arg, COMMA)) {" + NL + "    INIT_VALUE_ARGS(ARGUMENT_UPPER_LIMIT, arg);" + NL + "    if (transport.getRouter()->getType() == RemoteMethodType::Client) { return send(); getPort()->notify(VAR_NAMED_ARGS(ARGUMENT_UPPER_LIMIT, arg)); }" + NL + "    else { return invoke(); }" + NL + "  }" + NL + "  MulticastDelegate<ReturnType, VAR_ARGS(ARGUMENT_UPPER_LIMIT)>*  getPort() { return &_method; }" + NL + "  operator MulticastDelegate<ReturnType, VAR_ARGS(ARGUMENT_UPPER_LIMIT)>*() { return getPort(); }" + NL + "  RemoteMethod& operator += (IDelegatePublisher<ReturnType, VAR_ARGS(ARGUMENT_UPPER_LIMIT)>* method) { _method += method; return *this; }" + NL + "private:" + NL + "  JSONTransport<RemoteMethod, ReturnType> transport;" + NL + "  ActiveRemoteMethod _method;" + NL + "  VAR_ARGS_MEMBERS(ARGUMENT_UPPER_LIMIT, _arg, SEMICOLON);" + NL + "  virtual bool receive() {" + NL + "    if (transport.length() == ARGUMENT_UPPER_LIMIT) {" + NL + "      try{ SERIALIZE_ARGS(ARGUMENT_UPPER_LIMIT, arg); }" + NL + "      catch (...) { return false; }" + NL + "    }" + NL + "    else { return false; }" + NL + "    return true;" + NL + "  }" + NL + "  ReturnType invoke() {" + NL + "    FutureResult<ReturnType> result = _method(VAR_NAMED_ARGS(ARGUMENT_UPPER_LIMIT, _arg));" + NL + "    result.snooze();" + NL + "    return result.data();" + NL + "  }" + NL + "  virtual ReturnType send() {" + NL + "    DESERIALIZE_ARGS(ARGUMENT_UPPER_LIMIT, arg);" + NL + "    return transport.remote();" + NL + "  }" + NL + "};" + NL;
  public static final String TEXT_80 = NL + "template<class Caller, class ReturnType>" + NL + "class RemoteMethod<Caller, ReturnType> : public IPort<ReturnType>, public ActiveConstraintUID{" + NL + "public:" + NL + "  typedef typename MethodCallbackSignature<Caller, ReturnType>::Method Callback;" + NL + "  typedef typename Active<Caller, ReturnType> ActiveRemoteMethod;" + NL + "  RemoteMethod(Caller* caller, Callback method, Scheduler<Caller>* sch, string methodName, IMessageRouter* messageRouter)" + NL + "    :_method(caller, sch, method), transport(this, &RemoteMethod::receive, &RemoteMethod::invoke, methodName, messageRouter) { }" + NL + "  RemoteMethod(ActiveRemoteMethod method, string methodName, IMessageRouter* messageRouter)" + NL + "    :_method(method), transport(this, &RemoteMethod::receive, &RemoteMethod::invoke, methodName, messageRouter) { }" + NL + "  ReturnType operator () () {" + NL + "    if (transport.getRouter()->getType() == RemoteMethodType::Client) { return send(); getPort()->notify(); }" + NL + "    else { return invoke(); }" + NL + "  }" + NL + "  MulticastDelegate<ReturnType>* getPort() { return &_method; }" + NL + "  operator MulticastDelegate<ReturnType>*() { return getPort(); }" + NL + "  RemoteMethod& operator += (IDelegatePublisher<ReturnType>* method) { _method += method; return *this; }" + NL + "private:" + NL + "  ActiveRemoteMethod _method;" + NL + "  JSONTransport<RemoteMethod, ReturnType> transport;" + NL + "  virtual bool receive() {" + NL + "    if (transport.length() == 0) {" + NL + "    }" + NL + "    else { return false; }" + NL + "    return true;" + NL + "  }" + NL + "  ReturnType invoke() {" + NL + "    FutureResult<ReturnType> result = _method();" + NL + "    result.snooze();" + NL + "    return result.data();" + NL + "  }" + NL + "  virtual ReturnType send() {" + NL + "    return transport.remote();" + NL + "  }" + NL + "};" + NL + NL + "template<class Caller>" + NL + "class RemoteMethod<Caller, void> : public IPort<void>, public ActiveConstraintUID{" + NL + "public:" + NL + "  typedef typename MethodCallbackSignature<Caller, void>::Method Callback;" + NL + "  typedef typename Active<Caller, void> ActiveRemoteMethod;" + NL + "  RemoteMethod(Caller* caller, Callback method, Scheduler<Caller>* sch, string methodName, IMessageRouter* messageRouter)" + NL + "    :_method(caller, sch, method), transport(this, &RemoteMethod::receive, &RemoteMethod::invoke, methodName, messageRouter) { }" + NL + "  RemoteMethod(ActiveRemoteMethod method, string methodName, IMessageRouter* messageRouter)" + NL + "    :_method(method), transport(this, &RemoteMethod::receive, &RemoteMethod::invoke, methodName, messageRouter) { }" + NL + "  void operator () () {" + NL + "    if (transport.getRouter()->getType() == RemoteMethodType::Client) { send(); getPort()->notify(); }" + NL + "    else { invoke(); }" + NL + "  }" + NL + "  operator MulticastDelegate<void>*() { return getPort(); }" + NL + "  MulticastDelegate<void>* getPort() { return &_method; }" + NL + "  RemoteMethod& operator += (IDelegatePublisher<void>* method) { _method += method; return *this; }" + NL + "private:" + NL + "  ActiveRemoteMethod _method;" + NL + "  JSONTransport<RemoteMethod, string> transport;  " + NL + "  virtual bool receive() {" + NL + "    if (transport.length() == 0) {" + NL + "    }" + NL + "    else { return false; }" + NL + "    return true;" + NL + "  }" + NL + "  string invoke() {" + NL + "    FutureResult<void> result = _method();" + NL + "    result.snooze();" + NL + "    return \"\";" + NL + "  }" + NL + "  virtual void send() {" + NL + "    transport.remote();" + NL + "  }" + NL + "};" + NL + NL + "GENERATE_REMOTE_METHODS(ARGUMENT_UPPER_LIMIT)";
  public static final String TEXT_81 = NL;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenPackage Attributes
  private String name;
  private String language;
  private String version;
  private String directory;
  private String project;
  private int priority;
  private boolean requiresThread;
  private transient Comparator<GenDepend> includesPriority;
  private transient Comparator<UniqueGenBody> externalDefinitionsPriority;
  private transient Comparator<GenClass> classesPriority;
  private transient Comparator<UniqueGenBody> predefinitionsPriority;

  //GenPackage Associations
  private List<GenDepend> includes;
  private List<GenClass> classes;
  private List<UniqueGenBody> predefinitions;
  private List<GenPackage> children;
  private GenPackage parent;
  private List<UniqueGenBody> externalDefinitions;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenPackage()
  {
    name = null;
    language = null;
    version = null;
    directory = "";
    project = null;
    priority = 0;
    requiresThread = false;
    includesPriority = 
      Comparator.comparing(GenDepend::getPriority);
    externalDefinitionsPriority = 
      Comparator.comparing(UniqueGenBody::getPriority);
    classesPriority = 
      Comparator.comparing(GenClass::getPriority);
    predefinitionsPriority = 
      Comparator.comparing(UniqueGenBody::getPriority);
    includes = new ArrayList<GenDepend>();
    classes = new ArrayList<GenClass>();
    predefinitions = new ArrayList<UniqueGenBody>();
    children = new ArrayList<GenPackage>();
    externalDefinitions = new ArrayList<UniqueGenBody>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setLanguage(String aLanguage)
  {
    boolean wasSet = false;
    language = aLanguage;
    wasSet = true;
    return wasSet;
  }

  public boolean setVersion(String aVersion)
  {
    boolean wasSet = false;
    version = aVersion;
    wasSet = true;
    return wasSet;
  }

  public boolean setDirectory(String aDirectory)
  {
    boolean wasSet = false;
    directory = aDirectory;
    wasSet = true;
    return wasSet;
  }

  public boolean setProject(String aProject)
  {
    boolean wasSet = false;
    project = aProject;
    wasSet = true;
    return wasSet;
  }

  public boolean setPriority(int aPriority)
  {
    boolean wasSet = false;
    priority = aPriority;
    wasSet = true;
    return wasSet;
  }

  public boolean setRequiresThread(boolean aRequiresThread)
  {
    boolean wasSet = false;
    requiresThread = aRequiresThread;
    wasSet = true;
    return wasSet;
  }

  public boolean setIncludesPriority(Comparator<GenDepend> aIncludesPriority)
  {
    boolean wasSet = false;
    includesPriority = aIncludesPriority;
    wasSet = true;
    return wasSet;
  }

  public boolean setExternalDefinitionsPriority(Comparator<UniqueGenBody> aExternalDefinitionsPriority)
  {
    boolean wasSet = false;
    externalDefinitionsPriority = aExternalDefinitionsPriority;
    wasSet = true;
    return wasSet;
  }

  public boolean setClassesPriority(Comparator<GenClass> aClassesPriority)
  {
    boolean wasSet = false;
    classesPriority = aClassesPriority;
    wasSet = true;
    return wasSet;
  }

  public boolean setPredefinitionsPriority(Comparator<UniqueGenBody> aPredefinitionsPriority)
  {
    boolean wasSet = false;
    predefinitionsPriority = aPredefinitionsPriority;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public String getLanguage()
  {
    return language;
  }

  public String getVersion()
  {
    return version;
  }

  public String getDirectory()
  {
    return directory;
  }

  public String getProject()
  {
    return project;
  }

  public int getPriority()
  {
    return priority;
  }

  /**
   * Composite-structure specific
   */
  public boolean getRequiresThread()
  {
    return requiresThread;
  }

  public String getNamespace()
  {
    return includeNamespace();
  }

  public Comparator<GenDepend> getIncludesPriority()
  {
    return includesPriority;
  }

  public Comparator<UniqueGenBody> getExternalDefinitionsPriority()
  {
    return externalDefinitionsPriority;
  }

  public Comparator<GenClass> getClassesPriority()
  {
    return classesPriority;
  }

  public Comparator<UniqueGenBody> getPredefinitionsPriority()
  {
    return predefinitionsPriority;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isRequiresThread()
  {
    return requiresThread;
  }
  /* Code from template association_GetMany */
  public GenDepend getInclude(int index)
  {
    GenDepend aInclude = includes.get(index);
    return aInclude;
  }

  public List<GenDepend> getIncludes()
  {
    List<GenDepend> newIncludes = Collections.unmodifiableList(includes);
    return newIncludes;
  }

  public int numberOfIncludes()
  {
    int number = includes.size();
    return number;
  }

  public boolean hasIncludes()
  {
    boolean has = includes.size() > 0;
    return has;
  }

  public int indexOfInclude(GenDepend aInclude)
  {
    int index = includes.indexOf(aInclude);
    return index;
  }
  /* Code from template association_GetMany */
  public GenClass getClass(int index)
  {
    GenClass aClass = classes.get(index);
    return aClass;
  }

  public List<GenClass> getClasses()
  {
    List<GenClass> newClasses = Collections.unmodifiableList(classes);
    return newClasses;
  }

  public int numberOfClasses()
  {
    int number = classes.size();
    return number;
  }

  public boolean hasClasses()
  {
    boolean has = classes.size() > 0;
    return has;
  }

  public int indexOfClass(GenClass aClass)
  {
    int index = classes.indexOf(aClass);
    return index;
  }
  /* Code from template association_GetMany */
  public UniqueGenBody getPredefinition(int index)
  {
    UniqueGenBody aPredefinition = predefinitions.get(index);
    return aPredefinition;
  }

  public List<UniqueGenBody> getPredefinitions()
  {
    List<UniqueGenBody> newPredefinitions = Collections.unmodifiableList(predefinitions);
    return newPredefinitions;
  }

  public int numberOfPredefinitions()
  {
    int number = predefinitions.size();
    return number;
  }

  public boolean hasPredefinitions()
  {
    boolean has = predefinitions.size() > 0;
    return has;
  }

  public int indexOfPredefinition(UniqueGenBody aPredefinition)
  {
    int index = predefinitions.indexOf(aPredefinition);
    return index;
  }
  /* Code from template association_GetMany */
  public GenPackage getChild(int index)
  {
    GenPackage aChild = children.get(index);
    return aChild;
  }

  public List<GenPackage> getChildren()
  {
    List<GenPackage> newChildren = Collections.unmodifiableList(children);
    return newChildren;
  }

  public int numberOfChildren()
  {
    int number = children.size();
    return number;
  }

  public boolean hasChildren()
  {
    boolean has = children.size() > 0;
    return has;
  }

  public int indexOfChild(GenPackage aChild)
  {
    int index = children.indexOf(aChild);
    return index;
  }
  /* Code from template association_GetOne */
  public GenPackage getParent()
  {
    return parent;
  }

  public boolean hasParent()
  {
    boolean has = parent != null;
    return has;
  }
  /* Code from template association_GetMany */
  public UniqueGenBody getExternalDefinition(int index)
  {
    UniqueGenBody aExternalDefinition = externalDefinitions.get(index);
    return aExternalDefinition;
  }

  public List<UniqueGenBody> getExternalDefinitions()
  {
    List<UniqueGenBody> newExternalDefinitions = Collections.unmodifiableList(externalDefinitions);
    return newExternalDefinitions;
  }

  public int numberOfExternalDefinitions()
  {
    int number = externalDefinitions.size();
    return number;
  }

  public boolean hasExternalDefinitions()
  {
    boolean has = externalDefinitions.size() > 0;
    return has;
  }

  public int indexOfExternalDefinition(UniqueGenBody aExternalDefinition)
  {
    int index = externalDefinitions.indexOf(aExternalDefinition);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfIncludes()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addInclude(GenDepend aInclude)
  {
    boolean wasAdded = false;
    if (includes.contains(aInclude)) { return false; }
    GenPackage existingGenPackage = aInclude.getGenPackage();
    if (existingGenPackage == null)
    {
      aInclude.setGenPackage(this);
    }
    else if (!this.equals(existingGenPackage))
    {
      existingGenPackage.removeInclude(aInclude);
      addInclude(aInclude);
    }
    else
    {
      includes.add(aInclude);
    }
    wasAdded = true;
    if(wasAdded)
        Collections.sort(includes, includesPriority);
    
    return wasAdded;
  }

  public boolean removeInclude(GenDepend aInclude)
  {
    boolean wasRemoved = false;
    if (includes.contains(aInclude))
    {
      includes.remove(aInclude);
      aInclude.setGenPackage(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfClasses()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addClass(GenClass aClass)
  {
    boolean wasAdded = false;
    if (classes.contains(aClass)) { return false; }
    GenPackage existingGenPackage = aClass.getGenPackage();
    if (existingGenPackage == null)
    {
      aClass.setGenPackage(this);
    }
    else if (!this.equals(existingGenPackage))
    {
      existingGenPackage.removeClass(aClass);
      addClass(aClass);
    }
    else
    {
      classes.add(aClass);
    }
    wasAdded = true;
    if(wasAdded)
        Collections.sort(classes, classesPriority);
    
    return wasAdded;
  }

  public boolean removeClass(GenClass aClass)
  {
    boolean wasRemoved = false;
    if (classes.contains(aClass))
    {
      classes.remove(aClass);
      aClass.setGenPackage(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPredefinitions()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addPredefinition(UniqueGenBody aPredefinition)
  {
    boolean wasAdded = false;
    if (predefinitions.contains(aPredefinition)) { return false; }
    GenPackage existingGenPackage = aPredefinition.getGenPackage();
    if (existingGenPackage == null)
    {
      aPredefinition.setGenPackage(this);
    }
    else if (!this.equals(existingGenPackage))
    {
      existingGenPackage.removePredefinition(aPredefinition);
      addPredefinition(aPredefinition);
    }
    else
    {
      predefinitions.add(aPredefinition);
    }
    wasAdded = true;
    if(wasAdded)
        Collections.sort(predefinitions, predefinitionsPriority);
    
    return wasAdded;
  }

  public boolean removePredefinition(UniqueGenBody aPredefinition)
  {
    boolean wasRemoved = false;
    if (predefinitions.contains(aPredefinition))
    {
      predefinitions.remove(aPredefinition);
      aPredefinition.setGenPackage(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfChildren()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addChild(GenPackage aChild)
  {
    boolean wasAdded = false;
    if (children.contains(aChild)) { return false; }
    GenPackage existingParent = aChild.getParent();
    if (existingParent == null)
    {
      aChild.setParent(this);
    }
    else if (!this.equals(existingParent))
    {
      existingParent.removeChild(aChild);
      addChild(aChild);
    }
    else
    {
      children.add(aChild);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeChild(GenPackage aChild)
  {
    boolean wasRemoved = false;
    if (children.contains(aChild))
    {
      children.remove(aChild);
      aChild.setParent(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addChildAt(GenPackage aChild, int index)
  {  
    boolean wasAdded = false;
    if(addChild(aChild))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfChildren()) { index = numberOfChildren() - 1; }
      children.remove(aChild);
      children.add(index, aChild);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveChildAt(GenPackage aChild, int index)
  {
    boolean wasAdded = false;
    if(children.contains(aChild))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfChildren()) { index = numberOfChildren() - 1; }
      children.remove(aChild);
      children.add(index, aChild);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addChildAt(aChild, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setParent(GenPackage aParent)
  {
    boolean wasSet = false;
    GenPackage existingParent = parent;
    parent = aParent;
    if (existingParent != null && !existingParent.equals(aParent))
    {
      existingParent.removeChild(this);
    }
    if (aParent != null)
    {
      aParent.addChild(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfExternalDefinitions()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addExternalDefinition(UniqueGenBody aExternalDefinition)
  {
    boolean wasAdded = false;
    if (externalDefinitions.contains(aExternalDefinition)) { return false; }
    GenPackage existingExternalPackage = aExternalDefinition.getExternalPackage();
    if (existingExternalPackage == null)
    {
      aExternalDefinition.setExternalPackage(this);
    }
    else if (!this.equals(existingExternalPackage))
    {
      existingExternalPackage.removeExternalDefinition(aExternalDefinition);
      addExternalDefinition(aExternalDefinition);
    }
    else
    {
      externalDefinitions.add(aExternalDefinition);
    }
    wasAdded = true;
    if(wasAdded)
        Collections.sort(externalDefinitions, externalDefinitionsPriority);
    
    return wasAdded;
  }

  public boolean removeExternalDefinition(UniqueGenBody aExternalDefinition)
  {
    boolean wasRemoved = false;
    if (externalDefinitions.contains(aExternalDefinition))
    {
      externalDefinitions.remove(aExternalDefinition);
      aExternalDefinition.setExternalPackage(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  /* Code from template association_sorted_serializable_readObject */ 
  private void readObject(java.io.ObjectInputStream in)
  throws Exception
  {
    in.defaultReadObject();

    includesPriority = 
      Comparator.comparing(GenDepend::getPriority);
    externalDefinitionsPriority = 
      Comparator.comparing(UniqueGenBody::getPriority);
    classesPriority = 
      Comparator.comparing(GenClass::getPriority);
    predefinitionsPriority = 
      Comparator.comparing(UniqueGenBody::getPriority);
  }
  
  public void delete()
  {
    while( !includes.isEmpty() )
    {
      includes.get(0).setGenPackage(null);
    }
    while( !classes.isEmpty() )
    {
      classes.get(0).setGenPackage(null);
    }
    while( !predefinitions.isEmpty() )
    {
      predefinitions.get(0).setGenPackage(null);
    }
    while( !children.isEmpty() )
    {
      children.get(0).setParent(null);
    }
    if (parent != null)
    {
      GenPackage placeholderParent = parent;
      this.parent = null;
      placeholderParent.removeChild(this);
    }
    while( !externalDefinitions.isEmpty() )
    {
      externalDefinitions.get(0).setExternalPackage(null);
    }
  }


  /**
   * Cpp-specific
   */
  // line 67 "../../../../../UmpleTLTemplates/Core.ump"
  public Boolean hasTemplate(String template){
    for(GenClass genClass: getClasses()){
			if(genClass.isGeneratable()){
				for(GenSpecializedDefinition specializedDefinition: genClass.getSpecializedDefinitions()){
					if(template.equals(specializedDefinition.getContent())){
						return true;
					}
				}
			}
		}
		
		return false;
  }

  // line 81 "../../../../../UmpleTLTemplates/Core.ump"
  public List<UniqueGenBody> getAllPredefinitions(){
    List<UniqueGenBody> all = new ArrayList<UniqueGenBody>();
		GenPackage rootPackage = rootPackage();
		for (GenPackage genPackage : rootPackage.allPackages()) {
			for (UniqueGenBody body : genPackage.getPredefinitions()) {
				if (!all.contains(body)) {
					all.add(body);
				}
			}
		}
		return all;
  }

  // line 278 "../../../../../UmpleTLTemplates/Core.ump"
  public String definitionString(){
    List<String> definitions= new ArrayList<String>();
		List<String> names= new ArrayList<String>();
		for(GenPackage genPackage: allPackages()){
			for(GenClass genClass: genPackage.getClasses()){
				String namespaceOpening = genClass.callNamespaceBegin();
		    	if(!namespaceOpening.isEmpty() && !definitions.contains(namespaceOpening)){
		    		definitions.add(namespaceOpening);
		    	}
		    	
		    	String namespaceClosing = genClass.callNamespaceEnd();
				if(!namespaceClosing.isEmpty() && !definitions.contains(namespaceClosing)){
		    		definitions.add(namespaceClosing);
		    	}
		    	
		    	if(genClass.hasEnumerations()){
		    		GenEnum first = genClass.getEnumeration(0);
		    		definitions.add(first.callNamespaceBegin());
		    		definitions.add(first.callNamespaceEnd());
		    		for(GenEnum genEnum: genClass.getEnumerations()){
		    			String enumName = genEnum.getName();
		    			definitions.add(genEnum.callPathDefinition(names.contains(enumName)));
		    			names.add(enumName);
		    		}
		    	}
			}
		}
	    
	    return definitions.stream().collect(Collectors.joining(NL));
  }

  // line 309 "../../../../../UmpleTLTemplates/Core.ump"
  public String namespaceDefinition(){
    List<String> definitions= new ArrayList<String>();
		for(GenPackage genPackage: allPackages()){
			for(GenClass genClass: genPackage.getClasses()){
		    	String namespaceOpening = genClass.namespace("_", null, "_BEGIN");
		    	if(!namespaceOpening.isEmpty() && !definitions.contains(namespaceOpening)){
		    		definitions.add(namespaceOpening);
		    	}
				
				String namespaceClosing = genClass.namespace("_", null, "_END");
				if(!namespaceClosing.isEmpty() && !definitions.contains(namespaceClosing)){
		    		definitions.add(namespaceClosing);
		    	}

		    	if(genClass.hasEnumerations()){
		    		GenEnum first = genClass.getEnumeration(0);
		    		definitions.add(first.namespaceOpening());
		    		definitions.add(first.namespaceClosing());
		    	}
		    }
		}
	    
	    return definitions.stream().collect(Collectors.joining(NL));
  }

  // line 344 "../../../../../UmpleTLTemplates/Core.ump"
  public List<String> libraries(){
    List<String> libraries= new ArrayList<String>();
		for(GenDepend include: getIncludes()){
			String namesapce= include.namespaceDeclaration();
			if(namesapce!= null && !namesapce.isEmpty() && !libraries.contains(namesapce)){
				libraries.add(namesapce);
			}
		}
		
		return libraries;
  }

  // line 356 "../../../../../UmpleTLTemplates/Core.ump"
  public List<String> includes(){
    List<String> declarations= new ArrayList<String>();
		
		for(GenDepend include: getIncludes()){
			declarations.add(include.declaration());
		}
		
		return declarations;
  }

  // line 366 "../../../../../UmpleTLTemplates/Core.ump"
  public String fullIncludes(){
    String all= libraryStatements();
		String include= includeStatements();
		return Arrays.asList(new String[]{all, include}).stream().collect(Collectors.joining(NL+ NL));
  }

  // line 408 "../../../../../UmpleTLTemplates/Core.ump"
  public GenPackage getGenPackage(){
    return this;
  }

  // line 412 "../../../../../UmpleTLTemplates/Core.ump"
  public GenClass classByName(String name){
    return classByName(name, new ArrayList<GenClass>());
  }

  // line 416 "../../../../../UmpleTLTemplates/Core.ump"
  public GenClass classByName(String name, List<GenClass> visited){
    if(name== null){
			return null;
		}
		
		for(GenClass genClass: this.getClasses()){
			if(name.equals(genClass.getName())){
				return genClass;
			}
		}
		
		for(GenPackage genPackage: this.getChildren()){
			GenClass genClass= genPackage.classByName(name, visited);
			if(genClass!= null){
				return genClass;
			}
		}
		
		return null;
  }

  // line 437 "../../../../../UmpleTLTemplates/Core.ump"
  public GenPackage packageByName(String name){
    if(name== null){
			return null;
		}
		
		return _packageByName(name);
  }

  // line 445 "../../../../../UmpleTLTemplates/Core.ump"
  public GenPackage _packageByName(String name){
    if(name.equals(getName())){
			return this;
		}
		
		for(GenPackage genPackage: this.getChildren()){
			GenPackage result= genPackage._packageByName(name);
			if(result!= null){
				return result;
			}
		}
		
		return null;
  }

  // line 460 "../../../../../UmpleTLTemplates/Core.ump"
  public String rootIncludeName(){
    return rootPackage().getProject()+ "_Model";
  }

  // line 467 "../../../../../UmpleTLTemplates/Core.ump"
  public Boolean hasRemoteClass(){
    for(GenClass genClass: getClasses()){
			if(genClass.getIsRemote()){
				return true;
			}
		}
		
		return false;
  }

  // line 480 "../../../../../UmpleTLTemplates/Core.ump"
  public String externalDefinitions(String reference){
    if(reference == null){
			return "";
		}
		
		List<String> methods= new ArrayList<String>();
		for(GenClass genClass: getClasses()){
			if(genClass.isGeneratable()){
				for(GenMethod genMethod: genClass.getMethods()){
					if(reference.equals(genMethod.getExternalDefinition())){
						String declaration = "  "+ genMethod.declaration();
						if(!methods.contains(declaration)){
							methods.add(declaration);
						}
					}
				}
			}
		}
		
		return methods.stream().collect(Collectors.joining(NL));
  }

  // line 502 "../../../../../UmpleTLTemplates/Core.ump"
  public String externalIncompleteDefinitions(String reference){
    if(reference == null){
			return "";
		}
		
		List<String> incompletes= new ArrayList<String>();
		for(GenClass genClass: getClasses()){
			if(genClass.isGeneratable()){
				for(GenMethod genMethod: genClass.getMethods()){
					if(reference.equals(genMethod.getExternalDefinition())){
						for(GenMethodParameter parameter: genMethod.getParameters()){
							String incompleteDeclaration = new GenIncompleteDefinition(parameter.getCrudType()).declaration();
							
							if(!incompletes.contains(incompleteDeclaration)){
								incompletes.add(incompleteDeclaration);
							}
						}
					}
				}
			}
		}
		
		return incompletes.stream().collect(Collectors.joining(NL));
  }

  // line 1097 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String listAliases(){
    List<String> all= new ArrayList<String>();
		GenPackage rootPackage = rootPackage();
		all.add(rootPackage.rootAliasStatement(rootPackage.getName(), rootPackage.rootIncludeName()));
		
		for(GenPackage genPackage: rootPackage.allPackages()){
			for(GenClass genClass: genPackage.getClasses()){
				if(genClass.isGeneratable()){
					String type= genClass.getName();
					String namespace= genClass.getNamespace();
					String aliasStatement = aliasStatement(type.toString(), namespace);
					all.add(aliasStatement);
				}
			}
		}
		
		return all.stream().collect(Collectors.joining(NL));
  }

  // line 1118 "../../../../../UmpleTLTemplates/Attributes.ump"
  public GenPackage rootPackage(){
    GenPackage root= this;
		while(root.getParent()!= null){
			root= root.getParent();
		}
		return root;
  }

  // line 1126 "../../../../../UmpleTLTemplates/Attributes.ump"
  public List<GenClass> allClasses(){
    List<GenClass> all= new ArrayList<GenClass>();
		for(GenPackage genPackage: allPackages()){
			for(GenClass genClass: genPackage.getClasses()){
				if(!all.contains(genClass)){
					all.add(genClass);
				}
			}
		}
		
		return all;
  }

  // line 1139 "../../../../../UmpleTLTemplates/Attributes.ump"
  public List<GenPackage> allPackages(){
    List<GenPackage> all= new ArrayList<GenPackage>();
		_allPackages(rootPackage(), all);
		return all;
  }

  // line 1145 "../../../../../UmpleTLTemplates/Attributes.ump"
  public List<GenPackage> _allPackages(GenPackage current, List<GenPackage> all){
    if(!all.contains(current)){
			all.add(current);
		}
		
		List<GenPackage> results= current.getChildren();
		for(GenPackage child: results){
			_allPackages(child, all);
		}
		
		return all;
  }

  // line 21 "../../../../../UmpleTLTemplates/Depend.ump"
  public String includeNamespace(){
    return getName();
  }

  // line 416 "../../../../../UmpleTLTemplates/Depend.ump"
  public String mainFunctionName(){
    return rootPackage().getProject()+ "_Main.cpp";
  }

  // line 420 "../../../../../UmpleTLTemplates/Depend.ump"
  public String includeAllTypes(){
    List<String> includes= new ArrayList<String>();
		for(GenClass genClass: allClasses()){
			if(genClass.isGeneratable()){
				GenDepend addDeclaration = genClass.addDeclaration(genClass.getName(), genClass.getNamespace());
				includes.add(addDeclaration.declaration());
			}
		}
		
		return includes.stream().collect(Collectors.joining("\n"));
  }

  // line 432 "../../../../../UmpleTLTemplates/Depend.ump"
  public String listAllFiles(){
    List<String> includes= new ArrayList<String>();
		String rootIncludeName= rootIncludeName();
		includes.add(rootIncludeName+ ".h");
		includes.add(mainFunctionName());
		
		for(GenClass genClass: allClasses()){
			if(genClass.isGeneratable()){
				String qName= genClass.qualifiedName();
				includes.add(qName+ ".h");
				includes.add(qName+ ".cpp");
			}
		}
		
		return includes.stream().collect(Collectors.joining("\n"));
  }

  // line 449 "../../../../../UmpleTLTemplates/Depend.ump"
  public String listAllMakeNamespaces(){
    List<String> namespaces= new ArrayList<String>();
		for(GenPackage genPackage: allPackages()){
			String includeNamespace = genPackage.getNamespace();
			if(includeNamespace!= null && !includeNamespace.isEmpty()){
				String call= cMakeFolders(toPath(includeNamespace));
				if(!namespaces.contains(call)){
					namespaces.add(call);
				}
			}
		}
		
		return namespaces.stream().collect(Collectors.joining("\n"));
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait TypeHelper.
   * Trait TypeHelper has been used in classes: 'GenPackage' 
   */
  // line 933 "../../../../../UmpleTLTemplates/Attributes.ump"
  public Boolean isString(String type){
    switch (type) {
		case "String":
		case "string":
			return true;
		default:
			return false;
		}
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait TypeHelper.
   * Trait TypeHelper has been used in classes: 'GenPackage' 
   */
  // line 943 "../../../../../UmpleTLTemplates/Attributes.ump"
  public Boolean isBoolean(String type){
    switch (type) {
		case "Boolean":
		case "boolean":
		case "bool":
			return true;
		default:
			return false;
		}
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait TypeHelper.
   * Trait TypeHelper has been used in classes: 'GenPackage' 
   */
  // line 954 "../../../../../UmpleTLTemplates/Attributes.ump"
  public Boolean isPrimitive(String type){
    switch (type) {
		case "Integer":
		case "int":
		case "String":
		case "string":
		case "Double":
		case "double":
		case "Float":
		case "float":
		case "Long":
		case "long":
		case "Boolean":
		case "bool":
		case "Character":
		case "char":
			return true;
		default:
			return false;
		}
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait TypeHelper.
   * Trait TypeHelper has been used in classes: 'GenPackage' 
   */
  // line 976 "../../../../../UmpleTLTemplates/Attributes.ump"
  public Boolean isPointer(String type){
    if(type== null || type.isEmpty()){
			return false;
		}
		
		switch (type) {
		case "time_t":
		case "tm":
			return true;
		default:
			if(isObject(type)){
				return true;
			}
		}
	    return false;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait TypeHelper.
   * Trait TypeHelper has been used in classes: 'GenPackage' 
   */
  // line 993 "../../../../../UmpleTLTemplates/Attributes.ump"
  public Boolean isObject(String type){
    if(type == null){
			return false;
		}
		
		return rootPackage().classByName(type) != null;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait TypeHelper.
   * Trait TypeHelper has been used in classes: 'GenPackage' 
   */
  // line 1001 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String getNormalizedType(String type){
    String value= interceptType(type);
		if(isPointer(value)){
			value+= "*";
		}
		
		return value;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait TypeHelper.
   * Trait TypeHelper has been used in classes: 'GenPackage' 
   */
  // line 1010 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String interceptType(String type){
    if(type== null){
			return "void";
		}
		
		switch (type) {
		case "null":
		case "NULL":
			return "void";
		case "Time":
			return "time_t";
		case "Date":
			return "tm";
		case "String":
		case "StringBuilder":
			return "string";
		case "Character":
			return "char";
		case "Double":
			return "double";
		case "Float":
			return "float";
		case "integer":
		case "Integer":
			return "int";
		case "Boolean":
		case "boolean":
			return "bool";
		default:
			return type;
		}
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait TypeHelper.
   * Trait TypeHelper has been used in classes: 'GenPackage' 
   */
  // line 1043 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String getDefaultValue(String type){
    switch (type) {
		case "Integer":
		case "int":
		case "Double":
		case "double":
		case "Float":
		case "float":
		case "Long":
		case "long":
			return "0";
		case "String":
		case "string":
		case "Character":
		case "char":
			return "\"\"";
		default:
			return "NULL";
		}
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait TypeHelper.
   * Trait TypeHelper has been used in classes: 'GenPackage' 
   */
  // line 1064 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String interceptValueForType(String type, String value){
    switch (type) {
		case "time_t":
		case "Time":
		case "time":
			return value== null? "NULL" : "ParseTime("+value+")";	//TODO: regex to check for value format
		case "tm":
		case "Date":
		case "date":
			return value== null? "NULL" : "ParseDate("+value+")";
			
		default:
			return value;
		}
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


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1363 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String preprocessingDefinition(String suffix){
    String namespace= this.getNamespace();
		String name= this.getName();
		
		if(namespace.isEmpty()){
			return (name+"_"+suffix).toUpperCase();
		}else{
			return (namespace.replace("/", "_")+"_"+name+"_"+suffix).toUpperCase();
		}
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1374 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String namespaceOpening(){
    return namespaceOpening(getNamespace())+ NL;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1378 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String namespaceClosing(){
    return namespaceClosing(getNamespace())+ NL;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1382 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String namespaceOpening(String namespace){
    return namespace("_", null, "_BEGIN", namespace);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1386 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String namespaceClosing(String namespace){
    return namespace("_", null, "_END", namespace);
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1390 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String namespace(String join, String prepend, String append){
    return namespace(join, prepend, append, getNamespace());
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1394 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String namespace(String join, String prepend, String append, String namespace){
    String _namespace= namespaceEnclosure(join, namespace);
		if(_namespace.isEmpty()){
			return _namespace;
		}
		
		if(prepend != null){
			_namespace= prepend+ _namespace;
		}
		
		if(append != null){
			_namespace= _namespace+ append;
		}
		
		return _namespace;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1411 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String preprocessingDefinitionName(){
    String _namespace= namespaceEnclosure();
		if(_namespace.isEmpty()){
			_namespace= getGenPackage().getName();
		}
		_namespace= "DEF_"+ _namespace;	//A protection against package names that start with numbers; otherwise, this definition will be invalid
		_namespace+= "_"+ getName();
		return _namespace.toUpperCase();
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1421 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String qualifiedName(){
    String fullPath= fullPath();
		if(fullPath== null || fullPath.isEmpty()){
			return getName();
		}
		
		return fullPath+ "/"+ getName();
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1430 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String fullPath(){
    String _namespace= getNamespace();
		if(_namespace.isEmpty()){
			_namespace= getGenPackage().getName();
		}else{
			_namespace= toPath(_namespace);
		}
		return _namespace;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1440 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String toPath(String value){
    return value.replace(".", "/");
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1444 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String namespaceEnclosure(){
    return namespaceEnclosure("_");
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1448 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String namespaceEnclosure(String join){
    return namespaceEnclosure(join, getNamespace());
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1452 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String namespaceEnclosure(String join, String _namespace){
    if(_namespace== null || _namespace.isEmpty()){
			return "";
		}
		
		String normalized= _namespace.replace("/", ".").replace("_", ".");
		String[] splits = normalized.split("\\.");
		_namespace= Arrays.asList(splits).stream().collect(Collectors.joining(join));
		
		return _namespace;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1464 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String fullQualifiedName(){
    return fullQualifiedName(getNamespace());
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1468 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String fullQualifiedName(String _namespace){
    String name= this.getName();
		
		String normalizedNamespace= "";
		if(!_namespace.isEmpty()){
			normalizedNamespace= namespaceCallPath(_namespace)+ "::"+ name;
		}else{
			normalizedNamespace= name;
		}
		return normalizedNamespace;
  }


  /**
   * Please do not modify the following method.
   * The following method comes from trait Processable.
   * Trait Processable has been used in classes: 'GenClass' 'GenPackage' 'GenDepend' 
   */
  // line 1480 "../../../../../UmpleTLTemplates/Attributes.ump"
  public String namespaceCallPath(String _namespace){
    return _namespace.replace(".", "::").replace("_", "::");
  }

  private String _createSpacesString(int numSpaces){
    
  StringBuilder spaces =  new StringBuilder();
      for(int i=0; i <numSpaces; i++) {
          spaces.append(" ");
      }
      return spaces.toString();
  }

  public StringBuilder _namespacesAndPredefinition(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_0);
    realSb.append(namespaceDefinition());
    realSb.append(TEXT_1);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String namespacesAndPredefinition(){
        StringBuilder sb = new StringBuilder();
    return this._namespacesAndPredefinition(0,sb).toString(); 
  }

  public StringBuilder _libraryStatements(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	List<String> libraries= libraries();
	if(libraries.isEmpty()){
		return sb;
	}

    realSb.append(TEXT_2);
    realSb.append(libraries.stream().collect(Collectors.joining(NL)));

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String libraryStatements(){
        StringBuilder sb = new StringBuilder();
    return this._libraryStatements(0,sb).toString(); 
  }

  public StringBuilder _includeStatements(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	List<String> includes= includes();
	if(includes.isEmpty()){
		return sb;
	}

    realSb.append(TEXT_3);
    realSb.append(includes.stream().collect(Collectors.joining(NL)));

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String includeStatements(){
        StringBuilder sb = new StringBuilder();
    return this._includeStatements(0,sb).toString(); 
  }

  public StringBuilder _cr(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_4);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String cr(){
        StringBuilder sb = new StringBuilder();
    return this._cr(0,sb).toString(); 
  }

  public StringBuilder _nullImplementation(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_5);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String nullImplementation(){
        StringBuilder sb = new StringBuilder();
    return this._nullImplementation(0,sb).toString(); 
  }

  public StringBuilder _copyright(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_6);
    realSb.append(getVersion());
    realSb.append(TEXT_7);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String copyright(){
        StringBuilder sb = new StringBuilder();
    return this._copyright(0,sb).toString(); 
  }

  public StringBuilder _initObjectConnection(Integer numSpaces, StringBuilder sb, String instance, String point){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_8);
    realSb.append(instance);
    realSb.append(point);
    realSb.append(TEXT_9);
    realSb.append(instance);
    realSb.append(point);
    realSb.append(TEXT_10);
    realSb.append(instance);
    realSb.append(point);
    realSb.append(TEXT_11);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String initObjectConnection(String instance, String point){
        StringBuilder sb = new StringBuilder();
    return this._initObjectConnection(0,sb,instance,point).toString(); 
  }

  public StringBuilder _getLocalHostInvoke(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_12);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String getLocalHostInvoke(){
        StringBuilder sb = new StringBuilder();
    return this._getLocalHostInvoke(0,sb).toString(); 
  }

  public StringBuilder _getLocalHost(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_13);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String getLocalHost(){
        StringBuilder sb = new StringBuilder();
    return this._getLocalHost(0,sb).toString(); 
  }

  public StringBuilder _publishSubscribeAPI(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_14);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String publishSubscribeAPI(){
        StringBuilder sb = new StringBuilder();
    return this._publishSubscribeAPI(0,sb).toString(); 
  }

  public StringBuilder _assignCall(Integer numSpaces, StringBuilder sb, String name, String value){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(name);
    realSb.append(TEXT_15);
    realSb.append(value);
    realSb.append(TEXT_16);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String assignCall(String name, String value){
        StringBuilder sb = new StringBuilder();
    return this._assignCall(0,sb,name,value).toString(); 
  }

  public StringBuilder _aliasStatement(Integer numSpaces, StringBuilder sb, String type, String namespace){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String root= namespace.replace(".", BACK_SLASH);
	String target= namespace.replace(".", "/");
	
	
    realSb.append(TEXT_17);
    realSb.append(BACK_SLASH);
    realSb.append(root);
    realSb.append(BACK_SLASH);
    realSb.append(type);
    realSb.append(TEXT_18);
    realSb.append(target);
    realSb.append(TEXT_19);
    realSb.append(type);
    realSb.append(TEXT_20);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String aliasStatement(String type, String namespace){
        StringBuilder sb = new StringBuilder();
    return this._aliasStatement(0,sb,type,namespace).toString(); 
  }

  public StringBuilder _rootAliasStatement(Integer numSpaces, StringBuilder sb, String base, String name){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_21);
    realSb.append(BACK_SLASH);
    realSb.append(base);
    realSb.append(BACK_SLASH);
    realSb.append(name);
    realSb.append(TEXT_22);
    realSb.append(name);
    realSb.append(TEXT_23);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String rootAliasStatement(String base, String name){
        StringBuilder sb = new StringBuilder();
    return this._rootAliasStatement(0,sb,base,name).toString(); 
  }

  public StringBuilder _singletonTemplateDefinition(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_24);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String singletonTemplateDefinition(){
        StringBuilder sb = new StringBuilder();
    return this._singletonTemplateDefinition(0,sb).toString(); 
  }

  public StringBuilder _getSetElementTemplateImplementation(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_25);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String getSetElementTemplateImplementation(){
        StringBuilder sb = new StringBuilder();
    return this._getSetElementTemplateImplementation(0,sb).toString(); 
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
    
    realSb.append(TEXT_26);

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
    
    realSb.append(TEXT_27);

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

  public StringBuilder _getVectorElementTemplateImplementation(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_28);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String getVectorElementTemplateImplementation(){
        StringBuilder sb = new StringBuilder();
    return this._getVectorElementTemplateImplementation(0,sb).toString(); 
  }

  public StringBuilder _timeHelpCode(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_29);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String timeHelpCode(){
        StringBuilder sb = new StringBuilder();
    return this._timeHelpCode(0,sb).toString(); 
  }

  public StringBuilder _mainFunction(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String copyRight=  rootPackage().copyright();
	String includes = includeAllTypes();
	
	List<String> mainCalls= new ArrayList<String>();
	for(GenClass genClass: allClasses()){
		GenMethod methodByName = genClass.methodByName("main");
		if(methodByName!= null){
			mainCalls.add("::"+ genClass.fullQualifiedName()+ "::main(argc, argv);");
		}
	}
	
	String contents = mainCalls.stream().collect(Collectors.joining(NL));


    realSb.append(copyRight);
    realSb.append(TEXT_30);
    realSb.append(includes);
    realSb.append(TEXT_31);
    realSb.append(StringUtil.indent(contents, 1));
    realSb.append(TEXT_32);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String mainFunction(){
        StringBuilder sb = new StringBuilder();
    return this._mainFunction(0,sb).toString(); 
  }

  public StringBuilder _cMakeFolders(Integer numSpaces, StringBuilder sb, String directory){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_33);
    realSb.append(directory);
    realSb.append(TEXT_34);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String cMakeFolders(String directory){
        StringBuilder sb = new StringBuilder();
    return this._cMakeFolders(0,sb,directory).toString(); 
  }

  public StringBuilder _cMake(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
String projectName = getProject();
String includes= listAllFiles();
String namespaces= listAllMakeNamespaces();


    realSb.append(TEXT_35);
    realSb.append(projectName);
    realSb.append(TEXT_36);
    realSb.append(namespaces);
    realSb.append(TEXT_37);
    realSb.append(includes);
    realSb.append(TEXT_38);
    realSb.append(projectName);
    realSb.append(TEXT_39);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String cMake(){
        StringBuilder sb = new StringBuilder();
    return this._cMake(0,sb).toString(); 
  }

  public StringBuilder _emitHeader(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	
	String copyRight= rootPackage().copyright();
	String fullName= preprocessingDefinitionName();
	String rootName= rootIncludeName();
	String aliases= listAliases();
	boolean isRemote= hasRemoteClass();
	String definedMacros= definitionString();
	String namespacesAndPredefinition= namespacesAndPredefinition();
	String predefinedTemplatesDefinitions= predefinedTemplatesDefinitions();
	
	
    realSb.append(copyRight);
    realSb.append(TEXT_40);
    realSb.append(fullName);
    realSb.append(TEXT_41);
    realSb.append(fullName);
    realSb.append(TEXT_42);
    realSb.append(aliases);
    realSb.append(TEXT_43);
    realSb.append(rootName);
    realSb.append(TEXT_44);
    if(isRemote){
    realSb.append(TEXT_45);
    }
    realSb.append(TEXT_46);
    realSb.append(fullIncludes());
    realSb.append(TEXT_47);
    realSb.append(definedMacros);
    realSb.append(namespacesAndPredefinition);
    realSb.append(TEXT_48);
    realSb.append(predefinedTemplatesDefinitions);
    realSb.append(TEXT_49);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String emitHeader(){
        StringBuilder sb = new StringBuilder();
    return this._emitHeader(0,sb).toString(); 
  }

  public StringBuilder _jsonArray(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_50);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String jsonArray(){
        StringBuilder sb = new StringBuilder();
    return this._jsonArray(0,sb).toString(); 
  }

  public StringBuilder _jsonArrayEntry(Integer numSpaces, StringBuilder sb, String type){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    realSb.append(TEXT_51);
    realSb.append(type);
    realSb.append(TEXT_52);
    realSb.append(type);
    realSb.append(TEXT_53);
    realSb.append(type);
    realSb.append(TEXT_54);
    realSb.append(type);
    realSb.append(TEXT_55);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String jsonArrayEntry(String type){
        StringBuilder sb = new StringBuilder();
    return this._jsonArrayEntry(0,sb,type).toString(); 
  }

  public StringBuilder _predefinedTemplatesDefinitions(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    
	String predefinedPackageContents= getAllPredefinitions().stream().map(GenBody::getBody).collect(Collectors.joining(NL));
	String templateDefinitions= threadImplementation();
//	if(hasRemoteClass()){
//		templateDefinitions= this.threadImplementation()+ templateDefinitions;
//	}
	String definitionFullPath= preprocessingDefinitionName();
	

    realSb.append(TEXT_56);
    realSb.append(templateDefinitions);
    realSb.append(TEXT_57);
    realSb.append(predefinedPackageContents);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String predefinedTemplatesDefinitions(){
        StringBuilder sb = new StringBuilder();
    return this._predefinedTemplatesDefinitions(0,sb).toString(); 
  }

  public StringBuilder _threadImplementation(Integer numSpaces, StringBuilder sb){
    String spaces="";
    StringBuilder newCode = new StringBuilder();
    StringBuilder realSb = sb;
    if(numSpaces > 0) {
        realSb = newCode;
        spaces = _createSpacesString(numSpaces);
        newCode.append(spaces);
    }
    
    boolean isRemote= hasRemoteClass();
    realSb.append(TEXT_58);
    realSb.append(NL);
    realSb.append(TEXT_59);
    realSb.append(NL);
    realSb.append(TEXT_60);
    realSb.append(NL);
    realSb.append(TEXT_61);
    realSb.append(NL);
    realSb.append(TEXT_62);
    realSb.append(NL);
    realSb.append(TEXT_63);
    realSb.append(NL);
    realSb.append(TEXT_64);
    realSb.append(NL);
    realSb.append(TEXT_65);
    realSb.append(NL);
    realSb.append(TEXT_66);
    realSb.append(NL);
    realSb.append(TEXT_67);
    realSb.append(NL);
    realSb.append(TEXT_68);
    if(isRemote){
    realSb.append(TEXT_69);
    realSb.append(NL);
    realSb.append(TEXT_70);
    realSb.append(externalIncompleteDefinitions("JSON"));
    realSb.append(TEXT_71);
    realSb.append(externalDefinitions("JSON"));
    realSb.append(getExternalDefinitions().stream().map(GenBody::getBody).collect(Collectors.joining(NL)));
    realSb.append(TEXT_72);
    realSb.append(NL);
    realSb.append(TEXT_73);
    realSb.append(NL);
    realSb.append(TEXT_74);
    realSb.append(NL);
    realSb.append(TEXT_75);
    realSb.append(NL);
    realSb.append(TEXT_76);
    realSb.append(NL);
    realSb.append(TEXT_77);
    realSb.append(NL);
    realSb.append(TEXT_78);
    realSb.append(NL);
    realSb.append(TEXT_79);
    realSb.append(NL);
    realSb.append(TEXT_80);
    }
    realSb.append(TEXT_81);

    if(numSpaces > 0) {
        newCode.replace(0, newCode.length(), Pattern.compile(NL).matcher(newCode).replaceAll(NL + spaces));
        sb.append(newCode);
    }
    return sb; 
  }

  public String threadImplementation(){
        StringBuilder sb = new StringBuilder();
    return this._threadImplementation(0,sb).toString(); 
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "language" + ":" + getLanguage()+ "," +
            "version" + ":" + getVersion()+ "," +
            "directory" + ":" + getDirectory()+ "," +
            "project" + ":" + getProject()+ "," +
            "priority" + ":" + getPriority()+ "," +
            "requiresThread" + ":" + getRequiresThread()+ "," +
            "namespace" + ":" + getNamespace()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "includesPriority" + "=" + (getIncludesPriority() != null ? !getIncludesPriority().equals(this)  ? getIncludesPriority().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "externalDefinitionsPriority" + "=" + (getExternalDefinitionsPriority() != null ? !getExternalDefinitionsPriority().equals(this)  ? getExternalDefinitionsPriority().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "classesPriority" + "=" + (getClassesPriority() != null ? !getClassesPriority().equals(this)  ? getClassesPriority().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "predefinitionsPriority" + "=" + (getPredefinitionsPriority() != null ? !getPredefinitionsPriority().equals(this)  ? getPredefinitionsPriority().toString().replaceAll("  ","    ") : "this" : "null");
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  


  
}
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.stats;
import cruise.umple.compiler.*;
import cruise.umple.util.*;
import java.util.*;

// line 61 "../../../../src/UmpleStats_Code.ump"
public class MetricsCollector
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //MetricsCollector Attributes
  private List<String> logs;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public MetricsCollector()
  {
    // line 69 "../../../../src/UmpleStats_Code.ump"
    init();
    // END OF UMPLE BEFORE INJECTION
    logs = new ArrayList<String>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template attribute_SetMany */
  public boolean addLog(String aLog)
  {
    boolean wasAdded = false;
    wasAdded = logs.add(aLog);
    return wasAdded;
  }

  public boolean removeLog(String aLog)
  {
    boolean wasRemoved = false;
    wasRemoved = logs.remove(aLog);
    return wasRemoved;
  }
  /* Code from template attribute_GetMany */
  public String getLog(int index)
  {
    String aLog = logs.get(index);
    return aLog;
  }

  public String[] getLogs()
  {
    String[] newLogs = logs.toArray(new String[logs.size()]);
    return newLogs;
  }

  public int numberOfLogs()
  {
    int number = logs.size();
    return number;
  }

  public boolean hasLogs()
  {
    boolean has = logs.size() > 0;
    return has;
  }

  public int indexOfLog(String aLog)
  {
    int index = logs.indexOf(aLog);
    return index;
  }

  public void delete()
  {}

  // line 78 "../../../../src/UmpleStats_Code.ump"
   private void init(){
    _currentProject = null;
    _allProjectIds = new ArrayList<String>();
    _allAssociationTypes = new ArrayList<String>();
    _projectToMetricsMap = new Hashtable<String, Hashtable<String, Integer>>();
  }

  // line 86 "../../../../src/UmpleStats_Code.ump"
   public boolean analyze(String projectName, String inputFilename){
    _currentProject = projectName;
    _allProjectIds.add(projectName);
    _projectToMetricsMap.put(projectName, new Hashtable<String,Integer>());

    try
    {
      UmpleFile umpleFile = new UmpleFile(inputFilename);
      UmpleModel model = new UmpleModel(umpleFile);
      model.setShouldGenerate(false);
      model.run();
      
      for (Association association : model.getAssociations())
      {
        String key = association.toGenericString();
        incrementAssociationType(key);
      }
      
      return true;
    }
    catch (Exception e)
    {
      addLog(e.getMessage() + ": " + inputFilename);
      _allProjectIds.remove(projectName);
      return false;
    }
  }

  // line 115 "../../../../src/UmpleStats_Code.ump"
   public void save(String outputFilename){
    SampleFileWriter.createFile(outputFilename, toString());
  }

  // line 120 "../../../../src/UmpleStats_Code.ump"
   public int numberOf(String projectId, String lowerBound, String upperBound){
    Hashtable<String,Integer> lookup = _projectToMetricsMap.get(projectId);
    if (lookup == null)
    {
      return 0;
    }
    int forward = currentNumberOfAssociationType(lowerBound + " -- " + upperBound,lookup);
    int backward = currentNumberOfAssociationType(upperBound + " -- " + lowerBound,lookup);
    return forward + backward;
  }

  // line 132 "../../../../src/UmpleStats_Code.ump"
   public String toString(){
    StringBuilder header = new StringBuilder();
    StringBuilder body = new StringBuilder();
    header.append("Project Id");
    for(int i=0; i<_allAssociationTypes.size(); i++)
    {
      header.append("\t#" + _allAssociationTypes.get(i));
    }
    header.append("\n");
    
    for (Iterator<String> p = _allProjectIds.iterator(); p.hasNext();)
    {
      String projectId = p.next();
      body.append(projectId);
      Hashtable<String, Integer> frequencyMap = _projectToMetricsMap.get(projectId);
      for(int i=0; i<_allAssociationTypes.size(); i++)
      {
        String key = _allAssociationTypes.get(i);
        int number = currentNumberOfAssociationType(key, frequencyMap);
        body.append("\t"+ number);
      }
      body.append("\n");
    }

    return header.toString() + body.toString();
  }

  // line 160 "../../../../src/UmpleStats_Code.ump"
   private int currentNumberOfAssociationType(String key, Hashtable<String,Integer> lookup){
    if (lookup.containsKey(key))
    {
      return lookup.get(key).intValue();
    }
    else
    {
      return 0;
    }
  }

  // line 172 "../../../../src/UmpleStats_Code.ump"
   private void incrementAssociationType(String key){
    incrementAssociationType(key,_projectToMetricsMap.get(_currentProject));
  }

  // line 177 "../../../../src/UmpleStats_Code.ump"
   private void incrementAssociationType(String key, Hashtable<String,Integer> lookup){
    if (!_allAssociationTypes.contains(key))
    {
      _allAssociationTypes.add(key);
    }
    Integer newInt = Integer.valueOf(currentNumberOfAssociationType(key,lookup) + 1);
    lookup.put(key, newInt);
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 71 "../../../../src/UmpleStats_Code.ump"
  private Hashtable<String, Hashtable<String, Integer>> _projectToMetricsMap ;
// line 72 "../../../../src/UmpleStats_Code.ump"
  private String _currentProject ;
// line 73 "../../../../src/UmpleStats_Code.ump"
  private ArrayList<String> _allProjectIds ;
// line 74 "../../../../src/UmpleStats_Code.ump"
  private ArrayList<String> _allAssociationTypes ;

  
}
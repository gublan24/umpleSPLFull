/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

// line 31 "../../../../src/Umlet.ump"
public class UmletElement
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UmletElement Attributes
  private String type;
  private String panelAttributes;
  private String additionalAttributes;

  //UmletElement Associations
  private Coordinate coordinate;
  private List<UmletDiagram> umletDiagrams;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmletElement(String aType, String aPanelAttributes, String aAdditionalAttributes, Coordinate aCoordinate)
  {
    type = aType;
    panelAttributes = aPanelAttributes;
    additionalAttributes = aAdditionalAttributes;
    if (!setCoordinate(aCoordinate))
    {
      throw new RuntimeException("Unable to create UmletElement due to aCoordinate. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    umletDiagrams = new ArrayList<UmletDiagram>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setType(String aType)
  {
    boolean wasSet = false;
    type = aType;
    wasSet = true;
    return wasSet;
  }

  public boolean setPanelAttributes(String aPanelAttributes)
  {
    boolean wasSet = false;
    panelAttributes = aPanelAttributes;
    wasSet = true;
    return wasSet;
  }

  public boolean setAdditionalAttributes(String aAdditionalAttributes)
  {
    boolean wasSet = false;
    additionalAttributes = aAdditionalAttributes;
    wasSet = true;
    return wasSet;
  }

  public String getType()
  {
    return type;
  }

  public String getPanelAttributes()
  {
    return panelAttributes;
  }

  public String getAdditionalAttributes()
  {
    return additionalAttributes;
  }
  /* Code from template association_GetOne */
  public Coordinate getCoordinate()
  {
    return coordinate;
  }
  /* Code from template association_GetMany */
  public UmletDiagram getUmletDiagram(int index)
  {
    UmletDiagram aUmletDiagram = umletDiagrams.get(index);
    return aUmletDiagram;
  }

  public List<UmletDiagram> getUmletDiagrams()
  {
    List<UmletDiagram> newUmletDiagrams = Collections.unmodifiableList(umletDiagrams);
    return newUmletDiagrams;
  }

  public int numberOfUmletDiagrams()
  {
    int number = umletDiagrams.size();
    return number;
  }

  public boolean hasUmletDiagrams()
  {
    boolean has = umletDiagrams.size() > 0;
    return has;
  }

  public int indexOfUmletDiagram(UmletDiagram aUmletDiagram)
  {
    int index = umletDiagrams.indexOf(aUmletDiagram);
    return index;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setCoordinate(Coordinate aNewCoordinate)
  {
    boolean wasSet = false;
    if (aNewCoordinate != null)
    {
      coordinate = aNewCoordinate;
      wasSet = true;
    }
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfUmletDiagrams()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addUmletDiagram(UmletDiagram aUmletDiagram)
  {
    boolean wasAdded = false;
    if (umletDiagrams.contains(aUmletDiagram)) { return false; }
    umletDiagrams.add(aUmletDiagram);
    if (aUmletDiagram.indexOfUmletElement(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aUmletDiagram.addUmletElement(this);
      if (!wasAdded)
      {
        umletDiagrams.remove(aUmletDiagram);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeUmletDiagram(UmletDiagram aUmletDiagram)
  {
    boolean wasRemoved = false;
    if (!umletDiagrams.contains(aUmletDiagram))
    {
      return wasRemoved;
    }

    int oldIndex = umletDiagrams.indexOf(aUmletDiagram);
    umletDiagrams.remove(oldIndex);
    if (aUmletDiagram.indexOfUmletElement(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aUmletDiagram.removeUmletElement(this);
      if (!wasRemoved)
      {
        umletDiagrams.add(oldIndex,aUmletDiagram);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addUmletDiagramAt(UmletDiagram aUmletDiagram, int index)
  {  
    boolean wasAdded = false;
    if(addUmletDiagram(aUmletDiagram))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUmletDiagrams()) { index = numberOfUmletDiagrams() - 1; }
      umletDiagrams.remove(aUmletDiagram);
      umletDiagrams.add(index, aUmletDiagram);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveUmletDiagramAt(UmletDiagram aUmletDiagram, int index)
  {
    boolean wasAdded = false;
    if(umletDiagrams.contains(aUmletDiagram))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUmletDiagrams()) { index = numberOfUmletDiagrams() - 1; }
      umletDiagrams.remove(aUmletDiagram);
      umletDiagrams.add(index, aUmletDiagram);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addUmletDiagramAt(aUmletDiagram, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    coordinate = null;
    ArrayList<UmletDiagram> copyOfUmletDiagrams = new ArrayList<UmletDiagram>(umletDiagrams);
    umletDiagrams.clear();
    for(UmletDiagram aUmletDiagram : copyOfUmletDiagrams)
    {
      aUmletDiagram.removeUmletElement(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "type" + ":" + getType()+ "," +
            "panelAttributes" + ":" + getPanelAttributes()+ "," +
            "additionalAttributes" + ":" + getAdditionalAttributes()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "coordinate = "+(getCoordinate()!=null?Integer.toHexString(System.identityHashCode(getCoordinate())):"null");
  }
}
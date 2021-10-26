/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.cpp.gen;
import java.util.*;

// line 534 "../../../../../UmpleTLTemplates/Core.ump"
public class GenConstructor
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GenConstructor Associations
  private List<GenMethodParameter> parameters;
  private List<GenParentMethodParameter> parentParameters;
  private GenClass owner;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GenConstructor(GenClass aOwner)
  {
    parameters = new ArrayList<GenMethodParameter>();
    parentParameters = new ArrayList<GenParentMethodParameter>();
    boolean didAddOwner = setOwner(aOwner);
    if (!didAddOwner)
    {
      throw new RuntimeException("Unable to create genConstructor due to owner. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public GenMethodParameter getParameter(int index)
  {
    GenMethodParameter aParameter = parameters.get(index);
    return aParameter;
  }

  public List<GenMethodParameter> getParameters()
  {
    List<GenMethodParameter> newParameters = Collections.unmodifiableList(parameters);
    return newParameters;
  }

  public int numberOfParameters()
  {
    int number = parameters.size();
    return number;
  }

  public boolean hasParameters()
  {
    boolean has = parameters.size() > 0;
    return has;
  }

  public int indexOfParameter(GenMethodParameter aParameter)
  {
    int index = parameters.indexOf(aParameter);
    return index;
  }
  /* Code from template association_GetMany */
  public GenParentMethodParameter getParentParameter(int index)
  {
    GenParentMethodParameter aParentParameter = parentParameters.get(index);
    return aParentParameter;
  }

  public List<GenParentMethodParameter> getParentParameters()
  {
    List<GenParentMethodParameter> newParentParameters = Collections.unmodifiableList(parentParameters);
    return newParentParameters;
  }

  public int numberOfParentParameters()
  {
    int number = parentParameters.size();
    return number;
  }

  public boolean hasParentParameters()
  {
    boolean has = parentParameters.size() > 0;
    return has;
  }

  public int indexOfParentParameter(GenParentMethodParameter aParentParameter)
  {
    int index = parentParameters.indexOf(aParentParameter);
    return index;
  }
  /* Code from template association_GetOne */
  public GenClass getOwner()
  {
    return owner;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfParameters()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addParameter(GenMethodParameter aParameter)
  {
    boolean wasAdded = false;
    if (parameters.contains(aParameter)) { return false; }
    GenConstructor existingGenMethodContr = aParameter.getGenMethodContr();
    if (existingGenMethodContr == null)
    {
      aParameter.setGenMethodContr(this);
    }
    else if (!this.equals(existingGenMethodContr))
    {
      existingGenMethodContr.removeParameter(aParameter);
      addParameter(aParameter);
    }
    else
    {
      parameters.add(aParameter);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeParameter(GenMethodParameter aParameter)
  {
    boolean wasRemoved = false;
    if (parameters.contains(aParameter))
    {
      parameters.remove(aParameter);
      aParameter.setGenMethodContr(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addParameterAt(GenMethodParameter aParameter, int index)
  {  
    boolean wasAdded = false;
    if(addParameter(aParameter))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfParameters()) { index = numberOfParameters() - 1; }
      parameters.remove(aParameter);
      parameters.add(index, aParameter);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveParameterAt(GenMethodParameter aParameter, int index)
  {
    boolean wasAdded = false;
    if(parameters.contains(aParameter))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfParameters()) { index = numberOfParameters() - 1; }
      parameters.remove(aParameter);
      parameters.add(index, aParameter);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addParameterAt(aParameter, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfParentParameters()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addParentParameter(GenParentMethodParameter aParentParameter)
  {
    boolean wasAdded = false;
    if (parentParameters.contains(aParentParameter)) { return false; }
    GenConstructor existingGenParentMethodContr = aParentParameter.getGenParentMethodContr();
    if (existingGenParentMethodContr == null)
    {
      aParentParameter.setGenParentMethodContr(this);
    }
    else if (!this.equals(existingGenParentMethodContr))
    {
      existingGenParentMethodContr.removeParentParameter(aParentParameter);
      addParentParameter(aParentParameter);
    }
    else
    {
      parentParameters.add(aParentParameter);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeParentParameter(GenParentMethodParameter aParentParameter)
  {
    boolean wasRemoved = false;
    if (parentParameters.contains(aParentParameter))
    {
      parentParameters.remove(aParentParameter);
      aParentParameter.setGenParentMethodContr(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addParentParameterAt(GenParentMethodParameter aParentParameter, int index)
  {  
    boolean wasAdded = false;
    if(addParentParameter(aParentParameter))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfParentParameters()) { index = numberOfParentParameters() - 1; }
      parentParameters.remove(aParentParameter);
      parentParameters.add(index, aParentParameter);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveParentParameterAt(GenParentMethodParameter aParentParameter, int index)
  {
    boolean wasAdded = false;
    if(parentParameters.contains(aParentParameter))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfParentParameters()) { index = numberOfParentParameters() - 1; }
      parentParameters.remove(aParentParameter);
      parentParameters.add(index, aParentParameter);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addParentParameterAt(aParentParameter, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOneToMany */
  public boolean setOwner(GenClass aOwner)
  {
    boolean wasSet = false;
    if (aOwner == null)
    {
      return wasSet;
    }

    GenClass existingOwner = owner;
    owner = aOwner;
    if (existingOwner != null && !existingOwner.equals(aOwner))
    {
      existingOwner.removeGenConstructor(this);
    }
    owner.addGenConstructor(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    while( !parameters.isEmpty() )
    {
      parameters.get(0).setGenMethodContr(null);
    }
    while( !parentParameters.isEmpty() )
    {
      parentParameters.get(0).setGenParentMethodContr(null);
    }
    GenClass placeholderOwner = owner;
    this.owner = null;
    if(placeholderOwner != null)
    {
      placeholderOwner.removeGenConstructor(this);
    }
  }

}
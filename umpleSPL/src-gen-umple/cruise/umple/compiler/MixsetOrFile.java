/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * A MixsetOrFile is an umple entity that is subject to require logic
 */
// line 18 "../../../../src/Mixset.ump"
public abstract class MixsetOrFile
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //MixsetOrFile Attributes
  private UmpleFile useUmpleFile;
  private int useUmpleLine;
  private boolean isMixset;

  //MixsetOrFile Associations
  private UmpleModel umpleModel;
  private FeatureLeaf featureLeaf;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public MixsetOrFile()
  {
    useUmpleFile = null;
    useUmpleLine = 0;
    isMixset = false;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setUseUmpleFile(UmpleFile aUseUmpleFile)
  {
    boolean wasSet = false;
    useUmpleFile = aUseUmpleFile;
    wasSet = true;
    return wasSet;
  }

  public boolean setUseUmpleLine(int aUseUmpleLine)
  {
    boolean wasSet = false;
    useUmpleLine = aUseUmpleLine;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsMixset(boolean aIsMixset)
  {
    boolean wasSet = false;
    isMixset = aIsMixset;
    wasSet = true;
    return wasSet;
  }

  /**
   * File where the use statement was encountered
   */
  public UmpleFile getUseUmpleFile()
  {
    return useUmpleFile;
  }

  public int getUseUmpleLine()
  {
    return useUmpleLine;
  }

  public boolean getIsMixset()
  {
    return isMixset;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsMixset()
  {
    return isMixset;
  }
  /* Code from template association_GetOne */
  public UmpleModel getUmpleModel()
  {
    return umpleModel;
  }

  public boolean hasUmpleModel()
  {
    boolean has = umpleModel != null;
    return has;
  }
  /* Code from template association_GetOne */
  public FeatureLeaf getFeatureLeaf()
  {
    return featureLeaf;
  }

  public boolean hasFeatureLeaf()
  {
    boolean has = featureLeaf != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setUmpleModel(UmpleModel aUmpleModel)
  {
    boolean wasSet = false;
    UmpleModel existingUmpleModel = umpleModel;
    umpleModel = aUmpleModel;
    if (existingUmpleModel != null && !existingUmpleModel.equals(aUmpleModel))
    {
      existingUmpleModel.removeMixsetOrFile(this);
    }
    if (aUmpleModel != null)
    {
      aUmpleModel.addMixsetOrFile(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToOptionalOne */
  public boolean setFeatureLeaf(FeatureLeaf aNewFeatureLeaf)
  {
    boolean wasSet = false;
    if (aNewFeatureLeaf == null)
    {
      FeatureLeaf existingFeatureLeaf = featureLeaf;
      featureLeaf = null;
      
      if (existingFeatureLeaf != null && existingFeatureLeaf.getMixsetOrFileNode() != null)
      {
        existingFeatureLeaf.setMixsetOrFileNode(null);
      }
      wasSet = true;
      return wasSet;
    }

    FeatureLeaf currentFeatureLeaf = getFeatureLeaf();
    if (currentFeatureLeaf != null && !currentFeatureLeaf.equals(aNewFeatureLeaf))
    {
      currentFeatureLeaf.setMixsetOrFileNode(null);
    }

    featureLeaf = aNewFeatureLeaf;
    MixsetOrFile existingMixsetOrFileNode = aNewFeatureLeaf.getMixsetOrFileNode();

    if (!equals(existingMixsetOrFileNode))
    {
      aNewFeatureLeaf.setMixsetOrFileNode(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (umpleModel != null)
    {
      UmpleModel placeholderUmpleModel = umpleModel;
      this.umpleModel = null;
      placeholderUmpleModel.removeMixsetOrFile(this);
    }
    if (featureLeaf != null)
    {
      featureLeaf.setMixsetOrFileNode(null);
    }
  }

  public abstract String getName();


  public String toString()
  {
    return super.toString() + "["+
            "useUmpleLine" + ":" + getUseUmpleLine()+ "," +
            "isMixset" + ":" + getIsMixset()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "useUmpleFile" + "=" + (getUseUmpleFile() != null ? !getUseUmpleFile().equals(this)  ? getUseUmpleFile().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "umpleModel = "+(getUmpleModel()!=null?Integer.toHexString(System.identityHashCode(getUmpleModel())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "featureLeaf = "+(getFeatureLeaf()!=null?Integer.toHexString(System.identityHashCode(getFeatureLeaf())):"null");
  }
}
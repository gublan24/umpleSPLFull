/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

/**
 * Each mixset statement creates a MixSetFragment
 */
// line 72 "../../../../src/Mixset.ump"
public class MixsetFragment
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //MixsetFragment Attributes
  private UmpleFile originalUmpFile;
  private int originalUmpLine;
  private boolean isParsed;
  private String body;

  //MixsetFragment Associations
  private Mixset mixset;
  private FragmentFeatureLeaf fragmentFeatureLeaf;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public MixsetFragment(UmpleFile aOriginalUmpFile, int aOriginalUmpLine, String aBody)
  {
    originalUmpFile = aOriginalUmpFile;
    originalUmpLine = aOriginalUmpLine;
    isParsed = false;
    body = aBody;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setOriginalUmpFile(UmpleFile aOriginalUmpFile)
  {
    boolean wasSet = false;
    originalUmpFile = aOriginalUmpFile;
    wasSet = true;
    return wasSet;
  }

  public boolean setOriginalUmpLine(int aOriginalUmpLine)
  {
    boolean wasSet = false;
    originalUmpLine = aOriginalUmpLine;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsParsed(boolean aIsParsed)
  {
    boolean wasSet = false;
    isParsed = aIsParsed;
    wasSet = true;
    return wasSet;
  }

  public boolean setBody(String aBody)
  {
    boolean wasSet = false;
    body = aBody;
    wasSet = true;
    return wasSet;
  }

  /**
   * The following attributes are used when generating the virtual
   * file for parsing, so any bugs can point back to the original file
   * where the fragment came from
   */
  public UmpleFile getOriginalUmpFile()
  {
    return originalUmpFile;
  }

  /**
   * line in originaUmpFile
   */
  public int getOriginalUmpLine()
  {
    return originalUmpLine;
  }

  /**
   * by default a fragment is not parsed, then this will be changed after parsing.
   */
  public boolean getIsParsed()
  {
    return isParsed;
  }

  /**
   * This is the text of the fragment
   * Note that it might be prefixed contextually thus:
   * if top level, the body is whatever is found in the curly brackets
   * if class X mixset Y {}, then wrapped in class X { }
   * if class X { mixset Y {...}} then wrapped in class X { }
   * if class X { mixset Y a; then just there are no curly brackets, and a is wrapped in class X {}
   */
  public String getBody()
  {
    return body;
  }
  /* Code from template association_GetOne */
  public Mixset getMixset()
  {
    return mixset;
  }

  public boolean hasMixset()
  {
    boolean has = mixset != null;
    return has;
  }
  /* Code from template association_GetOne */
  public FragmentFeatureLeaf getFragmentFeatureLeaf()
  {
    return fragmentFeatureLeaf;
  }

  public boolean hasFragmentFeatureLeaf()
  {
    boolean has = fragmentFeatureLeaf != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setMixset(Mixset aMixset)
  {
    boolean wasSet = false;
    Mixset existingMixset = mixset;
    mixset = aMixset;
    if (existingMixset != null && !existingMixset.equals(aMixset))
    {
      existingMixset.removeMixsetFragment(this);
    }
    if (aMixset != null)
    {
      aMixset.addMixsetFragment(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setFragmentFeatureLeaf(FragmentFeatureLeaf aFragmentFeatureLeaf)
  {
    boolean wasSet = false;
    FragmentFeatureLeaf existingFragmentFeatureLeaf = fragmentFeatureLeaf;
    fragmentFeatureLeaf = aFragmentFeatureLeaf;
    if (existingFragmentFeatureLeaf != null && !existingFragmentFeatureLeaf.equals(aFragmentFeatureLeaf))
    {
      existingFragmentFeatureLeaf.removeMixsetFragment(this);
    }
    if (aFragmentFeatureLeaf != null)
    {
      aFragmentFeatureLeaf.addMixsetFragment(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (mixset != null)
    {
      Mixset placeholderMixset = mixset;
      this.mixset = null;
      placeholderMixset.removeMixsetFragment(this);
    }
    if (fragmentFeatureLeaf != null)
    {
      FragmentFeatureLeaf placeholderFragmentFeatureLeaf = fragmentFeatureLeaf;
      this.fragmentFeatureLeaf = null;
      placeholderFragmentFeatureLeaf.removeMixsetFragment(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "originalUmpLine" + ":" + getOriginalUmpLine()+ "," +
            "isParsed" + ":" + getIsParsed()+ "," +
            "body" + ":" + getBody()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "originalUmpFile" + "=" + (getOriginalUmpFile() != null ? !getOriginalUmpFile().equals(this)  ? getOriginalUmpFile().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "mixset = "+(getMixset()!=null?Integer.toHexString(System.identityHashCode(getMixset())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "fragmentFeatureLeaf = "+(getFragmentFeatureLeaf()!=null?Integer.toHexString(System.identityHashCode(getFragmentFeatureLeaf())):"null");
  }
}
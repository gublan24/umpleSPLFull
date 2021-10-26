/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler;

// line 240 "../../../../src/Structure.ump"
public class MessageHandler
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //MessageHandler State Machines
  public enum CommunicationType { QUEUED, DATA, SYNC, NONE }
  private CommunicationType communicationType;

  //MessageHandler Associations
  private MessageStructure messageStructure;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public MessageHandler(MessageStructure aMessageStructure)
  {
    if (!setMessageStructure(aMessageStructure))
    {
      throw new RuntimeException("Unable to create MessageHandler due to aMessageStructure. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    setCommunicationType(CommunicationType.QUEUED);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getCommunicationTypeFullName()
  {
    String answer = communicationType.toString();
    return answer;
  }

  public CommunicationType getCommunicationType()
  {
    return communicationType;
  }

  public boolean setCommunicationType(CommunicationType aCommunicationType)
  {
    communicationType = aCommunicationType;
    return true;
  }
  /* Code from template association_GetOne */
  public MessageStructure getMessageStructure()
  {
    return messageStructure;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setMessageStructure(MessageStructure aNewMessageStructure)
  {
    boolean wasSet = false;
    if (aNewMessageStructure != null)
    {
      messageStructure = aNewMessageStructure;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {
    messageStructure = null;
  }

}
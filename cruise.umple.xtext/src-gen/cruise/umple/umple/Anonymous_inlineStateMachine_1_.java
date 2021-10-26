/**
 * <copyright>
 * </copyright>
 *
 */
package cruise.umple.umple;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonymous inline State Machine 1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cruise.umple.umple.Anonymous_inlineStateMachine_1_#getComment_1 <em>Comment 1</em>}</li>
 *   <li>{@link cruise.umple.umple.Anonymous_inlineStateMachine_1_#getState_1 <em>State 1</em>}</li>
 *   <li>{@link cruise.umple.umple.Anonymous_inlineStateMachine_1_#getTrace_1 <em>Trace 1</em>}</li>
 * </ul>
 * </p>
 *
 * @see cruise.umple.umple.UmplePackage#getAnonymous_inlineStateMachine_1_()
 * @model
 * @generated
 */
public interface Anonymous_inlineStateMachine_1_ extends EObject
{
  /**
   * Returns the value of the '<em><b>Comment 1</b></em>' containment reference list.
   * The list contents are of type {@link cruise.umple.umple.Comment_}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comment 1</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comment 1</em>' containment reference list.
   * @see cruise.umple.umple.UmplePackage#getAnonymous_inlineStateMachine_1__Comment_1()
   * @model containment="true"
   * @generated
   */
  EList<Comment_> getComment_1();

  /**
   * Returns the value of the '<em><b>State 1</b></em>' containment reference list.
   * The list contents are of type {@link cruise.umple.umple.State_}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State 1</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State 1</em>' containment reference list.
   * @see cruise.umple.umple.UmplePackage#getAnonymous_inlineStateMachine_1__State_1()
   * @model containment="true"
   * @generated
   */
  EList<State_> getState_1();

  /**
   * Returns the value of the '<em><b>Trace 1</b></em>' containment reference list.
   * The list contents are of type {@link cruise.umple.umple.Trace_}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trace 1</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trace 1</em>' containment reference list.
   * @see cruise.umple.umple.UmplePackage#getAnonymous_inlineStateMachine_1__Trace_1()
   * @model containment="true"
   * @generated
   */
  EList<Trace_> getTrace_1();

} // Anonymous_inlineStateMachine_1_

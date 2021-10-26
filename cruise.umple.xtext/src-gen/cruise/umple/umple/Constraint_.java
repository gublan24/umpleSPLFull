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
 * A representation of the model object '<em><b>Constraint </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cruise.umple.umple.Constraint_#getAnonymous_constraint_1_1 <em>Anonymous constraint 11</em>}</li>
 *   <li>{@link cruise.umple.umple.Constraint_#getConstraintBody_1 <em>Constraint Body 1</em>}</li>
 * </ul>
 * </p>
 *
 * @see cruise.umple.umple.UmplePackage#getConstraint_()
 * @model
 * @generated
 */
public interface Constraint_ extends EObject
{
  /**
   * Returns the value of the '<em><b>Anonymous constraint 11</b></em>' containment reference list.
   * The list contents are of type {@link cruise.umple.umple.Anonymous_constraint_1_}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Anonymous constraint 11</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Anonymous constraint 11</em>' containment reference list.
   * @see cruise.umple.umple.UmplePackage#getConstraint__Anonymous_constraint_1_1()
   * @model containment="true"
   * @generated
   */
  EList<Anonymous_constraint_1_> getAnonymous_constraint_1_1();

  /**
   * Returns the value of the '<em><b>Constraint Body 1</b></em>' containment reference list.
   * The list contents are of type {@link cruise.umple.umple.ConstraintBody_}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraint Body 1</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint Body 1</em>' containment reference list.
   * @see cruise.umple.umple.UmplePackage#getConstraint__ConstraintBody_1()
   * @model containment="true"
   * @generated
   */
  EList<ConstraintBody_> getConstraintBody_1();

} // Constraint_

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
 * A representation of the model object '<em><b>Interface Body </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cruise.umple.umple.InterfaceBody_#getInterfaceMemberDeclaration_1 <em>Interface Member Declaration 1</em>}</li>
 * </ul>
 * </p>
 *
 * @see cruise.umple.umple.UmplePackage#getInterfaceBody_()
 * @model
 * @generated
 */
public interface InterfaceBody_ extends EObject
{
  /**
   * Returns the value of the '<em><b>Interface Member Declaration 1</b></em>' containment reference list.
   * The list contents are of type {@link cruise.umple.umple.InterfaceMemberDeclaration_}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface Member Declaration 1</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface Member Declaration 1</em>' containment reference list.
   * @see cruise.umple.umple.UmplePackage#getInterfaceBody__InterfaceMemberDeclaration_1()
   * @model containment="true"
   * @generated
   */
  EList<InterfaceMemberDeclaration_> getInterfaceMemberDeclaration_1();

} // InterfaceBody_

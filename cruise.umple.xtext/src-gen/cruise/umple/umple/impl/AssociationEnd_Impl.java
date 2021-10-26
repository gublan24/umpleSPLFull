/**
 * <copyright>
 * </copyright>
 *
 */
package cruise.umple.umple.impl;

import cruise.umple.umple.AssociationEnd_;
import cruise.umple.umple.IsSorted_;
import cruise.umple.umple.Multiplicity_;
import cruise.umple.umple.UmplePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association End </b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cruise.umple.umple.impl.AssociationEnd_Impl#getMultiplicity_1 <em>Multiplicity 1</em>}</li>
 *   <li>{@link cruise.umple.umple.impl.AssociationEnd_Impl#getType_1 <em>Type 1</em>}</li>
 *   <li>{@link cruise.umple.umple.impl.AssociationEnd_Impl#getRoleName_1 <em>Role Name 1</em>}</li>
 *   <li>{@link cruise.umple.umple.impl.AssociationEnd_Impl#getIsSorted_1 <em>Is Sorted 1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationEnd_Impl extends MinimalEObjectImpl.Container implements AssociationEnd_
{
  /**
   * The cached value of the '{@link #getMultiplicity_1() <em>Multiplicity 1</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplicity_1()
   * @generated
   * @ordered
   */
  protected EList<Multiplicity_> multiplicity_1;

  /**
   * The default value of the '{@link #getType_1() <em>Type 1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType_1()
   * @generated
   * @ordered
   */
  protected static final String TYPE_1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType_1() <em>Type 1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType_1()
   * @generated
   * @ordered
   */
  protected String type_1 = TYPE_1_EDEFAULT;

  /**
   * The default value of the '{@link #getRoleName_1() <em>Role Name 1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoleName_1()
   * @generated
   * @ordered
   */
  protected static final String ROLE_NAME_1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRoleName_1() <em>Role Name 1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoleName_1()
   * @generated
   * @ordered
   */
  protected String roleName_1 = ROLE_NAME_1_EDEFAULT;

  /**
   * The cached value of the '{@link #getIsSorted_1() <em>Is Sorted 1</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsSorted_1()
   * @generated
   * @ordered
   */
  protected EList<IsSorted_> isSorted_1;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssociationEnd_Impl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return UmplePackage.eINSTANCE.getAssociationEnd_();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Multiplicity_> getMultiplicity_1()
  {
    if (multiplicity_1 == null)
    {
      multiplicity_1 = new EObjectContainmentEList<Multiplicity_>(Multiplicity_.class, this, UmplePackage.ASSOCIATION_END___MULTIPLICITY_1);
    }
    return multiplicity_1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType_1()
  {
    return type_1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType_1(String newType_1)
  {
    String oldType_1 = type_1;
    type_1 = newType_1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmplePackage.ASSOCIATION_END___TYPE_1, oldType_1, type_1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRoleName_1()
  {
    return roleName_1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRoleName_1(String newRoleName_1)
  {
    String oldRoleName_1 = roleName_1;
    roleName_1 = newRoleName_1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmplePackage.ASSOCIATION_END___ROLE_NAME_1, oldRoleName_1, roleName_1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IsSorted_> getIsSorted_1()
  {
    if (isSorted_1 == null)
    {
      isSorted_1 = new EObjectContainmentEList<IsSorted_>(IsSorted_.class, this, UmplePackage.ASSOCIATION_END___IS_SORTED_1);
    }
    return isSorted_1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case UmplePackage.ASSOCIATION_END___MULTIPLICITY_1:
        return ((InternalEList<?>)getMultiplicity_1()).basicRemove(otherEnd, msgs);
      case UmplePackage.ASSOCIATION_END___IS_SORTED_1:
        return ((InternalEList<?>)getIsSorted_1()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case UmplePackage.ASSOCIATION_END___MULTIPLICITY_1:
        return getMultiplicity_1();
      case UmplePackage.ASSOCIATION_END___TYPE_1:
        return getType_1();
      case UmplePackage.ASSOCIATION_END___ROLE_NAME_1:
        return getRoleName_1();
      case UmplePackage.ASSOCIATION_END___IS_SORTED_1:
        return getIsSorted_1();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UmplePackage.ASSOCIATION_END___MULTIPLICITY_1:
        getMultiplicity_1().clear();
        getMultiplicity_1().addAll((Collection<? extends Multiplicity_>)newValue);
        return;
      case UmplePackage.ASSOCIATION_END___TYPE_1:
        setType_1((String)newValue);
        return;
      case UmplePackage.ASSOCIATION_END___ROLE_NAME_1:
        setRoleName_1((String)newValue);
        return;
      case UmplePackage.ASSOCIATION_END___IS_SORTED_1:
        getIsSorted_1().clear();
        getIsSorted_1().addAll((Collection<? extends IsSorted_>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case UmplePackage.ASSOCIATION_END___MULTIPLICITY_1:
        getMultiplicity_1().clear();
        return;
      case UmplePackage.ASSOCIATION_END___TYPE_1:
        setType_1(TYPE_1_EDEFAULT);
        return;
      case UmplePackage.ASSOCIATION_END___ROLE_NAME_1:
        setRoleName_1(ROLE_NAME_1_EDEFAULT);
        return;
      case UmplePackage.ASSOCIATION_END___IS_SORTED_1:
        getIsSorted_1().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case UmplePackage.ASSOCIATION_END___MULTIPLICITY_1:
        return multiplicity_1 != null && !multiplicity_1.isEmpty();
      case UmplePackage.ASSOCIATION_END___TYPE_1:
        return TYPE_1_EDEFAULT == null ? type_1 != null : !TYPE_1_EDEFAULT.equals(type_1);
      case UmplePackage.ASSOCIATION_END___ROLE_NAME_1:
        return ROLE_NAME_1_EDEFAULT == null ? roleName_1 != null : !ROLE_NAME_1_EDEFAULT.equals(roleName_1);
      case UmplePackage.ASSOCIATION_END___IS_SORTED_1:
        return isSorted_1 != null && !isSorted_1.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (type_1: ");
    result.append(type_1);
    result.append(", roleName_1: ");
    result.append(roleName_1);
    result.append(')');
    return result.toString();
  }

} //AssociationEnd_Impl

/**
 */
package asa.impl;

import asa.AsaPackage;
import asa.Composant;
import asa.Constraint;
import asa.PortFournisComposant;
import asa.PortRequisComposant;
import asa.Properties;
import asa.ServiceFournis;
import asa.ServiceRequis;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asa.impl.ComposantImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link asa.impl.ComposantImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link asa.impl.ComposantImpl#getServicefournis <em>Servicefournis</em>}</li>
 *   <li>{@link asa.impl.ComposantImpl#getServicerequis <em>Servicerequis</em>}</li>
 *   <li>{@link asa.impl.ComposantImpl#getName <em>Name</em>}</li>
 *   <li>{@link asa.impl.ComposantImpl#getPortrequiscomposant <em>Portrequiscomposant</em>}</li>
 *   <li>{@link asa.impl.ComposantImpl#getPortfourniscomposant <em>Portfourniscomposant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComposantImpl extends MinimalEObjectImpl.Container implements Composant {
	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraint;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Properties> properties;

	/**
	 * The cached value of the '{@link #getServicefournis() <em>Servicefournis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicefournis()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceFournis> servicefournis;

	/**
	 * The cached value of the '{@link #getServicerequis() <em>Servicerequis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicerequis()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceRequis> servicerequis;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPortrequiscomposant() <em>Portrequiscomposant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequiscomposant()
	 * @generated
	 * @ordered
	 */
	protected EList<PortRequisComposant> portrequiscomposant;

	/**
	 * The cached value of the '{@link #getPortfourniscomposant() <em>Portfourniscomposant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortfourniscomposant()
	 * @generated
	 * @ordered
	 */
	protected EList<PortFournisComposant> portfourniscomposant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaPackage.Literals.COMPOSANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<Constraint>(Constraint.class, this,
					AsaPackage.COMPOSANT__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Properties> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Properties>(Properties.class, this,
					AsaPackage.COMPOSANT__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceFournis> getServicefournis() {
		if (servicefournis == null) {
			servicefournis = new EObjectContainmentEList<ServiceFournis>(ServiceFournis.class, this,
					AsaPackage.COMPOSANT__SERVICEFOURNIS);
		}
		return servicefournis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceRequis> getServicerequis() {
		if (servicerequis == null) {
			servicerequis = new EObjectContainmentEList<ServiceRequis>(ServiceRequis.class, this,
					AsaPackage.COMPOSANT__SERVICEREQUIS);
		}
		return servicerequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortRequisComposant> getPortrequiscomposant() {
		if (portrequiscomposant == null) {
			portrequiscomposant = new EObjectWithInverseResolvingEList<PortRequisComposant>(PortRequisComposant.class,
					this, AsaPackage.COMPOSANT__PORTREQUISCOMPOSANT, AsaPackage.PORT_REQUIS_COMPOSANT__COMPOSANT);
		}
		return portrequiscomposant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortFournisComposant> getPortfourniscomposant() {
		if (portfourniscomposant == null) {
			portfourniscomposant = new EObjectWithInverseResolvingEList<PortFournisComposant>(
					PortFournisComposant.class, this, AsaPackage.COMPOSANT__PORTFOURNISCOMPOSANT,
					AsaPackage.PORT_FOURNIS_COMPOSANT__COMPOSANT);
		}
		return portfourniscomposant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AsaPackage.COMPOSANT__PORTREQUISCOMPOSANT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPortrequiscomposant()).basicAdd(otherEnd,
					msgs);
		case AsaPackage.COMPOSANT__PORTFOURNISCOMPOSANT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPortfourniscomposant()).basicAdd(otherEnd,
					msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaPackage.COMPOSANT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AsaPackage.COMPOSANT__CONSTRAINT:
			return ((InternalEList<?>) getConstraint()).basicRemove(otherEnd, msgs);
		case AsaPackage.COMPOSANT__PROPERTIES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
		case AsaPackage.COMPOSANT__SERVICEFOURNIS:
			return ((InternalEList<?>) getServicefournis()).basicRemove(otherEnd, msgs);
		case AsaPackage.COMPOSANT__SERVICEREQUIS:
			return ((InternalEList<?>) getServicerequis()).basicRemove(otherEnd, msgs);
		case AsaPackage.COMPOSANT__PORTREQUISCOMPOSANT:
			return ((InternalEList<?>) getPortrequiscomposant()).basicRemove(otherEnd, msgs);
		case AsaPackage.COMPOSANT__PORTFOURNISCOMPOSANT:
			return ((InternalEList<?>) getPortfourniscomposant()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AsaPackage.COMPOSANT__CONSTRAINT:
			return getConstraint();
		case AsaPackage.COMPOSANT__PROPERTIES:
			return getProperties();
		case AsaPackage.COMPOSANT__SERVICEFOURNIS:
			return getServicefournis();
		case AsaPackage.COMPOSANT__SERVICEREQUIS:
			return getServicerequis();
		case AsaPackage.COMPOSANT__NAME:
			return getName();
		case AsaPackage.COMPOSANT__PORTREQUISCOMPOSANT:
			return getPortrequiscomposant();
		case AsaPackage.COMPOSANT__PORTFOURNISCOMPOSANT:
			return getPortfourniscomposant();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AsaPackage.COMPOSANT__CONSTRAINT:
			getConstraint().clear();
			getConstraint().addAll((Collection<? extends Constraint>) newValue);
			return;
		case AsaPackage.COMPOSANT__PROPERTIES:
			getProperties().clear();
			getProperties().addAll((Collection<? extends Properties>) newValue);
			return;
		case AsaPackage.COMPOSANT__SERVICEFOURNIS:
			getServicefournis().clear();
			getServicefournis().addAll((Collection<? extends ServiceFournis>) newValue);
			return;
		case AsaPackage.COMPOSANT__SERVICEREQUIS:
			getServicerequis().clear();
			getServicerequis().addAll((Collection<? extends ServiceRequis>) newValue);
			return;
		case AsaPackage.COMPOSANT__NAME:
			setName((String) newValue);
			return;
		case AsaPackage.COMPOSANT__PORTREQUISCOMPOSANT:
			getPortrequiscomposant().clear();
			getPortrequiscomposant().addAll((Collection<? extends PortRequisComposant>) newValue);
			return;
		case AsaPackage.COMPOSANT__PORTFOURNISCOMPOSANT:
			getPortfourniscomposant().clear();
			getPortfourniscomposant().addAll((Collection<? extends PortFournisComposant>) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case AsaPackage.COMPOSANT__CONSTRAINT:
			getConstraint().clear();
			return;
		case AsaPackage.COMPOSANT__PROPERTIES:
			getProperties().clear();
			return;
		case AsaPackage.COMPOSANT__SERVICEFOURNIS:
			getServicefournis().clear();
			return;
		case AsaPackage.COMPOSANT__SERVICEREQUIS:
			getServicerequis().clear();
			return;
		case AsaPackage.COMPOSANT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AsaPackage.COMPOSANT__PORTREQUISCOMPOSANT:
			getPortrequiscomposant().clear();
			return;
		case AsaPackage.COMPOSANT__PORTFOURNISCOMPOSANT:
			getPortfourniscomposant().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AsaPackage.COMPOSANT__CONSTRAINT:
			return constraint != null && !constraint.isEmpty();
		case AsaPackage.COMPOSANT__PROPERTIES:
			return properties != null && !properties.isEmpty();
		case AsaPackage.COMPOSANT__SERVICEFOURNIS:
			return servicefournis != null && !servicefournis.isEmpty();
		case AsaPackage.COMPOSANT__SERVICEREQUIS:
			return servicerequis != null && !servicerequis.isEmpty();
		case AsaPackage.COMPOSANT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case AsaPackage.COMPOSANT__PORTREQUISCOMPOSANT:
			return portrequiscomposant != null && !portrequiscomposant.isEmpty();
		case AsaPackage.COMPOSANT__PORTFOURNISCOMPOSANT:
			return portfourniscomposant != null && !portfourniscomposant.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ComposantImpl

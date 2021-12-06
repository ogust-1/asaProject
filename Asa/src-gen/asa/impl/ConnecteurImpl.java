/**
 */
package asa.impl;

import asa.AsaPackage;
import asa.Connecteur;
import asa.Glue;
import asa.RoleFournis;
import asa.RoleRequis;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connecteur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asa.impl.ConnecteurImpl#getGlue <em>Glue</em>}</li>
 *   <li>{@link asa.impl.ConnecteurImpl#getName <em>Name</em>}</li>
 *   <li>{@link asa.impl.ConnecteurImpl#getRolerequis <em>Rolerequis</em>}</li>
 *   <li>{@link asa.impl.ConnecteurImpl#getRolefournis <em>Rolefournis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnecteurImpl extends MinimalEObjectImpl.Container implements Connecteur {
	/**
	 * The cached value of the '{@link #getGlue() <em>Glue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlue()
	 * @generated
	 * @ordered
	 */
	protected Glue glue;

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
	 * The cached value of the '{@link #getRolerequis() <em>Rolerequis</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolerequis()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleRequis> rolerequis;

	/**
	 * The cached value of the '{@link #getRolefournis() <em>Rolefournis</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolefournis()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleFournis> rolefournis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnecteurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaPackage.Literals.CONNECTEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue getGlue() {
		return glue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlue(Glue newGlue, NotificationChain msgs) {
		Glue oldGlue = glue;
		glue = newGlue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsaPackage.CONNECTEUR__GLUE,
					oldGlue, newGlue);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlue(Glue newGlue) {
		if (newGlue != glue) {
			NotificationChain msgs = null;
			if (glue != null)
				msgs = ((InternalEObject) glue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AsaPackage.CONNECTEUR__GLUE, null, msgs);
			if (newGlue != null)
				msgs = ((InternalEObject) newGlue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AsaPackage.CONNECTEUR__GLUE, null, msgs);
			msgs = basicSetGlue(newGlue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaPackage.CONNECTEUR__GLUE, newGlue, newGlue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleRequis> getRolerequis() {
		if (rolerequis == null) {
			rolerequis = new EObjectWithInverseResolvingEList<RoleRequis>(RoleRequis.class, this,
					AsaPackage.CONNECTEUR__ROLEREQUIS, AsaPackage.ROLE_REQUIS__CONNECTEUR);
		}
		return rolerequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleFournis> getRolefournis() {
		if (rolefournis == null) {
			rolefournis = new EObjectWithInverseResolvingEList<RoleFournis>(RoleFournis.class, this,
					AsaPackage.CONNECTEUR__ROLEFOURNIS, AsaPackage.ROLE_FOURNIS__CONNECTEUR);
		}
		return rolefournis;
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
		case AsaPackage.CONNECTEUR__ROLEREQUIS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRolerequis()).basicAdd(otherEnd, msgs);
		case AsaPackage.CONNECTEUR__ROLEFOURNIS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRolefournis()).basicAdd(otherEnd, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, AsaPackage.CONNECTEUR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AsaPackage.CONNECTEUR__GLUE:
			return basicSetGlue(null, msgs);
		case AsaPackage.CONNECTEUR__ROLEREQUIS:
			return ((InternalEList<?>) getRolerequis()).basicRemove(otherEnd, msgs);
		case AsaPackage.CONNECTEUR__ROLEFOURNIS:
			return ((InternalEList<?>) getRolefournis()).basicRemove(otherEnd, msgs);
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
		case AsaPackage.CONNECTEUR__GLUE:
			return getGlue();
		case AsaPackage.CONNECTEUR__NAME:
			return getName();
		case AsaPackage.CONNECTEUR__ROLEREQUIS:
			return getRolerequis();
		case AsaPackage.CONNECTEUR__ROLEFOURNIS:
			return getRolefournis();
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
		case AsaPackage.CONNECTEUR__GLUE:
			setGlue((Glue) newValue);
			return;
		case AsaPackage.CONNECTEUR__NAME:
			setName((String) newValue);
			return;
		case AsaPackage.CONNECTEUR__ROLEREQUIS:
			getRolerequis().clear();
			getRolerequis().addAll((Collection<? extends RoleRequis>) newValue);
			return;
		case AsaPackage.CONNECTEUR__ROLEFOURNIS:
			getRolefournis().clear();
			getRolefournis().addAll((Collection<? extends RoleFournis>) newValue);
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
		case AsaPackage.CONNECTEUR__GLUE:
			setGlue((Glue) null);
			return;
		case AsaPackage.CONNECTEUR__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AsaPackage.CONNECTEUR__ROLEREQUIS:
			getRolerequis().clear();
			return;
		case AsaPackage.CONNECTEUR__ROLEFOURNIS:
			getRolefournis().clear();
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
		case AsaPackage.CONNECTEUR__GLUE:
			return glue != null;
		case AsaPackage.CONNECTEUR__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case AsaPackage.CONNECTEUR__ROLEREQUIS:
			return rolerequis != null && !rolerequis.isEmpty();
		case AsaPackage.CONNECTEUR__ROLEFOURNIS:
			return rolefournis != null && !rolefournis.isEmpty();
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

} //ConnecteurImpl

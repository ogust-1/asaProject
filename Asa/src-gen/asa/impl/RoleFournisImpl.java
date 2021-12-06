/**
 */
package asa.impl;

import asa.AsaPackage;
import asa.PortRequisComposant;
import asa.RoleFournis;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Fournis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asa.impl.RoleFournisImpl#getAttachement <em>Attachement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleFournisImpl extends RoleImpl implements RoleFournis {
	/**
	 * The cached value of the '{@link #getAttachement() <em>Attachement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachement()
	 * @generated
	 * @ordered
	 */
	protected PortRequisComposant attachement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleFournisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaPackage.Literals.ROLE_FOURNIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisComposant getAttachement() {
		if (attachement != null && attachement.eIsProxy()) {
			InternalEObject oldAttachement = (InternalEObject) attachement;
			attachement = (PortRequisComposant) eResolveProxy(oldAttachement);
			if (attachement != oldAttachement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaPackage.ROLE_FOURNIS__ATTACHEMENT,
							oldAttachement, attachement));
			}
		}
		return attachement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisComposant basicGetAttachement() {
		return attachement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachement(PortRequisComposant newAttachement, NotificationChain msgs) {
		PortRequisComposant oldAttachement = attachement;
		attachement = newAttachement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AsaPackage.ROLE_FOURNIS__ATTACHEMENT, oldAttachement, newAttachement);
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
	public void setAttachement(PortRequisComposant newAttachement) {
		if (newAttachement != attachement) {
			NotificationChain msgs = null;
			if (attachement != null)
				msgs = ((InternalEObject) attachement).eInverseRemove(this,
						AsaPackage.PORT_REQUIS_COMPOSANT__ATTACHEMENT, PortRequisComposant.class, msgs);
			if (newAttachement != null)
				msgs = ((InternalEObject) newAttachement).eInverseAdd(this,
						AsaPackage.PORT_REQUIS_COMPOSANT__ATTACHEMENT, PortRequisComposant.class, msgs);
			msgs = basicSetAttachement(newAttachement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaPackage.ROLE_FOURNIS__ATTACHEMENT, newAttachement,
					newAttachement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AsaPackage.ROLE_FOURNIS__ATTACHEMENT:
			if (attachement != null)
				msgs = ((InternalEObject) attachement).eInverseRemove(this,
						AsaPackage.PORT_REQUIS_COMPOSANT__ATTACHEMENT, PortRequisComposant.class, msgs);
			return basicSetAttachement((PortRequisComposant) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AsaPackage.ROLE_FOURNIS__ATTACHEMENT:
			return basicSetAttachement(null, msgs);
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
		case AsaPackage.ROLE_FOURNIS__ATTACHEMENT:
			if (resolve)
				return getAttachement();
			return basicGetAttachement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AsaPackage.ROLE_FOURNIS__ATTACHEMENT:
			setAttachement((PortRequisComposant) newValue);
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
		case AsaPackage.ROLE_FOURNIS__ATTACHEMENT:
			setAttachement((PortRequisComposant) null);
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
		case AsaPackage.ROLE_FOURNIS__ATTACHEMENT:
			return attachement != null;
		}
		return super.eIsSet(featureID);
	}

} //RoleFournisImpl

/**
 */
package asa.impl;

import asa.AsaPackage;
import asa.PortFournisComposant;
import asa.RoleRequis;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Requis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asa.impl.RoleRequisImpl#getAttachement <em>Attachement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleRequisImpl extends RoleImpl implements RoleRequis {
	/**
	 * The cached value of the '{@link #getAttachement() <em>Attachement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachement()
	 * @generated
	 * @ordered
	 */
	protected PortFournisComposant attachement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleRequisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaPackage.Literals.ROLE_REQUIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournisComposant getAttachement() {
		if (attachement != null && attachement.eIsProxy()) {
			InternalEObject oldAttachement = (InternalEObject) attachement;
			attachement = (PortFournisComposant) eResolveProxy(oldAttachement);
			if (attachement != oldAttachement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaPackage.ROLE_REQUIS__ATTACHEMENT,
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
	public PortFournisComposant basicGetAttachement() {
		return attachement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachement(PortFournisComposant newAttachement, NotificationChain msgs) {
		PortFournisComposant oldAttachement = attachement;
		attachement = newAttachement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AsaPackage.ROLE_REQUIS__ATTACHEMENT, oldAttachement, newAttachement);
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
	public void setAttachement(PortFournisComposant newAttachement) {
		if (newAttachement != attachement) {
			NotificationChain msgs = null;
			if (attachement != null)
				msgs = ((InternalEObject) attachement).eInverseRemove(this,
						AsaPackage.PORT_FOURNIS_COMPOSANT__ATTACHEMENT, PortFournisComposant.class, msgs);
			if (newAttachement != null)
				msgs = ((InternalEObject) newAttachement).eInverseAdd(this,
						AsaPackage.PORT_FOURNIS_COMPOSANT__ATTACHEMENT, PortFournisComposant.class, msgs);
			msgs = basicSetAttachement(newAttachement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaPackage.ROLE_REQUIS__ATTACHEMENT, newAttachement,
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
		case AsaPackage.ROLE_REQUIS__ATTACHEMENT:
			if (attachement != null)
				msgs = ((InternalEObject) attachement).eInverseRemove(this,
						AsaPackage.PORT_FOURNIS_COMPOSANT__ATTACHEMENT, PortFournisComposant.class, msgs);
			return basicSetAttachement((PortFournisComposant) otherEnd, msgs);
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
		case AsaPackage.ROLE_REQUIS__ATTACHEMENT:
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
		case AsaPackage.ROLE_REQUIS__ATTACHEMENT:
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
		case AsaPackage.ROLE_REQUIS__ATTACHEMENT:
			setAttachement((PortFournisComposant) newValue);
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
		case AsaPackage.ROLE_REQUIS__ATTACHEMENT:
			setAttachement((PortFournisComposant) null);
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
		case AsaPackage.ROLE_REQUIS__ATTACHEMENT:
			return attachement != null;
		}
		return super.eIsSet(featureID);
	}

} //RoleRequisImpl

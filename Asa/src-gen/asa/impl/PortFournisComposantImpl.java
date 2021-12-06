/**
 */
package asa.impl;

import asa.AsaPackage;
import asa.PortFournisComposant;
import asa.PortRequisConfiguration;
import asa.RoleRequis;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Fournis Composant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asa.impl.PortFournisComposantImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link asa.impl.PortFournisComposantImpl#getAttachement <em>Attachement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortFournisComposantImpl extends PortImpl implements PortFournisComposant {
	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected PortRequisConfiguration binding;

	/**
	 * The cached value of the '{@link #getAttachement() <em>Attachement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachement()
	 * @generated
	 * @ordered
	 */
	protected RoleRequis attachement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortFournisComposantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaPackage.Literals.PORT_FOURNIS_COMPOSANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisConfiguration getBinding() {
		if (binding != null && binding.eIsProxy()) {
			InternalEObject oldBinding = (InternalEObject) binding;
			binding = (PortRequisConfiguration) eResolveProxy(oldBinding);
			if (binding != oldBinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AsaPackage.PORT_FOURNIS_COMPOSANT__BINDING, oldBinding, binding));
			}
		}
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisConfiguration basicGetBinding() {
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinding(PortRequisConfiguration newBinding, NotificationChain msgs) {
		PortRequisConfiguration oldBinding = binding;
		binding = newBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AsaPackage.PORT_FOURNIS_COMPOSANT__BINDING, oldBinding, newBinding);
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
	public void setBinding(PortRequisConfiguration newBinding) {
		if (newBinding != binding) {
			NotificationChain msgs = null;
			if (binding != null)
				msgs = ((InternalEObject) binding).eInverseRemove(this, AsaPackage.PORT_REQUIS_CONFIGURATION__BINDING,
						PortRequisConfiguration.class, msgs);
			if (newBinding != null)
				msgs = ((InternalEObject) newBinding).eInverseAdd(this, AsaPackage.PORT_REQUIS_CONFIGURATION__BINDING,
						PortRequisConfiguration.class, msgs);
			msgs = basicSetBinding(newBinding, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaPackage.PORT_FOURNIS_COMPOSANT__BINDING,
					newBinding, newBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis getAttachement() {
		if (attachement != null && attachement.eIsProxy()) {
			InternalEObject oldAttachement = (InternalEObject) attachement;
			attachement = (RoleRequis) eResolveProxy(oldAttachement);
			if (attachement != oldAttachement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AsaPackage.PORT_FOURNIS_COMPOSANT__ATTACHEMENT, oldAttachement, attachement));
			}
		}
		return attachement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis basicGetAttachement() {
		return attachement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachement(RoleRequis newAttachement, NotificationChain msgs) {
		RoleRequis oldAttachement = attachement;
		attachement = newAttachement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AsaPackage.PORT_FOURNIS_COMPOSANT__ATTACHEMENT, oldAttachement, newAttachement);
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
	public void setAttachement(RoleRequis newAttachement) {
		if (newAttachement != attachement) {
			NotificationChain msgs = null;
			if (attachement != null)
				msgs = ((InternalEObject) attachement).eInverseRemove(this, AsaPackage.ROLE_REQUIS__ATTACHEMENT,
						RoleRequis.class, msgs);
			if (newAttachement != null)
				msgs = ((InternalEObject) newAttachement).eInverseAdd(this, AsaPackage.ROLE_REQUIS__ATTACHEMENT,
						RoleRequis.class, msgs);
			msgs = basicSetAttachement(newAttachement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaPackage.PORT_FOURNIS_COMPOSANT__ATTACHEMENT,
					newAttachement, newAttachement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AsaPackage.PORT_FOURNIS_COMPOSANT__BINDING:
			if (binding != null)
				msgs = ((InternalEObject) binding).eInverseRemove(this, AsaPackage.PORT_REQUIS_CONFIGURATION__BINDING,
						PortRequisConfiguration.class, msgs);
			return basicSetBinding((PortRequisConfiguration) otherEnd, msgs);
		case AsaPackage.PORT_FOURNIS_COMPOSANT__ATTACHEMENT:
			if (attachement != null)
				msgs = ((InternalEObject) attachement).eInverseRemove(this, AsaPackage.ROLE_REQUIS__ATTACHEMENT,
						RoleRequis.class, msgs);
			return basicSetAttachement((RoleRequis) otherEnd, msgs);
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
		case AsaPackage.PORT_FOURNIS_COMPOSANT__BINDING:
			return basicSetBinding(null, msgs);
		case AsaPackage.PORT_FOURNIS_COMPOSANT__ATTACHEMENT:
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
		case AsaPackage.PORT_FOURNIS_COMPOSANT__BINDING:
			if (resolve)
				return getBinding();
			return basicGetBinding();
		case AsaPackage.PORT_FOURNIS_COMPOSANT__ATTACHEMENT:
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
		case AsaPackage.PORT_FOURNIS_COMPOSANT__BINDING:
			setBinding((PortRequisConfiguration) newValue);
			return;
		case AsaPackage.PORT_FOURNIS_COMPOSANT__ATTACHEMENT:
			setAttachement((RoleRequis) newValue);
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
		case AsaPackage.PORT_FOURNIS_COMPOSANT__BINDING:
			setBinding((PortRequisConfiguration) null);
			return;
		case AsaPackage.PORT_FOURNIS_COMPOSANT__ATTACHEMENT:
			setAttachement((RoleRequis) null);
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
		case AsaPackage.PORT_FOURNIS_COMPOSANT__BINDING:
			return binding != null;
		case AsaPackage.PORT_FOURNIS_COMPOSANT__ATTACHEMENT:
			return attachement != null;
		}
		return super.eIsSet(featureID);
	}

} //PortFournisComposantImpl

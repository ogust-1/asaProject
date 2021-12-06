/**
 */
package asa.impl;

import asa.AsaPackage;
import asa.Composant;
import asa.PortFournisConfiguration;
import asa.PortRequisComposant;
import asa.RoleFournis;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Requis Composant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asa.impl.PortRequisComposantImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link asa.impl.PortRequisComposantImpl#getAttachement <em>Attachement</em>}</li>
 *   <li>{@link asa.impl.PortRequisComposantImpl#getComposant <em>Composant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortRequisComposantImpl extends PortImpl implements PortRequisComposant {
	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<PortFournisConfiguration> binding;

	/**
	 * The cached value of the '{@link #getAttachement() <em>Attachement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachement()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleFournis> attachement;

	/**
	 * The cached value of the '{@link #getComposant() <em>Composant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposant()
	 * @generated
	 * @ordered
	 */
	protected Composant composant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortRequisComposantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaPackage.Literals.PORT_REQUIS_COMPOSANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortFournisConfiguration> getBinding() {
		if (binding == null) {
			binding = new EObjectWithInverseResolvingEList.ManyInverse<PortFournisConfiguration>(
					PortFournisConfiguration.class, this, AsaPackage.PORT_REQUIS_COMPOSANT__BINDING,
					AsaPackage.PORT_FOURNIS_CONFIGURATION__BINDING);
		}
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleFournis> getAttachement() {
		if (attachement == null) {
			attachement = new EObjectWithInverseResolvingEList.ManyInverse<RoleFournis>(RoleFournis.class, this,
					AsaPackage.PORT_REQUIS_COMPOSANT__ATTACHEMENT, AsaPackage.ROLE_FOURNIS__ATTACHEMENT);
		}
		return attachement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composant getComposant() {
		if (composant != null && composant.eIsProxy()) {
			InternalEObject oldComposant = (InternalEObject) composant;
			composant = (Composant) eResolveProxy(oldComposant);
			if (composant != oldComposant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AsaPackage.PORT_REQUIS_COMPOSANT__COMPOSANT, oldComposant, composant));
			}
		}
		return composant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composant basicGetComposant() {
		return composant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComposant(Composant newComposant, NotificationChain msgs) {
		Composant oldComposant = composant;
		composant = newComposant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AsaPackage.PORT_REQUIS_COMPOSANT__COMPOSANT, oldComposant, newComposant);
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
	public void setComposant(Composant newComposant) {
		if (newComposant != composant) {
			NotificationChain msgs = null;
			if (composant != null)
				msgs = ((InternalEObject) composant).eInverseRemove(this, AsaPackage.COMPOSANT__PORTREQUISCOMPOSANT,
						Composant.class, msgs);
			if (newComposant != null)
				msgs = ((InternalEObject) newComposant).eInverseAdd(this, AsaPackage.COMPOSANT__PORTREQUISCOMPOSANT,
						Composant.class, msgs);
			msgs = basicSetComposant(newComposant, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaPackage.PORT_REQUIS_COMPOSANT__COMPOSANT,
					newComposant, newComposant));
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
		case AsaPackage.PORT_REQUIS_COMPOSANT__BINDING:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getBinding()).basicAdd(otherEnd, msgs);
		case AsaPackage.PORT_REQUIS_COMPOSANT__ATTACHEMENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAttachement()).basicAdd(otherEnd, msgs);
		case AsaPackage.PORT_REQUIS_COMPOSANT__COMPOSANT:
			if (composant != null)
				msgs = ((InternalEObject) composant).eInverseRemove(this, AsaPackage.COMPOSANT__PORTREQUISCOMPOSANT,
						Composant.class, msgs);
			return basicSetComposant((Composant) otherEnd, msgs);
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
		case AsaPackage.PORT_REQUIS_COMPOSANT__BINDING:
			return ((InternalEList<?>) getBinding()).basicRemove(otherEnd, msgs);
		case AsaPackage.PORT_REQUIS_COMPOSANT__ATTACHEMENT:
			return ((InternalEList<?>) getAttachement()).basicRemove(otherEnd, msgs);
		case AsaPackage.PORT_REQUIS_COMPOSANT__COMPOSANT:
			return basicSetComposant(null, msgs);
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
		case AsaPackage.PORT_REQUIS_COMPOSANT__BINDING:
			return getBinding();
		case AsaPackage.PORT_REQUIS_COMPOSANT__ATTACHEMENT:
			return getAttachement();
		case AsaPackage.PORT_REQUIS_COMPOSANT__COMPOSANT:
			if (resolve)
				return getComposant();
			return basicGetComposant();
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
		case AsaPackage.PORT_REQUIS_COMPOSANT__BINDING:
			getBinding().clear();
			getBinding().addAll((Collection<? extends PortFournisConfiguration>) newValue);
			return;
		case AsaPackage.PORT_REQUIS_COMPOSANT__ATTACHEMENT:
			getAttachement().clear();
			getAttachement().addAll((Collection<? extends RoleFournis>) newValue);
			return;
		case AsaPackage.PORT_REQUIS_COMPOSANT__COMPOSANT:
			setComposant((Composant) newValue);
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
		case AsaPackage.PORT_REQUIS_COMPOSANT__BINDING:
			getBinding().clear();
			return;
		case AsaPackage.PORT_REQUIS_COMPOSANT__ATTACHEMENT:
			getAttachement().clear();
			return;
		case AsaPackage.PORT_REQUIS_COMPOSANT__COMPOSANT:
			setComposant((Composant) null);
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
		case AsaPackage.PORT_REQUIS_COMPOSANT__BINDING:
			return binding != null && !binding.isEmpty();
		case AsaPackage.PORT_REQUIS_COMPOSANT__ATTACHEMENT:
			return attachement != null && !attachement.isEmpty();
		case AsaPackage.PORT_REQUIS_COMPOSANT__COMPOSANT:
			return composant != null;
		}
		return super.eIsSet(featureID);
	}

} //PortRequisComposantImpl

/**
 */
package asa.impl;

import asa.AsaPackage;
import asa.PortFournisConfiguration;
import asa.PortRequisComposant;
import asa.RoleFournis;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AsaPackage.PORT_REQUIS_COMPOSANT__BINDING:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getBinding()).basicAdd(otherEnd, msgs);
		case AsaPackage.PORT_REQUIS_COMPOSANT__ATTACHEMENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAttachement()).basicAdd(otherEnd, msgs);
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
		}
		return super.eIsSet(featureID);
	}

} //PortRequisComposantImpl

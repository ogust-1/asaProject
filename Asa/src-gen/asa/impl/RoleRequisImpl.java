/**
 */
package asa.impl;

import asa.AsaPackage;
import asa.Connecteur;
import asa.PortFournisComposant;
import asa.RoleRequis;

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
 * An implementation of the model object '<em><b>Role Requis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asa.impl.RoleRequisImpl#getAttachement <em>Attachement</em>}</li>
 *   <li>{@link asa.impl.RoleRequisImpl#getConnecteur <em>Connecteur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleRequisImpl extends RoleImpl implements RoleRequis {
	/**
	 * The cached value of the '{@link #getAttachement() <em>Attachement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachement()
	 * @generated
	 * @ordered
	 */
	protected EList<PortFournisComposant> attachement;

	/**
	 * The cached value of the '{@link #getConnecteur() <em>Connecteur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnecteur()
	 * @generated
	 * @ordered
	 */
	protected Connecteur connecteur;

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
	public EList<PortFournisComposant> getAttachement() {
		if (attachement == null) {
			attachement = new EObjectWithInverseResolvingEList.ManyInverse<PortFournisComposant>(
					PortFournisComposant.class, this, AsaPackage.ROLE_REQUIS__ATTACHEMENT,
					AsaPackage.PORT_FOURNIS_COMPOSANT__ATTACHEMENT);
		}
		return attachement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connecteur getConnecteur() {
		if (connecteur != null && connecteur.eIsProxy()) {
			InternalEObject oldConnecteur = (InternalEObject) connecteur;
			connecteur = (Connecteur) eResolveProxy(oldConnecteur);
			if (connecteur != oldConnecteur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaPackage.ROLE_REQUIS__CONNECTEUR,
							oldConnecteur, connecteur));
			}
		}
		return connecteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connecteur basicGetConnecteur() {
		return connecteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnecteur(Connecteur newConnecteur, NotificationChain msgs) {
		Connecteur oldConnecteur = connecteur;
		connecteur = newConnecteur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AsaPackage.ROLE_REQUIS__CONNECTEUR, oldConnecteur, newConnecteur);
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
	public void setConnecteur(Connecteur newConnecteur) {
		if (newConnecteur != connecteur) {
			NotificationChain msgs = null;
			if (connecteur != null)
				msgs = ((InternalEObject) connecteur).eInverseRemove(this, AsaPackage.CONNECTEUR__ROLEREQUIS,
						Connecteur.class, msgs);
			if (newConnecteur != null)
				msgs = ((InternalEObject) newConnecteur).eInverseAdd(this, AsaPackage.CONNECTEUR__ROLEREQUIS,
						Connecteur.class, msgs);
			msgs = basicSetConnecteur(newConnecteur, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaPackage.ROLE_REQUIS__CONNECTEUR, newConnecteur,
					newConnecteur));
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
		case AsaPackage.ROLE_REQUIS__ATTACHEMENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAttachement()).basicAdd(otherEnd, msgs);
		case AsaPackage.ROLE_REQUIS__CONNECTEUR:
			if (connecteur != null)
				msgs = ((InternalEObject) connecteur).eInverseRemove(this, AsaPackage.CONNECTEUR__ROLEREQUIS,
						Connecteur.class, msgs);
			return basicSetConnecteur((Connecteur) otherEnd, msgs);
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
			return ((InternalEList<?>) getAttachement()).basicRemove(otherEnd, msgs);
		case AsaPackage.ROLE_REQUIS__CONNECTEUR:
			return basicSetConnecteur(null, msgs);
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
			return getAttachement();
		case AsaPackage.ROLE_REQUIS__CONNECTEUR:
			if (resolve)
				return getConnecteur();
			return basicGetConnecteur();
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
		case AsaPackage.ROLE_REQUIS__ATTACHEMENT:
			getAttachement().clear();
			getAttachement().addAll((Collection<? extends PortFournisComposant>) newValue);
			return;
		case AsaPackage.ROLE_REQUIS__CONNECTEUR:
			setConnecteur((Connecteur) newValue);
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
			getAttachement().clear();
			return;
		case AsaPackage.ROLE_REQUIS__CONNECTEUR:
			setConnecteur((Connecteur) null);
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
			return attachement != null && !attachement.isEmpty();
		case AsaPackage.ROLE_REQUIS__CONNECTEUR:
			return connecteur != null;
		}
		return super.eIsSet(featureID);
	}

} //RoleRequisImpl

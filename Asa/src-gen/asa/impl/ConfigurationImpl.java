/**
 */
package asa.impl;

import asa.AsaPackage;
import asa.Composant;
import asa.Configuration;
import asa.Connecteur;
import asa.PortFournisConfiguration;
import asa.PortRequisConfiguration;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asa.impl.ConfigurationImpl#getComposant <em>Composant</em>}</li>
 *   <li>{@link asa.impl.ConfigurationImpl#getConnecteur <em>Connecteur</em>}</li>
 *   <li>{@link asa.impl.ConfigurationImpl#getPortfournisconfiguration <em>Portfournisconfiguration</em>}</li>
 *   <li>{@link asa.impl.ConfigurationImpl#getPortrequisconfiguration <em>Portrequisconfiguration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends ComposantImpl implements Configuration {
	/**
	 * The cached value of the '{@link #getComposant() <em>Composant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposant()
	 * @generated
	 * @ordered
	 */
	protected EList<Composant> composant;

	/**
	 * The cached value of the '{@link #getConnecteur() <em>Connecteur</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnecteur()
	 * @generated
	 * @ordered
	 */
	protected EList<Connecteur> connecteur;

	/**
	 * The cached value of the '{@link #getPortfournisconfiguration() <em>Portfournisconfiguration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortfournisconfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<PortFournisConfiguration> portfournisconfiguration;

	/**
	 * The cached value of the '{@link #getPortrequisconfiguration() <em>Portrequisconfiguration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequisconfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<PortRequisConfiguration> portrequisconfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortFournisConfiguration> getPortfournisconfiguration() {
		if (portfournisconfiguration == null) {
			portfournisconfiguration = new EObjectWithInverseResolvingEList<PortFournisConfiguration>(
					PortFournisConfiguration.class, this, AsaPackage.CONFIGURATION__PORTFOURNISCONFIGURATION,
					AsaPackage.PORT_FOURNIS_CONFIGURATION__CONFIGURATION);
		}
		return portfournisconfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortRequisConfiguration> getPortrequisconfiguration() {
		if (portrequisconfiguration == null) {
			portrequisconfiguration = new EObjectWithInverseResolvingEList<PortRequisConfiguration>(
					PortRequisConfiguration.class, this, AsaPackage.CONFIGURATION__PORTREQUISCONFIGURATION,
					AsaPackage.PORT_REQUIS_CONFIGURATION__CONFIGURATION);
		}
		return portrequisconfiguration;
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
		case AsaPackage.CONFIGURATION__PORTFOURNISCONFIGURATION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPortfournisconfiguration())
					.basicAdd(otherEnd, msgs);
		case AsaPackage.CONFIGURATION__PORTREQUISCONFIGURATION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPortrequisconfiguration()).basicAdd(otherEnd,
					msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Composant> getComposant() {
		if (composant == null) {
			composant = new EObjectContainmentEList<Composant>(Composant.class, this,
					AsaPackage.CONFIGURATION__COMPOSANT);
		}
		return composant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connecteur> getConnecteur() {
		if (connecteur == null) {
			connecteur = new EObjectContainmentEList<Connecteur>(Connecteur.class, this,
					AsaPackage.CONFIGURATION__CONNECTEUR);
		}
		return connecteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AsaPackage.CONFIGURATION__COMPOSANT:
			return ((InternalEList<?>) getComposant()).basicRemove(otherEnd, msgs);
		case AsaPackage.CONFIGURATION__CONNECTEUR:
			return ((InternalEList<?>) getConnecteur()).basicRemove(otherEnd, msgs);
		case AsaPackage.CONFIGURATION__PORTFOURNISCONFIGURATION:
			return ((InternalEList<?>) getPortfournisconfiguration()).basicRemove(otherEnd, msgs);
		case AsaPackage.CONFIGURATION__PORTREQUISCONFIGURATION:
			return ((InternalEList<?>) getPortrequisconfiguration()).basicRemove(otherEnd, msgs);
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
		case AsaPackage.CONFIGURATION__COMPOSANT:
			return getComposant();
		case AsaPackage.CONFIGURATION__CONNECTEUR:
			return getConnecteur();
		case AsaPackage.CONFIGURATION__PORTFOURNISCONFIGURATION:
			return getPortfournisconfiguration();
		case AsaPackage.CONFIGURATION__PORTREQUISCONFIGURATION:
			return getPortrequisconfiguration();
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
		case AsaPackage.CONFIGURATION__COMPOSANT:
			getComposant().clear();
			getComposant().addAll((Collection<? extends Composant>) newValue);
			return;
		case AsaPackage.CONFIGURATION__CONNECTEUR:
			getConnecteur().clear();
			getConnecteur().addAll((Collection<? extends Connecteur>) newValue);
			return;
		case AsaPackage.CONFIGURATION__PORTFOURNISCONFIGURATION:
			getPortfournisconfiguration().clear();
			getPortfournisconfiguration().addAll((Collection<? extends PortFournisConfiguration>) newValue);
			return;
		case AsaPackage.CONFIGURATION__PORTREQUISCONFIGURATION:
			getPortrequisconfiguration().clear();
			getPortrequisconfiguration().addAll((Collection<? extends PortRequisConfiguration>) newValue);
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
		case AsaPackage.CONFIGURATION__COMPOSANT:
			getComposant().clear();
			return;
		case AsaPackage.CONFIGURATION__CONNECTEUR:
			getConnecteur().clear();
			return;
		case AsaPackage.CONFIGURATION__PORTFOURNISCONFIGURATION:
			getPortfournisconfiguration().clear();
			return;
		case AsaPackage.CONFIGURATION__PORTREQUISCONFIGURATION:
			getPortrequisconfiguration().clear();
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
		case AsaPackage.CONFIGURATION__COMPOSANT:
			return composant != null && !composant.isEmpty();
		case AsaPackage.CONFIGURATION__CONNECTEUR:
			return connecteur != null && !connecteur.isEmpty();
		case AsaPackage.CONFIGURATION__PORTFOURNISCONFIGURATION:
			return portfournisconfiguration != null && !portfournisconfiguration.isEmpty();
		case AsaPackage.CONFIGURATION__PORTREQUISCONFIGURATION:
			return portrequisconfiguration != null && !portrequisconfiguration.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationImpl

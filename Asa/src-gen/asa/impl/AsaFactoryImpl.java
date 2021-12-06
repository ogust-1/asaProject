/**
 */
package asa.impl;

import asa.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AsaFactoryImpl extends EFactoryImpl implements AsaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AsaFactory init() {
		try {
			AsaFactory theAsaFactory = (AsaFactory) EPackage.Registry.INSTANCE.getEFactory(AsaPackage.eNS_URI);
			if (theAsaFactory != null) {
				return theAsaFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AsaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case AsaPackage.PORT_FOURNIS_CONFIGURATION:
			return createPortFournisConfiguration();
		case AsaPackage.PORT_REQUIS_CONFIGURATION:
			return createPortRequisConfiguration();
		case AsaPackage.PORT_FOURNIS_COMPOSANT:
			return createPortFournisComposant();
		case AsaPackage.PORT_REQUIS_COMPOSANT:
			return createPortRequisComposant();
		case AsaPackage.SERVICE_FOURNIS:
			return createServiceFournis();
		case AsaPackage.SERVICE_REQUIS:
			return createServiceRequis();
		case AsaPackage.ROLE_FOURNIS:
			return createRoleFournis();
		case AsaPackage.ROLE_REQUIS:
			return createRoleRequis();
		case AsaPackage.GLUE:
			return createGlue();
		case AsaPackage.CONNECTEUR:
			return createConnecteur();
		case AsaPackage.COMPOSANT:
			return createComposant();
		case AsaPackage.CONFIGURATION:
			return createConfiguration();
		case AsaPackage.CONSTRAINT:
			return createConstraint();
		case AsaPackage.PROPERTIES:
			return createProperties();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournisConfiguration createPortFournisConfiguration() {
		PortFournisConfigurationImpl portFournisConfiguration = new PortFournisConfigurationImpl();
		return portFournisConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisConfiguration createPortRequisConfiguration() {
		PortRequisConfigurationImpl portRequisConfiguration = new PortRequisConfigurationImpl();
		return portRequisConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournisComposant createPortFournisComposant() {
		PortFournisComposantImpl portFournisComposant = new PortFournisComposantImpl();
		return portFournisComposant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisComposant createPortRequisComposant() {
		PortRequisComposantImpl portRequisComposant = new PortRequisComposantImpl();
		return portRequisComposant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFournis createServiceFournis() {
		ServiceFournisImpl serviceFournis = new ServiceFournisImpl();
		return serviceFournis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRequis createServiceRequis() {
		ServiceRequisImpl serviceRequis = new ServiceRequisImpl();
		return serviceRequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFournis createRoleFournis() {
		RoleFournisImpl roleFournis = new RoleFournisImpl();
		return roleFournis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis createRoleRequis() {
		RoleRequisImpl roleRequis = new RoleRequisImpl();
		return roleRequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue createGlue() {
		GlueImpl glue = new GlueImpl();
		return glue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connecteur createConnecteur() {
		ConnecteurImpl connecteur = new ConnecteurImpl();
		return connecteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composant createComposant() {
		ComposantImpl composant = new ComposantImpl();
		return composant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Properties createProperties() {
		PropertiesImpl properties = new PropertiesImpl();
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsaPackage getAsaPackage() {
		return (AsaPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AsaPackage getPackage() {
		return AsaPackage.eINSTANCE;
	}

} //AsaFactoryImpl

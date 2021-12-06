/**
 */
package asa;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see asa.AsaPackage
 * @generated
 */
public interface AsaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AsaFactory eINSTANCE = asa.impl.AsaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Port Fournis Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Fournis Configuration</em>'.
	 * @generated
	 */
	PortFournisConfiguration createPortFournisConfiguration();

	/**
	 * Returns a new object of class '<em>Port Requis Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Requis Configuration</em>'.
	 * @generated
	 */
	PortRequisConfiguration createPortRequisConfiguration();

	/**
	 * Returns a new object of class '<em>Port Fournis Composant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Fournis Composant</em>'.
	 * @generated
	 */
	PortFournisComposant createPortFournisComposant();

	/**
	 * Returns a new object of class '<em>Port Requis Composant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Requis Composant</em>'.
	 * @generated
	 */
	PortRequisComposant createPortRequisComposant();

	/**
	 * Returns a new object of class '<em>Service Fournis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Fournis</em>'.
	 * @generated
	 */
	ServiceFournis createServiceFournis();

	/**
	 * Returns a new object of class '<em>Service Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Requis</em>'.
	 * @generated
	 */
	ServiceRequis createServiceRequis();

	/**
	 * Returns a new object of class '<em>Role Fournis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Fournis</em>'.
	 * @generated
	 */
	RoleFournis createRoleFournis();

	/**
	 * Returns a new object of class '<em>Role Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Requis</em>'.
	 * @generated
	 */
	RoleRequis createRoleRequis();

	/**
	 * Returns a new object of class '<em>Glue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glue</em>'.
	 * @generated
	 */
	Glue createGlue();

	/**
	 * Returns a new object of class '<em>Connecteur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connecteur</em>'.
	 * @generated
	 */
	Connecteur createConnecteur();

	/**
	 * Returns a new object of class '<em>Composant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composant</em>'.
	 * @generated
	 */
	Composant createComposant();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	Configuration createConfiguration();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns a new object of class '<em>Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Properties</em>'.
	 * @generated
	 */
	Properties createProperties();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AsaPackage getAsaPackage();

} //AsaFactory

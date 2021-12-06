/**
 */
package asa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asa.Configuration#getComposant <em>Composant</em>}</li>
 *   <li>{@link asa.Configuration#getConnecteur <em>Connecteur</em>}</li>
 *   <li>{@link asa.Configuration#getPortfournisconfiguration <em>Portfournisconfiguration</em>}</li>
 *   <li>{@link asa.Configuration#getPortrequisconfiguration <em>Portrequisconfiguration</em>}</li>
 * </ul>
 *
 * @see asa.AsaPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends Composant {
	/**
	 * Returns the value of the '<em><b>Portfournisconfiguration</b></em>' reference list.
	 * The list contents are of type {@link asa.PortFournisConfiguration}.
	 * It is bidirectional and its opposite is '{@link asa.PortFournisConfiguration#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portfournisconfiguration</em>' reference list.
	 * @see asa.AsaPackage#getConfiguration_Portfournisconfiguration()
	 * @see asa.PortFournisConfiguration#getConfiguration
	 * @model opposite="configuration"
	 * @generated
	 */
	EList<PortFournisConfiguration> getPortfournisconfiguration();

	/**
	 * Returns the value of the '<em><b>Portrequisconfiguration</b></em>' reference list.
	 * The list contents are of type {@link asa.PortRequisConfiguration}.
	 * It is bidirectional and its opposite is '{@link asa.PortRequisConfiguration#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portrequisconfiguration</em>' reference list.
	 * @see asa.AsaPackage#getConfiguration_Portrequisconfiguration()
	 * @see asa.PortRequisConfiguration#getConfiguration
	 * @model opposite="configuration"
	 * @generated
	 */
	EList<PortRequisConfiguration> getPortrequisconfiguration();

	/**
	 * Returns the value of the '<em><b>Composant</b></em>' containment reference list.
	 * The list contents are of type {@link asa.Composant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composant</em>' containment reference list.
	 * @see asa.AsaPackage#getConfiguration_Composant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Composant> getComposant();

	/**
	 * Returns the value of the '<em><b>Connecteur</b></em>' containment reference list.
	 * The list contents are of type {@link asa.Connecteur}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connecteur</em>' containment reference list.
	 * @see asa.AsaPackage#getConfiguration_Connecteur()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connecteur> getConnecteur();

} // Configuration

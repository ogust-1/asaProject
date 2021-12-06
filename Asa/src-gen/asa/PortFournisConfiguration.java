/**
 */
package asa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Fournis Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asa.PortFournisConfiguration#getBinding <em>Binding</em>}</li>
 *   <li>{@link asa.PortFournisConfiguration#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see asa.AsaPackage#getPortFournisConfiguration()
 * @model
 * @generated
 */
public interface PortFournisConfiguration extends Port {
	/**
	 * Returns the value of the '<em><b>Binding</b></em>' reference list.
	 * The list contents are of type {@link asa.PortRequisComposant}.
	 * It is bidirectional and its opposite is '{@link asa.PortRequisComposant#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' reference list.
	 * @see asa.AsaPackage#getPortFournisConfiguration_Binding()
	 * @see asa.PortRequisComposant#getBinding
	 * @model opposite="binding"
	 * @generated
	 */
	EList<PortRequisComposant> getBinding();

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link asa.Configuration#getPortfournisconfiguration <em>Portfournisconfiguration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' reference.
	 * @see #setConfiguration(Configuration)
	 * @see asa.AsaPackage#getPortFournisConfiguration_Configuration()
	 * @see asa.Configuration#getPortfournisconfiguration
	 * @model opposite="portfournisconfiguration" required="true"
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link asa.PortFournisConfiguration#getConfiguration <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

} // PortFournisConfiguration

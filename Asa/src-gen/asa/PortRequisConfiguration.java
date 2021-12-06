/**
 */
package asa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Requis Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asa.PortRequisConfiguration#getBinding <em>Binding</em>}</li>
 *   <li>{@link asa.PortRequisConfiguration#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see asa.AsaPackage#getPortRequisConfiguration()
 * @model
 * @generated
 */
public interface PortRequisConfiguration extends Port {
	/**
	 * Returns the value of the '<em><b>Binding</b></em>' reference list.
	 * The list contents are of type {@link asa.PortFournisComposant}.
	 * It is bidirectional and its opposite is '{@link asa.PortFournisComposant#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' reference list.
	 * @see asa.AsaPackage#getPortRequisConfiguration_Binding()
	 * @see asa.PortFournisComposant#getBinding
	 * @model opposite="binding"
	 * @generated
	 */
	EList<PortFournisComposant> getBinding();

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link asa.Configuration#getPortrequisconfiguration <em>Portrequisconfiguration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' reference.
	 * @see #setConfiguration(Configuration)
	 * @see asa.AsaPackage#getPortRequisConfiguration_Configuration()
	 * @see asa.Configuration#getPortrequisconfiguration
	 * @model opposite="portrequisconfiguration" required="true"
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link asa.PortRequisConfiguration#getConfiguration <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

} // PortRequisConfiguration

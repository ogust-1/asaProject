/**
 */
package asa;

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
 * </ul>
 *
 * @see asa.AsaPackage#getPortFournisConfiguration()
 * @model
 * @generated
 */
public interface PortFournisConfiguration extends Port {
	/**
	 * Returns the value of the '<em><b>Binding</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link asa.PortRequisComposant#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' reference.
	 * @see #setBinding(PortRequisComposant)
	 * @see asa.AsaPackage#getPortFournisConfiguration_Binding()
	 * @see asa.PortRequisComposant#getBinding
	 * @model opposite="binding" required="true"
	 * @generated
	 */
	PortRequisComposant getBinding();

	/**
	 * Sets the value of the '{@link asa.PortFournisConfiguration#getBinding <em>Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(PortRequisComposant value);

} // PortFournisConfiguration

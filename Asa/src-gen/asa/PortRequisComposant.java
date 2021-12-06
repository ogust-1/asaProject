/**
 */
package asa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Requis Composant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asa.PortRequisComposant#getBinding <em>Binding</em>}</li>
 *   <li>{@link asa.PortRequisComposant#getAttachement <em>Attachement</em>}</li>
 * </ul>
 *
 * @see asa.AsaPackage#getPortRequisComposant()
 * @model
 * @generated
 */
public interface PortRequisComposant extends Port {
	/**
	 * Returns the value of the '<em><b>Binding</b></em>' reference list.
	 * The list contents are of type {@link asa.PortFournisConfiguration}.
	 * It is bidirectional and its opposite is '{@link asa.PortFournisConfiguration#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' reference list.
	 * @see asa.AsaPackage#getPortRequisComposant_Binding()
	 * @see asa.PortFournisConfiguration#getBinding
	 * @model opposite="binding"
	 * @generated
	 */
	EList<PortFournisConfiguration> getBinding();

	/**
	 * Returns the value of the '<em><b>Attachement</b></em>' reference list.
	 * The list contents are of type {@link asa.RoleFournis}.
	 * It is bidirectional and its opposite is '{@link asa.RoleFournis#getAttachement <em>Attachement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachement</em>' reference list.
	 * @see asa.AsaPackage#getPortRequisComposant_Attachement()
	 * @see asa.RoleFournis#getAttachement
	 * @model opposite="attachement"
	 * @generated
	 */
	EList<RoleFournis> getAttachement();

} // PortRequisComposant

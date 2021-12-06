/**
 */
package asa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Fournis Composant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asa.PortFournisComposant#getBinding <em>Binding</em>}</li>
 *   <li>{@link asa.PortFournisComposant#getAttachement <em>Attachement</em>}</li>
 *   <li>{@link asa.PortFournisComposant#getComposant <em>Composant</em>}</li>
 * </ul>
 *
 * @see asa.AsaPackage#getPortFournisComposant()
 * @model
 * @generated
 */
public interface PortFournisComposant extends Port {
	/**
	 * Returns the value of the '<em><b>Binding</b></em>' reference list.
	 * The list contents are of type {@link asa.PortRequisConfiguration}.
	 * It is bidirectional and its opposite is '{@link asa.PortRequisConfiguration#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' reference list.
	 * @see asa.AsaPackage#getPortFournisComposant_Binding()
	 * @see asa.PortRequisConfiguration#getBinding
	 * @model opposite="binding"
	 * @generated
	 */
	EList<PortRequisConfiguration> getBinding();

	/**
	 * Returns the value of the '<em><b>Attachement</b></em>' reference list.
	 * The list contents are of type {@link asa.RoleRequis}.
	 * It is bidirectional and its opposite is '{@link asa.RoleRequis#getAttachement <em>Attachement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachement</em>' reference list.
	 * @see asa.AsaPackage#getPortFournisComposant_Attachement()
	 * @see asa.RoleRequis#getAttachement
	 * @model opposite="attachement"
	 * @generated
	 */
	EList<RoleRequis> getAttachement();

	/**
	 * Returns the value of the '<em><b>Composant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link asa.Composant#getPortfourniscomposant <em>Portfourniscomposant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composant</em>' reference.
	 * @see #setComposant(Composant)
	 * @see asa.AsaPackage#getPortFournisComposant_Composant()
	 * @see asa.Composant#getPortfourniscomposant
	 * @model opposite="portfourniscomposant" required="true"
	 * @generated
	 */
	Composant getComposant();

	/**
	 * Sets the value of the '{@link asa.PortFournisComposant#getComposant <em>Composant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composant</em>' reference.
	 * @see #getComposant()
	 * @generated
	 */
	void setComposant(Composant value);

} // PortFournisComposant

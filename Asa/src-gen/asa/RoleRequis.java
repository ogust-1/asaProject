/**
 */
package asa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Requis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asa.RoleRequis#getAttachement <em>Attachement</em>}</li>
 *   <li>{@link asa.RoleRequis#getConnecteur <em>Connecteur</em>}</li>
 * </ul>
 *
 * @see asa.AsaPackage#getRoleRequis()
 * @model
 * @generated
 */
public interface RoleRequis extends Role {
	/**
	 * Returns the value of the '<em><b>Attachement</b></em>' reference list.
	 * The list contents are of type {@link asa.PortFournisComposant}.
	 * It is bidirectional and its opposite is '{@link asa.PortFournisComposant#getAttachement <em>Attachement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachement</em>' reference list.
	 * @see asa.AsaPackage#getRoleRequis_Attachement()
	 * @see asa.PortFournisComposant#getAttachement
	 * @model opposite="attachement"
	 * @generated
	 */
	EList<PortFournisComposant> getAttachement();

	/**
	 * Returns the value of the '<em><b>Connecteur</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link asa.Connecteur#getRolerequis <em>Rolerequis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connecteur</em>' reference.
	 * @see #setConnecteur(Connecteur)
	 * @see asa.AsaPackage#getRoleRequis_Connecteur()
	 * @see asa.Connecteur#getRolerequis
	 * @model opposite="rolerequis" required="true"
	 * @generated
	 */
	Connecteur getConnecteur();

	/**
	 * Sets the value of the '{@link asa.RoleRequis#getConnecteur <em>Connecteur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connecteur</em>' reference.
	 * @see #getConnecteur()
	 * @generated
	 */
	void setConnecteur(Connecteur value);

} // RoleRequis

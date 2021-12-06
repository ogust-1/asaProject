/**
 */
package asa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Fournis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asa.RoleFournis#getAttachement <em>Attachement</em>}</li>
 *   <li>{@link asa.RoleFournis#getConnecteur <em>Connecteur</em>}</li>
 * </ul>
 *
 * @see asa.AsaPackage#getRoleFournis()
 * @model
 * @generated
 */
public interface RoleFournis extends Role {
	/**
	 * Returns the value of the '<em><b>Attachement</b></em>' reference list.
	 * The list contents are of type {@link asa.PortRequisComposant}.
	 * It is bidirectional and its opposite is '{@link asa.PortRequisComposant#getAttachement <em>Attachement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachement</em>' reference list.
	 * @see asa.AsaPackage#getRoleFournis_Attachement()
	 * @see asa.PortRequisComposant#getAttachement
	 * @model opposite="attachement"
	 * @generated
	 */
	EList<PortRequisComposant> getAttachement();

	/**
	 * Returns the value of the '<em><b>Connecteur</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link asa.Connecteur#getRolefournis <em>Rolefournis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connecteur</em>' reference.
	 * @see #setConnecteur(Connecteur)
	 * @see asa.AsaPackage#getRoleFournis_Connecteur()
	 * @see asa.Connecteur#getRolefournis
	 * @model opposite="rolefournis" required="true"
	 * @generated
	 */
	Connecteur getConnecteur();

	/**
	 * Sets the value of the '{@link asa.RoleFournis#getConnecteur <em>Connecteur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connecteur</em>' reference.
	 * @see #getConnecteur()
	 * @generated
	 */
	void setConnecteur(Connecteur value);

} // RoleFournis

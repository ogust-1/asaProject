/**
 */
package asa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connecteur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asa.Connecteur#getGlue <em>Glue</em>}</li>
 *   <li>{@link asa.Connecteur#getName <em>Name</em>}</li>
 *   <li>{@link asa.Connecteur#getRolerequis <em>Rolerequis</em>}</li>
 *   <li>{@link asa.Connecteur#getRolefournis <em>Rolefournis</em>}</li>
 * </ul>
 *
 * @see asa.AsaPackage#getConnecteur()
 * @model
 * @generated
 */
public interface Connecteur extends EObject {
	/**
	 * Returns the value of the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glue</em>' containment reference.
	 * @see #setGlue(Glue)
	 * @see asa.AsaPackage#getConnecteur_Glue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Glue getGlue();

	/**
	 * Sets the value of the '{@link asa.Connecteur#getGlue <em>Glue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glue</em>' containment reference.
	 * @see #getGlue()
	 * @generated
	 */
	void setGlue(Glue value);

	/**
	 * Returns the value of the '<em><b>Rolerequis</b></em>' reference list.
	 * The list contents are of type {@link asa.RoleRequis}.
	 * It is bidirectional and its opposite is '{@link asa.RoleRequis#getConnecteur <em>Connecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rolerequis</em>' reference list.
	 * @see asa.AsaPackage#getConnecteur_Rolerequis()
	 * @see asa.RoleRequis#getConnecteur
	 * @model opposite="connecteur"
	 * @generated
	 */
	EList<RoleRequis> getRolerequis();

	/**
	 * Returns the value of the '<em><b>Rolefournis</b></em>' reference list.
	 * The list contents are of type {@link asa.RoleFournis}.
	 * It is bidirectional and its opposite is '{@link asa.RoleFournis#getConnecteur <em>Connecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rolefournis</em>' reference list.
	 * @see asa.AsaPackage#getConnecteur_Rolefournis()
	 * @see asa.RoleFournis#getConnecteur
	 * @model opposite="connecteur"
	 * @generated
	 */
	EList<RoleFournis> getRolefournis();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see asa.AsaPackage#getConnecteur_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link asa.Connecteur#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Connecteur

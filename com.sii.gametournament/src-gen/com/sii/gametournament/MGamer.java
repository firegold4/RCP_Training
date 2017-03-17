/**
 */
package com.sii.gametournament;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gamer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sii.gametournament.MGamer#getFirstName <em>First Name</em>}</li>
 *   <li>{@link com.sii.gametournament.MGamer#getLastName <em>Last Name</em>}</li>
 *   <li>{@link com.sii.gametournament.MGamer#getPseudo <em>Pseudo</em>}</li>
 *   <li>{@link com.sii.gametournament.MGamer#getVictories <em>Victories</em>}</li>
 *   <li>{@link com.sii.gametournament.MGamer#getMatches <em>Matches</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sii.gametournament.MGametournamentPackage#getGamer()
 * @model
 * @generated
 */
public interface MGamer extends EObject {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see com.sii.gametournament.MGametournamentPackage#getGamer_FirstName()
	 * @model required="true"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link com.sii.gametournament.MGamer#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see com.sii.gametournament.MGametournamentPackage#getGamer_LastName()
	 * @model required="true"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link com.sii.gametournament.MGamer#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Pseudo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pseudo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pseudo</em>' attribute.
	 * @see #setPseudo(String)
	 * @see com.sii.gametournament.MGametournamentPackage#getGamer_Pseudo()
	 * @model
	 * @generated
	 */
	String getPseudo();

	/**
	 * Sets the value of the '{@link com.sii.gametournament.MGamer#getPseudo <em>Pseudo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pseudo</em>' attribute.
	 * @see #getPseudo()
	 * @generated
	 */
	void setPseudo(String value);

	/**
	 * Returns the value of the '<em><b>Victories</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Victories</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Victories</em>' attribute.
	 * @see #setVictories(int)
	 * @see com.sii.gametournament.MGametournamentPackage#getGamer_Victories()
	 * @model
	 * @generated
	 */
	int getVictories();

	/**
	 * Sets the value of the '{@link com.sii.gametournament.MGamer#getVictories <em>Victories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Victories</em>' attribute.
	 * @see #getVictories()
	 * @generated
	 */
	void setVictories(int value);

	/**
	 * Returns the value of the '<em><b>Matches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matches</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matches</em>' attribute.
	 * @see #setMatches(int)
	 * @see com.sii.gametournament.MGametournamentPackage#getGamer_Matches()
	 * @model
	 * @generated
	 */
	int getMatches();

	/**
	 * Sets the value of the '{@link com.sii.gametournament.MGamer#getMatches <em>Matches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matches</em>' attribute.
	 * @see #getMatches()
	 * @generated
	 */
	void setMatches(int value);

} // MGamer

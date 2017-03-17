/**
 */
package com.sii.gametournament;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sii.gametournament.MGame#getName <em>Name</em>}</li>
 *   <li>{@link com.sii.gametournament.MGame#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sii.gametournament.MGametournamentPackage#getGame()
 * @model
 * @generated
 */
public interface MGame extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.sii.gametournament.MGametournamentPackage#getGame_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.sii.gametournament.MGame#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.sii.gametournament.GameType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.sii.gametournament.GameType
	 * @see #setType(GameType)
	 * @see com.sii.gametournament.MGametournamentPackage#getGame_Type()
	 * @model required="true"
	 * @generated
	 */
	GameType getType();

	/**
	 * Sets the value of the '{@link com.sii.gametournament.MGame#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.sii.gametournament.GameType
	 * @see #getType()
	 * @generated
	 */
	void setType(GameType value);

} // MGame

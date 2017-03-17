/**
 */
package com.sii.gametournament;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sii.gametournament.Pool#getParticipants <em>Participants</em>}</li>
 *   <li>{@link com.sii.gametournament.Pool#getClassment <em>Classment</em>}</li>
 * </ul>
 *
 * @see com.sii.gametournament.GametournamentPackage#getPool()
 * @model
 * @generated
 */
public interface Pool extends EObject {
	/**
	 * Returns the value of the '<em><b>Participants</b></em>' containment reference list.
	 * The list contents are of type {@link com.sii.gametournament.Gamer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' containment reference list.
	 * @see com.sii.gametournament.GametournamentPackage#getPool_Participants()
	 * @model containment="true" lower="4" upper="4"
	 * @generated
	 */
	EList<Gamer> getParticipants();

	/**
	 * Returns the value of the '<em><b>Classment</b></em>' reference list.
	 * The list contents are of type {@link com.sii.gametournament.Gamer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classment</em>' reference list.
	 * @see com.sii.gametournament.GametournamentPackage#getPool_Classment()
	 * @model lower="4" upper="4"
	 * @generated
	 */
	EList<Gamer> getClassment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void generateClassment();

} // Pool

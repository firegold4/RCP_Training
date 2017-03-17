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
 * <ul>
 *   <li>{@link com.sii.gametournament.MPool#getParticipants <em>Participants</em>}</li>
 *   <li>{@link com.sii.gametournament.MPool#getClassment <em>Classment</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sii.gametournament.MGametournamentPackage#getPool()
 * @model
 * @generated
 */
public interface MPool extends EObject {
	/**
	 * Returns the value of the '<em><b>Participants</b></em>' containment reference list.

	 
	 * The list contents are of type {@link com.sii.gametournament.MGamer}. 
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' containment reference list.
	 * @see com.sii.gametournament.MGametournamentPackage#getPool_Participants()
	 * @model containment="true" lower="4" upper="4"
	 * @generated
	 */
	EList<Gamer> getParticipants();

	/**
	 * Returns the value of the '<em><b>Classment</b></em>' reference list.

	 
	 * The list contents are of type {@link com.sii.gametournament.MGamer}. 
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classment</em>' reference list.
	 * @see com.sii.gametournament.MGametournamentPackage#getPool_Classment()
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

} // MPool

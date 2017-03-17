/**
 */
package com.sii.gametournament;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualification Phase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sii.gametournament.MQualificationPhase#getPools <em>Pools</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sii.gametournament.MGametournamentPackage#getQualificationPhase()
 * @model
 * @generated
 */
public interface MQualificationPhase extends EObject {
	/**
	 * Returns the value of the '<em><b>Pools</b></em>' containment reference list.

	 
	 * The list contents are of type {@link com.sii.gametournament.MPool}. 
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pools</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pools</em>' containment reference list.
	 * @see com.sii.gametournament.MGametournamentPackage#getQualificationPhase_Pools()
	 * @model containment="true" required="true" upper="16"
	 * @generated
	 */
	EList<Pool> getPools();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Pool createPools();

} // MQualificationPhase

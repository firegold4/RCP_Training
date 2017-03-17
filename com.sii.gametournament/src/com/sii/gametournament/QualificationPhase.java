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
 * </p>
 * <ul>
 *   <li>{@link com.sii.gametournament.QualificationPhase#getPools <em>Pools</em>}</li>
 * </ul>
 *
 * @see com.sii.gametournament.GametournamentPackage#getQualificationPhase()
 * @model
 * @generated
 */
public interface QualificationPhase extends EObject {
	/**
	 * Returns the value of the '<em><b>Pools</b></em>' containment reference list.
	 * The list contents are of type {@link com.sii.gametournament.Pool}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pools</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pools</em>' containment reference list.
	 * @see com.sii.gametournament.GametournamentPackage#getQualificationPhase_Pools()
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

} // QualificationPhase

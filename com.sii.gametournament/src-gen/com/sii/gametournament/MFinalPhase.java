/**
 */
package com.sii.gametournament;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Final Phase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sii.gametournament.MFinalPhase#getFinalists <em>Finalists</em>}</li>
 *   <li>{@link com.sii.gametournament.MFinalPhase#getQualificationphase <em>Qualificationphase</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sii.gametournament.MGametournamentPackage#getFinalPhase()
 * @model
 * @generated
 */
public interface MFinalPhase extends EObject {
	/**
	 * Returns the value of the '<em><b>Finalists</b></em>' containment reference list.

	 
	 * The list contents are of type {@link com.sii.gametournament.MGamer}. 
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finalists</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finalists</em>' containment reference list.
	 * @see com.sii.gametournament.MGametournamentPackage#getFinalPhase_Finalists()
	 * @model containment="true" required="true" upper="16"
	 * @generated
	 */
	EList<Gamer> getFinalists();

	/**
	 * Returns the value of the '<em><b>Qualificationphase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualificationphase</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualificationphase</em>' reference.
	 * @see #setQualificationphase(MQualificationPhase)
	 * @see com.sii.gametournament.MGametournamentPackage#getFinalPhase_Qualificationphase()
	 * @model required="true"
	 * @generated
	 */
	QualificationPhase getQualificationphase();

	/**
	 * Sets the value of the '{@link com.sii.gametournament.MFinalPhase#getQualificationphase <em>Qualificationphase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualificationphase</em>' reference.
	 * @see #getQualificationphase()
	 * @generated
	 */
	void setQualificationphase(QualificationPhase value);

} // MFinalPhase

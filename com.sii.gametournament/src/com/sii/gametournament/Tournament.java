/**
 */
package com.sii.gametournament;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tournament</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sii.gametournament.Tournament#getName <em>Name</em>}</li>
 *   <li>{@link com.sii.gametournament.Tournament#getLocation <em>Location</em>}</li>
 *   <li>{@link com.sii.gametournament.Tournament#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link com.sii.gametournament.Tournament#getEndDate <em>End Date</em>}</li>
 *   <li>{@link com.sii.gametournament.Tournament#getGame <em>Game</em>}</li>
 *   <li>{@link com.sii.gametournament.Tournament#getGamers <em>Gamers</em>}</li>
 *   <li>{@link com.sii.gametournament.Tournament#getFinalPhase <em>Final Phase</em>}</li>
 *   <li>{@link com.sii.gametournament.Tournament#getQualificationPhase <em>Qualification Phase</em>}</li>
 *   <li>{@link com.sii.gametournament.Tournament#getPrize <em>Prize</em>}</li>
 * </ul>
 *
 * @see com.sii.gametournament.GametournamentPackage#getTournament()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='checkName'"
 * @generated
 */
public interface Tournament extends EObject {
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
	 * @see com.sii.gametournament.GametournamentPackage#getTournament_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.sii.gametournament.Tournament#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see com.sii.gametournament.GametournamentPackage#getTournament_Location()
	 * @model required="true"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link com.sii.gametournament.Tournament#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see com.sii.gametournament.GametournamentPackage#getTournament_StartDate()
	 * @model required="true"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link com.sii.gametournament.Tournament#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see com.sii.gametournament.GametournamentPackage#getTournament_EndDate()
	 * @model required="true"
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link com.sii.gametournament.Tournament#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Game</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game</em>' containment reference.
	 * @see #setGame(Game)
	 * @see com.sii.gametournament.GametournamentPackage#getTournament_Game()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Game getGame();

	/**
	 * Sets the value of the '{@link com.sii.gametournament.Tournament#getGame <em>Game</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game</em>' containment reference.
	 * @see #getGame()
	 * @generated
	 */
	void setGame(Game value);

	/**
	 * Returns the value of the '<em><b>Gamers</b></em>' containment reference list.
	 * The list contents are of type {@link com.sii.gametournament.Gamer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gamers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gamers</em>' containment reference list.
	 * @see com.sii.gametournament.GametournamentPackage#getTournament_Gamers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Gamer> getGamers();

	/**
	 * Returns the value of the '<em><b>Final Phase</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Phase</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Phase</em>' containment reference.
	 * @see #setFinalPhase(FinalPhase)
	 * @see com.sii.gametournament.GametournamentPackage#getTournament_FinalPhase()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FinalPhase getFinalPhase();

	/**
	 * Sets the value of the '{@link com.sii.gametournament.Tournament#getFinalPhase <em>Final Phase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Phase</em>' containment reference.
	 * @see #getFinalPhase()
	 * @generated
	 */
	void setFinalPhase(FinalPhase value);

	/**
	 * Returns the value of the '<em><b>Qualification Phase</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualification Phase</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualification Phase</em>' containment reference.
	 * @see #setQualificationPhase(QualificationPhase)
	 * @see com.sii.gametournament.GametournamentPackage#getTournament_QualificationPhase()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QualificationPhase getQualificationPhase();

	/**
	 * Sets the value of the '{@link com.sii.gametournament.Tournament#getQualificationPhase <em>Qualification Phase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualification Phase</em>' containment reference.
	 * @see #getQualificationPhase()
	 * @generated
	 */
	void setQualificationPhase(QualificationPhase value);

	/**
	 * Returns the value of the '<em><b>Prize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prize</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prize</em>' attribute.
	 * @see #setPrize(int)
	 * @see com.sii.gametournament.GametournamentPackage#getTournament_Prize()
	 * @model required="true"
	 * @generated
	 */
	int getPrize();

	/**
	 * Sets the value of the '{@link com.sii.gametournament.Tournament#getPrize <em>Prize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prize</em>' attribute.
	 * @see #getPrize()
	 * @generated
	 */
	void setPrize(int value);

} // Tournament

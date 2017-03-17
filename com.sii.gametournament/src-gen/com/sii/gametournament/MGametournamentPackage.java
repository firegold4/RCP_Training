/**
 */
package com.sii.gametournament;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.sii.gametournament.MGametournamentFactory
 * @model kind="package"
 * @generated
 */
public interface MGametournamentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gametournament";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.sii/gametournament/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gametournament";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MGametournamentPackage eINSTANCE = com.sii.gametournament.impl.MGametournamentPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.sii.gametournament.impl.MTournamentImpl <em>Tournament</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.gametournament.impl.MTournamentImpl
	 * @see com.sii.gametournament.impl.MGametournamentPackageImpl#getTournament()
	 * @generated
	 */
	int TOURNAMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__START_DATE = 2;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__END_DATE = 3;

	/**
	 * The feature id for the '<em><b>Game</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__GAME = 4;

	/**
	 * The feature id for the '<em><b>Gamers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__GAMERS = 5;

	/**
	 * The feature id for the '<em><b>Final Phase</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__FINAL_PHASE = 6;

	/**
	 * The feature id for the '<em><b>Qualification Phase</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__QUALIFICATION_PHASE = 7;

	/**
	 * The feature id for the '<em><b>Prize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__PRIZE = 8;

	/**
	 * The number of structural features of the '<em>Tournament</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Tournament</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.sii.gametournament.impl.MGamerImpl <em>Gamer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.gametournament.impl.MGamerImpl
	 * @see com.sii.gametournament.impl.MGametournamentPackageImpl#getGamer()
	 * @generated
	 */
	int GAMER = 1;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMER__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMER__LAST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Pseudo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMER__PSEUDO = 2;

	/**
	 * The feature id for the '<em><b>Victories</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMER__VICTORIES = 3;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMER__MATCHES = 4;

	/**
	 * The number of structural features of the '<em>Gamer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Gamer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.sii.gametournament.impl.MGameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.gametournament.impl.MGameImpl
	 * @see com.sii.gametournament.impl.MGametournamentPackageImpl#getGame()
	 * @generated
	 */
	int GAME = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.sii.gametournament.impl.MQualificationPhaseImpl <em>Qualification Phase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.gametournament.impl.MQualificationPhaseImpl
	 * @see com.sii.gametournament.impl.MGametournamentPackageImpl#getQualificationPhase()
	 * @generated
	 */
	int QUALIFICATION_PHASE = 3;

	/**
	 * The feature id for the '<em><b>Pools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_PHASE__POOLS = 0;

	/**
	 * The number of structural features of the '<em>Qualification Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_PHASE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Create Pools</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_PHASE___CREATE_POOLS = 0;

	/**
	 * The number of operations of the '<em>Qualification Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFICATION_PHASE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.sii.gametournament.impl.MFinalPhaseImpl <em>Final Phase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.gametournament.impl.MFinalPhaseImpl
	 * @see com.sii.gametournament.impl.MGametournamentPackageImpl#getFinalPhase()
	 * @generated
	 */
	int FINAL_PHASE = 4;

	/**
	 * The feature id for the '<em><b>Finalists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_PHASE__FINALISTS = 0;

	/**
	 * The feature id for the '<em><b>Qualificationphase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_PHASE__QUALIFICATIONPHASE = 1;

	/**
	 * The number of structural features of the '<em>Final Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_PHASE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Final Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_PHASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.sii.gametournament.impl.MPoolImpl <em>Pool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.gametournament.impl.MPoolImpl
	 * @see com.sii.gametournament.impl.MGametournamentPackageImpl#getPool()
	 * @generated
	 */
	int POOL = 5;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__PARTICIPANTS = 0;

	/**
	 * The feature id for the '<em><b>Classment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__CLASSMENT = 1;

	/**
	 * The number of structural features of the '<em>Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Generate Classment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL___GENERATE_CLASSMENT = 0;

	/**
	 * The number of operations of the '<em>Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.sii.gametournament.GameType <em>Game Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.gametournament.GameType
	 * @see com.sii.gametournament.impl.MGametournamentPackageImpl#getGameType()
	 * @generated
	 */
	int GAME_TYPE = 6;


	/**
	 * Returns the meta object for class '{@link com.sii.gametournament.MTournament <em>Tournament</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tournament</em>'.
	 * @see com.sii.gametournament.MTournament
	 * @generated
	 */
	EClass getTournament();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.gametournament.MTournament#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.sii.gametournament.MTournament#getName()
	 * @see #getTournament()
	 * @generated
	 */
	EAttribute getTournament_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.gametournament.MTournament#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see com.sii.gametournament.MTournament#getLocation()
	 * @see #getTournament()
	 * @generated
	 */
	EAttribute getTournament_Location();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.gametournament.MTournament#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see com.sii.gametournament.MTournament#getStartDate()
	 * @see #getTournament()
	 * @generated
	 */
	EAttribute getTournament_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.gametournament.MTournament#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see com.sii.gametournament.MTournament#getEndDate()
	 * @see #getTournament()
	 * @generated
	 */
	EAttribute getTournament_EndDate();

	/**
	 * Returns the meta object for the containment reference '{@link com.sii.gametournament.MTournament#getGame <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Game</em>'.
	 * @see com.sii.gametournament.MTournament#getGame()
	 * @see #getTournament()
	 * @generated
	 */
	EReference getTournament_Game();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sii.gametournament.MTournament#getGamers <em>Gamers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gamers</em>'.
	 * @see com.sii.gametournament.MTournament#getGamers()
	 * @see #getTournament()
	 * @generated
	 */
	EReference getTournament_Gamers();

	/**
	 * Returns the meta object for the containment reference '{@link com.sii.gametournament.MTournament#getFinalPhase <em>Final Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final Phase</em>'.
	 * @see com.sii.gametournament.MTournament#getFinalPhase()
	 * @see #getTournament()
	 * @generated
	 */
	EReference getTournament_FinalPhase();

	/**
	 * Returns the meta object for the containment reference '{@link com.sii.gametournament.MTournament#getQualificationPhase <em>Qualification Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualification Phase</em>'.
	 * @see com.sii.gametournament.MTournament#getQualificationPhase()
	 * @see #getTournament()
	 * @generated
	 */
	EReference getTournament_QualificationPhase();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.gametournament.MTournament#getPrize <em>Prize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prize</em>'.
	 * @see com.sii.gametournament.MTournament#getPrize()
	 * @see #getTournament()
	 * @generated
	 */
	EAttribute getTournament_Prize();

	/**
	 * Returns the meta object for class '{@link com.sii.gametournament.MGamer <em>Gamer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gamer</em>'.
	 * @see com.sii.gametournament.MGamer
	 * @generated
	 */
	EClass getGamer();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.gametournament.MGamer#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see com.sii.gametournament.MGamer#getFirstName()
	 * @see #getGamer()
	 * @generated
	 */
	EAttribute getGamer_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.gametournament.MGamer#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see com.sii.gametournament.MGamer#getLastName()
	 * @see #getGamer()
	 * @generated
	 */
	EAttribute getGamer_LastName();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.gametournament.MGamer#getPseudo <em>Pseudo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pseudo</em>'.
	 * @see com.sii.gametournament.MGamer#getPseudo()
	 * @see #getGamer()
	 * @generated
	 */
	EAttribute getGamer_Pseudo();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.gametournament.MGamer#getVictories <em>Victories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Victories</em>'.
	 * @see com.sii.gametournament.MGamer#getVictories()
	 * @see #getGamer()
	 * @generated
	 */
	EAttribute getGamer_Victories();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.gametournament.MGamer#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matches</em>'.
	 * @see com.sii.gametournament.MGamer#getMatches()
	 * @see #getGamer()
	 * @generated
	 */
	EAttribute getGamer_Matches();

	/**
	 * Returns the meta object for class '{@link com.sii.gametournament.MGame <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see com.sii.gametournament.MGame
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.gametournament.MGame#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.sii.gametournament.MGame#getName()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.gametournament.MGame#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.sii.gametournament.MGame#getType()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Type();

	/**
	 * Returns the meta object for class '{@link com.sii.gametournament.MQualificationPhase <em>Qualification Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualification Phase</em>'.
	 * @see com.sii.gametournament.MQualificationPhase
	 * @generated
	 */
	EClass getQualificationPhase();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sii.gametournament.MQualificationPhase#getPools <em>Pools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pools</em>'.
	 * @see com.sii.gametournament.MQualificationPhase#getPools()
	 * @see #getQualificationPhase()
	 * @generated
	 */
	EReference getQualificationPhase_Pools();

	/**
	 * Returns the meta object for the '{@link com.sii.gametournament.MQualificationPhase#createPools() <em>Create Pools</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Pools</em>' operation.
	 * @see com.sii.gametournament.MQualificationPhase#createPools()
	 * @generated
	 */
	EOperation getQualificationPhase__CreatePools();

	/**
	 * Returns the meta object for class '{@link com.sii.gametournament.MFinalPhase <em>Final Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Phase</em>'.
	 * @see com.sii.gametournament.MFinalPhase
	 * @generated
	 */
	EClass getFinalPhase();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sii.gametournament.MFinalPhase#getFinalists <em>Finalists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Finalists</em>'.
	 * @see com.sii.gametournament.MFinalPhase#getFinalists()
	 * @see #getFinalPhase()
	 * @generated
	 */
	EReference getFinalPhase_Finalists();

	/**
	 * Returns the meta object for the reference '{@link com.sii.gametournament.MFinalPhase#getQualificationphase <em>Qualificationphase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Qualificationphase</em>'.
	 * @see com.sii.gametournament.MFinalPhase#getQualificationphase()
	 * @see #getFinalPhase()
	 * @generated
	 */
	EReference getFinalPhase_Qualificationphase();

	/**
	 * Returns the meta object for class '{@link com.sii.gametournament.MPool <em>Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pool</em>'.
	 * @see com.sii.gametournament.MPool
	 * @generated
	 */
	EClass getPool();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sii.gametournament.MPool#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participants</em>'.
	 * @see com.sii.gametournament.MPool#getParticipants()
	 * @see #getPool()
	 * @generated
	 */
	EReference getPool_Participants();

	/**
	 * Returns the meta object for the reference list '{@link com.sii.gametournament.MPool#getClassment <em>Classment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classment</em>'.
	 * @see com.sii.gametournament.MPool#getClassment()
	 * @see #getPool()
	 * @generated
	 */
	EReference getPool_Classment();

	/**
	 * Returns the meta object for the '{@link com.sii.gametournament.MPool#generateClassment() <em>Generate Classment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Classment</em>' operation.
	 * @see com.sii.gametournament.MPool#generateClassment()
	 * @generated
	 */
	EOperation getPool__GenerateClassment();

	/**
	 * Returns the meta object for enum '{@link com.sii.gametournament.GameType <em>Game Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Game Type</em>'.
	 * @see com.sii.gametournament.GameType
	 * @generated
	 */
	EEnum getGameType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MGametournamentFactory getGametournamentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.sii.gametournament.impl.MTournamentImpl <em>Tournament</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.gametournament.impl.MTournamentImpl
		 * @see com.sii.gametournament.impl.MGametournamentPackageImpl#getTournament()
		 * @generated
		 */
		EClass TOURNAMENT = eINSTANCE.getTournament();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOURNAMENT__NAME = eINSTANCE.getTournament_Name();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOURNAMENT__LOCATION = eINSTANCE.getTournament_Location();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOURNAMENT__START_DATE = eINSTANCE.getTournament_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOURNAMENT__END_DATE = eINSTANCE.getTournament_EndDate();

		/**
		 * The meta object literal for the '<em><b>Game</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOURNAMENT__GAME = eINSTANCE.getTournament_Game();

		/**
		 * The meta object literal for the '<em><b>Gamers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOURNAMENT__GAMERS = eINSTANCE.getTournament_Gamers();

		/**
		 * The meta object literal for the '<em><b>Final Phase</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOURNAMENT__FINAL_PHASE = eINSTANCE.getTournament_FinalPhase();

		/**
		 * The meta object literal for the '<em><b>Qualification Phase</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOURNAMENT__QUALIFICATION_PHASE = eINSTANCE.getTournament_QualificationPhase();

		/**
		 * The meta object literal for the '<em><b>Prize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOURNAMENT__PRIZE = eINSTANCE.getTournament_Prize();

		/**
		 * The meta object literal for the '{@link com.sii.gametournament.impl.MGamerImpl <em>Gamer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.gametournament.impl.MGamerImpl
		 * @see com.sii.gametournament.impl.MGametournamentPackageImpl#getGamer()
		 * @generated
		 */
		EClass GAMER = eINSTANCE.getGamer();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAMER__FIRST_NAME = eINSTANCE.getGamer_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAMER__LAST_NAME = eINSTANCE.getGamer_LastName();

		/**
		 * The meta object literal for the '<em><b>Pseudo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAMER__PSEUDO = eINSTANCE.getGamer_Pseudo();

		/**
		 * The meta object literal for the '<em><b>Victories</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAMER__VICTORIES = eINSTANCE.getGamer_Victories();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAMER__MATCHES = eINSTANCE.getGamer_Matches();

		/**
		 * The meta object literal for the '{@link com.sii.gametournament.impl.MGameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.gametournament.impl.MGameImpl
		 * @see com.sii.gametournament.impl.MGametournamentPackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__NAME = eINSTANCE.getGame_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__TYPE = eINSTANCE.getGame_Type();

		/**
		 * The meta object literal for the '{@link com.sii.gametournament.impl.MQualificationPhaseImpl <em>Qualification Phase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.gametournament.impl.MQualificationPhaseImpl
		 * @see com.sii.gametournament.impl.MGametournamentPackageImpl#getQualificationPhase()
		 * @generated
		 */
		EClass QUALIFICATION_PHASE = eINSTANCE.getQualificationPhase();

		/**
		 * The meta object literal for the '<em><b>Pools</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFICATION_PHASE__POOLS = eINSTANCE.getQualificationPhase_Pools();

		/**
		 * The meta object literal for the '<em><b>Create Pools</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation QUALIFICATION_PHASE___CREATE_POOLS = eINSTANCE.getQualificationPhase__CreatePools();

		/**
		 * The meta object literal for the '{@link com.sii.gametournament.impl.MFinalPhaseImpl <em>Final Phase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.gametournament.impl.MFinalPhaseImpl
		 * @see com.sii.gametournament.impl.MGametournamentPackageImpl#getFinalPhase()
		 * @generated
		 */
		EClass FINAL_PHASE = eINSTANCE.getFinalPhase();

		/**
		 * The meta object literal for the '<em><b>Finalists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINAL_PHASE__FINALISTS = eINSTANCE.getFinalPhase_Finalists();

		/**
		 * The meta object literal for the '<em><b>Qualificationphase</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINAL_PHASE__QUALIFICATIONPHASE = eINSTANCE.getFinalPhase_Qualificationphase();

		/**
		 * The meta object literal for the '{@link com.sii.gametournament.impl.MPoolImpl <em>Pool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.gametournament.impl.MPoolImpl
		 * @see com.sii.gametournament.impl.MGametournamentPackageImpl#getPool()
		 * @generated
		 */
		EClass POOL = eINSTANCE.getPool();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POOL__PARTICIPANTS = eINSTANCE.getPool_Participants();

		/**
		 * The meta object literal for the '<em><b>Classment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POOL__CLASSMENT = eINSTANCE.getPool_Classment();

		/**
		 * The meta object literal for the '<em><b>Generate Classment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POOL___GENERATE_CLASSMENT = eINSTANCE.getPool__GenerateClassment();

		/**
		 * The meta object literal for the '{@link com.sii.gametournament.GameType <em>Game Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.gametournament.GameType
		 * @see com.sii.gametournament.impl.MGametournamentPackageImpl#getGameType()
		 * @generated
		 */
		EEnum GAME_TYPE = eINSTANCE.getGameType();

	}

} //MGametournamentPackage

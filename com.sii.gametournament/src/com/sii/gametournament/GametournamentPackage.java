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
 * @see com.sii.gametournament.GametournamentFactory
 * @model kind="package"
 * @generated
 */
public interface GametournamentPackage extends EPackage {
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
	GametournamentPackage eINSTANCE = com.sii.gametournament.impl.GametournamentPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.sii.gametournament.impl.TournamentImpl <em>Tournament</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.gametournament.impl.TournamentImpl
	 * @see com.sii.gametournament.impl.GametournamentPackageImpl#getTournament()
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
	 * The meta object id for the '{@link com.sii.gametournament.impl.GamerImpl <em>Gamer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.gametournament.impl.GamerImpl
	 * @see com.sii.gametournament.impl.GametournamentPackageImpl#getGamer()
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
	 * The meta object id for the '{@link com.sii.gametournament.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.gametournament.impl.GameImpl
	 * @see com.sii.gametournament.impl.GametournamentPackageImpl#getGame()
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
	 * The meta object id for the '{@link com.sii.gametournament.impl.QualificationPhaseImpl <em>Qualification Phase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.gametournament.impl.QualificationPhaseImpl
	 * @see com.sii.gametournament.impl.GametournamentPackageImpl#getQualificationPhase()
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
	 * The meta object id for the '{@link com.sii.gametournament.impl.FinalPhaseImpl <em>Final Phase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.gametournament.impl.FinalPhaseImpl
	 * @see com.sii.gametournament.impl.GametournamentPackageImpl#getFinalPhase()
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
	 * The meta object id for the '{@link com.sii.gametournament.impl.PoolImpl <em>Pool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.gametournament.impl.PoolImpl
	 * @see com.sii.gametournament.impl.GametournamentPackageImpl#getPool()
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
	 * @see com.sii.gametournament.impl.GametournamentPackageImpl#getGameType()
	 * @generated
	 */
	int GAME_TYPE = 6;


	/**
	 * Returns the meta object for class '{@link com.sii.gametournament.Tournament <em>Tournament</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tournament</em>'.
	 * @see com.sii.gametournament.Tournament
	 * @generated
	 */
	EClass getTournament();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.gametournament.Tournament#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.sii.gametournament.Tournament#getName()
	 * @see #getTournament()
	 * @generated
	 */
	EAttribute getTournament_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.gametournament.Tournament#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see com.sii.gametournament.Tournament#getLocation()
	 * @see #getTournament()
	 * @generated
	 */
	EAttribute getTournament_Location();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.gametournament.Tournament#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see com.sii.gametournament.Tournament#getStartDate()
	 * @see #getTournament()
	 * @generated
	 */
	EAttribute getTournament_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.gametournament.Tournament#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see com.sii.gametournament.Tournament#getEndDate()
	 * @see #getTournament()
	 * @generated
	 */
	EAttribute getTournament_EndDate();

	/**
	 * Returns the meta object for the containment reference '{@link com.sii.gametournament.Tournament#getGame <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Game</em>'.
	 * @see com.sii.gametournament.Tournament#getGame()
	 * @see #getTournament()
	 * @generated
	 */
	EReference getTournament_Game();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sii.gametournament.Tournament#getGamers <em>Gamers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gamers</em>'.
	 * @see com.sii.gametournament.Tournament#getGamers()
	 * @see #getTournament()
	 * @generated
	 */
	EReference getTournament_Gamers();

	/**
	 * Returns the meta object for the containment reference '{@link com.sii.gametournament.Tournament#getFinalPhase <em>Final Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final Phase</em>'.
	 * @see com.sii.gametournament.Tournament#getFinalPhase()
	 * @see #getTournament()
	 * @generated
	 */
	EReference getTournament_FinalPhase();

	/**
	 * Returns the meta object for the containment reference '{@link com.sii.gametournament.Tournament#getQualificationPhase <em>Qualification Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualification Phase</em>'.
	 * @see com.sii.gametournament.Tournament#getQualificationPhase()
	 * @see #getTournament()
	 * @generated
	 */
	EReference getTournament_QualificationPhase();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.gametournament.Tournament#getPrize <em>Prize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prize</em>'.
	 * @see com.sii.gametournament.Tournament#getPrize()
	 * @see #getTournament()
	 * @generated
	 */
	EAttribute getTournament_Prize();

	/**
	 * Returns the meta object for class '{@link com.sii.gametournament.Gamer <em>Gamer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gamer</em>'.
	 * @see com.sii.gametournament.Gamer
	 * @generated
	 */
	EClass getGamer();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.gametournament.Gamer#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see com.sii.gametournament.Gamer#getFirstName()
	 * @see #getGamer()
	 * @generated
	 */
	EAttribute getGamer_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.gametournament.Gamer#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see com.sii.gametournament.Gamer#getLastName()
	 * @see #getGamer()
	 * @generated
	 */
	EAttribute getGamer_LastName();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.gametournament.Gamer#getPseudo <em>Pseudo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pseudo</em>'.
	 * @see com.sii.gametournament.Gamer#getPseudo()
	 * @see #getGamer()
	 * @generated
	 */
	EAttribute getGamer_Pseudo();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.gametournament.Gamer#getVictories <em>Victories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Victories</em>'.
	 * @see com.sii.gametournament.Gamer#getVictories()
	 * @see #getGamer()
	 * @generated
	 */
	EAttribute getGamer_Victories();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.gametournament.Gamer#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matches</em>'.
	 * @see com.sii.gametournament.Gamer#getMatches()
	 * @see #getGamer()
	 * @generated
	 */
	EAttribute getGamer_Matches();

	/**
	 * Returns the meta object for class '{@link com.sii.gametournament.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see com.sii.gametournament.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.gametournament.Game#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.sii.gametournament.Game#getName()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.gametournament.Game#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.sii.gametournament.Game#getType()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Type();

	/**
	 * Returns the meta object for class '{@link com.sii.gametournament.QualificationPhase <em>Qualification Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualification Phase</em>'.
	 * @see com.sii.gametournament.QualificationPhase
	 * @generated
	 */
	EClass getQualificationPhase();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sii.gametournament.QualificationPhase#getPools <em>Pools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pools</em>'.
	 * @see com.sii.gametournament.QualificationPhase#getPools()
	 * @see #getQualificationPhase()
	 * @generated
	 */
	EReference getQualificationPhase_Pools();

	/**
	 * Returns the meta object for the '{@link com.sii.gametournament.QualificationPhase#createPools() <em>Create Pools</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Pools</em>' operation.
	 * @see com.sii.gametournament.QualificationPhase#createPools()
	 * @generated
	 */
	EOperation getQualificationPhase__CreatePools();

	/**
	 * Returns the meta object for class '{@link com.sii.gametournament.FinalPhase <em>Final Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Phase</em>'.
	 * @see com.sii.gametournament.FinalPhase
	 * @generated
	 */
	EClass getFinalPhase();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sii.gametournament.FinalPhase#getFinalists <em>Finalists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Finalists</em>'.
	 * @see com.sii.gametournament.FinalPhase#getFinalists()
	 * @see #getFinalPhase()
	 * @generated
	 */
	EReference getFinalPhase_Finalists();

	/**
	 * Returns the meta object for the reference '{@link com.sii.gametournament.FinalPhase#getQualificationphase <em>Qualificationphase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Qualificationphase</em>'.
	 * @see com.sii.gametournament.FinalPhase#getQualificationphase()
	 * @see #getFinalPhase()
	 * @generated
	 */
	EReference getFinalPhase_Qualificationphase();

	/**
	 * Returns the meta object for class '{@link com.sii.gametournament.Pool <em>Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pool</em>'.
	 * @see com.sii.gametournament.Pool
	 * @generated
	 */
	EClass getPool();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sii.gametournament.Pool#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participants</em>'.
	 * @see com.sii.gametournament.Pool#getParticipants()
	 * @see #getPool()
	 * @generated
	 */
	EReference getPool_Participants();

	/**
	 * Returns the meta object for the reference list '{@link com.sii.gametournament.Pool#getClassment <em>Classment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classment</em>'.
	 * @see com.sii.gametournament.Pool#getClassment()
	 * @see #getPool()
	 * @generated
	 */
	EReference getPool_Classment();

	/**
	 * Returns the meta object for the '{@link com.sii.gametournament.Pool#generateClassment() <em>Generate Classment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Classment</em>' operation.
	 * @see com.sii.gametournament.Pool#generateClassment()
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
	GametournamentFactory getGametournamentFactory();

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
		 * The meta object literal for the '{@link com.sii.gametournament.impl.TournamentImpl <em>Tournament</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.gametournament.impl.TournamentImpl
		 * @see com.sii.gametournament.impl.GametournamentPackageImpl#getTournament()
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
		 * The meta object literal for the '{@link com.sii.gametournament.impl.GamerImpl <em>Gamer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.gametournament.impl.GamerImpl
		 * @see com.sii.gametournament.impl.GametournamentPackageImpl#getGamer()
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
		 * The meta object literal for the '{@link com.sii.gametournament.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.gametournament.impl.GameImpl
		 * @see com.sii.gametournament.impl.GametournamentPackageImpl#getGame()
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
		 * The meta object literal for the '{@link com.sii.gametournament.impl.QualificationPhaseImpl <em>Qualification Phase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.gametournament.impl.QualificationPhaseImpl
		 * @see com.sii.gametournament.impl.GametournamentPackageImpl#getQualificationPhase()
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
		 * The meta object literal for the '{@link com.sii.gametournament.impl.FinalPhaseImpl <em>Final Phase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.gametournament.impl.FinalPhaseImpl
		 * @see com.sii.gametournament.impl.GametournamentPackageImpl#getFinalPhase()
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
		 * The meta object literal for the '{@link com.sii.gametournament.impl.PoolImpl <em>Pool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.gametournament.impl.PoolImpl
		 * @see com.sii.gametournament.impl.GametournamentPackageImpl#getPool()
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
		 * @see com.sii.gametournament.impl.GametournamentPackageImpl#getGameType()
		 * @generated
		 */
		EEnum GAME_TYPE = eINSTANCE.getGameType();

	}

} //GametournamentPackage

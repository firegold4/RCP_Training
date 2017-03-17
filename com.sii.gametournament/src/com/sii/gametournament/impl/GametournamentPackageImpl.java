/**
 */
package com.sii.gametournament.impl;

import com.sii.gametournament.FinalPhase;
import com.sii.gametournament.Game;
import com.sii.gametournament.GameType;
import com.sii.gametournament.Gamer;
import com.sii.gametournament.GametournamentFactory;
import com.sii.gametournament.GametournamentPackage;
import com.sii.gametournament.Pool;
import com.sii.gametournament.QualificationPhase;
import com.sii.gametournament.Tournament;

import com.sii.gametournament.util.GametournamentValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GametournamentPackageImpl extends EPackageImpl implements GametournamentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tournamentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gamerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualificationPhaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalPhaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gameTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.sii.gametournament.GametournamentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GametournamentPackageImpl() {
		super(eNS_URI, GametournamentFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GametournamentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GametournamentPackage init() {
		if (isInited) return (GametournamentPackage)EPackage.Registry.INSTANCE.getEPackage(GametournamentPackage.eNS_URI);

		// Obtain or create and register package
		GametournamentPackageImpl theGametournamentPackage = (GametournamentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GametournamentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GametournamentPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGametournamentPackage.createPackageContents();

		// Initialize created meta-data
		theGametournamentPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theGametournamentPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return GametournamentValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theGametournamentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GametournamentPackage.eNS_URI, theGametournamentPackage);
		return theGametournamentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTournament() {
		return tournamentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTournament_Name() {
		return (EAttribute)tournamentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTournament_Location() {
		return (EAttribute)tournamentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTournament_StartDate() {
		return (EAttribute)tournamentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTournament_EndDate() {
		return (EAttribute)tournamentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTournament_Game() {
		return (EReference)tournamentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTournament_Gamers() {
		return (EReference)tournamentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTournament_FinalPhase() {
		return (EReference)tournamentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTournament_QualificationPhase() {
		return (EReference)tournamentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTournament_Prize() {
		return (EAttribute)tournamentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGamer() {
		return gamerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGamer_FirstName() {
		return (EAttribute)gamerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGamer_LastName() {
		return (EAttribute)gamerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGamer_Pseudo() {
		return (EAttribute)gamerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGamer_Victories() {
		return (EAttribute)gamerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGamer_Matches() {
		return (EAttribute)gamerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGame() {
		return gameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGame_Name() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGame_Type() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualificationPhase() {
		return qualificationPhaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualificationPhase_Pools() {
		return (EReference)qualificationPhaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getQualificationPhase__CreatePools() {
		return qualificationPhaseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalPhase() {
		return finalPhaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFinalPhase_Finalists() {
		return (EReference)finalPhaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFinalPhase_Qualificationphase() {
		return (EReference)finalPhaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPool() {
		return poolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPool_Participants() {
		return (EReference)poolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPool_Classment() {
		return (EReference)poolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPool__GenerateClassment() {
		return poolEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGameType() {
		return gameTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GametournamentFactory getGametournamentFactory() {
		return (GametournamentFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tournamentEClass = createEClass(TOURNAMENT);
		createEAttribute(tournamentEClass, TOURNAMENT__NAME);
		createEAttribute(tournamentEClass, TOURNAMENT__LOCATION);
		createEAttribute(tournamentEClass, TOURNAMENT__START_DATE);
		createEAttribute(tournamentEClass, TOURNAMENT__END_DATE);
		createEReference(tournamentEClass, TOURNAMENT__GAME);
		createEReference(tournamentEClass, TOURNAMENT__GAMERS);
		createEReference(tournamentEClass, TOURNAMENT__FINAL_PHASE);
		createEReference(tournamentEClass, TOURNAMENT__QUALIFICATION_PHASE);
		createEAttribute(tournamentEClass, TOURNAMENT__PRIZE);

		gamerEClass = createEClass(GAMER);
		createEAttribute(gamerEClass, GAMER__FIRST_NAME);
		createEAttribute(gamerEClass, GAMER__LAST_NAME);
		createEAttribute(gamerEClass, GAMER__PSEUDO);
		createEAttribute(gamerEClass, GAMER__VICTORIES);
		createEAttribute(gamerEClass, GAMER__MATCHES);

		gameEClass = createEClass(GAME);
		createEAttribute(gameEClass, GAME__NAME);
		createEAttribute(gameEClass, GAME__TYPE);

		qualificationPhaseEClass = createEClass(QUALIFICATION_PHASE);
		createEReference(qualificationPhaseEClass, QUALIFICATION_PHASE__POOLS);
		createEOperation(qualificationPhaseEClass, QUALIFICATION_PHASE___CREATE_POOLS);

		finalPhaseEClass = createEClass(FINAL_PHASE);
		createEReference(finalPhaseEClass, FINAL_PHASE__FINALISTS);
		createEReference(finalPhaseEClass, FINAL_PHASE__QUALIFICATIONPHASE);

		poolEClass = createEClass(POOL);
		createEReference(poolEClass, POOL__PARTICIPANTS);
		createEReference(poolEClass, POOL__CLASSMENT);
		createEOperation(poolEClass, POOL___GENERATE_CLASSMENT);

		// Create enums
		gameTypeEEnum = createEEnum(GAME_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(tournamentEClass, Tournament.class, "Tournament", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTournament_Name(), ecorePackage.getEString(), "name", null, 1, 1, Tournament.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTournament_Location(), ecorePackage.getEString(), "location", null, 1, 1, Tournament.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTournament_StartDate(), ecorePackage.getEDate(), "startDate", null, 1, 1, Tournament.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTournament_EndDate(), ecorePackage.getEDate(), "endDate", null, 1, 1, Tournament.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTournament_Game(), this.getGame(), null, "game", null, 1, 1, Tournament.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTournament_Gamers(), this.getGamer(), null, "gamers", null, 0, -1, Tournament.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTournament_FinalPhase(), this.getFinalPhase(), null, "finalPhase", null, 1, 1, Tournament.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTournament_QualificationPhase(), this.getQualificationPhase(), null, "qualificationPhase", null, 1, 1, Tournament.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTournament_Prize(), ecorePackage.getEInt(), "prize", null, 1, 1, Tournament.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gamerEClass, Gamer.class, "Gamer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGamer_FirstName(), ecorePackage.getEString(), "firstName", null, 1, 1, Gamer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGamer_LastName(), ecorePackage.getEString(), "lastName", null, 1, 1, Gamer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGamer_Pseudo(), ecorePackage.getEString(), "pseudo", null, 0, 1, Gamer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGamer_Victories(), ecorePackage.getEInt(), "victories", null, 0, 1, Gamer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGamer_Matches(), ecorePackage.getEInt(), "matches", null, 0, 1, Gamer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameEClass, Game.class, "Game", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGame_Name(), ecorePackage.getEString(), "name", null, 1, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGame_Type(), this.getGameType(), "type", null, 1, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualificationPhaseEClass, QualificationPhase.class, "QualificationPhase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQualificationPhase_Pools(), this.getPool(), null, "pools", null, 1, 16, QualificationPhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getQualificationPhase__CreatePools(), this.getPool(), "createPools", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(finalPhaseEClass, FinalPhase.class, "FinalPhase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFinalPhase_Finalists(), this.getGamer(), null, "finalists", null, 1, 16, FinalPhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFinalPhase_Qualificationphase(), this.getQualificationPhase(), null, "qualificationphase", null, 1, 1, FinalPhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poolEClass, Pool.class, "Pool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPool_Participants(), this.getGamer(), null, "participants", null, 4, 4, Pool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPool_Classment(), this.getGamer(), null, "classment", null, 4, 4, Pool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPool__GenerateClassment(), null, "generateClassment", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(gameTypeEEnum, GameType.class, "GameType");
		addEEnumLiteral(gameTypeEEnum, GameType.ACTION);
		addEEnumLiteral(gameTypeEEnum, GameType.RPG);
		addEEnumLiteral(gameTypeEEnum, GameType.FPS);
		addEEnumLiteral(gameTypeEEnum, GameType.STRATEGIC);
		addEEnumLiteral(gameTypeEEnum, GameType.COMBAT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (tournamentEClass, 
		   source, 
		   new String[] {
			 "constraints", "checkName"
		   });
	}

} //GametournamentPackageImpl

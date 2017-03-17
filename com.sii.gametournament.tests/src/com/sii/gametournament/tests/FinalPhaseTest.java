/**
 */
package com.sii.gametournament.tests;

import com.sii.gametournament.FinalPhase;
import com.sii.gametournament.GametournamentFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Final Phase</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FinalPhaseTest extends TestCase {

	/**
	 * The fixture for this Final Phase test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalPhase fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FinalPhaseTest.class);
	}

	/**
	 * Constructs a new Final Phase test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalPhaseTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Final Phase test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FinalPhase fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Final Phase test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalPhase getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GametournamentFactory.eINSTANCE.createFinalPhase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //FinalPhaseTest

/**
 */
package com.sii.gametournament.util;

import com.sii.gametournament.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.sii.gametournament.MGametournamentPackage
 * @generated
 */
public class GametournamentAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MGametournamentPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GametournamentAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MGametournamentPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GametournamentSwitch<Adapter> modelSwitch =
		new GametournamentSwitch<Adapter>() {
			@Override
			public Adapter caseTournament(MTournament object) {
				return createTournamentAdapter();
			}
			@Override
			public Adapter caseGamer(MGamer object) {
				return createGamerAdapter();
			}
			@Override
			public Adapter caseGame(MGame object) {
				return createGameAdapter();
			}
			@Override
			public Adapter caseQualificationPhase(MQualificationPhase object) {
				return createQualificationPhaseAdapter();
			}
			@Override
			public Adapter caseFinalPhase(MFinalPhase object) {
				return createFinalPhaseAdapter();
			}
			@Override
			public Adapter casePool(MPool object) {
				return createPoolAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.sii.gametournament.MTournament <em>Tournament</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sii.gametournament.MTournament
	 * @generated
	 */
	public Adapter createTournamentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sii.gametournament.MGamer <em>Gamer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sii.gametournament.MGamer
	 * @generated
	 */
	public Adapter createGamerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sii.gametournament.MGame <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sii.gametournament.MGame
	 * @generated
	 */
	public Adapter createGameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sii.gametournament.MQualificationPhase <em>Qualification Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sii.gametournament.MQualificationPhase
	 * @generated
	 */
	public Adapter createQualificationPhaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sii.gametournament.MFinalPhase <em>Final Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sii.gametournament.MFinalPhase
	 * @generated
	 */
	public Adapter createFinalPhaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sii.gametournament.MPool <em>Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sii.gametournament.MPool
	 * @generated
	 */
	public Adapter createPoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GametournamentAdapterFactory

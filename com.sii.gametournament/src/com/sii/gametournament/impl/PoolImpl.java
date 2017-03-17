/**
 */
package com.sii.gametournament.impl;

import com.sii.gametournament.Gamer;
import com.sii.gametournament.GametournamentPackage;
import com.sii.gametournament.Pool;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sii.gametournament.impl.PoolImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link com.sii.gametournament.impl.PoolImpl#getClassment <em>Classment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PoolImpl extends MinimalEObjectImpl.Container implements Pool {
	/**
	 * The cached value of the '{@link #getParticipants() <em>Participants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<Gamer> participants;

	/**
	 * The cached value of the '{@link #getClassment() <em>Classment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassment()
	 * @generated
	 * @ordered
	 */
	protected EList<Gamer> classment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GametournamentPackage.Literals.POOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gamer> getParticipants() {
		if (participants == null) {
			participants = new EObjectContainmentEList<Gamer>(Gamer.class, this, GametournamentPackage.POOL__PARTICIPANTS);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gamer> getClassment() {
		if (classment == null) {
			classment = new EObjectResolvingEList<Gamer>(Gamer.class, this, GametournamentPackage.POOL__CLASSMENT);
		}
		return classment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void generateClassment() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GametournamentPackage.POOL__PARTICIPANTS:
				return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GametournamentPackage.POOL__PARTICIPANTS:
				return getParticipants();
			case GametournamentPackage.POOL__CLASSMENT:
				return getClassment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GametournamentPackage.POOL__PARTICIPANTS:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends Gamer>)newValue);
				return;
			case GametournamentPackage.POOL__CLASSMENT:
				getClassment().clear();
				getClassment().addAll((Collection<? extends Gamer>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GametournamentPackage.POOL__PARTICIPANTS:
				getParticipants().clear();
				return;
			case GametournamentPackage.POOL__CLASSMENT:
				getClassment().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GametournamentPackage.POOL__PARTICIPANTS:
				return participants != null && !participants.isEmpty();
			case GametournamentPackage.POOL__CLASSMENT:
				return classment != null && !classment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GametournamentPackage.POOL___GENERATE_CLASSMENT:
				generateClassment();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //PoolImpl

/**
 */
package com.sii.gametournament.impl;

import com.sii.gametournament.FinalPhase;
import com.sii.gametournament.Gamer;
import com.sii.gametournament.GametournamentPackage;
import com.sii.gametournament.MGametournamentPackage;
import com.sii.gametournament.QualificationPhase;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Final Phase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sii.gametournament.impl.MFinalPhaseImpl#getFinalists <em>Finalists</em>}</li>
 *   <li>{@link com.sii.gametournament.impl.MFinalPhaseImpl#getQualificationphase <em>Qualificationphase</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 public class MFinalPhaseImpl extends MinimalEObjectImpl.Container implements FinalPhase {
	/**
	 * The cached value of the '{@link #getFinalists() <em>Finalists</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalists()
	 * @generated
	 * @ordered
	 */
	protected EList<Gamer> finalists;

	/**
	 * The cached value of the '{@link #getQualificationphase() <em>Qualificationphase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificationphase()
	 * @generated
	 * @ordered
	 */
	protected QualificationPhase qualificationphase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MFinalPhaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MGametournamentPackage.Literals.FINAL_PHASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gamer> getFinalists() {
		if (finalists == null) {
			finalists = new EObjectContainmentEList<Gamer>(Gamer.class, this, GametournamentPackage.FINAL_PHASE__FINALISTS);
		}
		return finalists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualificationPhase getQualificationphase() {
		if (qualificationphase != null && qualificationphase.eIsProxy()) {
			InternalEObject oldQualificationphase = (InternalEObject)qualificationphase;
			qualificationphase = (QualificationPhase)eResolveProxy(oldQualificationphase);
			if (qualificationphase != oldQualificationphase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MGametournamentPackage.FINAL_PHASE__QUALIFICATIONPHASE, oldQualificationphase, qualificationphase));
			}
		}
		return qualificationphase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualificationPhase basicGetQualificationphase() {
		return qualificationphase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualificationphase(QualificationPhase newQualificationphase) {
		QualificationPhase oldQualificationphase = qualificationphase;
		qualificationphase = newQualificationphase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MGametournamentPackage.FINAL_PHASE__QUALIFICATIONPHASE, oldQualificationphase, qualificationphase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MGametournamentPackage.FINAL_PHASE__FINALISTS:
				return ((InternalEList<?>)getFinalists()).basicRemove(otherEnd, msgs);
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
			case MGametournamentPackage.FINAL_PHASE__FINALISTS:
				return getFinalists();
			case MGametournamentPackage.FINAL_PHASE__QUALIFICATIONPHASE:
				if (resolve) return getQualificationphase();
				return basicGetQualificationphase();
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
			case MGametournamentPackage.FINAL_PHASE__FINALISTS:
				getFinalists().clear();
				getFinalists().addAll((Collection<? extends Gamer>)newValue);
				return;
			case MGametournamentPackage.FINAL_PHASE__QUALIFICATIONPHASE:
				setQualificationphase((QualificationPhase)newValue);
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
			case MGametournamentPackage.FINAL_PHASE__FINALISTS:
				getFinalists().clear();
				return;
			case MGametournamentPackage.FINAL_PHASE__QUALIFICATIONPHASE:
				setQualificationphase((QualificationPhase)null);
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
			case MGametournamentPackage.FINAL_PHASE__FINALISTS:
				return finalists != null && !finalists.isEmpty();
			case MGametournamentPackage.FINAL_PHASE__QUALIFICATIONPHASE:
				return qualificationphase != null;
		}
		return super.eIsSet(featureID);
	}

} //MFinalPhaseImpl

/**
 */
package com.sii.gametournament.impl;

import com.sii.gametournament.FinalPhase;
import com.sii.gametournament.Game;
import com.sii.gametournament.Gamer;
import com.sii.gametournament.GametournamentPackage;
import com.sii.gametournament.MGametournamentPackage;
import com.sii.gametournament.QualificationPhase;
import com.sii.gametournament.Tournament;
import java.util.Collection;
import java.util.Date;
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
 * An implementation of the model object '<em><b>Tournament</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sii.gametournament.impl.MTournamentImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.sii.gametournament.impl.MTournamentImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link com.sii.gametournament.impl.MTournamentImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link com.sii.gametournament.impl.MTournamentImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link com.sii.gametournament.impl.MTournamentImpl#getGame <em>Game</em>}</li>
 *   <li>{@link com.sii.gametournament.impl.MTournamentImpl#getGamers <em>Gamers</em>}</li>
 *   <li>{@link com.sii.gametournament.impl.MTournamentImpl#getFinalPhase <em>Final Phase</em>}</li>
 *   <li>{@link com.sii.gametournament.impl.MTournamentImpl#getQualificationPhase <em>Qualification Phase</em>}</li>
 *   <li>{@link com.sii.gametournament.impl.MTournamentImpl#getPrize <em>Prize</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 public class MTournamentImpl extends MinimalEObjectImpl.Container implements Tournament {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGame() <em>Game</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGame()
	 * @generated
	 * @ordered
	 */
	protected Game game;

	/**
	 * The cached value of the '{@link #getGamers() <em>Gamers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamers()
	 * @generated
	 * @ordered
	 */
	protected EList<Gamer> gamers;

	/**
	 * The cached value of the '{@link #getFinalPhase() <em>Final Phase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalPhase()
	 * @generated
	 * @ordered
	 */
	protected FinalPhase finalPhase;

	/**
	 * The cached value of the '{@link #getQualificationPhase() <em>Qualification Phase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificationPhase()
	 * @generated
	 * @ordered
	 */
	protected QualificationPhase qualificationPhase;

	/**
	 * The default value of the '{@link #getPrize() <em>Prize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrize()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrize() <em>Prize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrize()
	 * @generated
	 * @ordered
	 */
	protected int prize = PRIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MTournamentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MGametournamentPackage.Literals.TOURNAMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MGametournamentPackage.TOURNAMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MGametournamentPackage.TOURNAMENT__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MGametournamentPackage.TOURNAMENT__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MGametournamentPackage.TOURNAMENT__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Game getGame() {
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGame(Game newGame, NotificationChain msgs) {
		Game oldGame = game;
		game = newGame;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MGametournamentPackage.TOURNAMENT__GAME, oldGame, newGame);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGame(Game newGame) {
		if (newGame != game) {
			NotificationChain msgs = null;
			if (game != null)
				msgs = ((InternalEObject)game).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MGametournamentPackage.TOURNAMENT__GAME, null, msgs);
			if (newGame != null)
				msgs = ((InternalEObject)newGame).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MGametournamentPackage.TOURNAMENT__GAME, null, msgs);
			msgs = basicSetGame(newGame, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MGametournamentPackage.TOURNAMENT__GAME, newGame, newGame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gamer> getGamers() {
		if (gamers == null) {
			gamers = new EObjectContainmentEList<Gamer>(Gamer.class, this, GametournamentPackage.TOURNAMENT__GAMERS);
		}
		return gamers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalPhase getFinalPhase() {
		return finalPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalPhase(FinalPhase newFinalPhase, NotificationChain msgs) {
		FinalPhase oldFinalPhase = finalPhase;
		finalPhase = newFinalPhase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MGametournamentPackage.TOURNAMENT__FINAL_PHASE, oldFinalPhase, newFinalPhase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalPhase(FinalPhase newFinalPhase) {
		if (newFinalPhase != finalPhase) {
			NotificationChain msgs = null;
			if (finalPhase != null)
				msgs = ((InternalEObject)finalPhase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MGametournamentPackage.TOURNAMENT__FINAL_PHASE, null, msgs);
			if (newFinalPhase != null)
				msgs = ((InternalEObject)newFinalPhase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MGametournamentPackage.TOURNAMENT__FINAL_PHASE, null, msgs);
			msgs = basicSetFinalPhase(newFinalPhase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MGametournamentPackage.TOURNAMENT__FINAL_PHASE, newFinalPhase, newFinalPhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualificationPhase getQualificationPhase() {
		return qualificationPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQualificationPhase(QualificationPhase newQualificationPhase, NotificationChain msgs) {
		QualificationPhase oldQualificationPhase = qualificationPhase;
		qualificationPhase = newQualificationPhase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MGametournamentPackage.TOURNAMENT__QUALIFICATION_PHASE, oldQualificationPhase, newQualificationPhase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualificationPhase(QualificationPhase newQualificationPhase) {
		if (newQualificationPhase != qualificationPhase) {
			NotificationChain msgs = null;
			if (qualificationPhase != null)
				msgs = ((InternalEObject)qualificationPhase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MGametournamentPackage.TOURNAMENT__QUALIFICATION_PHASE, null, msgs);
			if (newQualificationPhase != null)
				msgs = ((InternalEObject)newQualificationPhase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MGametournamentPackage.TOURNAMENT__QUALIFICATION_PHASE, null, msgs);
			msgs = basicSetQualificationPhase(newQualificationPhase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MGametournamentPackage.TOURNAMENT__QUALIFICATION_PHASE, newQualificationPhase, newQualificationPhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrize() {
		return prize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrize(int newPrize) {
		int oldPrize = prize;
		prize = newPrize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MGametournamentPackage.TOURNAMENT__PRIZE, oldPrize, prize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MGametournamentPackage.TOURNAMENT__GAME:
				return basicSetGame(null, msgs);
			case MGametournamentPackage.TOURNAMENT__GAMERS:
				return ((InternalEList<?>)getGamers()).basicRemove(otherEnd, msgs);
			case MGametournamentPackage.TOURNAMENT__FINAL_PHASE:
				return basicSetFinalPhase(null, msgs);
			case MGametournamentPackage.TOURNAMENT__QUALIFICATION_PHASE:
				return basicSetQualificationPhase(null, msgs);
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
			case MGametournamentPackage.TOURNAMENT__NAME:
				return getName();
			case MGametournamentPackage.TOURNAMENT__LOCATION:
				return getLocation();
			case MGametournamentPackage.TOURNAMENT__START_DATE:
				return getStartDate();
			case MGametournamentPackage.TOURNAMENT__END_DATE:
				return getEndDate();
			case MGametournamentPackage.TOURNAMENT__GAME:
				return getGame();
			case MGametournamentPackage.TOURNAMENT__GAMERS:
				return getGamers();
			case MGametournamentPackage.TOURNAMENT__FINAL_PHASE:
				return getFinalPhase();
			case MGametournamentPackage.TOURNAMENT__QUALIFICATION_PHASE:
				return getQualificationPhase();
			case MGametournamentPackage.TOURNAMENT__PRIZE:
				return getPrize();
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
			case MGametournamentPackage.TOURNAMENT__NAME:
				setName((String)newValue);
				return;
			case MGametournamentPackage.TOURNAMENT__LOCATION:
				setLocation((String)newValue);
				return;
			case MGametournamentPackage.TOURNAMENT__START_DATE:
				setStartDate((Date)newValue);
				return;
			case MGametournamentPackage.TOURNAMENT__END_DATE:
				setEndDate((Date)newValue);
				return;
			case MGametournamentPackage.TOURNAMENT__GAME:
				setGame((Game)newValue);
				return;
			case MGametournamentPackage.TOURNAMENT__GAMERS:
				getGamers().clear();
				getGamers().addAll((Collection<? extends Gamer>)newValue);
				return;
			case MGametournamentPackage.TOURNAMENT__FINAL_PHASE:
				setFinalPhase((FinalPhase)newValue);
				return;
			case MGametournamentPackage.TOURNAMENT__QUALIFICATION_PHASE:
				setQualificationPhase((QualificationPhase)newValue);
				return;
			case MGametournamentPackage.TOURNAMENT__PRIZE:
				setPrize((Integer)newValue);
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
			case MGametournamentPackage.TOURNAMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MGametournamentPackage.TOURNAMENT__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case MGametournamentPackage.TOURNAMENT__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case MGametournamentPackage.TOURNAMENT__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case MGametournamentPackage.TOURNAMENT__GAME:
				setGame((Game)null);
				return;
			case MGametournamentPackage.TOURNAMENT__GAMERS:
				getGamers().clear();
				return;
			case MGametournamentPackage.TOURNAMENT__FINAL_PHASE:
				setFinalPhase((FinalPhase)null);
				return;
			case MGametournamentPackage.TOURNAMENT__QUALIFICATION_PHASE:
				setQualificationPhase((QualificationPhase)null);
				return;
			case MGametournamentPackage.TOURNAMENT__PRIZE:
				setPrize(PRIZE_EDEFAULT);
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
			case MGametournamentPackage.TOURNAMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MGametournamentPackage.TOURNAMENT__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case MGametournamentPackage.TOURNAMENT__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case MGametournamentPackage.TOURNAMENT__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case MGametournamentPackage.TOURNAMENT__GAME:
				return game != null;
			case MGametournamentPackage.TOURNAMENT__GAMERS:
				return gamers != null && !gamers.isEmpty();
			case MGametournamentPackage.TOURNAMENT__FINAL_PHASE:
				return finalPhase != null;
			case MGametournamentPackage.TOURNAMENT__QUALIFICATION_PHASE:
				return qualificationPhase != null;
			case MGametournamentPackage.TOURNAMENT__PRIZE:
				return prize != PRIZE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", location: ");
		result.append(location);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", prize: ");
		result.append(prize);
		result.append(')');
		return result.toString();
	}

} //MTournamentImpl

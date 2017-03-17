/**
 */
package com.sii.gametournament.impl;

import com.sii.gametournament.Gamer;
import com.sii.gametournament.GametournamentPackage;
import com.sii.gametournament.MGametournamentPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gamer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sii.gametournament.impl.MGamerImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link com.sii.gametournament.impl.MGamerImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link com.sii.gametournament.impl.MGamerImpl#getPseudo <em>Pseudo</em>}</li>
 *   <li>{@link com.sii.gametournament.impl.MGamerImpl#getVictories <em>Victories</em>}</li>
 *   <li>{@link com.sii.gametournament.impl.MGamerImpl#getMatches <em>Matches</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 public class MGamerImpl extends MinimalEObjectImpl.Container implements Gamer {
	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPseudo() <em>Pseudo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPseudo()
	 * @generated
	 * @ordered
	 */
	protected static final String PSEUDO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPseudo() <em>Pseudo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPseudo()
	 * @generated
	 * @ordered
	 */
	protected String pseudo = PSEUDO_EDEFAULT;

	/**
	 * The default value of the '{@link #getVictories() <em>Victories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVictories()
	 * @generated
	 * @ordered
	 */
	protected static final int VICTORIES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVictories() <em>Victories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVictories()
	 * @generated
	 * @ordered
	 */
	protected int victories = VICTORIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatches() <em>Matches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatches()
	 * @generated
	 * @ordered
	 */
	protected static final int MATCHES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMatches() <em>Matches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatches()
	 * @generated
	 * @ordered
	 */
	protected int matches = MATCHES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MGamerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MGametournamentPackage.Literals.GAMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MGametournamentPackage.GAMER__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MGametournamentPackage.GAMER__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPseudo() {
		return pseudo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPseudo(String newPseudo) {
		String oldPseudo = pseudo;
		pseudo = newPseudo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MGametournamentPackage.GAMER__PSEUDO, oldPseudo, pseudo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVictories() {
		return victories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVictories(int newVictories) {
		int oldVictories = victories;
		victories = newVictories;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MGametournamentPackage.GAMER__VICTORIES, oldVictories, victories));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMatches() {
		return matches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatches(int newMatches) {
		int oldMatches = matches;
		matches = newMatches;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MGametournamentPackage.GAMER__MATCHES, oldMatches, matches));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MGametournamentPackage.GAMER__FIRST_NAME:
				return getFirstName();
			case MGametournamentPackage.GAMER__LAST_NAME:
				return getLastName();
			case MGametournamentPackage.GAMER__PSEUDO:
				return getPseudo();
			case MGametournamentPackage.GAMER__VICTORIES:
				return getVictories();
			case MGametournamentPackage.GAMER__MATCHES:
				return getMatches();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MGametournamentPackage.GAMER__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case MGametournamentPackage.GAMER__LAST_NAME:
				setLastName((String)newValue);
				return;
			case MGametournamentPackage.GAMER__PSEUDO:
				setPseudo((String)newValue);
				return;
			case MGametournamentPackage.GAMER__VICTORIES:
				setVictories((Integer)newValue);
				return;
			case MGametournamentPackage.GAMER__MATCHES:
				setMatches((Integer)newValue);
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
			case MGametournamentPackage.GAMER__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case MGametournamentPackage.GAMER__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case MGametournamentPackage.GAMER__PSEUDO:
				setPseudo(PSEUDO_EDEFAULT);
				return;
			case MGametournamentPackage.GAMER__VICTORIES:
				setVictories(VICTORIES_EDEFAULT);
				return;
			case MGametournamentPackage.GAMER__MATCHES:
				setMatches(MATCHES_EDEFAULT);
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
			case MGametournamentPackage.GAMER__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case MGametournamentPackage.GAMER__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case MGametournamentPackage.GAMER__PSEUDO:
				return PSEUDO_EDEFAULT == null ? pseudo != null : !PSEUDO_EDEFAULT.equals(pseudo);
			case MGametournamentPackage.GAMER__VICTORIES:
				return victories != VICTORIES_EDEFAULT;
			case MGametournamentPackage.GAMER__MATCHES:
				return matches != MATCHES_EDEFAULT;
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
		result.append(" (firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", pseudo: ");
		result.append(pseudo);
		result.append(", victories: ");
		result.append(victories);
		result.append(", matches: ");
		result.append(matches);
		result.append(')');
		return result.toString();
	}

} //MGamerImpl

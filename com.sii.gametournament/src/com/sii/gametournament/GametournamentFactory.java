package com.sii.gametournament;

import com.sii.gametournament.impl.GametournamentFactoryImpl;

/** This factory  overrides the generated factory and returns the new generated interfaces */
public interface GametournamentFactory extends MGametournamentFactory 
{
	
	/** Specialize the eINSTANCE initialization with the new interface type 
	  * (overridden in the override_factory extension)
	*/
	GametournamentFactory eINSTANCE = GametournamentFactoryImpl.init();
				
	public Tournament createTournament();
	public Gamer createGamer();
	public Game createGame();
	public QualificationPhase createQualificationPhase();
	public FinalPhase createFinalPhase();
	public Pool createPool();
}

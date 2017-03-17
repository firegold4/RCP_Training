package com.sii.gametournament.impl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.sii.gametournament.Tournament;
import com.sii.gametournament.Gamer;
import com.sii.gametournament.Game;
import com.sii.gametournament.QualificationPhase;
import com.sii.gametournament.FinalPhase;
import com.sii.gametournament.Pool;
import com.sii.gametournament.GametournamentFactory;


// This factory  overrides the generated factory and returns the new generated interfaces
public class GametournamentFactoryImpl extends MGametournamentFactoryImpl implements GametournamentFactory
{
	
	public static GametournamentFactory init() {
		
		try {
			Object fact = MGametournamentFactoryImpl.init();
			if ((fact != null) && (fact instanceof GametournamentFactory))
					return (GametournamentFactory) fact;
			}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GametournamentFactoryImpl(); 
		 }
	
	public Tournament createTournament()
	{
		Tournament result = new TournamentImpl();
		return result;
	}
	public Gamer createGamer()
	{
		Gamer result = new GamerImpl();
		return result;
	}
	public Game createGame()
	{
		Game result = new GameImpl();
		return result;
	}
	public QualificationPhase createQualificationPhase()
	{
		QualificationPhase result = new QualificationPhaseImpl();
		return result;
	}
	public FinalPhase createFinalPhase()
	{
		FinalPhase result = new FinalPhaseImpl();
		return result;
	}
	public Pool createPool()
	{
		Pool result = new PoolImpl();
		return result;
	}
}

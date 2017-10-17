package de.awk.facade;

import java.util.List;

import javax.ejb.Local;

import de.awk.model.Rennen;
import de.awk.model.Rennergebnis;
import de.awk.model.Rennteam;

@Local
public interface IRennergebnisFacade {
	
	public abstract Rennergebnis ergebnisAnlegen(Rennen einRennen, Rennteam platz_01, Rennteam platz_02, Rennteam platz_03, Rennteam platz_04, Rennteam platz_05);
	//public abstract Rennergebnis ergebnisNachRennen(Rennen einRennen);
	public abstract Rennergebnis ergebnisNachID(int ergebnis_ID);
	public abstract List<Rennergebnis> getAlleErgebnisse();
}

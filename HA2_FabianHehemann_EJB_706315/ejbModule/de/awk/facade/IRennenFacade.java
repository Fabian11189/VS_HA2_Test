package de.awk.facade;

import java.util.List;

import javax.ejb.Local;

import de.awk.model.Rennen;
import de.awk.model.Rennergebnis;
import de.awk.model.Startaufstellung;

@Local
public interface IRennenFacade {
	
	public abstract void rennenAnlegen(String ort);
	public abstract void rennenSAhinzufuegen(Rennen einRennen, Startaufstellung eineAufstellung);
	public abstract void rennenREhinzufuegen(Rennen einRennen, Rennergebnis einErgebnis);
	public abstract Rennen rennenNachID(int rennen_ID);	
	public abstract List<Rennen> getAlleRennen();
	public abstract int ergebnisIDnachRennen(Rennen einRennen);
	public abstract int aufstellungsIDnachRennen(Rennen einRennen);
}

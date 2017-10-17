package de.awk.facade;

import javax.ejb.Local;

import de.awk.model.Rennen;
import de.awk.model.Rennteam;
import de.awk.model.Startaufstellung;

@Local
public interface IStartaufstellungFacade {
	
	public abstract Startaufstellung neueAufstellungAnlegen(Rennen einRennen, Rennteam platz_01, Rennteam platz_02, Rennteam platz_03, Rennteam platz_04, Rennteam platz_05, Rennteam platz_06, Rennteam platz_07, Rennteam platz_08, Rennteam platz_09, Rennteam platz_10);
	//public abstract Startaufstellung aufstellungnachRennen(Rennen einRennen);
	public abstract Startaufstellung aufstellungnachID(int aufst_ID);
	//public abstract void aufstellungAendern(Rennen einRennen, Rennteam platz_01, Rennteam platz_02, Rennteam platz_03, Rennteam platz_04, Rennteam platz_05, Rennteam platz_06, Rennteam platz_07, Rennteam platz_08, Rennteam platz_09, Rennteam platz_10);
}

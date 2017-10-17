package de.awk.facade.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import de.awk.dao.RennergebnisDAO;
import de.awk.facade.IRennergebnisFacade;

import de.awk.model.Rennen;
import de.awk.model.Rennergebnis;
import de.awk.model.Rennteam;

@Stateless
public class RennergebnisFacadeImpl implements IRennergebnisFacade {
	
	@EJB
	private RennergebnisDAO rennergebnisDAO;

	@Override
	public Rennergebnis ergebnisAnlegen(Rennen einRennen, Rennteam platz_01, Rennteam platz_02,
			Rennteam platz_03, Rennteam platz_04, Rennteam platz_05) {
		Rennergebnis einErgebnis = new Rennergebnis(einRennen, platz_01, platz_02, platz_03, platz_04, platz_05);
		rennergebnisDAO.save(einErgebnis);
		return einErgebnis;
	}

	@Override
	public List<Rennergebnis> getAlleErgebnisse() {
		return rennergebnisDAO.findAll();
	}

	@Override
	public Rennergebnis ergebnisNachID(int ergebnis_ID) {
		if (ergebnis_ID != 0) {
			return rennergebnisDAO.find(ergebnis_ID);
		} else {
			return null;
		}
	}
	
}

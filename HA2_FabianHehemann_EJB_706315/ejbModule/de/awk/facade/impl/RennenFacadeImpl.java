package de.awk.facade.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import de.awk.dao.RennenDAO;
import de.awk.facade.IRennenFacade;
import de.awk.model.Rennen;
import de.awk.model.Rennergebnis;
import de.awk.model.Startaufstellung;

@Stateless
public class RennenFacadeImpl implements IRennenFacade {

	@EJB
	private RennenDAO rennenDAO;
	
	@Override
	public void rennenAnlegen(String ort) {
		Rennen einRennen = new Rennen(ort);
		rennenDAO.save(einRennen);		
	}
	
	@Override
	public void rennenSAhinzufuegen(Rennen einRennen, Startaufstellung eineAufstellung) {
		einRennen.setStAufSt(eineAufstellung);	
		rennenDAO.update(einRennen);
	}

	@Override
	public Rennen rennenNachID(int rennen_ID) {	
		return rennenDAO.find(rennen_ID);
	}

	@Override
	public List<Rennen> getAlleRennen() {
		return rennenDAO.findAll();
	}

	@Override
	public void rennenREhinzufuegen(Rennen einRennen, Rennergebnis einErgebnis) {
		einRennen.setErgebnis(einErgebnis);
		rennenDAO.update(einRennen);
	}

	@Override
	public int ergebnisIDnachRennen(Rennen einRennen) {
		if (einRennen.getErgebnis() != null) {
			return einRennen.getErgebnis().getErgeb_id();
		} else {
			return 0;
		}
	}

	@Override
	public int aufstellungsIDnachRennen(Rennen einRennen) {
		if (einRennen.getStAufSt() != null) {
			return einRennen.getStAufSt().getAufst_id();
		} else {
			return 0;
		}
	}
	
}

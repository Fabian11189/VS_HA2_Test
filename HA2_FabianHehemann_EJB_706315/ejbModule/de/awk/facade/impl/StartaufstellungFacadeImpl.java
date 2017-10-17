package de.awk.facade.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import de.awk.dao.StartaufstellungDAO;
import de.awk.facade.IStartaufstellungFacade;
import de.awk.model.Rennen;
import de.awk.model.Rennteam;
import de.awk.model.Startaufstellung;

@Stateless
public class StartaufstellungFacadeImpl implements IStartaufstellungFacade {
	
	@EJB
	private StartaufstellungDAO startaufstellungDAO;
	
	@Override
	public Startaufstellung neueAufstellungAnlegen(Rennen einRennen, Rennteam platz_01, Rennteam platz_02, Rennteam platz_03,
			Rennteam platz_04, Rennteam platz_05, Rennteam platz_06, Rennteam platz_07, Rennteam platz_08,
			Rennteam platz_09, Rennteam platz_10) {
		Startaufstellung eineAufstellung = new Startaufstellung(einRennen, platz_01, platz_02, platz_03,
			platz_04, platz_05, platz_06, platz_07, platz_08, platz_09, platz_10);
		startaufstellungDAO.save(eineAufstellung);
		return eineAufstellung;
	}	

	/*
	@Override
	public void aufstellungAendern(Rennen einRennen, Rennteam platz_01, Rennteam platz_02, Rennteam platz_03,
			Rennteam platz_04, Rennteam platz_05, Rennteam platz_06, Rennteam platz_07, Rennteam platz_08,
			Rennteam platz_09, Rennteam platz_10) {
		Startaufstellung eineAufstellung = aufstellungnachRennen(einRennen);
		eineAufstellung.setPlatz_01(platz_01);
		eineAufstellung.setPlatz_02(platz_02);
		eineAufstellung.setPlatz_03(platz_03);
		eineAufstellung.setPlatz_04(platz_04);
		eineAufstellung.setPlatz_05(platz_05);
		eineAufstellung.setPlatz_06(platz_06);
		eineAufstellung.setPlatz_07(platz_07);
		eineAufstellung.setPlatz_08(platz_08);
		eineAufstellung.setPlatz_09(platz_09);
		eineAufstellung.setPlatz_10(platz_10);
		startaufstellungDAO.update(eineAufstellung);		
	}
	*/
	
	@Override
	public Startaufstellung aufstellungnachID(int aufst_ID) {
		if (aufst_ID != 0) {
			return startaufstellungDAO.find(aufst_ID);
		} else {
			return null;
		}
	}
	
}

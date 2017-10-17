package de.mb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import de.awk.facade.IRennenFacade;
import de.awk.facade.IRennergebnisFacade;
import de.awk.facade.IRennteamFacade;
import de.awk.model.Rennen;
import de.awk.model.Rennergebnis;

@ManagedBean(name="rennergebnisMB")
@SessionScoped
public class RennergebnisMB {
	
	@EJB
	private IRennergebnisFacade rennergebnisFacade;
	
	@EJB
	private IRennenFacade rennenFacade;
	
	@EJB
	private IRennteamFacade rennteamFacade;
	
	
	private Rennen einRennen;
	private int renn_ID = 0;
	
	private int platz_01_teamID = 0;
	private int platz_02_teamID = 0;
	private int platz_03_teamID = 0;
	private int platz_04_teamID = 0;
	private int platz_05_teamID = 0;
		
	public List<Rennergebnis> ergebnisListNachRennen() {
		List<Rennergebnis> ergebnisse = new ArrayList<Rennergebnis>();
		if(renn_ID == 0) {
			ergebnisse = null;
			//ergebnisse = rennergebnisFacade.getAlleErgebnisse();
		} else {
			ergebnisse.add(rennergebnisFacade.ergebnisNachID(rennenFacade.ergebnisIDnachRennen(rennenFacade.rennenNachID(renn_ID))));
			//ergebnisse.add(rennergebnisFacade.ergebnisNachRennen(rennenFacade.rennenNachID(renn_ID)));
		}
		return ergebnisse;
	}
	
	public void neuesRennergebnisAnlegen(){
		FacesContext msgFC = FacesContext.getCurrentInstance();
			
		if(rennergebnisFacade.ergebnisNachID(rennenFacade.ergebnisIDnachRennen(rennenFacade.rennenNachID(renn_ID))) == null) {	
			if (platz_01_teamID != 0 & platz_02_teamID != 0 & platz_03_teamID != 0 & platz_04_teamID != 0 & platz_05_teamID != 0) {
				if (platz_01_teamID != platz_02_teamID & platz_01_teamID != platz_03_teamID & platz_01_teamID != platz_04_teamID  & platz_01_teamID != platz_05_teamID
					& platz_02_teamID != platz_03_teamID & platz_02_teamID != platz_04_teamID & platz_02_teamID != platz_05_teamID	
					& platz_03_teamID != platz_04_teamID & platz_03_teamID != platz_05_teamID
					& platz_04_teamID != platz_05_teamID
					) {
					//rennergebnisFacade.ergebnisAnlegen(rennenFacade.rennenNachID(renn_ID), rennteamFacade.teamnachID(platz_01_teamID), rennteamFacade.teamnachID(platz_02_teamID), rennteamFacade.teamnachID(platz_03_teamID), rennteamFacade.teamnachID(platz_04_teamID), rennteamFacade.teamnachID(platz_05_teamID));
					rennenFacade.rennenREhinzufuegen(rennenFacade.rennenNachID(renn_ID), rennergebnisFacade.ergebnisAnlegen(rennenFacade.rennenNachID(renn_ID), rennteamFacade.teamnachID(platz_01_teamID), rennteamFacade.teamnachID(platz_02_teamID), rennteamFacade.teamnachID(platz_03_teamID), rennteamFacade.teamnachID(platz_04_teamID), rennteamFacade.teamnachID(platz_05_teamID)));
					rennteamFacade.setzeWMPunkte(rennteamFacade.teamnachID(platz_01_teamID), rennteamFacade.teamnachID(platz_02_teamID), rennteamFacade.teamnachID(platz_03_teamID), rennteamFacade.teamnachID(platz_04_teamID), rennteamFacade.teamnachID(platz_05_teamID));
					msgFC.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Rennergebnis erfolgreich angelegt",null));
				} else {
					msgFC.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Teams doppelt ausgewählt. Kein Ergebnis angelegt!",null));
				}
			}	else {
				msgFC.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Bitte jeden Platz ein Team auswaehlen. Kein Ergebnis angelegt!",null));
			}
		} else {
			msgFC.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Für das gewaehlte Rennen ist bereits ein Ergebnis vorhanden. Kein Ergebnis angelegt!",null));
		}
	}

	public IRennergebnisFacade getRennergebnisFacade() {
		return rennergebnisFacade;
	}

	public void setRennergebnisFacade(IRennergebnisFacade rennergebnisFacade) {
		this.rennergebnisFacade = rennergebnisFacade;
	}

	public Rennen getEinRennen() {
		return einRennen;
	}

	public void setEinRennen(Rennen einRennen) {
		this.einRennen = einRennen;
	}

	public int getPlatz_01_teamID() {
		return platz_01_teamID;
	}

	public void setPlatz_01_teamID(int platz_01_teamID) {
		this.platz_01_teamID = platz_01_teamID;
	}

	public int getPlatz_02_teamID() {
		return platz_02_teamID;
	}

	public void setPlatz_02_teamID(int platz_02_teamID) {
		this.platz_02_teamID = platz_02_teamID;
	}

	public int getPlatz_03_teamID() {
		return platz_03_teamID;
	}

	public void setPlatz_03_teamID(int platz_03_teamID) {
		this.platz_03_teamID = platz_03_teamID;
	}

	public int getPlatz_04_teamID() {
		return platz_04_teamID;
	}

	public void setPlatz_04_teamID(int platz_04_teamID) {
		this.platz_04_teamID = platz_04_teamID;
	}

	public int getPlatz_05_teamID() {
		return platz_05_teamID;
	}

	public void setPlatz_05_teamID(int platz_05_teamID) {
		this.platz_05_teamID = platz_05_teamID;
	}

	public int getRenn_ID() {
		return renn_ID;
	}

	public void setRenn_ID(int renn_ID) {
		this.renn_ID = renn_ID;
	}
	
}

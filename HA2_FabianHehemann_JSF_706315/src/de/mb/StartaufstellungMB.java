package de.mb;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import de.awk.facade.IRennenFacade;
import de.awk.facade.IRennteamFacade;
import de.awk.facade.IStartaufstellungFacade;
import de.awk.model.Rennen;

@ManagedBean(name="startaufstellungMB")
@SessionScoped
public class StartaufstellungMB {
	
	@EJB
	private IStartaufstellungFacade startaufstellungFacade;
	
	@EJB
	private IRennenFacade rennenFacade;
	
	@EJB
	private IRennteamFacade rennteamFacade;
	
	private Rennen rennen;
	private int renn_id;
	
	private int platz_01_renn_id = 0;
	private int platz_02_renn_id = 0;
	private int platz_03_renn_id = 0;
	private int platz_04_renn_id = 0;
	private int platz_05_renn_id = 0;
	private int platz_06_renn_id = 0;
	private int platz_07_renn_id = 0;
	private int platz_08_renn_id = 0;
	private int platz_09_renn_id = 0;
	private int platz_10_renn_id = 0;	
	
	public void neueAufstellungAnlegen(){
		FacesContext msgFC = FacesContext.getCurrentInstance();
		/*
		System.out.println("Renn_ID " + renn_id );
		System.out.println("Rennen nach ID " + rennenFacade.rennenNachID(renn_id));
		System.out.println("AufstellungsID " + rennenFacade.aufstellungsIDnachRennen(rennenFacade.rennenNachID(renn_id)) );
		System.out.println("Austellung " + startaufstellungFacade.aufstellungnachID(rennenFacade.aufstellungsIDnachRennen(rennenFacade.rennenNachID(renn_id))));
		*/
		
		if(startaufstellungFacade.aufstellungnachID(rennenFacade.aufstellungsIDnachRennen(rennenFacade.rennenNachID(renn_id))) == null) {
			if (platz_01_renn_id != 0 & platz_02_renn_id != 0 & platz_03_renn_id != 0 & platz_04_renn_id != 0 & platz_05_renn_id != 0 & platz_06_renn_id != 0 & platz_07_renn_id != 0 & platz_08_renn_id != 0 & platz_09_renn_id != 0 & platz_10_renn_id != 0) {
				if(platz_01_renn_id != platz_02_renn_id & platz_01_renn_id != platz_03_renn_id & platz_01_renn_id != platz_04_renn_id & platz_01_renn_id != platz_05_renn_id & platz_01_renn_id != platz_06_renn_id & platz_01_renn_id != platz_07_renn_id & platz_01_renn_id != platz_08_renn_id & platz_01_renn_id != platz_09_renn_id & platz_01_renn_id != platz_10_renn_id 
				 & platz_02_renn_id != platz_03_renn_id & platz_02_renn_id != platz_04_renn_id & platz_02_renn_id != platz_05_renn_id & platz_02_renn_id != platz_06_renn_id & platz_02_renn_id != platz_07_renn_id & platz_02_renn_id != platz_08_renn_id & platz_02_renn_id != platz_09_renn_id & platz_02_renn_id != platz_10_renn_id	
				 & platz_03_renn_id != platz_04_renn_id & platz_03_renn_id != platz_05_renn_id & platz_03_renn_id != platz_06_renn_id & platz_03_renn_id != platz_07_renn_id & platz_03_renn_id != platz_08_renn_id & platz_03_renn_id != platz_09_renn_id & platz_03_renn_id != platz_10_renn_id		
				 & platz_04_renn_id != platz_05_renn_id & platz_04_renn_id != platz_06_renn_id & platz_04_renn_id != platz_07_renn_id & platz_04_renn_id != platz_08_renn_id & platz_04_renn_id != platz_09_renn_id & platz_04_renn_id != platz_10_renn_id		
				 & platz_05_renn_id != platz_06_renn_id & platz_05_renn_id != platz_07_renn_id & platz_05_renn_id != platz_08_renn_id & platz_05_renn_id != platz_09_renn_id & platz_05_renn_id != platz_10_renn_id		
				 & platz_06_renn_id != platz_07_renn_id & platz_06_renn_id != platz_08_renn_id & platz_06_renn_id != platz_09_renn_id & platz_06_renn_id != platz_10_renn_id
				 & platz_07_renn_id != platz_08_renn_id & platz_07_renn_id != platz_09_renn_id & platz_07_renn_id != platz_10_renn_id
				 & platz_08_renn_id != platz_09_renn_id & platz_08_renn_id != platz_10_renn_id
				 & platz_09_renn_id != platz_10_renn_id){
					//startaufstellungFacade.neueAufstellungAnlegen(rennenFacade.rennenNachID(renn_id), rennteamFacade.teamnachID(platz_01_renn_id), rennteamFacade.teamnachID(platz_02_renn_id), rennteamFacade.teamnachID(platz_03_renn_id), rennteamFacade.teamnachID(platz_04_renn_id), rennteamFacade.teamnachID(platz_05_renn_id), rennteamFacade.teamnachID(platz_06_renn_id), rennteamFacade.teamnachID(platz_07_renn_id), rennteamFacade.teamnachID(platz_08_renn_id), rennteamFacade.teamnachID(platz_09_renn_id), rennteamFacade.teamnachID(platz_10_renn_id));
					rennenFacade.rennenSAhinzufuegen(rennenFacade.rennenNachID(renn_id), startaufstellungFacade.neueAufstellungAnlegen(rennenFacade.rennenNachID(renn_id), rennteamFacade.teamnachID(platz_01_renn_id), rennteamFacade.teamnachID(platz_02_renn_id), rennteamFacade.teamnachID(platz_03_renn_id), rennteamFacade.teamnachID(platz_04_renn_id), rennteamFacade.teamnachID(platz_05_renn_id), rennteamFacade.teamnachID(platz_06_renn_id), rennteamFacade.teamnachID(platz_07_renn_id), rennteamFacade.teamnachID(platz_08_renn_id), rennteamFacade.teamnachID(platz_09_renn_id), rennteamFacade.teamnachID(platz_10_renn_id)));
					msgFC.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Startaufstellung erfolgreich angelegt",null));
				} else {
					msgFC.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Teams doppelt ausgewählt. Keine Startaufstellung angelegt!",null));
				}
			} else {
				msgFC.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Bitte fuer jeden Startplatz ein Team auswaehlen. Keine Startaufstellung angelegt!",null));
			} 
		} else {
			msgFC.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Für das gewaehlte Rennen ist bereits eine Aufstellung vorhanden. Keine Startaufstellung angelegt!",null));
		}
	}
	
	public IStartaufstellungFacade getStartaufstellungFacade() {
		return startaufstellungFacade;
	}
	public void setStartaufstellungFacade(IStartaufstellungFacade startaufstellungFacade) {
		this.startaufstellungFacade = startaufstellungFacade;
	}

	public Rennen getRennen() {
		return rennen;
	}
	public void setRennen(Rennen rennen) {
		this.rennen = rennen;
	}

	public int getRenn_id() {
		return renn_id;
	}

	public void setRenn_id(int renn_id) {
		this.renn_id = renn_id;
	}

	public int getPlatz_01_renn_id() {
		return platz_01_renn_id;
	}

	public void setPlatz_01_renn_id(int platz_01_renn_id) {
		this.platz_01_renn_id = platz_01_renn_id;
	}

	public int getPlatz_02_renn_id() {
		return platz_02_renn_id;
	}

	public void setPlatz_02_renn_id(int platz_02_renn_id) {
		this.platz_02_renn_id = platz_02_renn_id;
	}

	public int getPlatz_03_renn_id() {
		return platz_03_renn_id;
	}

	public void setPlatz_03_renn_id(int platz_03_renn_id) {
		this.platz_03_renn_id = platz_03_renn_id;
	}

	public int getPlatz_04_renn_id() {
		return platz_04_renn_id;
	}

	public void setPlatz_04_renn_id(int platz_04_renn_id) {
		this.platz_04_renn_id = platz_04_renn_id;
	}

	public int getPlatz_05_renn_id() {
		return platz_05_renn_id;
	}

	public void setPlatz_05_renn_id(int platz_05_renn_id) {
		this.platz_05_renn_id = platz_05_renn_id;
	}

	public int getPlatz_06_renn_id() {
		return platz_06_renn_id;
	}

	public void setPlatz_06_renn_id(int platz_06_renn_id) {
		this.platz_06_renn_id = platz_06_renn_id;
	}

	public int getPlatz_07_renn_id() {
		return platz_07_renn_id;
	}

	public void setPlatz_07_renn_id(int platz_07_renn_id) {
		this.platz_07_renn_id = platz_07_renn_id;
	}

	public int getPlatz_08_renn_id() {
		return platz_08_renn_id;
	}

	public void setPlatz_08_renn_id(int platz_08_renn_id) {
		this.platz_08_renn_id = platz_08_renn_id;
	}

	public int getPlatz_09_renn_id() {
		return platz_09_renn_id;
	}

	public void setPlatz_09_renn_id(int platz_09_renn_id) {
		this.platz_09_renn_id = platz_09_renn_id;
	}

	public int getPlatz_10_renn_id() {
		return platz_10_renn_id;
	}

	public void setPlatz_10_renn_id(int platz_10_renn_id) {
		this.platz_10_renn_id = platz_10_renn_id;
	}
	
	
}

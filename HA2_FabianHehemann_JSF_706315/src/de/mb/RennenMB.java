package de.mb;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import de.awk.facade.IRennenFacade;
import de.awk.model.Rennen;
import de.awk.model.Rennergebnis;
import de.awk.model.Startaufstellung;

@ManagedBean(name="rennenMB")
@SessionScoped
public class RennenMB {
	
	@EJB
	private IRennenFacade rennenFacade;
	
	private Rennen einRennen;
	
	@NotNull
	@Digits(fraction = 0, integer = 6)
	private int rennen_id;
	
	@NotNull
	@Size(min = 0, max = 25)
	@Pattern(regexp = "[A-Za-z ]*", message= "Ort nur Buchstaben mit Leerzeichen!")
	private String ort;
	
	private Startaufstellung aufstellung;
	private Rennergebnis ergebnis;
	
	public List<Rennen> getAlleRennen(){
		return rennenFacade.getAlleRennen();
	}
	
	public void neuesRennenAnlegen(){
		rennenFacade.rennenAnlegen(ort);
		FacesContext msgFC = FacesContext.getCurrentInstance();
		msgFC.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Rennen erfolgreich angelegt",null));
	}

	public IRennenFacade getRennenFacade() {
		return rennenFacade;
	}

	public void setRennenFacade(IRennenFacade rennenFacade) {
		this.rennenFacade = rennenFacade;
	}

	public int getRennen_id() {
		return rennen_id;
	}

	public void setRennen_id(int rennen_id) {
		this.rennen_id = rennen_id;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public Startaufstellung getAufstellung() {
		return aufstellung;
	}

	public void setAufstellung(Startaufstellung aufstellung) {
		this.aufstellung = aufstellung;
	}

	public Rennergebnis getErgebnis() {
		return ergebnis;
	}

	public void setErgebnis(Rennergebnis ergebnis) {
		this.ergebnis = ergebnis;
	}

	public Rennen getEinRennen() {
		return einRennen;
	}

	public void setEinRennen(Rennen einRennen) {
		this.einRennen = einRennen;
	}
		
	
}

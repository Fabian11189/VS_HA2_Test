package de.awk.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Access(AccessType.FIELD)
@Table(name="HA2_Rennen")
public class Rennen implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RENNEN_ID")
	@SequenceGenerator(name="RENNEN_ID", sequenceName="SEQ_RENNEN_ID", allocationSize = 1)
	private int rennen_id;
	private String ort;
	
	@OneToOne
	private Startaufstellung stAufSt;
	
	@OneToOne
	private Rennergebnis ergebnis;
	
	public Rennen(){
		
	}
	
	public Rennen(int rennen_id, String ort) {
		this.rennen_id = rennen_id;
		this.ort = ort;
	}
	
	public Rennen(String ort) {
		this.ort = ort;
	}

	public Rennen(int rennen_id, String ort, Startaufstellung stAufSt) {
		this.rennen_id = rennen_id;
		this.ort = ort;
		this.stAufSt = stAufSt;
	}

	public Rennen(int rennen_id, String ort, Startaufstellung stAufSt, Rennergebnis ergebnis) {
		this.rennen_id = rennen_id;
		this.ort = ort;
		this.stAufSt = stAufSt;
		this.ergebnis = ergebnis;
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

	public Startaufstellung getStAufSt() {
		return stAufSt;
	}

	public void setStAufSt(Startaufstellung stAufSt) {
		this.stAufSt = stAufSt;
	}

	public Rennergebnis getErgebnis() {
		return ergebnis;
	}

	public void setErgebnis(Rennergebnis ergebnis) {
		this.ergebnis = ergebnis;
	}
	
}

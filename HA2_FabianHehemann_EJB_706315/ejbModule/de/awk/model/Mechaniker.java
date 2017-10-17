package de.awk.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Access(AccessType.FIELD)
@Table(name="HA2_Mechaniker")
public class Mechaniker extends Teammitglied implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MECHANIKER_ID")
	@SequenceGenerator(name="MECHANIKER_ID", sequenceName="SEQ_MECHANIKER_ID", allocationSize = 1)	
	private int mechaniker_id;	
	private String name;
	private String vorname;
	
	@ManyToOne
	private Rennteam team;
	
	public Mechaniker(int mechaniker_id, String name, String vorname, Rennteam team) {
		super();
		this.mechaniker_id = mechaniker_id;
		this.name = name;
		this.vorname = vorname;
		this.team = team;
	}


	public Mechaniker(){
		
	}


	public int getMechaniker_id() {
		return mechaniker_id;
	}


	public void setMechaniker_id(int mechaniker_id) {
		this.mechaniker_id = mechaniker_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getVorname() {
		return vorname;
	}


	public void setVorname(String vorname) {
		this.vorname = vorname;
	}


	public Rennteam getTeam() {
		return team;
	}


	public void setTeam(Rennteam team) {
		this.team = team;
	}
	
}

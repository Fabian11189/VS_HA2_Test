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
@Table(name="HA2_Pilot")
public class Pilot extends Teammitglied implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PILOT_ID")
	@SequenceGenerator(name="PILOT_ID", sequenceName="SEQ_PILOT_ID", allocationSize = 1)	
	private int pilot_id;
	private String name;
	private String vorname;
	
	@OneToOne
	private Rennteam team;

	public Pilot(){
		
	}

	public Pilot(int pilot_id, String name, String vorname, Rennteam team) {
		super();
		this.pilot_id = pilot_id;
		this.name = name;
		this.vorname = vorname;
		this.team = team;
	}

	public int getPilot_id() {
		return pilot_id;
	}

	public void setPilot_id(int pilot_id) {
		this.pilot_id = pilot_id;
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

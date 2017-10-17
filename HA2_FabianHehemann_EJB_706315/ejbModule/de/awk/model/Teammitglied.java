package de.awk.model;

import java.io.Serializable;

public abstract class Teammitglied implements Serializable {
	/*
	private String name;
	private String vorname;
	
	@ManyToOne
	private Rennteam team;
	*/
	public Teammitglied(){
		
	}
	/*
	public Teammitglied(String name, String vorname, Rennteam team) {
		this.name = name;
		this.vorname = vorname;
		this.team = team;
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
	*/
}

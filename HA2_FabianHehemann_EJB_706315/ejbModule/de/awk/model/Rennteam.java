package de.awk.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Access(AccessType.FIELD)
@Table(name="HA2_Rennteam")
public class Rennteam implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TEAM_ID")
	@SequenceGenerator(name="TEAM_ID", sequenceName="SEQ_TEAM_ID", allocationSize = 1)
	private int team_ID;
	private String name;
	private int wmPunkte;
	
	@OneToOne
	private Pilot pilot;
	
	@ManyToOne
	private Mechaniker m_1;
	
	@ManyToOne
	private Mechaniker m_2;
	
	@ManyToOne
	private Mechaniker m_3;
	
	@ManyToOne
	private Mechaniker m_4;
	
	@ManyToOne
	private Mechaniker m_5;
	
	public Rennteam(){
		this.wmPunkte = 0;
	}
	
	public Rennteam(int team_ID, String name){
		this.team_ID = team_ID;
		this.name = name;
		this.wmPunkte = 0;
	}

	public Rennteam(int team_ID, String name, int wmPunkte, Pilot pilot) {
		this.team_ID = team_ID;
		this.name = name;
		this.wmPunkte = wmPunkte;
		this.pilot = pilot;
	}

	public Rennteam(int team_ID, String name, int wmPunkte, Pilot pilot, Mechaniker m_1, Mechaniker m_2, Mechaniker m_3,
			Mechaniker m_4, Mechaniker m_5) {
		super();
		this.team_ID = team_ID;
		this.name = name;
		this.wmPunkte = wmPunkte;
		this.pilot = pilot;
		this.m_1 = m_1;
		this.m_2 = m_2;
		this.m_3 = m_3;
		this.m_4 = m_4;
		this.m_5 = m_5;
	}

	public int getTeam_ID() {
		return team_ID;
	}

	public void setTeam_ID(int team_ID) {
		this.team_ID = team_ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pilot getPilot() {
		return pilot;
	}

	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

	public int getWmPunkte() {
		return wmPunkte;
	}

	public void setWmPunkte(int wmPunkte) {
		this.wmPunkte = wmPunkte;
	}

	public Mechaniker getM_1() {
		return m_1;
	}

	public void setM_1(Mechaniker m_1) {
		this.m_1 = m_1;
	}

	public Mechaniker getM_2() {
		return m_2;
	}

	public void setM_2(Mechaniker m_2) {
		this.m_2 = m_2;
	}

	public Mechaniker getM_3() {
		return m_3;
	}

	public void setM_3(Mechaniker m_3) {
		this.m_3 = m_3;
	}

	public Mechaniker getM_4() {
		return m_4;
	}

	public void setM_4(Mechaniker m_4) {
		this.m_4 = m_4;
	}

	public Mechaniker getM_5() {
		return m_5;
	}

	public void setM_5(Mechaniker m_5) {
		this.m_5 = m_5;
	}

}

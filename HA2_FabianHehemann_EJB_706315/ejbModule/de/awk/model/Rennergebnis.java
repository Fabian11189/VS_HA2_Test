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
@Table(name="HA2_Rennergebnis")
public class Rennergebnis implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ERGEB_ID")
	@SequenceGenerator(name="ERGEB_ID", sequenceName="SEQ_ERGEB_ID", allocationSize = 1)
	private int ergeb_id;
	
	@OneToOne
	private Rennen rennen;
	
	@ManyToOne
	private Rennteam platz_01;
	
	@ManyToOne
	private Rennteam platz_02;
	
	@ManyToOne
	private Rennteam platz_03;
	
	@ManyToOne
	private Rennteam platz_04;
	
	@ManyToOne
	private Rennteam platz_05;
	
	public Rennergebnis() {
		
	}
	
	public Rennergebnis(Rennen rennen, Rennteam platz_01, Rennteam platz_02, Rennteam platz_03, Rennteam platz_04,
			Rennteam platz_05) {
		this.rennen = rennen;
		this.platz_01 = platz_01;
		this.platz_02 = platz_02;
		this.platz_03 = platz_03;
		this.platz_04 = platz_04;
		this.platz_05 = platz_05;
	}

	public int getErgeb_id() {
		return ergeb_id;
	}

	public void setErgeb_id(int ergeb_id) {
		this.ergeb_id = ergeb_id;
	}

	public Rennen getRennen() {
		return rennen;
	}

	public void setRennen(Rennen rennen) {
		this.rennen = rennen;
	}

	public Rennteam getPlatz_01() {
		return platz_01;
	}

	public void setPlatz_01(Rennteam platz_01) {
		this.platz_01 = platz_01;
	}

	public Rennteam getPlatz_02() {
		return platz_02;
	}

	public void setPlatz_02(Rennteam platz_02) {
		this.platz_02 = platz_02;
	}

	public Rennteam getPlatz_03() {
		return platz_03;
	}

	public void setPlatz_03(Rennteam platz_03) {
		this.platz_03 = platz_03;
	}

	public Rennteam getPlatz_04() {
		return platz_04;
	}

	public void setPlatz_04(Rennteam platz_04) {
		this.platz_04 = platz_04;
	}

	public Rennteam getPlatz_05() {
		return platz_05;
	}

	public void setPlatz_05(Rennteam platz_05) {
		this.platz_05 = platz_05;
	}
	
}

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
@Table(name="HA2_Startaufstellung")
public class Startaufstellung implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AUFST_ID")
	@SequenceGenerator(name="AUFST_ID", sequenceName="SEQ_AUFST_ID", allocationSize = 1)
	private int aufst_id;
	
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
	@ManyToOne
	private Rennteam platz_06;
	@ManyToOne
	private Rennteam platz_07;
	@ManyToOne
	private Rennteam platz_08;
	@ManyToOne
	private Rennteam platz_09;
	@ManyToOne
	private Rennteam platz_10;
	
	public Startaufstellung(){
		
	}
	
	public Startaufstellung(Rennen rennen, Rennteam platz_01, Rennteam platz_02, Rennteam platz_03,
			Rennteam platz_04, Rennteam platz_05, Rennteam platz_06, Rennteam platz_07, Rennteam platz_08,
			Rennteam platz_09, Rennteam platz_10) {
		this.rennen = rennen;
		this.platz_01 = platz_01;
		this.platz_02 = platz_02;
		this.platz_03 = platz_03;
		this.platz_04 = platz_04;
		this.platz_05 = platz_05;
		this.platz_06 = platz_06;
		this.platz_07 = platz_07;
		this.platz_08 = platz_08;
		this.platz_09 = platz_09;
		this.platz_10 = platz_10;
	}

	public int getAufst_id() {
		return aufst_id;
	}

	public void setAufst_id(int aufst_id) {
		this.aufst_id = aufst_id;
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

	public Rennteam getPlatz_06() {
		return platz_06;
	}

	public void setPlatz_06(Rennteam platz_06) {
		this.platz_06 = platz_06;
	}

	public Rennteam getPlatz_07() {
		return platz_07;
	}

	public void setPlatz_07(Rennteam platz_07) {
		this.platz_07 = platz_07;
	}

	public Rennteam getPlatz_08() {
		return platz_08;
	}

	public void setPlatz_08(Rennteam platz_08) {
		this.platz_08 = platz_08;
	}

	public Rennteam getPlatz_09() {
		return platz_09;
	}

	public void setPlatz_09(Rennteam platz_09) {
		this.platz_09 = platz_09;
	}

	public Rennteam getPlatz_10() {
		return platz_10;
	}

	public void setPlatz_10(Rennteam platz_10) {
		this.platz_10 = platz_10;
	}
	
}

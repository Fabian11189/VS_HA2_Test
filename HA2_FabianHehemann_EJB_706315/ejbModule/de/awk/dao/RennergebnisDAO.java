package de.awk.dao;

import javax.ejb.Stateless;

import de.awk.model.Rennergebnis;

@Stateless
public class RennergebnisDAO extends GenericDAO<Rennergebnis> {
	
	public RennergebnisDAO(){
		super(Rennergebnis.class);
	}
	
	public void delete(Rennergebnis einErgebnis){
		super.delete(einErgebnis.getErgeb_id(), Rennergebnis.class);
	}
}

package de.awk.dao;

import javax.ejb.Stateless;

import de.awk.model.Startaufstellung;

@Stateless
public class StartaufstellungDAO extends GenericDAO<Startaufstellung> {
	
	public StartaufstellungDAO(){
		super(Startaufstellung.class);
	}
	
	public void delete(Startaufstellung eineAufst){
		super.delete(eineAufst.getAufst_id(), Startaufstellung.class);
	}
}

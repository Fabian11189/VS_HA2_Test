package de.awk.dao;

import javax.ejb.Stateless;

import de.awk.model.Rennen;

@Stateless
public class RennenDAO extends GenericDAO<Rennen> {
	
	public RennenDAO(){
		super(Rennen.class);
	}
	
	public void delete(Rennen einRennen){
		super.delete(einRennen.getRennen_id(), Rennen.class);
	}

}

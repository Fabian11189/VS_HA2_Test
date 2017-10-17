package de.awk.dao;

import javax.ejb.Stateless;

import de.awk.model.Mechaniker;

@Stateless
public class MechanikerDAO extends GenericDAO<Mechaniker> {
	
	public MechanikerDAO(){
		super(Mechaniker.class);
	}
	
	public void delete(Mechaniker einMechaniker){
		super.delete(einMechaniker.getMechaniker_id(), Mechaniker.class);
	}
	
}	

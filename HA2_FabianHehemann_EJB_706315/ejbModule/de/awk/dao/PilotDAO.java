package de.awk.dao;

import javax.ejb.Stateless;

import de.awk.model.Pilot;

@Stateless
public class PilotDAO extends GenericDAO<Pilot>  {
	
	public PilotDAO(){
		super(Pilot.class);
	}
	
	public void delete(Pilot einPilot){
		super.delete(einPilot.getPilot_id(), Pilot.class);
	}
	
}

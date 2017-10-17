package de.awk.dao;

import javax.ejb.Stateless;

import de.awk.model.Rennteam;

@Stateless
public class RennteamDAO extends GenericDAO<Rennteam> {
	
	public RennteamDAO(){
		super(Rennteam.class);
	}
	
	public void delete(Rennteam einTeam){
		super.delete(einTeam.getTeam_ID(), Rennteam.class);
	}
	
}

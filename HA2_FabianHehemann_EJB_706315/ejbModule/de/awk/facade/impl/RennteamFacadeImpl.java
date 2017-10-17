package de.awk.facade.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import de.awk.dao.RennteamDAO;
import de.awk.facade.IRennteamFacade;
import de.awk.model.Rennteam;

@Stateless
public class RennteamFacadeImpl implements IRennteamFacade {
	
	@EJB
	private RennteamDAO rennteamDAO;

	@Override
	public Rennteam teamnachID(int team_id) {
		return rennteamDAO.find(team_id);
	}

	@Override
	public List<Rennteam> getAlleTeams() {
		return rennteamDAO.findAll();
	}

	@Override
	public void setzeWMPunkte(Rennteam team_1, Rennteam team_2, Rennteam team_3, Rennteam team_4, Rennteam team_5) {
		team_1.setWmPunkte(team_1.getWmPunkte()+10);
		rennteamDAO.update(team_1);
		team_2.setWmPunkte(team_2.getWmPunkte()+8);
		rennteamDAO.update(team_2);
		team_3.setWmPunkte(team_3.getWmPunkte()+6);
		rennteamDAO.update(team_3);
		team_4.setWmPunkte(team_4.getWmPunkte()+4);
		rennteamDAO.update(team_4);
		team_5.setWmPunkte(team_5.getWmPunkte()+2);
		rennteamDAO.update(team_5);
	}

	@Override
	public List<Rennteam> getAlleTeamsSort() {
		List<Rennteam> teamsSortiert = rennteamDAO.findAll();
	
		return teamsSortiert;
	}
	
}

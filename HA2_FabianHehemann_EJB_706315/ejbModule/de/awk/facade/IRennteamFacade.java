package de.awk.facade;

import java.util.List;

import javax.ejb.Local;

import de.awk.model.Rennteam;

@Local
public interface IRennteamFacade {
	
	public abstract Rennteam teamnachID(int team_id);
	public abstract List<Rennteam> getAlleTeams();
	public abstract List<Rennteam> getAlleTeamsSort();
	public abstract void setzeWMPunkte(Rennteam team_1, Rennteam team_2, Rennteam team_3, Rennteam team_4, Rennteam team_5);
}

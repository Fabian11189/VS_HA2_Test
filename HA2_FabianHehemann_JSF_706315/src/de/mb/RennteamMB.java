package de.mb;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

import de.awk.facade.IRennteamFacade;
import de.awk.model.Pilot;
import de.awk.model.Rennteam;

@ManagedBean(name="rennteamMB")
@SessionScoped
public class RennteamMB {

	@EJB
	private IRennteamFacade rennteamFacade;
	
	@NotNull
	@Digits(fraction = 0, integer = 6)
	private int team_ID;
	
	private String name;
	private int wmpunkte;
	
	private Pilot pilot;
	
	
	public List<Rennteam> getAlleTeams() {
		return rennteamFacade.getAlleTeams();
	}

	public IRennteamFacade getRennteamFacade() {
		return rennteamFacade;
	}

	public void setRennteamFacade(IRennteamFacade rennteamFacade) {
		this.rennteamFacade = rennteamFacade;
	}

	public int getTeam_ID() {
		return team_ID;
	}

	public void setTeam_id(int team_id) {
		this.team_ID = team_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWmpunkte() {
		return wmpunkte;
	}

	public void setWmpunkte(int wmpunkte) {
		this.wmpunkte = wmpunkte;
	}

	public Pilot getPilot() {
		return pilot;
	}

	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}
}

package de.mb;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import de.awk.facade.IUserFacade;
import de.awk.model.User;

@SessionScoped
@ManagedBean(name="userMB")
public class UserMB {

	private User user;

	@EJB
	private IUserFacade userFacade;
	

	public User getUser(){
		if(user == null){
			ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
			String username = context.getUserPrincipal().getName();
			
			user = userFacade.findUserByName(username);
		}
		return user;
	}
	
	public boolean isUserAdmin(){
		return getRequest().isUserInRole("ADMIN-ROLE");
	}
	
	public String logOut(){
		System.out.println("logout");
		getRequest().getSession().invalidate();
		
		return "logout";
	}
	
	private HttpServletRequest getRequest() {
		return (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
	}
	
}

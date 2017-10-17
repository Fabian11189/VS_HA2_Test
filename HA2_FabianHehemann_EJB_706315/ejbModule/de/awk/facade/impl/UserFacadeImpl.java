package de.awk.facade.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import de.awk.dao.UserDAO;
import de.awk.facade.IUserFacade;
import de.awk.model.User;

@Stateless
public class UserFacadeImpl implements IUserFacade {

	@EJB 
	private UserDAO userDAO;
	
	public User findUserByName(String name) {
		return userDAO.findUserByUsername(name);
	}
}
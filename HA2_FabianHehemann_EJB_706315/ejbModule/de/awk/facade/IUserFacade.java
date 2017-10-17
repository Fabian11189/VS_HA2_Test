package de.awk.facade;

import javax.ejb.Local;

import de.awk.model.User;

@Local
public interface IUserFacade {
	public User findUserByName(String name);
}
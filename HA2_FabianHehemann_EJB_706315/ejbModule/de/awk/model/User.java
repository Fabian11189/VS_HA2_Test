package de.awk.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="HA2_user")
@NamedQuery(name="User.findUserByUsername", query="SELECT u from User u where u.username = :username")
public class User {

	public static final String FIND_BY_USERNAME = "User.findUserByUsername";
	
	@Id
	private String username;
	private String password;


	public User(){}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String name) {
		this.username = name;
	}

	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof User){
			User user = (User) obj;
			return user.getUsername().equals(getUsername());
		}
		
		return false;
	}
}

	


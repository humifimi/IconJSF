package controller;



import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.User;

@Named
@RequestScoped
public class UserBean {
	

	@Inject
	User user;

	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	public String login(){
		return "welcome";
	} 

	
}

package starters;

import implementations.mysql.UserDAOImplem;
import interfaces.UserDAO;
import models.User;

public class Demo {
	
	
	public static void main(String[] args) {
		UserDAO ud = new UserDAOImplem();
		User testUser = ud.findUserByEmailAndPassword("test@testus.com", "sidetest");
		System.out.println(testUser);
	}
	
}

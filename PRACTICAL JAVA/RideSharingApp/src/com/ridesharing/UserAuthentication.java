package com.ridesharing;

public class UserAuthentication {
	 private static UserAuthentication instance;

	    private UserAuthentication() {
	        // Private constructor to prevent instantiation
	    }

	    public static synchronized UserAuthentication getInstance() {
	        if (instance == null) {
	            instance = new UserAuthentication();
	        }
	        return instance;
	    }

	    public boolean authenticate(String username, String password) {
	        // Simplified authentication logic
	        return "user".equals(username) && "pass".equals(password);
	    }

}

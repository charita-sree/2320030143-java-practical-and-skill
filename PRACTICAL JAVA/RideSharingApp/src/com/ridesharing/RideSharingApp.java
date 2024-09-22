package com.ridesharing;

public class RideSharingApp {

	public static void main(String[] args) {
		UserAuthentication auth = UserAuthentication.getInstance();
        if (auth.authenticate("user", "pass")) {
            System.out.println("User authenticated successfully.");

            VehicleFactory vehicleFactory = new CarFactory(); 
            Vehicle vehicle = vehicleFactory.createVehicle();
            vehicle.drive();

        } else {
            System.out.println("Authentication failed.");
        }
    }
	}


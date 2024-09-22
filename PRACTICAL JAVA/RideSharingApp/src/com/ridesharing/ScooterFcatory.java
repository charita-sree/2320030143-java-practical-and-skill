package com.ridesharing;

public class ScooterFcatory implements VehicleFactory{
	public Vehicle createVehicle() {
        return new Scooter();
    }

}

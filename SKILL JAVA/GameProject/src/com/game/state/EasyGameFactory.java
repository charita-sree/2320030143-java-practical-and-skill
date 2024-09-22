package com.game.state;

public class EasyGameFactory implements AbstractFactory{
	 public Weapon createWeapon() {
	        return new EasyWeapon();
	    }
	    public PowerUp createPowerUp() {
	        return new EasyPowerUp();
	    }

}

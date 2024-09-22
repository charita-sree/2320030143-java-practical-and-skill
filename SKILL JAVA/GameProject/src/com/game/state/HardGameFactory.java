package com.game.state;

public class HardGameFactory implements AbstractFactory{
	 @Override
	    public Weapon createWeapon() {
	        return new HardWeapon();
	    }

	    @Override
	    public PowerUp createPowerUp() {
	        return new HardPowerUp();
	    }

}

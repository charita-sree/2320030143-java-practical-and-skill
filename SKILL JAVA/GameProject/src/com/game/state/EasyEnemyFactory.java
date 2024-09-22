package com.game.state;

public class EasyEnemyFactory implements EnemyFactory {
	 public Enemy createEnemy() {
	        return new EasyEnemy();
	    }
	

}

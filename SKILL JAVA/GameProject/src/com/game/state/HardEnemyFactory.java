package com.game.state;

public class HardEnemyFactory  implements EnemyFactory {
	 public Enemy createEnemy() {
	        return new HardEnemy();
	    }
	

}

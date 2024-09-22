package com.game.state;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 GameState gameState = GameState.getInstance();

	        // Determine difficulty and create factories
	        AbstractFactory factory;
	        EnemyFactory enemyFactory;

	        if (gameState.getLevel() == 1) {
	            factory = new EasyGameFactory();
	            enemyFactory = new EasyEnemyFactory();
	        } else {
	            factory = new HardGameFactory();
	            enemyFactory = new HardEnemyFactory();
	        }

	        // Create enemies, weapons, and power-ups
	        Enemy enemy = enemyFactory.createEnemy();
	        Weapon weapon = factory.createWeapon();
	        PowerUp powerUp = factory.createPowerUp();

	        // Simulate game actions
	        enemy.attack();
	        weapon.use();
	        powerUp.activate();
	        
	        // Update game state
	        gameState.addScore(100);
	        System.out.println("Score: " + gameState.getScore());
	    }

	}


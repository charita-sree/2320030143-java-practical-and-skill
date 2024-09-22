package com.game.state;

public class GameState {
	 private static GameState instance;
	    private int level;
	    private int score;

	    private GameState() {
	        level = 1;
	        score = 0;
	    }

	    public static synchronized GameState getInstance() {
	        if (instance == null) {
	            instance = new GameState();
	        }
	        return instance;
	    }

	    public int getLevel() {
	        return level;
	    }

	    public void setLevel(int level) {
	        this.level = level;
	    }

	    public int getScore() {
	        return score;
	    }

	    public void addScore(int points) {
	        this.score += points;
	    }

}

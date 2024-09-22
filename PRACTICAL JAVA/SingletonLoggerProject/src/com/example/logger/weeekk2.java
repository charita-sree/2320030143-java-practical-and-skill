package com.example.logger;

public class Main {

	public static void main(String[] args) {
		Logger logger = Logger.getInstance();

        logger.log("This is a log message.");
        logger.log("Another log message.");
        
        Logger anotherLogger = Logger.getInstance();
        System.out.println("Are both instances same? " + (logger == anotherLogger));
    }
	}

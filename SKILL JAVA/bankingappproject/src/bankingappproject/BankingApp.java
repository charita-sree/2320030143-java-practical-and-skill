package bankingappproject;

public class BankingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 UserSession session = UserSession.getInstance();

	        // Attempt to perform banking operations without login
	        session.viewBalance();  // Should prompt for login
	        session.deposit(100);   // Should prompt for login

	        // Log in the user
	        session.login("JohnDoe");

	        // Perform operations after login
	        session.viewBalance();
	        session.deposit(200);   // Deposit money
	        session.withdraw(500);  // Withdraw money
	        session.viewBalance();  // Check balance after withdrawal

	        // Log out the user
	        session.logout();

	        // Try performing operations after logging out
	        session.viewBalance();  // Should prompt for login
	    }

	}



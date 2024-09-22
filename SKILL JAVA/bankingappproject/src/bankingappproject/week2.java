package bankingappproject;

public class BankingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 UserSession session = UserSession.getInstance();

	        session.viewBalance();  // Should prompt for login
	        session.deposit(100);   

	        // Log in the user
	        session.login("JohnDoe");

	        session.viewBalance();
	        session.deposit(200);   
	        session.withdraw(500);  
	        session.viewBalance();  

	        session.logout();

	        session.viewBalance(); 
	    }

	}



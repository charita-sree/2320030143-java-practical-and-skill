package bankingappproject;

public class UserSession {
	private static UserSession instance;  // Singleton instance
    private boolean isLoggedIn;
    private String username;
    private double balance;

    // Private constructor to restrict instantiation
    private UserSession() {
        isLoggedIn = false;  // User starts as logged out
        balance = 1000.0;    // Initial balance for the user
    }

    // Public method to provide access to the singleton instance
    public static UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    // Method to log in the user
    public void login(String username) {
        if (!isLoggedIn) {
            this.username = username;
            isLoggedIn = true;
            System.out.println(username + " has logged in.");
        } else {
            System.out.println("User is already logged in.");
        }
    }

    // Method to log out the user
    public void logout() {
        if (isLoggedIn) {
            System.out.println(username + " has logged out.");
            isLoggedIn = false;
            username = null;
        } else {
            System.out.println("No user is logged in.");
        }
    }

    // Method to check login status
    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    // Method to view balance
    public void viewBalance() {
        if (isLoggedIn) {
            System.out.println("Current Balance: $" + balance);
        } else {
            System.out.println("Please log in to view your balance.");
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (isLoggedIn) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Please log in to deposit money.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (isLoggedIn) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Please log in to withdraw money.");
        }
    }

}

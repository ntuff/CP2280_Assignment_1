package Assignment1;

/**
 * Contains an Account class which represents an individuals personal bank account.                                  <p>
 * Allows a person to make both incoming and outgoing transactions.
 * @author 20148596
 * <pre>
 */
public class Account {

    private String name;
    private double balance;

    /**
     * Creates a single bank account
     * @param name Name assigned to the account
     * @param balance Number of dollars stored in the account
     */
    public Account(String name, double balance) {this.name = name;
        if(balance > 0)
            this.balance = balance;
    }

    /**
     * Sets the name of the account holder
     * @param name Name assigned to the account
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the account holder
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the current account balance
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Adds an amount to the current account balance as long as the contribution is greater than zero
     * @param amount Number of dollars to interact with balance
     */
    public void credit(double amount){
        if(amount > 0){
            this.balance = this.balance + amount;
        }
    }

    /**
     * Subtracts an amount from the current account balance as long as the current amount is greater than zero
     * and the current amount is greater than the deduction
     * @param amount Number of dollars to interact with balance
     */
    public void debit(double amount){
        if(amount > 0){
            if(amount <= this.balance){
                this.balance -= amount;
            } else{
                System.err.println("Debit amount exceeded account balance.");
        }
        }
    }

    /**
     * Resets the current account balance to zero
     */
    public void reset(){
        this.balance = 0;
    }
}

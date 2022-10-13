/**
 * Contains Account class.
 * @author 20148596
 */
public class Account {
    private String name;
    private double balance;

    /**
     *
     * @param name Name assigned to the account.
     * @param balance Number of dollars stored in the account.
     */
    public Account(String name, double balance) {this.name = name;
        if(balance > 0)
            this.balance = balance;
    }

    /**
     * Replaces the current account name with a new name. This value must be a string.
     * @param name Name assigned to the account.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *Returns the current account name as a string.
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the current account balance as a double.
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Adds an amount to the current account balance as long as the contribution is greater than zero.
     * This "credit" naming convention may be misinterpreted. Think of this method as a deposit.
     * @param amount Number of dollars to interact with balance.
     */
    public void credit(double amount){
        if(amount > 0){
            this.balance = this.balance + amount;
        }
    }

    /**
     * Subtracts an amount from the current account balance as long as:
     * - the current amount is greater than zero
     * - the current amount is greater than the deduction.
     * This "debit" naming convention may be misinterpreted. Think of this method as a withdrawal.
     * @param amount Number of dollars to interact with balance.
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
     * Resets the current account balance to zero.
     */
    public void reset(){
        this.balance = 0;
    }
}

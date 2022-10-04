
/**
 * @author 20148596
 */

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {this.name = name;
        if(balance > 0)
            this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return balance;
    }



    //Deposit
    public void credit(double amount){
        if(amount > 0){
            this.balance = this.balance + amount;
        }
    }

    // Withdrawal
    public void debit(double amount){
        if(amount > 0){
            if(amount < this.balance){
                this.balance -= amount;
            } else{
                System.err.println("Debit amount exceeded account balance.");
        }
        }
    }

    public void reset(){
        this.balance = 0;
    }

}

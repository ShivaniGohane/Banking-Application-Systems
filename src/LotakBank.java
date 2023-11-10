public class LotakBank implements RBI{
    private String accountName;
    private String password;
    private int balance;
    public static double rateOfInterest = 7.5;

    //alt + Inset is shortcut to generate getters and setters
    // constructors


    public LotakBank(String accountName, String password, int balance) {
        this.accountName = accountName;
        this.password = password;
        this.balance = balance;
    }

    public String addMoney(int money, String password) {
        if(password.equals(this.password)){
            balance = balance + money;
            return "Money has been added, new Balance is "+balance;
        }
        else {
            return "The password entered is incorrect.";
        }
    }
    public String withdrawMoney(int money, String password) {
        if(password.equals(this.password)){
            balance = balance-money;
            return "Money has been withdrawal, new Balance is "+balance;
        }
        else {
            return "Password Incorrect.";
        }
    }
    public int checkBalance(String password) {
        if(password.equals(this.password)){
            return balance;
        }
        else {
            return -1;
        }
    }
    public double calculateInterest(int years) {
        double totalInterest = (balance*LotakBank.rateOfInterest*years)/100;
        return totalInterest;
    }
}

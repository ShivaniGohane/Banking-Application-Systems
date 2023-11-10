public class NoBank implements RBI{
    private String userName;
    private Integer accountNo;
    private String password;
    private int balance;
    public static double rateOfInterest = 7.2;
    public static int minimumBalance = 5000;

    public NoBank(String userName, String password, int balance) {
        this.userName = userName;
        this.password = password;
        this.balance = balance;

        //Try this : generate random no.here
        this.accountNo = 101;
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
            if((balance-money) >= minimumBalance){
                balance = balance - money;
                return "Money has been withdrawal, new Balance is "+balance;
            }
            else{
                return "Minimum balance criteria is not supported.";
            }
        }
        else{
            return "Password Incorrect.";
        }
    }

    public int checkBalance(String password) {
        if(password.equals(this.password)){
            return balance;
        }
        else{
            return -1;
        }
    }

    public double calculateInterest(int years) {
        double totalInterest = (balance*NoBank.rateOfInterest*years)/100;
        return totalInterest;
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Lotak Bank !! Open your Bank Account");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your userName");
        String userName = sc.next();
        System.out.println("Enter our initial balance for account opening");
        int initialBalance = sc.nextInt();
        System.out.println("Enter Password");
        String password = sc.next();

        NoBank bankAccount = new NoBank(userName, password, initialBalance);

        //withdrew money
        System.out.println("Enter the money you want to withdraw");
        int money = sc.nextInt();
        System.out.println("Enter your password");
        String enteredPassword = sc.next();
        String response = bankAccount.withdrawMoney(money, enteredPassword);
        System.out.println(response);

        //Add money
        System.out.println("Enter the money you want to add");
        money = sc.nextInt();
        System.out.println("Enter your password");
        enteredPassword = sc.next();
        response = bankAccount.addMoney(money, enteredPassword);

        if(response.equals("The password entered is incorrect.")){
            System.out.println(response);
            System.out.println("Enter your password again");
            enteredPassword = sc.next();
            response = bankAccount.addMoney(money, enteredPassword);
            System.out.println(response);
        }

        //Check Balance
        System.out.println("Enter password to check balance");
        int finalBalance = bankAccount.checkBalance(enteredPassword);
        System.out.println("The final balance is "+finalBalance);

        //
        System.out.println("Enter no. of years you want to save this money");
        int years = sc.nextInt();
        double totalInterest = bankAccount.calculateInterest(years);
        System.out.println("The total Interest is "+totalInterest);
    }
}
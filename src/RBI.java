public interface RBI {
    //We just define the methods only
    //Implementations is present int the classes

    public String addMoney(int money, String password);
    public String withdrawMoney(int money, String password);
    public int checkBalance(String password);
    public double calculateInterest(int years);
}

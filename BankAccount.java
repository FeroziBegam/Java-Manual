public class BankAccount {
    private String name;
    private int AccountNum, CurrBal;

    // Constructor
    public BankAccount(String name, int AccountNum, int CurrBal) {
        this.name = name;
        this.AccountNum = AccountNum;
        this.CurrBal = CurrBal;
        System.out.println("The customer's details are: " + name + " " + AccountNum + " " + CurrBal);
    } // Constructor ends

    // Method for withdrawal
    public void withdraw(int WAmt) {
        if (WAmt < CurrBal) {
            CurrBal = CurrBal - WAmt;
            System.out.println("After withdrawal, the current balance is: " + CurrBal);
        } else {
            System.out.println("Insufficient Funds");
        }
    } // Withdraw method ends

    // Method for deposit
    public int deposit (int DAmt) {
        CurrBal = CurrBal + DAmt;
        return CurrBal;
    } // Deposit method ends

    public static void main(String[] args) {
        // Object
        BankAccount cust1 = new BankAccount("FEROZI", 45988, 123698);
        cust1.withdraw(20000);
        cust1.withdraw(2560);
        System.out.println("Your current balance after depositing money is: " + cust1.deposit(2360));
    }
}

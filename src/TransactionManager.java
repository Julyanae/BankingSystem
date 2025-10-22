public class TransactionManager {

    private BanckAccount savingsAccount;
    private BanckAccount checkingAccount;

    public TransactionManager(BanckAccount savingsAccount,BanckAccount checkingAccount)
    {
        this.savingsAccount=savingsAccount;
        this.checkingAccount=checkingAccount;
    }

    public void depositSavingsAccount(double amount)
    {
        savingsAccount.deposit(amount);
    }
    public void depositCheckingAccount(double amount)
    {
        checkingAccount.deposit(amount);
    }
    public void withdrawSavingsAccount(double amount) {
        savingsAccount.withdraw(amount);
    }

    public void withdrawCheckingAccount(double amount) {
        checkingAccount.withdraw(amount);
    }

}

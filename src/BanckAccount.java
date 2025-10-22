import java.util.ArrayList;

public abstract class BanckAccount implements Transactable{

    private double AccountBalance;
    protected ArrayList<String> historyTransaction;

    public BanckAccount()
    {
        this.AccountBalance=500000;
        this.historyTransaction=new ArrayList<>();
    }
    @Override
    public void deposit(double amount)
    {
        this.AccountBalance+=amount;
    }
    @Override
    public void withdraw(double amount)
    {
        this.AccountBalance-=amount;
    }

    public double getAccountBalance()
    {
        return this.AccountBalance;
    }

    public ArrayList<String> getHistoryTransaction() {
        return historyTransaction;
    }


    public void printTransactionHistory() {
        if (historyTransaction.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String history : historyTransaction) {
                System.out.println(history);
            }
        }
    }
}

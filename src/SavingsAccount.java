public class SavingsAccount extends BanckAccount{

    @Override
    public void deposit(double amount)
    {
        super.deposit(amount);
        historyTransaction.add(amount + " has been deposited to the savings account.");
        System.out.println(amount+" has been added to the savings account.");
    }
    @Override
    public void withdraw(double amount)
    {
        super.withdraw(amount);
        historyTransaction.add(amount + " has been withdrawn from the savings account.");
        System.out.println(amount+" has been withdrawn from the savings account.");

    }

}

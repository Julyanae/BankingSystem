import java.util.AbstractCollection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int account=0;
        Scanner sc = new Scanner(System.in);
        BanckAccount savings = new SavingsAccount();
        BanckAccount checking = new CheckingAccout();


        TransactionManager transactionManager = new TransactionManager(savings, checking);

        do{
            int operation=0;
            System.out.println("Would you like to perform operations on your :");
            System.out.println("1-Savings account");
            System.out.println("2-Checking account");
            System.out.println("3-exit");
            account = sc.nextInt();
            if(account == 3) {
                System.out.println("Exited main loop.");
                break;
            }
            if(account==1 || account==2) {
                do {
                    System.out.println("Which operation would you like to perform :");
                    System.out.println("1-deposit");
                    System.out.println("2-withdrawal");
                    System.out.println("3-exit");
                    operation=sc.nextInt();
                    if(operation==3)
                    {
                        break;
                    }
                    System.out.print("Amount : ");
                    double amount=sc.nextDouble();
                    if(account==1 && operation==1)
                    {
                        transactionManager.depositSavingsAccount(amount);
                    }
                    else if(account==1 && operation==2)
                    {
                        transactionManager.withdrawSavingsAccount(amount);
                    } else if (account==2 && operation==1) {
                        transactionManager.depositCheckingAccount(amount);

                    } else if (account==2 && operation==2) {
                        transactionManager.withdrawCheckingAccount(amount);

                    }
                } while (operation != 3);
            }
            if(account == 3) {
                System.out.println("Exited main loop.");
                break;
            }


        }while (account !=3);

        System.out.println("Transaction history :");
        savings.printTransactionHistory();
        checking.printTransactionHistory();

        System.out.println("Your savings account balance : "+savings.getAccountBalance());
        System.out.println("Your checking account balance : "+checking.getAccountBalance());

    }
}

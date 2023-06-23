import java.util.Scanner;
class Account{
    private int bal;
    public Account(int bal){
        this.bal = bal;
    }

    public boolean isSufficientBalance(int w){
        if(bal>w){
            return(true);
        }
        else
            return (false);
    }

    public void withdraw(int amt){
        bal = bal-amt;
        System.out.println("The withdrawal amount is" +amt);
        System.out.println("Your current balance is " + bal);
    }
}

class Customer extends Thread{
    private Account account;
    public Customer(Account account){
        this.account = account;
    }
    public synchronized void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw");
        int amt = sc.nextInt();
         if(account.isSufficientBalance(amt)){
             account.withdraw(amt);
         }
         else{
             System.out.println("Insufficient Balance");
         }
    }
}
public class Synchronization {
    public static void main(String[] args) {
        Account a1 = new Account(1000);
        Customer c1 = new Customer(a1), c2 = new Customer(a1);
        c1.start();
        c2.start();
//        Thread t1 = new Thread ();
//        Thread t2 = new Thread ();
    }
}

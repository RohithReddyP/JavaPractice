package packagen;

import java.util.Scanner;

public class BankAccount {
    Scanner scanner = new Scanner(System.in);
    String accountHolder;
    double balance;
    BankAccount(String accountHolder,double balance){
        this.accountHolder=accountHolder;
        this.balance=balance;
    }

    void deposit(){
        System.out.print("Enter how much amount you want to deposit:");
        double amount = scanner.nextDouble();
        if (amount<=0) {
            System.out.println("Irrelevant Amount");
        }

        else {
            balance += amount;
            System.out.println("Depositing....");
            System.out.println("********************");
            System.out.println("Deposit Successful..");
        }
    }
    void withDrawl(){
        System.out.print("Enter how much amount you want to  withdraw:");
        double amount = scanner.nextDouble();
        if (amount>balance)
            System.out.println("Insufficient Funds");
        else {
            balance -= amount;
            System.out.println("WithDrawl Successful...");
        }
    }
    void getBalance(){
        System.out.println(accountHolder+" Current Balance is :" +balance);
    }
    void displayInfo(){
        System.out.println("Account Holder:" +accountHolder);
        System.out.println("Balance:" +balance);
    }
}

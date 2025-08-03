package packagen;


import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Mukesh",100000);
        BankAccount bankAccount2 = new BankAccount("Harish",100000);
        BankAccount bankAccount3 = new BankAccount("Gukesh",100000);

        BankAccount[] BACC = {bankAccount1,bankAccount2,bankAccount3};

        bankAccount1.displayInfo();
        bankAccount2.displayInfo();
        bankAccount3.displayInfo();

        for (BankAccount bankAccount : BACC){
            bankAccount.getBalance();
        }

    }
}


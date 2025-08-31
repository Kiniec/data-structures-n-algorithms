package Chapter_1_Overview;

public class BankAccount {
    private double balance; //account balance - data field class variable
    public BankAccount (double openingBalance) {
        balance = openingBalance;
    }// constructor

    public void deposit( double amount ){// makes deposit
        balance = balance + amount;
    }//end of instance method deposit

    public void withdraw( double amount ) {//makes withdraw
        balance = balance - amount;
    }//end of instance method withdraw

    public void display(){//displays balance
        System.out.println("Your balance is: " + balance );
    }//end of instance method display

 } //end of the class BankAccount

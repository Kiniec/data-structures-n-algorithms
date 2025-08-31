package Chapter_1_Overview;

public class TestBankAccount {
    public static void main (String[]args){
        BankAccount ba1 = new BankAccount(100.00);//create object
        System.out.print("Before transactions, ");
        ba1.display(); //display balance
        ba1.deposit(74.35); //make deposit
        ba1.withdraw(20.00); //make withdrawal;
        System.out.print("After transactions, ");
        ba1.display(); // display new balance


    }//end of main method

} //end of class TestBankAccount

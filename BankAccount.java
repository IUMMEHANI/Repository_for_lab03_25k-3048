package Account;

public class BankAccount {
    int Accountno;
    String AccountHolderName;
    double initial_balance;
    BankAccount (){
        initial_balance = 0;
    }
    BankAccount (int accno , String name , double balance) {
        this.Accountno = accno;
        this.AccountHolderName = name;
        this.initial_balance = balance;
    }
    public void display (){
        System.out.println("Acc no: " + Accountno + " name is " + AccountHolderName + " balance is : " + initial_balance);
    }
    public static void main (String[] args){
        BankAccount ba1 = new BankAccount();
        BankAccount ba2 = new BankAccount(2345 , "HANI" , 234500.90);
        ba1.display();
        ba2.display();
    }
}

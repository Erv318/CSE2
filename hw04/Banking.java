//Evan Vomund edited 2/15/15
//program will ask the user if they want to view, deposit or withdraw
//from their bank account. It will then determine the amount in the 
//account after the transaction is complete
import java.util.Scanner;
import java.util.Random;
// Program will determine a number 0 and 1
//
//
public class Banking{
    			// main method required for every Java program
   			public static void main(String[] args) {
   			    Random numGen = new Random();
   	double balance=(numGen.nextDouble()*4000+1000); //random number between 1000 and 5000
    Scanner myScanner = new Scanner( System.in );
    System.out.print("Would you like to VIEW your balance, make a DEPOSIT, or WITHDRAW?  ");
    String choice= myScanner.next();  //accept user input
     //switch statement depending on what the user wants to do
switch (choice){
    case ("VIEW"): //view bank account
    System.out.print("your balance is $"+balance); //display ballance
    break;
case ("DEPOSIT"): //deposit to account
    System.out.print("how much would you like to diposit? $");
    double deposit= myScanner.nextDouble(); //amount user wants to deposit
    if (deposit>0){ //make sure its a valid entry
    double totalDeposit=deposit+balance; //find amount in bank after deposit
    System.out.print("Your total balance is "+totalDeposit);
    }
    else {
        System.out.print("That is not a possitive number.");
    }
    break;
case ("WITHDRAW"): //withdraw from account
    System.out.print("how much would you like to withdraw? $");
    double withdraw= myScanner.nextDouble(); //how much will be withdrawn
    if (withdraw>0 && withdraw<balance){
    double totalWithdraw=balance-withdraw; //amount left after transacton
    System.out.print("Your total balance is $"+totalWithdraw);
    }
    else{
        System.out.print("This amount can not be withdrawn");
    }
    break;
    default:
System.out.print("enter VIEW, DEPOSIT, or WITHDRAW"); //incase of invalid entery
return;
}// swich
}//main method
}//class
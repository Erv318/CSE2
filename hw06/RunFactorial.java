//program takes the factorial of entered number
import java.util.Scanner;
public class RunFactorial{
    			// main method required for every Java program
   			public static void main(String[] args) {
Scanner myScanner;
    myScanner = new Scanner( System.in );
    System.out.println("Enter a number between 9 and 16: ");
    int number = myScanner.nextInt();//accept user input
    
    int counter=number;//counter for while loop
if (number>=9 && number <=16){
    while (counter>1){//stops at one
        int numberMinus=counter-1;//one less than each number throughout the loop
        number=number*numberMinus;//multiplies by each number lower than the one entered
        counter=counter-1;//cycles with one lower number
    }
   		
   		System.out.print(number);
}//if
else{
    System.out.println("invalid input");
}//else


   			}//main
}//class
import java.util.Scanner;
public class FourDigits{
    public static void main(String[] args) {
 //input for number  
    Scanner myScanner;
        myScanner = new Scanner( System.in );
        System.out.print("enter a number: ");//requests input
        double number=myScanner.nextDouble();
        //eliminate all numbers except first four after the decimal
        double numberMultiplied=number*10000;
        int numberMultipliedCast=(int)numberMultiplied; //removes extra decimals
        //subtract to eliminate all but last for digits
        int decimals=numberMultipliedCast-((int)number*10000);
        
        System.out.print("the first for decimals are: "+decimals);
    }
}
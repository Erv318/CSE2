import java.util.Scanner;
public class Bicycle{
    public static void main(String[] args) {
 //input for number of counts   
    Scanner myScanner;
        myScanner = new Scanner( System.in );
        System.out.print("enter the number of counts: ");
        int counts=myScanner.nextInt();
//input for time        
    System.out.print("enter the number of seconds: ");
    double seconds=myScanner.nextDouble();
    
    //define pi
   double PI=3.14159;
    //circumference of wheel
    double circumference=(2*PI*27);
    //time it took
    double time=seconds/60;//minutes
    
   double distance=circumference*counts/63360; //distance traveled in miles
   double rate=distance/time/60; //mph
   
   //output
   System.out.print("The distasnce was "+distance+" miles and took "+time+" minutes.");
    System.out.print("the average mph was "+rate);
    }
}
//this program prompts the user to enter five integers, testing if they
//are valid integers over zero, and adding the five together

import java.util.Scanner;
public class GetIntegers{
    			// main method required for every Java program
   			public static void main(String[] args) {
Scanner myScanner;
    myScanner = new Scanner( System.in );

//define all the variables to be used in the loops
int intOne=1;
int intTwo=1;
int intThree=1;
int intFour=1;
int intFive=1;
int inputOne=0;
int inputTwo=0;
int inputThree=0;
int inputFour=0;
int inputFive=0;
   for (intOne = 1; intOne>0; intOne++){//infinate loop
       System.out.println("Please enter a valid integer: ");
       
       if (myScanner.hasNextInt()){//test if it is an int
       inputOne=myScanner.nextInt();//accept user input
      if (inputOne>0){
       break;
      }
       else{
           System.out.println("invalid input");
       }
      }
       else{
           System.out.println("invalid input");
           myScanner.next();
       }
   }


   
   for (intTwo = 1; intTwo>0; intTwo++){//infinate loop
       System.out.println("Please enter a valid integer: ");
       
       if (myScanner.hasNextInt()){//test if it is an int
       inputTwo=myScanner.nextInt();//accept user input
      if (inputTwo>0){
       break;
      }
       else{
           System.out.println("invalid input");
       }
      }
       else{
           System.out.println("invalid input");
           myScanner.next();
       }
   }

   for (intThree = 1; intThree>0; intThree++){//infinate loop
       System.out.println("Please enter a valid integer: ");
       
       if (myScanner.hasNextInt()){//test if it is an int
       inputThree=myScanner.nextInt();//accept user input
      if (inputThree>0){
       break;
      }
       else{
           System.out.println("invalid input");
       }
      }
       else{
           System.out.println("invalid input");
           myScanner.next();
       }
   }
   

   for (intFour = 1; intFour>0; intFour++){//infinate loop
       System.out.println("Please enter a valid integer: ");
       
       if (myScanner.hasNextInt()){//test if it is an int
       inputFour=myScanner.nextInt();//accept user input
      if (inputFour>0){
       break;
      }
       else{
           System.out.println("invalid input");
       }
      }
       else{
           System.out.println("invalid input");
           myScanner.next();
       }
   }
 
   for (intFive =1; intFive>0; intFive++){//infinate loop
          System.out.println("Please enter a valid integer: ");
          
       if (myScanner.hasNextInt()){//test if it is an int
       inputFive=myScanner.nextInt();//accept user input
      if (inputFive>0){
       break;
      }
       else{
           System.out.println("invalid input");
       }
      }
       else{
           System.out.println("invalid input");
           myScanner.next();
       }
   }
   
   int total=inputOne+inputTwo+inputThree+inputFour+inputFive;//add the valid numbers together
   System.out.print(total);
   		}//main 
}//class
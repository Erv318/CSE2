//Evan Vomund edited 2/15/15
import java.util.Scanner;
// Program will determine a number 1-10 chosen by user by asking
//the user a series of questions. user enters y or n. If they dont
//program will notify them that they have invalid input
public class WhichNumber{
    			// main method required for every Java program
   			public static void main(String[] args) {
    Scanner myScanner = new Scanner( System.in );
    System.out.print("Is your number even? ");//2,4,6,8,10
    String even= myScanner.next();  //accept user input

//define variables to be used throughout strings
String six="x";//will be changed to y or n
String three="x";//will be changed to y or n
String divisibleFour="x";//will be changed to y or n
String five="x";//will be changed to y or n
String four="x";//will be changed to y or n
    switch (even){ //if the number is even
     case "y"://even
    System.out.print("Is your number divisible by three? "); //6
   	three= myScanner.next();
   
   	
   	switch (three){ //if it is divisible by three
   	 case "y":
   	System.out.print("your number is six "); //6
   	//end
   	break;
   	case "n":
   	System.out.print("is your number greater than six? "); // 8,10
   	six= myScanner.next();
    
    
    switch (six){ //if it is greater or less than six
    case ("y"):
     System.out.print("is your number divisible by four? ");
     divisibleFour= myScanner.next();
    
    if (divisibleFour.equals("y")){ //if it is divisible by four
     System.out.print("your number is eight");
    //end
    }
    else if (divisibleFour.equals("n")){
     System.out.print("your number is ten");
    //end
    }
    else{
     System.out.print("invalid input");
    }//else
    break; //six
   case "n"://2,4
   		
   		System.out.print("is your number greater than three? ");
   		three= myScanner.next();
   			if (three.equals("y")){ //grater or less than three
   			 System.out.print("your number is 4");
   			//end
   			    			}
      else {
       System.out.print("your number is two");
      // end
      }
      break; //three
      default:
           System.out.print("invalid input");
           break;
    } //switch six
    default:
         System.out.print("invalid input");
    } //switch three
    break;//even
     case "n":
    System.out.print("Is your number divisible by three? "); //3,9
   	three= myScanner.next();
   
   	
   	switch (three){ //if it is divisible by three
   	 case "y":
   	System.out.print("is your number greater than five? "); //9
   	five= myScanner.next();
   	if (five.equals("y")){ //if it is greater than five
   	 System.out.print("Your number is nine");
   	}//five yes
   	else 
   	System.out.print("Your number is three");
   	//end of five no
   	break;//yes three
   	case "n": //1,5,7
   	System.out.print("is your number greater than six? "); // 8,10
   	six= myScanner.next();
}//yes three
    
    switch (six){ //greater than six or less
    case ("y"):
     System.out.print("your number is seven");
     break;//six yes
    case ("n"): //not above 6, 1 or 5
     System.out.print("is your number greater than three? "); //5
    three=myScanner.next();
    
    if (three.equals("y")){ //greater than three and odd
    System.out.print("your number is five");
    }//three
    else{
     System.out.print("your number is one");
    //end
    }//three not
    break; //six
    default:
         System.out.print("invalid input");
         break;
    }//six
    break; //odd
    default:
         System.out.print("invalid input");
         break;
    }//even
   			}//main method
   			}//class
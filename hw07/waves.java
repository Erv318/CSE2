//Homework 7
//Evan Vomund
//This program will take an integer from the user, and make a wave
//patern alternating numbers where odd number increase each row until 
//they have the number amount of the displayed number on the row.
//this is done in for, while and do while loops
import java.util.Scanner;
public class waves{
    			// main method required for every Java program
   			public static void main(String[] args) {

    Scanner myScanner = new Scanner( System.in );
    System.out.print("Please enter an integer 1-30: ");
    int number=myScanner.nextInt();//user input
//define all integers to be used
int numone=0;
int numtwo=0;
int numthree=1;
int numfour=0;
int numfive=0;
int numsix=0;


 //for loop 
 System.out.println("for loop");
    for(numthree=1; numthree<=number; numthree++){//loops until code finishes with input number
        for (numfour=numthree; numfour>0; numfour--){//how many rows per number
            for (numsix=1; numsix<=numfour; numsix++){//how many charactors displayed per row
                System.out.print(numthree);
            }
                   System.out.println("");//go down a line
           }    
           
            numthree++;//increase number before increasing triangle
        
    for(numtwo=1; numtwo<=numthree; numtwo++){//determines amount of rows
        for (numone=1; numone<=numtwo; numone++){//determines charactors per row
            System.out.print(numthree);
            
        }
                System.out.println("");//moves to next line before repeat
    }
	}//end of for loops
        
  //while loops 
      
   System.out.println("");
   System.out.println("while loop");
   
   
    //while loop 
    numthree=1;
    while (numthree<=number){//loops until code finishes with input number
        numfour=numthree;
        while(numfour>0){//how many rows per number
            numsix=1;
            while (numsix<=numfour){//how many charactors displayed per row
                System.out.print(numthree);
                numsix++;//add before cycling again to set a limmit
            }
                   System.out.println("");//go down a line
                   numfour--;//subtract before cycling again to set a limmit
           }    
           
            numthree++;//increase number before increasing triangle
        
    numtwo=1; 
    while(numtwo<=numthree){//determines amount of rows
        numone=1; 
        while (numone<=numtwo){//determines charactors per row
            System.out.print(numthree);
            numone++;//add before cycling again to set a limmit
        }
                System.out.println("");//moves to next line before repeat
    
        numtwo++;//add before cycling again to set a limmit
    }
    numthree++;//move on to next number
	}//end of for while
   
   
   //do while loop
   System.out.println("");
   System.out.println("do while loop");
       
    numthree=1;
    do {//loops until code finishes with input number
        numfour=numthree;
        do{//how many rows per number
            numsix=1;
            do{//how many charactors displayed per row
                System.out.print(numthree);
                numsix++;//add before cycling again to set a limmit
            } while (numsix<=numfour);
                   System.out.println("");//go down a line
                   numfour--;//subtract before cycling again to set a limmit
           }    while(numfour>0);
           
            numthree++;//increase number before increasing triangle
        
    numtwo=1; 
   do {//determines amount of rows
        numone=1; 
        do{//determines charactors per row
            System.out.print(numthree);
            numone++;//add before cycling again to set a limmit
        }while (numone<=numtwo);
                System.out.println("");//moves to next line before repeat
    
        numtwo++;//add before cycling again to set a limmit
    }while(numtwo<=numthree);
    numthree++;//move on to next number
	} while (numthree<=number);//end of for while
   
   
   
   
   
    }//main method
   		
   			}//class
    

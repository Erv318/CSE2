import java.util.Scanner;
// Program will convert decimal to hex
//It takes in three decinams and puts them in a form that can be used for color
//
public class ToHex{
    			// main method 
   			public static void main(String[] args) {
    Scanner myScanner = new Scanner( System.in );
    System.out.print("Enter three numbers which represent RGB values: "); //will convert to hex
    System.out.println("R: ");
    int valOne;
    if(myScanner.hasNextInt()){
     valOne = myScanner.nextInt();//accept user input 1
    }
    else{
     System.out.println("the input was not a valid integer");
     return;
    }
    System.out.println("G: ");
    int valTwo;
        if(myScanner.hasNextInt()){
     valTwo = myScanner.nextInt();//accept user input 1
    }
    else{
     System.out.println("the input was not a valid integer");
     return;
    }
    System.out.println("B: ");
    int valThree;//third intput
        if(myScanner.hasNextInt()){
     valThree = myScanner.nextInt();//accept user input 1
    }
    else{
     System.out.println("the input was not a valid integer");
     return;
    }
    //check that it is a valid number
    if (valOne<=0 && valOne>=255 && valTwo<=0 && valTwo>=255 && valThree<=0 && valThree>=255){
     System.out.println("please make sure your number is 0-255");
     return;
    }
    
    int decOneOne=valOne/16;//first character in hex
    String decOneOneString="";//define variable to convert int to string
    
    int decOneTwo=valOne%16;//second charactor in hex
    String decOneTwoString="";//define variable to convert int to string
    
    
    switch (decOneOne){ //converst multi charactor numbers to hex form
     case 10:
      decOneOneString= "A";
     break;
     case 11:
      decOneOneString= "B";
     break;
     case 12: 
      decOneOneString= "C";
     break;
     case 13: 
     decOneOneString= "D";
     break;
     case 14: 
     decOneOneString= "E";
     break;
     case 15:
      decOneOneString= "F";
     break; 
     default:
     decOneOneString+=decOneOne;//just a number
     break;
    }
    
        switch (decOneTwo){//converst multi charactor numbers to hex form
     case 10:
     decOneTwoString= "A";
     break;
     case 11:
      decOneTwoString= "B";
     break;
     case 12:
       decOneTwoString= "C";
     break;
     case 13:
      decOneTwoString= "D";
     break;
     case 14:
      decOneTwoString= "E";
     break;
     case 15: 
      decOneTwoString= "F";
     break;  
     default:
     decOneTwoString+=decOneTwo;//just a number
     break;
    }
    //---------------------------------
    //val two
    
    
    
    
    int decTwoOne=valTwo/16;
    String decTwoOneString=""; //define variable to convert int to string
    
    int decTwoTwo=valTwo%16;
    String decTwoTwoString="";//define variable to convert int to string
    
    
    switch (decTwoOne){//converst multi charactor numbers to hex form
     case 10:
      decTwoOneString= "A";
     break;
     case 11: 
      decTwoOneString= "B";
     break;
     case 12:
      decTwoOneString= "C";
     break;
     case 13:
      decTwoOneString= "D";
     break;
     case 14: 
      decTwoOneString= "E";
     break;
     case 15: 
      decTwoOneString= "F";
     break; 
     default:
     decTwoOneString+=decTwoOne;//just a number
     break;
    }
    
        switch (decTwoTwo){//converst multi charactor numbers to hex form
     case 10: 
      decTwoTwoString= "A";
     break;
     case 11:
      decTwoTwoString= "B";
     break;
     case 12:
      decTwoTwoString= "C";
     break;
     case 13:
      decTwoTwoString= "D";
     break;
     case 14:
      decTwoTwoString= "E";
     break;
     case 15:
      decTwoTwoString= "F";
     break;  
     default:
     decTwoTwoString+=decTwoTwo;//just a number
     break;
    }
    
        //---------------------------------
    //val three
    
    
    
    
    int decThreeOne=valThree/16;
    String decThreeOneString = "";//define variable to convert int to string
   
    int decThreeTwo=valThree%16;
    String decThreeTwoString= "";//define variable to convert int to string

    
    switch (decThreeOne){//converst multi charactor numbers to hex form
     case 10: 
       decThreeOneString+= "A";
     break;
     case 11: 
       decThreeOneString+= "B";
     break;
     case 12: 
       decThreeOneString+= "C";
     break;
     case 13: 
       decThreeOneString+= "D";
     break;
     case 14: 
       decThreeOneString+= "E";
     break;
     case 15: 
       decThreeOneString+= "F";
     break; 
     default:
      decThreeOneString+= decThreeOne;//just a number
     break;
    }
    
        switch (decThreeTwo){//converst multi charactor numbers to hex form
     case 10: 
       decThreeTwoString= "A";
     break;
     case 11: 
       decThreeTwoString= "B";
     break;
     case 12: 
       decThreeTwoString= "C";
     break;
     case 13: 
       decThreeTwoString= "D";
     break;
     case 14: 
       decThreeTwoString= "E";
     break;
     case 15: 
       decThreeTwoString= "F";
     break;  
     default:
         decThreeTwoString+= decThreeTwo;//just a number
     break;
    }
   		
   		System.out.println("your hex value is "+decOneOneString+decOneTwoString+decTwoOneString+decTwoTwoString+decThreeOneString+decThreeTwoString);
   		
   		
   			}//main method
}//class
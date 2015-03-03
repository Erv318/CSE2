//generates random number. If even it displays that number many stars
//if odd, it displays that many & symbols
public class MakeSymbols{
    			// main method required for every Java program
   			public static void main(String[] args) {

  	int number=(int)((Math.random())*101); //random number between 0 and 100
System.out.println("Random number generatied: "+number);//display number
   	if (number%2==0){//if even
   while(number>0){//limmits it so it only counts positive numbers
  	    System.out.print("*");
  	    number--;//subtract one and loop again
   	}//while
  	}//if
   	else{//if odd
   	    while(number>0){//limmits to positive numbers
   	    System.out.print("&");
   	    number--;//subtract one and re cycle
   	    
   	}//while
   	}//else
   	
   	
  			}//method
}//class
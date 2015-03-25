//evan vomund
//program makes a game using various methods
import java.util.Scanner;
public class HW8 {//designes giant
            public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    return;
            }

    public static void cave() {//designs cave
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
       return;
    }
    
    public static void box(){//design of boxes
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
                return;
    }
public static String getInput(Scanner scan, String string) {//weather or not they want to keep plaing
       // if (string.equals ("c") || string.equals ("C")){
       String keepGoing = scan.next();//accept input
       if (keepGoing.equals ("c") || keepGoing.equals ("C")){//if continue
                return ("keep playing");
        }
        else{//if not continuing
                return ("you loose");
        }
}  
public static String getInput(Scanner scan, String string, int trial){//attacking or escaping
 
int counter=0;
while (counter<10){//needs ten hits to kill
String attack = scan.next();//accept input
if (attack.equals ("a") || attack.equals ("A")){   //if attacking     
               	int number=(int)((Math.random())*2); //random number between 0 and 100
        if (number==1){//one is a hit
                System.out.println("Hit!");
                counter++;//takes 10 hits
             //   break;
        }
        else {//zero is a miss
                System.out.println("miss!");
              //  break;
        }
      //  return ("defeat");
}
        else if (attack.equals ("E") || attack.equals ("e")){//escaping
                       	int number=(int)((Math.random())*10); //random number between 0 and 100
if (number==8){//they need value 8 to escape
        counter=10;
return ("you excaped");

}
else{
      System.out.println("escape failed");
               
       }
}
       // break;        
        }
        return ("keep going");

}

public static String getInput(Scanner scan){//choose a box
        int box = scan.nextInt();//accept input
        switch (box){
                case 1: System.out.println("you recieve a hundred dollars!");
                case 2: System.out.println("you recieve nine hundred dollars!");
                case 3: System.out.println("you recieve five hundred dollars!");
                default: System.out.println("didnt choose a box!");
        }
        return (" ");//blank string
}

        
public static void main(String[] args) {

        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");//go to method


        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");//go to method

        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();//go to method
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");//go to method

        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");//go to method
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();//go to method
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();//go to method
       // input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }
    }

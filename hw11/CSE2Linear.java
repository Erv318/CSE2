//Evan Vomund CSE2
//Program calls user to enter 15 grades, searches them using binary for a specific
//value then shuffles array and searches it linearly.
import java.util.Scanner;
import java.util.Random;
public class CSE2Linear{

public static int binary(int[] array){//for binary source
   int q=0;

       	Scanner scan=new Scanner(System.in);
	System.out.println("Enter an grade: ");
	int binaryNum=scan.nextInt();
	
	int bottom=0;//bottom bound
	int top=15;//top bound
	int brackets=8;//middle point
	while (top!=brackets&bottom!=brackets){//orderInputs[brackets]!=binaryNum || top==bottom+1||top==bottom||
		if (array[brackets]<binaryNum){
			bottom=(int)(bottom+(top-bottom)/2);//move bottom bracket up
				brackets=((int)(bottom+((top-bottom)/2)+.5));//move bottom bracket up
				q++;//add to count
			//	System.out.println(brackets+"  "+bottom);
				
		}
		else {
			top=(int)(top-(top-bottom)/2);//move top bracket
				brackets=((int)(top-((top-bottom)/2)+.5));//move top bracket
			//	System.out.println(brackets+" "+top);
q++;//add to count
		}
	}

   
return q;//amount of steps
 
}

public static int[] random(int[] array){//shuffles array
    int[] randomArray=new int[16];//larger in order to move numbers around

   for (int i=0; i<15;i++){//go through each value
        int[] randomArrayTwo=new int[16];//larger in order to move numbers around
    int randomNum=((int) ((Math.random())*15));//random numbers in array
    for (int f=15; f>randomNum; f--){//push all values right of random to the right
       int r=0;
       if (randomNum<1){//incase random number is zero
           r=0;
       }
       else{
        r=f-1;//sets value to slide aray to the right
       }
        randomArray[f]=array[r];//pushes array right

    }
    randomArray[randomNum]=array[i];//place term in the spot opened up
            for (int q=0; q<15; q++){//to move numbers back into the spot where the ith term was
         randomArrayTwo[q]=randomArray[q];//pushes array left
        }
    for (int f=i; f<=14; f++){//push array left
        int e=f+1;
        randomArray[f]=randomArrayTwo[e];
    }
            for (int q=0; q<15; q++){//set into a size 15 array
         randomArrayTwo[q]=randomArray[q];
        }
   }

    int[] randomArrayCompressed=new int[15];//15 sized aray
    for (int g=0; g<15;g++){
     randomArrayCompressed[g]=randomArray[g];
     System.out.println(randomArrayCompressed[g]);//to print random array
    }
    
    return randomArrayCompressed;//feeds back shuffled array
}

public static int linear(int[] array,int grade){//linear search of shuffled aray
    int count=0;
   for (int i=0; i<15; i++){//go through eavh value one by one
       if (array[i]==grade){//check if the value is the entered grade
           break;
       }
       else{
           count++;//counts how many times it takes to find
       }
   }
   return count;//amount of times it took to find grade
}

public static void main(String[] args){
    	Scanner scan=new Scanner(System.in);
    int[] array=new int[15];
    System.out.println("Enter Grades: ");//creates array values
    for(int i=0; i<15; i++){//go through eavh space of the array
               
       if (scan.hasNextInt()){//test if it is an int
       array[i]=scan.nextInt();//accept user input
      if (array[i]>=0&array[i]<101){//test bounds
       continue;
      }
       else{//if it is not in the right bounds
           System.out.println("invalid input");
       }
      }
       else{//if it is not an integer
           System.out.println("invalid input");
           scan.next();
       }

    }
          int q=binary(array); //calls binary method
           System.out.println("your grade was found after "+q+" iterations");
           
    System.out.println("--------------");
        System.out.println("Shuffled list:");
 //   System.out.println("Enter grade to search for: ");
 //   int grade=scan.nextInt();
 int[] arrayRandom=new int[15];//new array
arrayRandom=random(array);//calls shuffle method
System.out.println("enter the grade you would like to search for");
int grade=scan.nextInt();
int count=linear(arrayRandom, grade);//calls linear search method
System.out.println("it took "+count+" counts to find your grade");
}





}

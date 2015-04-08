//Evan Vomund
//Program will generate random code remove a select number from the aray, and remove
//any of the same number the user enters from the array.
import java.util.Scanner;
import java.util.Random;
public class RemoveElements{

public static int[] randomInput(){//generate random array
//Random numGen = new Random();//to import random numbers
	int[] randomInputs=new int [10];//size 10 array
	int i=1;//for count
	for(i=0; i<=9; i++){
		int random=(int) ((Math.random())*10);//random numbers in array
		randomInputs[i]=random;
	

	}
           return randomInputs;//returns random array
}

public static int[] delete(int[] list, int pos){//takes away the n'th array value
		int[] cutArray=new int[9];

		for (int count=0; count<pos-1; count++){//all values less than entered value
			cutArray[count]=list[count];
		}
				for (int count=pos; count<9; count++){//all values greater than entered value
			cutArray[count-1]=list[count];
		}

	
           return cutArray;//returns modified array
            		
}

public static int[] remove(int[] list, int target){//removes any number of the values from array
	int count=0;
	int c=0;
	for (int i=0; i<10; i++){//to determine size of array
		if (list[i]==target){
			count++;
		}
	}
	int counttwo=10-count;//size of array
	int[] removedArray=new int[counttwo];//
	for (int i=0; i<counttwo; i++){//go through all values
		if (list[i]!=target){//if they arent the given value
			removedArray[i-c]=list[i];
		}
		else{
			c++;//account for missing value
		}
		
	}

           return removedArray;//feeds back smaller array
   	
}




  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
}
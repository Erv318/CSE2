//program creates a random 4d array, prints its stats and sorts both its 4d and 3d arrays 

import java.util.Random;
import java.util.Scanner;
public class FourDwin{
    
    public static double randomNumber(){//generates random number 0 to 30
Random numGen = new Random();//random number
int number=0;//define

    number=((int)((numGen.nextDouble())*300));//between zero and ten
    double output=number/10;//leave one decimal point

return output;//retruns random number
}

public static double[][][] makeArray(int x, int y){//makes 4d array
    double[][][] array=new double[3][][];//array to add to
    for(int i=0; i<3; i++){//outermost layer has 3 3d arrays
        int size=(int) (Math.random()*(y-x)+x);//random number of arrays w in 3d arrays
        array[i]=new double[size][];//define size of each 3d array
    for(int j=0; j<size; j++){//for each 3d array
        int length=(int) (Math.random()*(y-x)+x);//size of 2d arrays
        array[i][j]=new double[length];//size of 2d arrays
    for(int k=0; k<length; k++){//for a2d arrays add numbers
        array[i][j][k]=randomNumber();//adds numbers to 2d arrays
    
}
}
}
return array;//returns 4d array
}

public static void statArray(double[][][] array){//provides mean sum and number of elements
    double sum=0;//all elements added
    double number=0;//number of elements
    double mean=0;//sum/number
    for (int i=0; i<3; i++){//each 3d array
        for (int j=0; j<array[i].length; j++){//each 2d array
            for (int k=0; k<array[i][j].length; k++){//each element
                sum=sum+array[i][j][k];//add each element
                number++;//add one to the amount
            }
        }
    }
    mean=sum/number;//formula for mean
    System.out.println("number of elements: "+number);
    System.out.println("sum of elements: "+sum);
    System.out.println("mean: "+mean);
}



public static double[][][] sort4D(double[][][] array){//sorts 4d array
          // double[][][]check=array;
          double[][]check;//temporary array
    for (int i=1; i<3; i++){//each 3d array
        int j=i-1;//for swaping
        
        if (array[i].length<array[j].length){//check if size is biger or smaller
        check=array[i];//swap
        array[i]=array[j];//swap
        array[j]=check;//swap
        i--;//to check again
    }
    else if (array[i].length==array[j].length){//if they are the same choose the first number 
        if (array[i][1][1]<array[j][1][1]){//first number in each array
        check=array[i];//swap
        array[i]=array[j];//swap
        array[j]=check;//swap
        i--;//check again
        }
    }
}
    return array;//returns rearanged array

}


public static double[][][] sort3D(double[][][] array){//sorts each 3d array
    double[]tempArray;//temporary for swaping
    for (int i=0; i<3; i++){//each 3d array
        for (int j=1; j<array[i].length; j++){//each 2d array
            int k=j-1;//to check length
            if (array[j].length<array[k].length){//does it need to swap?
                tempArray=array[i][j];//swap
                array[i][j]=array[i][k];//swap
                array[i][k]=tempArray;//swap
                j--;//test again
        }
            else if (array[j].length==array[k].length){//if equal check first element
                if (array[i][j][1]<array[i][k][1]){//first element
                    tempArray=array[i][j];//swap
                    array[i][j]=array[i][k];//swap
                    array[i][k]=tempArray;//swap
                    j--;//swap
                }
                
        }
    }
    
}
return array;//return rearanged array
}




public static void print(double[][][] array){//print arrays
    for(int i=0; i<3; i++){//each 3d array
        System.out.print(" { ");
        for(int j=0; j<array[i].length; j++){//each 2d array
            System.out.print(" { ");
            for(int k=0; k<array[i][j].length; k++){//each element 
                System.out.print(array[i][j][k]);
                if (k==array[i][j].length-1){//if end of array
                    System.out.print(" }, ");
                }
                else {
                    System.out.print(", ");
                }
            }//test
            if (j==array[i].length-1){//if end of array
                System.out.print(" }, ");
            }
        }//test
        if (i==2){//if end of array
            System.out.print(" }, ");
        }
        
        
    }
}

public static void main(String[] args){
    Scanner myScanner=new Scanner (System.in);
       int x=1;
       int y=0;
       while (x>y){
       System.out.println("enter lower bound");
        x=myScanner.nextInt();//lower bound
        System.out.println("enter upper bound");
        y=myScanner.nextInt();//upper bound
        if (x>y){
            System.out.println("error try again");
            continue;
        }
       }

    double[][][] array=makeArray(x, y);//make the array
    print(array);//print origional aray
    statArray(array);//print array stats
    System.out.println("----------------------------------------------sorted 4d-----------");
    array=sort4D(array);//sort 4d array

      System.out.println("----------------------------------------------sorted --------------");
    array=sort3D(array);//sort 3d array
    print(array);//print result
}
}
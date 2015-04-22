//Evan Vomund
//CSE 2
//code generates and multiplies two arrays generated randomly

import java.util.Random;
import java.util.Scanner;
public class Multiply{

public static int randomNumber(){//generates random number -10to 10
int negative=(int)((Math.random())*2);//negative or possitive
int number=0;
if (negative==0){//less
    number=(int)((Math.random())*10);//between zero and ten
}
else {
    number=(-1*(int)((Math.random())*10));//between -10 and zero
}
return number;//retruns random number
}



public static int[][] randomMatrix(int row, int colemn){//for binary source

//int size=row*colemn;

int[][] matrix=new int[row][];//size of rows
        for (int j=0; j<row; j++){//create matrix by row
            matrix[j]=new int[colemn];
for (int i=0; i<colemn; i++){//fill in colemns
matrix[j][i] = randomNumber(); //random number method

}
}
return matrix;//feed back random matrix
}//end randomMatrix

public static void print(int[][] matrix){//print out matrix
    int row=matrix.length;//size of row
    int colemn=matrix[1].length;//size of colemn
for (int j=0; j<row; j++){// prints by each row
for (int i=0; i<colemn; i++){// prints by each colemn
    if (i+1==colemn){//to move onto new row 
        System.out.println("  "+matrix[j][i]);//go down a lane
    }
else {//if in the middle of the colemn
    System.out.print("   "+matrix[j][i]);//dont go down a line
}

}
}
    
}//end print


public static int[][]matrixMultiply(int[][] matrixOne, int[][] matrixTwo){//multiply matricies
int rowOne=matrixOne.length;//size of first row
int colemnOne=matrixOne[1].length;//sixe of first colemn
int rowTwo=matrixTwo.length;//size of second row
int colemnTwo=matrixTwo[1].length;//sixe of second colemn
int x=1;//initialize
int p=0;//initialize


if (rowOne!=colemnTwo){//if unmultipliable
    System.out.println("cannot multiply");
    System.exit(0) ; //exit program

}
System.out.println("The dementions of the matrix are"+rowOne+"x"+rowTwo);
int[][] matrixFinal=new int[rowOne][];//final matrix
        
        for (int j=0; j<rowOne; j++){//fill by row
            
            matrixFinal[j]=new int[rowTwo];//final matrix size
            
for (int i=0; i<rowTwo; i++){//multiply by row

int number=0;
    for (x=0; x<rowOne; x++){//goes through the row of first and colemn of second to multiply
        
    
        number=number+(matrixOne[j][x]*matrixTwo[x][i]);//adds each multiplication of row by colemn
    
    }
matrixFinal[j][i] = number; //fills in actual spots of final matrix

}
}

return matrixFinal;
}//ent matrixMultiply

public static void main(String[] args){//main method
    Scanner myScanner = new Scanner( System.in );
System.out.println("Enter the height of first matrix: ");
int rowone=myScanner.nextInt();//first matrix height
System.out.println("Enter the width of first matrix: ");
int colemnone=myScanner.nextInt();//first matrix width
int [][] matrix=randomMatrix(rowone, colemnone);//create by method
print(matrix);//print method to print matrix

System.out.println("Enter the height of second matrix: ");
int row=myScanner.nextInt();//ask for height
System.out.println("Enter the width of second matrix: ");
int colemn=myScanner.nextInt();//second matrix width
int [][]matrixTwo=randomMatrix(row, colemn);// create second matrix by method
print(matrixTwo);//call print method to print matrix
if (rowone!=colemn){//incase it is un mulitpliable
    System.out.println("cannot multiply");
    return;//exit program

}
int [][] matrixFinal=matrixMultiply(matrix, matrixTwo);//final matrix after multiplication
print(matrixFinal);//calls to have final matrix printed via method
}//end main



}

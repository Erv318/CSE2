import java.util.Random;
public class Matricies {
    public static void main (String [] args){
        Random r = new Random();
        int a = 1+r.nextInt(7);
        int b = 1+r.nextInt(7);
        int ac = 1+r.nextInt(7);
        int bc = 1+r.nextInt(7);
        boolean formata = r.nextBoolean();
        boolean formatb = r.nextBoolean();
        boolean formatc = r.nextBoolean();
        System.out.println(a+" "+b);
        int[][] array = increasingMatrix(a,b,formata);
        int[][] array2 = increasingMatrix(a,b,formatb);
        int[][] array3 = increasingMatrix(ac,bc,formatc);
        System.out.println("Generating a matrix with width "+b+" and height "+a+":");
        printMatrix(array,formata);
        System.out.println("Generating a matrix with width "+b+" and height "+a+":");
        printMatrix(array2,formatb);
        System.out.println("Generating a matrix with width "+bc+" and height "+ac+":");
        printMatrix(array3,formatc);
        System.out.println("Adding two matricies.");
        printMatrix(array,formata);
        System.out.println("Plus");
        printMatrix(array2,formatb);
        if(formata ==true ||formatb==true){
        System.out.println("Translating column major to row major input.");
        }
        System.out.println("output:");
        int[][]z = addMatrix(array,formata,array2,formatb);
        printMatrix(z,false);
        if(array3.length == array.length && array3[0].length == array.length){
            System.out.println("Adding two matricies.");
            printMatrix(array,formata);
            System.out.println("Plus");
            printMatrix(array3,formatc);
            if(formata==true||formatc==true){
                System.out.println("Translting column to row major input.");
            }
            System.out.println("output:");
            int[][]y = addMatrix(array,formata,array3,formatc);
            printMatrix(y,false);
        }
        else{
            System.out.println("Unable to add input matricies.");
        }
    }//End Main Method
    public static int[][] increasingMatrix(int a, int b, boolean format){
        int[][] array = new int[a][b];
            int number = 1;
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    array[i][j]=number;
                    number++;
                }
            }
        return array;
    }//End increasingMatrix Method
    public static void printMatrix(int[][] array, boolean format){
        for(int i=0; i<array.length; i++){
            System.out.print("[");
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println("]");
        }
    }//End printMatrix Method
    public static int[][] translate(int[][] array){
        int[][] a = new int[array.length][array[1].length];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if (j<array.length && i<array[i].length){
                a[i][j]=array[j][i];
                }
                else{
                    continue;
                }
            }
        }
        return a;
    }//End Translate Method
    public static int[][] addMatrix(int[][]a, boolean formata, int [][] b, boolean formatb){
        int[][] c = new int[a.length][a[0].length];
        if (formata == true){
            translate(a);
        }
        if (formatb == true){
            translate(b);
        }
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
                    c[i][j]=a[i][j]*b[i][j];
                }//End Internal For Loop
            }//End For Loop
        if (a.length!=b.length || a[0].length!=b[0].length){
            return null;
        }
        else{
            return c;
        }
    }//End addMatrix Method
}//End Class
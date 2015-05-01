import java.util.Random;
public class Raggedsort{
    public static void main (String [] args){
        Random r = new Random();
        int[][] array = new int[5][];
        for (int i=0;i<5;i++){
            array[i] = new int [i*3+5];
            for (int j=0;j<(i*3+5);j++){
                array[i][j] = r.nextInt(40);
            }
        }
        for (int i=0;i<5;i++){
            System.out.print("row "+(i+1)+": ");
            for(int j=0;j<((i*3)+5);j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Sort the Jagged Array");
        int temp;
        boolean test = true;
        while (test){
        test = false;
        for (int i=0;i<5;i++){
            for(int j=0;j<array[i].length-1;j++){
                if (array[i][j]>array[i][j+1]){
                    temp = array[i][j];
                    array[i][j] = array[i][j+1];
                    array[i][j+1] = temp;
                    test = true;
                }    
            }
        }
        }
        for (int i=0;i<5;i++){
            System.out.print("row "+(i+1)+": ");
            for(int j=0;j<((i*3)+5);j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
        int length = 0;
        for(int i=0;i<array.length;i++){
            if(array[i].length>length){
                length = array[i].length;
            }
        }
        System.out.println("Copy Array");
        int[][] array2 = new int [5][(4*3)+5];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<17;j++){
                if(j<array[i].length){
                    array2[i][j]=array[i][j];
                }
                else{
                array2[i][j]=0;
                }
            }
        }
        for (int i=0;i<5;i++){
            System.out.print("row "+(i+1)+": ");
            for(int j=0;j<(17);j++){
                System.out.print(array2[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
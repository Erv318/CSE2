//Evan Vomund
// Displays cube root

import java.util.Scanner;
public class Root{
    public static void main(String[] args) {
 //input for number  
    Scanner myScanner;
        myScanner = new Scanner( System.in );
        System.out.print("enter the number to find its cube root: ");
        double number=myScanner.nextDouble();
        
        //estimate the root
        double guess1=number/3;
        double cubeRoot1=(guess1*guess1*guess1+number)/(3*guess1*guess1);//estimates root
        double value1=cubeRoot1*cubeRoot1*cubeRoot1;//find origional number to test acuracy
        //run again for more acurate estimation
        double guess2=value1/3;
        double cubeRoot2=(guess2*guess2*guess2+value1)/(3*guess2*guess2);//estimates root
        double value2=cubeRoot2*cubeRoot2*cubeRoot2;//find origional number to test acuracy
        //run again for more acurate estimation
        double guess3=value2/3;
        double cubeRoot3=(guess3*guess3*guess3+value2)/(3*guess3*guess3);//estimates root
        double value3=cubeRoot3*cubeRoot3*cubeRoot3;//find origional number to test acuracy
        //run again for more acurate estimation
        double guess4=value3/3;
        double cubeRoot4=(guess4*guess4*guess4+value3)/(3*guess4*guess4);//estimates root
        double value4=cubeRoot4*cubeRoot4*cubeRoot4;//find origional number to test acuracy
        //run again for more acurate estimation
        double guess5=value4/3;
        double cubeRoot5=(guess5*guess5*guess5+value4)/(3*guess5*guess5);//estimates root
        double value5=cubeRoot5*cubeRoot5*cubeRoot5;//find origional number to test acuracy
        
        //print results
        System.out.print("the cube root is: "+cubeRoot5);
        System.out.print(" and "+cubeRoot5+"x"+cubeRoot5+"x"+cubeRoot5+"="+value5);
        
    }
}
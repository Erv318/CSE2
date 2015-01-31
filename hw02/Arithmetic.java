 //define a class
 public class Arithmetic{
 
 //add main method
 public static void main(String[] args) {
 
 //Number of pairs of socks
int nSocks=3;

//Cost per pair of socks
//(‘$’ is part of the variable name)
double sockCost$=2.58;

//Number of drinking glasses
int nGlasses=6;
//Cost per glass
double glassCost$=2.29;

//Number of boxes of envelopes
int nEnvelopes=1;
//cost per box of envelopes
double envelopeCost$=3.25;
double taxPercent=0.06;

//cost and tax of individual items
double sockTotal=(nSocks*sockCost$);
double sockTax=(int)(sockTotal*taxPercent*100);// get rid of extra decimals
double sockTaxDecimal=(sockTax/100); //convert to decimal form

double glassTotal=(nGlasses*glassCost$);
double glassTax=(int)(glassTotal*taxPercent*100);//get rid of extra decimals
double glassTaxDecimal=(glassTax/100); //convert to decimal form

double envelopeTotal=(nEnvelopes*envelopeCost$);
double envelopeTax=(int)(envelopeTotal*taxPercent*100);//get rid of extra decimals
double envelopeTaxDecimal=(envelopeTax/100); //convert to decimal form

//cost and tax of total order
double orderTotal=(sockTotal+glassTotal+envelopeTotal);
double orderTax=(sockTaxDecimal+glassTaxDecimal+envelopeTaxDecimal);
double orderTotalTaxed=(orderTotal+orderTax);

//socks
System.out.println("cost of socks: $"+sockTotal);
System.out.println("tax on socks: $"+sockTaxDecimal);

//glasses
System.out.println("cost of glasses: $"+glassTotal);
System.out.println("tax on glasses: $"+glassTaxDecimal);

//envelopes
System.out.println("cost of envelopes: $"+envelopeTotal);
System.out.println("tax on envelopes: $"+envelopeTaxDecimal);

//total order
System.out.println("cost of all the items: $"+orderTotal);
System.out.println("After tax: $"+orderTotalTaxed);





}
}
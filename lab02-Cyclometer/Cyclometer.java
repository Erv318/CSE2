//Evan Vomund
//Jan 30, 2015
//CSE 2, fri 3:00 lab
//output will display the time of a ride, number of counts for the ride, the
//distance of the ride, and the distance of two rides combined
public class Cyclometer {
    public static void main(String[] args) {
       
        int secsTrip1=480;  // Time of trip one
        int secsTrip2=3220;  // Time of trip two
        int countsTrip1=1561;  // Counts recorded in trip one
        int countsTrip2=9037; // Counts recorded in trip two
        
      double wheelDiameter=27.0,  // Define wheel diameter
      PI=3.14159, // define pi
      feetPerMile=5280,  // Conversion for feet to miles
      inchesPerFoot=12,   // conversion for inches and feet
      secondsPerMinute=60;  // conversion for seconds and minutes
         double distanceTrip1, distanceTrip2,totalDistance;  // 
                 System.out.println("Trip 1 took "+
                (secsTrip1/secondsPerMinute)+" minutes and had "+
                 countsTrip1+" countsTrip1.");
           System.out.println("Trip 2 took "+
                (secsTrip2/secondsPerMinute)+" minutes and had "+
                 countsTrip2+" countsTrip2.");
                 
     distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
    distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;

           System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
    }  //end of main method   
} //end of class
import java.util.Scanner;

public class AirTrip {
    String destination;
    int flightNumber;
    String flightTime;
    String flightStatus;
    String delayTime;

    public AirTrip(String destination, int flightNumber, String flightTime) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.flightTime = flightTime;
        this.flightStatus="OnTime";
    }
     

    public void flightStatus (){
        switch (flightStatus){
            case "Flew":
            System.out.println("The Flight Has Taken Off");
            break;
            case "Delayed":
            System.out.println("The Flight Is Delayed and Delay Time is "+ this.delayTime);
            break;
            case "TakingPassengers":
            System.out.println("The Plane Is Taking Passengers");
            break;
            case "OnTime":
            default:
            System.out.println("The Flight Was On Time");
        }

    }
            public void updateFlight(String newStatus){
                 if (newStatus.equals("Delayed")){
                     Scanner reader=new Scanner(System.in);
                     System.out.println("Please Enter Delay Time in hh:mm format");
                     this.delayTime = reader.nextLine();
                     System.out.println("Flight status changed from " + this.flightStatus+ " to " + newStatus+ " .");
                     this.flightStatus=newStatus;
                 }else if (newStatus.equals("Flew")||newStatus.equals("TakingPassengers")||newStatus.equals("OnTime")) {
                     System.out.println("Flight status changed from " + this.flightStatus+ " to " + newStatus+ " .");
                     this.flightStatus=newStatus;
                 }else {
                     System.out.println("Please Enter Correct Status");
                 }

            }
}

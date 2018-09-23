/**
 @author Noah Clements
*/
class ParkingMetreDriver {
	public static void main(String[] args) {

ParkingMetre downtownFred = new ParkingMetre("Queen Street", 0.02);

ParkingMetre SaintJohn = new ParkingMetre("Union Street", 0.03);

downtownFred.setMoney(1.25);
downtownFred.park(50);

System.out.println("You are parked at: " + downtownFred.getMetreLocation());
System.out.println("The parking rate for this location is: $" + downtownFred.getParkingCost() + "/min");
System.out.println("The time left on the metre is: " + downtownFred.timeLeft() + " minutes\n");


SaintJohn.setMoney(0.75);
SaintJohn.park(30);

System.out.println("You are parked at: " + SaintJohn.getMetreLocation());
System.out.println("The parking rate for this location is: $" + SaintJohn.getParkingCost() + "/min");
System.out.println("The time left on the metre is: " + SaintJohn.timeLeft() + " minutes");




	}
}

/**
 This class represents a parking metre.
 @author Noah Clements
*/
public class ParkingMetre {
	/**
	The location of the parking metre (e.g. "Queen Street").
	*/
	
	private String location;
	
	/**
	The cost of parking at the metre (in $/minute).
	*/
	
	private double parkingRate;
	
	/**
	The amount of time on the parking metre (minutes).
	*/
	private double timeOnMetre;
	

	/**
	This method constructs a parking metre in a specified location and parking rate. 
	The parking metre is initially empty.
	@param locationIn The location of the metre.
	@param parkingRateIn The cost of parking at the metre (in $/minute).
	*/
	
	public ParkingMetre(String locationIn, double parkingRateIn) {
		location = locationIn;
		parkingRate = parkingRateIn;
		timeOnMetre = 0;

	}
	

	/**
	This method retrieves the location of the parking metre.
	@return The location of the metre.
	*/
	public String getMetreLocation() {
		return location;
	}	
	
	


	/**
	This method retrieves the cost of parking at the metre.
	@return The cost of parking at the metre ($/min).
	*/
	public double getParkingCost() {
		return parkingRate;
	}
	
	
	


	/**
	This method retrieves the amount of time left on the metre.
	@return The amount of time on the metre.
	*/
	public double timeLeft() {
		return timeOnMetre;
	}
	



	/**
	This method parks at a metre for a certain period of time, 
	reducing the amount of time left on the metre. 
	You may assume that the time parked at a metre will not be for longer
	then what is paid for in the metre.
	you do NOT need to include a check for this in your solution).
	@param time The time parked at the metre (in minutes).
	*/
	public void setTime(double time) {
		timeOnMetre = timeOnMetre - time;	
	}
	

	/**
	This method adds money to the metre.
	@param moneyAdded Amount of money added to the metre.
	*/
	public void addMoney(double moneyAdded) {
		timeOnMetre = timeOnMetre + (moneyAdded / parkingRate);
	}

} //end ParkingMetre

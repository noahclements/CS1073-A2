/**
 This class represents a Tab for people at restaurants.
 @author Noah Clements
*/


public class Tab {
	/**
	The name of the person
	*/
	String name;
	/**
	The seat number of the person
	*/
	int seatNum;
	/**
	The total cost of the person's tab
	*/
	double totalTab;
	/**
	This method constructs a tab for people that come into a restaurant
	@param nameIn the person's name
	@param seatNumIn the seat number in which the person is sitting at
	@param totalTabIn the total price for the person's tab
	*/

	public Tab(String nameIn, int seatNumIn, double totalTabIn) {
		name = nameIn;
		seatNum = seatNumIn;
		totalTab = totalTabIn;
	}

	/**
	This method retrieves the name of the person
	@return the person's name.
	*/
	public String getName() {
		return name;
	}
	/**
	This method retrieves the seat number of the person
	@return The person's seat number
	*/
	public int getSeatNum() {
		return seatNum;
	}

	/**
	This method retrieves the total price of the person's tab
	@return The person's total price of his/her tab
	*/
	public double getTotalTab() {
		return totalTab;
	}

	/**
	This method adds the cost of a new item to the persons tab
	@return the total price of the person's tab + the price of the item
	@param price the cost of the item
	*/
	public double addToTab(double price) {
		return totalTab = totalTab + price;
	}
	
	/**
	This method retrieves the tip for the bill with their preferred percentage
	@return The cost of the tip
	@param percentage the tip percentage
	*/
	public double getTip(double percentage) {
		return totalTab * percentage;
	}

}

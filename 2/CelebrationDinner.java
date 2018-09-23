/**
 This class represents the Knuth Celebration Dinner 
 @author Noah Clements
*/

public class CelebrationDinner {
	public static void main(String[] args) {

		Tab mikesTab = new Tab("Mike Smith", 3, 0.00);
		mikesTab.addToTab(2.50);

		Tab sarahsTab = new Tab("Sarah Jones", 1, 0.00);
		sarahsTab.addToTab(2.85);

		Tab johnsTab = new Tab("John Phillips", 2, 0.00);
		johnsTab.addToTab(5.50);

		Tab jillsTab = new Tab("Jill Blair", 7, 0.00);
		jillsTab.addToTab(2.75);
		jillsTab.addToTab(7.50);

		sarahsTab.addToTab(12.75);
		johnsTab.addToTab(15.50);
		mikesTab.addToTab(8.75);
		mikesTab.addToTab(13.45);
		jillsTab.addToTab(4.75);

		System.out.println(mikesTab.getName());
		System.out.println("Seat Number: " + mikesTab.getSeatNum());
		System.out.println("Total amount owed: $" + mikesTab.getTotalTab() + "\n");

		System.out.println(sarahsTab.getName());
		System.out.println("Seat Number: " + sarahsTab.getSeatNum());
		System.out.println("Total amount owed: $" + sarahsTab.getTotalTab() + "\n");

		System.out.println(johnsTab.getName());
		System.out.println("Seat Number: " + johnsTab.getSeatNum());
		System.out.println("Total amount owed: $" + johnsTab.getTotalTab() + "\n");

		System.out.println(jillsTab.getName());
		System.out.println("Seat Number: " + jillsTab.getSeatNum());
		System.out.println("Total amount owed: $" + jillsTab.getTotalTab() + "\n");		

		System.out.println("Mike's tip: $" + mikesTab.getTip(0.20));
		System.out.println("Sarah's tip: $" + sarahsTab.getTip(0.14));
		System.out.println("John's tip: $" + johnsTab.getTip(0.16));
		System.out.println("Jill's tip: $" + jillsTab.getTip(0.14));

	}
}


package RestaurantService;

import java.util.ArrayList;
import java.util.Iterator;

public class DessertMenu implements FoodMenus{
	ArrayList<FoodSelection> food;
	
	public DessertMenu() {
		food = new ArrayList<FoodSelection>(); 
		addItem("Pie", "Pumpkin Spice Pie", 5.99);
		addItem("Cake", "Red Velvet Cake", 4.99);
	}
	
	public void addItem(String name, String description, double price) {
		FoodSelection item = new FoodSelection(name, description, price);
		food.add(item);
	}

	public ArrayList<FoodSelection> getMenuItems() {
		return food;
	}

	public Iterator<FoodSelection> createIterator() {
		return food.iterator();
	}
	
}
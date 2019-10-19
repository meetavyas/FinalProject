
package RestaurantService;

import java.util.Iterator;

public class MealMenu implements FoodMenus{
	
	static final int MAX_SELECTION = 2;
	int num = 0;
	FoodSelection[] food;
	
	public MealMenu() {
		food = new FoodSelection[MAX_SELECTION];
		
		addItem("Burger", "Cheese Burger with Beef Patty", 3.99);
		addItem("Fries", "Steak Fries", 1.99);
	}
	
	public void addItem(String name, String description, 
             double price) 
	{
		FoodSelection selection = new FoodSelection(name, description, price);
		if (num >= MAX_SELECTION) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			food[num] = selection;
			num = num + 1;
		}
	}
	
	public FoodSelection[] getMealSelection() {
		System.out.println("Meal");
		return food;
	}

	public Iterator<FoodSelection> createIterator() {
		return new FoodSelectionIterator(food);
	}

}

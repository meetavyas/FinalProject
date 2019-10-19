package RestaurantService;

import java.util.ArrayList;

public class PlaceOrder {
	
	public PlaceOrder() {
	}

	public void on() {
		System.out.println("Ready to take order");
		System.out.println("Our Menu today includes following items...");
		System.out.println("");
		MealMenu meals = new MealMenu();
		DessertMenu dessert = new DessertMenu();
		ArrayList<FoodMenus> menus = new ArrayList<FoodMenus>();
		menus.add(meals);
		menus.add(dessert);
		FoodMenuService menu = new FoodMenuService(menus);
		menu.printMenu();
		System.out.println("");
	}

}

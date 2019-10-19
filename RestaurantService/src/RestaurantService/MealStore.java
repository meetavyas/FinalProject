package RestaurantService;

public class MealStore {

public Kitchen prepareMeals(String type) {
	Kitchen item = null;

	if (type.equals("Pie")) {
		item = new Pie();
	} else if (type.equals("Cake")) {
		item = new Cake();
	} else if (type.equals("Burger")) {
		item = new Burger();
	} else if (type.equals("Fries")) {
		item = new Fries();
	} 
	return item;
}
}

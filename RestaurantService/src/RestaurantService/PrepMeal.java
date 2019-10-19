package RestaurantService;

public class PrepMeal {
	
	public PrepMeal() {
	}

	public void on() {
		System.out.println("Ready to prep meal");
		MealStore factory = new MealStore();
		KitchenCenter store = new KitchenCenter(factory);
		store.order("Burger");	
		System.out.println("");
		store.order("Fries");
		System.out.println("");
		store.order("Pie");	
		System.out.println("");
		store.order("Cake");
		System.out.println("");
	}
	
}

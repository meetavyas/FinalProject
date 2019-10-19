package RestaurantService;

public class PrepMealOn implements RestaurantInterface {
	
	PrepMeal prepMeal;
	  
	public PrepMealOn(PrepMeal meal) {
		this.prepMeal = meal;
	}
 
	public void execute() {
		prepMeal.on();
	}

}

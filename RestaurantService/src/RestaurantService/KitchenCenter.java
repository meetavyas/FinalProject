package RestaurantService;

public class KitchenCenter {
MealStore factory;

public KitchenCenter(MealStore factory) {
	this.factory = factory;
}
	
public Kitchen order(String type) {
         Kitchen kitchen;
         kitchen = factory.prepareMeals(type);        
         kitchen.gatherIngredients();
         kitchen.prepping();
         kitchen.pack();         
         return kitchen;
         
}

}

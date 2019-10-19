package RestaurantService;

public class RestaurantOperations {
	
	RestaurantInterface restaurantOperationSteps;
	 
	public RestaurantOperations() {}
 
	public void setCommand(RestaurantInterface steps) {
		restaurantOperationSteps = steps;
	}
 
	public void operationSteps() {
		restaurantOperationSteps.execute();
	} 

}

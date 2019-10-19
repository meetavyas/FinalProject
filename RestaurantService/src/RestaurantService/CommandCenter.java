package RestaurantService;

public class CommandCenter {

	public static void main(String[] args) {
	
		RestaurantOperations operator = new RestaurantOperations();
		StateDelivery stateDelivery = new StateDelivery(5);
		
		PlaceOrder order = new PlaceOrder();
		PlaceOrderOn orderOn = new PlaceOrderOn(order);
	
		PrepMeal prepMeal = new PrepMeal();
		PrepMealOn prepOn = new PrepMealOn(prepMeal);
		
	
		System.out.println("Restaurant is open for business!!");
		operator.setCommand(orderOn);
		operator.operationSteps();
		stateDelivery.foodOrdered();
		operator.setCommand(prepOn);
		operator.operationSteps();
		stateDelivery = new StateDelivery(0);
		stateDelivery.deliverFood();
	}

}



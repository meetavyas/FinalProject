package RestaurantService;

public class DeliverFoodState implements State {

StateDelivery stateDelivery;
	
	public DeliverFoodState(StateDelivery stateDelivery) {
		this.stateDelivery = stateDelivery;
	}


	public void foodOrdered() {
	}
	
	
	public void deliverFood() {		
		System.out.println("Food on it's way to be delivered");
		stateDelivery.setState(stateDelivery.getDeliverFoodState());
	}

}

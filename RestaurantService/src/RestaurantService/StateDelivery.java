
package RestaurantService;

public class StateDelivery {
	
	State foodOrdered;
	State deliverFood;
	
	State state;
	int count = 0;
	
	public StateDelivery(int num) {
		foodOrdered = new FoodOrderedState(this);
		deliverFood = new DeliverFoodState(this);
		
		this.count = num;
		if (num > 0) {
			state = foodOrdered;
		} else {
			state = deliverFood;
		}
	}
	
	public void foodOrdered() {
		state.foodOrdered();
	}
	
	
	public void deliverFood() {
		state.deliverFood();
	}
	

	void setState(State state) {
		this.state = state;
	}

	 public State getFoodOrderedState() {
	        return foodOrdered;
	    }

    public State getDeliverFoodState() {
        return deliverFood;
    }

}


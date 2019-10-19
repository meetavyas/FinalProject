package RestaurantService;

public class PlaceOrderOn implements RestaurantInterface {

	PlaceOrder placeOrder;
	  
	public PlaceOrderOn(PlaceOrder order) {
		this.placeOrder = order;
	}
 
	public void execute() {
		placeOrder.on();
	}

}

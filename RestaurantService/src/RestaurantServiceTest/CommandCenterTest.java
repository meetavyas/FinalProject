package RestaurantServiceTest;


import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import RestaurantService.FoodOrderedState;
import RestaurantService.State;
import RestaurantService.StateDelivery;

public class CommandCenterTest {
	
	StateDelivery stateDelivery = new StateDelivery(5);
	State foodOrdered = new FoodOrderedState(stateDelivery);
	
	

		
		@Test
		public void testMain() {
			assertNotNull(foodOrdered);
		}
		
} 



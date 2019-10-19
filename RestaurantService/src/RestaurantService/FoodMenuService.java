
package RestaurantService;

import java.util.ArrayList;
import java.util.Iterator;

public class FoodMenuService {
	ArrayList<FoodMenus> selection;
    
	  
	public FoodMenuService(ArrayList<FoodMenus> selection) {
		this.selection = selection;
	}
   
	void printMenu(Iterator<?> iterator) {
		while (iterator.hasNext()) {
			FoodSelection foodItems = (FoodSelection)iterator.next();
			System.out.print(foodItems.getName() + ", ");
			System.out.print(foodItems.getPrice() + " -- ");
			System.out.println(foodItems.getDescription());
		}
	}
	
	public void printMenu() {
		Iterator<?> selectionIterator = selection.iterator();
		while(selectionIterator.hasNext()) {
			FoodMenus menu = (FoodMenus)selectionIterator.next();
			printMenu(menu.createIterator());
		}
	} 
	
}


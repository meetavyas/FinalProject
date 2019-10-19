
package RestaurantService;

import java.util.Iterator;

public class FoodSelectionIterator implements Iterator<FoodSelection>{

	FoodSelection[] list;
	int pos = 0;
	
	public FoodSelectionIterator(FoodSelection[] list) {
		this.list = list;
	}
	
	public boolean hasNext() {
		if (pos >= list.length || list[pos] == null) {
			return false;
		} else {
			return true;
		}
	}

	public FoodSelection next() {
		FoodSelection selection = list[pos];
		pos = pos + 1;
		return selection;
	}

}
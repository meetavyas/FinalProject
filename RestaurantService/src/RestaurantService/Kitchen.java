package RestaurantService;

abstract public class Kitchen {
	String name;

	public String getName() {
		return name;
	}

	public void gatherIngredients() {
		System.out.println("Gathering Ingredients for " + name);
	}

	public void prepping() {
		System.out.println("Prepping " + name);
	}


	public void pack() {
		System.out.println("Packing " + name);
	}
}


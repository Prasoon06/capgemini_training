import constants.PizzaCrust;
import constants.PizzaName;
import constants.PizzaSize;
import constants.Topping;

public class PizzaAppApplicationStartup {
	static String pizzaName;
	static String size;
	static String crust;
	static double price;
	static String toppings;


	public static void main(String[] args) {	
		
		//order pizza
		String tokenNo = orderPizza(PizzaName.VEG_EXTRAVAGANZA,PizzaCrust.NEW_HAND_TOSSED,PizzaSize.REGULAR_PIZZA_SIZE);
		//cook pizza
		cookPizza(tokenNo);
		//display pizza		
		displayPizzaDetail();
	}


	private static void cookPizza(String tokenNo) {
		System.out.println("Wait for 30 mins.");
		try {
			if(tokenNo.equalsIgnoreCase(PizzaName.VEG_EXTRAVAGANZA+"001") 
					& PizzaAppApplicationStartup.crust.equalsIgnoreCase(PizzaCrust.NEW_HAND_TOSSED) 
					& PizzaAppApplicationStartup.size.equalsIgnoreCase(PizzaSize.REGULAR_PIZZA_SIZE)) {
				PizzaAppApplicationStartup.toppings = Topping.VEG_EXTRAVAGANZA_TOPPING;
				PizzaAppApplicationStartup.price =  450;
			}
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}


	private static String orderPizza(String pizzaName, String crust, String size) {
		
		
		PizzaAppApplicationStartup.pizzaName=pizzaName;
		PizzaAppApplicationStartup.crust = crust;
		PizzaAppApplicationStartup.size = size;
		String tokkenNo = pizzaName+"001";
		System.out.println("Thanks for the order!");
		return tokkenNo;
	}


	private static void displayPizzaDetail() {
		System.out.println("---------Pizza Detail----------");
		System.out.println("[Name] :"+pizzaName);
		System.out.println("[Size] :"+size);
		System.out.println("[Crust] :"+crust);
		System.out.println("[Price] :"+price);
		System.out.println("[Toppings] :"+toppings);
	}
}

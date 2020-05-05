public class Trio implements MenuItem
{
	private Sandwich sandwich;
	private Salad salad;
	private Drink drink;
	
	public Trio(Sandwich sand, Salad sal, Drink dri)
	{
		sandwich = sand;
		salad = sal;
		drink = dri;
	}
	
	public String getName()
	{
		String menu = "";
		menu = sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + "Trio";
		return menu;
	}
	
	public double getPrice()
	{
		double price = 0;
		double priceSandwich = sandwich.getPrice();
		double priceSalad = salad.getPrice();
		double priceDrink = drink.getPrice();
		
		if ((priceSandwich < priceSalad) && (priceSandwich < priceDrink))
		{
			price = priceSalad + priceDrink;
		}
		if ((priceSalad < priceSandwich) && (priceSalad < priceDrink))
		{
			price = priceSandwich + priceDrink;
		}
		if ((priceDrink < priceSalad) && (priceDrink < priceSandwich))
		{
			price = priceSalad + priceSandwich;
		}
		return price;
	}
}



public interface MenuItem
{
	String getName();
	
	double getPrice();
}
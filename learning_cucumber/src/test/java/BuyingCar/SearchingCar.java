package BuyingCar;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SearchingCar {
	
	@Given("I go to buy car")
	public void buy_car()
	{
		System.out.println("I go to buy car");
	}
	 @And ("car must be of {string}")
	 public void car_brand(String brand)
		{
			System.out.println("car must be of"+brand);
		}
	 @When ("I search for car")
	 public void car_search()
		{
			System.out.println("I search for car");
		}
	 @And ("I select city as Tokyo")
	 public void car_selectCity()
		{
			System.out.println("I select city as Tokyo");
		}
}

package BuyingCar;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;

public class SelectingCar {
	
	@Then("I should get white car in result")
	 public void car_color()
		{
			System.out.println("I should get white car in result");
		}
    @And("car must be atleast {int} year old")
    public void car_old(int age)
	{
		System.out.println("car must be atleast"+age+" year old");
	}
    
    @But("car should not be damaged")
    public void car_quality()
   	{
   		System.out.println("car should not be damaged");
   	}
    

}

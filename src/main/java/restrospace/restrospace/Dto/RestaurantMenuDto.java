package restrospace.restrospace.Dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import restrospace.restrospace.entities.RestaurantMenu;

public class RestaurantMenuDto {

	private double price;
	private String foodStatus;


	public RestaurantMenuDto(RestaurantMenu restaurantMenu) {

		this.price = restaurantMenu.getPrice();
		this.foodStatus = restaurantMenu.getFoodStatus();
	}

	public RestaurantMenuDto() {
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFoodStatus() {
		return foodStatus;
	}

	public void setFoodStatus(String foodStatus) {
		this.foodStatus = foodStatus;
	}
}

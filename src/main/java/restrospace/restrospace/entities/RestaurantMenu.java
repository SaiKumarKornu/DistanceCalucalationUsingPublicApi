package restrospace.restrospace.entities;

import jakarta.persistence.*;
import restrospace.restrospace.Dto.RestaurantMenuDto;

@Entity
@Table(name="Restaurant_menu")
public class RestaurantMenu {
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Snum")
    private int snum;

    @Column(name="Restaurant_id")
    private  int restaurantId;

    @Column(name="Food_name")
    private  String foodname;

    @Column(name="Price")
    private  double price;

    @Column(name = "Status")
    private String foodStatus;


    public RestaurantMenu(RestaurantMenuDto restaurantMenuDto) {
        this.price = restaurantMenuDto.getPrice();
        this.foodStatus = restaurantMenuDto.getFoodStatus();
    }

    public RestaurantMenu() {
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Restaurant_id",insertable = false,updatable = false)
    private Restaurant restaurant;

    public int getSnum() {
        return snum;
    }

    public void setSnum(int snum) {
        this.snum = snum;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
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

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}

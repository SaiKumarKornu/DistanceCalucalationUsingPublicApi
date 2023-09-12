package restrospace.restrospace.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Restaurant_id")
    private int restaurantId;

    @Column(name="Restaurant_name")
    private String restaurantname;

    @Column(name="Address")
    private String restaurantAddress;

    @Column(name="Restaurant_zipcode")
    private String restaurantZipcode;

    public Restaurant() {
    }

    @OneToMany(mappedBy = "restaurant")
    private List<RestaurantMenu> restaurantmenus;

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantname() {
        return restaurantname;
    }

    public void setRestaurantname(String restaurantname) {
        this.restaurantname = restaurantname;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getRestaurantZipcode() {
        return restaurantZipcode;
    }

    public void setRestaurantZipcode(String restaurantZipcode) {
        this.restaurantZipcode = restaurantZipcode;
    }

    public List<RestaurantMenu> getRestaurantmenus() {
        return restaurantmenus;
    }

    public void setRestaurantmenus(List<RestaurantMenu> restaurantmenus) {
        this.restaurantmenus = restaurantmenus;
    }
}
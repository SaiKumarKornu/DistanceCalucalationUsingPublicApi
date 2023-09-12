package restrospace.restrospace.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import restrospace.restrospace.Repository.RestaurantMenuRepository;
import restrospace.restrospace.Repository.RestaurantRepository;
import restrospace.restrospace.Repository.UserRepository;
import restrospace.restrospace.entities.Restaurant;
import restrospace.restrospace.entities.RestaurantMenu;
import restrospace.restrospace.entities.User;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    RestaurantRepository restaurantRepository;
    @Autowired
    UserRepository userRepository;
@Autowired
    RestaurantMenuRepository restaurantMenuRepository;


    public String getdistance(int userid, String restaurantname) {
        User user = userRepository.findByUserid(userid);
        Restaurant restaurant = restaurantRepository.findByrestaurant(restaurantname);
        //List<RestaurantMenu> restaurantMenu=restaurantMenuRepository.findByRestaurantmenus_RestaurantId(restaurant.getRestaurantId());
        String distance=distancal(user.getUserzipcode(), restaurant.getRestaurantZipcode());
        return distance;
    }



    public String distancal(String userZipcode,String restaurantZipcode) {
        String url="https://www.zipcodeapi.com/rest/DemoOnly006augleqUm5qAAAGaxEuUtbzibtd3yKoid0iS5lhciNGp0iLg9ljlOa/distance.json/"+userZipcode+"/"+restaurantZipcode+"/km";
        RestTemplate restTemplate=new RestTemplate();
        String result=restTemplate.getForObject(url,String.class);
        return result;

    }


}

package restrospace.restrospace.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restrospace.restrospace.Dto.RestaurantMenuDto;
import restrospace.restrospace.Repository.RestaurantMenuRepository;
import restrospace.restrospace.entities.RestaurantMenu;

@Service
public class RestaurantMenuService {

    @Autowired
    RestaurantMenuRepository restaurantMenuRepository;


    public RestaurantMenuDto updatebyidanditem(int restaurantId, String foodname, RestaurantMenuDto restaurantMenuDto) {
        RestaurantMenu restaurantMenu=restaurantMenuRepository.findByIdAndItem(restaurantId,foodname);
        restaurantMenu.setFoodStatus(restaurantMenuDto.getFoodStatus());
        restaurantMenu.setPrice(restaurantMenuDto.getPrice());
        restaurantMenuRepository.save(restaurantMenu);
        return restaurantMenuDto;

    }
}

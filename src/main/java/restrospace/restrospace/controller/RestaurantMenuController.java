package restrospace.restrospace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import restrospace.restrospace.Dto.RestaurantMenuDto;
import restrospace.restrospace.Repository.RestaurantMenuRepository;
import restrospace.restrospace.Service.RestaurantMenuService;
import restrospace.restrospace.entities.RestaurantMenu;

@RestController
@RequestMapping("/Restaurant")
public class RestaurantMenuController {

    @Autowired
    RestaurantMenuService restaurantMenuService;

    @Autowired
    RestaurantMenuRepository restaurantMenuRepository;

    @PutMapping("/update")
    @PreAuthorize("hasRole('Role_Admin')")
    public RestaurantMenuDto updatepriceandstatusbyrestaurantid(@RequestParam("restaurantid") int restaurantId,@RequestParam("foodname") String foodname, @RequestBody RestaurantMenuDto restaurantMenuDto ) {
        return restaurantMenuService.updatebyidanditem(restaurantId,foodname,restaurantMenuDto);
    }



}

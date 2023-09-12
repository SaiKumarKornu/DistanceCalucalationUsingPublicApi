package restrospace.restrospace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.client.RestTemplate;
import restrospace.restrospace.Service.RestaurantService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @GetMapping("/hello")
    private String gethello(@RequestParam("id") String zip1, @RequestParam("id1") String zip2){
        String url="https://www.zipcodeapi.com/rest/DemoOnly006augleqUm5qAAAGaxEuUtbzibtd3yKoid0iS5lhciNGp0iLg9ljlOa/distance.json/"+zip1+"/"+zip2+"/km";
        RestTemplate restTemplate=new RestTemplate();
        String result=restTemplate.getForObject(url,String.class);
        return result;
    }

    @GetMapping("/calculate-distance")
    @PreAuthorize("hasRole('Role_User')")
    public String calculateDistance(@RequestParam int userid, @RequestParam String restaurantname) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return restaurantService.getdistance(userid, restaurantname);
    }

}

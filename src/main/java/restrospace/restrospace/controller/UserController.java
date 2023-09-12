package restrospace.restrospace.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import restrospace.restrospace.Repository.UserRepository;
import restrospace.restrospace.Service.UserService;
import restrospace.restrospace.entities.User;

@RestController
@RequestMapping("/Users")
public class UserController {

    @Autowired
    UserService userService;
    
    @Autowired
    UserRepository userRepository;


    @GetMapping("/get")
    public List<User> all(){
        return userRepository.findAll();
    }

}

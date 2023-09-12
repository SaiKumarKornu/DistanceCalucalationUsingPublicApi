package restrospace.restrospace.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import restrospace.restrospace.Repository.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;



}

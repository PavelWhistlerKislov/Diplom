package root.domain.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import root.domain.model.entities.User;
import root.domain.repo.UserRepository;

import java.util.List;

@RestController
@RequestMapping("api/main")
public class MainController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/all-users")
    public List<User> getAllUsers(){
               return userRepository.findAll();
    }

    @GetMapping("/get-user")
    public List<User> getUser( @RequestParam(value="firstName", required=false) String firstName) {
        return userRepository.findByFirstNameStartsWithIgnoreCase(firstName);
    }


}

package root.domain.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
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

    @GetMapping("/get-user/{firstName}")
    public List<User> main(@PathVariable String firstName) {
        return userRepository.findByFirstNameStartsWithIgnoreCase(firstName);
    }


}

package alik.gym_app.controller;


import alik.gym_app.dtos.UserDTO;
import alik.gym_app.model.Users;
import alik.gym_app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public Users register(@RequestBody UserDTO userDTO) {
        return service.register(userDTO);
    }

    @PostMapping("/login")
    public String login(@RequestBody UserDTO userDTO) {
        return service.verify(userDTO);
    }

}

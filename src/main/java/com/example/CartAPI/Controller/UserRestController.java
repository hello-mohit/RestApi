package com.example.CartAPI.Controller;

import com.example.CartAPI.Users.User;
import com.example.CartAPI.Users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserRestController {
    @Autowired
    UserService service;

    @PostMapping("/users")
    public void createUser(@RequestBody User obj){
        service.addUser(obj);
    }
    @GetMapping("/users")
    public String[] users(){
       return service.getUsersIds();
    }
    @DeleteMapping("/users/{userId}")
    public void removeUser(@PathVariable String userId){
        service.deleteUser(userId);
    }

    @PatchMapping("/users/{userId}")
    public void updateUser(@PathVariable String userId,
    @RequestBody User obj){
        service.updateUser(userId,obj);
    }
}

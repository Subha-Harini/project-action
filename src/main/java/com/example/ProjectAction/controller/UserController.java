package com.example.ProjectAction.controller;

import com.example.ProjectAction.model.Users;
import com.example.ProjectAction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/createUser")
    public Users createUser(@RequestBody Users user){
        return userService.createUser(user);
    }

    @GetMapping("/getUsers")
    public List<Users> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/getUser")
    public Optional<Users> getUser(@RequestParam int userID){
        return userService.getUser(userID);
    }

    @PutMapping("/updateUser")
    public Users updateUser(@RequestBody Users user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/deleteUser")
    public void deleteUser(@RequestParam int userID){
        userService.deleteUser(userID);
    }


}

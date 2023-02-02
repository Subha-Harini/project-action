package com.example.ProjectAction.service;

import com.example.ProjectAction.model.Users;
import com.example.ProjectAction.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Users createUser(Users user){

        return userRepository.save(user);
    }

    public List<Users> getUsers() {
        return userRepository.findAll();
    }

    public Optional<Users> getUser(int userID) {
        return userRepository.findById(userID);
    }

    public Users updateUser(Users user){
        Users existingUser = userRepository.findById(user.getUserID()).orElse(null);
        existingUser.setEmailID(user.getEmailID());
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        return userRepository.save(user);
    }

    public String deleteUser(int userID){
        Users existingUser = userRepository.findById(userID).orElse(null);
        userRepository.delete(existingUser);
        return userID +" deleted";
    }

}

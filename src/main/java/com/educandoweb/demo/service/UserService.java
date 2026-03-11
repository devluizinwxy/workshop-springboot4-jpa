package com.educandoweb.demo.service;

import com.educandoweb.demo.entities.User;
import com.educandoweb.demo.repositories.UserRepository;
import com.educandoweb.demo.service.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
       return userRepository.findAll();
    }

    public User findById(Long id){
        Optional<User> optionalUser = userRepository.findById(id);
         return optionalUser.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert (User user){
        return userRepository.save(user);
    }
    public void delete(Long id){
        try {
            userRepository.deleteById(id);
        }
        catch (EmptyResultDataAccessException e) {
            throw new RuntimeException("User not found");
        }

    }
    public User update(Long id, User obj ){
        User user = userRepository.getReferenceById(id);
        updateData(user,obj);
        return userRepository.save(user);
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());

    }


}

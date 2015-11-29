package com.rbs.sfi.admin.services;

import com.rbs.sfi.admin.entities.User;
import com.rbs.sfi.admin.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void save(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    public void verificationToken(User user){
        User entity = userRepository.findByID(user.getId());
        if(entity!=null){
            entity.setToken(true);
            userRepository.update(entity);
        }
    }

    public User findByID(int id) {
        return userRepository.findByID(id);
    }

    public List<User> list() {
        return userRepository.list();
    }

    public void delete(int id) {
       userRepository.delete(id);
    }

    public User findByUsername(String username) {
        User user = userRepository.findByUsername(username);
        return user;
    }

    public User findByEmail(String email) {
        User user = userRepository.findByEmail(email);
        return user;
    }

    public User findByUsernameOrEmail(String string) {
        User user = userRepository.findByUsername(string);
        User email = userRepository.findByEmail(string);

        if(user==null){
            return email;
        } else {
            return user;
        }
    }

    public void updateUser(User user) {
        User entity = userRepository.findByID(user.getId());
        if(entity!=null){
            entity.setGroup(user.getGroup());
            entity.setFirstName(user.getFirstName());
            entity.setLastName(user.getLastName());
            entity.setCompany(user.getCompany());
            userRepository.update(entity);
        }
    }

    public void updateName(User user) {
        User entity = userRepository.findByID(user.getId());
        if(entity!=null){
            entity.setFirstName(user.getFirstName());
            entity.setLastName(user.getLastName());
            userRepository.update(entity);
        }
    }

    public void updateEmail(User user) {
        User entity = userRepository.findByID(user.getId());
        if(entity!=null){
            entity.setEmail(user.getEmail());
            entity.setUsername(user.getEmail());
            userRepository.update(entity);
        }
    }

    public void updatePassword(User user) {
        User entity = userRepository.findByID(user.getId());
        if(entity!=null){
            entity.setPassword(passwordEncoder.encode(user.getPassword()));
        }
    }

    public void userActive(User user) {
        User entity = userRepository.findByID(user.getId());
        if(entity!=null){
            if(entity.isEnabled()){entity.setEnabled(false);}
            else{entity.setEnabled(true);}
        }
    }

    public boolean isUserUsernameUnique(Integer id, String username) {
        User user = findByUsername(username);
        return ( user == null || ((id != null) && (user.getId() == id)));
    }

    public boolean isUserEmailUnique(Integer id, String email) {
        User user = findByEmail(email);
        return ( user == null || ((id != null) && (user.getId() == id)));
    }

    public User findUserIdByToken(String token){
        return userRepository.findUserIdByToken(token);
    }

    public void passwordResetTokenUpdate(User user){
        User entity = userRepository.findByID(user.getId());
        if(entity!=null){
            entity.setUserToken(user.getUserToken());
            userRepository.save(entity);
        }
    }
}

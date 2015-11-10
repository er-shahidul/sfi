package com.rbs.sfi.admin.services;

import com.rbs.sfi.admin.entities.User;

import java.util.List;

public interface UserService
{
    void save(User user);
    void verificationToken(User user);
    User findByID(int id);
    List<User> list();
    void delete(int id);
    User findByUsername(String username);
    User findByEmail(String email);
    User findByUsernameOrEmail(String string);
    void updateUser(User user);
    void updatePassword(User user);
    void userActive(User user);
    boolean isUserUsernameUnique(Integer id, String username);
    boolean isUserEmailUnique(Integer id, String email);

    void passwordResetTokenUpdate(User passwordResetToken);
    User findUserIdByToken(String token);
}
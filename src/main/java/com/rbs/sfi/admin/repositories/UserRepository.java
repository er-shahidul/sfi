package com.rbs.sfi.admin.repositories;

import com.rbs.sfi.admin.entities.User;

import java.util.List;

public interface UserRepository
{
    void save(User user);
    void update(User user);
    List<User> list();
    void delete(int id);
    User findByUsername(String username);
    User findByEmail(String username);
    User findByID(int id);

    User findUserIdByToken(String token);
}


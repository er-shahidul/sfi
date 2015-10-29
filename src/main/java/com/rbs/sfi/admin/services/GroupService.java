package com.rbs.sfi.admin.services;

import com.rbs.sfi.admin.entities.Group;

import java.util.List;

public interface GroupService
{
    List<Group> list();
    int delete(int id);
    void update(Group group);

    List<Group> findAll();
    Group findByType(String type);
    Group findById(int id);
    Group findByRole(String role);
    boolean isRoleUnique(Integer id, String role);
    void save(Group group);
}

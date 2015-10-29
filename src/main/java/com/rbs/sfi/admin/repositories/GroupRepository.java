package com.rbs.sfi.admin.repositories;

import com.rbs.sfi.admin.entities.Group;

import java.util.List;

public interface GroupRepository
{
    List<Group> list();
    int delete(int id);

    List<Group> findAll();
    Group findByType(String type);
    Group findById(int id);
    Group findByRole(String role);
    void save(Group group);
}

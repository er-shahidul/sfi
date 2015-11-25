package com.rbs.sfi.admin.services;

import com.rbs.sfi.admin.entities.Group;
import com.rbs.sfi.admin.repositories.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("groupService")
@Transactional
public class GroupService
{
    @Autowired
    GroupRepository groupRepository;

    public List<Group> list() {
        return groupRepository.list();
    }

    public int delete(int id) {
        return groupRepository.delete(id);
    }

    public void update(Group group) {
        Group entity = groupRepository.findById(group.getId());
        if(entity!=null){
            entity.setRole(group.getRole());
            groupRepository.save(entity);
        }
    }

    public List<Group> findAll() {
        return groupRepository.findAll();
    }

    public Group findByType(String type){
        return groupRepository.findByType(type);
    }

    public Group findByRole(String role){
        return groupRepository.findByRole(role);
    }

    public void save(Group group){
        groupRepository.save(group);
    }

    public Group findById(int id) {
        return groupRepository.findById(id);
    }

    public boolean isRoleUnique(Integer id, String role) {
        Group group = findByRole(role);
        return ( group == null || ((id != null) && (group.getId() == id)));
    }
}

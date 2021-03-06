package com.rbs.www.admin.services;

import com.rbs.www.admin.models.entities.Group;
import com.rbs.www.admin.repositories.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GroupService
{
    @Autowired
    GroupRepository groupRepository;

    public List<Group> list() {
        return groupRepository.list();
    }

    public Integer delete(Integer id) {
        return groupRepository.delete(id);
    }

    public void update(Group group) {
        Group entity = groupRepository.getByKey(group.getId());
        if(entity!=null){
            entity.setRole(group.getRole());
            groupRepository.persist(entity);
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
        groupRepository.persist(group);
    }

    public Group findById(Integer id) {
        return groupRepository.getByKey(id);
    }

    public boolean isRoleUnique(Integer id, String role) {
        Group group = findByRole(role);
        return ( group == null || ((id != null) && (group.getId() == id)));
    }
}

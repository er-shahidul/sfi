package com.rbs.www.admin.services;

import com.rbs.www.admin.models.entities.Company;
import com.rbs.www.admin.models.entities.Group;
import com.rbs.www.admin.models.entities.User;
import com.rbs.www.admin.models.viewmodels.UserViewModel;
import com.rbs.www.admin.repositories.UserRepository;
import com.rbs.www.common.util.SimpleValidationUtil;
import com.rbs.www.common.util.Util;
import com.rbs.www.common.modules.mapper.EntityModelMapperService;
import com.rbs.www.common.modules.mapper.ViewModelMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private ViewModelMapperService viewModelMapperService;

    @Autowired
    private EntityModelMapperService entityModelMapperService;

    public void save(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setIsActive(true);
        userRepository.save(user);
    }

    public void verificationToken(User user){
        User entity = userRepository.getByKey(user.getId());
        if(entity!=null){
            entity.setToken(true);
            userRepository.update(entity);
        }
    }

    public User findByCompany(Company company){
        User user = userRepository.findByCompany(company);

        return user;
    }

    public User findByID(Integer id) {
        return userRepository.getByKey(id);
    }

    public List<User> list() {
        return userRepository.list();
    }

    public void delete(Integer id) {
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
        User entity = userRepository.getByKey(user.getId());
        if(entity!=null){
            updateField(user, entity);
        }
    }

    public void updateUserWithPassword(User user, String password) {
        User entity = userRepository.getByKey(user.getId());
        if(entity!=null){
            entity.setPassword(passwordEncoder.encode(password));
            updateField(user, entity);
        }
    }

    private void updateField(User user, User entity) {
        entity.setGroup(user.getGroup());
        entity.setFirstName(user.getFirstName());
        entity.setLastName(user.getLastName());
        entity.setCompany(user.getCompany());
        entity.setUpdatedAt(Util.getCurrentDate());
        entity.setUpdatedBy(Util.getCurrentUsername());
        entity.setEnabled(user.getEnabled());
        entity.setInvitationMsg(user.getInvitationMsg());
        userRepository.update(entity);
    }

//    public void softDelete(User user) {
//        User entity = userRepository.findByID(user.getId());
//        if(entity!=null){
//            entity.setIsActive(false);
//            userRepository.update(entity);
//        }
//    }

    public void updateName(User user) {
        User entity = userRepository.getByKey(user.getId());
        if(entity!=null){
            entity.setFirstName(user.getFirstName());
            entity.setLastName(user.getLastName());
            userRepository.update(entity);
        }
    }

    public void updateEmail(User user) {
        User entity = userRepository.getByKey(user.getId());
        if(entity!=null){
            entity.setEmail(user.getEmail());
            entity.setUsername(user.getEmail());
            userRepository.update(entity);
        }
    }

    public void updatePassword(User user) {
        User entity = userRepository.getByKey(user.getId());
        if(entity!=null){
            entity.setPassword(passwordEncoder.encode(user.getPassword()));
        }
    }

    public void userActive(User user) {
        User entity = userRepository.getByKey(user.getId());
        if(entity!=null){
            if(entity.getEnabled()){entity.setEnabled(false);}
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
        User entity = userRepository.getByKey(user.getId());
        if(entity!=null){
            entity.setUserToken(user.getUserToken());
            userRepository.save(entity);
        }
    }

    public Integer getGroupId(User user) {
        Set<Group> userGroups = user.getGroup();

        for (Group userGroup : userGroups)
            return userGroup.getId();

        return null;
    }

    public Boolean isValidFirstName(String firstName) {
        return !SimpleValidationUtil.isEmptyString(firstName);
    }

    public Boolean isValidEmail(String email) {
        if (SimpleValidationUtil.isEmptyString(email)) return false;
        if (!SimpleValidationUtil.isValidEmail(email)) return false;
        if (userRepository.findByEmail(email) != null) return false;
        return true;
    }

    public Boolean isValidEmailUpdate(String email) {
        if (SimpleValidationUtil.isEmptyString(email)) return false;
        if (!SimpleValidationUtil.isValidEmail(email)) return false;
        return true;
    }

    public boolean isValidPassword(String password) {
        return SimpleValidationUtil.isValidPassword(password);
    }


    public UserViewModel getViewModelById(Integer id) {
        User entity = userRepository.getByKey(id);
        return viewModelMapperService.convert(entity, UserViewModel.class);
    }

    public void setAreaUnitEntity(UserViewModel model) {
        model.setIsActive(true);
        User entity = entityModelMapperService.convert(model, User.class);
    }

    public void deleteUserEntity(UserViewModel model) {
        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();
        model.setIsActive(false);
        model.setEnabled(false);
        model.setEmail(randomUUIDString+"@.com");
        model.setUsername(randomUUIDString+"@.com");
        User entity = entityModelMapperService.convert(model, User.class);
    }
}

package com.rbs.sfi.admin.services;

import com.rbs.sfi.admin.entities.PasswordResetToken;
import com.rbs.sfi.admin.entities.User;
import com.rbs.sfi.admin.repositories.PasswordResetTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("passwordResetTokenTokenService")
@Transactional
public class PasswordResetTokenServiceImpl implements PasswordResetTokenService{

    @Autowired
    private PasswordResetTokenRepository passwordResetTokenRepository;

    public void save(PasswordResetToken passwordResetToken){
        passwordResetTokenRepository.save(passwordResetToken);
    }

    public int findUserIdByToken(String token){
        return passwordResetTokenRepository.findUserIdByToken(token);
    }

    public PasswordResetToken findPasswordTokenById(int id){
        return passwordResetTokenRepository.findPasswordTokenById(id);
    }

    public PasswordResetToken findPasswordResetToken(User user){
        return passwordResetTokenRepository.findPasswordResetToken(user);
    }

    public void passwordResetTokenUpdate(PasswordResetToken passwordResetToken){
        PasswordResetToken entity = passwordResetTokenRepository.findPasswordTokenById(passwordResetToken.getId());
        if(entity!=null){
            entity.setToken(passwordResetToken.getToken());
            passwordResetTokenRepository.save(entity);
        }
    }
}

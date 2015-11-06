package com.rbs.sfi.admin.services;

import com.rbs.sfi.admin.entities.PasswordResetToken;
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
}

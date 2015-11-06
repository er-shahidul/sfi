package com.rbs.sfi.admin.services;

import com.rbs.sfi.admin.entities.VerificationToken;
import com.rbs.sfi.admin.repositories.VerificationTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("verificationTokenService")
@Transactional
public class VerificationTokenServiceImpl implements VerificationTokenService{

    @Autowired
    private VerificationTokenRepository verificationTokenRepository;

    public void save(VerificationToken verificationToken){
        verificationTokenRepository.save(verificationToken);
    }

    public int findUserIdByToken(String token){
        return verificationTokenRepository.findUserIdByToken(token);
    }
}

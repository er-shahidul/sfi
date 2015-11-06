package com.rbs.sfi.admin.services;

import com.rbs.sfi.admin.entities.VerificationToken;

public interface VerificationTokenService
{
    void save(VerificationToken verificationToken);
    int findUserIdByToken(String token);
}
package com.rbs.sfi.admin.repositories;

import com.rbs.sfi.admin.entities.VerificationToken;

public interface VerificationTokenRepository
{
    void save(VerificationToken verificationToken);
    int findUserIdByToken(String token);
}


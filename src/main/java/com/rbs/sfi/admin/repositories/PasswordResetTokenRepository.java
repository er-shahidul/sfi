package com.rbs.sfi.admin.repositories;

import com.rbs.sfi.admin.entities.PasswordResetToken;

public interface PasswordResetTokenRepository
{
    void save(PasswordResetToken passwordResetToken);
    int findUserIdByToken(String token);
}


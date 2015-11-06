package com.rbs.sfi.admin.services;

import com.rbs.sfi.admin.entities.PasswordResetToken;

public interface PasswordResetTokenService
{
    void save(PasswordResetToken passwordResetToken);
    int findUserIdByToken(String token);
}
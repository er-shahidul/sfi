package com.rbs.sfi.admin.services;

import com.rbs.sfi.admin.entities.PasswordResetToken;
import com.rbs.sfi.admin.entities.User;

public interface PasswordResetTokenService
{
    void save(PasswordResetToken passwordResetToken);
    void passwordResetTokenUpdate(PasswordResetToken passwordResetToken);
    int findUserIdByToken(String token);
    PasswordResetToken findPasswordTokenById(int id);
    PasswordResetToken findPasswordResetToken(User user);
}
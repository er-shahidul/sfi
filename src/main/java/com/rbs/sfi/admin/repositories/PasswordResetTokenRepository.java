package com.rbs.sfi.admin.repositories;

import com.rbs.sfi.admin.entities.PasswordResetToken;
import com.rbs.sfi.admin.entities.User;

public interface PasswordResetTokenRepository
{
    void save(PasswordResetToken passwordResetToken);
    int findUserIdByToken(String token);
    PasswordResetToken findPasswordTokenById(int id);
    PasswordResetToken findPasswordResetToken(User user);
}


package com.rbs.sfi.admin.services;

import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class ValidationService {
    private final String emailPattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public Boolean isEmptyString(String s) {
        return s == null || s.isEmpty();
    }

    public Boolean isValidEmail(String email) {
        Pattern ptr = Pattern.compile(emailPattern);
        return ptr.matcher(email).matches();
    }

    public boolean isValidPassword(String password) {
        return password.length() >= 6;
    }
}

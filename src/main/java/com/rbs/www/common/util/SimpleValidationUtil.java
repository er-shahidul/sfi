package com.rbs.www.common.util;

import java.util.regex.Pattern;

public class SimpleValidationUtil {
    private static final String emailPattern
            = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public static Boolean isEmptyString(String s) {
        return s == null || s.isEmpty();
    }

    public static Boolean isValidEmail(String email) {
        Pattern ptr = Pattern.compile(emailPattern);
        return ptr.matcher(email).matches();
    }

    public static boolean isValidPassword(String password) {
        return password.length() >= 6;
    }

}

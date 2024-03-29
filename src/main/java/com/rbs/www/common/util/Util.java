package com.rbs.www.common.util;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.*;

public class Util {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static String getDateFormat(Date date) {
        return new SimpleDateFormat("dd-MMM, yyyy h:mma").format(date);
    }

    public static Date getCurrentDate() { return Calendar.getInstance().getTime(); }

    public static String getCurrentUsername() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username = null;
        if (principal instanceof UserDetails) {
            username = ((UserDetails)principal).getUsername();
        } else {
            username = principal.toString();
        }
        return username;
    }

    public static String getAsString(Object meta) {
        try {
            return objectMapper.writeValueAsString(meta);
        } catch (JsonProcessingException ex) {
            return null;
        }
    }

//    public static long getDiffDays(final String endDateString) throws ParseException {
//        Date currentDate = getCurrentDate();
//        Date endDate = new SimpleDateFormat("MM/DD/yyyy").parse(endDateString);
//
//        long diff = endDate.getTime() - currentDate.getTime();
//        return diff / (24 * 60 * 60 * 1000);
//    }

    public static long getDiffDays(String dateStart) throws ParseException {
        DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        Date dateE = new Date();
        String dateStop = format.format(dateE);

        Date d1 = format.parse(dateStop);
        Date d2 = format.parse(dateStart);
        long diff = d2.getTime() - d1.getTime();
        return diff / (24 * 60 * 60 * 1000);
    }
}

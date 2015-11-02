package com.rbs.sfi.admin.util;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.*;

public class Util {

	private final static ObjectMapper objectMapper = new ObjectMapper();

	public static Date getCurrentDate() {
		return Calendar.getInstance().getTime();
	}
	
	public static String getCurrentUsername() {
		Object principal = SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();
		String username = null;
		if (principal instanceof UserDetails) {
			username = ((UserDetails) principal).getUsername();
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

	public static Object getObject(String dbData) {
		try {
			return objectMapper.readValue(dbData, Object.class);
		} catch (IOException ex) {
			return null;
		}
	}

}

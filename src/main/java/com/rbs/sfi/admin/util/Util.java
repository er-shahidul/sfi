package com.rbs.sfi.admin.util;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

public class Util {

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

}

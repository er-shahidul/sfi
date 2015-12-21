package com.rbs.www.admin.util;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.lang.reflect.Method;
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

	public static void merge(Object obj, Object update){
		if(!obj.getClass().isAssignableFrom(update.getClass())){
			return;
		}

		Method[] methods = obj.getClass().getMethods();
		String toName;

		for(Method fromMethod: methods){
			toName = getSetterMethodNameForGetterMethod(fromMethod);
			if(fromMethod.getDeclaringClass().equals(obj.getClass())
					&& toName != null){

				try {
					Method toMetod = obj.getClass().getMethod(toName, fromMethod.getReturnType());
					Object value = fromMethod.invoke(update, (Object[])null);
					if(value != null){
						toMetod.invoke(obj, value);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static String getSetterMethodNameForGetterMethod(Method fromMethod) {
		String fromName = fromMethod.getName();
		if(fromName.startsWith("get")) {
			return fromName.replace("get", "set");
		}

		if(fromName.startsWith("is")) {
			return fromName.replace("is", "set");
		}

		return null;
	}

}

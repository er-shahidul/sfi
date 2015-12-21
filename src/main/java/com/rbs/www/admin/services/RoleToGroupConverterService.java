package com.rbs.www.admin.services;

import com.rbs.www.admin.entities.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class RoleToGroupConverterService implements Converter<Object, Group> {

	@Autowired
    GroupService groupService;

	/*
	 * Gets UserProfile by Id
	 * @see org.springframework.core.convert.converter.Converter#convert(java.lang.Object)
	 */
	public Group convert(Object element) {
		Integer id = Integer.parseInt((String)element);
		Group group= groupService.findById(id);
		System.out.println("Group : "+group);
		return group;
	}
	
	/*
	 * Gets UserProfile by type
	 * @see org.springframework.core.convert.converter.Converter#convert(java.lang.Object)
	 */
	/*
	public UserProfile convert(Object element) {
		String type = (String)element;
		UserProfile profile= groupService.findByType(type);
		System.out.println("Profile ... : "+profile);
		return profile;
	}
	*/
}
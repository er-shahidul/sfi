package com.rbs.sfi.admin.entities;

import javax.persistence.*;

@Entity
@Table(name="groups")
public class Group {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="roles", length=15, unique=true, nullable=false)
	private String role = UserGroupType.USER.getUserGroupType();

	@Column(name="description", nullable=true)
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public enum UserGroupType {

		USER("USER"),
		ADMIN("ADMIN"),
		SUPER_ADMIN("SUPER_ADMIN");

		String userGroupType;

		private UserGroupType(String userGroupType){
			this.userGroupType = userGroupType;
		}

		public String getUserGroupType(){
			return userGroupType;
		}
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserProfile [id=" + id + ",  type=" + role	+ "]";
	}
}

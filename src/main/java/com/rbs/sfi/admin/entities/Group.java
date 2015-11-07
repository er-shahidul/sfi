package com.rbs.sfi.admin.entities;

import javax.persistence.*;

@Entity
@Table(name="groups")
public class Group {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;	

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((role == null) ? 0 : role.hashCode());

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Group))
			return false;
		Group other = (Group) obj;
		if (id != other.id)
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserProfile [id=" + id + ",  type=" + role	+ "]";
	}
}

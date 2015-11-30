package com.rbs.sfi.admin.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="users")
public class User extends Audit
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="username", unique=true, nullable=false)
	private String username;

	@Column(name="first_name", nullable=true)
	private String firstName;

	@Column(name="last_name", nullable=true)
	private String lastName;

	@Column(name="password", nullable=true)
	private String password;

	@Column(name="email", nullable=true)
	private String email;

	@ManyToOne(targetEntity = com.rbs.sfi.admin.entities.Company.class, optional=true)
	@JoinColumn(name="company_id", referencedColumnName="id", nullable=true)
	private Company company;

	@Column(name="enabled", nullable=true)
	private boolean enabled;

    @Column(name="token")
    private boolean token;

	@Column(name="invitation_msg", nullable=true)
	private String invitationMsg;

	@ManyToMany(targetEntity = Group.class, fetch = FetchType.EAGER)
	@JoinTable(name = "join_users_groups",
			joinColumns = { @JoinColumn(name = "user_id") },
			inverseJoinColumns = { @JoinColumn(name = "group_id") })
	private Set<Group> group = new HashSet<Group>();

    @Column(name="user_token", nullable=true)
    private String userToken;

	@Column(name="is_active", nullable=true)
	private Boolean isActive;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Group> getGroup() {
		return group;
	}

	public void setGroup(Set<Group> group) {
		this.group = group;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((username == null) ? 0 : username.hashCode());

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof User))
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password
				+ ", email=" + email + ", enabled=" + enabled + ", token=" + token
				+ ", group=" + group +"]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getInvitationMsg() {
		return invitationMsg;
	}

	public void setInvitationMsg(String invitationMsg) {
		this.invitationMsg = invitationMsg;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getFullname() {
		return firstName + ' ' + lastName;
	}

    public boolean isToken() {
        return token;
    }

    public void setToken(boolean token) {
        this.token = token;
    }

    public User() {
        super();
        this.token = false;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
}

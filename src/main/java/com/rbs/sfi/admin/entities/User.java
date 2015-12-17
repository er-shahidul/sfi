package com.rbs.sfi.admin.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User extends Audit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "first_name", nullable = true)
    private String firstName;

    @Column(name = "last_name", nullable = true)
    private String lastName;

    @Column(name = "password", nullable = true)
    private String password;

    @Column(name = "email", nullable = true)
    private String email;

    @ManyToOne(targetEntity = Company.class, optional = true)
    @JoinColumn(name = "company_id", referencedColumnName = "id", nullable = true)
    private Company company;

    @Column(name = "enabled", nullable = true)
    private Boolean enabled;

    @Column(name = "token")
    private Boolean token = false;

    @Column(name = "invitation_msg", nullable = true)
    private String invitationMsg;

    @ManyToMany(targetEntity = Group.class, fetch = FetchType.EAGER)
    @JoinTable(name = "join_users_groups",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "group_id")})
    private Set<Group> group = new HashSet<Group>();

    @Column(name = "user_token", nullable = true)
    private String userToken;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive = true;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
        if (this.group == null) this.group = new HashSet<Group>();
        this.group.clear();
        this.group.addAll(group);
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
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

    public Boolean getToken() {
        return token;
    }

    public void setToken(Boolean token) {
        this.token = token;
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

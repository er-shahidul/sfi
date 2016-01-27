package com.rbs.www.admin.models.entities;

import org.hibernate.annotations.Type;
import org.springframework.security.core.CredentialsContainer;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.Assert;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Table(name = "users")
public class User extends Audit implements UserDetails, CredentialsContainer {
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
    @Type(type="text")
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

    @Column(name = "sendInvitation", nullable = true)
    private Boolean sendInvitation;

    @Transient
    private Set<GrantedAuthority> authorities;

    private static SortedSet<GrantedAuthority> sortAuthorities(Collection<? extends GrantedAuthority> authorities) {
        Assert.notNull(authorities, "Cannot pass a null GrantedAuthority collection");
        TreeSet sortedAuthorities = new TreeSet(new User.AuthorityComparator());
        Iterator i$ = authorities.iterator();

        while(i$.hasNext()) {
            GrantedAuthority grantedAuthority = (GrantedAuthority)i$.next();
            Assert.notNull(grantedAuthority, "GrantedAuthority list cannot contain any null elements");
            sortedAuthorities.add(grantedAuthority);
        }

        return sortedAuthorities;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if(authorities == null) {
            authorities = Collections.unmodifiableSet(sortAuthorities(getGrantedAuthorities()));
        }

        return authorities;
    }

    private List<GrantedAuthority> getGrantedAuthorities(){
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

        for(Group role : this.getGroup()) {
            System.out.println("Role : "+role.getRole());
            authorities.add(new SimpleGrantedAuthority("ROLE_"+role.getRole()));

        }
        System.out.print("authorities :"+authorities);
        return authorities;
    }

    public Boolean getSendInvitation() {
        return sendInvitation;
    }

    public void setSendInvitation(Boolean sendInvitation) {
        this.sendInvitation = sendInvitation;
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

    @Override
    public void eraseCredentials() {
        password = null;
    }

    private static class AuthorityComparator implements Comparator<GrantedAuthority>, Serializable {
        private static final long serialVersionUID = 400L;

        private AuthorityComparator() {
        }

        public int compare(GrantedAuthority g1, GrantedAuthority g2) {
            return g2.getAuthority() == null?-1:(g1.getAuthority() == null?1:g1.getAuthority().compareTo(g2.getAuthority()));
        }
    }
}

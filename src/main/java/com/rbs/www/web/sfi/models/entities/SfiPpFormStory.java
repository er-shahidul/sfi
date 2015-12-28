package com.rbs.www.web.sfi.models.entities;

import com.rbs.www.common.models.BaseEntityModel;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sfi_pp_form_cs9_stories")
public class SfiPpFormStory extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "form_id", nullable = true)
    private Integer sfiPpForm;

    @Column(name = "firstName", nullable = true)
    private String firstName;

    @Column(name = "email", nullable = true)
    private String email;

    @Column(name = "description", nullable = true)
    private String description;

    @Column(name = "lastName", nullable = true)
    private String lastName;

    @Column(name = "shareNoUse", nullable = true)
    private Boolean shareNoUse;

    @Column(name = "shareOrgName", nullable = true)
    private Boolean shareOrgName;

    @Column(name = "shareUseAggregate", nullable = true)
    private Boolean shareUseAggregate;

    @OneToMany(targetEntity = SfiPpFormCs3ProjectSupportDocs.class, mappedBy = "sfiPpFormCs3", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<SfiPpFormCs3ProjectSupportDocs> supportDocs;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSfiPpForm() {
        return sfiPpForm;
    }

    public void setSfiPpForm(Integer sfiPpForm) {
        this.sfiPpForm = sfiPpForm;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getShareNoUse() {
        return shareNoUse;
    }

    public void setShareNoUse(Boolean shareNoUse) {
        this.shareNoUse = shareNoUse;
    }

    public Boolean getShareOrgName() {
        return shareOrgName;
    }

    public void setShareOrgName(Boolean shareOrgName) {
        this.shareOrgName = shareOrgName;
    }

    public Boolean getShareUseAggregate() {
        return shareUseAggregate;
    }

    public void setShareUseAggregate(Boolean shareUseAggregate) {
        this.shareUseAggregate = shareUseAggregate;
    }

    public Set<SfiPpFormCs3ProjectSupportDocs> getSupportDocs() {
        return supportDocs;
    }

    public void setSupportDocs(Set<SfiPpFormCs3ProjectSupportDocs> supportDocs) {
        addAll(this.supportDocs, supportDocs);
    }
}

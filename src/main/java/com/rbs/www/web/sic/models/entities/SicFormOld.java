package com.rbs.www.web.sic.models.entities;

import com.rbs.www.admin.models.entities.Company;
import com.rbs.www.admin.models.entities.User;
import com.rbs.www.common.models.BaseEntityModel;

import javax.persistence.*;

@Entity
@Table(name = "sic_forms_old")
public class SicFormOld extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(targetEntity = User.class, optional = true)
    @JoinColumn(name = "created_by", referencedColumnName = "id", nullable = true)
    private User createdBy;

    @OneToOne(targetEntity = Company.class, optional = false)
    @JoinColumn(name = "company_id", referencedColumnName = "id", nullable = true)
    private Company company;

    @Column(name = "file_name", nullable = true)
    private String fileName;

    @Column(name = "approved", nullable = true)
    private Boolean approved;

    @Column(name = "year", nullable = true)
    private String year;

    @Column(name = "updated_at", nullable = true)
    private String updatedAt;

    @Column(name = "created_at", nullable = true)
    private String createdAt;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Boolean getApproved() {
        return this.approved !=null ? this.approved: false;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }


    public String getStatusText() {
        if(getApproved() )
            return "Approved";
        else
            return  "Submitted";

    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }
}

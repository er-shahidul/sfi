package com.rbs.www.web.sic.models.entities;

import com.rbs.www.admin.models.entities.Company;
import com.rbs.www.common.models.BaseEntityModel;

import javax.persistence.*;

@Entity
@Table(name = "sic_forms_old")
public class SicFormOld extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(targetEntity = Company.class, optional = false)
    @JoinColumn(name = "company_id", referencedColumnName = "id", nullable = true)
    private Company company;

    @Column(name = "file_name", nullable = true)
    private String fileName;

    @Column(name = "approved", nullable = true)
    private Boolean approved;

    @Column(name = "year", nullable = true)
    private String year;

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
}

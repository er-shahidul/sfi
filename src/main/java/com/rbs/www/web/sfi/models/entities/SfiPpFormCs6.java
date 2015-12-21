package com.rbs.www.web.sfi.models.entities;

import com.rbs.www.admin.models.entities.Company;
import com.rbs.www.common.models.BaseEntityModel;

import javax.persistence.*;

@Entity
@Table(name = "sfi_pp_forms_cs6")
public class SfiPpFormCs6 extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(targetEntity = Company.class)
    @JoinColumn(name = "company_id", nullable = true)
    private Company company;

    @Column(name = "usa_timberSellers", nullable = true)
    private Integer usaTimberSellers;

    @Column(name = "usa_infoReceived", nullable = true)
    private Integer usaInfoReceived;

    @Column(name = "usa_fundingProvided", nullable = true)
    private Float usaFundingProvided;

    @Column(name = "ca_timberSellers", nullable = true)
    private Integer caTimberSellers;

    @Column(name = "ca_infoReceived", nullable = true)
    private Integer caInfoReceived;

    @Column(name = "ca_fundingProvided", nullable = true)
    private Integer caFundingProvided;

    @Column(name = "orgYesNo", nullable = true)
    private Boolean orgYesNo;

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

    public Integer getUsaTimberSellers() {
        return usaTimberSellers;
    }

    public void setUsaTimberSellers(Integer usaTimberSellers) {
        this.usaTimberSellers = usaTimberSellers;
    }

    public Integer getUsaInfoReceived() {
        return usaInfoReceived;
    }

    public void setUsaInfoReceived(Integer usaInfoReceived) {
        this.usaInfoReceived = usaInfoReceived;
    }

    public Float getUsaFundingProvided() {
        return usaFundingProvided;
    }

    public void setUsaFundingProvided(Float usaFundingProvided) {
        this.usaFundingProvided = usaFundingProvided;
    }

    public Integer getCaTimberSellers() {
        return caTimberSellers;
    }

    public void setCaTimberSellers(Integer caTimberSellers) {
        this.caTimberSellers = caTimberSellers;
    }

    public Integer getCaInfoReceived() {
        return caInfoReceived;
    }

    public void setCaInfoReceived(Integer caInfoReceived) {
        this.caInfoReceived = caInfoReceived;
    }

    public Integer getCaFundingProvided() {
        return caFundingProvided;
    }

    public void setCaFundingProvided(Integer caFundingProvided) {
        this.caFundingProvided = caFundingProvided;
    }

    public Boolean getOrgYesNo() {
        return orgYesNo;
    }

    public void setOrgYesNo(Boolean orgYesNo) {
        this.orgYesNo = orgYesNo;
    }
}

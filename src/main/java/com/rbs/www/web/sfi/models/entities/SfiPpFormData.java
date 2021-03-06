package com.rbs.www.web.sfi.models.entities;

import com.rbs.www.admin.models.entities.Company;
import com.rbs.www.admin.models.entities.User;
import com.rbs.www.common.models.BaseEntityModel;
import com.rbs.www.web.common.models.entities.SfiPpFormStatus;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sfi_pp_forms")
public class SfiPpFormData extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(targetEntity = SfiPpFormStatus.class, optional = true)
    @JoinColumn(name = "status_id", referencedColumnName = "id", nullable = true)
    private SfiPpFormStatus status;

    @OneToOne(targetEntity = Company.class, optional = false)
    @JoinColumn(name = "company_id", referencedColumnName = "id", nullable = true)
    private Company company;

    @ManyToOne(targetEntity = User.class, optional = true)
    @JoinColumn(name = "created_by", referencedColumnName = "id", nullable = true)
    private User createdBy;

    @ManyToOne(targetEntity = User.class, optional = true)
    @JoinColumn(name = "updated_by", referencedColumnName = "id", nullable = true)
    private User updatedBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "isSaved", nullable = true)
    private Boolean isSaved;

    @Column(name = "isComplete", nullable = true)
    private Boolean isComplete;

    @Column(name = "approved", nullable = true)
    private Boolean approve;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SfiPpFormStatus getStatus() {
        return status;
    }

    public void setStatus(SfiPpFormStatus status) {
        this.status = status;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public Boolean getIsSaved() {
        return isSaved;
    }

    public void setIsSaved(Boolean isSaved) {
        this.isSaved = isSaved;
    }

    public Boolean getIsComplete() {
        return isComplete;
    }

    public void setIsComplete(Boolean isComplete) {
        this.isComplete = isComplete;
    }

    public User getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(User updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getApprove() {
        return this.approve !=null ? this.approve: false;
    }

    public void setApprove(Boolean approve) {
        this.approve = approve;
    }

    public String getStatusText() {
        if(getApprove() && status.getStatus().equals("submitted"))
             return "Approved";
        else
            return  status.getStatus();

    }

    public boolean isApproveButtonEnable() {
        if(!getApprove() && status.getStatus().equals("submitted"))
             return true;
        else
            return  false;

    }

}

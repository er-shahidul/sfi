package com.rbs.www.web.sic.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;

import javax.validation.constraints.NotNull;
import java.util.Set;

public class SicCs8ViewModel extends BaseViewModel {
    private Integer id;

    @NotNull(message = "{sic.cs8.inPartnershipProjects}")
    private Boolean inPartnershipProjects;
    private Integer partnerOtherSICState;
    private String partnerOtherSpecify;

    private Set<SicCs8ProjectViewModel> projects;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getInPartnershipProjects() {
        return inPartnershipProjects;
    }

    public void setInPartnershipProjects(Boolean inPartnershipProjects) {
        this.inPartnershipProjects = inPartnershipProjects;
    }

    public Integer getPartnerOtherSICState() {
        return partnerOtherSICState;
    }

    public void setPartnerOtherSICState(Integer partnerOtherSICState) {
        this.partnerOtherSICState = partnerOtherSICState;
    }

    public String getPartnerOtherSpecify() {
        return partnerOtherSpecify;
    }

    public void setPartnerOtherSpecify(String partnerOtherSpecify) {
        this.partnerOtherSpecify = partnerOtherSpecify;
    }

    public Set<SicCs8ProjectViewModel> getProjects() {
        return projects;
    }

    public void setProjects(Set<SicCs8ProjectViewModel> projects) {
        this.projects = projects;
    }
}

package com.rbs.www.web.sic.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;
import com.rbs.www.common.modules.validator.CascadeIf;
import com.rbs.www.common.modules.validator.SpELAssert;

import javax.validation.Valid;
import java.util.Set;

@SpELAssert.List({
        @SpELAssert(
                value = "projects != null && !projects.isEmpty()",
                applyIf = "inPartnershipProjects != null && inPartnershipProjects",
                message = "{sic.cs8.inPartnershipProjects}"
        )
})
public class SicCs8ViewModel extends BaseViewModel {
    private Integer id;

    private Boolean inPartnershipProjects;

    @Valid
//    @CascadeIf("inPartnershipProjects")
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

    public Set<SicCs8ProjectViewModel> getProjects() {
        return projects;
    }

    public void setProjects(Set<SicCs8ProjectViewModel> projects) {
        this.projects = projects;
    }
}

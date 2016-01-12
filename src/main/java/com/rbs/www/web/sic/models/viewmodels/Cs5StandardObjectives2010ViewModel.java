package com.rbs.www.web.sic.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;
import com.rbs.www.web.common.models.datamodels.DocNames;

import java.util.Set;

public class Cs5StandardObjectives2010ViewModel extends BaseViewModel {
    private Integer id;

    private Integer sicPpForm;
    private Integer inconsistentPractice;
    private Integer resolved;
    private Integer unresolved;
    private String objective;
    private String circumstanceDescription;
    private DocNames circumstancesDoc;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSicPpForm() {
        return sicPpForm;
    }

    public void setSicPpForm(Integer sicPpForm) {
        this.sicPpForm = sicPpForm;
    }

    public Integer getInconsistentPractice() {
        return inconsistentPractice;
    }

    public void setInconsistentPractice(Integer inconsistentPractice) {
        this.inconsistentPractice = inconsistentPractice;
    }

    public Integer getResolved() {
        return resolved;
    }

    public void setResolved(Integer resolved) {
        this.resolved = resolved;
    }

    public Integer getUnresolved() {
        return unresolved;
    }

    public void setUnresolved(Integer unresolved) {
        this.unresolved = unresolved;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public String getCircumstanceDescription() {
        return circumstanceDescription;
    }

    public void setCircumstanceDescription(String circumstanceDescription) {
        this.circumstanceDescription = circumstanceDescription;
    }

    public DocNames getCircumstancesDoc() {
        return circumstancesDoc;
    }

    public void setCircumstancesDoc(DocNames circumstancesDoc) {
        this.circumstancesDoc = circumstancesDoc;
    }
}

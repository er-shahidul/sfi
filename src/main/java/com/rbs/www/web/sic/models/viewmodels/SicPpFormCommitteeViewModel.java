package com.rbs.www.web.sic.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;

public class SicPpFormCommitteeViewModel extends BaseViewModel {
    private Integer id;
    private Integer sicPpForm;
    private String name;
    private String chair;
    private String email;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

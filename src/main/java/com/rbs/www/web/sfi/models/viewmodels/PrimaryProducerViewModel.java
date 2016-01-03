package com.rbs.www.web.sfi.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;

public class PrimaryProducerViewModel extends BaseViewModel {
    private Integer id;
    private Integer sfiPpForm;
    private Integer source;
    private Float percPurchased;

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

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Float getPercPurchased() {
        return percPurchased;
    }

    public void setPercPurchased(Float percPurchased) {
        this.percPurchased = percPurchased;
    }
}

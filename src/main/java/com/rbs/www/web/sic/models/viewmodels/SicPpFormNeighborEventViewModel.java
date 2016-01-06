package com.rbs.www.web.sic.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;

public class SicPpFormNeighborEventViewModel extends BaseViewModel {
    private Integer id;
    private Integer sicPpForm;
    private String comment;
    private String whichSic;

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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getWhichSic() {
        return whichSic;
    }

    public void setWhichSic(String whichSic) {
        this.whichSic = whichSic;
    }
}

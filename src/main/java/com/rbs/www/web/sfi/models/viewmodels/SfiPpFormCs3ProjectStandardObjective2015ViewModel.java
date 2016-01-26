package com.rbs.www.web.sfi.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;

public class SfiPpFormCs3ProjectStandardObjective2015ViewModel extends BaseViewModel {
    private Integer id;
    private Integer sfiStandardObj;
    private String sfiStandardObjDesc;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSfiStandardObj() {
        return sfiStandardObj;
    }

    public void setSfiStandardObj(Integer sfiStandardObj) {
        this.sfiStandardObj = sfiStandardObj;
    }

    public String getSfiStandardObjDesc() {
        return sfiStandardObjDesc;
    }

    public void setSfiStandardObjDesc(String sfiStandardObjDesc) {
        this.sfiStandardObjDesc = sfiStandardObjDesc;
    }
}

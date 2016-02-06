package com.rbs.www.web.sic.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;
import com.rbs.www.common.modules.validator.SpELAssert;

@SpELAssert.List({
        @SpELAssert(
                value = "brochureSpecify != null && !brochureSpecify.isEmpty()",
                applyIf = "brochure != null && brochure",
                message = "{sic.cs3.brochureSpecify}"
        ),
        @SpELAssert(
                value = "otherSpecify != null && !otherSpecify.isEmpty()",
                applyIf = "other != null && other",
                message = "{sic.cs3.otherSpecify}"
        ),
        @SpELAssert(
                value = "toursSpecify != null && !toursSpecify.isEmpty()",
                applyIf = "tours != null && tours",
                message = "{sic.cs3.toursSpecify}"
        ),
        @SpELAssert(
                value = "workshopSpecify != null && !workshopSpecify.isEmpty()",
                applyIf = "workshop != null && workshop",
                message = "{sic.cs3.workshopSpecify}"
        )
})
public class SicCs3ViewModel extends BaseViewModel {
    private Integer id;

    private Boolean brochure;
    private Boolean other;
    private Boolean tours;
    private Boolean workshop;

    private String brochureSpecify;
    private String otherSpecify;
    private String toursSpecify;
    private String workshopSpecify;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getBrochure() {
        return brochure;
    }

    public void setBrochure(Boolean brochure) {
        this.brochure = brochure;
    }

    public Boolean getOther() {
        return other;
    }

    public void setOther(Boolean other) {
        this.other = other;
    }

    public Boolean getTours() {
        return tours;
    }

    public void setTours(Boolean tours) {
        this.tours = tours;
    }

    public Boolean getWorkshop() {
        return workshop;
    }

    public void setWorkshop(Boolean workshop) {
        this.workshop = workshop;
    }

    public String getBrochureSpecify() {
        return brochureSpecify;
    }

    public void setBrochureSpecify(String brochureSpecify) {
        this.brochureSpecify = brochureSpecify;
    }

    public String getOtherSpecify() {
        return otherSpecify;
    }

    public void setOtherSpecify(String otherSpecify) {
        this.otherSpecify = otherSpecify;
    }

    public String getToursSpecify() {
        return toursSpecify;
    }

    public void setToursSpecify(String toursSpecify) {
        this.toursSpecify = toursSpecify;
    }

    public String getWorkshopSpecify() {
        return workshopSpecify;
    }

    public void setWorkshopSpecify(String workshopSpecify) {
        this.workshopSpecify = workshopSpecify;
    }
}

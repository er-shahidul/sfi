package com.rbs.www.web.sfi.models.entities;

import com.rbs.www.common.models.BaseEntityModel;

import javax.persistence.*;

@Entity
@Table(name = "sfi_pp_form_cs8_perc_purchaseds")
public class PrimaryProducer extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "form_id", nullable = true)
    private Integer sfiPpForm;

    @Column(name = "source", nullable = true)
    private Integer source;

    @Column(name = "percPurchased", nullable = true)
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

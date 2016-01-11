package com.rbs.www.web.sic.models.del.entities;

import com.rbs.www.common.models.BaseEntityModel;

import javax.persistence.*;

@Entity
@Table(name = "sic_pp_form_cs5_circumstances_doc")
public class Cs5CircumstancesDoc extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    @Column(name = "standard_objectives_2010_id", nullable = true)
    protected Integer standardObjectives2010Id;

    @Column(name = "originalDocumentName", nullable = true)
    protected String originalDocumentName;

    @Column(name = "uniqueDocumentName", nullable = true)
    protected String uniqueDocumentName;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStandardObjectives2010Id() {
        return standardObjectives2010Id;
    }

    public void setStandardObjectives2010Id(Integer standardObjectives2010Id) {
        this.standardObjectives2010Id = standardObjectives2010Id;
    }

    public String getOriginalDocumentName() {
        return originalDocumentName;
    }

    public void setOriginalDocumentName(String originalDocumentName) {
        this.originalDocumentName = originalDocumentName;
    }

    public String getUniqueDocumentName() {
        return uniqueDocumentName;
    }

    public void setUniqueDocumentName(String uniqueDocumentName) {
        this.uniqueDocumentName = uniqueDocumentName;
    }
}


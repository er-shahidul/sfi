package com.rbs.www.web.sic.models.entities;

import com.rbs.www.common.models.BaseEntityModel;
import com.rbs.www.common.services.TypeConversionUtils;
import com.rbs.www.web.common.models.datamodels.DocNames;

import javax.persistence.*;

@Entity
@Table(name = "sic_pp_form_cs5_standard_objectives_2010")
public class Cs5StandardObjectives2010 extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    @Column(name = "form_id", nullable = true)
    protected Integer sicPpForm;

    @Column(name = "circumstanceDescription", nullable = true)
    private String circumstanceDescription;

    @Lob
    @Column(name = "circumstancesDoc", length = 1000, nullable = true)
    private Byte[] circumstancesDocAsByteArray;

    @Column(name = "inconsistentPractice", nullable = true)
    private Integer inconsistentPractice;

    @Column(name = "resolved", nullable = true)
    private Integer resolved;

    @Column(name = "unresolved", nullable = true)
    private Integer unresolved;

    @Column(name = "objective", nullable = true)
    private String objective;

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

    public String getCircumstanceDescription() {
        return circumstanceDescription;
    }

    public void setCircumstanceDescription(String circumstanceDescription) {
        this.circumstanceDescription = circumstanceDescription;
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

    private Byte[] getCircumstancesDocAsByteArray() {
        return circumstancesDocAsByteArray;
    }

    private void setCircumstancesDocAsByteArray(Byte[] circumstancesDocAsByteArray) {
        this.circumstancesDocAsByteArray = circumstancesDocAsByteArray;
    }

    @Transient
    @SuppressWarnings("unchecked")
    public DocNames getCircumstancesDoc() {
        return (DocNames) TypeConversionUtils.deserialize(circumstancesDocAsByteArray);
    }

    public void setCircumstancesDoc(DocNames circumstancesDoc) {
        this.circumstancesDocAsByteArray = TypeConversionUtils.serialize(circumstancesDoc);
    }
}


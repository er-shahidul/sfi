package com.rbs.www.web.sic.models.entities;

import com.rbs.www.common.models.BaseEntityModel;

import javax.persistence.*;

@Entity
@Table(name = "sic_pp_form_cs5_fiber_sourcing_2015")
public class Cs5FiberSourcing2015 extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    @Column(name = "form_id", nullable = true)
    protected Integer sicPpForm;

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
}


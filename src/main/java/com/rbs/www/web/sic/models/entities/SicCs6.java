package com.rbs.www.web.sic.models.entities;

import com.rbs.www.common.models.BaseEntityModel;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sic_forms")
public class SicCs6 extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cs6_certifiedLoggingProfessional", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> trainingPrograms;

    @Column(name = "cs6_certifiedLoggingProfessional", nullable = true)
    private Boolean certifiedLoggingProfessional;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Integer> getTrainingPrograms() {
        return trainingPrograms;
    }

    public void setTrainingPrograms(Set<Integer> trainingPrograms) {
        addAll(this.trainingPrograms, trainingPrograms);
    }

    public Boolean getCertifiedLoggingProfessional() {
        return certifiedLoggingProfessional;
    }

    public void setCertifiedLoggingProfessional(Boolean certifiedLoggingProfessional) {
        this.certifiedLoggingProfessional = certifiedLoggingProfessional;
    }
}

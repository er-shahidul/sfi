package com.rbs.www.web.sfi.models.entities;

import com.rbs.www.common.models.BaseEntityModel;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sfi_pp_forms")
public class Cs6 extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cs6_numPrivateForeOwers_us", nullable = true)
    private Integer numPrivateForeOwersUs;

    @Column(name = "cs6_numPrivateForeOwers_ca", nullable = true)
    private Integer numPrivateForeOwersCa;

    @Column(name = "cs6_numPrivateLandOwers_us", nullable = true)
    private Integer numPrivateLandOwersUs;

    @Column(name = "cs6_numPrivateLandOwers_ca", nullable = true)
    private Integer numPrivateLandOwersCa;

    @Column(name = "cs6_toAssistObj8", nullable = true)
    private Boolean toAssistObj8;

    @OneToMany(targetEntity = SfiPpFormCs6UsCanada.class, mappedBy = "sfiPpForm", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<SfiPpFormCs6UsCanada> usCanada;

    @OneToMany(targetEntity = SfiPpFormCs6Other.class, mappedBy = "sfiPpForm", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<SfiPpFormCs6Other> usOthers;

    @Column(name = "cs9_trainedWoodProducersChanged", nullable = true)
    private String trainedWoodProducersChanged;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumPrivateForeOwersUs() {
        return numPrivateForeOwersUs;
    }

    public void setNumPrivateForeOwersUs(Integer numPrivateForeOwersUs) {
        this.numPrivateForeOwersUs = numPrivateForeOwersUs;
    }

    public Integer getNumPrivateForeOwersCa() {
        return numPrivateForeOwersCa;
    }

    public void setNumPrivateForeOwersCa(Integer numPrivateForeOwersCa) {
        this.numPrivateForeOwersCa = numPrivateForeOwersCa;
    }

    public Integer getNumPrivateLandOwersUs() {
        return numPrivateLandOwersUs;
    }

    public void setNumPrivateLandOwersUs(Integer numPrivateLandOwersUs) {
        this.numPrivateLandOwersUs = numPrivateLandOwersUs;
    }

    public Integer getNumPrivateLandOwersCa() {
        return numPrivateLandOwersCa;
    }

    public void setNumPrivateLandOwersCa(Integer numPrivateLandOwersCa) {
        this.numPrivateLandOwersCa = numPrivateLandOwersCa;
    }

    public Boolean getToAssistObj8() {
        return toAssistObj8;
    }

    public void setToAssistObj8(Boolean toAssistObj8) {
        this.toAssistObj8 = toAssistObj8;
    }

    public Set<SfiPpFormCs6UsCanada> getUsCanada() {
        return usCanada;
    }

    public void setUsCanada(Set<SfiPpFormCs6UsCanada> usCanada) {
        addAll(this.usCanada, usCanada);
    }

    public Set<SfiPpFormCs6Other> getUsOthers() {
        return usOthers;
    }

    public void setUsOthers(Set<SfiPpFormCs6Other> usOthers) {
        addAll(this.usOthers, usOthers);
    }

    public String getTrainedWoodProducersChanged() {
        return trainedWoodProducersChanged;
    }

    public void setTrainedWoodProducersChanged(String trainedWoodProducersChanged) {
        this.trainedWoodProducersChanged = trainedWoodProducersChanged;
    }
}

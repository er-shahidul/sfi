package com.rbs.www.web.sfi.models.entities;

import com.rbs.www.common.models.BaseEntityModel;
import com.rbs.www.web.common.models.entities.SfiPpFormAllCountry;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sfi_pp_forms")
public class Cs8PartialB extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainFSC_Country_1",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_1;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainFSC_Country_10",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_10;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainFSC_Country_11",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_11;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainFSC_Country_12",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_12;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainFSC_Country_13",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_13;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainFSC_Country_2",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_2;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainFSC_Country_3",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_3;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainFSC_Country_4",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_4;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainFSC_Country_5",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_5;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainFSC_Country_6",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_6;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainFSC_Country_7",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_7;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainFSC_Country_8",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_8;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainFSC_Country_9",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_9;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainPEFC_Country_1",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_1;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainPEFC_Country_10",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_10;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainPEFC_Country_11",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_11;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainPEFC_Country_12",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_12;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainPEFC_Country_13",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_13;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainPEFC_Country_2",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_2;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainPEFC_Country_3",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_3;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainFSC_Country_1() {
        return sfiLabelProductGroupContainFSC_Country_1;
    }

    public void setSfiLabelProductGroupContainFSC_Country_1(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_1) {
        addAll(this.sfiLabelProductGroupContainFSC_Country_1, sfiLabelProductGroupContainFSC_Country_1);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainFSC_Country_10() {
        return sfiLabelProductGroupContainFSC_Country_10;
    }

    public void setSfiLabelProductGroupContainFSC_Country_10(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_10) {
        addAll(this.sfiLabelProductGroupContainFSC_Country_10, sfiLabelProductGroupContainFSC_Country_10);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainFSC_Country_11() {
        return sfiLabelProductGroupContainFSC_Country_11;
    }

    public void setSfiLabelProductGroupContainFSC_Country_11(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_11) {
        addAll(this.sfiLabelProductGroupContainFSC_Country_11, sfiLabelProductGroupContainFSC_Country_11);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainFSC_Country_12() {
        return sfiLabelProductGroupContainFSC_Country_12;
    }

    public void setSfiLabelProductGroupContainFSC_Country_12(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_12) {
        addAll(this.sfiLabelProductGroupContainFSC_Country_12, sfiLabelProductGroupContainFSC_Country_12);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainFSC_Country_13() {
        return sfiLabelProductGroupContainFSC_Country_13;
    }

    public void setSfiLabelProductGroupContainFSC_Country_13(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_13) {
        addAll(this.sfiLabelProductGroupContainFSC_Country_13, sfiLabelProductGroupContainFSC_Country_13);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainFSC_Country_2() {
        return sfiLabelProductGroupContainFSC_Country_2;
    }

    public void setSfiLabelProductGroupContainFSC_Country_2(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_2) {
        addAll(this.sfiLabelProductGroupContainFSC_Country_2, sfiLabelProductGroupContainFSC_Country_2);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainFSC_Country_3() {
        return sfiLabelProductGroupContainFSC_Country_3;
    }

    public void setSfiLabelProductGroupContainFSC_Country_3(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_3) {
        addAll(this.sfiLabelProductGroupContainFSC_Country_3, sfiLabelProductGroupContainFSC_Country_3);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainFSC_Country_4() {
        return sfiLabelProductGroupContainFSC_Country_4;
    }

    public void setSfiLabelProductGroupContainFSC_Country_4(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_4) {
        addAll(this.sfiLabelProductGroupContainFSC_Country_4, sfiLabelProductGroupContainFSC_Country_4);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainFSC_Country_5() {
        return sfiLabelProductGroupContainFSC_Country_5;
    }

    public void setSfiLabelProductGroupContainFSC_Country_5(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_5) {
        addAll(this.sfiLabelProductGroupContainFSC_Country_5, sfiLabelProductGroupContainFSC_Country_5);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainFSC_Country_6() {
        return sfiLabelProductGroupContainFSC_Country_6;
    }

    public void setSfiLabelProductGroupContainFSC_Country_6(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_6) {
        addAll(this.sfiLabelProductGroupContainFSC_Country_6, sfiLabelProductGroupContainFSC_Country_6);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainFSC_Country_7() {
        return sfiLabelProductGroupContainFSC_Country_7;
    }

    public void setSfiLabelProductGroupContainFSC_Country_7(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_7) {
        addAll(this.sfiLabelProductGroupContainFSC_Country_7, sfiLabelProductGroupContainFSC_Country_7);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainFSC_Country_8() {
        return sfiLabelProductGroupContainFSC_Country_8;
    }

    public void setSfiLabelProductGroupContainFSC_Country_8(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_8) {
        addAll(this.sfiLabelProductGroupContainFSC_Country_8, sfiLabelProductGroupContainFSC_Country_8);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainFSC_Country_9() {
        return sfiLabelProductGroupContainFSC_Country_9;
    }

    public void setSfiLabelProductGroupContainFSC_Country_9(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_9) {
        addAll(this.sfiLabelProductGroupContainFSC_Country_9, sfiLabelProductGroupContainFSC_Country_9);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainPEFC_Country_1() {
        return sfiLabelProductGroupContainPEFC_Country_1;
    }

    public void setSfiLabelProductGroupContainPEFC_Country_1(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_1) {
        addAll(this.sfiLabelProductGroupContainPEFC_Country_1, sfiLabelProductGroupContainPEFC_Country_1);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainPEFC_Country_10() {
        return sfiLabelProductGroupContainPEFC_Country_10;
    }

    public void setSfiLabelProductGroupContainPEFC_Country_10(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_10) {
        addAll(this.sfiLabelProductGroupContainPEFC_Country_10, sfiLabelProductGroupContainPEFC_Country_10);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainPEFC_Country_11() {
        return sfiLabelProductGroupContainPEFC_Country_11;
    }

    public void setSfiLabelProductGroupContainPEFC_Country_11(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_11) {
        addAll(this.sfiLabelProductGroupContainPEFC_Country_11, sfiLabelProductGroupContainPEFC_Country_11);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainPEFC_Country_12() {
        return sfiLabelProductGroupContainPEFC_Country_12;
    }

    public void setSfiLabelProductGroupContainPEFC_Country_12(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_12) {
        addAll(this.sfiLabelProductGroupContainPEFC_Country_12, sfiLabelProductGroupContainPEFC_Country_12);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainPEFC_Country_13() {
        return sfiLabelProductGroupContainPEFC_Country_13;
    }

    public void setSfiLabelProductGroupContainPEFC_Country_13(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_13) {
        addAll(this.sfiLabelProductGroupContainPEFC_Country_13, sfiLabelProductGroupContainPEFC_Country_13);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainPEFC_Country_2() {
        return sfiLabelProductGroupContainPEFC_Country_2;
    }

    public void setSfiLabelProductGroupContainPEFC_Country_2(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_2) {
        addAll(this.sfiLabelProductGroupContainPEFC_Country_2, sfiLabelProductGroupContainPEFC_Country_2);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainPEFC_Country_3() {
        return sfiLabelProductGroupContainPEFC_Country_3;
    }

    public void setSfiLabelProductGroupContainPEFC_Country_3(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_3) {
        addAll(this.sfiLabelProductGroupContainPEFC_Country_3, sfiLabelProductGroupContainPEFC_Country_3);
    }
}

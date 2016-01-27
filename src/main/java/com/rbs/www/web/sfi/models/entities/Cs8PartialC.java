package com.rbs.www.web.sfi.models.entities;

import com.rbs.www.common.models.BaseEntityModel;
import com.rbs.www.web.common.models.entities.SfiPpFormAllCountry;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sfi_pp_forms")
public class Cs8PartialC extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cs8_fscCocCertificationItems_1", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> fscCocCertificationItems_1;

    @Column(name = "cs8_fscCocCertificationItems_2", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> fscCocCertificationItems_2;

    @Column(name = "cs8_fscCocCertificationItems_3", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> fscCocCertificationItems_3;

    @Column(name = "cs8_fscCocCertificationItems_4", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> fscCocCertificationItems_4;

    @Column(name = "cs8_fscCocCertificationItems_5", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> fscCocCertificationItems_5;

    @Column(name = "cs8_fscCocCertificationItems_6", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> fscCocCertificationItems_6;

    @Column(name = "cs8_fscCocCertificationItems_7", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> fscCocCertificationItems_7;

    @Column(name = "cs8_fscCocCertificationItems_8", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> fscCocCertificationItems_8;

    @Column(name = "cs8_fscCocCertificationItems_9", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> fscCocCertificationItems_9;

    @Column(name = "cs8_fscCocCertificationItems_10", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> fscCocCertificationItems_10;

    @Column(name = "cs8_fscCocCertificationItems_11", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> fscCocCertificationItems_11;

    @Column(name = "cs8_fscCocCertificationItems_12", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> fscCocCertificationItems_12;

    @Column(name = "cs8_fscCocCertificationItems_13", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> fscCocCertificationItems_13;


    @Column(name = "cs8_fscForestCertificationItems_1", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> fscForestCertificationItems_1;

    @Column(name = "cs8_fscForestCertificationItems_2", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> fscForestCertificationItems_2;

    @Column(name = "cs8_fscForestCertificationItems_3", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> fscForestCertificationItems_3;

    @Column(name = "cs8_fscForestCertificationItems_4", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> fscForestCertificationItems_4;

    @Column(name = "cs8_fscForestCertificationItems_5", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> fscForestCertificationItems_5;

    @Column(name = "cs8_fscForestCertificationItems_6", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> fscForestCertificationItems_6;

    @Column(name = "cs8_fscForestCertificationItems_7", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> fscForestCertificationItems_7;

    @Column(name = "cs8_fscForestCertificationItems_8", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> fscForestCertificationItems_8;

    @Column(name = "cs8_fscForestCertificationItems_9", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> fscForestCertificationItems_9;

    @Column(name = "cs8_fscForestCertificationItems_10", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> fscForestCertificationItems_10;

    @Column(name = "cs8_fscForestCertificationItems_11", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> fscForestCertificationItems_11;

    @Column(name = "cs8_fscForestCertificationItems_12", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> fscForestCertificationItems_12;

    @Column(name = "cs8_fscForestCertificationItems_13", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> fscForestCertificationItems_13;

    @Column(name = "cs8_sfiHelpCommunication", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> sfiHelpCommunication;

    @Column(name = "cs8_sfiMarketExternally", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> sfiMarketExternally;

    @Column(name = "cs8_sfiServeBetter", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> sfiServeBetter;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "alsoFSCLabelFSC_Country_1",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> alsoFSCLabelFSC_Country_1;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "alsoFSCLabelFSC_Country_2",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> alsoFSCLabelFSC_Country_2;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "alsoFSCLabelFSC_Country_3",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> alsoFSCLabelFSC_Country_3;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "alsoFSCLabelFSC_Country_4",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> alsoFSCLabelFSC_Country_4;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "alsoFSCLabelFSC_Country_5",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> alsoFSCLabelFSC_Country_5;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "alsoFSCLabelFSC_Country_6",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> alsoFSCLabelFSC_Country_6;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "alsoFSCLabelFSC_Country_7",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> alsoFSCLabelFSC_Country_7;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "alsoFSCLabelFSC_Country_8",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> alsoFSCLabelFSC_Country_8;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "alsoFSCLabelFSC_Country_9",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> alsoFSCLabelFSC_Country_9;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "alsoFSCLabelFSC_Country_10",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> alsoFSCLabelFSC_Country_10;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "alsoFSCLabelFSC_Country_11",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> alsoFSCLabelFSC_Country_11;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "alsoFSCLabelFSC_Country_12",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> alsoFSCLabelFSC_Country_12;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "alsoFSCLabelFSC_Country_13",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> alsoFSCLabelFSC_Country_13;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Integer> getFscCocCertificationItems_1() {
        return fscCocCertificationItems_1;
    }

    public void setFscCocCertificationItems_1(Set<Integer> fscCocCertificationItems_1) {
        addAll(this.fscCocCertificationItems_1, fscCocCertificationItems_1);
    }

    public Set<Integer> getFscCocCertificationItems_2() {
        return fscCocCertificationItems_2;
    }

    public void setFscCocCertificationItems_2(Set<Integer> fscCocCertificationItems_2) {
        addAll(this.fscCocCertificationItems_2, fscCocCertificationItems_2);
    }

    public Set<Integer> getFscCocCertificationItems_3() {
        return fscCocCertificationItems_3;
    }

    public void setFscCocCertificationItems_3(Set<Integer> fscCocCertificationItems_3) {
        addAll(this.fscCocCertificationItems_3, fscCocCertificationItems_3);
    }

    public Set<Integer> getFscCocCertificationItems_4() {
        return fscCocCertificationItems_4;
    }

    public void setFscCocCertificationItems_4(Set<Integer> fscCocCertificationItems_4) {
        addAll(this.fscCocCertificationItems_4, fscCocCertificationItems_4);
    }

    public Set<Integer> getFscCocCertificationItems_5() {
        return fscCocCertificationItems_5;
    }

    public void setFscCocCertificationItems_5(Set<Integer> fscCocCertificationItems_5) {
        addAll(this.fscCocCertificationItems_5, fscCocCertificationItems_5);
    }

    public Set<Integer> getFscCocCertificationItems_6() {
        return fscCocCertificationItems_6;
    }

    public void setFscCocCertificationItems_6(Set<Integer> fscCocCertificationItems_6) {
        addAll(this.fscCocCertificationItems_6, fscCocCertificationItems_6);
    }

    public Set<Integer> getFscCocCertificationItems_7() {
        return fscCocCertificationItems_7;
    }

    public void setFscCocCertificationItems_7(Set<Integer> fscCocCertificationItems_7) {
        addAll(this.fscCocCertificationItems_7, fscCocCertificationItems_7);
    }

    public Set<Integer> getFscCocCertificationItems_8() {
        return fscCocCertificationItems_8;
    }

    public void setFscCocCertificationItems_8(Set<Integer> fscCocCertificationItems_8) {
        addAll(this.fscCocCertificationItems_8, fscCocCertificationItems_8);
    }

    public Set<Integer> getFscCocCertificationItems_9() {
        return fscCocCertificationItems_9;
    }

    public void setFscCocCertificationItems_9(Set<Integer> fscCocCertificationItems_9) {
        addAll(this.fscCocCertificationItems_9, fscCocCertificationItems_9);
    }

    public Set<Integer> getFscCocCertificationItems_10() {
        return fscCocCertificationItems_10;
    }

    public void setFscCocCertificationItems_10(Set<Integer> fscCocCertificationItems_10) {
        addAll(this.fscCocCertificationItems_10, fscCocCertificationItems_10);
    }

    public Set<Integer> getFscCocCertificationItems_11() {
        return fscCocCertificationItems_11;
    }

    public void setFscCocCertificationItems_11(Set<Integer> fscCocCertificationItems_11) {
        addAll(this.fscCocCertificationItems_11, fscCocCertificationItems_11);
    }

    public Set<Integer> getFscCocCertificationItems_12() {
        return fscCocCertificationItems_12;
    }

    public void setFscCocCertificationItems_12(Set<Integer> fscCocCertificationItems_12) {
        addAll(this.fscCocCertificationItems_12, fscCocCertificationItems_12);
    }

    public Set<Integer> getFscCocCertificationItems_13() {
        return fscCocCertificationItems_13;
    }

    public void setFscCocCertificationItems_13(Set<Integer> fscCocCertificationItems_13) {
        addAll(this.fscCocCertificationItems_13, fscCocCertificationItems_13);
    }

    public Set<Integer> getFscForestCertificationItems_1() {
        return fscForestCertificationItems_1;
    }

    public void setFscForestCertificationItems_1(Set<Integer> fscForestCertificationItems_1) {
        addAll(this.fscForestCertificationItems_1, fscForestCertificationItems_1);
    }

    public Set<Integer> getFscForestCertificationItems_2() {
        return fscForestCertificationItems_2;
    }

    public void setFscForestCertificationItems_2(Set<Integer> fscForestCertificationItems_2) {
        addAll(this.fscForestCertificationItems_2, fscForestCertificationItems_2);
    }

    public Set<Integer> getFscForestCertificationItems_3() {
        return fscForestCertificationItems_3;
    }

    public void setFscForestCertificationItems_3(Set<Integer> fscForestCertificationItems_3) {
        addAll(this.fscForestCertificationItems_3, fscForestCertificationItems_3);
    }

    public Set<Integer> getFscForestCertificationItems_4() {
        return fscForestCertificationItems_4;
    }

    public void setFscForestCertificationItems_4(Set<Integer> fscForestCertificationItems_4) {
        addAll(this.fscForestCertificationItems_4, fscForestCertificationItems_4);
    }

    public Set<Integer> getFscForestCertificationItems_5() {
        return fscForestCertificationItems_5;
    }

    public void setFscForestCertificationItems_5(Set<Integer> fscForestCertificationItems_5) {
        addAll(this.fscForestCertificationItems_5, fscForestCertificationItems_5);
    }

    public Set<Integer> getFscForestCertificationItems_6() {
        return fscForestCertificationItems_6;
    }

    public void setFscForestCertificationItems_6(Set<Integer> fscForestCertificationItems_6) {
        addAll(this.fscForestCertificationItems_6, fscForestCertificationItems_6);
    }

    public Set<Integer> getFscForestCertificationItems_7() {
        return fscForestCertificationItems_7;
    }

    public void setFscForestCertificationItems_7(Set<Integer> fscForestCertificationItems_7) {
        addAll(this.fscForestCertificationItems_7, fscForestCertificationItems_7);
    }

    public Set<Integer> getFscForestCertificationItems_8() {
        return fscForestCertificationItems_8;
    }

    public void setFscForestCertificationItems_8(Set<Integer> fscForestCertificationItems_8) {
        addAll(this.fscForestCertificationItems_8, fscForestCertificationItems_8);
    }

    public Set<Integer> getFscForestCertificationItems_9() {
        return fscForestCertificationItems_9;
    }

    public void setFscForestCertificationItems_9(Set<Integer> fscForestCertificationItems_9) {
        addAll(this.fscForestCertificationItems_9, fscForestCertificationItems_9);
    }

    public Set<Integer> getFscForestCertificationItems_10() {
        return fscForestCertificationItems_10;
    }

    public void setFscForestCertificationItems_10(Set<Integer> fscForestCertificationItems_10) {
        addAll(this.fscForestCertificationItems_10, fscForestCertificationItems_10);
    }

    public Set<Integer> getFscForestCertificationItems_11() {
        return fscForestCertificationItems_11;
    }

    public void setFscForestCertificationItems_11(Set<Integer> fscForestCertificationItems_11) {
        addAll(this.fscForestCertificationItems_11, fscForestCertificationItems_11);
    }

    public Set<Integer> getFscForestCertificationItems_12() {
        return fscForestCertificationItems_12;
    }

    public void setFscForestCertificationItems_12(Set<Integer> fscForestCertificationItems_12) {
        addAll(this.fscForestCertificationItems_12, fscForestCertificationItems_12);
    }

    public Set<Integer> getFscForestCertificationItems_13() {
        return fscForestCertificationItems_13;
    }

    public void setFscForestCertificationItems_13(Set<Integer> fscForestCertificationItems_13) {
        addAll(this.fscForestCertificationItems_13, fscForestCertificationItems_13);
    }

    public Set<Integer> getSfiHelpCommunication() {
        return sfiHelpCommunication;
    }

    public void setSfiHelpCommunication(Set<Integer> sfiHelpCommunication) {
        addAll(this.sfiHelpCommunication, sfiHelpCommunication);
    }

    public Set<Integer> getSfiMarketExternally() {
        return sfiMarketExternally;
    }

    public void setSfiMarketExternally(Set<Integer> sfiMarketExternally) {
        addAll(this.sfiMarketExternally, sfiMarketExternally);
    }

    public Set<Integer> getSfiServeBetter() {
        return sfiServeBetter;
    }

    public void setSfiServeBetter(Set<Integer> sfiServeBetter) {
        addAll(this.sfiServeBetter, sfiServeBetter);
    }

    public Set<SfiPpFormAllCountry> getAlsoFSCLabelFSC_Country_1() {
        return alsoFSCLabelFSC_Country_1;
    }

    public void setAlsoFSCLabelFSC_Country_1(Set<SfiPpFormAllCountry> alsoFSCLabelFSC_Country_1) {
        addAll(this.alsoFSCLabelFSC_Country_1, alsoFSCLabelFSC_Country_1);
    }

    public Set<SfiPpFormAllCountry> getAlsoFSCLabelFSC_Country_2() {
        return alsoFSCLabelFSC_Country_2;
    }

    public void setAlsoFSCLabelFSC_Country_2(Set<SfiPpFormAllCountry> alsoFSCLabelFSC_Country_2) {
        addAll(this.alsoFSCLabelFSC_Country_2, alsoFSCLabelFSC_Country_2);
    }

    public Set<SfiPpFormAllCountry> getAlsoFSCLabelFSC_Country_3() {
        return alsoFSCLabelFSC_Country_3;
    }

    public void setAlsoFSCLabelFSC_Country_3(Set<SfiPpFormAllCountry> alsoFSCLabelFSC_Country_3) {
        addAll(this.alsoFSCLabelFSC_Country_3, alsoFSCLabelFSC_Country_3);
    }

    public Set<SfiPpFormAllCountry> getAlsoFSCLabelFSC_Country_4() {
        return alsoFSCLabelFSC_Country_4;
    }

    public void setAlsoFSCLabelFSC_Country_4(Set<SfiPpFormAllCountry> alsoFSCLabelFSC_Country_4) {
        addAll(this.alsoFSCLabelFSC_Country_4, alsoFSCLabelFSC_Country_4);
    }

    public Set<SfiPpFormAllCountry> getAlsoFSCLabelFSC_Country_5() {
        return alsoFSCLabelFSC_Country_5;
    }

    public void setAlsoFSCLabelFSC_Country_5(Set<SfiPpFormAllCountry> alsoFSCLabelFSC_Country_5) {
        addAll(this.alsoFSCLabelFSC_Country_5, alsoFSCLabelFSC_Country_5);
    }

    public Set<SfiPpFormAllCountry> getAlsoFSCLabelFSC_Country_6() {
        return alsoFSCLabelFSC_Country_6;
    }

    public void setAlsoFSCLabelFSC_Country_6(Set<SfiPpFormAllCountry> alsoFSCLabelFSC_Country_6) {
        addAll(this.alsoFSCLabelFSC_Country_6, alsoFSCLabelFSC_Country_6);
    }

    public Set<SfiPpFormAllCountry> getAlsoFSCLabelFSC_Country_7() {
        return alsoFSCLabelFSC_Country_7;
    }

    public void setAlsoFSCLabelFSC_Country_7(Set<SfiPpFormAllCountry> alsoFSCLabelFSC_Country_7) {
        addAll(this.alsoFSCLabelFSC_Country_7, alsoFSCLabelFSC_Country_7);
    }

    public Set<SfiPpFormAllCountry> getAlsoFSCLabelFSC_Country_8() {
        return alsoFSCLabelFSC_Country_8;
    }

    public void setAlsoFSCLabelFSC_Country_8(Set<SfiPpFormAllCountry> alsoFSCLabelFSC_Country_8) {
        addAll(this.alsoFSCLabelFSC_Country_8, alsoFSCLabelFSC_Country_8);
    }

    public Set<SfiPpFormAllCountry> getAlsoFSCLabelFSC_Country_9() {
        return alsoFSCLabelFSC_Country_9;
    }

    public void setAlsoFSCLabelFSC_Country_9(Set<SfiPpFormAllCountry> alsoFSCLabelFSC_Country_9) {
        addAll(this.alsoFSCLabelFSC_Country_9, alsoFSCLabelFSC_Country_9);
    }

    public Set<SfiPpFormAllCountry> getAlsoFSCLabelFSC_Country_10() {
        return alsoFSCLabelFSC_Country_10;
    }

    public void setAlsoFSCLabelFSC_Country_10(Set<SfiPpFormAllCountry> alsoFSCLabelFSC_Country_10) {
        addAll(this.alsoFSCLabelFSC_Country_10, alsoFSCLabelFSC_Country_10);
    }

    public Set<SfiPpFormAllCountry> getAlsoFSCLabelFSC_Country_11() {
        return alsoFSCLabelFSC_Country_11;
    }

    public void setAlsoFSCLabelFSC_Country_11(Set<SfiPpFormAllCountry> alsoFSCLabelFSC_Country_11) {
        addAll(this.alsoFSCLabelFSC_Country_11, alsoFSCLabelFSC_Country_11);
    }

    public Set<SfiPpFormAllCountry> getAlsoFSCLabelFSC_Country_12() {
        return alsoFSCLabelFSC_Country_12;
    }

    public void setAlsoFSCLabelFSC_Country_12(Set<SfiPpFormAllCountry> alsoFSCLabelFSC_Country_12) {
        addAll(this.alsoFSCLabelFSC_Country_12, alsoFSCLabelFSC_Country_12);
    }

    public Set<SfiPpFormAllCountry> getAlsoFSCLabelFSC_Country_13() {
        return alsoFSCLabelFSC_Country_13;
    }

    public void setAlsoFSCLabelFSC_Country_13(Set<SfiPpFormAllCountry> alsoFSCLabelFSC_Country_13) {
        addAll(this.alsoFSCLabelFSC_Country_13, alsoFSCLabelFSC_Country_13);
    }
}

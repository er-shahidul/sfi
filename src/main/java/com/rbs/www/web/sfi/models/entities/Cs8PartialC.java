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

    @Column(name = "cs8_printingWritingPaper1", nullable = true)
    private String printingWritingPaper1;

    @Column(name = "cs8_packaging1", nullable = true)
    private String packaging1;

    @Column(name = "cs8_printingWritingPaper2", nullable = true)
    private String printingWritingPaper2;

    @Column(name = "cs8_packaging2", nullable = true)
    private String packaging2;

    @Column(name = "cs8_printingWritingPaper3", nullable = true)
    private String printingWritingPaper3;

    @Column(name = "cs8_packaging3", nullable = true)
    private String packaging3;

    @Column(name = "cs8_printingWritingPaper4", nullable = true)
    private String printingWritingPaper4;

    @Column(name = "cs8_packaging4", nullable = true)
    private String packaging4;

    @Column(name = "cs8_printingWritingPaper5", nullable = true)
    private String printingWritingPaper5;

    @Column(name = "cs8_packaging5", nullable = true)
    private String packaging5;

    @Column(name = "cs8_printingWritingPaper6", nullable = true)
    private String printingWritingPaper6;

    @Column(name = "cs8_packaging6", nullable = true)
    private String packaging6;

    @Column(name = "cs8_printingWritingPaper7", nullable = true)
    private String printingWritingPaper7;

    @Column(name = "cs8_packaging7", nullable = true)
    private String packaging7;

    @Column(name = "cs8_printingWritingPaper8", nullable = true)
    private String printingWritingPaper8;

    @Column(name = "cs8_packaging8", nullable = true)
    private String packaging8;

    @Column(name = "cs8_printingWritingPaper9", nullable = true)
    private String printingWritingPaper9;

    @Column(name = "cs8_packaging9", nullable = true)
    private String packaging9;

    @Column(name = "cs8_printingWritingPaper10", nullable = true)
    private String printingWritingPaper10;

    @Column(name = "cs8_packaging10", nullable = true)
    private String packaging10;

    @Column(name = "cs8_bioenergy1", nullable = true)
    private String bioenergy1;

    @Column(name = "cs8_bioenergy2", nullable = true)
    private String bioenergy2;

    @Column(name = "cs8_bioenergy3", nullable = true)
    private String bioenergy3;

    @Column(name = "cs8_bioenergy4", nullable = true)
    private String bioenergy4;

    @Column(name = "cs8_bioenergy5", nullable = true)
    private String bioenergy5;

    @Column(name = "cs8_bioenergy6", nullable = true)
    private String bioenergy6;

    @Column(name = "cs8_bioenergy7", nullable = true)
    private String bioenergy7;

    @Column(name = "cs8_bioenergy8", nullable = true)
    private String bioenergy8;

    @Column(name = "cs8_bioenergy9", nullable = true)
    private String bioenergy9;

    @Column(name = "cs8_bioenergy10", nullable = true)
    private String bioenergy10;

    @Column(name = "cs8_pulp1", nullable = true)
    private String pulp1;

    @Column(name = "cs8_pulp2", nullable = true)
    private String pulp2;

    @Column(name = "cs8_pulp3", nullable = true)
    private String pulp3;

    @Column(name = "cs8_pulp4", nullable = true)
    private String pulp4;

    @Column(name = "cs8_pulp5", nullable = true)
    private String pulp5;

    @Column(name = "cs8_pulp6", nullable = true)
    private String pulp6;

    @Column(name = "cs8_pulp7", nullable = true)
    private String pulp7;

    @Column(name = "cs8_pulp8", nullable = true)
    private String pulp8;

    @Column(name = "cs8_pulp9", nullable = true)
    private String pulp9;

    @Column(name = "cs8_pulp10", nullable = true)
    private String pulp10;

    @Column(name = "cs8_landOnly1", nullable = true)
    private String landOnly1;

    @Column(name = "cs8_landOnly2", nullable = true)
    private String landOnly2;

    @Column(name = "cs8_landOnly3", nullable = true)
    private String landOnly3;

    @Column(name = "cs8_landOnly4", nullable = true)
    private String landOnly4;

    @Column(name = "cs8_landOnly5", nullable = true)
    private String landOnly5;

    @Column(name = "cs8_landOnly6", nullable = true)
    private String landOnly6;

    @Column(name = "cs8_landOnly7", nullable = true)
    private String landOnly7;

    @Column(name = "cs8_landOnly8", nullable = true)
    private String landOnly8;

    @Column(name = "cs8_landOnly9", nullable = true)
    private String landOnly9;

    @Column(name = "cs8_landOnly10", nullable = true)
    private String landOnly10;

    @Column(name = "cs8_solidWoodProducts1", nullable = true)
    private String solidWoodProducts1;

    @Column(name = "cs8_solidWoodProducts2", nullable = true)
    private String solidWoodProducts2;

    @Column(name = "cs8_solidWoodProducts3", nullable = true)
    private String solidWoodProducts3;

    @Column(name = "cs8_solidWoodProducts4", nullable = true)
    private String solidWoodProducts4;

    @Column(name = "cs8_solidWoodProducts5", nullable = true)
    private String solidWoodProducts5;

    @Column(name = "cs8_solidWoodProducts6", nullable = true)
    private String solidWoodProducts6;

    @Column(name = "cs8_solidWoodProducts7", nullable = true)
    private String solidWoodProducts7;

    @Column(name = "cs8_solidWoodProducts8", nullable = true)
    private String solidWoodProducts8;

    @Column(name = "cs8_solidWoodProducts9", nullable = true)
    private String solidWoodProducts9;

    @Column(name = "cs8_solidWoodProducts10", nullable = true)
    private String solidWoodProducts10;

    @Column(name = "cs8_paperBroker1", nullable = true)
    private String paperBroker1;

    @Column(name = "cs8_paperBroker2", nullable = true)
    private String paperBroker2;

    @Column(name = "cs8_paperBroker3", nullable = true)
    private String paperBroker3;

    @Column(name = "cs8_paperBroker4", nullable = true)
    private String paperBroker4;

    @Column(name = "cs8_paperBroker5", nullable = true)
    private String paperBroker5;

    @Column(name = "cs8_paperBroker6", nullable = true)
    private String paperBroker6;

    @Column(name = "cs8_paperBroker7", nullable = true)
    private String paperBroker7;

    @Column(name = "cs8_paperBroker8", nullable = true)
    private String paperBroker8;

    @Column(name = "cs8_paperBroker9", nullable = true)
    private String paperBroker9;

    @Column(name = "cs8_paperBroker10", nullable = true)
    private String paperBroker10;

    @Column(name = "cs8_paperboardConverter1", nullable = true)
    private String paperboardConverter1;

    @Column(name = "cs8_paperboardConverter2", nullable = true)
    private String paperboardConverter2;

    @Column(name = "cs8_paperboardConverter3", nullable = true)
    private String paperboardConverter3;

    @Column(name = "cs8_paperboardConverter4", nullable = true)
    private String paperboardConverter4;

    @Column(name = "cs8_paperboardConverter5", nullable = true)
    private String paperboardConverter5;

    @Column(name = "cs8_paperboardConverter6", nullable = true)
    private String paperboardConverter6;

    @Column(name = "cs8_paperboardConverter7", nullable = true)
    private String paperboardConverter7;

    @Column(name = "cs8_paperboardConverter8", nullable = true)
    private String paperboardConverter8;

    @Column(name = "cs8_paperboardConverter9", nullable = true)
    private String paperboardConverter9;

    @Column(name = "cs8_paperboardConverter10", nullable = true)
    private String paperboardConverter10;

    @Column(name = "cs8_furniture1", nullable = true)
    private String furniture1;

    @Column(name = "cs8_furniture2", nullable = true)
    private String furniture2;

    @Column(name = "cs8_furniture3", nullable = true)
    private String furniture3;

    @Column(name = "cs8_furniture4", nullable = true)
    private String furniture4;

    @Column(name = "cs8_furniture5", nullable = true)
    private String furniture5;

    @Column(name = "cs8_furniture6", nullable = true)
    private String furniture6;

    @Column(name = "cs8_furniture7", nullable = true)
    private String furniture7;

    @Column(name = "cs8_furniture8", nullable = true)
    private String furniture8;

    @Column(name = "cs8_furniture9", nullable = true)
    private String furniture9;

    @Column(name = "cs8_furniture10", nullable = true)
    private String furniture10;

    @Column(name = "cs8_towel1", nullable = true)
    private String towel1;

    @Column(name = "cs8_towel2", nullable = true)
    private String towel2;

    @Column(name = "cs8_towel3", nullable = true)
    private String towel3;

    @Column(name = "cs8_towel4", nullable = true)
    private String towel4;

    @Column(name = "cs8_towel5", nullable = true)
    private String towel5;

    @Column(name = "cs8_towel6", nullable = true)
    private String towel6;

    @Column(name = "cs8_towel7", nullable = true)
    private String towel7;

    @Column(name = "cs8_towel8", nullable = true)
    private String towel8;

    @Column(name = "cs8_towel9", nullable = true)
    private String towel9;

    @Column(name = "cs8_towel10", nullable = true)
    private String towel10;

    @Column(name = "cs8_printer1", nullable = true)
    private String printer1;

    @Column(name = "cs8_printer2", nullable = true)
    private String printer2;

    @Column(name = "cs8_printer3", nullable = true)
    private String printer3;

    @Column(name = "cs8_printer4", nullable = true)
    private String printer4;

    @Column(name = "cs8_printer5", nullable = true)
    private String printer5;

    @Column(name = "cs8_printer6", nullable = true)
    private String printer6;

    @Column(name = "cs8_printer7", nullable = true)
    private String printer7;

    @Column(name = "cs8_printer8", nullable = true)
    private String printer8;

    @Column(name = "cs8_printer9", nullable = true)
    private String printer9;

    @Column(name = "cs8_printer10", nullable = true)
    private String printer10;

    @Column(name = "cs8_woodBroker1", nullable = true)
    private String woodBroker1;

    @Column(name = "cs8_woodBroker2", nullable = true)
    private String woodBroker2;

    @Column(name = "cs8_woodBroker3", nullable = true)
    private String woodBroker3;

    @Column(name = "cs8_woodBroker4", nullable = true)
    private String woodBroker4;

    @Column(name = "cs8_woodBroker5", nullable = true)
    private String woodBroker5;

    @Column(name = "cs8_woodBroker6", nullable = true)
    private String woodBroker6;

    @Column(name = "cs8_woodBroker7", nullable = true)
    private String woodBroker7;

    @Column(name = "cs8_woodBroker8", nullable = true)
    private String woodBroker8;

    @Column(name = "cs8_woodBroker9", nullable = true)
    private String woodBroker9;

    @Column(name = "cs8_woodBroker10", nullable = true)
    private String woodBroker10;

    @Column(name = "cs8_other1", nullable = true)
    private String other1;

    @Column(name = "cs8_other2", nullable = true)
    private String other2;

    @Column(name = "cs8_other3", nullable = true)
    private String other3;

    @Column(name = "cs8_other4", nullable = true)
    private String other4;

    @Column(name = "cs8_other5", nullable = true)
    private String other5;

    @Column(name = "cs8_other6", nullable = true)
    private String other6;

    @Column(name = "cs8_other7", nullable = true)
    private String other7;

    @Column(name = "cs8_other8", nullable = true)
    private String other8;

    @Column(name = "cs8_other9", nullable = true)
    private String other9;

    @Column(name = "cs8_other10", nullable = true)
    private String other10;

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

    public String getPrintingWritingPaper1() {
        return printingWritingPaper1;
    }

    public void setPrintingWritingPaper1(String printingWritingPaper1) {
        this.printingWritingPaper1 = printingWritingPaper1;
    }

    public String getPackaging1() {
        return packaging1;
    }

    public void setPackaging1(String packaging1) {
        this.packaging1 = packaging1;
    }

    public String getPrintingWritingPaper2() {
        return printingWritingPaper2;
    }

    public void setPrintingWritingPaper2(String printingWritingPaper2) {
        this.printingWritingPaper2 = printingWritingPaper2;
    }

    public String getPackaging2() {
        return packaging2;
    }

    public void setPackaging2(String packaging2) {
        this.packaging2 = packaging2;
    }

    public String getPrintingWritingPaper3() {
        return printingWritingPaper3;
    }

    public void setPrintingWritingPaper3(String printingWritingPaper3) {
        this.printingWritingPaper3 = printingWritingPaper3;
    }

    public String getPackaging3() {
        return packaging3;
    }

    public void setPackaging3(String packaging3) {
        this.packaging3 = packaging3;
    }

    public String getPrintingWritingPaper4() {
        return printingWritingPaper4;
    }

    public void setPrintingWritingPaper4(String printingWritingPaper4) {
        this.printingWritingPaper4 = printingWritingPaper4;
    }

    public String getPackaging4() {
        return packaging4;
    }

    public void setPackaging4(String packaging4) {
        this.packaging4 = packaging4;
    }

    public String getPrintingWritingPaper5() {
        return printingWritingPaper5;
    }

    public void setPrintingWritingPaper5(String printingWritingPaper5) {
        this.printingWritingPaper5 = printingWritingPaper5;
    }

    public String getPackaging5() {
        return packaging5;
    }

    public void setPackaging5(String packaging5) {
        this.packaging5 = packaging5;
    }

    public String getPrintingWritingPaper6() {
        return printingWritingPaper6;
    }

    public void setPrintingWritingPaper6(String printingWritingPaper6) {
        this.printingWritingPaper6 = printingWritingPaper6;
    }

    public String getPackaging6() {
        return packaging6;
    }

    public void setPackaging6(String packaging6) {
        this.packaging6 = packaging6;
    }

    public String getPrintingWritingPaper7() {
        return printingWritingPaper7;
    }

    public void setPrintingWritingPaper7(String printingWritingPaper7) {
        this.printingWritingPaper7 = printingWritingPaper7;
    }

    public String getPackaging7() {
        return packaging7;
    }

    public void setPackaging7(String packaging7) {
        this.packaging7 = packaging7;
    }

    public String getPrintingWritingPaper8() {
        return printingWritingPaper8;
    }

    public void setPrintingWritingPaper8(String printingWritingPaper8) {
        this.printingWritingPaper8 = printingWritingPaper8;
    }

    public String getPackaging8() {
        return packaging8;
    }

    public void setPackaging8(String packaging8) {
        this.packaging8 = packaging8;
    }

    public String getPrintingWritingPaper9() {
        return printingWritingPaper9;
    }

    public void setPrintingWritingPaper9(String printingWritingPaper9) {
        this.printingWritingPaper9 = printingWritingPaper9;
    }

    public String getPackaging9() {
        return packaging9;
    }

    public void setPackaging9(String packaging9) {
        this.packaging9 = packaging9;
    }

    public String getPrintingWritingPaper10() {
        return printingWritingPaper10;
    }

    public void setPrintingWritingPaper10(String printingWritingPaper10) {
        this.printingWritingPaper10 = printingWritingPaper10;
    }

    public String getPackaging10() {
        return packaging10;
    }

    public void setPackaging10(String packaging10) {
        this.packaging10 = packaging10;
    }

    public String getBioenergy1() {
        return bioenergy1;
    }

    public void setBioenergy1(String bioenergy1) {
        this.bioenergy1 = bioenergy1;
    }

    public String getBioenergy2() {
        return bioenergy2;
    }

    public void setBioenergy2(String bioenergy2) {
        this.bioenergy2 = bioenergy2;
    }

    public String getBioenergy3() {
        return bioenergy3;
    }

    public void setBioenergy3(String bioenergy3) {
        this.bioenergy3 = bioenergy3;
    }

    public String getBioenergy4() {
        return bioenergy4;
    }

    public void setBioenergy4(String bioenergy4) {
        this.bioenergy4 = bioenergy4;
    }

    public String getBioenergy5() {
        return bioenergy5;
    }

    public void setBioenergy5(String bioenergy5) {
        this.bioenergy5 = bioenergy5;
    }

    public String getBioenergy6() {
        return bioenergy6;
    }

    public void setBioenergy6(String bioenergy6) {
        this.bioenergy6 = bioenergy6;
    }

    public String getBioenergy7() {
        return bioenergy7;
    }

    public void setBioenergy7(String bioenergy7) {
        this.bioenergy7 = bioenergy7;
    }

    public String getBioenergy8() {
        return bioenergy8;
    }

    public void setBioenergy8(String bioenergy8) {
        this.bioenergy8 = bioenergy8;
    }

    public String getBioenergy9() {
        return bioenergy9;
    }

    public void setBioenergy9(String bioenergy9) {
        this.bioenergy9 = bioenergy9;
    }

    public String getBioenergy10() {
        return bioenergy10;
    }

    public void setBioenergy10(String bioenergy10) {
        this.bioenergy10 = bioenergy10;
    }

    public String getPulp1() {
        return pulp1;
    }

    public void setPulp1(String pulp1) {
        this.pulp1 = pulp1;
    }

    public String getPulp2() {
        return pulp2;
    }

    public void setPulp2(String pulp2) {
        this.pulp2 = pulp2;
    }

    public String getPulp3() {
        return pulp3;
    }

    public void setPulp3(String pulp3) {
        this.pulp3 = pulp3;
    }

    public String getPulp4() {
        return pulp4;
    }

    public void setPulp4(String pulp4) {
        this.pulp4 = pulp4;
    }

    public String getPulp5() {
        return pulp5;
    }

    public void setPulp5(String pulp5) {
        this.pulp5 = pulp5;
    }

    public String getPulp6() {
        return pulp6;
    }

    public void setPulp6(String pulp6) {
        this.pulp6 = pulp6;
    }

    public String getPulp7() {
        return pulp7;
    }

    public void setPulp7(String pulp7) {
        this.pulp7 = pulp7;
    }

    public String getPulp8() {
        return pulp8;
    }

    public void setPulp8(String pulp8) {
        this.pulp8 = pulp8;
    }

    public String getPulp9() {
        return pulp9;
    }

    public void setPulp9(String pulp9) {
        this.pulp9 = pulp9;
    }

    public String getPulp10() {
        return pulp10;
    }

    public void setPulp10(String pulp10) {
        this.pulp10 = pulp10;
    }

    public String getLandOnly1() {
        return landOnly1;
    }

    public void setLandOnly1(String landOnly1) {
        this.landOnly1 = landOnly1;
    }

    public String getLandOnly2() {
        return landOnly2;
    }

    public void setLandOnly2(String landOnly2) {
        this.landOnly2 = landOnly2;
    }

    public String getLandOnly3() {
        return landOnly3;
    }

    public void setLandOnly3(String landOnly3) {
        this.landOnly3 = landOnly3;
    }

    public String getLandOnly4() {
        return landOnly4;
    }

    public void setLandOnly4(String landOnly4) {
        this.landOnly4 = landOnly4;
    }

    public String getLandOnly5() {
        return landOnly5;
    }

    public void setLandOnly5(String landOnly5) {
        this.landOnly5 = landOnly5;
    }

    public String getLandOnly6() {
        return landOnly6;
    }

    public void setLandOnly6(String landOnly6) {
        this.landOnly6 = landOnly6;
    }

    public String getLandOnly7() {
        return landOnly7;
    }

    public void setLandOnly7(String landOnly7) {
        this.landOnly7 = landOnly7;
    }

    public String getLandOnly8() {
        return landOnly8;
    }

    public void setLandOnly8(String landOnly8) {
        this.landOnly8 = landOnly8;
    }

    public String getLandOnly9() {
        return landOnly9;
    }

    public void setLandOnly9(String landOnly9) {
        this.landOnly9 = landOnly9;
    }

    public String getLandOnly10() {
        return landOnly10;
    }

    public void setLandOnly10(String landOnly10) {
        this.landOnly10 = landOnly10;
    }

    public String getSolidWoodProducts1() {
        return solidWoodProducts1;
    }

    public void setSolidWoodProducts1(String solidWoodProducts1) {
        this.solidWoodProducts1 = solidWoodProducts1;
    }

    public String getSolidWoodProducts2() {
        return solidWoodProducts2;
    }

    public void setSolidWoodProducts2(String solidWoodProducts2) {
        this.solidWoodProducts2 = solidWoodProducts2;
    }

    public String getSolidWoodProducts3() {
        return solidWoodProducts3;
    }

    public void setSolidWoodProducts3(String solidWoodProducts3) {
        this.solidWoodProducts3 = solidWoodProducts3;
    }

    public String getSolidWoodProducts4() {
        return solidWoodProducts4;
    }

    public void setSolidWoodProducts4(String solidWoodProducts4) {
        this.solidWoodProducts4 = solidWoodProducts4;
    }

    public String getSolidWoodProducts5() {
        return solidWoodProducts5;
    }

    public void setSolidWoodProducts5(String solidWoodProducts5) {
        this.solidWoodProducts5 = solidWoodProducts5;
    }

    public String getSolidWoodProducts6() {
        return solidWoodProducts6;
    }

    public void setSolidWoodProducts6(String solidWoodProducts6) {
        this.solidWoodProducts6 = solidWoodProducts6;
    }

    public String getSolidWoodProducts7() {
        return solidWoodProducts7;
    }

    public void setSolidWoodProducts7(String solidWoodProducts7) {
        this.solidWoodProducts7 = solidWoodProducts7;
    }

    public String getSolidWoodProducts8() {
        return solidWoodProducts8;
    }

    public void setSolidWoodProducts8(String solidWoodProducts8) {
        this.solidWoodProducts8 = solidWoodProducts8;
    }

    public String getSolidWoodProducts9() {
        return solidWoodProducts9;
    }

    public void setSolidWoodProducts9(String solidWoodProducts9) {
        this.solidWoodProducts9 = solidWoodProducts9;
    }

    public String getSolidWoodProducts10() {
        return solidWoodProducts10;
    }

    public void setSolidWoodProducts10(String solidWoodProducts10) {
        this.solidWoodProducts10 = solidWoodProducts10;
    }

    public String getPaperBroker1() {
        return paperBroker1;
    }

    public void setPaperBroker1(String paperBroker1) {
        this.paperBroker1 = paperBroker1;
    }

    public String getPaperBroker2() {
        return paperBroker2;
    }

    public void setPaperBroker2(String paperBroker2) {
        this.paperBroker2 = paperBroker2;
    }

    public String getPaperBroker3() {
        return paperBroker3;
    }

    public void setPaperBroker3(String paperBroker3) {
        this.paperBroker3 = paperBroker3;
    }

    public String getPaperBroker4() {
        return paperBroker4;
    }

    public void setPaperBroker4(String paperBroker4) {
        this.paperBroker4 = paperBroker4;
    }

    public String getPaperBroker5() {
        return paperBroker5;
    }

    public void setPaperBroker5(String paperBroker5) {
        this.paperBroker5 = paperBroker5;
    }

    public String getPaperBroker6() {
        return paperBroker6;
    }

    public void setPaperBroker6(String paperBroker6) {
        this.paperBroker6 = paperBroker6;
    }

    public String getPaperBroker7() {
        return paperBroker7;
    }

    public void setPaperBroker7(String paperBroker7) {
        this.paperBroker7 = paperBroker7;
    }

    public String getPaperBroker8() {
        return paperBroker8;
    }

    public void setPaperBroker8(String paperBroker8) {
        this.paperBroker8 = paperBroker8;
    }

    public String getPaperBroker9() {
        return paperBroker9;
    }

    public void setPaperBroker9(String paperBroker9) {
        this.paperBroker9 = paperBroker9;
    }

    public String getPaperBroker10() {
        return paperBroker10;
    }

    public void setPaperBroker10(String paperBroker10) {
        this.paperBroker10 = paperBroker10;
    }

    public String getPaperboardConverter1() {
        return paperboardConverter1;
    }

    public void setPaperboardConverter1(String paperboardConverter1) {
        this.paperboardConverter1 = paperboardConverter1;
    }

    public String getPaperboardConverter2() {
        return paperboardConverter2;
    }

    public void setPaperboardConverter2(String paperboardConverter2) {
        this.paperboardConverter2 = paperboardConverter2;
    }

    public String getPaperboardConverter3() {
        return paperboardConverter3;
    }

    public void setPaperboardConverter3(String paperboardConverter3) {
        this.paperboardConverter3 = paperboardConverter3;
    }

    public String getPaperboardConverter4() {
        return paperboardConverter4;
    }

    public void setPaperboardConverter4(String paperboardConverter4) {
        this.paperboardConverter4 = paperboardConverter4;
    }

    public String getPaperboardConverter5() {
        return paperboardConverter5;
    }

    public void setPaperboardConverter5(String paperboardConverter5) {
        this.paperboardConverter5 = paperboardConverter5;
    }

    public String getPaperboardConverter6() {
        return paperboardConverter6;
    }

    public void setPaperboardConverter6(String paperboardConverter6) {
        this.paperboardConverter6 = paperboardConverter6;
    }

    public String getPaperboardConverter7() {
        return paperboardConverter7;
    }

    public void setPaperboardConverter7(String paperboardConverter7) {
        this.paperboardConverter7 = paperboardConverter7;
    }

    public String getPaperboardConverter8() {
        return paperboardConverter8;
    }

    public void setPaperboardConverter8(String paperboardConverter8) {
        this.paperboardConverter8 = paperboardConverter8;
    }

    public String getPaperboardConverter9() {
        return paperboardConverter9;
    }

    public void setPaperboardConverter9(String paperboardConverter9) {
        this.paperboardConverter9 = paperboardConverter9;
    }

    public String getPaperboardConverter10() {
        return paperboardConverter10;
    }

    public void setPaperboardConverter10(String paperboardConverter10) {
        this.paperboardConverter10 = paperboardConverter10;
    }

    public String getFurniture1() {
        return furniture1;
    }

    public void setFurniture1(String furniture1) {
        this.furniture1 = furniture1;
    }

    public String getFurniture2() {
        return furniture2;
    }

    public void setFurniture2(String furniture2) {
        this.furniture2 = furniture2;
    }

    public String getFurniture3() {
        return furniture3;
    }

    public void setFurniture3(String furniture3) {
        this.furniture3 = furniture3;
    }

    public String getFurniture4() {
        return furniture4;
    }

    public void setFurniture4(String furniture4) {
        this.furniture4 = furniture4;
    }

    public String getFurniture5() {
        return furniture5;
    }

    public void setFurniture5(String furniture5) {
        this.furniture5 = furniture5;
    }

    public String getFurniture6() {
        return furniture6;
    }

    public void setFurniture6(String furniture6) {
        this.furniture6 = furniture6;
    }

    public String getFurniture7() {
        return furniture7;
    }

    public void setFurniture7(String furniture7) {
        this.furniture7 = furniture7;
    }

    public String getFurniture8() {
        return furniture8;
    }

    public void setFurniture8(String furniture8) {
        this.furniture8 = furniture8;
    }

    public String getFurniture9() {
        return furniture9;
    }

    public void setFurniture9(String furniture9) {
        this.furniture9 = furniture9;
    }

    public String getFurniture10() {
        return furniture10;
    }

    public void setFurniture10(String furniture10) {
        this.furniture10 = furniture10;
    }

    public String getTowel1() {
        return towel1;
    }

    public void setTowel1(String towel1) {
        this.towel1 = towel1;
    }

    public String getTowel2() {
        return towel2;
    }

    public void setTowel2(String towel2) {
        this.towel2 = towel2;
    }

    public String getTowel3() {
        return towel3;
    }

    public void setTowel3(String towel3) {
        this.towel3 = towel3;
    }

    public String getTowel4() {
        return towel4;
    }

    public void setTowel4(String towel4) {
        this.towel4 = towel4;
    }

    public String getTowel5() {
        return towel5;
    }

    public void setTowel5(String towel5) {
        this.towel5 = towel5;
    }

    public String getTowel6() {
        return towel6;
    }

    public void setTowel6(String towel6) {
        this.towel6 = towel6;
    }

    public String getTowel7() {
        return towel7;
    }

    public void setTowel7(String towel7) {
        this.towel7 = towel7;
    }

    public String getTowel8() {
        return towel8;
    }

    public void setTowel8(String towel8) {
        this.towel8 = towel8;
    }

    public String getTowel9() {
        return towel9;
    }

    public void setTowel9(String towel9) {
        this.towel9 = towel9;
    }

    public String getTowel10() {
        return towel10;
    }

    public void setTowel10(String towel10) {
        this.towel10 = towel10;
    }

    public String getPrinter1() {
        return printer1;
    }

    public void setPrinter1(String printer1) {
        this.printer1 = printer1;
    }

    public String getPrinter2() {
        return printer2;
    }

    public void setPrinter2(String printer2) {
        this.printer2 = printer2;
    }

    public String getPrinter3() {
        return printer3;
    }

    public void setPrinter3(String printer3) {
        this.printer3 = printer3;
    }

    public String getPrinter4() {
        return printer4;
    }

    public void setPrinter4(String printer4) {
        this.printer4 = printer4;
    }

    public String getPrinter5() {
        return printer5;
    }

    public void setPrinter5(String printer5) {
        this.printer5 = printer5;
    }

    public String getPrinter6() {
        return printer6;
    }

    public void setPrinter6(String printer6) {
        this.printer6 = printer6;
    }

    public String getPrinter7() {
        return printer7;
    }

    public void setPrinter7(String printer7) {
        this.printer7 = printer7;
    }

    public String getPrinter8() {
        return printer8;
    }

    public void setPrinter8(String printer8) {
        this.printer8 = printer8;
    }

    public String getPrinter9() {
        return printer9;
    }

    public void setPrinter9(String printer9) {
        this.printer9 = printer9;
    }

    public String getPrinter10() {
        return printer10;
    }

    public void setPrinter10(String printer10) {
        this.printer10 = printer10;
    }

    public String getWoodBroker1() {
        return woodBroker1;
    }

    public void setWoodBroker1(String woodBroker1) {
        this.woodBroker1 = woodBroker1;
    }

    public String getWoodBroker2() {
        return woodBroker2;
    }

    public void setWoodBroker2(String woodBroker2) {
        this.woodBroker2 = woodBroker2;
    }

    public String getWoodBroker3() {
        return woodBroker3;
    }

    public void setWoodBroker3(String woodBroker3) {
        this.woodBroker3 = woodBroker3;
    }

    public String getWoodBroker4() {
        return woodBroker4;
    }

    public void setWoodBroker4(String woodBroker4) {
        this.woodBroker4 = woodBroker4;
    }

    public String getWoodBroker5() {
        return woodBroker5;
    }

    public void setWoodBroker5(String woodBroker5) {
        this.woodBroker5 = woodBroker5;
    }

    public String getWoodBroker6() {
        return woodBroker6;
    }

    public void setWoodBroker6(String woodBroker6) {
        this.woodBroker6 = woodBroker6;
    }

    public String getWoodBroker7() {
        return woodBroker7;
    }

    public void setWoodBroker7(String woodBroker7) {
        this.woodBroker7 = woodBroker7;
    }

    public String getWoodBroker8() {
        return woodBroker8;
    }

    public void setWoodBroker8(String woodBroker8) {
        this.woodBroker8 = woodBroker8;
    }

    public String getWoodBroker9() {
        return woodBroker9;
    }

    public void setWoodBroker9(String woodBroker9) {
        this.woodBroker9 = woodBroker9;
    }

    public String getWoodBroker10() {
        return woodBroker10;
    }

    public void setWoodBroker10(String woodBroker10) {
        this.woodBroker10 = woodBroker10;
    }

    public String getOther1() {
        return other1;
    }

    public void setOther1(String other1) {
        this.other1 = other1;
    }

    public String getOther2() {
        return other2;
    }

    public void setOther2(String other2) {
        this.other2 = other2;
    }

    public String getOther3() {
        return other3;
    }

    public void setOther3(String other3) {
        this.other3 = other3;
    }

    public String getOther4() {
        return other4;
    }

    public void setOther4(String other4) {
        this.other4 = other4;
    }

    public String getOther5() {
        return other5;
    }

    public void setOther5(String other5) {
        this.other5 = other5;
    }

    public String getOther6() {
        return other6;
    }

    public void setOther6(String other6) {
        this.other6 = other6;
    }

    public String getOther7() {
        return other7;
    }

    public void setOther7(String other7) {
        this.other7 = other7;
    }

    public String getOther8() {
        return other8;
    }

    public void setOther8(String other8) {
        this.other8 = other8;
    }

    public String getOther9() {
        return other9;
    }

    public void setOther9(String other9) {
        this.other9 = other9;
    }

    public String getOther10() {
        return other10;
    }

    public void setOther10(String other10) {
        this.other10 = other10;
    }
}

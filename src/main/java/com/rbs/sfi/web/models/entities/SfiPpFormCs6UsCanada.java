package com.rbs.sfi.web.models.entities;

import com.rbs.sfi.common.models.BaseEntityModel;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sfi_pp_form_cs6_us_canada")
public class SfiPpFormCs6UsCanada extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(targetEntity = Cs6.class, optional = true)
    @JoinColumn(name = "form_id", nullable = true)
    private Cs6 sfiPpForm;

    @ManyToOne(targetEntity = SfiPpFormRegion.class, optional = true)
    @JoinColumn(name = "region_id", nullable = true)
    private SfiPpFormRegion region;

    @Column(name = "cs6_usCanada_unit_1", nullable = true)
    private Integer unit1;

    @Column(name = "cs6_usCanada_volume_1", nullable = true)
    private String volume1;

    @Column(name = "cs6_usCanada_percDeliveredQualifiedLogging_1", nullable = true)
    private String percDeliveredQualifiedLogging1;

    @Column(name = "cs6_usCanada_percSFIOnlyCertified_1", nullable = true)
    private String percSFIOnlyCertified1;

    @Column(name = "cs6_usCanada_percATFSOnlyCertified_1", nullable = true)
    private String percATFSOnlyCertified1;

    @Column(name = "cs6_usCanada_percCSAOnlyCertified_1", nullable = true)
    private String percCSAOnlyCertified1;

    @Column(name = "cs6_usCanada_percFSCOnlyCertified_1", nullable = true)
    private String percFSCOnlyCertified1;

    @Column(name = "cs6_usCanada_moreThanOneStandard_1", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> moreThanOneStandard1;

    @Column(name = "cs6_usCanada_other", nullable = true)
    private Boolean other;

    @Column(name = "cs6_usCanada_otherLabel", nullable = true)
    private String otherLabel;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_1_1", nullable = true)
    private Float percCertifedMoreThanOneStandard11;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_2_1", nullable = true)
    private Float percCertifedMoreThanOneStandard21;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_3_1", nullable = true)
    private Float percCertifedMoreThanOneStandard31;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_4_1", nullable = true)
    private Float percCertifedMoreThanOneStandard41;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_5_1", nullable = true)
    private Float percCertifedMoreThanOneStandard51;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_6_1", nullable = true)
    private Float percCertifedMoreThanOneStandard61;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_7_1", nullable = true)
    private Float percCertifedMoreThanOneStandard71;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_1_2", nullable = true)
    private Float percCertifedMoreThanOneStandard12;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_2_2", nullable = true)
    private Float percCertifedMoreThanOneStandard22;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_3_2", nullable = true)
    private Float percCertifedMoreThanOneStandard32;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_4_2", nullable = true)
    private Float percCertifedMoreThanOneStandard42;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_5_2", nullable = true)
    private Float percCertifedMoreThanOneStandard52;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_6_2", nullable = true)
    private Float percCertifedMoreThanOneStandard62;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_7_2", nullable = true)
    private Float percCertifedMoreThanOneStandard72;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_1_3", nullable = true)
    private Float percCertifedMoreThanOneStandard13;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_2_3", nullable = true)
    private Float percCertifedMoreThanOneStandard23;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_3_3", nullable = true)
    private Float percCertifedMoreThanOneStandard33;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_4_3", nullable = true)
    private Float percCertifedMoreThanOneStandard43;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_5_3", nullable = true)
    private Float percCertifedMoreThanOneStandard53;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_6_3", nullable = true)
    private Float percCertifedMoreThanOneStandard63;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_7_3", nullable = true)
    private Float percCertifedMoreThanOneStandard73;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_1_4", nullable = true)
    private Float percCertifedMoreThanOneStandard14;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_2_4", nullable = true)
    private Float percCertifedMoreThanOneStandard24;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_3_4", nullable = true)
    private Float percCertifedMoreThanOneStandard34;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_4_4", nullable = true)
    private Float percCertifedMoreThanOneStandard44;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_5_4", nullable = true)
    private Float percCertifedMoreThanOneStandard54;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_6_4", nullable = true)
    private Float percCertifedMoreThanOneStandard64;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_7_4", nullable = true)
    private Float percCertifedMoreThanOneStandard74;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_1_5", nullable = true)
    private Float percCertifedMoreThanOneStandard15;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_2_5", nullable = true)
    private Float percCertifedMoreThanOneStandard25;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_3_5", nullable = true)
    private Float percCertifedMoreThanOneStandard35;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_4_5", nullable = true)
    private Float percCertifedMoreThanOneStandard45;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_5_5", nullable = true)
    private Float percCertifedMoreThanOneStandard55;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_6_5", nullable = true)
    private Float percCertifedMoreThanOneStandard65;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_7_5", nullable = true)
    private Float percCertifedMoreThanOneStandard75;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_1_6", nullable = true)
    private Float percCertifedMoreThanOneStandard16;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_2_6", nullable = true)
    private Float percCertifedMoreThanOneStandard26;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_3_6", nullable = true)
    private Float percCertifedMoreThanOneStandard36;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_4_6", nullable = true)
    private Float percCertifedMoreThanOneStandard46;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_5_6", nullable = true)
    private Float percCertifedMoreThanOneStandard56;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_6_6", nullable = true)
    private Float percCertifedMoreThanOneStandard66;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_7_6", nullable = true)
    private Float percCertifedMoreThanOneStandard76;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_1_7", nullable = true)
    private Float percCertifedMoreThanOneStandard17;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_2_7", nullable = true)
    private Float percCertifedMoreThanOneStandard27;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_3_7", nullable = true)
    private Float percCertifedMoreThanOneStandard37;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_4_7", nullable = true)
    private Float percCertifedMoreThanOneStandard47;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_5_7", nullable = true)
    private Float percCertifedMoreThanOneStandard57;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_6_7", nullable = true)
    private Float percCertifedMoreThanOneStandard67;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_7_7", nullable = true)
    private Float percCertifedMoreThanOneStandard77;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_1_8", nullable = true)
    private Float percCertifedMoreThanOneStandard18;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_2_8", nullable = true)
    private Float percCertifedMoreThanOneStandard28;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_3_8", nullable = true)
    private Float percCertifedMoreThanOneStandard38;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_4_8", nullable = true)
    private Float percCertifedMoreThanOneStandard48;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_5_8", nullable = true)
    private Float percCertifedMoreThanOneStandard58;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_6_8", nullable = true)
    private Float percCertifedMoreThanOneStandard68;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_7_8", nullable = true)
    private Float percCertifedMoreThanOneStandard78;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_1_9", nullable = true)
    private Float percCertifedMoreThanOneStandard19;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_2_9", nullable = true)
    private Float percCertifedMoreThanOneStandard29;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_3_9", nullable = true)
    private Float percCertifedMoreThanOneStandard39;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_4_9", nullable = true)
    private Float percCertifedMoreThanOneStandard49;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_5_9", nullable = true)
    private Float percCertifedMoreThanOneStandard59;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_6_9", nullable = true)
    private Float percCertifedMoreThanOneStandard69;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_7_9", nullable = true)
    private Float percCertifedMoreThanOneStandard79;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_1_10", nullable = true)
    private Float percCertifedMoreThanOneStandard110;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_2_10", nullable = true)
    private Float percCertifedMoreThanOneStandard210;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_3_10", nullable = true)
    private Float percCertifedMoreThanOneStandard310;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_4_10", nullable = true)
    private Float percCertifedMoreThanOneStandard410;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_5_10", nullable = true)
    private Float percCertifedMoreThanOneStandard510;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_6_10", nullable = true)
    private Float percCertifedMoreThanOneStandard610;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_7_10", nullable = true)
    private Float percCertifedMoreThanOneStandard710;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_1_11", nullable = true)
    private Float percCertifedMoreThanOneStandard111;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_2_11", nullable = true)
    private Float percCertifedMoreThanOneStandard211;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_3_11", nullable = true)
    private Float percCertifedMoreThanOneStandard311;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_4_11", nullable = true)
    private Float percCertifedMoreThanOneStandard411;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_5_11", nullable = true)
    private Float percCertifedMoreThanOneStandard511;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_6_11", nullable = true)
    private Float percCertifedMoreThanOneStandard611;

    @Column(name = "cs6_usCanada_percCertifedMoreThanOneStandard_7_11", nullable = true)
    private Float percCertifedMoreThanOneStandard711;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cs6 getSfiPpForm() {
        return sfiPpForm;
    }

    public void setSfiPpForm(Cs6 sfiPpForm) {
        this.sfiPpForm = sfiPpForm;
    }

    public SfiPpFormRegion getRegion() {
        return region;
    }

    public void setRegion(SfiPpFormRegion region) {
        this.region = region;
    }

    public Integer getUnit1() {
        return unit1;
    }

    public void setUnit1(Integer unit1) {
        this.unit1 = unit1;
    }

    public String getVolume1() {
        return volume1;
    }

    public void setVolume1(String volume1) {
        this.volume1 = volume1;
    }

    public String getPercDeliveredQualifiedLogging1() {
        return percDeliveredQualifiedLogging1;
    }

    public void setPercDeliveredQualifiedLogging1(String percDeliveredQualifiedLogging1) {
        this.percDeliveredQualifiedLogging1 = percDeliveredQualifiedLogging1;
    }

    public String getPercSFIOnlyCertified1() {
        return percSFIOnlyCertified1;
    }

    public void setPercSFIOnlyCertified1(String percSFIOnlyCertified1) {
        this.percSFIOnlyCertified1 = percSFIOnlyCertified1;
    }

    public String getPercATFSOnlyCertified1() {
        return percATFSOnlyCertified1;
    }

    public void setPercATFSOnlyCertified1(String percATFSOnlyCertified1) {
        this.percATFSOnlyCertified1 = percATFSOnlyCertified1;
    }

    public String getPercCSAOnlyCertified1() {
        return percCSAOnlyCertified1;
    }

    public void setPercCSAOnlyCertified1(String percCSAOnlyCertified1) {
        this.percCSAOnlyCertified1 = percCSAOnlyCertified1;
    }

    public String getPercFSCOnlyCertified1() {
        return percFSCOnlyCertified1;
    }

    public void setPercFSCOnlyCertified1(String percFSCOnlyCertified1) {
        this.percFSCOnlyCertified1 = percFSCOnlyCertified1;
    }

    public Set<String> getMoreThanOneStandard1() {
        return moreThanOneStandard1;
    }

    public void setMoreThanOneStandard1(Set<String> moreThanOneStandard1) {
        addAll(this.moreThanOneStandard1, moreThanOneStandard1);
    }

    public Boolean getOther() {
        return other;
    }

    public void setOther(Boolean other) {
        this.other = other;
    }

    public String getOtherLabel() {
        return otherLabel;
    }

    public void setOtherLabel(String otherLabel) {
        this.otherLabel = otherLabel;
    }

    public Float getPercCertifedMoreThanOneStandard11() {
        return percCertifedMoreThanOneStandard11;
    }

    public void setPercCertifedMoreThanOneStandard11(Float percCertifedMoreThanOneStandard11) {
        this.percCertifedMoreThanOneStandard11 = percCertifedMoreThanOneStandard11;
    }

    public Float getPercCertifedMoreThanOneStandard21() {
        return percCertifedMoreThanOneStandard21;
    }

    public void setPercCertifedMoreThanOneStandard21(Float percCertifedMoreThanOneStandard21) {
        this.percCertifedMoreThanOneStandard21 = percCertifedMoreThanOneStandard21;
    }

    public Float getPercCertifedMoreThanOneStandard31() {
        return percCertifedMoreThanOneStandard31;
    }

    public void setPercCertifedMoreThanOneStandard31(Float percCertifedMoreThanOneStandard31) {
        this.percCertifedMoreThanOneStandard31 = percCertifedMoreThanOneStandard31;
    }

    public Float getPercCertifedMoreThanOneStandard41() {
        return percCertifedMoreThanOneStandard41;
    }

    public void setPercCertifedMoreThanOneStandard41(Float percCertifedMoreThanOneStandard41) {
        this.percCertifedMoreThanOneStandard41 = percCertifedMoreThanOneStandard41;
    }

    public Float getPercCertifedMoreThanOneStandard51() {
        return percCertifedMoreThanOneStandard51;
    }

    public void setPercCertifedMoreThanOneStandard51(Float percCertifedMoreThanOneStandard51) {
        this.percCertifedMoreThanOneStandard51 = percCertifedMoreThanOneStandard51;
    }

    public Float getPercCertifedMoreThanOneStandard61() {
        return percCertifedMoreThanOneStandard61;
    }

    public void setPercCertifedMoreThanOneStandard61(Float percCertifedMoreThanOneStandard61) {
        this.percCertifedMoreThanOneStandard61 = percCertifedMoreThanOneStandard61;
    }

    public Float getPercCertifedMoreThanOneStandard71() {
        return percCertifedMoreThanOneStandard71;
    }

    public void setPercCertifedMoreThanOneStandard71(Float percCertifedMoreThanOneStandard71) {
        this.percCertifedMoreThanOneStandard71 = percCertifedMoreThanOneStandard71;
    }

    public Float getPercCertifedMoreThanOneStandard12() {
        return percCertifedMoreThanOneStandard12;
    }

    public void setPercCertifedMoreThanOneStandard12(Float percCertifedMoreThanOneStandard12) {
        this.percCertifedMoreThanOneStandard12 = percCertifedMoreThanOneStandard12;
    }

    public Float getPercCertifedMoreThanOneStandard22() {
        return percCertifedMoreThanOneStandard22;
    }

    public void setPercCertifedMoreThanOneStandard22(Float percCertifedMoreThanOneStandard22) {
        this.percCertifedMoreThanOneStandard22 = percCertifedMoreThanOneStandard22;
    }

    public Float getPercCertifedMoreThanOneStandard32() {
        return percCertifedMoreThanOneStandard32;
    }

    public void setPercCertifedMoreThanOneStandard32(Float percCertifedMoreThanOneStandard32) {
        this.percCertifedMoreThanOneStandard32 = percCertifedMoreThanOneStandard32;
    }

    public Float getPercCertifedMoreThanOneStandard42() {
        return percCertifedMoreThanOneStandard42;
    }

    public void setPercCertifedMoreThanOneStandard42(Float percCertifedMoreThanOneStandard42) {
        this.percCertifedMoreThanOneStandard42 = percCertifedMoreThanOneStandard42;
    }

    public Float getPercCertifedMoreThanOneStandard52() {
        return percCertifedMoreThanOneStandard52;
    }

    public void setPercCertifedMoreThanOneStandard52(Float percCertifedMoreThanOneStandard52) {
        this.percCertifedMoreThanOneStandard52 = percCertifedMoreThanOneStandard52;
    }

    public Float getPercCertifedMoreThanOneStandard62() {
        return percCertifedMoreThanOneStandard62;
    }

    public void setPercCertifedMoreThanOneStandard62(Float percCertifedMoreThanOneStandard62) {
        this.percCertifedMoreThanOneStandard62 = percCertifedMoreThanOneStandard62;
    }

    public Float getPercCertifedMoreThanOneStandard72() {
        return percCertifedMoreThanOneStandard72;
    }

    public void setPercCertifedMoreThanOneStandard72(Float percCertifedMoreThanOneStandard72) {
        this.percCertifedMoreThanOneStandard72 = percCertifedMoreThanOneStandard72;
    }

    public Float getPercCertifedMoreThanOneStandard13() {
        return percCertifedMoreThanOneStandard13;
    }

    public void setPercCertifedMoreThanOneStandard13(Float percCertifedMoreThanOneStandard13) {
        this.percCertifedMoreThanOneStandard13 = percCertifedMoreThanOneStandard13;
    }

    public Float getPercCertifedMoreThanOneStandard23() {
        return percCertifedMoreThanOneStandard23;
    }

    public void setPercCertifedMoreThanOneStandard23(Float percCertifedMoreThanOneStandard23) {
        this.percCertifedMoreThanOneStandard23 = percCertifedMoreThanOneStandard23;
    }

    public Float getPercCertifedMoreThanOneStandard33() {
        return percCertifedMoreThanOneStandard33;
    }

    public void setPercCertifedMoreThanOneStandard33(Float percCertifedMoreThanOneStandard33) {
        this.percCertifedMoreThanOneStandard33 = percCertifedMoreThanOneStandard33;
    }

    public Float getPercCertifedMoreThanOneStandard43() {
        return percCertifedMoreThanOneStandard43;
    }

    public void setPercCertifedMoreThanOneStandard43(Float percCertifedMoreThanOneStandard43) {
        this.percCertifedMoreThanOneStandard43 = percCertifedMoreThanOneStandard43;
    }

    public Float getPercCertifedMoreThanOneStandard53() {
        return percCertifedMoreThanOneStandard53;
    }

    public void setPercCertifedMoreThanOneStandard53(Float percCertifedMoreThanOneStandard53) {
        this.percCertifedMoreThanOneStandard53 = percCertifedMoreThanOneStandard53;
    }

    public Float getPercCertifedMoreThanOneStandard63() {
        return percCertifedMoreThanOneStandard63;
    }

    public void setPercCertifedMoreThanOneStandard63(Float percCertifedMoreThanOneStandard63) {
        this.percCertifedMoreThanOneStandard63 = percCertifedMoreThanOneStandard63;
    }

    public Float getPercCertifedMoreThanOneStandard73() {
        return percCertifedMoreThanOneStandard73;
    }

    public void setPercCertifedMoreThanOneStandard73(Float percCertifedMoreThanOneStandard73) {
        this.percCertifedMoreThanOneStandard73 = percCertifedMoreThanOneStandard73;
    }

    public Float getPercCertifedMoreThanOneStandard14() {
        return percCertifedMoreThanOneStandard14;
    }

    public void setPercCertifedMoreThanOneStandard14(Float percCertifedMoreThanOneStandard14) {
        this.percCertifedMoreThanOneStandard14 = percCertifedMoreThanOneStandard14;
    }

    public Float getPercCertifedMoreThanOneStandard24() {
        return percCertifedMoreThanOneStandard24;
    }

    public void setPercCertifedMoreThanOneStandard24(Float percCertifedMoreThanOneStandard24) {
        this.percCertifedMoreThanOneStandard24 = percCertifedMoreThanOneStandard24;
    }

    public Float getPercCertifedMoreThanOneStandard34() {
        return percCertifedMoreThanOneStandard34;
    }

    public void setPercCertifedMoreThanOneStandard34(Float percCertifedMoreThanOneStandard34) {
        this.percCertifedMoreThanOneStandard34 = percCertifedMoreThanOneStandard34;
    }

    public Float getPercCertifedMoreThanOneStandard44() {
        return percCertifedMoreThanOneStandard44;
    }

    public void setPercCertifedMoreThanOneStandard44(Float percCertifedMoreThanOneStandard44) {
        this.percCertifedMoreThanOneStandard44 = percCertifedMoreThanOneStandard44;
    }

    public Float getPercCertifedMoreThanOneStandard54() {
        return percCertifedMoreThanOneStandard54;
    }

    public void setPercCertifedMoreThanOneStandard54(Float percCertifedMoreThanOneStandard54) {
        this.percCertifedMoreThanOneStandard54 = percCertifedMoreThanOneStandard54;
    }

    public Float getPercCertifedMoreThanOneStandard64() {
        return percCertifedMoreThanOneStandard64;
    }

    public void setPercCertifedMoreThanOneStandard64(Float percCertifedMoreThanOneStandard64) {
        this.percCertifedMoreThanOneStandard64 = percCertifedMoreThanOneStandard64;
    }

    public Float getPercCertifedMoreThanOneStandard74() {
        return percCertifedMoreThanOneStandard74;
    }

    public void setPercCertifedMoreThanOneStandard74(Float percCertifedMoreThanOneStandard74) {
        this.percCertifedMoreThanOneStandard74 = percCertifedMoreThanOneStandard74;
    }

    public Float getPercCertifedMoreThanOneStandard15() {
        return percCertifedMoreThanOneStandard15;
    }

    public void setPercCertifedMoreThanOneStandard15(Float percCertifedMoreThanOneStandard15) {
        this.percCertifedMoreThanOneStandard15 = percCertifedMoreThanOneStandard15;
    }

    public Float getPercCertifedMoreThanOneStandard25() {
        return percCertifedMoreThanOneStandard25;
    }

    public void setPercCertifedMoreThanOneStandard25(Float percCertifedMoreThanOneStandard25) {
        this.percCertifedMoreThanOneStandard25 = percCertifedMoreThanOneStandard25;
    }

    public Float getPercCertifedMoreThanOneStandard35() {
        return percCertifedMoreThanOneStandard35;
    }

    public void setPercCertifedMoreThanOneStandard35(Float percCertifedMoreThanOneStandard35) {
        this.percCertifedMoreThanOneStandard35 = percCertifedMoreThanOneStandard35;
    }

    public Float getPercCertifedMoreThanOneStandard45() {
        return percCertifedMoreThanOneStandard45;
    }

    public void setPercCertifedMoreThanOneStandard45(Float percCertifedMoreThanOneStandard45) {
        this.percCertifedMoreThanOneStandard45 = percCertifedMoreThanOneStandard45;
    }

    public Float getPercCertifedMoreThanOneStandard55() {
        return percCertifedMoreThanOneStandard55;
    }

    public void setPercCertifedMoreThanOneStandard55(Float percCertifedMoreThanOneStandard55) {
        this.percCertifedMoreThanOneStandard55 = percCertifedMoreThanOneStandard55;
    }

    public Float getPercCertifedMoreThanOneStandard65() {
        return percCertifedMoreThanOneStandard65;
    }

    public void setPercCertifedMoreThanOneStandard65(Float percCertifedMoreThanOneStandard65) {
        this.percCertifedMoreThanOneStandard65 = percCertifedMoreThanOneStandard65;
    }

    public Float getPercCertifedMoreThanOneStandard75() {
        return percCertifedMoreThanOneStandard75;
    }

    public void setPercCertifedMoreThanOneStandard75(Float percCertifedMoreThanOneStandard75) {
        this.percCertifedMoreThanOneStandard75 = percCertifedMoreThanOneStandard75;
    }

    public Float getPercCertifedMoreThanOneStandard16() {
        return percCertifedMoreThanOneStandard16;
    }

    public void setPercCertifedMoreThanOneStandard16(Float percCertifedMoreThanOneStandard16) {
        this.percCertifedMoreThanOneStandard16 = percCertifedMoreThanOneStandard16;
    }

    public Float getPercCertifedMoreThanOneStandard26() {
        return percCertifedMoreThanOneStandard26;
    }

    public void setPercCertifedMoreThanOneStandard26(Float percCertifedMoreThanOneStandard26) {
        this.percCertifedMoreThanOneStandard26 = percCertifedMoreThanOneStandard26;
    }

    public Float getPercCertifedMoreThanOneStandard36() {
        return percCertifedMoreThanOneStandard36;
    }

    public void setPercCertifedMoreThanOneStandard36(Float percCertifedMoreThanOneStandard36) {
        this.percCertifedMoreThanOneStandard36 = percCertifedMoreThanOneStandard36;
    }

    public Float getPercCertifedMoreThanOneStandard46() {
        return percCertifedMoreThanOneStandard46;
    }

    public void setPercCertifedMoreThanOneStandard46(Float percCertifedMoreThanOneStandard46) {
        this.percCertifedMoreThanOneStandard46 = percCertifedMoreThanOneStandard46;
    }

    public Float getPercCertifedMoreThanOneStandard56() {
        return percCertifedMoreThanOneStandard56;
    }

    public void setPercCertifedMoreThanOneStandard56(Float percCertifedMoreThanOneStandard56) {
        this.percCertifedMoreThanOneStandard56 = percCertifedMoreThanOneStandard56;
    }

    public Float getPercCertifedMoreThanOneStandard66() {
        return percCertifedMoreThanOneStandard66;
    }

    public void setPercCertifedMoreThanOneStandard66(Float percCertifedMoreThanOneStandard66) {
        this.percCertifedMoreThanOneStandard66 = percCertifedMoreThanOneStandard66;
    }

    public Float getPercCertifedMoreThanOneStandard76() {
        return percCertifedMoreThanOneStandard76;
    }

    public void setPercCertifedMoreThanOneStandard76(Float percCertifedMoreThanOneStandard76) {
        this.percCertifedMoreThanOneStandard76 = percCertifedMoreThanOneStandard76;
    }

    public Float getPercCertifedMoreThanOneStandard17() {
        return percCertifedMoreThanOneStandard17;
    }

    public void setPercCertifedMoreThanOneStandard17(Float percCertifedMoreThanOneStandard17) {
        this.percCertifedMoreThanOneStandard17 = percCertifedMoreThanOneStandard17;
    }

    public Float getPercCertifedMoreThanOneStandard27() {
        return percCertifedMoreThanOneStandard27;
    }

    public void setPercCertifedMoreThanOneStandard27(Float percCertifedMoreThanOneStandard27) {
        this.percCertifedMoreThanOneStandard27 = percCertifedMoreThanOneStandard27;
    }

    public Float getPercCertifedMoreThanOneStandard37() {
        return percCertifedMoreThanOneStandard37;
    }

    public void setPercCertifedMoreThanOneStandard37(Float percCertifedMoreThanOneStandard37) {
        this.percCertifedMoreThanOneStandard37 = percCertifedMoreThanOneStandard37;
    }

    public Float getPercCertifedMoreThanOneStandard47() {
        return percCertifedMoreThanOneStandard47;
    }

    public void setPercCertifedMoreThanOneStandard47(Float percCertifedMoreThanOneStandard47) {
        this.percCertifedMoreThanOneStandard47 = percCertifedMoreThanOneStandard47;
    }

    public Float getPercCertifedMoreThanOneStandard57() {
        return percCertifedMoreThanOneStandard57;
    }

    public void setPercCertifedMoreThanOneStandard57(Float percCertifedMoreThanOneStandard57) {
        this.percCertifedMoreThanOneStandard57 = percCertifedMoreThanOneStandard57;
    }

    public Float getPercCertifedMoreThanOneStandard67() {
        return percCertifedMoreThanOneStandard67;
    }

    public void setPercCertifedMoreThanOneStandard67(Float percCertifedMoreThanOneStandard67) {
        this.percCertifedMoreThanOneStandard67 = percCertifedMoreThanOneStandard67;
    }

    public Float getPercCertifedMoreThanOneStandard77() {
        return percCertifedMoreThanOneStandard77;
    }

    public void setPercCertifedMoreThanOneStandard77(Float percCertifedMoreThanOneStandard77) {
        this.percCertifedMoreThanOneStandard77 = percCertifedMoreThanOneStandard77;
    }

    public Float getPercCertifedMoreThanOneStandard18() {
        return percCertifedMoreThanOneStandard18;
    }

    public void setPercCertifedMoreThanOneStandard18(Float percCertifedMoreThanOneStandard18) {
        this.percCertifedMoreThanOneStandard18 = percCertifedMoreThanOneStandard18;
    }

    public Float getPercCertifedMoreThanOneStandard28() {
        return percCertifedMoreThanOneStandard28;
    }

    public void setPercCertifedMoreThanOneStandard28(Float percCertifedMoreThanOneStandard28) {
        this.percCertifedMoreThanOneStandard28 = percCertifedMoreThanOneStandard28;
    }

    public Float getPercCertifedMoreThanOneStandard38() {
        return percCertifedMoreThanOneStandard38;
    }

    public void setPercCertifedMoreThanOneStandard38(Float percCertifedMoreThanOneStandard38) {
        this.percCertifedMoreThanOneStandard38 = percCertifedMoreThanOneStandard38;
    }

    public Float getPercCertifedMoreThanOneStandard48() {
        return percCertifedMoreThanOneStandard48;
    }

    public void setPercCertifedMoreThanOneStandard48(Float percCertifedMoreThanOneStandard48) {
        this.percCertifedMoreThanOneStandard48 = percCertifedMoreThanOneStandard48;
    }

    public Float getPercCertifedMoreThanOneStandard58() {
        return percCertifedMoreThanOneStandard58;
    }

    public void setPercCertifedMoreThanOneStandard58(Float percCertifedMoreThanOneStandard58) {
        this.percCertifedMoreThanOneStandard58 = percCertifedMoreThanOneStandard58;
    }

    public Float getPercCertifedMoreThanOneStandard68() {
        return percCertifedMoreThanOneStandard68;
    }

    public void setPercCertifedMoreThanOneStandard68(Float percCertifedMoreThanOneStandard68) {
        this.percCertifedMoreThanOneStandard68 = percCertifedMoreThanOneStandard68;
    }

    public Float getPercCertifedMoreThanOneStandard78() {
        return percCertifedMoreThanOneStandard78;
    }

    public void setPercCertifedMoreThanOneStandard78(Float percCertifedMoreThanOneStandard78) {
        this.percCertifedMoreThanOneStandard78 = percCertifedMoreThanOneStandard78;
    }

    public Float getPercCertifedMoreThanOneStandard19() {
        return percCertifedMoreThanOneStandard19;
    }

    public void setPercCertifedMoreThanOneStandard19(Float percCertifedMoreThanOneStandard19) {
        this.percCertifedMoreThanOneStandard19 = percCertifedMoreThanOneStandard19;
    }

    public Float getPercCertifedMoreThanOneStandard29() {
        return percCertifedMoreThanOneStandard29;
    }

    public void setPercCertifedMoreThanOneStandard29(Float percCertifedMoreThanOneStandard29) {
        this.percCertifedMoreThanOneStandard29 = percCertifedMoreThanOneStandard29;
    }

    public Float getPercCertifedMoreThanOneStandard39() {
        return percCertifedMoreThanOneStandard39;
    }

    public void setPercCertifedMoreThanOneStandard39(Float percCertifedMoreThanOneStandard39) {
        this.percCertifedMoreThanOneStandard39 = percCertifedMoreThanOneStandard39;
    }

    public Float getPercCertifedMoreThanOneStandard49() {
        return percCertifedMoreThanOneStandard49;
    }

    public void setPercCertifedMoreThanOneStandard49(Float percCertifedMoreThanOneStandard49) {
        this.percCertifedMoreThanOneStandard49 = percCertifedMoreThanOneStandard49;
    }

    public Float getPercCertifedMoreThanOneStandard59() {
        return percCertifedMoreThanOneStandard59;
    }

    public void setPercCertifedMoreThanOneStandard59(Float percCertifedMoreThanOneStandard59) {
        this.percCertifedMoreThanOneStandard59 = percCertifedMoreThanOneStandard59;
    }

    public Float getPercCertifedMoreThanOneStandard69() {
        return percCertifedMoreThanOneStandard69;
    }

    public void setPercCertifedMoreThanOneStandard69(Float percCertifedMoreThanOneStandard69) {
        this.percCertifedMoreThanOneStandard69 = percCertifedMoreThanOneStandard69;
    }

    public Float getPercCertifedMoreThanOneStandard79() {
        return percCertifedMoreThanOneStandard79;
    }

    public void setPercCertifedMoreThanOneStandard79(Float percCertifedMoreThanOneStandard79) {
        this.percCertifedMoreThanOneStandard79 = percCertifedMoreThanOneStandard79;
    }

    public Float getPercCertifedMoreThanOneStandard110() {
        return percCertifedMoreThanOneStandard110;
    }

    public void setPercCertifedMoreThanOneStandard110(Float percCertifedMoreThanOneStandard110) {
        this.percCertifedMoreThanOneStandard110 = percCertifedMoreThanOneStandard110;
    }

    public Float getPercCertifedMoreThanOneStandard210() {
        return percCertifedMoreThanOneStandard210;
    }

    public void setPercCertifedMoreThanOneStandard210(Float percCertifedMoreThanOneStandard210) {
        this.percCertifedMoreThanOneStandard210 = percCertifedMoreThanOneStandard210;
    }

    public Float getPercCertifedMoreThanOneStandard310() {
        return percCertifedMoreThanOneStandard310;
    }

    public void setPercCertifedMoreThanOneStandard310(Float percCertifedMoreThanOneStandard310) {
        this.percCertifedMoreThanOneStandard310 = percCertifedMoreThanOneStandard310;
    }

    public Float getPercCertifedMoreThanOneStandard410() {
        return percCertifedMoreThanOneStandard410;
    }

    public void setPercCertifedMoreThanOneStandard410(Float percCertifedMoreThanOneStandard410) {
        this.percCertifedMoreThanOneStandard410 = percCertifedMoreThanOneStandard410;
    }

    public Float getPercCertifedMoreThanOneStandard510() {
        return percCertifedMoreThanOneStandard510;
    }

    public void setPercCertifedMoreThanOneStandard510(Float percCertifedMoreThanOneStandard510) {
        this.percCertifedMoreThanOneStandard510 = percCertifedMoreThanOneStandard510;
    }

    public Float getPercCertifedMoreThanOneStandard610() {
        return percCertifedMoreThanOneStandard610;
    }

    public void setPercCertifedMoreThanOneStandard610(Float percCertifedMoreThanOneStandard610) {
        this.percCertifedMoreThanOneStandard610 = percCertifedMoreThanOneStandard610;
    }

    public Float getPercCertifedMoreThanOneStandard710() {
        return percCertifedMoreThanOneStandard710;
    }

    public void setPercCertifedMoreThanOneStandard710(Float percCertifedMoreThanOneStandard710) {
        this.percCertifedMoreThanOneStandard710 = percCertifedMoreThanOneStandard710;
    }

    public Float getPercCertifedMoreThanOneStandard111() {
        return percCertifedMoreThanOneStandard111;
    }

    public void setPercCertifedMoreThanOneStandard111(Float percCertifedMoreThanOneStandard111) {
        this.percCertifedMoreThanOneStandard111 = percCertifedMoreThanOneStandard111;
    }

    public Float getPercCertifedMoreThanOneStandard211() {
        return percCertifedMoreThanOneStandard211;
    }

    public void setPercCertifedMoreThanOneStandard211(Float percCertifedMoreThanOneStandard211) {
        this.percCertifedMoreThanOneStandard211 = percCertifedMoreThanOneStandard211;
    }

    public Float getPercCertifedMoreThanOneStandard311() {
        return percCertifedMoreThanOneStandard311;
    }

    public void setPercCertifedMoreThanOneStandard311(Float percCertifedMoreThanOneStandard311) {
        this.percCertifedMoreThanOneStandard311 = percCertifedMoreThanOneStandard311;
    }

    public Float getPercCertifedMoreThanOneStandard411() {
        return percCertifedMoreThanOneStandard411;
    }

    public void setPercCertifedMoreThanOneStandard411(Float percCertifedMoreThanOneStandard411) {
        this.percCertifedMoreThanOneStandard411 = percCertifedMoreThanOneStandard411;
    }

    public Float getPercCertifedMoreThanOneStandard511() {
        return percCertifedMoreThanOneStandard511;
    }

    public void setPercCertifedMoreThanOneStandard511(Float percCertifedMoreThanOneStandard511) {
        this.percCertifedMoreThanOneStandard511 = percCertifedMoreThanOneStandard511;
    }

    public Float getPercCertifedMoreThanOneStandard611() {
        return percCertifedMoreThanOneStandard611;
    }

    public void setPercCertifedMoreThanOneStandard611(Float percCertifedMoreThanOneStandard611) {
        this.percCertifedMoreThanOneStandard611 = percCertifedMoreThanOneStandard611;
    }

    public Float getPercCertifedMoreThanOneStandard711() {
        return percCertifedMoreThanOneStandard711;
    }

    public void setPercCertifedMoreThanOneStandard711(Float percCertifedMoreThanOneStandard711) {
        this.percCertifedMoreThanOneStandard711 = percCertifedMoreThanOneStandard711;
    }
}

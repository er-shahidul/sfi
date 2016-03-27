package com.rbs.www.web.sfi.models.entities;

import com.rbs.www.common.models.BaseEntityModel;
import com.rbs.www.web.common.models.entities.SfiPpFormRegion;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sfi_pp_form_cs6_us_canada")
public class SfiPpFormCs6UsCanada extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "form_id", nullable = true)
    private Integer sfiPpForm;

    @ManyToOne(targetEntity = SfiPpFormRegion.class, optional = true)
    @JoinColumn(name = "region_id", nullable = true)
    private SfiPpFormRegion region;

    @Column(name = "cs6_usCanada_unit_1", nullable = true)
    private Integer unit1;

    @Column(name = "cs6_usCanada_volume_1", nullable = true)
    private Float volume1;

    @Column(name = "cs6_usCanada_percDeliveredQualifiedLogging_1", nullable = true)
    private Float percDeliveredQualifiedLogging1;

    @Column(name = "cs6_usCanada_percSFIOnlyCertified_1", nullable = true)
    private Float percSFIOnlyCertified1;

    @Column(name = "cs6_usCanada_percATFSOnlyCertified_1", nullable = true)
    private Float percATFSOnlyCertified1;

    @Column(name = "cs6_usCanada_percCSAOnlyCertified_1", nullable = true)
    private Float percCSAOnlyCertified1;

    @Column(name = "cs6_usCanada_percFSCOnlyCertified_1", nullable = true)
    private Float percFSCOnlyCertified1;

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


//   ROW 2

    @Column(name = "cs6_usCanada_unit_2", nullable = true)
    private Integer unit2;

    @Column(name = "cs6_usCanada_volume_2", nullable = true)
    private Float volume2;

    @Column(name = "cs6_usCanada_percDeliveredQualifiedLogging_2", nullable = true)
    private Float percDeliveredQualifiedLogging2;

    @Column(name = "cs6_usCanada_percSFIOnlyCertified_2", nullable = true)
    private Float percSFIOnlyCertified2;

    @Column(name = "cs6_usCanada_percATFSOnlyCertified_2", nullable = true)
    private Float percATFSOnlyCertified2;

    @Column(name = "cs6_usCanada_percCSAOnlyCertified_2", nullable = true)
    private Float percCSAOnlyCertified2;

    @Column(name = "cs6_usCanada_percFSCOnlyCertified_2", nullable = true)
    private Float percFSCOnlyCertified2;

    @Column(name = "cs6_usCanada_moreThanOneStandard_2", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> moreThanOneStandard2;


//   ROW 3

    @Column(name = "cs6_usCanada_unit_3", nullable = true)
    private Integer unit3;

    @Column(name = "cs6_usCanada_volume_3", nullable = true)
    private Float volume3;

    @Column(name = "cs6_usCanada_percDeliveredQualifiedLogging_3", nullable = true)
    private Float percDeliveredQualifiedLogging3;

    @Column(name = "cs6_usCanada_percSFIOnlyCertified_3", nullable = true)
    private Float percSFIOnlyCertified3;

    @Column(name = "cs6_usCanada_percATFSOnlyCertified_3", nullable = true)
    private Float percATFSOnlyCertified3;

    @Column(name = "cs6_usCanada_percCSAOnlyCertified_3", nullable = true)
    private Float percCSAOnlyCertified3;

    @Column(name = "cs6_usCanada_percFSCOnlyCertified_3", nullable = true)
    private Float percFSCOnlyCertified3;

    @Column(name = "cs6_usCanada_moreThanOneStandard_3", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> moreThanOneStandard3;


//   ROW 4

    @Column(name = "cs6_usCanada_unit_4", nullable = true)
    private Integer unit4;

    @Column(name = "cs6_usCanada_volume_4", nullable = true)
    private Float volume4;

    @Column(name = "cs6_usCanada_percDeliveredQualifiedLogging_4", nullable = true)
    private Float percDeliveredQualifiedLogging4;

    @Column(name = "cs6_usCanada_percSFIOnlyCertified_4", nullable = true)
    private Float percSFIOnlyCertified4;

    @Column(name = "cs6_usCanada_percATFSOnlyCertified_4", nullable = true)
    private Float percATFSOnlyCertified4;

    @Column(name = "cs6_usCanada_percCSAOnlyCertified_4", nullable = true)
    private Float percCSAOnlyCertified4;

    @Column(name = "cs6_usCanada_percFSCOnlyCertified_4", nullable = true)
    private Float percFSCOnlyCertified4;

    @Column(name = "cs6_usCanada_moreThanOneStandard_4", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> moreThanOneStandard4;


//   ROW 5

    @Column(name = "cs6_usCanada_unit_5", nullable = true)
    private Integer unit5;

    @Column(name = "cs6_usCanada_volume_5", nullable = true)
    private Float volume5;

    @Column(name = "cs6_usCanada_percDeliveredQualifiedLogging_5", nullable = true)
    private Float percDeliveredQualifiedLogging5;

    @Column(name = "cs6_usCanada_percSFIOnlyCertified_5", nullable = true)
    private Float percSFIOnlyCertified5;

    @Column(name = "cs6_usCanada_percATFSOnlyCertified_5", nullable = true)
    private Float percATFSOnlyCertified5;

    @Column(name = "cs6_usCanada_percCSAOnlyCertified_5", nullable = true)
    private Float percCSAOnlyCertified5;

    @Column(name = "cs6_usCanada_percFSCOnlyCertified_5", nullable = true)
    private Float percFSCOnlyCertified5;

    @Column(name = "cs6_usCanada_moreThanOneStandard_5", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> moreThanOneStandard5;


//   ROW 6

    @Column(name = "cs6_usCanada_unit_6", nullable = true)
    private Integer unit6;

    @Column(name = "cs6_usCanada_volume_6", nullable = true)
    private Float volume6;

    @Column(name = "cs6_usCanada_percDeliveredQualifiedLogging_6", nullable = true)
    private Float percDeliveredQualifiedLogging6;

    @Column(name = "cs6_usCanada_percSFIOnlyCertified_6", nullable = true)
    private Float percSFIOnlyCertified6;

    @Column(name = "cs6_usCanada_percATFSOnlyCertified_6", nullable = true)
    private Float percATFSOnlyCertified6;

    @Column(name = "cs6_usCanada_percCSAOnlyCertified_6", nullable = true)
    private Float percCSAOnlyCertified6;

    @Column(name = "cs6_usCanada_percFSCOnlyCertified_6", nullable = true)
    private Float percFSCOnlyCertified6;

    @Column(name = "cs6_usCanada_moreThanOneStandard_6", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> moreThanOneStandard6;


//   ROW 7

    @Column(name = "cs6_usCanada_unit_7", nullable = true)
    private Integer unit7;

    @Column(name = "cs6_usCanada_volume_7", nullable = true)
    private Float volume7;

    @Column(name = "cs6_usCanada_percDeliveredQualifiedLogging_7", nullable = true)
    private Float percDeliveredQualifiedLogging7;

    @Column(name = "cs6_usCanada_percSFIOnlyCertified_7", nullable = true)
    private Float percSFIOnlyCertified7;

    @Column(name = "cs6_usCanada_percATFSOnlyCertified_7", nullable = true)
    private Float percATFSOnlyCertified7;

    @Column(name = "cs6_usCanada_percCSAOnlyCertified_7", nullable = true)
    private Float percCSAOnlyCertified7;

    @Column(name = "cs6_usCanada_percFSCOnlyCertified_7", nullable = true)
    private Float percFSCOnlyCertified7;

    @Column(name = "cs6_usCanada_moreThanOneStandard_7", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> moreThanOneStandard7;


//   ROW 8

    @Column(name = "cs6_usCanada_unit_8", nullable = true)
    private Integer unit8;

    @Column(name = "cs6_usCanada_volume_8", nullable = true)
    private Float volume8;

    @Column(name = "cs6_usCanada_percDeliveredQualifiedLogging_8", nullable = true)
    private Float percDeliveredQualifiedLogging8;

    @Column(name = "cs6_usCanada_percSFIOnlyCertified_8", nullable = true)
    private Float percSFIOnlyCertified8;

    @Column(name = "cs6_usCanada_percATFSOnlyCertified_8", nullable = true)
    private Float percATFSOnlyCertified8;

    @Column(name = "cs6_usCanada_percCSAOnlyCertified_8", nullable = true)
    private Float percCSAOnlyCertified8;

    @Column(name = "cs6_usCanada_percFSCOnlyCertified_8", nullable = true)
    private Float percFSCOnlyCertified8;

    @Column(name = "cs6_usCanada_moreThanOneStandard_8", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> moreThanOneStandard8;


//   ROW 9

    @Column(name = "cs6_usCanada_unit_9", nullable = true)
    private Integer unit9;

    @Column(name = "cs6_usCanada_volume_9", nullable = true)
    private Float volume9;

    @Column(name = "cs6_usCanada_percDeliveredQualifiedLogging_9", nullable = true)
    private Float percDeliveredQualifiedLogging9;

    @Column(name = "cs6_usCanada_percSFIOnlyCertified_9", nullable = true)
    private Float percSFIOnlyCertified9;

    @Column(name = "cs6_usCanada_percATFSOnlyCertified_9", nullable = true)
    private Float percATFSOnlyCertified9;

    @Column(name = "cs6_usCanada_percCSAOnlyCertified_9", nullable = true)
    private Float percCSAOnlyCertified9;

    @Column(name = "cs6_usCanada_percFSCOnlyCertified_9", nullable = true)
    private Float percFSCOnlyCertified9;

    @Column(name = "cs6_usCanada_moreThanOneStandard_9", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> moreThanOneStandard9;

    @Column(name = "cs6_usCanada_percDeliveredQualifiedLogging_reason_1", nullable = true)
    @Type(type="text")
    private String percDeliveredQualifiedLoggingReason1;

    @Column(name = "cs6_usCanada_percDeliveredQualifiedLogging_reason_2", nullable = true)
    @Type(type="text")
    private String percDeliveredQualifiedLoggingReason2;

    @Column(name = "cs6_usCanada_percDeliveredQualifiedLogging_reason_3", nullable = true)
    @Type(type="text")
    private String percDeliveredQualifiedLoggingReason3;

    @Column(name = "cs6_usCanada_percDeliveredQualifiedLogging_reason_4", nullable = true)
    @Type(type="text")
    private String percDeliveredQualifiedLoggingReason4;

    @Column(name = "cs6_usCanada_percDeliveredQualifiedLogging_reason_5", nullable = true)
    @Type(type="text")
    private String percDeliveredQualifiedLoggingReason5;

    @Column(name = "cs6_usCanada_percDeliveredQualifiedLogging_reason_6", nullable = true)
    @Type(type="text")
    private String percDeliveredQualifiedLoggingReason6;

    @Column(name = "cs6_usCanada_percDeliveredQualifiedLogging_reason_7", nullable = true)
    @Type(type="text")
    private String percDeliveredQualifiedLoggingReason7;

    @Column(name = "cs6_usCanada_percDeliveredQualifiedLogging_reason_8", nullable = true)
    @Type(type="text")
    private String percDeliveredQualifiedLoggingReason8;

    @Column(name = "cs6_usCanada_percDeliveredQualifiedLogging_reason_9", nullable = true)
    @Type(type="text")
    private String percDeliveredQualifiedLoggingReason9;

    @Column(name = "cs6_usCanada_percDeliveredQualifiedLogging_reason_10", nullable = true)
    @Type(type="text")
    private String percDeliveredQualifiedLoggingReason10;

    @Column(name = "cs6_usCanada_percDeliveredQualifiedLogging_reason_12", nullable = true)
    @Type(type="text")
    private String percDeliveredQualifiedLoggingReason11;


//   ROW 10

    @Column(name = "cs6_usCanada_unit_10", nullable = true)
    private Integer unit10;

    @Column(name = "cs6_usCanada_volume_10", nullable = true)
    private Float volume10;

    @Column(name = "cs6_usCanada_percDeliveredQualifiedLogging_10", nullable = true)
    private Float percDeliveredQualifiedLogging10;

    @Column(name = "cs6_usCanada_percSFIOnlyCertified_10", nullable = true)
    private Float percSFIOnlyCertified10;

    @Column(name = "cs6_usCanada_percATFSOnlyCertified_10", nullable = true)
    private Float percATFSOnlyCertified10;

    @Column(name = "cs6_usCanada_percCSAOnlyCertified_10", nullable = true)
    private Float percCSAOnlyCertified10;

    @Column(name = "cs6_usCanada_percFSCOnlyCertified_10", nullable = true)
    private Float percFSCOnlyCertified10;

    @Column(name = "cs6_usCanada_moreThanOneStandard_10", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> moreThanOneStandard10;


//   ROW 11

    @Column(name = "cs6_usCanada_unit_11", nullable = true)
    private Integer unit11;

    @Column(name = "cs6_usCanada_volume_11", nullable = true)
    private Float volume11;

    @Column(name = "cs6_usCanada_percDeliveredQualifiedLogging_11", nullable = true)
    private Float percDeliveredQualifiedLogging11;

    @Column(name = "cs6_usCanada_percSFIOnlyCertified_11", nullable = true)
    private Float percSFIOnlyCertified11;

    @Column(name = "cs6_usCanada_percATFSOnlyCertified_11", nullable = true)
    private Float percATFSOnlyCertified11;

    @Column(name = "cs6_usCanada_percCSAOnlyCertified_11", nullable = true)
    private Float percCSAOnlyCertified11;

    @Column(name = "cs6_usCanada_percFSCOnlyCertified_11", nullable = true)
    private Float percFSCOnlyCertified11;

    @Column(name = "cs6_usCanada_moreThanOneStandard_11", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> moreThanOneStandard11;

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

    public Float getVolume1() {
        return volume1;
    }

    public void setVolume1(Float volume1) {
        this.volume1 = volume1;
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

    public Integer getUnit2() {
        return unit2;
    }

    public void setUnit2(Integer unit2) {
        this.unit2 = unit2;
    }

    public Float getVolume2() {
        return volume2;
    }

    public void setVolume2(Float volume2) {
        this.volume2 = volume2;
    }


    public Set<String> getMoreThanOneStandard2() {
        return moreThanOneStandard2;
    }

    public void setMoreThanOneStandard2(Set<String> moreThanOneStandard2) {
        addAll(this.moreThanOneStandard2, moreThanOneStandard2);
    }

    public Integer getUnit3() {
        return unit3;
    }

    public void setUnit3(Integer unit3) {
        this.unit3 = unit3;
    }

    public Float getVolume3() {
        return volume3;
    }

    public void setVolume3(Float volume3) {
        this.volume3 = volume3;
    }

    public Set<String> getMoreThanOneStandard3() {
        return moreThanOneStandard3;
    }

    public void setMoreThanOneStandard3(Set<String> moreThanOneStandard3) {
        addAll(this.moreThanOneStandard3, moreThanOneStandard3);
    }

    public Integer getUnit4() {
        return unit4;
    }

    public void setUnit4(Integer unit4) {
        this.unit4 = unit4;
    }

    public Float getVolume4() {
        return volume4;
    }

    public void setVolume4(Float volume4) {
        this.volume4 = volume4;
    }

    public Set<String> getMoreThanOneStandard4() {
        return moreThanOneStandard4;
    }

    public void setMoreThanOneStandard4(Set<String> moreThanOneStandard4) {
        addAll(this.moreThanOneStandard4, moreThanOneStandard4);
    }

    public Integer getUnit5() {
        return unit5;
    }

    public void setUnit5(Integer unit5) {
        this.unit5 = unit5;
    }

    public Float getVolume5() {
        return volume5;
    }

    public void setVolume5(Float volume5) {
        this.volume5 = volume5;
    }

    public Set<String> getMoreThanOneStandard5() {
        return moreThanOneStandard5;
    }

    public void setMoreThanOneStandard5(Set<String> moreThanOneStandard5) {
        addAll(this.moreThanOneStandard5, moreThanOneStandard5);
    }

    public Integer getUnit6() {
        return unit6;
    }

    public void setUnit6(Integer unit6) {
        this.unit6 = unit6;
    }

    public Float getVolume6() {
        return volume6;
    }

    public void setVolume6(Float volume6) {
        this.volume6 = volume6;
    }

    public Set<String> getMoreThanOneStandard6() {
        return moreThanOneStandard6;
    }

    public void setMoreThanOneStandard6(Set<String> moreThanOneStandard6) {
        addAll(this.moreThanOneStandard6, moreThanOneStandard6);
    }

    public Integer getUnit7() {
        return unit7;
    }

    public void setUnit7(Integer unit7) {
        this.unit7 = unit7;
    }

    public Float getVolume7() {
        return volume7;
    }

    public void setVolume7(Float volume7) {
        this.volume7 = volume7;
    }

    public Set<String> getMoreThanOneStandard7() {
        return moreThanOneStandard7;
    }

    public void setMoreThanOneStandard7(Set<String> moreThanOneStandard7) {
        addAll(this.moreThanOneStandard7, moreThanOneStandard7);
    }

    public Integer getUnit8() {
        return unit8;
    }

    public void setUnit8(Integer unit8) {
        this.unit8 = unit8;
    }

    public Float getVolume8() {
        return volume8;
    }

    public void setVolume8(Float volume8) {
        this.volume8 = volume8;
    }

    public Set<String> getMoreThanOneStandard8() {
        return moreThanOneStandard8;
    }

    public void setMoreThanOneStandard8(Set<String> moreThanOneStandard8) {
        addAll(this.moreThanOneStandard8, moreThanOneStandard8);
    }

    public Integer getUnit9() {
        return unit9;
    }

    public void setUnit9(Integer unit9) {
        this.unit9 = unit9;
    }

    public Float getVolume9() {
        return volume9;
    }

    public void setVolume9(Float volume9) {
        this.volume9 = volume9;
    }

    public Set<String> getMoreThanOneStandard9() {
        return moreThanOneStandard9;
    }

    public void setMoreThanOneStandard9(Set<String> moreThanOneStandard9) {
        addAll(this.moreThanOneStandard9, moreThanOneStandard9);
    }

    public Integer getUnit10() {
        return unit10;
    }

    public void setUnit10(Integer unit10) {
        this.unit10 = unit10;
    }

    public Float getVolume10() {
        return volume10;
    }

    public void setVolume10(Float volume10) {
        this.volume10 = volume10;
    }

    public Set<String> getMoreThanOneStandard10() {
        return moreThanOneStandard10;
    }

    public void setMoreThanOneStandard10(Set<String> moreThanOneStandard10) {
        addAll(this.moreThanOneStandard10, moreThanOneStandard10);
    }

    public Integer getUnit11() {
        return unit11;
    }

    public void setUnit11(Integer unit11) {
        this.unit11 = unit11;
    }

    public Float getVolume11() {
        return volume11;
    }

    public void setVolume11(Float volume11) {
        this.volume11 = volume11;
    }

    public Set<String> getMoreThanOneStandard11() {
        return moreThanOneStandard11;
    }

    public void setMoreThanOneStandard11(Set<String> moreThanOneStandard11) {
        addAll(this.moreThanOneStandard11, moreThanOneStandard11);
    }

    public Float getPercDeliveredQualifiedLogging1() {
        return percDeliveredQualifiedLogging1;
    }

    public void setPercDeliveredQualifiedLogging1(Float percDeliveredQualifiedLogging1) {
        this.percDeliveredQualifiedLogging1 = percDeliveredQualifiedLogging1;
    }

    public Float getPercSFIOnlyCertified1() {
        return percSFIOnlyCertified1;
    }

    public void setPercSFIOnlyCertified1(Float percSFIOnlyCertified1) {
        this.percSFIOnlyCertified1 = percSFIOnlyCertified1;
    }

    public Float getPercATFSOnlyCertified1() {
        return percATFSOnlyCertified1;
    }

    public void setPercATFSOnlyCertified1(Float percATFSOnlyCertified1) {
        this.percATFSOnlyCertified1 = percATFSOnlyCertified1;
    }

    public Float getPercCSAOnlyCertified1() {
        return percCSAOnlyCertified1;
    }

    public void setPercCSAOnlyCertified1(Float percCSAOnlyCertified1) {
        this.percCSAOnlyCertified1 = percCSAOnlyCertified1;
    }

    public Float getPercFSCOnlyCertified1() {
        return percFSCOnlyCertified1;
    }

    public void setPercFSCOnlyCertified1(Float percFSCOnlyCertified1) {
        this.percFSCOnlyCertified1 = percFSCOnlyCertified1;
    }

    public Float getPercDeliveredQualifiedLogging2() {
        return percDeliveredQualifiedLogging2;
    }

    public void setPercDeliveredQualifiedLogging2(Float percDeliveredQualifiedLogging2) {
        this.percDeliveredQualifiedLogging2 = percDeliveredQualifiedLogging2;
    }

    public Float getPercSFIOnlyCertified2() {
        return percSFIOnlyCertified2;
    }

    public void setPercSFIOnlyCertified2(Float percSFIOnlyCertified2) {
        this.percSFIOnlyCertified2 = percSFIOnlyCertified2;
    }

    public Float getPercATFSOnlyCertified2() {
        return percATFSOnlyCertified2;
    }

    public void setPercATFSOnlyCertified2(Float percATFSOnlyCertified2) {
        this.percATFSOnlyCertified2 = percATFSOnlyCertified2;
    }

    public Float getPercCSAOnlyCertified2() {
        return percCSAOnlyCertified2;
    }

    public void setPercCSAOnlyCertified2(Float percCSAOnlyCertified2) {
        this.percCSAOnlyCertified2 = percCSAOnlyCertified2;
    }

    public Float getPercFSCOnlyCertified2() {
        return percFSCOnlyCertified2;
    }

    public void setPercFSCOnlyCertified2(Float percFSCOnlyCertified2) {
        this.percFSCOnlyCertified2 = percFSCOnlyCertified2;
    }

    public Float getPercDeliveredQualifiedLogging3() {
        return percDeliveredQualifiedLogging3;
    }

    public void setPercDeliveredQualifiedLogging3(Float percDeliveredQualifiedLogging3) {
        this.percDeliveredQualifiedLogging3 = percDeliveredQualifiedLogging3;
    }

    public Float getPercSFIOnlyCertified3() {
        return percSFIOnlyCertified3;
    }

    public void setPercSFIOnlyCertified3(Float percSFIOnlyCertified3) {
        this.percSFIOnlyCertified3 = percSFIOnlyCertified3;
    }

    public Float getPercATFSOnlyCertified3() {
        return percATFSOnlyCertified3;
    }

    public void setPercATFSOnlyCertified3(Float percATFSOnlyCertified3) {
        this.percATFSOnlyCertified3 = percATFSOnlyCertified3;
    }

    public Float getPercCSAOnlyCertified3() {
        return percCSAOnlyCertified3;
    }

    public void setPercCSAOnlyCertified3(Float percCSAOnlyCertified3) {
        this.percCSAOnlyCertified3 = percCSAOnlyCertified3;
    }

    public Float getPercFSCOnlyCertified3() {
        return percFSCOnlyCertified3;
    }

    public void setPercFSCOnlyCertified3(Float percFSCOnlyCertified3) {
        this.percFSCOnlyCertified3 = percFSCOnlyCertified3;
    }

    public Float getPercDeliveredQualifiedLogging4() {
        return percDeliveredQualifiedLogging4;
    }

    public void setPercDeliveredQualifiedLogging4(Float percDeliveredQualifiedLogging4) {
        this.percDeliveredQualifiedLogging4 = percDeliveredQualifiedLogging4;
    }

    public Float getPercSFIOnlyCertified4() {
        return percSFIOnlyCertified4;
    }

    public void setPercSFIOnlyCertified4(Float percSFIOnlyCertified4) {
        this.percSFIOnlyCertified4 = percSFIOnlyCertified4;
    }

    public Float getPercATFSOnlyCertified4() {
        return percATFSOnlyCertified4;
    }

    public void setPercATFSOnlyCertified4(Float percATFSOnlyCertified4) {
        this.percATFSOnlyCertified4 = percATFSOnlyCertified4;
    }

    public Float getPercCSAOnlyCertified4() {
        return percCSAOnlyCertified4;
    }

    public void setPercCSAOnlyCertified4(Float percCSAOnlyCertified4) {
        this.percCSAOnlyCertified4 = percCSAOnlyCertified4;
    }

    public Float getPercFSCOnlyCertified4() {
        return percFSCOnlyCertified4;
    }

    public void setPercFSCOnlyCertified4(Float percFSCOnlyCertified4) {
        this.percFSCOnlyCertified4 = percFSCOnlyCertified4;
    }

    public Float getPercDeliveredQualifiedLogging5() {
        return percDeliveredQualifiedLogging5;
    }

    public void setPercDeliveredQualifiedLogging5(Float percDeliveredQualifiedLogging5) {
        this.percDeliveredQualifiedLogging5 = percDeliveredQualifiedLogging5;
    }

    public Float getPercSFIOnlyCertified5() {
        return percSFIOnlyCertified5;
    }

    public void setPercSFIOnlyCertified5(Float percSFIOnlyCertified5) {
        this.percSFIOnlyCertified5 = percSFIOnlyCertified5;
    }

    public Float getPercATFSOnlyCertified5() {
        return percATFSOnlyCertified5;
    }

    public void setPercATFSOnlyCertified5(Float percATFSOnlyCertified5) {
        this.percATFSOnlyCertified5 = percATFSOnlyCertified5;
    }

    public Float getPercCSAOnlyCertified5() {
        return percCSAOnlyCertified5;
    }

    public void setPercCSAOnlyCertified5(Float percCSAOnlyCertified5) {
        this.percCSAOnlyCertified5 = percCSAOnlyCertified5;
    }

    public Float getPercFSCOnlyCertified5() {
        return percFSCOnlyCertified5;
    }

    public void setPercFSCOnlyCertified5(Float percFSCOnlyCertified5) {
        this.percFSCOnlyCertified5 = percFSCOnlyCertified5;
    }

    public Float getPercDeliveredQualifiedLogging6() {
        return percDeliveredQualifiedLogging6;
    }

    public void setPercDeliveredQualifiedLogging6(Float percDeliveredQualifiedLogging6) {
        this.percDeliveredQualifiedLogging6 = percDeliveredQualifiedLogging6;
    }

    public Float getPercSFIOnlyCertified6() {
        return percSFIOnlyCertified6;
    }

    public void setPercSFIOnlyCertified6(Float percSFIOnlyCertified6) {
        this.percSFIOnlyCertified6 = percSFIOnlyCertified6;
    }

    public Float getPercATFSOnlyCertified6() {
        return percATFSOnlyCertified6;
    }

    public void setPercATFSOnlyCertified6(Float percATFSOnlyCertified6) {
        this.percATFSOnlyCertified6 = percATFSOnlyCertified6;
    }

    public Float getPercCSAOnlyCertified6() {
        return percCSAOnlyCertified6;
    }

    public void setPercCSAOnlyCertified6(Float percCSAOnlyCertified6) {
        this.percCSAOnlyCertified6 = percCSAOnlyCertified6;
    }

    public Float getPercFSCOnlyCertified6() {
        return percFSCOnlyCertified6;
    }

    public void setPercFSCOnlyCertified6(Float percFSCOnlyCertified6) {
        this.percFSCOnlyCertified6 = percFSCOnlyCertified6;
    }

    public Float getPercDeliveredQualifiedLogging7() {
        return percDeliveredQualifiedLogging7;
    }

    public void setPercDeliveredQualifiedLogging7(Float percDeliveredQualifiedLogging7) {
        this.percDeliveredQualifiedLogging7 = percDeliveredQualifiedLogging7;
    }

    public Float getPercSFIOnlyCertified7() {
        return percSFIOnlyCertified7;
    }

    public void setPercSFIOnlyCertified7(Float percSFIOnlyCertified7) {
        this.percSFIOnlyCertified7 = percSFIOnlyCertified7;
    }

    public Float getPercATFSOnlyCertified7() {
        return percATFSOnlyCertified7;
    }

    public void setPercATFSOnlyCertified7(Float percATFSOnlyCertified7) {
        this.percATFSOnlyCertified7 = percATFSOnlyCertified7;
    }

    public Float getPercCSAOnlyCertified7() {
        return percCSAOnlyCertified7;
    }

    public void setPercCSAOnlyCertified7(Float percCSAOnlyCertified7) {
        this.percCSAOnlyCertified7 = percCSAOnlyCertified7;
    }

    public Float getPercFSCOnlyCertified7() {
        return percFSCOnlyCertified7;
    }

    public void setPercFSCOnlyCertified7(Float percFSCOnlyCertified7) {
        this.percFSCOnlyCertified7 = percFSCOnlyCertified7;
    }

    public Float getPercDeliveredQualifiedLogging8() {
        return percDeliveredQualifiedLogging8;
    }

    public void setPercDeliveredQualifiedLogging8(Float percDeliveredQualifiedLogging8) {
        this.percDeliveredQualifiedLogging8 = percDeliveredQualifiedLogging8;
    }

    public Float getPercSFIOnlyCertified8() {
        return percSFIOnlyCertified8;
    }

    public void setPercSFIOnlyCertified8(Float percSFIOnlyCertified8) {
        this.percSFIOnlyCertified8 = percSFIOnlyCertified8;
    }

    public Float getPercATFSOnlyCertified8() {
        return percATFSOnlyCertified8;
    }

    public void setPercATFSOnlyCertified8(Float percATFSOnlyCertified8) {
        this.percATFSOnlyCertified8 = percATFSOnlyCertified8;
    }

    public Float getPercCSAOnlyCertified8() {
        return percCSAOnlyCertified8;
    }

    public void setPercCSAOnlyCertified8(Float percCSAOnlyCertified8) {
        this.percCSAOnlyCertified8 = percCSAOnlyCertified8;
    }

    public Float getPercFSCOnlyCertified8() {
        return percFSCOnlyCertified8;
    }

    public void setPercFSCOnlyCertified8(Float percFSCOnlyCertified8) {
        this.percFSCOnlyCertified8 = percFSCOnlyCertified8;
    }

    public Float getPercDeliveredQualifiedLogging9() {
        return percDeliveredQualifiedLogging9;
    }

    public void setPercDeliveredQualifiedLogging9(Float percDeliveredQualifiedLogging9) {
        this.percDeliveredQualifiedLogging9 = percDeliveredQualifiedLogging9;
    }

    public Float getPercSFIOnlyCertified9() {
        return percSFIOnlyCertified9;
    }

    public void setPercSFIOnlyCertified9(Float percSFIOnlyCertified9) {
        this.percSFIOnlyCertified9 = percSFIOnlyCertified9;
    }

    public Float getPercATFSOnlyCertified9() {
        return percATFSOnlyCertified9;
    }

    public void setPercATFSOnlyCertified9(Float percATFSOnlyCertified9) {
        this.percATFSOnlyCertified9 = percATFSOnlyCertified9;
    }

    public Float getPercCSAOnlyCertified9() {
        return percCSAOnlyCertified9;
    }

    public void setPercCSAOnlyCertified9(Float percCSAOnlyCertified9) {
        this.percCSAOnlyCertified9 = percCSAOnlyCertified9;
    }

    public Float getPercFSCOnlyCertified9() {
        return percFSCOnlyCertified9;
    }

    public void setPercFSCOnlyCertified9(Float percFSCOnlyCertified9) {
        this.percFSCOnlyCertified9 = percFSCOnlyCertified9;
    }

    public String getPercDeliveredQualifiedLoggingReason1() {
        return percDeliveredQualifiedLoggingReason1;
    }

    public void setPercDeliveredQualifiedLoggingReason1(String percDeliveredQualifiedLoggingReason1) {
        this.percDeliveredQualifiedLoggingReason1 = percDeliveredQualifiedLoggingReason1;
    }

    public String getPercDeliveredQualifiedLoggingReason2() {
        return percDeliveredQualifiedLoggingReason2;
    }

    public void setPercDeliveredQualifiedLoggingReason2(String percDeliveredQualifiedLoggingReason2) {
        this.percDeliveredQualifiedLoggingReason2 = percDeliveredQualifiedLoggingReason2;
    }

    public String getPercDeliveredQualifiedLoggingReason3() {
        return percDeliveredQualifiedLoggingReason3;
    }

    public void setPercDeliveredQualifiedLoggingReason3(String percDeliveredQualifiedLoggingReason3) {
        this.percDeliveredQualifiedLoggingReason3 = percDeliveredQualifiedLoggingReason3;
    }

    public String getPercDeliveredQualifiedLoggingReason4() {
        return percDeliveredQualifiedLoggingReason4;
    }

    public void setPercDeliveredQualifiedLoggingReason4(String percDeliveredQualifiedLoggingReason4) {
        this.percDeliveredQualifiedLoggingReason4 = percDeliveredQualifiedLoggingReason4;
    }

    public String getPercDeliveredQualifiedLoggingReason5() {
        return percDeliveredQualifiedLoggingReason5;
    }

    public void setPercDeliveredQualifiedLoggingReason5(String percDeliveredQualifiedLoggingReason5) {
        this.percDeliveredQualifiedLoggingReason5 = percDeliveredQualifiedLoggingReason5;
    }

    public String getPercDeliveredQualifiedLoggingReason6() {
        return percDeliveredQualifiedLoggingReason6;
    }

    public void setPercDeliveredQualifiedLoggingReason6(String percDeliveredQualifiedLoggingReason6) {
        this.percDeliveredQualifiedLoggingReason6 = percDeliveredQualifiedLoggingReason6;
    }

    public String getPercDeliveredQualifiedLoggingReason7() {
        return percDeliveredQualifiedLoggingReason7;
    }

    public void setPercDeliveredQualifiedLoggingReason7(String percDeliveredQualifiedLoggingReason7) {
        this.percDeliveredQualifiedLoggingReason7 = percDeliveredQualifiedLoggingReason7;
    }

    public String getPercDeliveredQualifiedLoggingReason8() {
        return percDeliveredQualifiedLoggingReason8;
    }

    public void setPercDeliveredQualifiedLoggingReason8(String percDeliveredQualifiedLoggingReason8) {
        this.percDeliveredQualifiedLoggingReason8 = percDeliveredQualifiedLoggingReason8;
    }

    public String getPercDeliveredQualifiedLoggingReason9() {
        return percDeliveredQualifiedLoggingReason9;
    }

    public void setPercDeliveredQualifiedLoggingReason9(String percDeliveredQualifiedLoggingReason9) {
        this.percDeliveredQualifiedLoggingReason9 = percDeliveredQualifiedLoggingReason9;
    }

    public String getPercDeliveredQualifiedLoggingReason10() {
        return percDeliveredQualifiedLoggingReason10;
    }

    public void setPercDeliveredQualifiedLoggingReason10(String percDeliveredQualifiedLoggingReason10) {
        this.percDeliveredQualifiedLoggingReason10 = percDeliveredQualifiedLoggingReason10;
    }

    public String getPercDeliveredQualifiedLoggingReason11() {
        return percDeliveredQualifiedLoggingReason11;
    }

    public void setPercDeliveredQualifiedLoggingReason11(String percDeliveredQualifiedLoggingReason11) {
        this.percDeliveredQualifiedLoggingReason11 = percDeliveredQualifiedLoggingReason11;
    }

    public Float getPercDeliveredQualifiedLogging10() {
        return percDeliveredQualifiedLogging10;
    }

    public void setPercDeliveredQualifiedLogging10(Float percDeliveredQualifiedLogging10) {
        this.percDeliveredQualifiedLogging10 = percDeliveredQualifiedLogging10;
    }

    public Float getPercSFIOnlyCertified10() {
        return percSFIOnlyCertified10;
    }

    public void setPercSFIOnlyCertified10(Float percSFIOnlyCertified10) {
        this.percSFIOnlyCertified10 = percSFIOnlyCertified10;
    }

    public Float getPercATFSOnlyCertified10() {
        return percATFSOnlyCertified10;
    }

    public void setPercATFSOnlyCertified10(Float percATFSOnlyCertified10) {
        this.percATFSOnlyCertified10 = percATFSOnlyCertified10;
    }

    public Float getPercCSAOnlyCertified10() {
        return percCSAOnlyCertified10;
    }

    public void setPercCSAOnlyCertified10(Float percCSAOnlyCertified10) {
        this.percCSAOnlyCertified10 = percCSAOnlyCertified10;
    }

    public Float getPercFSCOnlyCertified10() {
        return percFSCOnlyCertified10;
    }

    public void setPercFSCOnlyCertified10(Float percFSCOnlyCertified10) {
        this.percFSCOnlyCertified10 = percFSCOnlyCertified10;
    }

    public Float getPercDeliveredQualifiedLogging11() {
        return percDeliveredQualifiedLogging11;
    }

    public void setPercDeliveredQualifiedLogging11(Float percDeliveredQualifiedLogging11) {
        this.percDeliveredQualifiedLogging11 = percDeliveredQualifiedLogging11;
    }

    public Float getPercSFIOnlyCertified11() {
        return percSFIOnlyCertified11;
    }

    public void setPercSFIOnlyCertified11(Float percSFIOnlyCertified11) {
        this.percSFIOnlyCertified11 = percSFIOnlyCertified11;
    }

    public Float getPercATFSOnlyCertified11() {
        return percATFSOnlyCertified11;
    }

    public void setPercATFSOnlyCertified11(Float percATFSOnlyCertified11) {
        this.percATFSOnlyCertified11 = percATFSOnlyCertified11;
    }

    public Float getPercCSAOnlyCertified11() {
        return percCSAOnlyCertified11;
    }

    public void setPercCSAOnlyCertified11(Float percCSAOnlyCertified11) {
        this.percCSAOnlyCertified11 = percCSAOnlyCertified11;
    }

    public Float getPercFSCOnlyCertified11() {
        return percFSCOnlyCertified11;
    }

    public void setPercFSCOnlyCertified11(Float percFSCOnlyCertified11) {
        this.percFSCOnlyCertified11 = percFSCOnlyCertified11;
    }
}

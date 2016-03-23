package com.rbs.www.web.sfi.models.entities;

import com.rbs.www.common.models.BaseEntityModel;
import com.rbs.www.web.common.models.entities.SfiPpFormAllCountry;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sfi_pp_forms")
public class Cs8PartialA extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cs8_productSegmentBioenergy", nullable = true)
    private Boolean productSegmentBioenergy;

    @Column(name = "cs8_productSegmentFurniture", nullable = true)
    private Boolean productSegmentFurniture;

    @Column(name = "cs8_productSegmentLand", nullable = true)
    private Boolean productSegmentLand;

    @Column(name = "cs8_productSegmentOther", nullable = true)
    private Boolean productSegmentOther;

    @Column(name = "cs8_productSegmentPackaging", nullable = true)
    private Boolean productSegmentPackaging;

    @Column(name = "cs8_productSegmentPaperBoard", nullable = true)
    private Boolean productSegmentPaperBoard;

    @Column(name = "cs8_productSegmentPaperMerchant", nullable = true)
    private Boolean productSegmentPaperMerchant;

    @Column(name = "cs8_productSegmentPrinter", nullable = true)
    private Boolean productSegmentPrinter;

    @Column(name = "cs8_productSegmentPrintingWritingPaper", nullable = true)
    private Boolean productSegmentPrintingWritingPaper;

    @Column(name = "cs8_productSegmentPulp", nullable = true)
    private Boolean productSegmentPulp;

    @Column(name = "cs8_productSegmentSolidWood", nullable = true)
    private Boolean productSegmentSolidWood;

    @Column(name = "cs8_productSegmentTowelTissue", nullable = true)
    private Boolean productSegmentTowelTissue;

    @Column(name = "cs8_productSegmentWoodMerchant", nullable = true)
    private Boolean productSegmentWoodMerchant;

    @Column(name = "cs8_whyChoseSFI20Other", nullable = true)
    private Boolean whyChoseSFI20Other;

    @Column(name = "cs8_fscChainCustody1Other", nullable = true)
    private Boolean fscChainCustody1Other;

    @Column(name = "cs8_fscChainCustody2Other", nullable = true)
    private Boolean fscChainCustody2Other;

    @Column(name = "cs8_fscChainCustody3Other", nullable = true)
    private Boolean fscChainCustody3Other;

    @Column(name = "cs8_fscChainCustody4Other", nullable = true)
    private Boolean fscChainCustody4Other;

    @Column(name = "cs8_fscChainCustody5Other", nullable = true)
    private Boolean fscChainCustody5Other;

    @Column(name = "cs8_fscChainCustody6Other", nullable = true)
    private Boolean fscChainCustody6Other;

    @Column(name = "cs8_fscChainCustody7Other", nullable = true)
    private Boolean fscChainCustody7Other;

    @Column(name = "cs8_fscChainCustody8Other", nullable = true)
    private Boolean fscChainCustody8Other;

    @Column(name = "cs8_fscChainCustody9Other", nullable = true)
    private Boolean fscChainCustody9Other;

    @Column(name = "cs8_fscChainCustody10Other", nullable = true)
    private Boolean fscChainCustody10Other;

    @Column(name = "cs8_fscChainCustody11Other", nullable = true)
    private Boolean fscChainCustody11Other;

    @Column(name = "cs8_fscChainCustody12Other", nullable = true)
    private Boolean fscChainCustody12Other;

    @Column(name = "cs8_fscChainCustody13Other", nullable = true)
    private Boolean fscChainCustody13Other;

    @Column(name = "cs8_sfiLogoUseMotivation_1Other", nullable = true)
    private Boolean sfiLogoUseMotivation_1Other;

    @Column(name = "cs8_sfiLogoUseMotivation_2Other", nullable = true)
    private Boolean sfiLogoUseMotivation_2Other;

    @Column(name = "cs8_sfiLogoUseMotivation_3Other", nullable = true)
    private Boolean sfiLogoUseMotivation_3Other;

    @Column(name = "cs8_sfiLogoUseMotivation_4Other", nullable = true)
    private Boolean sfiLogoUseMotivation_4Other;

    @Column(name = "cs8_sfiLogoUseMotivation_5Other", nullable = true)
    private Boolean sfiLogoUseMotivation_5Other;

    @Column(name = "cs8_sfiLogoUseMotivation_6Other", nullable = true)
    private Boolean sfiLogoUseMotivation_6Other;

    @Column(name = "cs8_sfiLogoUseMotivation_7Other", nullable = true)
    private Boolean sfiLogoUseMotivation_7Other;

    @Column(name = "cs8_sfiLogoUseMotivation_8Other", nullable = true)
    private Boolean sfiLogoUseMotivation_8Other;

    @Column(name = "cs8_sfiLogoUseMotivation_9Other", nullable = true)
    private Boolean sfiLogoUseMotivation_9Other;

    @Column(name = "cs8_sfiLogoUseMotivation_10Other", nullable = true)
    private Boolean sfiLogoUseMotivation_10Other;

    @Column(name = "cs8_sfiLogoUseMotivation_11Other", nullable = true)
    private Boolean sfiLogoUseMotivation_11Other;

    @Column(name = "cs8_sfiLogoUseMotivation_12Other", nullable = true)
    private Boolean sfiLogoUseMotivation_12Other;

    @Column(name = "cs8_sfiLogoUseMotivation_13Other", nullable = true)
    private Boolean sfiLogoUseMotivation_13Other;

    @Column(name = "cs8_whyChoseSFI20OtherSpecify", nullable = true)
    private String whyChoseSFI20OtherSpecify;

    @Column(name = "cs8_sfiLogoUseMotivation_1Describe", nullable = true)
    private String sfiLogoUseMotivation_1Describe;

    @Column(name = "cs8_sfiLogoUseMotivation_2Describe", nullable = true)
    private String sfiLogoUseMotivation_2Describe;

    @Column(name = "cs8_sfiLogoUseMotivation_3Describe", nullable = true)
    private String sfiLogoUseMotivation_3Describe;

    @Column(name = "cs8_sfiLogoUseMotivation_4Describe", nullable = true)
    private String sfiLogoUseMotivation_4Describe;

    @Column(name = "cs8_sfiLogoUseMotivation_5Describe", nullable = true)
    private String sfiLogoUseMotivation_5Describe;

    @Column(name = "cs8_sfiLogoUseMotivation_6Describe", nullable = true)
    private String sfiLogoUseMotivation_6Describe;

    @Column(name = "cs8_sfiLogoUseMotivation_7Describe", nullable = true)
    private String sfiLogoUseMotivation_7Describe;

    @Column(name = "cs8_sfiLogoUseMotivation_8Describe", nullable = true)
    private String sfiLogoUseMotivation_8Describe;

    @Column(name = "cs8_sfiLogoUseMotivation_9Describe", nullable = true)
    private String sfiLogoUseMotivation_9Describe;

    @Column(name = "cs8_sfiLogoUseMotivation_10Describe", nullable = true)
    private String sfiLogoUseMotivation_10Describe;

    @Column(name = "cs8_sfiLogoUseMotivation_11Describe", nullable = true)
    private String sfiLogoUseMotivation_11Describe;

    @Column(name = "cs8_sfiLogoUseMotivation_12Describe", nullable = true)
    private String sfiLogoUseMotivation_12Describe;

    @Column(name = "cs8_sfiLogoUseMotivation_13Describe", nullable = true)
    private String sfiLogoUseMotivation_13Describe;

    @Column(name = "cs8_fscChainCustody1OtherDescribe", nullable = true)
    private String fscChainCustody1OtherDescribe;

    @Column(name = "cs8_fscChainCustody2OtherDescribe", nullable = true)
    private String fscChainCustody2OtherDescribe;

    @Column(name = "cs8_fscChainCustody3OtherDescribe", nullable = true)
    private String fscChainCustody3OtherDescribe;

    @Column(name = "cs8_fscChainCustody4OtherDescribe", nullable = true)
    private String fscChainCustody4OtherDescribe;

    @Column(name = "cs8_fscChainCustody5OtherDescribe", nullable = true)
    private String fscChainCustody5OtherDescribe;

    @Column(name = "cs8_fscChainCustody6OtherDescribe", nullable = true)
    private String fscChainCustody6OtherDescribe;

    @Column(name = "cs8_fscChainCustody7OtherDescribe", nullable = true)
    private String fscChainCustody7OtherDescribe;

    @Column(name = "cs8_fscChainCustody8OtherDescribe", nullable = true)
    private String fscChainCustody8OtherDescribe;

    @Column(name = "cs8_fscChainCustody9OtherDescribe", nullable = true)
    private String fscChainCustody9OtherDescribe;

    @Column(name = "cs8_fscChainCustody10OtherDescribe", nullable = true)
    private String fscChainCustody10OtherDescribe;

    @Column(name = "cs8_fscChainCustody11OtherDescribe", nullable = true)
    private String fscChainCustody11OtherDescribe;

    @Column(name = "cs8_fscChainCustody12OtherDescribe", nullable = true)
    private String fscChainCustody12OtherDescribe;

    @Column(name = "cs8_fscChainCustody13OtherDescribe", nullable = true)
    private String fscChainCustody13OtherDescribe;


    @Column(name = "cs8_fscChainCustody10", nullable = true)
    private Integer fscChainCustody10;

    @Column(name = "cs8_fscChainCustody11", nullable = true)
    private Integer fscChainCustody11;

    @Column(name = "cs8_fscChainCustody12", nullable = true)
    private Integer fscChainCustody12;

    @Column(name = "cs8_fscChainCustody13", nullable = true)
    private Integer fscChainCustody13;

    @Column(name = "cs8_fscChainCustody1", nullable = true)
    private Integer fscChainCustody1;

    @Column(name = "cs8_fscChainCustody2", nullable = true)
    private Integer fscChainCustody2;

    @Column(name = "cs8_fscChainCustody3", nullable = true)
    private Integer fscChainCustody3;

    @Column(name = "cs8_fscChainCustody4", nullable = true)
    private Integer fscChainCustody4;

    @Column(name = "cs8_fscChainCustody5", nullable = true)
    private Integer fscChainCustody5;

    @Column(name = "cs8_fscChainCustody6", nullable = true)
    private Integer fscChainCustody6;

    @Column(name = "cs8_fscChainCustody7", nullable = true)
    private Integer fscChainCustody7;

    @Column(name = "cs8_fscChainCustody8", nullable = true)
    private Integer fscChainCustody8;

    @Column(name = "cs8_fscChainCustody9", nullable = true)
    private Integer fscChainCustody9;

    @Column(name = "cs8_pefcChainCustody10", nullable = true)
    private Integer pefcChainCustody10;

    @Column(name = "cs8_pefcChainCustody11", nullable = true)
    private Integer pefcChainCustody11;

    @Column(name = "cs8_pefcChainCustody12", nullable = true)
    private Integer pefcChainCustody12;

    @Column(name = "cs8_pefcChainCustody13", nullable = true)
    private Integer pefcChainCustody13;

    @Column(name = "cs8_pefcChainCustody1", nullable = true)
    private Integer pefcChainCustody1;

    @Column(name = "cs8_pefcChainCustody2", nullable = true)
    private Integer pefcChainCustody2;

    @Column(name = "cs8_pefcChainCustody3", nullable = true)
    private Integer pefcChainCustody3;

    @Column(name = "cs8_pefcChainCustody4", nullable = true)
    private Integer pefcChainCustody4;

    @Column(name = "cs8_pefcChainCustody5", nullable = true)
    private Integer pefcChainCustody5;

    @Column(name = "cs8_pefcChainCustody6", nullable = true)
    private Integer pefcChainCustody6;

    @Column(name = "cs8_pefcChainCustody7", nullable = true)
    private Integer pefcChainCustody7;

    @Column(name = "cs8_pefcChainCustody8", nullable = true)
    private Integer pefcChainCustody8;

    @Column(name = "cs8_pefcChainCustody9", nullable = true)
    private Integer pefcChainCustody9;

    @Column(name = "cs8_percCerfiedOther10", nullable = true)
    private Integer percCerfiedOther10;

    @Column(name = "cs8_percCerfiedOther11", nullable = true)
    private Integer percCerfiedOther11;

    @Column(name = "cs8_percCerfiedOther12", nullable = true)
    private Integer percCerfiedOther12;

    @Column(name = "cs8_percCerfiedOther13", nullable = true)
    private Integer percCerfiedOther13;

    @Column(name = "cs8_percCerfiedOther1", nullable = true)
    private Integer percCerfiedOther1;

    @Column(name = "cs8_percCerfiedOther2", nullable = true)
    private Integer percCerfiedOther2;

    @Column(name = "cs8_percCerfiedOther3", nullable = true)
    private Integer percCerfiedOther3;

    @Column(name = "cs8_percCerfiedOther4", nullable = true)
    private Integer percCerfiedOther4;

    @Column(name = "cs8_percCerfiedOther5", nullable = true)
    private Integer percCerfiedOther5;

    @Column(name = "cs8_percCerfiedOther6", nullable = true)
    private Integer percCerfiedOther6;

    @Column(name = "cs8_percCerfiedOther7", nullable = true)
    private Integer percCerfiedOther7;

    @Column(name = "cs8_percCerfiedOther8", nullable = true)
    private Integer percCerfiedOther8;

    @Column(name = "cs8_percCerfiedOther9", nullable = true)
    private Integer percCerfiedOther9;

    @Column(name = "cs8_sfiCertifiedSourcing10", nullable = true)
    private Integer sfiCertifiedSourcing10;

    @Column(name = "cs8_sfiCertifiedSourcing11", nullable = true)
    private Integer sfiCertifiedSourcing11;

    @Column(name = "cs8_sfiCertifiedSourcing12", nullable = true)
    private Integer sfiCertifiedSourcing12;

    @Column(name = "cs8_sfiCertifiedSourcing13", nullable = true)
    private Integer sfiCertifiedSourcing13;

    @Column(name = "cs8_sfiCertifiedSourcing1", nullable = true)
    private Integer sfiCertifiedSourcing1;

    @Column(name = "cs8_sfiCertifiedSourcing2", nullable = true)
    private Integer sfiCertifiedSourcing2;

    @Column(name = "cs8_sfiCertifiedSourcing3", nullable = true)
    private Integer sfiCertifiedSourcing3;

    @Column(name = "cs8_sfiCertifiedSourcing4", nullable = true)
    private Integer sfiCertifiedSourcing4;

    @Column(name = "cs8_sfiCertifiedSourcing5", nullable = true)
    private Integer sfiCertifiedSourcing5;

    @Column(name = "cs8_sfiCertifiedSourcing6", nullable = true)
    private Integer sfiCertifiedSourcing6;

    @Column(name = "cs8_sfiCertifiedSourcing7", nullable = true)
    private Integer sfiCertifiedSourcing7;

    @Column(name = "cs8_sfiCertifiedSourcing8", nullable = true)
    private Integer sfiCertifiedSourcing8;

    @Column(name = "cs8_sfiCertifiedSourcing9", nullable = true)
    private Integer sfiCertifiedSourcing9;

    @Column(name = "cs8_sfiChainCustody10", nullable = true)
    private Integer sfiChainCustody10;

    @Column(name = "cs8_sfiChainCustody11", nullable = true)
    private Integer sfiChainCustody11;

    @Column(name = "cs8_sfiChainCustody12", nullable = true)
    private Integer sfiChainCustody12;

    @Column(name = "cs8_sfiChainCustody13", nullable = true)
    private Integer sfiChainCustody13;

    @Column(name = "cs8_sfiChainCustody1", nullable = true)
    private Integer sfiChainCustody1;

    @Column(name = "cs8_sfiChainCustody2", nullable = true)
    private Integer sfiChainCustody2;

    @Column(name = "cs8_sfiChainCustody3", nullable = true)
    private Integer sfiChainCustody3;

    @Column(name = "cs8_sfiChainCustody4", nullable = true)
    private Integer sfiChainCustody4;

    @Column(name = "cs8_sfiChainCustody5", nullable = true)
    private Integer sfiChainCustody5;

    @Column(name = "cs8_sfiChainCustody6", nullable = true)
    private Integer sfiChainCustody6;

    @Column(name = "cs8_sfiChainCustody7", nullable = true)
    private Integer sfiChainCustody7;

    @Column(name = "cs8_sfiChainCustody8", nullable = true)
    private Integer sfiChainCustody8;

    @Column(name = "cs8_sfiChainCustody9", nullable = true)
    private Integer sfiChainCustody9;

    @Column(name = "cs8_FSCLandCertification", nullable = true)
    private Integer FSCLandCertification;

    @Column(name = "cs8_ChainOfCustody_FSCCertification", nullable = true)
    private Integer ChainOfCustody_FSCCertification;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainPEFC_Country_4",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_4;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainPEFC_Country_5",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_5;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainPEFC_Country_6",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_6;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainPEFC_Country_7",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_7;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainPEFC_Country_8",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_8;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainPEFC_Country_9",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_9;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductSellCountry_1",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductSellCountry_1;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductSellCountry_10",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductSellCountry_10;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductSellCountry_11",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductSellCountry_11;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductSellCountry_12",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductSellCountry_12;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductSellCountry_13",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductSellCountry_13;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductSellCountry_2",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductSellCountry_2;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductSellCountry_3",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductSellCountry_3;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductSellCountry_4",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductSellCountry_4;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductSellCountry_5",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductSellCountry_5;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductSellCountry_6",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductSellCountry_6;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductSellCountry_7",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductSellCountry_7;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductSellCountry_8",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductSellCountry_8;

    @OneToMany(targetEntity = OrgContact.class, mappedBy = "sfiPpForm", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<OrgContact> orgContacts;

    @OneToMany(targetEntity = PrimaryProducer.class, mappedBy = "sfiPpForm", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PrimaryProducer> primaryProducers;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductSellCountry_9",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductSellCountry_9;

    @Column(name = "cs8_alsoFSCLabel_10", nullable = true)
    @Type(type = "text")
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> alsoFSCLabel_10;

    @Column(name = "cs8_alsoFSCLabel_11", nullable = true)
    @Type(type = "text")
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> alsoFSCLabel_11;

    @Column(name = "cs8_alsoFSCLabel_12", nullable = true)
    @Type(type = "text")
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> alsoFSCLabel_12;

    @Column(name = "cs8_alsoFSCLabel_13", nullable = true)
    @Type(type = "text")
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> alsoFSCLabel_13;

    @Column(name = "cs8_alsoFSCLabel_1", nullable = true)
    @Type(type = "text")
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> alsoFSCLabel_1;

    @Column(name = "cs8_alsoFSCLabel_2", nullable = true)
    @Type(type = "text")
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> alsoFSCLabel_2;

    @Column(name = "cs8_alsoFSCLabel_3", nullable = true)
    @Type(type = "text")
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> alsoFSCLabel_3;

    @Column(name = "cs8_alsoFSCLabel_4", nullable = true)
    @Type(type = "text")
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> alsoFSCLabel_4;

    @Column(name = "cs8_alsoFSCLabel_5", nullable = true)
    @Type(type = "text")
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> alsoFSCLabel_5;

    @Column(name = "cs8_alsoFSCLabel_6", nullable = true)
    @Type(type = "text")
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> alsoFSCLabel_6;

    @Column(name = "cs8_alsoFSCLabel_7", nullable = true)
    @Type(type = "text")
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> alsoFSCLabel_7;

    @Column(name = "cs8_alsoFSCLabel_8", nullable = true)
    @Type(type = "text")
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> alsoFSCLabel_8;

    @Column(name = "cs8_alsoFSCLabel_9", nullable = true)
    @Type(type = "text")
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> alsoFSCLabel_9;

    @Column(name = "cs8_sfiLabelProductGroupContain_10", nullable = true)
    @Type(type = "text")
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductGroupContain_10;

    @Column(name = "cs8_sfiLabelProductGroupContain_11", nullable = true)
    @Type(type = "text")
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductGroupContain_11;

    @Column(name = "cs8_sfiLabelProductGroupContain_12", nullable = true)
    @Type(type = "text")
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductGroupContain_12;

    @Column(name = "cs8_sfiLabelProductGroupContain_13", nullable = true)
    @Type(type = "text")
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductGroupContain_13;

    @Column(name = "cs8_sfiLabelProductGroupContain_1", nullable = true)
    @Type(type = "text")
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductGroupContain_1;

    @Column(name = "cs8_sfiLabelProductGroupContain_2", nullable = true)
    @Type(type = "text")
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductGroupContain_2;

    @Column(name = "cs8_sfiLabelProductGroupContain_3", nullable = true)
    @Type(type = "text")
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductGroupContain_3;

    @Column(name = "cs8_sfiLabelProductGroupContain_4", nullable = true)
    @Type(type = "text")
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductGroupContain_4;

    @Column(name = "cs8_sfiLabelProductGroupContain_5", nullable = true)
    @Type(type = "text")
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductGroupContain_5;

    @Column(name = "cs8_sfiLabelProductGroupContain_6", nullable = true)
    @Type(type = "text")
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductGroupContain_6;

    @Column(name = "cs8_sfiLabelProductGroupContain_7", nullable = true)
    @Type(type = "text")
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductGroupContain_7;

    @Column(name = "cs8_sfiLabelProductGroupContain_8", nullable = true)
    @Type(type = "text")
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductGroupContain_8;

    @Column(name = "cs8_sfiLabelProductGroupContain_9", nullable = true)
    @Type(type = "text")
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductGroupContain_9;

    @Column(name = "cs8_sfiLabelProductSell_10", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductSell_10;

    @Column(name = "cs8_sfiLabelProductSell_11", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductSell_11;

    @Column(name = "cs8_sfiLabelProductSell_12", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductSell_12;

    @Column(name = "cs8_sfiLabelProductSell_13", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductSell_13;

    @Column(name = "cs8_sfiLabelProductSell_1", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductSell_1;

    @Column(name = "cs8_sfiLabelProductSell_2", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductSell_2;

    @Column(name = "cs8_sfiLabelProductSell_3", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductSell_3;

    @Column(name = "cs8_sfiLabelProductSell_4", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductSell_4;

    @Column(name = "cs8_sfiLabelProductSell_5", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductSell_5;

    @Column(name = "cs8_sfiLabelProductSell_6", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductSell_6;

    @Column(name = "cs8_sfiLabelProductSell_7", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductSell_7;

    @Column(name = "cs8_sfiLabelProductSell_8", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductSell_8;

    @Column(name = "cs8_sfiLabelProductSell_9", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductSell_9;

    @Column(name = "cs8_demandDeveloping_10", columnDefinition = "TEXT", nullable = true)
    private String demandDeveloping_10;

    @Column(name = "cs8_demandDeveloping_11", columnDefinition = "TEXT", nullable = true)
    private String demandDeveloping_11;

    @Column(name = "cs8_demandDeveloping_12", columnDefinition = "TEXT", nullable = true)
    private String demandDeveloping_12;

    @Column(name = "cs8_demandDeveloping_13", columnDefinition = "TEXT", nullable = true)
    private String demandDeveloping_13;

    @Column(name = "cs8_demandDeveloping_1", columnDefinition = "TEXT", nullable = true)
    private String demandDeveloping_1;

    @Column(name = "cs8_demandDeveloping_2", columnDefinition = "TEXT", nullable = true)
    private String demandDeveloping_2;

    @Column(name = "cs8_demandDeveloping_3", columnDefinition = "TEXT", nullable = true)
    private String demandDeveloping_3;

    @Column(name = "cs8_demandDeveloping_4", columnDefinition = "TEXT", nullable = true)
    private String demandDeveloping_4;

    @Column(name = "cs8_demandDeveloping_5", columnDefinition = "TEXT", nullable = true)
    private String demandDeveloping_5;

    @Column(name = "cs8_demandDeveloping_6", columnDefinition = "TEXT", nullable = true)
    private String demandDeveloping_6;

    @Column(name = "cs8_demandDeveloping_7", columnDefinition = "TEXT", nullable = true)
    private String demandDeveloping_7;

    @Column(name = "cs8_demandDeveloping_8", columnDefinition = "TEXT", nullable = true)
    private String demandDeveloping_8;

    @Column(name = "cs8_demandDeveloping_9", columnDefinition = "TEXT", nullable = true)
    private String demandDeveloping_9;

    @Column(name = "cs8_demandSfiSourcing_10", columnDefinition = "TEXT", nullable = true)
    private String demandSfiSourcing_10;

    @Column(name = "cs8_demandSfiSourcing_11", columnDefinition = "TEXT", nullable = true)
    private String demandSfiSourcing_11;

    @Column(name = "cs8_demandSfiSourcing_12", columnDefinition = "TEXT", nullable = true)
    private String demandSfiSourcing_12;

    @Column(name = "cs8_demandSfiSourcing_13", columnDefinition = "TEXT", nullable = true)
    private String demandSfiSourcing_13;

    @Column(name = "cs8_demandSfiSourcing_1", columnDefinition = "TEXT", nullable = true)
    private String demandSfiSourcing_1;

    @Column(name = "cs8_demandSfiSourcing_2", columnDefinition = "TEXT", nullable = true)
    private String demandSfiSourcing_2;

    @Column(name = "cs8_demandSfiSourcing_3", columnDefinition = "TEXT", nullable = true)
    private String demandSfiSourcing_3;

    @Column(name = "cs8_demandSfiSourcing_4", columnDefinition = "TEXT", nullable = true)
    private String demandSfiSourcing_4;

    @Column(name = "cs8_demandSfiSourcing_5", columnDefinition = "TEXT", nullable = true)
    private String demandSfiSourcing_5;

    @Column(name = "cs8_demandSfiSourcing_6", columnDefinition = "TEXT", nullable = true)
    private String demandSfiSourcing_6;

    @Column(name = "cs8_demandSfiSourcing_7", columnDefinition = "TEXT", nullable = true)
    private String demandSfiSourcing_7;

    @Column(name = "cs8_demandSfiSourcing_8", columnDefinition = "TEXT", nullable = true)
    private String demandSfiSourcing_8;

    @Column(name = "cs8_demandSfiSourcing_9", columnDefinition = "TEXT", nullable = true)
    private String demandSfiSourcing_9;

    @Column(name = "cs8_fscCocCertification", columnDefinition = "TEXT", nullable = true)
    private String fscCocCertification;

    @Column(name = "cs8_fscCocCertificationExplain", columnDefinition = "TEXT", nullable = true)
    private String fscCocCertificationExplain;

    @Column(name = "cs8_fscCocCertificationItemsWhy_1", columnDefinition = "TEXT", nullable = true)
    private String fscCocCertificationItemsWhy_1;

    @Column(name = "cs8_fscForestCertification", columnDefinition = "TEXT", nullable = true)
    private String fscForestCertification;

    @Column(name = "cs8_fscForestCertificationExplain", columnDefinition = "TEXT", nullable = true)
    private String fscForestCertificationExplain;

    @Column(name = "cs8_fscForestCertificationWhy_1", columnDefinition = "TEXT", nullable = true)
    private String fscForestCertificationWhy_1;

    @Column(name = "cs8_pefcDemandDeveloping_10", columnDefinition = "TEXT", nullable = true)
    private String pefcDemandDeveloping_10;

    @Column(name = "cs8_pefcDemandDeveloping_11", columnDefinition = "TEXT", nullable = true)
    private String pefcDemandDeveloping_11;

    @Column(name = "cs8_pefcDemandDeveloping_12", columnDefinition = "TEXT", nullable = true)
    private String pefcDemandDeveloping_12;

    @Column(name = "cs8_pefcDemandDeveloping_13", columnDefinition = "TEXT", nullable = true)
    private String pefcDemandDeveloping_13;

    @Column(name = "cs8_pefcDemandDeveloping_1", columnDefinition = "TEXT", nullable = true)
    private String pefcDemandDeveloping_1;

    @Column(name = "cs8_pefcDemandDeveloping_2", columnDefinition = "TEXT", nullable = true)
    private String pefcDemandDeveloping_2;

    @Column(name = "cs8_pefcDemandDeveloping_3", columnDefinition = "TEXT", nullable = true)
    private String pefcDemandDeveloping_3;

    @Column(name = "cs8_pefcDemandDeveloping_4", columnDefinition = "TEXT", nullable = true)
    private String pefcDemandDeveloping_4;

    @Column(name = "cs8_pefcDemandDeveloping_5", columnDefinition = "TEXT", nullable = true)
    private String pefcDemandDeveloping_5;

    @Column(name = "cs8_pefcDemandDeveloping_6", columnDefinition = "TEXT", nullable = true)
    private String pefcDemandDeveloping_6;

    @Column(name = "cs8_pefcDemandDeveloping_7", columnDefinition = "TEXT", nullable = true)
    private String pefcDemandDeveloping_7;

    @Column(name = "cs8_pefcDemandDeveloping_8", columnDefinition = "TEXT", nullable = true)
    private String pefcDemandDeveloping_8;

    @Column(name = "cs8_pefcDemandDeveloping_9", columnDefinition = "TEXT", nullable = true)
    private String pefcDemandDeveloping_9;

    @Column(name = "cs8_planSfiLabelUseComment10", columnDefinition = "TEXT", nullable = true)
    @Type(type="text")
    private String planSfiLabelUseComment10;

    @Column(name = "cs8_planSfiLabelUseComment11", columnDefinition = "TEXT", nullable = true)
    @Type(type="text")
    private String planSfiLabelUseComment11;

    @Column(name = "cs8_planSfiLabelUseComment12", columnDefinition = "TEXT", nullable = true)
    @Type(type="text")
    private String planSfiLabelUseComment12;

    @Column(name = "cs8_planSfiLabelUseComment1", columnDefinition = "TEXT", nullable = true)
    @Type(type="text")
    private String planSfiLabelUseComment1;

    @Column(name = "cs8_planSfiLabelUseComment2", columnDefinition = "TEXT", nullable = true)
    @Type(type="text")
    private String planSfiLabelUseComment2;

    @Column(name = "cs8_planSfiLabelUseComment3", columnDefinition = "TEXT", nullable = true)
    @Type(type="text")
    private String planSfiLabelUseComment3;

    @Column(name = "cs8_planSfiLabelUseComment4", columnDefinition = "TEXT", nullable = true)
    @Type(type="text")
    private String planSfiLabelUseComment4;

    @Column(name = "cs8_planSfiLabelUseComment5", columnDefinition = "TEXT", nullable = true)
    @Type(type="text")
    private String planSfiLabelUseComment5;

    @Column(name = "cs8_planSfiLabelUseComment6", columnDefinition = "TEXT", nullable = true)
    @Type(type="text")
    private String planSfiLabelUseComment6;

    @Column(name = "cs8_planSfiLabelUseComment7", columnDefinition = "TEXT", nullable = true)
    @Type(type="text")
    private String planSfiLabelUseComment7;

    @Column(name = "cs8_planSfiLabelUseComment8", columnDefinition = "TEXT", nullable = true)
    @Type(type="text")
    private String planSfiLabelUseComment8;

    @Column(name = "cs8_planSfiLabelUseComment9", columnDefinition = "TEXT", nullable = true)
    @Type(type="text")
    private String planSfiLabelUseComment9;

    @Column(name = "cs8_planSfiLabelUseIncrease10", columnDefinition = "TEXT", nullable = true)
    private String planSfiLabelUseIncrease10;

    @Column(name = "cs8_planSfiLabelUseIncrease11", columnDefinition = "TEXT", nullable = true)
    private String planSfiLabelUseIncrease11;

    @Column(name = "cs8_planSfiLabelUseIncrease12", columnDefinition = "TEXT", nullable = true)
    private String planSfiLabelUseIncrease12;

    @Column(name = "cs8_planSfiLabelUseIncrease13", columnDefinition = "TEXT", nullable = true)
    private String planSfiLabelUseIncrease13;

    @Column(name = "cs8_planSfiLabelUseIncrease1", columnDefinition = "TEXT", nullable = true)
    private String planSfiLabelUseIncrease1;

    @Column(name = "cs8_planSfiLabelUseIncrease2", columnDefinition = "TEXT", nullable = true)
    private String planSfiLabelUseIncrease2;

    @Column(name = "cs8_planSfiLabelUseIncrease3", columnDefinition = "TEXT", nullable = true)
    private String planSfiLabelUseIncrease3;

    @Column(name = "cs8_planSfiLabelUseIncrease4", columnDefinition = "TEXT", nullable = true)
    private String planSfiLabelUseIncrease4;

    @Column(name = "cs8_planSfiLabelUseIncrease5", columnDefinition = "TEXT", nullable = true)
    private String planSfiLabelUseIncrease5;

    @Column(name = "cs8_planSfiLabelUseIncrease6", columnDefinition = "TEXT", nullable = true)
    private String planSfiLabelUseIncrease6;

    @Column(name = "cs8_planSfiLabelUseIncrease7", columnDefinition = "TEXT", nullable = true)
    private String planSfiLabelUseIncrease7;

    @Column(name = "cs8_planSfiLabelUseIncrease8", columnDefinition = "TEXT", nullable = true)
    private String planSfiLabelUseIncrease8;

    @Column(name = "cs8_planSfiLabelUseIncrease9", columnDefinition = "TEXT", nullable = true)
    private String planSfiLabelUseIncrease9;

    @Column(name = "cs8_requestWentMarketPerc10", columnDefinition = "TEXT", nullable = true)
    private String requestWentMarketPerc10;

    @Column(name = "cs8_requestWentMarketPerc11", columnDefinition = "TEXT", nullable = true)
    private String requestWentMarketPerc11;

    @Column(name = "cs8_requestWentMarketPerc12", columnDefinition = "TEXT", nullable = true)
    private String requestWentMarketPerc12;

    @Column(name = "cs8_requestWentMarketPerc13", columnDefinition = "TEXT", nullable = true)
    private String requestWentMarketPerc13;

    @Column(name = "cs8_requestWentMarketPerc1", columnDefinition = "TEXT", nullable = true)
    private String requestWentMarketPerc1;

    @Column(name = "cs8_requestWentMarketPerc2", columnDefinition = "TEXT", nullable = true)
    private String requestWentMarketPerc2;

    @Column(name = "cs8_requestWentMarketPerc3", columnDefinition = "TEXT", nullable = true)
    private String requestWentMarketPerc3;

    @Column(name = "cs8_requestWentMarketPerc4", columnDefinition = "TEXT", nullable = true)
    private String requestWentMarketPerc4;

    @Column(name = "cs8_requestWentMarketPerc5", columnDefinition = "TEXT", nullable = true)
    private String requestWentMarketPerc5;

    @Column(name = "cs8_requestWentMarketPerc6", columnDefinition = "TEXT", nullable = true)
    private String requestWentMarketPerc6;

    @Column(name = "cs8_requestWentMarketPerc7", columnDefinition = "TEXT", nullable = true)
    private String requestWentMarketPerc7;

    @Column(name = "cs8_requestWentMarketPerc8", columnDefinition = "TEXT", nullable = true)
    private String requestWentMarketPerc8;

    @Column(name = "cs8_requestWentMarketPerc9", columnDefinition = "TEXT", nullable = true)
    private String requestWentMarketPerc9;

    @Column(name = "cs8_sfiDemandDeveloping_1", columnDefinition = "TEXT", nullable = true)
    private String sfiDemandDeveloping_1;

    @Column(name = "cs8_sfiForestContentCoc_10", columnDefinition = "TEXT", nullable = true)
    private String sfiForestContentCoc_10;

    @Column(name = "cs8_sfiForestContentCoc_11", columnDefinition = "TEXT", nullable = true)
    private String sfiForestContentCoc_11;

    @Column(name = "cs8_sfiForestContentCoc_12", columnDefinition = "TEXT", nullable = true)
    private String sfiForestContentCoc_12;

    @Column(name = "cs8_sfiForestContentCoc_13", columnDefinition = "TEXT", nullable = true)
    private String sfiForestContentCoc_13;

    @Column(name = "cs8_sfiForestContentCoc_1", columnDefinition = "TEXT", nullable = true)
    private String sfiForestContentCoc_1;

    @Column(name = "cs8_sfiForestContentCoc_2", columnDefinition = "TEXT", nullable = true)
    private String sfiForestContentCoc_2;

    @Column(name = "cs8_sfiForestContentCoc_3", columnDefinition = "TEXT", nullable = true)
    private String sfiForestContentCoc_3;

    @Column(name = "cs8_sfiForestContentCoc_4", columnDefinition = "TEXT", nullable = true)
    private String sfiForestContentCoc_4;

    @Column(name = "cs8_sfiForestContentCoc_5", columnDefinition = "TEXT", nullable = true)
    private String sfiForestContentCoc_5;

    @Column(name = "cs8_sfiForestContentCoc_6", columnDefinition = "TEXT", nullable = true)
    private String sfiForestContentCoc_6;

    @Column(name = "cs8_sfiForestContentCoc_7", columnDefinition = "TEXT", nullable = true)
    private String sfiForestContentCoc_7;

    @Column(name = "cs8_sfiForestContentCoc_8", columnDefinition = "TEXT", nullable = true)
    private String sfiForestContentCoc_8;

    @Column(name = "cs8_sfiForestContentCoc_9", columnDefinition = "TEXT", nullable = true)
    private String sfiForestContentCoc_9;

    @Column(name = "cs8_sfiLabelProductSell_explain_10", columnDefinition = "TEXT", nullable = true)
    private String sfiLabelProductSell_explain_10;

    @Column(name = "cs8_sfiLabelProductSell_explain_11", columnDefinition = "TEXT", nullable = true)
    private String sfiLabelProductSell_explain_11;

    @Column(name = "cs8_sfiLabelProductSell_explain_12", columnDefinition = "TEXT", nullable = true)
    private String sfiLabelProductSell_explain_12;

    @Column(name = "cs8_sfiLabelProductSell_explain_13", columnDefinition = "TEXT", nullable = true)
    private String sfiLabelProductSell_explain_13;

    @Column(name = "cs8_sfiLabelProductSell_explain_1", columnDefinition = "TEXT", nullable = true)
    private String sfiLabelProductSell_explain_1;

    @Column(name = "cs8_sfiLabelProductSell_explain_2", columnDefinition = "TEXT", nullable = true)
    private String sfiLabelProductSell_explain_2;

    @Column(name = "cs8_sfiLabelProductSell_explain_3", columnDefinition = "TEXT", nullable = true)
    private String sfiLabelProductSell_explain_3;

    @Column(name = "cs8_sfiLabelProductSell_explain_4", columnDefinition = "TEXT", nullable = true)
    private String sfiLabelProductSell_explain_4;

    @Column(name = "cs8_sfiLabelProductSell_explain_5", columnDefinition = "TEXT", nullable = true)
    private String sfiLabelProductSell_explain_5;

    @Column(name = "cs8_sfiLabelProductSell_explain_6", columnDefinition = "TEXT", nullable = true)
    private String sfiLabelProductSell_explain_6;

    @Column(name = "cs8_sfiLabelProductSell_explain_7", columnDefinition = "TEXT", nullable = true)
    private String sfiLabelProductSell_explain_7;

    @Column(name = "cs8_sfiLabelProductSell_explain_8", columnDefinition = "TEXT", nullable = true)
    private String sfiLabelProductSell_explain_8;

    @Column(name = "cs8_sfiLabelProductSell_explain_9", columnDefinition = "TEXT", nullable = true)
    private String sfiLabelProductSell_explain_9;

    @Column(name = "cs8_whyChoseSFI10", columnDefinition = "TEXT", nullable = true)
    private String whyChoseSFI10;

    @Column(name = "cs8_whyChoseSFI11", columnDefinition = "TEXT", nullable = true)
    private String whyChoseSFI11;

    @Column(name = "cs8_whyChoseSFI12", columnDefinition = "TEXT", nullable = true)
    private String whyChoseSFI12;

    @Column(name = "cs8_whyChoseSFI13", columnDefinition = "TEXT", nullable = true)
    private String whyChoseSFI13;

    @Column(name = "cs8_whyChoseSFI14", columnDefinition = "TEXT", nullable = true)
    private String whyChoseSFI14;

    @Column(name = "cs8_whyChoseSFI15", columnDefinition = "TEXT", nullable = true)
    private String whyChoseSFI15;

    @Column(name = "cs8_whyChoseSFI16", columnDefinition = "TEXT", nullable = true)
    private String whyChoseSFI16;

    @Column(name = "cs8_whyChoseSFI17", columnDefinition = "TEXT", nullable = true)
    private String whyChoseSFI17;

    @Column(name = "cs8_whyChoseSFI18", columnDefinition = "TEXT", nullable = true)
    private String whyChoseSFI18;

    @Column(name = "cs8_whyChoseSFI19", columnDefinition = "TEXT", nullable = true)
    private String whyChoseSFI19;

    @Column(name = "cs8_whyChoseSFI1", columnDefinition = "TEXT", nullable = true)
    private String whyChoseSFI1;

    @Column(name = "cs8_whyChoseSFI20", columnDefinition = "TEXT", nullable = true)
    private String whyChoseSFI20;

    @Column(name = "cs8_whyChoseSFI21", columnDefinition = "TEXT", nullable = true)
    private String whyChoseSFI21;

    @Column(name = "cs8_whyChoseSFI2", columnDefinition = "TEXT", nullable = true)
    private String whyChoseSFI2;

    @Column(name = "cs8_whyChoseSFI3", columnDefinition = "TEXT", nullable = true)
    private String whyChoseSFI3;

    @Column(name = "cs8_whyChoseSFI4", columnDefinition = "TEXT", nullable = true)
    private String whyChoseSFI4;

    @Column(name = "cs8_whyChoseSFI5", columnDefinition = "TEXT", nullable = true)
    private String whyChoseSFI5;

    @Column(name = "cs8_whyChoseSFI6", columnDefinition = "TEXT", nullable = true)
    private String whyChoseSFI6;

    @Column(name = "cs8_whyChoseSFI7", columnDefinition = "TEXT", nullable = true)
    private String whyChoseSFI7;

    @Column(name = "cs8_whyChoseSFI8", columnDefinition = "TEXT", nullable = true)
    private String whyChoseSFI8;

    @Column(name = "cs8_whyChoseSFI9", columnDefinition = "TEXT", nullable = true)
    private String whyChoseSFI9;

    @Column(name = "cs8_fscDemandDeveloping_1", columnDefinition = "TEXT", nullable = true)
    private String fscDemandDeveloping_1;

    @Column(name = "cs8_sfiDemandDeveloping_2", columnDefinition = "TEXT", nullable = true)
    private String sfiDemandDeveloping_2;

    @Column(name = "cs8_sfiDemandDeveloping_3", columnDefinition = "TEXT", nullable = true)
    private String sfiDemandDeveloping_3;

    @Column(name = "cs8_sfiDemandDeveloping_4", columnDefinition = "TEXT", nullable = true)
    private String sfiDemandDeveloping_4;

    @Column(name = "cs8_sfiDemandDeveloping_5", columnDefinition = "TEXT", nullable = true)
    private String sfiDemandDeveloping_5;

    @Column(name = "cs8_sfiDemandDeveloping_6", columnDefinition = "TEXT", nullable = true)
    private String sfiDemandDeveloping_6;

    @Column(name = "cs8_sfiDemandDeveloping_7", columnDefinition = "TEXT", nullable = true)
    private String sfiDemandDeveloping_7;

    @Column(name = "cs8_sfiDemandDeveloping_8", columnDefinition = "TEXT", nullable = true)
    private String sfiDemandDeveloping_8;

    @Column(name = "cs8_sfiDemandDeveloping_9", columnDefinition = "TEXT", nullable = true)
    private String sfiDemandDeveloping_9;

    @Column(name = "cs8_sfiDemandDeveloping_10", columnDefinition = "TEXT", nullable = true)
    private String sfiDemandDeveloping_10;

    @Column(name = "cs8_sfiDemandDeveloping_11", columnDefinition = "TEXT", nullable = true)
    private String sfiDemandDeveloping_11;

    @Column(name = "cs8_sfiDemandDeveloping_12", columnDefinition = "TEXT", nullable = true)
    private String sfiDemandDeveloping_12;

    @Column(name = "cs8_sfiDemandDeveloping_13", columnDefinition = "TEXT", nullable = true)
    private String sfiDemandDeveloping_13;

    @Column(name = "cs8_sfiHelpCommunicationExplain", columnDefinition = "TEXT", nullable = true)
    private String sfiHelpCommunicationExplain;

    @Column(name = "cs8_sfiMarketExplain1", columnDefinition = "TEXT", nullable = true)
    private String sfiMarketExplain1;

    @Column(name = "cs8_sfiMarketExplain2", columnDefinition = "TEXT", nullable = true)
    private String sfiMarketExplain2;

    @Column(name = "cs8_sfiServeComments", columnDefinition = "TEXT", nullable = true)
    @Type(type="text")
    private String sfiServeComments;

    @Column(name = "cs8_fscCocCertificationItemsWhy_2", columnDefinition = "TEXT", nullable = true)
    private String fscCocCertificationItemsWhy_2;

    @Column(name = "cs8_fscDemandDeveloping_4", columnDefinition = "TEXT", nullable = true)
    private String fscDemandDeveloping_4;

    @Column(name = "cs8_fscDemandDeveloping_5", columnDefinition = "TEXT", nullable = true)
    private String fscDemandDeveloping_5;

    @Column(name = "cs8_fscDemandDeveloping_1_1", nullable = true)
    private Integer sfiLogoUseMotivation_1_1;
    @Column(name = "cs8_fscDemandDeveloping_1_2", nullable = true)
    private Integer sfiLogoUseMotivation_1_2;
    @Column(name = "cs8_fscDemandDeveloping_1_3", nullable = true)
    private Integer sfiLogoUseMotivation_1_3;
    @Column(name = "cs8_fscDemandDeveloping_1_4", nullable = true)
    private Integer sfiLogoUseMotivation_1_4;
    @Column(name = "cs8_fscDemandDeveloping_1_5", nullable = true)
    private Integer sfiLogoUseMotivation_1_5;
    @Column(name = "cs8_fscDemandDeveloping_1_6", nullable = true)
    private Integer sfiLogoUseMotivation_1_6;
    @Column(name = "cs8_fscDemandDeveloping_1_7", nullable = true)
    private Integer sfiLogoUseMotivation_1_7;
    @Column(name = "cs8_fscDemandDeveloping_1_8", nullable = true)
    private Integer sfiLogoUseMotivation_1_8;
    @Column(name = "cs8_fscDemandDeveloping_1_9", nullable = true)
    private Integer sfiLogoUseMotivation_1_9;
    @Column(name = "cs8_fscDemandDeveloping_1_10", nullable = true)
    private Integer sfiLogoUseMotivation_1_10;
    @Column(name = "cs8_fscDemandDeveloping_1_11", nullable = true)
    private Integer sfiLogoUseMotivation_1_11;

    @Column(name = "cs8_fscDemandDeveloping_2_1", nullable = true)
    private Integer sfiLogoUseMotivation_2_1;
    @Column(name = "cs8_fscDemandDeveloping_2_2", nullable = true)
    private Integer sfiLogoUseMotivation_2_2;
    @Column(name = "cs8_fscDemandDeveloping_2_3", nullable = true)
    private Integer sfiLogoUseMotivation_2_3;
    @Column(name = "cs8_fscDemandDeveloping_2_4", nullable = true)
    private Integer sfiLogoUseMotivation_2_4;
    @Column(name = "cs8_fscDemandDeveloping_2_5", nullable = true)
    private Integer sfiLogoUseMotivation_2_5;
    @Column(name = "cs8_fscDemandDeveloping_2_6", nullable = true)
    private Integer sfiLogoUseMotivation_2_6;
    @Column(name = "cs8_fscDemandDeveloping_2_7", nullable = true)
    private Integer sfiLogoUseMotivation_2_7;
    @Column(name = "cs8_fscDemandDeveloping_2_8", nullable = true)
    private Integer sfiLogoUseMotivation_2_8;
    @Column(name = "cs8_fscDemandDeveloping_2_9", nullable = true)
    private Integer sfiLogoUseMotivation_2_9;
    @Column(name = "cs8_fscDemandDeveloping_2_10", nullable = true)
    private Integer sfiLogoUseMotivation_2_10;
    @Column(name = "cs8_fscDemandDeveloping_2_11", nullable = true)
    private Integer sfiLogoUseMotivation_2_11;

    @Column(name = "cs8_fscDemandDeveloping_3_1", nullable = true)
    private Integer sfiLogoUseMotivation_3_1;
    @Column(name = "cs8_fscDemandDeveloping_3_2", nullable = true)
    private Integer sfiLogoUseMotivation_3_2;
    @Column(name = "cs8_fscDemandDeveloping_3_3", nullable = true)
    private Integer sfiLogoUseMotivation_3_3;
    @Column(name = "cs8_fscDemandDeveloping_3_4", nullable = true)
    private Integer sfiLogoUseMotivation_3_4;
    @Column(name = "cs8_fscDemandDeveloping_3_5", nullable = true)
    private Integer sfiLogoUseMotivation_3_5;
    @Column(name = "cs8_fscDemandDeveloping_3_6", nullable = true)
    private Integer sfiLogoUseMotivation_3_6;
    @Column(name = "cs8_fscDemandDeveloping_3_7", nullable = true)
    private Integer sfiLogoUseMotivation_3_7;
    @Column(name = "cs8_fscDemandDeveloping_3_8", nullable = true)
    private Integer sfiLogoUseMotivation_3_8;
    @Column(name = "cs8_fscDemandDeveloping_3_9", nullable = true)
    private Integer sfiLogoUseMotivation_3_9;
    @Column(name = "cs8_fscDemandDeveloping_3_10", nullable = true)
    private Integer sfiLogoUseMotivation_3_10;
    @Column(name = "cs8_fscDemandDeveloping_3_11", nullable = true)
    private Integer sfiLogoUseMotivation_3_11;

    @Column(name = "cs8_fscDemandDeveloping_4_1", nullable = true)
    private Integer sfiLogoUseMotivation_4_1;
    @Column(name = "cs8_fscDemandDeveloping_4_2", nullable = true)
    private Integer sfiLogoUseMotivation_4_2;
    @Column(name = "cs8_fscDemandDeveloping_4_3", nullable = true)
    private Integer sfiLogoUseMotivation_4_3;
    @Column(name = "cs8_fscDemandDeveloping_4_4", nullable = true)
    private Integer sfiLogoUseMotivation_4_4;
    @Column(name = "cs8_fscDemandDeveloping_4_5", nullable = true)
    private Integer sfiLogoUseMotivation_4_5;
    @Column(name = "cs8_fscDemandDeveloping_4_6", nullable = true)
    private Integer sfiLogoUseMotivation_4_6;
    @Column(name = "cs8_fscDemandDeveloping_4_7", nullable = true)
    private Integer sfiLogoUseMotivation_4_7;
    @Column(name = "cs8_fscDemandDeveloping_4_8", nullable = true)
    private Integer sfiLogoUseMotivation_4_8;
    @Column(name = "cs8_fscDemandDeveloping_4_9", nullable = true)
    private Integer sfiLogoUseMotivation_4_9;
    @Column(name = "cs8_fscDemandDeveloping_4_10", nullable = true)
    private Integer sfiLogoUseMotivation_4_10;
    @Column(name = "cs8_fscDemandDeveloping_4_11", nullable = true)
    private Integer sfiLogoUseMotivation_4_11;

    @Column(name = "cs8_fscDemandDeveloping_5_1", nullable = true)
    private Integer sfiLogoUseMotivation_5_1;
    @Column(name = "cs8_fscDemandDeveloping_5_2", nullable = true)
    private Integer sfiLogoUseMotivation_5_2;
    @Column(name = "cs8_fscDemandDeveloping_5_3", nullable = true)
    private Integer sfiLogoUseMotivation_5_3;
    @Column(name = "cs8_fscDemandDeveloping_5_4", nullable = true)
    private Integer sfiLogoUseMotivation_5_4;
    @Column(name = "cs8_fscDemandDeveloping_5_5", nullable = true)
    private Integer sfiLogoUseMotivation_5_5;
    @Column(name = "cs8_fscDemandDeveloping_5_6", nullable = true)
    private Integer sfiLogoUseMotivation_5_6;
    @Column(name = "cs8_fscDemandDeveloping_5_7", nullable = true)
    private Integer sfiLogoUseMotivation_5_7;
    @Column(name = "cs8_fscDemandDeveloping_5_8", nullable = true)
    private Integer sfiLogoUseMotivation_5_8;
    @Column(name = "cs8_fscDemandDeveloping_5_9", nullable = true)
    private Integer sfiLogoUseMotivation_5_9;
    @Column(name = "cs8_fscDemandDeveloping_5_10", nullable = true)
    private Integer sfiLogoUseMotivation_5_10;
    @Column(name = "cs8_fscDemandDeveloping_5_11", nullable = true)
    private Integer sfiLogoUseMotivation_5_11;

    @Column(name = "cs8_fscDemandDeveloping_6_1", nullable = true)
    private Integer sfiLogoUseMotivation_6_1;
    @Column(name = "cs8_fscDemandDeveloping_6_2", nullable = true)
    private Integer sfiLogoUseMotivation_6_2;
    @Column(name = "cs8_fscDemandDeveloping_6_3", nullable = true)
    private Integer sfiLogoUseMotivation_6_3;
    @Column(name = "cs8_fscDemandDeveloping_6_4", nullable = true)
    private Integer sfiLogoUseMotivation_6_4;
    @Column(name = "cs8_fscDemandDeveloping_6_5", nullable = true)
    private Integer sfiLogoUseMotivation_6_5;
    @Column(name = "cs8_fscDemandDeveloping_6_6", nullable = true)
    private Integer sfiLogoUseMotivation_6_6;
    @Column(name = "cs8_fscDemandDeveloping_6_7", nullable = true)
    private Integer sfiLogoUseMotivation_6_7;
    @Column(name = "cs8_fscDemandDeveloping_6_8", nullable = true)
    private Integer sfiLogoUseMotivation_6_8;
    @Column(name = "cs8_fscDemandDeveloping_6_9", nullable = true)
    private Integer sfiLogoUseMotivation_6_9;
    @Column(name = "cs8_fscDemandDeveloping_6_10", nullable = true)
    private Integer sfiLogoUseMotivation_6_10;
    @Column(name = "cs8_fscDemandDeveloping_6_11", nullable = true)
    private Integer sfiLogoUseMotivation_6_11;

    @Column(name = "cs8_fscDemandDeveloping_7_1", nullable = true)
    private Integer sfiLogoUseMotivation_7_1;
    @Column(name = "cs8_fscDemandDeveloping_7_2", nullable = true)
    private Integer sfiLogoUseMotivation_7_2;
    @Column(name = "cs8_fscDemandDeveloping_7_3", nullable = true)
    private Integer sfiLogoUseMotivation_7_3;
    @Column(name = "cs8_fscDemandDeveloping_7_4", nullable = true)
    private Integer sfiLogoUseMotivation_7_4;
    @Column(name = "cs8_fscDemandDeveloping_7_5", nullable = true)
    private Integer sfiLogoUseMotivation_7_5;
    @Column(name = "cs8_fscDemandDeveloping_7_6", nullable = true)
    private Integer sfiLogoUseMotivation_7_6;
    @Column(name = "cs8_fscDemandDeveloping_7_7", nullable = true)
    private Integer sfiLogoUseMotivation_7_7;
    @Column(name = "cs8_fscDemandDeveloping_7_8", nullable = true)
    private Integer sfiLogoUseMotivation_7_8;
    @Column(name = "cs8_fscDemandDeveloping_7_9", nullable = true)
    private Integer sfiLogoUseMotivation_7_9;
    @Column(name = "cs8_fscDemandDeveloping_7_10", nullable = true)
    private Integer sfiLogoUseMotivation_7_10;
    @Column(name = "cs8_fscDemandDeveloping_7_11", nullable = true)
    private Integer sfiLogoUseMotivation_7_11;

    @Column(name = "cs8_fscDemandDeveloping_8_1", nullable = true)
    private Integer sfiLogoUseMotivation_8_1;
    @Column(name = "cs8_fscDemandDeveloping_8_2", nullable = true)
    private Integer sfiLogoUseMotivation_8_2;
    @Column(name = "cs8_fscDemandDeveloping_8_3", nullable = true)
    private Integer sfiLogoUseMotivation_8_3;
    @Column(name = "cs8_fscDemandDeveloping_8_4", nullable = true)
    private Integer sfiLogoUseMotivation_8_4;
    @Column(name = "cs8_fscDemandDeveloping_8_5", nullable = true)
    private Integer sfiLogoUseMotivation_8_5;
    @Column(name = "cs8_fscDemandDeveloping_8_6", nullable = true)
    private Integer sfiLogoUseMotivation_8_6;
    @Column(name = "cs8_fscDemandDeveloping_8_7", nullable = true)
    private Integer sfiLogoUseMotivation_8_7;
    @Column(name = "cs8_fscDemandDeveloping_8_8", nullable = true)
    private Integer sfiLogoUseMotivation_8_8;
    @Column(name = "cs8_fscDemandDeveloping_8_9", nullable = true)
    private Integer sfiLogoUseMotivation_8_9;
    @Column(name = "cs8_fscDemandDeveloping_8_10", nullable = true)
    private Integer sfiLogoUseMotivation_8_10;
    @Column(name = "cs8_fscDemandDeveloping_8_11", nullable = true)
    private Integer sfiLogoUseMotivation_8_11;

    @Column(name = "cs8_fscDemandDeveloping_9_1", nullable = true)
    private Integer sfiLogoUseMotivation_9_1;
    @Column(name = "cs8_fscDemandDeveloping_9_2", nullable = true)
    private Integer sfiLogoUseMotivation_9_2;
    @Column(name = "cs8_fscDemandDeveloping_9_3", nullable = true)
    private Integer sfiLogoUseMotivation_9_3;
    @Column(name = "cs8_fscDemandDeveloping_9_4", nullable = true)
    private Integer sfiLogoUseMotivation_9_4;
    @Column(name = "cs8_fscDemandDeveloping_9_5", nullable = true)
    private Integer sfiLogoUseMotivation_9_5;
    @Column(name = "cs8_fscDemandDeveloping_9_6", nullable = true)
    private Integer sfiLogoUseMotivation_9_6;
    @Column(name = "cs8_fscDemandDeveloping_9_7", nullable = true)
    private Integer sfiLogoUseMotivation_9_7;
    @Column(name = "cs8_fscDemandDeveloping_9_8", nullable = true)
    private Integer sfiLogoUseMotivation_9_8;
    @Column(name = "cs8_fscDemandDeveloping_9_9", nullable = true)
    private Integer sfiLogoUseMotivation_9_9;
    @Column(name = "cs8_fscDemandDeveloping_9_10", nullable = true)
    private Integer sfiLogoUseMotivation_9_10;
    @Column(name = "cs8_fscDemandDeveloping_9_11", nullable = true)
    private Integer sfiLogoUseMotivation_9_11;

    @Column(name = "cs8_fscDemandDeveloping_10_1", nullable = true)
    private Integer sfiLogoUseMotivation_10_1;
    @Column(name = "cs8_fscDemandDeveloping_10_2", nullable = true)
    private Integer sfiLogoUseMotivation_10_2;
    @Column(name = "cs8_fscDemandDeveloping_10_3", nullable = true)
    private Integer sfiLogoUseMotivation_10_3;
    @Column(name = "cs8_fscDemandDeveloping_10_4", nullable = true)
    private Integer sfiLogoUseMotivation_10_4;
    @Column(name = "cs8_fscDemandDeveloping_10_5", nullable = true)
    private Integer sfiLogoUseMotivation_10_5;
    @Column(name = "cs8_fscDemandDeveloping_10_6", nullable = true)
    private Integer sfiLogoUseMotivation_10_6;
    @Column(name = "cs8_fscDemandDeveloping_10_7", nullable = true)
    private Integer sfiLogoUseMotivation_10_7;
    @Column(name = "cs8_fscDemandDeveloping_10_8", nullable = true)
    private Integer sfiLogoUseMotivation_10_8;
    @Column(name = "cs8_fscDemandDeveloping_10_9", nullable = true)
    private Integer sfiLogoUseMotivation_10_9;
    @Column(name = "cs8_fscDemandDeveloping_10_10", nullable = true)
    private Integer sfiLogoUseMotivation_10_10;
    @Column(name = "cs8_fscDemandDeveloping_10_11", nullable = true)
    private Integer sfiLogoUseMotivation_10_11;

    @Column(name = "cs8_fscDemandDeveloping_11_1", nullable = true)
    private Integer sfiLogoUseMotivation_11_1;
    @Column(name = "cs8_fscDemandDeveloping_11_2", nullable = true)
    private Integer sfiLogoUseMotivation_11_2;
    @Column(name = "cs8_fscDemandDeveloping_11_3", nullable = true)
    private Integer sfiLogoUseMotivation_11_3;
    @Column(name = "cs8_fscDemandDeveloping_11_4", nullable = true)
    private Integer sfiLogoUseMotivation_11_4;
    @Column(name = "cs8_fscDemandDeveloping_11_5", nullable = true)
    private Integer sfiLogoUseMotivation_11_5;
    @Column(name = "cs8_fscDemandDeveloping_11_6", nullable = true)
    private Integer sfiLogoUseMotivation_11_6;
    @Column(name = "cs8_fscDemandDeveloping_11_7", nullable = true)
    private Integer sfiLogoUseMotivation_11_7;
    @Column(name = "cs8_fscDemandDeveloping_11_8", nullable = true)
    private Integer sfiLogoUseMotivation_11_8;
    @Column(name = "cs8_fscDemandDeveloping_11_9", nullable = true)
    private Integer sfiLogoUseMotivation_11_9;
    @Column(name = "cs8_fscDemandDeveloping_11_10", nullable = true)
    private Integer sfiLogoUseMotivation_11_10;
    @Column(name = "cs8_fscDemandDeveloping_11_11", nullable = true)
    private Integer sfiLogoUseMotivation_11_11;

    @Column(name = "cs8_fscDemandDeveloping_12_1", nullable = true)
    private Integer sfiLogoUseMotivation_12_1;
    @Column(name = "cs8_fscDemandDeveloping_12_2", nullable = true)
    private Integer sfiLogoUseMotivation_12_2;
    @Column(name = "cs8_fscDemandDeveloping_12_3", nullable = true)
    private Integer sfiLogoUseMotivation_12_3;
    @Column(name = "cs8_fscDemandDeveloping_12_4", nullable = true)
    private Integer sfiLogoUseMotivation_12_4;
    @Column(name = "cs8_fscDemandDeveloping_12_5", nullable = true)
    private Integer sfiLogoUseMotivation_12_5;
    @Column(name = "cs8_fscDemandDeveloping_12_6", nullable = true)
    private Integer sfiLogoUseMotivation_12_6;
    @Column(name = "cs8_fscDemandDeveloping_12_7", nullable = true)
    private Integer sfiLogoUseMotivation_12_7;
    @Column(name = "cs8_fscDemandDeveloping_12_8", nullable = true)
    private Integer sfiLogoUseMotivation_12_8;
    @Column(name = "cs8_fscDemandDeveloping_12_9", nullable = true)
    private Integer sfiLogoUseMotivation_12_9;
    @Column(name = "cs8_fscDemandDeveloping_12_10", nullable = true)
    private Integer sfiLogoUseMotivation_12_10;
    @Column(name = "cs8_fscDemandDeveloping_12_11", nullable = true)
    private Integer sfiLogoUseMotivation_12_11;

    @Column(name = "cs8_fscDemandDeveloping_13_1", nullable = true)
    private Integer sfiLogoUseMotivation_13_1;
    @Column(name = "cs8_fscDemandDeveloping_13_2", nullable = true)
    private Integer sfiLogoUseMotivation_13_2;
    @Column(name = "cs8_fscDemandDeveloping_13_3", nullable = true)
    private Integer sfiLogoUseMotivation_13_3;
    @Column(name = "cs8_fscDemandDeveloping_13_4", nullable = true)
    private Integer sfiLogoUseMotivation_13_4;
    @Column(name = "cs8_fscDemandDeveloping_13_5", nullable = true)
    private Integer sfiLogoUseMotivation_13_5;
    @Column(name = "cs8_fscDemandDeveloping_13_6", nullable = true)
    private Integer sfiLogoUseMotivation_13_6;
    @Column(name = "cs8_fscDemandDeveloping_13_7", nullable = true)
    private Integer sfiLogoUseMotivation_13_7;
    @Column(name = "cs8_fscDemandDeveloping_13_8", nullable = true)
    private Integer sfiLogoUseMotivation_13_8;
    @Column(name = "cs8_fscDemandDeveloping_13_9", nullable = true)
    private Integer sfiLogoUseMotivation_13_9;
    @Column(name = "cs8_fscDemandDeveloping_13_10", nullable = true)
    private Integer sfiLogoUseMotivation_13_10;
    @Column(name = "cs8_fscDemandDeveloping_13_11", nullable = true)
    private Integer sfiLogoUseMotivation_13_11;

    @Column(name = "cs8_fscDemandDeveloping_13", nullable = true)
    private Integer fscDemandDeveloping_13;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFscDemandDeveloping_5() {
        return fscDemandDeveloping_5;
    }

    public void setFscDemandDeveloping_5(String fscDemandDeveloping_5) {
        this.fscDemandDeveloping_5 = fscDemandDeveloping_5;
    }

    public Integer getFscDemandDeveloping_13() {
        return fscDemandDeveloping_13;
    }

    public void setFscDemandDeveloping_13(Integer fscDemandDeveloping_13) {
        this.fscDemandDeveloping_13 = fscDemandDeveloping_13;
    }

    public Boolean getWhyChoseSFI20Other() {
        return whyChoseSFI20Other;
    }

    public void setWhyChoseSFI20Other(Boolean whyChoseSFI20Other) {
        this.whyChoseSFI20Other = whyChoseSFI20Other;
    }

    public Boolean getFscChainCustody1Other() {
        return fscChainCustody1Other;
    }

    public void setFscChainCustody1Other(Boolean fscChainCustody1Other) {
        this.fscChainCustody1Other = fscChainCustody1Other;
    }

    public Boolean getFscChainCustody2Other() {
        return fscChainCustody2Other;
    }

    public void setFscChainCustody2Other(Boolean fscChainCustody2Other) {
        this.fscChainCustody2Other = fscChainCustody2Other;
    }

    public Boolean getFscChainCustody3Other() {
        return fscChainCustody3Other;
    }

    public void setFscChainCustody3Other(Boolean fscChainCustody3Other) {
        this.fscChainCustody3Other = fscChainCustody3Other;
    }

    public Boolean getFscChainCustody4Other() {
        return fscChainCustody4Other;
    }

    public void setFscChainCustody4Other(Boolean fscChainCustody4Other) {
        this.fscChainCustody4Other = fscChainCustody4Other;
    }

    public Boolean getFscChainCustody5Other() {
        return fscChainCustody5Other;
    }

    public void setFscChainCustody5Other(Boolean fscChainCustody5Other) {
        this.fscChainCustody5Other = fscChainCustody5Other;
    }

    public Boolean getFscChainCustody6Other() {
        return fscChainCustody6Other;
    }

    public void setFscChainCustody6Other(Boolean fscChainCustody6Other) {
        this.fscChainCustody6Other = fscChainCustody6Other;
    }

    public Boolean getFscChainCustody7Other() {
        return fscChainCustody7Other;
    }

    public void setFscChainCustody7Other(Boolean fscChainCustody7Other) {
        this.fscChainCustody7Other = fscChainCustody7Other;
    }

    public Boolean getFscChainCustody8Other() {
        return fscChainCustody8Other;
    }

    public void setFscChainCustody8Other(Boolean fscChainCustody8Other) {
        this.fscChainCustody8Other = fscChainCustody8Other;
    }

    public Boolean getFscChainCustody9Other() {
        return fscChainCustody9Other;
    }

    public void setFscChainCustody9Other(Boolean fscChainCustody9Other) {
        this.fscChainCustody9Other = fscChainCustody9Other;
    }

    public Boolean getFscChainCustody10Other() {
        return fscChainCustody10Other;
    }

    public void setFscChainCustody10Other(Boolean fscChainCustody10Other) {
        this.fscChainCustody10Other = fscChainCustody10Other;
    }

    public Boolean getFscChainCustody11Other() {
        return fscChainCustody11Other;
    }

    public void setFscChainCustody11Other(Boolean fscChainCustody11Other) {
        this.fscChainCustody11Other = fscChainCustody11Other;
    }

    public Boolean getFscChainCustody12Other() {
        return fscChainCustody12Other;
    }

    public void setFscChainCustody12Other(Boolean fscChainCustody12Other) {
        this.fscChainCustody12Other = fscChainCustody12Other;
    }

    public Boolean getFscChainCustody13Other() {
        return fscChainCustody13Other;
    }

    public void setFscChainCustody13Other(Boolean fscChainCustody13Other) {
        this.fscChainCustody13Other = fscChainCustody13Other;
    }

    public Boolean getSfiLogoUseMotivation_1Other() {
        return sfiLogoUseMotivation_1Other;
    }

    public void setSfiLogoUseMotivation_1Other(Boolean sfiLogoUseMotivation_1Other) {
        this.sfiLogoUseMotivation_1Other = sfiLogoUseMotivation_1Other;
    }

    public Boolean getSfiLogoUseMotivation_2Other() {
        return sfiLogoUseMotivation_2Other;
    }

    public void setSfiLogoUseMotivation_2Other(Boolean sfiLogoUseMotivation_2Other) {
        this.sfiLogoUseMotivation_2Other = sfiLogoUseMotivation_2Other;
    }

    public Boolean getSfiLogoUseMotivation_3Other() {
        return sfiLogoUseMotivation_3Other;
    }

    public void setSfiLogoUseMotivation_3Other(Boolean sfiLogoUseMotivation_3Other) {
        this.sfiLogoUseMotivation_3Other = sfiLogoUseMotivation_3Other;
    }

    public Boolean getSfiLogoUseMotivation_4Other() {
        return sfiLogoUseMotivation_4Other;
    }

    public void setSfiLogoUseMotivation_4Other(Boolean sfiLogoUseMotivation_4Other) {
        this.sfiLogoUseMotivation_4Other = sfiLogoUseMotivation_4Other;
    }

    public Boolean getSfiLogoUseMotivation_5Other() {
        return sfiLogoUseMotivation_5Other;
    }

    public void setSfiLogoUseMotivation_5Other(Boolean sfiLogoUseMotivation_5Other) {
        this.sfiLogoUseMotivation_5Other = sfiLogoUseMotivation_5Other;
    }

    public Boolean getSfiLogoUseMotivation_6Other() {
        return sfiLogoUseMotivation_6Other;
    }

    public void setSfiLogoUseMotivation_6Other(Boolean sfiLogoUseMotivation_6Other) {
        this.sfiLogoUseMotivation_6Other = sfiLogoUseMotivation_6Other;
    }

    public Boolean getSfiLogoUseMotivation_7Other() {
        return sfiLogoUseMotivation_7Other;
    }

    public void setSfiLogoUseMotivation_7Other(Boolean sfiLogoUseMotivation_7Other) {
        this.sfiLogoUseMotivation_7Other = sfiLogoUseMotivation_7Other;
    }

    public Boolean getSfiLogoUseMotivation_8Other() {
        return sfiLogoUseMotivation_8Other;
    }

    public void setSfiLogoUseMotivation_8Other(Boolean sfiLogoUseMotivation_8Other) {
        this.sfiLogoUseMotivation_8Other = sfiLogoUseMotivation_8Other;
    }

    public Boolean getSfiLogoUseMotivation_9Other() {
        return sfiLogoUseMotivation_9Other;
    }

    public void setSfiLogoUseMotivation_9Other(Boolean sfiLogoUseMotivation_9Other) {
        this.sfiLogoUseMotivation_9Other = sfiLogoUseMotivation_9Other;
    }

    public Boolean getSfiLogoUseMotivation_10Other() {
        return sfiLogoUseMotivation_10Other;
    }

    public void setSfiLogoUseMotivation_10Other(Boolean sfiLogoUseMotivation_10Other) {
        this.sfiLogoUseMotivation_10Other = sfiLogoUseMotivation_10Other;
    }

    public Boolean getSfiLogoUseMotivation_11Other() {
        return sfiLogoUseMotivation_11Other;
    }

    public void setSfiLogoUseMotivation_11Other(Boolean sfiLogoUseMotivation_11Other) {
        this.sfiLogoUseMotivation_11Other = sfiLogoUseMotivation_11Other;
    }

    public Boolean getSfiLogoUseMotivation_12Other() {
        return sfiLogoUseMotivation_12Other;
    }

    public void setSfiLogoUseMotivation_12Other(Boolean sfiLogoUseMotivation_12Other) {
        this.sfiLogoUseMotivation_12Other = sfiLogoUseMotivation_12Other;
    }

    public Boolean getSfiLogoUseMotivation_13Other() {
        return sfiLogoUseMotivation_13Other;
    }

    public void setSfiLogoUseMotivation_13Other(Boolean sfiLogoUseMotivation_13Other) {
        this.sfiLogoUseMotivation_13Other = sfiLogoUseMotivation_13Other;
    }

    public String getSfiLogoUseMotivation_1Describe() {
        return sfiLogoUseMotivation_1Describe;
    }

    public void setSfiLogoUseMotivation_1Describe(String sfiLogoUseMotivation_1Describe) {
        this.sfiLogoUseMotivation_1Describe = sfiLogoUseMotivation_1Describe;
    }

    public String getSfiLogoUseMotivation_2Describe() {
        return sfiLogoUseMotivation_2Describe;
    }

    public void setSfiLogoUseMotivation_2Describe(String sfiLogoUseMotivation_2Describe) {
        this.sfiLogoUseMotivation_2Describe = sfiLogoUseMotivation_2Describe;
    }

    public String getSfiLogoUseMotivation_3Describe() {
        return sfiLogoUseMotivation_3Describe;
    }

    public void setSfiLogoUseMotivation_3Describe(String sfiLogoUseMotivation_3Describe) {
        this.sfiLogoUseMotivation_3Describe = sfiLogoUseMotivation_3Describe;
    }

    public String getSfiLogoUseMotivation_4Describe() {
        return sfiLogoUseMotivation_4Describe;
    }

    public void setSfiLogoUseMotivation_4Describe(String sfiLogoUseMotivation_4Describe) {
        this.sfiLogoUseMotivation_4Describe = sfiLogoUseMotivation_4Describe;
    }

    public String getSfiLogoUseMotivation_5Describe() {
        return sfiLogoUseMotivation_5Describe;
    }

    public void setSfiLogoUseMotivation_5Describe(String sfiLogoUseMotivation_5Describe) {
        this.sfiLogoUseMotivation_5Describe = sfiLogoUseMotivation_5Describe;
    }

    public String getSfiLogoUseMotivation_6Describe() {
        return sfiLogoUseMotivation_6Describe;
    }

    public void setSfiLogoUseMotivation_6Describe(String sfiLogoUseMotivation_6Describe) {
        this.sfiLogoUseMotivation_6Describe = sfiLogoUseMotivation_6Describe;
    }

    public String getSfiLogoUseMotivation_7Describe() {
        return sfiLogoUseMotivation_7Describe;
    }

    public void setSfiLogoUseMotivation_7Describe(String sfiLogoUseMotivation_7Describe) {
        this.sfiLogoUseMotivation_7Describe = sfiLogoUseMotivation_7Describe;
    }

    public String getSfiLogoUseMotivation_8Describe() {
        return sfiLogoUseMotivation_8Describe;
    }

    public void setSfiLogoUseMotivation_8Describe(String sfiLogoUseMotivation_8Describe) {
        this.sfiLogoUseMotivation_8Describe = sfiLogoUseMotivation_8Describe;
    }

    public String getSfiLogoUseMotivation_9Describe() {
        return sfiLogoUseMotivation_9Describe;
    }

    public void setSfiLogoUseMotivation_9Describe(String sfiLogoUseMotivation_9Describe) {
        this.sfiLogoUseMotivation_9Describe = sfiLogoUseMotivation_9Describe;
    }

    public String getSfiLogoUseMotivation_10Describe() {
        return sfiLogoUseMotivation_10Describe;
    }

    public void setSfiLogoUseMotivation_10Describe(String sfiLogoUseMotivation_10Describe) {
        this.sfiLogoUseMotivation_10Describe = sfiLogoUseMotivation_10Describe;
    }

    public String getSfiLogoUseMotivation_11Describe() {
        return sfiLogoUseMotivation_11Describe;
    }

    public void setSfiLogoUseMotivation_11Describe(String sfiLogoUseMotivation_11Describe) {
        this.sfiLogoUseMotivation_11Describe = sfiLogoUseMotivation_11Describe;
    }

    public String getSfiLogoUseMotivation_12Describe() {
        return sfiLogoUseMotivation_12Describe;
    }

    public void setSfiLogoUseMotivation_12Describe(String sfiLogoUseMotivation_12Describe) {
        this.sfiLogoUseMotivation_12Describe = sfiLogoUseMotivation_12Describe;
    }

    public String getSfiLogoUseMotivation_13Describe() {
        return sfiLogoUseMotivation_13Describe;
    }

    public void setSfiLogoUseMotivation_13Describe(String sfiLogoUseMotivation_13Describe) {
        this.sfiLogoUseMotivation_13Describe = sfiLogoUseMotivation_13Describe;
    }

    public String getFscChainCustody1OtherDescribe() {
        return fscChainCustody1OtherDescribe;
    }

    public void setFscChainCustody1OtherDescribe(String fscChainCustody1OtherDescribe) {
        this.fscChainCustody1OtherDescribe = fscChainCustody1OtherDescribe;
    }

    public String getFscChainCustody2OtherDescribe() {
        return fscChainCustody2OtherDescribe;
    }

    public void setFscChainCustody2OtherDescribe(String fscChainCustody2OtherDescribe) {
        this.fscChainCustody2OtherDescribe = fscChainCustody2OtherDescribe;
    }

    public String getFscChainCustody3OtherDescribe() {
        return fscChainCustody3OtherDescribe;
    }

    public void setFscChainCustody3OtherDescribe(String fscChainCustody3OtherDescribe) {
        this.fscChainCustody3OtherDescribe = fscChainCustody3OtherDescribe;
    }

    public String getFscChainCustody4OtherDescribe() {
        return fscChainCustody4OtherDescribe;
    }

    public void setFscChainCustody4OtherDescribe(String fscChainCustody4OtherDescribe) {
        this.fscChainCustody4OtherDescribe = fscChainCustody4OtherDescribe;
    }

    public String getFscChainCustody5OtherDescribe() {
        return fscChainCustody5OtherDescribe;
    }

    public void setFscChainCustody5OtherDescribe(String fscChainCustody5OtherDescribe) {
        this.fscChainCustody5OtherDescribe = fscChainCustody5OtherDescribe;
    }

    public String getFscChainCustody6OtherDescribe() {
        return fscChainCustody6OtherDescribe;
    }

    public void setFscChainCustody6OtherDescribe(String fscChainCustody6OtherDescribe) {
        this.fscChainCustody6OtherDescribe = fscChainCustody6OtherDescribe;
    }

    public String getFscChainCustody7OtherDescribe() {
        return fscChainCustody7OtherDescribe;
    }

    public void setFscChainCustody7OtherDescribe(String fscChainCustody7OtherDescribe) {
        this.fscChainCustody7OtherDescribe = fscChainCustody7OtherDescribe;
    }

    public String getFscChainCustody8OtherDescribe() {
        return fscChainCustody8OtherDescribe;
    }

    public void setFscChainCustody8OtherDescribe(String fscChainCustody8OtherDescribe) {
        this.fscChainCustody8OtherDescribe = fscChainCustody8OtherDescribe;
    }

    public String getFscChainCustody9OtherDescribe() {
        return fscChainCustody9OtherDescribe;
    }

    public void setFscChainCustody9OtherDescribe(String fscChainCustody9OtherDescribe) {
        this.fscChainCustody9OtherDescribe = fscChainCustody9OtherDescribe;
    }

    public String getFscChainCustody10OtherDescribe() {
        return fscChainCustody10OtherDescribe;
    }

    public void setFscChainCustody10OtherDescribe(String fscChainCustody10OtherDescribe) {
        this.fscChainCustody10OtherDescribe = fscChainCustody10OtherDescribe;
    }

    public String getFscChainCustody11OtherDescribe() {
        return fscChainCustody11OtherDescribe;
    }

    public void setFscChainCustody11OtherDescribe(String fscChainCustody11OtherDescribe) {
        this.fscChainCustody11OtherDescribe = fscChainCustody11OtherDescribe;
    }

    public String getFscChainCustody12OtherDescribe() {
        return fscChainCustody12OtherDescribe;
    }

    public void setFscChainCustody12OtherDescribe(String fscChainCustody12OtherDescribe) {
        this.fscChainCustody12OtherDescribe = fscChainCustody12OtherDescribe;
    }

    public String getFscChainCustody13OtherDescribe() {
        return fscChainCustody13OtherDescribe;
    }

    public void setFscChainCustody13OtherDescribe(String fscChainCustody13OtherDescribe) {
        this.fscChainCustody13OtherDescribe = fscChainCustody13OtherDescribe;
    }

    public String getWhyChoseSFI20OtherSpecify() {
        return whyChoseSFI20OtherSpecify;
    }

    public void setWhyChoseSFI20OtherSpecify(String whyChoseSFI20OtherSpecify) {
        this.whyChoseSFI20OtherSpecify = whyChoseSFI20OtherSpecify;
    }

    public Boolean getProductSegmentBioenergy() {
        return productSegmentBioenergy;
    }

    public void setProductSegmentBioenergy(Boolean productSegmentBioenergy) {
        this.productSegmentBioenergy = productSegmentBioenergy;
    }

    public Boolean getProductSegmentFurniture() {
        return productSegmentFurniture;
    }

    public void setProductSegmentFurniture(Boolean productSegmentFurniture) {
        this.productSegmentFurniture = productSegmentFurniture;
    }

    public Boolean getProductSegmentLand() {
        return productSegmentLand;
    }

    public void setProductSegmentLand(Boolean productSegmentLand) {
        this.productSegmentLand = productSegmentLand;
    }

    public Boolean getProductSegmentOther() {
        return productSegmentOther;
    }

    public void setProductSegmentOther(Boolean productSegmentOther) {
        this.productSegmentOther = productSegmentOther;
    }

    public Boolean getProductSegmentPackaging() {
        return productSegmentPackaging;
    }

    public void setProductSegmentPackaging(Boolean productSegmentPackaging) {
        this.productSegmentPackaging = productSegmentPackaging;
    }

    public Boolean getProductSegmentPaperBoard() {
        return productSegmentPaperBoard;
    }

    public void setProductSegmentPaperBoard(Boolean productSegmentPaperBoard) {
        this.productSegmentPaperBoard = productSegmentPaperBoard;
    }

    public Boolean getProductSegmentPaperMerchant() {
        return productSegmentPaperMerchant;
    }

    public void setProductSegmentPaperMerchant(Boolean productSegmentPaperMerchant) {
        this.productSegmentPaperMerchant = productSegmentPaperMerchant;
    }

    public Boolean getProductSegmentPrinter() {
        return productSegmentPrinter;
    }

    public void setProductSegmentPrinter(Boolean productSegmentPrinter) {
        this.productSegmentPrinter = productSegmentPrinter;
    }

    public Boolean getProductSegmentPrintingWritingPaper() {
        return productSegmentPrintingWritingPaper;
    }

    public void setProductSegmentPrintingWritingPaper(Boolean productSegmentPrintingWritingPaper) {
        this.productSegmentPrintingWritingPaper = productSegmentPrintingWritingPaper;
    }

    public Boolean getProductSegmentPulp() {
        return productSegmentPulp;
    }

    public void setProductSegmentPulp(Boolean productSegmentPulp) {
        this.productSegmentPulp = productSegmentPulp;
    }

    public Boolean getProductSegmentSolidWood() {
        return productSegmentSolidWood;
    }

    public void setProductSegmentSolidWood(Boolean productSegmentSolidWood) {
        this.productSegmentSolidWood = productSegmentSolidWood;
    }

    public Boolean getProductSegmentTowelTissue() {
        return productSegmentTowelTissue;
    }

    public void setProductSegmentTowelTissue(Boolean productSegmentTowelTissue) {
        this.productSegmentTowelTissue = productSegmentTowelTissue;
    }

    public Boolean getProductSegmentWoodMerchant() {
        return productSegmentWoodMerchant;
    }

    public void setProductSegmentWoodMerchant(Boolean productSegmentWoodMerchant) {
        this.productSegmentWoodMerchant = productSegmentWoodMerchant;
    }

    public Integer getFscChainCustody10() {
        return fscChainCustody10;
    }

    public void setFscChainCustody10(Integer fscChainCustody10) {
        this.fscChainCustody10 = fscChainCustody10;
    }

    public Integer getFscChainCustody11() {
        return fscChainCustody11;
    }

    public void setFscChainCustody11(Integer fscChainCustody11) {
        this.fscChainCustody11 = fscChainCustody11;
    }

    public Integer getFscChainCustody12() {
        return fscChainCustody12;
    }

    public void setFscChainCustody12(Integer fscChainCustody12) {
        this.fscChainCustody12 = fscChainCustody12;
    }

    public Integer getFscChainCustody13() {
        return fscChainCustody13;
    }

    public void setFscChainCustody13(Integer fscChainCustody13) {
        this.fscChainCustody13 = fscChainCustody13;
    }

    public Integer getFscChainCustody1() {
        return fscChainCustody1;
    }

    public void setFscChainCustody1(Integer fscChainCustody1) {
        this.fscChainCustody1 = fscChainCustody1;
    }

    public Integer getFscChainCustody2() {
        return fscChainCustody2;
    }

    public void setFscChainCustody2(Integer fscChainCustody2) {
        this.fscChainCustody2 = fscChainCustody2;
    }

    public Integer getFscChainCustody3() {
        return fscChainCustody3;
    }

    public void setFscChainCustody3(Integer fscChainCustody3) {
        this.fscChainCustody3 = fscChainCustody3;
    }

    public Integer getFscChainCustody4() {
        return fscChainCustody4;
    }

    public void setFscChainCustody4(Integer fscChainCustody4) {
        this.fscChainCustody4 = fscChainCustody4;
    }

    public Integer getFscChainCustody5() {
        return fscChainCustody5;
    }

    public void setFscChainCustody5(Integer fscChainCustody5) {
        this.fscChainCustody5 = fscChainCustody5;
    }

    public Integer getFscChainCustody6() {
        return fscChainCustody6;
    }

    public void setFscChainCustody6(Integer fscChainCustody6) {
        this.fscChainCustody6 = fscChainCustody6;
    }

    public Integer getFscChainCustody7() {
        return fscChainCustody7;
    }

    public void setFscChainCustody7(Integer fscChainCustody7) {
        this.fscChainCustody7 = fscChainCustody7;
    }

    public Integer getFscChainCustody8() {
        return fscChainCustody8;
    }

    public void setFscChainCustody8(Integer fscChainCustody8) {
        this.fscChainCustody8 = fscChainCustody8;
    }

    public Integer getFscChainCustody9() {
        return fscChainCustody9;
    }

    public void setFscChainCustody9(Integer fscChainCustody9) {
        this.fscChainCustody9 = fscChainCustody9;
    }

    public Integer getPefcChainCustody10() {
        return pefcChainCustody10;
    }

    public void setPefcChainCustody10(Integer pefcChainCustody10) {
        this.pefcChainCustody10 = pefcChainCustody10;
    }

    public Integer getPefcChainCustody11() {
        return pefcChainCustody11;
    }

    public void setPefcChainCustody11(Integer pefcChainCustody11) {
        this.pefcChainCustody11 = pefcChainCustody11;
    }

    public Integer getPefcChainCustody12() {
        return pefcChainCustody12;
    }

    public void setPefcChainCustody12(Integer pefcChainCustody12) {
        this.pefcChainCustody12 = pefcChainCustody12;
    }

    public Integer getPefcChainCustody13() {
        return pefcChainCustody13;
    }

    public void setPefcChainCustody13(Integer pefcChainCustody13) {
        this.pefcChainCustody13 = pefcChainCustody13;
    }

    public Integer getPefcChainCustody1() {
        return pefcChainCustody1;
    }

    public void setPefcChainCustody1(Integer pefcChainCustody1) {
        this.pefcChainCustody1 = pefcChainCustody1;
    }

    public Integer getPefcChainCustody2() {
        return pefcChainCustody2;
    }

    public void setPefcChainCustody2(Integer pefcChainCustody2) {
        this.pefcChainCustody2 = pefcChainCustody2;
    }

    public Integer getPefcChainCustody3() {
        return pefcChainCustody3;
    }

    public void setPefcChainCustody3(Integer pefcChainCustody3) {
        this.pefcChainCustody3 = pefcChainCustody3;
    }

    public Integer getPefcChainCustody4() {
        return pefcChainCustody4;
    }

    public void setPefcChainCustody4(Integer pefcChainCustody4) {
        this.pefcChainCustody4 = pefcChainCustody4;
    }

    public Integer getPefcChainCustody5() {
        return pefcChainCustody5;
    }

    public void setPefcChainCustody5(Integer pefcChainCustody5) {
        this.pefcChainCustody5 = pefcChainCustody5;
    }

    public Integer getPefcChainCustody6() {
        return pefcChainCustody6;
    }

    public void setPefcChainCustody6(Integer pefcChainCustody6) {
        this.pefcChainCustody6 = pefcChainCustody6;
    }

    public Integer getPefcChainCustody7() {
        return pefcChainCustody7;
    }

    public void setPefcChainCustody7(Integer pefcChainCustody7) {
        this.pefcChainCustody7 = pefcChainCustody7;
    }

    public Integer getPefcChainCustody8() {
        return pefcChainCustody8;
    }

    public void setPefcChainCustody8(Integer pefcChainCustody8) {
        this.pefcChainCustody8 = pefcChainCustody8;
    }

    public Integer getPefcChainCustody9() {
        return pefcChainCustody9;
    }

    public void setPefcChainCustody9(Integer pefcChainCustody9) {
        this.pefcChainCustody9 = pefcChainCustody9;
    }

    public Integer getPercCerfiedOther10() {
        return percCerfiedOther10;
    }

    public void setPercCerfiedOther10(Integer percCerfiedOther10) {
        this.percCerfiedOther10 = percCerfiedOther10;
    }

    public Integer getPercCerfiedOther11() {
        return percCerfiedOther11;
    }

    public void setPercCerfiedOther11(Integer percCerfiedOther11) {
        this.percCerfiedOther11 = percCerfiedOther11;
    }

    public Integer getPercCerfiedOther12() {
        return percCerfiedOther12;
    }

    public void setPercCerfiedOther12(Integer percCerfiedOther12) {
        this.percCerfiedOther12 = percCerfiedOther12;
    }

    public Integer getPercCerfiedOther13() {
        return percCerfiedOther13;
    }

    public void setPercCerfiedOther13(Integer percCerfiedOther13) {
        this.percCerfiedOther13 = percCerfiedOther13;
    }

    public Integer getPercCerfiedOther1() {
        return percCerfiedOther1;
    }

    public void setPercCerfiedOther1(Integer percCerfiedOther1) {
        this.percCerfiedOther1 = percCerfiedOther1;
    }

    public Integer getPercCerfiedOther2() {
        return percCerfiedOther2;
    }

    public void setPercCerfiedOther2(Integer percCerfiedOther2) {
        this.percCerfiedOther2 = percCerfiedOther2;
    }

    public Integer getPercCerfiedOther3() {
        return percCerfiedOther3;
    }

    public void setPercCerfiedOther3(Integer percCerfiedOther3) {
        this.percCerfiedOther3 = percCerfiedOther3;
    }

    public Integer getPercCerfiedOther4() {
        return percCerfiedOther4;
    }

    public void setPercCerfiedOther4(Integer percCerfiedOther4) {
        this.percCerfiedOther4 = percCerfiedOther4;
    }

    public Integer getPercCerfiedOther5() {
        return percCerfiedOther5;
    }

    public void setPercCerfiedOther5(Integer percCerfiedOther5) {
        this.percCerfiedOther5 = percCerfiedOther5;
    }

    public Integer getPercCerfiedOther6() {
        return percCerfiedOther6;
    }

    public void setPercCerfiedOther6(Integer percCerfiedOther6) {
        this.percCerfiedOther6 = percCerfiedOther6;
    }

    public Integer getPercCerfiedOther7() {
        return percCerfiedOther7;
    }

    public void setPercCerfiedOther7(Integer percCerfiedOther7) {
        this.percCerfiedOther7 = percCerfiedOther7;
    }

    public Integer getPercCerfiedOther8() {
        return percCerfiedOther8;
    }

    public void setPercCerfiedOther8(Integer percCerfiedOther8) {
        this.percCerfiedOther8 = percCerfiedOther8;
    }

    public Integer getPercCerfiedOther9() {
        return percCerfiedOther9;
    }

    public void setPercCerfiedOther9(Integer percCerfiedOther9) {
        this.percCerfiedOther9 = percCerfiedOther9;
    }

    public Integer getSfiCertifiedSourcing10() {
        return sfiCertifiedSourcing10;
    }

    public void setSfiCertifiedSourcing10(Integer sfiCertifiedSourcing10) {
        this.sfiCertifiedSourcing10 = sfiCertifiedSourcing10;
    }

    public Integer getSfiCertifiedSourcing11() {
        return sfiCertifiedSourcing11;
    }

    public void setSfiCertifiedSourcing11(Integer sfiCertifiedSourcing11) {
        this.sfiCertifiedSourcing11 = sfiCertifiedSourcing11;
    }

    public Integer getSfiCertifiedSourcing12() {
        return sfiCertifiedSourcing12;
    }

    public void setSfiCertifiedSourcing12(Integer sfiCertifiedSourcing12) {
        this.sfiCertifiedSourcing12 = sfiCertifiedSourcing12;
    }

    public Integer getSfiCertifiedSourcing13() {
        return sfiCertifiedSourcing13;
    }

    public void setSfiCertifiedSourcing13(Integer sfiCertifiedSourcing13) {
        this.sfiCertifiedSourcing13 = sfiCertifiedSourcing13;
    }

    public Integer getSfiCertifiedSourcing1() {
        return sfiCertifiedSourcing1;
    }

    public void setSfiCertifiedSourcing1(Integer sfiCertifiedSourcing1) {
        this.sfiCertifiedSourcing1 = sfiCertifiedSourcing1;
    }

    public Integer getSfiCertifiedSourcing2() {
        return sfiCertifiedSourcing2;
    }

    public void setSfiCertifiedSourcing2(Integer sfiCertifiedSourcing2) {
        this.sfiCertifiedSourcing2 = sfiCertifiedSourcing2;
    }

    public Integer getSfiCertifiedSourcing3() {
        return sfiCertifiedSourcing3;
    }

    public void setSfiCertifiedSourcing3(Integer sfiCertifiedSourcing3) {
        this.sfiCertifiedSourcing3 = sfiCertifiedSourcing3;
    }

    public Integer getSfiCertifiedSourcing4() {
        return sfiCertifiedSourcing4;
    }

    public void setSfiCertifiedSourcing4(Integer sfiCertifiedSourcing4) {
        this.sfiCertifiedSourcing4 = sfiCertifiedSourcing4;
    }

    public Integer getSfiCertifiedSourcing5() {
        return sfiCertifiedSourcing5;
    }

    public void setSfiCertifiedSourcing5(Integer sfiCertifiedSourcing5) {
        this.sfiCertifiedSourcing5 = sfiCertifiedSourcing5;
    }

    public Integer getSfiCertifiedSourcing6() {
        return sfiCertifiedSourcing6;
    }

    public void setSfiCertifiedSourcing6(Integer sfiCertifiedSourcing6) {
        this.sfiCertifiedSourcing6 = sfiCertifiedSourcing6;
    }

    public Integer getSfiCertifiedSourcing7() {
        return sfiCertifiedSourcing7;
    }

    public void setSfiCertifiedSourcing7(Integer sfiCertifiedSourcing7) {
        this.sfiCertifiedSourcing7 = sfiCertifiedSourcing7;
    }

    public Integer getSfiCertifiedSourcing8() {
        return sfiCertifiedSourcing8;
    }

    public void setSfiCertifiedSourcing8(Integer sfiCertifiedSourcing8) {
        this.sfiCertifiedSourcing8 = sfiCertifiedSourcing8;
    }

    public Integer getSfiCertifiedSourcing9() {
        return sfiCertifiedSourcing9;
    }

    public void setSfiCertifiedSourcing9(Integer sfiCertifiedSourcing9) {
        this.sfiCertifiedSourcing9 = sfiCertifiedSourcing9;
    }

    public Integer getSfiChainCustody10() {
        return sfiChainCustody10;
    }

    public void setSfiChainCustody10(Integer sfiChainCustody10) {
        this.sfiChainCustody10 = sfiChainCustody10;
    }

    public Integer getSfiChainCustody11() {
        return sfiChainCustody11;
    }

    public void setSfiChainCustody11(Integer sfiChainCustody11) {
        this.sfiChainCustody11 = sfiChainCustody11;
    }

    public Integer getSfiChainCustody12() {
        return sfiChainCustody12;
    }

    public void setSfiChainCustody12(Integer sfiChainCustody12) {
        this.sfiChainCustody12 = sfiChainCustody12;
    }

    public Integer getSfiChainCustody13() {
        return sfiChainCustody13;
    }

    public void setSfiChainCustody13(Integer sfiChainCustody13) {
        this.sfiChainCustody13 = sfiChainCustody13;
    }

    public Integer getSfiChainCustody1() {
        return sfiChainCustody1;
    }

    public void setSfiChainCustody1(Integer sfiChainCustody1) {
        this.sfiChainCustody1 = sfiChainCustody1;
    }

    public Integer getSfiChainCustody2() {
        return sfiChainCustody2;
    }

    public void setSfiChainCustody2(Integer sfiChainCustody2) {
        this.sfiChainCustody2 = sfiChainCustody2;
    }

    public Integer getSfiChainCustody3() {
        return sfiChainCustody3;
    }

    public void setSfiChainCustody3(Integer sfiChainCustody3) {
        this.sfiChainCustody3 = sfiChainCustody3;
    }

    public Integer getSfiChainCustody4() {
        return sfiChainCustody4;
    }

    public void setSfiChainCustody4(Integer sfiChainCustody4) {
        this.sfiChainCustody4 = sfiChainCustody4;
    }

    public Integer getSfiChainCustody5() {
        return sfiChainCustody5;
    }

    public void setSfiChainCustody5(Integer sfiChainCustody5) {
        this.sfiChainCustody5 = sfiChainCustody5;
    }

    public Integer getSfiChainCustody6() {
        return sfiChainCustody6;
    }

    public void setSfiChainCustody6(Integer sfiChainCustody6) {
        this.sfiChainCustody6 = sfiChainCustody6;
    }

    public Integer getSfiChainCustody7() {
        return sfiChainCustody7;
    }

    public void setSfiChainCustody7(Integer sfiChainCustody7) {
        this.sfiChainCustody7 = sfiChainCustody7;
    }

    public Integer getSfiChainCustody8() {
        return sfiChainCustody8;
    }

    public void setSfiChainCustody8(Integer sfiChainCustody8) {
        this.sfiChainCustody8 = sfiChainCustody8;
    }

    public Integer getSfiChainCustody9() {
        return sfiChainCustody9;
    }

    public void setSfiChainCustody9(Integer sfiChainCustody9) {
        this.sfiChainCustody9 = sfiChainCustody9;
    }

    public Integer getFSCLandCertification() {
        return FSCLandCertification;
    }

    public void setFSCLandCertification(Integer FSCLandCertification) {
        this.FSCLandCertification = FSCLandCertification;
    }

    public Integer getChainOfCustody_FSCCertification() {
        return ChainOfCustody_FSCCertification;
    }

    public void setChainOfCustody_FSCCertification(Integer chainOfCustody_FSCCertification) {
        ChainOfCustody_FSCCertification = chainOfCustody_FSCCertification;
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainPEFC_Country_4() {
        return sfiLabelProductGroupContainPEFC_Country_4;
    }

    public void setSfiLabelProductGroupContainPEFC_Country_4(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_4) {
        addAll(this.sfiLabelProductGroupContainPEFC_Country_4, sfiLabelProductGroupContainPEFC_Country_4);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainPEFC_Country_5() {
        return sfiLabelProductGroupContainPEFC_Country_5;
    }

    public void setSfiLabelProductGroupContainPEFC_Country_5(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_5) {
        addAll(this.sfiLabelProductGroupContainPEFC_Country_5, sfiLabelProductGroupContainPEFC_Country_5);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainPEFC_Country_6() {
        return sfiLabelProductGroupContainPEFC_Country_6;
    }

    public void setSfiLabelProductGroupContainPEFC_Country_6(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_6) {
        addAll(this.sfiLabelProductGroupContainPEFC_Country_6, sfiLabelProductGroupContainPEFC_Country_6);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainPEFC_Country_7() {
        return sfiLabelProductGroupContainPEFC_Country_7;
    }

    public void setSfiLabelProductGroupContainPEFC_Country_7(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_7) {
        addAll(this.sfiLabelProductGroupContainPEFC_Country_7, sfiLabelProductGroupContainPEFC_Country_7);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainPEFC_Country_8() {
        return sfiLabelProductGroupContainPEFC_Country_8;
    }

    public void setSfiLabelProductGroupContainPEFC_Country_8(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_8) {
        addAll(this.sfiLabelProductGroupContainPEFC_Country_8, sfiLabelProductGroupContainPEFC_Country_8);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainPEFC_Country_9() {
        return sfiLabelProductGroupContainPEFC_Country_9;
    }

    public void setSfiLabelProductGroupContainPEFC_Country_9(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_9) {
        addAll(this.sfiLabelProductGroupContainPEFC_Country_9, sfiLabelProductGroupContainPEFC_Country_9);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductSellCountry_1() {
        return sfiLabelProductSellCountry_1;
    }

    public void setSfiLabelProductSellCountry_1(Set<SfiPpFormAllCountry> sfiLabelProductSellCountry_1) {
        addAll(this.sfiLabelProductSellCountry_1, sfiLabelProductSellCountry_1);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductSellCountry_10() {
        return sfiLabelProductSellCountry_10;
    }

    public void setSfiLabelProductSellCountry_10(Set<SfiPpFormAllCountry> sfiLabelProductSellCountry_10) {
        addAll(this.sfiLabelProductSellCountry_10, sfiLabelProductSellCountry_10);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductSellCountry_11() {
        return sfiLabelProductSellCountry_11;
    }

    public void setSfiLabelProductSellCountry_11(Set<SfiPpFormAllCountry> sfiLabelProductSellCountry_11) {
        addAll(this.sfiLabelProductSellCountry_11, sfiLabelProductSellCountry_11);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductSellCountry_12() {
        return sfiLabelProductSellCountry_12;
    }

    public void setSfiLabelProductSellCountry_12(Set<SfiPpFormAllCountry> sfiLabelProductSellCountry_12) {
        addAll(this.sfiLabelProductSellCountry_12, sfiLabelProductSellCountry_12);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductSellCountry_13() {
        return sfiLabelProductSellCountry_13;
    }

    public void setSfiLabelProductSellCountry_13(Set<SfiPpFormAllCountry> sfiLabelProductSellCountry_13) {
        addAll(this.sfiLabelProductSellCountry_13, sfiLabelProductSellCountry_13);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductSellCountry_2() {
        return sfiLabelProductSellCountry_2;
    }

    public void setSfiLabelProductSellCountry_2(Set<SfiPpFormAllCountry> sfiLabelProductSellCountry_2) {
        addAll(this.sfiLabelProductSellCountry_2, sfiLabelProductSellCountry_2);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductSellCountry_3() {
        return sfiLabelProductSellCountry_3;
    }

    public void setSfiLabelProductSellCountry_3(Set<SfiPpFormAllCountry> sfiLabelProductSellCountry_3) {
        addAll(this.sfiLabelProductSellCountry_3, sfiLabelProductSellCountry_3);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductSellCountry_4() {
        return sfiLabelProductSellCountry_4;
    }

    public void setSfiLabelProductSellCountry_4(Set<SfiPpFormAllCountry> sfiLabelProductSellCountry_4) {
        addAll(this.sfiLabelProductSellCountry_4, sfiLabelProductSellCountry_4);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductSellCountry_5() {
        return sfiLabelProductSellCountry_5;
    }

    public void setSfiLabelProductSellCountry_5(Set<SfiPpFormAllCountry> sfiLabelProductSellCountry_5) {
        addAll(this.sfiLabelProductSellCountry_5, sfiLabelProductSellCountry_5);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductSellCountry_6() {
        return sfiLabelProductSellCountry_6;
    }

    public void setSfiLabelProductSellCountry_6(Set<SfiPpFormAllCountry> sfiLabelProductSellCountry_6) {
        addAll(this.sfiLabelProductSellCountry_6, sfiLabelProductSellCountry_6);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductSellCountry_7() {
        return sfiLabelProductSellCountry_7;
    }

    public void setSfiLabelProductSellCountry_7(Set<SfiPpFormAllCountry> sfiLabelProductSellCountry_7) {
        addAll(this.sfiLabelProductSellCountry_7, sfiLabelProductSellCountry_7);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductSellCountry_8() {
        return sfiLabelProductSellCountry_8;
    }

    public void setSfiLabelProductSellCountry_8(Set<SfiPpFormAllCountry> sfiLabelProductSellCountry_8) {
        addAll(this.sfiLabelProductSellCountry_8, sfiLabelProductSellCountry_8);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductSellCountry_9() {
        return sfiLabelProductSellCountry_9;
    }

    public void setSfiLabelProductSellCountry_9(Set<SfiPpFormAllCountry> sfiLabelProductSellCountry_9) {
        addAll(this.sfiLabelProductSellCountry_9, sfiLabelProductSellCountry_9);
    }

    public Set<OrgContact> getOrgContacts() {
        return orgContacts;
    }

    public void setOrgContacts(Set<OrgContact> orgContacts) {
        addAll(this.orgContacts, orgContacts);
    }

    public Set<PrimaryProducer> getPrimaryProducers() {
        return primaryProducers;
    }

    public void setPrimaryProducers(Set<PrimaryProducer> primaryProducers) {
        addAll(this.primaryProducers, primaryProducers);
    }

    public Set<String> getAlsoFSCLabel_10() {
        return alsoFSCLabel_10;
    }

    public void setAlsoFSCLabel_10(Set<String> alsoFSCLabel_10) {
        addAll(this.alsoFSCLabel_10, alsoFSCLabel_10);
    }

    public Set<String> getAlsoFSCLabel_11() {
        return alsoFSCLabel_11;
    }

    public void setAlsoFSCLabel_11(Set<String> alsoFSCLabel_11) {
        addAll(this.alsoFSCLabel_11, alsoFSCLabel_11);
    }

    public Set<String> getAlsoFSCLabel_12() {
        return alsoFSCLabel_12;
    }

    public void setAlsoFSCLabel_12(Set<String> alsoFSCLabel_12) {
        addAll(this.alsoFSCLabel_12, alsoFSCLabel_12);
    }

    public Set<String> getAlsoFSCLabel_13() {
        return alsoFSCLabel_13;
    }

    public void setAlsoFSCLabel_13(Set<String> alsoFSCLabel_13) {
        addAll(this.alsoFSCLabel_13, alsoFSCLabel_13);
    }

    public Set<String> getAlsoFSCLabel_1() {
        return alsoFSCLabel_1;
    }

    public void setAlsoFSCLabel_1(Set<String> alsoFSCLabel_1) {
        addAll(this.alsoFSCLabel_1, alsoFSCLabel_1);
    }

    public Set<String> getAlsoFSCLabel_2() {
        return alsoFSCLabel_2;
    }

    public void setAlsoFSCLabel_2(Set<String> alsoFSCLabel_2) {
        addAll(this.alsoFSCLabel_2, alsoFSCLabel_2);
    }

    public Set<String> getAlsoFSCLabel_3() {
        return alsoFSCLabel_3;
    }

    public void setAlsoFSCLabel_3(Set<String> alsoFSCLabel_3) {
        addAll(this.alsoFSCLabel_3, alsoFSCLabel_3);
    }

    public Set<String> getAlsoFSCLabel_4() {
        return alsoFSCLabel_4;
    }

    public void setAlsoFSCLabel_4(Set<String> alsoFSCLabel_4) {
        addAll(this.alsoFSCLabel_4, alsoFSCLabel_4);
    }

    public Set<String> getAlsoFSCLabel_5() {
        return alsoFSCLabel_5;
    }

    public void setAlsoFSCLabel_5(Set<String> alsoFSCLabel_5) {
        addAll(this.alsoFSCLabel_5, alsoFSCLabel_5);
    }

    public Set<String> getAlsoFSCLabel_6() {
        return alsoFSCLabel_6;
    }

    public void setAlsoFSCLabel_6(Set<String> alsoFSCLabel_6) {
        addAll(this.alsoFSCLabel_6, alsoFSCLabel_6);
    }

    public Set<String> getAlsoFSCLabel_7() {
        return alsoFSCLabel_7;
    }

    public void setAlsoFSCLabel_7(Set<String> alsoFSCLabel_7) {
        addAll(this.alsoFSCLabel_7, alsoFSCLabel_7);
    }

    public Set<String> getAlsoFSCLabel_8() {
        return alsoFSCLabel_8;
    }

    public void setAlsoFSCLabel_8(Set<String> alsoFSCLabel_8) {
        addAll(this.alsoFSCLabel_8, alsoFSCLabel_8);
    }

    public Set<String> getAlsoFSCLabel_9() {
        return alsoFSCLabel_9;
    }

    public void setAlsoFSCLabel_9(Set<String> alsoFSCLabel_9) {
        addAll(this.alsoFSCLabel_9, alsoFSCLabel_9);
    }

    public Set<String> getSfiLabelProductGroupContain_10() {
        return sfiLabelProductGroupContain_10;
    }

    public void setSfiLabelProductGroupContain_10(Set<String> sfiLabelProductGroupContain_10) {
        addAll(this.sfiLabelProductGroupContain_10, sfiLabelProductGroupContain_10);
    }

    public Set<String> getSfiLabelProductGroupContain_11() {
        return sfiLabelProductGroupContain_11;
    }

    public void setSfiLabelProductGroupContain_11(Set<String> sfiLabelProductGroupContain_11) {
        addAll(this.sfiLabelProductGroupContain_11, sfiLabelProductGroupContain_11);
    }

    public Set<String> getSfiLabelProductGroupContain_12() {
        return sfiLabelProductGroupContain_12;
    }

    public void setSfiLabelProductGroupContain_12(Set<String> sfiLabelProductGroupContain_12) {
        addAll(this.sfiLabelProductGroupContain_12, sfiLabelProductGroupContain_12);
    }

    public Set<String> getSfiLabelProductGroupContain_13() {
        return sfiLabelProductGroupContain_13;
    }

    public void setSfiLabelProductGroupContain_13(Set<String> sfiLabelProductGroupContain_13) {
        addAll(this.sfiLabelProductGroupContain_13, sfiLabelProductGroupContain_13);
    }

    public Set<String> getSfiLabelProductGroupContain_1() {
        return sfiLabelProductGroupContain_1;
    }

    public void setSfiLabelProductGroupContain_1(Set<String> sfiLabelProductGroupContain_1) {
        addAll(this.sfiLabelProductGroupContain_1, sfiLabelProductGroupContain_1);
    }

    public Set<String> getSfiLabelProductGroupContain_2() {
        return sfiLabelProductGroupContain_2;
    }

    public void setSfiLabelProductGroupContain_2(Set<String> sfiLabelProductGroupContain_2) {
        addAll(this.sfiLabelProductGroupContain_2, sfiLabelProductGroupContain_2);
    }

    public Set<String> getSfiLabelProductGroupContain_3() {
        return sfiLabelProductGroupContain_3;
    }

    public void setSfiLabelProductGroupContain_3(Set<String> sfiLabelProductGroupContain_3) {
        addAll(this.sfiLabelProductGroupContain_3, sfiLabelProductGroupContain_3);
    }

    public Set<String> getSfiLabelProductGroupContain_4() {
        return sfiLabelProductGroupContain_4;
    }

    public void setSfiLabelProductGroupContain_4(Set<String> sfiLabelProductGroupContain_4) {
        addAll(this.sfiLabelProductGroupContain_4, sfiLabelProductGroupContain_4);
    }

    public Set<String> getSfiLabelProductGroupContain_5() {
        return sfiLabelProductGroupContain_5;
    }

    public void setSfiLabelProductGroupContain_5(Set<String> sfiLabelProductGroupContain_5) {
        addAll(this.sfiLabelProductGroupContain_5, sfiLabelProductGroupContain_5);
    }

    public Set<String> getSfiLabelProductGroupContain_6() {
        return sfiLabelProductGroupContain_6;
    }

    public void setSfiLabelProductGroupContain_6(Set<String> sfiLabelProductGroupContain_6) {
        addAll(this.sfiLabelProductGroupContain_6, sfiLabelProductGroupContain_6);
    }

    public Set<String> getSfiLabelProductGroupContain_7() {
        return sfiLabelProductGroupContain_7;
    }

    public void setSfiLabelProductGroupContain_7(Set<String> sfiLabelProductGroupContain_7) {
        addAll(this.sfiLabelProductGroupContain_7, sfiLabelProductGroupContain_7);
    }

    public Set<String> getSfiLabelProductGroupContain_8() {
        return sfiLabelProductGroupContain_8;
    }

    public void setSfiLabelProductGroupContain_8(Set<String> sfiLabelProductGroupContain_8) {
        addAll(this.sfiLabelProductGroupContain_8, sfiLabelProductGroupContain_8);
    }

    public Set<String> getSfiLabelProductGroupContain_9() {
        return sfiLabelProductGroupContain_9;
    }

    public void setSfiLabelProductGroupContain_9(Set<String> sfiLabelProductGroupContain_9) {
        addAll(this.sfiLabelProductGroupContain_9, sfiLabelProductGroupContain_9);
    }

    public Set<String> getSfiLabelProductSell_10() {
        return sfiLabelProductSell_10;
    }

    public void setSfiLabelProductSell_10(Set<String> sfiLabelProductSell_10) {
        addAll(this.sfiLabelProductSell_10, sfiLabelProductSell_10);
    }

    public Set<String> getSfiLabelProductSell_11() {
        return sfiLabelProductSell_11;
    }

    public void setSfiLabelProductSell_11(Set<String> sfiLabelProductSell_11) {
        addAll(this.sfiLabelProductSell_11, sfiLabelProductSell_11);
    }

    public Set<String> getSfiLabelProductSell_12() {
        return sfiLabelProductSell_12;
    }

    public void setSfiLabelProductSell_12(Set<String> sfiLabelProductSell_12) {
        addAll(this.sfiLabelProductSell_12, sfiLabelProductSell_12);
    }

    public Set<String> getSfiLabelProductSell_13() {
        return sfiLabelProductSell_13;
    }

    public void setSfiLabelProductSell_13(Set<String> sfiLabelProductSell_13) {
        addAll(this.sfiLabelProductSell_13, sfiLabelProductSell_13);
    }

    public Set<String> getSfiLabelProductSell_1() {
        return sfiLabelProductSell_1;
    }

    public void setSfiLabelProductSell_1(Set<String> sfiLabelProductSell_1) {
        addAll(this.sfiLabelProductSell_1, sfiLabelProductSell_1);
    }

    public Set<String> getSfiLabelProductSell_2() {
        return sfiLabelProductSell_2;
    }

    public void setSfiLabelProductSell_2(Set<String> sfiLabelProductSell_2) {
        addAll(this.sfiLabelProductSell_2, sfiLabelProductSell_2);
    }

    public Set<String> getSfiLabelProductSell_3() {
        return sfiLabelProductSell_3;
    }

    public void setSfiLabelProductSell_3(Set<String> sfiLabelProductSell_3) {
        addAll(this.sfiLabelProductSell_3, sfiLabelProductSell_3);
    }

    public Set<String> getSfiLabelProductSell_4() {
        return sfiLabelProductSell_4;
    }

    public void setSfiLabelProductSell_4(Set<String> sfiLabelProductSell_4) {
        addAll(this.sfiLabelProductSell_4, sfiLabelProductSell_4);
    }

    public Set<String> getSfiLabelProductSell_5() {
        return sfiLabelProductSell_5;
    }

    public void setSfiLabelProductSell_5(Set<String> sfiLabelProductSell_5) {
        addAll(this.sfiLabelProductSell_5, sfiLabelProductSell_5);
    }

    public Set<String> getSfiLabelProductSell_6() {
        return sfiLabelProductSell_6;
    }

    public void setSfiLabelProductSell_6(Set<String> sfiLabelProductSell_6) {
        addAll(this.sfiLabelProductSell_6, sfiLabelProductSell_6);
    }

    public Set<String> getSfiLabelProductSell_7() {
        return sfiLabelProductSell_7;
    }

    public void setSfiLabelProductSell_7(Set<String> sfiLabelProductSell_7) {
        addAll(this.sfiLabelProductSell_7, sfiLabelProductSell_7);
    }

    public Set<String> getSfiLabelProductSell_8() {
        return sfiLabelProductSell_8;
    }

    public void setSfiLabelProductSell_8(Set<String> sfiLabelProductSell_8) {
        addAll(this.sfiLabelProductSell_8, sfiLabelProductSell_8);
    }

    public Set<String> getSfiLabelProductSell_9() {
        return sfiLabelProductSell_9;
    }

    public void setSfiLabelProductSell_9(Set<String> sfiLabelProductSell_9) {
        addAll(this.sfiLabelProductSell_9, sfiLabelProductSell_9);
    }

    public String getDemandDeveloping_10() {
        return demandDeveloping_10;
    }

    public void setDemandDeveloping_10(String demandDeveloping_10) {
        this.demandDeveloping_10 = demandDeveloping_10;
    }

    public String getDemandDeveloping_11() {
        return demandDeveloping_11;
    }

    public void setDemandDeveloping_11(String demandDeveloping_11) {
        this.demandDeveloping_11 = demandDeveloping_11;
    }

    public String getDemandDeveloping_12() {
        return demandDeveloping_12;
    }

    public void setDemandDeveloping_12(String demandDeveloping_12) {
        this.demandDeveloping_12 = demandDeveloping_12;
    }

    public String getDemandDeveloping_13() {
        return demandDeveloping_13;
    }

    public void setDemandDeveloping_13(String demandDeveloping_13) {
        this.demandDeveloping_13 = demandDeveloping_13;
    }

    public String getDemandDeveloping_1() {
        return demandDeveloping_1;
    }

    public void setDemandDeveloping_1(String demandDeveloping_1) {
        this.demandDeveloping_1 = demandDeveloping_1;
    }

    public String getDemandDeveloping_2() {
        return demandDeveloping_2;
    }

    public void setDemandDeveloping_2(String demandDeveloping_2) {
        this.demandDeveloping_2 = demandDeveloping_2;
    }

    public String getDemandDeveloping_3() {
        return demandDeveloping_3;
    }

    public void setDemandDeveloping_3(String demandDeveloping_3) {
        this.demandDeveloping_3 = demandDeveloping_3;
    }

    public String getDemandDeveloping_4() {
        return demandDeveloping_4;
    }

    public void setDemandDeveloping_4(String demandDeveloping_4) {
        this.demandDeveloping_4 = demandDeveloping_4;
    }

    public String getDemandDeveloping_5() {
        return demandDeveloping_5;
    }

    public void setDemandDeveloping_5(String demandDeveloping_5) {
        this.demandDeveloping_5 = demandDeveloping_5;
    }

    public String getDemandDeveloping_6() {
        return demandDeveloping_6;
    }

    public void setDemandDeveloping_6(String demandDeveloping_6) {
        this.demandDeveloping_6 = demandDeveloping_6;
    }

    public String getDemandDeveloping_7() {
        return demandDeveloping_7;
    }

    public void setDemandDeveloping_7(String demandDeveloping_7) {
        this.demandDeveloping_7 = demandDeveloping_7;
    }

    public String getDemandDeveloping_8() {
        return demandDeveloping_8;
    }

    public void setDemandDeveloping_8(String demandDeveloping_8) {
        this.demandDeveloping_8 = demandDeveloping_8;
    }

    public String getDemandDeveloping_9() {
        return demandDeveloping_9;
    }

    public void setDemandDeveloping_9(String demandDeveloping_9) {
        this.demandDeveloping_9 = demandDeveloping_9;
    }

    public String getDemandSfiSourcing_10() {
        return demandSfiSourcing_10;
    }

    public void setDemandSfiSourcing_10(String demandSfiSourcing_10) {
        this.demandSfiSourcing_10 = demandSfiSourcing_10;
    }

    public String getDemandSfiSourcing_11() {
        return demandSfiSourcing_11;
    }

    public void setDemandSfiSourcing_11(String demandSfiSourcing_11) {
        this.demandSfiSourcing_11 = demandSfiSourcing_11;
    }

    public String getDemandSfiSourcing_12() {
        return demandSfiSourcing_12;
    }

    public void setDemandSfiSourcing_12(String demandSfiSourcing_12) {
        this.demandSfiSourcing_12 = demandSfiSourcing_12;
    }

    public String getDemandSfiSourcing_13() {
        return demandSfiSourcing_13;
    }

    public void setDemandSfiSourcing_13(String demandSfiSourcing_13) {
        this.demandSfiSourcing_13 = demandSfiSourcing_13;
    }

    public String getDemandSfiSourcing_1() {
        return demandSfiSourcing_1;
    }

    public void setDemandSfiSourcing_1(String demandSfiSourcing_1) {
        this.demandSfiSourcing_1 = demandSfiSourcing_1;
    }

    public String getDemandSfiSourcing_2() {
        return demandSfiSourcing_2;
    }

    public void setDemandSfiSourcing_2(String demandSfiSourcing_2) {
        this.demandSfiSourcing_2 = demandSfiSourcing_2;
    }

    public String getDemandSfiSourcing_3() {
        return demandSfiSourcing_3;
    }

    public void setDemandSfiSourcing_3(String demandSfiSourcing_3) {
        this.demandSfiSourcing_3 = demandSfiSourcing_3;
    }

    public String getDemandSfiSourcing_4() {
        return demandSfiSourcing_4;
    }

    public void setDemandSfiSourcing_4(String demandSfiSourcing_4) {
        this.demandSfiSourcing_4 = demandSfiSourcing_4;
    }

    public String getDemandSfiSourcing_5() {
        return demandSfiSourcing_5;
    }

    public void setDemandSfiSourcing_5(String demandSfiSourcing_5) {
        this.demandSfiSourcing_5 = demandSfiSourcing_5;
    }

    public String getDemandSfiSourcing_6() {
        return demandSfiSourcing_6;
    }

    public void setDemandSfiSourcing_6(String demandSfiSourcing_6) {
        this.demandSfiSourcing_6 = demandSfiSourcing_6;
    }

    public String getDemandSfiSourcing_7() {
        return demandSfiSourcing_7;
    }

    public void setDemandSfiSourcing_7(String demandSfiSourcing_7) {
        this.demandSfiSourcing_7 = demandSfiSourcing_7;
    }

    public String getDemandSfiSourcing_8() {
        return demandSfiSourcing_8;
    }

    public void setDemandSfiSourcing_8(String demandSfiSourcing_8) {
        this.demandSfiSourcing_8 = demandSfiSourcing_8;
    }

    public String getDemandSfiSourcing_9() {
        return demandSfiSourcing_9;
    }

    public void setDemandSfiSourcing_9(String demandSfiSourcing_9) {
        this.demandSfiSourcing_9 = demandSfiSourcing_9;
    }

    public String getFscCocCertification() {
        return fscCocCertification;
    }

    public void setFscCocCertification(String fscCocCertification) {
        this.fscCocCertification = fscCocCertification;
    }

    public String getFscCocCertificationExplain() {
        return fscCocCertificationExplain;
    }

    public void setFscCocCertificationExplain(String fscCocCertificationExplain) {
        this.fscCocCertificationExplain = fscCocCertificationExplain;
    }

    public String getFscCocCertificationItemsWhy_1() {
        return fscCocCertificationItemsWhy_1;
    }

    public void setFscCocCertificationItemsWhy_1(String fscCocCertificationItemsWhy_1) {
        this.fscCocCertificationItemsWhy_1 = fscCocCertificationItemsWhy_1;
    }

    public String getFscForestCertification() {
        return fscForestCertification;
    }

    public void setFscForestCertification(String fscForestCertification) {
        this.fscForestCertification = fscForestCertification;
    }

    public String getFscForestCertificationExplain() {
        return fscForestCertificationExplain;
    }

    public void setFscForestCertificationExplain(String fscForestCertificationExplain) {
        this.fscForestCertificationExplain = fscForestCertificationExplain;
    }

    public String getFscForestCertificationWhy_1() {
        return fscForestCertificationWhy_1;
    }

    public void setFscForestCertificationWhy_1(String fscForestCertificationWhy_1) {
        this.fscForestCertificationWhy_1 = fscForestCertificationWhy_1;
    }

    public String getPefcDemandDeveloping_10() {
        return pefcDemandDeveloping_10;
    }

    public void setPefcDemandDeveloping_10(String pefcDemandDeveloping_10) {
        this.pefcDemandDeveloping_10 = pefcDemandDeveloping_10;
    }

    public String getPefcDemandDeveloping_11() {
        return pefcDemandDeveloping_11;
    }

    public void setPefcDemandDeveloping_11(String pefcDemandDeveloping_11) {
        this.pefcDemandDeveloping_11 = pefcDemandDeveloping_11;
    }

    public String getPefcDemandDeveloping_12() {
        return pefcDemandDeveloping_12;
    }

    public void setPefcDemandDeveloping_12(String pefcDemandDeveloping_12) {
        this.pefcDemandDeveloping_12 = pefcDemandDeveloping_12;
    }

    public String getPefcDemandDeveloping_13() {
        return pefcDemandDeveloping_13;
    }

    public void setPefcDemandDeveloping_13(String pefcDemandDeveloping_13) {
        this.pefcDemandDeveloping_13 = pefcDemandDeveloping_13;
    }

    public String getPefcDemandDeveloping_1() {
        return pefcDemandDeveloping_1;
    }

    public void setPefcDemandDeveloping_1(String pefcDemandDeveloping_1) {
        this.pefcDemandDeveloping_1 = pefcDemandDeveloping_1;
    }

    public String getPefcDemandDeveloping_2() {
        return pefcDemandDeveloping_2;
    }

    public void setPefcDemandDeveloping_2(String pefcDemandDeveloping_2) {
        this.pefcDemandDeveloping_2 = pefcDemandDeveloping_2;
    }

    public String getPefcDemandDeveloping_3() {
        return pefcDemandDeveloping_3;
    }

    public void setPefcDemandDeveloping_3(String pefcDemandDeveloping_3) {
        this.pefcDemandDeveloping_3 = pefcDemandDeveloping_3;
    }

    public String getPefcDemandDeveloping_4() {
        return pefcDemandDeveloping_4;
    }

    public void setPefcDemandDeveloping_4(String pefcDemandDeveloping_4) {
        this.pefcDemandDeveloping_4 = pefcDemandDeveloping_4;
    }

    public String getPefcDemandDeveloping_5() {
        return pefcDemandDeveloping_5;
    }

    public void setPefcDemandDeveloping_5(String pefcDemandDeveloping_5) {
        this.pefcDemandDeveloping_5 = pefcDemandDeveloping_5;
    }

    public String getPefcDemandDeveloping_6() {
        return pefcDemandDeveloping_6;
    }

    public void setPefcDemandDeveloping_6(String pefcDemandDeveloping_6) {
        this.pefcDemandDeveloping_6 = pefcDemandDeveloping_6;
    }

    public String getPefcDemandDeveloping_7() {
        return pefcDemandDeveloping_7;
    }

    public void setPefcDemandDeveloping_7(String pefcDemandDeveloping_7) {
        this.pefcDemandDeveloping_7 = pefcDemandDeveloping_7;
    }

    public String getPefcDemandDeveloping_8() {
        return pefcDemandDeveloping_8;
    }

    public void setPefcDemandDeveloping_8(String pefcDemandDeveloping_8) {
        this.pefcDemandDeveloping_8 = pefcDemandDeveloping_8;
    }

    public String getPefcDemandDeveloping_9() {
        return pefcDemandDeveloping_9;
    }

    public void setPefcDemandDeveloping_9(String pefcDemandDeveloping_9) {
        this.pefcDemandDeveloping_9 = pefcDemandDeveloping_9;
    }

    public String getPlanSfiLabelUseComment10() {
        return planSfiLabelUseComment10;
    }

    public void setPlanSfiLabelUseComment10(String planSfiLabelUseComment10) {
        this.planSfiLabelUseComment10 = planSfiLabelUseComment10;
    }

    public String getPlanSfiLabelUseComment11() {
        return planSfiLabelUseComment11;
    }

    public void setPlanSfiLabelUseComment11(String planSfiLabelUseComment11) {
        this.planSfiLabelUseComment11 = planSfiLabelUseComment11;
    }

    public String getPlanSfiLabelUseComment12() {
        return planSfiLabelUseComment12;
    }

    public void setPlanSfiLabelUseComment12(String planSfiLabelUseComment12) {
        this.planSfiLabelUseComment12 = planSfiLabelUseComment12;
    }

    public String getPlanSfiLabelUseComment1() {
        return planSfiLabelUseComment1;
    }

    public void setPlanSfiLabelUseComment1(String planSfiLabelUseComment1) {
        this.planSfiLabelUseComment1 = planSfiLabelUseComment1;
    }

    public String getPlanSfiLabelUseComment2() {
        return planSfiLabelUseComment2;
    }

    public void setPlanSfiLabelUseComment2(String planSfiLabelUseComment2) {
        this.planSfiLabelUseComment2 = planSfiLabelUseComment2;
    }

    public String getPlanSfiLabelUseComment3() {
        return planSfiLabelUseComment3;
    }

    public void setPlanSfiLabelUseComment3(String planSfiLabelUseComment3) {
        this.planSfiLabelUseComment3 = planSfiLabelUseComment3;
    }

    public String getPlanSfiLabelUseComment4() {
        return planSfiLabelUseComment4;
    }

    public void setPlanSfiLabelUseComment4(String planSfiLabelUseComment4) {
        this.planSfiLabelUseComment4 = planSfiLabelUseComment4;
    }

    public String getPlanSfiLabelUseComment5() {
        return planSfiLabelUseComment5;
    }

    public void setPlanSfiLabelUseComment5(String planSfiLabelUseComment5) {
        this.planSfiLabelUseComment5 = planSfiLabelUseComment5;
    }

    public String getPlanSfiLabelUseComment6() {
        return planSfiLabelUseComment6;
    }

    public void setPlanSfiLabelUseComment6(String planSfiLabelUseComment6) {
        this.planSfiLabelUseComment6 = planSfiLabelUseComment6;
    }

    public String getPlanSfiLabelUseComment7() {
        return planSfiLabelUseComment7;
    }

    public void setPlanSfiLabelUseComment7(String planSfiLabelUseComment7) {
        this.planSfiLabelUseComment7 = planSfiLabelUseComment7;
    }

    public String getPlanSfiLabelUseComment8() {
        return planSfiLabelUseComment8;
    }

    public void setPlanSfiLabelUseComment8(String planSfiLabelUseComment8) {
        this.planSfiLabelUseComment8 = planSfiLabelUseComment8;
    }

    public String getPlanSfiLabelUseComment9() {
        return planSfiLabelUseComment9;
    }

    public void setPlanSfiLabelUseComment9(String planSfiLabelUseComment9) {
        this.planSfiLabelUseComment9 = planSfiLabelUseComment9;
    }

    public String getPlanSfiLabelUseIncrease10() {
        return planSfiLabelUseIncrease10;
    }

    public void setPlanSfiLabelUseIncrease10(String planSfiLabelUseIncrease10) {
        this.planSfiLabelUseIncrease10 = planSfiLabelUseIncrease10;
    }

    public String getPlanSfiLabelUseIncrease11() {
        return planSfiLabelUseIncrease11;
    }

    public void setPlanSfiLabelUseIncrease11(String planSfiLabelUseIncrease11) {
        this.planSfiLabelUseIncrease11 = planSfiLabelUseIncrease11;
    }

    public String getPlanSfiLabelUseIncrease12() {
        return planSfiLabelUseIncrease12;
    }

    public void setPlanSfiLabelUseIncrease12(String planSfiLabelUseIncrease12) {
        this.planSfiLabelUseIncrease12 = planSfiLabelUseIncrease12;
    }

    public String getPlanSfiLabelUseIncrease13() {
        return planSfiLabelUseIncrease13;
    }

    public void setPlanSfiLabelUseIncrease13(String planSfiLabelUseIncrease13) {
        this.planSfiLabelUseIncrease13 = planSfiLabelUseIncrease13;
    }

    public String getPlanSfiLabelUseIncrease1() {
        return planSfiLabelUseIncrease1;
    }

    public void setPlanSfiLabelUseIncrease1(String planSfiLabelUseIncrease1) {
        this.planSfiLabelUseIncrease1 = planSfiLabelUseIncrease1;
    }

    public String getPlanSfiLabelUseIncrease2() {
        return planSfiLabelUseIncrease2;
    }

    public void setPlanSfiLabelUseIncrease2(String planSfiLabelUseIncrease2) {
        this.planSfiLabelUseIncrease2 = planSfiLabelUseIncrease2;
    }

    public String getPlanSfiLabelUseIncrease3() {
        return planSfiLabelUseIncrease3;
    }

    public void setPlanSfiLabelUseIncrease3(String planSfiLabelUseIncrease3) {
        this.planSfiLabelUseIncrease3 = planSfiLabelUseIncrease3;
    }

    public String getPlanSfiLabelUseIncrease4() {
        return planSfiLabelUseIncrease4;
    }

    public void setPlanSfiLabelUseIncrease4(String planSfiLabelUseIncrease4) {
        this.planSfiLabelUseIncrease4 = planSfiLabelUseIncrease4;
    }

    public String getPlanSfiLabelUseIncrease5() {
        return planSfiLabelUseIncrease5;
    }

    public void setPlanSfiLabelUseIncrease5(String planSfiLabelUseIncrease5) {
        this.planSfiLabelUseIncrease5 = planSfiLabelUseIncrease5;
    }

    public String getPlanSfiLabelUseIncrease6() {
        return planSfiLabelUseIncrease6;
    }

    public void setPlanSfiLabelUseIncrease6(String planSfiLabelUseIncrease6) {
        this.planSfiLabelUseIncrease6 = planSfiLabelUseIncrease6;
    }

    public String getPlanSfiLabelUseIncrease7() {
        return planSfiLabelUseIncrease7;
    }

    public void setPlanSfiLabelUseIncrease7(String planSfiLabelUseIncrease7) {
        this.planSfiLabelUseIncrease7 = planSfiLabelUseIncrease7;
    }

    public String getPlanSfiLabelUseIncrease8() {
        return planSfiLabelUseIncrease8;
    }

    public void setPlanSfiLabelUseIncrease8(String planSfiLabelUseIncrease8) {
        this.planSfiLabelUseIncrease8 = planSfiLabelUseIncrease8;
    }

    public String getPlanSfiLabelUseIncrease9() {
        return planSfiLabelUseIncrease9;
    }

    public void setPlanSfiLabelUseIncrease9(String planSfiLabelUseIncrease9) {
        this.planSfiLabelUseIncrease9 = planSfiLabelUseIncrease9;
    }

    public String getRequestWentMarketPerc10() {
        return requestWentMarketPerc10;
    }

    public void setRequestWentMarketPerc10(String requestWentMarketPerc10) {
        this.requestWentMarketPerc10 = requestWentMarketPerc10;
    }

    public String getRequestWentMarketPerc11() {
        return requestWentMarketPerc11;
    }

    public void setRequestWentMarketPerc11(String requestWentMarketPerc11) {
        this.requestWentMarketPerc11 = requestWentMarketPerc11;
    }

    public String getRequestWentMarketPerc12() {
        return requestWentMarketPerc12;
    }

    public void setRequestWentMarketPerc12(String requestWentMarketPerc12) {
        this.requestWentMarketPerc12 = requestWentMarketPerc12;
    }

    public String getRequestWentMarketPerc13() {
        return requestWentMarketPerc13;
    }

    public void setRequestWentMarketPerc13(String requestWentMarketPerc13) {
        this.requestWentMarketPerc13 = requestWentMarketPerc13;
    }

    public String getRequestWentMarketPerc1() {
        return requestWentMarketPerc1;
    }

    public void setRequestWentMarketPerc1(String requestWentMarketPerc1) {
        this.requestWentMarketPerc1 = requestWentMarketPerc1;
    }

    public String getRequestWentMarketPerc2() {
        return requestWentMarketPerc2;
    }

    public void setRequestWentMarketPerc2(String requestWentMarketPerc2) {
        this.requestWentMarketPerc2 = requestWentMarketPerc2;
    }

    public String getRequestWentMarketPerc3() {
        return requestWentMarketPerc3;
    }

    public void setRequestWentMarketPerc3(String requestWentMarketPerc3) {
        this.requestWentMarketPerc3 = requestWentMarketPerc3;
    }

    public String getRequestWentMarketPerc4() {
        return requestWentMarketPerc4;
    }

    public void setRequestWentMarketPerc4(String requestWentMarketPerc4) {
        this.requestWentMarketPerc4 = requestWentMarketPerc4;
    }

    public String getRequestWentMarketPerc5() {
        return requestWentMarketPerc5;
    }

    public void setRequestWentMarketPerc5(String requestWentMarketPerc5) {
        this.requestWentMarketPerc5 = requestWentMarketPerc5;
    }

    public String getRequestWentMarketPerc6() {
        return requestWentMarketPerc6;
    }

    public void setRequestWentMarketPerc6(String requestWentMarketPerc6) {
        this.requestWentMarketPerc6 = requestWentMarketPerc6;
    }

    public String getRequestWentMarketPerc7() {
        return requestWentMarketPerc7;
    }

    public void setRequestWentMarketPerc7(String requestWentMarketPerc7) {
        this.requestWentMarketPerc7 = requestWentMarketPerc7;
    }

    public String getRequestWentMarketPerc8() {
        return requestWentMarketPerc8;
    }

    public void setRequestWentMarketPerc8(String requestWentMarketPerc8) {
        this.requestWentMarketPerc8 = requestWentMarketPerc8;
    }

    public String getRequestWentMarketPerc9() {
        return requestWentMarketPerc9;
    }

    public void setRequestWentMarketPerc9(String requestWentMarketPerc9) {
        this.requestWentMarketPerc9 = requestWentMarketPerc9;
    }

    public String getSfiDemandDeveloping_1() {
        return sfiDemandDeveloping_1;
    }

    public void setSfiDemandDeveloping_1(String sfiDemandDeveloping_1) {
        this.sfiDemandDeveloping_1 = sfiDemandDeveloping_1;
    }

    public String getSfiForestContentCoc_10() {
        return sfiForestContentCoc_10;
    }

    public void setSfiForestContentCoc_10(String sfiForestContentCoc_10) {
        this.sfiForestContentCoc_10 = sfiForestContentCoc_10;
    }

    public String getSfiForestContentCoc_11() {
        return sfiForestContentCoc_11;
    }

    public void setSfiForestContentCoc_11(String sfiForestContentCoc_11) {
        this.sfiForestContentCoc_11 = sfiForestContentCoc_11;
    }

    public String getSfiForestContentCoc_12() {
        return sfiForestContentCoc_12;
    }

    public void setSfiForestContentCoc_12(String sfiForestContentCoc_12) {
        this.sfiForestContentCoc_12 = sfiForestContentCoc_12;
    }

    public String getSfiForestContentCoc_13() {
        return sfiForestContentCoc_13;
    }

    public void setSfiForestContentCoc_13(String sfiForestContentCoc_13) {
        this.sfiForestContentCoc_13 = sfiForestContentCoc_13;
    }

    public String getSfiForestContentCoc_1() {
        return sfiForestContentCoc_1;
    }

    public void setSfiForestContentCoc_1(String sfiForestContentCoc_1) {
        this.sfiForestContentCoc_1 = sfiForestContentCoc_1;
    }

    public String getSfiForestContentCoc_2() {
        return sfiForestContentCoc_2;
    }

    public void setSfiForestContentCoc_2(String sfiForestContentCoc_2) {
        this.sfiForestContentCoc_2 = sfiForestContentCoc_2;
    }

    public String getSfiForestContentCoc_3() {
        return sfiForestContentCoc_3;
    }

    public void setSfiForestContentCoc_3(String sfiForestContentCoc_3) {
        this.sfiForestContentCoc_3 = sfiForestContentCoc_3;
    }

    public String getSfiForestContentCoc_4() {
        return sfiForestContentCoc_4;
    }

    public void setSfiForestContentCoc_4(String sfiForestContentCoc_4) {
        this.sfiForestContentCoc_4 = sfiForestContentCoc_4;
    }

    public String getSfiForestContentCoc_5() {
        return sfiForestContentCoc_5;
    }

    public void setSfiForestContentCoc_5(String sfiForestContentCoc_5) {
        this.sfiForestContentCoc_5 = sfiForestContentCoc_5;
    }

    public String getSfiForestContentCoc_6() {
        return sfiForestContentCoc_6;
    }

    public void setSfiForestContentCoc_6(String sfiForestContentCoc_6) {
        this.sfiForestContentCoc_6 = sfiForestContentCoc_6;
    }

    public String getSfiForestContentCoc_7() {
        return sfiForestContentCoc_7;
    }

    public void setSfiForestContentCoc_7(String sfiForestContentCoc_7) {
        this.sfiForestContentCoc_7 = sfiForestContentCoc_7;
    }

    public String getSfiForestContentCoc_8() {
        return sfiForestContentCoc_8;
    }

    public void setSfiForestContentCoc_8(String sfiForestContentCoc_8) {
        this.sfiForestContentCoc_8 = sfiForestContentCoc_8;
    }

    public String getSfiForestContentCoc_9() {
        return sfiForestContentCoc_9;
    }

    public void setSfiForestContentCoc_9(String sfiForestContentCoc_9) {
        this.sfiForestContentCoc_9 = sfiForestContentCoc_9;
    }

    public String getSfiLabelProductSell_explain_10() {
        return sfiLabelProductSell_explain_10;
    }

    public void setSfiLabelProductSell_explain_10(String sfiLabelProductSell_explain_10) {
        this.sfiLabelProductSell_explain_10 = sfiLabelProductSell_explain_10;
    }

    public String getSfiLabelProductSell_explain_11() {
        return sfiLabelProductSell_explain_11;
    }

    public void setSfiLabelProductSell_explain_11(String sfiLabelProductSell_explain_11) {
        this.sfiLabelProductSell_explain_11 = sfiLabelProductSell_explain_11;
    }

    public String getSfiLabelProductSell_explain_12() {
        return sfiLabelProductSell_explain_12;
    }

    public void setSfiLabelProductSell_explain_12(String sfiLabelProductSell_explain_12) {
        this.sfiLabelProductSell_explain_12 = sfiLabelProductSell_explain_12;
    }

    public String getSfiLabelProductSell_explain_13() {
        return sfiLabelProductSell_explain_13;
    }

    public void setSfiLabelProductSell_explain_13(String sfiLabelProductSell_explain_13) {
        this.sfiLabelProductSell_explain_13 = sfiLabelProductSell_explain_13;
    }

    public String getSfiLabelProductSell_explain_1() {
        return sfiLabelProductSell_explain_1;
    }

    public void setSfiLabelProductSell_explain_1(String sfiLabelProductSell_explain_1) {
        this.sfiLabelProductSell_explain_1 = sfiLabelProductSell_explain_1;
    }

    public String getSfiLabelProductSell_explain_2() {
        return sfiLabelProductSell_explain_2;
    }

    public void setSfiLabelProductSell_explain_2(String sfiLabelProductSell_explain_2) {
        this.sfiLabelProductSell_explain_2 = sfiLabelProductSell_explain_2;
    }

    public String getSfiLabelProductSell_explain_3() {
        return sfiLabelProductSell_explain_3;
    }

    public void setSfiLabelProductSell_explain_3(String sfiLabelProductSell_explain_3) {
        this.sfiLabelProductSell_explain_3 = sfiLabelProductSell_explain_3;
    }

    public String getSfiLabelProductSell_explain_4() {
        return sfiLabelProductSell_explain_4;
    }

    public void setSfiLabelProductSell_explain_4(String sfiLabelProductSell_explain_4) {
        this.sfiLabelProductSell_explain_4 = sfiLabelProductSell_explain_4;
    }

    public String getSfiLabelProductSell_explain_5() {
        return sfiLabelProductSell_explain_5;
    }

    public void setSfiLabelProductSell_explain_5(String sfiLabelProductSell_explain_5) {
        this.sfiLabelProductSell_explain_5 = sfiLabelProductSell_explain_5;
    }

    public String getSfiLabelProductSell_explain_6() {
        return sfiLabelProductSell_explain_6;
    }

    public void setSfiLabelProductSell_explain_6(String sfiLabelProductSell_explain_6) {
        this.sfiLabelProductSell_explain_6 = sfiLabelProductSell_explain_6;
    }

    public String getSfiLabelProductSell_explain_7() {
        return sfiLabelProductSell_explain_7;
    }

    public void setSfiLabelProductSell_explain_7(String sfiLabelProductSell_explain_7) {
        this.sfiLabelProductSell_explain_7 = sfiLabelProductSell_explain_7;
    }

    public String getSfiLabelProductSell_explain_8() {
        return sfiLabelProductSell_explain_8;
    }

    public void setSfiLabelProductSell_explain_8(String sfiLabelProductSell_explain_8) {
        this.sfiLabelProductSell_explain_8 = sfiLabelProductSell_explain_8;
    }

    public String getSfiLabelProductSell_explain_9() {
        return sfiLabelProductSell_explain_9;
    }

    public void setSfiLabelProductSell_explain_9(String sfiLabelProductSell_explain_9) {
        this.sfiLabelProductSell_explain_9 = sfiLabelProductSell_explain_9;
    }

    public String getWhyChoseSFI10() {
        return whyChoseSFI10;
    }

    public void setWhyChoseSFI10(String whyChoseSFI10) {
        this.whyChoseSFI10 = whyChoseSFI10;
    }

    public String getWhyChoseSFI11() {
        return whyChoseSFI11;
    }

    public void setWhyChoseSFI11(String whyChoseSFI11) {
        this.whyChoseSFI11 = whyChoseSFI11;
    }

    public String getWhyChoseSFI12() {
        return whyChoseSFI12;
    }

    public void setWhyChoseSFI12(String whyChoseSFI12) {
        this.whyChoseSFI12 = whyChoseSFI12;
    }

    public String getWhyChoseSFI13() {
        return whyChoseSFI13;
    }

    public void setWhyChoseSFI13(String whyChoseSFI13) {
        this.whyChoseSFI13 = whyChoseSFI13;
    }

    public String getWhyChoseSFI14() {
        return whyChoseSFI14;
    }

    public void setWhyChoseSFI14(String whyChoseSFI14) {
        this.whyChoseSFI14 = whyChoseSFI14;
    }

    public String getWhyChoseSFI15() {
        return whyChoseSFI15;
    }

    public void setWhyChoseSFI15(String whyChoseSFI15) {
        this.whyChoseSFI15 = whyChoseSFI15;
    }

    public String getWhyChoseSFI16() {
        return whyChoseSFI16;
    }

    public void setWhyChoseSFI16(String whyChoseSFI16) {
        this.whyChoseSFI16 = whyChoseSFI16;
    }

    public String getWhyChoseSFI17() {
        return whyChoseSFI17;
    }

    public void setWhyChoseSFI17(String whyChoseSFI17) {
        this.whyChoseSFI17 = whyChoseSFI17;
    }

    public String getWhyChoseSFI18() {
        return whyChoseSFI18;
    }

    public void setWhyChoseSFI18(String whyChoseSFI18) {
        this.whyChoseSFI18 = whyChoseSFI18;
    }

    public String getWhyChoseSFI19() {
        return whyChoseSFI19;
    }

    public void setWhyChoseSFI19(String whyChoseSFI19) {
        this.whyChoseSFI19 = whyChoseSFI19;
    }

    public String getWhyChoseSFI1() {
        return whyChoseSFI1;
    }

    public void setWhyChoseSFI1(String whyChoseSFI1) {
        this.whyChoseSFI1 = whyChoseSFI1;
    }

    public String getWhyChoseSFI20() {
        return whyChoseSFI20;
    }

    public void setWhyChoseSFI20(String whyChoseSFI20) {
        this.whyChoseSFI20 = whyChoseSFI20;
    }

    public String getWhyChoseSFI21() {
        return whyChoseSFI21;
    }

    public void setWhyChoseSFI21(String whyChoseSFI21) {
        this.whyChoseSFI21 = whyChoseSFI21;
    }

    public String getWhyChoseSFI2() {
        return whyChoseSFI2;
    }

    public void setWhyChoseSFI2(String whyChoseSFI2) {
        this.whyChoseSFI2 = whyChoseSFI2;
    }

    public String getWhyChoseSFI3() {
        return whyChoseSFI3;
    }

    public void setWhyChoseSFI3(String whyChoseSFI3) {
        this.whyChoseSFI3 = whyChoseSFI3;
    }

    public String getWhyChoseSFI4() {
        return whyChoseSFI4;
    }

    public void setWhyChoseSFI4(String whyChoseSFI4) {
        this.whyChoseSFI4 = whyChoseSFI4;
    }

    public String getWhyChoseSFI5() {
        return whyChoseSFI5;
    }

    public void setWhyChoseSFI5(String whyChoseSFI5) {
        this.whyChoseSFI5 = whyChoseSFI5;
    }

    public String getWhyChoseSFI6() {
        return whyChoseSFI6;
    }

    public void setWhyChoseSFI6(String whyChoseSFI6) {
        this.whyChoseSFI6 = whyChoseSFI6;
    }

    public String getWhyChoseSFI7() {
        return whyChoseSFI7;
    }

    public void setWhyChoseSFI7(String whyChoseSFI7) {
        this.whyChoseSFI7 = whyChoseSFI7;
    }

    public String getWhyChoseSFI8() {
        return whyChoseSFI8;
    }

    public void setWhyChoseSFI8(String whyChoseSFI8) {
        this.whyChoseSFI8 = whyChoseSFI8;
    }

    public String getWhyChoseSFI9() {
        return whyChoseSFI9;
    }

    public void setWhyChoseSFI9(String whyChoseSFI9) {
        this.whyChoseSFI9 = whyChoseSFI9;
    }

    public String getFscDemandDeveloping_1() {
        return fscDemandDeveloping_1;
    }

    public void setFscDemandDeveloping_1(String fscDemandDeveloping_1) {
        this.fscDemandDeveloping_1 = fscDemandDeveloping_1;
    }

    public String getSfiDemandDeveloping_2() {
        return sfiDemandDeveloping_2;
    }

    public void setSfiDemandDeveloping_2(String sfiDemandDeveloping_2) {
        this.sfiDemandDeveloping_2 = sfiDemandDeveloping_2;
    }

    public String getSfiDemandDeveloping_3() {
        return sfiDemandDeveloping_3;
    }

    public void setSfiDemandDeveloping_3(String sfiDemandDeveloping_3) {
        this.sfiDemandDeveloping_3 = sfiDemandDeveloping_3;
    }

    public String getSfiDemandDeveloping_4() {
        return sfiDemandDeveloping_4;
    }

    public void setSfiDemandDeveloping_4(String sfiDemandDeveloping_4) {
        this.sfiDemandDeveloping_4 = sfiDemandDeveloping_4;
    }

    public String getSfiDemandDeveloping_5() {
        return sfiDemandDeveloping_5;
    }

    public void setSfiDemandDeveloping_5(String sfiDemandDeveloping_5) {
        this.sfiDemandDeveloping_5 = sfiDemandDeveloping_5;
    }

    public String getSfiDemandDeveloping_6() {
        return sfiDemandDeveloping_6;
    }

    public void setSfiDemandDeveloping_6(String sfiDemandDeveloping_6) {
        this.sfiDemandDeveloping_6 = sfiDemandDeveloping_6;
    }

    public String getSfiDemandDeveloping_7() {
        return sfiDemandDeveloping_7;
    }

    public void setSfiDemandDeveloping_7(String sfiDemandDeveloping_7) {
        this.sfiDemandDeveloping_7 = sfiDemandDeveloping_7;
    }

    public String getSfiDemandDeveloping_8() {
        return sfiDemandDeveloping_8;
    }

    public void setSfiDemandDeveloping_8(String sfiDemandDeveloping_8) {
        this.sfiDemandDeveloping_8 = sfiDemandDeveloping_8;
    }

    public String getSfiDemandDeveloping_9() {
        return sfiDemandDeveloping_9;
    }

    public void setSfiDemandDeveloping_9(String sfiDemandDeveloping_9) {
        this.sfiDemandDeveloping_9 = sfiDemandDeveloping_9;
    }

    public String getSfiDemandDeveloping_10() {
        return sfiDemandDeveloping_10;
    }

    public void setSfiDemandDeveloping_10(String sfiDemandDeveloping_10) {
        this.sfiDemandDeveloping_10 = sfiDemandDeveloping_10;
    }

    public String getSfiDemandDeveloping_11() {
        return sfiDemandDeveloping_11;
    }

    public void setSfiDemandDeveloping_11(String sfiDemandDeveloping_11) {
        this.sfiDemandDeveloping_11 = sfiDemandDeveloping_11;
    }

    public String getSfiDemandDeveloping_12() {
        return sfiDemandDeveloping_12;
    }

    public void setSfiDemandDeveloping_12(String sfiDemandDeveloping_12) {
        this.sfiDemandDeveloping_12 = sfiDemandDeveloping_12;
    }

    public String getSfiDemandDeveloping_13() {
        return sfiDemandDeveloping_13;
    }

    public void setSfiDemandDeveloping_13(String sfiDemandDeveloping_13) {
        this.sfiDemandDeveloping_13 = sfiDemandDeveloping_13;
    }

    public String getSfiHelpCommunicationExplain() {
        return sfiHelpCommunicationExplain;
    }

    public void setSfiHelpCommunicationExplain(String sfiHelpCommunicationExplain) {
        this.sfiHelpCommunicationExplain = sfiHelpCommunicationExplain;
    }

    public String getSfiMarketExplain1() {
        return sfiMarketExplain1;
    }

    public void setSfiMarketExplain1(String sfiMarketExplain1) {
        this.sfiMarketExplain1 = sfiMarketExplain1;
    }

    public String getSfiMarketExplain2() {
        return sfiMarketExplain2;
    }

    public void setSfiMarketExplain2(String sfiMarketExplain2) {
        this.sfiMarketExplain2 = sfiMarketExplain2;
    }

    public String getSfiServeComments() {
        return sfiServeComments;
    }

    public void setSfiServeComments(String sfiServeComments) {
        this.sfiServeComments = sfiServeComments;
    }

    public String getFscCocCertificationItemsWhy_2() {
        return fscCocCertificationItemsWhy_2;
    }

    public void setFscCocCertificationItemsWhy_2(String fscCocCertificationItemsWhy_2) {
        this.fscCocCertificationItemsWhy_2 = fscCocCertificationItemsWhy_2;
    }

    public String getFscDemandDeveloping_4() {
        return fscDemandDeveloping_4;
    }

    public void setFscDemandDeveloping_4(String fscDemandDeveloping_4) {
        this.fscDemandDeveloping_4 = fscDemandDeveloping_4;
    }

    public Integer getSfiLogoUseMotivation_1_1() {
        return sfiLogoUseMotivation_1_1;
    }

    public void setSfiLogoUseMotivation_1_1(Integer sfiLogoUseMotivation_1_1) {
        this.sfiLogoUseMotivation_1_1 = sfiLogoUseMotivation_1_1;
    }

    public Integer getSfiLogoUseMotivation_1_2() {
        return sfiLogoUseMotivation_1_2;
    }

    public void setSfiLogoUseMotivation_1_2(Integer sfiLogoUseMotivation_1_2) {
        this.sfiLogoUseMotivation_1_2 = sfiLogoUseMotivation_1_2;
    }

    public Integer getSfiLogoUseMotivation_1_3() {
        return sfiLogoUseMotivation_1_3;
    }

    public void setSfiLogoUseMotivation_1_3(Integer sfiLogoUseMotivation_1_3) {
        this.sfiLogoUseMotivation_1_3 = sfiLogoUseMotivation_1_3;
    }

    public Integer getSfiLogoUseMotivation_1_4() {
        return sfiLogoUseMotivation_1_4;
    }

    public void setSfiLogoUseMotivation_1_4(Integer sfiLogoUseMotivation_1_4) {
        this.sfiLogoUseMotivation_1_4 = sfiLogoUseMotivation_1_4;
    }

    public Integer getSfiLogoUseMotivation_1_5() {
        return sfiLogoUseMotivation_1_5;
    }

    public void setSfiLogoUseMotivation_1_5(Integer sfiLogoUseMotivation_1_5) {
        this.sfiLogoUseMotivation_1_5 = sfiLogoUseMotivation_1_5;
    }

    public Integer getSfiLogoUseMotivation_1_6() {
        return sfiLogoUseMotivation_1_6;
    }

    public void setSfiLogoUseMotivation_1_6(Integer sfiLogoUseMotivation_1_6) {
        this.sfiLogoUseMotivation_1_6 = sfiLogoUseMotivation_1_6;
    }

    public Integer getSfiLogoUseMotivation_1_7() {
        return sfiLogoUseMotivation_1_7;
    }

    public void setSfiLogoUseMotivation_1_7(Integer sfiLogoUseMotivation_1_7) {
        this.sfiLogoUseMotivation_1_7 = sfiLogoUseMotivation_1_7;
    }

    public Integer getSfiLogoUseMotivation_1_8() {
        return sfiLogoUseMotivation_1_8;
    }

    public void setSfiLogoUseMotivation_1_8(Integer sfiLogoUseMotivation_1_8) {
        this.sfiLogoUseMotivation_1_8 = sfiLogoUseMotivation_1_8;
    }

    public Integer getSfiLogoUseMotivation_1_9() {
        return sfiLogoUseMotivation_1_9;
    }

    public void setSfiLogoUseMotivation_1_9(Integer sfiLogoUseMotivation_1_9) {
        this.sfiLogoUseMotivation_1_9 = sfiLogoUseMotivation_1_9;
    }

    public Integer getSfiLogoUseMotivation_1_10() {
        return sfiLogoUseMotivation_1_10;
    }

    public void setSfiLogoUseMotivation_1_10(Integer sfiLogoUseMotivation_1_10) {
        this.sfiLogoUseMotivation_1_10 = sfiLogoUseMotivation_1_10;
    }

    public Integer getSfiLogoUseMotivation_1_11() {
        return sfiLogoUseMotivation_1_11;
    }

    public void setSfiLogoUseMotivation_1_11(Integer sfiLogoUseMotivation_1_11) {
        this.sfiLogoUseMotivation_1_11 = sfiLogoUseMotivation_1_11;
    }

    public Integer getSfiLogoUseMotivation_2_1() {
        return sfiLogoUseMotivation_2_1;
    }

    public void setSfiLogoUseMotivation_2_1(Integer sfiLogoUseMotivation_2_1) {
        this.sfiLogoUseMotivation_2_1 = sfiLogoUseMotivation_2_1;
    }

    public Integer getSfiLogoUseMotivation_2_2() {
        return sfiLogoUseMotivation_2_2;
    }

    public void setSfiLogoUseMotivation_2_2(Integer sfiLogoUseMotivation_2_2) {
        this.sfiLogoUseMotivation_2_2 = sfiLogoUseMotivation_2_2;
    }

    public Integer getSfiLogoUseMotivation_2_3() {
        return sfiLogoUseMotivation_2_3;
    }

    public void setSfiLogoUseMotivation_2_3(Integer sfiLogoUseMotivation_2_3) {
        this.sfiLogoUseMotivation_2_3 = sfiLogoUseMotivation_2_3;
    }

    public Integer getSfiLogoUseMotivation_2_4() {
        return sfiLogoUseMotivation_2_4;
    }

    public void setSfiLogoUseMotivation_2_4(Integer sfiLogoUseMotivation_2_4) {
        this.sfiLogoUseMotivation_2_4 = sfiLogoUseMotivation_2_4;
    }

    public Integer getSfiLogoUseMotivation_2_5() {
        return sfiLogoUseMotivation_2_5;
    }

    public void setSfiLogoUseMotivation_2_5(Integer sfiLogoUseMotivation_2_5) {
        this.sfiLogoUseMotivation_2_5 = sfiLogoUseMotivation_2_5;
    }

    public Integer getSfiLogoUseMotivation_2_6() {
        return sfiLogoUseMotivation_2_6;
    }

    public void setSfiLogoUseMotivation_2_6(Integer sfiLogoUseMotivation_2_6) {
        this.sfiLogoUseMotivation_2_6 = sfiLogoUseMotivation_2_6;
    }

    public Integer getSfiLogoUseMotivation_2_7() {
        return sfiLogoUseMotivation_2_7;
    }

    public void setSfiLogoUseMotivation_2_7(Integer sfiLogoUseMotivation_2_7) {
        this.sfiLogoUseMotivation_2_7 = sfiLogoUseMotivation_2_7;
    }

    public Integer getSfiLogoUseMotivation_2_8() {
        return sfiLogoUseMotivation_2_8;
    }

    public void setSfiLogoUseMotivation_2_8(Integer sfiLogoUseMotivation_2_8) {
        this.sfiLogoUseMotivation_2_8 = sfiLogoUseMotivation_2_8;
    }

    public Integer getSfiLogoUseMotivation_2_9() {
        return sfiLogoUseMotivation_2_9;
    }

    public void setSfiLogoUseMotivation_2_9(Integer sfiLogoUseMotivation_2_9) {
        this.sfiLogoUseMotivation_2_9 = sfiLogoUseMotivation_2_9;
    }

    public Integer getSfiLogoUseMotivation_2_10() {
        return sfiLogoUseMotivation_2_10;
    }

    public void setSfiLogoUseMotivation_2_10(Integer sfiLogoUseMotivation_2_10) {
        this.sfiLogoUseMotivation_2_10 = sfiLogoUseMotivation_2_10;
    }

    public Integer getSfiLogoUseMotivation_2_11() {
        return sfiLogoUseMotivation_2_11;
    }

    public void setSfiLogoUseMotivation_2_11(Integer sfiLogoUseMotivation_2_11) {
        this.sfiLogoUseMotivation_2_11 = sfiLogoUseMotivation_2_11;
    }

    public Integer getSfiLogoUseMotivation_3_1() {
        return sfiLogoUseMotivation_3_1;
    }

    public void setSfiLogoUseMotivation_3_1(Integer sfiLogoUseMotivation_3_1) {
        this.sfiLogoUseMotivation_3_1 = sfiLogoUseMotivation_3_1;
    }

    public Integer getSfiLogoUseMotivation_3_2() {
        return sfiLogoUseMotivation_3_2;
    }

    public void setSfiLogoUseMotivation_3_2(Integer sfiLogoUseMotivation_3_2) {
        this.sfiLogoUseMotivation_3_2 = sfiLogoUseMotivation_3_2;
    }

    public Integer getSfiLogoUseMotivation_3_3() {
        return sfiLogoUseMotivation_3_3;
    }

    public void setSfiLogoUseMotivation_3_3(Integer sfiLogoUseMotivation_3_3) {
        this.sfiLogoUseMotivation_3_3 = sfiLogoUseMotivation_3_3;
    }

    public Integer getSfiLogoUseMotivation_3_4() {
        return sfiLogoUseMotivation_3_4;
    }

    public void setSfiLogoUseMotivation_3_4(Integer sfiLogoUseMotivation_3_4) {
        this.sfiLogoUseMotivation_3_4 = sfiLogoUseMotivation_3_4;
    }

    public Integer getSfiLogoUseMotivation_3_5() {
        return sfiLogoUseMotivation_3_5;
    }

    public void setSfiLogoUseMotivation_3_5(Integer sfiLogoUseMotivation_3_5) {
        this.sfiLogoUseMotivation_3_5 = sfiLogoUseMotivation_3_5;
    }

    public Integer getSfiLogoUseMotivation_3_6() {
        return sfiLogoUseMotivation_3_6;
    }

    public void setSfiLogoUseMotivation_3_6(Integer sfiLogoUseMotivation_3_6) {
        this.sfiLogoUseMotivation_3_6 = sfiLogoUseMotivation_3_6;
    }

    public Integer getSfiLogoUseMotivation_3_7() {
        return sfiLogoUseMotivation_3_7;
    }

    public void setSfiLogoUseMotivation_3_7(Integer sfiLogoUseMotivation_3_7) {
        this.sfiLogoUseMotivation_3_7 = sfiLogoUseMotivation_3_7;
    }

    public Integer getSfiLogoUseMotivation_3_8() {
        return sfiLogoUseMotivation_3_8;
    }

    public void setSfiLogoUseMotivation_3_8(Integer sfiLogoUseMotivation_3_8) {
        this.sfiLogoUseMotivation_3_8 = sfiLogoUseMotivation_3_8;
    }

    public Integer getSfiLogoUseMotivation_3_9() {
        return sfiLogoUseMotivation_3_9;
    }

    public void setSfiLogoUseMotivation_3_9(Integer sfiLogoUseMotivation_3_9) {
        this.sfiLogoUseMotivation_3_9 = sfiLogoUseMotivation_3_9;
    }

    public Integer getSfiLogoUseMotivation_3_10() {
        return sfiLogoUseMotivation_3_10;
    }

    public void setSfiLogoUseMotivation_3_10(Integer sfiLogoUseMotivation_3_10) {
        this.sfiLogoUseMotivation_3_10 = sfiLogoUseMotivation_3_10;
    }

    public Integer getSfiLogoUseMotivation_3_11() {
        return sfiLogoUseMotivation_3_11;
    }

    public void setSfiLogoUseMotivation_3_11(Integer sfiLogoUseMotivation_3_11) {
        this.sfiLogoUseMotivation_3_11 = sfiLogoUseMotivation_3_11;
    }

    public Integer getSfiLogoUseMotivation_4_1() {
        return sfiLogoUseMotivation_4_1;
    }

    public void setSfiLogoUseMotivation_4_1(Integer sfiLogoUseMotivation_4_1) {
        this.sfiLogoUseMotivation_4_1 = sfiLogoUseMotivation_4_1;
    }

    public Integer getSfiLogoUseMotivation_4_2() {
        return sfiLogoUseMotivation_4_2;
    }

    public void setSfiLogoUseMotivation_4_2(Integer sfiLogoUseMotivation_4_2) {
        this.sfiLogoUseMotivation_4_2 = sfiLogoUseMotivation_4_2;
    }

    public Integer getSfiLogoUseMotivation_4_3() {
        return sfiLogoUseMotivation_4_3;
    }

    public void setSfiLogoUseMotivation_4_3(Integer sfiLogoUseMotivation_4_3) {
        this.sfiLogoUseMotivation_4_3 = sfiLogoUseMotivation_4_3;
    }

    public Integer getSfiLogoUseMotivation_4_4() {
        return sfiLogoUseMotivation_4_4;
    }

    public void setSfiLogoUseMotivation_4_4(Integer sfiLogoUseMotivation_4_4) {
        this.sfiLogoUseMotivation_4_4 = sfiLogoUseMotivation_4_4;
    }

    public Integer getSfiLogoUseMotivation_4_5() {
        return sfiLogoUseMotivation_4_5;
    }

    public void setSfiLogoUseMotivation_4_5(Integer sfiLogoUseMotivation_4_5) {
        this.sfiLogoUseMotivation_4_5 = sfiLogoUseMotivation_4_5;
    }

    public Integer getSfiLogoUseMotivation_4_6() {
        return sfiLogoUseMotivation_4_6;
    }

    public void setSfiLogoUseMotivation_4_6(Integer sfiLogoUseMotivation_4_6) {
        this.sfiLogoUseMotivation_4_6 = sfiLogoUseMotivation_4_6;
    }

    public Integer getSfiLogoUseMotivation_4_7() {
        return sfiLogoUseMotivation_4_7;
    }

    public void setSfiLogoUseMotivation_4_7(Integer sfiLogoUseMotivation_4_7) {
        this.sfiLogoUseMotivation_4_7 = sfiLogoUseMotivation_4_7;
    }

    public Integer getSfiLogoUseMotivation_4_8() {
        return sfiLogoUseMotivation_4_8;
    }

    public void setSfiLogoUseMotivation_4_8(Integer sfiLogoUseMotivation_4_8) {
        this.sfiLogoUseMotivation_4_8 = sfiLogoUseMotivation_4_8;
    }

    public Integer getSfiLogoUseMotivation_4_9() {
        return sfiLogoUseMotivation_4_9;
    }

    public void setSfiLogoUseMotivation_4_9(Integer sfiLogoUseMotivation_4_9) {
        this.sfiLogoUseMotivation_4_9 = sfiLogoUseMotivation_4_9;
    }

    public Integer getSfiLogoUseMotivation_4_10() {
        return sfiLogoUseMotivation_4_10;
    }

    public void setSfiLogoUseMotivation_4_10(Integer sfiLogoUseMotivation_4_10) {
        this.sfiLogoUseMotivation_4_10 = sfiLogoUseMotivation_4_10;
    }

    public Integer getSfiLogoUseMotivation_4_11() {
        return sfiLogoUseMotivation_4_11;
    }

    public void setSfiLogoUseMotivation_4_11(Integer sfiLogoUseMotivation_4_11) {
        this.sfiLogoUseMotivation_4_11 = sfiLogoUseMotivation_4_11;
    }

    public Integer getSfiLogoUseMotivation_5_1() {
        return sfiLogoUseMotivation_5_1;
    }

    public void setSfiLogoUseMotivation_5_1(Integer sfiLogoUseMotivation_5_1) {
        this.sfiLogoUseMotivation_5_1 = sfiLogoUseMotivation_5_1;
    }

    public Integer getSfiLogoUseMotivation_5_2() {
        return sfiLogoUseMotivation_5_2;
    }

    public void setSfiLogoUseMotivation_5_2(Integer sfiLogoUseMotivation_5_2) {
        this.sfiLogoUseMotivation_5_2 = sfiLogoUseMotivation_5_2;
    }

    public Integer getSfiLogoUseMotivation_5_3() {
        return sfiLogoUseMotivation_5_3;
    }

    public void setSfiLogoUseMotivation_5_3(Integer sfiLogoUseMotivation_5_3) {
        this.sfiLogoUseMotivation_5_3 = sfiLogoUseMotivation_5_3;
    }

    public Integer getSfiLogoUseMotivation_5_4() {
        return sfiLogoUseMotivation_5_4;
    }

    public void setSfiLogoUseMotivation_5_4(Integer sfiLogoUseMotivation_5_4) {
        this.sfiLogoUseMotivation_5_4 = sfiLogoUseMotivation_5_4;
    }

    public Integer getSfiLogoUseMotivation_5_5() {
        return sfiLogoUseMotivation_5_5;
    }

    public void setSfiLogoUseMotivation_5_5(Integer sfiLogoUseMotivation_5_5) {
        this.sfiLogoUseMotivation_5_5 = sfiLogoUseMotivation_5_5;
    }

    public Integer getSfiLogoUseMotivation_5_6() {
        return sfiLogoUseMotivation_5_6;
    }

    public void setSfiLogoUseMotivation_5_6(Integer sfiLogoUseMotivation_5_6) {
        this.sfiLogoUseMotivation_5_6 = sfiLogoUseMotivation_5_6;
    }

    public Integer getSfiLogoUseMotivation_5_7() {
        return sfiLogoUseMotivation_5_7;
    }

    public void setSfiLogoUseMotivation_5_7(Integer sfiLogoUseMotivation_5_7) {
        this.sfiLogoUseMotivation_5_7 = sfiLogoUseMotivation_5_7;
    }

    public Integer getSfiLogoUseMotivation_5_8() {
        return sfiLogoUseMotivation_5_8;
    }

    public void setSfiLogoUseMotivation_5_8(Integer sfiLogoUseMotivation_5_8) {
        this.sfiLogoUseMotivation_5_8 = sfiLogoUseMotivation_5_8;
    }

    public Integer getSfiLogoUseMotivation_5_9() {
        return sfiLogoUseMotivation_5_9;
    }

    public void setSfiLogoUseMotivation_5_9(Integer sfiLogoUseMotivation_5_9) {
        this.sfiLogoUseMotivation_5_9 = sfiLogoUseMotivation_5_9;
    }

    public Integer getSfiLogoUseMotivation_5_10() {
        return sfiLogoUseMotivation_5_10;
    }

    public void setSfiLogoUseMotivation_5_10(Integer sfiLogoUseMotivation_5_10) {
        this.sfiLogoUseMotivation_5_10 = sfiLogoUseMotivation_5_10;
    }

    public Integer getSfiLogoUseMotivation_5_11() {
        return sfiLogoUseMotivation_5_11;
    }

    public void setSfiLogoUseMotivation_5_11(Integer sfiLogoUseMotivation_5_11) {
        this.sfiLogoUseMotivation_5_11 = sfiLogoUseMotivation_5_11;
    }

    public Integer getSfiLogoUseMotivation_6_1() {
        return sfiLogoUseMotivation_6_1;
    }

    public void setSfiLogoUseMotivation_6_1(Integer sfiLogoUseMotivation_6_1) {
        this.sfiLogoUseMotivation_6_1 = sfiLogoUseMotivation_6_1;
    }

    public Integer getSfiLogoUseMotivation_6_2() {
        return sfiLogoUseMotivation_6_2;
    }

    public void setSfiLogoUseMotivation_6_2(Integer sfiLogoUseMotivation_6_2) {
        this.sfiLogoUseMotivation_6_2 = sfiLogoUseMotivation_6_2;
    }

    public Integer getSfiLogoUseMotivation_6_3() {
        return sfiLogoUseMotivation_6_3;
    }

    public void setSfiLogoUseMotivation_6_3(Integer sfiLogoUseMotivation_6_3) {
        this.sfiLogoUseMotivation_6_3 = sfiLogoUseMotivation_6_3;
    }

    public Integer getSfiLogoUseMotivation_6_4() {
        return sfiLogoUseMotivation_6_4;
    }

    public void setSfiLogoUseMotivation_6_4(Integer sfiLogoUseMotivation_6_4) {
        this.sfiLogoUseMotivation_6_4 = sfiLogoUseMotivation_6_4;
    }

    public Integer getSfiLogoUseMotivation_6_5() {
        return sfiLogoUseMotivation_6_5;
    }

    public void setSfiLogoUseMotivation_6_5(Integer sfiLogoUseMotivation_6_5) {
        this.sfiLogoUseMotivation_6_5 = sfiLogoUseMotivation_6_5;
    }

    public Integer getSfiLogoUseMotivation_6_6() {
        return sfiLogoUseMotivation_6_6;
    }

    public void setSfiLogoUseMotivation_6_6(Integer sfiLogoUseMotivation_6_6) {
        this.sfiLogoUseMotivation_6_6 = sfiLogoUseMotivation_6_6;
    }

    public Integer getSfiLogoUseMotivation_6_7() {
        return sfiLogoUseMotivation_6_7;
    }

    public void setSfiLogoUseMotivation_6_7(Integer sfiLogoUseMotivation_6_7) {
        this.sfiLogoUseMotivation_6_7 = sfiLogoUseMotivation_6_7;
    }

    public Integer getSfiLogoUseMotivation_6_8() {
        return sfiLogoUseMotivation_6_8;
    }

    public void setSfiLogoUseMotivation_6_8(Integer sfiLogoUseMotivation_6_8) {
        this.sfiLogoUseMotivation_6_8 = sfiLogoUseMotivation_6_8;
    }

    public Integer getSfiLogoUseMotivation_6_9() {
        return sfiLogoUseMotivation_6_9;
    }

    public void setSfiLogoUseMotivation_6_9(Integer sfiLogoUseMotivation_6_9) {
        this.sfiLogoUseMotivation_6_9 = sfiLogoUseMotivation_6_9;
    }

    public Integer getSfiLogoUseMotivation_6_10() {
        return sfiLogoUseMotivation_6_10;
    }

    public void setSfiLogoUseMotivation_6_10(Integer sfiLogoUseMotivation_6_10) {
        this.sfiLogoUseMotivation_6_10 = sfiLogoUseMotivation_6_10;
    }

    public Integer getSfiLogoUseMotivation_6_11() {
        return sfiLogoUseMotivation_6_11;
    }

    public void setSfiLogoUseMotivation_6_11(Integer sfiLogoUseMotivation_6_11) {
        this.sfiLogoUseMotivation_6_11 = sfiLogoUseMotivation_6_11;
    }

    public Integer getSfiLogoUseMotivation_7_1() {
        return sfiLogoUseMotivation_7_1;
    }

    public void setSfiLogoUseMotivation_7_1(Integer sfiLogoUseMotivation_7_1) {
        this.sfiLogoUseMotivation_7_1 = sfiLogoUseMotivation_7_1;
    }

    public Integer getSfiLogoUseMotivation_7_2() {
        return sfiLogoUseMotivation_7_2;
    }

    public void setSfiLogoUseMotivation_7_2(Integer sfiLogoUseMotivation_7_2) {
        this.sfiLogoUseMotivation_7_2 = sfiLogoUseMotivation_7_2;
    }

    public Integer getSfiLogoUseMotivation_7_3() {
        return sfiLogoUseMotivation_7_3;
    }

    public void setSfiLogoUseMotivation_7_3(Integer sfiLogoUseMotivation_7_3) {
        this.sfiLogoUseMotivation_7_3 = sfiLogoUseMotivation_7_3;
    }

    public Integer getSfiLogoUseMotivation_7_4() {
        return sfiLogoUseMotivation_7_4;
    }

    public void setSfiLogoUseMotivation_7_4(Integer sfiLogoUseMotivation_7_4) {
        this.sfiLogoUseMotivation_7_4 = sfiLogoUseMotivation_7_4;
    }

    public Integer getSfiLogoUseMotivation_7_5() {
        return sfiLogoUseMotivation_7_5;
    }

    public void setSfiLogoUseMotivation_7_5(Integer sfiLogoUseMotivation_7_5) {
        this.sfiLogoUseMotivation_7_5 = sfiLogoUseMotivation_7_5;
    }

    public Integer getSfiLogoUseMotivation_7_6() {
        return sfiLogoUseMotivation_7_6;
    }

    public void setSfiLogoUseMotivation_7_6(Integer sfiLogoUseMotivation_7_6) {
        this.sfiLogoUseMotivation_7_6 = sfiLogoUseMotivation_7_6;
    }

    public Integer getSfiLogoUseMotivation_7_7() {
        return sfiLogoUseMotivation_7_7;
    }

    public void setSfiLogoUseMotivation_7_7(Integer sfiLogoUseMotivation_7_7) {
        this.sfiLogoUseMotivation_7_7 = sfiLogoUseMotivation_7_7;
    }

    public Integer getSfiLogoUseMotivation_7_8() {
        return sfiLogoUseMotivation_7_8;
    }

    public void setSfiLogoUseMotivation_7_8(Integer sfiLogoUseMotivation_7_8) {
        this.sfiLogoUseMotivation_7_8 = sfiLogoUseMotivation_7_8;
    }

    public Integer getSfiLogoUseMotivation_7_9() {
        return sfiLogoUseMotivation_7_9;
    }

    public void setSfiLogoUseMotivation_7_9(Integer sfiLogoUseMotivation_7_9) {
        this.sfiLogoUseMotivation_7_9 = sfiLogoUseMotivation_7_9;
    }

    public Integer getSfiLogoUseMotivation_7_10() {
        return sfiLogoUseMotivation_7_10;
    }

    public void setSfiLogoUseMotivation_7_10(Integer sfiLogoUseMotivation_7_10) {
        this.sfiLogoUseMotivation_7_10 = sfiLogoUseMotivation_7_10;
    }

    public Integer getSfiLogoUseMotivation_7_11() {
        return sfiLogoUseMotivation_7_11;
    }

    public void setSfiLogoUseMotivation_7_11(Integer sfiLogoUseMotivation_7_11) {
        this.sfiLogoUseMotivation_7_11 = sfiLogoUseMotivation_7_11;
    }

    public Integer getSfiLogoUseMotivation_8_1() {
        return sfiLogoUseMotivation_8_1;
    }

    public void setSfiLogoUseMotivation_8_1(Integer sfiLogoUseMotivation_8_1) {
        this.sfiLogoUseMotivation_8_1 = sfiLogoUseMotivation_8_1;
    }

    public Integer getSfiLogoUseMotivation_8_2() {
        return sfiLogoUseMotivation_8_2;
    }

    public void setSfiLogoUseMotivation_8_2(Integer sfiLogoUseMotivation_8_2) {
        this.sfiLogoUseMotivation_8_2 = sfiLogoUseMotivation_8_2;
    }

    public Integer getSfiLogoUseMotivation_8_3() {
        return sfiLogoUseMotivation_8_3;
    }

    public void setSfiLogoUseMotivation_8_3(Integer sfiLogoUseMotivation_8_3) {
        this.sfiLogoUseMotivation_8_3 = sfiLogoUseMotivation_8_3;
    }

    public Integer getSfiLogoUseMotivation_8_4() {
        return sfiLogoUseMotivation_8_4;
    }

    public void setSfiLogoUseMotivation_8_4(Integer sfiLogoUseMotivation_8_4) {
        this.sfiLogoUseMotivation_8_4 = sfiLogoUseMotivation_8_4;
    }

    public Integer getSfiLogoUseMotivation_8_5() {
        return sfiLogoUseMotivation_8_5;
    }

    public void setSfiLogoUseMotivation_8_5(Integer sfiLogoUseMotivation_8_5) {
        this.sfiLogoUseMotivation_8_5 = sfiLogoUseMotivation_8_5;
    }

    public Integer getSfiLogoUseMotivation_8_6() {
        return sfiLogoUseMotivation_8_6;
    }

    public void setSfiLogoUseMotivation_8_6(Integer sfiLogoUseMotivation_8_6) {
        this.sfiLogoUseMotivation_8_6 = sfiLogoUseMotivation_8_6;
    }

    public Integer getSfiLogoUseMotivation_8_7() {
        return sfiLogoUseMotivation_8_7;
    }

    public void setSfiLogoUseMotivation_8_7(Integer sfiLogoUseMotivation_8_7) {
        this.sfiLogoUseMotivation_8_7 = sfiLogoUseMotivation_8_7;
    }

    public Integer getSfiLogoUseMotivation_8_8() {
        return sfiLogoUseMotivation_8_8;
    }

    public void setSfiLogoUseMotivation_8_8(Integer sfiLogoUseMotivation_8_8) {
        this.sfiLogoUseMotivation_8_8 = sfiLogoUseMotivation_8_8;
    }

    public Integer getSfiLogoUseMotivation_8_9() {
        return sfiLogoUseMotivation_8_9;
    }

    public void setSfiLogoUseMotivation_8_9(Integer sfiLogoUseMotivation_8_9) {
        this.sfiLogoUseMotivation_8_9 = sfiLogoUseMotivation_8_9;
    }

    public Integer getSfiLogoUseMotivation_8_10() {
        return sfiLogoUseMotivation_8_10;
    }

    public void setSfiLogoUseMotivation_8_10(Integer sfiLogoUseMotivation_8_10) {
        this.sfiLogoUseMotivation_8_10 = sfiLogoUseMotivation_8_10;
    }

    public Integer getSfiLogoUseMotivation_8_11() {
        return sfiLogoUseMotivation_8_11;
    }

    public void setSfiLogoUseMotivation_8_11(Integer sfiLogoUseMotivation_8_11) {
        this.sfiLogoUseMotivation_8_11 = sfiLogoUseMotivation_8_11;
    }

    public Integer getSfiLogoUseMotivation_9_1() {
        return sfiLogoUseMotivation_9_1;
    }

    public void setSfiLogoUseMotivation_9_1(Integer sfiLogoUseMotivation_9_1) {
        this.sfiLogoUseMotivation_9_1 = sfiLogoUseMotivation_9_1;
    }

    public Integer getSfiLogoUseMotivation_9_2() {
        return sfiLogoUseMotivation_9_2;
    }

    public void setSfiLogoUseMotivation_9_2(Integer sfiLogoUseMotivation_9_2) {
        this.sfiLogoUseMotivation_9_2 = sfiLogoUseMotivation_9_2;
    }

    public Integer getSfiLogoUseMotivation_9_3() {
        return sfiLogoUseMotivation_9_3;
    }

    public void setSfiLogoUseMotivation_9_3(Integer sfiLogoUseMotivation_9_3) {
        this.sfiLogoUseMotivation_9_3 = sfiLogoUseMotivation_9_3;
    }

    public Integer getSfiLogoUseMotivation_9_4() {
        return sfiLogoUseMotivation_9_4;
    }

    public void setSfiLogoUseMotivation_9_4(Integer sfiLogoUseMotivation_9_4) {
        this.sfiLogoUseMotivation_9_4 = sfiLogoUseMotivation_9_4;
    }

    public Integer getSfiLogoUseMotivation_9_5() {
        return sfiLogoUseMotivation_9_5;
    }

    public void setSfiLogoUseMotivation_9_5(Integer sfiLogoUseMotivation_9_5) {
        this.sfiLogoUseMotivation_9_5 = sfiLogoUseMotivation_9_5;
    }

    public Integer getSfiLogoUseMotivation_9_6() {
        return sfiLogoUseMotivation_9_6;
    }

    public void setSfiLogoUseMotivation_9_6(Integer sfiLogoUseMotivation_9_6) {
        this.sfiLogoUseMotivation_9_6 = sfiLogoUseMotivation_9_6;
    }

    public Integer getSfiLogoUseMotivation_9_7() {
        return sfiLogoUseMotivation_9_7;
    }

    public void setSfiLogoUseMotivation_9_7(Integer sfiLogoUseMotivation_9_7) {
        this.sfiLogoUseMotivation_9_7 = sfiLogoUseMotivation_9_7;
    }

    public Integer getSfiLogoUseMotivation_9_8() {
        return sfiLogoUseMotivation_9_8;
    }

    public void setSfiLogoUseMotivation_9_8(Integer sfiLogoUseMotivation_9_8) {
        this.sfiLogoUseMotivation_9_8 = sfiLogoUseMotivation_9_8;
    }

    public Integer getSfiLogoUseMotivation_9_9() {
        return sfiLogoUseMotivation_9_9;
    }

    public void setSfiLogoUseMotivation_9_9(Integer sfiLogoUseMotivation_9_9) {
        this.sfiLogoUseMotivation_9_9 = sfiLogoUseMotivation_9_9;
    }

    public Integer getSfiLogoUseMotivation_9_10() {
        return sfiLogoUseMotivation_9_10;
    }

    public void setSfiLogoUseMotivation_9_10(Integer sfiLogoUseMotivation_9_10) {
        this.sfiLogoUseMotivation_9_10 = sfiLogoUseMotivation_9_10;
    }

    public Integer getSfiLogoUseMotivation_9_11() {
        return sfiLogoUseMotivation_9_11;
    }

    public void setSfiLogoUseMotivation_9_11(Integer sfiLogoUseMotivation_9_11) {
        this.sfiLogoUseMotivation_9_11 = sfiLogoUseMotivation_9_11;
    }

    public Integer getSfiLogoUseMotivation_10_1() {
        return sfiLogoUseMotivation_10_1;
    }

    public void setSfiLogoUseMotivation_10_1(Integer sfiLogoUseMotivation_10_1) {
        this.sfiLogoUseMotivation_10_1 = sfiLogoUseMotivation_10_1;
    }

    public Integer getSfiLogoUseMotivation_10_2() {
        return sfiLogoUseMotivation_10_2;
    }

    public void setSfiLogoUseMotivation_10_2(Integer sfiLogoUseMotivation_10_2) {
        this.sfiLogoUseMotivation_10_2 = sfiLogoUseMotivation_10_2;
    }

    public Integer getSfiLogoUseMotivation_10_3() {
        return sfiLogoUseMotivation_10_3;
    }

    public void setSfiLogoUseMotivation_10_3(Integer sfiLogoUseMotivation_10_3) {
        this.sfiLogoUseMotivation_10_3 = sfiLogoUseMotivation_10_3;
    }

    public Integer getSfiLogoUseMotivation_10_4() {
        return sfiLogoUseMotivation_10_4;
    }

    public void setSfiLogoUseMotivation_10_4(Integer sfiLogoUseMotivation_10_4) {
        this.sfiLogoUseMotivation_10_4 = sfiLogoUseMotivation_10_4;
    }

    public Integer getSfiLogoUseMotivation_10_5() {
        return sfiLogoUseMotivation_10_5;
    }

    public void setSfiLogoUseMotivation_10_5(Integer sfiLogoUseMotivation_10_5) {
        this.sfiLogoUseMotivation_10_5 = sfiLogoUseMotivation_10_5;
    }

    public Integer getSfiLogoUseMotivation_10_6() {
        return sfiLogoUseMotivation_10_6;
    }

    public void setSfiLogoUseMotivation_10_6(Integer sfiLogoUseMotivation_10_6) {
        this.sfiLogoUseMotivation_10_6 = sfiLogoUseMotivation_10_6;
    }

    public Integer getSfiLogoUseMotivation_10_7() {
        return sfiLogoUseMotivation_10_7;
    }

    public void setSfiLogoUseMotivation_10_7(Integer sfiLogoUseMotivation_10_7) {
        this.sfiLogoUseMotivation_10_7 = sfiLogoUseMotivation_10_7;
    }

    public Integer getSfiLogoUseMotivation_10_8() {
        return sfiLogoUseMotivation_10_8;
    }

    public void setSfiLogoUseMotivation_10_8(Integer sfiLogoUseMotivation_10_8) {
        this.sfiLogoUseMotivation_10_8 = sfiLogoUseMotivation_10_8;
    }

    public Integer getSfiLogoUseMotivation_10_9() {
        return sfiLogoUseMotivation_10_9;
    }

    public void setSfiLogoUseMotivation_10_9(Integer sfiLogoUseMotivation_10_9) {
        this.sfiLogoUseMotivation_10_9 = sfiLogoUseMotivation_10_9;
    }

    public Integer getSfiLogoUseMotivation_10_10() {
        return sfiLogoUseMotivation_10_10;
    }

    public void setSfiLogoUseMotivation_10_10(Integer sfiLogoUseMotivation_10_10) {
        this.sfiLogoUseMotivation_10_10 = sfiLogoUseMotivation_10_10;
    }

    public Integer getSfiLogoUseMotivation_10_11() {
        return sfiLogoUseMotivation_10_11;
    }

    public void setSfiLogoUseMotivation_10_11(Integer sfiLogoUseMotivation_10_11) {
        this.sfiLogoUseMotivation_10_11 = sfiLogoUseMotivation_10_11;
    }

    public Integer getSfiLogoUseMotivation_11_1() {
        return sfiLogoUseMotivation_11_1;
    }

    public void setSfiLogoUseMotivation_11_1(Integer sfiLogoUseMotivation_11_1) {
        this.sfiLogoUseMotivation_11_1 = sfiLogoUseMotivation_11_1;
    }

    public Integer getSfiLogoUseMotivation_11_2() {
        return sfiLogoUseMotivation_11_2;
    }

    public void setSfiLogoUseMotivation_11_2(Integer sfiLogoUseMotivation_11_2) {
        this.sfiLogoUseMotivation_11_2 = sfiLogoUseMotivation_11_2;
    }

    public Integer getSfiLogoUseMotivation_11_3() {
        return sfiLogoUseMotivation_11_3;
    }

    public void setSfiLogoUseMotivation_11_3(Integer sfiLogoUseMotivation_11_3) {
        this.sfiLogoUseMotivation_11_3 = sfiLogoUseMotivation_11_3;
    }

    public Integer getSfiLogoUseMotivation_11_4() {
        return sfiLogoUseMotivation_11_4;
    }

    public void setSfiLogoUseMotivation_11_4(Integer sfiLogoUseMotivation_11_4) {
        this.sfiLogoUseMotivation_11_4 = sfiLogoUseMotivation_11_4;
    }

    public Integer getSfiLogoUseMotivation_11_5() {
        return sfiLogoUseMotivation_11_5;
    }

    public void setSfiLogoUseMotivation_11_5(Integer sfiLogoUseMotivation_11_5) {
        this.sfiLogoUseMotivation_11_5 = sfiLogoUseMotivation_11_5;
    }

    public Integer getSfiLogoUseMotivation_11_6() {
        return sfiLogoUseMotivation_11_6;
    }

    public void setSfiLogoUseMotivation_11_6(Integer sfiLogoUseMotivation_11_6) {
        this.sfiLogoUseMotivation_11_6 = sfiLogoUseMotivation_11_6;
    }

    public Integer getSfiLogoUseMotivation_11_7() {
        return sfiLogoUseMotivation_11_7;
    }

    public void setSfiLogoUseMotivation_11_7(Integer sfiLogoUseMotivation_11_7) {
        this.sfiLogoUseMotivation_11_7 = sfiLogoUseMotivation_11_7;
    }

    public Integer getSfiLogoUseMotivation_11_8() {
        return sfiLogoUseMotivation_11_8;
    }

    public void setSfiLogoUseMotivation_11_8(Integer sfiLogoUseMotivation_11_8) {
        this.sfiLogoUseMotivation_11_8 = sfiLogoUseMotivation_11_8;
    }

    public Integer getSfiLogoUseMotivation_11_9() {
        return sfiLogoUseMotivation_11_9;
    }

    public void setSfiLogoUseMotivation_11_9(Integer sfiLogoUseMotivation_11_9) {
        this.sfiLogoUseMotivation_11_9 = sfiLogoUseMotivation_11_9;
    }

    public Integer getSfiLogoUseMotivation_11_10() {
        return sfiLogoUseMotivation_11_10;
    }

    public void setSfiLogoUseMotivation_11_10(Integer sfiLogoUseMotivation_11_10) {
        this.sfiLogoUseMotivation_11_10 = sfiLogoUseMotivation_11_10;
    }

    public Integer getSfiLogoUseMotivation_11_11() {
        return sfiLogoUseMotivation_11_11;
    }

    public void setSfiLogoUseMotivation_11_11(Integer sfiLogoUseMotivation_11_11) {
        this.sfiLogoUseMotivation_11_11 = sfiLogoUseMotivation_11_11;
    }

    public Integer getSfiLogoUseMotivation_12_1() {
        return sfiLogoUseMotivation_12_1;
    }

    public void setSfiLogoUseMotivation_12_1(Integer sfiLogoUseMotivation_12_1) {
        this.sfiLogoUseMotivation_12_1 = sfiLogoUseMotivation_12_1;
    }

    public Integer getSfiLogoUseMotivation_12_2() {
        return sfiLogoUseMotivation_12_2;
    }

    public void setSfiLogoUseMotivation_12_2(Integer sfiLogoUseMotivation_12_2) {
        this.sfiLogoUseMotivation_12_2 = sfiLogoUseMotivation_12_2;
    }

    public Integer getSfiLogoUseMotivation_12_3() {
        return sfiLogoUseMotivation_12_3;
    }

    public void setSfiLogoUseMotivation_12_3(Integer sfiLogoUseMotivation_12_3) {
        this.sfiLogoUseMotivation_12_3 = sfiLogoUseMotivation_12_3;
    }

    public Integer getSfiLogoUseMotivation_12_4() {
        return sfiLogoUseMotivation_12_4;
    }

    public void setSfiLogoUseMotivation_12_4(Integer sfiLogoUseMotivation_12_4) {
        this.sfiLogoUseMotivation_12_4 = sfiLogoUseMotivation_12_4;
    }

    public Integer getSfiLogoUseMotivation_12_5() {
        return sfiLogoUseMotivation_12_5;
    }

    public void setSfiLogoUseMotivation_12_5(Integer sfiLogoUseMotivation_12_5) {
        this.sfiLogoUseMotivation_12_5 = sfiLogoUseMotivation_12_5;
    }

    public Integer getSfiLogoUseMotivation_12_6() {
        return sfiLogoUseMotivation_12_6;
    }

    public void setSfiLogoUseMotivation_12_6(Integer sfiLogoUseMotivation_12_6) {
        this.sfiLogoUseMotivation_12_6 = sfiLogoUseMotivation_12_6;
    }

    public Integer getSfiLogoUseMotivation_12_7() {
        return sfiLogoUseMotivation_12_7;
    }

    public void setSfiLogoUseMotivation_12_7(Integer sfiLogoUseMotivation_12_7) {
        this.sfiLogoUseMotivation_12_7 = sfiLogoUseMotivation_12_7;
    }

    public Integer getSfiLogoUseMotivation_12_8() {
        return sfiLogoUseMotivation_12_8;
    }

    public void setSfiLogoUseMotivation_12_8(Integer sfiLogoUseMotivation_12_8) {
        this.sfiLogoUseMotivation_12_8 = sfiLogoUseMotivation_12_8;
    }

    public Integer getSfiLogoUseMotivation_12_9() {
        return sfiLogoUseMotivation_12_9;
    }

    public void setSfiLogoUseMotivation_12_9(Integer sfiLogoUseMotivation_12_9) {
        this.sfiLogoUseMotivation_12_9 = sfiLogoUseMotivation_12_9;
    }

    public Integer getSfiLogoUseMotivation_12_10() {
        return sfiLogoUseMotivation_12_10;
    }

    public void setSfiLogoUseMotivation_12_10(Integer sfiLogoUseMotivation_12_10) {
        this.sfiLogoUseMotivation_12_10 = sfiLogoUseMotivation_12_10;
    }

    public Integer getSfiLogoUseMotivation_12_11() {
        return sfiLogoUseMotivation_12_11;
    }

    public void setSfiLogoUseMotivation_12_11(Integer sfiLogoUseMotivation_12_11) {
        this.sfiLogoUseMotivation_12_11 = sfiLogoUseMotivation_12_11;
    }

    public Integer getSfiLogoUseMotivation_13_1() {
        return sfiLogoUseMotivation_13_1;
    }

    public void setSfiLogoUseMotivation_13_1(Integer sfiLogoUseMotivation_13_1) {
        this.sfiLogoUseMotivation_13_1 = sfiLogoUseMotivation_13_1;
    }

    public Integer getSfiLogoUseMotivation_13_2() {
        return sfiLogoUseMotivation_13_2;
    }

    public void setSfiLogoUseMotivation_13_2(Integer sfiLogoUseMotivation_13_2) {
        this.sfiLogoUseMotivation_13_2 = sfiLogoUseMotivation_13_2;
    }

    public Integer getSfiLogoUseMotivation_13_3() {
        return sfiLogoUseMotivation_13_3;
    }

    public void setSfiLogoUseMotivation_13_3(Integer sfiLogoUseMotivation_13_3) {
        this.sfiLogoUseMotivation_13_3 = sfiLogoUseMotivation_13_3;
    }

    public Integer getSfiLogoUseMotivation_13_4() {
        return sfiLogoUseMotivation_13_4;
    }

    public void setSfiLogoUseMotivation_13_4(Integer sfiLogoUseMotivation_13_4) {
        this.sfiLogoUseMotivation_13_4 = sfiLogoUseMotivation_13_4;
    }

    public Integer getSfiLogoUseMotivation_13_5() {
        return sfiLogoUseMotivation_13_5;
    }

    public void setSfiLogoUseMotivation_13_5(Integer sfiLogoUseMotivation_13_5) {
        this.sfiLogoUseMotivation_13_5 = sfiLogoUseMotivation_13_5;
    }

    public Integer getSfiLogoUseMotivation_13_6() {
        return sfiLogoUseMotivation_13_6;
    }

    public void setSfiLogoUseMotivation_13_6(Integer sfiLogoUseMotivation_13_6) {
        this.sfiLogoUseMotivation_13_6 = sfiLogoUseMotivation_13_6;
    }

    public Integer getSfiLogoUseMotivation_13_7() {
        return sfiLogoUseMotivation_13_7;
    }

    public void setSfiLogoUseMotivation_13_7(Integer sfiLogoUseMotivation_13_7) {
        this.sfiLogoUseMotivation_13_7 = sfiLogoUseMotivation_13_7;
    }

    public Integer getSfiLogoUseMotivation_13_8() {
        return sfiLogoUseMotivation_13_8;
    }

    public void setSfiLogoUseMotivation_13_8(Integer sfiLogoUseMotivation_13_8) {
        this.sfiLogoUseMotivation_13_8 = sfiLogoUseMotivation_13_8;
    }

    public Integer getSfiLogoUseMotivation_13_9() {
        return sfiLogoUseMotivation_13_9;
    }

    public void setSfiLogoUseMotivation_13_9(Integer sfiLogoUseMotivation_13_9) {
        this.sfiLogoUseMotivation_13_9 = sfiLogoUseMotivation_13_9;
    }

    public Integer getSfiLogoUseMotivation_13_10() {
        return sfiLogoUseMotivation_13_10;
    }

    public void setSfiLogoUseMotivation_13_10(Integer sfiLogoUseMotivation_13_10) {
        this.sfiLogoUseMotivation_13_10 = sfiLogoUseMotivation_13_10;
    }

    public Integer getSfiLogoUseMotivation_13_11() {
        return sfiLogoUseMotivation_13_11;
    }

    public void setSfiLogoUseMotivation_13_11(Integer sfiLogoUseMotivation_13_11) {
        this.sfiLogoUseMotivation_13_11 = sfiLogoUseMotivation_13_11;
    }
}

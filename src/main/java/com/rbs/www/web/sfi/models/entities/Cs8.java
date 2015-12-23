package com.rbs.www.web.sfi.models.entities;

import com.rbs.www.common.models.BaseEntityModel;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sfi_pp_forms")
public class Cs8 extends BaseEntityModel {
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

    @Column(name = "cs8_fscCocCertificationItems_1", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> fscCocCertificationItems_1;

    @Column(name = "cs8_fscForestCertificationItems_1", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> fscForestCertificationItems_1;

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

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductSellCountry_9",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductSellCountry_9;

    @Column(name = "cs8_alsoFSCLabel_10", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> alsoFSCLabel_10;

    @Column(name = "cs8_alsoFSCLabel_11", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> alsoFSCLabel_11;

    @Column(name = "cs8_alsoFSCLabel_12", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> alsoFSCLabel_12;

    @Column(name = "cs8_alsoFSCLabel_13", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> alsoFSCLabel_13;

    @Column(name = "cs8_alsoFSCLabel_1", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> alsoFSCLabel_1;

    @Column(name = "cs8_alsoFSCLabel_2", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> alsoFSCLabel_2;

    @Column(name = "cs8_alsoFSCLabel_3", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> alsoFSCLabel_3;

    @Column(name = "cs8_alsoFSCLabel_4", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> alsoFSCLabel_4;

    @Column(name = "cs8_alsoFSCLabel_5", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> alsoFSCLabel_5;

    @Column(name = "cs8_alsoFSCLabel_6", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> alsoFSCLabel_6;

    @Column(name = "cs8_alsoFSCLabel_7", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> alsoFSCLabel_7;

    @Column(name = "cs8_alsoFSCLabel_8", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> alsoFSCLabel_8;

    @Column(name = "cs8_alsoFSCLabel_9", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> alsoFSCLabel_9;

    @Column(name = "cs8_sfiLabelProductGroupContain_10", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductGroupContain_10;

    @Column(name = "cs8_sfiLabelProductGroupContain_11", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductGroupContain_11;

    @Column(name = "cs8_sfiLabelProductGroupContain_12", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductGroupContain_12;

    @Column(name = "cs8_sfiLabelProductGroupContain_13", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductGroupContain_13;

    @Column(name = "cs8_sfiLabelProductGroupContain_1", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductGroupContain_1;

    @Column(name = "cs8_sfiLabelProductGroupContain_2", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductGroupContain_2;

    @Column(name = "cs8_sfiLabelProductGroupContain_3", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductGroupContain_3;

    @Column(name = "cs8_sfiLabelProductGroupContain_4", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductGroupContain_4;

    @Column(name = "cs8_sfiLabelProductGroupContain_5", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductGroupContain_5;

    @Column(name = "cs8_sfiLabelProductGroupContain_6", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductGroupContain_6;

    @Column(name = "cs8_sfiLabelProductGroupContain_7", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductGroupContain_7;

    @Column(name = "cs8_sfiLabelProductGroupContain_8", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductGroupContain_8;

    @Column(name = "cs8_sfiLabelProductGroupContain_9", nullable = true)
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


    @Column(name = "cs8_ChainOfCustody_FSCCertification", nullable = true)
    private String ChainOfCustody_FSCCertification;

    @Column(name = "cs8_demandDeveloping_10", nullable = true)
    private String demandDeveloping_10;

    @Column(name = "cs8_demandDeveloping_11", nullable = true)
    private String demandDeveloping_11;

    @Column(name = "cs8_demandDeveloping_12", nullable = true)
    private String demandDeveloping_12;

    @Column(name = "cs8_demandDeveloping_13", nullable = true)
    private String demandDeveloping_13;

    @Column(name = "cs8_demandDeveloping_1", nullable = true)
    private String demandDeveloping_1;

    @Column(name = "cs8_demandDeveloping_2", nullable = true)
    private String demandDeveloping_2;

    @Column(name = "cs8_demandDeveloping_3", nullable = true)
    private String demandDeveloping_3;

    @Column(name = "cs8_demandDeveloping_4", nullable = true)
    private String demandDeveloping_4;

    @Column(name = "cs8_demandDeveloping_5", nullable = true)
    private String demandDeveloping_5;

    @Column(name = "cs8_demandDeveloping_6", nullable = true)
    private String demandDeveloping_6;

    @Column(name = "cs8_demandDeveloping_7", nullable = true)
    private String demandDeveloping_7;

    @Column(name = "cs8_demandDeveloping_8", nullable = true)
    private String demandDeveloping_8;

    @Column(name = "cs8_demandDeveloping_9", nullable = true)
    private String demandDeveloping_9;

    @Column(name = "cs8_demandSfiSourcing_10", nullable = true)
    private String demandSfiSourcing_10;

    @Column(name = "cs8_demandSfiSourcing_11", nullable = true)
    private String demandSfiSourcing_11;

    @Column(name = "cs8_demandSfiSourcing_12", nullable = true)
    private String demandSfiSourcing_12;

    @Column(name = "cs8_demandSfiSourcing_13", nullable = true)
    private String demandSfiSourcing_13;

    @Column(name = "cs8_demandSfiSourcing_1", nullable = true)
    private String demandSfiSourcing_1;

    @Column(name = "cs8_demandSfiSourcing_2", nullable = true)
    private String demandSfiSourcing_2;

    @Column(name = "cs8_demandSfiSourcing_3", nullable = true)
    private String demandSfiSourcing_3;

    @Column(name = "cs8_demandSfiSourcing_4", nullable = true)
    private String demandSfiSourcing_4;

    @Column(name = "cs8_demandSfiSourcing_5", nullable = true)
    private String demandSfiSourcing_5;

    @Column(name = "cs8_demandSfiSourcing_6", nullable = true)
    private String demandSfiSourcing_6;

    @Column(name = "cs8_demandSfiSourcing_7", nullable = true)
    private String demandSfiSourcing_7;

    @Column(name = "cs8_demandSfiSourcing_8", nullable = true)
    private String demandSfiSourcing_8;

    @Column(name = "cs8_demandSfiSourcing_9", nullable = true)
    private String demandSfiSourcing_9;

    @Column(name = "cs8_fscCocCertification", nullable = true)
    private String fscCocCertification;

    @Column(name = "cs8_fscCocCertificationExplain", nullable = true)
    private String fscCocCertificationExplain;

    @Column(name = "cs8_fscCocCertificationItemsWhy_1", nullable = true)
    private String fscCocCertificationItemsWhy_1;

    @Column(name = "cs8_fscForestCertification", nullable = true)
    private String fscForestCertification;

    @Column(name = "cs8_fscForestCertificationExplain", nullable = true)
    private String fscForestCertificationExplain;

    @Column(name = "cs8_fscForestCertificationWhy_1", nullable = true)
    private String fscForestCertificationWhy_1;

    @Column(name = "cs8_FSCLandCertification", nullable = true)
    private String FSCLandCertification;

    @Column(name = "cs8_pefcDemandDeveloping_10", nullable = true)
    private String pefcDemandDeveloping_10;

    @Column(name = "cs8_pefcDemandDeveloping_11", nullable = true)
    private String pefcDemandDeveloping_11;

    @Column(name = "cs8_pefcDemandDeveloping_12", nullable = true)
    private String pefcDemandDeveloping_12;

    @Column(name = "cs8_pefcDemandDeveloping_13", nullable = true)
    private String pefcDemandDeveloping_13;

    @Column(name = "cs8_pefcDemandDeveloping_1", nullable = true)
    private String pefcDemandDeveloping_1;

    @Column(name = "cs8_pefcDemandDeveloping_2", nullable = true)
    private String pefcDemandDeveloping_2;

    @Column(name = "cs8_pefcDemandDeveloping_3", nullable = true)
    private String pefcDemandDeveloping_3;

    @Column(name = "cs8_pefcDemandDeveloping_4", nullable = true)
    private String pefcDemandDeveloping_4;

    @Column(name = "cs8_pefcDemandDeveloping_5", nullable = true)
    private String pefcDemandDeveloping_5;

    @Column(name = "cs8_pefcDemandDeveloping_6", nullable = true)
    private String pefcDemandDeveloping_6;

    @Column(name = "cs8_pefcDemandDeveloping_7", nullable = true)
    private String pefcDemandDeveloping_7;

    @Column(name = "cs8_pefcDemandDeveloping_8", nullable = true)
    private String pefcDemandDeveloping_8;

    @Column(name = "cs8_pefcDemandDeveloping_9", nullable = true)
    private String pefcDemandDeveloping_9;

    @Column(name = "cs8_planSfiLabelUseComment10", nullable = true)
    private String planSfiLabelUseComment10;

    @Column(name = "cs8_planSfiLabelUseComment11", nullable = true)
    private String planSfiLabelUseComment11;

    @Column(name = "cs8_planSfiLabelUseComment12", nullable = true)
    private String planSfiLabelUseComment12;

    @Column(name = "cs8_planSfiLabelUseComment1", nullable = true)
    private String planSfiLabelUseComment1;

    @Column(name = "cs8_planSfiLabelUseComment2", nullable = true)
    private String planSfiLabelUseComment2;

    @Column(name = "cs8_planSfiLabelUseComment3", nullable = true)
    private String planSfiLabelUseComment3;

    @Column(name = "cs8_planSfiLabelUseComment4", nullable = true)
    private String planSfiLabelUseComment4;

    @Column(name = "cs8_planSfiLabelUseComment5", nullable = true)
    private String planSfiLabelUseComment5;

    @Column(name = "cs8_planSfiLabelUseComment6", nullable = true)
    private String planSfiLabelUseComment6;

    @Column(name = "cs8_planSfiLabelUseComment7", nullable = true)
    private String planSfiLabelUseComment7;

    @Column(name = "cs8_planSfiLabelUseComment8", nullable = true)
    private String planSfiLabelUseComment8;

    @Column(name = "cs8_planSfiLabelUseComment9", nullable = true)
    private String planSfiLabelUseComment9;

    @Column(name = "cs8_planSfiLabelUseIncrease10", nullable = true)
    private String planSfiLabelUseIncrease10;

    @Column(name = "cs8_planSfiLabelUseIncrease11", nullable = true)
    private String planSfiLabelUseIncrease11;

    @Column(name = "cs8_planSfiLabelUseIncrease12", nullable = true)
    private String planSfiLabelUseIncrease12;

    @Column(name = "cs8_planSfiLabelUseIncrease13", nullable = true)
    private String planSfiLabelUseIncrease13;

    @Column(name = "cs8_planSfiLabelUseIncrease1", nullable = true)
    private String planSfiLabelUseIncrease1;

    @Column(name = "cs8_planSfiLabelUseIncrease2", nullable = true)
    private String planSfiLabelUseIncrease2;

    @Column(name = "cs8_planSfiLabelUseIncrease3", nullable = true)
    private String planSfiLabelUseIncrease3;

    @Column(name = "cs8_planSfiLabelUseIncrease4", nullable = true)
    private String planSfiLabelUseIncrease4;

    @Column(name = "cs8_planSfiLabelUseIncrease5", nullable = true)
    private String planSfiLabelUseIncrease5;

    @Column(name = "cs8_planSfiLabelUseIncrease6", nullable = true)
    private String planSfiLabelUseIncrease6;

    @Column(name = "cs8_planSfiLabelUseIncrease7", nullable = true)
    private String planSfiLabelUseIncrease7;

    @Column(name = "cs8_planSfiLabelUseIncrease8", nullable = true)
    private String planSfiLabelUseIncrease8;

    @Column(name = "cs8_planSfiLabelUseIncrease9", nullable = true)
    private String planSfiLabelUseIncrease9;

    @Column(name = "cs8_requestWentMarketPerc10", nullable = true)
    private String requestWentMarketPerc10;

    @Column(name = "cs8_requestWentMarketPerc11", nullable = true)
    private String requestWentMarketPerc11;

    @Column(name = "cs8_requestWentMarketPerc12", nullable = true)
    private String requestWentMarketPerc12;

    @Column(name = "cs8_requestWentMarketPerc13", nullable = true)
    private String requestWentMarketPerc13;

    @Column(name = "cs8_requestWentMarketPerc1", nullable = true)
    private String requestWentMarketPerc1;

    @Column(name = "cs8_requestWentMarketPerc2", nullable = true)
    private String requestWentMarketPerc2;

    @Column(name = "cs8_requestWentMarketPerc3", nullable = true)
    private String requestWentMarketPerc3;

    @Column(name = "cs8_requestWentMarketPerc4", nullable = true)
    private String requestWentMarketPerc4;

    @Column(name = "cs8_requestWentMarketPerc5", nullable = true)
    private String requestWentMarketPerc5;

    @Column(name = "cs8_requestWentMarketPerc6", nullable = true)
    private String requestWentMarketPerc6;

    @Column(name = "cs8_requestWentMarketPerc7", nullable = true)
    private String requestWentMarketPerc7;

    @Column(name = "cs8_requestWentMarketPerc8", nullable = true)
    private String requestWentMarketPerc8;

    @Column(name = "cs8_requestWentMarketPerc9", nullable = true)
    private String requestWentMarketPerc9;

    @Column(name = "cs8_sfiDemandDeveloping_1", nullable = true)
    private String sfiDemandDeveloping_1;

    @Column(name = "cs8_sfiForestContentCoc_10", nullable = true)
    private String sfiForestContentCoc_10;

    @Column(name = "cs8_sfiForestContentCoc_11", nullable = true)
    private String sfiForestContentCoc_11;

    @Column(name = "cs8_sfiForestContentCoc_12", nullable = true)
    private String sfiForestContentCoc_12;

    @Column(name = "cs8_sfiForestContentCoc_13", nullable = true)
    private String sfiForestContentCoc_13;

    @Column(name = "cs8_sfiForestContentCoc_1", nullable = true)
    private String sfiForestContentCoc_1;

    @Column(name = "cs8_sfiForestContentCoc_2", nullable = true)
    private String sfiForestContentCoc_2;

    @Column(name = "cs8_sfiForestContentCoc_3", nullable = true)
    private String sfiForestContentCoc_3;

    @Column(name = "cs8_sfiForestContentCoc_4", nullable = true)
    private String sfiForestContentCoc_4;

    @Column(name = "cs8_sfiForestContentCoc_5", nullable = true)
    private String sfiForestContentCoc_5;

    @Column(name = "cs8_sfiForestContentCoc_6", nullable = true)
    private String sfiForestContentCoc_6;

    @Column(name = "cs8_sfiForestContentCoc_7", nullable = true)
    private String sfiForestContentCoc_7;

    @Column(name = "cs8_sfiForestContentCoc_8", nullable = true)
    private String sfiForestContentCoc_8;

    @Column(name = "cs8_sfiForestContentCoc_9", nullable = true)
    private String sfiForestContentCoc_9;

    @Column(name = "cs8_sfiLabelProductSell_explain_10", nullable = true)
    private String sfiLabelProductSell_explain_10;

    @Column(name = "cs8_sfiLabelProductSell_explain_11", nullable = true)
    private String sfiLabelProductSell_explain_11;

    @Column(name = "cs8_sfiLabelProductSell_explain_12", nullable = true)
    private String sfiLabelProductSell_explain_12;

    @Column(name = "cs8_sfiLabelProductSell_explain_13", nullable = true)
    private String sfiLabelProductSell_explain_13;

    @Column(name = "cs8_sfiLabelProductSell_explain_1", nullable = true)
    private String sfiLabelProductSell_explain_1;

    @Column(name = "cs8_sfiLabelProductSell_explain_2", nullable = true)
    private String sfiLabelProductSell_explain_2;

    @Column(name = "cs8_sfiLabelProductSell_explain_3", nullable = true)
    private String sfiLabelProductSell_explain_3;

    @Column(name = "cs8_sfiLabelProductSell_explain_4", nullable = true)
    private String sfiLabelProductSell_explain_4;

    @Column(name = "cs8_sfiLabelProductSell_explain_5", nullable = true)
    private String sfiLabelProductSell_explain_5;

    @Column(name = "cs8_sfiLabelProductSell_explain_6", nullable = true)
    private String sfiLabelProductSell_explain_6;

    @Column(name = "cs8_sfiLabelProductSell_explain_7", nullable = true)
    private String sfiLabelProductSell_explain_7;

    @Column(name = "cs8_sfiLabelProductSell_explain_8", nullable = true)
    private String sfiLabelProductSell_explain_8;

    @Column(name = "cs8_sfiLabelProductSell_explain_9", nullable = true)
    private String sfiLabelProductSell_explain_9;

    @Column(name = "cs8_whyChoseSFI10", nullable = true)
    private String whyChoseSFI10;

    @Column(name = "cs8_whyChoseSFI11", nullable = true)
    private String whyChoseSFI11;

    @Column(name = "cs8_whyChoseSFI12", nullable = true)
    private String whyChoseSFI12;

    @Column(name = "cs8_whyChoseSFI13", nullable = true)
    private String whyChoseSFI13;

    @Column(name = "cs8_whyChoseSFI14", nullable = true)
    private String whyChoseSFI14;

    @Column(name = "cs8_whyChoseSFI15", nullable = true)
    private String whyChoseSFI15;

    @Column(name = "cs8_whyChoseSFI16", nullable = true)
    private String whyChoseSFI16;

    @Column(name = "cs8_whyChoseSFI17", nullable = true)
    private String whyChoseSFI17;

    @Column(name = "cs8_whyChoseSFI18", nullable = true)
    private String whyChoseSFI18;

    @Column(name = "cs8_whyChoseSFI19", nullable = true)
    private String whyChoseSFI19;

    @Column(name = "cs8_whyChoseSFI1", nullable = true)
    private String whyChoseSFI1;

    @Column(name = "cs8_whyChoseSFI20", nullable = true)
    private String whyChoseSFI20;

    @Column(name = "cs8_whyChoseSFI21", nullable = true)
    private String whyChoseSFI21;

    @Column(name = "cs8_whyChoseSFI2", nullable = true)
    private String whyChoseSFI2;

    @Column(name = "cs8_whyChoseSFI3", nullable = true)
    private String whyChoseSFI3;

    @Column(name = "cs8_whyChoseSFI4", nullable = true)
    private String whyChoseSFI4;

    @Column(name = "cs8_whyChoseSFI5", nullable = true)
    private String whyChoseSFI5;

    @Column(name = "cs8_whyChoseSFI6", nullable = true)
    private String whyChoseSFI6;

    @Column(name = "cs8_whyChoseSFI7", nullable = true)
    private String whyChoseSFI7;

    @Column(name = "cs8_whyChoseSFI8", nullable = true)
    private String whyChoseSFI8;

    @Column(name = "cs8_whyChoseSFI9", nullable = true)
    private String whyChoseSFI9;
}

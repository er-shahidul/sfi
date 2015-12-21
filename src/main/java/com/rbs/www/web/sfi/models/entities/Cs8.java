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

    @Column(name = "cs8_productSegmentWoodProducts", nullable = true)
    private Boolean productSegmentWoodProducts;

    @Column(name = "cs8_productSegmentPrintingWritingPaper", nullable = true)
    private Boolean productSegmentPrintingWritingPaper;

    @Column(name = "cs8_productSegmentPackaging", nullable = true)
    private Boolean productSegmentPackaging;

    @Column(name = "cs8_productSegmentBioenergy", nullable = true)
    private Boolean productSegmentBioenergy;

    @Column(name = "cs8_productSegmentOther", nullable = true)
    private Boolean productSegmentOther;

    @Column(name = "cs8_productSegmentOtherExplain", nullable = true)
    private String productSegmentOtherExplain;

    @Column(name = "cs8_proofPoint", nullable = true)
    private String proofPoint;

    @Column(name = "cs8_enhancedCorporate", nullable = true)
    private String enhancedCorporate;

    @Column(name = "cs8_demonstrateOrganizationSustainability", nullable = true)
    private String demonstrateOrganizationSustainability;

    @Column(name = "cs8_demonstrateCustomerSustainability", nullable = true)
    private String demonstrateCustomerSustainability;

    @Column(name = "cs8_enhancedMarketing", nullable = true)
    private String enhancedMarketing;

    @Column(name = "cs8_alignmentLegal", nullable = true)
    private String alignmentLegal;

    @Column(name = "cs8_riskManagementTool", nullable = true)
    private String riskManagementTool;

    @Column(name = "cs8_toolToAddressPressures", nullable = true)
    private String toolToAddressPressures;

    @Column(name = "cs8_improve", nullable = true)
    private String improve;

    @Column(name = "cs8_productSegmentTowelTissue", nullable = true)
    private Boolean productSegmentTowelTissue;

    @Column(name = "cs8_deforestationConcerns", nullable = true)
    private Boolean deforestationConcerns;

    @Column(name = "cs8_deforestationConcerns_data", nullable = true)
    private Boolean deforestationConcernsData;

    @Column(name = "cs8_deforestationConcerns_data_explain", nullable = true)
    private String deforestationConcernsDataExplain;

    @Column(name = "cs8_deforestationConcerns_reports", nullable = true)
    private Boolean deforestationConcernsReports;

    @Column(name = "cs8_deforestationConcerns_reports_explain", nullable = true)
    private String deforestationConcernsReportsExplain;

    @Column(name = "cs8_deforestationConcerns_studies", nullable = true)
    private Boolean deforestationConcernsStudies;

    @Column(name = "cs8_deforestationConcerns_studies_explain", nullable = true)
    private String deforestationConcernsStudiesExplain;

    @Column(name = "cs8_deforestationConcerns_other", nullable = true)
    private Boolean deforestationConcernsOther;

    @Column(name = "cs8_deforestationConcerns_other_explain", nullable = true)
    private String deforestationConcernsOtherExplain;

    @Column(name = "cs8_demandDeveloping_1", nullable = true)
    private String demandDeveloping1;

    @Column(name = "cs8_demandDeveloping_2", nullable = true)
    private String demandDeveloping2;

    @Column(name = "cs8_demandDeveloping_3", nullable = true)
    private String demandDeveloping3;

    @Column(name = "cs8_demandDeveloping_4", nullable = true)
    private String demandDeveloping4;

    @Column(name = "cs8_demandDeveloping_5", nullable = true)
    private String demandDeveloping5;

    @Column(name = "cs8_demandDeveloping_6", nullable = true)
    private String demandDeveloping6;

    @Column(name = "cs8_demandDeveloping_why_1", nullable = true)
    private String demandDevelopingWhy1;

    @Column(name = "cs8_demandDeveloping_why_2", nullable = true)
    private String demandDevelopingWhy2;

    @Column(name = "cs8_demandDeveloping_why_3", nullable = true)
    private String demandDevelopingWhy3;

    @Column(name = "cs8_demandDeveloping_why_4", nullable = true)
    private String demandDevelopingWhy4;

    @Column(name = "cs8_demandDeveloping_why_5", nullable = true)
    private String demandDevelopingWhy5;

    @Column(name = "cs8_demandDeveloping_why_6", nullable = true)
    private String demandDevelopingWhy6;

    @Column(name = "cs8_sfiLabelProductGroupContain_1", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductGroupContain1;

    @Column(name = "cs8_sfiLabelProductGroupContain_2", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductGroupContain2;

    @Column(name = "cs8_sfiLabelProductGroupContain_3", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductGroupContain3;

    @Column(name = "cs8_sfiLabelProductGroupContain_4", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductGroupContain4;

    @Column(name = "cs8_sfiLabelProductGroupContain_5", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductGroupContain5;

    @Column(name = "cs8_sfiLabelProductGroupContain_6", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> sfiLabelProductGroupContain6;

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

    @Column(name = "cs8_sfiCertifiedForestContent_1", nullable = true)
    private String sfiCertifiedForestContent1;

    @Column(name = "cs8_sfiCertifiedForestContent_2", nullable = true)
    private String sfiCertifiedForestContent2;

    @Column(name = "cs8_sfiCertifiedForestContent_3", nullable = true)
    private String sfiCertifiedForestContent3;

    @Column(name = "cs8_sfiCertifiedForestContent_4", nullable = true)
    private String sfiCertifiedForestContent4;

    @Column(name = "cs8_sfiCertifiedForestContent_5", nullable = true)
    private String sfiCertifiedForestContent5;

    @Column(name = "cs8_sfiCertifiedForestContent_6", nullable = true)
    private String sfiCertifiedForestContent6;

    @Column(name = "cs8_sfiCertifiedForestContent_why_1", nullable = true)
    private String sfiCertifiedForestContentWhy1;

    @Column(name = "cs8_sfiCertifiedForestContent_why_2", nullable = true)
    private String sfiCertifiedForestContentWhy2;

    @Column(name = "cs8_sfiCertifiedForestContent_why_3", nullable = true)
    private String sfiCertifiedForestContentWhy3;

    @Column(name = "cs8_sfiCertifiedForestContent_why_4", nullable = true)
    private String sfiCertifiedForestContentWhy4;

    @Column(name = "cs8_sfiCertifiedForestContent_why_5", nullable = true)
    private String sfiCertifiedForestContentWhy5;

    @Column(name = "cs8_sfiCertifiedForestContent_why_6", nullable = true)
    private String sfiCertifiedForestContentWhy6;

    @Column(name = "cs8_demandSFICertified_1", nullable = true)
    private String demandSFICertified1;

    @Column(name = "cs8_demandSFICertified_2", nullable = true)
    private String demandSFICertified2;

    @Column(name = "cs8_demandSFICertified_3", nullable = true)
    private String demandSFICertified3;

    @Column(name = "cs8_demandSFICertified_4", nullable = true)
    private String demandSFICertified4;

    @Column(name = "cs8_demandSFICertified_5", nullable = true)
    private String demandSFICertified5;

    @Column(name = "cs8_demandSFICertified_6", nullable = true)
    private String demandSFICertified6;

    @Column(name = "cs8_demandSFICertified_why_1", nullable = true)
    private String demandSFICertifiedWhy1;

    @Column(name = "cs8_demandSFICertified_why_2", nullable = true)
    private String demandSFICertifiedWhy2;

    @Column(name = "cs8_demandSFICertified_why_3", nullable = true)
    private String demandSFICertifiedWhy3;

    @Column(name = "cs8_demandSFICertified_why_4", nullable = true)
    private String demandSFICertifiedWhy4;

    @Column(name = "cs8_demandSFICertified_why_5", nullable = true)
    private String demandSFICertifiedWhy5;

    @Column(name = "cs8_demandSFICertified_why_6", nullable = true)
    private String demandSFICertifiedWhy6;

    @Column(name = "cs8_FSCCertification_1", nullable = true)
    private String fSCCertification1;

    @Column(name = "cs8_FSCCertification_2", nullable = true)
    private String fSCCertification2;

    @Column(name = "cs8_FSCCertification_3", nullable = true)
    private String fSCCertification3;

    @Column(name = "cs8_FSCCertification_4", nullable = true)
    private String fSCCertification4;

    @Column(name = "cs8_FSCCertification_5", nullable = true)
    private String fSCCertification5;

    @Column(name = "cs8_FSCCertification_6", nullable = true)
    private String fSCCertification6;

    @Column(name = "cs8_fscCertification_explain_1", nullable = true)
    private String fscCertificationExplain1;

    @Column(name = "cs8_fscCertification_explain_2", nullable = true)
    private String fscCertificationExplain2;

    @Column(name = "cs8_fscCertification_explain_3", nullable = true)
    private String fscCertificationExplain3;

    @Column(name = "cs8_fscCertification_explain_4", nullable = true)
    private String fscCertificationExplain4;

    @Column(name = "cs8_fscCertification_explain_5", nullable = true)
    private String fscCertificationExplain5;

    @Column(name = "cs8_fscCertification_explain_6", nullable = true)
    private String fscCertificationExplain6;

    @Column(name = "cs8_cost_1", nullable = true)
    private Boolean cost1;

    @Column(name = "cs8_cost_2", nullable = true)
    private Boolean cost2;

    @Column(name = "cs8_cost_3", nullable = true)
    private Boolean cost3;

    @Column(name = "cs8_cost_4", nullable = true)
    private Boolean cost4;

    @Column(name = "cs8_cost_5", nullable = true)
    private Boolean cost5;

    @Column(name = "cs8_cost_6", nullable = true)
    private Boolean cost6;

    @Column(name = "cs8_lackOfResponsiveness_1", nullable = true)
    private Boolean lackOfResponsiveness1;

    @Column(name = "cs8_lackOfResponsiveness_2", nullable = true)
    private Boolean lackOfResponsiveness2;

    @Column(name = "cs8_lackOfResponsiveness_3", nullable = true)
    private Boolean lackOfResponsiveness3;

    @Column(name = "cs8_lackOfResponsiveness_4", nullable = true)
    private Boolean lackOfResponsiveness4;

    @Column(name = "cs8_lackOfResponsiveness_5", nullable = true)
    private Boolean lackOfResponsiveness5;

    @Column(name = "cs8_lackOfResponsiveness_6", nullable = true)
    private Boolean lackOfResponsiveness6;

    @Column(name = "cs8_complexity_1", nullable = true)
    private Boolean complexity1;

    @Column(name = "cs8_complexity_2", nullable = true)
    private Boolean complexity2;

    @Column(name = "cs8_complexity_3", nullable = true)
    private Boolean complexity3;

    @Column(name = "cs8_complexity_4", nullable = true)
    private Boolean complexity4;

    @Column(name = "cs8_complexity_5", nullable = true)
    private Boolean complexity5;

    @Column(name = "cs8_complexity_6", nullable = true)
    private Boolean complexity6;

    @Column(name = "cs8_noFSCMarketDemand_1", nullable = true)
    private Boolean noFSCMarketDemand1;

    @Column(name = "cs8_noFSCMarketDemand_2", nullable = true)
    private Boolean noFSCMarketDemand2;

    @Column(name = "cs8_noFSCMarketDemand_3", nullable = true)
    private Boolean noFSCMarketDemand3;

    @Column(name = "cs8_noFSCMarketDemand_4", nullable = true)
    private Boolean noFSCMarketDemand4;

    @Column(name = "cs8_noFSCMarketDemand_5", nullable = true)
    private Boolean noFSCMarketDemand5;

    @Column(name = "cs8_noFSCMarketDemand_6", nullable = true)
    private Boolean noFSCMarketDemand6;

    @Column(name = "cs8_uncertainty_1", nullable = true)
    private Boolean uncertainty1;

    @Column(name = "cs8_uncertainty_2", nullable = true)
    private Boolean uncertainty2;

    @Column(name = "cs8_uncertainty_3", nullable = true)
    private Boolean uncertainty3;

    @Column(name = "cs8_uncertainty_4", nullable = true)
    private Boolean uncertainty4;

    @Column(name = "cs8_uncertainty_5", nullable = true)
    private Boolean uncertainty5;

    @Column(name = "cs8_uncertainty_6", nullable = true)
    private Boolean uncertainty6;

    @Column(name = "cs8_lackOfFSCSupply_1", nullable = true)
    private Boolean lackoffscsupply1;

    @Column(name = "cs8_lackOfFSCSupply_2", nullable = true)
    private Boolean lackoffscsupply2;

    @Column(name = "cs8_lackOfFSCSupply_3", nullable = true)
    private Boolean lackoffscsupply3;

    @Column(name = "cs8_lackOfFSCSupply_4", nullable = true)
    private Boolean lackoffscsupply4;

    @Column(name = "cs8_lackOfFSCSupply_5", nullable = true)
    private Boolean lackoffscsupply5;

    @Column(name = "cs8_lackOfFSCSupply_6", nullable = true)
    private Boolean lackoffscsupply6;

    @Column(name = "cs8_inconsistentApproaches_1", nullable = true)
    private Boolean inconsistentapproaches1;

    @Column(name = "cs8_inconsistentApproaches_2", nullable = true)
    private Boolean inconsistentapproaches2;

    @Column(name = "cs8_inconsistentApproaches_3", nullable = true)
    private Boolean inconsistentapproaches3;

    @Column(name = "cs8_inconsistentApproaches_4", nullable = true)
    private Boolean inconsistentapproaches4;

    @Column(name = "cs8_inconsistentApproaches_5", nullable = true)
    private Boolean inconsistentapproaches5;

    @Column(name = "cs8_inconsistentApproaches_6", nullable = true)
    private Boolean inconsistentapproaches6;

    @Column(name = "cs8_other_1", nullable = true)
    private Boolean other1;

    @Column(name = "cs8_other_2", nullable = true)
    private Boolean other2;

    @Column(name = "cs8_other_3", nullable = true)
    private Boolean other3;

    @Column(name = "cs8_other_4", nullable = true)
    private Boolean other4;

    @Column(name = "cs8_other_5", nullable = true)
    private Boolean other5;

    @Column(name = "cs8_other_6", nullable = true)
    private Boolean other6;

    @Column(name = "cs8_ChainOfCustody_FSCCertification_1", nullable = true)
    private String chainOfCustodyFSCCertification1;

    @Column(name = "cs8_ChainOfCustody_FSCCertification_2", nullable = true)
    private String chainOfCustodyFSCCertification2;

    @Column(name = "cs8_ChainOfCustody_FSCCertification_3", nullable = true)
    private String chainOfCustodyFSCCertification3;

    @Column(name = "cs8_ChainOfCustody_FSCCertification_4", nullable = true)
    private String chainOfCustodyFSCCertification4;

    @Column(name = "cs8_ChainOfCustody_FSCCertification_5", nullable = true)
    private String chainOfCustodyFSCCertification5;

    @Column(name = "cs8_ChainOfCustody_FSCCertification_6", nullable = true)
    private String chainOfCustodyFSCCertification6;

    @Column(name = "cs8_ChainOfCustody_fscCertification_explain_1", nullable = true)
    private String chainOfCustodyFscCertificationExplain1;

    @Column(name = "cs8_ChainOfCustody_fscCertification_explain_2", nullable = true)
    private String chainOfCustodyFscCertificationExplain2;

    @Column(name = "cs8_ChainOfCustody_fscCertification_explain_3", nullable = true)
    private String chainOfCustodyFscCertificationExplain3;

    @Column(name = "cs8_ChainOfCustody_fscCertification_explain_4", nullable = true)
    private String chainOfCustodyFscCertificationExplain4;

    @Column(name = "cs8_ChainOfCustody_fscCertification_explain_5", nullable = true)
    private String chainOfCustodyFscCertificationExplain5;

    @Column(name = "cs8_ChainOfCustody_fscCertification_explain_6", nullable = true)
    private String chainOfCustodyFscCertificationExplain6;

    @Column(name = "cs8_ChainOfCustody_cost_1", nullable = true)
    private Boolean chainOfCustodyCost1;

    @Column(name = "cs8_ChainOfCustody_cost_2", nullable = true)
    private Boolean chainOfCustodyCost2;

    @Column(name = "cs8_ChainOfCustody_cost_3", nullable = true)
    private Boolean chainOfCustodyCost3;

    @Column(name = "cs8_ChainOfCustody_cost_4", nullable = true)
    private Boolean chainOfCustodyCost4;

    @Column(name = "cs8_ChainOfCustody_cost_5", nullable = true)
    private Boolean chainOfCustodyCost5;

    @Column(name = "cs8_ChainOfCustody_cost_6", nullable = true)
    private Boolean chainOfCustodyCost6;

    @Column(name = "cs8_ChainOfCustody_lackOfResponsiveness_1", nullable = true)
    private Boolean chainOfCustodyLackOfResponsiveness1;

    @Column(name = "cs8_ChainOfCustody_lackOfResponsiveness_2", nullable = true)
    private Boolean chainOfCustodyLackOfResponsiveness2;

    @Column(name = "cs8_ChainOfCustody_lackOfResponsiveness_3", nullable = true)
    private Boolean chainOfCustodyLackOfResponsiveness3;

    @Column(name = "cs8_ChainOfCustody_lackOfResponsiveness_4", nullable = true)
    private Boolean chainOfCustodyLackOfResponsiveness4;

    @Column(name = "cs8_ChainOfCustody_lackOfResponsiveness_5", nullable = true)
    private Boolean chainOfCustodyLackOfResponsiveness5;

    @Column(name = "cs8_ChainOfCustody_lackOfResponsiveness_6", nullable = true)
    private Boolean chainOfCustodyLackOfResponsiveness6;

    @Column(name = "cs8_ChainOfCustody_complexity_1", nullable = true)
    private Boolean chainOfCustodyComplexity1;

    @Column(name = "cs8_ChainOfCustody_complexity_2", nullable = true)
    private Boolean chainOfCustodyComplexity2;

    @Column(name = "cs8_ChainOfCustody_complexity_3", nullable = true)
    private Boolean chainOfCustodyComplexity3;

    @Column(name = "cs8_ChainOfCustody_complexity_4", nullable = true)
    private Boolean chainOfCustodyComplexity4;

    @Column(name = "cs8_ChainOfCustody_complexity_5", nullable = true)
    private Boolean chainOfCustodyComplexity5;

    @Column(name = "cs8_ChainOfCustody_complexity_6", nullable = true)
    private Boolean chainOfCustodyComplexity6;

    @Column(name = "cs8_ChainOfCustody_noFSCMarketDemand_1", nullable = true)
    private Boolean chainOfCustodyNoFSCMarketDemand1;

    @Column(name = "cs8_ChainOfCustody_noFSCMarketDemand_2", nullable = true)
    private Boolean chainOfCustodyNoFSCMarketDemand2;

    @Column(name = "cs8_ChainOfCustody_noFSCMarketDemand_3", nullable = true)
    private Boolean chainOfCustodyNoFSCMarketDemand3;

    @Column(name = "cs8_ChainOfCustody_noFSCMarketDemand_4", nullable = true)
    private Boolean chainOfCustodyNoFSCMarketDemand4;

    @Column(name = "cs8_ChainOfCustody_noFSCMarketDemand_5", nullable = true)
    private Boolean chainOfCustodyNoFSCMarketDemand5;

    @Column(name = "cs8_ChainOfCustody_noFSCMarketDemand_6", nullable = true)
    private Boolean chainOfCustodyNoFSCMarketDemand6;

    @Column(name = "cs8_ChainOfCustody_uncertainty_1", nullable = true)
    private Boolean chainOfCustodyUncertainty1;

    @Column(name = "cs8_ChainOfCustody_uncertainty_2", nullable = true)
    private Boolean chainOfCustodyUncertainty2;

    @Column(name = "cs8_ChainOfCustody_uncertainty_3", nullable = true)
    private Boolean chainOfCustodyUncertainty3;

    @Column(name = "cs8_ChainOfCustody_uncertainty_4", nullable = true)
    private Boolean chainOfCustodyUncertainty4;

    @Column(name = "cs8_ChainOfCustody_uncertainty_5", nullable = true)
    private Boolean chainOfCustodyUncertainty5;

    @Column(name = "cs8_ChainOfCustody_uncertainty_6", nullable = true)
    private Boolean chainOfCustodyUncertainty6;

    @Column(name = "cs8_ChainOfCustody_lackOfFSCSupply_1", nullable = true)
    private Boolean chainOfCustodyLackoffscsupply1;

    @Column(name = "cs8_ChainOfCustody_lackOfFSCSupply_2", nullable = true)
    private Boolean chainOfCustodyLackoffscsupply2;

    @Column(name = "cs8_ChainOfCustody_lackOfFSCSupply_3", nullable = true)
    private Boolean chainOfCustodyLackoffscsupply3;

    @Column(name = "cs8_ChainOfCustody_lackOfFSCSupply_4", nullable = true)
    private Boolean chainOfCustodyLackoffscsupply4;

    @Column(name = "cs8_ChainOfCustody_lackOfFSCSupply_5", nullable = true)
    private Boolean chainOfCustodyLackoffscsupply5;

    @Column(name = "cs8_ChainOfCustody_lackOfFSCSupply_6", nullable = true)
    private Boolean chainOfCustodyLackoffscsupply6;

    @Column(name = "cs8_ChainOfCustody_inconsistentApproaches_1", nullable = true)
    private Boolean chainOfCustodyInconsistentapproaches1;

    @Column(name = "cs8_ChainOfCustody_inconsistentApproaches_2", nullable = true)
    private Boolean chainOfCustodyInconsistentapproaches2;

    @Column(name = "cs8_ChainOfCustody_inconsistentApproaches_3", nullable = true)
    private Boolean chainOfCustodyInconsistentapproaches3;

    @Column(name = "cs8_ChainOfCustody_inconsistentApproaches_4", nullable = true)
    private Boolean chainOfCustodyInconsistentapproaches4;

    @Column(name = "cs8_ChainOfCustody_inconsistentApproaches_5", nullable = true)
    private Boolean chainOfCustodyInconsistentapproaches5;

    @Column(name = "cs8_ChainOfCustody_inconsistentApproaches_6", nullable = true)
    private Boolean chainOfCustodyInconsistentapproaches6;

    @Column(name = "cs8_ChainOfCustody_other_1", nullable = true)
    private Boolean chainOfCustodyOther1;

    @Column(name = "cs8_ChainOfCustody_other_2", nullable = true)
    private Boolean chainOfCustodyOther2;

    @Column(name = "cs8_ChainOfCustody_other_3", nullable = true)
    private Boolean chainOfCustodyOther3;

    @Column(name = "cs8_ChainOfCustody_other_4", nullable = true)
    private Boolean chainOfCustodyOther4;

    @Column(name = "cs8_ChainOfCustody_other_5", nullable = true)
    private Boolean chainOfCustodyOther5;

    @Column(name = "cs8_ChainOfCustody_other_6", nullable = true)
    private Boolean chainOfCustodyOther6;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getProductSegmentWoodProducts() {
        return productSegmentWoodProducts;
    }

    public void setProductSegmentWoodProducts(Boolean productSegmentWoodProducts) {
        this.productSegmentWoodProducts = productSegmentWoodProducts;
    }

    public Boolean getProductSegmentPrintingWritingPaper() {
        return productSegmentPrintingWritingPaper;
    }

    public void setProductSegmentPrintingWritingPaper(Boolean productSegmentPrintingWritingPaper) {
        this.productSegmentPrintingWritingPaper = productSegmentPrintingWritingPaper;
    }

    public Boolean getProductSegmentPackaging() {
        return productSegmentPackaging;
    }

    public void setProductSegmentPackaging(Boolean productSegmentPackaging) {
        this.productSegmentPackaging = productSegmentPackaging;
    }

    public Boolean getProductSegmentBioenergy() {
        return productSegmentBioenergy;
    }

    public void setProductSegmentBioenergy(Boolean productSegmentBioenergy) {
        this.productSegmentBioenergy = productSegmentBioenergy;
    }

    public Boolean getProductSegmentOther() {
        return productSegmentOther;
    }

    public void setProductSegmentOther(Boolean productSegmentOther) {
        this.productSegmentOther = productSegmentOther;
    }

    public String getProductSegmentOtherExplain() {
        return productSegmentOtherExplain;
    }

    public void setProductSegmentOtherExplain(String productSegmentOtherExplain) {
        this.productSegmentOtherExplain = productSegmentOtherExplain;
    }

    public String getProofPoint() {
        return proofPoint;
    }

    public void setProofPoint(String proofPoint) {
        this.proofPoint = proofPoint;
    }

    public String getEnhancedCorporate() {
        return enhancedCorporate;
    }

    public void setEnhancedCorporate(String enhancedCorporate) {
        this.enhancedCorporate = enhancedCorporate;
    }

    public String getDemonstrateOrganizationSustainability() {
        return demonstrateOrganizationSustainability;
    }

    public void setDemonstrateOrganizationSustainability(String demonstrateOrganizationSustainability) {
        this.demonstrateOrganizationSustainability = demonstrateOrganizationSustainability;
    }

    public String getDemonstrateCustomerSustainability() {
        return demonstrateCustomerSustainability;
    }

    public void setDemonstrateCustomerSustainability(String demonstrateCustomerSustainability) {
        this.demonstrateCustomerSustainability = demonstrateCustomerSustainability;
    }

    public String getEnhancedMarketing() {
        return enhancedMarketing;
    }

    public void setEnhancedMarketing(String enhancedMarketing) {
        this.enhancedMarketing = enhancedMarketing;
    }

    public String getAlignmentLegal() {
        return alignmentLegal;
    }

    public void setAlignmentLegal(String alignmentLegal) {
        this.alignmentLegal = alignmentLegal;
    }

    public String getRiskManagementTool() {
        return riskManagementTool;
    }

    public void setRiskManagementTool(String riskManagementTool) {
        this.riskManagementTool = riskManagementTool;
    }

    public String getToolToAddressPressures() {
        return toolToAddressPressures;
    }

    public void setToolToAddressPressures(String toolToAddressPressures) {
        this.toolToAddressPressures = toolToAddressPressures;
    }

    public String getImprove() {
        return improve;
    }

    public void setImprove(String improve) {
        this.improve = improve;
    }

    public Boolean getProductSegmentTowelTissue() {
        return productSegmentTowelTissue;
    }

    public void setProductSegmentTowelTissue(Boolean productSegmentTowelTissue) {
        this.productSegmentTowelTissue = productSegmentTowelTissue;
    }

    public Boolean getDeforestationConcerns() {
        return deforestationConcerns;
    }

    public void setDeforestationConcerns(Boolean deforestationConcerns) {
        this.deforestationConcerns = deforestationConcerns;
    }

    public Boolean getDeforestationConcernsData() {
        return deforestationConcernsData;
    }

    public void setDeforestationConcernsData(Boolean deforestationConcernsData) {
        this.deforestationConcernsData = deforestationConcernsData;
    }

    public String getDeforestationConcernsDataExplain() {
        return deforestationConcernsDataExplain;
    }

    public void setDeforestationConcernsDataExplain(String deforestationConcernsDataExplain) {
        this.deforestationConcernsDataExplain = deforestationConcernsDataExplain;
    }

    public Boolean getDeforestationConcernsReports() {
        return deforestationConcernsReports;
    }

    public void setDeforestationConcernsReports(Boolean deforestationConcernsReports) {
        this.deforestationConcernsReports = deforestationConcernsReports;
    }

    public String getDeforestationConcernsReportsExplain() {
        return deforestationConcernsReportsExplain;
    }

    public void setDeforestationConcernsReportsExplain(String deforestationConcernsReportsExplain) {
        this.deforestationConcernsReportsExplain = deforestationConcernsReportsExplain;
    }

    public Boolean getDeforestationConcernsStudies() {
        return deforestationConcernsStudies;
    }

    public void setDeforestationConcernsStudies(Boolean deforestationConcernsStudies) {
        this.deforestationConcernsStudies = deforestationConcernsStudies;
    }

    public String getDeforestationConcernsStudiesExplain() {
        return deforestationConcernsStudiesExplain;
    }

    public void setDeforestationConcernsStudiesExplain(String deforestationConcernsStudiesExplain) {
        this.deforestationConcernsStudiesExplain = deforestationConcernsStudiesExplain;
    }

    public Boolean getDeforestationConcernsOther() {
        return deforestationConcernsOther;
    }

    public void setDeforestationConcernsOther(Boolean deforestationConcernsOther) {
        this.deforestationConcernsOther = deforestationConcernsOther;
    }

    public String getDeforestationConcernsOtherExplain() {
        return deforestationConcernsOtherExplain;
    }

    public void setDeforestationConcernsOtherExplain(String deforestationConcernsOtherExplain) {
        this.deforestationConcernsOtherExplain = deforestationConcernsOtherExplain;
    }

    public String getDemandDeveloping1() {
        return demandDeveloping1;
    }

    public void setDemandDeveloping1(String demandDeveloping1) {
        this.demandDeveloping1 = demandDeveloping1;
    }

    public String getDemandDeveloping2() {
        return demandDeveloping2;
    }

    public void setDemandDeveloping2(String demandDeveloping2) {
        this.demandDeveloping2 = demandDeveloping2;
    }

    public String getDemandDeveloping3() {
        return demandDeveloping3;
    }

    public void setDemandDeveloping3(String demandDeveloping3) {
        this.demandDeveloping3 = demandDeveloping3;
    }

    public String getDemandDeveloping4() {
        return demandDeveloping4;
    }

    public void setDemandDeveloping4(String demandDeveloping4) {
        this.demandDeveloping4 = demandDeveloping4;
    }

    public String getDemandDeveloping5() {
        return demandDeveloping5;
    }

    public void setDemandDeveloping5(String demandDeveloping5) {
        this.demandDeveloping5 = demandDeveloping5;
    }

    public String getDemandDeveloping6() {
        return demandDeveloping6;
    }

    public void setDemandDeveloping6(String demandDeveloping6) {
        this.demandDeveloping6 = demandDeveloping6;
    }

    public String getDemandDevelopingWhy1() {
        return demandDevelopingWhy1;
    }

    public void setDemandDevelopingWhy1(String demandDevelopingWhy1) {
        this.demandDevelopingWhy1 = demandDevelopingWhy1;
    }

    public String getDemandDevelopingWhy2() {
        return demandDevelopingWhy2;
    }

    public void setDemandDevelopingWhy2(String demandDevelopingWhy2) {
        this.demandDevelopingWhy2 = demandDevelopingWhy2;
    }

    public String getDemandDevelopingWhy3() {
        return demandDevelopingWhy3;
    }

    public void setDemandDevelopingWhy3(String demandDevelopingWhy3) {
        this.demandDevelopingWhy3 = demandDevelopingWhy3;
    }

    public String getDemandDevelopingWhy4() {
        return demandDevelopingWhy4;
    }

    public void setDemandDevelopingWhy4(String demandDevelopingWhy4) {
        this.demandDevelopingWhy4 = demandDevelopingWhy4;
    }

    public String getDemandDevelopingWhy5() {
        return demandDevelopingWhy5;
    }

    public void setDemandDevelopingWhy5(String demandDevelopingWhy5) {
        this.demandDevelopingWhy5 = demandDevelopingWhy5;
    }

    public String getDemandDevelopingWhy6() {
        return demandDevelopingWhy6;
    }

    public void setDemandDevelopingWhy6(String demandDevelopingWhy6) {
        this.demandDevelopingWhy6 = demandDevelopingWhy6;
    }

    public Set<String> getSfiLabelProductGroupContain1() {
        return sfiLabelProductGroupContain1;
    }

    public void setSfiLabelProductGroupContain1(Set<String> sfiLabelProductGroupContain1) {
        addAll(this.sfiLabelProductGroupContain1, sfiLabelProductGroupContain1);
    }

    public Set<String> getSfiLabelProductGroupContain2() {
        return sfiLabelProductGroupContain2;
    }

    public void setSfiLabelProductGroupContain2(Set<String> sfiLabelProductGroupContain2) {
        addAll(this.sfiLabelProductGroupContain2, sfiLabelProductGroupContain2);
    }

    public Set<String> getSfiLabelProductGroupContain3() {
        return sfiLabelProductGroupContain3;
    }

    public void setSfiLabelProductGroupContain3(Set<String> sfiLabelProductGroupContain3) {
        addAll(this.sfiLabelProductGroupContain3, sfiLabelProductGroupContain3);
    }

    public Set<String> getSfiLabelProductGroupContain4() {
        return sfiLabelProductGroupContain4;
    }

    public void setSfiLabelProductGroupContain4(Set<String> sfiLabelProductGroupContain4) {
        addAll(this.sfiLabelProductGroupContain4, sfiLabelProductGroupContain4);
    }

    public Set<String> getSfiLabelProductGroupContain5() {
        return sfiLabelProductGroupContain5;
    }

    public void setSfiLabelProductGroupContain5(Set<String> sfiLabelProductGroupContain5) {
        addAll(this.sfiLabelProductGroupContain5, sfiLabelProductGroupContain5);
    }

    public Set<String> getSfiLabelProductGroupContain6() {
        return sfiLabelProductGroupContain6;
    }

    public void setSfiLabelProductGroupContain6(Set<String> sfiLabelProductGroupContain6) {
        addAll(this.sfiLabelProductGroupContain6, sfiLabelProductGroupContain6);
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

    public String getSfiCertifiedForestContent1() {
        return sfiCertifiedForestContent1;
    }

    public void setSfiCertifiedForestContent1(String sfiCertifiedForestContent1) {
        this.sfiCertifiedForestContent1 = sfiCertifiedForestContent1;
    }

    public String getSfiCertifiedForestContent2() {
        return sfiCertifiedForestContent2;
    }

    public void setSfiCertifiedForestContent2(String sfiCertifiedForestContent2) {
        this.sfiCertifiedForestContent2 = sfiCertifiedForestContent2;
    }

    public String getSfiCertifiedForestContent3() {
        return sfiCertifiedForestContent3;
    }

    public void setSfiCertifiedForestContent3(String sfiCertifiedForestContent3) {
        this.sfiCertifiedForestContent3 = sfiCertifiedForestContent3;
    }

    public String getSfiCertifiedForestContent4() {
        return sfiCertifiedForestContent4;
    }

    public void setSfiCertifiedForestContent4(String sfiCertifiedForestContent4) {
        this.sfiCertifiedForestContent4 = sfiCertifiedForestContent4;
    }

    public String getSfiCertifiedForestContent5() {
        return sfiCertifiedForestContent5;
    }

    public void setSfiCertifiedForestContent5(String sfiCertifiedForestContent5) {
        this.sfiCertifiedForestContent5 = sfiCertifiedForestContent5;
    }

    public String getSfiCertifiedForestContent6() {
        return sfiCertifiedForestContent6;
    }

    public void setSfiCertifiedForestContent6(String sfiCertifiedForestContent6) {
        this.sfiCertifiedForestContent6 = sfiCertifiedForestContent6;
    }

    public String getSfiCertifiedForestContentWhy1() {
        return sfiCertifiedForestContentWhy1;
    }

    public void setSfiCertifiedForestContentWhy1(String sfiCertifiedForestContentWhy1) {
        this.sfiCertifiedForestContentWhy1 = sfiCertifiedForestContentWhy1;
    }

    public String getSfiCertifiedForestContentWhy2() {
        return sfiCertifiedForestContentWhy2;
    }

    public void setSfiCertifiedForestContentWhy2(String sfiCertifiedForestContentWhy2) {
        this.sfiCertifiedForestContentWhy2 = sfiCertifiedForestContentWhy2;
    }

    public String getSfiCertifiedForestContentWhy3() {
        return sfiCertifiedForestContentWhy3;
    }

    public void setSfiCertifiedForestContentWhy3(String sfiCertifiedForestContentWhy3) {
        this.sfiCertifiedForestContentWhy3 = sfiCertifiedForestContentWhy3;
    }

    public String getSfiCertifiedForestContentWhy4() {
        return sfiCertifiedForestContentWhy4;
    }

    public void setSfiCertifiedForestContentWhy4(String sfiCertifiedForestContentWhy4) {
        this.sfiCertifiedForestContentWhy4 = sfiCertifiedForestContentWhy4;
    }

    public String getSfiCertifiedForestContentWhy5() {
        return sfiCertifiedForestContentWhy5;
    }

    public void setSfiCertifiedForestContentWhy5(String sfiCertifiedForestContentWhy5) {
        this.sfiCertifiedForestContentWhy5 = sfiCertifiedForestContentWhy5;
    }

    public String getSfiCertifiedForestContentWhy6() {
        return sfiCertifiedForestContentWhy6;
    }

    public void setSfiCertifiedForestContentWhy6(String sfiCertifiedForestContentWhy6) {
        this.sfiCertifiedForestContentWhy6 = sfiCertifiedForestContentWhy6;
    }

    public String getDemandSFICertified1() {
        return demandSFICertified1;
    }

    public void setDemandSFICertified1(String demandSFICertified1) {
        this.demandSFICertified1 = demandSFICertified1;
    }

    public String getDemandSFICertified2() {
        return demandSFICertified2;
    }

    public void setDemandSFICertified2(String demandSFICertified2) {
        this.demandSFICertified2 = demandSFICertified2;
    }

    public String getDemandSFICertified3() {
        return demandSFICertified3;
    }

    public void setDemandSFICertified3(String demandSFICertified3) {
        this.demandSFICertified3 = demandSFICertified3;
    }

    public String getDemandSFICertified4() {
        return demandSFICertified4;
    }

    public void setDemandSFICertified4(String demandSFICertified4) {
        this.demandSFICertified4 = demandSFICertified4;
    }

    public String getDemandSFICertified5() {
        return demandSFICertified5;
    }

    public void setDemandSFICertified5(String demandSFICertified5) {
        this.demandSFICertified5 = demandSFICertified5;
    }

    public String getDemandSFICertified6() {
        return demandSFICertified6;
    }

    public void setDemandSFICertified6(String demandSFICertified6) {
        this.demandSFICertified6 = demandSFICertified6;
    }

    public String getDemandSFICertifiedWhy1() {
        return demandSFICertifiedWhy1;
    }

    public void setDemandSFICertifiedWhy1(String demandSFICertifiedWhy1) {
        this.demandSFICertifiedWhy1 = demandSFICertifiedWhy1;
    }

    public String getDemandSFICertifiedWhy2() {
        return demandSFICertifiedWhy2;
    }

    public void setDemandSFICertifiedWhy2(String demandSFICertifiedWhy2) {
        this.demandSFICertifiedWhy2 = demandSFICertifiedWhy2;
    }

    public String getDemandSFICertifiedWhy3() {
        return demandSFICertifiedWhy3;
    }

    public void setDemandSFICertifiedWhy3(String demandSFICertifiedWhy3) {
        this.demandSFICertifiedWhy3 = demandSFICertifiedWhy3;
    }

    public String getDemandSFICertifiedWhy4() {
        return demandSFICertifiedWhy4;
    }

    public void setDemandSFICertifiedWhy4(String demandSFICertifiedWhy4) {
        this.demandSFICertifiedWhy4 = demandSFICertifiedWhy4;
    }

    public String getDemandSFICertifiedWhy5() {
        return demandSFICertifiedWhy5;
    }

    public void setDemandSFICertifiedWhy5(String demandSFICertifiedWhy5) {
        this.demandSFICertifiedWhy5 = demandSFICertifiedWhy5;
    }

    public String getDemandSFICertifiedWhy6() {
        return demandSFICertifiedWhy6;
    }

    public void setDemandSFICertifiedWhy6(String demandSFICertifiedWhy6) {
        this.demandSFICertifiedWhy6 = demandSFICertifiedWhy6;
    }

    public String getfSCCertification1() {
        return fSCCertification1;
    }

    public void setfSCCertification1(String fSCCertification1) {
        this.fSCCertification1 = fSCCertification1;
    }

    public String getfSCCertification2() {
        return fSCCertification2;
    }

    public void setfSCCertification2(String fSCCertification2) {
        this.fSCCertification2 = fSCCertification2;
    }

    public String getfSCCertification3() {
        return fSCCertification3;
    }

    public void setfSCCertification3(String fSCCertification3) {
        this.fSCCertification3 = fSCCertification3;
    }

    public String getfSCCertification4() {
        return fSCCertification4;
    }

    public void setfSCCertification4(String fSCCertification4) {
        this.fSCCertification4 = fSCCertification4;
    }

    public String getfSCCertification5() {
        return fSCCertification5;
    }

    public void setfSCCertification5(String fSCCertification5) {
        this.fSCCertification5 = fSCCertification5;
    }

    public String getfSCCertification6() {
        return fSCCertification6;
    }

    public void setfSCCertification6(String fSCCertification6) {
        this.fSCCertification6 = fSCCertification6;
    }

    public String getFscCertificationExplain1() {
        return fscCertificationExplain1;
    }

    public void setFscCertificationExplain1(String fscCertificationExplain1) {
        this.fscCertificationExplain1 = fscCertificationExplain1;
    }

    public String getFscCertificationExplain2() {
        return fscCertificationExplain2;
    }

    public void setFscCertificationExplain2(String fscCertificationExplain2) {
        this.fscCertificationExplain2 = fscCertificationExplain2;
    }

    public String getFscCertificationExplain3() {
        return fscCertificationExplain3;
    }

    public void setFscCertificationExplain3(String fscCertificationExplain3) {
        this.fscCertificationExplain3 = fscCertificationExplain3;
    }

    public String getFscCertificationExplain4() {
        return fscCertificationExplain4;
    }

    public void setFscCertificationExplain4(String fscCertificationExplain4) {
        this.fscCertificationExplain4 = fscCertificationExplain4;
    }

    public String getFscCertificationExplain5() {
        return fscCertificationExplain5;
    }

    public void setFscCertificationExplain5(String fscCertificationExplain5) {
        this.fscCertificationExplain5 = fscCertificationExplain5;
    }

    public String getFscCertificationExplain6() {
        return fscCertificationExplain6;
    }

    public void setFscCertificationExplain6(String fscCertificationExplain6) {
        this.fscCertificationExplain6 = fscCertificationExplain6;
    }

    public Boolean getCost1() {
        return cost1;
    }

    public void setCost1(Boolean cost1) {
        this.cost1 = cost1;
    }

    public Boolean getCost2() {
        return cost2;
    }

    public void setCost2(Boolean cost2) {
        this.cost2 = cost2;
    }

    public Boolean getCost3() {
        return cost3;
    }

    public void setCost3(Boolean cost3) {
        this.cost3 = cost3;
    }

    public Boolean getCost4() {
        return cost4;
    }

    public void setCost4(Boolean cost4) {
        this.cost4 = cost4;
    }

    public Boolean getCost5() {
        return cost5;
    }

    public void setCost5(Boolean cost5) {
        this.cost5 = cost5;
    }

    public Boolean getCost6() {
        return cost6;
    }

    public void setCost6(Boolean cost6) {
        this.cost6 = cost6;
    }

    public Boolean getLackOfResponsiveness1() {
        return lackOfResponsiveness1;
    }

    public void setLackOfResponsiveness1(Boolean lackOfResponsiveness1) {
        this.lackOfResponsiveness1 = lackOfResponsiveness1;
    }

    public Boolean getLackOfResponsiveness2() {
        return lackOfResponsiveness2;
    }

    public void setLackOfResponsiveness2(Boolean lackOfResponsiveness2) {
        this.lackOfResponsiveness2 = lackOfResponsiveness2;
    }

    public Boolean getLackOfResponsiveness3() {
        return lackOfResponsiveness3;
    }

    public void setLackOfResponsiveness3(Boolean lackOfResponsiveness3) {
        this.lackOfResponsiveness3 = lackOfResponsiveness3;
    }

    public Boolean getLackOfResponsiveness4() {
        return lackOfResponsiveness4;
    }

    public void setLackOfResponsiveness4(Boolean lackOfResponsiveness4) {
        this.lackOfResponsiveness4 = lackOfResponsiveness4;
    }

    public Boolean getLackOfResponsiveness5() {
        return lackOfResponsiveness5;
    }

    public void setLackOfResponsiveness5(Boolean lackOfResponsiveness5) {
        this.lackOfResponsiveness5 = lackOfResponsiveness5;
    }

    public Boolean getLackOfResponsiveness6() {
        return lackOfResponsiveness6;
    }

    public void setLackOfResponsiveness6(Boolean lackOfResponsiveness6) {
        this.lackOfResponsiveness6 = lackOfResponsiveness6;
    }

    public Boolean getComplexity1() {
        return complexity1;
    }

    public void setComplexity1(Boolean complexity1) {
        this.complexity1 = complexity1;
    }

    public Boolean getComplexity2() {
        return complexity2;
    }

    public void setComplexity2(Boolean complexity2) {
        this.complexity2 = complexity2;
    }

    public Boolean getComplexity3() {
        return complexity3;
    }

    public void setComplexity3(Boolean complexity3) {
        this.complexity3 = complexity3;
    }

    public Boolean getComplexity4() {
        return complexity4;
    }

    public void setComplexity4(Boolean complexity4) {
        this.complexity4 = complexity4;
    }

    public Boolean getComplexity5() {
        return complexity5;
    }

    public void setComplexity5(Boolean complexity5) {
        this.complexity5 = complexity5;
    }

    public Boolean getComplexity6() {
        return complexity6;
    }

    public void setComplexity6(Boolean complexity6) {
        this.complexity6 = complexity6;
    }

    public Boolean getNoFSCMarketDemand1() {
        return noFSCMarketDemand1;
    }

    public void setNoFSCMarketDemand1(Boolean noFSCMarketDemand1) {
        this.noFSCMarketDemand1 = noFSCMarketDemand1;
    }

    public Boolean getNoFSCMarketDemand2() {
        return noFSCMarketDemand2;
    }

    public void setNoFSCMarketDemand2(Boolean noFSCMarketDemand2) {
        this.noFSCMarketDemand2 = noFSCMarketDemand2;
    }

    public Boolean getNoFSCMarketDemand3() {
        return noFSCMarketDemand3;
    }

    public void setNoFSCMarketDemand3(Boolean noFSCMarketDemand3) {
        this.noFSCMarketDemand3 = noFSCMarketDemand3;
    }

    public Boolean getNoFSCMarketDemand4() {
        return noFSCMarketDemand4;
    }

    public void setNoFSCMarketDemand4(Boolean noFSCMarketDemand4) {
        this.noFSCMarketDemand4 = noFSCMarketDemand4;
    }

    public Boolean getNoFSCMarketDemand5() {
        return noFSCMarketDemand5;
    }

    public void setNoFSCMarketDemand5(Boolean noFSCMarketDemand5) {
        this.noFSCMarketDemand5 = noFSCMarketDemand5;
    }

    public Boolean getNoFSCMarketDemand6() {
        return noFSCMarketDemand6;
    }

    public void setNoFSCMarketDemand6(Boolean noFSCMarketDemand6) {
        this.noFSCMarketDemand6 = noFSCMarketDemand6;
    }

    public Boolean getUncertainty1() {
        return uncertainty1;
    }

    public void setUncertainty1(Boolean uncertainty1) {
        this.uncertainty1 = uncertainty1;
    }

    public Boolean getUncertainty2() {
        return uncertainty2;
    }

    public void setUncertainty2(Boolean uncertainty2) {
        this.uncertainty2 = uncertainty2;
    }

    public Boolean getUncertainty3() {
        return uncertainty3;
    }

    public void setUncertainty3(Boolean uncertainty3) {
        this.uncertainty3 = uncertainty3;
    }

    public Boolean getUncertainty4() {
        return uncertainty4;
    }

    public void setUncertainty4(Boolean uncertainty4) {
        this.uncertainty4 = uncertainty4;
    }

    public Boolean getUncertainty5() {
        return uncertainty5;
    }

    public void setUncertainty5(Boolean uncertainty5) {
        this.uncertainty5 = uncertainty5;
    }

    public Boolean getUncertainty6() {
        return uncertainty6;
    }

    public void setUncertainty6(Boolean uncertainty6) {
        this.uncertainty6 = uncertainty6;
    }

    public Boolean getLackoffscsupply1() {
        return lackoffscsupply1;
    }

    public void setLackoffscsupply1(Boolean lackoffscsupply1) {
        this.lackoffscsupply1 = lackoffscsupply1;
    }

    public Boolean getLackoffscsupply2() {
        return lackoffscsupply2;
    }

    public void setLackoffscsupply2(Boolean lackoffscsupply2) {
        this.lackoffscsupply2 = lackoffscsupply2;
    }

    public Boolean getLackoffscsupply3() {
        return lackoffscsupply3;
    }

    public void setLackoffscsupply3(Boolean lackoffscsupply3) {
        this.lackoffscsupply3 = lackoffscsupply3;
    }

    public Boolean getLackoffscsupply4() {
        return lackoffscsupply4;
    }

    public void setLackoffscsupply4(Boolean lackoffscsupply4) {
        this.lackoffscsupply4 = lackoffscsupply4;
    }

    public Boolean getLackoffscsupply5() {
        return lackoffscsupply5;
    }

    public void setLackoffscsupply5(Boolean lackoffscsupply5) {
        this.lackoffscsupply5 = lackoffscsupply5;
    }

    public Boolean getLackoffscsupply6() {
        return lackoffscsupply6;
    }

    public void setLackoffscsupply6(Boolean lackoffscsupply6) {
        this.lackoffscsupply6 = lackoffscsupply6;
    }

    public Boolean getInconsistentapproaches1() {
        return inconsistentapproaches1;
    }

    public void setInconsistentapproaches1(Boolean inconsistentapproaches1) {
        this.inconsistentapproaches1 = inconsistentapproaches1;
    }

    public Boolean getInconsistentapproaches2() {
        return inconsistentapproaches2;
    }

    public void setInconsistentapproaches2(Boolean inconsistentapproaches2) {
        this.inconsistentapproaches2 = inconsistentapproaches2;
    }

    public Boolean getInconsistentapproaches3() {
        return inconsistentapproaches3;
    }

    public void setInconsistentapproaches3(Boolean inconsistentapproaches3) {
        this.inconsistentapproaches3 = inconsistentapproaches3;
    }

    public Boolean getInconsistentapproaches4() {
        return inconsistentapproaches4;
    }

    public void setInconsistentapproaches4(Boolean inconsistentapproaches4) {
        this.inconsistentapproaches4 = inconsistentapproaches4;
    }

    public Boolean getInconsistentapproaches5() {
        return inconsistentapproaches5;
    }

    public void setInconsistentapproaches5(Boolean inconsistentapproaches5) {
        this.inconsistentapproaches5 = inconsistentapproaches5;
    }

    public Boolean getInconsistentapproaches6() {
        return inconsistentapproaches6;
    }

    public void setInconsistentapproaches6(Boolean inconsistentapproaches6) {
        this.inconsistentapproaches6 = inconsistentapproaches6;
    }

    public Boolean getOther1() {
        return other1;
    }

    public void setOther1(Boolean other1) {
        this.other1 = other1;
    }

    public Boolean getOther2() {
        return other2;
    }

    public void setOther2(Boolean other2) {
        this.other2 = other2;
    }

    public Boolean getOther3() {
        return other3;
    }

    public void setOther3(Boolean other3) {
        this.other3 = other3;
    }

    public Boolean getOther4() {
        return other4;
    }

    public void setOther4(Boolean other4) {
        this.other4 = other4;
    }

    public Boolean getOther5() {
        return other5;
    }

    public void setOther5(Boolean other5) {
        this.other5 = other5;
    }

    public Boolean getOther6() {
        return other6;
    }

    public void setOther6(Boolean other6) {
        this.other6 = other6;
    }

    public String getChainOfCustodyFSCCertification1() {
        return chainOfCustodyFSCCertification1;
    }

    public void setChainOfCustodyFSCCertification1(String chainOfCustodyFSCCertification1) {
        this.chainOfCustodyFSCCertification1 = chainOfCustodyFSCCertification1;
    }

    public String getChainOfCustodyFSCCertification2() {
        return chainOfCustodyFSCCertification2;
    }

    public void setChainOfCustodyFSCCertification2(String chainOfCustodyFSCCertification2) {
        this.chainOfCustodyFSCCertification2 = chainOfCustodyFSCCertification2;
    }

    public String getChainOfCustodyFSCCertification3() {
        return chainOfCustodyFSCCertification3;
    }

    public void setChainOfCustodyFSCCertification3(String chainOfCustodyFSCCertification3) {
        this.chainOfCustodyFSCCertification3 = chainOfCustodyFSCCertification3;
    }

    public String getChainOfCustodyFSCCertification4() {
        return chainOfCustodyFSCCertification4;
    }

    public void setChainOfCustodyFSCCertification4(String chainOfCustodyFSCCertification4) {
        this.chainOfCustodyFSCCertification4 = chainOfCustodyFSCCertification4;
    }

    public String getChainOfCustodyFSCCertification5() {
        return chainOfCustodyFSCCertification5;
    }

    public void setChainOfCustodyFSCCertification5(String chainOfCustodyFSCCertification5) {
        this.chainOfCustodyFSCCertification5 = chainOfCustodyFSCCertification5;
    }

    public String getChainOfCustodyFSCCertification6() {
        return chainOfCustodyFSCCertification6;
    }

    public void setChainOfCustodyFSCCertification6(String chainOfCustodyFSCCertification6) {
        this.chainOfCustodyFSCCertification6 = chainOfCustodyFSCCertification6;
    }

    public String getChainOfCustodyFscCertificationExplain1() {
        return chainOfCustodyFscCertificationExplain1;
    }

    public void setChainOfCustodyFscCertificationExplain1(String chainOfCustodyFscCertificationExplain1) {
        this.chainOfCustodyFscCertificationExplain1 = chainOfCustodyFscCertificationExplain1;
    }

    public String getChainOfCustodyFscCertificationExplain2() {
        return chainOfCustodyFscCertificationExplain2;
    }

    public void setChainOfCustodyFscCertificationExplain2(String chainOfCustodyFscCertificationExplain2) {
        this.chainOfCustodyFscCertificationExplain2 = chainOfCustodyFscCertificationExplain2;
    }

    public String getChainOfCustodyFscCertificationExplain3() {
        return chainOfCustodyFscCertificationExplain3;
    }

    public void setChainOfCustodyFscCertificationExplain3(String chainOfCustodyFscCertificationExplain3) {
        this.chainOfCustodyFscCertificationExplain3 = chainOfCustodyFscCertificationExplain3;
    }

    public String getChainOfCustodyFscCertificationExplain4() {
        return chainOfCustodyFscCertificationExplain4;
    }

    public void setChainOfCustodyFscCertificationExplain4(String chainOfCustodyFscCertificationExplain4) {
        this.chainOfCustodyFscCertificationExplain4 = chainOfCustodyFscCertificationExplain4;
    }

    public String getChainOfCustodyFscCertificationExplain5() {
        return chainOfCustodyFscCertificationExplain5;
    }

    public void setChainOfCustodyFscCertificationExplain5(String chainOfCustodyFscCertificationExplain5) {
        this.chainOfCustodyFscCertificationExplain5 = chainOfCustodyFscCertificationExplain5;
    }

    public String getChainOfCustodyFscCertificationExplain6() {
        return chainOfCustodyFscCertificationExplain6;
    }

    public void setChainOfCustodyFscCertificationExplain6(String chainOfCustodyFscCertificationExplain6) {
        this.chainOfCustodyFscCertificationExplain6 = chainOfCustodyFscCertificationExplain6;
    }

    public Boolean getChainOfCustodyCost1() {
        return chainOfCustodyCost1;
    }

    public void setChainOfCustodyCost1(Boolean chainOfCustodyCost1) {
        this.chainOfCustodyCost1 = chainOfCustodyCost1;
    }

    public Boolean getChainOfCustodyCost2() {
        return chainOfCustodyCost2;
    }

    public void setChainOfCustodyCost2(Boolean chainOfCustodyCost2) {
        this.chainOfCustodyCost2 = chainOfCustodyCost2;
    }

    public Boolean getChainOfCustodyCost3() {
        return chainOfCustodyCost3;
    }

    public void setChainOfCustodyCost3(Boolean chainOfCustodyCost3) {
        this.chainOfCustodyCost3 = chainOfCustodyCost3;
    }

    public Boolean getChainOfCustodyCost4() {
        return chainOfCustodyCost4;
    }

    public void setChainOfCustodyCost4(Boolean chainOfCustodyCost4) {
        this.chainOfCustodyCost4 = chainOfCustodyCost4;
    }

    public Boolean getChainOfCustodyCost5() {
        return chainOfCustodyCost5;
    }

    public void setChainOfCustodyCost5(Boolean chainOfCustodyCost5) {
        this.chainOfCustodyCost5 = chainOfCustodyCost5;
    }

    public Boolean getChainOfCustodyCost6() {
        return chainOfCustodyCost6;
    }

    public void setChainOfCustodyCost6(Boolean chainOfCustodyCost6) {
        this.chainOfCustodyCost6 = chainOfCustodyCost6;
    }

    public Boolean getChainOfCustodyLackOfResponsiveness1() {
        return chainOfCustodyLackOfResponsiveness1;
    }

    public void setChainOfCustodyLackOfResponsiveness1(Boolean chainOfCustodyLackOfResponsiveness1) {
        this.chainOfCustodyLackOfResponsiveness1 = chainOfCustodyLackOfResponsiveness1;
    }

    public Boolean getChainOfCustodyLackOfResponsiveness2() {
        return chainOfCustodyLackOfResponsiveness2;
    }

    public void setChainOfCustodyLackOfResponsiveness2(Boolean chainOfCustodyLackOfResponsiveness2) {
        this.chainOfCustodyLackOfResponsiveness2 = chainOfCustodyLackOfResponsiveness2;
    }

    public Boolean getChainOfCustodyLackOfResponsiveness3() {
        return chainOfCustodyLackOfResponsiveness3;
    }

    public void setChainOfCustodyLackOfResponsiveness3(Boolean chainOfCustodyLackOfResponsiveness3) {
        this.chainOfCustodyLackOfResponsiveness3 = chainOfCustodyLackOfResponsiveness3;
    }

    public Boolean getChainOfCustodyLackOfResponsiveness4() {
        return chainOfCustodyLackOfResponsiveness4;
    }

    public void setChainOfCustodyLackOfResponsiveness4(Boolean chainOfCustodyLackOfResponsiveness4) {
        this.chainOfCustodyLackOfResponsiveness4 = chainOfCustodyLackOfResponsiveness4;
    }

    public Boolean getChainOfCustodyLackOfResponsiveness5() {
        return chainOfCustodyLackOfResponsiveness5;
    }

    public void setChainOfCustodyLackOfResponsiveness5(Boolean chainOfCustodyLackOfResponsiveness5) {
        this.chainOfCustodyLackOfResponsiveness5 = chainOfCustodyLackOfResponsiveness5;
    }

    public Boolean getChainOfCustodyLackOfResponsiveness6() {
        return chainOfCustodyLackOfResponsiveness6;
    }

    public void setChainOfCustodyLackOfResponsiveness6(Boolean chainOfCustodyLackOfResponsiveness6) {
        this.chainOfCustodyLackOfResponsiveness6 = chainOfCustodyLackOfResponsiveness6;
    }

    public Boolean getChainOfCustodyComplexity1() {
        return chainOfCustodyComplexity1;
    }

    public void setChainOfCustodyComplexity1(Boolean chainOfCustodyComplexity1) {
        this.chainOfCustodyComplexity1 = chainOfCustodyComplexity1;
    }

    public Boolean getChainOfCustodyComplexity2() {
        return chainOfCustodyComplexity2;
    }

    public void setChainOfCustodyComplexity2(Boolean chainOfCustodyComplexity2) {
        this.chainOfCustodyComplexity2 = chainOfCustodyComplexity2;
    }

    public Boolean getChainOfCustodyComplexity3() {
        return chainOfCustodyComplexity3;
    }

    public void setChainOfCustodyComplexity3(Boolean chainOfCustodyComplexity3) {
        this.chainOfCustodyComplexity3 = chainOfCustodyComplexity3;
    }

    public Boolean getChainOfCustodyComplexity4() {
        return chainOfCustodyComplexity4;
    }

    public void setChainOfCustodyComplexity4(Boolean chainOfCustodyComplexity4) {
        this.chainOfCustodyComplexity4 = chainOfCustodyComplexity4;
    }

    public Boolean getChainOfCustodyComplexity5() {
        return chainOfCustodyComplexity5;
    }

    public void setChainOfCustodyComplexity5(Boolean chainOfCustodyComplexity5) {
        this.chainOfCustodyComplexity5 = chainOfCustodyComplexity5;
    }

    public Boolean getChainOfCustodyComplexity6() {
        return chainOfCustodyComplexity6;
    }

    public void setChainOfCustodyComplexity6(Boolean chainOfCustodyComplexity6) {
        this.chainOfCustodyComplexity6 = chainOfCustodyComplexity6;
    }

    public Boolean getChainOfCustodyNoFSCMarketDemand1() {
        return chainOfCustodyNoFSCMarketDemand1;
    }

    public void setChainOfCustodyNoFSCMarketDemand1(Boolean chainOfCustodyNoFSCMarketDemand1) {
        this.chainOfCustodyNoFSCMarketDemand1 = chainOfCustodyNoFSCMarketDemand1;
    }

    public Boolean getChainOfCustodyNoFSCMarketDemand2() {
        return chainOfCustodyNoFSCMarketDemand2;
    }

    public void setChainOfCustodyNoFSCMarketDemand2(Boolean chainOfCustodyNoFSCMarketDemand2) {
        this.chainOfCustodyNoFSCMarketDemand2 = chainOfCustodyNoFSCMarketDemand2;
    }

    public Boolean getChainOfCustodyNoFSCMarketDemand3() {
        return chainOfCustodyNoFSCMarketDemand3;
    }

    public void setChainOfCustodyNoFSCMarketDemand3(Boolean chainOfCustodyNoFSCMarketDemand3) {
        this.chainOfCustodyNoFSCMarketDemand3 = chainOfCustodyNoFSCMarketDemand3;
    }

    public Boolean getChainOfCustodyNoFSCMarketDemand4() {
        return chainOfCustodyNoFSCMarketDemand4;
    }

    public void setChainOfCustodyNoFSCMarketDemand4(Boolean chainOfCustodyNoFSCMarketDemand4) {
        this.chainOfCustodyNoFSCMarketDemand4 = chainOfCustodyNoFSCMarketDemand4;
    }

    public Boolean getChainOfCustodyNoFSCMarketDemand5() {
        return chainOfCustodyNoFSCMarketDemand5;
    }

    public void setChainOfCustodyNoFSCMarketDemand5(Boolean chainOfCustodyNoFSCMarketDemand5) {
        this.chainOfCustodyNoFSCMarketDemand5 = chainOfCustodyNoFSCMarketDemand5;
    }

    public Boolean getChainOfCustodyNoFSCMarketDemand6() {
        return chainOfCustodyNoFSCMarketDemand6;
    }

    public void setChainOfCustodyNoFSCMarketDemand6(Boolean chainOfCustodyNoFSCMarketDemand6) {
        this.chainOfCustodyNoFSCMarketDemand6 = chainOfCustodyNoFSCMarketDemand6;
    }

    public Boolean getChainOfCustodyUncertainty1() {
        return chainOfCustodyUncertainty1;
    }

    public void setChainOfCustodyUncertainty1(Boolean chainOfCustodyUncertainty1) {
        this.chainOfCustodyUncertainty1 = chainOfCustodyUncertainty1;
    }

    public Boolean getChainOfCustodyUncertainty2() {
        return chainOfCustodyUncertainty2;
    }

    public void setChainOfCustodyUncertainty2(Boolean chainOfCustodyUncertainty2) {
        this.chainOfCustodyUncertainty2 = chainOfCustodyUncertainty2;
    }

    public Boolean getChainOfCustodyUncertainty3() {
        return chainOfCustodyUncertainty3;
    }

    public void setChainOfCustodyUncertainty3(Boolean chainOfCustodyUncertainty3) {
        this.chainOfCustodyUncertainty3 = chainOfCustodyUncertainty3;
    }

    public Boolean getChainOfCustodyUncertainty4() {
        return chainOfCustodyUncertainty4;
    }

    public void setChainOfCustodyUncertainty4(Boolean chainOfCustodyUncertainty4) {
        this.chainOfCustodyUncertainty4 = chainOfCustodyUncertainty4;
    }

    public Boolean getChainOfCustodyUncertainty5() {
        return chainOfCustodyUncertainty5;
    }

    public void setChainOfCustodyUncertainty5(Boolean chainOfCustodyUncertainty5) {
        this.chainOfCustodyUncertainty5 = chainOfCustodyUncertainty5;
    }

    public Boolean getChainOfCustodyUncertainty6() {
        return chainOfCustodyUncertainty6;
    }

    public void setChainOfCustodyUncertainty6(Boolean chainOfCustodyUncertainty6) {
        this.chainOfCustodyUncertainty6 = chainOfCustodyUncertainty6;
    }

    public Boolean getChainOfCustodyLackoffscsupply1() {
        return chainOfCustodyLackoffscsupply1;
    }

    public void setChainOfCustodyLackoffscsupply1(Boolean chainOfCustodyLackoffscsupply1) {
        this.chainOfCustodyLackoffscsupply1 = chainOfCustodyLackoffscsupply1;
    }

    public Boolean getChainOfCustodyLackoffscsupply2() {
        return chainOfCustodyLackoffscsupply2;
    }

    public void setChainOfCustodyLackoffscsupply2(Boolean chainOfCustodyLackoffscsupply2) {
        this.chainOfCustodyLackoffscsupply2 = chainOfCustodyLackoffscsupply2;
    }

    public Boolean getChainOfCustodyLackoffscsupply3() {
        return chainOfCustodyLackoffscsupply3;
    }

    public void setChainOfCustodyLackoffscsupply3(Boolean chainOfCustodyLackoffscsupply3) {
        this.chainOfCustodyLackoffscsupply3 = chainOfCustodyLackoffscsupply3;
    }

    public Boolean getChainOfCustodyLackoffscsupply4() {
        return chainOfCustodyLackoffscsupply4;
    }

    public void setChainOfCustodyLackoffscsupply4(Boolean chainOfCustodyLackoffscsupply4) {
        this.chainOfCustodyLackoffscsupply4 = chainOfCustodyLackoffscsupply4;
    }

    public Boolean getChainOfCustodyLackoffscsupply5() {
        return chainOfCustodyLackoffscsupply5;
    }

    public void setChainOfCustodyLackoffscsupply5(Boolean chainOfCustodyLackoffscsupply5) {
        this.chainOfCustodyLackoffscsupply5 = chainOfCustodyLackoffscsupply5;
    }

    public Boolean getChainOfCustodyLackoffscsupply6() {
        return chainOfCustodyLackoffscsupply6;
    }

    public void setChainOfCustodyLackoffscsupply6(Boolean chainOfCustodyLackoffscsupply6) {
        this.chainOfCustodyLackoffscsupply6 = chainOfCustodyLackoffscsupply6;
    }

    public Boolean getChainOfCustodyInconsistentapproaches1() {
        return chainOfCustodyInconsistentapproaches1;
    }

    public void setChainOfCustodyInconsistentapproaches1(Boolean chainOfCustodyInconsistentapproaches1) {
        this.chainOfCustodyInconsistentapproaches1 = chainOfCustodyInconsistentapproaches1;
    }

    public Boolean getChainOfCustodyInconsistentapproaches2() {
        return chainOfCustodyInconsistentapproaches2;
    }

    public void setChainOfCustodyInconsistentapproaches2(Boolean chainOfCustodyInconsistentapproaches2) {
        this.chainOfCustodyInconsistentapproaches2 = chainOfCustodyInconsistentapproaches2;
    }

    public Boolean getChainOfCustodyInconsistentapproaches3() {
        return chainOfCustodyInconsistentapproaches3;
    }

    public void setChainOfCustodyInconsistentapproaches3(Boolean chainOfCustodyInconsistentapproaches3) {
        this.chainOfCustodyInconsistentapproaches3 = chainOfCustodyInconsistentapproaches3;
    }

    public Boolean getChainOfCustodyInconsistentapproaches4() {
        return chainOfCustodyInconsistentapproaches4;
    }

    public void setChainOfCustodyInconsistentapproaches4(Boolean chainOfCustodyInconsistentapproaches4) {
        this.chainOfCustodyInconsistentapproaches4 = chainOfCustodyInconsistentapproaches4;
    }

    public Boolean getChainOfCustodyInconsistentapproaches5() {
        return chainOfCustodyInconsistentapproaches5;
    }

    public void setChainOfCustodyInconsistentapproaches5(Boolean chainOfCustodyInconsistentapproaches5) {
        this.chainOfCustodyInconsistentapproaches5 = chainOfCustodyInconsistentapproaches5;
    }

    public Boolean getChainOfCustodyInconsistentapproaches6() {
        return chainOfCustodyInconsistentapproaches6;
    }

    public void setChainOfCustodyInconsistentapproaches6(Boolean chainOfCustodyInconsistentapproaches6) {
        this.chainOfCustodyInconsistentapproaches6 = chainOfCustodyInconsistentapproaches6;
    }

    public Boolean getChainOfCustodyOther1() {
        return chainOfCustodyOther1;
    }

    public void setChainOfCustodyOther1(Boolean chainOfCustodyOther1) {
        this.chainOfCustodyOther1 = chainOfCustodyOther1;
    }

    public Boolean getChainOfCustodyOther2() {
        return chainOfCustodyOther2;
    }

    public void setChainOfCustodyOther2(Boolean chainOfCustodyOther2) {
        this.chainOfCustodyOther2 = chainOfCustodyOther2;
    }

    public Boolean getChainOfCustodyOther3() {
        return chainOfCustodyOther3;
    }

    public void setChainOfCustodyOther3(Boolean chainOfCustodyOther3) {
        this.chainOfCustodyOther3 = chainOfCustodyOther3;
    }

    public Boolean getChainOfCustodyOther4() {
        return chainOfCustodyOther4;
    }

    public void setChainOfCustodyOther4(Boolean chainOfCustodyOther4) {
        this.chainOfCustodyOther4 = chainOfCustodyOther4;
    }

    public Boolean getChainOfCustodyOther5() {
        return chainOfCustodyOther5;
    }

    public void setChainOfCustodyOther5(Boolean chainOfCustodyOther5) {
        this.chainOfCustodyOther5 = chainOfCustodyOther5;
    }

    public Boolean getChainOfCustodyOther6() {
        return chainOfCustodyOther6;
    }

    public void setChainOfCustodyOther6(Boolean chainOfCustodyOther6) {
        this.chainOfCustodyOther6 = chainOfCustodyOther6;
    }
}

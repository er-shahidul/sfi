package com.rbs.sfi.core.entities;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="sfi_pp_forms")
public class Cs8
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="cs8_productSegmentWoodProducts", nullable=true)
	private Boolean cs8ProductSegmentWoodProducts;

	@Column(name="cs8_productSegmentPrintingWritingPaper", nullable=true)
	private Boolean cs8ProductSegmentPrintingWritingPaper;

	@Column(name="cs8_productSegmentPackaging", nullable=true)
	private Boolean cs8ProductSegmentPackaging;

	@Column(name="cs8_productSegmentBioenergy", nullable=true)
	private Boolean cs8ProductSegmentBioenergy;

	@Column(name="cs8_productSegmentOther", nullable=true)
	private Boolean cs8ProductSegmentOther;

	@Column(name="cs8_productSegmentOtherExplain", nullable=true)
	private String cs8ProductSegmentOtherExplain;

	@Column(name="cs8_proofPoint", nullable=true)
	private String cs8ProofPoint;

	@Column(name="cs8_enhancedCorporate", nullable=true)
	private String cs8EnhancedCorporate;

	@Column(name="cs8_demonstrateOrganizationSustainability", nullable=true)
	private String cs8DemonstrateOrganizationSustainability;

	@Column(name="cs8_demonstrateCustomerSustainability", nullable=true)
	private String cs8DemonstrateCustomerSustainability;

	@Column(name="cs8_enhancedMarketing", nullable=true)
	private String cs8EnhancedMarketing;

	@Column(name="cs8_alignmentLegal", nullable=true)
	private String cs8AlignmentLegal;

	@Column(name="cs8_riskManagementTool", nullable=true)
	private String cs8RiskManagementTool;

	@Column(name="cs8_toolToAddressPressures", nullable=true)
	private String cs8ToolToAddressPressures;

	@Column(name="cs8_improve", nullable=true)
	private String cs8Improve;

	@Column(name="cs8_productSegmentTowelTissue", nullable=true)
	private Boolean cs8ProductSegmentTowelTissue;

	@Column(name="cs8_deforestationConcerns", nullable=true)
	private Boolean cs8DeforestationConcerns;

	@Column(name="cs8_deforestationConcerns_data", nullable=true)
	private Boolean cs8DeforestationConcernsData;

	@Column(name="cs8_deforestationConcerns_data_explain", nullable=true)
	private String cs8DeforestationConcernsDataExplain;

	@Column(name="cs8_deforestationConcerns_reports", nullable=true)
	private Boolean cs8DeforestationConcernsReports;

	@Column(name="cs8_deforestationConcerns_reports_explain", nullable=true)
	private String cs8DeforestationConcernsReportsExplain;

	@Column(name="cs8_deforestationConcerns_studies", nullable=true)
	private Boolean cs8DeforestationConcernsStudies;

	@Column(name="cs8_deforestationConcerns_studies_explain", nullable=true)
	private String cs8DeforestationConcernsStudiesExplain;

	@Column(name="cs8_deforestationConcerns_other", nullable=true)
	private Boolean cs8DeforestationConcernsOther;

	@Column(name="cs8_deforestationConcerns_other_explain", nullable=true)
	private String cs8DeforestationConcernsOtherExplain;

	@Column(name="cs8_demandDeveloping_1", nullable=true)
	private String cs8DemandDeveloping1;

	@Column(name="cs8_demandDeveloping_2", nullable=true)
	private String cs8DemandDeveloping2;

	@Column(name="cs8_demandDeveloping_3", nullable=true)
	private String cs8DemandDeveloping3;

	@Column(name="cs8_demandDeveloping_4", nullable=true)
	private String cs8DemandDeveloping4;

	@Column(name="cs8_demandDeveloping_5", nullable=true)
	private String cs8DemandDeveloping5;

	@Column(name="cs8_demandDeveloping_6", nullable=true)
	private String cs8DemandDeveloping6;

	@Column(name="cs8_demandDeveloping_why_1", nullable=true)
	private String cs8DemandDevelopingWhy1;

	@Column(name="cs8_demandDeveloping_why_2", nullable=true)
	private String cs8DemandDevelopingWhy2;

	@Column(name="cs8_demandDeveloping_why_3", nullable=true)
	private String cs8DemandDevelopingWhy3;

	@Column(name="cs8_demandDeveloping_why_4", nullable=true)
	private String cs8DemandDevelopingWhy4;

	@Column(name="cs8_demandDeveloping_why_5", nullable=true)
	private String cs8DemandDevelopingWhy5;

	@Column(name="cs8_demandDeveloping_why_6", nullable=true)
	private String cs8DemandDevelopingWhy6;

	@Column(name="cs8_sfiLabelProductGroupContain_1", nullable=true)
	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<String> cs8SfiLabelProductGroupContain1;

	@Column(name="cs8_sfiLabelProductGroupContain_2", nullable=true)
	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<String> cs8SfiLabelProductGroupContain2;

	@Column(name="cs8_sfiLabelProductGroupContain_3", nullable=true)
	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<String> cs8SfiLabelProductGroupContain3;

	@Column(name="cs8_sfiLabelProductGroupContain_4", nullable=true)
	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<String> cs8SfiLabelProductGroupContain4;

	@Column(name="cs8_sfiLabelProductGroupContain_5", nullable=true)
	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<String> cs8SfiLabelProductGroupContain5;

	@Column(name="cs8_sfiLabelProductGroupContain_6", nullable=true)
	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<String> cs8SfiLabelProductGroupContain6;

	@Column(name="cs8_alsoFSCLabel_1", nullable=true)
	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<String> cs8_alsoFSCLabel_1;

	@Column(name="cs8_alsoFSCLabel_2", nullable=true)
	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<String> cs8_alsoFSCLabel_2;

	@Column(name="cs8_alsoFSCLabel_3", nullable=true)
	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<String> cs8_alsoFSCLabel_3;

	@Column(name="cs8_alsoFSCLabel_4", nullable=true)
	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<String> cs8_alsoFSCLabel_4;

	@Column(name="cs8_alsoFSCLabel_5", nullable=true)
	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<String> cs8_alsoFSCLabel_5;

	@Column(name="cs8_alsoFSCLabel_6", nullable=true)
	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<String> cs8_alsoFSCLabel_6;

	@Column(name="cs8_sfiCertifiedForestContent_1", nullable=true)
	private String cs8SfiCertifiedForestContent1;

	@Column(name="cs8_sfiCertifiedForestContent_2", nullable=true)
	private String cs8SfiCertifiedForestContent2;

	@Column(name="cs8_sfiCertifiedForestContent_3", nullable=true)
	private String cs8SfiCertifiedForestContent3;

	@Column(name="cs8_sfiCertifiedForestContent_4", nullable=true)
	private String cs8SfiCertifiedForestContent4;

	@Column(name="cs8_sfiCertifiedForestContent_5", nullable=true)
	private String cs8SfiCertifiedForestContent5;

	@Column(name="cs8_sfiCertifiedForestContent_6", nullable=true)
	private String cs8SfiCertifiedForestContent6;

	@Column(name="cs8_sfiCertifiedForestContent_why_1", nullable=true)
	private String cs8SfiCertifiedForestContentWhy1;

	@Column(name="cs8_sfiCertifiedForestContent_why_2", nullable=true)
	private String cs8SfiCertifiedForestContentWhy2;

	@Column(name="cs8_sfiCertifiedForestContent_why_3", nullable=true)
	private String cs8SfiCertifiedForestContentWhy3;

	@Column(name="cs8_sfiCertifiedForestContent_why_4", nullable=true)
	private String cs8SfiCertifiedForestContentWhy4;

	@Column(name="cs8_sfiCertifiedForestContent_why_5", nullable=true)
	private String cs8SfiCertifiedForestContentWhy5;

	@Column(name="cs8_sfiCertifiedForestContent_why_6", nullable=true)
	private String cs8SfiCertifiedForestContentWhy6;

	@Column(name="cs8_demandSFICertified_1", nullable=true)
	private String cs8DemandSFICertified1;

	@Column(name="cs8_demandSFICertified_2", nullable=true)
	private String cs8DemandSFICertified2;

	@Column(name="cs8_demandSFICertified_3", nullable=true)
	private String cs8DemandSFICertified3;

	@Column(name="cs8_demandSFICertified_4", nullable=true)
	private String cs8DemandSFICertified4;

	@Column(name="cs8_demandSFICertified_5", nullable=true)
	private String cs8DemandSFICertified5;

	@Column(name="cs8_demandSFICertified_6", nullable=true)
	private String cs8DemandSFICertified6;

	@Column(name="cs8_demandSFICertified_why_1", nullable=true)
	private String cs8DemandSFICertifiedWhy1;

	@Column(name="cs8_demandSFICertified_why_2", nullable=true)
	private String cs8DemandSFICertifiedWhy2;

	@Column(name="cs8_demandSFICertified_why_3", nullable=true)
	private String cs8DemandSFICertifiedWhy3;

	@Column(name="cs8_demandSFICertified_why_4", nullable=true)
	private String cs8DemandSFICertifiedWhy4;

	@Column(name="cs8_demandSFICertified_why_5", nullable=true)
	private String cs8DemandSFICertifiedWhy5;

	@Column(name="cs8_demandSFICertified_why_6", nullable=true)
	private String cs8DemandSFICertifiedWhy6;

	@Column(name="cs8_FSCCertification_1", nullable=true)
	private String cs8FSCCertification1;

	@Column(name="cs8_FSCCertification_2", nullable=true)
	private String cs8FSCCertification2;

	@Column(name="cs8_FSCCertification_3", nullable=true)
	private String cs8FSCCertification3;

	@Column(name="cs8_FSCCertification_4", nullable=true)
	private String cs8FSCCertification4;

	@Column(name="cs8_FSCCertification_5", nullable=true)
	private String cs8FSCCertification5;

	@Column(name="cs8_FSCCertification_6", nullable=true)
	private String cs8FSCCertification6;

	@Column(name="cs8_fscCertification_explain_1", nullable=true)
	private String cs8FscCertificationExplain1;

	@Column(name="cs8_fscCertification_explain_2", nullable=true)
	private String cs8FscCertificationExplain2;

	@Column(name="cs8_fscCertification_explain_3", nullable=true)
	private String cs8FscCertificationExplain3;

	@Column(name="cs8_fscCertification_explain_4", nullable=true)
	private String cs8FscCertificationExplain4;

	@Column(name="cs8_fscCertification_explain_5", nullable=true)
	private String cs8FscCertificationExplain5;

	@Column(name="cs8_fscCertification_explain_6", nullable=true)
	private String cs8FscCertificationExplain6;

	@Column(name="cs8_cost_1", nullable=true)
	private Boolean cs8Cost1;

	@Column(name="cs8_cost_2", nullable=true)
	private Boolean cs8Cost2;

	@Column(name="cs8_cost_3", nullable=true)
	private Boolean cs8Cost3;

	@Column(name="cs8_cost_4", nullable=true)
	private Boolean cs8Cost4;

	@Column(name="cs8_cost_5", nullable=true)
	private Boolean cs8Cost5;

	@Column(name="cs8_cost_6", nullable=true)
	private Boolean cs8Cost6;

	@Column(name="cs8_lackOfResponsiveness_1", nullable=true)
	private Boolean cs8LackOfResponsiveness1;

	@Column(name="cs8_lackOfResponsiveness_2", nullable=true)
	private Boolean cs8LackOfResponsiveness2;

	@Column(name="cs8_lackOfResponsiveness_3", nullable=true)
	private Boolean cs8LackOfResponsiveness3;

	@Column(name="cs8_lackOfResponsiveness_4", nullable=true)
	private Boolean cs8LackOfResponsiveness4;

	@Column(name="cs8_lackOfResponsiveness_5", nullable=true)
	private Boolean cs8LackOfResponsiveness5;

	@Column(name="cs8_lackOfResponsiveness_6", nullable=true)
	private Boolean cs8LackOfResponsiveness6;

	@Column(name="cs8_complexity_1", nullable=true)
	private Boolean cs8Complexity1;

	@Column(name="cs8_complexity_2", nullable=true)
	private Boolean cs8Complexity2;

	@Column(name="cs8_complexity_3", nullable=true)
	private Boolean cs8Complexity3;

	@Column(name="cs8_complexity_4", nullable=true)
	private Boolean cs8Complexity4;

	@Column(name="cs8_complexity_5", nullable=true)
	private Boolean cs8Complexity5;

	@Column(name="cs8_complexity_6", nullable=true)
	private Boolean cs8Complexity6;

	@Column(name="cs8_noFSCMarketDemand_1", nullable=true)
	private Boolean cs8NoFSCMarketDemand1;

	@Column(name="cs8_noFSCMarketDemand_2", nullable=true)
	private Boolean cs8NoFSCMarketDemand2;

	@Column(name="cs8_noFSCMarketDemand_3", nullable=true)
	private Boolean cs8NoFSCMarketDemand3;

	@Column(name="cs8_noFSCMarketDemand_4", nullable=true)
	private Boolean cs8NoFSCMarketDemand4;

	@Column(name="cs8_noFSCMarketDemand_5", nullable=true)
	private Boolean cs8NoFSCMarketDemand5;

	@Column(name="cs8_noFSCMarketDemand_6", nullable=true)
	private Boolean cs8NoFSCMarketDemand6;

	@Column(name="cs8_uncertainty_1", nullable=true)
	private Boolean cs8Uncertainty1;

	@Column(name="cs8_uncertainty_2", nullable=true)
	private Boolean cs8Uncertainty2;

	@Column(name="cs8_uncertainty_3", nullable=true)
	private Boolean cs8Uncertainty3;

	@Column(name="cs8_uncertainty_4", nullable=true)
	private Boolean cs8Uncertainty4;

	@Column(name="cs8_uncertainty_5", nullable=true)
	private Boolean cs8Uncertainty5;

	@Column(name="cs8_uncertainty_6", nullable=true)
	private Boolean cs8Uncertainty6;

	@Column(name="cs8_lackOfFSCSupply_1", nullable=true)
	private Boolean cs8Lackoffscsupply1;

	@Column(name="cs8_lackOfFSCSupply_2", nullable=true)
	private Boolean cs8Lackoffscsupply2;

	@Column(name="cs8_lackOfFSCSupply_3", nullable=true)
	private Boolean cs8Lackoffscsupply3;

	@Column(name="cs8_lackOfFSCSupply_4", nullable=true)
	private Boolean cs8Lackoffscsupply4;

	@Column(name="cs8_lackOfFSCSupply_5", nullable=true)
	private Boolean cs8Lackoffscsupply5;

	@Column(name="cs8_lackOfFSCSupply_6", nullable=true)
	private Boolean cs8Lackoffscsupply6;

	@Column(name="cs8_inconsistentApproaches_1", nullable=true)
	private Boolean cs8Inconsistentapproaches1;

	@Column(name="cs8_inconsistentApproaches_2", nullable=true)
	private Boolean cs8Inconsistentapproaches2;

	@Column(name="cs8_inconsistentApproaches_3", nullable=true)
	private Boolean cs8Inconsistentapproaches3;

	@Column(name="cs8_inconsistentApproaches_4", nullable=true)
	private Boolean cs8Inconsistentapproaches4;

	@Column(name="cs8_inconsistentApproaches_5", nullable=true)
	private Boolean cs8Inconsistentapproaches5;

	@Column(name="cs8_inconsistentApproaches_6", nullable=true)
	private Boolean cs8Inconsistentapproaches6;

	@Column(name="cs8_other_1", nullable=true)
	private Boolean cs8Other1;

	@Column(name="cs8_other_2", nullable=true)
	private Boolean cs8Other2;

	@Column(name="cs8_other_3", nullable=true)
	private Boolean cs8Other3;

	@Column(name="cs8_other_4", nullable=true)
	private Boolean cs8Other4;

	@Column(name="cs8_other_5", nullable=true)
	private Boolean cs8Other5;

	@Column(name="cs8_other_6", nullable=true)
	private Boolean cs8Other6;

	@Column(name="cs8_ChainOfCustody_FSCCertification_1", nullable=true)
	private String cs8ChainOfCustodyFSCCertification1;

	@Column(name="cs8_ChainOfCustody_FSCCertification_2", nullable=true)
	private String cs8ChainOfCustodyFSCCertification2;

	@Column(name="cs8_ChainOfCustody_FSCCertification_3", nullable=true)
	private String cs8ChainOfCustodyFSCCertification3;

	@Column(name="cs8_ChainOfCustody_FSCCertification_4", nullable=true)
	private String cs8ChainOfCustodyFSCCertification4;

	@Column(name="cs8_ChainOfCustody_FSCCertification_5", nullable=true)
	private String cs8ChainOfCustodyFSCCertification5;

	@Column(name="cs8_ChainOfCustody_FSCCertification_6", nullable=true)
	private String cs8ChainOfCustodyFSCCertification6;

	@Column(name="cs8_ChainOfCustody_fscCertification_explain_1", nullable=true)
	private String cs8ChainOfCustodyFscCertificationExplain1;

	@Column(name="cs8_ChainOfCustody_fscCertification_explain_2", nullable=true)
	private String cs8ChainOfCustodyFscCertificationExplain2;

	@Column(name="cs8_ChainOfCustody_fscCertification_explain_3", nullable=true)
	private String cs8ChainOfCustodyFscCertificationExplain3;

	@Column(name="cs8_ChainOfCustody_fscCertification_explain_4", nullable=true)
	private String cs8ChainOfCustodyFscCertificationExplain4;

	@Column(name="cs8_ChainOfCustody_fscCertification_explain_5", nullable=true)
	private String cs8ChainOfCustodyFscCertificationExplain5;

	@Column(name="cs8_ChainOfCustody_fscCertification_explain_6", nullable=true)
	private String cs8ChainOfCustodyFscCertificationExplain6;

	@Column(name="cs8_ChainOfCustody_cost_1", nullable=true)
	private Boolean cs8ChainOfCustodyCost1;

	@Column(name="cs8_ChainOfCustody_cost_2", nullable=true)
	private Boolean cs8ChainOfCustodyCost2;

	@Column(name="cs8_ChainOfCustody_cost_3", nullable=true)
	private Boolean cs8ChainOfCustodyCost3;

	@Column(name="cs8_ChainOfCustody_cost_4", nullable=true)
	private Boolean cs8ChainOfCustodyCost4;

	@Column(name="cs8_ChainOfCustody_cost_5", nullable=true)
	private Boolean cs8ChainOfCustodyCost5;

	@Column(name="cs8_ChainOfCustody_cost_6", nullable=true)
	private Boolean cs8ChainOfCustodyCost6;

	@Column(name="cs8_ChainOfCustody_lackOfResponsiveness_1", nullable=true)
	private Boolean cs8ChainOfCustodyLackOfResponsiveness1;

	@Column(name="cs8_ChainOfCustody_lackOfResponsiveness_2", nullable=true)
	private Boolean cs8ChainOfCustodyLackOfResponsiveness2;

	@Column(name="cs8_ChainOfCustody_lackOfResponsiveness_3", nullable=true)
	private Boolean cs8ChainOfCustodyLackOfResponsiveness3;

	@Column(name="cs8_ChainOfCustody_lackOfResponsiveness_4", nullable=true)
	private Boolean cs8ChainOfCustodyLackOfResponsiveness4;

	@Column(name="cs8_ChainOfCustody_lackOfResponsiveness_5", nullable=true)
	private Boolean cs8ChainOfCustodyLackOfResponsiveness5;

	@Column(name="cs8_ChainOfCustody_lackOfResponsiveness_6", nullable=true)
	private Boolean cs8ChainOfCustodyLackOfResponsiveness6;

	@Column(name="cs8_ChainOfCustody_complexity_1", nullable=true)
	private Boolean cs8ChainOfCustodyComplexity1;

	@Column(name="cs8_ChainOfCustody_complexity_2", nullable=true)
	private Boolean cs8ChainOfCustodyComplexity2;

	@Column(name="cs8_ChainOfCustody_complexity_3", nullable=true)
	private Boolean cs8ChainOfCustodyComplexity3;

	@Column(name="cs8_ChainOfCustody_complexity_4", nullable=true)
	private Boolean cs8ChainOfCustodyComplexity4;

	@Column(name="cs8_ChainOfCustody_complexity_5", nullable=true)
	private Boolean cs8ChainOfCustodyComplexity5;

	@Column(name="cs8_ChainOfCustody_complexity_6", nullable=true)
	private Boolean cs8ChainOfCustodyComplexity6;

	@Column(name="cs8_ChainOfCustody_noFSCMarketDemand_1", nullable=true)
	private Boolean cs8ChainOfCustodyNoFSCMarketDemand1;

	@Column(name="cs8_ChainOfCustody_noFSCMarketDemand_2", nullable=true)
	private Boolean cs8ChainOfCustodyNoFSCMarketDemand2;

	@Column(name="cs8_ChainOfCustody_noFSCMarketDemand_3", nullable=true)
	private Boolean cs8ChainOfCustodyNoFSCMarketDemand3;

	@Column(name="cs8_ChainOfCustody_noFSCMarketDemand_4", nullable=true)
	private Boolean cs8ChainOfCustodyNoFSCMarketDemand4;

	@Column(name="cs8_ChainOfCustody_noFSCMarketDemand_5", nullable=true)
	private Boolean cs8ChainOfCustodyNoFSCMarketDemand5;

	@Column(name="cs8_ChainOfCustody_noFSCMarketDemand_6", nullable=true)
	private Boolean cs8ChainOfCustodyNoFSCMarketDemand6;

	@Column(name="cs8_ChainOfCustody_uncertainty_1", nullable=true)
	private Boolean cs8ChainOfCustodyUncertainty1;

	@Column(name="cs8_ChainOfCustody_uncertainty_2", nullable=true)
	private Boolean cs8ChainOfCustodyUncertainty2;

	@Column(name="cs8_ChainOfCustody_uncertainty_3", nullable=true)
	private Boolean cs8ChainOfCustodyUncertainty3;

	@Column(name="cs8_ChainOfCustody_uncertainty_4", nullable=true)
	private Boolean cs8ChainOfCustodyUncertainty4;

	@Column(name="cs8_ChainOfCustody_uncertainty_5", nullable=true)
	private Boolean cs8ChainOfCustodyUncertainty5;

	@Column(name="cs8_ChainOfCustody_uncertainty_6", nullable=true)
	private Boolean cs8ChainOfCustodyUncertainty6;

	@Column(name="cs8_ChainOfCustody_lackOfFSCSupply_1", nullable=true)
	private Boolean cs8ChainOfCustodyLackoffscsupply1;

	@Column(name="cs8_ChainOfCustody_lackOfFSCSupply_2", nullable=true)
	private Boolean cs8ChainOfCustodyLackoffscsupply2;

	@Column(name="cs8_ChainOfCustody_lackOfFSCSupply_3", nullable=true)
	private Boolean cs8ChainOfCustodyLackoffscsupply3;

	@Column(name="cs8_ChainOfCustody_lackOfFSCSupply_4", nullable=true)
	private Boolean cs8ChainOfCustodyLackoffscsupply4;

	@Column(name="cs8_ChainOfCustody_lackOfFSCSupply_5", nullable=true)
	private Boolean cs8ChainOfCustodyLackoffscsupply5;

	@Column(name="cs8_ChainOfCustody_lackOfFSCSupply_6", nullable=true)
	private Boolean cs8ChainOfCustodyLackoffscsupply6;

	@Column(name="cs8_ChainOfCustody_inconsistentApproaches_1", nullable=true)
	private Boolean cs8ChainOfCustodyInconsistentapproaches1;

	@Column(name="cs8_ChainOfCustody_inconsistentApproaches_2", nullable=true)
	private Boolean cs8ChainOfCustodyInconsistentapproaches2;

	@Column(name="cs8_ChainOfCustody_inconsistentApproaches_3", nullable=true)
	private Boolean cs8ChainOfCustodyInconsistentapproaches3;

	@Column(name="cs8_ChainOfCustody_inconsistentApproaches_4", nullable=true)
	private Boolean cs8ChainOfCustodyInconsistentapproaches4;

	@Column(name="cs8_ChainOfCustody_inconsistentApproaches_5", nullable=true)
	private Boolean cs8ChainOfCustodyInconsistentapproaches5;

	@Column(name="cs8_ChainOfCustody_inconsistentApproaches_6", nullable=true)
	private Boolean cs8ChainOfCustodyInconsistentapproaches6;

	@Column(name="cs8_ChainOfCustody_other_1", nullable=true)
	private Boolean cs8ChainOfCustodyOther1;

	@Column(name="cs8_ChainOfCustody_other_2", nullable=true)
	private Boolean cs8ChainOfCustodyOther2;

	@Column(name="cs8_ChainOfCustody_other_3", nullable=true)
	private Boolean cs8ChainOfCustodyOther3;

	@Column(name="cs8_ChainOfCustody_other_4", nullable=true)
	private Boolean cs8ChainOfCustodyOther4;

	@Column(name="cs8_ChainOfCustody_other_5", nullable=true)
	private Boolean cs8ChainOfCustodyOther5;

	@Column(name="cs8_ChainOfCustody_other_6", nullable=true)
	private Boolean cs8ChainOfCustodyOther6;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean isCs8ProductSegmentWoodProducts() {
		return cs8ProductSegmentWoodProducts;
	}

	public void setCs8ProductSegmentWoodProducts(Boolean cs8ProductSegmentWoodProducts) {
		this.cs8ProductSegmentWoodProducts = cs8ProductSegmentWoodProducts;
	}

	public Boolean isCs8ProductSegmentPrintingWritingPaper() {
		return cs8ProductSegmentPrintingWritingPaper;
	}

	public void setCs8ProductSegmentPrintingWritingPaper(Boolean cs8ProductSegmentPrintingWritingPaper) {
		this.cs8ProductSegmentPrintingWritingPaper = cs8ProductSegmentPrintingWritingPaper;
	}

	public Boolean isCs8ProductSegmentPackaging() {
		return cs8ProductSegmentPackaging;
	}

	public void setCs8ProductSegmentPackaging(Boolean cs8ProductSegmentPackaging) {
		this.cs8ProductSegmentPackaging = cs8ProductSegmentPackaging;
	}

	public Boolean isCs8ProductSegmentBioenergy() {
		return cs8ProductSegmentBioenergy;
	}

	public void setCs8ProductSegmentBioenergy(Boolean cs8ProductSegmentBioenergy) {
		this.cs8ProductSegmentBioenergy = cs8ProductSegmentBioenergy;
	}

	public Boolean isCs8ProductSegmentOther() {
		return cs8ProductSegmentOther;
	}

	public void setCs8ProductSegmentOther(Boolean cs8ProductSegmentOther) {
		this.cs8ProductSegmentOther = cs8ProductSegmentOther;
	}

	public String getCs8ProductSegmentOtherExplain() {
		return cs8ProductSegmentOtherExplain;
	}

	public void setCs8ProductSegmentOtherExplain(String cs8ProductSegmentOtherExplain) {
		this.cs8ProductSegmentOtherExplain = cs8ProductSegmentOtherExplain;
	}

	public String getCs8ProofPoint() {
		return cs8ProofPoint;
	}

	public void setCs8ProofPoint(String cs8ProofPoint) {
		this.cs8ProofPoint = cs8ProofPoint;
	}

	public String getCs8EnhancedCorporate() {
		return cs8EnhancedCorporate;
	}

	public void setCs8EnhancedCorporate(String cs8EnhancedCorporate) {
		this.cs8EnhancedCorporate = cs8EnhancedCorporate;
	}

	public String getCs8DemonstrateOrganizationSustainability() {
		return cs8DemonstrateOrganizationSustainability;
	}

	public void setCs8DemonstrateOrganizationSustainability(String cs8DemonstrateOrganizationSustainability) {
		this.cs8DemonstrateOrganizationSustainability = cs8DemonstrateOrganizationSustainability;
	}

	public String getCs8DemonstrateCustomerSustainability() {
		return cs8DemonstrateCustomerSustainability;
	}

	public void setCs8DemonstrateCustomerSustainability(String cs8DemonstrateCustomerSustainability) {
		this.cs8DemonstrateCustomerSustainability = cs8DemonstrateCustomerSustainability;
	}

	public String getCs8EnhancedMarketing() {
		return cs8EnhancedMarketing;
	}

	public void setCs8EnhancedMarketing(String cs8EnhancedMarketing) {
		this.cs8EnhancedMarketing = cs8EnhancedMarketing;
	}

	public String getCs8AlignmentLegal() {
		return cs8AlignmentLegal;
	}

	public void setCs8AlignmentLegal(String cs8AlignmentLegal) {
		this.cs8AlignmentLegal = cs8AlignmentLegal;
	}

	public String getCs8RiskManagementTool() {
		return cs8RiskManagementTool;
	}

	public void setCs8RiskManagementTool(String cs8RiskManagementTool) {
		this.cs8RiskManagementTool = cs8RiskManagementTool;
	}

	public String getCs8ToolToAddressPressures() {
		return cs8ToolToAddressPressures;
	}

	public void setCs8ToolToAddressPressures(String cs8ToolToAddressPressures) {
		this.cs8ToolToAddressPressures = cs8ToolToAddressPressures;
	}

	public String getCs8Improve() {
		return cs8Improve;
	}

	public void setCs8Improve(String cs8Improve) {
		this.cs8Improve = cs8Improve;
	}

	public Boolean isCs8ProductSegmentTowelTissue() {
		return cs8ProductSegmentTowelTissue;
	}

	public void setCs8ProductSegmentTowelTissue(Boolean cs8ProductSegmentTowelTissue) {
		this.cs8ProductSegmentTowelTissue = cs8ProductSegmentTowelTissue;
	}

	public Boolean isCs8DeforestationConcerns() {
		return cs8DeforestationConcerns;
	}

	public void setCs8DeforestationConcerns(Boolean cs8DeforestationConcerns) {
		this.cs8DeforestationConcerns = cs8DeforestationConcerns;
	}

	public Boolean isCs8DeforestationConcernsData() {
		return cs8DeforestationConcernsData;
	}

	public void setCs8DeforestationConcernsData(Boolean cs8DeforestationConcernsData) {
		this.cs8DeforestationConcernsData = cs8DeforestationConcernsData;
	}

	public String getCs8DeforestationConcernsDataExplain() {
		return cs8DeforestationConcernsDataExplain;
	}

	public void setCs8DeforestationConcernsDataExplain(String cs8DeforestationConcernsDataExplain) {
		this.cs8DeforestationConcernsDataExplain = cs8DeforestationConcernsDataExplain;
	}

	public Boolean isCs8DeforestationConcernsReports() {
		return cs8DeforestationConcernsReports;
	}

	public void setCs8DeforestationConcernsReports(Boolean cs8DeforestationConcernsReports) {
		this.cs8DeforestationConcernsReports = cs8DeforestationConcernsReports;
	}

	public String getCs8DeforestationConcernsReportsExplain() {
		return cs8DeforestationConcernsReportsExplain;
	}

	public void setCs8DeforestationConcernsReportsExplain(String cs8DeforestationConcernsReportsExplain) {
		this.cs8DeforestationConcernsReportsExplain = cs8DeforestationConcernsReportsExplain;
	}

	public Boolean isCs8DeforestationConcernsStudies() {
		return cs8DeforestationConcernsStudies;
	}

	public void setCs8DeforestationConcernsStudies(Boolean cs8DeforestationConcernsStudies) {
		this.cs8DeforestationConcernsStudies = cs8DeforestationConcernsStudies;
	}

	public String getCs8DeforestationConcernsStudiesExplain() {
		return cs8DeforestationConcernsStudiesExplain;
	}

	public void setCs8DeforestationConcernsStudiesExplain(String cs8DeforestationConcernsStudiesExplain) {
		this.cs8DeforestationConcernsStudiesExplain = cs8DeforestationConcernsStudiesExplain;
	}

	public Boolean isCs8DeforestationConcernsOther() {
		return cs8DeforestationConcernsOther;
	}

	public void setCs8DeforestationConcernsOther(Boolean cs8DeforestationConcernsOther) {
		this.cs8DeforestationConcernsOther = cs8DeforestationConcernsOther;
	}

	public String getCs8DeforestationConcernsOtherExplain() {
		return cs8DeforestationConcernsOtherExplain;
	}

	public void setCs8DeforestationConcernsOtherExplain(String cs8DeforestationConcernsOtherExplain) {
		this.cs8DeforestationConcernsOtherExplain = cs8DeforestationConcernsOtherExplain;
	}

	public String getCs8DemandDeveloping1() {
		return cs8DemandDeveloping1;
	}

	public void setCs8DemandDeveloping1(String cs8DemandDeveloping1) {
		this.cs8DemandDeveloping1 = cs8DemandDeveloping1;
	}

	public String getCs8DemandDeveloping2() {
		return cs8DemandDeveloping2;
	}

	public void setCs8DemandDeveloping2(String cs8DemandDeveloping2) {
		this.cs8DemandDeveloping2 = cs8DemandDeveloping2;
	}

	public String getCs8DemandDeveloping3() {
		return cs8DemandDeveloping3;
	}

	public void setCs8DemandDeveloping3(String cs8DemandDeveloping3) {
		this.cs8DemandDeveloping3 = cs8DemandDeveloping3;
	}

	public String getCs8DemandDeveloping4() {
		return cs8DemandDeveloping4;
	}

	public void setCs8DemandDeveloping4(String cs8DemandDeveloping4) {
		this.cs8DemandDeveloping4 = cs8DemandDeveloping4;
	}

	public String getCs8DemandDeveloping5() {
		return cs8DemandDeveloping5;
	}

	public void setCs8DemandDeveloping5(String cs8DemandDeveloping5) {
		this.cs8DemandDeveloping5 = cs8DemandDeveloping5;
	}

	public String getCs8DemandDeveloping6() {
		return cs8DemandDeveloping6;
	}

	public void setCs8DemandDeveloping6(String cs8DemandDeveloping6) {
		this.cs8DemandDeveloping6 = cs8DemandDeveloping6;
	}

	public String getCs8DemandDevelopingWhy1() {
		return cs8DemandDevelopingWhy1;
	}

	public void setCs8DemandDevelopingWhy1(String cs8DemandDevelopingWhy1) {
		this.cs8DemandDevelopingWhy1 = cs8DemandDevelopingWhy1;
	}

	public String getCs8DemandDevelopingWhy2() {
		return cs8DemandDevelopingWhy2;
	}

	public void setCs8DemandDevelopingWhy2(String cs8DemandDevelopingWhy2) {
		this.cs8DemandDevelopingWhy2 = cs8DemandDevelopingWhy2;
	}

	public String getCs8DemandDevelopingWhy3() {
		return cs8DemandDevelopingWhy3;
	}

	public void setCs8DemandDevelopingWhy3(String cs8DemandDevelopingWhy3) {
		this.cs8DemandDevelopingWhy3 = cs8DemandDevelopingWhy3;
	}

	public String getCs8DemandDevelopingWhy4() {
		return cs8DemandDevelopingWhy4;
	}

	public void setCs8DemandDevelopingWhy4(String cs8DemandDevelopingWhy4) {
		this.cs8DemandDevelopingWhy4 = cs8DemandDevelopingWhy4;
	}

	public String getCs8DemandDevelopingWhy5() {
		return cs8DemandDevelopingWhy5;
	}

	public void setCs8DemandDevelopingWhy5(String cs8DemandDevelopingWhy5) {
		this.cs8DemandDevelopingWhy5 = cs8DemandDevelopingWhy5;
	}

	public String getCs8DemandDevelopingWhy6() {
		return cs8DemandDevelopingWhy6;
	}

	public void setCs8DemandDevelopingWhy6(String cs8DemandDevelopingWhy6) {
		this.cs8DemandDevelopingWhy6 = cs8DemandDevelopingWhy6;
	}

	public List<String> getCs8SfiLabelProductGroupContain1() {
		return cs8SfiLabelProductGroupContain1;
	}

	public void setCs8SfiLabelProductGroupContain1(List<String> cs8SfiLabelProductGroupContain1) {
		this.cs8SfiLabelProductGroupContain1 = cs8SfiLabelProductGroupContain1;
	}

	public List<String> getCs8SfiLabelProductGroupContain2() {
		return cs8SfiLabelProductGroupContain2;
	}

	public void setCs8SfiLabelProductGroupContain2(List<String> cs8SfiLabelProductGroupContain2) {
		this.cs8SfiLabelProductGroupContain2 = cs8SfiLabelProductGroupContain2;
	}

	public List<String> getCs8SfiLabelProductGroupContain3() {
		return cs8SfiLabelProductGroupContain3;
	}

	public void setCs8SfiLabelProductGroupContain3(List<String> cs8SfiLabelProductGroupContain3) {
		this.cs8SfiLabelProductGroupContain3 = cs8SfiLabelProductGroupContain3;
	}

	public List<String> getCs8SfiLabelProductGroupContain4() {
		return cs8SfiLabelProductGroupContain4;
	}

	public void setCs8SfiLabelProductGroupContain4(List<String> cs8SfiLabelProductGroupContain4) {
		this.cs8SfiLabelProductGroupContain4 = cs8SfiLabelProductGroupContain4;
	}

	public List<String> getCs8SfiLabelProductGroupContain5() {
		return cs8SfiLabelProductGroupContain5;
	}

	public void setCs8SfiLabelProductGroupContain5(List<String> cs8SfiLabelProductGroupContain5) {
		this.cs8SfiLabelProductGroupContain5 = cs8SfiLabelProductGroupContain5;
	}

	public List<String> getCs8SfiLabelProductGroupContain6() {
		return cs8SfiLabelProductGroupContain6;
	}

	public void setCs8SfiLabelProductGroupContain6(List<String> cs8SfiLabelProductGroupContain6) {
		this.cs8SfiLabelProductGroupContain6 = cs8SfiLabelProductGroupContain6;
	}

	public List<String> getCs8_alsoFSCLabel_1() {
		return cs8_alsoFSCLabel_1;
	}

	public void setCs8_alsoFSCLabel_1(List<String> cs8_alsoFSCLabel_1) {
		this.cs8_alsoFSCLabel_1 = cs8_alsoFSCLabel_1;
	}

	public List<String> getCs8_alsoFSCLabel_2() {
		return cs8_alsoFSCLabel_2;
	}

	public void setCs8_alsoFSCLabel_2(List<String> cs8_alsoFSCLabel_2) {
		this.cs8_alsoFSCLabel_2 = cs8_alsoFSCLabel_2;
	}

	public List<String> getCs8_alsoFSCLabel_3() {
		return cs8_alsoFSCLabel_3;
	}

	public void setCs8_alsoFSCLabel_3(List<String> cs8_alsoFSCLabel_3) {
		this.cs8_alsoFSCLabel_3 = cs8_alsoFSCLabel_3;
	}

	public List<String> getCs8_alsoFSCLabel_4() {
		return cs8_alsoFSCLabel_4;
	}

	public void setCs8_alsoFSCLabel_4(List<String> cs8_alsoFSCLabel_4) {
		this.cs8_alsoFSCLabel_4 = cs8_alsoFSCLabel_4;
	}

	public List<String> getCs8_alsoFSCLabel_5() {
		return cs8_alsoFSCLabel_5;
	}

	public void setCs8_alsoFSCLabel_5(List<String> cs8_alsoFSCLabel_5) {
		this.cs8_alsoFSCLabel_5 = cs8_alsoFSCLabel_5;
	}

	public List<String> getCs8_alsoFSCLabel_6() {
		return cs8_alsoFSCLabel_6;
	}

	public void setCs8_alsoFSCLabel_6(List<String> cs8_alsoFSCLabel_6) {
		this.cs8_alsoFSCLabel_6 = cs8_alsoFSCLabel_6;
	}

	public String getCs8SfiCertifiedForestContent1() {
		return cs8SfiCertifiedForestContent1;
	}

	public void setCs8SfiCertifiedForestContent1(String cs8SfiCertifiedForestContent1) {
		this.cs8SfiCertifiedForestContent1 = cs8SfiCertifiedForestContent1;
	}

	public String getCs8SfiCertifiedForestContent2() {
		return cs8SfiCertifiedForestContent2;
	}

	public void setCs8SfiCertifiedForestContent2(String cs8SfiCertifiedForestContent2) {
		this.cs8SfiCertifiedForestContent2 = cs8SfiCertifiedForestContent2;
	}

	public String getCs8SfiCertifiedForestContent3() {
		return cs8SfiCertifiedForestContent3;
	}

	public void setCs8SfiCertifiedForestContent3(String cs8SfiCertifiedForestContent3) {
		this.cs8SfiCertifiedForestContent3 = cs8SfiCertifiedForestContent3;
	}

	public String getCs8SfiCertifiedForestContent4() {
		return cs8SfiCertifiedForestContent4;
	}

	public void setCs8SfiCertifiedForestContent4(String cs8SfiCertifiedForestContent4) {
		this.cs8SfiCertifiedForestContent4 = cs8SfiCertifiedForestContent4;
	}

	public String getCs8SfiCertifiedForestContent5() {
		return cs8SfiCertifiedForestContent5;
	}

	public void setCs8SfiCertifiedForestContent5(String cs8SfiCertifiedForestContent5) {
		this.cs8SfiCertifiedForestContent5 = cs8SfiCertifiedForestContent5;
	}

	public String getCs8SfiCertifiedForestContent6() {
		return cs8SfiCertifiedForestContent6;
	}

	public void setCs8SfiCertifiedForestContent6(String cs8SfiCertifiedForestContent6) {
		this.cs8SfiCertifiedForestContent6 = cs8SfiCertifiedForestContent6;
	}

	public String getCs8SfiCertifiedForestContentWhy1() {
		return cs8SfiCertifiedForestContentWhy1;
	}

	public void setCs8SfiCertifiedForestContentWhy1(String cs8SfiCertifiedForestContentWhy1) {
		this.cs8SfiCertifiedForestContentWhy1 = cs8SfiCertifiedForestContentWhy1;
	}

	public String getCs8SfiCertifiedForestContentWhy2() {
		return cs8SfiCertifiedForestContentWhy2;
	}

	public void setCs8SfiCertifiedForestContentWhy2(String cs8SfiCertifiedForestContentWhy2) {
		this.cs8SfiCertifiedForestContentWhy2 = cs8SfiCertifiedForestContentWhy2;
	}

	public String getCs8SfiCertifiedForestContentWhy3() {
		return cs8SfiCertifiedForestContentWhy3;
	}

	public void setCs8SfiCertifiedForestContentWhy3(String cs8SfiCertifiedForestContentWhy3) {
		this.cs8SfiCertifiedForestContentWhy3 = cs8SfiCertifiedForestContentWhy3;
	}

	public String getCs8SfiCertifiedForestContentWhy4() {
		return cs8SfiCertifiedForestContentWhy4;
	}

	public void setCs8SfiCertifiedForestContentWhy4(String cs8SfiCertifiedForestContentWhy4) {
		this.cs8SfiCertifiedForestContentWhy4 = cs8SfiCertifiedForestContentWhy4;
	}

	public String getCs8SfiCertifiedForestContentWhy5() {
		return cs8SfiCertifiedForestContentWhy5;
	}

	public void setCs8SfiCertifiedForestContentWhy5(String cs8SfiCertifiedForestContentWhy5) {
		this.cs8SfiCertifiedForestContentWhy5 = cs8SfiCertifiedForestContentWhy5;
	}

	public String getCs8SfiCertifiedForestContentWhy6() {
		return cs8SfiCertifiedForestContentWhy6;
	}

	public void setCs8SfiCertifiedForestContentWhy6(String cs8SfiCertifiedForestContentWhy6) {
		this.cs8SfiCertifiedForestContentWhy6 = cs8SfiCertifiedForestContentWhy6;
	}

	public String getCs8DemandSFICertified1() {
		return cs8DemandSFICertified1;
	}

	public void setCs8DemandSFICertified1(String cs8DemandSFICertified1) {
		this.cs8DemandSFICertified1 = cs8DemandSFICertified1;
	}

	public String getCs8DemandSFICertified2() {
		return cs8DemandSFICertified2;
	}

	public void setCs8DemandSFICertified2(String cs8DemandSFICertified2) {
		this.cs8DemandSFICertified2 = cs8DemandSFICertified2;
	}

	public String getCs8DemandSFICertified3() {
		return cs8DemandSFICertified3;
	}

	public void setCs8DemandSFICertified3(String cs8DemandSFICertified3) {
		this.cs8DemandSFICertified3 = cs8DemandSFICertified3;
	}

	public String getCs8DemandSFICertified4() {
		return cs8DemandSFICertified4;
	}

	public void setCs8DemandSFICertified4(String cs8DemandSFICertified4) {
		this.cs8DemandSFICertified4 = cs8DemandSFICertified4;
	}

	public String getCs8DemandSFICertified5() {
		return cs8DemandSFICertified5;
	}

	public void setCs8DemandSFICertified5(String cs8DemandSFICertified5) {
		this.cs8DemandSFICertified5 = cs8DemandSFICertified5;
	}

	public String getCs8DemandSFICertified6() {
		return cs8DemandSFICertified6;
	}

	public void setCs8DemandSFICertified6(String cs8DemandSFICertified6) {
		this.cs8DemandSFICertified6 = cs8DemandSFICertified6;
	}

	public String getCs8DemandSFICertifiedWhy1() {
		return cs8DemandSFICertifiedWhy1;
	}

	public void setCs8DemandSFICertifiedWhy1(String cs8DemandSFICertifiedWhy1) {
		this.cs8DemandSFICertifiedWhy1 = cs8DemandSFICertifiedWhy1;
	}

	public String getCs8DemandSFICertifiedWhy2() {
		return cs8DemandSFICertifiedWhy2;
	}

	public void setCs8DemandSFICertifiedWhy2(String cs8DemandSFICertifiedWhy2) {
		this.cs8DemandSFICertifiedWhy2 = cs8DemandSFICertifiedWhy2;
	}

	public String getCs8DemandSFICertifiedWhy3() {
		return cs8DemandSFICertifiedWhy3;
	}

	public void setCs8DemandSFICertifiedWhy3(String cs8DemandSFICertifiedWhy3) {
		this.cs8DemandSFICertifiedWhy3 = cs8DemandSFICertifiedWhy3;
	}

	public String getCs8DemandSFICertifiedWhy4() {
		return cs8DemandSFICertifiedWhy4;
	}

	public void setCs8DemandSFICertifiedWhy4(String cs8DemandSFICertifiedWhy4) {
		this.cs8DemandSFICertifiedWhy4 = cs8DemandSFICertifiedWhy4;
	}

	public String getCs8DemandSFICertifiedWhy5() {
		return cs8DemandSFICertifiedWhy5;
	}

	public void setCs8DemandSFICertifiedWhy5(String cs8DemandSFICertifiedWhy5) {
		this.cs8DemandSFICertifiedWhy5 = cs8DemandSFICertifiedWhy5;
	}

	public String getCs8DemandSFICertifiedWhy6() {
		return cs8DemandSFICertifiedWhy6;
	}

	public void setCs8DemandSFICertifiedWhy6(String cs8DemandSFICertifiedWhy6) {
		this.cs8DemandSFICertifiedWhy6 = cs8DemandSFICertifiedWhy6;
	}

	public String getCs8FSCCertification1() {
		return cs8FSCCertification1;
	}

	public void setCs8FSCCertification1(String cs8FSCCertification1) {
		this.cs8FSCCertification1 = cs8FSCCertification1;
	}

	public String getCs8FSCCertification2() {
		return cs8FSCCertification2;
	}

	public void setCs8FSCCertification2(String cs8FSCCertification2) {
		this.cs8FSCCertification2 = cs8FSCCertification2;
	}

	public String getCs8FSCCertification3() {
		return cs8FSCCertification3;
	}

	public void setCs8FSCCertification3(String cs8FSCCertification3) {
		this.cs8FSCCertification3 = cs8FSCCertification3;
	}

	public String getCs8FSCCertification4() {
		return cs8FSCCertification4;
	}

	public void setCs8FSCCertification4(String cs8FSCCertification4) {
		this.cs8FSCCertification4 = cs8FSCCertification4;
	}

	public String getCs8FSCCertification5() {
		return cs8FSCCertification5;
	}

	public void setCs8FSCCertification5(String cs8FSCCertification5) {
		this.cs8FSCCertification5 = cs8FSCCertification5;
	}

	public String getCs8FSCCertification6() {
		return cs8FSCCertification6;
	}

	public void setCs8FSCCertification6(String cs8FSCCertification6) {
		this.cs8FSCCertification6 = cs8FSCCertification6;
	}

	public String getCs8FscCertificationExplain1() {
		return cs8FscCertificationExplain1;
	}

	public void setCs8FscCertificationExplain1(String cs8FscCertificationExplain1) {
		this.cs8FscCertificationExplain1 = cs8FscCertificationExplain1;
	}

	public String getCs8FscCertificationExplain2() {
		return cs8FscCertificationExplain2;
	}

	public void setCs8FscCertificationExplain2(String cs8FscCertificationExplain2) {
		this.cs8FscCertificationExplain2 = cs8FscCertificationExplain2;
	}

	public String getCs8FscCertificationExplain3() {
		return cs8FscCertificationExplain3;
	}

	public void setCs8FscCertificationExplain3(String cs8FscCertificationExplain3) {
		this.cs8FscCertificationExplain3 = cs8FscCertificationExplain3;
	}

	public String getCs8FscCertificationExplain4() {
		return cs8FscCertificationExplain4;
	}

	public void setCs8FscCertificationExplain4(String cs8FscCertificationExplain4) {
		this.cs8FscCertificationExplain4 = cs8FscCertificationExplain4;
	}

	public String getCs8FscCertificationExplain5() {
		return cs8FscCertificationExplain5;
	}

	public void setCs8FscCertificationExplain5(String cs8FscCertificationExplain5) {
		this.cs8FscCertificationExplain5 = cs8FscCertificationExplain5;
	}

	public String getCs8FscCertificationExplain6() {
		return cs8FscCertificationExplain6;
	}

	public void setCs8FscCertificationExplain6(String cs8FscCertificationExplain6) {
		this.cs8FscCertificationExplain6 = cs8FscCertificationExplain6;
	}

	public Boolean isCs8Cost1() {
		return cs8Cost1;
	}

	public void setCs8Cost1(Boolean cs8Cost1) {
		this.cs8Cost1 = cs8Cost1;
	}

	public Boolean isCs8Cost2() {
		return cs8Cost2;
	}

	public void setCs8Cost2(Boolean cs8Cost2) {
		this.cs8Cost2 = cs8Cost2;
	}

	public Boolean isCs8Cost3() {
		return cs8Cost3;
	}

	public void setCs8Cost3(Boolean cs8Cost3) {
		this.cs8Cost3 = cs8Cost3;
	}

	public Boolean isCs8Cost4() {
		return cs8Cost4;
	}

	public void setCs8Cost4(Boolean cs8Cost4) {
		this.cs8Cost4 = cs8Cost4;
	}

	public Boolean isCs8Cost5() {
		return cs8Cost5;
	}

	public void setCs8Cost5(Boolean cs8Cost5) {
		this.cs8Cost5 = cs8Cost5;
	}

	public Boolean isCs8Cost6() {
		return cs8Cost6;
	}

	public void setCs8Cost6(Boolean cs8Cost6) {
		this.cs8Cost6 = cs8Cost6;
	}

	public Boolean isCs8LackOfResponsiveness1() {
		return cs8LackOfResponsiveness1;
	}

	public void setCs8LackOfResponsiveness1(Boolean cs8LackOfResponsiveness1) {
		this.cs8LackOfResponsiveness1 = cs8LackOfResponsiveness1;
	}

	public Boolean isCs8LackOfResponsiveness2() {
		return cs8LackOfResponsiveness2;
	}

	public void setCs8LackOfResponsiveness2(Boolean cs8LackOfResponsiveness2) {
		this.cs8LackOfResponsiveness2 = cs8LackOfResponsiveness2;
	}

	public Boolean isCs8LackOfResponsiveness3() {
		return cs8LackOfResponsiveness3;
	}

	public void setCs8LackOfResponsiveness3(Boolean cs8LackOfResponsiveness3) {
		this.cs8LackOfResponsiveness3 = cs8LackOfResponsiveness3;
	}

	public Boolean isCs8LackOfResponsiveness4() {
		return cs8LackOfResponsiveness4;
	}

	public void setCs8LackOfResponsiveness4(Boolean cs8LackOfResponsiveness4) {
		this.cs8LackOfResponsiveness4 = cs8LackOfResponsiveness4;
	}

	public Boolean isCs8LackOfResponsiveness5() {
		return cs8LackOfResponsiveness5;
	}

	public void setCs8LackOfResponsiveness5(Boolean cs8LackOfResponsiveness5) {
		this.cs8LackOfResponsiveness5 = cs8LackOfResponsiveness5;
	}

	public Boolean isCs8LackOfResponsiveness6() {
		return cs8LackOfResponsiveness6;
	}

	public void setCs8LackOfResponsiveness6(Boolean cs8LackOfResponsiveness6) {
		this.cs8LackOfResponsiveness6 = cs8LackOfResponsiveness6;
	}

	public Boolean isCs8Complexity1() {
		return cs8Complexity1;
	}

	public void setCs8Complexity1(Boolean cs8Complexity1) {
		this.cs8Complexity1 = cs8Complexity1;
	}

	public Boolean isCs8Complexity2() {
		return cs8Complexity2;
	}

	public void setCs8Complexity2(Boolean cs8Complexity2) {
		this.cs8Complexity2 = cs8Complexity2;
	}

	public Boolean isCs8Complexity3() {
		return cs8Complexity3;
	}

	public void setCs8Complexity3(Boolean cs8Complexity3) {
		this.cs8Complexity3 = cs8Complexity3;
	}

	public Boolean isCs8Complexity4() {
		return cs8Complexity4;
	}

	public void setCs8Complexity4(Boolean cs8Complexity4) {
		this.cs8Complexity4 = cs8Complexity4;
	}

	public Boolean isCs8Complexity5() {
		return cs8Complexity5;
	}

	public void setCs8Complexity5(Boolean cs8Complexity5) {
		this.cs8Complexity5 = cs8Complexity5;
	}

	public Boolean isCs8Complexity6() {
		return cs8Complexity6;
	}

	public void setCs8Complexity6(Boolean cs8Complexity6) {
		this.cs8Complexity6 = cs8Complexity6;
	}

	public Boolean isCs8NoFSCMarketDemand1() {
		return cs8NoFSCMarketDemand1;
	}

	public void setCs8NoFSCMarketDemand1(Boolean cs8NoFSCMarketDemand1) {
		this.cs8NoFSCMarketDemand1 = cs8NoFSCMarketDemand1;
	}

	public Boolean isCs8NoFSCMarketDemand2() {
		return cs8NoFSCMarketDemand2;
	}

	public void setCs8NoFSCMarketDemand2(Boolean cs8NoFSCMarketDemand2) {
		this.cs8NoFSCMarketDemand2 = cs8NoFSCMarketDemand2;
	}

	public Boolean isCs8NoFSCMarketDemand3() {
		return cs8NoFSCMarketDemand3;
	}

	public void setCs8NoFSCMarketDemand3(Boolean cs8NoFSCMarketDemand3) {
		this.cs8NoFSCMarketDemand3 = cs8NoFSCMarketDemand3;
	}

	public Boolean isCs8NoFSCMarketDemand4() {
		return cs8NoFSCMarketDemand4;
	}

	public void setCs8NoFSCMarketDemand4(Boolean cs8NoFSCMarketDemand4) {
		this.cs8NoFSCMarketDemand4 = cs8NoFSCMarketDemand4;
	}

	public Boolean isCs8NoFSCMarketDemand5() {
		return cs8NoFSCMarketDemand5;
	}

	public void setCs8NoFSCMarketDemand5(Boolean cs8NoFSCMarketDemand5) {
		this.cs8NoFSCMarketDemand5 = cs8NoFSCMarketDemand5;
	}

	public Boolean isCs8NoFSCMarketDemand6() {
		return cs8NoFSCMarketDemand6;
	}

	public void setCs8NoFSCMarketDemand6(Boolean cs8NoFSCMarketDemand6) {
		this.cs8NoFSCMarketDemand6 = cs8NoFSCMarketDemand6;
	}

	public Boolean isCs8Uncertainty1() {
		return cs8Uncertainty1;
	}

	public void setCs8Uncertainty1(Boolean cs8Uncertainty1) {
		this.cs8Uncertainty1 = cs8Uncertainty1;
	}

	public Boolean isCs8Uncertainty2() {
		return cs8Uncertainty2;
	}

	public void setCs8Uncertainty2(Boolean cs8Uncertainty2) {
		this.cs8Uncertainty2 = cs8Uncertainty2;
	}

	public Boolean isCs8Uncertainty3() {
		return cs8Uncertainty3;
	}

	public void setCs8Uncertainty3(Boolean cs8Uncertainty3) {
		this.cs8Uncertainty3 = cs8Uncertainty3;
	}

	public Boolean isCs8Uncertainty4() {
		return cs8Uncertainty4;
	}

	public void setCs8Uncertainty4(Boolean cs8Uncertainty4) {
		this.cs8Uncertainty4 = cs8Uncertainty4;
	}

	public Boolean isCs8Uncertainty5() {
		return cs8Uncertainty5;
	}

	public void setCs8Uncertainty5(Boolean cs8Uncertainty5) {
		this.cs8Uncertainty5 = cs8Uncertainty5;
	}

	public Boolean isCs8Uncertainty6() {
		return cs8Uncertainty6;
	}

	public void setCs8Uncertainty6(Boolean cs8Uncertainty6) {
		this.cs8Uncertainty6 = cs8Uncertainty6;
	}

	public Boolean isCs8Lackoffscsupply1() {
		return cs8Lackoffscsupply1;
	}

	public void setCs8Lackoffscsupply1(Boolean cs8Lackoffscsupply1) {
		this.cs8Lackoffscsupply1 = cs8Lackoffscsupply1;
	}

	public Boolean isCs8Lackoffscsupply2() {
		return cs8Lackoffscsupply2;
	}

	public void setCs8Lackoffscsupply2(Boolean cs8Lackoffscsupply2) {
		this.cs8Lackoffscsupply2 = cs8Lackoffscsupply2;
	}

	public Boolean isCs8Lackoffscsupply3() {
		return cs8Lackoffscsupply3;
	}

	public void setCs8Lackoffscsupply3(Boolean cs8Lackoffscsupply3) {
		this.cs8Lackoffscsupply3 = cs8Lackoffscsupply3;
	}

	public Boolean isCs8Lackoffscsupply4() {
		return cs8Lackoffscsupply4;
	}

	public void setCs8Lackoffscsupply4(Boolean cs8Lackoffscsupply4) {
		this.cs8Lackoffscsupply4 = cs8Lackoffscsupply4;
	}

	public Boolean isCs8Lackoffscsupply5() {
		return cs8Lackoffscsupply5;
	}

	public void setCs8Lackoffscsupply5(Boolean cs8Lackoffscsupply5) {
		this.cs8Lackoffscsupply5 = cs8Lackoffscsupply5;
	}

	public Boolean isCs8Lackoffscsupply6() {
		return cs8Lackoffscsupply6;
	}

	public void setCs8Lackoffscsupply6(Boolean cs8Lackoffscsupply6) {
		this.cs8Lackoffscsupply6 = cs8Lackoffscsupply6;
	}

	public Boolean isCs8Inconsistentapproaches1() {
		return cs8Inconsistentapproaches1;
	}

	public void setCs8Inconsistentapproaches1(Boolean cs8Inconsistentapproaches1) {
		this.cs8Inconsistentapproaches1 = cs8Inconsistentapproaches1;
	}

	public Boolean isCs8Inconsistentapproaches2() {
		return cs8Inconsistentapproaches2;
	}

	public void setCs8Inconsistentapproaches2(Boolean cs8Inconsistentapproaches2) {
		this.cs8Inconsistentapproaches2 = cs8Inconsistentapproaches2;
	}

	public Boolean isCs8Inconsistentapproaches3() {
		return cs8Inconsistentapproaches3;
	}

	public void setCs8Inconsistentapproaches3(Boolean cs8Inconsistentapproaches3) {
		this.cs8Inconsistentapproaches3 = cs8Inconsistentapproaches3;
	}

	public Boolean isCs8Inconsistentapproaches4() {
		return cs8Inconsistentapproaches4;
	}

	public void setCs8Inconsistentapproaches4(Boolean cs8Inconsistentapproaches4) {
		this.cs8Inconsistentapproaches4 = cs8Inconsistentapproaches4;
	}

	public Boolean isCs8Inconsistentapproaches5() {
		return cs8Inconsistentapproaches5;
	}

	public void setCs8Inconsistentapproaches5(Boolean cs8Inconsistentapproaches5) {
		this.cs8Inconsistentapproaches5 = cs8Inconsistentapproaches5;
	}

	public Boolean isCs8Inconsistentapproaches6() {
		return cs8Inconsistentapproaches6;
	}

	public void setCs8Inconsistentapproaches6(Boolean cs8Inconsistentapproaches6) {
		this.cs8Inconsistentapproaches6 = cs8Inconsistentapproaches6;
	}

	public Boolean isCs8Other1() {
		return cs8Other1;
	}

	public void setCs8Other1(Boolean cs8Other1) {
		this.cs8Other1 = cs8Other1;
	}

	public Boolean isCs8Other2() {
		return cs8Other2;
	}

	public void setCs8Other2(Boolean cs8Other2) {
		this.cs8Other2 = cs8Other2;
	}

	public Boolean isCs8Other3() {
		return cs8Other3;
	}

	public void setCs8Other3(Boolean cs8Other3) {
		this.cs8Other3 = cs8Other3;
	}

	public Boolean isCs8Other4() {
		return cs8Other4;
	}

	public void setCs8Other4(Boolean cs8Other4) {
		this.cs8Other4 = cs8Other4;
	}

	public Boolean isCs8Other5() {
		return cs8Other5;
	}

	public void setCs8Other5(Boolean cs8Other5) {
		this.cs8Other5 = cs8Other5;
	}

	public Boolean isCs8Other6() {
		return cs8Other6;
	}

	public void setCs8Other6(Boolean cs8Other6) {
		this.cs8Other6 = cs8Other6;
	}

	public String getCs8ChainOfCustodyFSCCertification1() {
		return cs8ChainOfCustodyFSCCertification1;
	}

	public void setCs8ChainOfCustodyFSCCertification1(String cs8ChainOfCustodyFSCCertification1) {
		this.cs8ChainOfCustodyFSCCertification1 = cs8ChainOfCustodyFSCCertification1;
	}

	public String getCs8ChainOfCustodyFSCCertification2() {
		return cs8ChainOfCustodyFSCCertification2;
	}

	public void setCs8ChainOfCustodyFSCCertification2(String cs8ChainOfCustodyFSCCertification2) {
		this.cs8ChainOfCustodyFSCCertification2 = cs8ChainOfCustodyFSCCertification2;
	}

	public String getCs8ChainOfCustodyFSCCertification3() {
		return cs8ChainOfCustodyFSCCertification3;
	}

	public void setCs8ChainOfCustodyFSCCertification3(String cs8ChainOfCustodyFSCCertification3) {
		this.cs8ChainOfCustodyFSCCertification3 = cs8ChainOfCustodyFSCCertification3;
	}

	public String getCs8ChainOfCustodyFSCCertification4() {
		return cs8ChainOfCustodyFSCCertification4;
	}

	public void setCs8ChainOfCustodyFSCCertification4(String cs8ChainOfCustodyFSCCertification4) {
		this.cs8ChainOfCustodyFSCCertification4 = cs8ChainOfCustodyFSCCertification4;
	}

	public String getCs8ChainOfCustodyFSCCertification5() {
		return cs8ChainOfCustodyFSCCertification5;
	}

	public void setCs8ChainOfCustodyFSCCertification5(String cs8ChainOfCustodyFSCCertification5) {
		this.cs8ChainOfCustodyFSCCertification5 = cs8ChainOfCustodyFSCCertification5;
	}

	public String getCs8ChainOfCustodyFSCCertification6() {
		return cs8ChainOfCustodyFSCCertification6;
	}

	public void setCs8ChainOfCustodyFSCCertification6(String cs8ChainOfCustodyFSCCertification6) {
		this.cs8ChainOfCustodyFSCCertification6 = cs8ChainOfCustodyFSCCertification6;
	}

	public String getCs8ChainOfCustodyFscCertificationExplain1() {
		return cs8ChainOfCustodyFscCertificationExplain1;
	}

	public void setCs8ChainOfCustodyFscCertificationExplain1(String cs8ChainOfCustodyFscCertificationExplain1) {
		this.cs8ChainOfCustodyFscCertificationExplain1 = cs8ChainOfCustodyFscCertificationExplain1;
	}

	public String getCs8ChainOfCustodyFscCertificationExplain2() {
		return cs8ChainOfCustodyFscCertificationExplain2;
	}

	public void setCs8ChainOfCustodyFscCertificationExplain2(String cs8ChainOfCustodyFscCertificationExplain2) {
		this.cs8ChainOfCustodyFscCertificationExplain2 = cs8ChainOfCustodyFscCertificationExplain2;
	}

	public String getCs8ChainOfCustodyFscCertificationExplain3() {
		return cs8ChainOfCustodyFscCertificationExplain3;
	}

	public void setCs8ChainOfCustodyFscCertificationExplain3(String cs8ChainOfCustodyFscCertificationExplain3) {
		this.cs8ChainOfCustodyFscCertificationExplain3 = cs8ChainOfCustodyFscCertificationExplain3;
	}

	public String getCs8ChainOfCustodyFscCertificationExplain4() {
		return cs8ChainOfCustodyFscCertificationExplain4;
	}

	public void setCs8ChainOfCustodyFscCertificationExplain4(String cs8ChainOfCustodyFscCertificationExplain4) {
		this.cs8ChainOfCustodyFscCertificationExplain4 = cs8ChainOfCustodyFscCertificationExplain4;
	}

	public String getCs8ChainOfCustodyFscCertificationExplain5() {
		return cs8ChainOfCustodyFscCertificationExplain5;
	}

	public void setCs8ChainOfCustodyFscCertificationExplain5(String cs8ChainOfCustodyFscCertificationExplain5) {
		this.cs8ChainOfCustodyFscCertificationExplain5 = cs8ChainOfCustodyFscCertificationExplain5;
	}

	public String getCs8ChainOfCustodyFscCertificationExplain6() {
		return cs8ChainOfCustodyFscCertificationExplain6;
	}

	public void setCs8ChainOfCustodyFscCertificationExplain6(String cs8ChainOfCustodyFscCertificationExplain6) {
		this.cs8ChainOfCustodyFscCertificationExplain6 = cs8ChainOfCustodyFscCertificationExplain6;
	}

	public Boolean isCs8ChainOfCustodyCost1() {
		return cs8ChainOfCustodyCost1;
	}

	public void setCs8ChainOfCustodyCost1(Boolean cs8ChainOfCustodyCost1) {
		this.cs8ChainOfCustodyCost1 = cs8ChainOfCustodyCost1;
	}

	public Boolean isCs8ChainOfCustodyCost2() {
		return cs8ChainOfCustodyCost2;
	}

	public void setCs8ChainOfCustodyCost2(Boolean cs8ChainOfCustodyCost2) {
		this.cs8ChainOfCustodyCost2 = cs8ChainOfCustodyCost2;
	}

	public Boolean isCs8ChainOfCustodyCost3() {
		return cs8ChainOfCustodyCost3;
	}

	public void setCs8ChainOfCustodyCost3(Boolean cs8ChainOfCustodyCost3) {
		this.cs8ChainOfCustodyCost3 = cs8ChainOfCustodyCost3;
	}

	public Boolean isCs8ChainOfCustodyCost4() {
		return cs8ChainOfCustodyCost4;
	}

	public void setCs8ChainOfCustodyCost4(Boolean cs8ChainOfCustodyCost4) {
		this.cs8ChainOfCustodyCost4 = cs8ChainOfCustodyCost4;
	}

	public Boolean isCs8ChainOfCustodyCost5() {
		return cs8ChainOfCustodyCost5;
	}

	public void setCs8ChainOfCustodyCost5(Boolean cs8ChainOfCustodyCost5) {
		this.cs8ChainOfCustodyCost5 = cs8ChainOfCustodyCost5;
	}

	public Boolean isCs8ChainOfCustodyCost6() {
		return cs8ChainOfCustodyCost6;
	}

	public void setCs8ChainOfCustodyCost6(Boolean cs8ChainOfCustodyCost6) {
		this.cs8ChainOfCustodyCost6 = cs8ChainOfCustodyCost6;
	}

	public Boolean isCs8ChainOfCustodyLackOfResponsiveness1() {
		return cs8ChainOfCustodyLackOfResponsiveness1;
	}

	public void setCs8ChainOfCustodyLackOfResponsiveness1(Boolean cs8ChainOfCustodyLackOfResponsiveness1) {
		this.cs8ChainOfCustodyLackOfResponsiveness1 = cs8ChainOfCustodyLackOfResponsiveness1;
	}

	public Boolean isCs8ChainOfCustodyLackOfResponsiveness2() {
		return cs8ChainOfCustodyLackOfResponsiveness2;
	}

	public void setCs8ChainOfCustodyLackOfResponsiveness2(Boolean cs8ChainOfCustodyLackOfResponsiveness2) {
		this.cs8ChainOfCustodyLackOfResponsiveness2 = cs8ChainOfCustodyLackOfResponsiveness2;
	}

	public Boolean isCs8ChainOfCustodyLackOfResponsiveness3() {
		return cs8ChainOfCustodyLackOfResponsiveness3;
	}

	public void setCs8ChainOfCustodyLackOfResponsiveness3(Boolean cs8ChainOfCustodyLackOfResponsiveness3) {
		this.cs8ChainOfCustodyLackOfResponsiveness3 = cs8ChainOfCustodyLackOfResponsiveness3;
	}

	public Boolean isCs8ChainOfCustodyLackOfResponsiveness4() {
		return cs8ChainOfCustodyLackOfResponsiveness4;
	}

	public void setCs8ChainOfCustodyLackOfResponsiveness4(Boolean cs8ChainOfCustodyLackOfResponsiveness4) {
		this.cs8ChainOfCustodyLackOfResponsiveness4 = cs8ChainOfCustodyLackOfResponsiveness4;
	}

	public Boolean isCs8ChainOfCustodyLackOfResponsiveness5() {
		return cs8ChainOfCustodyLackOfResponsiveness5;
	}

	public void setCs8ChainOfCustodyLackOfResponsiveness5(Boolean cs8ChainOfCustodyLackOfResponsiveness5) {
		this.cs8ChainOfCustodyLackOfResponsiveness5 = cs8ChainOfCustodyLackOfResponsiveness5;
	}

	public Boolean isCs8ChainOfCustodyLackOfResponsiveness6() {
		return cs8ChainOfCustodyLackOfResponsiveness6;
	}

	public void setCs8ChainOfCustodyLackOfResponsiveness6(Boolean cs8ChainOfCustodyLackOfResponsiveness6) {
		this.cs8ChainOfCustodyLackOfResponsiveness6 = cs8ChainOfCustodyLackOfResponsiveness6;
	}

	public Boolean isCs8ChainOfCustodyComplexity1() {
		return cs8ChainOfCustodyComplexity1;
	}

	public void setCs8ChainOfCustodyComplexity1(Boolean cs8ChainOfCustodyComplexity1) {
		this.cs8ChainOfCustodyComplexity1 = cs8ChainOfCustodyComplexity1;
	}

	public Boolean isCs8ChainOfCustodyComplexity2() {
		return cs8ChainOfCustodyComplexity2;
	}

	public void setCs8ChainOfCustodyComplexity2(Boolean cs8ChainOfCustodyComplexity2) {
		this.cs8ChainOfCustodyComplexity2 = cs8ChainOfCustodyComplexity2;
	}

	public Boolean isCs8ChainOfCustodyComplexity3() {
		return cs8ChainOfCustodyComplexity3;
	}

	public void setCs8ChainOfCustodyComplexity3(Boolean cs8ChainOfCustodyComplexity3) {
		this.cs8ChainOfCustodyComplexity3 = cs8ChainOfCustodyComplexity3;
	}

	public Boolean isCs8ChainOfCustodyComplexity4() {
		return cs8ChainOfCustodyComplexity4;
	}

	public void setCs8ChainOfCustodyComplexity4(Boolean cs8ChainOfCustodyComplexity4) {
		this.cs8ChainOfCustodyComplexity4 = cs8ChainOfCustodyComplexity4;
	}

	public Boolean isCs8ChainOfCustodyComplexity5() {
		return cs8ChainOfCustodyComplexity5;
	}

	public void setCs8ChainOfCustodyComplexity5(Boolean cs8ChainOfCustodyComplexity5) {
		this.cs8ChainOfCustodyComplexity5 = cs8ChainOfCustodyComplexity5;
	}

	public Boolean isCs8ChainOfCustodyComplexity6() {
		return cs8ChainOfCustodyComplexity6;
	}

	public void setCs8ChainOfCustodyComplexity6(Boolean cs8ChainOfCustodyComplexity6) {
		this.cs8ChainOfCustodyComplexity6 = cs8ChainOfCustodyComplexity6;
	}

	public Boolean isCs8ChainOfCustodyNoFSCMarketDemand1() {
		return cs8ChainOfCustodyNoFSCMarketDemand1;
	}

	public void setCs8ChainOfCustodyNoFSCMarketDemand1(Boolean cs8ChainOfCustodyNoFSCMarketDemand1) {
		this.cs8ChainOfCustodyNoFSCMarketDemand1 = cs8ChainOfCustodyNoFSCMarketDemand1;
	}

	public Boolean isCs8ChainOfCustodyNoFSCMarketDemand2() {
		return cs8ChainOfCustodyNoFSCMarketDemand2;
	}

	public void setCs8ChainOfCustodyNoFSCMarketDemand2(Boolean cs8ChainOfCustodyNoFSCMarketDemand2) {
		this.cs8ChainOfCustodyNoFSCMarketDemand2 = cs8ChainOfCustodyNoFSCMarketDemand2;
	}

	public Boolean isCs8ChainOfCustodyNoFSCMarketDemand3() {
		return cs8ChainOfCustodyNoFSCMarketDemand3;
	}

	public void setCs8ChainOfCustodyNoFSCMarketDemand3(Boolean cs8ChainOfCustodyNoFSCMarketDemand3) {
		this.cs8ChainOfCustodyNoFSCMarketDemand3 = cs8ChainOfCustodyNoFSCMarketDemand3;
	}

	public Boolean isCs8ChainOfCustodyNoFSCMarketDemand4() {
		return cs8ChainOfCustodyNoFSCMarketDemand4;
	}

	public void setCs8ChainOfCustodyNoFSCMarketDemand4(Boolean cs8ChainOfCustodyNoFSCMarketDemand4) {
		this.cs8ChainOfCustodyNoFSCMarketDemand4 = cs8ChainOfCustodyNoFSCMarketDemand4;
	}

	public Boolean isCs8ChainOfCustodyNoFSCMarketDemand5() {
		return cs8ChainOfCustodyNoFSCMarketDemand5;
	}

	public void setCs8ChainOfCustodyNoFSCMarketDemand5(Boolean cs8ChainOfCustodyNoFSCMarketDemand5) {
		this.cs8ChainOfCustodyNoFSCMarketDemand5 = cs8ChainOfCustodyNoFSCMarketDemand5;
	}

	public Boolean isCs8ChainOfCustodyNoFSCMarketDemand6() {
		return cs8ChainOfCustodyNoFSCMarketDemand6;
	}

	public void setCs8ChainOfCustodyNoFSCMarketDemand6(Boolean cs8ChainOfCustodyNoFSCMarketDemand6) {
		this.cs8ChainOfCustodyNoFSCMarketDemand6 = cs8ChainOfCustodyNoFSCMarketDemand6;
	}

	public Boolean isCs8ChainOfCustodyUncertainty1() {
		return cs8ChainOfCustodyUncertainty1;
	}

	public void setCs8ChainOfCustodyUncertainty1(Boolean cs8ChainOfCustodyUncertainty1) {
		this.cs8ChainOfCustodyUncertainty1 = cs8ChainOfCustodyUncertainty1;
	}

	public Boolean isCs8ChainOfCustodyUncertainty2() {
		return cs8ChainOfCustodyUncertainty2;
	}

	public void setCs8ChainOfCustodyUncertainty2(Boolean cs8ChainOfCustodyUncertainty2) {
		this.cs8ChainOfCustodyUncertainty2 = cs8ChainOfCustodyUncertainty2;
	}

	public Boolean isCs8ChainOfCustodyUncertainty3() {
		return cs8ChainOfCustodyUncertainty3;
	}

	public void setCs8ChainOfCustodyUncertainty3(Boolean cs8ChainOfCustodyUncertainty3) {
		this.cs8ChainOfCustodyUncertainty3 = cs8ChainOfCustodyUncertainty3;
	}

	public Boolean isCs8ChainOfCustodyUncertainty4() {
		return cs8ChainOfCustodyUncertainty4;
	}

	public void setCs8ChainOfCustodyUncertainty4(Boolean cs8ChainOfCustodyUncertainty4) {
		this.cs8ChainOfCustodyUncertainty4 = cs8ChainOfCustodyUncertainty4;
	}

	public Boolean isCs8ChainOfCustodyUncertainty5() {
		return cs8ChainOfCustodyUncertainty5;
	}

	public void setCs8ChainOfCustodyUncertainty5(Boolean cs8ChainOfCustodyUncertainty5) {
		this.cs8ChainOfCustodyUncertainty5 = cs8ChainOfCustodyUncertainty5;
	}

	public Boolean isCs8ChainOfCustodyUncertainty6() {
		return cs8ChainOfCustodyUncertainty6;
	}

	public void setCs8ChainOfCustodyUncertainty6(Boolean cs8ChainOfCustodyUncertainty6) {
		this.cs8ChainOfCustodyUncertainty6 = cs8ChainOfCustodyUncertainty6;
	}

	public Boolean isCs8ChainOfCustodyLackoffscsupply1() {
		return cs8ChainOfCustodyLackoffscsupply1;
	}

	public void setCs8ChainOfCustodyLackoffscsupply1(Boolean cs8ChainOfCustodyLackoffscsupply1) {
		this.cs8ChainOfCustodyLackoffscsupply1 = cs8ChainOfCustodyLackoffscsupply1;
	}

	public Boolean isCs8ChainOfCustodyLackoffscsupply2() {
		return cs8ChainOfCustodyLackoffscsupply2;
	}

	public void setCs8ChainOfCustodyLackoffscsupply2(Boolean cs8ChainOfCustodyLackoffscsupply2) {
		this.cs8ChainOfCustodyLackoffscsupply2 = cs8ChainOfCustodyLackoffscsupply2;
	}

	public Boolean isCs8ChainOfCustodyLackoffscsupply3() {
		return cs8ChainOfCustodyLackoffscsupply3;
	}

	public void setCs8ChainOfCustodyLackoffscsupply3(Boolean cs8ChainOfCustodyLackoffscsupply3) {
		this.cs8ChainOfCustodyLackoffscsupply3 = cs8ChainOfCustodyLackoffscsupply3;
	}

	public Boolean isCs8ChainOfCustodyLackoffscsupply4() {
		return cs8ChainOfCustodyLackoffscsupply4;
	}

	public void setCs8ChainOfCustodyLackoffscsupply4(Boolean cs8ChainOfCustodyLackoffscsupply4) {
		this.cs8ChainOfCustodyLackoffscsupply4 = cs8ChainOfCustodyLackoffscsupply4;
	}

	public Boolean isCs8ChainOfCustodyLackoffscsupply5() {
		return cs8ChainOfCustodyLackoffscsupply5;
	}

	public void setCs8ChainOfCustodyLackoffscsupply5(Boolean cs8ChainOfCustodyLackoffscsupply5) {
		this.cs8ChainOfCustodyLackoffscsupply5 = cs8ChainOfCustodyLackoffscsupply5;
	}

	public Boolean isCs8ChainOfCustodyLackoffscsupply6() {
		return cs8ChainOfCustodyLackoffscsupply6;
	}

	public void setCs8ChainOfCustodyLackoffscsupply6(Boolean cs8ChainOfCustodyLackoffscsupply6) {
		this.cs8ChainOfCustodyLackoffscsupply6 = cs8ChainOfCustodyLackoffscsupply6;
	}

	public Boolean isCs8ChainOfCustodyInconsistentapproaches1() {
		return cs8ChainOfCustodyInconsistentapproaches1;
	}

	public void setCs8ChainOfCustodyInconsistentapproaches1(Boolean cs8ChainOfCustodyInconsistentapproaches1) {
		this.cs8ChainOfCustodyInconsistentapproaches1 = cs8ChainOfCustodyInconsistentapproaches1;
	}

	public Boolean isCs8ChainOfCustodyInconsistentapproaches2() {
		return cs8ChainOfCustodyInconsistentapproaches2;
	}

	public void setCs8ChainOfCustodyInconsistentapproaches2(Boolean cs8ChainOfCustodyInconsistentapproaches2) {
		this.cs8ChainOfCustodyInconsistentapproaches2 = cs8ChainOfCustodyInconsistentapproaches2;
	}

	public Boolean isCs8ChainOfCustodyInconsistentapproaches3() {
		return cs8ChainOfCustodyInconsistentapproaches3;
	}

	public void setCs8ChainOfCustodyInconsistentapproaches3(Boolean cs8ChainOfCustodyInconsistentapproaches3) {
		this.cs8ChainOfCustodyInconsistentapproaches3 = cs8ChainOfCustodyInconsistentapproaches3;
	}

	public Boolean isCs8ChainOfCustodyInconsistentapproaches4() {
		return cs8ChainOfCustodyInconsistentapproaches4;
	}

	public void setCs8ChainOfCustodyInconsistentapproaches4(Boolean cs8ChainOfCustodyInconsistentapproaches4) {
		this.cs8ChainOfCustodyInconsistentapproaches4 = cs8ChainOfCustodyInconsistentapproaches4;
	}

	public Boolean isCs8ChainOfCustodyInconsistentapproaches5() {
		return cs8ChainOfCustodyInconsistentapproaches5;
	}

	public void setCs8ChainOfCustodyInconsistentapproaches5(Boolean cs8ChainOfCustodyInconsistentapproaches5) {
		this.cs8ChainOfCustodyInconsistentapproaches5 = cs8ChainOfCustodyInconsistentapproaches5;
	}

	public Boolean isCs8ChainOfCustodyInconsistentapproaches6() {
		return cs8ChainOfCustodyInconsistentapproaches6;
	}

	public void setCs8ChainOfCustodyInconsistentapproaches6(Boolean cs8ChainOfCustodyInconsistentapproaches6) {
		this.cs8ChainOfCustodyInconsistentapproaches6 = cs8ChainOfCustodyInconsistentapproaches6;
	}

	public Boolean isCs8ChainOfCustodyOther1() {
		return cs8ChainOfCustodyOther1;
	}

	public void setCs8ChainOfCustodyOther1(Boolean cs8ChainOfCustodyOther1) {
		this.cs8ChainOfCustodyOther1 = cs8ChainOfCustodyOther1;
	}

	public Boolean isCs8ChainOfCustodyOther2() {
		return cs8ChainOfCustodyOther2;
	}

	public void setCs8ChainOfCustodyOther2(Boolean cs8ChainOfCustodyOther2) {
		this.cs8ChainOfCustodyOther2 = cs8ChainOfCustodyOther2;
	}

	public Boolean isCs8ChainOfCustodyOther3() {
		return cs8ChainOfCustodyOther3;
	}

	public void setCs8ChainOfCustodyOther3(Boolean cs8ChainOfCustodyOther3) {
		this.cs8ChainOfCustodyOther3 = cs8ChainOfCustodyOther3;
	}

	public Boolean isCs8ChainOfCustodyOther4() {
		return cs8ChainOfCustodyOther4;
	}

	public void setCs8ChainOfCustodyOther4(Boolean cs8ChainOfCustodyOther4) {
		this.cs8ChainOfCustodyOther4 = cs8ChainOfCustodyOther4;
	}

	public Boolean isCs8ChainOfCustodyOther5() {
		return cs8ChainOfCustodyOther5;
	}

	public void setCs8ChainOfCustodyOther5(Boolean cs8ChainOfCustodyOther5) {
		this.cs8ChainOfCustodyOther5 = cs8ChainOfCustodyOther5;
	}

	public Boolean isCs8ChainOfCustodyOther6() {
		return cs8ChainOfCustodyOther6;
	}

	public void setCs8ChainOfCustodyOther6(Boolean cs8ChainOfCustodyOther6) {
		this.cs8ChainOfCustodyOther6 = cs8ChainOfCustodyOther6;
	}
}

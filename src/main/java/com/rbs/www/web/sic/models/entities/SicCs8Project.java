package com.rbs.www.web.sic.models.entities;

import com.rbs.www.common.models.BaseEntityModel;
import com.rbs.www.common.services.TypeConversionUtils;
import com.rbs.www.web.common.models.datamodels.DocNames;
import com.rbs.www.web.common.models.entities.SfiPpFormRegion;
import org.apache.commons.lang3.SerializationUtils;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "sic_pp_form_cs8_projects")
public class SicCs8Project extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    @Column(name = "form_id", nullable = true)
    protected Integer sicPpForm;

    @Column(name = "cs8_partnerAcademic", nullable = true)
    private Boolean partnerAcademic;

    @Column(name = "cs8_partnerCommunity", nullable = true)
    private Boolean partnerCommunity;

    @Column(name = "cs8_partnerCommunity4H", nullable = true)
    private Boolean partnerCommunity4H;

    @Column(name = "cs8_partnerCommunityBoyScout", nullable = true)
    private Boolean partnerCommunityBoyScout;

    @Column(name = "cs8_partnerCommunityCCAB", nullable = true)
    private Boolean partnerCommunityCCAB;

    @Column(name = "cs8_partnerCommunityEarth", nullable = true)
    private Boolean partnerCommunityEarth;

    @Column(name = "cs8_partnerCommunityGirlGuide", nullable = true)
    private Boolean partnerCommunityGirlGuide;

    @Column(name = "cs8_partnerCommunityGirlScout", nullable = true)
    private Boolean partnerCommunityGirlScout;

    @Column(name = "cs8_partnerCommunityHumanityCanada", nullable = true)
    private Boolean partnerCommunityHumanityCanada;

    @Column(name = "cs8_partnerCommunityHumanityInter", nullable = true)
    private Boolean partnerCommunityHumanityInter;

    @Column(name = "cs8_partnerCommunityInterTimberCouncil", nullable = true)
    private Boolean partnerCommunityInterTimberCouncil;

    @Column(name = "cs8_partnerCommunityNatTurkeyFederation", nullable = true)
    private Boolean partnerCommunityNatTurkeyFederation;

    @Column(name = "cs8_partnerCommunityOther", nullable = true)
    private Boolean partnerCommunityOther;

    @Column(name = "cs8_partnerCommunityProjectTree", nullable = true)
    private Boolean partnerCommunityProjectTree;

    @Column(name = "cs8_partnerCommunityScoutsCanada", nullable = true)
    private Boolean partnerCommunityScoutsCanada;

    @Column(name = "cs8_partnerConservation", nullable = true)
    private Boolean partnerConservation;

    @Column(name = "cs8_partnerGovernment", nullable = true)
    private Boolean partnerGovernment;

    @Column(name = "cs8_partnerResearch", nullable = true)
    private Boolean partnerResearch;

    @Column(name = "cs8_partnerOtherSIC", nullable = true)
    private Boolean partnerOtherSIC;

    @Column(name = "cs8_partnerOther", nullable = true)
    private Boolean partnerOther;

    @Column(name = "cs8_sicSupportingResearch", nullable = true)
    private Boolean sicSupportingResearch;

    @Column(name = "cs8_sicContribution", nullable = true)
    private Integer sicContribution;

    @Column(name = "cs8_totalCost", nullable = true)
    private Integer totalCost;

    @Column(name = "cs8_contactEmail", nullable = true)
    private String contactEmail;

    @Column(name = "cs8_contactName", nullable = true)
    private String contactName;

    @Column(name = "cs8_description", nullable = true)
    private String description;

    @Column(name = "cs8_name", nullable = true)
    private String name;

    @Column(name = "cs8_organization", nullable = true)
    private String organization;

    @Column(name = "cs8_partnerAcademicSpecify", nullable = true)
    private String partnerAcademicSpecify;

    @Column(name = "cs8_partnerCommunityOtherSpecify", nullable = true)
    private String partnerCommunityOtherSpecify;

    @Column(name = "cs8_partnerConservationSpecify", nullable = true)
    private String partnerConservationSpecify;

    @Column(name = "cs8_partnerGovernmentSpecify", nullable = true)
    private String partnerGovernmentSpecify;

    @Column(name = "cs8_partnerResearchSpecify", nullable = true)
    private String partnerResearchSpecify;

    @Column(name = "cs8_sfiStandardObjective", nullable = true)
    private String sfiStandardObjective;

    @Column(name = "cs8_endDate", nullable = true)
    private Date endDate;

    @Column(name = "cs8_startDate", nullable = true)
    private Date startDate;

    @Lob
    @Column(name = "cs8_supportDocs", length = Integer.MAX_VALUE - 1, nullable = true)
    private Byte[] supportDocsAsByteArray;
    
    @ManyToMany(targetEntity = SfiPpFormRegion.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sic_pp_form_cs8_projects_region",
               joinColumns = {@JoinColumn(name = "project_id")},
               inverseJoinColumns = {@JoinColumn(name = "region_id", referencedColumnName = "id")})
    private Set<SfiPpFormRegion> regions;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSicPpForm() {
        return sicPpForm;
    }

    public void setSicPpForm(Integer sicPpForm) {
        this.sicPpForm = sicPpForm;
    }

    public Boolean getPartnerAcademic() {
        return partnerAcademic;
    }

    public void setPartnerAcademic(Boolean partnerAcademic) {
        this.partnerAcademic = partnerAcademic;
    }

    public Boolean getPartnerCommunity() {
        return partnerCommunity;
    }

    public void setPartnerCommunity(Boolean partnerCommunity) {
        this.partnerCommunity = partnerCommunity;
    }

    public Boolean getPartnerCommunity4H() {
        return partnerCommunity4H;
    }

    public void setPartnerCommunity4H(Boolean partnerCommunity4H) {
        this.partnerCommunity4H = partnerCommunity4H;
    }

    public Boolean getPartnerCommunityBoyScout() {
        return partnerCommunityBoyScout;
    }

    public void setPartnerCommunityBoyScout(Boolean partnerCommunityBoyScout) {
        this.partnerCommunityBoyScout = partnerCommunityBoyScout;
    }

    public Boolean getPartnerCommunityCCAB() {
        return partnerCommunityCCAB;
    }

    public void setPartnerCommunityCCAB(Boolean partnerCommunityCCAB) {
        this.partnerCommunityCCAB = partnerCommunityCCAB;
    }

    public Boolean getPartnerCommunityEarth() {
        return partnerCommunityEarth;
    }

    public void setPartnerCommunityEarth(Boolean partnerCommunityEarth) {
        this.partnerCommunityEarth = partnerCommunityEarth;
    }

    public Boolean getPartnerCommunityGirlGuide() {
        return partnerCommunityGirlGuide;
    }

    public void setPartnerCommunityGirlGuide(Boolean partnerCommunityGirlGuide) {
        this.partnerCommunityGirlGuide = partnerCommunityGirlGuide;
    }

    public Boolean getPartnerCommunityGirlScout() {
        return partnerCommunityGirlScout;
    }

    public void setPartnerCommunityGirlScout(Boolean partnerCommunityGirlScout) {
        this.partnerCommunityGirlScout = partnerCommunityGirlScout;
    }

    public Boolean getPartnerCommunityHumanityCanada() {
        return partnerCommunityHumanityCanada;
    }

    public void setPartnerCommunityHumanityCanada(Boolean partnerCommunityHumanityCanada) {
        this.partnerCommunityHumanityCanada = partnerCommunityHumanityCanada;
    }

    public Boolean getPartnerCommunityHumanityInter() {
        return partnerCommunityHumanityInter;
    }

    public void setPartnerCommunityHumanityInter(Boolean partnerCommunityHumanityInter) {
        this.partnerCommunityHumanityInter = partnerCommunityHumanityInter;
    }

    public Boolean getPartnerCommunityInterTimberCouncil() {
        return partnerCommunityInterTimberCouncil;
    }

    public void setPartnerCommunityInterTimberCouncil(Boolean partnerCommunityInterTimberCouncil) {
        this.partnerCommunityInterTimberCouncil = partnerCommunityInterTimberCouncil;
    }

    public Boolean getPartnerCommunityNatTurkeyFederation() {
        return partnerCommunityNatTurkeyFederation;
    }

    public void setPartnerCommunityNatTurkeyFederation(Boolean partnerCommunityNatTurkeyFederation) {
        this.partnerCommunityNatTurkeyFederation = partnerCommunityNatTurkeyFederation;
    }

    public Boolean getPartnerCommunityOther() {
        return partnerCommunityOther;
    }

    public void setPartnerCommunityOther(Boolean partnerCommunityOther) {
        this.partnerCommunityOther = partnerCommunityOther;
    }

    public Boolean getPartnerCommunityProjectTree() {
        return partnerCommunityProjectTree;
    }

    public void setPartnerCommunityProjectTree(Boolean partnerCommunityProjectTree) {
        this.partnerCommunityProjectTree = partnerCommunityProjectTree;
    }

    public Boolean getPartnerCommunityScoutsCanada() {
        return partnerCommunityScoutsCanada;
    }

    public void setPartnerCommunityScoutsCanada(Boolean partnerCommunityScoutsCanada) {
        this.partnerCommunityScoutsCanada = partnerCommunityScoutsCanada;
    }

    public Boolean getPartnerConservation() {
        return partnerConservation;
    }

    public void setPartnerConservation(Boolean partnerConservation) {
        this.partnerConservation = partnerConservation;
    }

    public Boolean getPartnerGovernment() {
        return partnerGovernment;
    }

    public void setPartnerGovernment(Boolean partnerGovernment) {
        this.partnerGovernment = partnerGovernment;
    }

    public Boolean getPartnerResearch() {
        return partnerResearch;
    }

    public void setPartnerResearch(Boolean partnerResearch) {
        this.partnerResearch = partnerResearch;
    }

    public Boolean getPartnerOtherSIC() {
        return partnerOtherSIC;
    }

    public void setPartnerOtherSIC(Boolean partnerOtherSIC) {
        this.partnerOtherSIC = partnerOtherSIC;
    }

    public Boolean getPartnerOther() {
        return partnerOther;
    }

    public void setPartnerOther(Boolean partnerOther) {
        this.partnerOther = partnerOther;
    }

    public Boolean getSicSupportingResearch() {
        return sicSupportingResearch;
    }

    public void setSicSupportingResearch(Boolean sicSupportingResearch) {
        this.sicSupportingResearch = sicSupportingResearch;
    }

    public Integer getSicContribution() {
        return sicContribution;
    }

    public void setSicContribution(Integer sicContribution) {
        this.sicContribution = sicContribution;
    }

    public Integer getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Integer totalCost) {
        this.totalCost = totalCost;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getPartnerAcademicSpecify() {
        return partnerAcademicSpecify;
    }

    public void setPartnerAcademicSpecify(String partnerAcademicSpecify) {
        this.partnerAcademicSpecify = partnerAcademicSpecify;
    }

    public String getPartnerCommunityOtherSpecify() {
        return partnerCommunityOtherSpecify;
    }

    public void setPartnerCommunityOtherSpecify(String partnerCommunityOtherSpecify) {
        this.partnerCommunityOtherSpecify = partnerCommunityOtherSpecify;
    }

    public String getPartnerConservationSpecify() {
        return partnerConservationSpecify;
    }

    public void setPartnerConservationSpecify(String partnerConservationSpecify) {
        this.partnerConservationSpecify = partnerConservationSpecify;
    }

    public String getPartnerGovernmentSpecify() {
        return partnerGovernmentSpecify;
    }

    public void setPartnerGovernmentSpecify(String partnerGovernmentSpecify) {
        this.partnerGovernmentSpecify = partnerGovernmentSpecify;
    }

    public String getPartnerResearchSpecify() {
        return partnerResearchSpecify;
    }

    public void setPartnerResearchSpecify(String partnerResearchSpecify) {
        this.partnerResearchSpecify = partnerResearchSpecify;
    }

    public String getSfiStandardObjective() {
        return sfiStandardObjective;
    }

    public void setSfiStandardObjective(String sfiStandardObjective) {
        this.sfiStandardObjective = sfiStandardObjective;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Set<SfiPpFormRegion> getRegions() {
        return regions;
    }

    public void setRegions(Set<SfiPpFormRegion> regions) {
        addAll(this.regions, regions);
    }

    private Byte[] getSupportDocsAsByteArray() {
        return supportDocsAsByteArray;
    }

    private void setSupportDocsAsByteArray(Byte[] supportDocsAsByteArray) {
        this.supportDocsAsByteArray = supportDocsAsByteArray;
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<DocNames> getSupportDocs() {
        return (Set<DocNames>) SerializationUtils
                .deserialize(TypeConversionUtils
                        .toPrimitiveType(supportDocsAsByteArray));
    }

    public void setSupportDocs(HashSet<DocNames> supportDocs) {
        this.supportDocsAsByteArray = TypeConversionUtils
                .toObjectType(SerializationUtils.serialize(supportDocs));
    }
}


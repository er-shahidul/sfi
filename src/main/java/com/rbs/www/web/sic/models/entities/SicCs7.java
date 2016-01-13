package com.rbs.www.web.sic.models.entities;

import com.rbs.www.common.models.BaseEntityModel;
import com.rbs.www.common.services.TypeConversionUtils;
import com.rbs.www.web.common.models.datamodels.DocNames;

import javax.persistence.*;

@Entity
@Table(name = "sic_forms")
public class SicCs7 extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cs7_bmpCompliancePeriod", nullable = true)
    private Integer bmpCompliancePeriod;

    @Column(name = "cs7_bmpComplianceRate", nullable = true)
    private Integer bmpComplianceRate;

    @Column(name = "cs7_sfiFiberSourcingBmpPeriod", nullable = true)
    private Integer sfiFiberSourcingBmpPeriod;

    @Column(name = "cs7_sfiFiberSourcingBmpRate", nullable = true)
    private Integer sfiFiberSourcingBmpRate;

    @Column(name = "cs7_sfiForestManagementBmpPeriod", nullable = true)
    private Integer sfiForestManagementBmpPeriod;

    @Column(name = "cs7_sfiForestManagementBmpRate", nullable = true)
    private Integer sfiForestManagementBmpRate;

    @Column(name = "cs7_sfiNonCertifiedBmpPeriod", nullable = true)
    private Integer sfiNonCertifiedBmpPeriod;

    @Column(name = "cs7_sfiNonCertifiedBmpRate", nullable = true)
    private Integer sfiNonCertifiedBmpRate;

    @Column(name = "cs7_sfiFiberSourcingBmpSource", nullable = true)
    private String sfiFiberSourcingBmpSource;

    @Column(name = "cs7_sfiForestManagementBmpSource", nullable = true)
    private String sfiForestManagementBmpSource;

    @Column(name = "cs7_sfiNonCertifiedBmpSource", nullable = true)
    private String sfiNonCertifiedBmpSource;

    @Column(name = "cs7_monitorBMPCompliance", nullable = true)
    private Boolean monitorBMPCompliance;

    @Column(name = "cs7_sicProgramCertifiedDesignation", nullable = true)
    private Boolean sicProgramCertifiedDesignation;

    @Lob
    @Column(name = "cs7_bmpReportDoc", length = 1000, nullable = true)
    private Byte[] bmpReportDocAsByteArray;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBmpCompliancePeriod() {
        return bmpCompliancePeriod;
    }

    public void setBmpCompliancePeriod(Integer bmpCompliancePeriod) {
        this.bmpCompliancePeriod = bmpCompliancePeriod;
    }

    public Integer getBmpComplianceRate() {
        return bmpComplianceRate;
    }

    public void setBmpComplianceRate(Integer bmpComplianceRate) {
        this.bmpComplianceRate = bmpComplianceRate;
    }

    public Integer getSfiFiberSourcingBmpPeriod() {
        return sfiFiberSourcingBmpPeriod;
    }

    public void setSfiFiberSourcingBmpPeriod(Integer sfiFiberSourcingBmpPeriod) {
        this.sfiFiberSourcingBmpPeriod = sfiFiberSourcingBmpPeriod;
    }

    public Integer getSfiFiberSourcingBmpRate() {
        return sfiFiberSourcingBmpRate;
    }

    public void setSfiFiberSourcingBmpRate(Integer sfiFiberSourcingBmpRate) {
        this.sfiFiberSourcingBmpRate = sfiFiberSourcingBmpRate;
    }

    public Integer getSfiForestManagementBmpPeriod() {
        return sfiForestManagementBmpPeriod;
    }

    public void setSfiForestManagementBmpPeriod(Integer sfiForestManagementBmpPeriod) {
        this.sfiForestManagementBmpPeriod = sfiForestManagementBmpPeriod;
    }

    public Integer getSfiForestManagementBmpRate() {
        return sfiForestManagementBmpRate;
    }

    public void setSfiForestManagementBmpRate(Integer sfiForestManagementBmpRate) {
        this.sfiForestManagementBmpRate = sfiForestManagementBmpRate;
    }

    public Integer getSfiNonCertifiedBmpPeriod() {
        return sfiNonCertifiedBmpPeriod;
    }

    public void setSfiNonCertifiedBmpPeriod(Integer sfiNonCertifiedBmpPeriod) {
        this.sfiNonCertifiedBmpPeriod = sfiNonCertifiedBmpPeriod;
    }

    public Integer getSfiNonCertifiedBmpRate() {
        return sfiNonCertifiedBmpRate;
    }

    public void setSfiNonCertifiedBmpRate(Integer sfiNonCertifiedBmpRate) {
        this.sfiNonCertifiedBmpRate = sfiNonCertifiedBmpRate;
    }

    public String getSfiFiberSourcingBmpSource() {
        return sfiFiberSourcingBmpSource;
    }

    public void setSfiFiberSourcingBmpSource(String sfiFiberSourcingBmpSource) {
        this.sfiFiberSourcingBmpSource = sfiFiberSourcingBmpSource;
    }

    public String getSfiForestManagementBmpSource() {
        return sfiForestManagementBmpSource;
    }

    public void setSfiForestManagementBmpSource(String sfiForestManagementBmpSource) {
        this.sfiForestManagementBmpSource = sfiForestManagementBmpSource;
    }

    public String getSfiNonCertifiedBmpSource() {
        return sfiNonCertifiedBmpSource;
    }

    public void setSfiNonCertifiedBmpSource(String sfiNonCertifiedBmpSource) {
        this.sfiNonCertifiedBmpSource = sfiNonCertifiedBmpSource;
    }

    public Boolean getMonitorBMPCompliance() {
        return monitorBMPCompliance;
    }

    public void setMonitorBMPCompliance(Boolean monitorBMPCompliance) {
        this.monitorBMPCompliance = monitorBMPCompliance;
    }

    public Boolean getSicProgramCertifiedDesignation() {
        return sicProgramCertifiedDesignation;
    }

    public void setSicProgramCertifiedDesignation(Boolean sicProgramCertifiedDesignation) {
        this.sicProgramCertifiedDesignation = sicProgramCertifiedDesignation;
    }

    private Byte[] getBmpReportDocAsByteArray() {
        return bmpReportDocAsByteArray;
    }

    private void setBmpReportDocAsByteArray(Byte[] bmpReportDocAsByteArray) {
        this.bmpReportDocAsByteArray = bmpReportDocAsByteArray;
    }

    @Transient
    public DocNames getBmpReportDoc() {
        return (DocNames) TypeConversionUtils.deserialize(bmpReportDocAsByteArray);
    }

    public void setBmpReportDoc(DocNames bmpReportDoc) {
        this.bmpReportDocAsByteArray = TypeConversionUtils.serialize(bmpReportDoc);
    }
}

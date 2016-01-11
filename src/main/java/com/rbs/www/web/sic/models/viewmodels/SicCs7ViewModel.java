package com.rbs.www.web.sic.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;
import com.rbs.www.web.common.models.viewmodels.DocNames;

import java.util.Set;

public class SicCs7ViewModel extends BaseViewModel {
    private Integer id;
    private Integer bmpCompliancePeriod;
    private Integer bmpComplianceRate;
    private Integer sfiFiberSourcingBmpPeriod;
    private Integer sfiFiberSourcingBmpRate;
    private Integer sfiForestManagementBmpPeriod;
    private Integer sfiForestManagementBmpRate;
    private Integer sfiNonCertifiedBmpPeriod;
    private Integer sfiNonCertifiedBmpRate;
    private String sfiFiberSourcingBmpSource;
    private String sfiForestManagementBmpSource;
    private String sfiNonCertifiedBmpSource;
    private Boolean monitorBMPCompliance;
    private Boolean sicProgramCertifiedDesignation;
    private Set<DocNames> bmpReportDocs;

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

    public Set<DocNames> getBmpReportDocs() {
        return bmpReportDocs;
    }

    public void setBmpReportDocs(Set<DocNames> bmpReportDocs) {
        this.bmpReportDocs = bmpReportDocs;
    }
}

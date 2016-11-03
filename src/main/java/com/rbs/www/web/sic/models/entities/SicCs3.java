package com.rbs.www.web.sic.models.entities;

import com.rbs.www.common.models.BaseEntityModel;
import com.rbs.www.common.services.TypeConversionUtils;
import com.rbs.www.web.common.models.datamodels.BlobNames;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "sic_forms")
public class SicCs3 extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cs3_brochure", nullable = true)
    private Boolean brochure;

    @Lob
    @Column(name = "cs3_brochureSpecifyFiles", length = Integer.MAX_VALUE - 1, nullable = true)
    private Byte[] brochureSpecifyFilesArray;

    @Lob
    @Column(name = "cs3_workshopSpecifyFiles", length = Integer.MAX_VALUE - 1, nullable = true)
    private Byte[] workshopSpecifyFilesArray;

    @Column(name = "cs3_other", nullable = true)
    private Boolean other;

    @Column(name = "cs3_tours", nullable = true)
    private Boolean tours;

    @Column(name = "cs3_workshop", nullable = true)
    private Boolean workshop;

    @Column(name = "cs3_brochureSpecify", nullable = true)
    @Type(type="text")
    private String brochureSpecify;

    @Column(name = "cs3_otherSpecify", nullable = true)
    @Type(type="text")
    private String otherSpecify;

    @Column(name = "cs3_toursSpecify", nullable = true)
    @Type(type="text")
    private String toursSpecify;

    @Column(name = "cs3_workshopSpecify", nullable = true)
    @Type(type="text")
    private String workshopSpecify;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getBrochure() {
        return brochure;
    }

    public void setBrochure(Boolean brochure) {
        this.brochure = brochure;
    }

    private Byte[] getBrochureSpecifyFilesArray() {
        return brochureSpecifyFilesArray;
    }

    private void setBrochureSpecifyFilesArray(Byte[] brochureSpecifyFilesArray) {
        this.brochureSpecifyFilesArray = brochureSpecifyFilesArray;
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<BlobNames> getBrochureSpecifyFiles() {
        return (Set<BlobNames>) TypeConversionUtils.deserialize(brochureSpecifyFilesArray);
    }

    public void setBrochureSpecifyFiles(HashSet<BlobNames> brochureSpecifyFiles) {
        this.brochureSpecifyFilesArray = TypeConversionUtils.serialize(brochureSpecifyFiles);
    }



    private Byte[] getWorkshopSpecifyFilesArray() {
        return workshopSpecifyFilesArray;
    }

    private void setWorkshopSpecifyFilesArray(Byte[] workshopSpecifyFilesArray) {
        this.workshopSpecifyFilesArray = workshopSpecifyFilesArray;
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<BlobNames> getWorkshopSpecifyFiles() {
        return (Set<BlobNames>) TypeConversionUtils.deserialize(workshopSpecifyFilesArray);
    }

    public void setWorkshopSpecifyFiles(HashSet<BlobNames> workshopSpecifyFiles) {
        this.workshopSpecifyFilesArray = TypeConversionUtils.serialize(workshopSpecifyFiles);
    }

    public Boolean getOther() {
        return other;
    }

    public void setOther(Boolean other) {
        this.other = other;
    }

    public Boolean getTours() {
        return tours;
    }

    public void setTours(Boolean tours) {
        this.tours = tours;
    }

    public Boolean getWorkshop() {
        return workshop;
    }

    public void setWorkshop(Boolean workshop) {
        this.workshop = workshop;
    }

    public String getBrochureSpecify() {
        return brochureSpecify;
    }

    public void setBrochureSpecify(String brochureSpecify) {
        this.brochureSpecify = brochureSpecify;
    }

    public String getOtherSpecify() {
        return otherSpecify;
    }

    public void setOtherSpecify(String otherSpecify) {
        this.otherSpecify = otherSpecify;
    }

    public String getToursSpecify() {
        return toursSpecify;
    }

    public void setToursSpecify(String toursSpecify) {
        this.toursSpecify = toursSpecify;
    }

    public String getWorkshopSpecify() {
        return workshopSpecify;
    }

    public void setWorkshopSpecify(String workshopSpecify) {
        this.workshopSpecify = workshopSpecify;
    }
}

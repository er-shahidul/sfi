package com.rbs.sfi.web.models.entities;

import com.rbs.sfi.common.models.BaseEntityModel;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sfi_pp_forms")
public class Cs2 extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cs2_usaPrivate_totalOwnMng", nullable = true)
    private Float usaPrivateTotalAreaOwnOrManage;
    @Column(name = "cs2_usaPrivate_forestlandOwnMng", nullable = true)
    private Integer usaPrivateForestlandOwnMng;
    @Column(name = "cs2_usaPrivate_forestlandOwnMngOther", nullable = true)
    private String usaPrivateForestlandOwnMngOther;
    @Column(name = "cs2_usaPrivate_totalCertified", nullable = true)
    private Float usaPrivateTotalAreaCertified;
    @Column(name = "cs2_usaPrivate_area", nullable = true)
    private Float usaPrivateAreaManagedForPublic;
    @Column(name = "cs2_usaPrivate_areaCertified", nullable = true)
    private Float usaPrivateAreaCertifiedForPublic;

    @Column(name = "cs2_usaPrivate_categories", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> usaPrivateRecreationCategories;

    @Column(name = "cs2_usaPublic_totalOwnMng", nullable = true)
    private Float usaPublicTotalAreaOwnOrManage;
    @Column(name = "cs2_usaPublic_forestlandOwnMng", nullable = true)
    private Integer usaPublicForestlandOwnMng;
    @Column(name = "cs2_usaPublic_forestlandOwnMngOther", nullable = true)
    private String usaPublicForestlandOwnMngOther;
    @Column(name = "cs2_usaPublic_totalCertified", nullable = true)
    private Float usaPublicTotalAreaCertified;
    @Column(name = "cs2_usaPublic_area", nullable = true)
    private Float usaPublicAreaManagedForPublic;
    @Column(name = "cs2_usaPublic_areaCertified", nullable = true)
    private Float usaPublicAreaCertifiedForPublic;

    @Column(name = "cs2_usaPublic_categories", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> usaPublicRecreationCategories;

    @Column(name = "cs2_caCrown_totalOwnMng", nullable = true)
    private Float caCrownTotalAreaOwnOrManage;
    @Column(name = "cs2_caCrown_forestlandOwnMng", nullable = true)
    private Integer caCrownForestlandOwnMng;
    @Column(name = "cs2_caCrown_forestlandOwnMngOther", nullable = true)
    private String caCrownForestlandOwnMngOther;

    @Column(name = "cs2_caCrown_totalCertified", nullable = true)
    private Float caCrownTotalAreaCertified;
    @Column(name = "cs2_caCrown_area", nullable = true)
    private Float caCrownAreaManagedForPublic;
    @Column(name = "cs2_caCrown_areaCertified", nullable = true)
    private Float caCrownAreaCertifiedForPublic;

    @Column(name = "cs2_caCrown_categories", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> caCrownRecreationCategories;

    @Column(name = "cs2_caPrivate_totalOwnMng", nullable = true)
    private Float caPrivateTotalAreaOwnOrManage;

    @Column(name = "cs2_caPrivate_forestlandOwnMng", nullable = true)
    private Integer caPrivateForestlandOwnMng;
    @Column(name = "cs2_caPrivate_forestlandOwnMngOther", nullable = true)
    private String caPrivateForestlandOwnMngOther;

    @Column(name = "cs2_caPrivate_totalCertified", nullable = true)
    private Float caPrivateTotalAreaCertified;
    @Column(name = "cs2_caPrivate_area", nullable = true)
    private Float caPrivateAreaManagedForPublic;
    @Column(name = "cs2_caPrivate_areaCertified", nullable = true)
    private Float caPrivateAreaCertifiedForPublic;

    @Column(name = "cs2_caPrivate_categories", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> caPrivateRecreationCategories;

    @OneToMany(targetEntity = SfiPpFormCs2OutsideUsaCa.class, mappedBy = "sfiPpForm", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<SfiPpFormCs2OutsideUsaCa> outsideCountries;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getUsaPrivateTotalAreaOwnOrManage() {
        return usaPrivateTotalAreaOwnOrManage;
    }

    public void setUsaPrivateTotalAreaOwnOrManage(Float usaPrivateTotalAreaOwnOrManage) {
        this.usaPrivateTotalAreaOwnOrManage = usaPrivateTotalAreaOwnOrManage;
    }

    public Integer getUsaPrivateForestlandOwnMng() {
        return usaPrivateForestlandOwnMng;
    }

    public void setUsaPrivateForestlandOwnMng(Integer usaPrivateForestlandOwnMng) {
        this.usaPrivateForestlandOwnMng = usaPrivateForestlandOwnMng;
    }

    public String getUsaPrivateForestlandOwnMngOther() {
        return usaPrivateForestlandOwnMngOther;
    }

    public void setUsaPrivateForestlandOwnMngOther(String usaPrivateForestlandOwnMngOther) {
        this.usaPrivateForestlandOwnMngOther = usaPrivateForestlandOwnMngOther;
    }

    public Float getUsaPrivateTotalAreaCertified() {
        return usaPrivateTotalAreaCertified;
    }

    public void setUsaPrivateTotalAreaCertified(Float usaPrivateTotalAreaCertified) {
        this.usaPrivateTotalAreaCertified = usaPrivateTotalAreaCertified;
    }

    public Float getUsaPrivateAreaManagedForPublic() {
        return usaPrivateAreaManagedForPublic;
    }

    public void setUsaPrivateAreaManagedForPublic(Float usaPrivateAreaManagedForPublic) {
        this.usaPrivateAreaManagedForPublic = usaPrivateAreaManagedForPublic;
    }

    public Float getUsaPrivateAreaCertifiedForPublic() {
        return usaPrivateAreaCertifiedForPublic;
    }

    public void setUsaPrivateAreaCertifiedForPublic(Float usaPrivateAreaCertifiedForPublic) {
        this.usaPrivateAreaCertifiedForPublic = usaPrivateAreaCertifiedForPublic;
    }

    public Set<String> getUsaPrivateRecreationCategories() {
        return usaPrivateRecreationCategories;
    }

    public void setUsaPrivateRecreationCategories(Set<String> usaPrivateRecreationCategories) {
        addAll(this.usaPrivateRecreationCategories, usaPrivateRecreationCategories);
    }

    public Float getUsaPublicTotalAreaOwnOrManage() {
        return usaPublicTotalAreaOwnOrManage;
    }

    public void setUsaPublicTotalAreaOwnOrManage(Float usaPublicTotalAreaOwnOrManage) {
        this.usaPublicTotalAreaOwnOrManage = usaPublicTotalAreaOwnOrManage;
    }

    public Integer getUsaPublicForestlandOwnMng() {
        return usaPublicForestlandOwnMng;
    }

    public void setUsaPublicForestlandOwnMng(Integer usaPublicForestlandOwnMng) {
        this.usaPublicForestlandOwnMng = usaPublicForestlandOwnMng;
    }

    public String getUsaPublicForestlandOwnMngOther() {
        return usaPublicForestlandOwnMngOther;
    }

    public void setUsaPublicForestlandOwnMngOther(String usaPublicForestlandOwnMngOther) {
        this.usaPublicForestlandOwnMngOther = usaPublicForestlandOwnMngOther;
    }

    public Float getUsaPublicTotalAreaCertified() {
        return usaPublicTotalAreaCertified;
    }

    public void setUsaPublicTotalAreaCertified(Float usaPublicTotalAreaCertified) {
        this.usaPublicTotalAreaCertified = usaPublicTotalAreaCertified;
    }

    public Float getUsaPublicAreaManagedForPublic() {
        return usaPublicAreaManagedForPublic;
    }

    public void setUsaPublicAreaManagedForPublic(Float usaPublicAreaManagedForPublic) {
        this.usaPublicAreaManagedForPublic = usaPublicAreaManagedForPublic;
    }

    public Float getUsaPublicAreaCertifiedForPublic() {
        return usaPublicAreaCertifiedForPublic;
    }

    public void setUsaPublicAreaCertifiedForPublic(Float usaPublicAreaCertifiedForPublic) {
        this.usaPublicAreaCertifiedForPublic = usaPublicAreaCertifiedForPublic;
    }

    public Set<String> getUsaPublicRecreationCategories() {
        return usaPublicRecreationCategories;
    }

    public void setUsaPublicRecreationCategories(Set<String> usaPublicRecreationCategories) {
        addAll(this.usaPublicRecreationCategories, usaPublicRecreationCategories);
    }

    public Float getCaCrownTotalAreaOwnOrManage() {
        return caCrownTotalAreaOwnOrManage;
    }

    public void setCaCrownTotalAreaOwnOrManage(Float caCrownTotalAreaOwnOrManage) {
        this.caCrownTotalAreaOwnOrManage = caCrownTotalAreaOwnOrManage;
    }

    public Integer getCaCrownForestlandOwnMng() {
        return caCrownForestlandOwnMng;
    }

    public void setCaCrownForestlandOwnMng(Integer caCrownForestlandOwnMng) {
        this.caCrownForestlandOwnMng = caCrownForestlandOwnMng;
    }

    public String getCaCrownForestlandOwnMngOther() {
        return caCrownForestlandOwnMngOther;
    }

    public void setCaCrownForestlandOwnMngOther(String caCrownForestlandOwnMngOther) {
        this.caCrownForestlandOwnMngOther = caCrownForestlandOwnMngOther;
    }

    public Float getCaCrownTotalAreaCertified() {
        return caCrownTotalAreaCertified;
    }

    public void setCaCrownTotalAreaCertified(Float caCrownTotalAreaCertified) {
        this.caCrownTotalAreaCertified = caCrownTotalAreaCertified;
    }

    public Float getCaCrownAreaManagedForPublic() {
        return caCrownAreaManagedForPublic;
    }

    public void setCaCrownAreaManagedForPublic(Float caCrownAreaManagedForPublic) {
        this.caCrownAreaManagedForPublic = caCrownAreaManagedForPublic;
    }

    public Float getCaCrownAreaCertifiedForPublic() {
        return caCrownAreaCertifiedForPublic;
    }

    public void setCaCrownAreaCertifiedForPublic(Float caCrownAreaCertifiedForPublic) {
        this.caCrownAreaCertifiedForPublic = caCrownAreaCertifiedForPublic;
    }

    public Set<String> getCaCrownRecreationCategories() {
        return caCrownRecreationCategories;
    }

    public void setCaCrownRecreationCategories(Set<String> caCrownRecreationCategories) {
        addAll(this.caCrownRecreationCategories, caCrownRecreationCategories);
    }

    public Float getCaPrivateTotalAreaOwnOrManage() {
        return caPrivateTotalAreaOwnOrManage;
    }

    public void setCaPrivateTotalAreaOwnOrManage(Float caPrivateTotalAreaOwnOrManage) {
        this.caPrivateTotalAreaOwnOrManage = caPrivateTotalAreaOwnOrManage;
    }

    public Integer getCaPrivateForestlandOwnMng() {
        return caPrivateForestlandOwnMng;
    }

    public void setCaPrivateForestlandOwnMng(Integer caPrivateForestlandOwnMng) {
        this.caPrivateForestlandOwnMng = caPrivateForestlandOwnMng;
    }

    public String getCaPrivateForestlandOwnMngOther() {
        return caPrivateForestlandOwnMngOther;
    }

    public void setCaPrivateForestlandOwnMngOther(String caPrivateForestlandOwnMngOther) {
        this.caPrivateForestlandOwnMngOther = caPrivateForestlandOwnMngOther;
    }

    public Float getCaPrivateTotalAreaCertified() {
        return caPrivateTotalAreaCertified;
    }

    public void setCaPrivateTotalAreaCertified(Float caPrivateTotalAreaCertified) {
        this.caPrivateTotalAreaCertified = caPrivateTotalAreaCertified;
    }

    public Float getCaPrivateAreaManagedForPublic() {
        return caPrivateAreaManagedForPublic;
    }

    public void setCaPrivateAreaManagedForPublic(Float caPrivateAreaManagedForPublic) {
        this.caPrivateAreaManagedForPublic = caPrivateAreaManagedForPublic;
    }

    public Float getCaPrivateAreaCertifiedForPublic() {
        return caPrivateAreaCertifiedForPublic;
    }

    public void setCaPrivateAreaCertifiedForPublic(Float caPrivateAreaCertifiedForPublic) {
        this.caPrivateAreaCertifiedForPublic = caPrivateAreaCertifiedForPublic;
    }

    public Set<String> getCaPrivateRecreationCategories() {
        return caPrivateRecreationCategories;
    }

    public void setCaPrivateRecreationCategories(Set<String> caPrivateRecreationCategories) {
        addAll(this.caPrivateRecreationCategories, caPrivateRecreationCategories);
    }

    public Set<SfiPpFormCs2OutsideUsaCa> getOutsideCountries() {
        return outsideCountries;
    }

    public void setOutsideCountries(Set<SfiPpFormCs2OutsideUsaCa> outsideCountries) {
        addAll(this.outsideCountries, outsideCountries);
    }
}

package com.rbs.sfi.web.models.entities;

import com.rbs.sfi.common.models.BaseEntityModel;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="sfi_pp_form_cs6_us_canada")
public class SfiPpFormCs6UsCanada extends BaseEntityModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne(targetEntity = Cs6.class, optional=true)
	@JoinColumn(name="form_id", nullable=true)
	private Cs6 sfiPpForm;

	@ManyToOne(targetEntity = SfiPpFormRegion.class, optional=true)
	@JoinColumn(name="region_id", nullable=true)
	private SfiPpFormRegion region;

	@Column(name="cs6_usCanada_unit_1", nullable=true)
	private Integer usCanadaUnit1;

	@Column(name="cs6_usCanada_volume_1", nullable=true)
	private String usCanadaVolume1;

	@Column(name="cs6_usCanada_percDeliveredQualifiedLogging_1", nullable=true)
	private String usCanadaPercDeliveredQualifiedLogging1;

	@Column(name="cs6_usCanada_percSFIOnlyCertified_1", nullable=true)
	private String usCanadaPercSFIOnlyCertified1;

	@Column(name="cs6_usCanada_percATFSOnlyCertified_1", nullable=true)
	private String usCanadaPercATFSOnlyCertified1;

	@Column(name="cs6_usCanada_percCSAOnlyCertified_1", nullable=true)
	private String usCanadaPercCSAOnlyCertified1;

	@Column(name="cs6_usCanada_percFSCOnlyCertified_1", nullable=true)
	private String usCanadaPercFSCOnlyCertified1;

	@Column(name="cs6_usCanada_moreThanOneStandard_1", nullable=true)
	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<String> usCanadaMoreThanOneStandard1;

	@Column(name="cs6_usCanada_other", nullable=true)
	private Boolean usCanadaOther;

	@Column(name="cs6_usCanada_otherLabel", nullable=true)
	private String usCanadaOtherLabel;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_1_1", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard11;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_2_1", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard21;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_3_1", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard31;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_4_1", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard41;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_5_1", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard51;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_6_1", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard61;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_7_1", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard71;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_1_2", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard12;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_2_2", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard22;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_3_2", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard32;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_4_2", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard42;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_5_2", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard52;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_6_2", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard62;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_7_2", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard72;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_1_3", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard13;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_2_3", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard23;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_3_3", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard33;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_4_3", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard43;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_5_3", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard53;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_6_3", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard63;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_7_3", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard73;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_1_4", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard14;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_2_4", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard24;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_3_4", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard34;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_4_4", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard44;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_5_4", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard54;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_6_4", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard64;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_7_4", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard74;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_1_5", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard15;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_2_5", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard25;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_3_5", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard35;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_4_5", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard45;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_5_5", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard55;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_6_5", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard65;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_7_5", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard75;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_1_6", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard16;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_2_6", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard26;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_3_6", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard36;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_4_6", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard46;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_5_6", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard56;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_6_6", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard66;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_7_6", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard76;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_1_7", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard17;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_2_7", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard27;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_3_7", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard37;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_4_7", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard47;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_5_7", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard57;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_6_7", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard67;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_7_7", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard77;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_1_8", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard18;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_2_8", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard28;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_3_8", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard38;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_4_8", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard48;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_5_8", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard58;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_6_8", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard68;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_7_8", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard78;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_1_9", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard19;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_2_9", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard29;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_3_9", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard39;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_4_9", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard49;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_5_9", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard59;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_6_9", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard69;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_7_9", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard79;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_1_10", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard110;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_2_10", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard210;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_3_10", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard310;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_4_10", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard410;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_5_10", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard510;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_6_10", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard610;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_7_10", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard710;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_1_11", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard111;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_2_11", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard211;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_3_11", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard311;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_4_11", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard411;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_5_11", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard511;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_6_11", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard611;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_7_11", nullable=true)
	private Float usCanadaPercCertifedMoreThanOneStandard711;

    @Override
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

    public Cs6 getSfiPpForm() {
        return sfiPpForm;
    }

    public void setSfiPpForm(Cs6 sfiPpForm) {
        this.sfiPpForm = sfiPpForm;
    }

    public SfiPpFormRegion getRegion() {
        return region;
    }

    public void setRegion(SfiPpFormRegion region) {
        this.region = region;
    }

    public Integer getUsCanadaUnit1() {
        return usCanadaUnit1;
    }

    public void setUsCanadaUnit1(Integer usCanadaUnit1) {
        this.usCanadaUnit1 = usCanadaUnit1;
    }

    public String getUsCanadaVolume1() {
        return usCanadaVolume1;
    }

    public void setUsCanadaVolume1(String usCanadaVolume1) {
        this.usCanadaVolume1 = usCanadaVolume1;
    }

    public String getUsCanadaPercDeliveredQualifiedLogging1() {
        return usCanadaPercDeliveredQualifiedLogging1;
    }

    public void setUsCanadaPercDeliveredQualifiedLogging1(String usCanadaPercDeliveredQualifiedLogging1) {
        this.usCanadaPercDeliveredQualifiedLogging1 = usCanadaPercDeliveredQualifiedLogging1;
    }

    public String getUsCanadaPercSFIOnlyCertified1() {
        return usCanadaPercSFIOnlyCertified1;
    }

    public void setUsCanadaPercSFIOnlyCertified1(String usCanadaPercSFIOnlyCertified1) {
        this.usCanadaPercSFIOnlyCertified1 = usCanadaPercSFIOnlyCertified1;
    }

    public String getUsCanadaPercATFSOnlyCertified1() {
        return usCanadaPercATFSOnlyCertified1;
    }

    public void setUsCanadaPercATFSOnlyCertified1(String usCanadaPercATFSOnlyCertified1) {
        this.usCanadaPercATFSOnlyCertified1 = usCanadaPercATFSOnlyCertified1;
    }

    public String getUsCanadaPercCSAOnlyCertified1() {
        return usCanadaPercCSAOnlyCertified1;
    }

    public void setUsCanadaPercCSAOnlyCertified1(String usCanadaPercCSAOnlyCertified1) {
        this.usCanadaPercCSAOnlyCertified1 = usCanadaPercCSAOnlyCertified1;
    }

    public String getUsCanadaPercFSCOnlyCertified1() {
        return usCanadaPercFSCOnlyCertified1;
    }

    public void setUsCanadaPercFSCOnlyCertified1(String usCanadaPercFSCOnlyCertified1) {
        this.usCanadaPercFSCOnlyCertified1 = usCanadaPercFSCOnlyCertified1;
    }

    public Set<String> getUsCanadaMoreThanOneStandard1() {
        return usCanadaMoreThanOneStandard1;
    }

    public void setUsCanadaMoreThanOneStandard1(Set<String> usCanadaMoreThanOneStandard1) {
        addAll(this.usCanadaMoreThanOneStandard1, usCanadaMoreThanOneStandard1);
    }

    public Boolean getUsCanadaOther() {
        return usCanadaOther;
    }

    public void setUsCanadaOther(Boolean usCanadaOther) {
        this.usCanadaOther = usCanadaOther;
    }

    public String getUsCanadaOtherLabel() {
        return usCanadaOtherLabel;
    }

    public void setUsCanadaOtherLabel(String usCanadaOtherLabel) {
        this.usCanadaOtherLabel = usCanadaOtherLabel;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard11() {
        return usCanadaPercCertifedMoreThanOneStandard11;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard11(Float usCanadaPercCertifedMoreThanOneStandard11) {
        this.usCanadaPercCertifedMoreThanOneStandard11 = usCanadaPercCertifedMoreThanOneStandard11;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard21() {
        return usCanadaPercCertifedMoreThanOneStandard21;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard21(Float usCanadaPercCertifedMoreThanOneStandard21) {
        this.usCanadaPercCertifedMoreThanOneStandard21 = usCanadaPercCertifedMoreThanOneStandard21;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard31() {
        return usCanadaPercCertifedMoreThanOneStandard31;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard31(Float usCanadaPercCertifedMoreThanOneStandard31) {
        this.usCanadaPercCertifedMoreThanOneStandard31 = usCanadaPercCertifedMoreThanOneStandard31;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard41() {
        return usCanadaPercCertifedMoreThanOneStandard41;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard41(Float usCanadaPercCertifedMoreThanOneStandard41) {
        this.usCanadaPercCertifedMoreThanOneStandard41 = usCanadaPercCertifedMoreThanOneStandard41;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard51() {
        return usCanadaPercCertifedMoreThanOneStandard51;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard51(Float usCanadaPercCertifedMoreThanOneStandard51) {
        this.usCanadaPercCertifedMoreThanOneStandard51 = usCanadaPercCertifedMoreThanOneStandard51;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard61() {
        return usCanadaPercCertifedMoreThanOneStandard61;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard61(Float usCanadaPercCertifedMoreThanOneStandard61) {
        this.usCanadaPercCertifedMoreThanOneStandard61 = usCanadaPercCertifedMoreThanOneStandard61;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard71() {
        return usCanadaPercCertifedMoreThanOneStandard71;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard71(Float usCanadaPercCertifedMoreThanOneStandard71) {
        this.usCanadaPercCertifedMoreThanOneStandard71 = usCanadaPercCertifedMoreThanOneStandard71;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard12() {
        return usCanadaPercCertifedMoreThanOneStandard12;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard12(Float usCanadaPercCertifedMoreThanOneStandard12) {
        this.usCanadaPercCertifedMoreThanOneStandard12 = usCanadaPercCertifedMoreThanOneStandard12;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard22() {
        return usCanadaPercCertifedMoreThanOneStandard22;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard22(Float usCanadaPercCertifedMoreThanOneStandard22) {
        this.usCanadaPercCertifedMoreThanOneStandard22 = usCanadaPercCertifedMoreThanOneStandard22;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard32() {
        return usCanadaPercCertifedMoreThanOneStandard32;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard32(Float usCanadaPercCertifedMoreThanOneStandard32) {
        this.usCanadaPercCertifedMoreThanOneStandard32 = usCanadaPercCertifedMoreThanOneStandard32;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard42() {
        return usCanadaPercCertifedMoreThanOneStandard42;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard42(Float usCanadaPercCertifedMoreThanOneStandard42) {
        this.usCanadaPercCertifedMoreThanOneStandard42 = usCanadaPercCertifedMoreThanOneStandard42;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard52() {
        return usCanadaPercCertifedMoreThanOneStandard52;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard52(Float usCanadaPercCertifedMoreThanOneStandard52) {
        this.usCanadaPercCertifedMoreThanOneStandard52 = usCanadaPercCertifedMoreThanOneStandard52;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard62() {
        return usCanadaPercCertifedMoreThanOneStandard62;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard62(Float usCanadaPercCertifedMoreThanOneStandard62) {
        this.usCanadaPercCertifedMoreThanOneStandard62 = usCanadaPercCertifedMoreThanOneStandard62;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard72() {
        return usCanadaPercCertifedMoreThanOneStandard72;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard72(Float usCanadaPercCertifedMoreThanOneStandard72) {
        this.usCanadaPercCertifedMoreThanOneStandard72 = usCanadaPercCertifedMoreThanOneStandard72;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard13() {
        return usCanadaPercCertifedMoreThanOneStandard13;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard13(Float usCanadaPercCertifedMoreThanOneStandard13) {
        this.usCanadaPercCertifedMoreThanOneStandard13 = usCanadaPercCertifedMoreThanOneStandard13;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard23() {
        return usCanadaPercCertifedMoreThanOneStandard23;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard23(Float usCanadaPercCertifedMoreThanOneStandard23) {
        this.usCanadaPercCertifedMoreThanOneStandard23 = usCanadaPercCertifedMoreThanOneStandard23;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard33() {
        return usCanadaPercCertifedMoreThanOneStandard33;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard33(Float usCanadaPercCertifedMoreThanOneStandard33) {
        this.usCanadaPercCertifedMoreThanOneStandard33 = usCanadaPercCertifedMoreThanOneStandard33;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard43() {
        return usCanadaPercCertifedMoreThanOneStandard43;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard43(Float usCanadaPercCertifedMoreThanOneStandard43) {
        this.usCanadaPercCertifedMoreThanOneStandard43 = usCanadaPercCertifedMoreThanOneStandard43;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard53() {
        return usCanadaPercCertifedMoreThanOneStandard53;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard53(Float usCanadaPercCertifedMoreThanOneStandard53) {
        this.usCanadaPercCertifedMoreThanOneStandard53 = usCanadaPercCertifedMoreThanOneStandard53;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard63() {
        return usCanadaPercCertifedMoreThanOneStandard63;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard63(Float usCanadaPercCertifedMoreThanOneStandard63) {
        this.usCanadaPercCertifedMoreThanOneStandard63 = usCanadaPercCertifedMoreThanOneStandard63;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard73() {
        return usCanadaPercCertifedMoreThanOneStandard73;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard73(Float usCanadaPercCertifedMoreThanOneStandard73) {
        this.usCanadaPercCertifedMoreThanOneStandard73 = usCanadaPercCertifedMoreThanOneStandard73;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard14() {
        return usCanadaPercCertifedMoreThanOneStandard14;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard14(Float usCanadaPercCertifedMoreThanOneStandard14) {
        this.usCanadaPercCertifedMoreThanOneStandard14 = usCanadaPercCertifedMoreThanOneStandard14;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard24() {
        return usCanadaPercCertifedMoreThanOneStandard24;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard24(Float usCanadaPercCertifedMoreThanOneStandard24) {
        this.usCanadaPercCertifedMoreThanOneStandard24 = usCanadaPercCertifedMoreThanOneStandard24;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard34() {
        return usCanadaPercCertifedMoreThanOneStandard34;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard34(Float usCanadaPercCertifedMoreThanOneStandard34) {
        this.usCanadaPercCertifedMoreThanOneStandard34 = usCanadaPercCertifedMoreThanOneStandard34;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard44() {
        return usCanadaPercCertifedMoreThanOneStandard44;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard44(Float usCanadaPercCertifedMoreThanOneStandard44) {
        this.usCanadaPercCertifedMoreThanOneStandard44 = usCanadaPercCertifedMoreThanOneStandard44;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard54() {
        return usCanadaPercCertifedMoreThanOneStandard54;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard54(Float usCanadaPercCertifedMoreThanOneStandard54) {
        this.usCanadaPercCertifedMoreThanOneStandard54 = usCanadaPercCertifedMoreThanOneStandard54;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard64() {
        return usCanadaPercCertifedMoreThanOneStandard64;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard64(Float usCanadaPercCertifedMoreThanOneStandard64) {
        this.usCanadaPercCertifedMoreThanOneStandard64 = usCanadaPercCertifedMoreThanOneStandard64;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard74() {
        return usCanadaPercCertifedMoreThanOneStandard74;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard74(Float usCanadaPercCertifedMoreThanOneStandard74) {
        this.usCanadaPercCertifedMoreThanOneStandard74 = usCanadaPercCertifedMoreThanOneStandard74;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard15() {
        return usCanadaPercCertifedMoreThanOneStandard15;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard15(Float usCanadaPercCertifedMoreThanOneStandard15) {
        this.usCanadaPercCertifedMoreThanOneStandard15 = usCanadaPercCertifedMoreThanOneStandard15;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard25() {
        return usCanadaPercCertifedMoreThanOneStandard25;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard25(Float usCanadaPercCertifedMoreThanOneStandard25) {
        this.usCanadaPercCertifedMoreThanOneStandard25 = usCanadaPercCertifedMoreThanOneStandard25;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard35() {
        return usCanadaPercCertifedMoreThanOneStandard35;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard35(Float usCanadaPercCertifedMoreThanOneStandard35) {
        this.usCanadaPercCertifedMoreThanOneStandard35 = usCanadaPercCertifedMoreThanOneStandard35;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard45() {
        return usCanadaPercCertifedMoreThanOneStandard45;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard45(Float usCanadaPercCertifedMoreThanOneStandard45) {
        this.usCanadaPercCertifedMoreThanOneStandard45 = usCanadaPercCertifedMoreThanOneStandard45;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard55() {
        return usCanadaPercCertifedMoreThanOneStandard55;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard55(Float usCanadaPercCertifedMoreThanOneStandard55) {
        this.usCanadaPercCertifedMoreThanOneStandard55 = usCanadaPercCertifedMoreThanOneStandard55;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard65() {
        return usCanadaPercCertifedMoreThanOneStandard65;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard65(Float usCanadaPercCertifedMoreThanOneStandard65) {
        this.usCanadaPercCertifedMoreThanOneStandard65 = usCanadaPercCertifedMoreThanOneStandard65;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard75() {
        return usCanadaPercCertifedMoreThanOneStandard75;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard75(Float usCanadaPercCertifedMoreThanOneStandard75) {
        this.usCanadaPercCertifedMoreThanOneStandard75 = usCanadaPercCertifedMoreThanOneStandard75;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard16() {
        return usCanadaPercCertifedMoreThanOneStandard16;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard16(Float usCanadaPercCertifedMoreThanOneStandard16) {
        this.usCanadaPercCertifedMoreThanOneStandard16 = usCanadaPercCertifedMoreThanOneStandard16;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard26() {
        return usCanadaPercCertifedMoreThanOneStandard26;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard26(Float usCanadaPercCertifedMoreThanOneStandard26) {
        this.usCanadaPercCertifedMoreThanOneStandard26 = usCanadaPercCertifedMoreThanOneStandard26;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard36() {
        return usCanadaPercCertifedMoreThanOneStandard36;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard36(Float usCanadaPercCertifedMoreThanOneStandard36) {
        this.usCanadaPercCertifedMoreThanOneStandard36 = usCanadaPercCertifedMoreThanOneStandard36;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard46() {
        return usCanadaPercCertifedMoreThanOneStandard46;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard46(Float usCanadaPercCertifedMoreThanOneStandard46) {
        this.usCanadaPercCertifedMoreThanOneStandard46 = usCanadaPercCertifedMoreThanOneStandard46;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard56() {
        return usCanadaPercCertifedMoreThanOneStandard56;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard56(Float usCanadaPercCertifedMoreThanOneStandard56) {
        this.usCanadaPercCertifedMoreThanOneStandard56 = usCanadaPercCertifedMoreThanOneStandard56;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard66() {
        return usCanadaPercCertifedMoreThanOneStandard66;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard66(Float usCanadaPercCertifedMoreThanOneStandard66) {
        this.usCanadaPercCertifedMoreThanOneStandard66 = usCanadaPercCertifedMoreThanOneStandard66;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard76() {
        return usCanadaPercCertifedMoreThanOneStandard76;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard76(Float usCanadaPercCertifedMoreThanOneStandard76) {
        this.usCanadaPercCertifedMoreThanOneStandard76 = usCanadaPercCertifedMoreThanOneStandard76;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard17() {
        return usCanadaPercCertifedMoreThanOneStandard17;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard17(Float usCanadaPercCertifedMoreThanOneStandard17) {
        this.usCanadaPercCertifedMoreThanOneStandard17 = usCanadaPercCertifedMoreThanOneStandard17;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard27() {
        return usCanadaPercCertifedMoreThanOneStandard27;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard27(Float usCanadaPercCertifedMoreThanOneStandard27) {
        this.usCanadaPercCertifedMoreThanOneStandard27 = usCanadaPercCertifedMoreThanOneStandard27;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard37() {
        return usCanadaPercCertifedMoreThanOneStandard37;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard37(Float usCanadaPercCertifedMoreThanOneStandard37) {
        this.usCanadaPercCertifedMoreThanOneStandard37 = usCanadaPercCertifedMoreThanOneStandard37;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard47() {
        return usCanadaPercCertifedMoreThanOneStandard47;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard47(Float usCanadaPercCertifedMoreThanOneStandard47) {
        this.usCanadaPercCertifedMoreThanOneStandard47 = usCanadaPercCertifedMoreThanOneStandard47;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard57() {
        return usCanadaPercCertifedMoreThanOneStandard57;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard57(Float usCanadaPercCertifedMoreThanOneStandard57) {
        this.usCanadaPercCertifedMoreThanOneStandard57 = usCanadaPercCertifedMoreThanOneStandard57;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard67() {
        return usCanadaPercCertifedMoreThanOneStandard67;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard67(Float usCanadaPercCertifedMoreThanOneStandard67) {
        this.usCanadaPercCertifedMoreThanOneStandard67 = usCanadaPercCertifedMoreThanOneStandard67;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard77() {
        return usCanadaPercCertifedMoreThanOneStandard77;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard77(Float usCanadaPercCertifedMoreThanOneStandard77) {
        this.usCanadaPercCertifedMoreThanOneStandard77 = usCanadaPercCertifedMoreThanOneStandard77;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard18() {
        return usCanadaPercCertifedMoreThanOneStandard18;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard18(Float usCanadaPercCertifedMoreThanOneStandard18) {
        this.usCanadaPercCertifedMoreThanOneStandard18 = usCanadaPercCertifedMoreThanOneStandard18;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard28() {
        return usCanadaPercCertifedMoreThanOneStandard28;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard28(Float usCanadaPercCertifedMoreThanOneStandard28) {
        this.usCanadaPercCertifedMoreThanOneStandard28 = usCanadaPercCertifedMoreThanOneStandard28;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard38() {
        return usCanadaPercCertifedMoreThanOneStandard38;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard38(Float usCanadaPercCertifedMoreThanOneStandard38) {
        this.usCanadaPercCertifedMoreThanOneStandard38 = usCanadaPercCertifedMoreThanOneStandard38;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard48() {
        return usCanadaPercCertifedMoreThanOneStandard48;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard48(Float usCanadaPercCertifedMoreThanOneStandard48) {
        this.usCanadaPercCertifedMoreThanOneStandard48 = usCanadaPercCertifedMoreThanOneStandard48;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard58() {
        return usCanadaPercCertifedMoreThanOneStandard58;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard58(Float usCanadaPercCertifedMoreThanOneStandard58) {
        this.usCanadaPercCertifedMoreThanOneStandard58 = usCanadaPercCertifedMoreThanOneStandard58;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard68() {
        return usCanadaPercCertifedMoreThanOneStandard68;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard68(Float usCanadaPercCertifedMoreThanOneStandard68) {
        this.usCanadaPercCertifedMoreThanOneStandard68 = usCanadaPercCertifedMoreThanOneStandard68;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard78() {
        return usCanadaPercCertifedMoreThanOneStandard78;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard78(Float usCanadaPercCertifedMoreThanOneStandard78) {
        this.usCanadaPercCertifedMoreThanOneStandard78 = usCanadaPercCertifedMoreThanOneStandard78;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard19() {
        return usCanadaPercCertifedMoreThanOneStandard19;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard19(Float usCanadaPercCertifedMoreThanOneStandard19) {
        this.usCanadaPercCertifedMoreThanOneStandard19 = usCanadaPercCertifedMoreThanOneStandard19;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard29() {
        return usCanadaPercCertifedMoreThanOneStandard29;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard29(Float usCanadaPercCertifedMoreThanOneStandard29) {
        this.usCanadaPercCertifedMoreThanOneStandard29 = usCanadaPercCertifedMoreThanOneStandard29;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard39() {
        return usCanadaPercCertifedMoreThanOneStandard39;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard39(Float usCanadaPercCertifedMoreThanOneStandard39) {
        this.usCanadaPercCertifedMoreThanOneStandard39 = usCanadaPercCertifedMoreThanOneStandard39;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard49() {
        return usCanadaPercCertifedMoreThanOneStandard49;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard49(Float usCanadaPercCertifedMoreThanOneStandard49) {
        this.usCanadaPercCertifedMoreThanOneStandard49 = usCanadaPercCertifedMoreThanOneStandard49;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard59() {
        return usCanadaPercCertifedMoreThanOneStandard59;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard59(Float usCanadaPercCertifedMoreThanOneStandard59) {
        this.usCanadaPercCertifedMoreThanOneStandard59 = usCanadaPercCertifedMoreThanOneStandard59;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard69() {
        return usCanadaPercCertifedMoreThanOneStandard69;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard69(Float usCanadaPercCertifedMoreThanOneStandard69) {
        this.usCanadaPercCertifedMoreThanOneStandard69 = usCanadaPercCertifedMoreThanOneStandard69;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard79() {
        return usCanadaPercCertifedMoreThanOneStandard79;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard79(Float usCanadaPercCertifedMoreThanOneStandard79) {
        this.usCanadaPercCertifedMoreThanOneStandard79 = usCanadaPercCertifedMoreThanOneStandard79;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard110() {
        return usCanadaPercCertifedMoreThanOneStandard110;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard110(Float usCanadaPercCertifedMoreThanOneStandard110) {
        this.usCanadaPercCertifedMoreThanOneStandard110 = usCanadaPercCertifedMoreThanOneStandard110;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard210() {
        return usCanadaPercCertifedMoreThanOneStandard210;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard210(Float usCanadaPercCertifedMoreThanOneStandard210) {
        this.usCanadaPercCertifedMoreThanOneStandard210 = usCanadaPercCertifedMoreThanOneStandard210;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard310() {
        return usCanadaPercCertifedMoreThanOneStandard310;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard310(Float usCanadaPercCertifedMoreThanOneStandard310) {
        this.usCanadaPercCertifedMoreThanOneStandard310 = usCanadaPercCertifedMoreThanOneStandard310;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard410() {
        return usCanadaPercCertifedMoreThanOneStandard410;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard410(Float usCanadaPercCertifedMoreThanOneStandard410) {
        this.usCanadaPercCertifedMoreThanOneStandard410 = usCanadaPercCertifedMoreThanOneStandard410;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard510() {
        return usCanadaPercCertifedMoreThanOneStandard510;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard510(Float usCanadaPercCertifedMoreThanOneStandard510) {
        this.usCanadaPercCertifedMoreThanOneStandard510 = usCanadaPercCertifedMoreThanOneStandard510;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard610() {
        return usCanadaPercCertifedMoreThanOneStandard610;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard610(Float usCanadaPercCertifedMoreThanOneStandard610) {
        this.usCanadaPercCertifedMoreThanOneStandard610 = usCanadaPercCertifedMoreThanOneStandard610;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard710() {
        return usCanadaPercCertifedMoreThanOneStandard710;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard710(Float usCanadaPercCertifedMoreThanOneStandard710) {
        this.usCanadaPercCertifedMoreThanOneStandard710 = usCanadaPercCertifedMoreThanOneStandard710;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard111() {
        return usCanadaPercCertifedMoreThanOneStandard111;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard111(Float usCanadaPercCertifedMoreThanOneStandard111) {
        this.usCanadaPercCertifedMoreThanOneStandard111 = usCanadaPercCertifedMoreThanOneStandard111;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard211() {
        return usCanadaPercCertifedMoreThanOneStandard211;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard211(Float usCanadaPercCertifedMoreThanOneStandard211) {
        this.usCanadaPercCertifedMoreThanOneStandard211 = usCanadaPercCertifedMoreThanOneStandard211;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard311() {
        return usCanadaPercCertifedMoreThanOneStandard311;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard311(Float usCanadaPercCertifedMoreThanOneStandard311) {
        this.usCanadaPercCertifedMoreThanOneStandard311 = usCanadaPercCertifedMoreThanOneStandard311;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard411() {
        return usCanadaPercCertifedMoreThanOneStandard411;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard411(Float usCanadaPercCertifedMoreThanOneStandard411) {
        this.usCanadaPercCertifedMoreThanOneStandard411 = usCanadaPercCertifedMoreThanOneStandard411;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard511() {
        return usCanadaPercCertifedMoreThanOneStandard511;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard511(Float usCanadaPercCertifedMoreThanOneStandard511) {
        this.usCanadaPercCertifedMoreThanOneStandard511 = usCanadaPercCertifedMoreThanOneStandard511;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard611() {
        return usCanadaPercCertifedMoreThanOneStandard611;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard611(Float usCanadaPercCertifedMoreThanOneStandard611) {
        this.usCanadaPercCertifedMoreThanOneStandard611 = usCanadaPercCertifedMoreThanOneStandard611;
    }

    public Float getUsCanadaPercCertifedMoreThanOneStandard711() {
        return usCanadaPercCertifedMoreThanOneStandard711;
    }

    public void setUsCanadaPercCertifedMoreThanOneStandard711(Float usCanadaPercCertifedMoreThanOneStandard711) {
        this.usCanadaPercCertifedMoreThanOneStandard711 = usCanadaPercCertifedMoreThanOneStandard711;
    }
}

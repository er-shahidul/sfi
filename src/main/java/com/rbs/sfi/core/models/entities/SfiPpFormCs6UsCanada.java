package com.rbs.sfi.core.models.entities;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="sfi_pp_form_cs6_us_canada")
public class SfiPpFormCs6UsCanada
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@ManyToOne(targetEntity = Cs6.class, optional=true)
	@JoinColumn(name="form_id", nullable=true)
	private Cs6 sfiPpForm;

	@ManyToOne(targetEntity = SfiPpFormRegion.class, optional=true)
	@JoinColumn(name="region_id", nullable=true)
	private SfiPpFormRegion region;

	@Column(name="cs6_usCanada_unit_1", nullable=true)
	private int cs6UsCanadaUnit1;

	@Column(name="cs6_usCanada_volume_1", nullable=true)
	private String cs6UsCanadaVolume1;

	@Column(name="cs6_usCanada_percDeliveredQualifiedLogging_1", nullable=true)
	private String cs6UsCanadaPercDeliveredQualifiedLogging1;

	@Column(name="cs6_usCanada_percSFIOnlyCertified_1", nullable=true)
	private String cs6UsCanadaPercSFIOnlyCertified1;

	@Column(name="cs6_usCanada_percATFSOnlyCertified_1", nullable=true)
	private String cs6UsCanadaPercATFSOnlyCertified1;

	@Column(name="cs6_usCanada_percCSAOnlyCertified_1", nullable=true)
	private String cs6UsCanadaPercCSAOnlyCertified1;

	@Column(name="cs6_usCanada_percFSCOnlyCertified_1", nullable=true)
	private String cs6UsCanadaPercFSCOnlyCertified1;

	@Column(name="cs6_usCanada_moreThanOneStandard_1", nullable=true)
	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<String> cs6UsCanadaMoreThanOneStandard1;

	@Column(name="cs6_usCanada_other", nullable=true)
	private boolean cs6UsCanadaOther;

	@Column(name="cs6_usCanada_otherLabel", nullable=true)
	private String cs6UsCanadaOtherLabel;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_1_1", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard11;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_2_1", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard21;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_3_1", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard31;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_4_1", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard41;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_5_1", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard51;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_6_1", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard61;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_7_1", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard71;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_1_2", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard12;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_2_2", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard22;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_3_2", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard32;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_4_2", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard42;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_5_2", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard52;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_6_2", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard62;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_7_2", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard72;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_1_3", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard13;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_2_3", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard23;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_3_3", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard33;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_4_3", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard43;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_5_3", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard53;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_6_3", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard63;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_7_3", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard73;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_1_4", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard14;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_2_4", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard24;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_3_4", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard34;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_4_4", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard44;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_5_4", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard54;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_6_4", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard64;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_7_4", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard74;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_1_5", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard15;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_2_5", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard25;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_3_5", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard35;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_4_5", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard45;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_5_5", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard55;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_6_5", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard65;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_7_5", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard75;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_1_6", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard16;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_2_6", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard26;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_3_6", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard36;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_4_6", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard46;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_5_6", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard56;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_6_6", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard66;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_7_6", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard76;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_1_7", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard17;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_2_7", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard27;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_3_7", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard37;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_4_7", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard47;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_5_7", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard57;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_6_7", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard67;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_7_7", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard77;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_1_8", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard18;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_2_8", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard28;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_3_8", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard38;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_4_8", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard48;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_5_8", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard58;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_6_8", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard68;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_7_8", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard78;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_1_9", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard19;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_2_9", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard29;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_3_9", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard39;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_4_9", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard49;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_5_9", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard59;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_6_9", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard69;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_7_9", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard79;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_1_10", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard110;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_2_10", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard210;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_3_10", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard310;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_4_10", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard410;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_5_10", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard510;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_6_10", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard610;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_7_10", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard710;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_1_11", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard111;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_2_11", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard211;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_3_11", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard311;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_4_11", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard411;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_5_11", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard511;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_6_11", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard611;

	@Column(name="cs6_usCanada_percCertifedMoreThanOneStandard_7_11", nullable=true)
	private Float cs6UsCanadaPercCertifedMoreThanOneStandard711;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public int getCs6UsCanadaUnit1() {
		return cs6UsCanadaUnit1;
	}

	public void setCs6UsCanadaUnit1(int cs6UsCanadaUnit1) {
		this.cs6UsCanadaUnit1 = cs6UsCanadaUnit1;
	}

	public String getCs6UsCanadaVolume1() {
		return cs6UsCanadaVolume1;
	}

	public void setCs6UsCanadaVolume1(String cs6UsCanadaVolume1) {
		this.cs6UsCanadaVolume1 = cs6UsCanadaVolume1;
	}

	public String getCs6UsCanadaPercDeliveredQualifiedLogging1() {
		return cs6UsCanadaPercDeliveredQualifiedLogging1;
	}

	public void setCs6UsCanadaPercDeliveredQualifiedLogging1(String cs6UsCanadaPercDeliveredQualifiedLogging1) {
		this.cs6UsCanadaPercDeliveredQualifiedLogging1 = cs6UsCanadaPercDeliveredQualifiedLogging1;
	}

	public String getCs6UsCanadaPercSFIOnlyCertified1() {
		return cs6UsCanadaPercSFIOnlyCertified1;
	}

	public void setCs6UsCanadaPercSFIOnlyCertified1(String cs6UsCanadaPercSFIOnlyCertified1) {
		this.cs6UsCanadaPercSFIOnlyCertified1 = cs6UsCanadaPercSFIOnlyCertified1;
	}

	public String getCs6UsCanadaPercATFSOnlyCertified1() {
		return cs6UsCanadaPercATFSOnlyCertified1;
	}

	public void setCs6UsCanadaPercATFSOnlyCertified1(String cs6UsCanadaPercATFSOnlyCertified1) {
		this.cs6UsCanadaPercATFSOnlyCertified1 = cs6UsCanadaPercATFSOnlyCertified1;
	}

	public String getCs6UsCanadaPercCSAOnlyCertified1() {
		return cs6UsCanadaPercCSAOnlyCertified1;
	}

	public void setCs6UsCanadaPercCSAOnlyCertified1(String cs6UsCanadaPercCSAOnlyCertified1) {
		this.cs6UsCanadaPercCSAOnlyCertified1 = cs6UsCanadaPercCSAOnlyCertified1;
	}

	public String getCs6UsCanadaPercFSCOnlyCertified1() {
		return cs6UsCanadaPercFSCOnlyCertified1;
	}

	public void setCs6UsCanadaPercFSCOnlyCertified1(String cs6UsCanadaPercFSCOnlyCertified1) {
		this.cs6UsCanadaPercFSCOnlyCertified1 = cs6UsCanadaPercFSCOnlyCertified1;
	}

	public List<String> getCs6UsCanadaMoreThanOneStandard1() {
		return cs6UsCanadaMoreThanOneStandard1;
	}

	public void setCs6UsCanadaMoreThanOneStandard1(List<String> cs6UsCanadaMoreThanOneStandard1) {
		this.cs6UsCanadaMoreThanOneStandard1 = cs6UsCanadaMoreThanOneStandard1;
	}

	public boolean isCs6UsCanadaOther() {
		return cs6UsCanadaOther;
	}

	public void setCs6UsCanadaOther(boolean cs6UsCanadaOther) {
		this.cs6UsCanadaOther = cs6UsCanadaOther;
	}

	public String getCs6UsCanadaOtherLabel() {
		return cs6UsCanadaOtherLabel;
	}

	public void setCs6UsCanadaOtherLabel(String cs6UsCanadaOtherLabel) {
		this.cs6UsCanadaOtherLabel = cs6UsCanadaOtherLabel;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard11() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard11;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard11(Float cs6UsCanadaPercCertifedMoreThanOneStandard11) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard11 = cs6UsCanadaPercCertifedMoreThanOneStandard11;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard21() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard21;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard21(Float cs6UsCanadaPercCertifedMoreThanOneStandard21) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard21 = cs6UsCanadaPercCertifedMoreThanOneStandard21;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard31() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard31;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard31(Float cs6UsCanadaPercCertifedMoreThanOneStandard31) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard31 = cs6UsCanadaPercCertifedMoreThanOneStandard31;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard41() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard41;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard41(Float cs6UsCanadaPercCertifedMoreThanOneStandard41) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard41 = cs6UsCanadaPercCertifedMoreThanOneStandard41;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard51() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard51;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard51(Float cs6UsCanadaPercCertifedMoreThanOneStandard51) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard51 = cs6UsCanadaPercCertifedMoreThanOneStandard51;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard61() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard61;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard61(Float cs6UsCanadaPercCertifedMoreThanOneStandard61) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard61 = cs6UsCanadaPercCertifedMoreThanOneStandard61;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard71() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard71;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard71(Float cs6UsCanadaPercCertifedMoreThanOneStandard71) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard71 = cs6UsCanadaPercCertifedMoreThanOneStandard71;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard12() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard12;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard12(Float cs6UsCanadaPercCertifedMoreThanOneStandard12) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard12 = cs6UsCanadaPercCertifedMoreThanOneStandard12;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard22() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard22;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard22(Float cs6UsCanadaPercCertifedMoreThanOneStandard22) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard22 = cs6UsCanadaPercCertifedMoreThanOneStandard22;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard32() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard32;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard32(Float cs6UsCanadaPercCertifedMoreThanOneStandard32) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard32 = cs6UsCanadaPercCertifedMoreThanOneStandard32;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard42() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard42;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard42(Float cs6UsCanadaPercCertifedMoreThanOneStandard42) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard42 = cs6UsCanadaPercCertifedMoreThanOneStandard42;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard52() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard52;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard52(Float cs6UsCanadaPercCertifedMoreThanOneStandard52) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard52 = cs6UsCanadaPercCertifedMoreThanOneStandard52;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard62() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard62;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard62(Float cs6UsCanadaPercCertifedMoreThanOneStandard62) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard62 = cs6UsCanadaPercCertifedMoreThanOneStandard62;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard72() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard72;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard72(Float cs6UsCanadaPercCertifedMoreThanOneStandard72) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard72 = cs6UsCanadaPercCertifedMoreThanOneStandard72;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard13() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard13;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard13(Float cs6UsCanadaPercCertifedMoreThanOneStandard13) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard13 = cs6UsCanadaPercCertifedMoreThanOneStandard13;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard23() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard23;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard23(Float cs6UsCanadaPercCertifedMoreThanOneStandard23) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard23 = cs6UsCanadaPercCertifedMoreThanOneStandard23;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard33() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard33;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard33(Float cs6UsCanadaPercCertifedMoreThanOneStandard33) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard33 = cs6UsCanadaPercCertifedMoreThanOneStandard33;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard43() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard43;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard43(Float cs6UsCanadaPercCertifedMoreThanOneStandard43) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard43 = cs6UsCanadaPercCertifedMoreThanOneStandard43;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard53() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard53;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard53(Float cs6UsCanadaPercCertifedMoreThanOneStandard53) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard53 = cs6UsCanadaPercCertifedMoreThanOneStandard53;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard63() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard63;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard63(Float cs6UsCanadaPercCertifedMoreThanOneStandard63) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard63 = cs6UsCanadaPercCertifedMoreThanOneStandard63;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard73() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard73;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard73(Float cs6UsCanadaPercCertifedMoreThanOneStandard73) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard73 = cs6UsCanadaPercCertifedMoreThanOneStandard73;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard14() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard14;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard14(Float cs6UsCanadaPercCertifedMoreThanOneStandard14) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard14 = cs6UsCanadaPercCertifedMoreThanOneStandard14;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard24() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard24;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard24(Float cs6UsCanadaPercCertifedMoreThanOneStandard24) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard24 = cs6UsCanadaPercCertifedMoreThanOneStandard24;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard34() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard34;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard34(Float cs6UsCanadaPercCertifedMoreThanOneStandard34) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard34 = cs6UsCanadaPercCertifedMoreThanOneStandard34;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard44() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard44;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard44(Float cs6UsCanadaPercCertifedMoreThanOneStandard44) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard44 = cs6UsCanadaPercCertifedMoreThanOneStandard44;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard54() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard54;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard54(Float cs6UsCanadaPercCertifedMoreThanOneStandard54) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard54 = cs6UsCanadaPercCertifedMoreThanOneStandard54;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard64() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard64;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard64(Float cs6UsCanadaPercCertifedMoreThanOneStandard64) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard64 = cs6UsCanadaPercCertifedMoreThanOneStandard64;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard74() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard74;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard74(Float cs6UsCanadaPercCertifedMoreThanOneStandard74) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard74 = cs6UsCanadaPercCertifedMoreThanOneStandard74;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard15() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard15;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard15(Float cs6UsCanadaPercCertifedMoreThanOneStandard15) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard15 = cs6UsCanadaPercCertifedMoreThanOneStandard15;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard25() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard25;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard25(Float cs6UsCanadaPercCertifedMoreThanOneStandard25) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard25 = cs6UsCanadaPercCertifedMoreThanOneStandard25;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard35() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard35;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard35(Float cs6UsCanadaPercCertifedMoreThanOneStandard35) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard35 = cs6UsCanadaPercCertifedMoreThanOneStandard35;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard45() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard45;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard45(Float cs6UsCanadaPercCertifedMoreThanOneStandard45) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard45 = cs6UsCanadaPercCertifedMoreThanOneStandard45;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard55() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard55;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard55(Float cs6UsCanadaPercCertifedMoreThanOneStandard55) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard55 = cs6UsCanadaPercCertifedMoreThanOneStandard55;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard65() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard65;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard65(Float cs6UsCanadaPercCertifedMoreThanOneStandard65) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard65 = cs6UsCanadaPercCertifedMoreThanOneStandard65;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard75() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard75;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard75(Float cs6UsCanadaPercCertifedMoreThanOneStandard75) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard75 = cs6UsCanadaPercCertifedMoreThanOneStandard75;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard16() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard16;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard16(Float cs6UsCanadaPercCertifedMoreThanOneStandard16) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard16 = cs6UsCanadaPercCertifedMoreThanOneStandard16;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard26() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard26;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard26(Float cs6UsCanadaPercCertifedMoreThanOneStandard26) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard26 = cs6UsCanadaPercCertifedMoreThanOneStandard26;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard36() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard36;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard36(Float cs6UsCanadaPercCertifedMoreThanOneStandard36) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard36 = cs6UsCanadaPercCertifedMoreThanOneStandard36;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard46() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard46;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard46(Float cs6UsCanadaPercCertifedMoreThanOneStandard46) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard46 = cs6UsCanadaPercCertifedMoreThanOneStandard46;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard56() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard56;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard56(Float cs6UsCanadaPercCertifedMoreThanOneStandard56) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard56 = cs6UsCanadaPercCertifedMoreThanOneStandard56;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard66() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard66;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard66(Float cs6UsCanadaPercCertifedMoreThanOneStandard66) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard66 = cs6UsCanadaPercCertifedMoreThanOneStandard66;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard76() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard76;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard76(Float cs6UsCanadaPercCertifedMoreThanOneStandard76) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard76 = cs6UsCanadaPercCertifedMoreThanOneStandard76;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard17() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard17;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard17(Float cs6UsCanadaPercCertifedMoreThanOneStandard17) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard17 = cs6UsCanadaPercCertifedMoreThanOneStandard17;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard27() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard27;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard27(Float cs6UsCanadaPercCertifedMoreThanOneStandard27) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard27 = cs6UsCanadaPercCertifedMoreThanOneStandard27;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard37() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard37;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard37(Float cs6UsCanadaPercCertifedMoreThanOneStandard37) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard37 = cs6UsCanadaPercCertifedMoreThanOneStandard37;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard47() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard47;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard47(Float cs6UsCanadaPercCertifedMoreThanOneStandard47) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard47 = cs6UsCanadaPercCertifedMoreThanOneStandard47;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard57() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard57;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard57(Float cs6UsCanadaPercCertifedMoreThanOneStandard57) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard57 = cs6UsCanadaPercCertifedMoreThanOneStandard57;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard67() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard67;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard67(Float cs6UsCanadaPercCertifedMoreThanOneStandard67) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard67 = cs6UsCanadaPercCertifedMoreThanOneStandard67;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard77() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard77;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard77(Float cs6UsCanadaPercCertifedMoreThanOneStandard77) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard77 = cs6UsCanadaPercCertifedMoreThanOneStandard77;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard18() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard18;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard18(Float cs6UsCanadaPercCertifedMoreThanOneStandard18) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard18 = cs6UsCanadaPercCertifedMoreThanOneStandard18;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard28() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard28;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard28(Float cs6UsCanadaPercCertifedMoreThanOneStandard28) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard28 = cs6UsCanadaPercCertifedMoreThanOneStandard28;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard38() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard38;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard38(Float cs6UsCanadaPercCertifedMoreThanOneStandard38) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard38 = cs6UsCanadaPercCertifedMoreThanOneStandard38;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard48() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard48;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard48(Float cs6UsCanadaPercCertifedMoreThanOneStandard48) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard48 = cs6UsCanadaPercCertifedMoreThanOneStandard48;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard58() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard58;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard58(Float cs6UsCanadaPercCertifedMoreThanOneStandard58) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard58 = cs6UsCanadaPercCertifedMoreThanOneStandard58;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard68() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard68;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard68(Float cs6UsCanadaPercCertifedMoreThanOneStandard68) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard68 = cs6UsCanadaPercCertifedMoreThanOneStandard68;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard78() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard78;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard78(Float cs6UsCanadaPercCertifedMoreThanOneStandard78) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard78 = cs6UsCanadaPercCertifedMoreThanOneStandard78;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard19() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard19;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard19(Float cs6UsCanadaPercCertifedMoreThanOneStandard19) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard19 = cs6UsCanadaPercCertifedMoreThanOneStandard19;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard29() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard29;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard29(Float cs6UsCanadaPercCertifedMoreThanOneStandard29) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard29 = cs6UsCanadaPercCertifedMoreThanOneStandard29;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard39() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard39;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard39(Float cs6UsCanadaPercCertifedMoreThanOneStandard39) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard39 = cs6UsCanadaPercCertifedMoreThanOneStandard39;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard49() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard49;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard49(Float cs6UsCanadaPercCertifedMoreThanOneStandard49) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard49 = cs6UsCanadaPercCertifedMoreThanOneStandard49;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard59() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard59;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard59(Float cs6UsCanadaPercCertifedMoreThanOneStandard59) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard59 = cs6UsCanadaPercCertifedMoreThanOneStandard59;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard69() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard69;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard69(Float cs6UsCanadaPercCertifedMoreThanOneStandard69) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard69 = cs6UsCanadaPercCertifedMoreThanOneStandard69;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard79() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard79;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard79(Float cs6UsCanadaPercCertifedMoreThanOneStandard79) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard79 = cs6UsCanadaPercCertifedMoreThanOneStandard79;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard110() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard110;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard110(Float cs6UsCanadaPercCertifedMoreThanOneStandard110) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard110 = cs6UsCanadaPercCertifedMoreThanOneStandard110;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard210() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard210;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard210(Float cs6UsCanadaPercCertifedMoreThanOneStandard210) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard210 = cs6UsCanadaPercCertifedMoreThanOneStandard210;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard310() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard310;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard310(Float cs6UsCanadaPercCertifedMoreThanOneStandard310) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard310 = cs6UsCanadaPercCertifedMoreThanOneStandard310;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard410() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard410;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard410(Float cs6UsCanadaPercCertifedMoreThanOneStandard410) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard410 = cs6UsCanadaPercCertifedMoreThanOneStandard410;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard510() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard510;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard510(Float cs6UsCanadaPercCertifedMoreThanOneStandard510) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard510 = cs6UsCanadaPercCertifedMoreThanOneStandard510;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard610() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard610;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard610(Float cs6UsCanadaPercCertifedMoreThanOneStandard610) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard610 = cs6UsCanadaPercCertifedMoreThanOneStandard610;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard710() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard710;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard710(Float cs6UsCanadaPercCertifedMoreThanOneStandard710) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard710 = cs6UsCanadaPercCertifedMoreThanOneStandard710;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard111() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard111;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard111(Float cs6UsCanadaPercCertifedMoreThanOneStandard111) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard111 = cs6UsCanadaPercCertifedMoreThanOneStandard111;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard211() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard211;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard211(Float cs6UsCanadaPercCertifedMoreThanOneStandard211) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard211 = cs6UsCanadaPercCertifedMoreThanOneStandard211;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard311() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard311;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard311(Float cs6UsCanadaPercCertifedMoreThanOneStandard311) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard311 = cs6UsCanadaPercCertifedMoreThanOneStandard311;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard411() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard411;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard411(Float cs6UsCanadaPercCertifedMoreThanOneStandard411) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard411 = cs6UsCanadaPercCertifedMoreThanOneStandard411;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard511() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard511;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard511(Float cs6UsCanadaPercCertifedMoreThanOneStandard511) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard511 = cs6UsCanadaPercCertifedMoreThanOneStandard511;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard611() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard611;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard611(Float cs6UsCanadaPercCertifedMoreThanOneStandard611) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard611 = cs6UsCanadaPercCertifedMoreThanOneStandard611;
	}

	public Float getCs6UsCanadaPercCertifedMoreThanOneStandard711() {
		return cs6UsCanadaPercCertifedMoreThanOneStandard711;
	}

	public void setCs6UsCanadaPercCertifedMoreThanOneStandard711(Float cs6UsCanadaPercCertifedMoreThanOneStandard711) {
		this.cs6UsCanadaPercCertifedMoreThanOneStandard711 = cs6UsCanadaPercCertifedMoreThanOneStandard711;
	}
}

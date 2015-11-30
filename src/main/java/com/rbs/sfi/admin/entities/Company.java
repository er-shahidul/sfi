package com.rbs.sfi.admin.entities;

import javax.persistence.*;

@Entity
@Table(name="companies")
public class Company extends Audit
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="name", unique=true, nullable=true)
	private String name;

	@ManyToOne(targetEntity = AreaUnit.class, optional=true)
	@JoinColumn(name="area_unit_id", referencedColumnName="id", nullable=true)
	private AreaUnit areaUnit;

	@Lob @Basic(fetch = FetchType.LAZY)
	@Column(name="logo", nullable=true)
	private byte[] logo;

	@Column(name="logo_name", nullable=true)
	private String logoName;

	@Column(name="sfi0_sci1", nullable=true)
	private boolean sfi0Sci1;

	@Column(name="primary0_secondary1", nullable=true)
	private boolean primary0Secondary1;

	@Column(name="is_active", nullable = false, columnDefinition = "Boolean default true")
	private Boolean isActive;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	public String getLogoName() {
		return logoName;
	}

	public void setLogoName(String logoName) {
		this.logoName = logoName;
	}

	public AreaUnit getAreaUnit() {
		return areaUnit;
	}

	public void setAreaUnit(AreaUnit areaUnit) {
		this.areaUnit = areaUnit;
	}

	public boolean isSfi0Sci1() {
		return sfi0Sci1;
	}

	public void setSfi0Sci1(boolean sfi0Sci1) {
		this.sfi0Sci1 = sfi0Sci1;
	}

	public boolean isPrimary0Secondary1() {
		return primary0Secondary1;
	}

	public void setPrimary0Secondary1(boolean primary0Secondary1) {
		this.primary0Secondary1 = primary0Secondary1;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
}

package com.rbs.sfi.admin.entities;

import com.rbs.sfi.core.entities.AreaUnit;

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

	@ManyToOne(targetEntity = com.rbs.sfi.core.entities.AreaUnit.class, optional=true)
	@JoinColumn(name="area_unit_id", referencedColumnName="id", nullable=true)
	private AreaUnit areaUnit;

	@Lob @Basic(fetch = FetchType.LAZY)
	@Column(name="logo", nullable=true)
	private byte[] logo;

	@Column(name="logo_name", nullable=true)
	private String logoName;

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name +", areaUnit=" + areaUnit +", logo=" + logo +", logoName=" + logoName +"]";
	}

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
}

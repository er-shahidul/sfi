package com.rbs.www.admin.entities;

import com.rbs.www.common.services.TypeConversionUtils;

import javax.persistence.*;

@Entity
@Table(name = "companies")
public class Company extends Audit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", unique = true, nullable = true)
    private String name;

    @ManyToOne(targetEntity = AreaUnit.class, optional = true)
    @JoinColumn(name = "area_unit_id", referencedColumnName = "id", nullable = true)
    private AreaUnit areaUnit;

	@Lob @Basic(fetch = FetchType.LAZY)
	@Column(name="logo", nullable=true)
	private Byte[] logo;

    @Column(name = "logo_name", nullable = true)
    private String logoName;

    @Column(name = "sfi", nullable = false)
    private Boolean sfi = false;

    @Column(name = "sci", nullable = false)
    private Boolean sci = false;

    @Column(name = "primary_user", nullable = false)
    private Boolean primary = false;

    @Column(name = "secondary_user", nullable = false)
    private Boolean secondary = false;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive = true;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public Byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
        this.logo = TypeConversionUtils.toObjectType(logo);
	}

	public void setLogo(Byte[] logo) {
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

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Boolean getSfi() {
        return sfi;
    }

    public void setSfi(Boolean sfi) {
        this.sfi = sfi;
    }

    public Boolean getSci() {
        return sci;
    }

    public void setSci(Boolean sci) {
        this.sci = sci;
    }

    public Boolean getPrimary() {
        return primary;
    }

    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    public Boolean getSecondary() {
        return secondary;
    }

    public void setSecondary(Boolean secondary) {
        this.secondary = secondary;
    }
}

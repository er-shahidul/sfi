package com.rbs.sfi.web.models.entities;

import com.rbs.sfi.common.models.BaseEntityModel;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="sfi_pp_forms")
public class Cs3 extends BaseEntityModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="cs3_isInPartnership", nullable=true)
	private Boolean isInPartnership;

	@OneToMany(targetEntity = SfiPpFormCs3.class, mappedBy="sfiPpForm" , fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	private Set<SfiPpFormCs3> projects;

    @Override
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean isInPartnership() {
		return isInPartnership;
	}

	public void setIsInPartnership(Boolean isInPartnership) {
		this.isInPartnership = isInPartnership;
	}

	public Set<SfiPpFormCs3> getProjects() {
		return projects;
	}

	public void setProjects(Set<SfiPpFormCs3> projects) {
		addAll(this.projects, projects);
	}
}
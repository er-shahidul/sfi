package com.rbs.sfi.core.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="sfi_pp_forms")
public class Cs3
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="cs3_isInPartnership", nullable=true)
	private Boolean isInPartnership;

	@OneToMany(targetEntity = SfiPpFormCs3.class, mappedBy="sfiPpForm" , fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	private List<SfiPpFormCs3> projects;

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

	public List<SfiPpFormCs3> getProjects() {
		return projects;
	}

	public void setProjects(List<SfiPpFormCs3> projects) {
		this.projects = projects;
	}
}

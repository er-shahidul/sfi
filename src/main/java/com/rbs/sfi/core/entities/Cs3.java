package com.rbs.sfi.core.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="sfi_pp_forms")
public class Cs3
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="cs3_isInPartnership", nullable=true)
	private boolean cs3IsInPartnership;

	@OneToMany(targetEntity = SfiPpFormCs3.class, mappedBy="sfiPpForm" , fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	private List<SfiPpFormCs3> cs3Projects;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isCs3IsInPartnership() {
		return cs3IsInPartnership;
	}

	public void setCs3IsInPartnership(boolean cs3IsInPartnership) {
		this.cs3IsInPartnership = cs3IsInPartnership;
	}

	public List<SfiPpFormCs3> getCs3Projects() {
		return cs3Projects;
	}

	public void setCs3Projects(List<SfiPpFormCs3> cs3Projects) {
		this.cs3Projects = cs3Projects;
	}
}

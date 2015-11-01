package com.rbs.sfi.core.entities;

import javax.persistence.*;

@Entity
@Table(name="sfi_pp_form_status")
public class SfiPpFormStatus
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="formStatus", nullable=true)
	private String status;

	@Column(name="statusName", nullable=true)
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

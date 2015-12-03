package com.rbs.sfi.web.models.entities;

import com.rbs.sfi.common.models.BaseEntityModel;

import javax.persistence.*;

@Entity
@Table(name="sfi_pp_forms")
public class Cs9 extends BaseEntityModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="cs9_acknowledge", nullable=true)
	private Boolean cs9Acknowledge;

    @Override
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean isCs9Acknowledge() {
		return cs9Acknowledge;
	}

	public void setCs9Acknowledge(Boolean cs9Acknowledge) {
		this.cs9Acknowledge = cs9Acknowledge;
	}
}
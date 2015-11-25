package com.rbs.sfi.core.entities;

import javax.persistence.*;

@Entity
@Table(name="sfi_pp_forms")
public class Cs9
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="cs9_acknowledge", nullable=true)
	private boolean cs9Acknowledge;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isCs9Acknowledge() {
		return cs9Acknowledge;
	}

	public void setCs9Acknowledge(boolean cs9Acknowledge) {
		this.cs9Acknowledge = cs9Acknowledge;
	}
}

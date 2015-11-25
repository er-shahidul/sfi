package com.rbs.sfi.core.entities;

import javax.persistence.*;

@Entity
@Table(name="sfi_pp_form_cs3_project_support_docs")
public class SfiPpFormCs3ProjectSupportDocs
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@ManyToOne(targetEntity = SfiPpFormCs3.class)
	@JoinColumn(name="cs3_projectID", referencedColumnName="id", nullable=true)
	private SfiPpFormCs3 sfiPpFormCs3;

	@Column(name="cs3_project_originalDocumentName", nullable=true)
	private String cs3ProjectOriginalDocumentName;

	@Column(name="cs3_project_uniqueDocumentName", nullable=true)
	private String cs3ProjectUniqueDocumentName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SfiPpFormCs3 getSfiPpFormCs3() {
		return sfiPpFormCs3;
	}

	public void setSfiPpFormCs3(SfiPpFormCs3 sfiPpFormCs3) {
		this.sfiPpFormCs3 = sfiPpFormCs3;
	}

	public String getCs3ProjectOriginalDocumentName() {
		return cs3ProjectOriginalDocumentName;
	}

	public void setCs3ProjectOriginalDocumentName(String cs3ProjectOriginalDocumentName) {
		this.cs3ProjectOriginalDocumentName = cs3ProjectOriginalDocumentName;
	}

	public String getCs3ProjectUniqueDocumentName() {
		return cs3ProjectUniqueDocumentName;
	}

	public void setCs3ProjectUniqueDocumentName(String cs3ProjectUniqueDocumentName) {
		this.cs3ProjectUniqueDocumentName = cs3ProjectUniqueDocumentName;
	}
}

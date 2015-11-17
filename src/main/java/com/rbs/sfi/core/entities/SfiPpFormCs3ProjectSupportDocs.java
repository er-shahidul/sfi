package com.rbs.sfi.core.entities;

import javax.persistence.*;

@Entity
@Table(name="sfi_pp_form_cs3_project_support_docs")
public class SfiPpFormCs3ProjectSupportDocs
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

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

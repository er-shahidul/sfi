package com.rbs.sfi.web.models.entities;

import com.rbs.sfi.common.models.BaseEntityModel;

import javax.persistence.*;

@Entity
@Table(name="sfi_pp_form_cs3_project_support_docs")
public class SfiPpFormCs3ProjectSupportDocs extends BaseEntityModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="cs3_projectID", nullable=true)
	private Integer sfiPpFormCs3;

	@Column(name="cs3_project_originalDocumentName", nullable=true)
	private String projectOriginalDocumentName;

	@Column(name="cs3_project_uniqueDocumentName", nullable=true)
	private String projectUniqueDocumentName;

    @Override
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

    public Integer getSfiPpFormCs3() {
        return sfiPpFormCs3;
    }

    public void setSfiPpFormCs3(Integer sfiPpFormCs3) {
        this.sfiPpFormCs3 = sfiPpFormCs3;
    }

    public String getProjectOriginalDocumentName() {
        return projectOriginalDocumentName;
    }

    public void setProjectOriginalDocumentName(String projectOriginalDocumentName) {
        this.projectOriginalDocumentName = projectOriginalDocumentName;
    }

    public String getProjectUniqueDocumentName() {
        return projectUniqueDocumentName;
    }

    public void setProjectUniqueDocumentName(String projectUniqueDocumentName) {
        this.projectUniqueDocumentName = projectUniqueDocumentName;
    }
}

package com.rbs.www.web.sic.models.entities;

import com.rbs.www.common.models.BaseEntityModel;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sic_forms")
public class SicCs8 extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cs8_inPartnershipProjects", nullable = true)
    private Boolean inPartnershipProjects;

    @OneToMany(targetEntity = SicCs8Project.class, mappedBy = "sicPpForm", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<SicCs8Project> projects;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getInPartnershipProjects() {
        return inPartnershipProjects;
    }

    public void setInPartnershipProjects(Boolean inPartnershipProjects) {
        this.inPartnershipProjects = inPartnershipProjects;
    }

    public Set<SicCs8Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<SicCs8Project> projects) {
        addAll(this.projects, projects);
    }
}

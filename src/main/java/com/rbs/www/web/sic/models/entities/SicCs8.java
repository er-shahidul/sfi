package com.rbs.www.web.sic.models.entities;

import com.rbs.www.common.models.BaseEntityModel;
import org.hibernate.annotations.Type;

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

    @Column(name = "cs8_partnerOtherSICState", nullable = true)
    private Integer partnerOtherSICState;

    @Column(name = "cs8_partnerOtherSpecify", nullable = true)
    @Type(type = "text")
    private String partnerOtherSpecify;

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

    public Integer getPartnerOtherSICState() {
        return partnerOtherSICState;
    }

    public void setPartnerOtherSICState(Integer partnerOtherSICState) {
        this.partnerOtherSICState = partnerOtherSICState;
    }

    public String getPartnerOtherSpecify() {
        return partnerOtherSpecify;
    }

    public void setPartnerOtherSpecify(String partnerOtherSpecify) {
        this.partnerOtherSpecify = partnerOtherSpecify;
    }

    public Set<SicCs8Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<SicCs8Project> projects) {
        addAll(this.projects, projects);
    }
}

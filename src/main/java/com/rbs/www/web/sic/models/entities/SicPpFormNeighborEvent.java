package com.rbs.www.web.sic.models.entities;

import com.rbs.www.common.models.BaseEntityModel;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "sic_pp_form_cs2_neighbour_event")
public class SicPpFormNeighborEvent extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "form_id", nullable = true)
    private Integer sicPpForm;

    @Column(name = "comment", nullable = true)
    @Type(type="text")
    private String comment;

    @Column(name = "whichSic", nullable = true)
    private String whichSic;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSicPpForm() {
        return sicPpForm;
    }

    public void setSicPpForm(Integer sicPpForm) {
        this.sicPpForm = sicPpForm;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getWhichSic() {
        return whichSic;
    }

    public void setWhichSic(String whichSic) {
        this.whichSic = whichSic;
    }
}

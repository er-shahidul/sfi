package com.rbs.www.web.sic.models.entities;

import com.rbs.www.common.models.BaseEntityModel;
import com.rbs.www.web.common.models.entities.SfiPpFormRegion;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "sic_pp_form_cs1_meeting")
public class SicPpFormMeeting extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "form_id", nullable = true)
    private Integer sicPpForm;

    @Column(name = "name", nullable = true)
    private String name;

    @Column(name = "involvement", nullable = true)
    private String involvement;

    @Column(name = "date", nullable = true)
    private Date date;

    @Column(name = "location", nullable = true)
    private String location;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getSicPpForm() {
        return sicPpForm;
    }

    public void setSicPpForm(Integer sicPpForm) {
        this.sicPpForm = sicPpForm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInvolvement() {
        return involvement;
    }

    public void setInvolvement(String involvement) {
        this.involvement = involvement;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

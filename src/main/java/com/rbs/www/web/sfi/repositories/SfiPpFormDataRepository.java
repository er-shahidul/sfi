package com.rbs.www.web.sfi.repositories;

import com.rbs.www.admin.models.entities.Company;
import com.rbs.www.common.repositories.BaseRepository;
import com.rbs.www.web.sfi.models.entities.SfiPpFormData;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Repository
public class SfiPpFormDataRepository extends BaseRepository<SfiPpFormData> {
    public SfiPpFormData getByCompany(Company company) {
        return (SfiPpFormData) getCriteria()
                .add(Restrictions.eq("company", company))
                .uniqueResult();
    }

    public Date getUpdateAt(Integer id) {
        return (Date) getCriteria()
                .add(Restrictions.eq("id", id))
                .setProjection(Projections.property("updatedAt"))
                .uniqueResult();
    }

    @Transactional
    @SuppressWarnings("unchecked")
    public List<SfiPpFormData> getAllActiveForms(){
        return (List<SfiPpFormData>) getCriteria()
                .createAlias("status", "status")
                .createAlias("updatedBy", "updatedBy")
                .createAlias("createdBy", "createdBy")
                .createAlias("company", "company")
                .add(Restrictions.eq("company.sfi", true))
                .addOrder(Order.desc("id"))
                .list();
    }
}

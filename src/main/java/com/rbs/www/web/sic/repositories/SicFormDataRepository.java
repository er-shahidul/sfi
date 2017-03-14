package com.rbs.www.web.sic.repositories;

import com.rbs.www.admin.models.entities.Company;
import com.rbs.www.common.repositories.BaseRepository;
import com.rbs.www.web.sic.models.entities.SicFormData;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Repository
public class SicFormDataRepository extends BaseRepository<SicFormData> {
    public SicFormData getByCompany(Company company) {
        return (SicFormData) getCriteria()
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
    public List<SicFormData> getAllActiveForms(){
        return (List<SicFormData>) getCriteria()
                .createAlias("company", "company")
                .add(Restrictions.eq("company.sci", true))
                .addOrder(Order.desc("id"))
                .list();
    }
}

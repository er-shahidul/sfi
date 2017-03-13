package com.rbs.www.web.common.repositories;

import com.rbs.www.common.repositories.BaseRepository;
import com.rbs.www.web.common.models.entities.SfiPpFormAllCountry;
import com.rbs.www.web.sfi.models.entities.SfiPpForm2014;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class SfiPpFormAllCountryRepository extends BaseRepository<SfiPpFormAllCountry> {

    @Transactional
    @SuppressWarnings("unchecked")
    public List<SfiPpFormAllCountry> getAll(){
        return (List<SfiPpFormAllCountry>) getCriteria()
                .addOrder(Order.asc("country"))
                .list();
    }

}
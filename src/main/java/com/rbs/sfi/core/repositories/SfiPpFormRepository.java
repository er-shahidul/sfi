package com.rbs.sfi.core.repositories;

import com.rbs.sfi.admin.entities.Company;
import com.rbs.sfi.core.entities.SfiPpForm;

import java.util.List;

public interface SfiPpFormRepository
{
    List<SfiPpForm>list();
    SfiPpForm findById(int id);
    SfiPpForm merge(SfiPpForm entity);
    SfiPpForm findByCompany(Company company);
    void save(SfiPpForm sfiPpForm);
}

package com.rbs.sfi.core.repositories;

import com.rbs.sfi.admin.entities.Company;
import com.rbs.sfi.core.entities.SfiPpForm;

public interface SfiPpFormRepository
{
    SfiPpForm findById(int id);
    SfiPpForm merge(SfiPpForm entity);
    SfiPpForm findByCompany(Company company);
    void save(SfiPpForm sfiPpForm);
}

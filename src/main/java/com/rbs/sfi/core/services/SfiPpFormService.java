package com.rbs.sfi.core.services;

import com.rbs.sfi.admin.entities.Company;
import com.rbs.sfi.core.entities.SfiPpForm;

public interface SfiPpFormService
{
    SfiPpForm findById(int id);
    SfiPpForm findByCompany(Company company);
    void save(SfiPpForm sfiPpForm);
}

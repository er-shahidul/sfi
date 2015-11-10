package com.rbs.sfi.core.services;

import com.rbs.sfi.admin.entities.Company;
import com.rbs.sfi.core.entities.SfiPpForm;

import java.util.List;

public interface SfiPpFormService
{
    List<SfiPpForm> list();
    SfiPpForm findById(int id);
    SfiPpForm findByCompany(Company company);
    void save(SfiPpForm sfiPpForm);
    SfiPpForm saveCS1(SfiPpForm sfiPpForm);
}

package com.rbs.sfi.admin.services;

import com.rbs.sfi.admin.entities.Company;

import java.util.List;

public interface CompanyService
{
    List<Company> list();
    void save(Company company);
    Company findById(int id);
    void update(Company company);
}

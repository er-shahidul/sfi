package com.rbs.sfi.admin.repositories;

import com.rbs.sfi.admin.entities.Company;

import java.util.List;

public interface CompanyRepository
{
    List<Company> list();
    void save(Company company);
    void update(Company company);
    Company findById(int id);
}

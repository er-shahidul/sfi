package com.rbs.sfi.admin.services;

import com.rbs.sfi.admin.entities.Company;
import com.rbs.sfi.admin.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("companyService")
@Transactional
public class CompanyService
{
    @Autowired
    CompanyRepository companyRepository;

    public List<Company> list() {
        return companyRepository.list();
    }

    public void save(Company company){
        companyRepository.save(company);
    }

    public Company findById(int id) {
        return companyRepository.findById(id);
    }

    public void update(Company company) {
        Company entity = this.findById(company.getId());
        if(entity!=null){
            entity.setName(company.getName());
            entity.setAreaUnit(company.getAreaUnit());
            companyRepository.update(entity);
        }
    }

    public void softDelete(Company company) {
        Company entity = this.findById(company.getId());
        if(entity!=null){
            entity.setIsActive(false);
            companyRepository.update(entity);
        }
    }
}

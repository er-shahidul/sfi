package com.rbs.sfi.admin.services;

import com.rbs.sfi.admin.entities.Company;
import com.rbs.sfi.admin.repositories.CompanyRepository;
import com.rbs.sfi.admin.util.Util;
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

    public void save(Company company, byte[] fileN, String name){
        company.setLogoName(name);
        company.setLogo(fileN);
        company.setIsActive(true);
        company.setUpdatedAt(Util.getCurrentDate());
        company.setUpdatedBy(Util.getCurrentUsername());
        company.setCreatedAt(Util.getCurrentDate());
        company.setCreatedBy(Util.getCurrentUsername());
        companyRepository.save(company);
    }

    public Company findById(Integer id) {
        return companyRepository.findById(id);
    }

    public void update(Company company, byte[] fileN, String name) {
        Company entity = this.findById(company.getId());
        if(entity!=null){
            entity.setName(company.getName());
            entity.setSci(company.getSci());
            entity.setSfi(company.getSfi());
            entity.setPrimary(company.getPrimary());
            entity.setSecondary(company.getSecondary());
            entity.setAreaUnit(company.getAreaUnit());
            entity.setUpdatedAt(Util.getCurrentDate());
            entity.setUpdatedBy(Util.getCurrentUsername());
            entity.setLogoName(name);
            if(fileN!=null){entity.setLogo(fileN);}
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

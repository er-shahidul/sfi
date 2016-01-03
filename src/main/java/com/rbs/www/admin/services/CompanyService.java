package com.rbs.www.admin.services;

import com.rbs.www.admin.models.entities.Company;
import com.rbs.www.admin.models.viewmodels.CompanyViewModel;
import com.rbs.www.admin.repositories.CompanyRepository;
import com.rbs.www.common.util.Util;
import com.rbs.www.common.mapper.EntityModelMapperService;
import com.rbs.www.common.mapper.ViewModelMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CompanyService
{
    @Autowired
    CompanyRepository companyRepository;

    @Autowired
    private ViewModelMapperService viewModelMapperService;

    @Autowired
    private EntityModelMapperService entityModelMapperService;

    public List<CompanyViewModel> list() {
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
        companyRepository.persist(company);
    }

//    public void setCompanyEntity(CompanyViewModel model, byte[] fileN, String name) {
//        model.setIsActive(true);
//        model.setAreaUnit(model.getAreaUnit());
//        model.setLogoName(name);
//        if(fileN!=null){model.setLogo(TypeConversionUtils.toObjectType(fileN));}
//        model.setUpdatedAt(Util.getCurrentDate());
//        model.setUpdatedBy(Util.getCurrentUsername());
//        model.setCreatedAt(Util.getCurrentDate());
//        model.setCreatedBy(Util.getCurrentUsername());
//        Company entity = entityModelMapperService.convert(model, Company.class);
//    }

    public CompanyViewModel getViewModelById(Integer id) {
        Company entity = companyRepository.getByKey(id);
        return viewModelMapperService.convert(entity, CompanyViewModel.class);
    }

    public Company findById(Integer id) {
        return companyRepository.getByKey(id);
    }

    public void deleteCompanyEntity(CompanyViewModel model) {
        model.setIsActive(false);
        Company entity = entityModelMapperService.convert(model, Company.class);
    }

    public void update(Company company, byte[] fileN, String name) {
        Company entity = companyRepository.getByKey(company.getId());
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
            companyRepository.persist(entity);
        }
    }

    public void unitUpdate(Company company) {
        Company entity = companyRepository.getByKey(company.getId());
        if(entity!=null){
            entity.setAreaUnit(company.getAreaUnit());
            entity.setUpdatedAt(Util.getCurrentDate());
            entity.setUpdatedBy(Util.getCurrentUsername());
            companyRepository.persist(entity);
        }
    }

    public void logoUpdate(Company company, byte[] fileN, String name) {
        Company entity = companyRepository.getByKey(company.getId());
        if(entity!=null){
            entity.setLogoName(name);
            if(fileN!=null){entity.setLogo(fileN);}
            entity.setUpdatedAt(Util.getCurrentDate());
            entity.setUpdatedBy(Util.getCurrentUsername());
            companyRepository.persist(entity);
        }
    }
}

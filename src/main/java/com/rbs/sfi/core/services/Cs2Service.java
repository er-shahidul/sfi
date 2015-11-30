package com.rbs.sfi.core.services;
import com.rbs.sfi.common.services.AutoPopulateService;
import com.rbs.sfi.core.models.entities.Cs2;
import com.rbs.sfi.core.models.entities.SfiPpFormCs2OutsideUsaCa;
import com.rbs.sfi.core.models.viewmodels.Cs2ViewModel;
import com.rbs.sfi.core.repositories.Cs2Repository;
import com.rbs.sfi.core.repositories.SfiPpFormCs2OutsideUsaCaRepository;
import com.rbs.sfi.core.repositories.SfiPpFormOtherCountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;

@Service
@Transactional
public class Cs2Service {
    @Autowired
    private Cs2Repository cs2Repository;

    @Autowired
    private AutoPopulateService populateService;

    @Autowired
    private SfiPpFormCs2OutsideUsaCaRepository sfiPpFormCs2OutsideUsaCaRepository;

    @Autowired
    private SfiPpFormOtherCountryRepository sfiPpFormOtherCountryRepository;

    public Cs2ViewModel getViewModel(Integer id) {
        Cs2 entity = cs2Repository.findById(id);
        Cs2ViewModel model = new Cs2ViewModel();

        populateService.populate(entity, model);
        return model;
    }

    public void setEntity(Cs2ViewModel model) {
        Cs2 entity = cs2Repository.findById(model.getId());

        entity.setUsaPrivateTotalAreaOwnOrManage(model.getUsaPrivateTotalAreaOwnOrManage());
        entity.setUsaPrivateForestlandOwnMng(model.getUsaPrivateForestlandOwnMng());
        entity.setUsaPrivateForestlandOwnMngOther(model.getUsaPrivateForestlandOwnMngOther());
        entity.setUsaPrivateTotalAreaCertified(model.getUsaPrivateTotalAreaCertified());
        entity.setUsaPrivateAreaManagedForPublic(model.getUsaPrivateAreaManagedForPublic());
        entity.setUsaPrivateAreaCertifiedForPublic(model.getUsaPrivateAreaCertifiedForPublic());
        entity.setUsaPublicTotalAreaOwnOrManage(model.getUsaPublicTotalAreaOwnOrManage());
        entity.setUsaPublicForestlandOwnMng(model.getUsaPublicForestlandOwnMng());
        entity.setUsaPublicForestlandOwnMngOther(model.getUsaPublicForestlandOwnMngOther());
        entity.setUsaPublicTotalAreaCertified(model.getUsaPublicTotalAreaCertified());
        entity.setUsaPublicAreaManagedForPublic(model.getUsaPublicAreaManagedForPublic());
        entity.setUsaPublicAreaCertifiedForPublic(model.getUsaPublicAreaCertifiedForPublic());
        entity.setCaCrownTotalAreaOwnOrManage(model.getCaCrownTotalAreaOwnOrManage());
        entity.setCaCrownForestlandOwnMng(model.getCaCrownForestlandOwnMng());
        entity.setCaCrownForestlandOwnMngOther(model.getCaCrownForestlandOwnMngOther());
        entity.setCaCrownTotalAreaCertified(model.getCaCrownTotalAreaCertified());
        entity.setCaCrownAreaManagedForPublic(model.getCaCrownAreaManagedForPublic());
        entity.setCaCrownAreaCertifiedForPublic(model.getCaCrownAreaCertifiedForPublic());
        entity.setCaPrivateTotalAreaOwnOrManage(model.getCaPrivateTotalAreaOwnOrManage());
        entity.setCaPrivateForestlandOwnMng(model.getCaPrivateForestlandOwnMng());
        entity.setCaPrivateForestlandOwnMngOther(model.getCaPrivateForestlandOwnMngOther());
        entity.setCaPrivateTotalAreaCertified(model.getCaPrivateTotalAreaCertified());
        entity.setCaPrivateAreaManagedForPublic(model.getCaPrivateAreaManagedForPublic());
        entity.setCaPrivateAreaCertifiedForPublic(model.getCaPrivateAreaCertifiedForPublic());

        entity.setUsaPrivateRecreationCategories(model.getUsaPrivateRecreationCategories());
        entity.setUsaPublicRecreationCategories(model.getUsaPublicRecreationCategories());
        entity.setCaCrownRecreationCategories(model.getCaCrownRecreationCategories());
        entity.setCaPrivateRecreationCategories(model.getCaPrivateRecreationCategories());
        addOutsideCountries(entity, model.getOutsideCountries());

        cs2Repository.save(entity);
    }

    private void addOutsideCountries(Cs2 entity, Set<SfiPpFormCs2OutsideUsaCa> outsideCountries) {
        if (outsideCountries == null) return;
        Set<SfiPpFormCs2OutsideUsaCa> cs2OutsideCountries = entity.getOutsideCountries();
        cs2OutsideCountries.clear();

        for (SfiPpFormCs2OutsideUsaCa sfiPpFormCs2OutsideUsaCa : outsideCountries) {
            if (sfiPpFormCs2OutsideUsaCa == null) continue;
            SfiPpFormCs2OutsideUsaCa temp = null;

            if (sfiPpFormCs2OutsideUsaCa.getId() == null) {
                temp = new SfiPpFormCs2OutsideUsaCa();
                temp.setSfiPpForm(entity.getId().hashCode());

            } else {
                temp = sfiPpFormCs2OutsideUsaCaRepository.findById(sfiPpFormCs2OutsideUsaCa.getId());
            }

            temp.setCountry(sfiPpFormOtherCountryRepository.findById(sfiPpFormCs2OutsideUsaCa.getCountry().getId()));
            temp.setStandardType(sfiPpFormCs2OutsideUsaCa.getStandardType());
            temp.setStandardTypeOther(sfiPpFormCs2OutsideUsaCa.getStandardTypeOther());
            temp.setTotalArea(sfiPpFormCs2OutsideUsaCa.getTotalArea());
            temp.setUnderCertifiedStandard(sfiPpFormCs2OutsideUsaCa.getUnderCertifiedStandard());
            sfiPpFormCs2OutsideUsaCaRepository.save(temp);

            cs2OutsideCountries.add(temp);
        }
        entity.setOutsideCountries(cs2OutsideCountries);
    }
}

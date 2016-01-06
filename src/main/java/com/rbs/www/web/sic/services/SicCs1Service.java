package com.rbs.www.web.sic.services;

import com.rbs.www.web.sic.models.entities.SicCs1;
import com.rbs.www.web.sic.models.entities.SicPpFormMeeting;
import com.rbs.www.web.sic.models.entities.SicPpFormMeetingType;
import com.rbs.www.web.sic.models.viewmodels.SicCs1ViewModel;
import com.rbs.www.web.sic.models.viewmodels.SicPpFormCommitteeViewModel;
import com.rbs.www.web.sic.models.viewmodels.SicPpFormMeetingTypeViewModel;
import com.rbs.www.web.sic.models.viewmodels.SicPpFormMeetingViewModel;
import com.rbs.www.web.sic.repositories.SicCs1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
@Transactional
public class SicCs1Service {
    @Autowired
    private SicCs1Repository repository;

    public SicCs1 get(Integer id) {
        return repository.get(id);
    }

    public void manualPopulation(SicCs1ViewModel model) {
//        setSubCommitteesSicPpForm(model);
        setParticipatingMeetingListSicPpForm(model);
        setMeetingListSicPpForm(model);
    }

    private void setMeetingListSicPpForm(SicCs1ViewModel model) {
        Set<SicPpFormMeetingTypeViewModel> meetingList = model.getMeetingList();

        for (SicPpFormMeetingTypeViewModel meeting : meetingList) {
            if (meeting.getSicPpForm() != null) continue;
            meeting.setSicPpForm(model.getId().hashCode());
        }
    }

    private void setParticipatingMeetingListSicPpForm(SicCs1ViewModel model) {
        Set<SicPpFormMeetingViewModel> participatingMeetingList = model.getParticipatingMeetingList();

        for (SicPpFormMeetingViewModel participatingMeeting : participatingMeetingList) {
            if (participatingMeeting.getSicPpForm() != null) continue;
            participatingMeeting.setSicPpForm(model.getId().hashCode());
        }
    }

    private void setSubCommitteesSicPpForm(SicCs1ViewModel model) {
        Set<SicPpFormCommitteeViewModel> subCommittees = model.getSubCommittees();

        for (SicPpFormCommitteeViewModel subCommittee : subCommittees) {
            if (subCommittee.getSicPpForm() != null) continue;
            subCommittee.setSicPpForm(model.getId().hashCode());
        }
    }
}

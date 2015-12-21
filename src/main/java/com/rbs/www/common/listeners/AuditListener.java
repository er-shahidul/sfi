package com.rbs.www.common.listeners;

import com.rbs.www.admin.models.datamodels.Audit;
import com.rbs.www.common.util.Util;
import org.springframework.stereotype.Component;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;

@Component
public class AuditListener {
    @PrePersist
	public void prePersist(Audit audit) {
		Date currentDate = Util.getCurrentDate();
		String username = Util.getCurrentUsername();
		audit.setCreatedBy(username);
		audit.setCreatedAt(currentDate);
		audit.setUpdatedBy(username);
		audit.setUpdatedAt(currentDate);
	}

	@PreUpdate
	public void preUpdate(Audit audit) {
		Date currentDate = Util.getCurrentDate();
		String username = Util.getCurrentUsername();
		audit.setUpdatedBy(username);
		audit.setUpdatedAt(currentDate);
	}
}

package com.zoya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoya.model.ActivityLog;
import com.zoya.repositories.ActivityLogRepository;
@Service
public class AcitivityLogServiceImpl implements AcitivityLogService{
	@Autowired
	ActivityLogRepository activityLogRepository;

	@Override
	public ActivityLog saveActivityLog(ActivityLog activityLog) {
		
		ActivityLog act1=activityLogRepository.save(activityLog);
		return act1;
		
		
	}

}

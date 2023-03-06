package com.devopsinc.bugscout.services.systemUser;

import com.devopsinc.bugscout.models.SystemUser;
import com.devopsinc.bugscout.services.CrudService;
import org.springframework.stereotype.Service;

@Service
public interface SystemUserService extends CrudService<SystemUser, String> {
}

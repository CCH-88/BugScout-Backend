package com.devopsinc.bugscout.services.personInfo;

import com.devopsinc.bugscout.models.PersonInfo;
import com.devopsinc.bugscout.services.CrudService;
import org.springframework.stereotype.Service;

@Service
public interface PersonInfoService extends CrudService<PersonInfo, String> {

}

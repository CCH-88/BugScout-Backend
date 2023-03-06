package com.devopsinc.bugscout.services.personInfo;

import com.devopsinc.bugscout.models.PersonInfo;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PersonInfoServiceImpl implements PersonInfoService {

    /**
     * @param s
     * @return
     */
    @Override
    public PersonInfo findById(String s) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public Collection<PersonInfo> findAll() {
        return null;
    }

    /**
     * @param entity
     * @return
     */
    @Override
    public PersonInfo add(PersonInfo entity) {
        return null;
    }

    /**
     * @param entity
     * @return
     */
    @Override
    public PersonInfo update(PersonInfo entity) {
        return null;
    }

    /**
     * @param s
     */
    @Override
    public void deleteById(String s) {

    }

    /**
     * @param s
     * @return
     */
    @Override
    public boolean exists(String s) {
        return false;
    }
}

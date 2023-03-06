package com.devopsinc.bugscout.services.systemUser;

import com.devopsinc.bugscout.models.SystemUser;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class SystemUserServiceImpl implements SystemUserService{
    /**
     * @param s
     * @return
     */
    @Override
    public SystemUser findById(String s) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public Collection<SystemUser> findAll() {
        return null;
    }

    /**
     * @param entity
     * @return
     */
    @Override
    public SystemUser add(SystemUser entity) {
        return null;
    }

    /**
     * @param entity
     * @return
     */
    @Override
    public SystemUser update(SystemUser entity) {
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

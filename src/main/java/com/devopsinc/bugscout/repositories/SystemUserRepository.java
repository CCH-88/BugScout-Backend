package com.devopsinc.bugscout.repositories;

import com.devopsinc.bugscout.models.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemUserRepository extends JpaRepository<SystemUser, Integer> {
}

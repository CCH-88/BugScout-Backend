package com.devopsinc.bugscout.repositories;

import com.devopsinc.bugscout.models.PersonInfo;
import com.devopsinc.bugscout.models.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonInfoRepository extends JpaRepository<PersonInfo, Integer> {
}

package com.devopsinc.bugscout.controllers;

import com.devopsinc.bugscout.services.systemUser.SystemUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/user")
public class SystemUserController {


    private final SystemUserService systemUserService;

    public SystemUserController(SystemUserService systemUserService) {
        this.systemUserService = systemUserService;
    }
}

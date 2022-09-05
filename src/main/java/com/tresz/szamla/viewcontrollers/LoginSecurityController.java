package com.tresz.szamla.viewcontrollers;

import com.tresz.szamla.services.LoginSecurityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

@Controller
public class LoginSecurityController {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginSecurityController.class);        // az osztályhoz elkérek egy loggert,

    private static LoginSecurityService securityService;

    public LoginSecurityController(LoginSecurityService securityService) {
        this.securityService = securityService;
    }

    public void Logout(){ securityService.logout();  }
}

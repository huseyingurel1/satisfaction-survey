package com.huseyin.service;

import com.huseyin.dto.UserRegistrationDto;
import com.huseyin.model.Result;
import com.huseyin.model.User;

import java.security.Principal;

public interface EmailService {

    public String sendEmail(Principal principal);

}

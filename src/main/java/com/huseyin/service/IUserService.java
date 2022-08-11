package com.huseyin.service;


import com.huseyin.model.User;
import com.huseyin.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;


public interface IUserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);

    List<User> getAllUsers();

    User getUserById(Long id);

    User updateUser(User user);



}

package com.example.dpma.service;


import com.example.dpma.dao.UserDAO;
import com.example.dpma.formdata.UserProfileFormData;
import com.example.dpma.model.User;
import com.example.dpma.model.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UserDAO userDAO;
    @Autowired
    private UserProfileServiceImpl userProfileServiceImpl;

    @Override
    public void saveUser(User user) {
        String encodedPassword = bCryptPasswordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        userDAO.save(user);

        UserProfileFormData formData = new UserProfileFormData();
        formData.setUser(user);
        formData.setUser_name(user.getUsername());
        userProfileServiceImpl.save(formData);

    }

    @Override
    public boolean isUserPresent(User user) {
        Optional<User> storedUser = userDAO.findByUsername(user.getUsername());
        return storedUser.isPresent();
    }

    // Method defined in Spring Security UserDetailsService interface
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // orElseThrow method of Optional container that throws an exception if Optional result  is null
        return userDAO.findByUsername(username).orElseThrow(
                () -> new UsernameNotFoundException(
                        String.format("USER_NOT_FOUND %s", username)
                ));
    }
}

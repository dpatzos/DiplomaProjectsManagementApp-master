package com.example.dpma.service;

import com.example.dpma.dao.UserProfileDAO;
import com.example.dpma.formdata.UserProfileFormData;
import com.example.dpma.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    @Autowired
    private UserProfileDAO userProfileDAO;


    @Override
    public UserProfileFormData retrieveProfile(String username) {

        UserProfile userProfile = userProfileDAO.findByUsername(username);

        UserProfileFormData formData = new UserProfileFormData();
        formData.setUser_name(userProfile.getUsername());
        formData.setFullname(userProfile.getFullname());
        formData.setAddress(userProfile.getAddress());
        formData.setAge(userProfile.getAge());
        formData.setPhoneNumber(userProfile.getPhonenumber());


        return formData;

    }

    @Override
    public void save(UserProfileFormData userProfileFormData) {
        UserProfile userProfile = userProfileDAO.findByUsername(userProfileFormData.getUser_name());
        if (userProfile == null) {
            userProfile = new UserProfile();
            userProfile.setUsername(userProfileFormData.getUser_name());
            userProfile.setUser(userProfileFormData.getUser());
        }
        userProfile.setFullname(userProfileFormData.getFullname());
        userProfile.setAddress(userProfileFormData.getAddress());
        userProfile.setAge(userProfileFormData.getAge());
        userProfile.setPhonenumber(userProfileFormData.getPhoneNumber());

        userProfileDAO.save(userProfile);
    }
}

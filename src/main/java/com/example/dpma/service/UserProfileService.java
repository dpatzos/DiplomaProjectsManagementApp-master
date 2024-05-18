package com.example.dpma.service;

import com.example.dpma.formdata.UserProfileFormData;
import com.example.dpma.model.UserProfile;
import org.springframework.stereotype.Service;

@Service
public interface UserProfileService {

    UserProfileFormData retrieveProfile(String username);

    void save(UserProfileFormData userProfileFormData);


}

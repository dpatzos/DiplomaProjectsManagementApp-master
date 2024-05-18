package com.example.dpma.service;


import com.example.dpma.model.User;
import com.example.dpma.model.UserProfile;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public void saveUser(User user);

    public boolean isUserPresent(User user);



    public UserDetails loadUserByUsername(String username);
}

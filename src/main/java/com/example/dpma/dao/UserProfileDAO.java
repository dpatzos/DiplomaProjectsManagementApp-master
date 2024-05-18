package com.example.dpma.dao;

import com.example.dpma.model.User;
import com.example.dpma.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileDAO extends JpaRepository<UserProfile,Integer> {
    UserProfile findByUsername(String username);
    UserProfile findByUserId(int userId);


}

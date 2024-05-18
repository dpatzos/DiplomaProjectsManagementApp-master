package com.example.dpma.controller;

import com.example.dpma.formdata.UserProfileFormData;
import com.example.dpma.model.User;
import com.example.dpma.model.UserProfile;
import com.example.dpma.service.UserProfileService;
import com.example.dpma.service.UserProfileServiceImpl;
import com.example.dpma.service.UserService;
import com.example.dpma.service.UserServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;


@Controller
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserProfileService userProfileService;



    @RequestMapping("/user/dashboard")
    public String getUserHome() {

        return "user/dashboard";
    }

    @RequestMapping("/user/editprofile")
    public String getEditProfile(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentPrincipalName = authentication.getName();
        System.err.println(currentPrincipalName);
        User user = (User) userService.loadUserByUsername(currentPrincipalName);
        UserProfileFormData userProfileFormData = userProfileService.retrieveProfile(user.getUsername());
        userProfileFormData.setUser(user);
        userProfileFormData.setUser_name(user.getUsername());
        model.addAttribute("userProfileFormData", userProfileFormData);
        return "user/editprofile";
    }

    @RequestMapping("/user/save")
    public String UserSave(@ModelAttribute("userProfile") UserProfileFormData userProfileFormData, Model model) {
        userProfileService.save(userProfileFormData);
        return "user/dashboard";
    }

}

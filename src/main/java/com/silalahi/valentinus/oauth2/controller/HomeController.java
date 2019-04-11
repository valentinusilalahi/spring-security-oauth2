package com.silalahi.valentinus.oauth2.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.LinkedHashMap;
import java.util.Map;

@Controller
public class HomeController {
    @GetMapping("/home")
    public void homepage(){

    }

    @GetMapping("/userinfo")
    @ResponseBody
    public Map<String, Object>userInfo(Authentication currentUser){
        Map<String, Object> hasil = new LinkedHashMap<>();
        hasil.put("currentUser", currentUser);
        return hasil;
    }
}

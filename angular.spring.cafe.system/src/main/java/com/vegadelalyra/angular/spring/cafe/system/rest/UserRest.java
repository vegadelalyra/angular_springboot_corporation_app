package com.vegadelalyra.angular.spring.cafe.system.rest;

import com.vegadelalyra.angular.spring.cafe.system.wrapper.UserWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@RequestMapping(path = "/user")
public interface UserRest {

    @PostMapping(path = "/signup")
    public ResponseEntity<String> signUp(@RequestBody(required = true) Map<String, String> requestMap);

    @PostMapping(path = "/login")
    public ResponseEntity<String> login(@RequestBody(required = true) Map<String, String> requestMap);

    @GetMapping(path = "")
    public ResponseEntity<List<UserWrapper>> getAllUser();

    @PostMapping(path="")
    public ResponseEntity<String> update(@RequestBody(required = true) Map<String, String> requestMap);
}


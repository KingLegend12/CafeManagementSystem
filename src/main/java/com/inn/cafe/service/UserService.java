package com.inn.cafe.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

public interface UserService {

     ResponseEntity<String> signUp(Map<String, String> requestMap);
}

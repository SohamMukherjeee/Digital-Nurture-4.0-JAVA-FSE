package com.cognizant.spring_learn.controller;
import com.cognizant.spring_learn.service.JwtService;

import org.springframework.security.core.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Map;

import jakarta.servlet.http.HttpServletRequest;

@RestController

public class AuthController {

    @Autowired
    private JwtService jwtService;

@GetMapping("/authenticate")
public ResponseEntity<?> authenticate(Principal principal) {
    if (principal == null) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Principal is null, not authenticated.");
    }
    return ResponseEntity.ok(jwtService.generateTokenFromUsername(principal.getName()));
}

}

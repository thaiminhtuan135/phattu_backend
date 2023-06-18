package com.alibou.security.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/phattu")
@RequiredArgsConstructor
public class NeedTokenAccess {
    @GetMapping("/message")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from phattu");
    }
}
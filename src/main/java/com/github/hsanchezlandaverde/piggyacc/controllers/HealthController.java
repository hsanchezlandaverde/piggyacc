package com.github.hsanchezlandaverde.piggyacc.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping()
    public ResponseEntity<?> getHealth() {
        var res = new HashMap<String, Object>();
        res.put("status", "HEALTHY");
        return ResponseEntity.ok(res);
    }

}

package com.msuser.controller;

import com.msuser.model.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UsersController {

    @Autowired UsersService service;

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable String id){
        return new ResponseEntity<>(service.usersById(id), HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<?> findByEmail(@RequestParam String email){
        return new ResponseEntity<>(service.usersByEmail(email), HttpStatus.OK);
    }
}

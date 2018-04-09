package com.mycena.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

/**
 * Created by jihung on 3/31/18.
 */
@Service
public class SampleService {


    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity getContent() {
        String role = SecurityContextHolder.getContext().getAuthentication().getAuthorities().toString();
        System.out.println(role);
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getName());
        return new ResponseEntity<String>(SecurityContextHolder.getContext().toString(), HttpStatus.OK);

    }

    @PreAuthorize("hasRole('USER')")
    public ResponseEntity getUserContent() {
        String role = SecurityContextHolder.getContext().getAuthentication().getAuthorities().toString();
        System.out.println(role);
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getName());
        return new ResponseEntity<String>(SecurityContextHolder.getContext().toString(), HttpStatus.OK);

    }

}

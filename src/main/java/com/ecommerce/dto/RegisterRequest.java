package com.ecommerce.dto;

import com.ecommerce.model.Role;

import lombok.Data;

@Data
public class RegisterRequest {
    
    private String email;

    private String password;

    private String fullName;
    
    private Role role;
}

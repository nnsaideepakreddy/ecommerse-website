package com.ecommerce.service;

import com.ecommerce.dto.RegisterRequest;
import com.ecommerce.model.User;

public interface UserService {

    User registerUser(RegisterRequest request);
    
} 

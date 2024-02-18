package com.example.prodajadijelova.services;


import com.example.prodajadijelova.models.User;
import com.example.prodajadijelova.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    @Autowired
    UserRepository repository;

    @Override
    public com.example.prodajadijelova.models.UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User u = repository.findByEmail(username);
        return new com.example.prodajadijelova.models.UserDetails(u);
    }
}
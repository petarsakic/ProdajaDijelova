package com.example.prodajadijelova.repositories;

import com.example.prodajadijelova.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<User, Long> {

}

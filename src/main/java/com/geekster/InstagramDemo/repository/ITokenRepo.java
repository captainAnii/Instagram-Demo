package com.geekster.InstagramDemo.repository;

import com.geekster.InstagramDemo.model.AuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITokenRepo extends JpaRepository<AuthenticationToken, Long> {
    AuthenticationToken findFirstByToken(String token);


}
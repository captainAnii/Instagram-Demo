package com.geekster.InstagramDemo.repository;


import com.geekster.InstagramDemo.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepo extends JpaRepository<Admin, Long> {
}
package com.geekster.InstagramDemo.repository;

import com.geekster.InstagramDemo.model.InstagramFollower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFollowerRepo extends JpaRepository<InstagramFollower, Long> {


}
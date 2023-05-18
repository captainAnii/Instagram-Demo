package com.geekster.InstagramDemo.repository;

import com.geekster.InstagramDemo.model.InstagramFollowing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFollowingRepo extends JpaRepository<InstagramFollowing, Long> {

    Long countByUser_userId(long userId);
}
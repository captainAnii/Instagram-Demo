package com.geekster.InstagramDemo.service;

import com.geekster.InstagramDemo.model.InstagramFollowing;
import com.geekster.InstagramDemo.model.User;
import com.geekster.InstagramDemo.repository.IFollowingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowingService {

    @Autowired
    IFollowingRepo followingRepo;

    public void saveFollowing(User myUser, User otherUser) {
        InstagramFollowing followingRecord = new InstagramFollowing(null,myUser,otherUser);
        followingRepo.save(followingRecord);
    }
}
package com.geekster.InstagramDemo.service;

import com.geekster.InstagramDemo.model.InstagramFollower;
import com.geekster.InstagramDemo.model.User;
import com.geekster.InstagramDemo.repository.IFollowerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowerService {

    @Autowired
    IFollowerRepo followerRepo;

    public void saveFollower(User myUser, User otherUser) {


        InstagramFollower follower = new InstagramFollower(null,myUser,otherUser);

        followerRepo.save(follower);
    }
}
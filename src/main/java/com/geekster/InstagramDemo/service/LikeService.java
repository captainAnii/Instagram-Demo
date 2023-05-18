package com.geekster.InstagramDemo.service;

import com.geekster.InstagramDemo.model.PostLike;
import com.geekster.InstagramDemo.repository.ILikeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeService {

    @Autowired
    ILikeRepo likeRepo;

    public void like(PostLike postLike) {
        likeRepo.save(postLike);
    }

    public long getLikes(Long postId) {
        //todo : validation to be added
        return likeRepo.countByPost_PostId(postId);
    }
}
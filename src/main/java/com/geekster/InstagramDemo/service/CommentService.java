package com.geekster.InstagramDemo.service;

import com.geekster.InstagramDemo.model.InstagramComment;
import com.geekster.InstagramDemo.repository.ICommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    ICommentRepo commentRepo;

    //definitely make use of authentication
    public String addComment(InstagramComment comment) {
        InstagramComment rComment = commentRepo.save(comment);
        if(rComment == null)
        {
            return "Comment not saved...!";
        }
        else
        {
            return "Comment saved...!";
        }
    }
}
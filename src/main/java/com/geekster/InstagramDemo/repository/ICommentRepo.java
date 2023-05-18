package com.geekster.InstagramDemo.repository;
import com.geekster.InstagramDemo.model.InstagramComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommentRepo extends JpaRepository<InstagramComment, Long> {
}
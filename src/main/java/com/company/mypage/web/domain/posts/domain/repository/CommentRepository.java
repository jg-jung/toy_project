package com.company.mypage.web.domain.posts.domain.repository;

import com.company.mypage.web.domain.posts.domain.repository.support.CustomCommentRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.company.mypage.web.domain.posts.domain.entity.PostsComment;

import java.util.List;

public interface CommentRepository extends JpaRepository<PostsComment, Long> , CustomCommentRepository {

//	List<Comment> findByPostsId(Long id);

	
}

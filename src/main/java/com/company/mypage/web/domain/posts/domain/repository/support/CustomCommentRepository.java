package com.company.mypage.web.domain.posts.domain.repository.support;


import java.util.List;

import com.company.mypage.web.domain.posts.domain.entity.PostsComment;

public interface CustomCommentRepository {

    public List<PostsComment> findByPostsId(Long postsId);

}

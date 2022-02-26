package com.company.mypage.web.domain.posts.dto;

import com.company.mypage.web.domain.member.domain.entity.Members;
import com.company.mypage.web.domain.posts.domain.entity.Posts;
import com.company.mypage.web.domain.posts.domain.entity.PostsComment;
import com.company.mypage.web.util.auth.AuthUtil;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
public class RegistReplyDto {

    @NotBlank(message = "등록할 답글이 존재하지 않습니다.")
    private String comment;

    private Long groupNo;

    private Long postsId;

    public PostsComment toEntity() {
        Posts posts = Posts.builder().id(postsId).build();
        Members member = Members.builder().id(AuthUtil.getId()).build();

        PostsComment build = PostsComment.builder()
                .comment(comment)
                .groupNo(groupNo)
                .depthNo((long) 1)
                .posts(posts)
                .member(member)
                .build();

        return build;
    }

}

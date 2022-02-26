package com.company.mypage.web.domain.posts.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

import com.company.mypage.web.domain.member.domain.entity.Members;
import com.company.mypage.web.domain.posts.domain.entity.PostsComment;

@Getter
@Setter
@NoArgsConstructor
public class PostsResDto {

    private Long id;
    
//    private String author;
    
    private String title;
    
    private String content;
    
    private LocalDateTime createdDate;
    
    private LocalDateTime modifiedDate;
    
    private Long memberId;
    
    private String memberEmail;
    
    private String memberNickname;
    
    private List<CommentResDto> comments;
}

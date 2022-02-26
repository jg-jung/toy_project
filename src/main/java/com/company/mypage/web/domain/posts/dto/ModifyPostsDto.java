package com.company.mypage.web.domain.posts.dto;

import com.company.mypage.web.domain.member.domain.entity.Members;

import com.company.mypage.web.domain.posts.domain.entity.Posts;
import com.company.mypage.web.util.auth.AuthUtil;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
public class ModifyPostsDto {

    @Min(1)
    private Long id;

    @NotBlank(message = "'title' is a required input value")
    private String title;

    @NotBlank(message = "'content' is a required input value")
    private String content;

}

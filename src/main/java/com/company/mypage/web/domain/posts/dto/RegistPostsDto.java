package com.company.mypage.web.domain.posts.dto;

import com.company.mypage.web.domain.member.domain.entity.Members;
import com.company.mypage.web.domain.posts.domain.entity.Posts;
import com.company.mypage.web.util.auth.AuthUtil;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
public class RegistPostsDto {

	@NotBlank(message = "'title' is a required input value")
	private String title;

	@NotBlank(message = "'content' is a required input value")
	private String content;

	public Posts toEntity() {
		
		Members memberEntity = Members
				.builder()
				.id(AuthUtil.getId())
				.build();

		return Posts.builder()
				.title(title)
				.content(content)
				.member(memberEntity)
				.build();
	}

}
package com.company.mypage.web.domain.member.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.company.mypage.web.domain.member.domain.entity.Members;
import com.company.mypage.web.domain.member.domain.repository.MemberRepository;
import com.company.mypage.web.domain.member.dto.MemberResultDto;
import com.company.mypage.web.exception.custom.ApiOtherException;
import lombok.RequiredArgsConstructor;

@Service("memberService")
@RequiredArgsConstructor
public class MemberService {
	
	private final MemberRepository memberRepository;
	
	private final ModelMapper modelMapper;

	public MemberResultDto getMemberById(Long id) {
		
		Members entity = memberRepository.findById(id)
				.orElseThrow(() -> new ApiOtherException("Member Not Found"));

		return modelMapper.map(entity, MemberResultDto.class);
	}
	
	

}

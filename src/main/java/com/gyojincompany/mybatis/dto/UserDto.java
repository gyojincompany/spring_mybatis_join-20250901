package com.gyojincompany.mybatis.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	
	private String userid; //기본키
	private String username;
	
	private UserInfoDto userInfo; //유저의 세부 정보를 멤버로 저장(1:1 관계)
	
	private List<OrderDto> orderDtos; //유저가 주문한 주문리스트(회원 1명이 주문 여러 개 가능)(1:N관계)

}

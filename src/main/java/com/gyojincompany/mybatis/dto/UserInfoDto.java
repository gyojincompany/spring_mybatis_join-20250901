package com.gyojincompany.mybatis.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoDto {
	
	private String userid; //기본키
	private String useraddress; //고객의 주소
	private String userphone; //고객의 전화번호
}

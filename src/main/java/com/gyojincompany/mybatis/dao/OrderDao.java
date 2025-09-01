package com.gyojincompany.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gyojincompany.mybatis.dto.OrderDto;
import com.gyojincompany.mybatis.dto.UserDto;
import com.gyojincompany.mybatis.dto.UserIdInfoDto;

public interface OrderDao {
	
	public List<OrderDto> orderListDao(); //모든 주문 리스트 가져오기
	public List<UserDto> userListDao(); //모든 회원 리스트 가져오기
	//public UserDto userSearchDao(@Param("user") String userid); //특정 유저 아이디로 회원 가져오기
	public UserDto userSearchDao(String userid); //특정 유저 아이디로 회원 가져오기
	public UserIdInfoDto userInfoDao(String userid); //특정 유저 아이디로 유저의 회원 세부 정보 가져오기
	public UserDto userInfoMapDao(String userid); //userInfoDao->spring 프레임워크 형식으로 수정
	public UserDto userOrderListDao(String userid); //특정 유저의 주문 리스트 가져오기(spring 프레임워크 형식으로)
	public List<UserDto> AllUserOrderLitsDao(); //모든 유저의 주문 리스트 가져오기
	
	
	
}

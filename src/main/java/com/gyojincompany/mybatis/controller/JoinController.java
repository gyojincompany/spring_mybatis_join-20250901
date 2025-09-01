package com.gyojincompany.mybatis.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gyojincompany.mybatis.dao.OrderDao;

@Controller
public class JoinController {
	
	@Autowired
	private SqlSession sqlSession; //DI	
	
	
	
	@RequestMapping(value = "/userlist")
	public String userlist(HttpServletRequest request, Model model ) {
		
		OrderDao orderDao = sqlSession.getMapper(OrderDao.class);
		model.addAttribute("userList", orderDao.userListDao());
		
		return "userlist";
	}
	
	@RequestMapping(value = "/orderlist")
	public String orderlist(HttpServletRequest request, Model model ) {
		
		OrderDao orderDao = sqlSession.getMapper(OrderDao.class);
		model.addAttribute("orderList", orderDao.orderListDao());
		
		return "orderlist";
	}
	
	@RequestMapping(value = "/usersearch")
	public String userid(HttpServletRequest request, Model model ) {
		
		OrderDao orderDao = sqlSession.getMapper(OrderDao.class);
		model.addAttribute("user", orderDao.userSearchDao("tiger"));
		
		return "usersearch";
	}
	

}

  
/**  
 * 文件名：UserController.java  
 *   
 * 日期：2015年3月26日  
 *  
*/  
    
package com.itxxz.module.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itxxz.module.user.entity.ItxxzUser;
import com.itxxz.module.user.service.UserService;

  
/**  
 * 
 * @author: IT学习者-螃蟹
 * 
 * @官网 www.itxxz.com
 *
 * @version: 2015年3月26日 下午9:52:48   
 */
@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	public void createUser(ItxxzUser user){
		userService.createUser(user);
	}
	
	public void updateUser(ItxxzUser user){
		userService.updateUser(user);
	}
	
	public void deleteUser(int id){
		userService.deleteUser(id);
	}
	
	public ItxxzUser findUserById(int id){
		return userService.findUserById(id);
	}
	
	@RequestMapping("list")
	public String userList(Model model){
		System.out.println("test..........");
		model.addAttribute("userList", userService.findAll());
		return "user/list";
	}

}

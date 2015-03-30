  
/**  
 * �ļ�����UserController.java  
 *   
 * ���ڣ�2015��3��26��  
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
 * @author: ITѧϰ��-�з
 * 
 * @���� www.itxxz.com
 *
 * @version: 2015��3��26�� ����9:52:48   
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

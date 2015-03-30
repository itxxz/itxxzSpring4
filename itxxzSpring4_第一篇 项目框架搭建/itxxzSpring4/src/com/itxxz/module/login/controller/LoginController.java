  
/**  
 * 文件名：LoginController.java  
 *   
 * 日期：2015年3月27日  
 *  
*/  
    
package com.itxxz.module.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

  
/**  
 * 
 * @author: IT学习者-螃蟹
 * 
 * @官网 www.itxxz.com
 *
 * @version: 2015年3月27日 上午12:10:14   
 */
@Controller
public class LoginController {
	
	@RequestMapping("/")
	public String toLogin(){
		System.out.println("----------------");
		return "login";
	}

}

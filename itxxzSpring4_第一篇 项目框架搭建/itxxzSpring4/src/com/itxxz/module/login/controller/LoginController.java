  
/**  
 * �ļ�����LoginController.java  
 *   
 * ���ڣ�2015��3��27��  
 *  
*/  
    
package com.itxxz.module.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

  
/**  
 * 
 * @author: ITѧϰ��-�з
 * 
 * @���� www.itxxz.com
 *
 * @version: 2015��3��27�� ����12:10:14   
 */
@Controller
public class LoginController {
	
	@RequestMapping("/")
	public String toLogin(){
		System.out.println("----------------");
		return "login";
	}

}

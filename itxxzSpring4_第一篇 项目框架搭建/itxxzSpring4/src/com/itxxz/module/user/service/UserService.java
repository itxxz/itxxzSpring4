  
/**  
 * �ļ�����UserController.java  
 *   
 * ���ڣ�2015��3��26��  
 *  
*/  
    
package com.itxxz.module.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itxxz.module.user.entity.ItxxzUser;
import com.itxxz.module.user.mapper.UserMapper;

  
/**  
 * 
 * @author: ITѧϰ��-�з
 * 
 * @���� www.itxxz.com
 *
 * @version: 2015��3��26�� ����9:52:48   
 */
@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public void createUser(ItxxzUser user){
		userMapper.insert(user);
	}
	
	public void updateUser(ItxxzUser user){
		userMapper.update(user);
	}
	
	public void deleteUser(int id){
		userMapper.delete(id);
	}
	
	public ItxxzUser findUserById(int id){
		return userMapper.findUserById(id);
	}
	
	public List<ItxxzUser> findAll(){
		return userMapper.findAll();
	}

}

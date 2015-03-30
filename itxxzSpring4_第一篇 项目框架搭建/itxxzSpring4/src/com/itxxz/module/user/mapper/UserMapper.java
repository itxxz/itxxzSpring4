  
/**  
 * �ļ�����UserMapper.java  
 *   
 * ���ڣ�2015��3��26��  
 *  
*/  
    
package com.itxxz.module.user.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.itxxz.module.user.entity.ItxxzUser;

  
/**  
 * 
 * @author: ITѧϰ��-�з
 * 
 * @���� www.itxxz.com
 *
 * @version: 2015��3��26�� ����9:52:04   
 */
@Repository("userMapper")
public interface UserMapper {
	
	public void insert(ItxxzUser user);
	
	public void update(ItxxzUser user);
	
	public void delete(int id);
	
	public ItxxzUser findUserById(int id);
	
	public List<ItxxzUser> findAll();

}

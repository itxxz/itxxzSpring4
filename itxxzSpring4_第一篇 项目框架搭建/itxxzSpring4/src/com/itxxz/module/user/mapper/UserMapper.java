  
/**  
 * 文件名：UserMapper.java  
 *   
 * 日期：2015年3月26日  
 *  
*/  
    
package com.itxxz.module.user.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.itxxz.module.user.entity.ItxxzUser;

  
/**  
 * 
 * @author: IT学习者-螃蟹
 * 
 * @官网 www.itxxz.com
 *
 * @version: 2015年3月26日 下午9:52:04   
 */
@Repository("userMapper")
public interface UserMapper {
	
	public void insert(ItxxzUser user);
	
	public void update(ItxxzUser user);
	
	public void delete(int id);
	
	public ItxxzUser findUserById(int id);
	
	public List<ItxxzUser> findAll();

}

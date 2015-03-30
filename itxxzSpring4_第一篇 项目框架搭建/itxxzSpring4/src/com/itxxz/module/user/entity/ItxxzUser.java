  
/**  
 * 文件名：ItxxzUser.java  
 *   
 * 日期：2015年3月26日  
 *  
*/  
    
package com.itxxz.module.user.entity;

import java.io.Serializable;

  
/**  
 * 
 * @author: IT学习者-螃蟹
 * 
 * @官网 www.itxxz.com
 *
 * @version: 2015年3月26日 下午9:48:08   
 */
public class ItxxzUser implements Serializable{
	
	  
	/**  
	 * @官网: www.itxxz.com 
	 * @since Ver 1.1  
	*/  
	private static final long serialVersionUID = -1235400825124776633L;
	
	private int id;
	private String userName;
	private String email;
	private String desc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ItxxzUser [id=");
		builder.append(id);
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", email=");
		builder.append(email);
		builder.append(", desc=");
		builder.append(desc);
		builder.append("]");
		return builder.toString();
	}
	
}

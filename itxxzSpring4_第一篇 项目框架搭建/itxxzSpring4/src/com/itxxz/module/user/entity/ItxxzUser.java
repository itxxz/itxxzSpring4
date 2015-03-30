  
/**  
 * �ļ�����ItxxzUser.java  
 *   
 * ���ڣ�2015��3��26��  
 *  
*/  
    
package com.itxxz.module.user.entity;

import java.io.Serializable;

  
/**  
 * 
 * @author: ITѧϰ��-�з
 * 
 * @���� www.itxxz.com
 *
 * @version: 2015��3��26�� ����9:48:08   
 */
public class ItxxzUser implements Serializable{
	
	  
	/**  
	 * @����: www.itxxz.com 
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

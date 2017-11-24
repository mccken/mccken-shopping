package com.lcsc.pojo;


import java.io.Serializable;

/**
 * user
 * @author 骆文军 mccken(email：747807013@qq.com)
 * @date 2017-11-23
 */
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * user
	 */
	public static final String REF="User";

	/**
	 * 该字段为：主关键字 <br/>
	 * 主键 的属性名
	 */
	public static final String PROP_USERID="userId";
	
	/**
	 * 用户名必须唯一 的属性名
	 */
	public static final String PROP_USERName="userName";
	
	/**
	 * 用户密码：md5加密 的属性名
	 */
	public static final String PROP_USERPASSWORD="userPassword";
	
	/**
	 * 邮箱地址 的属性名
	 */
	public static final String PROP_USEREMAIL="userEmail";
	

	/**
	 * 该字段为：主关键字 <br/>
	 * 主键
	 */
	private java.lang.Integer userId;
	
	/**
	 * 用户名必须唯一
	 */
	private java.lang.String userName;
	
	/**
	 * 用户密码：md5加密
	 */
	private java.lang.String userPassword;
	
	/**
	 * 邮箱地址
	 */
	private java.lang.String userEmail;
	


	/**
	 * 该字段为：主关键字 <br/>
	 * 获取 主键 的属性值
	 * @return userId :  主键 
	 * @author 747807013@qq.com
	 */
	public java.lang.Integer getUserId(){
		return this.userId;
	}

	/**
	 * 该字段为：主关键字 <br/>
	 * 设置 主键 的属性值
	 * @param userId :  主键 
	 * @author 747807013@qq.com
	 */
	public void setUserId(java.lang.Integer userId){
		this.userId	= userId;
	}
	
	/**
	 * 获取 用户名必须唯一 的属性值
	 * @return userName :  用户名必须唯一 
	 * @author 747807013@qq.com
	 */
	public java.lang.String getuserName(){
		return this.userName;
	}

	/**
	 * 设置 用户名必须唯一 的属性值
	 * @param userName :  用户名必须唯一 
	 * @author 747807013@qq.com
	 */
	public void setuserName(java.lang.String userName){
		this.userName	= userName;
	}
	
	/**
	 * 获取 用户密码：md5加密 的属性值
	 * @return userPassword :  用户密码：md5加密 
	 * @author 747807013@qq.com
	 */
	public java.lang.String getUserPassword(){
		return this.userPassword;
	}

	/**
	 * 设置 用户密码：md5加密 的属性值
	 * @param userPassword :  用户密码：md5加密 
	 * @author 747807013@qq.com
	 */
	public void setUserPassword(java.lang.String userPassword){
		this.userPassword	= userPassword;
	}
	
	/**
	 * 获取 邮箱地址 的属性值
	 * @return userEmail :  邮箱地址 
	 * @author 747807013@qq.com
	 */
	public java.lang.String getUserEmail(){
		return this.userEmail;
	}

	/**
	 * 设置 邮箱地址 的属性值
	 * @param userEmail :  邮箱地址 
	 * @author 747807013@qq.com
	 */
	public void setUserEmail(java.lang.String userEmail){
		this.userEmail	= userEmail;
	}
	
	

	/**
	 * 转换为字符串
	 * @author 747807013@qq.com
	 */
	public String toString(){
		
		return "{ _name=User" + ",userId=" + userId +",userName=" + userName +",userPassword=" + userPassword +",userEmail=" + userEmail + "}";
	}
	
	/**
	 * 转换为 JSON 字符串
	 * @author 747807013@qq.com
	 */
	public String toJson(){
		return "{ _name:'User'" + ",userId:'" + userId + "'" +",userName:'" + userName + "'" +",userPassword:'" + userPassword + "'" +",userEmail:'" + userEmail + "'" +  "}";
	}
}
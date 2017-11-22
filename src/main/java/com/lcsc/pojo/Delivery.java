package com.lcsc.pojo;


import java.io.Serializable;

/**
 * delivery
 * @author 骆文军 mccken(email：747807013@qq.com)
 * @date 2017-11-23
 */
public class Delivery implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * delivery
	 */
	public static final String REF="Delivery";

	/**
	 * 用户id 的属性名
	 */
	public static final String PROP_DELIVERYID="deliveryId";
	
	/**
	 * 收货人姓名 的属性名
	 */
	public static final String PROP_DELIVERYNAME="deliveryName";
	
	/**
	 * 手机 的属性名
	 */
	public static final String PROP_DELIVERYPHONE="deliveryPhone";
	
	/**
	 * 邮政编码 的属性名
	 */
	public static final String PROP_DELIVERYPOSTCODE="deliveryPostcode";
	
	/**
	 * 详细地址 的属性名
	 */
	public static final String PROP_DELIVERYADDR="deliveryAddr";
	

	/**
	 * 用户id
	 */
	private java.lang.Integer deliveryId;
	
	/**
	 * 收货人姓名
	 */
	private java.lang.String deliveryName;
	
	/**
	 * 手机
	 */
	private java.lang.String deliveryPhone;
	
	/**
	 * 邮政编码
	 */
	private java.lang.String deliveryPostcode;
	
	/**
	 * 详细地址
	 */
	private java.lang.String deliveryAddr;
	


	/**
	 * 获取 用户id 的属性值
	 * @return deliveryId :  用户id 
	 * @author 747807013@qq.com
	 */
	public java.lang.Integer getDeliveryId(){
		return this.deliveryId;
	}

	/**
	 * 设置 用户id 的属性值
	 * @param deliveryId :  用户id 
	 * @author 747807013@qq.com
	 */
	public void setDeliveryId(java.lang.Integer deliveryId){
		this.deliveryId	= deliveryId;
	}
	
	/**
	 * 获取 收货人姓名 的属性值
	 * @return deliveryName :  收货人姓名 
	 * @author 747807013@qq.com
	 */
	public java.lang.String getDeliveryName(){
		return this.deliveryName;
	}

	/**
	 * 设置 收货人姓名 的属性值
	 * @param deliveryName :  收货人姓名 
	 * @author 747807013@qq.com
	 */
	public void setDeliveryName(java.lang.String deliveryName){
		this.deliveryName	= deliveryName;
	}
	
	/**
	 * 获取 手机 的属性值
	 * @return deliveryPhone :  手机 
	 * @author 747807013@qq.com
	 */
	public java.lang.String getDeliveryPhone(){
		return this.deliveryPhone;
	}

	/**
	 * 设置 手机 的属性值
	 * @param deliveryPhone :  手机 
	 * @author 747807013@qq.com
	 */
	public void setDeliveryPhone(java.lang.String deliveryPhone){
		this.deliveryPhone	= deliveryPhone;
	}
	
	/**
	 * 获取 邮政编码 的属性值
	 * @return deliveryPostcode :  邮政编码 
	 * @author 747807013@qq.com
	 */
	public java.lang.String getDeliveryPostcode(){
		return this.deliveryPostcode;
	}

	/**
	 * 设置 邮政编码 的属性值
	 * @param deliveryPostcode :  邮政编码 
	 * @author 747807013@qq.com
	 */
	public void setDeliveryPostcode(java.lang.String deliveryPostcode){
		this.deliveryPostcode	= deliveryPostcode;
	}
	
	/**
	 * 获取 详细地址 的属性值
	 * @return deliveryAddr :  详细地址 
	 * @author 747807013@qq.com
	 */
	public java.lang.String getDeliveryAddr(){
		return this.deliveryAddr;
	}

	/**
	 * 设置 详细地址 的属性值
	 * @param deliveryAddr :  详细地址 
	 * @author 747807013@qq.com
	 */
	public void setDeliveryAddr(java.lang.String deliveryAddr){
		this.deliveryAddr	= deliveryAddr;
	}
	
	

	/**
	 * 转换为字符串
	 * @author 747807013@qq.com
	 */
	public String toString(){
		
		return "{ _name=Delivery" + ",deliveryId=" + deliveryId +",deliveryName=" + deliveryName +",deliveryPhone=" + deliveryPhone +",deliveryPostcode=" + deliveryPostcode +",deliveryAddr=" + deliveryAddr + "}";
	}
	
	/**
	 * 转换为 JSON 字符串
	 * @author 747807013@qq.com
	 */
	public String toJson(){
		return "{ _name:'Delivery'" + ",deliveryId:'" + deliveryId + "'" +",deliveryName:'" + deliveryName + "'" +",deliveryPhone:'" + deliveryPhone + "'" +",deliveryPostcode:'" + deliveryPostcode + "'" +",deliveryAddr:'" + deliveryAddr + "'" +  "}";
	}
}
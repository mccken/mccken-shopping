package com.lcsc.pojo;


import java.io.Serializable;

/**
 * shopping_order
 * @author 骆文军 mccken(email：747807013@qq.com)
 * @date 2017-11-23
 */
public class ShoppingOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * shopping_order
	 */
	public static final String REF="ShoppingOrder";

	/**
	 * 该字段为：主关键字 <br/>
	 * 自增 的属性名
	 */
	public static final String PROP_ID="id";
	
	/**
	 * 订单号 的属性名
	 */
	public static final String PROP_ORDERID="orderId";
	
	/**
	 * 用户id 的属性名
	 */
	public static final String PROP_USERID="userId";
	
	/**
	 * 拼凑商品id和数量：1|3-2|1 的属性名
	 */
	public static final String PROP_ORDERGOOD="orderGood";
	
	/**
	 * 下单时间（时间戳） 的属性名
	 */
	public static final String PROP_ORDERTIME="orderTime";
	
	/**
	 * 订单金额 的属性名
	 */
	public static final String PROP_ORDERMONEY="orderMoney";
	
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
	 * 订单状态 的属性名
	 */
	public static final String PROP_ORDERSTAT="orderStat";
	

	/**
	 * 该字段为：主关键字 <br/>
	 * 自增
	 */
	private java.lang.Integer id;
	
	/**
	 * 订单号
	 */
	private java.lang.Integer orderId;
	
	/**
	 * 用户id
	 */
	private java.lang.Integer userId;
	
	/**
	 * 拼凑商品id和数量：1|3-2|1
	 */
	private java.lang.String orderGood;
	
	/**
	 * 下单时间（时间戳）
	 */
	private java.lang.Integer orderTime;
	
	/**
	 * 订单金额
	 */
	private java.lang.Integer orderMoney;
	
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
	 * 订单状态
	 */
	private java.lang.Integer orderStat;
	


	/**
	 * 该字段为：主关键字 <br/>
	 * 获取 自增 的属性值
	 * @return id :  自增 
	 * @author 747807013@qq.com
	 */
	public java.lang.Integer getId(){
		return this.id;
	}

	/**
	 * 该字段为：主关键字 <br/>
	 * 设置 自增 的属性值
	 * @param id :  自增 
	 * @author 747807013@qq.com
	 */
	public void setId(java.lang.Integer id){
		this.id	= id;
	}
	
	/**
	 * 获取 订单号 的属性值
	 * @return orderId :  订单号 
	 * @author 747807013@qq.com
	 */
	public java.lang.Integer getOrderId(){
		return this.orderId;
	}

	/**
	 * 设置 订单号 的属性值
	 * @param orderId :  订单号 
	 * @author 747807013@qq.com
	 */
	public void setOrderId(java.lang.Integer orderId){
		this.orderId	= orderId;
	}
	
	/**
	 * 获取 用户id 的属性值
	 * @return userId :  用户id 
	 * @author 747807013@qq.com
	 */
	public java.lang.Integer getUserId(){
		return this.userId;
	}

	/**
	 * 设置 用户id 的属性值
	 * @param userId :  用户id 
	 * @author 747807013@qq.com
	 */
	public void setUserId(java.lang.Integer userId){
		this.userId	= userId;
	}
	
	/**
	 * 获取 拼凑商品id和数量：1|3-2|1 的属性值
	 * @return orderGood :  拼凑商品id和数量：1|3-2|1 
	 * @author 747807013@qq.com
	 */
	public java.lang.String getOrderGood(){
		return this.orderGood;
	}

	/**
	 * 设置 拼凑商品id和数量：1|3-2|1 的属性值
	 * @param orderGood :  拼凑商品id和数量：1|3-2|1 
	 * @author 747807013@qq.com
	 */
	public void setOrderGood(java.lang.String orderGood){
		this.orderGood	= orderGood;
	}
	
	/**
	 * 获取 下单时间（时间戳） 的属性值
	 * @return orderTime :  下单时间（时间戳） 
	 * @author 747807013@qq.com
	 */
	public java.lang.Integer getOrderTime(){
		return this.orderTime;
	}

	/**
	 * 设置 下单时间（时间戳） 的属性值
	 * @param orderTime :  下单时间（时间戳） 
	 * @author 747807013@qq.com
	 */
	public void setOrderTime(java.lang.Integer orderTime){
		this.orderTime	= orderTime;
	}
	
	/**
	 * 获取 订单金额 的属性值
	 * @return orderMoney :  订单金额 
	 * @author 747807013@qq.com
	 */
	public java.lang.Integer getOrderMoney(){
		return this.orderMoney;
	}

	/**
	 * 设置 订单金额 的属性值
	 * @param orderMoney :  订单金额 
	 * @author 747807013@qq.com
	 */
	public void setOrderMoney(java.lang.Integer orderMoney){
		this.orderMoney	= orderMoney;
	}
	
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
	 * 获取 订单状态 的属性值
	 * @return orderStat :  订单状态 
	 * @author 747807013@qq.com
	 */
	public java.lang.Integer getOrderStat(){
		return this.orderStat;
	}

	/**
	 * 设置 订单状态 的属性值
	 * @param orderStat :  订单状态 
	 * @author 747807013@qq.com
	 */
	public void setOrderStat(java.lang.Integer orderStat){
		this.orderStat	= orderStat;
	}
	
	

	/**
	 * 转换为字符串
	 * @author 747807013@qq.com
	 */
	public String toString(){
		
		return "{ _name=ShoppingOrder" + ",id=" + id +",orderId=" + orderId +",userId=" + userId +",orderGood=" + orderGood +",orderTime=" + orderTime +",orderMoney=" + orderMoney +",deliveryId=" + deliveryId +",deliveryName=" + deliveryName +",deliveryPhone=" + deliveryPhone +",deliveryPostcode=" + deliveryPostcode +",deliveryAddr=" + deliveryAddr +",orderStat=" + orderStat + "}";
	}
	
	/**
	 * 转换为 JSON 字符串
	 * @author 747807013@qq.com
	 */
	public String toJson(){
		return "{ _name:'ShoppingOrder'" + ",id:'" + id + "'" +",orderId:'" + orderId + "'" +",userId:'" + userId + "'" +",orderGood:'" + orderGood + "'" +",orderTime:'" + orderTime + "'" +",orderMoney:'" + orderMoney + "'" +",deliveryId:'" + deliveryId + "'" +",deliveryName:'" + deliveryName + "'" +",deliveryPhone:'" + deliveryPhone + "'" +",deliveryPostcode:'" + deliveryPostcode + "'" +",deliveryAddr:'" + deliveryAddr + "'" +",orderStat:'" + orderStat + "'" +  "}";
	}
}
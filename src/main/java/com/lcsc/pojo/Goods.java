package com.lcsc.pojo;


import java.io.Serializable;

/**
 * goods
 * @author 骆文军 mccken(email：747807013@qq.com)
 * @date 2017-11-23
 */
public class Goods implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * goods
	 */
	public static final String REF="Goods";

	/**
	 * 该字段为：主关键字 <br/>
	 * 主键 的属性名
	 */
	public static final String PROP_GOODSID="goodsId";
	
	/**
	 * 商品名称 的属性名
	 */
	public static final String PROP_GOODSNAME="goodsName";
	
	/**
	 * 库存量 的属性名
	 */
	public static final String PROP_GOODSNUMBER="goodsNumber";
	
	/**
	 * 本店价格 的属性名
	 */
	public static final String PROP_SHOPPRICE="shopPrice";
	
	/**
	 * 商品详细描述 的属性名
	 */
	public static final String PROP_GOODSDESC="goodsDesc";
	
	/**
	 * 图片名称 的属性名
	 */
	public static final String PROP_GOODSIMAGE="goodsImage";
	
	/**
	 * 缩略图名称 的属性名
	 */
	public static final String PROP_GOODSTHUMB="goodsThumb";
	
	/**
	 * 图片路径 的属性名
	 */
	public static final String PROP_GOODSALBUMPATH="goodsAlbumpath";
	
	/**
	 * 是否精品 的属性名
	 */
	public static final String PROP_ISBEST="isBest";
	
	/**
	 * 是否新品 的属性名
	 */
	public static final String PROP_ISNEW="isNew";
	
	/**
	 * 是否热销 的属性名
	 */
	public static final String PROP_ISHOT="isHot";
	

	/**
	 * 该字段为：主关键字 <br/>
	 * 主键
	 */
	private java.lang.Integer goodsId;
	
	/**
	 * 商品名称
	 */
	private java.lang.String goodsName;
	
	/**
	 * 库存量
	 */
	private java.lang.Integer goodsNumber;
	
	/**
	 * 本店价格
	 */
	private java.math.BigDecimal shopPrice;
	
	/**
	 * 商品详细描述
	 */
	private java.lang.String goodsDesc;
	
	/**
	 * 图片名称
	 */
	private java.lang.String goodsImage;
	
	/**
	 * 缩略图名称
	 */
	private java.lang.String goodsThumb;
	
	/**
	 * 图片路径
	 */
	private java.lang.String goodsAlbumpath;
	
	/**
	 * 是否精品
	 */
	private java.lang.Boolean isBest;
	
	/**
	 * 是否新品
	 */
	private java.lang.Boolean isNew;
	
	/**
	 * 是否热销
	 */
	private java.lang.Boolean isHot;
	


	/**
	 * 该字段为：主关键字 <br/>
	 * 获取 主键 的属性值
	 * @return goodsId :  主键 
	 * @author 747807013@qq.com
	 */
	public java.lang.Integer getGoodsId(){
		return this.goodsId;
	}

	/**
	 * 该字段为：主关键字 <br/>
	 * 设置 主键 的属性值
	 * @param goodsId :  主键 
	 * @author 747807013@qq.com
	 */
	public void setGoodsId(java.lang.Integer goodsId){
		this.goodsId	= goodsId;
	}
	
	/**
	 * 获取 商品名称 的属性值
	 * @return goodsName :  商品名称 
	 * @author 747807013@qq.com
	 */
	public java.lang.String getGoodsName(){
		return this.goodsName;
	}

	/**
	 * 设置 商品名称 的属性值
	 * @param goodsName :  商品名称 
	 * @author 747807013@qq.com
	 */
	public void setGoodsName(java.lang.String goodsName){
		this.goodsName	= goodsName;
	}
	
	/**
	 * 获取 库存量 的属性值
	 * @return goodsNumber :  库存量 
	 * @author 747807013@qq.com
	 */
	public java.lang.Integer getGoodsNumber(){
		return this.goodsNumber;
	}

	/**
	 * 设置 库存量 的属性值
	 * @param goodsNumber :  库存量 
	 * @author 747807013@qq.com
	 */
	public void setGoodsNumber(java.lang.Integer goodsNumber){
		this.goodsNumber	= goodsNumber;
	}
	
	/**
	 * 获取 本店价格 的属性值
	 * @return shopPrice :  本店价格 
	 * @author 747807013@qq.com
	 */
	public java.math.BigDecimal getShopPrice(){
		return this.shopPrice;
	}

	/**
	 * 设置 本店价格 的属性值
	 * @param shopPrice :  本店价格 
	 * @author 747807013@qq.com
	 */
	public void setShopPrice(java.math.BigDecimal shopPrice){
		this.shopPrice	= shopPrice;
	}
	
	/**
	 * 获取 商品详细描述 的属性值
	 * @return goodsDesc :  商品详细描述 
	 * @author 747807013@qq.com
	 */
	public java.lang.String getGoodsDesc(){
		return this.goodsDesc;
	}

	/**
	 * 设置 商品详细描述 的属性值
	 * @param goodsDesc :  商品详细描述 
	 * @author 747807013@qq.com
	 */
	public void setGoodsDesc(java.lang.String goodsDesc){
		this.goodsDesc	= goodsDesc;
	}
	
	/**
	 * 获取 图片名称 的属性值
	 * @return goodsImage :  图片名称 
	 * @author 747807013@qq.com
	 */
	public java.lang.String getGoodsImage(){
		return this.goodsImage;
	}

	/**
	 * 设置 图片名称 的属性值
	 * @param goodsImage :  图片名称 
	 * @author 747807013@qq.com
	 */
	public void setGoodsImage(java.lang.String goodsImage){
		this.goodsImage	= goodsImage;
	}
	
	/**
	 * 获取 缩略图名称 的属性值
	 * @return goodsThumb :  缩略图名称 
	 * @author 747807013@qq.com
	 */
	public java.lang.String getGoodsThumb(){
		return this.goodsThumb;
	}

	/**
	 * 设置 缩略图名称 的属性值
	 * @param goodsThumb :  缩略图名称 
	 * @author 747807013@qq.com
	 */
	public void setGoodsThumb(java.lang.String goodsThumb){
		this.goodsThumb	= goodsThumb;
	}
	
	/**
	 * 获取 图片路径 的属性值
	 * @return goodsAlbumpath :  图片路径 
	 * @author 747807013@qq.com
	 */
	public java.lang.String getGoodsAlbumpath(){
		return this.goodsAlbumpath;
	}

	/**
	 * 设置 图片路径 的属性值
	 * @param goodsAlbumpath :  图片路径 
	 * @author 747807013@qq.com
	 */
	public void setGoodsAlbumpath(java.lang.String goodsAlbumpath){
		this.goodsAlbumpath	= goodsAlbumpath;
	}
	
	/**
	 * 获取 是否精品 的属性值
	 * @return isBest :  是否精品 
	 * @author 747807013@qq.com
	 */
	public java.lang.Boolean getIsBest(){
		return this.isBest;
	}

	/**
	 * 设置 是否精品 的属性值
	 * @param isBest :  是否精品 
	 * @author 747807013@qq.com
	 */
	public void setIsBest(java.lang.Boolean isBest){
		this.isBest	= isBest;
	}
	
	/**
	 * 获取 是否新品 的属性值
	 * @return isNew :  是否新品 
	 * @author 747807013@qq.com
	 */
	public java.lang.Boolean getIsNew(){
		return this.isNew;
	}

	/**
	 * 设置 是否新品 的属性值
	 * @param isNew :  是否新品 
	 * @author 747807013@qq.com
	 */
	public void setIsNew(java.lang.Boolean isNew){
		this.isNew	= isNew;
	}
	
	/**
	 * 获取 是否热销 的属性值
	 * @return isHot :  是否热销 
	 * @author 747807013@qq.com
	 */
	public java.lang.Boolean getIsHot(){
		return this.isHot;
	}

	/**
	 * 设置 是否热销 的属性值
	 * @param isHot :  是否热销 
	 * @author 747807013@qq.com
	 */
	public void setIsHot(java.lang.Boolean isHot){
		this.isHot	= isHot;
	}
	
	

	/**
	 * 转换为字符串
	 * @author 747807013@qq.com
	 */
	public String toString(){
		
		return "{ _name=Goods" + ",goodsId=" + goodsId +",goodsName=" + goodsName +",goodsNumber=" + goodsNumber +",shopPrice=" + shopPrice +",goodsDesc=" + goodsDesc +",goodsImage=" + goodsImage +",goodsThumb=" + goodsThumb +",goodsAlbumpath=" + goodsAlbumpath +",isBest=" + isBest +",isNew=" + isNew +",isHot=" + isHot + "}";
	}
	
	/**
	 * 转换为 JSON 字符串
	 * @author 747807013@qq.com
	 */
	public String toJson(){
		return "{ _name:'Goods'" + ",goodsId:'" + goodsId + "'" +",goodsName:'" + goodsName + "'" +",goodsNumber:'" + goodsNumber + "'" +",shopPrice:'" + shopPrice + "'" +",goodsDesc:'" + goodsDesc + "'" +",goodsImage:'" + goodsImage + "'" +",goodsThumb:'" + goodsThumb + "'" +",goodsAlbumpath:'" + goodsAlbumpath + "'" +",isBest:'" + isBest + "'" +",isNew:'" + isNew + "'" +",isHot:'" + isHot + "'" +  "}";
	}
}
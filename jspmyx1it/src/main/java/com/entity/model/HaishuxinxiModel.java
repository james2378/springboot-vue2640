package com.entity.model;

import com.entity.HaishuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 还书信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-26 16:12:18
 */
public class HaishuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 类型
	 */
	
	private String leixing;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 预计归还
	 */
	
	private String yujiguihai;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 借书时间
	 */
	
	private String jieshushijian;
		
	/**
	 * 还书备注
	 */
	
	private String haishubeizhu;
		
	/**
	 * 还书时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date haishushijian;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：类型
	 */
	 
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：预计归还
	 */
	 
	public void setYujiguihai(String yujiguihai) {
		this.yujiguihai = yujiguihai;
	}
	
	/**
	 * 获取：预计归还
	 */
	public String getYujiguihai() {
		return yujiguihai;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：借书时间
	 */
	 
	public void setJieshushijian(String jieshushijian) {
		this.jieshushijian = jieshushijian;
	}
	
	/**
	 * 获取：借书时间
	 */
	public String getJieshushijian() {
		return jieshushijian;
	}
				
	
	/**
	 * 设置：还书备注
	 */
	 
	public void setHaishubeizhu(String haishubeizhu) {
		this.haishubeizhu = haishubeizhu;
	}
	
	/**
	 * 获取：还书备注
	 */
	public String getHaishubeizhu() {
		return haishubeizhu;
	}
				
	
	/**
	 * 设置：还书时间
	 */
	 
	public void setHaishushijian(Date haishushijian) {
		this.haishushijian = haishushijian;
	}
	
	/**
	 * 获取：还书时间
	 */
	public Date getHaishushijian() {
		return haishushijian;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}

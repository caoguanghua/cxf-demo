package com.mes.cxf.bean;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="SpareParts")//备件实体
public class SpareParts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "select replace(newid(), '-', '')")
	@Column(name="sp_ID")
	private String spId;
	
	@Column(name="spareParts_no")
	private String sparePartsNo;//备件编号
	
	@Column(name="spareName")
	private String spareName;//备件名称

	@Column(name="spareType_Id")
	private String spareTypeId;//备件类型(使用数据字典)
	
	
	
	@Column(name="spareCategory_Id")
	private String spareCategoryId;//备件分类（ABC）（使用数据字典）
	
	
	@Column(name="spareModel")
	private String spareModel;//备件型号
	
	@Column(name="spareSpecification")
	private String spareSpecification;//备件规格
	
	
	@Column(name="minInventory")
	private Integer minInventory;//最低库存
	
	@Column(name="createTime")
	private Date createTime;//录入时间
	
	@Column(name="description")
	private String description;//描述
	@Column(name="cost")
	private Double cost;//成本
	//20180622新增
	@Column(name="inventoryMonitor")
	private String inventoryMonitor;//是否进行库存监控；1：监控；2：不监控
	@Column(name="lifeMonitor")
	private String lifeMonitor;//是否进行寿命监控；1：监控；2：不监控
	@Column(name="standardLife")
	private String standardLife;//标准寿命
	@Column(name="lifeWarningValue")
	private String lifeWarningValue;//寿命预警值
	


	public String getInventoryMonitor() {
		return inventoryMonitor;
	}


	public void setInventoryMonitor(String inventoryMonitor) {
		this.inventoryMonitor = inventoryMonitor;
	}


	public String getLifeMonitor() {
		return lifeMonitor;
	}


	public void setLifeMonitor(String lifeMonitor) {
		this.lifeMonitor = lifeMonitor;
	}


	public String getStandardLife() {
		return standardLife;
	}


	public void setStandardLife(String standardLife) {
		this.standardLife = standardLife;
	}


	public String getLifeWarningValue() {
		return lifeWarningValue;
	}


	public void setLifeWarningValue(String lifeWarningValue) {
		this.lifeWarningValue = lifeWarningValue;
	}






	public Double getCost() {
		return cost;
	}


	public void setCost(Double cost) {
		this.cost = cost;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Date getCreateTime() {
		return createTime;
	}


	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}


	public String getSpId() {
		return spId;
	}


	public void setSpId(String spId) {
		this.spId = spId;
	}


	public String getSparePartsNo() {
		return sparePartsNo;
	}


	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
	}


	public String getSpareName() {
		return spareName;
	}


	public void setSpareName(String spareName) {
		this.spareName = spareName;
	}


	public String getSpareTypeId() {
		return spareTypeId;
	}


	public void setSpareTypeId(String spareTypeId) {
		this.spareTypeId = spareTypeId;
	}




	public String getSpareCategoryId() {
		return spareCategoryId;
	}


	public void setSpareCategoryId(String spareCategoryId) {
		this.spareCategoryId = spareCategoryId;
	}




	public String getSpareModel() {
		return spareModel;
	}


	public void setSpareModel(String spareModel) {
		this.spareModel = spareModel;
	}


	public String getSpareSpecification() {
		return spareSpecification;
	}


	public void setSpareSpecification(String spareSpecification) {
		this.spareSpecification = spareSpecification;
	}


	public Integer getMinInventory() {
		return minInventory;
	}


	public void setMinInventory(Integer minInventory) {
		this.minInventory = minInventory;
	}


	
}
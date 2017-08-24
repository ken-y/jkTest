package cn.you.jk.domain;

import org.springframework.format.annotation.DateTimeFormat;

public class Contract {

	private String id;  
    private String offeror;//收购方  
    private String contractNo;//合同编号  
    private java.util.Date signingDate;//签单日期  
    private String inputBy;//制单人  
    private String checkBy;//审单人  
    private String inspector;//验货员  
    private Double totalAmount;//总金额  
    private Integer importNum;//重要程度  
    private String crequest;//要求  
    private String customName;  
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private java.util.Date deliveryPeriod;//交货期限  
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private java.util.Date shipTime;//船期  
    private String tradeTerms;//贸易条款  
    private String remark;//说明  
    private String printStyle;//打印版式  
    private Integer oldState;//归档前状态  
    private Integer state;//状态  
    private Integer outState;//走货状态  
    private String createBy;  
    private String creatDept;  
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private java.util.Date creatTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOfferor() {
		return offeror;
	}
	public void setOfferor(String offeror) {
		this.offeror = offeror;
	}
	public String getContractNo() {
		return contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	public java.util.Date getSigningDate() {
		return signingDate;
	}
	public void setSigningDate(java.util.Date signingDate) {
		this.signingDate = signingDate;
	}
	public String getInputBy() {
		return inputBy;
	}
	public void setInputBy(String inputBy) {
		this.inputBy = inputBy;
	}
	public String getCheckBy() {
		return checkBy;
	}
	public void setCheckBy(String checkBy) {
		this.checkBy = checkBy;
	}
	public String getInspector() {
		return inspector;
	}
	public void setInspector(String inspector) {
		this.inspector = inspector;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Integer getImportNum() {
		return importNum;
	}
	public void setImportNum(Integer importNum) {
		this.importNum = importNum;
	}
	public String getCrequest() {
		return crequest;
	}
	public void setCrequest(String crequest) {
		this.crequest = crequest;
	}
	public String getCustomName() {
		return customName;
	}
	public void setCustomName(String customName) {
		this.customName = customName;
	}
	public java.util.Date getDeliveryPeriod() {
		return deliveryPeriod;
	}
	public void setDeliveryPeriod(java.util.Date deliveryPeriod) {
		this.deliveryPeriod = deliveryPeriod;
	}
	public java.util.Date getShipTime() {
		return shipTime;
	}
	public void setShipTime(java.util.Date shipTime) {
		this.shipTime = shipTime;
	}
	public String getTradeTerms() {
		return tradeTerms;
	}
	public void setTradeTerms(String tradeTerms) {
		this.tradeTerms = tradeTerms;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getPrintStyle() {
		return printStyle;
	}
	public void setPrintStyle(String printStyle) {
		this.printStyle = printStyle;
	}
	public Integer getOldState() {
		return oldState;
	}
	public void setOldState(Integer oldState) {
		this.oldState = oldState;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Integer getOutState() {
		return outState;
	}
	public void setOutState(Integer outState) {
		this.outState = outState;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getCreatDept() {
		return creatDept;
	}
	public void setCreatDept(String creatDept) {
		this.creatDept = creatDept;
	}
	public java.util.Date getCreatTime() {
		return creatTime;
	}
	public void setCreatTime(java.util.Date creatTime) {
		this.creatTime = creatTime;
	} 
}

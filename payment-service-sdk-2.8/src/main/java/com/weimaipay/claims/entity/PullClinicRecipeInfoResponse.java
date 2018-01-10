package com.weimaipay.claims.entity;

/**
 * 门诊处方查询
 */
public class PullClinicRecipeInfoResponse {
	/**
	 * 门诊流水号
	 */
	private String outpatientSno;
	/**
	 * 处方号	VARCHAR2(20)
	 */
	private String recipeNum;
	/**
	 * 处方流水号	VARCHAR2(20)	同一个就诊下，处方流水号在医院端能够唯一标识一条处方明细信息；
	 */
	private String recipeSerialNum;
	/**
	 * 发票号
	 */
	private String invoiceNo;
	/**
	 * 处方日期	VARCHAR2(14)	YYYYMMDDHH24MISS
	 */
	private String recipeDate;
	/**
	 * 自付比例	VARCHAR2(16)	如果医保已经支付，此处填写医保的 乙类自付比例：丙类自费时 100%，乙 类按照实际比例传入；否则默认传入 本地城镇职工医保的自付比例
	 */
	private String selfPayRatio;
	/**
	 * 目录类别	VARCHAR2(3)	字典映射 见字典信息【医保目录类别】
	 */
	private String listCat;
	/**
	 * 医疗项目类别	VARCHAR2(3)	字典映射；西药、中成药、材料费等等 见字典信息【医保项目类别】
	 */
	private String medicalItemCat;
	/**
	 * 医院收费项目编码	VARCHAR2(35)
	 */
	private String hospitalChargeCode;
	/**
	 * 医院收费项目名称	VARCHAR2(100)
	 */
	private String hospitalChargeName;
	/**
	 * 医保收费项目编码	VARCHAR2(35)	本地就医时对应参保人的医保编号， 如目录类别是药品时，项目编码指的 是药品编码；如果目录类别是诊疗项 目时，项目编码为诊疗项目编码；如 果目录类别为医用材料时，项目编码 为医用材料编码。自费收费时，默认为本地城镇职工医保收费项目编码
	 */
	private String centreChargeCode;
	/**
	 * 医保收费项目名称	VARCHAR2(100)	参保地社保经办机构三大目录管理规范名称
	 */
	private String medicareFeeitemName;
	/**
	 * 单价	VARCHAR2(16) 	4位小数
	 */
	private String price;
	/**
	 * 数量	VARCHAR2(12)	4位小数，按照目录库中的包装上传入，非招标按照实际情况传入。
	 */
	private String quantity;
	/**
	 * 金额	VARCHAR2(16)	4位小数，金额 = 单价 * 数量
	 */
	private String money;
	/**
	 * 药品商品名	VARCHAR2(200)	如为药品，提供商品名
	 */
	private String productName;
	/**
	 * 英文名	VARCHAR2(200)	如有英文名，提供英文名
	 */
	private String englishName;
	/**
	 * 剂型	VARCHAR2(50)	字典映射 见字典信息【剂型】
	 */
	private String formulation;
	/**
	 * 规格	VARCHAR2(100)
	 */
	private String spec;
	/**
	 * 标准单位	VARCHAR2(20)	项目的包装单位或者计价单位。
	 */
	private String standardUnit;
	/**
	 * 草药单复方标志	VARCHAR2(3)	字典映射
	 */
	private String herbFuFangSign;
	/**
	 * 全额自费标志	VARCHAR2(3)	字典映射
	 */
	private String totalSelfFundFlg;
	/**
	 * 用法	VARCHAR2(100)
	 */
	private String usage;
	/**
	 * 每次用量	VARCHAR2(16)	4 位小数，按照目录库中的最小单位数量
	 */
	private String perQuantity;
	/**
	 * 使用频次	VARCHAR2(20)	字典映射 见字典信息【频次】
	 */
	private String frequency;
	/**
	 * 成分	VARCHAR2(100)	药品成分
	 */
	private String combination;
	/**
	 * 适应症或主治功能	VARCHAR2(100)	适应症说明
	 */
	private String functions;
	/**
	 * 帖数	VARCHAR2(16)
	 */
	private String packetNum;
	/**
	 * 禁忌	VARCHAR2(100)
	 */
	private String contraindication;
	/**
	 * 限制用药标识	VARCHAR2(2)	是或否；1 是 0 否
	 */
	private String isRestricted;
	/**
	 * 限制用药	VARCHAR2(1000)	限制范围说明
	 */
	private String restrictions;
	/**
	 * 基药标识	VARCHAR2(2)	是否为《国家基本药物目录 》中的药物
	 */
	private String isBasicMedicine;
	/**
	 * 国药准字号	VARCHAR2(20)
	 */
	private String nationalMedicineId;
	/**
	 * 注册证号	VARCHAR2(20)
	 */
	private String regId;
	/**
	 * 品牌	VARCHAR2(100)
	 */
	private String brand;
	/**
	 * 产地	VARCHAR2(100)	国产或进口
	 */
	private String origion;
	/**
	 * 生产厂家	VARCHAR2(100)
	 */
	private String manufacturer;
	/**
	 * 检查结果	VARCHAR2(2000)	检查检验项目时使用
	 */
	private String examinationResult;
	/**
	 * 正常参考值	VARCHAR2(200)	检查检验项目时使用
	 */
	private String referenceRanges;
	/**
	 * 检查提示	VARCHAR2(2000)	检查检验项目时使用
	 */
	private String examinationHint;
	/**
	 * 科室编码	VARCHAR2(20)
	 */
	private String deptNum;
	/**
	 * 科室名称	VARCHAR2(50)
	 */
	private String deptName;
	/**
	 * 医生编码	VARCHAR2(20)	处方医生编码
	 */
	private String doctorCode;
	/**
	 * 医生姓名	VARCHAR2(50)	处方医生名称
	 */
	private String doctorName;
	/**
	 * 医保限价	VARCHAR2(16)	2 位小数，如果医保已经支付，此处填写医保的最高支付限价
	 */
	private String medlimitedPrice;
	/**
	 * 经办人	VARCHAR2(20)	医疗机构操作员姓名
	 */
	private String updateBy;

	public String getOutpatientSno() {
		return outpatientSno;
	}

	public void setOutpatientSno(String outpatientSno) {
		this.outpatientSno = outpatientSno;
	}

	public String getRecipeNum() {
		return recipeNum;
	}

	public void setRecipeNum(String recipeNum) {
		this.recipeNum = recipeNum;
	}

	public String getRecipeSerialNum() {
		return recipeSerialNum;
	}

	public void setRecipeSerialNum(String recipeSerialNum) {
		this.recipeSerialNum = recipeSerialNum;
	}

	public String getRecipeDate() {
		return recipeDate;
	}

	public void setRecipeDate(String recipeDate) {
		this.recipeDate = recipeDate;
	}

	public String getSelfPayRatio() {
		return selfPayRatio;
	}

	public void setSelfPayRatio(String selfPayRatio) {
		this.selfPayRatio = selfPayRatio;
	}

	public String getListCat() {
		return listCat;
	}

	public void setListCat(String listCat) {
		this.listCat = listCat;
	}

	public String getMedicalItemCat() {
		return medicalItemCat;
	}

	public void setMedicalItemCat(String medicalItemCat) {
		this.medicalItemCat = medicalItemCat;
	}

	public String getHospitalChargeCode() {
		return hospitalChargeCode;
	}

	public void setHospitalChargeCode(String hospitalChargeCode) {
		this.hospitalChargeCode = hospitalChargeCode;
	}

	public String getHospitalChargeName() {
		return hospitalChargeName;
	}

	public void setHospitalChargeName(String hospitalChargeName) {
		this.hospitalChargeName = hospitalChargeName;
	}

	public String getCentreChargeCode() {
		return centreChargeCode;
	}

	public void setCentreChargeCode(String centreChargeCode) {
		this.centreChargeCode = centreChargeCode;
	}

	public String getMedicareFeeitemName() {
		return medicareFeeitemName;
	}

	public void setMedicareFeeitemName(String medicareFeeitemName) {
		this.medicareFeeitemName = medicareFeeitemName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getEnglishName() {
		return englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	public String getFormulation() {
		return formulation;
	}

	public void setFormulation(String formulation) {
		this.formulation = formulation;
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public String getStandardUnit() {
		return standardUnit;
	}

	public void setStandardUnit(String standardUnit) {
		this.standardUnit = standardUnit;
	}

	public String getHerbFuFangSign() {
		return herbFuFangSign;
	}

	public void setHerbFuFangSign(String herbFuFangSign) {
		this.herbFuFangSign = herbFuFangSign;
	}

	public String getTotalSelfFundFlg() {
		return totalSelfFundFlg;
	}

	public void setTotalSelfFundFlg(String totalSelfFundFlg) {
		this.totalSelfFundFlg = totalSelfFundFlg;
	}

	public String getUsage() {
		return usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}

	public String getPerQuantity() {
		return perQuantity;
	}

	public void setPerQuantity(String perQuantity) {
		this.perQuantity = perQuantity;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getCombination() {
		return combination;
	}

	public void setCombination(String combination) {
		this.combination = combination;
	}

	public String getFunctions() {
		return functions;
	}

	public void setFunctions(String functions) {
		this.functions = functions;
	}

	public String getPacketNum() {
		return packetNum;
	}

	public void setPacketNum(String packetNum) {
		this.packetNum = packetNum;
	}

	public String getContraindication() {
		return contraindication;
	}

	public void setContraindication(String contraindication) {
		this.contraindication = contraindication;
	}

	public String getIsRestricted() {
		return isRestricted;
	}

	public void setIsRestricted(String isRestricted) {
		this.isRestricted = isRestricted;
	}

	public String getRestrictions() {
		return restrictions;
	}

	public void setRestrictions(String restrictions) {
		this.restrictions = restrictions;
	}

	public String getIsBasicMedicine() {
		return isBasicMedicine;
	}

	public void setIsBasicMedicine(String isBasicMedicine) {
		this.isBasicMedicine = isBasicMedicine;
	}

	public String getNationalMedicineId() {
		return nationalMedicineId;
	}

	public void setNationalMedicineId(String nationalMedicineId) {
		this.nationalMedicineId = nationalMedicineId;
	}

	public String getRegId() {
		return regId;
	}

	public void setRegId(String regId) {
		this.regId = regId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getOrigion() {
		return origion;
	}

	public void setOrigion(String origion) {
		this.origion = origion;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getExaminationResult() {
		return examinationResult;
	}

	public void setExaminationResult(String examinationResult) {
		this.examinationResult = examinationResult;
	}

	public String getReferenceRanges() {
		return referenceRanges;
	}

	public void setReferenceRanges(String referenceRanges) {
		this.referenceRanges = referenceRanges;
	}

	public String getExaminationHint() {
		return examinationHint;
	}

	public void setExaminationHint(String examinationHint) {
		this.examinationHint = examinationHint;
	}

	public String getDeptNum() {
		return deptNum;
	}

	public void setDeptNum(String deptNum) {
		this.deptNum = deptNum;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDoctorCode() {
		return doctorCode;
	}

	public void setDoctorCode(String doctorCode) {
		this.doctorCode = doctorCode;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getMedlimitedPrice() {
		return medlimitedPrice;
	}

	public void setMedlimitedPrice(String medlimitedPrice) {
		this.medlimitedPrice = medlimitedPrice;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
}

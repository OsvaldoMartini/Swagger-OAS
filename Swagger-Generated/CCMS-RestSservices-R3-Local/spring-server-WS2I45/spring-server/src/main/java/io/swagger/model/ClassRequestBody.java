package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HeaderRequest;
import io.swagger.model.RequestBodyDecisions;
import io.swagger.model.RequestBodyDeo;
import io.swagger.model.RequestBodyLastAssessmentsBlock;
import io.swagger.model.RequestBodyNationalityList;
import io.swagger.model.RequestBodyPersonRatings;
import io.swagger.model.RequestInteroperabilityPropertyBlock;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Request Body
 */
@ApiModel(description = "Request Body")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-07T13:56:37.457Z")

public class ClassRequestBody   {
  @JsonProperty("headerRequest")
  private HeaderRequest headerRequest = null;

  @JsonProperty("requestInteroperabilityPropertyBlock")
  private RequestInteroperabilityPropertyBlock requestInteroperabilityPropertyBlock = null;

  @JsonProperty("PersonRatings")
  private RequestBodyPersonRatings personRatings = null;

  @JsonProperty("Decisions")
  private RequestBodyDecisions decisions = null;

  @JsonProperty("NationalityList")
  @Valid
  private List<RequestBodyNationalityList> nationalityList = null;

  @JsonProperty("Deo")
  @Valid
  private List<RequestBodyDeo> deo = null;

  @JsonProperty("LastAssessmentsBlock")
  @Valid
  private List<RequestBodyLastAssessmentsBlock> lastAssessmentsBlock = null;

  @JsonProperty("personId")
  private String personId = null;

  @JsonProperty("assessmentDate")
  private String assessmentDate = null;

  @JsonProperty("issuer")
  private String issuer = null;

  @JsonProperty("decisioningVersion")
  private String decisioningVersion = null;

  @JsonProperty("scenarioType")
  private String scenarioType = null;

  @JsonProperty("threasholdApplicationScore")
  private Integer threasholdApplicationScore = null;

  @JsonProperty("applicationScore")
  private Integer applicationScore = null;

  @JsonProperty("applicationScoreLevel")
  private String applicationScoreLevel = null;

  @JsonProperty("salaryCertificateReceived")
  private String salaryCertificateReceived = null;

  @JsonProperty("incomeConfirmedByPhone")
  private String incomeConfirmedByPhone = null;

  @JsonProperty("commercialRegisterDone")
  private String commercialRegisterDone = null;

  @JsonProperty("taxFormReceived")
  private String taxFormReceived = null;

  @JsonProperty("authenticatedCopyIdReceived")
  private String authenticatedCopyIdReceived = null;

  @JsonProperty("addressConfirmed")
  private String addressConfirmed = null;

  @JsonProperty("employmentType")
  private String employmentType = null;

  @JsonProperty("income")
  private BigDecimal income = null;

  @JsonProperty("ownAssetsFrom")
  private BigDecimal ownAssetsFrom = null;

  @JsonProperty("ownAssetsTo")
  private BigDecimal ownAssetsTo = null;

  @JsonProperty("numberChildren")
  private Integer numberChildren = null;

  @JsonProperty("housingCosts")
  private BigDecimal housingCosts = null;

  @JsonProperty("permit")
  private String permit = null;

  @JsonProperty("permitSince")
  private LocalDate permitSince = null;

  @JsonProperty("behaviorCreditRiskScore")
  private Integer behaviorCreditRiskScore = null;

  @JsonProperty("behaviorCreditRiskScoreLevel")
  private String behaviorCreditRiskScoreLevel = null;

  @JsonProperty("valueAtRisk")
  private BigDecimal valueAtRisk = null;

  @JsonProperty("CLV")
  private Integer CLV = null;

  @JsonProperty("CLVLevel")
  private String clVLevel = null;

  @JsonProperty("avgUtilizationRate")
  private BigDecimal avgUtilizationRate = null;

  @JsonProperty("creditClientSince")
  private LocalDate creditClientSince = null;

  @JsonProperty("balance")
  private BigDecimal balance = null;

  @JsonProperty("delinquency")
  private String delinquency = null;

  @JsonProperty("actConFinLiability")
  private BigDecimal actConFinLiability = null;

  @JsonProperty("actLiability")
  private BigDecimal actLiability = null;

  @JsonProperty("actTempLiability")
  private BigDecimal actTempLiability = null;

  @JsonProperty("clientRiskStatuses")
  private String clientRiskStatuses = null;

  @JsonProperty("clientRiskReasons")
  private String clientRiskReasons = null;

  @JsonProperty("personRoleSubType")
  private String personRoleSubType = null;

  @JsonProperty("personSegmentation")
  private String personSegmentation = null;

  @JsonProperty("crifFound")
  private String crifFound = null;

  @JsonProperty("zekFound")
  private String zekFound = null;

  @JsonProperty("deoCompleted")
  private String deoCompleted = null;

  @JsonProperty("deoNegativeManual")
  private String deoNegativeManual = null;

  @JsonProperty("reasonBlackFile")
  private String reasonBlackFile = null;

  @JsonProperty("deoLastRequestDate")
  private LocalDate deoLastRequestDate = null;

  public ClassRequestBody headerRequest(HeaderRequest headerRequest) {
    this.headerRequest = headerRequest;
    return this;
  }

  /**
   * Get headerRequest
   * @return headerRequest
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public HeaderRequest getHeaderRequest() {
    return headerRequest;
  }

  public void setHeaderRequest(HeaderRequest headerRequest) {
    this.headerRequest = headerRequest;
  }

  public ClassRequestBody requestInteroperabilityPropertyBlock(RequestInteroperabilityPropertyBlock requestInteroperabilityPropertyBlock) {
    this.requestInteroperabilityPropertyBlock = requestInteroperabilityPropertyBlock;
    return this;
  }

  /**
   * Get requestInteroperabilityPropertyBlock
   * @return requestInteroperabilityPropertyBlock
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public RequestInteroperabilityPropertyBlock getRequestInteroperabilityPropertyBlock() {
    return requestInteroperabilityPropertyBlock;
  }

  public void setRequestInteroperabilityPropertyBlock(RequestInteroperabilityPropertyBlock requestInteroperabilityPropertyBlock) {
    this.requestInteroperabilityPropertyBlock = requestInteroperabilityPropertyBlock;
  }

  public ClassRequestBody personRatings(RequestBodyPersonRatings personRatings) {
    this.personRatings = personRatings;
    return this;
  }

  /**
   * Get personRatings
   * @return personRatings
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RequestBodyPersonRatings getPersonRatings() {
    return personRatings;
  }

  public void setPersonRatings(RequestBodyPersonRatings personRatings) {
    this.personRatings = personRatings;
  }

  public ClassRequestBody decisions(RequestBodyDecisions decisions) {
    this.decisions = decisions;
    return this;
  }

  /**
   * Get decisions
   * @return decisions
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public RequestBodyDecisions getDecisions() {
    return decisions;
  }

  public void setDecisions(RequestBodyDecisions decisions) {
    this.decisions = decisions;
  }

  public ClassRequestBody nationalityList(List<RequestBodyNationalityList> nationalityList) {
    this.nationalityList = nationalityList;
    return this;
  }

  public ClassRequestBody addNationalityListItem(RequestBodyNationalityList nationalityListItem) {
    if (this.nationalityList == null) {
      this.nationalityList = new ArrayList<RequestBodyNationalityList>();
    }
    this.nationalityList.add(nationalityListItem);
    return this;
  }

  /**
   * Get nationalityList
   * @return nationalityList
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RequestBodyNationalityList> getNationalityList() {
    return nationalityList;
  }

  public void setNationalityList(List<RequestBodyNationalityList> nationalityList) {
    this.nationalityList = nationalityList;
  }

  public ClassRequestBody deo(List<RequestBodyDeo> deo) {
    this.deo = deo;
    return this;
  }

  public ClassRequestBody addDeoItem(RequestBodyDeo deoItem) {
    if (this.deo == null) {
      this.deo = new ArrayList<RequestBodyDeo>();
    }
    this.deo.add(deoItem);
    return this;
  }

  /**
   * Get deo
   * @return deo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RequestBodyDeo> getDeo() {
    return deo;
  }

  public void setDeo(List<RequestBodyDeo> deo) {
    this.deo = deo;
  }

  public ClassRequestBody lastAssessmentsBlock(List<RequestBodyLastAssessmentsBlock> lastAssessmentsBlock) {
    this.lastAssessmentsBlock = lastAssessmentsBlock;
    return this;
  }

  public ClassRequestBody addLastAssessmentsBlockItem(RequestBodyLastAssessmentsBlock lastAssessmentsBlockItem) {
    if (this.lastAssessmentsBlock == null) {
      this.lastAssessmentsBlock = new ArrayList<RequestBodyLastAssessmentsBlock>();
    }
    this.lastAssessmentsBlock.add(lastAssessmentsBlockItem);
    return this;
  }

  /**
   * Get lastAssessmentsBlock
   * @return lastAssessmentsBlock
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RequestBodyLastAssessmentsBlock> getLastAssessmentsBlock() {
    return lastAssessmentsBlock;
  }

  public void setLastAssessmentsBlock(List<RequestBodyLastAssessmentsBlock> lastAssessmentsBlock) {
    this.lastAssessmentsBlock = lastAssessmentsBlock;
  }

  public ClassRequestBody personId(String personId) {
    this.personId = personId;
    return this;
  }

  /**
   * Get personId
   * @return personId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=20) 
  public String getPersonId() {
    return personId;
  }

  public void setPersonId(String personId) {
    this.personId = personId;
  }

  public ClassRequestBody assessmentDate(String assessmentDate) {
    this.assessmentDate = assessmentDate;
    return this;
  }

  /**
   * Get assessmentDate
   * @return assessmentDate
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public String getAssessmentDate() {
    return assessmentDate;
  }

  public void setAssessmentDate(String assessmentDate) {
    this.assessmentDate = assessmentDate;
  }

  public ClassRequestBody issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Get issuer
   * @return issuer
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=5) 
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public ClassRequestBody decisioningVersion(String decisioningVersion) {
    this.decisioningVersion = decisioningVersion;
    return this;
  }

  /**
   * Get decisioningVersion
   * @return decisioningVersion
  **/
  @ApiModelProperty(value = "")

@Size(max=20) 
  public String getDecisioningVersion() {
    return decisioningVersion;
  }

  public void setDecisioningVersion(String decisioningVersion) {
    this.decisioningVersion = decisioningVersion;
  }

  public ClassRequestBody scenarioType(String scenarioType) {
    this.scenarioType = scenarioType;
    return this;
  }

  /**
   * Get scenarioType
   * @return scenarioType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=1) 
  public String getScenarioType() {
    return scenarioType;
  }

  public void setScenarioType(String scenarioType) {
    this.scenarioType = scenarioType;
  }

  public ClassRequestBody threasholdApplicationScore(Integer threasholdApplicationScore) {
    this.threasholdApplicationScore = threasholdApplicationScore;
    return this;
  }

  /**
   * Get threasholdApplicationScore
   * @return threasholdApplicationScore
  **/
  @ApiModelProperty(value = "")


  public Integer getThreasholdApplicationScore() {
    return threasholdApplicationScore;
  }

  public void setThreasholdApplicationScore(Integer threasholdApplicationScore) {
    this.threasholdApplicationScore = threasholdApplicationScore;
  }

  public ClassRequestBody applicationScore(Integer applicationScore) {
    this.applicationScore = applicationScore;
    return this;
  }

  /**
   * Get applicationScore
   * @return applicationScore
  **/
  @ApiModelProperty(value = "")


  public Integer getApplicationScore() {
    return applicationScore;
  }

  public void setApplicationScore(Integer applicationScore) {
    this.applicationScore = applicationScore;
  }

  public ClassRequestBody applicationScoreLevel(String applicationScoreLevel) {
    this.applicationScoreLevel = applicationScoreLevel;
    return this;
  }

  /**
   * Get applicationScoreLevel
   * @return applicationScoreLevel
  **/
  @ApiModelProperty(value = "")

@Size(max=2) 
  public String getApplicationScoreLevel() {
    return applicationScoreLevel;
  }

  public void setApplicationScoreLevel(String applicationScoreLevel) {
    this.applicationScoreLevel = applicationScoreLevel;
  }

  public ClassRequestBody salaryCertificateReceived(String salaryCertificateReceived) {
    this.salaryCertificateReceived = salaryCertificateReceived;
    return this;
  }

  /**
   * Get salaryCertificateReceived
   * @return salaryCertificateReceived
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getSalaryCertificateReceived() {
    return salaryCertificateReceived;
  }

  public void setSalaryCertificateReceived(String salaryCertificateReceived) {
    this.salaryCertificateReceived = salaryCertificateReceived;
  }

  public ClassRequestBody incomeConfirmedByPhone(String incomeConfirmedByPhone) {
    this.incomeConfirmedByPhone = incomeConfirmedByPhone;
    return this;
  }

  /**
   * Get incomeConfirmedByPhone
   * @return incomeConfirmedByPhone
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getIncomeConfirmedByPhone() {
    return incomeConfirmedByPhone;
  }

  public void setIncomeConfirmedByPhone(String incomeConfirmedByPhone) {
    this.incomeConfirmedByPhone = incomeConfirmedByPhone;
  }

  public ClassRequestBody commercialRegisterDone(String commercialRegisterDone) {
    this.commercialRegisterDone = commercialRegisterDone;
    return this;
  }

  /**
   * Get commercialRegisterDone
   * @return commercialRegisterDone
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getCommercialRegisterDone() {
    return commercialRegisterDone;
  }

  public void setCommercialRegisterDone(String commercialRegisterDone) {
    this.commercialRegisterDone = commercialRegisterDone;
  }

  public ClassRequestBody taxFormReceived(String taxFormReceived) {
    this.taxFormReceived = taxFormReceived;
    return this;
  }

  /**
   * Get taxFormReceived
   * @return taxFormReceived
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getTaxFormReceived() {
    return taxFormReceived;
  }

  public void setTaxFormReceived(String taxFormReceived) {
    this.taxFormReceived = taxFormReceived;
  }

  public ClassRequestBody authenticatedCopyIdReceived(String authenticatedCopyIdReceived) {
    this.authenticatedCopyIdReceived = authenticatedCopyIdReceived;
    return this;
  }

  /**
   * Get authenticatedCopyIdReceived
   * @return authenticatedCopyIdReceived
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getAuthenticatedCopyIdReceived() {
    return authenticatedCopyIdReceived;
  }

  public void setAuthenticatedCopyIdReceived(String authenticatedCopyIdReceived) {
    this.authenticatedCopyIdReceived = authenticatedCopyIdReceived;
  }

  public ClassRequestBody addressConfirmed(String addressConfirmed) {
    this.addressConfirmed = addressConfirmed;
    return this;
  }

  /**
   * Get addressConfirmed
   * @return addressConfirmed
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getAddressConfirmed() {
    return addressConfirmed;
  }

  public void setAddressConfirmed(String addressConfirmed) {
    this.addressConfirmed = addressConfirmed;
  }

  public ClassRequestBody employmentType(String employmentType) {
    this.employmentType = employmentType;
    return this;
  }

  /**
   * Get employmentType
   * @return employmentType
  **/
  @ApiModelProperty(value = "")

@Size(max=32) 
  public String getEmploymentType() {
    return employmentType;
  }

  public void setEmploymentType(String employmentType) {
    this.employmentType = employmentType;
  }

  public ClassRequestBody income(BigDecimal income) {
    this.income = income;
    return this;
  }

  /**
   * Get income
   * @return income
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getIncome() {
    return income;
  }

  public void setIncome(BigDecimal income) {
    this.income = income;
  }

  public ClassRequestBody ownAssetsFrom(BigDecimal ownAssetsFrom) {
    this.ownAssetsFrom = ownAssetsFrom;
    return this;
  }

  /**
   * Get ownAssetsFrom
   * @return ownAssetsFrom
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getOwnAssetsFrom() {
    return ownAssetsFrom;
  }

  public void setOwnAssetsFrom(BigDecimal ownAssetsFrom) {
    this.ownAssetsFrom = ownAssetsFrom;
  }

  public ClassRequestBody ownAssetsTo(BigDecimal ownAssetsTo) {
    this.ownAssetsTo = ownAssetsTo;
    return this;
  }

  /**
   * Get ownAssetsTo
   * @return ownAssetsTo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getOwnAssetsTo() {
    return ownAssetsTo;
  }

  public void setOwnAssetsTo(BigDecimal ownAssetsTo) {
    this.ownAssetsTo = ownAssetsTo;
  }

  public ClassRequestBody numberChildren(Integer numberChildren) {
    this.numberChildren = numberChildren;
    return this;
  }

  /**
   * Get numberChildren
   * @return numberChildren
  **/
  @ApiModelProperty(value = "")


  public Integer getNumberChildren() {
    return numberChildren;
  }

  public void setNumberChildren(Integer numberChildren) {
    this.numberChildren = numberChildren;
  }

  public ClassRequestBody housingCosts(BigDecimal housingCosts) {
    this.housingCosts = housingCosts;
    return this;
  }

  /**
   * Get housingCosts
   * @return housingCosts
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getHousingCosts() {
    return housingCosts;
  }

  public void setHousingCosts(BigDecimal housingCosts) {
    this.housingCosts = housingCosts;
  }

  public ClassRequestBody permit(String permit) {
    this.permit = permit;
    return this;
  }

  /**
   * Get permit
   * @return permit
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getPermit() {
    return permit;
  }

  public void setPermit(String permit) {
    this.permit = permit;
  }

  public ClassRequestBody permitSince(LocalDate permitSince) {
    this.permitSince = permitSince;
    return this;
  }

  /**
   * Get permitSince
   * @return permitSince
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getPermitSince() {
    return permitSince;
  }

  public void setPermitSince(LocalDate permitSince) {
    this.permitSince = permitSince;
  }

  public ClassRequestBody behaviorCreditRiskScore(Integer behaviorCreditRiskScore) {
    this.behaviorCreditRiskScore = behaviorCreditRiskScore;
    return this;
  }

  /**
   * Get behaviorCreditRiskScore
   * @return behaviorCreditRiskScore
  **/
  @ApiModelProperty(value = "")


  public Integer getBehaviorCreditRiskScore() {
    return behaviorCreditRiskScore;
  }

  public void setBehaviorCreditRiskScore(Integer behaviorCreditRiskScore) {
    this.behaviorCreditRiskScore = behaviorCreditRiskScore;
  }

  public ClassRequestBody behaviorCreditRiskScoreLevel(String behaviorCreditRiskScoreLevel) {
    this.behaviorCreditRiskScoreLevel = behaviorCreditRiskScoreLevel;
    return this;
  }

  /**
   * Get behaviorCreditRiskScoreLevel
   * @return behaviorCreditRiskScoreLevel
  **/
  @ApiModelProperty(value = "")

@Size(max=2) 
  public String getBehaviorCreditRiskScoreLevel() {
    return behaviorCreditRiskScoreLevel;
  }

  public void setBehaviorCreditRiskScoreLevel(String behaviorCreditRiskScoreLevel) {
    this.behaviorCreditRiskScoreLevel = behaviorCreditRiskScoreLevel;
  }

  public ClassRequestBody valueAtRisk(BigDecimal valueAtRisk) {
    this.valueAtRisk = valueAtRisk;
    return this;
  }

  /**
   * Get valueAtRisk
   * @return valueAtRisk
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getValueAtRisk() {
    return valueAtRisk;
  }

  public void setValueAtRisk(BigDecimal valueAtRisk) {
    this.valueAtRisk = valueAtRisk;
  }

  public ClassRequestBody CLV(Integer CLV) {
    this.CLV = CLV;
    return this;
  }

  /**
   * Get CLV
   * @return CLV
  **/
  @ApiModelProperty(value = "")


  public Integer getCLV() {
    return CLV;
  }

  public void setCLV(Integer CLV) {
    this.CLV = CLV;
  }

  public ClassRequestBody clVLevel(String clVLevel) {
    this.clVLevel = clVLevel;
    return this;
  }

  /**
   * Get clVLevel
   * @return clVLevel
  **/
  @ApiModelProperty(value = "")

@Size(max=2) 
  public String getClVLevel() {
    return clVLevel;
  }

  public void setClVLevel(String clVLevel) {
    this.clVLevel = clVLevel;
  }

  public ClassRequestBody avgUtilizationRate(BigDecimal avgUtilizationRate) {
    this.avgUtilizationRate = avgUtilizationRate;
    return this;
  }

  /**
   * Get avgUtilizationRate
   * @return avgUtilizationRate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getAvgUtilizationRate() {
    return avgUtilizationRate;
  }

  public void setAvgUtilizationRate(BigDecimal avgUtilizationRate) {
    this.avgUtilizationRate = avgUtilizationRate;
  }

  public ClassRequestBody creditClientSince(LocalDate creditClientSince) {
    this.creditClientSince = creditClientSince;
    return this;
  }

  /**
   * Get creditClientSince
   * @return creditClientSince
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getCreditClientSince() {
    return creditClientSince;
  }

  public void setCreditClientSince(LocalDate creditClientSince) {
    this.creditClientSince = creditClientSince;
  }

  public ClassRequestBody balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * @return balance
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public ClassRequestBody delinquency(String delinquency) {
    this.delinquency = delinquency;
    return this;
  }

  /**
   * Get delinquency
   * @return delinquency
  **/
  @ApiModelProperty(value = "")

@Size(max=10) 
  public String getDelinquency() {
    return delinquency;
  }

  public void setDelinquency(String delinquency) {
    this.delinquency = delinquency;
  }

  public ClassRequestBody actConFinLiability(BigDecimal actConFinLiability) {
    this.actConFinLiability = actConFinLiability;
    return this;
  }

  /**
   * Get actConFinLiability
   * @return actConFinLiability
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getActConFinLiability() {
    return actConFinLiability;
  }

  public void setActConFinLiability(BigDecimal actConFinLiability) {
    this.actConFinLiability = actConFinLiability;
  }

  public ClassRequestBody actLiability(BigDecimal actLiability) {
    this.actLiability = actLiability;
    return this;
  }

  /**
   * Get actLiability
   * @return actLiability
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getActLiability() {
    return actLiability;
  }

  public void setActLiability(BigDecimal actLiability) {
    this.actLiability = actLiability;
  }

  public ClassRequestBody actTempLiability(BigDecimal actTempLiability) {
    this.actTempLiability = actTempLiability;
    return this;
  }

  /**
   * Get actTempLiability
   * @return actTempLiability
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getActTempLiability() {
    return actTempLiability;
  }

  public void setActTempLiability(BigDecimal actTempLiability) {
    this.actTempLiability = actTempLiability;
  }

  public ClassRequestBody clientRiskStatuses(String clientRiskStatuses) {
    this.clientRiskStatuses = clientRiskStatuses;
    return this;
  }

  /**
   * Get clientRiskStatuses
   * @return clientRiskStatuses
  **/
  @ApiModelProperty(value = "")

@Size(max=32) 
  public String getClientRiskStatuses() {
    return clientRiskStatuses;
  }

  public void setClientRiskStatuses(String clientRiskStatuses) {
    this.clientRiskStatuses = clientRiskStatuses;
  }

  public ClassRequestBody clientRiskReasons(String clientRiskReasons) {
    this.clientRiskReasons = clientRiskReasons;
    return this;
  }

  /**
   * Get clientRiskReasons
   * @return clientRiskReasons
  **/
  @ApiModelProperty(value = "")

@Size(max=64) 
  public String getClientRiskReasons() {
    return clientRiskReasons;
  }

  public void setClientRiskReasons(String clientRiskReasons) {
    this.clientRiskReasons = clientRiskReasons;
  }

  public ClassRequestBody personRoleSubType(String personRoleSubType) {
    this.personRoleSubType = personRoleSubType;
    return this;
  }

  /**
   * Get personRoleSubType
   * @return personRoleSubType
  **/
  @ApiModelProperty(value = "")

@Size(max=3) 
  public String getPersonRoleSubType() {
    return personRoleSubType;
  }

  public void setPersonRoleSubType(String personRoleSubType) {
    this.personRoleSubType = personRoleSubType;
  }

  public ClassRequestBody personSegmentation(String personSegmentation) {
    this.personSegmentation = personSegmentation;
    return this;
  }

  /**
   * Get personSegmentation
   * @return personSegmentation
  **/
  @ApiModelProperty(value = "")

@Size(max=64) 
  public String getPersonSegmentation() {
    return personSegmentation;
  }

  public void setPersonSegmentation(String personSegmentation) {
    this.personSegmentation = personSegmentation;
  }

  public ClassRequestBody crifFound(String crifFound) {
    this.crifFound = crifFound;
    return this;
  }

  /**
   * Get crifFound
   * @return crifFound
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getCrifFound() {
    return crifFound;
  }

  public void setCrifFound(String crifFound) {
    this.crifFound = crifFound;
  }

  public ClassRequestBody zekFound(String zekFound) {
    this.zekFound = zekFound;
    return this;
  }

  /**
   * Get zekFound
   * @return zekFound
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getZekFound() {
    return zekFound;
  }

  public void setZekFound(String zekFound) {
    this.zekFound = zekFound;
  }

  public ClassRequestBody deoCompleted(String deoCompleted) {
    this.deoCompleted = deoCompleted;
    return this;
  }

  /**
   * Get deoCompleted
   * @return deoCompleted
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getDeoCompleted() {
    return deoCompleted;
  }

  public void setDeoCompleted(String deoCompleted) {
    this.deoCompleted = deoCompleted;
  }

  public ClassRequestBody deoNegativeManual(String deoNegativeManual) {
    this.deoNegativeManual = deoNegativeManual;
    return this;
  }

  /**
   * Get deoNegativeManual
   * @return deoNegativeManual
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getDeoNegativeManual() {
    return deoNegativeManual;
  }

  public void setDeoNegativeManual(String deoNegativeManual) {
    this.deoNegativeManual = deoNegativeManual;
  }

  public ClassRequestBody reasonBlackFile(String reasonBlackFile) {
    this.reasonBlackFile = reasonBlackFile;
    return this;
  }

  /**
   * Get reasonBlackFile
   * @return reasonBlackFile
  **/
  @ApiModelProperty(value = "")

@Size(max=64) 
  public String getReasonBlackFile() {
    return reasonBlackFile;
  }

  public void setReasonBlackFile(String reasonBlackFile) {
    this.reasonBlackFile = reasonBlackFile;
  }

  public ClassRequestBody deoLastRequestDate(LocalDate deoLastRequestDate) {
    this.deoLastRequestDate = deoLastRequestDate;
    return this;
  }

  /**
   * Get deoLastRequestDate
   * @return deoLastRequestDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDeoLastRequestDate() {
    return deoLastRequestDate;
  }

  public void setDeoLastRequestDate(LocalDate deoLastRequestDate) {
    this.deoLastRequestDate = deoLastRequestDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassRequestBody requestBody = (ClassRequestBody) o;
    return Objects.equals(this.headerRequest, requestBody.headerRequest) &&
        Objects.equals(this.requestInteroperabilityPropertyBlock, requestBody.requestInteroperabilityPropertyBlock) &&
        Objects.equals(this.personRatings, requestBody.personRatings) &&
        Objects.equals(this.decisions, requestBody.decisions) &&
        Objects.equals(this.nationalityList, requestBody.nationalityList) &&
        Objects.equals(this.deo, requestBody.deo) &&
        Objects.equals(this.lastAssessmentsBlock, requestBody.lastAssessmentsBlock) &&
        Objects.equals(this.personId, requestBody.personId) &&
        Objects.equals(this.assessmentDate, requestBody.assessmentDate) &&
        Objects.equals(this.issuer, requestBody.issuer) &&
        Objects.equals(this.decisioningVersion, requestBody.decisioningVersion) &&
        Objects.equals(this.scenarioType, requestBody.scenarioType) &&
        Objects.equals(this.threasholdApplicationScore, requestBody.threasholdApplicationScore) &&
        Objects.equals(this.applicationScore, requestBody.applicationScore) &&
        Objects.equals(this.applicationScoreLevel, requestBody.applicationScoreLevel) &&
        Objects.equals(this.salaryCertificateReceived, requestBody.salaryCertificateReceived) &&
        Objects.equals(this.incomeConfirmedByPhone, requestBody.incomeConfirmedByPhone) &&
        Objects.equals(this.commercialRegisterDone, requestBody.commercialRegisterDone) &&
        Objects.equals(this.taxFormReceived, requestBody.taxFormReceived) &&
        Objects.equals(this.authenticatedCopyIdReceived, requestBody.authenticatedCopyIdReceived) &&
        Objects.equals(this.addressConfirmed, requestBody.addressConfirmed) &&
        Objects.equals(this.employmentType, requestBody.employmentType) &&
        Objects.equals(this.income, requestBody.income) &&
        Objects.equals(this.ownAssetsFrom, requestBody.ownAssetsFrom) &&
        Objects.equals(this.ownAssetsTo, requestBody.ownAssetsTo) &&
        Objects.equals(this.numberChildren, requestBody.numberChildren) &&
        Objects.equals(this.housingCosts, requestBody.housingCosts) &&
        Objects.equals(this.permit, requestBody.permit) &&
        Objects.equals(this.permitSince, requestBody.permitSince) &&
        Objects.equals(this.behaviorCreditRiskScore, requestBody.behaviorCreditRiskScore) &&
        Objects.equals(this.behaviorCreditRiskScoreLevel, requestBody.behaviorCreditRiskScoreLevel) &&
        Objects.equals(this.valueAtRisk, requestBody.valueAtRisk) &&
        Objects.equals(this.CLV, requestBody.CLV) &&
        Objects.equals(this.clVLevel, requestBody.clVLevel) &&
        Objects.equals(this.avgUtilizationRate, requestBody.avgUtilizationRate) &&
        Objects.equals(this.creditClientSince, requestBody.creditClientSince) &&
        Objects.equals(this.balance, requestBody.balance) &&
        Objects.equals(this.delinquency, requestBody.delinquency) &&
        Objects.equals(this.actConFinLiability, requestBody.actConFinLiability) &&
        Objects.equals(this.actLiability, requestBody.actLiability) &&
        Objects.equals(this.actTempLiability, requestBody.actTempLiability) &&
        Objects.equals(this.clientRiskStatuses, requestBody.clientRiskStatuses) &&
        Objects.equals(this.clientRiskReasons, requestBody.clientRiskReasons) &&
        Objects.equals(this.personRoleSubType, requestBody.personRoleSubType) &&
        Objects.equals(this.personSegmentation, requestBody.personSegmentation) &&
        Objects.equals(this.crifFound, requestBody.crifFound) &&
        Objects.equals(this.zekFound, requestBody.zekFound) &&
        Objects.equals(this.deoCompleted, requestBody.deoCompleted) &&
        Objects.equals(this.deoNegativeManual, requestBody.deoNegativeManual) &&
        Objects.equals(this.reasonBlackFile, requestBody.reasonBlackFile) &&
        Objects.equals(this.deoLastRequestDate, requestBody.deoLastRequestDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerRequest, requestInteroperabilityPropertyBlock, personRatings, decisions, nationalityList, deo, lastAssessmentsBlock, personId, assessmentDate, issuer, decisioningVersion, scenarioType, threasholdApplicationScore, applicationScore, applicationScoreLevel, salaryCertificateReceived, incomeConfirmedByPhone, commercialRegisterDone, taxFormReceived, authenticatedCopyIdReceived, addressConfirmed, employmentType, income, ownAssetsFrom, ownAssetsTo, numberChildren, housingCosts, permit, permitSince, behaviorCreditRiskScore, behaviorCreditRiskScoreLevel, valueAtRisk, CLV, clVLevel, avgUtilizationRate, creditClientSince, balance, delinquency, actConFinLiability, actLiability, actTempLiability, clientRiskStatuses, clientRiskReasons, personRoleSubType, personSegmentation, crifFound, zekFound, deoCompleted, deoNegativeManual, reasonBlackFile, deoLastRequestDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassRequestBody {\n");
    
    sb.append("    headerRequest: ").append(toIndentedString(headerRequest)).append("\n");
    sb.append("    requestInteroperabilityPropertyBlock: ").append(toIndentedString(requestInteroperabilityPropertyBlock)).append("\n");
    sb.append("    personRatings: ").append(toIndentedString(personRatings)).append("\n");
    sb.append("    decisions: ").append(toIndentedString(decisions)).append("\n");
    sb.append("    nationalityList: ").append(toIndentedString(nationalityList)).append("\n");
    sb.append("    deo: ").append(toIndentedString(deo)).append("\n");
    sb.append("    lastAssessmentsBlock: ").append(toIndentedString(lastAssessmentsBlock)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    assessmentDate: ").append(toIndentedString(assessmentDate)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    decisioningVersion: ").append(toIndentedString(decisioningVersion)).append("\n");
    sb.append("    scenarioType: ").append(toIndentedString(scenarioType)).append("\n");
    sb.append("    threasholdApplicationScore: ").append(toIndentedString(threasholdApplicationScore)).append("\n");
    sb.append("    applicationScore: ").append(toIndentedString(applicationScore)).append("\n");
    sb.append("    applicationScoreLevel: ").append(toIndentedString(applicationScoreLevel)).append("\n");
    sb.append("    salaryCertificateReceived: ").append(toIndentedString(salaryCertificateReceived)).append("\n");
    sb.append("    incomeConfirmedByPhone: ").append(toIndentedString(incomeConfirmedByPhone)).append("\n");
    sb.append("    commercialRegisterDone: ").append(toIndentedString(commercialRegisterDone)).append("\n");
    sb.append("    taxFormReceived: ").append(toIndentedString(taxFormReceived)).append("\n");
    sb.append("    authenticatedCopyIdReceived: ").append(toIndentedString(authenticatedCopyIdReceived)).append("\n");
    sb.append("    addressConfirmed: ").append(toIndentedString(addressConfirmed)).append("\n");
    sb.append("    employmentType: ").append(toIndentedString(employmentType)).append("\n");
    sb.append("    income: ").append(toIndentedString(income)).append("\n");
    sb.append("    ownAssetsFrom: ").append(toIndentedString(ownAssetsFrom)).append("\n");
    sb.append("    ownAssetsTo: ").append(toIndentedString(ownAssetsTo)).append("\n");
    sb.append("    numberChildren: ").append(toIndentedString(numberChildren)).append("\n");
    sb.append("    housingCosts: ").append(toIndentedString(housingCosts)).append("\n");
    sb.append("    permit: ").append(toIndentedString(permit)).append("\n");
    sb.append("    permitSince: ").append(toIndentedString(permitSince)).append("\n");
    sb.append("    behaviorCreditRiskScore: ").append(toIndentedString(behaviorCreditRiskScore)).append("\n");
    sb.append("    behaviorCreditRiskScoreLevel: ").append(toIndentedString(behaviorCreditRiskScoreLevel)).append("\n");
    sb.append("    valueAtRisk: ").append(toIndentedString(valueAtRisk)).append("\n");
    sb.append("    CLV: ").append(toIndentedString(CLV)).append("\n");
    sb.append("    clVLevel: ").append(toIndentedString(clVLevel)).append("\n");
    sb.append("    avgUtilizationRate: ").append(toIndentedString(avgUtilizationRate)).append("\n");
    sb.append("    creditClientSince: ").append(toIndentedString(creditClientSince)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    delinquency: ").append(toIndentedString(delinquency)).append("\n");
    sb.append("    actConFinLiability: ").append(toIndentedString(actConFinLiability)).append("\n");
    sb.append("    actLiability: ").append(toIndentedString(actLiability)).append("\n");
    sb.append("    actTempLiability: ").append(toIndentedString(actTempLiability)).append("\n");
    sb.append("    clientRiskStatuses: ").append(toIndentedString(clientRiskStatuses)).append("\n");
    sb.append("    clientRiskReasons: ").append(toIndentedString(clientRiskReasons)).append("\n");
    sb.append("    personRoleSubType: ").append(toIndentedString(personRoleSubType)).append("\n");
    sb.append("    personSegmentation: ").append(toIndentedString(personSegmentation)).append("\n");
    sb.append("    crifFound: ").append(toIndentedString(crifFound)).append("\n");
    sb.append("    zekFound: ").append(toIndentedString(zekFound)).append("\n");
    sb.append("    deoCompleted: ").append(toIndentedString(deoCompleted)).append("\n");
    sb.append("    deoNegativeManual: ").append(toIndentedString(deoNegativeManual)).append("\n");
    sb.append("    reasonBlackFile: ").append(toIndentedString(reasonBlackFile)).append("\n");
    sb.append("    deoLastRequestDate: ").append(toIndentedString(deoLastRequestDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


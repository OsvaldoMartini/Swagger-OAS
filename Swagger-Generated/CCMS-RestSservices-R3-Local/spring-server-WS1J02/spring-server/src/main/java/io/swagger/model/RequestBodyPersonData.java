package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestBodyPersonData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-13T10:34:52.354Z")

public class RequestBodyPersonData   {
  @JsonProperty("personSubTypeCode")
  private String personSubTypeCode = null;

  @JsonProperty("internalId")
  private String internalId = null;

  @JsonProperty("personId")
  private String personId = null;

  @JsonProperty("personId2")
  private String personId2 = null;

  @JsonProperty("personName")
  private String personName = null;

  @JsonProperty("shortName")
  private String shortName = null;

  @JsonProperty("personClass")
  private String personClass = null;

  @JsonProperty("kycProfileCode")
  private String kycProfileCode = null;

  @JsonProperty("kycFlag")
  private String kycFlag = null;

  @JsonProperty("kycRefreshDate")
  private LocalDate kycRefreshDate = null;

  @JsonProperty("domicileBranchCode")
  private String domicileBranchCode = null;

  @JsonProperty("economySector")
  private String economySector = null;

  @JsonProperty("domicileCountryCode")
  private String domicileCountryCode = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("comment")
  private String comment = null;

  @JsonProperty("personExclusivityOwnerId")
  private String personExclusivityOwnerId = null;

  @JsonProperty("tageticCode")
  private String tageticCode = null;

  @JsonProperty("b2AssetClass")
  private String b2AssetClass = null;

  @JsonProperty("marketingLetter")
  private String marketingLetter = null;

  @JsonProperty("emailPrivacyFlag")
  private String emailPrivacyFlag = null;

  @JsonProperty("smsPrivacyFlag")
  private String smsPrivacyFlag = null;

  @JsonProperty("phonePrivacyFlag")
  private String phonePrivacyFlag = null;

  @JsonProperty("mailPrivacyFlag")
  private String mailPrivacyFlag = null;

  @JsonProperty("groupCustomerSince")
  private LocalDate groupCustomerSince = null;

  @JsonProperty("wclSDNCode")
  private String wclSDNCode = null;

  @JsonProperty("clearedByComplianceCode")
  private String clearedByComplianceCode = null;

  @JsonProperty("pepListed")
  private String pepListed = null;

  @JsonProperty("wclId")
  private String wclId = null;

  @JsonProperty("wclCategoryCode")
  private String wclCategoryCode = null;

  @JsonProperty("wclSubcategoryCode")
  private String wclSubcategoryCode = null;

  @JsonProperty("personLifecycle")
  private String personLifecycle = null;

  @JsonProperty("personLifecycleChgReason")
  private String personLifecycleChgReason = null;

  @JsonProperty("lifecycleChangedByLogin")
  private String lifecycleChangedByLogin = null;

  @JsonProperty("lifecycleChangedOn")
  private LocalDate lifecycleChangedOn = null;

  @JsonProperty("personsOfficer1Login")
  private String personsOfficer1Login = null;

  @JsonProperty("personsOfficer2Login")
  private String personsOfficer2Login = null;

  @JsonProperty("personsOfficer3Login")
  private String personsOfficer3Login = null;

  @JsonProperty("personEnteredOnDate")
  private LocalDate personEnteredOnDate = null;

  @JsonProperty("personEnteredByLogin")
  private String personEnteredByLogin = null;

  @JsonProperty("personEntryBranchCode")
  private String personEntryBranchCode = null;

  @JsonProperty("lastChangedOn")
  private LocalDate lastChangedOn = null;

  @JsonProperty("lastChangedByLogin")
  private String lastChangedByLogin = null;

  @JsonProperty("lastChangedInBranchCode")
  private String lastChangedInBranchCode = null;

  public RequestBodyPersonData personSubTypeCode(String personSubTypeCode) {
    this.personSubTypeCode = personSubTypeCode;
    return this;
  }

  /**
   * Get personSubTypeCode
   * @return personSubTypeCode
  **/
  @ApiModelProperty(value = "")

@Size(max=2) 
  public String getPersonSubTypeCode() {
    return personSubTypeCode;
  }

  public void setPersonSubTypeCode(String personSubTypeCode) {
    this.personSubTypeCode = personSubTypeCode;
  }

  public RequestBodyPersonData internalId(String internalId) {
    this.internalId = internalId;
    return this;
  }

  /**
   * Get internalId
   * @return internalId
  **/
  @ApiModelProperty(value = "")

@Size(max=10) 
  public String getInternalId() {
    return internalId;
  }

  public void setInternalId(String internalId) {
    this.internalId = internalId;
  }

  public RequestBodyPersonData personId(String personId) {
    this.personId = personId;
    return this;
  }

  /**
   * Get personId
   * @return personId
  **/
  @ApiModelProperty(value = "")

@Size(max=20) 
  public String getPersonId() {
    return personId;
  }

  public void setPersonId(String personId) {
    this.personId = personId;
  }

  public RequestBodyPersonData personId2(String personId2) {
    this.personId2 = personId2;
    return this;
  }

  /**
   * Get personId2
   * @return personId2
  **/
  @ApiModelProperty(value = "")

@Size(max=20) 
  public String getPersonId2() {
    return personId2;
  }

  public void setPersonId2(String personId2) {
    this.personId2 = personId2;
  }

  public RequestBodyPersonData personName(String personName) {
    this.personName = personName;
    return this;
  }

  /**
   * Get personName
   * @return personName
  **/
  @ApiModelProperty(value = "")

@Size(max=128) 
  public String getPersonName() {
    return personName;
  }

  public void setPersonName(String personName) {
    this.personName = personName;
  }

  public RequestBodyPersonData shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

  /**
   * Get shortName
   * @return shortName
  **/
  @ApiModelProperty(value = "")

@Size(max=26) 
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public RequestBodyPersonData personClass(String personClass) {
    this.personClass = personClass;
    return this;
  }

  /**
   * Get personClass
   * @return personClass
  **/
  @ApiModelProperty(value = "")

@Size(max=18) 
  public String getPersonClass() {
    return personClass;
  }

  public void setPersonClass(String personClass) {
    this.personClass = personClass;
  }

  public RequestBodyPersonData kycProfileCode(String kycProfileCode) {
    this.kycProfileCode = kycProfileCode;
    return this;
  }

  /**
   * Get kycProfileCode
   * @return kycProfileCode
  **/
  @ApiModelProperty(value = "")

@Size(max=2) 
  public String getKycProfileCode() {
    return kycProfileCode;
  }

  public void setKycProfileCode(String kycProfileCode) {
    this.kycProfileCode = kycProfileCode;
  }

  public RequestBodyPersonData kycFlag(String kycFlag) {
    this.kycFlag = kycFlag;
    return this;
  }

  /**
   * Get kycFlag
   * @return kycFlag
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getKycFlag() {
    return kycFlag;
  }

  public void setKycFlag(String kycFlag) {
    this.kycFlag = kycFlag;
  }

  public RequestBodyPersonData kycRefreshDate(LocalDate kycRefreshDate) {
    this.kycRefreshDate = kycRefreshDate;
    return this;
  }

  /**
   * Get kycRefreshDate
   * @return kycRefreshDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getKycRefreshDate() {
    return kycRefreshDate;
  }

  public void setKycRefreshDate(LocalDate kycRefreshDate) {
    this.kycRefreshDate = kycRefreshDate;
  }

  public RequestBodyPersonData domicileBranchCode(String domicileBranchCode) {
    this.domicileBranchCode = domicileBranchCode;
    return this;
  }

  /**
   * Get domicileBranchCode
   * @return domicileBranchCode
  **/
  @ApiModelProperty(value = "")

@Size(max=8) 
  public String getDomicileBranchCode() {
    return domicileBranchCode;
  }

  public void setDomicileBranchCode(String domicileBranchCode) {
    this.domicileBranchCode = domicileBranchCode;
  }

  public RequestBodyPersonData economySector(String economySector) {
    this.economySector = economySector;
    return this;
  }

  /**
   * Get economySector
   * @return economySector
  **/
  @ApiModelProperty(value = "")

@Size(max=2) 
  public String getEconomySector() {
    return economySector;
  }

  public void setEconomySector(String economySector) {
    this.economySector = economySector;
  }

  public RequestBodyPersonData domicileCountryCode(String domicileCountryCode) {
    this.domicileCountryCode = domicileCountryCode;
    return this;
  }

  /**
   * Get domicileCountryCode
   * @return domicileCountryCode
  **/
  @ApiModelProperty(value = "")

@Size(max=3) 
  public String getDomicileCountryCode() {
    return domicileCountryCode;
  }

  public void setDomicileCountryCode(String domicileCountryCode) {
    this.domicileCountryCode = domicileCountryCode;
  }

  public RequestBodyPersonData language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
  **/
  @ApiModelProperty(value = "")

@Size(max=2) 
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public RequestBodyPersonData comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
  **/
  @ApiModelProperty(value = "")

@Size(max=60) 
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public RequestBodyPersonData personExclusivityOwnerId(String personExclusivityOwnerId) {
    this.personExclusivityOwnerId = personExclusivityOwnerId;
    return this;
  }

  /**
   * Get personExclusivityOwnerId
   * @return personExclusivityOwnerId
  **/
  @ApiModelProperty(value = "")

@Size(max=10) 
  public String getPersonExclusivityOwnerId() {
    return personExclusivityOwnerId;
  }

  public void setPersonExclusivityOwnerId(String personExclusivityOwnerId) {
    this.personExclusivityOwnerId = personExclusivityOwnerId;
  }

  public RequestBodyPersonData tageticCode(String tageticCode) {
    this.tageticCode = tageticCode;
    return this;
  }

  /**
   * Get tageticCode
   * @return tageticCode
  **/
  @ApiModelProperty(value = "")

@Size(max=10) 
  public String getTageticCode() {
    return tageticCode;
  }

  public void setTageticCode(String tageticCode) {
    this.tageticCode = tageticCode;
  }

  public RequestBodyPersonData b2AssetClass(String b2AssetClass) {
    this.b2AssetClass = b2AssetClass;
    return this;
  }

  /**
   * Get b2AssetClass
   * @return b2AssetClass
  **/
  @ApiModelProperty(value = "")

@Size(max=2) 
  public String getB2AssetClass() {
    return b2AssetClass;
  }

  public void setB2AssetClass(String b2AssetClass) {
    this.b2AssetClass = b2AssetClass;
  }

  public RequestBodyPersonData marketingLetter(String marketingLetter) {
    this.marketingLetter = marketingLetter;
    return this;
  }

  /**
   * Get marketingLetter
   * @return marketingLetter
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getMarketingLetter() {
    return marketingLetter;
  }

  public void setMarketingLetter(String marketingLetter) {
    this.marketingLetter = marketingLetter;
  }

  public RequestBodyPersonData emailPrivacyFlag(String emailPrivacyFlag) {
    this.emailPrivacyFlag = emailPrivacyFlag;
    return this;
  }

  /**
   * Get emailPrivacyFlag
   * @return emailPrivacyFlag
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getEmailPrivacyFlag() {
    return emailPrivacyFlag;
  }

  public void setEmailPrivacyFlag(String emailPrivacyFlag) {
    this.emailPrivacyFlag = emailPrivacyFlag;
  }

  public RequestBodyPersonData smsPrivacyFlag(String smsPrivacyFlag) {
    this.smsPrivacyFlag = smsPrivacyFlag;
    return this;
  }

  /**
   * Get smsPrivacyFlag
   * @return smsPrivacyFlag
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getSmsPrivacyFlag() {
    return smsPrivacyFlag;
  }

  public void setSmsPrivacyFlag(String smsPrivacyFlag) {
    this.smsPrivacyFlag = smsPrivacyFlag;
  }

  public RequestBodyPersonData phonePrivacyFlag(String phonePrivacyFlag) {
    this.phonePrivacyFlag = phonePrivacyFlag;
    return this;
  }

  /**
   * Get phonePrivacyFlag
   * @return phonePrivacyFlag
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getPhonePrivacyFlag() {
    return phonePrivacyFlag;
  }

  public void setPhonePrivacyFlag(String phonePrivacyFlag) {
    this.phonePrivacyFlag = phonePrivacyFlag;
  }

  public RequestBodyPersonData mailPrivacyFlag(String mailPrivacyFlag) {
    this.mailPrivacyFlag = mailPrivacyFlag;
    return this;
  }

  /**
   * Get mailPrivacyFlag
   * @return mailPrivacyFlag
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getMailPrivacyFlag() {
    return mailPrivacyFlag;
  }

  public void setMailPrivacyFlag(String mailPrivacyFlag) {
    this.mailPrivacyFlag = mailPrivacyFlag;
  }

  public RequestBodyPersonData groupCustomerSince(LocalDate groupCustomerSince) {
    this.groupCustomerSince = groupCustomerSince;
    return this;
  }

  /**
   * Get groupCustomerSince
   * @return groupCustomerSince
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getGroupCustomerSince() {
    return groupCustomerSince;
  }

  public void setGroupCustomerSince(LocalDate groupCustomerSince) {
    this.groupCustomerSince = groupCustomerSince;
  }

  public RequestBodyPersonData wclSDNCode(String wclSDNCode) {
    this.wclSDNCode = wclSDNCode;
    return this;
  }

  /**
   * Get wclSDNCode
   * @return wclSDNCode
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getWclSDNCode() {
    return wclSDNCode;
  }

  public void setWclSDNCode(String wclSDNCode) {
    this.wclSDNCode = wclSDNCode;
  }

  public RequestBodyPersonData clearedByComplianceCode(String clearedByComplianceCode) {
    this.clearedByComplianceCode = clearedByComplianceCode;
    return this;
  }

  /**
   * Get clearedByComplianceCode
   * @return clearedByComplianceCode
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getClearedByComplianceCode() {
    return clearedByComplianceCode;
  }

  public void setClearedByComplianceCode(String clearedByComplianceCode) {
    this.clearedByComplianceCode = clearedByComplianceCode;
  }

  public RequestBodyPersonData pepListed(String pepListed) {
    this.pepListed = pepListed;
    return this;
  }

  /**
   * Get pepListed
   * @return pepListed
  **/
  @ApiModelProperty(value = "")

@Size(max=20) 
  public String getPepListed() {
    return pepListed;
  }

  public void setPepListed(String pepListed) {
    this.pepListed = pepListed;
  }

  public RequestBodyPersonData wclId(String wclId) {
    this.wclId = wclId;
    return this;
  }

  /**
   * Get wclId
   * @return wclId
  **/
  @ApiModelProperty(value = "")

@Size(max=7) 
  public String getWclId() {
    return wclId;
  }

  public void setWclId(String wclId) {
    this.wclId = wclId;
  }

  public RequestBodyPersonData wclCategoryCode(String wclCategoryCode) {
    this.wclCategoryCode = wclCategoryCode;
    return this;
  }

  /**
   * Get wclCategoryCode
   * @return wclCategoryCode
  **/
  @ApiModelProperty(value = "")

@Size(max=2) 
  public String getWclCategoryCode() {
    return wclCategoryCode;
  }

  public void setWclCategoryCode(String wclCategoryCode) {
    this.wclCategoryCode = wclCategoryCode;
  }

  public RequestBodyPersonData wclSubcategoryCode(String wclSubcategoryCode) {
    this.wclSubcategoryCode = wclSubcategoryCode;
    return this;
  }

  /**
   * Get wclSubcategoryCode
   * @return wclSubcategoryCode
  **/
  @ApiModelProperty(value = "")

@Size(max=2) 
  public String getWclSubcategoryCode() {
    return wclSubcategoryCode;
  }

  public void setWclSubcategoryCode(String wclSubcategoryCode) {
    this.wclSubcategoryCode = wclSubcategoryCode;
  }

  public RequestBodyPersonData personLifecycle(String personLifecycle) {
    this.personLifecycle = personLifecycle;
    return this;
  }

  /**
   * Get personLifecycle
   * @return personLifecycle
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getPersonLifecycle() {
    return personLifecycle;
  }

  public void setPersonLifecycle(String personLifecycle) {
    this.personLifecycle = personLifecycle;
  }

  public RequestBodyPersonData personLifecycleChgReason(String personLifecycleChgReason) {
    this.personLifecycleChgReason = personLifecycleChgReason;
    return this;
  }

  /**
   * Get personLifecycleChgReason
   * @return personLifecycleChgReason
  **/
  @ApiModelProperty(value = "")

@Size(max=2) 
  public String getPersonLifecycleChgReason() {
    return personLifecycleChgReason;
  }

  public void setPersonLifecycleChgReason(String personLifecycleChgReason) {
    this.personLifecycleChgReason = personLifecycleChgReason;
  }

  public RequestBodyPersonData lifecycleChangedByLogin(String lifecycleChangedByLogin) {
    this.lifecycleChangedByLogin = lifecycleChangedByLogin;
    return this;
  }

  /**
   * Get lifecycleChangedByLogin
   * @return lifecycleChangedByLogin
  **/
  @ApiModelProperty(value = "")

@Size(max=8) 
  public String getLifecycleChangedByLogin() {
    return lifecycleChangedByLogin;
  }

  public void setLifecycleChangedByLogin(String lifecycleChangedByLogin) {
    this.lifecycleChangedByLogin = lifecycleChangedByLogin;
  }

  public RequestBodyPersonData lifecycleChangedOn(LocalDate lifecycleChangedOn) {
    this.lifecycleChangedOn = lifecycleChangedOn;
    return this;
  }

  /**
   * Get lifecycleChangedOn
   * @return lifecycleChangedOn
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getLifecycleChangedOn() {
    return lifecycleChangedOn;
  }

  public void setLifecycleChangedOn(LocalDate lifecycleChangedOn) {
    this.lifecycleChangedOn = lifecycleChangedOn;
  }

  public RequestBodyPersonData personsOfficer1Login(String personsOfficer1Login) {
    this.personsOfficer1Login = personsOfficer1Login;
    return this;
  }

  /**
   * Get personsOfficer1Login
   * @return personsOfficer1Login
  **/
  @ApiModelProperty(value = "")

@Size(max=20) 
  public String getPersonsOfficer1Login() {
    return personsOfficer1Login;
  }

  public void setPersonsOfficer1Login(String personsOfficer1Login) {
    this.personsOfficer1Login = personsOfficer1Login;
  }

  public RequestBodyPersonData personsOfficer2Login(String personsOfficer2Login) {
    this.personsOfficer2Login = personsOfficer2Login;
    return this;
  }

  /**
   * Get personsOfficer2Login
   * @return personsOfficer2Login
  **/
  @ApiModelProperty(value = "")

@Size(max=20) 
  public String getPersonsOfficer2Login() {
    return personsOfficer2Login;
  }

  public void setPersonsOfficer2Login(String personsOfficer2Login) {
    this.personsOfficer2Login = personsOfficer2Login;
  }

  public RequestBodyPersonData personsOfficer3Login(String personsOfficer3Login) {
    this.personsOfficer3Login = personsOfficer3Login;
    return this;
  }

  /**
   * Get personsOfficer3Login
   * @return personsOfficer3Login
  **/
  @ApiModelProperty(value = "")

@Size(max=20) 
  public String getPersonsOfficer3Login() {
    return personsOfficer3Login;
  }

  public void setPersonsOfficer3Login(String personsOfficer3Login) {
    this.personsOfficer3Login = personsOfficer3Login;
  }

  public RequestBodyPersonData personEnteredOnDate(LocalDate personEnteredOnDate) {
    this.personEnteredOnDate = personEnteredOnDate;
    return this;
  }

  /**
   * Get personEnteredOnDate
   * @return personEnteredOnDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getPersonEnteredOnDate() {
    return personEnteredOnDate;
  }

  public void setPersonEnteredOnDate(LocalDate personEnteredOnDate) {
    this.personEnteredOnDate = personEnteredOnDate;
  }

  public RequestBodyPersonData personEnteredByLogin(String personEnteredByLogin) {
    this.personEnteredByLogin = personEnteredByLogin;
    return this;
  }

  /**
   * Get personEnteredByLogin
   * @return personEnteredByLogin
  **/
  @ApiModelProperty(value = "")

@Size(max=8) 
  public String getPersonEnteredByLogin() {
    return personEnteredByLogin;
  }

  public void setPersonEnteredByLogin(String personEnteredByLogin) {
    this.personEnteredByLogin = personEnteredByLogin;
  }

  public RequestBodyPersonData personEntryBranchCode(String personEntryBranchCode) {
    this.personEntryBranchCode = personEntryBranchCode;
    return this;
  }

  /**
   * Get personEntryBranchCode
   * @return personEntryBranchCode
  **/
  @ApiModelProperty(value = "")

@Size(max=8) 
  public String getPersonEntryBranchCode() {
    return personEntryBranchCode;
  }

  public void setPersonEntryBranchCode(String personEntryBranchCode) {
    this.personEntryBranchCode = personEntryBranchCode;
  }

  public RequestBodyPersonData lastChangedOn(LocalDate lastChangedOn) {
    this.lastChangedOn = lastChangedOn;
    return this;
  }

  /**
   * Get lastChangedOn
   * @return lastChangedOn
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getLastChangedOn() {
    return lastChangedOn;
  }

  public void setLastChangedOn(LocalDate lastChangedOn) {
    this.lastChangedOn = lastChangedOn;
  }

  public RequestBodyPersonData lastChangedByLogin(String lastChangedByLogin) {
    this.lastChangedByLogin = lastChangedByLogin;
    return this;
  }

  /**
   * Get lastChangedByLogin
   * @return lastChangedByLogin
  **/
  @ApiModelProperty(value = "")

@Size(max=8) 
  public String getLastChangedByLogin() {
    return lastChangedByLogin;
  }

  public void setLastChangedByLogin(String lastChangedByLogin) {
    this.lastChangedByLogin = lastChangedByLogin;
  }

  public RequestBodyPersonData lastChangedInBranchCode(String lastChangedInBranchCode) {
    this.lastChangedInBranchCode = lastChangedInBranchCode;
    return this;
  }

  /**
   * Get lastChangedInBranchCode
   * @return lastChangedInBranchCode
  **/
  @ApiModelProperty(value = "")

@Size(max=8) 
  public String getLastChangedInBranchCode() {
    return lastChangedInBranchCode;
  }

  public void setLastChangedInBranchCode(String lastChangedInBranchCode) {
    this.lastChangedInBranchCode = lastChangedInBranchCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestBodyPersonData requestBodyPersonData = (RequestBodyPersonData) o;
    return Objects.equals(this.personSubTypeCode, requestBodyPersonData.personSubTypeCode) &&
        Objects.equals(this.internalId, requestBodyPersonData.internalId) &&
        Objects.equals(this.personId, requestBodyPersonData.personId) &&
        Objects.equals(this.personId2, requestBodyPersonData.personId2) &&
        Objects.equals(this.personName, requestBodyPersonData.personName) &&
        Objects.equals(this.shortName, requestBodyPersonData.shortName) &&
        Objects.equals(this.personClass, requestBodyPersonData.personClass) &&
        Objects.equals(this.kycProfileCode, requestBodyPersonData.kycProfileCode) &&
        Objects.equals(this.kycFlag, requestBodyPersonData.kycFlag) &&
        Objects.equals(this.kycRefreshDate, requestBodyPersonData.kycRefreshDate) &&
        Objects.equals(this.domicileBranchCode, requestBodyPersonData.domicileBranchCode) &&
        Objects.equals(this.economySector, requestBodyPersonData.economySector) &&
        Objects.equals(this.domicileCountryCode, requestBodyPersonData.domicileCountryCode) &&
        Objects.equals(this.language, requestBodyPersonData.language) &&
        Objects.equals(this.comment, requestBodyPersonData.comment) &&
        Objects.equals(this.personExclusivityOwnerId, requestBodyPersonData.personExclusivityOwnerId) &&
        Objects.equals(this.tageticCode, requestBodyPersonData.tageticCode) &&
        Objects.equals(this.b2AssetClass, requestBodyPersonData.b2AssetClass) &&
        Objects.equals(this.marketingLetter, requestBodyPersonData.marketingLetter) &&
        Objects.equals(this.emailPrivacyFlag, requestBodyPersonData.emailPrivacyFlag) &&
        Objects.equals(this.smsPrivacyFlag, requestBodyPersonData.smsPrivacyFlag) &&
        Objects.equals(this.phonePrivacyFlag, requestBodyPersonData.phonePrivacyFlag) &&
        Objects.equals(this.mailPrivacyFlag, requestBodyPersonData.mailPrivacyFlag) &&
        Objects.equals(this.groupCustomerSince, requestBodyPersonData.groupCustomerSince) &&
        Objects.equals(this.wclSDNCode, requestBodyPersonData.wclSDNCode) &&
        Objects.equals(this.clearedByComplianceCode, requestBodyPersonData.clearedByComplianceCode) &&
        Objects.equals(this.pepListed, requestBodyPersonData.pepListed) &&
        Objects.equals(this.wclId, requestBodyPersonData.wclId) &&
        Objects.equals(this.wclCategoryCode, requestBodyPersonData.wclCategoryCode) &&
        Objects.equals(this.wclSubcategoryCode, requestBodyPersonData.wclSubcategoryCode) &&
        Objects.equals(this.personLifecycle, requestBodyPersonData.personLifecycle) &&
        Objects.equals(this.personLifecycleChgReason, requestBodyPersonData.personLifecycleChgReason) &&
        Objects.equals(this.lifecycleChangedByLogin, requestBodyPersonData.lifecycleChangedByLogin) &&
        Objects.equals(this.lifecycleChangedOn, requestBodyPersonData.lifecycleChangedOn) &&
        Objects.equals(this.personsOfficer1Login, requestBodyPersonData.personsOfficer1Login) &&
        Objects.equals(this.personsOfficer2Login, requestBodyPersonData.personsOfficer2Login) &&
        Objects.equals(this.personsOfficer3Login, requestBodyPersonData.personsOfficer3Login) &&
        Objects.equals(this.personEnteredOnDate, requestBodyPersonData.personEnteredOnDate) &&
        Objects.equals(this.personEnteredByLogin, requestBodyPersonData.personEnteredByLogin) &&
        Objects.equals(this.personEntryBranchCode, requestBodyPersonData.personEntryBranchCode) &&
        Objects.equals(this.lastChangedOn, requestBodyPersonData.lastChangedOn) &&
        Objects.equals(this.lastChangedByLogin, requestBodyPersonData.lastChangedByLogin) &&
        Objects.equals(this.lastChangedInBranchCode, requestBodyPersonData.lastChangedInBranchCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personSubTypeCode, internalId, personId, personId2, personName, shortName, personClass, kycProfileCode, kycFlag, kycRefreshDate, domicileBranchCode, economySector, domicileCountryCode, language, comment, personExclusivityOwnerId, tageticCode, b2AssetClass, marketingLetter, emailPrivacyFlag, smsPrivacyFlag, phonePrivacyFlag, mailPrivacyFlag, groupCustomerSince, wclSDNCode, clearedByComplianceCode, pepListed, wclId, wclCategoryCode, wclSubcategoryCode, personLifecycle, personLifecycleChgReason, lifecycleChangedByLogin, lifecycleChangedOn, personsOfficer1Login, personsOfficer2Login, personsOfficer3Login, personEnteredOnDate, personEnteredByLogin, personEntryBranchCode, lastChangedOn, lastChangedByLogin, lastChangedInBranchCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestBodyPersonData {\n");
    
    sb.append("    personSubTypeCode: ").append(toIndentedString(personSubTypeCode)).append("\n");
    sb.append("    internalId: ").append(toIndentedString(internalId)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    personId2: ").append(toIndentedString(personId2)).append("\n");
    sb.append("    personName: ").append(toIndentedString(personName)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    personClass: ").append(toIndentedString(personClass)).append("\n");
    sb.append("    kycProfileCode: ").append(toIndentedString(kycProfileCode)).append("\n");
    sb.append("    kycFlag: ").append(toIndentedString(kycFlag)).append("\n");
    sb.append("    kycRefreshDate: ").append(toIndentedString(kycRefreshDate)).append("\n");
    sb.append("    domicileBranchCode: ").append(toIndentedString(domicileBranchCode)).append("\n");
    sb.append("    economySector: ").append(toIndentedString(economySector)).append("\n");
    sb.append("    domicileCountryCode: ").append(toIndentedString(domicileCountryCode)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    personExclusivityOwnerId: ").append(toIndentedString(personExclusivityOwnerId)).append("\n");
    sb.append("    tageticCode: ").append(toIndentedString(tageticCode)).append("\n");
    sb.append("    b2AssetClass: ").append(toIndentedString(b2AssetClass)).append("\n");
    sb.append("    marketingLetter: ").append(toIndentedString(marketingLetter)).append("\n");
    sb.append("    emailPrivacyFlag: ").append(toIndentedString(emailPrivacyFlag)).append("\n");
    sb.append("    smsPrivacyFlag: ").append(toIndentedString(smsPrivacyFlag)).append("\n");
    sb.append("    phonePrivacyFlag: ").append(toIndentedString(phonePrivacyFlag)).append("\n");
    sb.append("    mailPrivacyFlag: ").append(toIndentedString(mailPrivacyFlag)).append("\n");
    sb.append("    groupCustomerSince: ").append(toIndentedString(groupCustomerSince)).append("\n");
    sb.append("    wclSDNCode: ").append(toIndentedString(wclSDNCode)).append("\n");
    sb.append("    clearedByComplianceCode: ").append(toIndentedString(clearedByComplianceCode)).append("\n");
    sb.append("    pepListed: ").append(toIndentedString(pepListed)).append("\n");
    sb.append("    wclId: ").append(toIndentedString(wclId)).append("\n");
    sb.append("    wclCategoryCode: ").append(toIndentedString(wclCategoryCode)).append("\n");
    sb.append("    wclSubcategoryCode: ").append(toIndentedString(wclSubcategoryCode)).append("\n");
    sb.append("    personLifecycle: ").append(toIndentedString(personLifecycle)).append("\n");
    sb.append("    personLifecycleChgReason: ").append(toIndentedString(personLifecycleChgReason)).append("\n");
    sb.append("    lifecycleChangedByLogin: ").append(toIndentedString(lifecycleChangedByLogin)).append("\n");
    sb.append("    lifecycleChangedOn: ").append(toIndentedString(lifecycleChangedOn)).append("\n");
    sb.append("    personsOfficer1Login: ").append(toIndentedString(personsOfficer1Login)).append("\n");
    sb.append("    personsOfficer2Login: ").append(toIndentedString(personsOfficer2Login)).append("\n");
    sb.append("    personsOfficer3Login: ").append(toIndentedString(personsOfficer3Login)).append("\n");
    sb.append("    personEnteredOnDate: ").append(toIndentedString(personEnteredOnDate)).append("\n");
    sb.append("    personEnteredByLogin: ").append(toIndentedString(personEnteredByLogin)).append("\n");
    sb.append("    personEntryBranchCode: ").append(toIndentedString(personEntryBranchCode)).append("\n");
    sb.append("    lastChangedOn: ").append(toIndentedString(lastChangedOn)).append("\n");
    sb.append("    lastChangedByLogin: ").append(toIndentedString(lastChangedByLogin)).append("\n");
    sb.append("    lastChangedInBranchCode: ").append(toIndentedString(lastChangedInBranchCode)).append("\n");
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


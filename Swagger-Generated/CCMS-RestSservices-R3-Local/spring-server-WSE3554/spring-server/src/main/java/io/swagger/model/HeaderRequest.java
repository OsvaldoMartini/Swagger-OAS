package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Sorting;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HeaderRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-09T14:22:50.953Z")

public class HeaderRequest   {
  @JsonProperty("trxCode")
  private String trxCode = null;

  @JsonProperty("userID")
  private String userID = null;

  @JsonProperty("trxTimeStamp")
  private OffsetDateTime trxTimeStamp = null;

  @JsonProperty("branchCode")
  private String branchCode = null;

  @JsonProperty("processDate")
  private LocalDate processDate = null;

  @JsonProperty("bankSign")
  private String bankSign = null;

  @JsonProperty("DeliveryChannel")
  private String deliveryChannel = null;

  @JsonProperty("ModuleName")
  private String moduleName = null;

  @JsonProperty("userLock")
  private OffsetDateTime userLock = null;

  @JsonProperty("actionListName")
  private String actionListName = null;

  @JsonProperty("actionListLevel")
  private Integer actionListLevel = null;

  @JsonProperty("actionListFetchSize")
  private Integer actionListFetchSize = null;

  @JsonProperty("sorting")
  private Sorting sorting = null;

  @JsonProperty("locale")
  private String locale = null;

  public HeaderRequest trxCode(String trxCode) {
    this.trxCode = trxCode;
    return this;
  }

  /**
   * Get trxCode
   * @return trxCode
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=8) 
  public String getTrxCode() {
    return trxCode;
  }

  public void setTrxCode(String trxCode) {
    this.trxCode = trxCode;
  }

  public HeaderRequest userID(String userID) {
    this.userID = userID;
    return this;
  }

  /**
   * Get userID
   * @return userID
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=64) 
  public String getUserID() {
    return userID;
  }

  public void setUserID(String userID) {
    this.userID = userID;
  }

  public HeaderRequest trxTimeStamp(OffsetDateTime trxTimeStamp) {
    this.trxTimeStamp = trxTimeStamp;
    return this;
  }

  /**
   * Get trxTimeStamp
   * @return trxTimeStamp
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getTrxTimeStamp() {
    return trxTimeStamp;
  }

  public void setTrxTimeStamp(OffsetDateTime trxTimeStamp) {
    this.trxTimeStamp = trxTimeStamp;
  }

  public HeaderRequest branchCode(String branchCode) {
    this.branchCode = branchCode;
    return this;
  }

  /**
   * Get branchCode
   * @return branchCode
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=8) 
  public String getBranchCode() {
    return branchCode;
  }

  public void setBranchCode(String branchCode) {
    this.branchCode = branchCode;
  }

  public HeaderRequest processDate(LocalDate processDate) {
    this.processDate = processDate;
    return this;
  }

  /**
   * Get processDate
   * @return processDate
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public LocalDate getProcessDate() {
    return processDate;
  }

  public void setProcessDate(LocalDate processDate) {
    this.processDate = processDate;
  }

  public HeaderRequest bankSign(String bankSign) {
    this.bankSign = bankSign;
    return this;
  }

  /**
   * Get bankSign
   * @return bankSign
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=2) 
  public String getBankSign() {
    return bankSign;
  }

  public void setBankSign(String bankSign) {
    this.bankSign = bankSign;
  }

  public HeaderRequest deliveryChannel(String deliveryChannel) {
    this.deliveryChannel = deliveryChannel;
    return this;
  }

  /**
   * Get deliveryChannel
   * @return deliveryChannel
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=8) 
  public String getDeliveryChannel() {
    return deliveryChannel;
  }

  public void setDeliveryChannel(String deliveryChannel) {
    this.deliveryChannel = deliveryChannel;
  }

  public HeaderRequest moduleName(String moduleName) {
    this.moduleName = moduleName;
    return this;
  }

  /**
   * Get moduleName
   * @return moduleName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=18) 
  public String getModuleName() {
    return moduleName;
  }

  public void setModuleName(String moduleName) {
    this.moduleName = moduleName;
  }

  public HeaderRequest userLock(OffsetDateTime userLock) {
    this.userLock = userLock;
    return this;
  }

  /**
   * Get userLock
   * @return userLock
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getUserLock() {
    return userLock;
  }

  public void setUserLock(OffsetDateTime userLock) {
    this.userLock = userLock;
  }

  public HeaderRequest actionListName(String actionListName) {
    this.actionListName = actionListName;
    return this;
  }

  /**
   * Get actionListName
   * @return actionListName
  **/
  @ApiModelProperty(value = "")

@Size(max=64) 
  public String getActionListName() {
    return actionListName;
  }

  public void setActionListName(String actionListName) {
    this.actionListName = actionListName;
  }

  public HeaderRequest actionListLevel(Integer actionListLevel) {
    this.actionListLevel = actionListLevel;
    return this;
  }

  /**
   * Get actionListLevel
   * @return actionListLevel
  **/
  @ApiModelProperty(value = "")


  public Integer getActionListLevel() {
    return actionListLevel;
  }

  public void setActionListLevel(Integer actionListLevel) {
    this.actionListLevel = actionListLevel;
  }

  public HeaderRequest actionListFetchSize(Integer actionListFetchSize) {
    this.actionListFetchSize = actionListFetchSize;
    return this;
  }

  /**
   * Get actionListFetchSize
   * @return actionListFetchSize
  **/
  @ApiModelProperty(value = "")


  public Integer getActionListFetchSize() {
    return actionListFetchSize;
  }

  public void setActionListFetchSize(Integer actionListFetchSize) {
    this.actionListFetchSize = actionListFetchSize;
  }

  public HeaderRequest sorting(Sorting sorting) {
    this.sorting = sorting;
    return this;
  }

  /**
   * Get sorting
   * @return sorting
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Sorting getSorting() {
    return sorting;
  }

  public void setSorting(Sorting sorting) {
    this.sorting = sorting;
  }

  public HeaderRequest locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Get locale
   * @return locale
  **/
  @ApiModelProperty(value = "")

@Size(max=11) 
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeaderRequest headerRequest = (HeaderRequest) o;
    return Objects.equals(this.trxCode, headerRequest.trxCode) &&
        Objects.equals(this.userID, headerRequest.userID) &&
        Objects.equals(this.trxTimeStamp, headerRequest.trxTimeStamp) &&
        Objects.equals(this.branchCode, headerRequest.branchCode) &&
        Objects.equals(this.processDate, headerRequest.processDate) &&
        Objects.equals(this.bankSign, headerRequest.bankSign) &&
        Objects.equals(this.deliveryChannel, headerRequest.deliveryChannel) &&
        Objects.equals(this.moduleName, headerRequest.moduleName) &&
        Objects.equals(this.userLock, headerRequest.userLock) &&
        Objects.equals(this.actionListName, headerRequest.actionListName) &&
        Objects.equals(this.actionListLevel, headerRequest.actionListLevel) &&
        Objects.equals(this.actionListFetchSize, headerRequest.actionListFetchSize) &&
        Objects.equals(this.sorting, headerRequest.sorting) &&
        Objects.equals(this.locale, headerRequest.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trxCode, userID, trxTimeStamp, branchCode, processDate, bankSign, deliveryChannel, moduleName, userLock, actionListName, actionListLevel, actionListFetchSize, sorting, locale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeaderRequest {\n");
    
    sb.append("    trxCode: ").append(toIndentedString(trxCode)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    trxTimeStamp: ").append(toIndentedString(trxTimeStamp)).append("\n");
    sb.append("    branchCode: ").append(toIndentedString(branchCode)).append("\n");
    sb.append("    processDate: ").append(toIndentedString(processDate)).append("\n");
    sb.append("    bankSign: ").append(toIndentedString(bankSign)).append("\n");
    sb.append("    deliveryChannel: ").append(toIndentedString(deliveryChannel)).append("\n");
    sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
    sb.append("    userLock: ").append(toIndentedString(userLock)).append("\n");
    sb.append("    actionListName: ").append(toIndentedString(actionListName)).append("\n");
    sb.append("    actionListLevel: ").append(toIndentedString(actionListLevel)).append("\n");
    sb.append("    actionListFetchSize: ").append(toIndentedString(actionListFetchSize)).append("\n");
    sb.append("    sorting: ").append(toIndentedString(sorting)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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


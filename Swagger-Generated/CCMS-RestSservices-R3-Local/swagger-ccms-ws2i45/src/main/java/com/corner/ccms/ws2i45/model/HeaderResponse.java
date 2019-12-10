package com.corner.ccms.ws2i45.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HeaderResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-10T11:05:03.369+01:00")

public class HeaderResponse   {
  @JsonProperty("Return_Code")
  private Integer returnCode = null;

  @JsonProperty("coreEventTimestamp")
  private OffsetDateTime coreEventTimestamp = null;

  @JsonProperty("messageCode")
  private String messageCode = null;

  @JsonProperty("messageText")
  private String messageText = null;

  @JsonProperty("mParams")
  private String mParams = null;

  @JsonProperty("messageParameters")
  private String messageParameters = null;

  @JsonProperty("user_lock")
  private OffsetDateTime userLock = null;

  @JsonProperty("actionListTotalRowNumber")
  private Integer actionListTotalRowNumber = null;

  public HeaderResponse returnCode(Integer returnCode) {
    this.returnCode = returnCode;
    return this;
  }

  /**
   * Get returnCode
   * @return returnCode
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getReturnCode() {
    return returnCode;
  }

  public void setReturnCode(Integer returnCode) {
    this.returnCode = returnCode;
  }

  public HeaderResponse coreEventTimestamp(OffsetDateTime coreEventTimestamp) {
    this.coreEventTimestamp = coreEventTimestamp;
    return this;
  }

  /**
   * Get coreEventTimestamp
   * @return coreEventTimestamp
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getCoreEventTimestamp() {
    return coreEventTimestamp;
  }

  public void setCoreEventTimestamp(OffsetDateTime coreEventTimestamp) {
    this.coreEventTimestamp = coreEventTimestamp;
  }

  public HeaderResponse messageCode(String messageCode) {
    this.messageCode = messageCode;
    return this;
  }

  /**
   * Get messageCode
   * @return messageCode
  **/
  @ApiModelProperty(value = "")

@Size(max=32) 
  public String getMessageCode() {
    return messageCode;
  }

  public void setMessageCode(String messageCode) {
    this.messageCode = messageCode;
  }

  public HeaderResponse messageText(String messageText) {
    this.messageText = messageText;
    return this;
  }

  /**
   * Get messageText
   * @return messageText
  **/
  @ApiModelProperty(value = "")

@Size(max=4096) 
  public String getMessageText() {
    return messageText;
  }

  public void setMessageText(String messageText) {
    this.messageText = messageText;
  }

  public HeaderResponse mParams(String mParams) {
    this.mParams = mParams;
    return this;
  }

  /**
   * Get mParams
   * @return mParams
  **/
  @ApiModelProperty(value = "")

@Size(max=128) 
  public String getMParams() {
    return mParams;
  }

  public void setMParams(String mParams) {
    this.mParams = mParams;
  }

  public HeaderResponse messageParameters(String messageParameters) {
    this.messageParameters = messageParameters;
    return this;
  }

  /**
   * Get messageParameters
   * @return messageParameters
  **/
  @ApiModelProperty(value = "")

@Size(max=128) 
  public String getMessageParameters() {
    return messageParameters;
  }

  public void setMessageParameters(String messageParameters) {
    this.messageParameters = messageParameters;
  }

  public HeaderResponse userLock(OffsetDateTime userLock) {
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

  public HeaderResponse actionListTotalRowNumber(Integer actionListTotalRowNumber) {
    this.actionListTotalRowNumber = actionListTotalRowNumber;
    return this;
  }

  /**
   * Get actionListTotalRowNumber
   * @return actionListTotalRowNumber
  **/
  @ApiModelProperty(value = "")


  public Integer getActionListTotalRowNumber() {
    return actionListTotalRowNumber;
  }

  public void setActionListTotalRowNumber(Integer actionListTotalRowNumber) {
    this.actionListTotalRowNumber = actionListTotalRowNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeaderResponse headerResponse = (HeaderResponse) o;
    return Objects.equals(this.returnCode, headerResponse.returnCode) &&
        Objects.equals(this.coreEventTimestamp, headerResponse.coreEventTimestamp) &&
        Objects.equals(this.messageCode, headerResponse.messageCode) &&
        Objects.equals(this.messageText, headerResponse.messageText) &&
        Objects.equals(this.mParams, headerResponse.mParams) &&
        Objects.equals(this.messageParameters, headerResponse.messageParameters) &&
        Objects.equals(this.userLock, headerResponse.userLock) &&
        Objects.equals(this.actionListTotalRowNumber, headerResponse.actionListTotalRowNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnCode, coreEventTimestamp, messageCode, messageText, mParams, messageParameters, userLock, actionListTotalRowNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeaderResponse {\n");
    
    sb.append("    returnCode: ").append(toIndentedString(returnCode)).append("\n");
    sb.append("    coreEventTimestamp: ").append(toIndentedString(coreEventTimestamp)).append("\n");
    sb.append("    messageCode: ").append(toIndentedString(messageCode)).append("\n");
    sb.append("    messageText: ").append(toIndentedString(messageText)).append("\n");
    sb.append("    mParams: ").append(toIndentedString(mParams)).append("\n");
    sb.append("    messageParameters: ").append(toIndentedString(messageParameters)).append("\n");
    sb.append("    userLock: ").append(toIndentedString(userLock)).append("\n");
    sb.append("    actionListTotalRowNumber: ").append(toIndentedString(actionListTotalRowNumber)).append("\n");
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


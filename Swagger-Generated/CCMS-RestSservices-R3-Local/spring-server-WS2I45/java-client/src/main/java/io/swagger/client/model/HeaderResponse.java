/*
 * WS2I45
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2019-10-23 16:18:44.785
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * HeaderResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-08T15:22:33.923Z")
public class HeaderResponse {
  @SerializedName("Return_Code")
  private Integer returnCode = null;

  @SerializedName("coreEventTimestamp")
  private OffsetDateTime coreEventTimestamp = null;

  @SerializedName("messageCode")
  private String messageCode = null;

  @SerializedName("messageText")
  private String messageText = null;

  @SerializedName("mParams")
  private String mParams = null;

  @SerializedName("messageParameters")
  private String messageParameters = null;

  @SerializedName("user_lock")
  private OffsetDateTime userLock = null;

  @SerializedName("actionListTotalRowNumber")
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


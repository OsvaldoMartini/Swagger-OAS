package io.swagger.model;

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
 * ResponseInteroperabilityPropertyBlock
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-13T10:34:52.354Z")

public class ResponseInteroperabilityPropertyBlock   {
  @JsonProperty("uniqueResponseReference")
  private String uniqueResponseReference = null;

  @JsonProperty("uniqueRequestReference")
  private String uniqueRequestReference = null;

  @JsonProperty("requestorRequestReference")
  private String requestorRequestReference = null;

  @JsonProperty("responsorResponseReference")
  private String responsorResponseReference = null;

  @JsonProperty("responsorApplicationName")
  private String responsorApplicationName = null;

  @JsonProperty("responsorComponentName")
  private String responsorComponentName = null;

  @JsonProperty("responsorServiceName")
  private String responsorServiceName = null;

  @JsonProperty("responseTimestamp")
  private OffsetDateTime responseTimestamp = null;

  @JsonProperty("responseTimezone")
  private String responseTimezone = null;

  @JsonProperty("responseTimezoneOffset")
  private String responseTimezoneOffset = null;

  @JsonProperty("responsorOrganization")
  private String responsorOrganization = null;

  @JsonProperty("responsorCompany")
  private String responsorCompany = null;

  @JsonProperty("responsorSubsidiary")
  private String responsorSubsidiary = null;

  @JsonProperty("responsorOrganizationalUnit")
  private String responsorOrganizationalUnit = null;

  @JsonProperty("responsorIP")
  private String responsorIP = null;

  @JsonProperty("responseResult")
  private Integer responseResult = null;

  @JsonProperty("responseHTTPResult")
  private Integer responseHTTPResult = null;

  @JsonProperty("responseMessage")
  private String responseMessage = null;

  @JsonProperty("responseResultAdditionalData")
  private String responseResultAdditionalData = null;

  public ResponseInteroperabilityPropertyBlock uniqueResponseReference(String uniqueResponseReference) {
    this.uniqueResponseReference = uniqueResponseReference;
    return this;
  }

  /**
   * Get uniqueResponseReference
   * @return uniqueResponseReference
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=64) 
  public String getUniqueResponseReference() {
    return uniqueResponseReference;
  }

  public void setUniqueResponseReference(String uniqueResponseReference) {
    this.uniqueResponseReference = uniqueResponseReference;
  }

  public ResponseInteroperabilityPropertyBlock uniqueRequestReference(String uniqueRequestReference) {
    this.uniqueRequestReference = uniqueRequestReference;
    return this;
  }

  /**
   * Get uniqueRequestReference
   * @return uniqueRequestReference
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=64) 
  public String getUniqueRequestReference() {
    return uniqueRequestReference;
  }

  public void setUniqueRequestReference(String uniqueRequestReference) {
    this.uniqueRequestReference = uniqueRequestReference;
  }

  public ResponseInteroperabilityPropertyBlock requestorRequestReference(String requestorRequestReference) {
    this.requestorRequestReference = requestorRequestReference;
    return this;
  }

  /**
   * Get requestorRequestReference
   * @return requestorRequestReference
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=64) 
  public String getRequestorRequestReference() {
    return requestorRequestReference;
  }

  public void setRequestorRequestReference(String requestorRequestReference) {
    this.requestorRequestReference = requestorRequestReference;
  }

  public ResponseInteroperabilityPropertyBlock responsorResponseReference(String responsorResponseReference) {
    this.responsorResponseReference = responsorResponseReference;
    return this;
  }

  /**
   * Get responsorResponseReference
   * @return responsorResponseReference
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=64) 
  public String getResponsorResponseReference() {
    return responsorResponseReference;
  }

  public void setResponsorResponseReference(String responsorResponseReference) {
    this.responsorResponseReference = responsorResponseReference;
  }

  public ResponseInteroperabilityPropertyBlock responsorApplicationName(String responsorApplicationName) {
    this.responsorApplicationName = responsorApplicationName;
    return this;
  }

  /**
   * Get responsorApplicationName
   * @return responsorApplicationName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=64) 
  public String getResponsorApplicationName() {
    return responsorApplicationName;
  }

  public void setResponsorApplicationName(String responsorApplicationName) {
    this.responsorApplicationName = responsorApplicationName;
  }

  public ResponseInteroperabilityPropertyBlock responsorComponentName(String responsorComponentName) {
    this.responsorComponentName = responsorComponentName;
    return this;
  }

  /**
   * Get responsorComponentName
   * @return responsorComponentName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=64) 
  public String getResponsorComponentName() {
    return responsorComponentName;
  }

  public void setResponsorComponentName(String responsorComponentName) {
    this.responsorComponentName = responsorComponentName;
  }

  public ResponseInteroperabilityPropertyBlock responsorServiceName(String responsorServiceName) {
    this.responsorServiceName = responsorServiceName;
    return this;
  }

  /**
   * Get responsorServiceName
   * @return responsorServiceName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=64) 
  public String getResponsorServiceName() {
    return responsorServiceName;
  }

  public void setResponsorServiceName(String responsorServiceName) {
    this.responsorServiceName = responsorServiceName;
  }

  public ResponseInteroperabilityPropertyBlock responseTimestamp(OffsetDateTime responseTimestamp) {
    this.responseTimestamp = responseTimestamp;
    return this;
  }

  /**
   * Get responseTimestamp
   * @return responseTimestamp
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getResponseTimestamp() {
    return responseTimestamp;
  }

  public void setResponseTimestamp(OffsetDateTime responseTimestamp) {
    this.responseTimestamp = responseTimestamp;
  }

  public ResponseInteroperabilityPropertyBlock responseTimezone(String responseTimezone) {
    this.responseTimezone = responseTimezone;
    return this;
  }

  /**
   * Get responseTimezone
   * @return responseTimezone
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=8) 
  public String getResponseTimezone() {
    return responseTimezone;
  }

  public void setResponseTimezone(String responseTimezone) {
    this.responseTimezone = responseTimezone;
  }

  public ResponseInteroperabilityPropertyBlock responseTimezoneOffset(String responseTimezoneOffset) {
    this.responseTimezoneOffset = responseTimezoneOffset;
    return this;
  }

  /**
   * Get responseTimezoneOffset
   * @return responseTimezoneOffset
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=6) 
  public String getResponseTimezoneOffset() {
    return responseTimezoneOffset;
  }

  public void setResponseTimezoneOffset(String responseTimezoneOffset) {
    this.responseTimezoneOffset = responseTimezoneOffset;
  }

  public ResponseInteroperabilityPropertyBlock responsorOrganization(String responsorOrganization) {
    this.responsorOrganization = responsorOrganization;
    return this;
  }

  /**
   * Get responsorOrganization
   * @return responsorOrganization
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=32) 
  public String getResponsorOrganization() {
    return responsorOrganization;
  }

  public void setResponsorOrganization(String responsorOrganization) {
    this.responsorOrganization = responsorOrganization;
  }

  public ResponseInteroperabilityPropertyBlock responsorCompany(String responsorCompany) {
    this.responsorCompany = responsorCompany;
    return this;
  }

  /**
   * Get responsorCompany
   * @return responsorCompany
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=32) 
  public String getResponsorCompany() {
    return responsorCompany;
  }

  public void setResponsorCompany(String responsorCompany) {
    this.responsorCompany = responsorCompany;
  }

  public ResponseInteroperabilityPropertyBlock responsorSubsidiary(String responsorSubsidiary) {
    this.responsorSubsidiary = responsorSubsidiary;
    return this;
  }

  /**
   * Get responsorSubsidiary
   * @return responsorSubsidiary
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=32) 
  public String getResponsorSubsidiary() {
    return responsorSubsidiary;
  }

  public void setResponsorSubsidiary(String responsorSubsidiary) {
    this.responsorSubsidiary = responsorSubsidiary;
  }

  public ResponseInteroperabilityPropertyBlock responsorOrganizationalUnit(String responsorOrganizationalUnit) {
    this.responsorOrganizationalUnit = responsorOrganizationalUnit;
    return this;
  }

  /**
   * Get responsorOrganizationalUnit
   * @return responsorOrganizationalUnit
  **/
  @ApiModelProperty(value = "")

@Size(max=64) 
  public String getResponsorOrganizationalUnit() {
    return responsorOrganizationalUnit;
  }

  public void setResponsorOrganizationalUnit(String responsorOrganizationalUnit) {
    this.responsorOrganizationalUnit = responsorOrganizationalUnit;
  }

  public ResponseInteroperabilityPropertyBlock responsorIP(String responsorIP) {
    this.responsorIP = responsorIP;
    return this;
  }

  /**
   * Get responsorIP
   * @return responsorIP
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=46) 
  public String getResponsorIP() {
    return responsorIP;
  }

  public void setResponsorIP(String responsorIP) {
    this.responsorIP = responsorIP;
  }

  public ResponseInteroperabilityPropertyBlock responseResult(Integer responseResult) {
    this.responseResult = responseResult;
    return this;
  }

  /**
   * Get responseResult
   * @return responseResult
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getResponseResult() {
    return responseResult;
  }

  public void setResponseResult(Integer responseResult) {
    this.responseResult = responseResult;
  }

  public ResponseInteroperabilityPropertyBlock responseHTTPResult(Integer responseHTTPResult) {
    this.responseHTTPResult = responseHTTPResult;
    return this;
  }

  /**
   * Get responseHTTPResult
   * @return responseHTTPResult
  **/
  @ApiModelProperty(value = "")


  public Integer getResponseHTTPResult() {
    return responseHTTPResult;
  }

  public void setResponseHTTPResult(Integer responseHTTPResult) {
    this.responseHTTPResult = responseHTTPResult;
  }

  public ResponseInteroperabilityPropertyBlock responseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
    return this;
  }

  /**
   * Get responseMessage
   * @return responseMessage
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=4096) 
  public String getResponseMessage() {
    return responseMessage;
  }

  public void setResponseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
  }

  public ResponseInteroperabilityPropertyBlock responseResultAdditionalData(String responseResultAdditionalData) {
    this.responseResultAdditionalData = responseResultAdditionalData;
    return this;
  }

  /**
   * Get responseResultAdditionalData
   * @return responseResultAdditionalData
  **/
  @ApiModelProperty(value = "")

@Size(max=4096) 
  public String getResponseResultAdditionalData() {
    return responseResultAdditionalData;
  }

  public void setResponseResultAdditionalData(String responseResultAdditionalData) {
    this.responseResultAdditionalData = responseResultAdditionalData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseInteroperabilityPropertyBlock responseInteroperabilityPropertyBlock = (ResponseInteroperabilityPropertyBlock) o;
    return Objects.equals(this.uniqueResponseReference, responseInteroperabilityPropertyBlock.uniqueResponseReference) &&
        Objects.equals(this.uniqueRequestReference, responseInteroperabilityPropertyBlock.uniqueRequestReference) &&
        Objects.equals(this.requestorRequestReference, responseInteroperabilityPropertyBlock.requestorRequestReference) &&
        Objects.equals(this.responsorResponseReference, responseInteroperabilityPropertyBlock.responsorResponseReference) &&
        Objects.equals(this.responsorApplicationName, responseInteroperabilityPropertyBlock.responsorApplicationName) &&
        Objects.equals(this.responsorComponentName, responseInteroperabilityPropertyBlock.responsorComponentName) &&
        Objects.equals(this.responsorServiceName, responseInteroperabilityPropertyBlock.responsorServiceName) &&
        Objects.equals(this.responseTimestamp, responseInteroperabilityPropertyBlock.responseTimestamp) &&
        Objects.equals(this.responseTimezone, responseInteroperabilityPropertyBlock.responseTimezone) &&
        Objects.equals(this.responseTimezoneOffset, responseInteroperabilityPropertyBlock.responseTimezoneOffset) &&
        Objects.equals(this.responsorOrganization, responseInteroperabilityPropertyBlock.responsorOrganization) &&
        Objects.equals(this.responsorCompany, responseInteroperabilityPropertyBlock.responsorCompany) &&
        Objects.equals(this.responsorSubsidiary, responseInteroperabilityPropertyBlock.responsorSubsidiary) &&
        Objects.equals(this.responsorOrganizationalUnit, responseInteroperabilityPropertyBlock.responsorOrganizationalUnit) &&
        Objects.equals(this.responsorIP, responseInteroperabilityPropertyBlock.responsorIP) &&
        Objects.equals(this.responseResult, responseInteroperabilityPropertyBlock.responseResult) &&
        Objects.equals(this.responseHTTPResult, responseInteroperabilityPropertyBlock.responseHTTPResult) &&
        Objects.equals(this.responseMessage, responseInteroperabilityPropertyBlock.responseMessage) &&
        Objects.equals(this.responseResultAdditionalData, responseInteroperabilityPropertyBlock.responseResultAdditionalData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uniqueResponseReference, uniqueRequestReference, requestorRequestReference, responsorResponseReference, responsorApplicationName, responsorComponentName, responsorServiceName, responseTimestamp, responseTimezone, responseTimezoneOffset, responsorOrganization, responsorCompany, responsorSubsidiary, responsorOrganizationalUnit, responsorIP, responseResult, responseHTTPResult, responseMessage, responseResultAdditionalData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseInteroperabilityPropertyBlock {\n");
    
    sb.append("    uniqueResponseReference: ").append(toIndentedString(uniqueResponseReference)).append("\n");
    sb.append("    uniqueRequestReference: ").append(toIndentedString(uniqueRequestReference)).append("\n");
    sb.append("    requestorRequestReference: ").append(toIndentedString(requestorRequestReference)).append("\n");
    sb.append("    responsorResponseReference: ").append(toIndentedString(responsorResponseReference)).append("\n");
    sb.append("    responsorApplicationName: ").append(toIndentedString(responsorApplicationName)).append("\n");
    sb.append("    responsorComponentName: ").append(toIndentedString(responsorComponentName)).append("\n");
    sb.append("    responsorServiceName: ").append(toIndentedString(responsorServiceName)).append("\n");
    sb.append("    responseTimestamp: ").append(toIndentedString(responseTimestamp)).append("\n");
    sb.append("    responseTimezone: ").append(toIndentedString(responseTimezone)).append("\n");
    sb.append("    responseTimezoneOffset: ").append(toIndentedString(responseTimezoneOffset)).append("\n");
    sb.append("    responsorOrganization: ").append(toIndentedString(responsorOrganization)).append("\n");
    sb.append("    responsorCompany: ").append(toIndentedString(responsorCompany)).append("\n");
    sb.append("    responsorSubsidiary: ").append(toIndentedString(responsorSubsidiary)).append("\n");
    sb.append("    responsorOrganizationalUnit: ").append(toIndentedString(responsorOrganizationalUnit)).append("\n");
    sb.append("    responsorIP: ").append(toIndentedString(responsorIP)).append("\n");
    sb.append("    responseResult: ").append(toIndentedString(responseResult)).append("\n");
    sb.append("    responseHTTPResult: ").append(toIndentedString(responseHTTPResult)).append("\n");
    sb.append("    responseMessage: ").append(toIndentedString(responseMessage)).append("\n");
    sb.append("    responseResultAdditionalData: ").append(toIndentedString(responseResultAdditionalData)).append("\n");
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


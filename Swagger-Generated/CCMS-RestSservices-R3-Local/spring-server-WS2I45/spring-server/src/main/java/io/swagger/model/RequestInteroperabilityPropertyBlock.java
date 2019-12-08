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
 * RequestInteroperabilityPropertyBlock
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-07T13:56:37.457Z")

public class RequestInteroperabilityPropertyBlock   {
  @JsonProperty("uniqueRequestReference")
  private String uniqueRequestReference = null;

  @JsonProperty("requestorRequestReference")
  private String requestorRequestReference = null;

  @JsonProperty("requestorApplicationName")
  private String requestorApplicationName = null;

  @JsonProperty("requestorComponentName")
  private String requestorComponentName = null;

  @JsonProperty("requestorServiceName")
  private String requestorServiceName = null;

  @JsonProperty("requestTimestamp")
  private OffsetDateTime requestTimestamp = null;

  @JsonProperty("requestTimezone")
  private String requestTimezone = null;

  @JsonProperty("requestTimezoneOffset")
  private String requestTimezoneOffset = null;

  @JsonProperty("requestorOrganization")
  private String requestorOrganization = null;

  @JsonProperty("requestorCompany")
  private String requestorCompany = null;

  @JsonProperty("requestorSubsidiary")
  private String requestorSubsidiary = null;

  @JsonProperty("requestorOrganizationalUnit")
  private String requestorOrganizationalUnit = null;

  @JsonProperty("requestorAuthenticationUser")
  private String requestorAuthenticationUser = null;

  @JsonProperty("requestorAuthorizationUser")
  private String requestorAuthorizationUser = null;

  @JsonProperty("requestorIP")
  private String requestorIP = null;

  @JsonProperty("requestChannel")
  private String requestChannel = null;

  @JsonProperty("responseChannel")
  private String responseChannel = null;

  public RequestInteroperabilityPropertyBlock uniqueRequestReference(String uniqueRequestReference) {
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

  public RequestInteroperabilityPropertyBlock requestorRequestReference(String requestorRequestReference) {
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

  public RequestInteroperabilityPropertyBlock requestorApplicationName(String requestorApplicationName) {
    this.requestorApplicationName = requestorApplicationName;
    return this;
  }

  /**
   * Get requestorApplicationName
   * @return requestorApplicationName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=64) 
  public String getRequestorApplicationName() {
    return requestorApplicationName;
  }

  public void setRequestorApplicationName(String requestorApplicationName) {
    this.requestorApplicationName = requestorApplicationName;
  }

  public RequestInteroperabilityPropertyBlock requestorComponentName(String requestorComponentName) {
    this.requestorComponentName = requestorComponentName;
    return this;
  }

  /**
   * Get requestorComponentName
   * @return requestorComponentName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=64) 
  public String getRequestorComponentName() {
    return requestorComponentName;
  }

  public void setRequestorComponentName(String requestorComponentName) {
    this.requestorComponentName = requestorComponentName;
  }

  public RequestInteroperabilityPropertyBlock requestorServiceName(String requestorServiceName) {
    this.requestorServiceName = requestorServiceName;
    return this;
  }

  /**
   * Get requestorServiceName
   * @return requestorServiceName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=64) 
  public String getRequestorServiceName() {
    return requestorServiceName;
  }

  public void setRequestorServiceName(String requestorServiceName) {
    this.requestorServiceName = requestorServiceName;
  }

  public RequestInteroperabilityPropertyBlock requestTimestamp(OffsetDateTime requestTimestamp) {
    this.requestTimestamp = requestTimestamp;
    return this;
  }

  /**
   * Get requestTimestamp
   * @return requestTimestamp
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getRequestTimestamp() {
    return requestTimestamp;
  }

  public void setRequestTimestamp(OffsetDateTime requestTimestamp) {
    this.requestTimestamp = requestTimestamp;
  }

  public RequestInteroperabilityPropertyBlock requestTimezone(String requestTimezone) {
    this.requestTimezone = requestTimezone;
    return this;
  }

  /**
   * Get requestTimezone
   * @return requestTimezone
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=8) 
  public String getRequestTimezone() {
    return requestTimezone;
  }

  public void setRequestTimezone(String requestTimezone) {
    this.requestTimezone = requestTimezone;
  }

  public RequestInteroperabilityPropertyBlock requestTimezoneOffset(String requestTimezoneOffset) {
    this.requestTimezoneOffset = requestTimezoneOffset;
    return this;
  }

  /**
   * Get requestTimezoneOffset
   * @return requestTimezoneOffset
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=6) 
  public String getRequestTimezoneOffset() {
    return requestTimezoneOffset;
  }

  public void setRequestTimezoneOffset(String requestTimezoneOffset) {
    this.requestTimezoneOffset = requestTimezoneOffset;
  }

  public RequestInteroperabilityPropertyBlock requestorOrganization(String requestorOrganization) {
    this.requestorOrganization = requestorOrganization;
    return this;
  }

  /**
   * Get requestorOrganization
   * @return requestorOrganization
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=32) 
  public String getRequestorOrganization() {
    return requestorOrganization;
  }

  public void setRequestorOrganization(String requestorOrganization) {
    this.requestorOrganization = requestorOrganization;
  }

  public RequestInteroperabilityPropertyBlock requestorCompany(String requestorCompany) {
    this.requestorCompany = requestorCompany;
    return this;
  }

  /**
   * Get requestorCompany
   * @return requestorCompany
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=32) 
  public String getRequestorCompany() {
    return requestorCompany;
  }

  public void setRequestorCompany(String requestorCompany) {
    this.requestorCompany = requestorCompany;
  }

  public RequestInteroperabilityPropertyBlock requestorSubsidiary(String requestorSubsidiary) {
    this.requestorSubsidiary = requestorSubsidiary;
    return this;
  }

  /**
   * Get requestorSubsidiary
   * @return requestorSubsidiary
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=32) 
  public String getRequestorSubsidiary() {
    return requestorSubsidiary;
  }

  public void setRequestorSubsidiary(String requestorSubsidiary) {
    this.requestorSubsidiary = requestorSubsidiary;
  }

  public RequestInteroperabilityPropertyBlock requestorOrganizationalUnit(String requestorOrganizationalUnit) {
    this.requestorOrganizationalUnit = requestorOrganizationalUnit;
    return this;
  }

  /**
   * Get requestorOrganizationalUnit
   * @return requestorOrganizationalUnit
  **/
  @ApiModelProperty(value = "")

@Size(max=64) 
  public String getRequestorOrganizationalUnit() {
    return requestorOrganizationalUnit;
  }

  public void setRequestorOrganizationalUnit(String requestorOrganizationalUnit) {
    this.requestorOrganizationalUnit = requestorOrganizationalUnit;
  }

  public RequestInteroperabilityPropertyBlock requestorAuthenticationUser(String requestorAuthenticationUser) {
    this.requestorAuthenticationUser = requestorAuthenticationUser;
    return this;
  }

  /**
   * Get requestorAuthenticationUser
   * @return requestorAuthenticationUser
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=64) 
  public String getRequestorAuthenticationUser() {
    return requestorAuthenticationUser;
  }

  public void setRequestorAuthenticationUser(String requestorAuthenticationUser) {
    this.requestorAuthenticationUser = requestorAuthenticationUser;
  }

  public RequestInteroperabilityPropertyBlock requestorAuthorizationUser(String requestorAuthorizationUser) {
    this.requestorAuthorizationUser = requestorAuthorizationUser;
    return this;
  }

  /**
   * Get requestorAuthorizationUser
   * @return requestorAuthorizationUser
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=64) 
  public String getRequestorAuthorizationUser() {
    return requestorAuthorizationUser;
  }

  public void setRequestorAuthorizationUser(String requestorAuthorizationUser) {
    this.requestorAuthorizationUser = requestorAuthorizationUser;
  }

  public RequestInteroperabilityPropertyBlock requestorIP(String requestorIP) {
    this.requestorIP = requestorIP;
    return this;
  }

  /**
   * Get requestorIP
   * @return requestorIP
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=46) 
  public String getRequestorIP() {
    return requestorIP;
  }

  public void setRequestorIP(String requestorIP) {
    this.requestorIP = requestorIP;
  }

  public RequestInteroperabilityPropertyBlock requestChannel(String requestChannel) {
    this.requestChannel = requestChannel;
    return this;
  }

  /**
   * Get requestChannel
   * @return requestChannel
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=32) 
  public String getRequestChannel() {
    return requestChannel;
  }

  public void setRequestChannel(String requestChannel) {
    this.requestChannel = requestChannel;
  }

  public RequestInteroperabilityPropertyBlock responseChannel(String responseChannel) {
    this.responseChannel = responseChannel;
    return this;
  }

  /**
   * Get responseChannel
   * @return responseChannel
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=32) 
  public String getResponseChannel() {
    return responseChannel;
  }

  public void setResponseChannel(String responseChannel) {
    this.responseChannel = responseChannel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestInteroperabilityPropertyBlock requestInteroperabilityPropertyBlock = (RequestInteroperabilityPropertyBlock) o;
    return Objects.equals(this.uniqueRequestReference, requestInteroperabilityPropertyBlock.uniqueRequestReference) &&
        Objects.equals(this.requestorRequestReference, requestInteroperabilityPropertyBlock.requestorRequestReference) &&
        Objects.equals(this.requestorApplicationName, requestInteroperabilityPropertyBlock.requestorApplicationName) &&
        Objects.equals(this.requestorComponentName, requestInteroperabilityPropertyBlock.requestorComponentName) &&
        Objects.equals(this.requestorServiceName, requestInteroperabilityPropertyBlock.requestorServiceName) &&
        Objects.equals(this.requestTimestamp, requestInteroperabilityPropertyBlock.requestTimestamp) &&
        Objects.equals(this.requestTimezone, requestInteroperabilityPropertyBlock.requestTimezone) &&
        Objects.equals(this.requestTimezoneOffset, requestInteroperabilityPropertyBlock.requestTimezoneOffset) &&
        Objects.equals(this.requestorOrganization, requestInteroperabilityPropertyBlock.requestorOrganization) &&
        Objects.equals(this.requestorCompany, requestInteroperabilityPropertyBlock.requestorCompany) &&
        Objects.equals(this.requestorSubsidiary, requestInteroperabilityPropertyBlock.requestorSubsidiary) &&
        Objects.equals(this.requestorOrganizationalUnit, requestInteroperabilityPropertyBlock.requestorOrganizationalUnit) &&
        Objects.equals(this.requestorAuthenticationUser, requestInteroperabilityPropertyBlock.requestorAuthenticationUser) &&
        Objects.equals(this.requestorAuthorizationUser, requestInteroperabilityPropertyBlock.requestorAuthorizationUser) &&
        Objects.equals(this.requestorIP, requestInteroperabilityPropertyBlock.requestorIP) &&
        Objects.equals(this.requestChannel, requestInteroperabilityPropertyBlock.requestChannel) &&
        Objects.equals(this.responseChannel, requestInteroperabilityPropertyBlock.responseChannel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uniqueRequestReference, requestorRequestReference, requestorApplicationName, requestorComponentName, requestorServiceName, requestTimestamp, requestTimezone, requestTimezoneOffset, requestorOrganization, requestorCompany, requestorSubsidiary, requestorOrganizationalUnit, requestorAuthenticationUser, requestorAuthorizationUser, requestorIP, requestChannel, responseChannel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestInteroperabilityPropertyBlock {\n");
    
    sb.append("    uniqueRequestReference: ").append(toIndentedString(uniqueRequestReference)).append("\n");
    sb.append("    requestorRequestReference: ").append(toIndentedString(requestorRequestReference)).append("\n");
    sb.append("    requestorApplicationName: ").append(toIndentedString(requestorApplicationName)).append("\n");
    sb.append("    requestorComponentName: ").append(toIndentedString(requestorComponentName)).append("\n");
    sb.append("    requestorServiceName: ").append(toIndentedString(requestorServiceName)).append("\n");
    sb.append("    requestTimestamp: ").append(toIndentedString(requestTimestamp)).append("\n");
    sb.append("    requestTimezone: ").append(toIndentedString(requestTimezone)).append("\n");
    sb.append("    requestTimezoneOffset: ").append(toIndentedString(requestTimezoneOffset)).append("\n");
    sb.append("    requestorOrganization: ").append(toIndentedString(requestorOrganization)).append("\n");
    sb.append("    requestorCompany: ").append(toIndentedString(requestorCompany)).append("\n");
    sb.append("    requestorSubsidiary: ").append(toIndentedString(requestorSubsidiary)).append("\n");
    sb.append("    requestorOrganizationalUnit: ").append(toIndentedString(requestorOrganizationalUnit)).append("\n");
    sb.append("    requestorAuthenticationUser: ").append(toIndentedString(requestorAuthenticationUser)).append("\n");
    sb.append("    requestorAuthorizationUser: ").append(toIndentedString(requestorAuthorizationUser)).append("\n");
    sb.append("    requestorIP: ").append(toIndentedString(requestorIP)).append("\n");
    sb.append("    requestChannel: ").append(toIndentedString(requestChannel)).append("\n");
    sb.append("    responseChannel: ").append(toIndentedString(responseChannel)).append("\n");
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


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
 * HeaderRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-23T12:46:28.874Z")

public class HeaderRequest   {
  @JsonProperty("X-RP-UNIQUE-ID")
  private String X_RP_UNIQUE_ID = null;

  @JsonProperty("X-Client-IP")
  private String xClientIP = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  @JsonProperty("applicationId")
  private String applicationId = null;

  @JsonProperty("systemID")
  private String systemID = null;

  public HeaderRequest X_RP_UNIQUE_ID(String X_RP_UNIQUE_ID) {
    this.X_RP_UNIQUE_ID = X_RP_UNIQUE_ID;
    return this;
  }

  /**
   * Get X_RP_UNIQUE_ID
   * @return X_RP_UNIQUE_ID
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=8) 
  public String getXRPUNIQUEID() {
    return X_RP_UNIQUE_ID;
  }

  public void setXRPUNIQUEID(String X_RP_UNIQUE_ID) {
    this.X_RP_UNIQUE_ID = X_RP_UNIQUE_ID;
  }

  public HeaderRequest xClientIP(String xClientIP) {
    this.xClientIP = xClientIP;
    return this;
  }

  /**
   * Get xClientIP
   * @return xClientIP
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=64) 
  public String getXClientIP() {
    return xClientIP;
  }

  public void setXClientIP(String xClientIP) {
    this.xClientIP = xClientIP;
  }

  public HeaderRequest timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public HeaderRequest applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * Get applicationId
   * @return applicationId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=8) 
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public HeaderRequest systemID(String systemID) {
    this.systemID = systemID;
    return this;
  }

  /**
   * Get systemID
   * @return systemID
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=2) 
  public String getSystemID() {
    return systemID;
  }

  public void setSystemID(String systemID) {
    this.systemID = systemID;
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
    return Objects.equals(this.X_RP_UNIQUE_ID, headerRequest.X_RP_UNIQUE_ID) &&
        Objects.equals(this.xClientIP, headerRequest.xClientIP) &&
        Objects.equals(this.timestamp, headerRequest.timestamp) &&
        Objects.equals(this.applicationId, headerRequest.applicationId) &&
        Objects.equals(this.systemID, headerRequest.systemID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(X_RP_UNIQUE_ID, xClientIP, timestamp, applicationId, systemID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeaderRequest {\n");
    
    sb.append("    X_RP_UNIQUE_ID: ").append(toIndentedString(X_RP_UNIQUE_ID)).append("\n");
    sb.append("    xClientIP: ").append(toIndentedString(xClientIP)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    systemID: ").append(toIndentedString(systemID)).append("\n");
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


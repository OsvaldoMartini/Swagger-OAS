package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HeaderRequest;
import io.swagger.model.RequestInteroperabilityPropertyBlock;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Request Body
 */
@ApiModel(description = "Request Body")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-09T14:22:50.953Z")

public class WSE3554_RequestBody   {
  @JsonProperty("headerRequest")
  private HeaderRequest headerRequest = null;

  @JsonProperty("requestInteroperabilityPropertyBlock")
  private RequestInteroperabilityPropertyBlock requestInteroperabilityPropertyBlock = null;

  @JsonProperty("paramCodeId")
  private String paramCodeId = null;

  @JsonProperty("paramCodeValues")
  private String paramCodeValues = null;

  @JsonProperty("paramTableNameWithAlgorithm")
  private String paramTableNameWithAlgorithm = null;

  public WSE3554_RequestBody headerRequest(HeaderRequest headerRequest) {
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

  public WSE3554_RequestBody requestInteroperabilityPropertyBlock(RequestInteroperabilityPropertyBlock requestInteroperabilityPropertyBlock) {
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

  public WSE3554_RequestBody paramCodeId(String paramCodeId) {
    this.paramCodeId = paramCodeId;
    return this;
  }

  /**
   * Get paramCodeId
   * @return paramCodeId
  **/
  @ApiModelProperty(value = "")

@Size(max=10) 
  public String getParamCodeId() {
    return paramCodeId;
  }

  public void setParamCodeId(String paramCodeId) {
    this.paramCodeId = paramCodeId;
  }

  public WSE3554_RequestBody paramCodeValues(String paramCodeValues) {
    this.paramCodeValues = paramCodeValues;
    return this;
  }

  /**
   * Get paramCodeValues
   * @return paramCodeValues
  **/
  @ApiModelProperty(value = "")

@Size(max=16) 
  public String getParamCodeValues() {
    return paramCodeValues;
  }

  public void setParamCodeValues(String paramCodeValues) {
    this.paramCodeValues = paramCodeValues;
  }

  public WSE3554_RequestBody paramTableNameWithAlgorithm(String paramTableNameWithAlgorithm) {
    this.paramTableNameWithAlgorithm = paramTableNameWithAlgorithm;
    return this;
  }

  /**
   * Get paramTableNameWithAlgorithm
   * @return paramTableNameWithAlgorithm
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=63) 
  public String getParamTableNameWithAlgorithm() {
    return paramTableNameWithAlgorithm;
  }

  public void setParamTableNameWithAlgorithm(String paramTableNameWithAlgorithm) {
    this.paramTableNameWithAlgorithm = paramTableNameWithAlgorithm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WSE3554_RequestBody requestBody = (WSE3554_RequestBody) o;
    return Objects.equals(this.headerRequest, requestBody.headerRequest) &&
        Objects.equals(this.requestInteroperabilityPropertyBlock, requestBody.requestInteroperabilityPropertyBlock) &&
        Objects.equals(this.paramCodeId, requestBody.paramCodeId) &&
        Objects.equals(this.paramCodeValues, requestBody.paramCodeValues) &&
        Objects.equals(this.paramTableNameWithAlgorithm, requestBody.paramTableNameWithAlgorithm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerRequest, requestInteroperabilityPropertyBlock, paramCodeId, paramCodeValues, paramTableNameWithAlgorithm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WSE3554_RequestBody {\n");
    
    sb.append("    headerRequest: ").append(toIndentedString(headerRequest)).append("\n");
    sb.append("    requestInteroperabilityPropertyBlock: ").append(toIndentedString(requestInteroperabilityPropertyBlock)).append("\n");
    sb.append("    paramCodeId: ").append(toIndentedString(paramCodeId)).append("\n");
    sb.append("    paramCodeValues: ").append(toIndentedString(paramCodeValues)).append("\n");
    sb.append("    paramTableNameWithAlgorithm: ").append(toIndentedString(paramTableNameWithAlgorithm)).append("\n");
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


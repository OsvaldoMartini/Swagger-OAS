package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExceptionInteroperabilityPropertyBlock
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-07T13:56:37.457Z")

public class ExceptionInteroperabilityPropertyBlock   {
  @JsonProperty("responseException")
  private Integer responseException = null;

  @JsonProperty("responseExceptionMessage")
  private String responseExceptionMessage = null;

  @JsonProperty("responseExceptionAdditionalData")
  private String responseExceptionAdditionalData = null;

  public ExceptionInteroperabilityPropertyBlock responseException(Integer responseException) {
    this.responseException = responseException;
    return this;
  }

  /**
   * Get responseException
   * @return responseException
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getResponseException() {
    return responseException;
  }

  public void setResponseException(Integer responseException) {
    this.responseException = responseException;
  }

  public ExceptionInteroperabilityPropertyBlock responseExceptionMessage(String responseExceptionMessage) {
    this.responseExceptionMessage = responseExceptionMessage;
    return this;
  }

  /**
   * Get responseExceptionMessage
   * @return responseExceptionMessage
  **/
  @ApiModelProperty(value = "")

@Size(max=4096) 
  public String getResponseExceptionMessage() {
    return responseExceptionMessage;
  }

  public void setResponseExceptionMessage(String responseExceptionMessage) {
    this.responseExceptionMessage = responseExceptionMessage;
  }

  public ExceptionInteroperabilityPropertyBlock responseExceptionAdditionalData(String responseExceptionAdditionalData) {
    this.responseExceptionAdditionalData = responseExceptionAdditionalData;
    return this;
  }

  /**
   * Get responseExceptionAdditionalData
   * @return responseExceptionAdditionalData
  **/
  @ApiModelProperty(value = "")

@Size(max=4096) 
  public String getResponseExceptionAdditionalData() {
    return responseExceptionAdditionalData;
  }

  public void setResponseExceptionAdditionalData(String responseExceptionAdditionalData) {
    this.responseExceptionAdditionalData = responseExceptionAdditionalData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExceptionInteroperabilityPropertyBlock exceptionInteroperabilityPropertyBlock = (ExceptionInteroperabilityPropertyBlock) o;
    return Objects.equals(this.responseException, exceptionInteroperabilityPropertyBlock.responseException) &&
        Objects.equals(this.responseExceptionMessage, exceptionInteroperabilityPropertyBlock.responseExceptionMessage) &&
        Objects.equals(this.responseExceptionAdditionalData, exceptionInteroperabilityPropertyBlock.responseExceptionAdditionalData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseException, responseExceptionMessage, responseExceptionAdditionalData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExceptionInteroperabilityPropertyBlock {\n");
    
    sb.append("    responseException: ").append(toIndentedString(responseException)).append("\n");
    sb.append("    responseExceptionMessage: ").append(toIndentedString(responseExceptionMessage)).append("\n");
    sb.append("    responseExceptionAdditionalData: ").append(toIndentedString(responseExceptionAdditionalData)).append("\n");
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


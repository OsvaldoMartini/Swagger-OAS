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
 * The error occurred in the servies execution
 */
@ApiModel(description = "The error occurred in the servies execution")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-23T12:46:28.874Z")

public class Error   {
  @JsonProperty("errorCode")
  private String errorCode = null;

  @JsonProperty("severity")
  private String severity = null;

  @JsonProperty("shortDescription")
  private String shortDescription = null;

  @JsonProperty("longDescription")
  private String longDescription = null;

  @JsonProperty("errorAdditionalInfo")
  private String errorAdditionalInfo = null;

  @JsonProperty("fieldName")
  private String fieldName = null;

  public Error errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(min=0,max=32) 
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public Error severity(String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Get severity
   * @return severity
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(min=0,max=3) 
  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }

  public Error shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

  /**
   * Get shortDescription
   * @return shortDescription
  **/
  @ApiModelProperty(value = "")

@Size(min=0,max=50) 
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public Error longDescription(String longDescription) {
    this.longDescription = longDescription;
    return this;
  }

  /**
   * Get longDescription
   * @return longDescription
  **/
  @ApiModelProperty(value = "")

@Size(min=0,max=1) 
  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  public Error errorAdditionalInfo(String errorAdditionalInfo) {
    this.errorAdditionalInfo = errorAdditionalInfo;
    return this;
  }

  /**
   * Get errorAdditionalInfo
   * @return errorAdditionalInfo
  **/
  @ApiModelProperty(value = "")

@Size(min=0,max=100) 
  public String getErrorAdditionalInfo() {
    return errorAdditionalInfo;
  }

  public void setErrorAdditionalInfo(String errorAdditionalInfo) {
    this.errorAdditionalInfo = errorAdditionalInfo;
  }

  public Error fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * Get fieldName
   * @return fieldName
  **/
  @ApiModelProperty(value = "")

@Size(min=0,max=200) 
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.errorCode, error.errorCode) &&
        Objects.equals(this.severity, error.severity) &&
        Objects.equals(this.shortDescription, error.shortDescription) &&
        Objects.equals(this.longDescription, error.longDescription) &&
        Objects.equals(this.errorAdditionalInfo, error.errorAdditionalInfo) &&
        Objects.equals(this.fieldName, error.fieldName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, severity, shortDescription, longDescription, errorAdditionalInfo, fieldName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
    sb.append("    errorAdditionalInfo: ").append(toIndentedString(errorAdditionalInfo)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
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


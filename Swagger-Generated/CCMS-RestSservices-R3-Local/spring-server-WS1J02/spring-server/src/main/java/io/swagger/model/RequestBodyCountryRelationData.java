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
 * RequestBodyCountryRelationData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-13T10:34:52.354Z")

public class RequestBodyCountryRelationData   {
  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("foreignTaxCode")
  private String foreignTaxCode = null;

  @JsonProperty("countryRelationType")
  private String countryRelationType = null;

  @JsonProperty("actionFlag")
  private String actionFlag = null;

  public RequestBodyCountryRelationData countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Get countryCode
   * @return countryCode
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=3) 
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public RequestBodyCountryRelationData foreignTaxCode(String foreignTaxCode) {
    this.foreignTaxCode = foreignTaxCode;
    return this;
  }

  /**
   * Get foreignTaxCode
   * @return foreignTaxCode
  **/
  @ApiModelProperty(value = "")

@Size(max=32) 
  public String getForeignTaxCode() {
    return foreignTaxCode;
  }

  public void setForeignTaxCode(String foreignTaxCode) {
    this.foreignTaxCode = foreignTaxCode;
  }

  public RequestBodyCountryRelationData countryRelationType(String countryRelationType) {
    this.countryRelationType = countryRelationType;
    return this;
  }

  /**
   * Get countryRelationType
   * @return countryRelationType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=1) 
  public String getCountryRelationType() {
    return countryRelationType;
  }

  public void setCountryRelationType(String countryRelationType) {
    this.countryRelationType = countryRelationType;
  }

  public RequestBodyCountryRelationData actionFlag(String actionFlag) {
    this.actionFlag = actionFlag;
    return this;
  }

  /**
   * Get actionFlag
   * @return actionFlag
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=1) 
  public String getActionFlag() {
    return actionFlag;
  }

  public void setActionFlag(String actionFlag) {
    this.actionFlag = actionFlag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestBodyCountryRelationData requestBodyCountryRelationData = (RequestBodyCountryRelationData) o;
    return Objects.equals(this.countryCode, requestBodyCountryRelationData.countryCode) &&
        Objects.equals(this.foreignTaxCode, requestBodyCountryRelationData.foreignTaxCode) &&
        Objects.equals(this.countryRelationType, requestBodyCountryRelationData.countryRelationType) &&
        Objects.equals(this.actionFlag, requestBodyCountryRelationData.actionFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, foreignTaxCode, countryRelationType, actionFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestBodyCountryRelationData {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    foreignTaxCode: ").append(toIndentedString(foreignTaxCode)).append("\n");
    sb.append("    countryRelationType: ").append(toIndentedString(countryRelationType)).append("\n");
    sb.append("    actionFlag: ").append(toIndentedString(actionFlag)).append("\n");
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


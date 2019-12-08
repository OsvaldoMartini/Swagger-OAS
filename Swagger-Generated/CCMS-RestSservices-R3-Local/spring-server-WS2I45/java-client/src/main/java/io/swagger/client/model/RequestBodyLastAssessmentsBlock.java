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
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;

/**
 * RequestBodyLastAssessmentsBlock
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-08T15:22:33.923Z")
public class RequestBodyLastAssessmentsBlock {
  @SerializedName("requestType")
  private String requestType = null;

  @SerializedName("dateLastRiskAssessment")
  private LocalDate dateLastRiskAssessment = null;

  @SerializedName("decisionLastRiskAssessment")
  private String decisionLastRiskAssessment = null;

  @SerializedName("decisionReasonLastRiskAssessment")
  private String decisionReasonLastRiskAssessment = null;

  @SerializedName("maxConsFinLiability")
  private BigDecimal maxConsFinLiability = null;

  @SerializedName("maxCalcLiability")
  private BigDecimal maxCalcLiability = null;

  @SerializedName("maxTempLiability")
  private BigDecimal maxTempLiability = null;

  public RequestBodyLastAssessmentsBlock requestType(String requestType) {
    this.requestType = requestType;
    return this;
  }

   /**
   * Get requestType
   * @return requestType
  **/
  @ApiModelProperty(value = "")
  public String getRequestType() {
    return requestType;
  }

  public void setRequestType(String requestType) {
    this.requestType = requestType;
  }

  public RequestBodyLastAssessmentsBlock dateLastRiskAssessment(LocalDate dateLastRiskAssessment) {
    this.dateLastRiskAssessment = dateLastRiskAssessment;
    return this;
  }

   /**
   * Get dateLastRiskAssessment
   * @return dateLastRiskAssessment
  **/
  @ApiModelProperty(value = "")
  public LocalDate getDateLastRiskAssessment() {
    return dateLastRiskAssessment;
  }

  public void setDateLastRiskAssessment(LocalDate dateLastRiskAssessment) {
    this.dateLastRiskAssessment = dateLastRiskAssessment;
  }

  public RequestBodyLastAssessmentsBlock decisionLastRiskAssessment(String decisionLastRiskAssessment) {
    this.decisionLastRiskAssessment = decisionLastRiskAssessment;
    return this;
  }

   /**
   * Get decisionLastRiskAssessment
   * @return decisionLastRiskAssessment
  **/
  @ApiModelProperty(value = "")
  public String getDecisionLastRiskAssessment() {
    return decisionLastRiskAssessment;
  }

  public void setDecisionLastRiskAssessment(String decisionLastRiskAssessment) {
    this.decisionLastRiskAssessment = decisionLastRiskAssessment;
  }

  public RequestBodyLastAssessmentsBlock decisionReasonLastRiskAssessment(String decisionReasonLastRiskAssessment) {
    this.decisionReasonLastRiskAssessment = decisionReasonLastRiskAssessment;
    return this;
  }

   /**
   * Get decisionReasonLastRiskAssessment
   * @return decisionReasonLastRiskAssessment
  **/
  @ApiModelProperty(value = "")
  public String getDecisionReasonLastRiskAssessment() {
    return decisionReasonLastRiskAssessment;
  }

  public void setDecisionReasonLastRiskAssessment(String decisionReasonLastRiskAssessment) {
    this.decisionReasonLastRiskAssessment = decisionReasonLastRiskAssessment;
  }

  public RequestBodyLastAssessmentsBlock maxConsFinLiability(BigDecimal maxConsFinLiability) {
    this.maxConsFinLiability = maxConsFinLiability;
    return this;
  }

   /**
   * Get maxConsFinLiability
   * @return maxConsFinLiability
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getMaxConsFinLiability() {
    return maxConsFinLiability;
  }

  public void setMaxConsFinLiability(BigDecimal maxConsFinLiability) {
    this.maxConsFinLiability = maxConsFinLiability;
  }

  public RequestBodyLastAssessmentsBlock maxCalcLiability(BigDecimal maxCalcLiability) {
    this.maxCalcLiability = maxCalcLiability;
    return this;
  }

   /**
   * Get maxCalcLiability
   * @return maxCalcLiability
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getMaxCalcLiability() {
    return maxCalcLiability;
  }

  public void setMaxCalcLiability(BigDecimal maxCalcLiability) {
    this.maxCalcLiability = maxCalcLiability;
  }

  public RequestBodyLastAssessmentsBlock maxTempLiability(BigDecimal maxTempLiability) {
    this.maxTempLiability = maxTempLiability;
    return this;
  }

   /**
   * Get maxTempLiability
   * @return maxTempLiability
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getMaxTempLiability() {
    return maxTempLiability;
  }

  public void setMaxTempLiability(BigDecimal maxTempLiability) {
    this.maxTempLiability = maxTempLiability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestBodyLastAssessmentsBlock requestBodyLastAssessmentsBlock = (RequestBodyLastAssessmentsBlock) o;
    return Objects.equals(this.requestType, requestBodyLastAssessmentsBlock.requestType) &&
        Objects.equals(this.dateLastRiskAssessment, requestBodyLastAssessmentsBlock.dateLastRiskAssessment) &&
        Objects.equals(this.decisionLastRiskAssessment, requestBodyLastAssessmentsBlock.decisionLastRiskAssessment) &&
        Objects.equals(this.decisionReasonLastRiskAssessment, requestBodyLastAssessmentsBlock.decisionReasonLastRiskAssessment) &&
        Objects.equals(this.maxConsFinLiability, requestBodyLastAssessmentsBlock.maxConsFinLiability) &&
        Objects.equals(this.maxCalcLiability, requestBodyLastAssessmentsBlock.maxCalcLiability) &&
        Objects.equals(this.maxTempLiability, requestBodyLastAssessmentsBlock.maxTempLiability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestType, dateLastRiskAssessment, decisionLastRiskAssessment, decisionReasonLastRiskAssessment, maxConsFinLiability, maxCalcLiability, maxTempLiability);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestBodyLastAssessmentsBlock {\n");
    
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    dateLastRiskAssessment: ").append(toIndentedString(dateLastRiskAssessment)).append("\n");
    sb.append("    decisionLastRiskAssessment: ").append(toIndentedString(decisionLastRiskAssessment)).append("\n");
    sb.append("    decisionReasonLastRiskAssessment: ").append(toIndentedString(decisionReasonLastRiskAssessment)).append("\n");
    sb.append("    maxConsFinLiability: ").append(toIndentedString(maxConsFinLiability)).append("\n");
    sb.append("    maxCalcLiability: ").append(toIndentedString(maxCalcLiability)).append("\n");
    sb.append("    maxTempLiability: ").append(toIndentedString(maxTempLiability)).append("\n");
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


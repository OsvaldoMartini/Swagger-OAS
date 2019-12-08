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

/**
 * RequestBodyDecisionsOpenedCases
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-08T15:22:33.923Z")
public class RequestBodyDecisionsOpenedCases {
  @SerializedName("caseCode")
  private String caseCode = null;

  @SerializedName("caseSeverity")
  private String caseSeverity = null;

  public RequestBodyDecisionsOpenedCases caseCode(String caseCode) {
    this.caseCode = caseCode;
    return this;
  }

   /**
   * Get caseCode
   * @return caseCode
  **/
  @ApiModelProperty(value = "")
  public String getCaseCode() {
    return caseCode;
  }

  public void setCaseCode(String caseCode) {
    this.caseCode = caseCode;
  }

  public RequestBodyDecisionsOpenedCases caseSeverity(String caseSeverity) {
    this.caseSeverity = caseSeverity;
    return this;
  }

   /**
   * Get caseSeverity
   * @return caseSeverity
  **/
  @ApiModelProperty(value = "")
  public String getCaseSeverity() {
    return caseSeverity;
  }

  public void setCaseSeverity(String caseSeverity) {
    this.caseSeverity = caseSeverity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestBodyDecisionsOpenedCases requestBodyDecisionsOpenedCases = (RequestBodyDecisionsOpenedCases) o;
    return Objects.equals(this.caseCode, requestBodyDecisionsOpenedCases.caseCode) &&
        Objects.equals(this.caseSeverity, requestBodyDecisionsOpenedCases.caseSeverity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseCode, caseSeverity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestBodyDecisionsOpenedCases {\n");
    
    sb.append("    caseCode: ").append(toIndentedString(caseCode)).append("\n");
    sb.append("    caseSeverity: ").append(toIndentedString(caseSeverity)).append("\n");
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


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
 * RequestBodyDecisionsOpenedCases
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-07T13:56:37.457Z")

public class RequestBodyDecisionsOpenedCases   {
  @JsonProperty("caseCode")
  private String caseCode = null;

  @JsonProperty("caseSeverity")
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

@Size(max=2) 
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

@Size(max=1) 
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


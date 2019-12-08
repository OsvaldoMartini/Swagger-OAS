package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RequestBodyDecisionsCalculatedLiabilities;
import io.swagger.model.RequestBodyDecisionsOpenedCases;
import io.swagger.model.RequestBodyDecisionsReasons;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestBodyDecisions
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-07T13:56:37.457Z")

public class RequestBodyDecisions   {
  @JsonProperty("result")
  private String result = null;

  @JsonProperty("Reasons")
  @Valid
  private List<RequestBodyDecisionsReasons> reasons = null;

  @JsonProperty("OpenedCases")
  @Valid
  private List<RequestBodyDecisionsOpenedCases> openedCases = new ArrayList<RequestBodyDecisionsOpenedCases>();

  @JsonProperty("CalculatedLiabilities")
  private RequestBodyDecisionsCalculatedLiabilities calculatedLiabilities = null;

  public RequestBodyDecisions result(String result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")

@Size(max=30) 
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public RequestBodyDecisions reasons(List<RequestBodyDecisionsReasons> reasons) {
    this.reasons = reasons;
    return this;
  }

  public RequestBodyDecisions addReasonsItem(RequestBodyDecisionsReasons reasonsItem) {
    if (this.reasons == null) {
      this.reasons = new ArrayList<RequestBodyDecisionsReasons>();
    }
    this.reasons.add(reasonsItem);
    return this;
  }

  /**
   * Get reasons
   * @return reasons
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RequestBodyDecisionsReasons> getReasons() {
    return reasons;
  }

  public void setReasons(List<RequestBodyDecisionsReasons> reasons) {
    this.reasons = reasons;
  }

  public RequestBodyDecisions openedCases(List<RequestBodyDecisionsOpenedCases> openedCases) {
    this.openedCases = openedCases;
    return this;
  }

  public RequestBodyDecisions addOpenedCasesItem(RequestBodyDecisionsOpenedCases openedCasesItem) {
    this.openedCases.add(openedCasesItem);
    return this;
  }

  /**
   * Get openedCases
   * @return openedCases
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min=1) 
  public List<RequestBodyDecisionsOpenedCases> getOpenedCases() {
    return openedCases;
  }

  public void setOpenedCases(List<RequestBodyDecisionsOpenedCases> openedCases) {
    this.openedCases = openedCases;
  }

  public RequestBodyDecisions calculatedLiabilities(RequestBodyDecisionsCalculatedLiabilities calculatedLiabilities) {
    this.calculatedLiabilities = calculatedLiabilities;
    return this;
  }

  /**
   * Get calculatedLiabilities
   * @return calculatedLiabilities
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public RequestBodyDecisionsCalculatedLiabilities getCalculatedLiabilities() {
    return calculatedLiabilities;
  }

  public void setCalculatedLiabilities(RequestBodyDecisionsCalculatedLiabilities calculatedLiabilities) {
    this.calculatedLiabilities = calculatedLiabilities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestBodyDecisions requestBodyDecisions = (RequestBodyDecisions) o;
    return Objects.equals(this.result, requestBodyDecisions.result) &&
        Objects.equals(this.reasons, requestBodyDecisions.reasons) &&
        Objects.equals(this.openedCases, requestBodyDecisions.openedCases) &&
        Objects.equals(this.calculatedLiabilities, requestBodyDecisions.calculatedLiabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, reasons, openedCases, calculatedLiabilities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestBodyDecisions {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
    sb.append("    openedCases: ").append(toIndentedString(openedCases)).append("\n");
    sb.append("    calculatedLiabilities: ").append(toIndentedString(calculatedLiabilities)).append("\n");
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


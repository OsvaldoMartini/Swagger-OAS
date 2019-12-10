package com.corner.ccms.ws2i45.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestBodyDeo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-10T11:05:03.369+01:00")

public class RequestBodyDeo   {
  @JsonProperty("status")
  private String status = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("taxes")
  private String taxes = null;

  @JsonProperty("healthInsurance")
  private String healthInsurance = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("year")
  private String year = null;

  public RequestBodyDeo status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

@Size(max=32) 
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public RequestBodyDeo type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")

@Size(max=32) 
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RequestBodyDeo taxes(String taxes) {
    this.taxes = taxes;
    return this;
  }

  /**
   * Get taxes
   * @return taxes
  **/
  @ApiModelProperty(value = "")

@Size(max=32) 
  public String getTaxes() {
    return taxes;
  }

  public void setTaxes(String taxes) {
    this.taxes = taxes;
  }

  public RequestBodyDeo healthInsurance(String healthInsurance) {
    this.healthInsurance = healthInsurance;
    return this;
  }

  /**
   * Get healthInsurance
   * @return healthInsurance
  **/
  @ApiModelProperty(value = "")

@Size(max=32) 
  public String getHealthInsurance() {
    return healthInsurance;
  }

  public void setHealthInsurance(String healthInsurance) {
    this.healthInsurance = healthInsurance;
  }

  public RequestBodyDeo amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public RequestBodyDeo year(String year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
  **/
  @ApiModelProperty(value = "")

@Size(max=4) 
  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestBodyDeo requestBodyDeo = (RequestBodyDeo) o;
    return Objects.equals(this.status, requestBodyDeo.status) &&
        Objects.equals(this.type, requestBodyDeo.type) &&
        Objects.equals(this.taxes, requestBodyDeo.taxes) &&
        Objects.equals(this.healthInsurance, requestBodyDeo.healthInsurance) &&
        Objects.equals(this.amount, requestBodyDeo.amount) &&
        Objects.equals(this.year, requestBodyDeo.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, type, taxes, healthInsurance, amount, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestBodyDeo {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    healthInsurance: ").append(toIndentedString(healthInsurance)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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


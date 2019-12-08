package io.swagger.model;

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
 * RequestBodyDecisionsCalculatedLiabilities
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-07T13:56:37.457Z")

public class RequestBodyDecisionsCalculatedLiabilities   {
  @JsonProperty("maximumCalculatedAmount")
  private BigDecimal maximumCalculatedAmount = null;

  @JsonProperty("maximumCalculatedCurrency")
  private String maximumCalculatedCurrency = null;

  @JsonProperty("maximumConsumerFinanceAmount")
  private BigDecimal maximumConsumerFinanceAmount = null;

  @JsonProperty("maximumConsumerFinanceCurrency")
  private String maximumConsumerFinanceCurrency = null;

  @JsonProperty("maximumTemporaryAmount")
  private BigDecimal maximumTemporaryAmount = null;

  @JsonProperty("maximumTemporaryCurrency")
  private String maximumTemporaryCurrency = null;

  public RequestBodyDecisionsCalculatedLiabilities maximumCalculatedAmount(BigDecimal maximumCalculatedAmount) {
    this.maximumCalculatedAmount = maximumCalculatedAmount;
    return this;
  }

  /**
   * Get maximumCalculatedAmount
   * @return maximumCalculatedAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getMaximumCalculatedAmount() {
    return maximumCalculatedAmount;
  }

  public void setMaximumCalculatedAmount(BigDecimal maximumCalculatedAmount) {
    this.maximumCalculatedAmount = maximumCalculatedAmount;
  }

  public RequestBodyDecisionsCalculatedLiabilities maximumCalculatedCurrency(String maximumCalculatedCurrency) {
    this.maximumCalculatedCurrency = maximumCalculatedCurrency;
    return this;
  }

  /**
   * Get maximumCalculatedCurrency
   * @return maximumCalculatedCurrency
  **/
  @ApiModelProperty(value = "")

@Size(max=3) 
  public String getMaximumCalculatedCurrency() {
    return maximumCalculatedCurrency;
  }

  public void setMaximumCalculatedCurrency(String maximumCalculatedCurrency) {
    this.maximumCalculatedCurrency = maximumCalculatedCurrency;
  }

  public RequestBodyDecisionsCalculatedLiabilities maximumConsumerFinanceAmount(BigDecimal maximumConsumerFinanceAmount) {
    this.maximumConsumerFinanceAmount = maximumConsumerFinanceAmount;
    return this;
  }

  /**
   * Get maximumConsumerFinanceAmount
   * @return maximumConsumerFinanceAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getMaximumConsumerFinanceAmount() {
    return maximumConsumerFinanceAmount;
  }

  public void setMaximumConsumerFinanceAmount(BigDecimal maximumConsumerFinanceAmount) {
    this.maximumConsumerFinanceAmount = maximumConsumerFinanceAmount;
  }

  public RequestBodyDecisionsCalculatedLiabilities maximumConsumerFinanceCurrency(String maximumConsumerFinanceCurrency) {
    this.maximumConsumerFinanceCurrency = maximumConsumerFinanceCurrency;
    return this;
  }

  /**
   * Get maximumConsumerFinanceCurrency
   * @return maximumConsumerFinanceCurrency
  **/
  @ApiModelProperty(value = "")

@Size(max=3) 
  public String getMaximumConsumerFinanceCurrency() {
    return maximumConsumerFinanceCurrency;
  }

  public void setMaximumConsumerFinanceCurrency(String maximumConsumerFinanceCurrency) {
    this.maximumConsumerFinanceCurrency = maximumConsumerFinanceCurrency;
  }

  public RequestBodyDecisionsCalculatedLiabilities maximumTemporaryAmount(BigDecimal maximumTemporaryAmount) {
    this.maximumTemporaryAmount = maximumTemporaryAmount;
    return this;
  }

  /**
   * Get maximumTemporaryAmount
   * @return maximumTemporaryAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getMaximumTemporaryAmount() {
    return maximumTemporaryAmount;
  }

  public void setMaximumTemporaryAmount(BigDecimal maximumTemporaryAmount) {
    this.maximumTemporaryAmount = maximumTemporaryAmount;
  }

  public RequestBodyDecisionsCalculatedLiabilities maximumTemporaryCurrency(String maximumTemporaryCurrency) {
    this.maximumTemporaryCurrency = maximumTemporaryCurrency;
    return this;
  }

  /**
   * Get maximumTemporaryCurrency
   * @return maximumTemporaryCurrency
  **/
  @ApiModelProperty(value = "")

@Size(max=3) 
  public String getMaximumTemporaryCurrency() {
    return maximumTemporaryCurrency;
  }

  public void setMaximumTemporaryCurrency(String maximumTemporaryCurrency) {
    this.maximumTemporaryCurrency = maximumTemporaryCurrency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestBodyDecisionsCalculatedLiabilities requestBodyDecisionsCalculatedLiabilities = (RequestBodyDecisionsCalculatedLiabilities) o;
    return Objects.equals(this.maximumCalculatedAmount, requestBodyDecisionsCalculatedLiabilities.maximumCalculatedAmount) &&
        Objects.equals(this.maximumCalculatedCurrency, requestBodyDecisionsCalculatedLiabilities.maximumCalculatedCurrency) &&
        Objects.equals(this.maximumConsumerFinanceAmount, requestBodyDecisionsCalculatedLiabilities.maximumConsumerFinanceAmount) &&
        Objects.equals(this.maximumConsumerFinanceCurrency, requestBodyDecisionsCalculatedLiabilities.maximumConsumerFinanceCurrency) &&
        Objects.equals(this.maximumTemporaryAmount, requestBodyDecisionsCalculatedLiabilities.maximumTemporaryAmount) &&
        Objects.equals(this.maximumTemporaryCurrency, requestBodyDecisionsCalculatedLiabilities.maximumTemporaryCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximumCalculatedAmount, maximumCalculatedCurrency, maximumConsumerFinanceAmount, maximumConsumerFinanceCurrency, maximumTemporaryAmount, maximumTemporaryCurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestBodyDecisionsCalculatedLiabilities {\n");
    
    sb.append("    maximumCalculatedAmount: ").append(toIndentedString(maximumCalculatedAmount)).append("\n");
    sb.append("    maximumCalculatedCurrency: ").append(toIndentedString(maximumCalculatedCurrency)).append("\n");
    sb.append("    maximumConsumerFinanceAmount: ").append(toIndentedString(maximumConsumerFinanceAmount)).append("\n");
    sb.append("    maximumConsumerFinanceCurrency: ").append(toIndentedString(maximumConsumerFinanceCurrency)).append("\n");
    sb.append("    maximumTemporaryAmount: ").append(toIndentedString(maximumTemporaryAmount)).append("\n");
    sb.append("    maximumTemporaryCurrency: ").append(toIndentedString(maximumTemporaryCurrency)).append("\n");
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


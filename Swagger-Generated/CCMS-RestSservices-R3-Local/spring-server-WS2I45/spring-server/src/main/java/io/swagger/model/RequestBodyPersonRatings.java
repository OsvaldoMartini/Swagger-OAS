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
 * RequestBodyPersonRatings
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-07T13:56:37.457Z")

public class RequestBodyPersonRatings   {
  @JsonProperty("crifConsumerScore")
  private BigDecimal crifConsumerScore = null;

  @JsonProperty("crifConsumerScoreLevel")
  private String crifConsumerScoreLevel = null;

  @JsonProperty("deoRating")
  private String deoRating = null;

  @JsonProperty("zekikoRating")
  private String zekikoRating = null;

  @JsonProperty("zekTotalDebitAmount")
  private BigDecimal zekTotalDebitAmount = null;

  @JsonProperty("zekTotalDebitCurrency")
  private String zekTotalDebitCurrency = null;

  @JsonProperty("zekMonthlyDebitAmount")
  private BigDecimal zekMonthlyDebitAmount = null;

  @JsonProperty("zekMonthlyDebitCurrency")
  private String zekMonthlyDebitCurrency = null;

  @JsonProperty("behaviouralScore")
  private String behaviouralScore = null;

  @JsonProperty("behavouralScoreLevel")
  private String behavouralScoreLevel = null;

  @JsonProperty("creditWorthinessAmount")
  private BigDecimal creditWorthinessAmount = null;

  @JsonProperty("creditWorthinessCurrency")
  private String creditWorthinessCurrency = null;

  public RequestBodyPersonRatings crifConsumerScore(BigDecimal crifConsumerScore) {
    this.crifConsumerScore = crifConsumerScore;
    return this;
  }

  /**
   * Get crifConsumerScore
   * @return crifConsumerScore
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getCrifConsumerScore() {
    return crifConsumerScore;
  }

  public void setCrifConsumerScore(BigDecimal crifConsumerScore) {
    this.crifConsumerScore = crifConsumerScore;
  }

  public RequestBodyPersonRatings crifConsumerScoreLevel(String crifConsumerScoreLevel) {
    this.crifConsumerScoreLevel = crifConsumerScoreLevel;
    return this;
  }

  /**
   * Get crifConsumerScoreLevel
   * @return crifConsumerScoreLevel
  **/
  @ApiModelProperty(value = "")

@Size(max=10) 
  public String getCrifConsumerScoreLevel() {
    return crifConsumerScoreLevel;
  }

  public void setCrifConsumerScoreLevel(String crifConsumerScoreLevel) {
    this.crifConsumerScoreLevel = crifConsumerScoreLevel;
  }

  public RequestBodyPersonRatings deoRating(String deoRating) {
    this.deoRating = deoRating;
    return this;
  }

  /**
   * Get deoRating
   * @return deoRating
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getDeoRating() {
    return deoRating;
  }

  public void setDeoRating(String deoRating) {
    this.deoRating = deoRating;
  }

  public RequestBodyPersonRatings zekikoRating(String zekikoRating) {
    this.zekikoRating = zekikoRating;
    return this;
  }

  /**
   * Get zekikoRating
   * @return zekikoRating
  **/
  @ApiModelProperty(value = "")

@Size(max=2) 
  public String getZekikoRating() {
    return zekikoRating;
  }

  public void setZekikoRating(String zekikoRating) {
    this.zekikoRating = zekikoRating;
  }

  public RequestBodyPersonRatings zekTotalDebitAmount(BigDecimal zekTotalDebitAmount) {
    this.zekTotalDebitAmount = zekTotalDebitAmount;
    return this;
  }

  /**
   * Get zekTotalDebitAmount
   * @return zekTotalDebitAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getZekTotalDebitAmount() {
    return zekTotalDebitAmount;
  }

  public void setZekTotalDebitAmount(BigDecimal zekTotalDebitAmount) {
    this.zekTotalDebitAmount = zekTotalDebitAmount;
  }

  public RequestBodyPersonRatings zekTotalDebitCurrency(String zekTotalDebitCurrency) {
    this.zekTotalDebitCurrency = zekTotalDebitCurrency;
    return this;
  }

  /**
   * Get zekTotalDebitCurrency
   * @return zekTotalDebitCurrency
  **/
  @ApiModelProperty(value = "")

@Size(max=3) 
  public String getZekTotalDebitCurrency() {
    return zekTotalDebitCurrency;
  }

  public void setZekTotalDebitCurrency(String zekTotalDebitCurrency) {
    this.zekTotalDebitCurrency = zekTotalDebitCurrency;
  }

  public RequestBodyPersonRatings zekMonthlyDebitAmount(BigDecimal zekMonthlyDebitAmount) {
    this.zekMonthlyDebitAmount = zekMonthlyDebitAmount;
    return this;
  }

  /**
   * Get zekMonthlyDebitAmount
   * @return zekMonthlyDebitAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getZekMonthlyDebitAmount() {
    return zekMonthlyDebitAmount;
  }

  public void setZekMonthlyDebitAmount(BigDecimal zekMonthlyDebitAmount) {
    this.zekMonthlyDebitAmount = zekMonthlyDebitAmount;
  }

  public RequestBodyPersonRatings zekMonthlyDebitCurrency(String zekMonthlyDebitCurrency) {
    this.zekMonthlyDebitCurrency = zekMonthlyDebitCurrency;
    return this;
  }

  /**
   * Get zekMonthlyDebitCurrency
   * @return zekMonthlyDebitCurrency
  **/
  @ApiModelProperty(value = "")

@Size(max=3) 
  public String getZekMonthlyDebitCurrency() {
    return zekMonthlyDebitCurrency;
  }

  public void setZekMonthlyDebitCurrency(String zekMonthlyDebitCurrency) {
    this.zekMonthlyDebitCurrency = zekMonthlyDebitCurrency;
  }

  public RequestBodyPersonRatings behaviouralScore(String behaviouralScore) {
    this.behaviouralScore = behaviouralScore;
    return this;
  }

  /**
   * Get behaviouralScore
   * @return behaviouralScore
  **/
  @ApiModelProperty(value = "")

@Size(max=2) 
  public String getBehaviouralScore() {
    return behaviouralScore;
  }

  public void setBehaviouralScore(String behaviouralScore) {
    this.behaviouralScore = behaviouralScore;
  }

  public RequestBodyPersonRatings behavouralScoreLevel(String behavouralScoreLevel) {
    this.behavouralScoreLevel = behavouralScoreLevel;
    return this;
  }

  /**
   * Get behavouralScoreLevel
   * @return behavouralScoreLevel
  **/
  @ApiModelProperty(value = "")

@Size(max=10) 
  public String getBehavouralScoreLevel() {
    return behavouralScoreLevel;
  }

  public void setBehavouralScoreLevel(String behavouralScoreLevel) {
    this.behavouralScoreLevel = behavouralScoreLevel;
  }

  public RequestBodyPersonRatings creditWorthinessAmount(BigDecimal creditWorthinessAmount) {
    this.creditWorthinessAmount = creditWorthinessAmount;
    return this;
  }

  /**
   * Get creditWorthinessAmount
   * @return creditWorthinessAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getCreditWorthinessAmount() {
    return creditWorthinessAmount;
  }

  public void setCreditWorthinessAmount(BigDecimal creditWorthinessAmount) {
    this.creditWorthinessAmount = creditWorthinessAmount;
  }

  public RequestBodyPersonRatings creditWorthinessCurrency(String creditWorthinessCurrency) {
    this.creditWorthinessCurrency = creditWorthinessCurrency;
    return this;
  }

  /**
   * Get creditWorthinessCurrency
   * @return creditWorthinessCurrency
  **/
  @ApiModelProperty(value = "")

@Size(max=3) 
  public String getCreditWorthinessCurrency() {
    return creditWorthinessCurrency;
  }

  public void setCreditWorthinessCurrency(String creditWorthinessCurrency) {
    this.creditWorthinessCurrency = creditWorthinessCurrency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestBodyPersonRatings requestBodyPersonRatings = (RequestBodyPersonRatings) o;
    return Objects.equals(this.crifConsumerScore, requestBodyPersonRatings.crifConsumerScore) &&
        Objects.equals(this.crifConsumerScoreLevel, requestBodyPersonRatings.crifConsumerScoreLevel) &&
        Objects.equals(this.deoRating, requestBodyPersonRatings.deoRating) &&
        Objects.equals(this.zekikoRating, requestBodyPersonRatings.zekikoRating) &&
        Objects.equals(this.zekTotalDebitAmount, requestBodyPersonRatings.zekTotalDebitAmount) &&
        Objects.equals(this.zekTotalDebitCurrency, requestBodyPersonRatings.zekTotalDebitCurrency) &&
        Objects.equals(this.zekMonthlyDebitAmount, requestBodyPersonRatings.zekMonthlyDebitAmount) &&
        Objects.equals(this.zekMonthlyDebitCurrency, requestBodyPersonRatings.zekMonthlyDebitCurrency) &&
        Objects.equals(this.behaviouralScore, requestBodyPersonRatings.behaviouralScore) &&
        Objects.equals(this.behavouralScoreLevel, requestBodyPersonRatings.behavouralScoreLevel) &&
        Objects.equals(this.creditWorthinessAmount, requestBodyPersonRatings.creditWorthinessAmount) &&
        Objects.equals(this.creditWorthinessCurrency, requestBodyPersonRatings.creditWorthinessCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crifConsumerScore, crifConsumerScoreLevel, deoRating, zekikoRating, zekTotalDebitAmount, zekTotalDebitCurrency, zekMonthlyDebitAmount, zekMonthlyDebitCurrency, behaviouralScore, behavouralScoreLevel, creditWorthinessAmount, creditWorthinessCurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestBodyPersonRatings {\n");
    
    sb.append("    crifConsumerScore: ").append(toIndentedString(crifConsumerScore)).append("\n");
    sb.append("    crifConsumerScoreLevel: ").append(toIndentedString(crifConsumerScoreLevel)).append("\n");
    sb.append("    deoRating: ").append(toIndentedString(deoRating)).append("\n");
    sb.append("    zekikoRating: ").append(toIndentedString(zekikoRating)).append("\n");
    sb.append("    zekTotalDebitAmount: ").append(toIndentedString(zekTotalDebitAmount)).append("\n");
    sb.append("    zekTotalDebitCurrency: ").append(toIndentedString(zekTotalDebitCurrency)).append("\n");
    sb.append("    zekMonthlyDebitAmount: ").append(toIndentedString(zekMonthlyDebitAmount)).append("\n");
    sb.append("    zekMonthlyDebitCurrency: ").append(toIndentedString(zekMonthlyDebitCurrency)).append("\n");
    sb.append("    behaviouralScore: ").append(toIndentedString(behaviouralScore)).append("\n");
    sb.append("    behavouralScoreLevel: ").append(toIndentedString(behavouralScoreLevel)).append("\n");
    sb.append("    creditWorthinessAmount: ").append(toIndentedString(creditWorthinessAmount)).append("\n");
    sb.append("    creditWorthinessCurrency: ").append(toIndentedString(creditWorthinessCurrency)).append("\n");
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


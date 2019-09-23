package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Errors;
import io.swagger.model.HeaderResponse;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Response Body
 */
@ApiModel(description = "Response Body")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-23T12:46:28.874Z")

public class ResponseBody   {
  @JsonProperty("headerResponse")
  private HeaderResponse headerResponse = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("errors")
  private Errors errors = null;

  /**
   * Gets or Sets giftCardFlag
   */
  public enum GiftCardFlagEnum {
    Y("Y"),
    
    N("N");

    private String value;

    GiftCardFlagEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GiftCardFlagEnum fromValue(String text) {
      for (GiftCardFlagEnum b : GiftCardFlagEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("giftCardFlag")
  private GiftCardFlagEnum giftCardFlag = null;

  @JsonProperty("partnerId")
  private String partnerId = null;

  @JsonProperty("agreementId")
  private String agreementId = null;

  @JsonProperty("balance")
  private String balance = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("msisdn")
  private String msisdn = null;

  public ResponseBody headerResponse(HeaderResponse headerResponse) {
    this.headerResponse = headerResponse;
    return this;
  }

  /**
   * Get headerResponse
   * @return headerResponse
  **/
  @ApiModelProperty(value = "")

  @Valid

  public HeaderResponse getHeaderResponse() {
    return headerResponse;
  }

  public void setHeaderResponse(HeaderResponse headerResponse) {
    this.headerResponse = headerResponse;
  }

  public ResponseBody status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(min=1,max=16) 
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ResponseBody code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(min=3,max=3) 
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ResponseBody message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")

@Size(min=0,max=128) 
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ResponseBody errors(Errors errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Errors getErrors() {
    return errors;
  }

  public void setErrors(Errors errors) {
    this.errors = errors;
  }

  public ResponseBody giftCardFlag(GiftCardFlagEnum giftCardFlag) {
    this.giftCardFlag = giftCardFlag;
    return this;
  }

  /**
   * Get giftCardFlag
   * @return giftCardFlag
  **/
  @ApiModelProperty(value = "")


  public GiftCardFlagEnum getGiftCardFlag() {
    return giftCardFlag;
  }

  public void setGiftCardFlag(GiftCardFlagEnum giftCardFlag) {
    this.giftCardFlag = giftCardFlag;
  }

  public ResponseBody partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

  /**
   * Get partnerId
   * @return partnerId
  **/
  @ApiModelProperty(value = "")

@Size(min=0,max=16) 
  public String getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  public ResponseBody agreementId(String agreementId) {
    this.agreementId = agreementId;
    return this;
  }

  /**
   * Get agreementId
   * @return agreementId
  **/
  @ApiModelProperty(value = "")

@Size(min=0,max=16) 
  public String getAgreementId() {
    return agreementId;
  }

  public void setAgreementId(String agreementId) {
    this.agreementId = agreementId;
  }

  public ResponseBody balance(String balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * @return balance
  **/
  @ApiModelProperty(value = "")

@Size(min=0,max=16) 
  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public ResponseBody currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")

@Size(min=0,max=3) 
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public ResponseBody msisdn(String msisdn) {
    this.msisdn = msisdn;
    return this;
  }

  /**
   * Get msisdn
   * @return msisdn
  **/
  @ApiModelProperty(value = "")

@Size(min=0,max=64) 
  public String getMsisdn() {
    return msisdn;
  }

  public void setMsisdn(String msisdn) {
    this.msisdn = msisdn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseBody responseBody = (ResponseBody) o;
    return Objects.equals(this.headerResponse, responseBody.headerResponse) &&
        Objects.equals(this.status, responseBody.status) &&
        Objects.equals(this.code, responseBody.code) &&
        Objects.equals(this.message, responseBody.message) &&
        Objects.equals(this.errors, responseBody.errors) &&
        Objects.equals(this.giftCardFlag, responseBody.giftCardFlag) &&
        Objects.equals(this.partnerId, responseBody.partnerId) &&
        Objects.equals(this.agreementId, responseBody.agreementId) &&
        Objects.equals(this.balance, responseBody.balance) &&
        Objects.equals(this.currency, responseBody.currency) &&
        Objects.equals(this.msisdn, responseBody.msisdn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerResponse, status, code, message, errors, giftCardFlag, partnerId, agreementId, balance, currency, msisdn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBody {\n");
    
    sb.append("    headerResponse: ").append(toIndentedString(headerResponse)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    giftCardFlag: ").append(toIndentedString(giftCardFlag)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    agreementId: ").append(toIndentedString(agreementId)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    msisdn: ").append(toIndentedString(msisdn)).append("\n");
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


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestBodyReusableAddressDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-13T10:34:52.354Z")

public class RequestBodyReusableAddressDetails   {
  @JsonProperty("addressCode")
  private String addressCode = null;

  @JsonProperty("addressType")
  private String addressType = null;

  @JsonProperty("custOrgUnitCode")
  private String custOrgUnitCode = null;

  @JsonProperty("custOrgUnitName")
  private String custOrgUnitName = null;

  @JsonProperty("dateFrom")
  private LocalDate dateFrom = null;

  @JsonProperty("dateUntil")
  private LocalDate dateUntil = null;

  @JsonProperty("confidentiality")
  private String confidentiality = null;

  @JsonProperty("additionalLine1")
  private String additionalLine1 = null;

  @JsonProperty("beforeAfterCode")
  private String beforeAfterCode = null;

  @JsonProperty("additionalLine2")
  private String additionalLine2 = null;

  @JsonProperty("addressCountryCode")
  private String addressCountryCode = null;

  @JsonProperty("addressStreet")
  private String addressStreet = null;

  @JsonProperty("addressHouseNo")
  private String addressHouseNo = null;

  @JsonProperty("cityCode")
  private String cityCode = null;

  @JsonProperty("cityName")
  private String cityName = null;

  @JsonProperty("postCode")
  private String postCode = null;

  @JsonProperty("postName")
  private String postName = null;

  @JsonProperty("countyCode")
  private String countyCode = null;

  @JsonProperty("countyName")
  private String countyName = null;

  @JsonProperty("districtCode")
  private String districtCode = null;

  @JsonProperty("districtName")
  private String districtName = null;

  @JsonProperty("addressLine1")
  private String addressLine1 = null;

  @JsonProperty("addressLine2")
  private String addressLine2 = null;

  @JsonProperty("addressLine3")
  private String addressLine3 = null;

  @JsonProperty("addressLine4")
  private String addressLine4 = null;

  @JsonProperty("addressLine5")
  private String addressLine5 = null;

  public RequestBodyReusableAddressDetails addressCode(String addressCode) {
    this.addressCode = addressCode;
    return this;
  }

  /**
   * Get addressCode
   * @return addressCode
  **/
  @ApiModelProperty(value = "")

@Size(max=16) 
  public String getAddressCode() {
    return addressCode;
  }

  public void setAddressCode(String addressCode) {
    this.addressCode = addressCode;
  }

  public RequestBodyReusableAddressDetails addressType(String addressType) {
    this.addressType = addressType;
    return this;
  }

  /**
   * Get addressType
   * @return addressType
  **/
  @ApiModelProperty(value = "")

@Size(max=18) 
  public String getAddressType() {
    return addressType;
  }

  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }

  public RequestBodyReusableAddressDetails custOrgUnitCode(String custOrgUnitCode) {
    this.custOrgUnitCode = custOrgUnitCode;
    return this;
  }

  /**
   * Get custOrgUnitCode
   * @return custOrgUnitCode
  **/
  @ApiModelProperty(value = "")

@Size(max=15) 
  public String getCustOrgUnitCode() {
    return custOrgUnitCode;
  }

  public void setCustOrgUnitCode(String custOrgUnitCode) {
    this.custOrgUnitCode = custOrgUnitCode;
  }

  public RequestBodyReusableAddressDetails custOrgUnitName(String custOrgUnitName) {
    this.custOrgUnitName = custOrgUnitName;
    return this;
  }

  /**
   * Get custOrgUnitName
   * @return custOrgUnitName
  **/
  @ApiModelProperty(value = "")

@Size(max=128) 
  public String getCustOrgUnitName() {
    return custOrgUnitName;
  }

  public void setCustOrgUnitName(String custOrgUnitName) {
    this.custOrgUnitName = custOrgUnitName;
  }

  public RequestBodyReusableAddressDetails dateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * Get dateFrom
   * @return dateFrom
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }

  public RequestBodyReusableAddressDetails dateUntil(LocalDate dateUntil) {
    this.dateUntil = dateUntil;
    return this;
  }

  /**
   * Get dateUntil
   * @return dateUntil
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDateUntil() {
    return dateUntil;
  }

  public void setDateUntil(LocalDate dateUntil) {
    this.dateUntil = dateUntil;
  }

  public RequestBodyReusableAddressDetails confidentiality(String confidentiality) {
    this.confidentiality = confidentiality;
    return this;
  }

  /**
   * Get confidentiality
   * @return confidentiality
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getConfidentiality() {
    return confidentiality;
  }

  public void setConfidentiality(String confidentiality) {
    this.confidentiality = confidentiality;
  }

  public RequestBodyReusableAddressDetails additionalLine1(String additionalLine1) {
    this.additionalLine1 = additionalLine1;
    return this;
  }

  /**
   * Get additionalLine1
   * @return additionalLine1
  **/
  @ApiModelProperty(value = "")

@Size(max=50) 
  public String getAdditionalLine1() {
    return additionalLine1;
  }

  public void setAdditionalLine1(String additionalLine1) {
    this.additionalLine1 = additionalLine1;
  }

  public RequestBodyReusableAddressDetails beforeAfterCode(String beforeAfterCode) {
    this.beforeAfterCode = beforeAfterCode;
    return this;
  }

  /**
   * Get beforeAfterCode
   * @return beforeAfterCode
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getBeforeAfterCode() {
    return beforeAfterCode;
  }

  public void setBeforeAfterCode(String beforeAfterCode) {
    this.beforeAfterCode = beforeAfterCode;
  }

  public RequestBodyReusableAddressDetails additionalLine2(String additionalLine2) {
    this.additionalLine2 = additionalLine2;
    return this;
  }

  /**
   * Get additionalLine2
   * @return additionalLine2
  **/
  @ApiModelProperty(value = "")

@Size(max=128) 
  public String getAdditionalLine2() {
    return additionalLine2;
  }

  public void setAdditionalLine2(String additionalLine2) {
    this.additionalLine2 = additionalLine2;
  }

  public RequestBodyReusableAddressDetails addressCountryCode(String addressCountryCode) {
    this.addressCountryCode = addressCountryCode;
    return this;
  }

  /**
   * Get addressCountryCode
   * @return addressCountryCode
  **/
  @ApiModelProperty(value = "")

@Size(max=3) 
  public String getAddressCountryCode() {
    return addressCountryCode;
  }

  public void setAddressCountryCode(String addressCountryCode) {
    this.addressCountryCode = addressCountryCode;
  }

  public RequestBodyReusableAddressDetails addressStreet(String addressStreet) {
    this.addressStreet = addressStreet;
    return this;
  }

  /**
   * Get addressStreet
   * @return addressStreet
  **/
  @ApiModelProperty(value = "")

@Size(max=38) 
  public String getAddressStreet() {
    return addressStreet;
  }

  public void setAddressStreet(String addressStreet) {
    this.addressStreet = addressStreet;
  }

  public RequestBodyReusableAddressDetails addressHouseNo(String addressHouseNo) {
    this.addressHouseNo = addressHouseNo;
    return this;
  }

  /**
   * Get addressHouseNo
   * @return addressHouseNo
  **/
  @ApiModelProperty(value = "")

@Size(max=5) 
  public String getAddressHouseNo() {
    return addressHouseNo;
  }

  public void setAddressHouseNo(String addressHouseNo) {
    this.addressHouseNo = addressHouseNo;
  }

  public RequestBodyReusableAddressDetails cityCode(String cityCode) {
    this.cityCode = cityCode;
    return this;
  }

  /**
   * Get cityCode
   * @return cityCode
  **/
  @ApiModelProperty(value = "")

@Size(max=8) 
  public String getCityCode() {
    return cityCode;
  }

  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }

  public RequestBodyReusableAddressDetails cityName(String cityName) {
    this.cityName = cityName;
    return this;
  }

  /**
   * Get cityName
   * @return cityName
  **/
  @ApiModelProperty(value = "")

@Size(max=64) 
  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public RequestBodyReusableAddressDetails postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

  /**
   * Get postCode
   * @return postCode
  **/
  @ApiModelProperty(value = "")

@Size(max=16) 
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public RequestBodyReusableAddressDetails postName(String postName) {
    this.postName = postName;
    return this;
  }

  /**
   * Get postName
   * @return postName
  **/
  @ApiModelProperty(value = "")

@Size(max=32) 
  public String getPostName() {
    return postName;
  }

  public void setPostName(String postName) {
    this.postName = postName;
  }

  public RequestBodyReusableAddressDetails countyCode(String countyCode) {
    this.countyCode = countyCode;
    return this;
  }

  /**
   * Get countyCode
   * @return countyCode
  **/
  @ApiModelProperty(value = "")

@Size(max=8) 
  public String getCountyCode() {
    return countyCode;
  }

  public void setCountyCode(String countyCode) {
    this.countyCode = countyCode;
  }

  public RequestBodyReusableAddressDetails countyName(String countyName) {
    this.countyName = countyName;
    return this;
  }

  /**
   * Get countyName
   * @return countyName
  **/
  @ApiModelProperty(value = "")

@Size(max=64) 
  public String getCountyName() {
    return countyName;
  }

  public void setCountyName(String countyName) {
    this.countyName = countyName;
  }

  public RequestBodyReusableAddressDetails districtCode(String districtCode) {
    this.districtCode = districtCode;
    return this;
  }

  /**
   * Get districtCode
   * @return districtCode
  **/
  @ApiModelProperty(value = "")

@Size(max=8) 
  public String getDistrictCode() {
    return districtCode;
  }

  public void setDistrictCode(String districtCode) {
    this.districtCode = districtCode;
  }

  public RequestBodyReusableAddressDetails districtName(String districtName) {
    this.districtName = districtName;
    return this;
  }

  /**
   * Get districtName
   * @return districtName
  **/
  @ApiModelProperty(value = "")

@Size(max=64) 
  public String getDistrictName() {
    return districtName;
  }

  public void setDistrictName(String districtName) {
    this.districtName = districtName;
  }

  public RequestBodyReusableAddressDetails addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

  /**
   * Get addressLine1
   * @return addressLine1
  **/
  @ApiModelProperty(value = "")

@Size(max=128) 
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public RequestBodyReusableAddressDetails addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

  /**
   * Get addressLine2
   * @return addressLine2
  **/
  @ApiModelProperty(value = "")

@Size(max=128) 
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public RequestBodyReusableAddressDetails addressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
    return this;
  }

  /**
   * Get addressLine3
   * @return addressLine3
  **/
  @ApiModelProperty(value = "")

@Size(max=128) 
  public String getAddressLine3() {
    return addressLine3;
  }

  public void setAddressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
  }

  public RequestBodyReusableAddressDetails addressLine4(String addressLine4) {
    this.addressLine4 = addressLine4;
    return this;
  }

  /**
   * Get addressLine4
   * @return addressLine4
  **/
  @ApiModelProperty(value = "")

@Size(max=128) 
  public String getAddressLine4() {
    return addressLine4;
  }

  public void setAddressLine4(String addressLine4) {
    this.addressLine4 = addressLine4;
  }

  public RequestBodyReusableAddressDetails addressLine5(String addressLine5) {
    this.addressLine5 = addressLine5;
    return this;
  }

  /**
   * Get addressLine5
   * @return addressLine5
  **/
  @ApiModelProperty(value = "")

@Size(max=128) 
  public String getAddressLine5() {
    return addressLine5;
  }

  public void setAddressLine5(String addressLine5) {
    this.addressLine5 = addressLine5;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestBodyReusableAddressDetails requestBodyReusableAddressDetails = (RequestBodyReusableAddressDetails) o;
    return Objects.equals(this.addressCode, requestBodyReusableAddressDetails.addressCode) &&
        Objects.equals(this.addressType, requestBodyReusableAddressDetails.addressType) &&
        Objects.equals(this.custOrgUnitCode, requestBodyReusableAddressDetails.custOrgUnitCode) &&
        Objects.equals(this.custOrgUnitName, requestBodyReusableAddressDetails.custOrgUnitName) &&
        Objects.equals(this.dateFrom, requestBodyReusableAddressDetails.dateFrom) &&
        Objects.equals(this.dateUntil, requestBodyReusableAddressDetails.dateUntil) &&
        Objects.equals(this.confidentiality, requestBodyReusableAddressDetails.confidentiality) &&
        Objects.equals(this.additionalLine1, requestBodyReusableAddressDetails.additionalLine1) &&
        Objects.equals(this.beforeAfterCode, requestBodyReusableAddressDetails.beforeAfterCode) &&
        Objects.equals(this.additionalLine2, requestBodyReusableAddressDetails.additionalLine2) &&
        Objects.equals(this.addressCountryCode, requestBodyReusableAddressDetails.addressCountryCode) &&
        Objects.equals(this.addressStreet, requestBodyReusableAddressDetails.addressStreet) &&
        Objects.equals(this.addressHouseNo, requestBodyReusableAddressDetails.addressHouseNo) &&
        Objects.equals(this.cityCode, requestBodyReusableAddressDetails.cityCode) &&
        Objects.equals(this.cityName, requestBodyReusableAddressDetails.cityName) &&
        Objects.equals(this.postCode, requestBodyReusableAddressDetails.postCode) &&
        Objects.equals(this.postName, requestBodyReusableAddressDetails.postName) &&
        Objects.equals(this.countyCode, requestBodyReusableAddressDetails.countyCode) &&
        Objects.equals(this.countyName, requestBodyReusableAddressDetails.countyName) &&
        Objects.equals(this.districtCode, requestBodyReusableAddressDetails.districtCode) &&
        Objects.equals(this.districtName, requestBodyReusableAddressDetails.districtName) &&
        Objects.equals(this.addressLine1, requestBodyReusableAddressDetails.addressLine1) &&
        Objects.equals(this.addressLine2, requestBodyReusableAddressDetails.addressLine2) &&
        Objects.equals(this.addressLine3, requestBodyReusableAddressDetails.addressLine3) &&
        Objects.equals(this.addressLine4, requestBodyReusableAddressDetails.addressLine4) &&
        Objects.equals(this.addressLine5, requestBodyReusableAddressDetails.addressLine5);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressCode, addressType, custOrgUnitCode, custOrgUnitName, dateFrom, dateUntil, confidentiality, additionalLine1, beforeAfterCode, additionalLine2, addressCountryCode, addressStreet, addressHouseNo, cityCode, cityName, postCode, postName, countyCode, countyName, districtCode, districtName, addressLine1, addressLine2, addressLine3, addressLine4, addressLine5);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestBodyReusableAddressDetails {\n");
    
    sb.append("    addressCode: ").append(toIndentedString(addressCode)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    custOrgUnitCode: ").append(toIndentedString(custOrgUnitCode)).append("\n");
    sb.append("    custOrgUnitName: ").append(toIndentedString(custOrgUnitName)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateUntil: ").append(toIndentedString(dateUntil)).append("\n");
    sb.append("    confidentiality: ").append(toIndentedString(confidentiality)).append("\n");
    sb.append("    additionalLine1: ").append(toIndentedString(additionalLine1)).append("\n");
    sb.append("    beforeAfterCode: ").append(toIndentedString(beforeAfterCode)).append("\n");
    sb.append("    additionalLine2: ").append(toIndentedString(additionalLine2)).append("\n");
    sb.append("    addressCountryCode: ").append(toIndentedString(addressCountryCode)).append("\n");
    sb.append("    addressStreet: ").append(toIndentedString(addressStreet)).append("\n");
    sb.append("    addressHouseNo: ").append(toIndentedString(addressHouseNo)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    postName: ").append(toIndentedString(postName)).append("\n");
    sb.append("    countyCode: ").append(toIndentedString(countyCode)).append("\n");
    sb.append("    countyName: ").append(toIndentedString(countyName)).append("\n");
    sb.append("    districtCode: ").append(toIndentedString(districtCode)).append("\n");
    sb.append("    districtName: ").append(toIndentedString(districtName)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    addressLine3: ").append(toIndentedString(addressLine3)).append("\n");
    sb.append("    addressLine4: ").append(toIndentedString(addressLine4)).append("\n");
    sb.append("    addressLine5: ").append(toIndentedString(addressLine5)).append("\n");
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


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HeaderRequest;
import io.swagger.model.RequestBodyCitizenData;
import io.swagger.model.RequestBodyCountryRelationData;
import io.swagger.model.RequestBodyLegalEntityData;
import io.swagger.model.RequestBodyPersonData;
import io.swagger.model.RequestBodyReusableAddressDetails;
import io.swagger.model.RequestBodySocialDemographicData;
import io.swagger.model.RequestInteroperabilityPropertyBlock;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Request Body
 */
@ApiModel(description = "Request Body")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-13T10:34:52.354Z")

public class WS1J02_RequestBody   {
  @JsonProperty("headerRequest")
  private HeaderRequest headerRequest = null;

  @JsonProperty("requestInteroperabilityPropertyBlock")
  private RequestInteroperabilityPropertyBlock requestInteroperabilityPropertyBlock = null;

  @JsonProperty("PersonData")
  private RequestBodyPersonData personData = null;

  @JsonProperty("ReusableAddressDetails")
  private RequestBodyReusableAddressDetails reusableAddressDetails = null;

  @JsonProperty("CountryRelationData")
  @Valid
  private List<RequestBodyCountryRelationData> countryRelationData = null;

  @JsonProperty("CitizenData")
  private RequestBodyCitizenData citizenData = null;

  @JsonProperty("LegalEntityData")
  private RequestBodyLegalEntityData legalEntityData = null;

  @JsonProperty("SocialDemographicData")
  private RequestBodySocialDemographicData socialDemographicData = null;

  public WS1J02_RequestBody headerRequest(HeaderRequest headerRequest) {
    this.headerRequest = headerRequest;
    return this;
  }

  /**
   * Get headerRequest
   * @return headerRequest
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public HeaderRequest getHeaderRequest() {
    return headerRequest;
  }

  public void setHeaderRequest(HeaderRequest headerRequest) {
    this.headerRequest = headerRequest;
  }

  public WS1J02_RequestBody requestInteroperabilityPropertyBlock(RequestInteroperabilityPropertyBlock requestInteroperabilityPropertyBlock) {
    this.requestInteroperabilityPropertyBlock = requestInteroperabilityPropertyBlock;
    return this;
  }

  /**
   * Get requestInteroperabilityPropertyBlock
   * @return requestInteroperabilityPropertyBlock
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public RequestInteroperabilityPropertyBlock getRequestInteroperabilityPropertyBlock() {
    return requestInteroperabilityPropertyBlock;
  }

  public void setRequestInteroperabilityPropertyBlock(RequestInteroperabilityPropertyBlock requestInteroperabilityPropertyBlock) {
    this.requestInteroperabilityPropertyBlock = requestInteroperabilityPropertyBlock;
  }

  public WS1J02_RequestBody personData(RequestBodyPersonData personData) {
    this.personData = personData;
    return this;
  }

  /**
   * Get personData
   * @return personData
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public RequestBodyPersonData getPersonData() {
    return personData;
  }

  public void setPersonData(RequestBodyPersonData personData) {
    this.personData = personData;
  }

  public WS1J02_RequestBody reusableAddressDetails(RequestBodyReusableAddressDetails reusableAddressDetails) {
    this.reusableAddressDetails = reusableAddressDetails;
    return this;
  }

  /**
   * Get reusableAddressDetails
   * @return reusableAddressDetails
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public RequestBodyReusableAddressDetails getReusableAddressDetails() {
    return reusableAddressDetails;
  }

  public void setReusableAddressDetails(RequestBodyReusableAddressDetails reusableAddressDetails) {
    this.reusableAddressDetails = reusableAddressDetails;
  }

  public WS1J02_RequestBody countryRelationData(List<RequestBodyCountryRelationData> countryRelationData) {
    this.countryRelationData = countryRelationData;
    return this;
  }

  public WS1J02_RequestBody addCountryRelationDataItem(RequestBodyCountryRelationData countryRelationDataItem) {
    if (this.countryRelationData == null) {
      this.countryRelationData = new ArrayList<RequestBodyCountryRelationData>();
    }
    this.countryRelationData.add(countryRelationDataItem);
    return this;
  }

  /**
   * Get countryRelationData
   * @return countryRelationData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RequestBodyCountryRelationData> getCountryRelationData() {
    return countryRelationData;
  }

  public void setCountryRelationData(List<RequestBodyCountryRelationData> countryRelationData) {
    this.countryRelationData = countryRelationData;
  }

  public WS1J02_RequestBody citizenData(RequestBodyCitizenData citizenData) {
    this.citizenData = citizenData;
    return this;
  }

  /**
   * Get citizenData
   * @return citizenData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RequestBodyCitizenData getCitizenData() {
    return citizenData;
  }

  public void setCitizenData(RequestBodyCitizenData citizenData) {
    this.citizenData = citizenData;
  }

  public WS1J02_RequestBody legalEntityData(RequestBodyLegalEntityData legalEntityData) {
    this.legalEntityData = legalEntityData;
    return this;
  }

  /**
   * Get legalEntityData
   * @return legalEntityData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RequestBodyLegalEntityData getLegalEntityData() {
    return legalEntityData;
  }

  public void setLegalEntityData(RequestBodyLegalEntityData legalEntityData) {
    this.legalEntityData = legalEntityData;
  }

  public WS1J02_RequestBody socialDemographicData(RequestBodySocialDemographicData socialDemographicData) {
    this.socialDemographicData = socialDemographicData;
    return this;
  }

  /**
   * Get socialDemographicData
   * @return socialDemographicData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RequestBodySocialDemographicData getSocialDemographicData() {
    return socialDemographicData;
  }

  public void setSocialDemographicData(RequestBodySocialDemographicData socialDemographicData) {
    this.socialDemographicData = socialDemographicData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WS1J02_RequestBody requestBody = (WS1J02_RequestBody) o;
    return Objects.equals(this.headerRequest, requestBody.headerRequest) &&
        Objects.equals(this.requestInteroperabilityPropertyBlock, requestBody.requestInteroperabilityPropertyBlock) &&
        Objects.equals(this.personData, requestBody.personData) &&
        Objects.equals(this.reusableAddressDetails, requestBody.reusableAddressDetails) &&
        Objects.equals(this.countryRelationData, requestBody.countryRelationData) &&
        Objects.equals(this.citizenData, requestBody.citizenData) &&
        Objects.equals(this.legalEntityData, requestBody.legalEntityData) &&
        Objects.equals(this.socialDemographicData, requestBody.socialDemographicData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerRequest, requestInteroperabilityPropertyBlock, personData, reusableAddressDetails, countryRelationData, citizenData, legalEntityData, socialDemographicData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WS1J02_RequestBody {\n");
    
    sb.append("    headerRequest: ").append(toIndentedString(headerRequest)).append("\n");
    sb.append("    requestInteroperabilityPropertyBlock: ").append(toIndentedString(requestInteroperabilityPropertyBlock)).append("\n");
    sb.append("    personData: ").append(toIndentedString(personData)).append("\n");
    sb.append("    reusableAddressDetails: ").append(toIndentedString(reusableAddressDetails)).append("\n");
    sb.append("    countryRelationData: ").append(toIndentedString(countryRelationData)).append("\n");
    sb.append("    citizenData: ").append(toIndentedString(citizenData)).append("\n");
    sb.append("    legalEntityData: ").append(toIndentedString(legalEntityData)).append("\n");
    sb.append("    socialDemographicData: ").append(toIndentedString(socialDemographicData)).append("\n");
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


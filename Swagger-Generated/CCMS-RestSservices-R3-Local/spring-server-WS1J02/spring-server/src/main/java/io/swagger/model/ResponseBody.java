package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ExceptionInteroperabilityPropertyBlocks;
import io.swagger.model.HeaderResponse;
import io.swagger.model.ResponseInteroperabilityPropertyBlock;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Response Body
 */
@ApiModel(description = "Response Body")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-13T10:34:52.354Z")

public class ResponseBody   {
  @JsonProperty("headerResponse")
  private HeaderResponse headerResponse = null;

  @JsonProperty("responseInteroperabilityPropertyBlock")
  private ResponseInteroperabilityPropertyBlock responseInteroperabilityPropertyBlock = null;

  @JsonProperty("exceptionInteroperabilityPropertyBlocks")
  private ExceptionInteroperabilityPropertyBlocks exceptionInteroperabilityPropertyBlocks = null;

  @JsonProperty("personId")
  private String personId = null;

  @JsonProperty("internalId")
  private String internalId = null;

  public ResponseBody headerResponse(HeaderResponse headerResponse) {
    this.headerResponse = headerResponse;
    return this;
  }

  /**
   * Get headerResponse
   * @return headerResponse
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public HeaderResponse getHeaderResponse() {
    return headerResponse;
  }

  public void setHeaderResponse(HeaderResponse headerResponse) {
    this.headerResponse = headerResponse;
  }

  public ResponseBody responseInteroperabilityPropertyBlock(ResponseInteroperabilityPropertyBlock responseInteroperabilityPropertyBlock) {
    this.responseInteroperabilityPropertyBlock = responseInteroperabilityPropertyBlock;
    return this;
  }

  /**
   * Get responseInteroperabilityPropertyBlock
   * @return responseInteroperabilityPropertyBlock
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ResponseInteroperabilityPropertyBlock getResponseInteroperabilityPropertyBlock() {
    return responseInteroperabilityPropertyBlock;
  }

  public void setResponseInteroperabilityPropertyBlock(ResponseInteroperabilityPropertyBlock responseInteroperabilityPropertyBlock) {
    this.responseInteroperabilityPropertyBlock = responseInteroperabilityPropertyBlock;
  }

  public ResponseBody exceptionInteroperabilityPropertyBlocks(ExceptionInteroperabilityPropertyBlocks exceptionInteroperabilityPropertyBlocks) {
    this.exceptionInteroperabilityPropertyBlocks = exceptionInteroperabilityPropertyBlocks;
    return this;
  }

  /**
   * Get exceptionInteroperabilityPropertyBlocks
   * @return exceptionInteroperabilityPropertyBlocks
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ExceptionInteroperabilityPropertyBlocks getExceptionInteroperabilityPropertyBlocks() {
    return exceptionInteroperabilityPropertyBlocks;
  }

  public void setExceptionInteroperabilityPropertyBlocks(ExceptionInteroperabilityPropertyBlocks exceptionInteroperabilityPropertyBlocks) {
    this.exceptionInteroperabilityPropertyBlocks = exceptionInteroperabilityPropertyBlocks;
  }

  public ResponseBody personId(String personId) {
    this.personId = personId;
    return this;
  }

  /**
   * Get personId
   * @return personId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=20) 
  public String getPersonId() {
    return personId;
  }

  public void setPersonId(String personId) {
    this.personId = personId;
  }

  public ResponseBody internalId(String internalId) {
    this.internalId = internalId;
    return this;
  }

  /**
   * Get internalId
   * @return internalId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=10) 
  public String getInternalId() {
    return internalId;
  }

  public void setInternalId(String internalId) {
    this.internalId = internalId;
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
        Objects.equals(this.responseInteroperabilityPropertyBlock, responseBody.responseInteroperabilityPropertyBlock) &&
        Objects.equals(this.exceptionInteroperabilityPropertyBlocks, responseBody.exceptionInteroperabilityPropertyBlocks) &&
        Objects.equals(this.personId, responseBody.personId) &&
        Objects.equals(this.internalId, responseBody.internalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerResponse, responseInteroperabilityPropertyBlock, exceptionInteroperabilityPropertyBlocks, personId, internalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBody {\n");
    
    sb.append("    headerResponse: ").append(toIndentedString(headerResponse)).append("\n");
    sb.append("    responseInteroperabilityPropertyBlock: ").append(toIndentedString(responseInteroperabilityPropertyBlock)).append("\n");
    sb.append("    exceptionInteroperabilityPropertyBlocks: ").append(toIndentedString(exceptionInteroperabilityPropertyBlocks)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    internalId: ").append(toIndentedString(internalId)).append("\n");
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


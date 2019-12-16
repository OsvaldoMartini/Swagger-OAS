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
 * Exception Response Body
 */
@ApiModel(description = "Exception Response Body")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-13T10:34:52.354Z")

public class ExceptionResponseBody   {
  @JsonProperty("headerResponse")
  private HeaderResponse headerResponse = null;

  @JsonProperty("responseInteroperabilityPropertyBlock")
  private ResponseInteroperabilityPropertyBlock responseInteroperabilityPropertyBlock = null;

  @JsonProperty("exceptionInteroperabilityPropertyBlocks")
  private ExceptionInteroperabilityPropertyBlocks exceptionInteroperabilityPropertyBlocks = null;

  public ExceptionResponseBody headerResponse(HeaderResponse headerResponse) {
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

  public ExceptionResponseBody responseInteroperabilityPropertyBlock(ResponseInteroperabilityPropertyBlock responseInteroperabilityPropertyBlock) {
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

  public ExceptionResponseBody exceptionInteroperabilityPropertyBlocks(ExceptionInteroperabilityPropertyBlocks exceptionInteroperabilityPropertyBlocks) {
    this.exceptionInteroperabilityPropertyBlocks = exceptionInteroperabilityPropertyBlocks;
    return this;
  }

  /**
   * Get exceptionInteroperabilityPropertyBlocks
   * @return exceptionInteroperabilityPropertyBlocks
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ExceptionInteroperabilityPropertyBlocks getExceptionInteroperabilityPropertyBlocks() {
    return exceptionInteroperabilityPropertyBlocks;
  }

  public void setExceptionInteroperabilityPropertyBlocks(ExceptionInteroperabilityPropertyBlocks exceptionInteroperabilityPropertyBlocks) {
    this.exceptionInteroperabilityPropertyBlocks = exceptionInteroperabilityPropertyBlocks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExceptionResponseBody exceptionResponseBody = (ExceptionResponseBody) o;
    return Objects.equals(this.headerResponse, exceptionResponseBody.headerResponse) &&
        Objects.equals(this.responseInteroperabilityPropertyBlock, exceptionResponseBody.responseInteroperabilityPropertyBlock) &&
        Objects.equals(this.exceptionInteroperabilityPropertyBlocks, exceptionResponseBody.exceptionInteroperabilityPropertyBlocks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerResponse, responseInteroperabilityPropertyBlock, exceptionInteroperabilityPropertyBlocks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExceptionResponseBody {\n");
    
    sb.append("    headerResponse: ").append(toIndentedString(headerResponse)).append("\n");
    sb.append("    responseInteroperabilityPropertyBlock: ").append(toIndentedString(responseInteroperabilityPropertyBlock)).append("\n");
    sb.append("    exceptionInteroperabilityPropertyBlocks: ").append(toIndentedString(exceptionInteroperabilityPropertyBlocks)).append("\n");
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


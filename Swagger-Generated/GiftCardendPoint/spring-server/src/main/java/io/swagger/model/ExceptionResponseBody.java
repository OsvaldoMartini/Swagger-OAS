package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HeaderResponse;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Exception Response Body
 */
@ApiModel(description = "Exception Response Body")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-23T12:46:28.874Z")

public class ExceptionResponseBody   {
  @JsonProperty("headerResponse")
  private HeaderResponse headerResponse = null;

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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExceptionResponseBody exceptionResponseBody = (ExceptionResponseBody) o;
    return Objects.equals(this.headerResponse, exceptionResponseBody.headerResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExceptionResponseBody {\n");
    
    sb.append("    headerResponse: ").append(toIndentedString(headerResponse)).append("\n");
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


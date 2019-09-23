package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HeaderRequest;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Request Body
 */
@ApiModel(description = "Request Body")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-23T12:46:28.874Z")

public class PropertiesRequest   {
  @JsonProperty("headerRequest")
  private HeaderRequest headerRequest = null;

  public PropertiesRequest headerRequest(HeaderRequest headerRequest) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertiesRequest propertiesRequest = (PropertiesRequest) o;
    return Objects.equals(this.headerRequest, propertiesRequest.headerRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertiesRequest {\n");
    
    sb.append("    headerRequest: ").append(toIndentedString(headerRequest)).append("\n");
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


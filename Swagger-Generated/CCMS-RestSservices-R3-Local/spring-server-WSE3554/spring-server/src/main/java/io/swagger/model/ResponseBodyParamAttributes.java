package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseBodyParamAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-09T14:22:50.953Z")

public class ResponseBodyParamAttributes   {
  @JsonProperty("paramAttributeName")
  private String paramAttributeName = null;

  public ResponseBodyParamAttributes paramAttributeName(String paramAttributeName) {
    this.paramAttributeName = paramAttributeName;
    return this;
  }

  /**
   * Get paramAttributeName
   * @return paramAttributeName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=64) 
  public String getParamAttributeName() {
    return paramAttributeName;
  }

  public void setParamAttributeName(String paramAttributeName) {
    this.paramAttributeName = paramAttributeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseBodyParamAttributes responseBodyParamAttributes = (ResponseBodyParamAttributes) o;
    return Objects.equals(this.paramAttributeName, responseBodyParamAttributes.paramAttributeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paramAttributeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBodyParamAttributes {\n");
    
    sb.append("    paramAttributeName: ").append(toIndentedString(paramAttributeName)).append("\n");
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


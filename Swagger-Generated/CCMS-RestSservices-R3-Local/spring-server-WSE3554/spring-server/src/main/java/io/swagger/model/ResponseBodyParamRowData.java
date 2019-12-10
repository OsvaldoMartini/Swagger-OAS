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
 * ResponseBodyParamRowData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-09T14:22:50.953Z")

public class ResponseBodyParamRowData   {
  @JsonProperty("paramAttributeValue")
  private String paramAttributeValue = null;

  public ResponseBodyParamRowData paramAttributeValue(String paramAttributeValue) {
    this.paramAttributeValue = paramAttributeValue;
    return this;
  }

  /**
   * Get paramAttributeValue
   * @return paramAttributeValue
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=128) 
  public String getParamAttributeValue() {
    return paramAttributeValue;
  }

  public void setParamAttributeValue(String paramAttributeValue) {
    this.paramAttributeValue = paramAttributeValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseBodyParamRowData responseBodyParamRowData = (ResponseBodyParamRowData) o;
    return Objects.equals(this.paramAttributeValue, responseBodyParamRowData.paramAttributeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paramAttributeValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBodyParamRowData {\n");
    
    sb.append("    paramAttributeValue: ").append(toIndentedString(paramAttributeValue)).append("\n");
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


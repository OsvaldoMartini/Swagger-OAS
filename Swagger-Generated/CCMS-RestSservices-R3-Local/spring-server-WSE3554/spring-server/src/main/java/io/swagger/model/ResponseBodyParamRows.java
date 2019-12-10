package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ResponseBodyParamRowData;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseBodyParamRows
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-09T14:22:50.953Z")

public class ResponseBodyParamRows   {
  @JsonProperty("ParamRowData")
  @Valid
  private List<ResponseBodyParamRowData> paramRowData = new ArrayList<ResponseBodyParamRowData>();

  public ResponseBodyParamRows paramRowData(List<ResponseBodyParamRowData> paramRowData) {
    this.paramRowData = paramRowData;
    return this;
  }

  public ResponseBodyParamRows addParamRowDataItem(ResponseBodyParamRowData paramRowDataItem) {
    this.paramRowData.add(paramRowDataItem);
    return this;
  }

  /**
   * Get paramRowData
   * @return paramRowData
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min=1) 
  public List<ResponseBodyParamRowData> getParamRowData() {
    return paramRowData;
  }

  public void setParamRowData(List<ResponseBodyParamRowData> paramRowData) {
    this.paramRowData = paramRowData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseBodyParamRows responseBodyParamRows = (ResponseBodyParamRows) o;
    return Objects.equals(this.paramRowData, responseBodyParamRows.paramRowData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paramRowData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBodyParamRows {\n");
    
    sb.append("    paramRowData: ").append(toIndentedString(paramRowData)).append("\n");
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


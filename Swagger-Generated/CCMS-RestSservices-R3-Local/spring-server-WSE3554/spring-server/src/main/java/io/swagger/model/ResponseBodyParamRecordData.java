package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ResponseBodyParamAttributes;
import io.swagger.model.ResponseBodyParamRows;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseBodyParamRecordData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-09T14:22:50.953Z")

public class ResponseBodyParamRecordData   {
  @JsonProperty("ParamAttributes")
  @Valid
  private List<ResponseBodyParamAttributes> paramAttributes = new ArrayList<ResponseBodyParamAttributes>();

  @JsonProperty("ParamRows")
  @Valid
  private List<ResponseBodyParamRows> paramRows = new ArrayList<ResponseBodyParamRows>();

  public ResponseBodyParamRecordData paramAttributes(List<ResponseBodyParamAttributes> paramAttributes) {
    this.paramAttributes = paramAttributes;
    return this;
  }

  public ResponseBodyParamRecordData addParamAttributesItem(ResponseBodyParamAttributes paramAttributesItem) {
    this.paramAttributes.add(paramAttributesItem);
    return this;
  }

  /**
   * Get paramAttributes
   * @return paramAttributes
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min=1) 
  public List<ResponseBodyParamAttributes> getParamAttributes() {
    return paramAttributes;
  }

  public void setParamAttributes(List<ResponseBodyParamAttributes> paramAttributes) {
    this.paramAttributes = paramAttributes;
  }

  public ResponseBodyParamRecordData paramRows(List<ResponseBodyParamRows> paramRows) {
    this.paramRows = paramRows;
    return this;
  }

  public ResponseBodyParamRecordData addParamRowsItem(ResponseBodyParamRows paramRowsItem) {
    this.paramRows.add(paramRowsItem);
    return this;
  }

  /**
   * Get paramRows
   * @return paramRows
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min=1) 
  public List<ResponseBodyParamRows> getParamRows() {
    return paramRows;
  }

  public void setParamRows(List<ResponseBodyParamRows> paramRows) {
    this.paramRows = paramRows;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseBodyParamRecordData responseBodyParamRecordData = (ResponseBodyParamRecordData) o;
    return Objects.equals(this.paramAttributes, responseBodyParamRecordData.paramAttributes) &&
        Objects.equals(this.paramRows, responseBodyParamRecordData.paramRows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paramAttributes, paramRows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBodyParamRecordData {\n");
    
    sb.append("    paramAttributes: ").append(toIndentedString(paramAttributes)).append("\n");
    sb.append("    paramRows: ").append(toIndentedString(paramRows)).append("\n");
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


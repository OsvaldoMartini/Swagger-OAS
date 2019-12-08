package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SortingSortAttribute
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-08T14:47:54.935Z")

public class SortingSortAttribute   {
  @JsonProperty("name")
  private String name = null;

  /**
   * Gets or Sets sortType
   */
  public enum SortTypeEnum {
    ASC("ASC"),
    
    DESC("DESC");

    private String value;

    SortTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SortTypeEnum fromValue(String text) {
      for (SortTypeEnum b : SortTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("sortType")
  private SortTypeEnum sortType = null;

  @JsonProperty("order")
  private String order = null;

  public SortingSortAttribute name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=64) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SortingSortAttribute sortType(SortTypeEnum sortType) {
    this.sortType = sortType;
    return this;
  }

  /**
   * Get sortType
   * @return sortType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public SortTypeEnum getSortType() {
    return sortType;
  }

  public void setSortType(SortTypeEnum sortType) {
    this.sortType = sortType;
  }

  public SortingSortAttribute order(String order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(value = "")

@Size(max=4) 
  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SortingSortAttribute sortingSortAttribute = (SortingSortAttribute) o;
    return Objects.equals(this.name, sortingSortAttribute.name) &&
        Objects.equals(this.sortType, sortingSortAttribute.sortType) &&
        Objects.equals(this.order, sortingSortAttribute.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sortType, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SortingSortAttribute {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sortType: ").append(toIndentedString(sortType)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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


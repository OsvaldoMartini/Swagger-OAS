package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SortingSortAttribute;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SortingSortBlock
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-09T14:22:50.953Z")

public class SortingSortBlock   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("sortAttribute")
  @Valid
  private List<SortingSortAttribute> sortAttribute = new ArrayList<SortingSortAttribute>();

  public SortingSortBlock name(String name) {
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

  public SortingSortBlock sortAttribute(List<SortingSortAttribute> sortAttribute) {
    this.sortAttribute = sortAttribute;
    return this;
  }

  public SortingSortBlock addSortAttributeItem(SortingSortAttribute sortAttributeItem) {
    this.sortAttribute.add(sortAttributeItem);
    return this;
  }

  /**
   * Get sortAttribute
   * @return sortAttribute
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min=1) 
  public List<SortingSortAttribute> getSortAttribute() {
    return sortAttribute;
  }

  public void setSortAttribute(List<SortingSortAttribute> sortAttribute) {
    this.sortAttribute = sortAttribute;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SortingSortBlock sortingSortBlock = (SortingSortBlock) o;
    return Objects.equals(this.name, sortingSortBlock.name) &&
        Objects.equals(this.sortAttribute, sortingSortBlock.sortAttribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sortAttribute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SortingSortBlock {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sortAttribute: ").append(toIndentedString(sortAttribute)).append("\n");
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


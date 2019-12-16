package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestBodyLegalEntityData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-13T10:34:52.354Z")

public class RequestBodyLegalEntityData   {
  @JsonProperty("companyName")
  private String companyName = null;

  @JsonProperty("fullName")
  private String fullName = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("ownerId")
  private String ownerId = null;

  @JsonProperty("ownerName")
  private String ownerName = null;

  @JsonProperty("ownerId2")
  private String ownerId2 = null;

  @JsonProperty("personCode")
  private String personCode = null;

  @JsonProperty("activity")
  private String activity = null;

  @JsonProperty("mainPhoneNo")
  private String mainPhoneNo = null;

  @JsonProperty("mainFaxNo")
  private String mainFaxNo = null;

  @JsonProperty("mainMobilePhoneNo")
  private String mainMobilePhoneNo = null;

  @JsonProperty("employer")
  private String employer = null;

  @JsonProperty("shareholder")
  private String shareholder = null;

  @JsonProperty("sharehDomCountry")
  private String sharehDomCountry = null;

  @JsonProperty("sharehChainLength")
  private Integer sharehChainLength = null;

  @JsonProperty("depositor")
  private String depositor = null;

  @JsonProperty("capitalDomCountry")
  private String capitalDomCountry = null;

  @JsonProperty("organizationForm")
  private String organizationForm = null;

  @JsonProperty("totalIncome")
  private BigDecimal totalIncome = null;

  @JsonProperty("noOfEmployees")
  private Integer noOfEmployees = null;

  @JsonProperty("foundationDate")
  private LocalDate foundationDate = null;

  @JsonProperty("bankruptcyDate")
  private LocalDate bankruptcyDate = null;

  @JsonProperty("liquidationDate")
  private LocalDate liquidationDate = null;

  @JsonProperty("nonResidentSector")
  private String nonResidentSector = null;

  @JsonProperty("intes")
  private String intes = null;

  @JsonProperty("rating")
  private String rating = null;

  @JsonProperty("gvIndicativeData1")
  private String gvIndicativeData1 = null;

  @JsonProperty("gvIndicativeData2")
  private String gvIndicativeData2 = null;

  @JsonProperty("gvIndicativeData3")
  private String gvIndicativeData3 = null;

  @JsonProperty("gvIndicativeData4")
  private String gvIndicativeData4 = null;

  @JsonProperty("gvIndicativeData5")
  private String gvIndicativeData5 = null;

  @JsonProperty("gvIndicativeData6")
  private String gvIndicativeData6 = null;

  public RequestBodyLegalEntityData companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName
   * @return companyName
  **/
  @ApiModelProperty(value = "")

@Size(max=128) 
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public RequestBodyLegalEntityData fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Get fullName
   * @return fullName
  **/
  @ApiModelProperty(value = "")

@Size(max=440) 
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public RequestBodyLegalEntityData code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")

@Size(max=16) 
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public RequestBodyLegalEntityData ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Get ownerId
   * @return ownerId
  **/
  @ApiModelProperty(value = "")

@Size(max=16) 
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public RequestBodyLegalEntityData ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

  /**
   * Get ownerName
   * @return ownerName
  **/
  @ApiModelProperty(value = "")

@Size(max=128) 
  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public RequestBodyLegalEntityData ownerId2(String ownerId2) {
    this.ownerId2 = ownerId2;
    return this;
  }

  /**
   * Get ownerId2
   * @return ownerId2
  **/
  @ApiModelProperty(value = "")

@Size(max=16) 
  public String getOwnerId2() {
    return ownerId2;
  }

  public void setOwnerId2(String ownerId2) {
    this.ownerId2 = ownerId2;
  }

  public RequestBodyLegalEntityData personCode(String personCode) {
    this.personCode = personCode;
    return this;
  }

  /**
   * Get personCode
   * @return personCode
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getPersonCode() {
    return personCode;
  }

  public void setPersonCode(String personCode) {
    this.personCode = personCode;
  }

  public RequestBodyLegalEntityData activity(String activity) {
    this.activity = activity;
    return this;
  }

  /**
   * Get activity
   * @return activity
  **/
  @ApiModelProperty(value = "")

@Size(max=5) 
  public String getActivity() {
    return activity;
  }

  public void setActivity(String activity) {
    this.activity = activity;
  }

  public RequestBodyLegalEntityData mainPhoneNo(String mainPhoneNo) {
    this.mainPhoneNo = mainPhoneNo;
    return this;
  }

  /**
   * Get mainPhoneNo
   * @return mainPhoneNo
  **/
  @ApiModelProperty(value = "")

@Size(max=32) 
  public String getMainPhoneNo() {
    return mainPhoneNo;
  }

  public void setMainPhoneNo(String mainPhoneNo) {
    this.mainPhoneNo = mainPhoneNo;
  }

  public RequestBodyLegalEntityData mainFaxNo(String mainFaxNo) {
    this.mainFaxNo = mainFaxNo;
    return this;
  }

  /**
   * Get mainFaxNo
   * @return mainFaxNo
  **/
  @ApiModelProperty(value = "")

@Size(max=32) 
  public String getMainFaxNo() {
    return mainFaxNo;
  }

  public void setMainFaxNo(String mainFaxNo) {
    this.mainFaxNo = mainFaxNo;
  }

  public RequestBodyLegalEntityData mainMobilePhoneNo(String mainMobilePhoneNo) {
    this.mainMobilePhoneNo = mainMobilePhoneNo;
    return this;
  }

  /**
   * Get mainMobilePhoneNo
   * @return mainMobilePhoneNo
  **/
  @ApiModelProperty(value = "")

@Size(max=32) 
  public String getMainMobilePhoneNo() {
    return mainMobilePhoneNo;
  }

  public void setMainMobilePhoneNo(String mainMobilePhoneNo) {
    this.mainMobilePhoneNo = mainMobilePhoneNo;
  }

  public RequestBodyLegalEntityData employer(String employer) {
    this.employer = employer;
    return this;
  }

  /**
   * Get employer
   * @return employer
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getEmployer() {
    return employer;
  }

  public void setEmployer(String employer) {
    this.employer = employer;
  }

  public RequestBodyLegalEntityData shareholder(String shareholder) {
    this.shareholder = shareholder;
    return this;
  }

  /**
   * Get shareholder
   * @return shareholder
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getShareholder() {
    return shareholder;
  }

  public void setShareholder(String shareholder) {
    this.shareholder = shareholder;
  }

  public RequestBodyLegalEntityData sharehDomCountry(String sharehDomCountry) {
    this.sharehDomCountry = sharehDomCountry;
    return this;
  }

  /**
   * Get sharehDomCountry
   * @return sharehDomCountry
  **/
  @ApiModelProperty(value = "")

@Size(max=3) 
  public String getSharehDomCountry() {
    return sharehDomCountry;
  }

  public void setSharehDomCountry(String sharehDomCountry) {
    this.sharehDomCountry = sharehDomCountry;
  }

  public RequestBodyLegalEntityData sharehChainLength(Integer sharehChainLength) {
    this.sharehChainLength = sharehChainLength;
    return this;
  }

  /**
   * Get sharehChainLength
   * @return sharehChainLength
  **/
  @ApiModelProperty(value = "")


  public Integer getSharehChainLength() {
    return sharehChainLength;
  }

  public void setSharehChainLength(Integer sharehChainLength) {
    this.sharehChainLength = sharehChainLength;
  }

  public RequestBodyLegalEntityData depositor(String depositor) {
    this.depositor = depositor;
    return this;
  }

  /**
   * Get depositor
   * @return depositor
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getDepositor() {
    return depositor;
  }

  public void setDepositor(String depositor) {
    this.depositor = depositor;
  }

  public RequestBodyLegalEntityData capitalDomCountry(String capitalDomCountry) {
    this.capitalDomCountry = capitalDomCountry;
    return this;
  }

  /**
   * Get capitalDomCountry
   * @return capitalDomCountry
  **/
  @ApiModelProperty(value = "")

@Size(max=3) 
  public String getCapitalDomCountry() {
    return capitalDomCountry;
  }

  public void setCapitalDomCountry(String capitalDomCountry) {
    this.capitalDomCountry = capitalDomCountry;
  }

  public RequestBodyLegalEntityData organizationForm(String organizationForm) {
    this.organizationForm = organizationForm;
    return this;
  }

  /**
   * Get organizationForm
   * @return organizationForm
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getOrganizationForm() {
    return organizationForm;
  }

  public void setOrganizationForm(String organizationForm) {
    this.organizationForm = organizationForm;
  }

  public RequestBodyLegalEntityData totalIncome(BigDecimal totalIncome) {
    this.totalIncome = totalIncome;
    return this;
  }

  /**
   * Get totalIncome
   * @return totalIncome
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getTotalIncome() {
    return totalIncome;
  }

  public void setTotalIncome(BigDecimal totalIncome) {
    this.totalIncome = totalIncome;
  }

  public RequestBodyLegalEntityData noOfEmployees(Integer noOfEmployees) {
    this.noOfEmployees = noOfEmployees;
    return this;
  }

  /**
   * Get noOfEmployees
   * @return noOfEmployees
  **/
  @ApiModelProperty(value = "")


  public Integer getNoOfEmployees() {
    return noOfEmployees;
  }

  public void setNoOfEmployees(Integer noOfEmployees) {
    this.noOfEmployees = noOfEmployees;
  }

  public RequestBodyLegalEntityData foundationDate(LocalDate foundationDate) {
    this.foundationDate = foundationDate;
    return this;
  }

  /**
   * Get foundationDate
   * @return foundationDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getFoundationDate() {
    return foundationDate;
  }

  public void setFoundationDate(LocalDate foundationDate) {
    this.foundationDate = foundationDate;
  }

  public RequestBodyLegalEntityData bankruptcyDate(LocalDate bankruptcyDate) {
    this.bankruptcyDate = bankruptcyDate;
    return this;
  }

  /**
   * Get bankruptcyDate
   * @return bankruptcyDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getBankruptcyDate() {
    return bankruptcyDate;
  }

  public void setBankruptcyDate(LocalDate bankruptcyDate) {
    this.bankruptcyDate = bankruptcyDate;
  }

  public RequestBodyLegalEntityData liquidationDate(LocalDate liquidationDate) {
    this.liquidationDate = liquidationDate;
    return this;
  }

  /**
   * Get liquidationDate
   * @return liquidationDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getLiquidationDate() {
    return liquidationDate;
  }

  public void setLiquidationDate(LocalDate liquidationDate) {
    this.liquidationDate = liquidationDate;
  }

  public RequestBodyLegalEntityData nonResidentSector(String nonResidentSector) {
    this.nonResidentSector = nonResidentSector;
    return this;
  }

  /**
   * Get nonResidentSector
   * @return nonResidentSector
  **/
  @ApiModelProperty(value = "")

@Size(max=4) 
  public String getNonResidentSector() {
    return nonResidentSector;
  }

  public void setNonResidentSector(String nonResidentSector) {
    this.nonResidentSector = nonResidentSector;
  }

  public RequestBodyLegalEntityData intes(String intes) {
    this.intes = intes;
    return this;
  }

  /**
   * Get intes
   * @return intes
  **/
  @ApiModelProperty(value = "")

@Size(max=4) 
  public String getIntes() {
    return intes;
  }

  public void setIntes(String intes) {
    this.intes = intes;
  }

  public RequestBodyLegalEntityData rating(String rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * @return rating
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }

  public RequestBodyLegalEntityData gvIndicativeData1(String gvIndicativeData1) {
    this.gvIndicativeData1 = gvIndicativeData1;
    return this;
  }

  /**
   * Get gvIndicativeData1
   * @return gvIndicativeData1
  **/
  @ApiModelProperty(value = "")

@Size(max=20) 
  public String getGvIndicativeData1() {
    return gvIndicativeData1;
  }

  public void setGvIndicativeData1(String gvIndicativeData1) {
    this.gvIndicativeData1 = gvIndicativeData1;
  }

  public RequestBodyLegalEntityData gvIndicativeData2(String gvIndicativeData2) {
    this.gvIndicativeData2 = gvIndicativeData2;
    return this;
  }

  /**
   * Get gvIndicativeData2
   * @return gvIndicativeData2
  **/
  @ApiModelProperty(value = "")

@Size(max=20) 
  public String getGvIndicativeData2() {
    return gvIndicativeData2;
  }

  public void setGvIndicativeData2(String gvIndicativeData2) {
    this.gvIndicativeData2 = gvIndicativeData2;
  }

  public RequestBodyLegalEntityData gvIndicativeData3(String gvIndicativeData3) {
    this.gvIndicativeData3 = gvIndicativeData3;
    return this;
  }

  /**
   * Get gvIndicativeData3
   * @return gvIndicativeData3
  **/
  @ApiModelProperty(value = "")

@Size(max=20) 
  public String getGvIndicativeData3() {
    return gvIndicativeData3;
  }

  public void setGvIndicativeData3(String gvIndicativeData3) {
    this.gvIndicativeData3 = gvIndicativeData3;
  }

  public RequestBodyLegalEntityData gvIndicativeData4(String gvIndicativeData4) {
    this.gvIndicativeData4 = gvIndicativeData4;
    return this;
  }

  /**
   * Get gvIndicativeData4
   * @return gvIndicativeData4
  **/
  @ApiModelProperty(value = "")

@Size(max=20) 
  public String getGvIndicativeData4() {
    return gvIndicativeData4;
  }

  public void setGvIndicativeData4(String gvIndicativeData4) {
    this.gvIndicativeData4 = gvIndicativeData4;
  }

  public RequestBodyLegalEntityData gvIndicativeData5(String gvIndicativeData5) {
    this.gvIndicativeData5 = gvIndicativeData5;
    return this;
  }

  /**
   * Get gvIndicativeData5
   * @return gvIndicativeData5
  **/
  @ApiModelProperty(value = "")

@Size(max=20) 
  public String getGvIndicativeData5() {
    return gvIndicativeData5;
  }

  public void setGvIndicativeData5(String gvIndicativeData5) {
    this.gvIndicativeData5 = gvIndicativeData5;
  }

  public RequestBodyLegalEntityData gvIndicativeData6(String gvIndicativeData6) {
    this.gvIndicativeData6 = gvIndicativeData6;
    return this;
  }

  /**
   * Get gvIndicativeData6
   * @return gvIndicativeData6
  **/
  @ApiModelProperty(value = "")

@Size(max=20) 
  public String getGvIndicativeData6() {
    return gvIndicativeData6;
  }

  public void setGvIndicativeData6(String gvIndicativeData6) {
    this.gvIndicativeData6 = gvIndicativeData6;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestBodyLegalEntityData requestBodyLegalEntityData = (RequestBodyLegalEntityData) o;
    return Objects.equals(this.companyName, requestBodyLegalEntityData.companyName) &&
        Objects.equals(this.fullName, requestBodyLegalEntityData.fullName) &&
        Objects.equals(this.code, requestBodyLegalEntityData.code) &&
        Objects.equals(this.ownerId, requestBodyLegalEntityData.ownerId) &&
        Objects.equals(this.ownerName, requestBodyLegalEntityData.ownerName) &&
        Objects.equals(this.ownerId2, requestBodyLegalEntityData.ownerId2) &&
        Objects.equals(this.personCode, requestBodyLegalEntityData.personCode) &&
        Objects.equals(this.activity, requestBodyLegalEntityData.activity) &&
        Objects.equals(this.mainPhoneNo, requestBodyLegalEntityData.mainPhoneNo) &&
        Objects.equals(this.mainFaxNo, requestBodyLegalEntityData.mainFaxNo) &&
        Objects.equals(this.mainMobilePhoneNo, requestBodyLegalEntityData.mainMobilePhoneNo) &&
        Objects.equals(this.employer, requestBodyLegalEntityData.employer) &&
        Objects.equals(this.shareholder, requestBodyLegalEntityData.shareholder) &&
        Objects.equals(this.sharehDomCountry, requestBodyLegalEntityData.sharehDomCountry) &&
        Objects.equals(this.sharehChainLength, requestBodyLegalEntityData.sharehChainLength) &&
        Objects.equals(this.depositor, requestBodyLegalEntityData.depositor) &&
        Objects.equals(this.capitalDomCountry, requestBodyLegalEntityData.capitalDomCountry) &&
        Objects.equals(this.organizationForm, requestBodyLegalEntityData.organizationForm) &&
        Objects.equals(this.totalIncome, requestBodyLegalEntityData.totalIncome) &&
        Objects.equals(this.noOfEmployees, requestBodyLegalEntityData.noOfEmployees) &&
        Objects.equals(this.foundationDate, requestBodyLegalEntityData.foundationDate) &&
        Objects.equals(this.bankruptcyDate, requestBodyLegalEntityData.bankruptcyDate) &&
        Objects.equals(this.liquidationDate, requestBodyLegalEntityData.liquidationDate) &&
        Objects.equals(this.nonResidentSector, requestBodyLegalEntityData.nonResidentSector) &&
        Objects.equals(this.intes, requestBodyLegalEntityData.intes) &&
        Objects.equals(this.rating, requestBodyLegalEntityData.rating) &&
        Objects.equals(this.gvIndicativeData1, requestBodyLegalEntityData.gvIndicativeData1) &&
        Objects.equals(this.gvIndicativeData2, requestBodyLegalEntityData.gvIndicativeData2) &&
        Objects.equals(this.gvIndicativeData3, requestBodyLegalEntityData.gvIndicativeData3) &&
        Objects.equals(this.gvIndicativeData4, requestBodyLegalEntityData.gvIndicativeData4) &&
        Objects.equals(this.gvIndicativeData5, requestBodyLegalEntityData.gvIndicativeData5) &&
        Objects.equals(this.gvIndicativeData6, requestBodyLegalEntityData.gvIndicativeData6);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyName, fullName, code, ownerId, ownerName, ownerId2, personCode, activity, mainPhoneNo, mainFaxNo, mainMobilePhoneNo, employer, shareholder, sharehDomCountry, sharehChainLength, depositor, capitalDomCountry, organizationForm, totalIncome, noOfEmployees, foundationDate, bankruptcyDate, liquidationDate, nonResidentSector, intes, rating, gvIndicativeData1, gvIndicativeData2, gvIndicativeData3, gvIndicativeData4, gvIndicativeData5, gvIndicativeData6);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestBodyLegalEntityData {\n");
    
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    ownerId2: ").append(toIndentedString(ownerId2)).append("\n");
    sb.append("    personCode: ").append(toIndentedString(personCode)).append("\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    mainPhoneNo: ").append(toIndentedString(mainPhoneNo)).append("\n");
    sb.append("    mainFaxNo: ").append(toIndentedString(mainFaxNo)).append("\n");
    sb.append("    mainMobilePhoneNo: ").append(toIndentedString(mainMobilePhoneNo)).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    shareholder: ").append(toIndentedString(shareholder)).append("\n");
    sb.append("    sharehDomCountry: ").append(toIndentedString(sharehDomCountry)).append("\n");
    sb.append("    sharehChainLength: ").append(toIndentedString(sharehChainLength)).append("\n");
    sb.append("    depositor: ").append(toIndentedString(depositor)).append("\n");
    sb.append("    capitalDomCountry: ").append(toIndentedString(capitalDomCountry)).append("\n");
    sb.append("    organizationForm: ").append(toIndentedString(organizationForm)).append("\n");
    sb.append("    totalIncome: ").append(toIndentedString(totalIncome)).append("\n");
    sb.append("    noOfEmployees: ").append(toIndentedString(noOfEmployees)).append("\n");
    sb.append("    foundationDate: ").append(toIndentedString(foundationDate)).append("\n");
    sb.append("    bankruptcyDate: ").append(toIndentedString(bankruptcyDate)).append("\n");
    sb.append("    liquidationDate: ").append(toIndentedString(liquidationDate)).append("\n");
    sb.append("    nonResidentSector: ").append(toIndentedString(nonResidentSector)).append("\n");
    sb.append("    intes: ").append(toIndentedString(intes)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    gvIndicativeData1: ").append(toIndentedString(gvIndicativeData1)).append("\n");
    sb.append("    gvIndicativeData2: ").append(toIndentedString(gvIndicativeData2)).append("\n");
    sb.append("    gvIndicativeData3: ").append(toIndentedString(gvIndicativeData3)).append("\n");
    sb.append("    gvIndicativeData4: ").append(toIndentedString(gvIndicativeData4)).append("\n");
    sb.append("    gvIndicativeData5: ").append(toIndentedString(gvIndicativeData5)).append("\n");
    sb.append("    gvIndicativeData6: ").append(toIndentedString(gvIndicativeData6)).append("\n");
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


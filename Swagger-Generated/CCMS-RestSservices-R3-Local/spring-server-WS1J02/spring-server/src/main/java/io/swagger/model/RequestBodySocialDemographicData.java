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
 * RequestBodySocialDemographicData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-13T10:34:52.354Z")

public class RequestBodySocialDemographicData   {
  @JsonProperty("maritalStatusCode")
  private String maritalStatusCode = null;

  @JsonProperty("personMaidenName")
  private String personMaidenName = null;

  @JsonProperty("numberOfKeptPersons")
  private Integer numberOfKeptPersons = null;

  @JsonProperty("durationOfCurrentEmployment")
  private Integer durationOfCurrentEmployment = null;

  @JsonProperty("durationOfEmployment")
  private Integer durationOfEmployment = null;

  @JsonProperty("employmentTypeCode")
  private String employmentTypeCode = null;

  @JsonProperty("dateFromCurrentEmployment")
  private LocalDate dateFromCurrentEmployment = null;

  @JsonProperty("dateToCurrentEmployment")
  private LocalDate dateToCurrentEmployment = null;

  @JsonProperty("educationLevelCode")
  private String educationLevelCode = null;

  @JsonProperty("salaryPensionAmount")
  private BigDecimal salaryPensionAmount = null;

  @JsonProperty("salaryPensionCurrencyCode")
  private String salaryPensionCurrencyCode = null;

  @JsonProperty("grossSalaryAmount")
  private BigDecimal grossSalaryAmount = null;

  @JsonProperty("grossSalaryCurrencyCode")
  private String grossSalaryCurrencyCode = null;

  @JsonProperty("householdMonthlyExpensesAmount")
  private BigDecimal householdMonthlyExpensesAmount = null;

  @JsonProperty("householdMonthlyExpensesCurrencyCode")
  private String householdMonthlyExpensesCurrencyCode = null;

  @JsonProperty("previousLoansAmount")
  private BigDecimal previousLoansAmount = null;

  @JsonProperty("previousLoansCurrencyCode")
  private String previousLoansCurrencyCode = null;

  @JsonProperty("residentialStatusCode")
  private String residentialStatusCode = null;

  @JsonProperty("nationalityCode")
  private String nationalityCode = null;

  @JsonProperty("timeAtCurrentAddressCode")
  private String timeAtCurrentAddressCode = null;

  public RequestBodySocialDemographicData maritalStatusCode(String maritalStatusCode) {
    this.maritalStatusCode = maritalStatusCode;
    return this;
  }

  /**
   * Get maritalStatusCode
   * @return maritalStatusCode
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getMaritalStatusCode() {
    return maritalStatusCode;
  }

  public void setMaritalStatusCode(String maritalStatusCode) {
    this.maritalStatusCode = maritalStatusCode;
  }

  public RequestBodySocialDemographicData personMaidenName(String personMaidenName) {
    this.personMaidenName = personMaidenName;
    return this;
  }

  /**
   * Get personMaidenName
   * @return personMaidenName
  **/
  @ApiModelProperty(value = "")

@Size(max=64) 
  public String getPersonMaidenName() {
    return personMaidenName;
  }

  public void setPersonMaidenName(String personMaidenName) {
    this.personMaidenName = personMaidenName;
  }

  public RequestBodySocialDemographicData numberOfKeptPersons(Integer numberOfKeptPersons) {
    this.numberOfKeptPersons = numberOfKeptPersons;
    return this;
  }

  /**
   * Get numberOfKeptPersons
   * @return numberOfKeptPersons
  **/
  @ApiModelProperty(value = "")


  public Integer getNumberOfKeptPersons() {
    return numberOfKeptPersons;
  }

  public void setNumberOfKeptPersons(Integer numberOfKeptPersons) {
    this.numberOfKeptPersons = numberOfKeptPersons;
  }

  public RequestBodySocialDemographicData durationOfCurrentEmployment(Integer durationOfCurrentEmployment) {
    this.durationOfCurrentEmployment = durationOfCurrentEmployment;
    return this;
  }

  /**
   * Get durationOfCurrentEmployment
   * @return durationOfCurrentEmployment
  **/
  @ApiModelProperty(value = "")


  public Integer getDurationOfCurrentEmployment() {
    return durationOfCurrentEmployment;
  }

  public void setDurationOfCurrentEmployment(Integer durationOfCurrentEmployment) {
    this.durationOfCurrentEmployment = durationOfCurrentEmployment;
  }

  public RequestBodySocialDemographicData durationOfEmployment(Integer durationOfEmployment) {
    this.durationOfEmployment = durationOfEmployment;
    return this;
  }

  /**
   * Get durationOfEmployment
   * @return durationOfEmployment
  **/
  @ApiModelProperty(value = "")


  public Integer getDurationOfEmployment() {
    return durationOfEmployment;
  }

  public void setDurationOfEmployment(Integer durationOfEmployment) {
    this.durationOfEmployment = durationOfEmployment;
  }

  public RequestBodySocialDemographicData employmentTypeCode(String employmentTypeCode) {
    this.employmentTypeCode = employmentTypeCode;
    return this;
  }

  /**
   * Get employmentTypeCode
   * @return employmentTypeCode
  **/
  @ApiModelProperty(value = "")

@Size(max=2) 
  public String getEmploymentTypeCode() {
    return employmentTypeCode;
  }

  public void setEmploymentTypeCode(String employmentTypeCode) {
    this.employmentTypeCode = employmentTypeCode;
  }

  public RequestBodySocialDemographicData dateFromCurrentEmployment(LocalDate dateFromCurrentEmployment) {
    this.dateFromCurrentEmployment = dateFromCurrentEmployment;
    return this;
  }

  /**
   * Get dateFromCurrentEmployment
   * @return dateFromCurrentEmployment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDateFromCurrentEmployment() {
    return dateFromCurrentEmployment;
  }

  public void setDateFromCurrentEmployment(LocalDate dateFromCurrentEmployment) {
    this.dateFromCurrentEmployment = dateFromCurrentEmployment;
  }

  public RequestBodySocialDemographicData dateToCurrentEmployment(LocalDate dateToCurrentEmployment) {
    this.dateToCurrentEmployment = dateToCurrentEmployment;
    return this;
  }

  /**
   * Get dateToCurrentEmployment
   * @return dateToCurrentEmployment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDateToCurrentEmployment() {
    return dateToCurrentEmployment;
  }

  public void setDateToCurrentEmployment(LocalDate dateToCurrentEmployment) {
    this.dateToCurrentEmployment = dateToCurrentEmployment;
  }

  public RequestBodySocialDemographicData educationLevelCode(String educationLevelCode) {
    this.educationLevelCode = educationLevelCode;
    return this;
  }

  /**
   * Get educationLevelCode
   * @return educationLevelCode
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getEducationLevelCode() {
    return educationLevelCode;
  }

  public void setEducationLevelCode(String educationLevelCode) {
    this.educationLevelCode = educationLevelCode;
  }

  public RequestBodySocialDemographicData salaryPensionAmount(BigDecimal salaryPensionAmount) {
    this.salaryPensionAmount = salaryPensionAmount;
    return this;
  }

  /**
   * Get salaryPensionAmount
   * @return salaryPensionAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getSalaryPensionAmount() {
    return salaryPensionAmount;
  }

  public void setSalaryPensionAmount(BigDecimal salaryPensionAmount) {
    this.salaryPensionAmount = salaryPensionAmount;
  }

  public RequestBodySocialDemographicData salaryPensionCurrencyCode(String salaryPensionCurrencyCode) {
    this.salaryPensionCurrencyCode = salaryPensionCurrencyCode;
    return this;
  }

  /**
   * Get salaryPensionCurrencyCode
   * @return salaryPensionCurrencyCode
  **/
  @ApiModelProperty(value = "")

@Size(max=3) 
  public String getSalaryPensionCurrencyCode() {
    return salaryPensionCurrencyCode;
  }

  public void setSalaryPensionCurrencyCode(String salaryPensionCurrencyCode) {
    this.salaryPensionCurrencyCode = salaryPensionCurrencyCode;
  }

  public RequestBodySocialDemographicData grossSalaryAmount(BigDecimal grossSalaryAmount) {
    this.grossSalaryAmount = grossSalaryAmount;
    return this;
  }

  /**
   * Get grossSalaryAmount
   * @return grossSalaryAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getGrossSalaryAmount() {
    return grossSalaryAmount;
  }

  public void setGrossSalaryAmount(BigDecimal grossSalaryAmount) {
    this.grossSalaryAmount = grossSalaryAmount;
  }

  public RequestBodySocialDemographicData grossSalaryCurrencyCode(String grossSalaryCurrencyCode) {
    this.grossSalaryCurrencyCode = grossSalaryCurrencyCode;
    return this;
  }

  /**
   * Get grossSalaryCurrencyCode
   * @return grossSalaryCurrencyCode
  **/
  @ApiModelProperty(value = "")

@Size(max=3) 
  public String getGrossSalaryCurrencyCode() {
    return grossSalaryCurrencyCode;
  }

  public void setGrossSalaryCurrencyCode(String grossSalaryCurrencyCode) {
    this.grossSalaryCurrencyCode = grossSalaryCurrencyCode;
  }

  public RequestBodySocialDemographicData householdMonthlyExpensesAmount(BigDecimal householdMonthlyExpensesAmount) {
    this.householdMonthlyExpensesAmount = householdMonthlyExpensesAmount;
    return this;
  }

  /**
   * Get householdMonthlyExpensesAmount
   * @return householdMonthlyExpensesAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getHouseholdMonthlyExpensesAmount() {
    return householdMonthlyExpensesAmount;
  }

  public void setHouseholdMonthlyExpensesAmount(BigDecimal householdMonthlyExpensesAmount) {
    this.householdMonthlyExpensesAmount = householdMonthlyExpensesAmount;
  }

  public RequestBodySocialDemographicData householdMonthlyExpensesCurrencyCode(String householdMonthlyExpensesCurrencyCode) {
    this.householdMonthlyExpensesCurrencyCode = householdMonthlyExpensesCurrencyCode;
    return this;
  }

  /**
   * Get householdMonthlyExpensesCurrencyCode
   * @return householdMonthlyExpensesCurrencyCode
  **/
  @ApiModelProperty(value = "")

@Size(max=3) 
  public String getHouseholdMonthlyExpensesCurrencyCode() {
    return householdMonthlyExpensesCurrencyCode;
  }

  public void setHouseholdMonthlyExpensesCurrencyCode(String householdMonthlyExpensesCurrencyCode) {
    this.householdMonthlyExpensesCurrencyCode = householdMonthlyExpensesCurrencyCode;
  }

  public RequestBodySocialDemographicData previousLoansAmount(BigDecimal previousLoansAmount) {
    this.previousLoansAmount = previousLoansAmount;
    return this;
  }

  /**
   * Get previousLoansAmount
   * @return previousLoansAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getPreviousLoansAmount() {
    return previousLoansAmount;
  }

  public void setPreviousLoansAmount(BigDecimal previousLoansAmount) {
    this.previousLoansAmount = previousLoansAmount;
  }

  public RequestBodySocialDemographicData previousLoansCurrencyCode(String previousLoansCurrencyCode) {
    this.previousLoansCurrencyCode = previousLoansCurrencyCode;
    return this;
  }

  /**
   * Get previousLoansCurrencyCode
   * @return previousLoansCurrencyCode
  **/
  @ApiModelProperty(value = "")

@Size(max=3) 
  public String getPreviousLoansCurrencyCode() {
    return previousLoansCurrencyCode;
  }

  public void setPreviousLoansCurrencyCode(String previousLoansCurrencyCode) {
    this.previousLoansCurrencyCode = previousLoansCurrencyCode;
  }

  public RequestBodySocialDemographicData residentialStatusCode(String residentialStatusCode) {
    this.residentialStatusCode = residentialStatusCode;
    return this;
  }

  /**
   * Get residentialStatusCode
   * @return residentialStatusCode
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getResidentialStatusCode() {
    return residentialStatusCode;
  }

  public void setResidentialStatusCode(String residentialStatusCode) {
    this.residentialStatusCode = residentialStatusCode;
  }

  public RequestBodySocialDemographicData nationalityCode(String nationalityCode) {
    this.nationalityCode = nationalityCode;
    return this;
  }

  /**
   * Get nationalityCode
   * @return nationalityCode
  **/
  @ApiModelProperty(value = "")

@Size(max=3) 
  public String getNationalityCode() {
    return nationalityCode;
  }

  public void setNationalityCode(String nationalityCode) {
    this.nationalityCode = nationalityCode;
  }

  public RequestBodySocialDemographicData timeAtCurrentAddressCode(String timeAtCurrentAddressCode) {
    this.timeAtCurrentAddressCode = timeAtCurrentAddressCode;
    return this;
  }

  /**
   * Get timeAtCurrentAddressCode
   * @return timeAtCurrentAddressCode
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getTimeAtCurrentAddressCode() {
    return timeAtCurrentAddressCode;
  }

  public void setTimeAtCurrentAddressCode(String timeAtCurrentAddressCode) {
    this.timeAtCurrentAddressCode = timeAtCurrentAddressCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestBodySocialDemographicData requestBodySocialDemographicData = (RequestBodySocialDemographicData) o;
    return Objects.equals(this.maritalStatusCode, requestBodySocialDemographicData.maritalStatusCode) &&
        Objects.equals(this.personMaidenName, requestBodySocialDemographicData.personMaidenName) &&
        Objects.equals(this.numberOfKeptPersons, requestBodySocialDemographicData.numberOfKeptPersons) &&
        Objects.equals(this.durationOfCurrentEmployment, requestBodySocialDemographicData.durationOfCurrentEmployment) &&
        Objects.equals(this.durationOfEmployment, requestBodySocialDemographicData.durationOfEmployment) &&
        Objects.equals(this.employmentTypeCode, requestBodySocialDemographicData.employmentTypeCode) &&
        Objects.equals(this.dateFromCurrentEmployment, requestBodySocialDemographicData.dateFromCurrentEmployment) &&
        Objects.equals(this.dateToCurrentEmployment, requestBodySocialDemographicData.dateToCurrentEmployment) &&
        Objects.equals(this.educationLevelCode, requestBodySocialDemographicData.educationLevelCode) &&
        Objects.equals(this.salaryPensionAmount, requestBodySocialDemographicData.salaryPensionAmount) &&
        Objects.equals(this.salaryPensionCurrencyCode, requestBodySocialDemographicData.salaryPensionCurrencyCode) &&
        Objects.equals(this.grossSalaryAmount, requestBodySocialDemographicData.grossSalaryAmount) &&
        Objects.equals(this.grossSalaryCurrencyCode, requestBodySocialDemographicData.grossSalaryCurrencyCode) &&
        Objects.equals(this.householdMonthlyExpensesAmount, requestBodySocialDemographicData.householdMonthlyExpensesAmount) &&
        Objects.equals(this.householdMonthlyExpensesCurrencyCode, requestBodySocialDemographicData.householdMonthlyExpensesCurrencyCode) &&
        Objects.equals(this.previousLoansAmount, requestBodySocialDemographicData.previousLoansAmount) &&
        Objects.equals(this.previousLoansCurrencyCode, requestBodySocialDemographicData.previousLoansCurrencyCode) &&
        Objects.equals(this.residentialStatusCode, requestBodySocialDemographicData.residentialStatusCode) &&
        Objects.equals(this.nationalityCode, requestBodySocialDemographicData.nationalityCode) &&
        Objects.equals(this.timeAtCurrentAddressCode, requestBodySocialDemographicData.timeAtCurrentAddressCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maritalStatusCode, personMaidenName, numberOfKeptPersons, durationOfCurrentEmployment, durationOfEmployment, employmentTypeCode, dateFromCurrentEmployment, dateToCurrentEmployment, educationLevelCode, salaryPensionAmount, salaryPensionCurrencyCode, grossSalaryAmount, grossSalaryCurrencyCode, householdMonthlyExpensesAmount, householdMonthlyExpensesCurrencyCode, previousLoansAmount, previousLoansCurrencyCode, residentialStatusCode, nationalityCode, timeAtCurrentAddressCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestBodySocialDemographicData {\n");
    
    sb.append("    maritalStatusCode: ").append(toIndentedString(maritalStatusCode)).append("\n");
    sb.append("    personMaidenName: ").append(toIndentedString(personMaidenName)).append("\n");
    sb.append("    numberOfKeptPersons: ").append(toIndentedString(numberOfKeptPersons)).append("\n");
    sb.append("    durationOfCurrentEmployment: ").append(toIndentedString(durationOfCurrentEmployment)).append("\n");
    sb.append("    durationOfEmployment: ").append(toIndentedString(durationOfEmployment)).append("\n");
    sb.append("    employmentTypeCode: ").append(toIndentedString(employmentTypeCode)).append("\n");
    sb.append("    dateFromCurrentEmployment: ").append(toIndentedString(dateFromCurrentEmployment)).append("\n");
    sb.append("    dateToCurrentEmployment: ").append(toIndentedString(dateToCurrentEmployment)).append("\n");
    sb.append("    educationLevelCode: ").append(toIndentedString(educationLevelCode)).append("\n");
    sb.append("    salaryPensionAmount: ").append(toIndentedString(salaryPensionAmount)).append("\n");
    sb.append("    salaryPensionCurrencyCode: ").append(toIndentedString(salaryPensionCurrencyCode)).append("\n");
    sb.append("    grossSalaryAmount: ").append(toIndentedString(grossSalaryAmount)).append("\n");
    sb.append("    grossSalaryCurrencyCode: ").append(toIndentedString(grossSalaryCurrencyCode)).append("\n");
    sb.append("    householdMonthlyExpensesAmount: ").append(toIndentedString(householdMonthlyExpensesAmount)).append("\n");
    sb.append("    householdMonthlyExpensesCurrencyCode: ").append(toIndentedString(householdMonthlyExpensesCurrencyCode)).append("\n");
    sb.append("    previousLoansAmount: ").append(toIndentedString(previousLoansAmount)).append("\n");
    sb.append("    previousLoansCurrencyCode: ").append(toIndentedString(previousLoansCurrencyCode)).append("\n");
    sb.append("    residentialStatusCode: ").append(toIndentedString(residentialStatusCode)).append("\n");
    sb.append("    nationalityCode: ").append(toIndentedString(nationalityCode)).append("\n");
    sb.append("    timeAtCurrentAddressCode: ").append(toIndentedString(timeAtCurrentAddressCode)).append("\n");
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


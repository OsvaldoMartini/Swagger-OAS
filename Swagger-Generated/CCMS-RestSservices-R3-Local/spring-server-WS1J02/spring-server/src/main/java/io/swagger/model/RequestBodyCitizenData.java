package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestBodyCitizenData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-13T10:34:52.354Z")

public class RequestBodyCitizenData   {
  @JsonProperty("personSurname")
  private String personSurname = null;

  @JsonProperty("personFirstName")
  private String personFirstName = null;

  @JsonProperty("personMiddleName")
  private String personMiddleName = null;

  @JsonProperty("genderCode")
  private String genderCode = null;

  @JsonProperty("placeOfBirth")
  private String placeOfBirth = null;

  @JsonProperty("dateOfBirth")
  private LocalDate dateOfBirth = null;

  @JsonProperty("personIdUsage")
  private String personIdUsage = null;

  @JsonProperty("memberSince")
  private LocalDate memberSince = null;

  @JsonProperty("salutationCode")
  private String salutationCode = null;

  @JsonProperty("salutationTranslation")
  private String salutationTranslation = null;

  @JsonProperty("inheritedTitleCode")
  private String inheritedTitleCode = null;

  @JsonProperty("InheritedTitleTranslation")
  private String inheritedTitleTranslation = null;

  @JsonProperty("acquiredTitleCode")
  private String acquiredTitleCode = null;

  @JsonProperty("acquiredTitleTranslation")
  private String acquiredTitleTranslation = null;

  @JsonProperty("memorablePassword")
  private String memorablePassword = null;

  @JsonProperty("documentTypeCode")
  private String documentTypeCode = null;

  @JsonProperty("documentCode")
  private String documentCode = null;

  @JsonProperty("documentNumber")
  private String documentNumber = null;

  @JsonProperty("documentIssuedBy")
  private String documentIssuedBy = null;

  @JsonProperty("documentIssuedDate")
  private LocalDate documentIssuedDate = null;

  @JsonProperty("documentExpiryDate")
  private LocalDate documentExpiryDate = null;

  @JsonProperty("documentDeliveryFlag")
  private String documentDeliveryFlag = null;

  @JsonProperty("employeeFlag")
  private String employeeFlag = null;

  @JsonProperty("employer1Id")
  private String employer1Id = null;

  @JsonProperty("employer1Name")
  private String employer1Name = null;

  @JsonProperty("employer1SectorCode")
  private String employer1SectorCode = null;

  @JsonProperty("employer2Id")
  private String employer2Id = null;

  @JsonProperty("employer2Name")
  private String employer2Name = null;

  @JsonProperty("employer2SectorCode")
  private String employer2SectorCode = null;

  @JsonProperty("employer3Id")
  private String employer3Id = null;

  @JsonProperty("employer3Name")
  private String employer3Name = null;

  @JsonProperty("employer3SectorCode")
  private String employer3SectorCode = null;

  public RequestBodyCitizenData personSurname(String personSurname) {
    this.personSurname = personSurname;
    return this;
  }

  /**
   * Get personSurname
   * @return personSurname
  **/
  @ApiModelProperty(value = "")

@Size(max=64) 
  public String getPersonSurname() {
    return personSurname;
  }

  public void setPersonSurname(String personSurname) {
    this.personSurname = personSurname;
  }

  public RequestBodyCitizenData personFirstName(String personFirstName) {
    this.personFirstName = personFirstName;
    return this;
  }

  /**
   * Get personFirstName
   * @return personFirstName
  **/
  @ApiModelProperty(value = "")

@Size(max=35) 
  public String getPersonFirstName() {
    return personFirstName;
  }

  public void setPersonFirstName(String personFirstName) {
    this.personFirstName = personFirstName;
  }

  public RequestBodyCitizenData personMiddleName(String personMiddleName) {
    this.personMiddleName = personMiddleName;
    return this;
  }

  /**
   * Get personMiddleName
   * @return personMiddleName
  **/
  @ApiModelProperty(value = "")

@Size(max=40) 
  public String getPersonMiddleName() {
    return personMiddleName;
  }

  public void setPersonMiddleName(String personMiddleName) {
    this.personMiddleName = personMiddleName;
  }

  public RequestBodyCitizenData genderCode(String genderCode) {
    this.genderCode = genderCode;
    return this;
  }

  /**
   * Get genderCode
   * @return genderCode
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getGenderCode() {
    return genderCode;
  }

  public void setGenderCode(String genderCode) {
    this.genderCode = genderCode;
  }

  public RequestBodyCitizenData placeOfBirth(String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
    return this;
  }

  /**
   * Get placeOfBirth
   * @return placeOfBirth
  **/
  @ApiModelProperty(value = "")

@Size(max=30) 
  public String getPlaceOfBirth() {
    return placeOfBirth;
  }

  public void setPlaceOfBirth(String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
  }

  public RequestBodyCitizenData dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public RequestBodyCitizenData personIdUsage(String personIdUsage) {
    this.personIdUsage = personIdUsage;
    return this;
  }

  /**
   * Get personIdUsage
   * @return personIdUsage
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getPersonIdUsage() {
    return personIdUsage;
  }

  public void setPersonIdUsage(String personIdUsage) {
    this.personIdUsage = personIdUsage;
  }

  public RequestBodyCitizenData memberSince(LocalDate memberSince) {
    this.memberSince = memberSince;
    return this;
  }

  /**
   * Get memberSince
   * @return memberSince
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getMemberSince() {
    return memberSince;
  }

  public void setMemberSince(LocalDate memberSince) {
    this.memberSince = memberSince;
  }

  public RequestBodyCitizenData salutationCode(String salutationCode) {
    this.salutationCode = salutationCode;
    return this;
  }

  /**
   * Get salutationCode
   * @return salutationCode
  **/
  @ApiModelProperty(value = "")

@Size(max=64) 
  public String getSalutationCode() {
    return salutationCode;
  }

  public void setSalutationCode(String salutationCode) {
    this.salutationCode = salutationCode;
  }

  public RequestBodyCitizenData salutationTranslation(String salutationTranslation) {
    this.salutationTranslation = salutationTranslation;
    return this;
  }

  /**
   * Get salutationTranslation
   * @return salutationTranslation
  **/
  @ApiModelProperty(value = "")

@Size(max=64) 
  public String getSalutationTranslation() {
    return salutationTranslation;
  }

  public void setSalutationTranslation(String salutationTranslation) {
    this.salutationTranslation = salutationTranslation;
  }

  public RequestBodyCitizenData inheritedTitleCode(String inheritedTitleCode) {
    this.inheritedTitleCode = inheritedTitleCode;
    return this;
  }

  /**
   * Get inheritedTitleCode
   * @return inheritedTitleCode
  **/
  @ApiModelProperty(value = "")

@Size(max=64) 
  public String getInheritedTitleCode() {
    return inheritedTitleCode;
  }

  public void setInheritedTitleCode(String inheritedTitleCode) {
    this.inheritedTitleCode = inheritedTitleCode;
  }

  public RequestBodyCitizenData inheritedTitleTranslation(String inheritedTitleTranslation) {
    this.inheritedTitleTranslation = inheritedTitleTranslation;
    return this;
  }

  /**
   * Get inheritedTitleTranslation
   * @return inheritedTitleTranslation
  **/
  @ApiModelProperty(value = "")

@Size(max=64) 
  public String getInheritedTitleTranslation() {
    return inheritedTitleTranslation;
  }

  public void setInheritedTitleTranslation(String inheritedTitleTranslation) {
    this.inheritedTitleTranslation = inheritedTitleTranslation;
  }

  public RequestBodyCitizenData acquiredTitleCode(String acquiredTitleCode) {
    this.acquiredTitleCode = acquiredTitleCode;
    return this;
  }

  /**
   * Get acquiredTitleCode
   * @return acquiredTitleCode
  **/
  @ApiModelProperty(value = "")

@Size(max=64) 
  public String getAcquiredTitleCode() {
    return acquiredTitleCode;
  }

  public void setAcquiredTitleCode(String acquiredTitleCode) {
    this.acquiredTitleCode = acquiredTitleCode;
  }

  public RequestBodyCitizenData acquiredTitleTranslation(String acquiredTitleTranslation) {
    this.acquiredTitleTranslation = acquiredTitleTranslation;
    return this;
  }

  /**
   * Get acquiredTitleTranslation
   * @return acquiredTitleTranslation
  **/
  @ApiModelProperty(value = "")

@Size(max=64) 
  public String getAcquiredTitleTranslation() {
    return acquiredTitleTranslation;
  }

  public void setAcquiredTitleTranslation(String acquiredTitleTranslation) {
    this.acquiredTitleTranslation = acquiredTitleTranslation;
  }

  public RequestBodyCitizenData memorablePassword(String memorablePassword) {
    this.memorablePassword = memorablePassword;
    return this;
  }

  /**
   * Get memorablePassword
   * @return memorablePassword
  **/
  @ApiModelProperty(value = "")

@Size(max=20) 
  public String getMemorablePassword() {
    return memorablePassword;
  }

  public void setMemorablePassword(String memorablePassword) {
    this.memorablePassword = memorablePassword;
  }

  public RequestBodyCitizenData documentTypeCode(String documentTypeCode) {
    this.documentTypeCode = documentTypeCode;
    return this;
  }

  /**
   * Get documentTypeCode
   * @return documentTypeCode
  **/
  @ApiModelProperty(value = "")

@Size(max=8) 
  public String getDocumentTypeCode() {
    return documentTypeCode;
  }

  public void setDocumentTypeCode(String documentTypeCode) {
    this.documentTypeCode = documentTypeCode;
  }

  public RequestBodyCitizenData documentCode(String documentCode) {
    this.documentCode = documentCode;
    return this;
  }

  /**
   * Get documentCode
   * @return documentCode
  **/
  @ApiModelProperty(value = "")

@Size(max=10) 
  public String getDocumentCode() {
    return documentCode;
  }

  public void setDocumentCode(String documentCode) {
    this.documentCode = documentCode;
  }

  public RequestBodyCitizenData documentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
    return this;
  }

  /**
   * Get documentNumber
   * @return documentNumber
  **/
  @ApiModelProperty(value = "")

@Size(max=18) 
  public String getDocumentNumber() {
    return documentNumber;
  }

  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }

  public RequestBodyCitizenData documentIssuedBy(String documentIssuedBy) {
    this.documentIssuedBy = documentIssuedBy;
    return this;
  }

  /**
   * Get documentIssuedBy
   * @return documentIssuedBy
  **/
  @ApiModelProperty(value = "")

@Size(max=64) 
  public String getDocumentIssuedBy() {
    return documentIssuedBy;
  }

  public void setDocumentIssuedBy(String documentIssuedBy) {
    this.documentIssuedBy = documentIssuedBy;
  }

  public RequestBodyCitizenData documentIssuedDate(LocalDate documentIssuedDate) {
    this.documentIssuedDate = documentIssuedDate;
    return this;
  }

  /**
   * Get documentIssuedDate
   * @return documentIssuedDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDocumentIssuedDate() {
    return documentIssuedDate;
  }

  public void setDocumentIssuedDate(LocalDate documentIssuedDate) {
    this.documentIssuedDate = documentIssuedDate;
  }

  public RequestBodyCitizenData documentExpiryDate(LocalDate documentExpiryDate) {
    this.documentExpiryDate = documentExpiryDate;
    return this;
  }

  /**
   * Get documentExpiryDate
   * @return documentExpiryDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDocumentExpiryDate() {
    return documentExpiryDate;
  }

  public void setDocumentExpiryDate(LocalDate documentExpiryDate) {
    this.documentExpiryDate = documentExpiryDate;
  }

  public RequestBodyCitizenData documentDeliveryFlag(String documentDeliveryFlag) {
    this.documentDeliveryFlag = documentDeliveryFlag;
    return this;
  }

  /**
   * Get documentDeliveryFlag
   * @return documentDeliveryFlag
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getDocumentDeliveryFlag() {
    return documentDeliveryFlag;
  }

  public void setDocumentDeliveryFlag(String documentDeliveryFlag) {
    this.documentDeliveryFlag = documentDeliveryFlag;
  }

  public RequestBodyCitizenData employeeFlag(String employeeFlag) {
    this.employeeFlag = employeeFlag;
    return this;
  }

  /**
   * Get employeeFlag
   * @return employeeFlag
  **/
  @ApiModelProperty(value = "")

@Size(max=1) 
  public String getEmployeeFlag() {
    return employeeFlag;
  }

  public void setEmployeeFlag(String employeeFlag) {
    this.employeeFlag = employeeFlag;
  }

  public RequestBodyCitizenData employer1Id(String employer1Id) {
    this.employer1Id = employer1Id;
    return this;
  }

  /**
   * Get employer1Id
   * @return employer1Id
  **/
  @ApiModelProperty(value = "")

@Size(max=10) 
  public String getEmployer1Id() {
    return employer1Id;
  }

  public void setEmployer1Id(String employer1Id) {
    this.employer1Id = employer1Id;
  }

  public RequestBodyCitizenData employer1Name(String employer1Name) {
    this.employer1Name = employer1Name;
    return this;
  }

  /**
   * Get employer1Name
   * @return employer1Name
  **/
  @ApiModelProperty(value = "")

@Size(max=128) 
  public String getEmployer1Name() {
    return employer1Name;
  }

  public void setEmployer1Name(String employer1Name) {
    this.employer1Name = employer1Name;
  }

  public RequestBodyCitizenData employer1SectorCode(String employer1SectorCode) {
    this.employer1SectorCode = employer1SectorCode;
    return this;
  }

  /**
   * Get employer1SectorCode
   * @return employer1SectorCode
  **/
  @ApiModelProperty(value = "")

@Size(max=5) 
  public String getEmployer1SectorCode() {
    return employer1SectorCode;
  }

  public void setEmployer1SectorCode(String employer1SectorCode) {
    this.employer1SectorCode = employer1SectorCode;
  }

  public RequestBodyCitizenData employer2Id(String employer2Id) {
    this.employer2Id = employer2Id;
    return this;
  }

  /**
   * Get employer2Id
   * @return employer2Id
  **/
  @ApiModelProperty(value = "")

@Size(max=10) 
  public String getEmployer2Id() {
    return employer2Id;
  }

  public void setEmployer2Id(String employer2Id) {
    this.employer2Id = employer2Id;
  }

  public RequestBodyCitizenData employer2Name(String employer2Name) {
    this.employer2Name = employer2Name;
    return this;
  }

  /**
   * Get employer2Name
   * @return employer2Name
  **/
  @ApiModelProperty(value = "")

@Size(max=128) 
  public String getEmployer2Name() {
    return employer2Name;
  }

  public void setEmployer2Name(String employer2Name) {
    this.employer2Name = employer2Name;
  }

  public RequestBodyCitizenData employer2SectorCode(String employer2SectorCode) {
    this.employer2SectorCode = employer2SectorCode;
    return this;
  }

  /**
   * Get employer2SectorCode
   * @return employer2SectorCode
  **/
  @ApiModelProperty(value = "")

@Size(max=5) 
  public String getEmployer2SectorCode() {
    return employer2SectorCode;
  }

  public void setEmployer2SectorCode(String employer2SectorCode) {
    this.employer2SectorCode = employer2SectorCode;
  }

  public RequestBodyCitizenData employer3Id(String employer3Id) {
    this.employer3Id = employer3Id;
    return this;
  }

  /**
   * Get employer3Id
   * @return employer3Id
  **/
  @ApiModelProperty(value = "")

@Size(max=10) 
  public String getEmployer3Id() {
    return employer3Id;
  }

  public void setEmployer3Id(String employer3Id) {
    this.employer3Id = employer3Id;
  }

  public RequestBodyCitizenData employer3Name(String employer3Name) {
    this.employer3Name = employer3Name;
    return this;
  }

  /**
   * Get employer3Name
   * @return employer3Name
  **/
  @ApiModelProperty(value = "")

@Size(max=128) 
  public String getEmployer3Name() {
    return employer3Name;
  }

  public void setEmployer3Name(String employer3Name) {
    this.employer3Name = employer3Name;
  }

  public RequestBodyCitizenData employer3SectorCode(String employer3SectorCode) {
    this.employer3SectorCode = employer3SectorCode;
    return this;
  }

  /**
   * Get employer3SectorCode
   * @return employer3SectorCode
  **/
  @ApiModelProperty(value = "")

@Size(max=5) 
  public String getEmployer3SectorCode() {
    return employer3SectorCode;
  }

  public void setEmployer3SectorCode(String employer3SectorCode) {
    this.employer3SectorCode = employer3SectorCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestBodyCitizenData requestBodyCitizenData = (RequestBodyCitizenData) o;
    return Objects.equals(this.personSurname, requestBodyCitizenData.personSurname) &&
        Objects.equals(this.personFirstName, requestBodyCitizenData.personFirstName) &&
        Objects.equals(this.personMiddleName, requestBodyCitizenData.personMiddleName) &&
        Objects.equals(this.genderCode, requestBodyCitizenData.genderCode) &&
        Objects.equals(this.placeOfBirth, requestBodyCitizenData.placeOfBirth) &&
        Objects.equals(this.dateOfBirth, requestBodyCitizenData.dateOfBirth) &&
        Objects.equals(this.personIdUsage, requestBodyCitizenData.personIdUsage) &&
        Objects.equals(this.memberSince, requestBodyCitizenData.memberSince) &&
        Objects.equals(this.salutationCode, requestBodyCitizenData.salutationCode) &&
        Objects.equals(this.salutationTranslation, requestBodyCitizenData.salutationTranslation) &&
        Objects.equals(this.inheritedTitleCode, requestBodyCitizenData.inheritedTitleCode) &&
        Objects.equals(this.inheritedTitleTranslation, requestBodyCitizenData.inheritedTitleTranslation) &&
        Objects.equals(this.acquiredTitleCode, requestBodyCitizenData.acquiredTitleCode) &&
        Objects.equals(this.acquiredTitleTranslation, requestBodyCitizenData.acquiredTitleTranslation) &&
        Objects.equals(this.memorablePassword, requestBodyCitizenData.memorablePassword) &&
        Objects.equals(this.documentTypeCode, requestBodyCitizenData.documentTypeCode) &&
        Objects.equals(this.documentCode, requestBodyCitizenData.documentCode) &&
        Objects.equals(this.documentNumber, requestBodyCitizenData.documentNumber) &&
        Objects.equals(this.documentIssuedBy, requestBodyCitizenData.documentIssuedBy) &&
        Objects.equals(this.documentIssuedDate, requestBodyCitizenData.documentIssuedDate) &&
        Objects.equals(this.documentExpiryDate, requestBodyCitizenData.documentExpiryDate) &&
        Objects.equals(this.documentDeliveryFlag, requestBodyCitizenData.documentDeliveryFlag) &&
        Objects.equals(this.employeeFlag, requestBodyCitizenData.employeeFlag) &&
        Objects.equals(this.employer1Id, requestBodyCitizenData.employer1Id) &&
        Objects.equals(this.employer1Name, requestBodyCitizenData.employer1Name) &&
        Objects.equals(this.employer1SectorCode, requestBodyCitizenData.employer1SectorCode) &&
        Objects.equals(this.employer2Id, requestBodyCitizenData.employer2Id) &&
        Objects.equals(this.employer2Name, requestBodyCitizenData.employer2Name) &&
        Objects.equals(this.employer2SectorCode, requestBodyCitizenData.employer2SectorCode) &&
        Objects.equals(this.employer3Id, requestBodyCitizenData.employer3Id) &&
        Objects.equals(this.employer3Name, requestBodyCitizenData.employer3Name) &&
        Objects.equals(this.employer3SectorCode, requestBodyCitizenData.employer3SectorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personSurname, personFirstName, personMiddleName, genderCode, placeOfBirth, dateOfBirth, personIdUsage, memberSince, salutationCode, salutationTranslation, inheritedTitleCode, inheritedTitleTranslation, acquiredTitleCode, acquiredTitleTranslation, memorablePassword, documentTypeCode, documentCode, documentNumber, documentIssuedBy, documentIssuedDate, documentExpiryDate, documentDeliveryFlag, employeeFlag, employer1Id, employer1Name, employer1SectorCode, employer2Id, employer2Name, employer2SectorCode, employer3Id, employer3Name, employer3SectorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestBodyCitizenData {\n");
    
    sb.append("    personSurname: ").append(toIndentedString(personSurname)).append("\n");
    sb.append("    personFirstName: ").append(toIndentedString(personFirstName)).append("\n");
    sb.append("    personMiddleName: ").append(toIndentedString(personMiddleName)).append("\n");
    sb.append("    genderCode: ").append(toIndentedString(genderCode)).append("\n");
    sb.append("    placeOfBirth: ").append(toIndentedString(placeOfBirth)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    personIdUsage: ").append(toIndentedString(personIdUsage)).append("\n");
    sb.append("    memberSince: ").append(toIndentedString(memberSince)).append("\n");
    sb.append("    salutationCode: ").append(toIndentedString(salutationCode)).append("\n");
    sb.append("    salutationTranslation: ").append(toIndentedString(salutationTranslation)).append("\n");
    sb.append("    inheritedTitleCode: ").append(toIndentedString(inheritedTitleCode)).append("\n");
    sb.append("    inheritedTitleTranslation: ").append(toIndentedString(inheritedTitleTranslation)).append("\n");
    sb.append("    acquiredTitleCode: ").append(toIndentedString(acquiredTitleCode)).append("\n");
    sb.append("    acquiredTitleTranslation: ").append(toIndentedString(acquiredTitleTranslation)).append("\n");
    sb.append("    memorablePassword: ").append(toIndentedString(memorablePassword)).append("\n");
    sb.append("    documentTypeCode: ").append(toIndentedString(documentTypeCode)).append("\n");
    sb.append("    documentCode: ").append(toIndentedString(documentCode)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    documentIssuedBy: ").append(toIndentedString(documentIssuedBy)).append("\n");
    sb.append("    documentIssuedDate: ").append(toIndentedString(documentIssuedDate)).append("\n");
    sb.append("    documentExpiryDate: ").append(toIndentedString(documentExpiryDate)).append("\n");
    sb.append("    documentDeliveryFlag: ").append(toIndentedString(documentDeliveryFlag)).append("\n");
    sb.append("    employeeFlag: ").append(toIndentedString(employeeFlag)).append("\n");
    sb.append("    employer1Id: ").append(toIndentedString(employer1Id)).append("\n");
    sb.append("    employer1Name: ").append(toIndentedString(employer1Name)).append("\n");
    sb.append("    employer1SectorCode: ").append(toIndentedString(employer1SectorCode)).append("\n");
    sb.append("    employer2Id: ").append(toIndentedString(employer2Id)).append("\n");
    sb.append("    employer2Name: ").append(toIndentedString(employer2Name)).append("\n");
    sb.append("    employer2SectorCode: ").append(toIndentedString(employer2SectorCode)).append("\n");
    sb.append("    employer3Id: ").append(toIndentedString(employer3Id)).append("\n");
    sb.append("    employer3Name: ").append(toIndentedString(employer3Name)).append("\n");
    sb.append("    employer3SectorCode: ").append(toIndentedString(employer3SectorCode)).append("\n");
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


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFiduciaryRelationshipArrangementInitiateOutputModel
 */
public class CRFiduciaryRelationshipArrangementInitiateOutputModel   {
  private String fiduciaryRelationshipArrangementInstanceReference = null;

  private String fiduciaryRelationshipArrangementInitiateActionReference = null;

  private Object fiduciaryRelationshipArrangementInitiateActionRecord = null;

  private String fiduciaryRelationshipArrangementInstanceStatus = null;

  private String fiduciaryRelationshipArrangementParameterType = null;

  private String fiduciaryRelationshipArrangementSelectedOption = null;

  private String fiduciaryRelationshipArrangementSchedule = null;

  private String fiduciaryRelationshipArrangementStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Fiduciary Relationship Arrangement instance 
   * @return fiduciaryRelationshipArrangementInstanceReference
  **/

  public String getFiduciaryRelationshipArrangementInstanceReference() {
    return fiduciaryRelationshipArrangementInstanceReference;
  }

  public void setFiduciaryRelationshipArrangementInstanceReference(String fiduciaryRelationshipArrangementInstanceReference) {
    this.fiduciaryRelationshipArrangementInstanceReference = fiduciaryRelationshipArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return fiduciaryRelationshipArrangementInitiateActionReference
  **/

  public String getFiduciaryRelationshipArrangementInitiateActionReference() {
    return fiduciaryRelationshipArrangementInitiateActionReference;
  }

  public void setFiduciaryRelationshipArrangementInitiateActionReference(String fiduciaryRelationshipArrangementInitiateActionReference) {
    this.fiduciaryRelationshipArrangementInitiateActionReference = fiduciaryRelationshipArrangementInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return fiduciaryRelationshipArrangementInitiateActionRecord
  **/

  public Object getFiduciaryRelationshipArrangementInitiateActionRecord() {
    return fiduciaryRelationshipArrangementInitiateActionRecord;
  }

  public void setFiduciaryRelationshipArrangementInitiateActionRecord(Object fiduciaryRelationshipArrangementInitiateActionRecord) {
    this.fiduciaryRelationshipArrangementInitiateActionRecord = fiduciaryRelationshipArrangementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Fiduciary Relationship Arrangement instance (e.g. initialised, pending, active) 
   * @return fiduciaryRelationshipArrangementInstanceStatus
  **/

  public String getFiduciaryRelationshipArrangementInstanceStatus() {
    return fiduciaryRelationshipArrangementInstanceStatus;
  }

  public void setFiduciaryRelationshipArrangementInstanceStatus(String fiduciaryRelationshipArrangementInstanceStatus) {
    this.fiduciaryRelationshipArrangementInstanceStatus = fiduciaryRelationshipArrangementInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between arrangements according to the type of business services within Fiduciary Relationship Arrangement 
   * @return fiduciaryRelationshipArrangementParameterType
  **/

  public String getFiduciaryRelationshipArrangementParameterType() {
    return fiduciaryRelationshipArrangementParameterType;
  }

  public void setFiduciaryRelationshipArrangementParameterType(String fiduciaryRelationshipArrangementParameterType) {
    this.fiduciaryRelationshipArrangementParameterType = fiduciaryRelationshipArrangementParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service as subject matter of Fiduciary Relationship Arrangement 
   * @return fiduciaryRelationshipArrangementSelectedOption
  **/

  public String getFiduciaryRelationshipArrangementSelectedOption() {
    return fiduciaryRelationshipArrangementSelectedOption;
  }

  public void setFiduciaryRelationshipArrangementSelectedOption(String fiduciaryRelationshipArrangementSelectedOption) {
    this.fiduciaryRelationshipArrangementSelectedOption = fiduciaryRelationshipArrangementSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Timetable to fulfill Fiduciary Relationship Arrangement 
   * @return fiduciaryRelationshipArrangementSchedule
  **/

  public String getFiduciaryRelationshipArrangementSchedule() {
    return fiduciaryRelationshipArrangementSchedule;
  }

  public void setFiduciaryRelationshipArrangementSchedule(String fiduciaryRelationshipArrangementSchedule) {
    this.fiduciaryRelationshipArrangementSchedule = fiduciaryRelationshipArrangementSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Fiduciary Relationship Arrangement 
   * @return fiduciaryRelationshipArrangementStatus
  **/

  public String getFiduciaryRelationshipArrangementStatus() {
    return fiduciaryRelationshipArrangementStatus;
  }

  public void setFiduciaryRelationshipArrangementStatus(String fiduciaryRelationshipArrangementStatus) {
    this.fiduciaryRelationshipArrangementStatus = fiduciaryRelationshipArrangementStatus;
  }


}


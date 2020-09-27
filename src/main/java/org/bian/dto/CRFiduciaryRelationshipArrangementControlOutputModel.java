package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFiduciaryRelationshipArrangementControlOutputModel
 */
public class CRFiduciaryRelationshipArrangementControlOutputModel   {
  private String fiduciaryRelationshipArrangementParameterType = null;

  private String fiduciaryRelationshipArrangementSelectedOption = null;

  private String fiduciaryRelationshipArrangementSchedule = null;

  private String fiduciaryRelationshipArrangementStatus = null;

  private String fiduciaryRelationshipArrangementControlActionTaskReference = null;

  private Object fiduciaryRelationshipArrangementControlActionTaskRecord = null;

  private String fiduciaryRelationshipArrangementControlActionResponse = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Fiduciary Relationship Arrangement instance control processing service call 
   * @return fiduciaryRelationshipArrangementControlActionTaskReference
  **/

  public String getFiduciaryRelationshipArrangementControlActionTaskReference() {
    return fiduciaryRelationshipArrangementControlActionTaskReference;
  }

  public void setFiduciaryRelationshipArrangementControlActionTaskReference(String fiduciaryRelationshipArrangementControlActionTaskReference) {
    this.fiduciaryRelationshipArrangementControlActionTaskReference = fiduciaryRelationshipArrangementControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return fiduciaryRelationshipArrangementControlActionTaskRecord
  **/

  public Object getFiduciaryRelationshipArrangementControlActionTaskRecord() {
    return fiduciaryRelationshipArrangementControlActionTaskRecord;
  }

  public void setFiduciaryRelationshipArrangementControlActionTaskRecord(Object fiduciaryRelationshipArrangementControlActionTaskRecord) {
    this.fiduciaryRelationshipArrangementControlActionTaskRecord = fiduciaryRelationshipArrangementControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return fiduciaryRelationshipArrangementControlActionResponse
  **/

  public String getFiduciaryRelationshipArrangementControlActionResponse() {
    return fiduciaryRelationshipArrangementControlActionResponse;
  }

  public void setFiduciaryRelationshipArrangementControlActionResponse(String fiduciaryRelationshipArrangementControlActionResponse) {
    this.fiduciaryRelationshipArrangementControlActionResponse = fiduciaryRelationshipArrangementControlActionResponse;
  }


}


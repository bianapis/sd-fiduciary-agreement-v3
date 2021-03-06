package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFiduciaryRelationshipArrangementExchangeOutputModel
 */
public class CRFiduciaryRelationshipArrangementExchangeOutputModel   {
  private String fiduciaryRelationshipArrangementParameterType = null;

  private String fiduciaryRelationshipArrangementSelectedOption = null;

  private String fiduciaryRelationshipArrangementSchedule = null;

  private String fiduciaryRelationshipArrangementStatus = null;

  private String fiduciaryRelationshipArrangementExchangeActionTaskReference = null;

  private Object fiduciaryRelationshipArrangementExchangeActionTaskRecord = null;

  private String fiduciaryRelationshipArrangementExchangeActionResponse = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Fiduciary Relationship Arrangement instance exchange service call 
   * @return fiduciaryRelationshipArrangementExchangeActionTaskReference
  **/

  public String getFiduciaryRelationshipArrangementExchangeActionTaskReference() {
    return fiduciaryRelationshipArrangementExchangeActionTaskReference;
  }

  public void setFiduciaryRelationshipArrangementExchangeActionTaskReference(String fiduciaryRelationshipArrangementExchangeActionTaskReference) {
    this.fiduciaryRelationshipArrangementExchangeActionTaskReference = fiduciaryRelationshipArrangementExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return fiduciaryRelationshipArrangementExchangeActionTaskRecord
  **/

  public Object getFiduciaryRelationshipArrangementExchangeActionTaskRecord() {
    return fiduciaryRelationshipArrangementExchangeActionTaskRecord;
  }

  public void setFiduciaryRelationshipArrangementExchangeActionTaskRecord(Object fiduciaryRelationshipArrangementExchangeActionTaskRecord) {
    this.fiduciaryRelationshipArrangementExchangeActionTaskRecord = fiduciaryRelationshipArrangementExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return fiduciaryRelationshipArrangementExchangeActionResponse
  **/

  public String getFiduciaryRelationshipArrangementExchangeActionResponse() {
    return fiduciaryRelationshipArrangementExchangeActionResponse;
  }

  public void setFiduciaryRelationshipArrangementExchangeActionResponse(String fiduciaryRelationshipArrangementExchangeActionResponse) {
    this.fiduciaryRelationshipArrangementExchangeActionResponse = fiduciaryRelationshipArrangementExchangeActionResponse;
  }


}


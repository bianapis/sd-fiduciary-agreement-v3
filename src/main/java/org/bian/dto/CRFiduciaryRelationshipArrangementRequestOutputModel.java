package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFiduciaryRelationshipArrangementRequestOutputModel
 */
public class CRFiduciaryRelationshipArrangementRequestOutputModel   {
  private String fiduciaryRelationshipArrangementParameterType = null;

  private String fiduciaryRelationshipArrangementSelectedOption = null;

  private String fiduciaryRelationshipArrangementSchedule = null;

  private String fiduciaryRelationshipArrangementStatus = null;

  private String fiduciaryRelationshipArrangementRequestActionTaskReference = null;

  private Object fiduciaryRelationshipArrangementRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Fiduciary Relationship Arrangement instance request service call 
   * @return fiduciaryRelationshipArrangementRequestActionTaskReference
  **/

  public String getFiduciaryRelationshipArrangementRequestActionTaskReference() {
    return fiduciaryRelationshipArrangementRequestActionTaskReference;
  }

  public void setFiduciaryRelationshipArrangementRequestActionTaskReference(String fiduciaryRelationshipArrangementRequestActionTaskReference) {
    this.fiduciaryRelationshipArrangementRequestActionTaskReference = fiduciaryRelationshipArrangementRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return fiduciaryRelationshipArrangementRequestActionTaskRecord
  **/

  public Object getFiduciaryRelationshipArrangementRequestActionTaskRecord() {
    return fiduciaryRelationshipArrangementRequestActionTaskRecord;
  }

  public void setFiduciaryRelationshipArrangementRequestActionTaskRecord(Object fiduciaryRelationshipArrangementRequestActionTaskRecord) {
    this.fiduciaryRelationshipArrangementRequestActionTaskRecord = fiduciaryRelationshipArrangementRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}


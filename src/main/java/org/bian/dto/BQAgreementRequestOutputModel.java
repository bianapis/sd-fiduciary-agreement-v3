package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAgreementRequestOutputModel
 */
public class BQAgreementRequestOutputModel   {
  private String agreementPreconditions = null;

  private String agreementFeatureSchedule = null;

  private String businessService = null;

  private String agreementPostconditions = null;

  private String agreementServiceType = null;

  private String agreementServiceDescription = null;

  private String agreementServiceInputsandOuputs = null;

  private String agreementServiceWorkProduct = null;

  private String agreementServiceName = null;

  private String agreementRequestActionTaskReference = null;

  private Object agreementRequestActionTaskRecord = null;

  private String agreementRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return agreementPreconditions
  **/

  public String getAgreementPreconditions() {
    return agreementPreconditions;
  }

  public void setAgreementPreconditions(String agreementPreconditions) {
    this.agreementPreconditions = agreementPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return agreementFeatureSchedule
  **/

  public String getAgreementFeatureSchedule() {
    return agreementFeatureSchedule;
  }

  public void setAgreementFeatureSchedule(String agreementFeatureSchedule) {
    this.agreementFeatureSchedule = agreementFeatureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Fiduciary Relationship Arrangement specific Business Service 
   * @return businessService
  **/

  public String getBusinessService() {
    return businessService;
  }

  public void setBusinessService(String businessService) {
    this.businessService = businessService;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the feature instance has been fulfilled 
   * @return agreementPostconditions
  **/

  public String getAgreementPostconditions() {
    return agreementPostconditions;
  }

  public void setAgreementPostconditions(String agreementPostconditions) {
    this.agreementPostconditions = agreementPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return agreementServiceType
  **/

  public String getAgreementServiceType() {
    return agreementServiceType;
  }

  public void setAgreementServiceType(String agreementServiceType) {
    this.agreementServiceType = agreementServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return agreementServiceDescription
  **/

  public String getAgreementServiceDescription() {
    return agreementServiceDescription;
  }

  public void setAgreementServiceDescription(String agreementServiceDescription) {
    this.agreementServiceDescription = agreementServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return agreementServiceInputsandOuputs
  **/

  public String getAgreementServiceInputsandOuputs() {
    return agreementServiceInputsandOuputs;
  }

  public void setAgreementServiceInputsandOuputs(String agreementServiceInputsandOuputs) {
    this.agreementServiceInputsandOuputs = agreementServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return agreementServiceWorkProduct
  **/

  public String getAgreementServiceWorkProduct() {
    return agreementServiceWorkProduct;
  }

  public void setAgreementServiceWorkProduct(String agreementServiceWorkProduct) {
    this.agreementServiceWorkProduct = agreementServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return agreementServiceName
  **/

  public String getAgreementServiceName() {
    return agreementServiceName;
  }

  public void setAgreementServiceName(String agreementServiceName) {
    this.agreementServiceName = agreementServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Agreement instance request service call 
   * @return agreementRequestActionTaskReference
  **/

  public String getAgreementRequestActionTaskReference() {
    return agreementRequestActionTaskReference;
  }

  public void setAgreementRequestActionTaskReference(String agreementRequestActionTaskReference) {
    this.agreementRequestActionTaskReference = agreementRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return agreementRequestActionTaskRecord
  **/

  public Object getAgreementRequestActionTaskRecord() {
    return agreementRequestActionTaskRecord;
  }

  public void setAgreementRequestActionTaskRecord(Object agreementRequestActionTaskRecord) {
    this.agreementRequestActionTaskRecord = agreementRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Agreement service request record 
   * @return agreementRequestRecordReference
  **/

  public String getAgreementRequestRecordReference() {
    return agreementRequestRecordReference;
  }

  public void setAgreementRequestRecordReference(String agreementRequestRecordReference) {
    this.agreementRequestRecordReference = agreementRequestRecordReference;
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


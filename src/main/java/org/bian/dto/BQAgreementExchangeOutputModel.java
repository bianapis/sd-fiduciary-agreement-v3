package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAgreementExchangeOutputModel
 */
public class BQAgreementExchangeOutputModel   {
  private String agreementPreconditions = null;

  private String agreementFeatureSchedule = null;

  private String businessService = null;

  private String agreementPostconditions = null;

  private String agreementServiceType = null;

  private String agreementServiceDescription = null;

  private String agreementServiceInputsandOuputs = null;

  private String agreementServiceWorkProduct = null;

  private String agreementServiceName = null;

  private String agreementExchangeActionTaskReference = null;

  private Object agreementExchangeActionTaskRecord = null;

  private String agreementExchangeActionResponse = null;

  private String agreementInstanceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Agreement instance exchange service call 
   * @return agreementExchangeActionTaskReference
  **/

  public String getAgreementExchangeActionTaskReference() {
    return agreementExchangeActionTaskReference;
  }

  public void setAgreementExchangeActionTaskReference(String agreementExchangeActionTaskReference) {
    this.agreementExchangeActionTaskReference = agreementExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return agreementExchangeActionTaskRecord
  **/

  public Object getAgreementExchangeActionTaskRecord() {
    return agreementExchangeActionTaskRecord;
  }

  public void setAgreementExchangeActionTaskRecord(Object agreementExchangeActionTaskRecord) {
    this.agreementExchangeActionTaskRecord = agreementExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return agreementExchangeActionResponse
  **/

  public String getAgreementExchangeActionResponse() {
    return agreementExchangeActionResponse;
  }

  public void setAgreementExchangeActionResponse(String agreementExchangeActionResponse) {
    this.agreementExchangeActionResponse = agreementExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Agreement instance (e.g. accepted, rejected, verified) 
   * @return agreementInstanceStatus
  **/

  public String getAgreementInstanceStatus() {
    return agreementInstanceStatus;
  }

  public void setAgreementInstanceStatus(String agreementInstanceStatus) {
    this.agreementInstanceStatus = agreementInstanceStatus;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAgreementUpdateOutputModel
 */
public class BQAgreementUpdateOutputModel   {
  private String agreementPreconditions = null;

  private String agreementFeatureSchedule = null;

  private String businessService = null;

  private String agreementPostconditions = null;

  private String agreementServiceType = null;

  private String agreementServiceDescription = null;

  private String agreementServiceInputsandOuputs = null;

  private String agreementServiceWorkProduct = null;

  private String agreementServiceName = null;

  private String agreementUpdateActionTaskReference = null;

  private Object agreementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return agreementUpdateActionTaskReference
  **/

  public String getAgreementUpdateActionTaskReference() {
    return agreementUpdateActionTaskReference;
  }

  public void setAgreementUpdateActionTaskReference(String agreementUpdateActionTaskReference) {
    this.agreementUpdateActionTaskReference = agreementUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return agreementUpdateActionTaskRecord
  **/

  public Object getAgreementUpdateActionTaskRecord() {
    return agreementUpdateActionTaskRecord;
  }

  public void setAgreementUpdateActionTaskRecord(Object agreementUpdateActionTaskRecord) {
    this.agreementUpdateActionTaskRecord = agreementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}


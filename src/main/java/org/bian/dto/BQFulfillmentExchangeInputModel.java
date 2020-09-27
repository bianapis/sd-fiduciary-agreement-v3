package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFiduciaryRelationshipArrangementExchangeInputModelFiduciaryRelationshipArrangementExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQFulfillmentExchangeInputModel
 */
public class BQFulfillmentExchangeInputModel   {
  private String fiduciaryRelationshipArrangementInstanceReference = null;

  private String fulfillmentInstanceReference = null;

  private String fulfillmentPreconditions = null;

  private String fulfillmentFeatureSchedule = null;

  private String fiduciaryArrangementFulfillment = null;

  private String fulfillmentPostconditions = null;

  private String fulfillmentFiduciaryArrangementFulfillmentServiceType = null;

  private String fulfillmentFiduciaryArrangementFulfillmentServiceDescription = null;

  private String fulfillmentFiduciaryArrangementFulfillmentServiceInputsandOuputs = null;

  private String fulfillmentFiduciaryArrangementFulfillmentServiceWorkProduct = null;

  private Object fulfillmentExchangeActionTaskRecord = null;

  private CRFiduciaryRelationshipArrangementExchangeInputModelFiduciaryRelationshipArrangementExchangeActionRequest fulfillmentExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Fiduciary Relationship Arrangement instance 
   * @return fiduciaryRelationshipArrangementInstanceReference
  **/

  public String getFiduciaryRelationshipArrangementInstanceReference() {
    return fiduciaryRelationshipArrangementInstanceReference;
  }

  public void setFiduciaryRelationshipArrangementInstanceReference(String fiduciaryRelationshipArrangementInstanceReference) {
    this.fiduciaryRelationshipArrangementInstanceReference = fiduciaryRelationshipArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Fulfillment instance 
   * @return fulfillmentInstanceReference
  **/

  public String getFulfillmentInstanceReference() {
    return fulfillmentInstanceReference;
  }

  public void setFulfillmentInstanceReference(String fulfillmentInstanceReference) {
    this.fulfillmentInstanceReference = fulfillmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return fulfillmentPreconditions
  **/

  public String getFulfillmentPreconditions() {
    return fulfillmentPreconditions;
  }

  public void setFulfillmentPreconditions(String fulfillmentPreconditions) {
    this.fulfillmentPreconditions = fulfillmentPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return fulfillmentFeatureSchedule
  **/

  public String getFulfillmentFeatureSchedule() {
    return fulfillmentFeatureSchedule;
  }

  public void setFulfillmentFeatureSchedule(String fulfillmentFeatureSchedule) {
    this.fulfillmentFeatureSchedule = fulfillmentFeatureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Fiduciary Relationship Arrangement specific Business Service 
   * @return fiduciaryArrangementFulfillment
  **/

  public String getFiduciaryArrangementFulfillment() {
    return fiduciaryArrangementFulfillment;
  }

  public void setFiduciaryArrangementFulfillment(String fiduciaryArrangementFulfillment) {
    this.fiduciaryArrangementFulfillment = fiduciaryArrangementFulfillment;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the feature instance has been fulfilled 
   * @return fulfillmentPostconditions
  **/

  public String getFulfillmentPostconditions() {
    return fulfillmentPostconditions;
  }

  public void setFulfillmentPostconditions(String fulfillmentPostconditions) {
    this.fulfillmentPostconditions = fulfillmentPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return fulfillmentFiduciaryArrangementFulfillmentServiceType
  **/

  public String getFulfillmentFiduciaryArrangementFulfillmentServiceType() {
    return fulfillmentFiduciaryArrangementFulfillmentServiceType;
  }

  public void setFulfillmentFiduciaryArrangementFulfillmentServiceType(String fulfillmentFiduciaryArrangementFulfillmentServiceType) {
    this.fulfillmentFiduciaryArrangementFulfillmentServiceType = fulfillmentFiduciaryArrangementFulfillmentServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return fulfillmentFiduciaryArrangementFulfillmentServiceDescription
  **/

  public String getFulfillmentFiduciaryArrangementFulfillmentServiceDescription() {
    return fulfillmentFiduciaryArrangementFulfillmentServiceDescription;
  }

  public void setFulfillmentFiduciaryArrangementFulfillmentServiceDescription(String fulfillmentFiduciaryArrangementFulfillmentServiceDescription) {
    this.fulfillmentFiduciaryArrangementFulfillmentServiceDescription = fulfillmentFiduciaryArrangementFulfillmentServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return fulfillmentFiduciaryArrangementFulfillmentServiceInputsandOuputs
  **/

  public String getFulfillmentFiduciaryArrangementFulfillmentServiceInputsandOuputs() {
    return fulfillmentFiduciaryArrangementFulfillmentServiceInputsandOuputs;
  }

  public void setFulfillmentFiduciaryArrangementFulfillmentServiceInputsandOuputs(String fulfillmentFiduciaryArrangementFulfillmentServiceInputsandOuputs) {
    this.fulfillmentFiduciaryArrangementFulfillmentServiceInputsandOuputs = fulfillmentFiduciaryArrangementFulfillmentServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return fulfillmentFiduciaryArrangementFulfillmentServiceWorkProduct
  **/

  public String getFulfillmentFiduciaryArrangementFulfillmentServiceWorkProduct() {
    return fulfillmentFiduciaryArrangementFulfillmentServiceWorkProduct;
  }

  public void setFulfillmentFiduciaryArrangementFulfillmentServiceWorkProduct(String fulfillmentFiduciaryArrangementFulfillmentServiceWorkProduct) {
    this.fulfillmentFiduciaryArrangementFulfillmentServiceWorkProduct = fulfillmentFiduciaryArrangementFulfillmentServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return fulfillmentExchangeActionTaskRecord
  **/

  public Object getFulfillmentExchangeActionTaskRecord() {
    return fulfillmentExchangeActionTaskRecord;
  }

  public void setFulfillmentExchangeActionTaskRecord(Object fulfillmentExchangeActionTaskRecord) {
    this.fulfillmentExchangeActionTaskRecord = fulfillmentExchangeActionTaskRecord;
  }


  /**
   * Get fulfillmentExchangeActionRequest
   * @return fulfillmentExchangeActionRequest
  **/

  public CRFiduciaryRelationshipArrangementExchangeInputModelFiduciaryRelationshipArrangementExchangeActionRequest getFulfillmentExchangeActionRequest() {
    return fulfillmentExchangeActionRequest;
  }

  public void setFulfillmentExchangeActionRequest(CRFiduciaryRelationshipArrangementExchangeInputModelFiduciaryRelationshipArrangementExchangeActionRequest fulfillmentExchangeActionRequest) {
    this.fulfillmentExchangeActionRequest = fulfillmentExchangeActionRequest;
  }


}


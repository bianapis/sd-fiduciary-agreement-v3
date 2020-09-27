package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFiduciaryRelationshipArrangementRetrieveOutputModelFiduciaryRelationshipArrangementInstanceAnalysis;
import org.bian.dto.CRFiduciaryRelationshipArrangementRetrieveOutputModelFiduciaryRelationshipArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRFiduciaryRelationshipArrangementRetrieveOutputModel
 */
public class CRFiduciaryRelationshipArrangementRetrieveOutputModel   {
  private String fiduciaryRelationshipArrangementParameterType = null;

  private String fiduciaryRelationshipArrangementSelectedOption = null;

  private String fiduciaryRelationshipArrangementType = null;

  private String fiduciaryRelationshipArrangementReference = null;

  private String fiduciaryRelationshipArrangementSchedule = null;

  private String fiduciaryRelationshipArrangementStatus = null;

  private String fiduciaryRelationshipArrangementCurrency = null;

  private String fiduciaryRelationshipArrangementRegulationReference = null;

  private String fiduciaryRelationshipArrangementRegulationType = null;

  private String fiduciaryRelationshipArrangementJurisdiction = null;

  private String fiduciaryRelationshipArrangementBookingLocation = null;

  private String fiduciaryRelationshipArrangementAccountType = null;

  private String fiduciaryRelationshipArrangementAccountReference = null;

  private String fiduciaryRelationshipArrangementRetrieveActionTaskReference = null;

  private Object fiduciaryRelationshipArrangementRetrieveActionTaskRecord = null;

  private String fiduciaryRelationshipArrangementRetrieveActionResponse = null;

  private CRFiduciaryRelationshipArrangementRetrieveOutputModelFiduciaryRelationshipArrangementInstanceReportRecord fiduciaryRelationshipArrangementInstanceReportRecord = null;

  private CRFiduciaryRelationshipArrangementRetrieveOutputModelFiduciaryRelationshipArrangementInstanceAnalysis fiduciaryRelationshipArrangementInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of Fiduciary Relationship Arrangement 
   * @return fiduciaryRelationshipArrangementType
  **/

  public String getFiduciaryRelationshipArrangementType() {
    return fiduciaryRelationshipArrangementType;
  }

  public void setFiduciaryRelationshipArrangementType(String fiduciaryRelationshipArrangementType) {
    this.fiduciaryRelationshipArrangementType = fiduciaryRelationshipArrangementType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to Fiduciary Relationship Arrangement 
   * @return fiduciaryRelationshipArrangementReference
  **/

  public String getFiduciaryRelationshipArrangementReference() {
    return fiduciaryRelationshipArrangementReference;
  }

  public void setFiduciaryRelationshipArrangementReference(String fiduciaryRelationshipArrangementReference) {
    this.fiduciaryRelationshipArrangementReference = fiduciaryRelationshipArrangementReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: The curreny which is arranged in Fiduciary Relationship Arrangement 
   * @return fiduciaryRelationshipArrangementCurrency
  **/

  public String getFiduciaryRelationshipArrangementCurrency() {
    return fiduciaryRelationshipArrangementCurrency;
  }

  public void setFiduciaryRelationshipArrangementCurrency(String fiduciaryRelationshipArrangementCurrency) {
    this.fiduciaryRelationshipArrangementCurrency = fiduciaryRelationshipArrangementCurrency;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the regulation which is defined in Fiduciary Relationship Arrangement 
   * @return fiduciaryRelationshipArrangementRegulationReference
  **/

  public String getFiduciaryRelationshipArrangementRegulationReference() {
    return fiduciaryRelationshipArrangementRegulationReference;
  }

  public void setFiduciaryRelationshipArrangementRegulationReference(String fiduciaryRelationshipArrangementRegulationReference) {
    this.fiduciaryRelationshipArrangementRegulationReference = fiduciaryRelationshipArrangementRegulationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification that distinguishes between the regularity domains of Fiduciary Relationship Arrangement 
   * @return fiduciaryRelationshipArrangementRegulationType
  **/

  public String getFiduciaryRelationshipArrangementRegulationType() {
    return fiduciaryRelationshipArrangementRegulationType;
  }

  public void setFiduciaryRelationshipArrangementRegulationType(String fiduciaryRelationshipArrangementRegulationType) {
    this.fiduciaryRelationshipArrangementRegulationType = fiduciaryRelationshipArrangementRegulationType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the jurisdiction that is assigned to Fiduciary Relationship Arrangement in case of legal dispute. 
   * @return fiduciaryRelationshipArrangementJurisdiction
  **/

  public String getFiduciaryRelationshipArrangementJurisdiction() {
    return fiduciaryRelationshipArrangementJurisdiction;
  }

  public void setFiduciaryRelationshipArrangementJurisdiction(String fiduciaryRelationshipArrangementJurisdiction) {
    this.fiduciaryRelationshipArrangementJurisdiction = fiduciaryRelationshipArrangementJurisdiction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement in the context of Fiduciary Relationship Arrangement, are entered. 
   * @return fiduciaryRelationshipArrangementBookingLocation
  **/

  public String getFiduciaryRelationshipArrangementBookingLocation() {
    return fiduciaryRelationshipArrangementBookingLocation;
  }

  public void setFiduciaryRelationshipArrangementBookingLocation(String fiduciaryRelationshipArrangementBookingLocation) {
    this.fiduciaryRelationshipArrangementBookingLocation = fiduciaryRelationshipArrangementBookingLocation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of account which is linked to Fiduciary Relationship Arrangement 
   * @return fiduciaryRelationshipArrangementAccountType
  **/

  public String getFiduciaryRelationshipArrangementAccountType() {
    return fiduciaryRelationshipArrangementAccountType;
  }

  public void setFiduciaryRelationshipArrangementAccountType(String fiduciaryRelationshipArrangementAccountType) {
    this.fiduciaryRelationshipArrangementAccountType = fiduciaryRelationshipArrangementAccountType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the account which is linked to Fiduciary Relationship Arrangement 
   * @return fiduciaryRelationshipArrangementAccountReference
  **/

  public String getFiduciaryRelationshipArrangementAccountReference() {
    return fiduciaryRelationshipArrangementAccountReference;
  }

  public void setFiduciaryRelationshipArrangementAccountReference(String fiduciaryRelationshipArrangementAccountReference) {
    this.fiduciaryRelationshipArrangementAccountReference = fiduciaryRelationshipArrangementAccountReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Fiduciary Relationship Arrangement instance retrieve service call 
   * @return fiduciaryRelationshipArrangementRetrieveActionTaskReference
  **/

  public String getFiduciaryRelationshipArrangementRetrieveActionTaskReference() {
    return fiduciaryRelationshipArrangementRetrieveActionTaskReference;
  }

  public void setFiduciaryRelationshipArrangementRetrieveActionTaskReference(String fiduciaryRelationshipArrangementRetrieveActionTaskReference) {
    this.fiduciaryRelationshipArrangementRetrieveActionTaskReference = fiduciaryRelationshipArrangementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return fiduciaryRelationshipArrangementRetrieveActionTaskRecord
  **/

  public Object getFiduciaryRelationshipArrangementRetrieveActionTaskRecord() {
    return fiduciaryRelationshipArrangementRetrieveActionTaskRecord;
  }

  public void setFiduciaryRelationshipArrangementRetrieveActionTaskRecord(Object fiduciaryRelationshipArrangementRetrieveActionTaskRecord) {
    this.fiduciaryRelationshipArrangementRetrieveActionTaskRecord = fiduciaryRelationshipArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return fiduciaryRelationshipArrangementRetrieveActionResponse
  **/

  public String getFiduciaryRelationshipArrangementRetrieveActionResponse() {
    return fiduciaryRelationshipArrangementRetrieveActionResponse;
  }

  public void setFiduciaryRelationshipArrangementRetrieveActionResponse(String fiduciaryRelationshipArrangementRetrieveActionResponse) {
    this.fiduciaryRelationshipArrangementRetrieveActionResponse = fiduciaryRelationshipArrangementRetrieveActionResponse;
  }


  /**
   * Get fiduciaryRelationshipArrangementInstanceReportRecord
   * @return fiduciaryRelationshipArrangementInstanceReportRecord
  **/

  public CRFiduciaryRelationshipArrangementRetrieveOutputModelFiduciaryRelationshipArrangementInstanceReportRecord getFiduciaryRelationshipArrangementInstanceReportRecord() {
    return fiduciaryRelationshipArrangementInstanceReportRecord;
  }

  public void setFiduciaryRelationshipArrangementInstanceReportRecord(CRFiduciaryRelationshipArrangementRetrieveOutputModelFiduciaryRelationshipArrangementInstanceReportRecord fiduciaryRelationshipArrangementInstanceReportRecord) {
    this.fiduciaryRelationshipArrangementInstanceReportRecord = fiduciaryRelationshipArrangementInstanceReportRecord;
  }


  /**
   * Get fiduciaryRelationshipArrangementInstanceAnalysis
   * @return fiduciaryRelationshipArrangementInstanceAnalysis
  **/

  public CRFiduciaryRelationshipArrangementRetrieveOutputModelFiduciaryRelationshipArrangementInstanceAnalysis getFiduciaryRelationshipArrangementInstanceAnalysis() {
    return fiduciaryRelationshipArrangementInstanceAnalysis;
  }

  public void setFiduciaryRelationshipArrangementInstanceAnalysis(CRFiduciaryRelationshipArrangementRetrieveOutputModelFiduciaryRelationshipArrangementInstanceAnalysis fiduciaryRelationshipArrangementInstanceAnalysis) {
    this.fiduciaryRelationshipArrangementInstanceAnalysis = fiduciaryRelationshipArrangementInstanceAnalysis;
  }


}


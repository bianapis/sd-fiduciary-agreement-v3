package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssessmentandReportingInitiateInputModel
 */
public class BQAssessmentandReportingInitiateInputModel   {
  private String fiduciaryRelationshipArrangementInstanceReference = null;

  private Object assessmentandReportingInitiateActionRecord = null;

  private String assessmentandReportingPreconditions = null;

  private String assessmentandReportingFeatureSchedule = null;

  private String analysisandReporting = null;

  private String assessmentandReportingPostconditions = null;

  private String assessmentandReportingAnalysisandReportingServiceType = null;

  private String assessmentandReportingAnalysisandReportingServiceDescription = null;

  private String assessmentandReportingAnalysisandReportingServiceInputsandOuputs = null;

  private String assessmentandReportingAnalysisandReportingServiceWorkProduct = null;

  private String assessmentandReportingAnalysisandReportingServiceName = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return assessmentandReportingInitiateActionRecord
  **/

  public Object getAssessmentandReportingInitiateActionRecord() {
    return assessmentandReportingInitiateActionRecord;
  }

  public void setAssessmentandReportingInitiateActionRecord(Object assessmentandReportingInitiateActionRecord) {
    this.assessmentandReportingInitiateActionRecord = assessmentandReportingInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return assessmentandReportingPreconditions
  **/

  public String getAssessmentandReportingPreconditions() {
    return assessmentandReportingPreconditions;
  }

  public void setAssessmentandReportingPreconditions(String assessmentandReportingPreconditions) {
    this.assessmentandReportingPreconditions = assessmentandReportingPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return assessmentandReportingFeatureSchedule
  **/

  public String getAssessmentandReportingFeatureSchedule() {
    return assessmentandReportingFeatureSchedule;
  }

  public void setAssessmentandReportingFeatureSchedule(String assessmentandReportingFeatureSchedule) {
    this.assessmentandReportingFeatureSchedule = assessmentandReportingFeatureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Fiduciary Relationship Arrangement specific Business Service 
   * @return analysisandReporting
  **/

  public String getAnalysisandReporting() {
    return analysisandReporting;
  }

  public void setAnalysisandReporting(String analysisandReporting) {
    this.analysisandReporting = analysisandReporting;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the feature instance has been fulfilled 
   * @return assessmentandReportingPostconditions
  **/

  public String getAssessmentandReportingPostconditions() {
    return assessmentandReportingPostconditions;
  }

  public void setAssessmentandReportingPostconditions(String assessmentandReportingPostconditions) {
    this.assessmentandReportingPostconditions = assessmentandReportingPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return assessmentandReportingAnalysisandReportingServiceType
  **/

  public String getAssessmentandReportingAnalysisandReportingServiceType() {
    return assessmentandReportingAnalysisandReportingServiceType;
  }

  public void setAssessmentandReportingAnalysisandReportingServiceType(String assessmentandReportingAnalysisandReportingServiceType) {
    this.assessmentandReportingAnalysisandReportingServiceType = assessmentandReportingAnalysisandReportingServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return assessmentandReportingAnalysisandReportingServiceDescription
  **/

  public String getAssessmentandReportingAnalysisandReportingServiceDescription() {
    return assessmentandReportingAnalysisandReportingServiceDescription;
  }

  public void setAssessmentandReportingAnalysisandReportingServiceDescription(String assessmentandReportingAnalysisandReportingServiceDescription) {
    this.assessmentandReportingAnalysisandReportingServiceDescription = assessmentandReportingAnalysisandReportingServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return assessmentandReportingAnalysisandReportingServiceInputsandOuputs
  **/

  public String getAssessmentandReportingAnalysisandReportingServiceInputsandOuputs() {
    return assessmentandReportingAnalysisandReportingServiceInputsandOuputs;
  }

  public void setAssessmentandReportingAnalysisandReportingServiceInputsandOuputs(String assessmentandReportingAnalysisandReportingServiceInputsandOuputs) {
    this.assessmentandReportingAnalysisandReportingServiceInputsandOuputs = assessmentandReportingAnalysisandReportingServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return assessmentandReportingAnalysisandReportingServiceWorkProduct
  **/

  public String getAssessmentandReportingAnalysisandReportingServiceWorkProduct() {
    return assessmentandReportingAnalysisandReportingServiceWorkProduct;
  }

  public void setAssessmentandReportingAnalysisandReportingServiceWorkProduct(String assessmentandReportingAnalysisandReportingServiceWorkProduct) {
    this.assessmentandReportingAnalysisandReportingServiceWorkProduct = assessmentandReportingAnalysisandReportingServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return assessmentandReportingAnalysisandReportingServiceName
  **/

  public String getAssessmentandReportingAnalysisandReportingServiceName() {
    return assessmentandReportingAnalysisandReportingServiceName;
  }

  public void setAssessmentandReportingAnalysisandReportingServiceName(String assessmentandReportingAnalysisandReportingServiceName) {
    this.assessmentandReportingAnalysisandReportingServiceName = assessmentandReportingAnalysisandReportingServiceName;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFiduciaryRelationshipArrangementRetrieveInputModelFiduciaryRelationshipArrangementInstanceAnalysis
 */
public class CRFiduciaryRelationshipArrangementRetrieveInputModelFiduciaryRelationshipArrangementInstanceAnalysis   {
  private String fiduciaryRelationshipArrangementInstanceAnalysisReference = null;

  private String fiduciaryRelationshipArrangementInstanceAnalysisReportType = null;

  private String fiduciaryRelationshipArrangementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return fiduciaryRelationshipArrangementInstanceAnalysisReference
  **/

  public String getFiduciaryRelationshipArrangementInstanceAnalysisReference() {
    return fiduciaryRelationshipArrangementInstanceAnalysisReference;
  }

  public void setFiduciaryRelationshipArrangementInstanceAnalysisReference(String fiduciaryRelationshipArrangementInstanceAnalysisReference) {
    this.fiduciaryRelationshipArrangementInstanceAnalysisReference = fiduciaryRelationshipArrangementInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return fiduciaryRelationshipArrangementInstanceAnalysisReportType
  **/

  public String getFiduciaryRelationshipArrangementInstanceAnalysisReportType() {
    return fiduciaryRelationshipArrangementInstanceAnalysisReportType;
  }

  public void setFiduciaryRelationshipArrangementInstanceAnalysisReportType(String fiduciaryRelationshipArrangementInstanceAnalysisReportType) {
    this.fiduciaryRelationshipArrangementInstanceAnalysisReportType = fiduciaryRelationshipArrangementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return fiduciaryRelationshipArrangementInstanceAnalysisParameters
  **/

  public String getFiduciaryRelationshipArrangementInstanceAnalysisParameters() {
    return fiduciaryRelationshipArrangementInstanceAnalysisParameters;
  }

  public void setFiduciaryRelationshipArrangementInstanceAnalysisParameters(String fiduciaryRelationshipArrangementInstanceAnalysisParameters) {
    this.fiduciaryRelationshipArrangementInstanceAnalysisParameters = fiduciaryRelationshipArrangementInstanceAnalysisParameters;
  }


}


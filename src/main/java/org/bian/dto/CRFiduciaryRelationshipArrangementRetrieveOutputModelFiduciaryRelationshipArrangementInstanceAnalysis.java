package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFiduciaryRelationshipArrangementRetrieveOutputModelFiduciaryRelationshipArrangementInstanceAnalysis
 */
public class CRFiduciaryRelationshipArrangementRetrieveOutputModelFiduciaryRelationshipArrangementInstanceAnalysis   {
  private String fiduciaryRelationshipArrangementInstanceAnalysisData = null;

  private String fiduciaryRelationshipArrangementInstanceAnalysisReportType = null;

  private Object fiduciaryRelationshipArrangementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return fiduciaryRelationshipArrangementInstanceAnalysisData
  **/

  public String getFiduciaryRelationshipArrangementInstanceAnalysisData() {
    return fiduciaryRelationshipArrangementInstanceAnalysisData;
  }

  public void setFiduciaryRelationshipArrangementInstanceAnalysisData(String fiduciaryRelationshipArrangementInstanceAnalysisData) {
    this.fiduciaryRelationshipArrangementInstanceAnalysisData = fiduciaryRelationshipArrangementInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return fiduciaryRelationshipArrangementInstanceAnalysisReport
  **/

  public Object getFiduciaryRelationshipArrangementInstanceAnalysisReport() {
    return fiduciaryRelationshipArrangementInstanceAnalysisReport;
  }

  public void setFiduciaryRelationshipArrangementInstanceAnalysisReport(Object fiduciaryRelationshipArrangementInstanceAnalysisReport) {
    this.fiduciaryRelationshipArrangementInstanceAnalysisReport = fiduciaryRelationshipArrangementInstanceAnalysisReport;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFulfillmentRetrieveOutputModelFulfillmentInstanceAnalysis
 */
public class BQFulfillmentRetrieveOutputModelFulfillmentInstanceAnalysis   {
  private Object fulfillmentInstanceAnalysisRecord = null;

  private String fulfillmentInstanceAnalysisReportType = null;

  private String fulfillmentInstanceAnalysisParameters = null;

  private Object fulfillmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return fulfillmentInstanceAnalysisRecord
  **/

  public Object getFulfillmentInstanceAnalysisRecord() {
    return fulfillmentInstanceAnalysisRecord;
  }

  public void setFulfillmentInstanceAnalysisRecord(Object fulfillmentInstanceAnalysisRecord) {
    this.fulfillmentInstanceAnalysisRecord = fulfillmentInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return fulfillmentInstanceAnalysisReportType
  **/

  public String getFulfillmentInstanceAnalysisReportType() {
    return fulfillmentInstanceAnalysisReportType;
  }

  public void setFulfillmentInstanceAnalysisReportType(String fulfillmentInstanceAnalysisReportType) {
    this.fulfillmentInstanceAnalysisReportType = fulfillmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return fulfillmentInstanceAnalysisParameters
  **/

  public String getFulfillmentInstanceAnalysisParameters() {
    return fulfillmentInstanceAnalysisParameters;
  }

  public void setFulfillmentInstanceAnalysisParameters(String fulfillmentInstanceAnalysisParameters) {
    this.fulfillmentInstanceAnalysisParameters = fulfillmentInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return fulfillmentInstanceAnalysisReport
  **/

  public Object getFulfillmentInstanceAnalysisReport() {
    return fulfillmentInstanceAnalysisReport;
  }

  public void setFulfillmentInstanceAnalysisReport(Object fulfillmentInstanceAnalysisReport) {
    this.fulfillmentInstanceAnalysisReport = fulfillmentInstanceAnalysisReport;
  }


}


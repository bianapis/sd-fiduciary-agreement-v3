package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssessmentandReportingRetrieveOutputModelAssessmentandReportingInstanceAnalysis
 */
public class BQAssessmentandReportingRetrieveOutputModelAssessmentandReportingInstanceAnalysis   {
  private Object assessmentandReportingInstanceAnalysisRecord = null;

  private String assessmentandReportingInstanceAnalysisReportType = null;

  private String assessmentandReportingInstanceAnalysisParameters = null;

  private Object assessmentandReportingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return assessmentandReportingInstanceAnalysisRecord
  **/

  public Object getAssessmentandReportingInstanceAnalysisRecord() {
    return assessmentandReportingInstanceAnalysisRecord;
  }

  public void setAssessmentandReportingInstanceAnalysisRecord(Object assessmentandReportingInstanceAnalysisRecord) {
    this.assessmentandReportingInstanceAnalysisRecord = assessmentandReportingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return assessmentandReportingInstanceAnalysisReportType
  **/

  public String getAssessmentandReportingInstanceAnalysisReportType() {
    return assessmentandReportingInstanceAnalysisReportType;
  }

  public void setAssessmentandReportingInstanceAnalysisReportType(String assessmentandReportingInstanceAnalysisReportType) {
    this.assessmentandReportingInstanceAnalysisReportType = assessmentandReportingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return assessmentandReportingInstanceAnalysisParameters
  **/

  public String getAssessmentandReportingInstanceAnalysisParameters() {
    return assessmentandReportingInstanceAnalysisParameters;
  }

  public void setAssessmentandReportingInstanceAnalysisParameters(String assessmentandReportingInstanceAnalysisParameters) {
    this.assessmentandReportingInstanceAnalysisParameters = assessmentandReportingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return assessmentandReportingInstanceAnalysisReport
  **/

  public Object getAssessmentandReportingInstanceAnalysisReport() {
    return assessmentandReportingInstanceAnalysisReport;
  }

  public void setAssessmentandReportingInstanceAnalysisReport(Object assessmentandReportingInstanceAnalysisReport) {
    this.assessmentandReportingInstanceAnalysisReport = assessmentandReportingInstanceAnalysisReport;
  }


}


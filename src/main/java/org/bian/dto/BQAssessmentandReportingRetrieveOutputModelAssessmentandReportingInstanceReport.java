package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssessmentandReportingRetrieveOutputModelAssessmentandReportingInstanceReport
 */
public class BQAssessmentandReportingRetrieveOutputModelAssessmentandReportingInstanceReport   {
  private Object assessmentandReportingInstanceReportRecord = null;

  private String assessmentandReportingInstanceReportType = null;

  private String assessmentandReportingInstanceReportParameters = null;

  private Object assessmentandReportingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return assessmentandReportingInstanceReportRecord
  **/

  public Object getAssessmentandReportingInstanceReportRecord() {
    return assessmentandReportingInstanceReportRecord;
  }

  public void setAssessmentandReportingInstanceReportRecord(Object assessmentandReportingInstanceReportRecord) {
    this.assessmentandReportingInstanceReportRecord = assessmentandReportingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return assessmentandReportingInstanceReportType
  **/

  public String getAssessmentandReportingInstanceReportType() {
    return assessmentandReportingInstanceReportType;
  }

  public void setAssessmentandReportingInstanceReportType(String assessmentandReportingInstanceReportType) {
    this.assessmentandReportingInstanceReportType = assessmentandReportingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return assessmentandReportingInstanceReportParameters
  **/

  public String getAssessmentandReportingInstanceReportParameters() {
    return assessmentandReportingInstanceReportParameters;
  }

  public void setAssessmentandReportingInstanceReportParameters(String assessmentandReportingInstanceReportParameters) {
    this.assessmentandReportingInstanceReportParameters = assessmentandReportingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return assessmentandReportingInstanceReport
  **/

  public Object getAssessmentandReportingInstanceReport() {
    return assessmentandReportingInstanceReport;
  }

  public void setAssessmentandReportingInstanceReport(Object assessmentandReportingInstanceReport) {
    this.assessmentandReportingInstanceReport = assessmentandReportingInstanceReport;
  }


}


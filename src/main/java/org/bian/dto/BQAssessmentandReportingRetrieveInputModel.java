package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssessmentandReportingRetrieveInputModelAssessmentandReportingInstanceAnalysis;
import org.bian.dto.BQAssessmentandReportingRetrieveInputModelAssessmentandReportingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQAssessmentandReportingRetrieveInputModel
 */
public class BQAssessmentandReportingRetrieveInputModel   {
  private Object assessmentandReportingRetrieveActionTaskRecord = null;

  private String assessmentandReportingRetrieveActionRequest = null;

  private BQAssessmentandReportingRetrieveInputModelAssessmentandReportingInstanceReport assessmentandReportingInstanceReport = null;

  private BQAssessmentandReportingRetrieveInputModelAssessmentandReportingInstanceAnalysis assessmentandReportingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return assessmentandReportingRetrieveActionTaskRecord
  **/

  public Object getAssessmentandReportingRetrieveActionTaskRecord() {
    return assessmentandReportingRetrieveActionTaskRecord;
  }

  public void setAssessmentandReportingRetrieveActionTaskRecord(Object assessmentandReportingRetrieveActionTaskRecord) {
    this.assessmentandReportingRetrieveActionTaskRecord = assessmentandReportingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return assessmentandReportingRetrieveActionRequest
  **/

  public String getAssessmentandReportingRetrieveActionRequest() {
    return assessmentandReportingRetrieveActionRequest;
  }

  public void setAssessmentandReportingRetrieveActionRequest(String assessmentandReportingRetrieveActionRequest) {
    this.assessmentandReportingRetrieveActionRequest = assessmentandReportingRetrieveActionRequest;
  }


  /**
   * Get assessmentandReportingInstanceReport
   * @return assessmentandReportingInstanceReport
  **/

  public BQAssessmentandReportingRetrieveInputModelAssessmentandReportingInstanceReport getAssessmentandReportingInstanceReport() {
    return assessmentandReportingInstanceReport;
  }

  public void setAssessmentandReportingInstanceReport(BQAssessmentandReportingRetrieveInputModelAssessmentandReportingInstanceReport assessmentandReportingInstanceReport) {
    this.assessmentandReportingInstanceReport = assessmentandReportingInstanceReport;
  }


  /**
   * Get assessmentandReportingInstanceAnalysis
   * @return assessmentandReportingInstanceAnalysis
  **/

  public BQAssessmentandReportingRetrieveInputModelAssessmentandReportingInstanceAnalysis getAssessmentandReportingInstanceAnalysis() {
    return assessmentandReportingInstanceAnalysis;
  }

  public void setAssessmentandReportingInstanceAnalysis(BQAssessmentandReportingRetrieveInputModelAssessmentandReportingInstanceAnalysis assessmentandReportingInstanceAnalysis) {
    this.assessmentandReportingInstanceAnalysis = assessmentandReportingInstanceAnalysis;
  }


}


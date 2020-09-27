package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssessmentandReportingRetrieveInputModelAssessmentandReportingInstanceAnalysis
 */
public class BQAssessmentandReportingRetrieveInputModelAssessmentandReportingInstanceAnalysis   {
  private String assessmentandReportingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return assessmentandReportingInstanceAnalysisReference
  **/

  public String getAssessmentandReportingInstanceAnalysisReference() {
    return assessmentandReportingInstanceAnalysisReference;
  }

  public void setAssessmentandReportingInstanceAnalysisReference(String assessmentandReportingInstanceAnalysisReference) {
    this.assessmentandReportingInstanceAnalysisReference = assessmentandReportingInstanceAnalysisReference;
  }


}


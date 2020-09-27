package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssessmentandReportingRetrieveInputModelAssessmentandReportingInstanceReport
 */
public class BQAssessmentandReportingRetrieveInputModelAssessmentandReportingInstanceReport   {
  private String assessmentandReportingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return assessmentandReportingInstanceReportReference
  **/

  public String getAssessmentandReportingInstanceReportReference() {
    return assessmentandReportingInstanceReportReference;
  }

  public void setAssessmentandReportingInstanceReportReference(String assessmentandReportingInstanceReportReference) {
    this.assessmentandReportingInstanceReportReference = assessmentandReportingInstanceReportReference;
  }


}


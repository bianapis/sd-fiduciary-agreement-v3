package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFiduciaryRelationshipArrangementRetrieveInputModelFiduciaryRelationshipArrangementInstanceAnalysis;
import org.bian.dto.CRFiduciaryRelationshipArrangementRetrieveInputModelFiduciaryRelationshipArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRFiduciaryRelationshipArrangementRetrieveInputModel
 */
public class CRFiduciaryRelationshipArrangementRetrieveInputModel   {
  private Object fiduciaryRelationshipArrangementRetrieveActionTaskRecord = null;

  private String fiduciaryRelationshipArrangementRetrieveActionRequest = null;

  private CRFiduciaryRelationshipArrangementRetrieveInputModelFiduciaryRelationshipArrangementInstanceReportRecord fiduciaryRelationshipArrangementInstanceReportRecord = null;

  private CRFiduciaryRelationshipArrangementRetrieveInputModelFiduciaryRelationshipArrangementInstanceAnalysis fiduciaryRelationshipArrangementInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return fiduciaryRelationshipArrangementRetrieveActionRequest
  **/

  public String getFiduciaryRelationshipArrangementRetrieveActionRequest() {
    return fiduciaryRelationshipArrangementRetrieveActionRequest;
  }

  public void setFiduciaryRelationshipArrangementRetrieveActionRequest(String fiduciaryRelationshipArrangementRetrieveActionRequest) {
    this.fiduciaryRelationshipArrangementRetrieveActionRequest = fiduciaryRelationshipArrangementRetrieveActionRequest;
  }


  /**
   * Get fiduciaryRelationshipArrangementInstanceReportRecord
   * @return fiduciaryRelationshipArrangementInstanceReportRecord
  **/

  public CRFiduciaryRelationshipArrangementRetrieveInputModelFiduciaryRelationshipArrangementInstanceReportRecord getFiduciaryRelationshipArrangementInstanceReportRecord() {
    return fiduciaryRelationshipArrangementInstanceReportRecord;
  }

  public void setFiduciaryRelationshipArrangementInstanceReportRecord(CRFiduciaryRelationshipArrangementRetrieveInputModelFiduciaryRelationshipArrangementInstanceReportRecord fiduciaryRelationshipArrangementInstanceReportRecord) {
    this.fiduciaryRelationshipArrangementInstanceReportRecord = fiduciaryRelationshipArrangementInstanceReportRecord;
  }


  /**
   * Get fiduciaryRelationshipArrangementInstanceAnalysis
   * @return fiduciaryRelationshipArrangementInstanceAnalysis
  **/

  public CRFiduciaryRelationshipArrangementRetrieveInputModelFiduciaryRelationshipArrangementInstanceAnalysis getFiduciaryRelationshipArrangementInstanceAnalysis() {
    return fiduciaryRelationshipArrangementInstanceAnalysis;
  }

  public void setFiduciaryRelationshipArrangementInstanceAnalysis(CRFiduciaryRelationshipArrangementRetrieveInputModelFiduciaryRelationshipArrangementInstanceAnalysis fiduciaryRelationshipArrangementInstanceAnalysis) {
    this.fiduciaryRelationshipArrangementInstanceAnalysis = fiduciaryRelationshipArrangementInstanceAnalysis;
  }


}


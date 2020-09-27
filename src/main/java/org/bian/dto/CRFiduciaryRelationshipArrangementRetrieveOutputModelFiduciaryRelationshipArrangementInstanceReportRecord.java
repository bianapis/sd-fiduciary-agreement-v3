package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFiduciaryRelationshipArrangementRetrieveOutputModelFiduciaryRelationshipArrangementInstanceReportRecord
 */
public class CRFiduciaryRelationshipArrangementRetrieveOutputModelFiduciaryRelationshipArrangementInstanceReportRecord   {
  private String fiduciaryRelationshipArrangementInstanceReportData = null;

  private String fiduciaryRelationshipArrangementInstanceReportType = null;

  private Object fiduciaryRelationshipArrangementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return fiduciaryRelationshipArrangementInstanceReportData
  **/

  public String getFiduciaryRelationshipArrangementInstanceReportData() {
    return fiduciaryRelationshipArrangementInstanceReportData;
  }

  public void setFiduciaryRelationshipArrangementInstanceReportData(String fiduciaryRelationshipArrangementInstanceReportData) {
    this.fiduciaryRelationshipArrangementInstanceReportData = fiduciaryRelationshipArrangementInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return fiduciaryRelationshipArrangementInstanceReportType
  **/

  public String getFiduciaryRelationshipArrangementInstanceReportType() {
    return fiduciaryRelationshipArrangementInstanceReportType;
  }

  public void setFiduciaryRelationshipArrangementInstanceReportType(String fiduciaryRelationshipArrangementInstanceReportType) {
    this.fiduciaryRelationshipArrangementInstanceReportType = fiduciaryRelationshipArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return fiduciaryRelationshipArrangementInstanceReport
  **/

  public Object getFiduciaryRelationshipArrangementInstanceReport() {
    return fiduciaryRelationshipArrangementInstanceReport;
  }

  public void setFiduciaryRelationshipArrangementInstanceReport(Object fiduciaryRelationshipArrangementInstanceReport) {
    this.fiduciaryRelationshipArrangementInstanceReport = fiduciaryRelationshipArrangementInstanceReport;
  }


}


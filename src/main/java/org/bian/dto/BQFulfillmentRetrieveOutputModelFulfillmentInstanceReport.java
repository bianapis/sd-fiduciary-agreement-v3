package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFulfillmentRetrieveOutputModelFulfillmentInstanceReport
 */
public class BQFulfillmentRetrieveOutputModelFulfillmentInstanceReport   {
  private Object fulfillmentInstanceReportRecord = null;

  private String fulfillmentInstanceReportType = null;

  private String fulfillmentInstanceReportParameters = null;

  private Object fulfillmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return fulfillmentInstanceReportRecord
  **/

  public Object getFulfillmentInstanceReportRecord() {
    return fulfillmentInstanceReportRecord;
  }

  public void setFulfillmentInstanceReportRecord(Object fulfillmentInstanceReportRecord) {
    this.fulfillmentInstanceReportRecord = fulfillmentInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return fulfillmentInstanceReportType
  **/

  public String getFulfillmentInstanceReportType() {
    return fulfillmentInstanceReportType;
  }

  public void setFulfillmentInstanceReportType(String fulfillmentInstanceReportType) {
    this.fulfillmentInstanceReportType = fulfillmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return fulfillmentInstanceReportParameters
  **/

  public String getFulfillmentInstanceReportParameters() {
    return fulfillmentInstanceReportParameters;
  }

  public void setFulfillmentInstanceReportParameters(String fulfillmentInstanceReportParameters) {
    this.fulfillmentInstanceReportParameters = fulfillmentInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return fulfillmentInstanceReport
  **/

  public Object getFulfillmentInstanceReport() {
    return fulfillmentInstanceReport;
  }

  public void setFulfillmentInstanceReport(Object fulfillmentInstanceReport) {
    this.fulfillmentInstanceReport = fulfillmentInstanceReport;
  }


}


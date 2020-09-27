package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFulfillmentRetrieveInputModelFulfillmentInstanceAnalysis;
import org.bian.dto.BQFulfillmentRetrieveInputModelFulfillmentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFulfillmentRetrieveInputModel
 */
public class BQFulfillmentRetrieveInputModel   {
  private Object fulfillmentRetrieveActionTaskRecord = null;

  private String fulfillmentRetrieveActionRequest = null;

  private BQFulfillmentRetrieveInputModelFulfillmentInstanceReport fulfillmentInstanceReport = null;

  private BQFulfillmentRetrieveInputModelFulfillmentInstanceAnalysis fulfillmentInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return fulfillmentRetrieveActionTaskRecord
  **/

  public Object getFulfillmentRetrieveActionTaskRecord() {
    return fulfillmentRetrieveActionTaskRecord;
  }

  public void setFulfillmentRetrieveActionTaskRecord(Object fulfillmentRetrieveActionTaskRecord) {
    this.fulfillmentRetrieveActionTaskRecord = fulfillmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return fulfillmentRetrieveActionRequest
  **/

  public String getFulfillmentRetrieveActionRequest() {
    return fulfillmentRetrieveActionRequest;
  }

  public void setFulfillmentRetrieveActionRequest(String fulfillmentRetrieveActionRequest) {
    this.fulfillmentRetrieveActionRequest = fulfillmentRetrieveActionRequest;
  }


  /**
   * Get fulfillmentInstanceReport
   * @return fulfillmentInstanceReport
  **/

  public BQFulfillmentRetrieveInputModelFulfillmentInstanceReport getFulfillmentInstanceReport() {
    return fulfillmentInstanceReport;
  }

  public void setFulfillmentInstanceReport(BQFulfillmentRetrieveInputModelFulfillmentInstanceReport fulfillmentInstanceReport) {
    this.fulfillmentInstanceReport = fulfillmentInstanceReport;
  }


  /**
   * Get fulfillmentInstanceAnalysis
   * @return fulfillmentInstanceAnalysis
  **/

  public BQFulfillmentRetrieveInputModelFulfillmentInstanceAnalysis getFulfillmentInstanceAnalysis() {
    return fulfillmentInstanceAnalysis;
  }

  public void setFulfillmentInstanceAnalysis(BQFulfillmentRetrieveInputModelFulfillmentInstanceAnalysis fulfillmentInstanceAnalysis) {
    this.fulfillmentInstanceAnalysis = fulfillmentInstanceAnalysis;
  }


}


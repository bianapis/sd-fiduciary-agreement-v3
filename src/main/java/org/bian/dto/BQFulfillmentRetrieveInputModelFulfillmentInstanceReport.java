package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFulfillmentRetrieveInputModelFulfillmentInstanceReport
 */
public class BQFulfillmentRetrieveInputModelFulfillmentInstanceReport   {
  private String fulfillmentInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return fulfillmentInstanceReportReference
  **/

  public String getFulfillmentInstanceReportReference() {
    return fulfillmentInstanceReportReference;
  }

  public void setFulfillmentInstanceReportReference(String fulfillmentInstanceReportReference) {
    this.fulfillmentInstanceReportReference = fulfillmentInstanceReportReference;
  }


}


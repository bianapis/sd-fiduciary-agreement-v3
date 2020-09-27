package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFiduciaryRelationshipArrangementRetrieveInputModelFiduciaryRelationshipArrangementInstanceReportRecord
 */
public class CRFiduciaryRelationshipArrangementRetrieveInputModelFiduciaryRelationshipArrangementInstanceReportRecord   {
  private String fiduciaryRelationshipArrangementInstanceReportReference = null;

  private String fiduciaryRelationshipArrangementInstanceReportType = null;

  private String fiduciaryRelationshipArrangementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return fiduciaryRelationshipArrangementInstanceReportReference
  **/

  public String getFiduciaryRelationshipArrangementInstanceReportReference() {
    return fiduciaryRelationshipArrangementInstanceReportReference;
  }

  public void setFiduciaryRelationshipArrangementInstanceReportReference(String fiduciaryRelationshipArrangementInstanceReportReference) {
    this.fiduciaryRelationshipArrangementInstanceReportReference = fiduciaryRelationshipArrangementInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return fiduciaryRelationshipArrangementInstanceReportParameters
  **/

  public String getFiduciaryRelationshipArrangementInstanceReportParameters() {
    return fiduciaryRelationshipArrangementInstanceReportParameters;
  }

  public void setFiduciaryRelationshipArrangementInstanceReportParameters(String fiduciaryRelationshipArrangementInstanceReportParameters) {
    this.fiduciaryRelationshipArrangementInstanceReportParameters = fiduciaryRelationshipArrangementInstanceReportParameters;
  }


}


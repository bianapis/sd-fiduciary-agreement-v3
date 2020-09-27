package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementOfferedService;
import org.bian.dto.SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDFiduciaryAgreementRetrieveOutputModel
 */
public class SDFiduciaryAgreementRetrieveOutputModel   {
  private String fiduciaryAgreementRetrieveActionTaskReference = null;

  private Object fiduciaryAgreementRetrieveActionTaskRecord = null;

  private String fiduciaryAgreementRetrieveActionResponse = null;

  private SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementRetrieveActionRecord fiduciaryAgreementRetrieveActionRecord = null;

  private SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementOfferedService fiduciaryAgreementOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return fiduciaryAgreementRetrieveActionTaskReference
  **/

  public String getFiduciaryAgreementRetrieveActionTaskReference() {
    return fiduciaryAgreementRetrieveActionTaskReference;
  }

  public void setFiduciaryAgreementRetrieveActionTaskReference(String fiduciaryAgreementRetrieveActionTaskReference) {
    this.fiduciaryAgreementRetrieveActionTaskReference = fiduciaryAgreementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return fiduciaryAgreementRetrieveActionTaskRecord
  **/

  public Object getFiduciaryAgreementRetrieveActionTaskRecord() {
    return fiduciaryAgreementRetrieveActionTaskRecord;
  }

  public void setFiduciaryAgreementRetrieveActionTaskRecord(Object fiduciaryAgreementRetrieveActionTaskRecord) {
    this.fiduciaryAgreementRetrieveActionTaskRecord = fiduciaryAgreementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return fiduciaryAgreementRetrieveActionResponse
  **/

  public String getFiduciaryAgreementRetrieveActionResponse() {
    return fiduciaryAgreementRetrieveActionResponse;
  }

  public void setFiduciaryAgreementRetrieveActionResponse(String fiduciaryAgreementRetrieveActionResponse) {
    this.fiduciaryAgreementRetrieveActionResponse = fiduciaryAgreementRetrieveActionResponse;
  }


  /**
   * Get fiduciaryAgreementRetrieveActionRecord
   * @return fiduciaryAgreementRetrieveActionRecord
  **/

  public SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementRetrieveActionRecord getFiduciaryAgreementRetrieveActionRecord() {
    return fiduciaryAgreementRetrieveActionRecord;
  }

  public void setFiduciaryAgreementRetrieveActionRecord(SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementRetrieveActionRecord fiduciaryAgreementRetrieveActionRecord) {
    this.fiduciaryAgreementRetrieveActionRecord = fiduciaryAgreementRetrieveActionRecord;
  }


  /**
   * Get fiduciaryAgreementOfferedService
   * @return fiduciaryAgreementOfferedService
  **/

  public SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementOfferedService getFiduciaryAgreementOfferedService() {
    return fiduciaryAgreementOfferedService;
  }

  public void setFiduciaryAgreementOfferedService(SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementOfferedService fiduciaryAgreementOfferedService) {
    this.fiduciaryAgreementOfferedService = fiduciaryAgreementOfferedService;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFiduciaryAgreementRetrieveInputModelFiduciaryAgreementOfferedService;
import org.bian.dto.SDFiduciaryAgreementRetrieveInputModelFiduciaryAgreementRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDFiduciaryAgreementRetrieveInputModel
 */
public class SDFiduciaryAgreementRetrieveInputModel   {
  private Object fiduciaryAgreementRetrieveActionTaskRecord = null;

  private String fiduciaryAgreementRetrieveActionRequest = null;

  private SDFiduciaryAgreementRetrieveInputModelFiduciaryAgreementRetrieveActionRecord fiduciaryAgreementRetrieveActionRecord = null;

  private SDFiduciaryAgreementRetrieveInputModelFiduciaryAgreementOfferedService fiduciaryAgreementOfferedService = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return fiduciaryAgreementRetrieveActionRequest
  **/

  public String getFiduciaryAgreementRetrieveActionRequest() {
    return fiduciaryAgreementRetrieveActionRequest;
  }

  public void setFiduciaryAgreementRetrieveActionRequest(String fiduciaryAgreementRetrieveActionRequest) {
    this.fiduciaryAgreementRetrieveActionRequest = fiduciaryAgreementRetrieveActionRequest;
  }


  /**
   * Get fiduciaryAgreementRetrieveActionRecord
   * @return fiduciaryAgreementRetrieveActionRecord
  **/

  public SDFiduciaryAgreementRetrieveInputModelFiduciaryAgreementRetrieveActionRecord getFiduciaryAgreementRetrieveActionRecord() {
    return fiduciaryAgreementRetrieveActionRecord;
  }

  public void setFiduciaryAgreementRetrieveActionRecord(SDFiduciaryAgreementRetrieveInputModelFiduciaryAgreementRetrieveActionRecord fiduciaryAgreementRetrieveActionRecord) {
    this.fiduciaryAgreementRetrieveActionRecord = fiduciaryAgreementRetrieveActionRecord;
  }


  /**
   * Get fiduciaryAgreementOfferedService
   * @return fiduciaryAgreementOfferedService
  **/

  public SDFiduciaryAgreementRetrieveInputModelFiduciaryAgreementOfferedService getFiduciaryAgreementOfferedService() {
    return fiduciaryAgreementOfferedService;
  }

  public void setFiduciaryAgreementOfferedService(SDFiduciaryAgreementRetrieveInputModelFiduciaryAgreementOfferedService fiduciaryAgreementOfferedService) {
    this.fiduciaryAgreementOfferedService = fiduciaryAgreementOfferedService;
  }


}


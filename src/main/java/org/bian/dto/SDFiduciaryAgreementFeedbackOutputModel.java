package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFiduciaryAgreementFeedbackOutputModelFiduciaryAgreementFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDFiduciaryAgreementFeedbackOutputModel
 */
public class SDFiduciaryAgreementFeedbackOutputModel   {
  private String fiduciaryAgreementFeedbackActionTaskReference = null;

  private Object fiduciaryAgreementFeedbackActionTaskRecord = null;

  private SDFiduciaryAgreementFeedbackOutputModelFiduciaryAgreementFeedbackActionRecord fiduciaryAgreementFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return fiduciaryAgreementFeedbackActionTaskReference
  **/

  public String getFiduciaryAgreementFeedbackActionTaskReference() {
    return fiduciaryAgreementFeedbackActionTaskReference;
  }

  public void setFiduciaryAgreementFeedbackActionTaskReference(String fiduciaryAgreementFeedbackActionTaskReference) {
    this.fiduciaryAgreementFeedbackActionTaskReference = fiduciaryAgreementFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return fiduciaryAgreementFeedbackActionTaskRecord
  **/

  public Object getFiduciaryAgreementFeedbackActionTaskRecord() {
    return fiduciaryAgreementFeedbackActionTaskRecord;
  }

  public void setFiduciaryAgreementFeedbackActionTaskRecord(Object fiduciaryAgreementFeedbackActionTaskRecord) {
    this.fiduciaryAgreementFeedbackActionTaskRecord = fiduciaryAgreementFeedbackActionTaskRecord;
  }


  /**
   * Get fiduciaryAgreementFeedbackActionRecord
   * @return fiduciaryAgreementFeedbackActionRecord
  **/

  public SDFiduciaryAgreementFeedbackOutputModelFiduciaryAgreementFeedbackActionRecord getFiduciaryAgreementFeedbackActionRecord() {
    return fiduciaryAgreementFeedbackActionRecord;
  }

  public void setFiduciaryAgreementFeedbackActionRecord(SDFiduciaryAgreementFeedbackOutputModelFiduciaryAgreementFeedbackActionRecord fiduciaryAgreementFeedbackActionRecord) {
    this.fiduciaryAgreementFeedbackActionRecord = fiduciaryAgreementFeedbackActionRecord;
  }


}


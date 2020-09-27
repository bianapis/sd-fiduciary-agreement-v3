package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFiduciaryAgreementFeedbackInputModelFiduciaryAgreementFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDFiduciaryAgreementFeedbackInputModel
 */
public class SDFiduciaryAgreementFeedbackInputModel   {
  private Object fiduciaryAgreementFeedbackActionTaskRecord = null;

  private SDFiduciaryAgreementFeedbackInputModelFiduciaryAgreementFeedbackActionRecord fiduciaryAgreementFeedbackActionRecord = null;


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

  public SDFiduciaryAgreementFeedbackInputModelFiduciaryAgreementFeedbackActionRecord getFiduciaryAgreementFeedbackActionRecord() {
    return fiduciaryAgreementFeedbackActionRecord;
  }

  public void setFiduciaryAgreementFeedbackActionRecord(SDFiduciaryAgreementFeedbackInputModelFiduciaryAgreementFeedbackActionRecord fiduciaryAgreementFeedbackActionRecord) {
    this.fiduciaryAgreementFeedbackActionRecord = fiduciaryAgreementFeedbackActionRecord;
  }


}


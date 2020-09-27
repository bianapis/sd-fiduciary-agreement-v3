package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFiduciaryAgreementRetrieveInputModelFiduciaryAgreementOfferedServiceFiduciaryAgreementServiceRecord;

import javax.validation.Valid;
  
/**
 * SDFiduciaryAgreementRetrieveInputModelFiduciaryAgreementOfferedService
 */
public class SDFiduciaryAgreementRetrieveInputModelFiduciaryAgreementOfferedService   {
  private String fiduciaryAgreementServiceReference = null;

  private SDFiduciaryAgreementRetrieveInputModelFiduciaryAgreementOfferedServiceFiduciaryAgreementServiceRecord fiduciaryAgreementServiceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return fiduciaryAgreementServiceReference
  **/

  public String getFiduciaryAgreementServiceReference() {
    return fiduciaryAgreementServiceReference;
  }

  public void setFiduciaryAgreementServiceReference(String fiduciaryAgreementServiceReference) {
    this.fiduciaryAgreementServiceReference = fiduciaryAgreementServiceReference;
  }


  /**
   * Get fiduciaryAgreementServiceRecord
   * @return fiduciaryAgreementServiceRecord
  **/

  public SDFiduciaryAgreementRetrieveInputModelFiduciaryAgreementOfferedServiceFiduciaryAgreementServiceRecord getFiduciaryAgreementServiceRecord() {
    return fiduciaryAgreementServiceRecord;
  }

  public void setFiduciaryAgreementServiceRecord(SDFiduciaryAgreementRetrieveInputModelFiduciaryAgreementOfferedServiceFiduciaryAgreementServiceRecord fiduciaryAgreementServiceRecord) {
    this.fiduciaryAgreementServiceRecord = fiduciaryAgreementServiceRecord;
  }


}


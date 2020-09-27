package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementOfferedServiceFiduciaryAgreementServiceRecord;

import javax.validation.Valid;
  
/**
 * SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementOfferedService
 */
public class SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementOfferedService   {
  private String fiduciaryAgreementServiceReference = null;

  private SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementOfferedServiceFiduciaryAgreementServiceRecord fiduciaryAgreementServiceRecord = null;


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

  public SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementOfferedServiceFiduciaryAgreementServiceRecord getFiduciaryAgreementServiceRecord() {
    return fiduciaryAgreementServiceRecord;
  }

  public void setFiduciaryAgreementServiceRecord(SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementOfferedServiceFiduciaryAgreementServiceRecord fiduciaryAgreementServiceRecord) {
    this.fiduciaryAgreementServiceRecord = fiduciaryAgreementServiceRecord;
  }


}


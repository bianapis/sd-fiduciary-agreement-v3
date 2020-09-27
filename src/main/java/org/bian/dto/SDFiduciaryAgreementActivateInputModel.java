package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFiduciaryAgreementActivateInputModelFiduciaryAgreementServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDFiduciaryAgreementActivateInputModel
 */
public class SDFiduciaryAgreementActivateInputModel   {
  private Object fiduciaryAgreementActivationActionTaskRecord = null;

  private String fiduciaryAgreementCenterReference = null;

  private String fiduciaryAgreementServiceReference = null;

  private SDFiduciaryAgreementActivateInputModelFiduciaryAgreementServiceConfigurationRecord fiduciaryAgreementServiceConfigurationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return fiduciaryAgreementActivationActionTaskRecord
  **/

  public Object getFiduciaryAgreementActivationActionTaskRecord() {
    return fiduciaryAgreementActivationActionTaskRecord;
  }

  public void setFiduciaryAgreementActivationActionTaskRecord(Object fiduciaryAgreementActivationActionTaskRecord) {
    this.fiduciaryAgreementActivationActionTaskRecord = fiduciaryAgreementActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return fiduciaryAgreementCenterReference
  **/

  public String getFiduciaryAgreementCenterReference() {
    return fiduciaryAgreementCenterReference;
  }

  public void setFiduciaryAgreementCenterReference(String fiduciaryAgreementCenterReference) {
    this.fiduciaryAgreementCenterReference = fiduciaryAgreementCenterReference;
  }


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
   * Get fiduciaryAgreementServiceConfigurationRecord
   * @return fiduciaryAgreementServiceConfigurationRecord
  **/

  public SDFiduciaryAgreementActivateInputModelFiduciaryAgreementServiceConfigurationRecord getFiduciaryAgreementServiceConfigurationRecord() {
    return fiduciaryAgreementServiceConfigurationRecord;
  }

  public void setFiduciaryAgreementServiceConfigurationRecord(SDFiduciaryAgreementActivateInputModelFiduciaryAgreementServiceConfigurationRecord fiduciaryAgreementServiceConfigurationRecord) {
    this.fiduciaryAgreementServiceConfigurationRecord = fiduciaryAgreementServiceConfigurationRecord;
  }


}


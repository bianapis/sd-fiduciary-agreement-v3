package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFiduciaryAgreementConfigureInputModelFiduciaryAgreementServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDFiduciaryAgreementConfigureInputModel
 */
public class SDFiduciaryAgreementConfigureInputModel   {
  private Object fiduciaryAgreementConfigurationActionTaskRecord = null;

  private String fiduciaryAgreementServicingSessionReference = null;

  private String fiduciaryAgreementServiceReference = null;

  private SDFiduciaryAgreementConfigureInputModelFiduciaryAgreementServiceConfigurationRecord fiduciaryAgreementServiceConfigurationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return fiduciaryAgreementConfigurationActionTaskRecord
  **/

  public Object getFiduciaryAgreementConfigurationActionTaskRecord() {
    return fiduciaryAgreementConfigurationActionTaskRecord;
  }

  public void setFiduciaryAgreementConfigurationActionTaskRecord(Object fiduciaryAgreementConfigurationActionTaskRecord) {
    this.fiduciaryAgreementConfigurationActionTaskRecord = fiduciaryAgreementConfigurationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return fiduciaryAgreementServicingSessionReference
  **/

  public String getFiduciaryAgreementServicingSessionReference() {
    return fiduciaryAgreementServicingSessionReference;
  }

  public void setFiduciaryAgreementServicingSessionReference(String fiduciaryAgreementServicingSessionReference) {
    this.fiduciaryAgreementServicingSessionReference = fiduciaryAgreementServicingSessionReference;
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

  public SDFiduciaryAgreementConfigureInputModelFiduciaryAgreementServiceConfigurationRecord getFiduciaryAgreementServiceConfigurationRecord() {
    return fiduciaryAgreementServiceConfigurationRecord;
  }

  public void setFiduciaryAgreementServiceConfigurationRecord(SDFiduciaryAgreementConfigureInputModelFiduciaryAgreementServiceConfigurationRecord fiduciaryAgreementServiceConfigurationRecord) {
    this.fiduciaryAgreementServiceConfigurationRecord = fiduciaryAgreementServiceConfigurationRecord;
  }


}


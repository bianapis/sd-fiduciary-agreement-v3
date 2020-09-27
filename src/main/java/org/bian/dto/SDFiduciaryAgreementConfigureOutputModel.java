package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFiduciaryAgreementConfigureOutputModelFiduciaryAgreementServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDFiduciaryAgreementConfigureOutputModel
 */
public class SDFiduciaryAgreementConfigureOutputModel   {
  private String fiduciaryAgreementConfigurationActionTaskReference = null;

  private Object fiduciaryAgreementConfigurationActionTaskRecord = null;

  private SDFiduciaryAgreementConfigureOutputModelFiduciaryAgreementServiceConfigurationRecord fiduciaryAgreementServiceConfigurationRecord = null;

  private String fiduciaryAgreementServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return fiduciaryAgreementConfigurationActionTaskReference
  **/

  public String getFiduciaryAgreementConfigurationActionTaskReference() {
    return fiduciaryAgreementConfigurationActionTaskReference;
  }

  public void setFiduciaryAgreementConfigurationActionTaskReference(String fiduciaryAgreementConfigurationActionTaskReference) {
    this.fiduciaryAgreementConfigurationActionTaskReference = fiduciaryAgreementConfigurationActionTaskReference;
  }


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
   * Get fiduciaryAgreementServiceConfigurationRecord
   * @return fiduciaryAgreementServiceConfigurationRecord
  **/

  public SDFiduciaryAgreementConfigureOutputModelFiduciaryAgreementServiceConfigurationRecord getFiduciaryAgreementServiceConfigurationRecord() {
    return fiduciaryAgreementServiceConfigurationRecord;
  }

  public void setFiduciaryAgreementServiceConfigurationRecord(SDFiduciaryAgreementConfigureOutputModelFiduciaryAgreementServiceConfigurationRecord fiduciaryAgreementServiceConfigurationRecord) {
    this.fiduciaryAgreementServiceConfigurationRecord = fiduciaryAgreementServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return fiduciaryAgreementServicingSessionStatus
  **/

  public String getFiduciaryAgreementServicingSessionStatus() {
    return fiduciaryAgreementServicingSessionStatus;
  }

  public void setFiduciaryAgreementServicingSessionStatus(String fiduciaryAgreementServicingSessionStatus) {
    this.fiduciaryAgreementServicingSessionStatus = fiduciaryAgreementServicingSessionStatus;
  }


}


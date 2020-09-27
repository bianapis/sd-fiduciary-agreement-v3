package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFiduciaryAgreementActivateOutputModelFiduciaryAgreementServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDFiduciaryAgreementActivateOutputModel
 */
public class SDFiduciaryAgreementActivateOutputModel   {
  private String fiduciaryAgreementActivationActionTaskReference = null;

  private Object fiduciaryAgreementActivationActionTaskRecord = null;

  private String fiduciaryAgreementServicingSessionReference = null;

  private Object fiduciaryAgreementServicingSessionRecord = null;

  private SDFiduciaryAgreementActivateOutputModelFiduciaryAgreementServiceConfigurationRecord fiduciaryAgreementServiceConfigurationRecord = null;

  private String fiduciaryAgreementServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return fiduciaryAgreementActivationActionTaskReference
  **/

  public String getFiduciaryAgreementActivationActionTaskReference() {
    return fiduciaryAgreementActivationActionTaskReference;
  }

  public void setFiduciaryAgreementActivationActionTaskReference(String fiduciaryAgreementActivationActionTaskReference) {
    this.fiduciaryAgreementActivationActionTaskReference = fiduciaryAgreementActivationActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return fiduciaryAgreementServicingSessionRecord
  **/

  public Object getFiduciaryAgreementServicingSessionRecord() {
    return fiduciaryAgreementServicingSessionRecord;
  }

  public void setFiduciaryAgreementServicingSessionRecord(Object fiduciaryAgreementServicingSessionRecord) {
    this.fiduciaryAgreementServicingSessionRecord = fiduciaryAgreementServicingSessionRecord;
  }


  /**
   * Get fiduciaryAgreementServiceConfigurationRecord
   * @return fiduciaryAgreementServiceConfigurationRecord
  **/

  public SDFiduciaryAgreementActivateOutputModelFiduciaryAgreementServiceConfigurationRecord getFiduciaryAgreementServiceConfigurationRecord() {
    return fiduciaryAgreementServiceConfigurationRecord;
  }

  public void setFiduciaryAgreementServiceConfigurationRecord(SDFiduciaryAgreementActivateOutputModelFiduciaryAgreementServiceConfigurationRecord fiduciaryAgreementServiceConfigurationRecord) {
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


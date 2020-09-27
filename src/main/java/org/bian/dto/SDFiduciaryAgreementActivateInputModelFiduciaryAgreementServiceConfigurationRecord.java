package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFiduciaryAgreementActivateInputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDFiduciaryAgreementActivateInputModelFiduciaryAgreementServiceConfigurationRecord
 */
public class SDFiduciaryAgreementActivateInputModelFiduciaryAgreementServiceConfigurationRecord   {
  private String fiduciaryAgreementServiceConfigurationSettingReference = null;

  private String fiduciaryAgreementServiceConfigurationSettingType = null;

  private SDFiduciaryAgreementActivateInputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceConfigurationSetup fiduciaryAgreementServiceConfigurationSetup = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return fiduciaryAgreementServiceConfigurationSettingReference
  **/

  public String getFiduciaryAgreementServiceConfigurationSettingReference() {
    return fiduciaryAgreementServiceConfigurationSettingReference;
  }

  public void setFiduciaryAgreementServiceConfigurationSettingReference(String fiduciaryAgreementServiceConfigurationSettingReference) {
    this.fiduciaryAgreementServiceConfigurationSettingReference = fiduciaryAgreementServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return fiduciaryAgreementServiceConfigurationSettingType
  **/

  public String getFiduciaryAgreementServiceConfigurationSettingType() {
    return fiduciaryAgreementServiceConfigurationSettingType;
  }

  public void setFiduciaryAgreementServiceConfigurationSettingType(String fiduciaryAgreementServiceConfigurationSettingType) {
    this.fiduciaryAgreementServiceConfigurationSettingType = fiduciaryAgreementServiceConfigurationSettingType;
  }


  /**
   * Get fiduciaryAgreementServiceConfigurationSetup
   * @return fiduciaryAgreementServiceConfigurationSetup
  **/

  public SDFiduciaryAgreementActivateInputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceConfigurationSetup getFiduciaryAgreementServiceConfigurationSetup() {
    return fiduciaryAgreementServiceConfigurationSetup;
  }

  public void setFiduciaryAgreementServiceConfigurationSetup(SDFiduciaryAgreementActivateInputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceConfigurationSetup fiduciaryAgreementServiceConfigurationSetup) {
    this.fiduciaryAgreementServiceConfigurationSetup = fiduciaryAgreementServiceConfigurationSetup;
  }


}


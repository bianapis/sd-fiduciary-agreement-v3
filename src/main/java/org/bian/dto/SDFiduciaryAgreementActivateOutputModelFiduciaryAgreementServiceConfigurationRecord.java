package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFiduciaryAgreementActivateInputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceConfigurationSetup;
import org.bian.dto.SDFiduciaryAgreementActivateOutputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceAgreement;
import org.bian.dto.SDFiduciaryAgreementActivateOutputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDFiduciaryAgreementActivateOutputModelFiduciaryAgreementServiceConfigurationRecord
 */
public class SDFiduciaryAgreementActivateOutputModelFiduciaryAgreementServiceConfigurationRecord   {
  private String fiduciaryAgreementServiceConfigurationSettingReference = null;

  private String fiduciaryAgreementServiceConfigurationSettingDescription = null;

  private SDFiduciaryAgreementActivateInputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceConfigurationSetup fiduciaryAgreementServiceConfigurationSetup = null;

  private SDFiduciaryAgreementActivateOutputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceSubscription fiduciaryAgreementServiceSubscription = null;

  private SDFiduciaryAgreementActivateOutputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceAgreement fiduciaryAgreementServiceAgreement = null;

  private String fiduciaryAgreementServiceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return fiduciaryAgreementServiceConfigurationSettingDescription
  **/

  public String getFiduciaryAgreementServiceConfigurationSettingDescription() {
    return fiduciaryAgreementServiceConfigurationSettingDescription;
  }

  public void setFiduciaryAgreementServiceConfigurationSettingDescription(String fiduciaryAgreementServiceConfigurationSettingDescription) {
    this.fiduciaryAgreementServiceConfigurationSettingDescription = fiduciaryAgreementServiceConfigurationSettingDescription;
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


  /**
   * Get fiduciaryAgreementServiceSubscription
   * @return fiduciaryAgreementServiceSubscription
  **/

  public SDFiduciaryAgreementActivateOutputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceSubscription getFiduciaryAgreementServiceSubscription() {
    return fiduciaryAgreementServiceSubscription;
  }

  public void setFiduciaryAgreementServiceSubscription(SDFiduciaryAgreementActivateOutputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceSubscription fiduciaryAgreementServiceSubscription) {
    this.fiduciaryAgreementServiceSubscription = fiduciaryAgreementServiceSubscription;
  }


  /**
   * Get fiduciaryAgreementServiceAgreement
   * @return fiduciaryAgreementServiceAgreement
  **/

  public SDFiduciaryAgreementActivateOutputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceAgreement getFiduciaryAgreementServiceAgreement() {
    return fiduciaryAgreementServiceAgreement;
  }

  public void setFiduciaryAgreementServiceAgreement(SDFiduciaryAgreementActivateOutputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceAgreement fiduciaryAgreementServiceAgreement) {
    this.fiduciaryAgreementServiceAgreement = fiduciaryAgreementServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return fiduciaryAgreementServiceStatus
  **/

  public String getFiduciaryAgreementServiceStatus() {
    return fiduciaryAgreementServiceStatus;
  }

  public void setFiduciaryAgreementServiceStatus(String fiduciaryAgreementServiceStatus) {
    this.fiduciaryAgreementServiceStatus = fiduciaryAgreementServiceStatus;
  }


}


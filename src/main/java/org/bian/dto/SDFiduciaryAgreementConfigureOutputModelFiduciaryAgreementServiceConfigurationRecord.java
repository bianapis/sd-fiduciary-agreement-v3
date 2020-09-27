package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFiduciaryAgreementConfigureInputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceAgreement;
import org.bian.dto.SDFiduciaryAgreementConfigureInputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceConfigurationSetup;
import org.bian.dto.SDFiduciaryAgreementConfigureInputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDFiduciaryAgreementConfigureOutputModelFiduciaryAgreementServiceConfigurationRecord
 */
public class SDFiduciaryAgreementConfigureOutputModelFiduciaryAgreementServiceConfigurationRecord   {
  private String fiduciaryAgreementServiceConfigurationSettingDescription = null;

  private SDFiduciaryAgreementConfigureInputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceConfigurationSetup fiduciaryAgreementServiceConfigurationSetup = null;

  private SDFiduciaryAgreementConfigureInputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceSubscription fiduciaryAgreementServiceSubscription = null;

  private SDFiduciaryAgreementConfigureInputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceAgreement fiduciaryAgreementServiceAgreement = null;

  private String fiduciaryAgreementServiceStatus = null;


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

  public SDFiduciaryAgreementConfigureInputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceConfigurationSetup getFiduciaryAgreementServiceConfigurationSetup() {
    return fiduciaryAgreementServiceConfigurationSetup;
  }

  public void setFiduciaryAgreementServiceConfigurationSetup(SDFiduciaryAgreementConfigureInputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceConfigurationSetup fiduciaryAgreementServiceConfigurationSetup) {
    this.fiduciaryAgreementServiceConfigurationSetup = fiduciaryAgreementServiceConfigurationSetup;
  }


  /**
   * Get fiduciaryAgreementServiceSubscription
   * @return fiduciaryAgreementServiceSubscription
  **/

  public SDFiduciaryAgreementConfigureInputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceSubscription getFiduciaryAgreementServiceSubscription() {
    return fiduciaryAgreementServiceSubscription;
  }

  public void setFiduciaryAgreementServiceSubscription(SDFiduciaryAgreementConfigureInputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceSubscription fiduciaryAgreementServiceSubscription) {
    this.fiduciaryAgreementServiceSubscription = fiduciaryAgreementServiceSubscription;
  }


  /**
   * Get fiduciaryAgreementServiceAgreement
   * @return fiduciaryAgreementServiceAgreement
  **/

  public SDFiduciaryAgreementConfigureInputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceAgreement getFiduciaryAgreementServiceAgreement() {
    return fiduciaryAgreementServiceAgreement;
  }

  public void setFiduciaryAgreementServiceAgreement(SDFiduciaryAgreementConfigureInputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceAgreement fiduciaryAgreementServiceAgreement) {
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


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
 * SDFiduciaryAgreementConfigureInputModelFiduciaryAgreementServiceConfigurationRecord
 */
public class SDFiduciaryAgreementConfigureInputModelFiduciaryAgreementServiceConfigurationRecord   {
  private String fiduciaryAgreementServiceConfigurationSettingReference = null;

  private String fiduciaryAgreementServiceConfigurationSettingType = null;

  private SDFiduciaryAgreementConfigureInputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceConfigurationSetup fiduciaryAgreementServiceConfigurationSetup = null;

  private SDFiduciaryAgreementConfigureInputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceSubscription fiduciaryAgreementServiceSubscription = null;

  private SDFiduciaryAgreementConfigureInputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceAgreement fiduciaryAgreementServiceAgreement = null;


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


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDFiduciaryAgreementConfigureInputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceSubscription
 */
public class SDFiduciaryAgreementConfigureInputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceSubscription   {
  private String fiduciaryAgreementServiceSubscriberReference = null;

  private String fiduciaryAgreementServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return fiduciaryAgreementServiceSubscriberReference
  **/

  public String getFiduciaryAgreementServiceSubscriberReference() {
    return fiduciaryAgreementServiceSubscriberReference;
  }

  public void setFiduciaryAgreementServiceSubscriberReference(String fiduciaryAgreementServiceSubscriberReference) {
    this.fiduciaryAgreementServiceSubscriberReference = fiduciaryAgreementServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return fiduciaryAgreementServiceSubscriberAccessProfile
  **/

  public String getFiduciaryAgreementServiceSubscriberAccessProfile() {
    return fiduciaryAgreementServiceSubscriberAccessProfile;
  }

  public void setFiduciaryAgreementServiceSubscriberAccessProfile(String fiduciaryAgreementServiceSubscriberAccessProfile) {
    this.fiduciaryAgreementServiceSubscriberAccessProfile = fiduciaryAgreementServiceSubscriberAccessProfile;
  }


}


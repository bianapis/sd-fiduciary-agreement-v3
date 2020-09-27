package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDFiduciaryAgreementActivateOutputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceAgreement
 */
public class SDFiduciaryAgreementActivateOutputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceAgreement   {
  private String fiduciaryAgreementServiceAgreementReference = null;

  private String fiduciaryAgreementServiceUserReference = null;

  private String fiduciaryAgreementServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return fiduciaryAgreementServiceAgreementReference
  **/

  public String getFiduciaryAgreementServiceAgreementReference() {
    return fiduciaryAgreementServiceAgreementReference;
  }

  public void setFiduciaryAgreementServiceAgreementReference(String fiduciaryAgreementServiceAgreementReference) {
    this.fiduciaryAgreementServiceAgreementReference = fiduciaryAgreementServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return fiduciaryAgreementServiceUserReference
  **/

  public String getFiduciaryAgreementServiceUserReference() {
    return fiduciaryAgreementServiceUserReference;
  }

  public void setFiduciaryAgreementServiceUserReference(String fiduciaryAgreementServiceUserReference) {
    this.fiduciaryAgreementServiceUserReference = fiduciaryAgreementServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return fiduciaryAgreementServiceAgreementTermsandConditions
  **/

  public String getFiduciaryAgreementServiceAgreementTermsandConditions() {
    return fiduciaryAgreementServiceAgreementTermsandConditions;
  }

  public void setFiduciaryAgreementServiceAgreementTermsandConditions(String fiduciaryAgreementServiceAgreementTermsandConditions) {
    this.fiduciaryAgreementServiceAgreementTermsandConditions = fiduciaryAgreementServiceAgreementTermsandConditions;
  }


}


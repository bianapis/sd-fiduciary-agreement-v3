package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDFiduciaryAgreementConfigureInputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceConfigurationSetup
 */
public class SDFiduciaryAgreementConfigureInputModelFiduciaryAgreementServiceConfigurationRecordFiduciaryAgreementServiceConfigurationSetup   {
  private String fiduciaryAgreementServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The requested and current activation values for the service configuration parameter  
   * @return fiduciaryAgreementServiceConfigurationParameter
  **/

  public String getFiduciaryAgreementServiceConfigurationParameter() {
    return fiduciaryAgreementServiceConfigurationParameter;
  }

  public void setFiduciaryAgreementServiceConfigurationParameter(String fiduciaryAgreementServiceConfigurationParameter) {
    this.fiduciaryAgreementServiceConfigurationParameter = fiduciaryAgreementServiceConfigurationParameter;
  }


}


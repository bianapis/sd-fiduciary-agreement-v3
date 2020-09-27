package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDFiduciaryAgreementRetrieveInputModelFiduciaryAgreementOfferedServiceFiduciaryAgreementServiceRecord
 */
public class SDFiduciaryAgreementRetrieveInputModelFiduciaryAgreementOfferedServiceFiduciaryAgreementServiceRecord   {
  private String fiduciaryAgreementServiceVersion = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return fiduciaryAgreementServiceVersion
  **/

  public String getFiduciaryAgreementServiceVersion() {
    return fiduciaryAgreementServiceVersion;
  }

  public void setFiduciaryAgreementServiceVersion(String fiduciaryAgreementServiceVersion) {
    this.fiduciaryAgreementServiceVersion = fiduciaryAgreementServiceVersion;
  }


}


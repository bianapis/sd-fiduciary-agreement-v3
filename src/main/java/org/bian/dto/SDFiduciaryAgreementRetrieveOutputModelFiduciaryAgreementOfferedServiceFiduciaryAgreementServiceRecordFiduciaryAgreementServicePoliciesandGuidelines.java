package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementOfferedServiceFiduciaryAgreementServiceRecordFiduciaryAgreementServicePoliciesandGuidelines
 */
public class SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementOfferedServiceFiduciaryAgreementServiceRecordFiduciaryAgreementServicePoliciesandGuidelines   {
  private String fiduciaryAgreementServiceEligibility = null;

  private String fiduciaryAgreementServiceIntendedUses = null;

  private String fiduciaryAgreementServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return fiduciaryAgreementServiceEligibility
  **/

  public String getFiduciaryAgreementServiceEligibility() {
    return fiduciaryAgreementServiceEligibility;
  }

  public void setFiduciaryAgreementServiceEligibility(String fiduciaryAgreementServiceEligibility) {
    this.fiduciaryAgreementServiceEligibility = fiduciaryAgreementServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return fiduciaryAgreementServiceIntendedUses
  **/

  public String getFiduciaryAgreementServiceIntendedUses() {
    return fiduciaryAgreementServiceIntendedUses;
  }

  public void setFiduciaryAgreementServiceIntendedUses(String fiduciaryAgreementServiceIntendedUses) {
    this.fiduciaryAgreementServiceIntendedUses = fiduciaryAgreementServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return fiduciaryAgreementServicePricingandTerms
  **/

  public String getFiduciaryAgreementServicePricingandTerms() {
    return fiduciaryAgreementServicePricingandTerms;
  }

  public void setFiduciaryAgreementServicePricingandTerms(String fiduciaryAgreementServicePricingandTerms) {
    this.fiduciaryAgreementServicePricingandTerms = fiduciaryAgreementServicePricingandTerms;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementOfferedServiceFiduciaryAgreementServiceRecordFiduciaryAgreementServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementOfferedServiceFiduciaryAgreementServiceRecord
 */
public class SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementOfferedServiceFiduciaryAgreementServiceRecord   {
  private String fiduciaryAgreementServiceType = null;

  private String fiduciaryAgreementServiceVersion = null;

  private String fiduciaryAgreementServiceDescription = null;

  private SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementOfferedServiceFiduciaryAgreementServiceRecordFiduciaryAgreementServicePoliciesandGuidelines fiduciaryAgreementServicePoliciesandGuidelines = null;

  private String fiduciaryAgreementServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return fiduciaryAgreementServiceType
  **/

  public String getFiduciaryAgreementServiceType() {
    return fiduciaryAgreementServiceType;
  }

  public void setFiduciaryAgreementServiceType(String fiduciaryAgreementServiceType) {
    this.fiduciaryAgreementServiceType = fiduciaryAgreementServiceType;
  }


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return fiduciaryAgreementServiceDescription
  **/

  public String getFiduciaryAgreementServiceDescription() {
    return fiduciaryAgreementServiceDescription;
  }

  public void setFiduciaryAgreementServiceDescription(String fiduciaryAgreementServiceDescription) {
    this.fiduciaryAgreementServiceDescription = fiduciaryAgreementServiceDescription;
  }


  /**
   * Get fiduciaryAgreementServicePoliciesandGuidelines
   * @return fiduciaryAgreementServicePoliciesandGuidelines
  **/

  public SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementOfferedServiceFiduciaryAgreementServiceRecordFiduciaryAgreementServicePoliciesandGuidelines getFiduciaryAgreementServicePoliciesandGuidelines() {
    return fiduciaryAgreementServicePoliciesandGuidelines;
  }

  public void setFiduciaryAgreementServicePoliciesandGuidelines(SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementOfferedServiceFiduciaryAgreementServiceRecordFiduciaryAgreementServicePoliciesandGuidelines fiduciaryAgreementServicePoliciesandGuidelines) {
    this.fiduciaryAgreementServicePoliciesandGuidelines = fiduciaryAgreementServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return fiduciaryAgreementServiceSchedule
  **/

  public String getFiduciaryAgreementServiceSchedule() {
    return fiduciaryAgreementServiceSchedule;
  }

  public void setFiduciaryAgreementServiceSchedule(String fiduciaryAgreementServiceSchedule) {
    this.fiduciaryAgreementServiceSchedule = fiduciaryAgreementServiceSchedule;
  }


}


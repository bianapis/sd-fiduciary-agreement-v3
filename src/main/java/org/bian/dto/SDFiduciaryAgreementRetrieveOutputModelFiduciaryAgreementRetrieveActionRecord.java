package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementRetrieveActionRecordFiduciaryAgreementActivityAnalysis;
import org.bian.dto.SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementRetrieveActionRecordFiduciaryAgreementPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementRetrieveActionRecord
 */
public class SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementRetrieveActionRecord   {
  private SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementRetrieveActionRecordFiduciaryAgreementActivityAnalysis fiduciaryAgreementActivityAnalysis = null;

  private SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementRetrieveActionRecordFiduciaryAgreementPerformanceAnalysis fiduciaryAgreementPerformanceAnalysis = null;

  private SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get fiduciaryAgreementActivityAnalysis
   * @return fiduciaryAgreementActivityAnalysis
  **/

  public SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementRetrieveActionRecordFiduciaryAgreementActivityAnalysis getFiduciaryAgreementActivityAnalysis() {
    return fiduciaryAgreementActivityAnalysis;
  }

  public void setFiduciaryAgreementActivityAnalysis(SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementRetrieveActionRecordFiduciaryAgreementActivityAnalysis fiduciaryAgreementActivityAnalysis) {
    this.fiduciaryAgreementActivityAnalysis = fiduciaryAgreementActivityAnalysis;
  }


  /**
   * Get fiduciaryAgreementPerformanceAnalysis
   * @return fiduciaryAgreementPerformanceAnalysis
  **/

  public SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementRetrieveActionRecordFiduciaryAgreementPerformanceAnalysis getFiduciaryAgreementPerformanceAnalysis() {
    return fiduciaryAgreementPerformanceAnalysis;
  }

  public void setFiduciaryAgreementPerformanceAnalysis(SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementRetrieveActionRecordFiduciaryAgreementPerformanceAnalysis fiduciaryAgreementPerformanceAnalysis) {
    this.fiduciaryAgreementPerformanceAnalysis = fiduciaryAgreementPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDFiduciaryAgreementRetrieveOutputModelFiduciaryAgreementRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDFiduciaryAgreementRetrieveInputModelFiduciaryAgreementRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDFiduciaryAgreementRetrieveInputModelFiduciaryAgreementRetrieveActionRecordFiduciaryAgreementActivityAnalysis;
import org.bian.dto.SDFiduciaryAgreementRetrieveInputModelFiduciaryAgreementRetrieveActionRecordFiduciaryAgreementPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDFiduciaryAgreementRetrieveInputModelFiduciaryAgreementRetrieveActionRecord
 */
public class SDFiduciaryAgreementRetrieveInputModelFiduciaryAgreementRetrieveActionRecord   {
  private SDFiduciaryAgreementRetrieveInputModelFiduciaryAgreementRetrieveActionRecordFiduciaryAgreementActivityAnalysis fiduciaryAgreementActivityAnalysis = null;

  private SDFiduciaryAgreementRetrieveInputModelFiduciaryAgreementRetrieveActionRecordFiduciaryAgreementPerformanceAnalysis fiduciaryAgreementPerformanceAnalysis = null;

  private SDFiduciaryAgreementRetrieveInputModelFiduciaryAgreementRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get fiduciaryAgreementActivityAnalysis
   * @return fiduciaryAgreementActivityAnalysis
  **/

  public SDFiduciaryAgreementRetrieveInputModelFiduciaryAgreementRetrieveActionRecordFiduciaryAgreementActivityAnalysis getFiduciaryAgreementActivityAnalysis() {
    return fiduciaryAgreementActivityAnalysis;
  }

  public void setFiduciaryAgreementActivityAnalysis(SDFiduciaryAgreementRetrieveInputModelFiduciaryAgreementRetrieveActionRecordFiduciaryAgreementActivityAnalysis fiduciaryAgreementActivityAnalysis) {
    this.fiduciaryAgreementActivityAnalysis = fiduciaryAgreementActivityAnalysis;
  }


  /**
   * Get fiduciaryAgreementPerformanceAnalysis
   * @return fiduciaryAgreementPerformanceAnalysis
  **/

  public SDFiduciaryAgreementRetrieveInputModelFiduciaryAgreementRetrieveActionRecordFiduciaryAgreementPerformanceAnalysis getFiduciaryAgreementPerformanceAnalysis() {
    return fiduciaryAgreementPerformanceAnalysis;
  }

  public void setFiduciaryAgreementPerformanceAnalysis(SDFiduciaryAgreementRetrieveInputModelFiduciaryAgreementRetrieveActionRecordFiduciaryAgreementPerformanceAnalysis fiduciaryAgreementPerformanceAnalysis) {
    this.fiduciaryAgreementPerformanceAnalysis = fiduciaryAgreementPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDFiduciaryAgreementRetrieveInputModelFiduciaryAgreementRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDFiduciaryAgreementRetrieveInputModelFiduciaryAgreementRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}


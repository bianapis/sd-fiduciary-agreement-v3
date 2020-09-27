/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Fulfill;

@BianRestController
public class FiduciaryAgreementApiController {

	@Autowired
	FiduciaryAgreementApiService service;
	
	@Fulfill.Activate
	public BianResponse<SDFiduciaryAgreementActivateOutputModel> activate(@RequestBody BianRequest<SDFiduciaryAgreementActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Fulfill.Configure
	public BianResponse<SDFiduciaryAgreementConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDFiduciaryAgreementConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Control
	public BianResponse<CRFiduciaryRelationshipArrangementControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRFiduciaryRelationshipArrangementControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("agreement")
	@Fulfill.Exchange
	public BianResponse<BQAgreementExchangeOutputModel> exchangeAgreement(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAgreementExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeAgreement(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("fees")
	@Fulfill.Exchange
	public BianResponse<BQFeesExchangeOutputModel> exchangeFees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFeesExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeFees(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("fulfillment")
	@Fulfill.Exchange
	public BianResponse<BQFulfillmentExchangeOutputModel> exchangeFulfillment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFulfillmentExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeFulfillment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Exchange
	public BianResponse<CRFiduciaryRelationshipArrangementExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRFiduciaryRelationshipArrangementExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Execute
	public BianResponse<CRFiduciaryRelationshipArrangementExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRFiduciaryRelationshipArrangementExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Feedback
	public BianResponse<SDFiduciaryAgreementFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDFiduciaryAgreementFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Initiate
	public BianResponse<CRFiduciaryRelationshipArrangementInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRFiduciaryRelationshipArrangementInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("agreement")
	@Fulfill.Initiate
	public BianResponse<BQAgreementInitiateOutputModel> initiateAgreement(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQAgreementInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateAgreement(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("assessmentandreporting")
	@Fulfill.Initiate
	public BianResponse<BQAssessmentandReportingInitiateOutputModel> initiateAssessmentandreporting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQAssessmentandReportingInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateAssessmentandreporting(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("agreement")
	@Fulfill.Request
	public BianResponse<BQAgreementRequestOutputModel> requestAgreement(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAgreementRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestAgreement(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("fees")
	@Fulfill.Request
	public BianResponse<BQFeesRequestOutputModel> requestFees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFeesRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestFees(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("fulfillment")
	@Fulfill.Request
	public BianResponse<BQFulfillmentRequestOutputModel> requestFulfillment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFulfillmentRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestFulfillment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Request
	public BianResponse<CRFiduciaryRelationshipArrangementRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRFiduciaryRelationshipArrangementRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Retrieve
	public BianResponse<CRFiduciaryRelationshipArrangementRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Fulfill.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Fulfill.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Fulfill.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("agreement")
	@Fulfill.Retrieve
	public BianResponse<BQAgreementRetrieveOutputModel> retrieveAgreement(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAgreement(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("assessmentandreporting")
	@Fulfill.Retrieve
	public BianResponse<BQAssessmentandReportingRetrieveOutputModel> retrieveAssessmentandreporting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAssessmentandreporting(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("fees")
	@Fulfill.Retrieve
	public BianResponse<BQFeesRetrieveOutputModel> retrieveFees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFees(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("fulfillment")
	@Fulfill.Retrieve
	public BianResponse<BQFulfillmentRetrieveOutputModel> retrieveFulfillment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFulfillment(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Fulfill.RetrieveSD
	public BianResponse<SDFiduciaryAgreementRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Fulfill.Update
	public BianResponse<CRFiduciaryRelationshipArrangementUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRFiduciaryRelationshipArrangementUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("agreement")
	@Fulfill.Update
	public BianResponse<BQAgreementUpdateOutputModel> updateAgreement(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAgreementUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateAgreement(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}

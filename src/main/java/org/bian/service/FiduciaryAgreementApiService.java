/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface FiduciaryAgreementApiService {

	SDFiduciaryAgreementActivateOutputModel activate(SDFiduciaryAgreementActivateInputModel request);
	
	SDFiduciaryAgreementConfigureOutputModel configure(String sdReferenceId, SDFiduciaryAgreementConfigureInputModel request);
	
	CRFiduciaryRelationshipArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRFiduciaryRelationshipArrangementControlInputModel request);
	
	BQAgreementExchangeOutputModel exchangeAgreement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAgreementExchangeInputModel request);
	
	BQFeesExchangeOutputModel exchangeFees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFeesExchangeInputModel request);
	
	BQFulfillmentExchangeOutputModel exchangeFulfillment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFulfillmentExchangeInputModel request);
	
	CRFiduciaryRelationshipArrangementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRFiduciaryRelationshipArrangementExchangeInputModel request);
	
	CRFiduciaryRelationshipArrangementExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRFiduciaryRelationshipArrangementExecuteInputModel request);
	
	SDFiduciaryAgreementFeedbackOutputModel feedback(String sdReferenceId, SDFiduciaryAgreementFeedbackInputModel request);
	
	CRFiduciaryRelationshipArrangementInitiateOutputModel initiate(String sdReferenceId, CRFiduciaryRelationshipArrangementInitiateInputModel request);
	
	BQAgreementInitiateOutputModel initiateAgreement(String sdReferenceId, String crReferenceId, BQAgreementInitiateInputModel request);
	
	BQAssessmentandReportingInitiateOutputModel initiateAssessmentandreporting(String sdReferenceId, String crReferenceId, BQAssessmentandReportingInitiateInputModel request);
	
	BQAgreementRequestOutputModel requestAgreement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAgreementRequestInputModel request);
	
	BQFeesRequestOutputModel requestFees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFeesRequestInputModel request);
	
	BQFulfillmentRequestOutputModel requestFulfillment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFulfillmentRequestInputModel request);
	
	CRFiduciaryRelationshipArrangementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRFiduciaryRelationshipArrangementRequestInputModel request);
	
	CRFiduciaryRelationshipArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQAgreementRetrieveOutputModel retrieveAgreement(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQAssessmentandReportingRetrieveOutputModel retrieveAssessmentandreporting(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQFeesRetrieveOutputModel retrieveFees(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQFulfillmentRetrieveOutputModel retrieveFulfillment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDFiduciaryAgreementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRFiduciaryRelationshipArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRFiduciaryRelationshipArrangementUpdateInputModel request);
	
	BQAgreementUpdateOutputModel updateAgreement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAgreementUpdateInputModel request);
	
}

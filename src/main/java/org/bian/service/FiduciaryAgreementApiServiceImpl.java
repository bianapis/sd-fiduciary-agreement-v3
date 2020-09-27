/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class FiduciaryAgreementApiServiceImpl implements FiduciaryAgreementApiService {

	public SDFiduciaryAgreementActivateOutputModel activate(SDFiduciaryAgreementActivateInputModel request){
		return JsonReader.read("activate-SDFiduciaryAgreementActivateOutputModel.json",new TypeReference<SDFiduciaryAgreementActivateOutputModel>(){});
	}
	
	public SDFiduciaryAgreementConfigureOutputModel configure(String sdReferenceId, SDFiduciaryAgreementConfigureInputModel request){
		return JsonReader.read("configure-SDFiduciaryAgreementConfigureOutputModel.json",new TypeReference<SDFiduciaryAgreementConfigureOutputModel>(){});
	}
	
	public CRFiduciaryRelationshipArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRFiduciaryRelationshipArrangementControlInputModel request){
		return JsonReader.read("control-CRFiduciaryRelationshipArrangementControlOutputModel.json",new TypeReference<CRFiduciaryRelationshipArrangementControlOutputModel>(){});
	}
	
	public BQAgreementExchangeOutputModel exchangeAgreement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAgreementExchangeInputModel request){
		return JsonReader.read("exchange-BQAgreementExchangeOutputModel.json",new TypeReference<BQAgreementExchangeOutputModel>(){});
	}
	
	public BQFeesExchangeOutputModel exchangeFees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFeesExchangeInputModel request){
		return JsonReader.read("exchange-BQFeesExchangeOutputModel.json",new TypeReference<BQFeesExchangeOutputModel>(){});
	}
	
	public BQFulfillmentExchangeOutputModel exchangeFulfillment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFulfillmentExchangeInputModel request){
		return JsonReader.read("exchange-BQFulfillmentExchangeOutputModel.json",new TypeReference<BQFulfillmentExchangeOutputModel>(){});
	}
	
	public CRFiduciaryRelationshipArrangementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRFiduciaryRelationshipArrangementExchangeInputModel request){
		return JsonReader.read("exchange-CRFiduciaryRelationshipArrangementExchangeOutputModel.json",new TypeReference<CRFiduciaryRelationshipArrangementExchangeOutputModel>(){});
	}
	
	public CRFiduciaryRelationshipArrangementExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRFiduciaryRelationshipArrangementExecuteInputModel request){
		return JsonReader.read("execute-CRFiduciaryRelationshipArrangementExecuteOutputModel.json",new TypeReference<CRFiduciaryRelationshipArrangementExecuteOutputModel>(){});
	}
	
	public SDFiduciaryAgreementFeedbackOutputModel feedback(String sdReferenceId, SDFiduciaryAgreementFeedbackInputModel request){
		return JsonReader.read("feedback-SDFiduciaryAgreementFeedbackOutputModel.json",new TypeReference<SDFiduciaryAgreementFeedbackOutputModel>(){});
	}
	
	public CRFiduciaryRelationshipArrangementInitiateOutputModel initiate(String sdReferenceId, CRFiduciaryRelationshipArrangementInitiateInputModel request){
		return JsonReader.read("initiate-CRFiduciaryRelationshipArrangementInitiateOutputModel.json",new TypeReference<CRFiduciaryRelationshipArrangementInitiateOutputModel>(){});
	}
	
	public BQAgreementInitiateOutputModel initiateAgreement(String sdReferenceId, String crReferenceId, BQAgreementInitiateInputModel request){
		return JsonReader.read("initiate-BQAgreementInitiateOutputModel.json",new TypeReference<BQAgreementInitiateOutputModel>(){});
	}
	
	public BQAssessmentandReportingInitiateOutputModel initiateAssessmentandreporting(String sdReferenceId, String crReferenceId, BQAssessmentandReportingInitiateInputModel request){
		return JsonReader.read("initiate-BQAssessmentandReportingInitiateOutputModel.json",new TypeReference<BQAssessmentandReportingInitiateOutputModel>(){});
	}
	
	public BQAgreementRequestOutputModel requestAgreement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAgreementRequestInputModel request){
		return JsonReader.read("request-BQAgreementRequestOutputModel.json",new TypeReference<BQAgreementRequestOutputModel>(){});
	}
	
	public BQFeesRequestOutputModel requestFees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFeesRequestInputModel request){
		return JsonReader.read("request-BQFeesRequestOutputModel.json",new TypeReference<BQFeesRequestOutputModel>(){});
	}
	
	public BQFulfillmentRequestOutputModel requestFulfillment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFulfillmentRequestInputModel request){
		return JsonReader.read("request-BQFulfillmentRequestOutputModel.json",new TypeReference<BQFulfillmentRequestOutputModel>(){});
	}
	
	public CRFiduciaryRelationshipArrangementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRFiduciaryRelationshipArrangementRequestInputModel request){
		return JsonReader.read("request-CRFiduciaryRelationshipArrangementRequestOutputModel.json",new TypeReference<CRFiduciaryRelationshipArrangementRequestOutputModel>(){});
	}
	
	public CRFiduciaryRelationshipArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRFiduciaryRelationshipArrangementRetrieveOutputModel.json",new TypeReference<CRFiduciaryRelationshipArrangementRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQAgreementRetrieveOutputModel retrieveAgreement(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAgreementRetrieveOutputModel.json",new TypeReference<BQAgreementRetrieveOutputModel>(){});
	}
	
	public BQAssessmentandReportingRetrieveOutputModel retrieveAssessmentandreporting(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAssessmentandReportingRetrieveOutputModel.json",new TypeReference<BQAssessmentandReportingRetrieveOutputModel>(){});
	}
	
	public BQFeesRetrieveOutputModel retrieveFees(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFeesRetrieveOutputModel.json",new TypeReference<BQFeesRetrieveOutputModel>(){});
	}
	
	public BQFulfillmentRetrieveOutputModel retrieveFulfillment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFulfillmentRetrieveOutputModel.json",new TypeReference<BQFulfillmentRetrieveOutputModel>(){});
	}
	
	public SDFiduciaryAgreementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDFiduciaryAgreementRetrieveOutputModel.json",new TypeReference<SDFiduciaryAgreementRetrieveOutputModel>(){});
	}
	
	public CRFiduciaryRelationshipArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRFiduciaryRelationshipArrangementUpdateInputModel request){
		return JsonReader.read("update-CRFiduciaryRelationshipArrangementUpdateOutputModel.json",new TypeReference<CRFiduciaryRelationshipArrangementUpdateOutputModel>(){});
	}
	
	public BQAgreementUpdateOutputModel updateAgreement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAgreementUpdateInputModel request){
		return JsonReader.read("update-BQAgreementUpdateOutputModel.json",new TypeReference<BQAgreementUpdateOutputModel>(){});
	}
	
}

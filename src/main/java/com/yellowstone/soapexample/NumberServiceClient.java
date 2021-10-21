package com.yellowstone.soapexample;

import java.math.BigInteger;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.yellowstone.soapexample.generated.NumberToWords;
import com.yellowstone.soapexample.generated.NumberToWordsResponse;

public class NumberServiceClient extends WebServiceGatewaySupport {

	public final String ENDPOINT = "https://www.dataaccess.com/webservicesserver/NumberConversion.wso";

	public NumberToWordsResponse getWords(BigInteger number) {
		NumberToWords request = new NumberToWords();
		request.setUbiNum(number);
		
		NumberToWordsResponse response = (NumberToWordsResponse) getWebServiceTemplate()
				.marshalSendAndReceive(ENDPOINT, request);
		
		return response;
	}

}

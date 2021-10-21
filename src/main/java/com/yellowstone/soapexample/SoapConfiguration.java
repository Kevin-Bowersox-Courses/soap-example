package com.yellowstone.soapexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapConfiguration {

	@Bean
	  public Jaxb2Marshaller marshaller() {
	    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
	    marshaller.setContextPath("com.yellowstone.soapexample.generated");
	    return marshaller;
	  }

	  @Bean
	  public NumberServiceClient numberClient(Jaxb2Marshaller marshaller) {
	    NumberServiceClient client = new NumberServiceClient();
	    client.setMarshaller(marshaller);
	    client.setUnmarshaller(marshaller);
	    return client;
	  }
	  
}

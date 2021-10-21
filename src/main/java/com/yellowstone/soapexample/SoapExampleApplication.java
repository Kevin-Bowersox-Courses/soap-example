package com.yellowstone.soapexample;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yellowstone.soapexample.generated.NumberToDollarsResponse;
import com.yellowstone.soapexample.generated.NumberToWordsResponse;

@SpringBootApplication
public class SoapExampleApplication implements CommandLineRunner {

	@Autowired
	public NumberServiceClient client;
	
	public static void main(String[] args) {
		SpringApplication.run(SoapExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		NumberToWordsResponse response = client.getWords(new BigInteger("100000"));
		System.out.println(response.getNumberToWordsResult());

	}

}

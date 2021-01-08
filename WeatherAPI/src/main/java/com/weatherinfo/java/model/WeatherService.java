package com.weatherinfo.java.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService implements CommandLineRunner{

	/*
	public ResponseEntity<String> getData(String zipcode) {
		if(zipcode != null && !zipcode.isEmpty()) {
			String url = "http://api.weatherapi.com/v1/forecast.json?key=f3e22e7ac0e94406ada180706210601&q="+ zipcode +"&days=1";
			
			RestTemplate restTemplate = new RestTemplate();
	//		ResponseEntity<Data> data = restTemplate.getForEntity(url, Data.class);
			
			ResponseEntity<String> data1 = restTemplate.getForEntity(url, String.class);
			
			
			System.out.println( data1);
		return data1;
		}
		return null;
	
	}
*/
	public ResponseEntity<Data> getData(String zipcode) {
		if(zipcode != null && !zipcode.isEmpty()) {
			String url = "http://api.weatherapi.com/v1/forecast.json?key=f3e22e7ac0e94406ada180706210601&q="+ zipcode +"&days=1";
			
			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<Data> data = restTemplate.getForEntity(url, Data.class);
			
			System.out.println( data);
		return data;
		}
		return null;
	
	}

	@Override
	public void run(String... args) throws Exception {

		this.getData("10001");
	}
}

package com.weatherinfo.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weatherinfo.java.exception.InvalidZipCodeException;
import com.weatherinfo.java.model.Data;
import com.weatherinfo.java.model.WeatherService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/us")
@Api(value="Weather Resource", description="Shows Resources to get US Weather Info based on ZIP code")
public class WeatherController {
	
	@Autowired
	private WeatherService service;

	/*
	@GetMapping("/get/{zipcode}")
	public ResponseEntity<String> getData(@PathVariable String zipcode) {
		
		System.out.println( zipcode);
//		Data data = new Data();
//		return data;
		return service.getData(zipcode); 
	}
*/
	@ApiOperation(value="Get Weather report by ZIP code")
	@GetMapping("/getweatherinfo/{zipcode}")
	public ResponseEntity<Data> getInfo(@PathVariable String zipcode) throws InvalidZipCodeException {
		if(Integer.parseInt(zipcode)>99999 ||zipcode.length()!=5 ) {
			String msg = "Invalid ZIP Code "+zipcode+" Please enter value after having 5 digit and less then 99999" ;
			throw new InvalidZipCodeException( msg);
			
		} 
		System.out.println( zipcode);
		return service.getData(zipcode);
	}

}

package com.weatherinfo.java.model;

import io.swagger.annotations.ApiModel;

@ApiModel(description="All details about Weather.")
public class Data {

	 Location LocationObject;
	 Current CurrentObject;
	 Forecast ForecastObject;
	 Alerts AlertsObject;


	 // Getter Methods 

	 public Location getLocation() {
	  return LocationObject;
	 }

	 public Current getCurrent() {
	  return CurrentObject;
	 }

	 public Forecast getForecast() {
	  return ForecastObject;
	 }

	 public Alerts getAlerts() {
	  return AlertsObject;
	 }

	 // Setter Methods 

	 public void setLocation(Location locationObject) {
	  this.LocationObject = locationObject;
	 }

	 public void setCurrent(Current currentObject) {
	  this.CurrentObject = currentObject;
	 }

	 public void setForecast(Forecast forecastObject) {
	  this.ForecastObject = forecastObject;
	 }

	 public void setAlerts(Alerts alertsObject) {
	  this.AlertsObject = alertsObject;
	 }

}

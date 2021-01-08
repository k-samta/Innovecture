package com.weatherinfo.java.model;

public class Astro {

	 private String sunrise;
	 private String sunset;
	 private String moonrise;
	 private String moonset;
	 private String moon_phase;
	 private String moon_illumination;


	 // Getter Methods 

	 public String getSunrise() {
	  return sunrise;
	 }

	 public String getSunset() {
	  return sunset;
	 }

	 public String getMoonrise() {
	  return moonrise;
	 }

	 public String getMoonset() {
	  return moonset;
	 }

	 public String getMoon_phase() {
	  return moon_phase;
	 }

	 public String getMoon_illumination() {
	  return moon_illumination;
	 }

	 // Setter Methods 

	 public void setSunrise(String sunrise) {
	  this.sunrise = sunrise;
	 }

	 public void setSunset(String sunset) {
	  this.sunset = sunset;
	 }

	 public void setMoonrise(String moonrise) {
	  this.moonrise = moonrise;
	 }

	 public void setMoonset(String moonset) {
	  this.moonset = moonset;
	 }

	 public void setMoon_phase(String moon_phase) {
	  this.moon_phase = moon_phase;
	 }

	 public void setMoon_illumination(String moon_illumination) {
	  this.moon_illumination = moon_illumination;
	 }

}

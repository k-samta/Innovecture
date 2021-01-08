package com.weatherinfo.java.model;

import java.util.ArrayList;

public class ABC {

	 private String date;
	 private float date_epoch;
	 Day DayObject;
	 Astro AstroObject;

	 ArrayList<Hour> hour;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public float getDate_epoch() {
		return date_epoch;
	}

	public void setDate_epoch(float date_epoch) {
		this.date_epoch = date_epoch;
	}

	public Day getDayObject() {
		return DayObject;
	}

	public void setDayObject(Day dayObject) {
		DayObject = dayObject;
	}

	public Astro getAstroObject() {
		return AstroObject;
	}

	public void setAstroObject(Astro astroObject) {
		AstroObject = astroObject;
	}

	public ArrayList<Hour> getHour() {
		return hour;
	}

	public void setHour(ArrayList<Hour> hour) {
		this.hour = hour;
	}
	 
	 
}

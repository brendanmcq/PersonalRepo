package com.fightfinder.entity;

public class FightEvent {

	
	private String eventDate, eventName;
	
	public FightEvent(){
		
	}
	
	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	@Override
	public String toString() {
		return "FightEvent [eventDate=" + eventDate + ", eventName="
				+ eventName + "]";
	}



}

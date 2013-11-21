package com.fightfinder.entity;

public class FightEvent {

	
	private String eventDate, eventName, organizer;
	
	public FightEvent(){
		
	}
	
	private String getEventDate() {
		return eventDate;
	}

	private void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	private String getEventName() {
		return eventName;
	}

	private void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getOrganizer() {
		return organizer;
	}

	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}

}

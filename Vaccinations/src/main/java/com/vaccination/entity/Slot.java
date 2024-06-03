package com.vaccination.entity;

public enum Slot {
	slot1("9am-11am"),
	slot2("11am-1pm"),
	slot3("1pm-3pm"),
	slot4("3pm-5pm");
private String timeslot;
	
	private Slot(String timeslot) {
		this.timeslot=timeslot;
	}
	
	public String getTimeslot( ) {
		return timeslot;
	}
}

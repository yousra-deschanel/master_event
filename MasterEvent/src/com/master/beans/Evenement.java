package com.master.beans;

public class Evenement {
	private Long id;
	private String event_title ;
	private String event_type ;
	private String description ;
	private String start_date ;
	private String end_date ;

	
	public Evenement() {
		
	}
	public Evenement(long id, String event_title,String event_type, String description,
			String start_date , String end_date) {
		super();
		this.id = id;
		this.event_title = event_title;
		this.event_type = event_type;
		this.description = description;
		this.start_date = start_date;
		this.end_date = end_date;

		
		
	}

	public Evenement(String event_title,String event_type, String description,String start_date , String end_date) {
		super();
		this.event_title = event_title;
		this.event_type = event_type;
		this.description = description;
		this.start_date = start_date;
		this.end_date = end_date;

		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEvent_title() {
		return event_title;
	}
	public void setEvent_title(String event_title) {
		this.event_title = event_title;
	}
	public String getEvent_type() {
		return event_type;
	}
	public void setEvent_type(String event_type) {
		this.event_type = event_type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		if (id != other.getId())
			return false;
		return true;
	}
	
}

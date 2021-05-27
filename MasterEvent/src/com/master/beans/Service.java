package com.master.beans;

public class Service {
	private int  service_id;
	private String service_name ;
	private String main_company ;
	private String domain ;
	private String more_infos ;
	private String number_of_inputs ;
	private String inputs ;
	private String number_of_outputs ;
	private String outputs ;
	
	protected Service() {
		
	}
	public Service( int  service_id, String service_name ,String main_company ,String domain ,String more_infos , String number_of_inputs ,
			String inputs ,String number_of_outputs ,String outputs) {
		super();
		this.service_id = service_id;
		this.service_name  = service_name ;
		this.main_company = main_company ;
		this.domain = domain;
		this.more_infos   = more_infos ;
		this.number_of_inputs = number_of_inputs;
		this.inputs = inputs;
		this.number_of_outputs = number_of_outputs;
		this.outputs = outputs;
	}
	
	public Service( String service_name ,String main_company ,String domain ,String more_infos , String number_of_inputs ,
			String inputs ,String number_of_outputs ,String outputs) {
		super();
		this.service_name  = service_name ;
		this.main_company = main_company ;
		this.domain = domain;
		this.more_infos   = more_infos ;
		this.number_of_inputs = number_of_inputs;
		this.inputs = inputs;
		this.number_of_outputs = number_of_outputs;
		this.outputs = outputs;
	}
	

	public String getMain_company() {
		return main_company;
	}
	public void setMain_company(String main_company) {
		this.main_company = main_company;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getMore_infos() {
		return more_infos;
	}
	public void setMore_infos(String more_infos) {
		this.more_infos = more_infos;
	}
	public String getNumber_of_inputs() {
		return number_of_inputs;
	}
	public void setNumber_of_inputs(String number_of_inputs) {
		this.number_of_inputs = number_of_inputs;
	}
	public String getInputs() {
		return inputs;
	}
	public void setInputs(String inputs) {
		this.inputs = inputs;
	}
	public String getNumber_of_outputs() {
		return number_of_outputs;
	}
	public void setNumber_of_outputs(String number_of_outputs) {
		this.number_of_outputs = number_of_outputs;
	}
	public String getOutputs() {
		return outputs;
	}
	public void setOutputs(String outputs) {
		this.outputs = outputs;
	}
	public int getService_id() {
		return service_id;
	}
	public void setService_id(int service_id) {
		this.service_id = service_id;
	}
	public String getService_name() {
		return service_name;
	}
	public void setService_name(String service_name) {
		this.service_name = service_name;
	}
	



}

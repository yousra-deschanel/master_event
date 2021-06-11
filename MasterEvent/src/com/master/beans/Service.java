package com.master.beans;

public class Service {
	private int  service_id;
	private String service_name ;
	private String domain ;
	private String input_type ;
	private long number_of_inputs ;
	private String inputs ;
	private String output_type ;
	private long number_of_outputs ;
	private String outputs ;
	
	protected Service() {
		
	}
	
	public Service( int  service_id, String service_name ,String domain, String input_type, long number_of_inputs ,
			String inputs ,  String output_type ,long number_of_outputs ,String outputs) {
		super();
		this.service_id = service_id;
		this.service_name  = service_name ;
		this.domain = domain;
		this.input_type = input_type;
		this.number_of_inputs = number_of_inputs;
		this.inputs = inputs;
		this.number_of_outputs = number_of_outputs;
		this.outputs = outputs;
		this.output_type  = output_type ;
	}
	
	public Service( String service_name ,String domain, String input_type, long number_of_inputs ,
			String inputs ,  String output_type ,long number_of_outputs ,String outputs) {
		super();
		this.service_name  = service_name ;
		this.domain = domain;
		this.input_type = input_type;
		this.number_of_inputs = number_of_inputs;
		this.inputs = inputs;
		this.number_of_outputs = number_of_outputs;
		this.outputs = outputs;
		this.output_type  = output_type ;
	}
	


	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}

	public long getNumber_of_inputs() {
		return number_of_inputs;
	}
	public void setNumber_of_inputs(long number_of_inputs) {
		this.number_of_inputs = number_of_inputs;
	}
	public String getInputs() {
		return inputs;
	}
	public void setInputs(String inputs) {
		this.inputs = inputs;
	}
	public long getNumber_of_outputs() {
		return number_of_outputs;
	}
	public void setNumber_of_outputs(long number_of_outputs) {
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
	public String getInput_type() {
		return input_type;
	}
	public void setInput_type(String input_type) {
		this.input_type = input_type;
	}
	public String getOutput_type() {
		return output_type;
	}
	public void setOutput_type(String output_type) {
		this.output_type = output_type;
	}
	



}

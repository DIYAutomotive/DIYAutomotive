package edu.neumont.diyauto;

public class Result {
	String solution;
	String key;
	
	public Result(String key, String solution){
		this.key = key;
		this.solution = solution;
	}
	
	public String getSolution(){
		return solution;
	}
	
	public String getResultKey(){
		return key;
	}
	
	public void setSolution(String sol){
		this.solution = sol;
	}
	
	public void setNewKey(String k){
		this.key = k;
	}
}

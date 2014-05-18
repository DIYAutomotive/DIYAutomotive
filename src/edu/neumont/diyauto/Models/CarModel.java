package edu.neumont.diyauto.Models;

public class CarModel 
{
	
	private int ID;
	private int UserID;
	private int Year;
	private String Make;
	private String Model;
	private String SubModel;
	
	public CarModel(int ID, int UserID, int year, String Make, String Model, String SubModel)
	{
		this.ID = ID;
		this.UserID = UserID;
		this.Year = year;
		this.Make = Make;
		this.Model = Model;
		this.SubModel = SubModel;
	}
	
	public int getUserID() {
		return UserID;
	}
	public long getID() {
		return ID;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		Make = make;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getSubModel() {
		return SubModel;
	}
	public void setSubModel(String subModel) {
		SubModel = subModel;
	}
	
}

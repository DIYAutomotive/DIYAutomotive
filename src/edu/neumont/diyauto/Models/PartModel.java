package edu.neumont.diyauto.Models;

public class PartModel 
{
	private int UserID;
	private int PartID;
	private int PartNumber;
	private String Description;
	public PartModel(int UserID, int PartID, int PartNumber, String Description)
	{
		this.UserID = UserID;
		this.PartID = PartID;
		this.PartNumber = PartNumber;
		this.Description = Description;
	}
	public int getPartNumber() {
		return PartNumber;
	}
	public void setPartNumber(int partNumber) {
		PartNumber = partNumber;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getUserID() {
		return UserID;
	}
	public int getPartID() {
		return PartID;
	}
}

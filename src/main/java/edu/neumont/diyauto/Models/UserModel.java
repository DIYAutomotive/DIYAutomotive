package edu.neumont.diyauto.Models;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;

import edu.neumont.diyauto.DIYEnums.UserTypes;

public class UserModel 
{
	private int UserID;
	private String Username;
	private Date DateOfBirth;
	private String Email;
	private String Avatar;
	private UserTypes userType;
	public UserModel(int UserID, String UserName, Date DateOfBirth, String Email, String Avatar, UserTypes userType)
	{
		this.UserID = UserID;
		this.Username = UserName;
		this.DateOfBirth = DateOfBirth;
		this.Email = Email;
		this.Avatar = Avatar;
		this.userType = userType;
	}
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAvatar() {
		return Avatar;
	}
	public void setAvatar(String avatar) {
		Avatar = avatar;
	}
	public UserTypes getUserType() {
		return userType;
	}
	public void setUserType(UserTypes userType) {
		this.userType = userType;
	}
	public int getUserID() {
		return UserID;
	}
	public String getUsername() {
		return Username;
	}
	
	

}

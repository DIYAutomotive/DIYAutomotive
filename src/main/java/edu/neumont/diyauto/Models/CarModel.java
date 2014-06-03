package edu.neumont.diyauto.Models;
import javax.persistence.*;

@Entity
@Table(name="Cars")
public class CarModel 
{
    @Id
    @Column(name="idCars")
    @SequenceGenerator(name="account_seq", sequenceName="account_seq", initialValue=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="account_seq")
	private int CarID;

    @Column(name = "UserID", nullable = false)
	private int UserID;

    @Column(name = "Year", nullable = false)
    private int Year;

    @Column(name = "MakeID", nullable = false)
    private String Make;

    @Column(name = "ModelID", nullable = false)
	private String Model;

    @Column(name = "SubModelID", nullable = false)
	private String SubModel;
	
	public CarModel(int CarID, int UserID, int year, String Make, String Model, String SubModel)
	{
		this.CarID = CarID;
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
		return CarID;
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

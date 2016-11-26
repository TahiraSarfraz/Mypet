package model;
//import java.util.Date;

public class PetFoodPojo{

	private int PetFood_id;
	private String Name;
	private int ManufacturerDate;
	private int ExpireDate;
	private String For_Pet;
	
	
	public int getPetFood_id() {
		return PetFood_id;
	}
	public void setPetFood_id(int petFood_id) {
		PetFood_id = petFood_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getManufacturerDate() {
		return ManufacturerDate;
	}
	public void setManufacturerDate(int manufacturerDate) {
		ManufacturerDate = manufacturerDate;
	}
	public int getExpireDate() {
		return ExpireDate;
	}
	public void setExpireDate(int expireDate) {
		ExpireDate = expireDate;
	}
	public String getFor_Pet() {
		return For_Pet;
	}
	public void setFor_Pet(String for_Pet) {
		For_Pet = for_Pet;
	}
}

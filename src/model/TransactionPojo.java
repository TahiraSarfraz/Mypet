package model;

import java.sql.Date;

public class TransactionPojo {

	private int Transaction_id;
	private Date date;
	private int User_id;
	private int Pet_id;
	private int PetFood_id;
	private int Accessories_id;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getTransaction_id() {
		return Transaction_id;
	}
	public void setTransaction_id(int transaction_id) {
		Transaction_id = transaction_id;
	}
	
	public int getUser_id() {
		return User_id;
	}
	public void setUser_id(int user_id) {
		User_id = user_id;
	}
	public int getPet_id() {
		return Pet_id;
	}
	public void setPet_id(int pet_id) {
		Pet_id = pet_id;
	}
	public int getPetFood_id() {
		return PetFood_id;
	}
	public void setPetFood_id(int petFood_id) {
		PetFood_id = petFood_id;
	}
	public int getAccessories_id() {
		return Accessories_id;
	}
	public void setAccessories_id(int accessories_id) {
		Accessories_id = accessories_id;
	}
}

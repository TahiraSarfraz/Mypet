package dao;

import model.PetPojo;
import model.TransactionPojo;
import model.UserPojo;
import model.AccessoriesPojo;


public class TestClass {
	 public static void main(String[] args){
		 //UserDao userDao= new UserDao(); //USERDAO
		 //System.out.println(userDao.Insert()); //INSERT
		 //UserPojo pojo = userDao.Retrive();  //RETRIVE
		 //System.out.println(pojo.getUser_id());
		 //System.out.println(pojo.getName());
		 //System.out.println(pojo.getAge());
		 //System.out.println(pojo.getGender());
		//System.out.println(userDao.Update()); //UPDATE
		//System.out.println(userDao.Delete()); //DELETE
		 
		 //PetDao petDao= new PetDao(); //PETDAO
		 //System.out.println(petDao.Insert()); //INSERT
		 //PetPojo pojo = petDao.Retrive();  //RETRIVE
		 //System.out.println(pojo.getPet_id());
		 //System.out.println(pojo.getBreed());
		 //System.out.println(pojo.getAge());
		 //System.out.println(pojo.getColor());
		 //System.out.println(pojo.getGender());
		 //System.out.println(petDao.Update()); //UPDATE
		 //System.out.println(petDao.Delete()); //DELETE
		 
		 //PetFoodDao petfoodDao= new PetFoodDao(); //PETFOODDAO
		 //System.out.println(petfoodDao.Insert()); //INSERT
		 //PetFoodPojo pojo = PetFoodDao.Retrive();  //RETRIVE
		 //System.out.println(pojo.getPetFood_id());
		 //System.out.println(pojo.getName());
		 //System.out.println(pojo.getManufacturerDate());
		 //System.out.println(pojo.getExpireDate());
		//System.out.println(pojo.getFor_Pet());
		//System.out.println(petfoodDao.Update()); //UPDATE
		//System.out.println(petfoodDao.Delete()); //DELETE
		 
		 //AccessoriesDao accessoriesDao= new AccessoriesDao(); //USERDAO
		 //System.out.println(accessoriesDao.Insert()); //INSERT
		 //AccessoriesPojo pojo = accessoriesDao.Retrive();  //RETRIVE
		 //System.out.println(pojo.getAccessories_id());
		 //System.out.println(pojo.getName());
		 //System.out.println(pojo.getPrice());
		//System.out.println(accessoriesDao.Update()); //UPDATE
		//System.out.println(accessoriesDao.Delete()); //DELETE
		 
		 TransactionDao transactionDao= new TransactionDao(); //USERDAO
		 //System.out.println(transactionDao.Insert()); //INSERT
		 TransactionPojo pojo = transactionDao.Retrive();  //RETRIVE
		 System.out.println(pojo.getTransaction_id());
		 //System.out.println(pojo.getDate());
		 System.out.println(pojo.getPet_id());
		System.out.println(pojo.getAccessories_id());
		 System.out.println(pojo.getPetFood_id());
		//System.out.println(transactionDao.Update()); //UPDATE
		//System.out.println(transaction.Delete()); //DELETE
		 
		 
		 
		 
		 
		 
		
	
	 }
}

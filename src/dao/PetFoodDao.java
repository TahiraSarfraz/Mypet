package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.PetFoodPojo;

public class PetFoodDao {

	private DatabaseController databaseController = DatabaseController.getDatabaseController();
	
	public int Insert() {
		final PetFoodPojo pojo = new PetFoodPojo();
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = databaseController.getConnection();
			stmt = conn.prepareStatement("INSERT INTO `mypet`.`petfood` (`PetFood_id`, `Name`, `Manufacturer Date`, `Expire Date`, `For_Pet`) VALUES ('2', 'Bistro', '1-1-2010', '1-1-2016', 'Dog');");
			int result = stmt.executeUpdate();
			return result;
		} catch (final Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			databaseController.close(stmt, conn);
		}
	}
	
	public PetFoodPojo Retrive(){
		
		final PetFoodPojo pojo = new PetFoodPojo();
		Connection conn=null;
		PreparedStatement stmt= null;
		ResultSet result=null;
		
		try{
			conn = databaseController.getConnection();
			stmt = conn.prepareStatement("SELECT * FROM `mypet`.petfood;");
			result = stmt.executeQuery();
			
			
			while(result.next()){
				pojo.setPetFood_id(result.getInt("PetFood_id"));
				pojo.setName(result.getString("Name"));
				pojo.setManufacturerDate(result.getInt("Manufacturer Date"));
				pojo.setExpireDate(result.getInt("Expire Date"));
				pojo.setFor_Pet(result.getString("For_Pet"));
				
			}
			return pojo;
		}
		catch(final Exception e){
			e.printStackTrace();
			return pojo;
			
		}
		finally{
			databaseController.close(result,stmt,conn);
		}
	}		
	public int Update(){
		final PetFoodPojo pojo = new PetFoodPojo();
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try{
			conn = databaseController.getConnection();
			stmt=conn.prepareStatement("UPDATE `mypet`.`petfood` SET `PetFood_id`='5' WHERE `PetFood_id_id`='2' ");
			int result=stmt.executeUpdate();
			return result;
		}
		catch(final Exception e){
			e.printStackTrace();
			return -1;
		}
		finally{
			databaseController.close(conn,stmt);
		}
	}
	
	public int Delete(){
		final PetFoodPojo pojo = new PetFoodPojo();
			Connection conn = null;
			PreparedStatement stmt = null;
			
			try{
				conn=databaseController.getConnection();
				stmt=conn.prepareStatement("DELETE FROM pizza where PetFood_id=5");
				int result=stmt.executeUpdate();
				return result;
				
				
			}
			catch(final Exception e){
				e.printStackTrace();
				return -1;
			}
			finally{
				databaseController.close(stmt,conn);
				
				
			}
		}
	
}

	
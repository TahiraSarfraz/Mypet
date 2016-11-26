package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.PetPojo;

public class PetDao {

	private DatabaseController databaseController = DatabaseController.getDatabaseController();
	
	public int Insert() {
		final PetPojo pojo = new PetPojo();
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = databaseController.getConnection();
			stmt = conn.prepareStatement("INSERT INTO `mypet`.`pet` (`Pet_id`, `Age`, `Gender`, `Color`, `Breed`) VALUES ('1', '2', 'Male', 'Black', 'German Shepherd');");
			int result = stmt.executeUpdate();
			return result;
		} catch (final Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			databaseController.close(stmt, conn);
		}
	}
	
	public PetPojo Retrive(){
		
		final PetPojo pojo = new PetPojo();
		Connection conn=null;
		PreparedStatement stmt= null;
		ResultSet result=null;
		
		try{
			conn = databaseController.getConnection();
			stmt = conn.prepareStatement("SELECT * FROM mypet.pet;");
			result = stmt.executeQuery();
			
			
			while(result.next()){
				pojo.setPet_id(result.getInt("Pet_id"));
				pojo.setColor(result.getString("Color"));
				pojo.setBreed(result.getString("Breed"));
				pojo.setAge(result.getInt("Age"));
				pojo.setGender(result.getString("Gender"));
				
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
		final PetPojo pojo = new PetPojo();
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try{
			conn = databaseController.getConnection();
			stmt=conn.prepareStatement("UPDATE `mypet`.`pet` SET `Pet_id`='3' WHERE `Pet_id`='1'; ");
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
		final PetPojo pojo = new PetPojo();
			Connection conn = null;
			PreparedStatement stmt = null;
			
			try{
				conn=databaseController.getConnection();
				stmt=conn.prepareStatement("DELETE FROM pet where Pet_id=3");
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

	
package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.UserPojo;

public class UserDao {

	private DatabaseController databaseController = DatabaseController.getDatabaseController();

	public int Insert() {
		final UserPojo pojo = new UserPojo();
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = databaseController.getConnection();
			stmt = conn.prepareStatement("INSERT INTO `mypet`.`user` (`User_id`, `Name`, `Age`, `Gender`) VALUES ('1', 'Ayesha', '20', 'Female');");
			int result = stmt.executeUpdate();
			return result;
		} catch (final Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			databaseController.close(stmt, conn);
		}
	}
	
	public UserPojo Retrive(){
		
		final UserPojo pojo = new UserPojo();
		Connection conn=null;
		PreparedStatement stmt= null;
		ResultSet result=null;
		
		try{
			conn = databaseController.getConnection();
			stmt = conn.prepareStatement("SELECT * FROM mypet.user");
			result = stmt.executeQuery();
			
			
			while(result.next()){
				pojo.setUser_id(result.getInt("User_id"));
				pojo.setName(result.getString("Name"));
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
		final UserPojo pojo = new UserPojo();
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try{
			conn = databaseController.getConnection();
			stmt=conn.prepareStatement("UPDATE `mypet`.`user` SET `User_id`='2' WHERE `User_id`='1'");
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
		final UserPojo pojo = new UserPojo();
			Connection conn = null;
			PreparedStatement stmt = null;
			
			try{
				conn=databaseController.getConnection();
				stmt=conn.prepareStatement("DELETE FROM user where User_id=2");
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

	
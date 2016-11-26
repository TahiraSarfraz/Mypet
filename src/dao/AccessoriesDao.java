package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.AccessoriesPojo;

public class AccessoriesDao {

	private DatabaseController databaseController = DatabaseController.getDatabaseController();

	public int Insert() {
		final AccessoriesPojo pojo = new AccessoriesPojo();
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = databaseController.getConnection();
			stmt = conn.prepareStatement("INSERT INTO `mypet`.`accessories` (`Accessories_id`, `Name`, `Price`) VALUES ('1', 'Playing Mate', '2500');");
			int result = stmt.executeUpdate();
			return result;
		} catch (final Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			databaseController.close(stmt, conn);
		}
	}
	
	public AccessoriesPojo Retrive(){
		
		final AccessoriesPojo pojo = new AccessoriesPojo();
		Connection conn=null;
		PreparedStatement stmt= null;
		ResultSet result=null;
		
		try{
			conn = databaseController.getConnection();
			stmt = conn.prepareStatement("SELECT * FROM `mypet`.accessories;");
			result = stmt.executeQuery();
			
			
			while(result.next()){
				pojo.setAccessories_id(result.getInt("Accessories_id"));
				pojo.setName(result.getString("Name"));
				pojo.setPrice(result.getInt("Price"));
				
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
		final AccessoriesPojo pojo = new AccessoriesPojo();
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try{
			conn = databaseController.getConnection();
			stmt=conn.prepareStatement("UPDATE `pizza shop`.`pizza` SET `Pizza_id`='5' WHERE `Pizza_id`='4' ");
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
		final AccessoriesPojo pojo = new AccessoriesPojo();
			Connection conn = null;
			PreparedStatement stmt = null;
			
			try{
				conn=databaseController.getConnection();
				stmt=conn.prepareStatement("DELETE FROM pizza where Pizza_id=6");
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

	
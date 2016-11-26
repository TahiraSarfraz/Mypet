package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.TransactionPojo;

public class TransactionDao {

	private DatabaseController databaseController = DatabaseController.getDatabaseController();
	
	public int Insert() {
		final TransactionPojo pojo = new TransactionPojo();
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = databaseController.getConnection();
			stmt = conn.prepareStatement("INSERT INTO `mypet`.`transaction` (`Transaction_id`, `User_id`, `Pet_id`, `Pet Food_id`, `Accessories_id`) VALUES ('6', '1', '1', '1', '1')");
			int result = stmt.executeUpdate();
			return result;
		} catch (final Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			databaseController.close(stmt, conn);
		}
	}
	
	public TransactionPojo Retrive(){
		
		final TransactionPojo pojo = new TransactionPojo();
		Connection conn=null;
		PreparedStatement stmt= null;
		ResultSet result=null;
		
		try{
			conn = databaseController.getConnection();
			stmt = conn.prepareStatement("SELECT * FROM `mypet`.transaction;");
			result = stmt.executeQuery();
			
			
			while(result.next()){
				pojo.setUser_id(result.getInt("User_id"));
				pojo.setTransaction_id(result.getInt("Transaction_id"));
				pojo.setDate(result.getDate("Date"));
				pojo.setPet_id(result.getInt("Pet_id"));
				pojo.setAccessories_id(result.getInt("Accessories_id"));
				pojo.setPetFood_id(result.getInt("Pet Food_id"));
	
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
		final TransactionPojo pojo = new TransactionPojo();
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try{
			conn = databaseController.getConnection();
			stmt=conn.prepareStatement("UPDATE `mypet`.`transaction` SET `Transaction_id`='5' WHERE `Transaction_id`='6' ");
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
		final TransactionPojo pojo = new TransactionPojo();
			Connection conn = null;
			PreparedStatement stmt = null;
			
			try{
				conn=databaseController.getConnection();
				stmt=conn.prepareStatement("DELETE FROM transaction where Transaction_id=5");
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

	
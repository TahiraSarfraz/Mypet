package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;
 
public class DatabaseController {
	
	private static DatabaseController databaseController;
	private Connection conn;
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost/mypet";
	private String connectionString;
	private String USER= "root";
	private String PASS= "123456";
	
	
	private DatabaseController(){}
	
	public static DatabaseController getDatabaseController(){
		if(databaseController == null){
			databaseController = new DatabaseController();
		
		return databaseController;
		}else{
			return databaseController;
		}
		
	}
				public Connection getConnection(){
					try{
						if(conn ==null){
							Class.forName(JDBC_DRIVER);
							conn=DriverManager.getConnection(DB_URL,USER,PASS);
						}
						return conn;
					}
					catch(final Exception e){
						e.printStackTrace();
						return null;}}
					
					public void close(final Object... objects) {
						try {
							for (Object object : objects) {
								if (object != null && object instanceof ResultSet) {
									final ResultSet result = (ResultSet) object;
									if (!result.isClosed()) {
										result.close();
									}
								} else if (object != null && object instanceof PreparedStatement) {
									final PreparedStatement stmt = (PreparedStatement) object;
									if (!stmt.isClosed()) {
										stmt.close();
									}
								} else if (object != null && object instanceof Connection) {
									final Connection conn = (Connection) object;
									if (!conn.isClosed()) {
										conn.close();
									}
								}
							}
						} catch (final Exception e) {
							e.printStackTrace();
						}
					}

				@Override
				protected Object clone() throws CloneNotSupportedException {
					// TODO Auto-generated method stub
					return super.clone();
				}
				
				
	}



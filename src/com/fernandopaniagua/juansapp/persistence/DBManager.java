package com.fernandopaniagua.juansapp.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
	protected Connection conexion;
	protected static final String DRIVER = "com.mysql.jdbc.Driver";
	protected static final String SERVIDOR = "jdbc:mysql://10.10.1.50/juansapp";
	protected static final String USER = "juansapp";
	protected static final String PASSWORD = "juansapp";
	
	public DBManager() throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER);
		establecerConexion();
	}
	
	public void cerrarConexion() throws SQLException {
		conexion.close();
	}
	
	public void establecerConexion() throws SQLException {
		conexion = DriverManager.getConnection(SERVIDOR, USER, PASSWORD);
	}
}

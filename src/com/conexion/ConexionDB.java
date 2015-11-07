/**
 * 
 */
package com.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
	
	static Connection con = null;
	private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL_CONEXION = "jdbc:mysql://localhost/seguimiento_uno";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
	
	
	public static Connection getConnection() {
		
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL_CONEXION, USUARIO,PASSWORD);
		} catch (SQLException | ClassNotFoundException e) {
			System.out.print("Se perratio la DB" + e);
		}

		return con;

	}
}

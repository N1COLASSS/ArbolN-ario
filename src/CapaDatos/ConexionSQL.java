package CapaDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQL {

    private static final String URL = "jdbc:sqlserver://localhost\\SQLEXPRESS;databasName=Arbol";
    private static final String INTEGRATED_SECURITY = ";integratedSecurity=true";
    private static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//    private static final String AUTH_LIB_PATH = "C:\\Users\\estudios1\\Downloads\\sqljdbc_12.8\\esn\\auth\\x64\\sqljdbc_auth.dll";
    private static final String AUTH_LIB_PATH = "C:\\Users\\brend\\Documents\\Proyectos\\KIM21\\Workspace\\ArbolN-ario\\mssql-jdbc_auth-12.8.0.x64.dll";
    public static Connection getConnection() throws SQLException {
        try {
            // Establecer la ruta a sqljdbc_auth.dll en la propiedad del sistema java.library.path
            System.setProperty("java.library.path", AUTH_LIB_PATH);
            
            // Cargar el controlador JDBC
            Class.forName(JDBC_DRIVER);
            
            // Obtener la conexión
            return DriverManager.getConnection(URL + INTEGRATED_SECURITY);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("Error al cargar el controlador JDBC.", e);
        }
    }
}
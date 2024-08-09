package CapaDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase que gestiona la conexión a la base de datos SQL Server Express utilizando
 * seguridad integrada de Windows.
 */
public class ConexionSQL {

    // Cadena de conexión a la base de datos utilizando seguridad integrada de Windows
    //TRABAJO NICOLAS
//    private static final String CONNECTION_STRING = "jdbc:sqlserver://DESK-ESTUDIOS1\\SQLEXPRESS:1433;databaseName=Arbol;integratedSecurity=true;encrypt=true;trustServerCertificate=true;";
    
    //CASA NICOLAS
    private static final String CONNECTION_STRING = "jdbc:sqlserver://DESKTOP-JD3VUB1\\SQLEXPRESS:1433;databaseName=ArbolNario;integratedSecurity=true;encrypt=true;trustServerCertificate=true;";

    /**
     * Método principal para probar la conexión a la base de datos.
     * 
     * @param args argumentos de la línea de comandoa
     */
    public static void main(String[] args) {
        // Probar la conexión a la base de datos
        probarConexion();
    }

    /**
     * Prueba la conexión a la base de datos e imprime el resultado.
     */
    private static void probarConexion() {
        try (Connection connection = getConnection()) {
            if (connection != null) {
                System.out.println("Conexión exitosa.");
            } else {
                System.out.println("Fallo en la conexión.");
            }
        } catch (SQLException e) {
            System.err.println("Error en la conexión: " + e.getMessage());
        }
    }

    /**
     * Obtiene una conexión a la base de datos.
     * 
     * @return una conexión a la base de datos
     * @throws SQLException si ocurre un error al intentar conectar
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(CONNECTION_STRING);
    }
}
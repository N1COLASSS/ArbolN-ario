package CapaDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConexion {

    public static void main(String[] args) {
        try (Connection connection = ConexionSQL.getConnection()) {
            if (connection != null) {
                System.out.println("Conexión establecida exitosamente.");
                
                // Prueba simple para ejecutar una consulta
                String query = "SELECT dbo.activos";
                try (Statement stmt = connection.createStatement()) {
                    boolean result = stmt.execute(query);
                    System.out.println("Consulta ejecutada exitosamente, resultado: " + result);
                }
            } else {
                System.out.println("No se pudo establecer la conexión.");
            }
        } catch (SQLException e) {
            System.err.println("Error al conectar con la base de datos:");
            e.printStackTrace();
        }
    }
}

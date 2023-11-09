package Conectar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {
	    private final String jdbcURL;
	    private final String username;
	    private final String password;

	    public Conectar(String jdbcURL, String username, String password) {
	        this.jdbcURL = jdbcURL;
	        this.username = username;
	        this.password = password;
	    }

	    public Connection getConnection() {
	        Connection connection = null;
	        try {
	            connection = DriverManager.getConnection(jdbcURL, username, password);
	            System.out.println("Conexão com o banco de dados MySQL estabelecida com sucesso.");
	        } catch (SQLException e) {
	            System.err.println("Erro ao estabelecer a conexão com o banco de dados: " + e.getMessage());
	        }
	        return connection;
	    }

	    public void closeConnection(Connection connection) {
	        if (connection != null) {
	            try {
	                connection.close();
	                System.out.println("Conexão com o banco de dados MySQL fechada com sucesso.");
	            } catch (SQLException e) {
	                System.err.println("Erro ao fechar a conexão com o banco de dados: " + e.getMessage());
	            }
	        }
	    }

	    public static void main(String[] args) {
	        // Substitua as informações a seguir com suas configurações específicas.
	        String jdbcURL = "jdbc:mysql://localhost:3306/seubanco";
	        String username = "seu_usuario";
	        String password = "sua_senha";

	        Conectar dbConnection = new Conectar(jdbcURL, username, password);
	        Connection connection = dbConnection.getConnection();

	        // Realize operações no banco de dados usando a conexão.

	        dbConnection.closeConnection(connection);
	    }
	}
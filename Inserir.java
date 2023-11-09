package Conectar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Inserir {

	public static void main(String[] args) {
	   
	        // Configurações de conexão com o banco de dados
	        String jdbcURL = "jdbc:mysql://localhost:3306/contatos";
	        String username = "root";
	        String password = "senai";

	        try {
	            // Registra o driver JDBC
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Estabelece a conexão com o banco de dados
	            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

	            if (connection != null) {
	                System.out.println("Conexão com o banco de dados MySQL bem-sucedida!");

	                // Inserir dados na tabela
	                inserirDados(connection, 1, "Demolidor", "Ficção", "Paul Miller", "2:40");

	                // Não se esqueça de fechar a conexão quando terminar.
	                connection.close();
	            }
	        } catch (ClassNotFoundException e) {
	            System.err.println("Erro ao carregar o driver JDBC: " + e.getMessage());
	        } catch (SQLException e) {
	            System.err.println("Erro ao estabelecer a conexão com o banco de dados: " + e.getMessage());
	        }
	    }

	    private static void inserirDados(Connection connection, int id, String nome, String genero, String diretor, String duracao) throws SQLException {
	        String inserirSQL = "INSERT INTO catalogo (Id,Nome, Genero, Diretor, Duracao) VALUES (?, ?, ?, ?, ?)";

	        try (PreparedStatement preparedStatement = connection.prepareStatement(inserirSQL)) {
	        	preparedStatement.setInt(1, id);
	        	preparedStatement.setString(2, nome);
	            preparedStatement.setString(3, genero);
	            preparedStatement.setString(4, diretor);
	            preparedStatement.setString(5, duracao);
	           

	            int linhasAfetadas = preparedStatement.executeUpdate();

	            if (linhasAfetadas > 0) {
	                System.out.println("Dados inseridos com sucesso na tabela de contatos.");
	            } else {
	                System.out.println("Falha ao inserir dados.");
	            }
	        }
	    }
    }
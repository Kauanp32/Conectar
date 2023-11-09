package Conectar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserirDadosBd {

    public static void main(String[] args) {

        String URL = "jdbc:mysql://localhost:3306/loja";
        String USUARIO = "root";
        String SENHA = "senai";

        try {
          
        	// Estabelece a conexão com o banco de dados
            Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);

            // Cria uma instrução SQL parametrizada
            String insereDadosSQL = "INSERT INTO cliente (cpf, nome, sobrenome, e_mail, telefone) VALUES (?, ?, ?, ?, ?)";

            // Cria um objeto PreparedStatement
            PreparedStatement pp = conexao.prepareStatement(insereDadosSQL);

            // Define os valores passados nos campos de interrogação
            pp.setInt(1, 2345678); // Você deve usar setInt para valores numéricos inteiros
          
            pp.setString(2, "Kauan");
          
            pp.setString(3, "Pereira");
           
            pp.setString(4, "Kauan@pereira");
            
            pp.setInt(5, 2345678); // Mais uma vez, setInt para valores inteiros

            // Executa a instrução SQL
            pp.executeUpdate();

            // Fecha a conexão com o banco de dados
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace(); // Lida com exceções de SQL
        
        }
   
    }

}
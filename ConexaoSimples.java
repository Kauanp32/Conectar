package Conectar;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

public class ConexaoSimples {

		public static void main(String[] args) {
			
			Connection conexao = null;
			
			String URL = "jdbc:mysql://localhost:3306/loja";
			
			String USUARIO = "root";
			
			String SENHA = "senai";
			
			try {
				
				//Registra o Drive JDBC
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				
				// Classe responsável por fazer a conexao
				try {
					
					conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
				
				} catch (SQLException e) {

					e.printStackTrace();
				}
				return;
			
			} catch(ClassNotFoundException erro) {
			
				System.out.println("Erro ao efetuar conexao" + erro.getMessage());
			}

		}

	}

package jg.br.exConexaoBibliotecaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoDB {
	
	public Connection conexao;
	
	public String conectar(String urlBD, String Driver) {
		try {
			Class.forName(Driver);
			conexao = (Connection) DriverManager.getConnection(urlBD);
			return "Conectado ao banco";
		} catch (SQLException e) {
			e.printStackTrace();
			return "Erro ao conectar";
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return "Classe não encontrada";
		}

	}
	
	public ResultSet consultar(String query) {
		Statement st;
		ResultSet resultado = null;
		try {
			st = conexao.createStatement();
			resultado = st.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;

	}
	
	
	public int inserir(String query) {
		int rows = 0;
		try {
			Statement st = conexao.createStatement();
			rows = st.executeUpdate(query);
			System.out.println("Dados inseridos com sucesso");
			return rows;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Falha na inserção");
		}
		return rows;

	}
		

}

package jg.br.exConexaoBibliotecaJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Consulta {

	public static void main(String[] args) throws SQLException {
		
		ConexaoDB dados = new ConexaoDB();
		
		String Driver = "com.mysql.cj.jdbc.Driver";
		String urlBD = "jdbc:mysql://localhost:3306/bibliotecav2db?user=root&password=";
		String queryBD = "SELECT * FROM livro";
		
		ResultSet resultado = null;
		
		System.out.println(dados.conectar(urlBD, Driver));
		resultado = dados.consultar(queryBD);

		if (resultado != null) {
			while (resultado.next()) {
				System.out.println("isbn: " + resultado.getString("isbn") + "\t titulo: " + resultado.getString("titulo")
						+ "\t ano: " + resultado.getString("ano"));
			}
		}	
		
	}


}

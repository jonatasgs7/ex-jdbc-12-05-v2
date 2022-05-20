package jg.br.exConexaoBibliotecaJDBC;

import java.sql.SQLException;

public class Insercao {

	public static void main(String[] args) throws SQLException {
		
		ConexaoDB dados = new ConexaoDB();
		
		String Driver = "com.mysql.cj.jdbc.Driver";
		String urlBD = "jdbc:mysql://localhost:3306/bibliotecav2db?user=root&password=";
		
		System.out.println(dados.conectar(urlBD, Driver));
		
		String isbn = "5066716933";
		String titulo = "Harry Potter e o Cálice de Fogo";
		String ano = "2005";
		int fk_editora = 1;
		int fk_autor = 1;
		int fk_categoria = 1;
		
		System.out.println(dados.inserir("INSERT INTO livro (isbn, titulo, ano, fk_editora, fk_autor, fk_categoria) VALUES ('"+isbn+"', '"+titulo+"', '"+ano+"', '"+fk_editora+"', '"+fk_autor+"', '"+fk_categoria+"')"));

	}

}

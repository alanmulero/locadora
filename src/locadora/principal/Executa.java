package locadora.principal;

import locadora.principal.filme.Filmes;
import locadora.principal.series.Serie;

public class Executa {

	public static void main(String[] args) {
		
		// Instanciando filme
		Filmes filme = new Filmes("Matrix", 90);
		
		filme.setAvaliacao(3);
		filme.setAvaliacao(10);
		filme.setDiretor("Teste");
		filme.fichaCadastral();
		
		Filmes filme2 = new Filmes("Outubro Vermelho", 110);
		filme2.setAvaliacao(10);
		filme2.setAvaliacao(9);
		filme2.setDiretor("Teste2");
		filme2.fichaCadastral();
		
		
		// Instanciando series
		Serie serie = new Serie("Lost", 50);
		serie.setAvaliacao(8);
		serie.setAvaliacao(5);
		serie.setAvaliacao(3);
		serie.setCapitulosPorTemporadas(2);
		serie.setTemporadas(3);
		serie.fichaCadastral();
		
		
		

		
		
		
		
		
		
	}

}

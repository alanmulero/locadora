package locadora.principal.series;

import locadora.principal.Titulo;
import locadora.principal.classificacao.Estrelas;

public class Serie extends Titulo  implements Estrelas{

	public Serie(String nome, int duracao) {
		super(nome, duracao);
	}

	private int temporadas = 5;
	private int capitulosPorTemporadas = 3;
	private int tempo;

	public int getCapitulosPorTemporadas() {
		return capitulosPorTemporadas;
	}

	public void setCapitulosPorTemporadas(int capitulosPorTemporadas) {
		this.capitulosPorTemporadas = capitulosPorTemporadas;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	@Override
	public void fichaCadastral() {
		// TODO Auto-generated method stub
		super.fichaCadastral();
		System.out.println("Quantidade de capitulos por temporadas: " + getCapitulosPorTemporadas());
		System.out.println("Quantidade de Temporadas: " + getTemporadas());
		System.out.println("Estrelas da série: "+ getEstrelas());
	}

	@Override
	public int getDuracao() {
		// TODO Auto-generated method stub
		this.tempo = this.capitulosPorTemporadas * this.temporadas;
		return super.getDuracao() * tempo;
	}
	
	@Override
	public int getEstrelas() {
		// TODO Auto-generated method stub
		return  (int) getMedia() / 3;
	}

}

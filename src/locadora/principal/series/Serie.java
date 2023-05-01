package locadora.principal.series;

import locadora.principal.Titulo;

public class Serie extends Titulo {

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
	public void fichaCadastral(String nome) {
		// TODO Auto-generated method stub
		super.fichaCadastral(nome);
		
		System.out.println("Quantidade de Temporadas: " + getTemporadas());
	}

	@Override
	public int getDuracao() {
		// TODO Auto-generated method stub
		this.tempo = this.capitulosPorTemporadas *= this.temporadas;
		System.out.println("Tempo"+tempo);
		return super.getDuracao();
	}
	


}

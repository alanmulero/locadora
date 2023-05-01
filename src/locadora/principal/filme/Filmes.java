package locadora.principal.filme;

import locadora.principal.Titulo;
import locadora.principal.classificacao.Estrelas;

public class Filmes extends Titulo implements Estrelas{
	
	public Filmes(String nome, int duracao) {
		super(nome, duracao);
		// TODO Auto-generated constructor stub
	}

	private String diretor;

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	
	@Override
	public void fichaCadastral() {
		// TODO Auto-generated method stub
		super.fichaCadastral();
		System.out.println("Diretor do filme: " + getDiretor());
		System.out.println("Estrelas do filme: "+ getEstrelas());
	}

	@Override
	public int getEstrelas() {
		// TODO Auto-generated method stub
		return  (int) getMedia() / 2;
	}

}

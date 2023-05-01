package locadora.principal.filme;

import locadora.principal.Titulo;

public class Filmes extends Titulo{
	
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
	public void fichaCadastral(String nome) {
		// TODO Auto-generated method stub
		System.out.println("Diretor do filme: " + getDiretor());
		super.fichaCadastral(nome);
	}

}

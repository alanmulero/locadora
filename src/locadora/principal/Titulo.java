package locadora.principal;

public class Titulo {

	private String nome;
	private int duracao;
	private int avaliacao;
	private static int total = 0;
	private int totalAvaliacao;
	private double media;
	private int divisor;

	public Titulo(String nome, int duracao) {

		this.nome = nome;
		this.duracao = duracao;
		total++;

	}

	public double getMedia() {
		media = totalAvaliacao / divisor;

		return media;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDuracao() {
		return duracao;
	}

	public int setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
		this.totalAvaliacao += avaliacao;
		divisor++;
		return totalAvaliacao;
	}

	public int getAvaliacao() {

		return avaliacao;
	}

	public void fichaCadastral() {
		System.out.println();
		System.out.println("Nome do filme ou série: " + getNome());
		System.out.println("Total notas da Avaliação: " + totalAvaliacao);
		System.out.println("Duração em minutos: " + getDuracao());
		System.out.println("Quantidade de filmes ou séries avaliados: " + this.total);
		System.out.println("Média da avaliação: " + getMedia());
		

	}
}

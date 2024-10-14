package br.com.dio.desafio;

public abstract class Conteudo {
	protected static final double XP_PADRAO = 10;
	private String titulo, descricao;
	
	public double calcularXp() {
		return XP_PADRAO + 20;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	

}

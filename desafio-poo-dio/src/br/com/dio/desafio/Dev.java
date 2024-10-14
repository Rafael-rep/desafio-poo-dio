package br.com.dio.desafio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

	private String nome;
	private Set<Conteudo> conteudoIniciado = new LinkedHashSet<>();
	private Set<Conteudo> conteudoConcluido = new LinkedHashSet<>();
	
	public void inscreverBootcampa( BootCamp bootCamp) {
		this.conteudoIniciado.addAll(bootCamp.getConteudos());
		bootCamp.getDevsInscritos().add(this);
	}
	
	public void progredir() {
		Optional<Conteudo> conteudo =  this.conteudoIniciado.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudoConcluido.add(conteudo.get());
			this.conteudoIniciado.remove(conteudo.get());
		} else {
			System.err.println("Voce não esta matriculado em nenhum conteudo");
		}
	}
	
	public double calcularTotalXp() {
		return this.conteudoConcluido.stream().mapToDouble(Conteudo::calcularXp).sum();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudoIniciado() {
		return conteudoIniciado;
	}

	public void setConteudoIniciado(Set<Conteudo> conteudoIniciado) {
		this.conteudoIniciado = conteudoIniciado;
	}

	public Set<Conteudo> getConteudoConcluido() {
		return conteudoConcluido;
	}

	public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
		this.conteudoConcluido = conteudoConcluido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudoConcluido, conteudoIniciado, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudoConcluido, other.conteudoConcluido)
				&& Objects.equals(conteudoIniciado, other.conteudoIniciado) && Objects.equals(nome, other.nome);
	}
	
	
	
}

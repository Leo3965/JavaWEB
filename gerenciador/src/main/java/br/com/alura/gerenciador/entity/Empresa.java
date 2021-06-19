package br.com.alura.gerenciador.entity;

public class Empresa {

	private Integer id;
	private String nome;

	public Empresa() {
	}

	public Empresa(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}

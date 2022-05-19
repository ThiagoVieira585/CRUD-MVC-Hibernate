package br.com.ifce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Filme {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String titulo;
	private String categoria;
	private double preco;
	private int duracaoMinutos;
	
	

	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getDuracaoMinutos() {
		return duracaoMinutos;
	}
	public void setDuracaoMinutos(int duracaoMinutos) {
		this.duracaoMinutos = duracaoMinutos;
	}
	
		
	/*	public void status(){
		System.out.println("nome: " + this.getTitulo());
		System.out.println("categoria: " + this.getCategoria());
		System.out.println("preco: " + this.getPreco());
		System.out.println("dura��o minuto :" + this.getDuracaoMinutos());

	}
	*/
	
	
	
}

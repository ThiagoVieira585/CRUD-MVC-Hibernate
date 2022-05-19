package br.com.ifce.main;

import br.com.ifce.controller.FilmeController;
import br.com.ifce.model.Filme;


public class Teste {
	public static void main(String[]args) {
		
		FilmeController filmeController =  new FilmeController();
		
		Filme filme = new Filme();
		filme.setTitulo("Euro Trip");
		filme.setCategoria("besteirol");
		filme.setPreco(1.99);
		filme.setDuracaoMinutos(120);
		
		filmeController.cadastrarFilme(filme);          //Cadastrar o objeto no banco
		
		filme.setTitulo("Velozes");
		filme.setCategoria("corrida");
		filme.setPreco(2.00);
		filme.setDuracaoMinutos(90);
		
		filmeController.cadastrarFilme(filme);
		
		
		filme.setTitulo("Furiosos");
		filme.setCategoria("Comedia");
		filme.setPreco(0.50);
		filme.setDuracaoMinutos(60);
		
		filmeController.cadastrarFilme(filme);
		
		
		
		Filme filmeAtualizar = filmeController.buscarFilme(1L);      //Atualizar os atributos do filme
		filmeAtualizar.setTitulo("Vingadores");
		filmeAtualizar.setCategoria("aventura");
		filmeAtualizar.setPreco(40.00);
		filmeAtualizar.setDuracaoMinutos(60);
		filmeController.atualizarFilme(filmeAtualizar);
		
		Filme filmeR = filmeController.buscarFilme(1L);
		System.out.println("Filme buscado: "+filmeR.getTitulo());
		
		
		
		
		//filmeController.removerFilme(2L);     //Remover Filme
	}
}

package br.com.ifce.controller;

import br.com.ifce.model.Filme;
import br.com.ifce.service.FilmeService;


public class FilmeController {
	private FilmeService filmeService = new FilmeService();
	
	
	public void cadastrarFilme(Filme filme) {
		filmeService.cadastrarFilme(filme);
	}
	
	public void atualizarFilme(Filme filme) {
		filmeService.atualizarFilme(filme);
	}
	public Filme buscarFilme(Long id) {
		Filme filme = filmeService.buscarFilme(id);
		return filme;
	}
	public void removerFilme(Long id) {
		filmeService.removerFilme(id);
	}
}

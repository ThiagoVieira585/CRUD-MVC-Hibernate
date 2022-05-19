package br.com.ifce.service;

import br.com.ifce.model.Filme;
import br.com.ifce.repository.FilmeRepository;

public class FilmeService {
	private FilmeRepository filmeRepository = new FilmeRepository();
	
	public void cadastrarFilme(Filme filme) {
		filmeRepository.cadastrarFilme(filme);
	}
	
	public void atualizarFilme(Filme filme) {
		filmeRepository.atualizarFilme(filme);
	}
	public Filme buscarFilme(Long id) {
		Filme filme = filmeRepository.buscarFilme(id);
		return filme;
	}
	public void removerFilme(Long id) {
		filmeRepository.removerFilme(id);
	}
}

package br.com.ifce.repository;




import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.ifce.config.HibernateConfig;
import br.com.ifce.model.Filme;

public class FilmeRepository {
	public void cadastrarFilme(Filme filme) {
		Transaction transacao = null;
		Session session = HibernateConfig.getSessionFactory().openSession();
		
		transacao = session.beginTransaction();
		session.save(filme);
		transacao.commit();
		
	}
	
	public Filme buscarFilme(long id) {
		Transaction transacao = null;
		Session session = HibernateConfig.getSessionFactory().openSession();
		
		transacao = session.beginTransaction();
		Filme filme = session.get(Filme.class, id);
		transacao.commit();
		return filme;
	}
	public void atualizarFilme(Filme filme) {
		Transaction transacao = null;
		Session session = HibernateConfig.getSessionFactory().openSession();
		
		transacao = session.beginTransaction();
		session.saveOrUpdate(filme);
		transacao.commit();
	}
	public void removerFilme(Long id) {
		Transaction transacao = null;
		Session session = HibernateConfig.getSessionFactory().openSession();
		
		transacao = session.beginTransaction();
		Filme filme = session.get(Filme.class, id);
		session.remove(filme);
		transacao.commit();
		
	}
	
}

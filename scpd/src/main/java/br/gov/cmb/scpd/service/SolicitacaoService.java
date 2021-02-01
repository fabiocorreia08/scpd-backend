package br.gov.cmb.scpd.service;

import java.util.List;

import br.gov.cmb.scpd.model.Solicitacao;

public interface SolicitacaoService {
	
	public List<Solicitacao> getAll();

	public Solicitacao getById(long id);

	public List<Solicitacao> getByNome(String nome);

	public List<Solicitacao> getByMatricula(String matricula);

	public void saveOrUpdate(Solicitacao solicitacao);

	public void delete(long id);

}

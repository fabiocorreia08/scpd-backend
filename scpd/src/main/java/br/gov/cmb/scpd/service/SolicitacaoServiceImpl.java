package br.gov.cmb.scpd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.gov.cmb.scpd.model.Solicitacao;
import br.gov.cmb.scpd.repository.SolicitacaoRepository;

@Service
public class SolicitacaoServiceImpl implements SolicitacaoService{
	
	@Autowired
	SolicitacaoRepository solicitacaoRepository;

	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public List<Solicitacao> getAll() {
		return (List<Solicitacao>) solicitacaoRepository.findAll();
	}

	@Override
	public Solicitacao getById(long id) {
		return solicitacaoRepository.findById(id).get();
	}	
	
	@Override
	public List<Solicitacao> getByNome(String nome) {
		return solicitacaoRepository.findAll();
	}
	
	@Override
	public List<Solicitacao> getByMatricula(String matricula) {
		return solicitacaoRepository.findAll();
	}

	@Override
	public void saveOrUpdate(Solicitacao solicitacao) {
		solicitacaoRepository.save(solicitacao);		
	}

	@Override
	public void delete(long id) {
		solicitacaoRepository.deleteById(id);		
	}

	

}

package uea.pagamentos_api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uea.pagamentos_api.models.Lancamento;
import uea.pagamentos_api.repositories.LancamentoRepository;

@Service
public class LancamentoService {
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	public Lancamento criar(Lancamento lancamento) {
		return lancamentoRepository.save(lancamento);
	}
}

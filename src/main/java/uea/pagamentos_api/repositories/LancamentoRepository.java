package uea.pagamentos_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import uea.pagamentos_api.models.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {
	
}
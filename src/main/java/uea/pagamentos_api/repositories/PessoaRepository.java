package uea.pagamentos_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import uea.pagamentos_api.models.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}

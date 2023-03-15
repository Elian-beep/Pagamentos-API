package uea.pagamentos_api.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uea.pagamentos_api.models.Lancamento;
import uea.pagamentos_api.services.LancamentoService;

@RestController
@RequestMapping("/lancamentos")
public class LancamentoResource {
	
	@Autowired
	private LancamentoService lancamentoService;
	
	@PostMapping
	public ResponseEntity<Lancamento> criar(@RequestBody Lancamento lancamento){
		Lancamento lancamentoSalvo = lancamentoService.criar(lancamento);
		return ResponseEntity.ok().body(lancamentoSalvo);
	}
}

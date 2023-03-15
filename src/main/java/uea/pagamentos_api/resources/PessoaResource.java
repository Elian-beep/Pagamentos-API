package uea.pagamentos_api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import uea.pagamentos_api.models.Pessoa;
import uea.pagamentos_api.services.PessoaService;

@RestController //Vai ser um endpoint
@RequestMapping("/pessoas") //De onde ele vai ser o endpoint
public class PessoaResource {
	
	@Autowired
	private PessoaService pessoaService;
		
	@PostMapping
	public ResponseEntity<Pessoa> criar(@Valid @RequestBody Pessoa pessoa) {
		Pessoa pessoaSalva = pessoaService.criar(pessoa);
		return ResponseEntity.ok().body(pessoaSalva);
	}
	
	@GetMapping
	public ResponseEntity<List<Pessoa>> listar(){
		List<Pessoa> pessoas = pessoaService.listar();
		return ResponseEntity.ok().body(pessoas);
	}
	
	@GetMapping(value = "/{codigo}")
	public ResponseEntity<Pessoa> buscarPorCodigo(@PathVariable Long codigo){
		Pessoa pessoa = pessoaService.buscarPorCodigo(codigo);
		return ResponseEntity.ok().body(pessoa);
	}
	
	@DeleteMapping(value = "/{codigo}")
	public ResponseEntity<Void> excluir(@PathVariable Long codigo){
		pessoaService.excluir(codigo);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/{codigo}")
	public ResponseEntity<Pessoa> atualizar(@Valid @PathVariable Long codigo, @RequestBody Pessoa pessoa){
		Pessoa pessoaSalva = pessoaService.atualizar(codigo, pessoa);
		return ResponseEntity.ok().body(pessoaSalva);
	}
	
}
package uea.pagamentos_api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uea.pagamentos_api.models.Categoria;
import uea.pagamentos_api.services.CategoriaService;

@RestController //Vai ser um endpoint
@RequestMapping("/categorias") //De onde ele vai ser o endpoint
public class CategoriaResource {
	
	@Autowired
	private CategoriaService categoriaService;
		
	@PostMapping
	public ResponseEntity<Categoria> criar(@RequestBody Categoria categoria) {
		Categoria categoriaSalva = categoriaService.criar(categoria);
		return ResponseEntity.ok().body(categoriaSalva);
	}
	
	@GetMapping
	public ResponseEntity<List<Categoria>> listar(){
		List<Categoria> categorias = categoriaService.listar();
		return ResponseEntity.ok().body(categorias);
	}
}
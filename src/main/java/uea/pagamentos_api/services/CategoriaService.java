package uea.pagamentos_api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uea.pagamentos_api.models.Categoria;
import uea.pagamentos_api.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria criar(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
	
	public List<Categoria> listar(){
		return categoriaRepository.findAll();
	}
}

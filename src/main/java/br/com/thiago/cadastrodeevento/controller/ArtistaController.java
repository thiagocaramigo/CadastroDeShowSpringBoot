package br.com.thiago.cadastrodeevento.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.thiago.cadastrodeevento.model.Artista;
import br.com.thiago.cadastrodeevento.repository.ArtistaRepository;

@RestController
@RequestMapping("/artista")
public class ArtistaController {

	@Autowired
	private ArtistaRepository ar;
	
	@GetMapping("/listar")
	public List<Artista> listar() {
		return ar.findAll();
	}
	
	@GetMapping("/pesquisar/{id}")
	public Optional<Artista> pesquisarId(@PathVariable Long id ) {
		return ar.findById(id);
	}
	
	@PostMapping("/cadastro")
	public String cadastro(@RequestBody Artista artista) {
		ar.save(artista);
		return "Artista cadastrado com sucesso!";
		
	}
	
	
	public String atualizar(@PathVariable Long id, @RequestBody Artista artista) {
		
		Optional<Artista> pac = ar.findById(id);
		
		if(!pac.isPresent()) {
			return "Artista não localizado";
		}
		artista.setIdArtista(id);
		ar.save(artista);
		return "Dados do artista atualizado";
	}
	
	public String apagar(@PathVariable Long id) {
		ar.deleteById(id);
		return "Artista apagado";
		
	}
	
	
	
}

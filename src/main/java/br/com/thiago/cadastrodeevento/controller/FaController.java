package br.com.thiago.cadastrodeevento.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.thiago.cadastrodeevento.model.Fa;
import br.com.thiago.cadastrodeevento.repository.FaRepository;

@RestController
@RequestMapping("/Fa")
public class FaController {
	
	@Autowired
	private FaRepository fr;
	
	@GetMapping("/listar")
	public List<Fa> listar(){
		return fr.findAll();
	}
	
	@GetMapping("/pesquisar/{id}")
	public Optional<Fa> pesquisarId(@PathVariable Long id) {
		return fr.findById(id);
		
	}
	
	
	@PostMapping("/cadastro")
	public String cadastro(@RequestBody Fa fa) {
		fr.save(fa);
		return "Paciente cadastrado com sucesso!";	     	
	}
	
	@PutMapping("/atualizar/{id}")
	public String atualizar(@PathVariable Long id,@RequestBody Fa fa) {
		
		Optional<Fa> pac = fr.findById(id);
		
		if(!pac.isPresent()) {
			return "Paciente não localizado";
		}
		fa.setIdFa(id);
		fr.save(fa);
		return "Dados do paciente atualizado";
	}
	
	@DeleteMapping("/apagar/{id}")
	public String apagar(@PathVariable Long id) {
		fr.deleteById(id);
		return "Paciente apagado";
	}
	
}
	



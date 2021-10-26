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

import br.com.thiago.cadastrodeevento.model.Local;
import br.com.thiago.cadastrodeevento.repository.LocalRepository;


@RestController
@RequestMapping("/local")
public class LocalController {

	@Autowired
	private LocalRepository lr;
	
	@GetMapping("/listar")
	public List<Local> listar(){
		return lr.findAll();
	}
	
	@PostMapping("/cadastro")
	public String cadastro(@RequestBody Local local) {
		lr.save(local);
		return "Cadastro realizado com sucesso";
	}
	
	@PutMapping("/atualizar/{id}")
	public String atualizar(@PathVariable Long id, @RequestBody Local local) {
		Optional<Local> ag = lr.findById(id);
		
		if(!ag.isPresent()) {
			return "Agendamento não localizado";
		}
		local.setIdLocal(id);
		lr.save(local);
		return "Agendamento atualizada";
	}
	@DeleteMapping("/apagar/{id}")
 	public String apagar(@PathVariable Long id) {
 		lr.deleteById(id);
 		return "Agendamento apagado";
 	}
}

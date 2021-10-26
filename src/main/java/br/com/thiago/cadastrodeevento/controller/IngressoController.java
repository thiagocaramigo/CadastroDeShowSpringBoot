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

import br.com.thiago.cadastrodeevento.model.Ingresso;
import br.com.thiago.cadastrodeevento.repository.IngressoRepository;

@RestController
@RequestMapping("/ingresso")
public class IngressoController {

	
	@Autowired
	private IngressoRepository ir;
	
	@GetMapping("/listar")
	public List<Ingresso> listar(){
		return ir.findAll();
	}
	
	@PostMapping("/cadastro")
	public String cadastro(@RequestBody Ingresso ingresso) {
		ir.save(ingresso);
		return "Cadastro realizado com sucesso";
	}
	
	@PutMapping("/atualizar/{id}")
	public String atualizar(@PathVariable Long id, @RequestBody Ingresso ingresso) {
		Optional<Ingresso> ag = ir.findById(id);
		
		if(!ag.isPresent()) {
			return "Agendamento não localizado";
		}
		ingresso.setIdIngresso(id);
		ir.save(ingresso);
		return "Agendamento atualizada";
	}
	@DeleteMapping("/apagar/{id}")
 	public String apagar(@PathVariable Long id) {
 		ir.deleteById(id);
 		return "Agendamento apagado";
 	}
	
}

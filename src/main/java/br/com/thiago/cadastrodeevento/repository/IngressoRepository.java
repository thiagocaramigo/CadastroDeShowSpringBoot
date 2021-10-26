package br.com.thiago.cadastrodeevento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.thiago.cadastrodeevento.model.Ingresso;

public interface IngressoRepository extends JpaRepository<Ingresso, Long>{

}

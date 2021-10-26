package br.com.thiago.cadastrodeevento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.thiago.cadastrodeevento.model.Artista;

public interface ArtistaRepository extends JpaRepository<Artista, Long>{

}

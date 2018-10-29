package br.com.tt.projeto01.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tt.projeto01.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	public List<Cliente> findByNomeLikeIgnoreCaseOrCpfLikeOrEmailLikeIgnoreCase (String nome, String cpf, String email);

}

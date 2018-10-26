package br.com.tt.projeto01.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tt.projeto01.model.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{
	
	public List<Veiculo> findByPlacaLikeIgnoreCaseOrModeloLikeIgnoreCaseOrMarcaLikeIgnoreCaseOrCorLikeIgnoreCase(String placa, String modelo, String cor, String marca);

}

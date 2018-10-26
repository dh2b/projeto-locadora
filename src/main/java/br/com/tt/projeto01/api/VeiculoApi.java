package br.com.tt.projeto01.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tt.projeto01.model.Veiculo;
import br.com.tt.projeto01.repository.VeiculoRepository;

@RestController
public class VeiculoApi {

	@Autowired
	private VeiculoRepository repo;

	@GetMapping ("/api/veiculos")
	public List<Veiculo> veiculos() {
		return repo.findAll();

	}
}

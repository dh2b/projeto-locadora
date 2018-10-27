package br.com.tt.projeto01.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tt.projeto01.model.Veiculo;
import br.com.tt.projeto01.repository.VeiculoRepository;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculoApi {
	@Autowired
	VeiculoRepository repo;

	@GetMapping
	public List<Veiculo> veiculos() {
		return repo.findAll();

	}

	@PostMapping
	public void salvar(@RequestBody Veiculo veiculo) {
		repo.save(veiculo);
	}
}

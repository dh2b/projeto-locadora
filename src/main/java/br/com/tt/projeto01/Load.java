package br.com.tt.projeto01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.tt.projeto01.model.Veiculo;
import br.com.tt.projeto01.repository.VeiculoRepository;

@Component
public class Load implements CommandLineRunner {

	@Autowired
	private VeiculoRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		Veiculo veiculo = new Veiculo();
		veiculo.setCor("Branco");
		veiculo.setModelo("Gol");
		veiculo.setMarca("Volkswagen");
		veiculo.setPlaca("IFU-5434");
		
		repo.save(veiculo);
		
		repo.save(new Veiculo("Fiat", "Palio", "Azul", "JEB-4389"));
		repo.save(new Veiculo("Hyundai", "HB20", "Prata", "IEB-6589"));
		
	}
	

}

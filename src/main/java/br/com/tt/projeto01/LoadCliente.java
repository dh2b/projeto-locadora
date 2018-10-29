package br.com.tt.projeto01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.tt.projeto01.model.Cliente;
import br.com.tt.projeto01.repository.ClienteRepository;


@Component
public class LoadCliente implements CommandLineRunner {
	
	@Autowired
	private ClienteRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.save(new Cliente("Luis Inácio", "111.111.111-00", "luis@zaz.com.br"));
		repo.save(new Cliente("José Sarney", "222.222.222-22", "jose@aol.com"));
		repo.save(new Cliente("Fernando Henrique", "333.333.333-33", "fernandinho@ig.com.br"));

		
		
	}

}

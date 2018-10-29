package br.com.tt.projeto01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.tt.projeto01.model.Cliente;
import br.com.tt.projeto01.model.Veiculo;
import br.com.tt.projeto01.repository.ClienteRepository;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

	private final String template = "cliente";

	@Autowired
	private ClienteRepository repo;

	@GetMapping("/formulario-cliente")
	public String cadastroCliente(Model model) {
		model.addAttribute("cliente", new Cliente());
		return template + "/formulario-cliente";
	}

	@PostMapping("/salvar-cliente")
	public String salvar(Cliente cliente, Model model) {

		repo.save(cliente);
		model.addAttribute("sucesso", "Salvo com sucesso!");
		model.addAttribute("cliente", new Cliente());
		return template + "/formulario-cliente";
	}

	@GetMapping
	public String clientes(Model model) {

		List<Cliente> clientes = repo.findAll();
		model.addAttribute("listaClientes", clientes);
		return template + "/lista-cliente";
	}

	@GetMapping("/editar/{id}")
	public String editar(@PathVariable Long id, Model model) {
		System.out.println("--------------------- Teste do ID: " + id);
		Cliente cliente = repo.findById(id).orElse(new Cliente());
		model.addAttribute("cliente", cliente);
		return template + "/formulario-cliente";
	}

	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable Long id, Model model) {
		repo.deleteById(id);
		List<Cliente> clientes = repo.findAll();
		model.addAttribute("listaClientes", clientes);
		return template + "/lista-cliente";
	}

	@PostMapping("/pesquisar-cliente")
	public String pesquisar(String pesquisa, Model model) {
		pesquisa = "%" + pesquisa + "%";
		List<Cliente> clientes = repo.findByNomeLikeIgnoreCaseOrCpfLikeOrEmailLikeIgnoreCase(pesquisa, pesquisa,
				pesquisa);
		model.addAttribute("listaClientes", clientes);
		return template + "/lista-cliente";
	}
}

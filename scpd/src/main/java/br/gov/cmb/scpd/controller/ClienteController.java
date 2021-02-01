package br.gov.cmb.scpd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.cmb.scpd.model.Cliente;
import br.gov.cmb.scpd.repository.ClienteRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	ClienteRepository clienteRepo;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> listaCliente() {
		return ResponseEntity.ok().body(clienteRepo.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Cliente> buscaPorId(@PathVariable Long id) {
		return ResponseEntity.ok().body(clienteRepo.findById(id).get());
	}

}

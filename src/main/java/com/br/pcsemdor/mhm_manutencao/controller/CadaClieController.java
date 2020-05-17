package com.br.pcsemdor.mhm_manutencao.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.pcsemdor.mhm_manutencao.database.CadaClieRepository;
import com.br.pcsemdor.mhm_manutencao.model.CadaClie;

@RestController
@RequestMapping("/api/clientes")
public class CadaClieController {
	
	@Autowired
	CadaClieRepository repo;	
	
	@GetMapping
	public List<CadaClie> getAllClientes(){
		return repo.findAll();
	}
	
	@PostMapping
	public CadaClie salvarCliente(@RequestBody @Valid CadaClie cliente) {
		return null;
	}
}
package com.br.pcsemdor.mhm_manutencao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.pcsemdor.mhm_manutencao.database.CadaClieReposotory;
import com.br.pcsemdor.mhm_manutencao.model.CadaClie;

@RestController
@RequestMapping("/api/clientes")
public class CadaClieController {
	
	@Autowired
	CadaClieReposotory repo;	
	
	@GetMapping
	public List<CadaClie> getAllClientes(){
		return repo.findAll();
	}
}
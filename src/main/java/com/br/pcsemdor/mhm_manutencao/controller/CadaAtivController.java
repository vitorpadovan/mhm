package com.br.pcsemdor.mhm_manutencao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.pcsemdor.mhm_manutencao.database.CadaAtivRepository;
import com.br.pcsemdor.mhm_manutencao.model.CadaAtiv;

@RestController
@RequestMapping("/api/atividades")
public class CadaAtivController {
	
	
	@Autowired
	private CadaAtivRepository repo;
	
	@GetMapping
	public List<CadaAtiv> getAtividades(){
		return repo.findAll();
	}
}

package com.br.pcsemdor.mhm_manutencao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class CadaAtiv {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Ativ_CodiAtiv")
	private int ativCodiAtiv;
	
	@Column(name = "Ativ_DescAtiv", unique=true, nullable=false)
	@NotNull @NotEmpty
	private String ativDescAtiv;

}

package com.br.pcsemdor.mhm_manutencao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CadaClie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Clie_CodiClie")
	private int clieCodiClie;

	@Column(name = "Clie_NomeClie")
	private String clieNomeClie;

	@Column(name = "Clie_Cpf_Cnpj")
	private String clieCpf_Cnpj;

	public int getClieCodiClie() {
		return clieCodiClie;
	}

	public void setClieCodiClie(int clieCodiClie) {
		this.clieCodiClie = clieCodiClie;
	}

	public String getClieNomeClie() {
		return clieNomeClie;
	}

	public void setClieNomeClie(String clieNomeClie) {
		this.clieNomeClie = clieNomeClie;
	}

	public String getClieCpf_Cnpj() {
		return clieCpf_Cnpj;
	}

	public void setClieCpf_Cnpj(String clieCpf_Cnpj) {
		this.clieCpf_Cnpj = clieCpf_Cnpj;
	}
}

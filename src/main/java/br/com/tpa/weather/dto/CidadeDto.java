package br.com.tpa.weather.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CidadeDto {
	
	private Long codigo;
	private String nome;
	private String pais;
	
	@JsonProperty("codigo")
	public Long getCodigo() {
		return codigo;
	}
	
	@JsonProperty("id")
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	@JsonProperty("nome")
	public String getNome() {
		return nome;
	}
	
	@JsonProperty("name")
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@JsonProperty("pais")
	public String getPais() {
		return pais;
	}

	@JsonProperty("country")
	public void setPais(String pais) {
		this.pais = pais;
	}
}

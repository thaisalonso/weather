package br.com.tpa.weather.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConsultaClimaDto {

	@JsonProperty("main")
	private PrincipalDto principal;

	public PrincipalDto getPrincipal() {
		return principal;
	}

	public void setPrincipal(PrincipalDto principal) {
		this.principal = principal;
	}
}

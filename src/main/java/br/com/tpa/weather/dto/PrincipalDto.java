package br.com.tpa.weather.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PrincipalDto {
	
	private BigDecimal temperatura;
	private Long pressaoAr;
	private Long umidade;
	private BigDecimal temperaturaMinima;
	private BigDecimal temperaturaMaxima;
	
	@JsonProperty("temperatura")
	public BigDecimal getTemperatura() {
		return temperatura;
	}
	
	@JsonProperty("temp")
	public void setTemperatura(BigDecimal temperatura) {
		this.temperatura = temperatura;
	}
	
	@JsonProperty("pressaoAr")
	public Long getPressaoAr() {
		return pressaoAr;
	}
	
	@JsonProperty("pressure")
	public void setPressaoAr(Long pressaoAr) {
		this.pressaoAr = pressaoAr;
	}
	
	@JsonProperty("umidade")
	public Long getUmidade() {
		return umidade;
	}
	
	@JsonProperty("humidity")
	public void setUmidade(Long umidade) {
		this.umidade = umidade;
	}
	
	@JsonProperty("temperaturaMinima")
	public BigDecimal getTemperaturaMinima() {
		return temperaturaMinima;
	}
	
	@JsonProperty("temp_min")
	public void setTemperaturaMinima(BigDecimal temperaturaMinima) {
		this.temperaturaMinima = temperaturaMinima;
	}
	
	@JsonProperty("temperaturaMaxima")
	public BigDecimal getTemperaturaMaxima() {
		return temperaturaMaxima;
	}
	
	@JsonProperty("temp_max")
	public void setTemperaturaMaxima(BigDecimal temperaturaMaxima) {
		this.temperaturaMaxima = temperaturaMaxima;
	}
	
}

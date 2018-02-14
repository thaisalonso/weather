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
	public void setTemperatura(BigDecimal temperaturaKelvin) {
		this.temperatura = converterKelvinParaCelsius(temperaturaKelvin);
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
	public void setTemperaturaMinima(BigDecimal temperaturaMinimaKelvin) {
		this.temperaturaMinima = converterKelvinParaCelsius(temperaturaMinimaKelvin);
	}
	
	@JsonProperty("temperaturaMaxima")
	public BigDecimal getTemperaturaMaxima() {
		return temperaturaMaxima;
	}
	
	@JsonProperty("temp_max")
	public void setTemperaturaMaxima(BigDecimal temperaturaMaximaKelvin) {
		this.temperaturaMaxima = converterKelvinParaCelsius(temperaturaMaximaKelvin);
	}
	
	private BigDecimal converterKelvinParaCelsius(BigDecimal temperatura) {
		if (temperatura == null) {
			return null;
		}
		return temperatura.subtract(new BigDecimal("273.15")).setScale(0, BigDecimal.ROUND_HALF_UP);
	}
	
}

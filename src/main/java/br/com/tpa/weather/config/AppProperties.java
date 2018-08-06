package br.com.tpa.weather.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppProperties {
	
	@Value("${chave.openweather}")
	private String chaveOpenWeather;

	public String getChaveOpenWeather() {
		return chaveOpenWeather;
	}
	
	@Value("${unit.openweather}")
	private String unitOpenWeather;
	
	public String getUnitOpenWeather() {
		return unitOpenWeather;
	}

	
}

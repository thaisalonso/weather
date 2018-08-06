package br.com.tpa.weather.repository;

import br.com.tpa.weather.dto.ConsultaClimaDto;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface ConsultaClimaRepository {
	
	String URL_API_OPEN_WEATHER = "https://api.openweathermap.org/data/2.5";
	
	@RequestLine("GET /weather?id={id}&APPID={chave}&units={unit}")
	@Headers("Content-Type: application/json")
	ConsultaClimaDto getClimaCidade(@Param("id") Long id, @Param("chave") String chave, @Param("unit") String unit);

}

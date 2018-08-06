package br.com.tpa.weather.service;

import static br.com.tpa.weather.repository.ConsultaClimaRepository.URL_API_OPEN_WEATHER;

import org.springframework.stereotype.Service;

import br.com.tpa.weather.dto.ConsultaClimaDto;
import br.com.tpa.weather.repository.ConsultaClimaRepository;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

@Service
public class ConsultaClimaService {
	
	private final ConsultaClimaRepository consultaClimaRepository = Feign.builder()
			.decoder(new JacksonDecoder())
			.encoder(new JacksonEncoder())
			.target(ConsultaClimaRepository.class, URL_API_OPEN_WEATHER);
	
	public ConsultaClimaDto getClimaCidade(Long id, String chave, String unit) {
		return consultaClimaRepository.getClimaCidade(id, chave, unit);
	}

}
